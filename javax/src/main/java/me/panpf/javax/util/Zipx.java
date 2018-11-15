/*
 * Copyright (C) 2018 Peng fei Pan <panpfpanpf@outlook.com>
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package me.panpf.javax.util;

import me.panpf.javax.collections.Collectionx;
import me.panpf.javax.io.CopyListener;
import me.panpf.javax.io.Filex;
import me.panpf.javax.io.IOStreamx;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import java.io.*;
import java.util.*;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;
import java.util.zip.ZipOutputStream;

/**
 * ZIP tool method
 */
@SuppressWarnings({"WeakerAccess", "UnusedReturnValue"})
public class Zipx {

    private Zipx() {
    }

    /**
     * Compress the specified files
     *
     * @param sourceFiles           The file to be compressed
     * @param destinationFile       Output file
     * @param zipEntryNameTransform Get the name of the file compressed into the zip package
     * @param listener              Progress listener
     * @return Output file
     * @throws IOException IO exceptions
     */
    public static File compressFilesTo(@Nullable File[] sourceFiles, @NotNull File destinationFile,
                                       @NotNull Transformer<File, String> zipEntryNameTransform, @Nullable final ZipListener listener) throws IOException {
        ZipOutputStream zipOutputStream = null;
        try {
            zipOutputStream = new ZipOutputStream(new BufferedOutputStream(new FileOutputStream(destinationFile, false)));

            Stack<File> files = new Stack<>();
            if (sourceFiles != null) {
                Collectionx.addAll(files, sourceFiles);
            }

            final long totalLength = listener != null ? Filex.lengthRecursively(files) : 0;
            final long[] totalCompletedLength = new long[1];
            final ZipEntry[] currentZipEntry = new ZipEntry[1];
            final long[] entrySize = new long[]{-1};
            CopyListener copyListener = new CopyListener() {
                @Override
                public void onUpdateProgress(long completedLength) {
                    if (listener != null) {
                        totalCompletedLength[0] += completedLength;
                        listener.onUpdateProgress(totalLength, totalCompletedLength[0], currentZipEntry[0], entrySize[0], completedLength);
                    }
                }
            };

            while (true) {
                File childFile;
                try {
                    childFile = files.pop();
                } catch (EmptyStackException e) {
                    break;
                }

                if (!childFile.exists()) {
                    continue;
                }

                if (childFile.isDirectory()) {
                    File[] fileList = childFile.listFiles();
                    if (fileList != null) {
                        Collections.addAll(files, fileList);
                    }
                } else {
                    ZipEntry zipEntry = new ZipEntry(zipEntryNameTransform.transform(childFile));
                    currentZipEntry[0] = zipEntry;
                    entrySize[0] = childFile.length();
                    zipOutputStream.putNextEntry(zipEntry);
                    InputStream inputStream = null;
                    try {
                        inputStream = new BufferedInputStream(new FileInputStream(childFile));
                        if (listener != null) listener.onEntryStart(currentZipEntry[0]);
                        IOStreamx.copyTo(inputStream, zipOutputStream, copyListener);
                        if (listener != null) listener.onEntryEnd(currentZipEntry[0]);
                    } finally {
                        zipOutputStream.closeEntry();
                        IOStreamx.closeQuietly(inputStream);
                    }
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
            //noinspection ResultOfMethodCallIgnored
            destinationFile.delete();
            throw e;
        } finally {
            IOStreamx.closeQuietly(zipOutputStream);
        }

        return destinationFile;
    }

    /**
     * Compress the specified files
     *
     * @param sourceFiles           The file to be compressed
     * @param destinationFile       Output file
     * @param zipEntryNameTransform Get the name of the file compressed into the zip package
     * @return Output file
     * @throws IOException IO exceptions
     */
    public static File compressFilesTo(@Nullable File[] sourceFiles, @NotNull File destinationFile,
                                       @NotNull Transformer<File, String> zipEntryNameTransform) throws IOException {
        return compressFilesTo(sourceFiles, destinationFile, zipEntryNameTransform, null);
    }


    /**
     * Compress the specified file or directory
     *
     * @param sourceFile      The file to be compressed
     * @param destinationFile Output file
     * @param listener        Progress listener
     * @return Output file
     * @throws IOException IO exceptions
     */
    public static File compressFileTo(@NotNull final File sourceFile, @NotNull File destinationFile, @Nullable final ZipListener listener) throws IOException {
        Premisex.requireFileExist(sourceFile, "sourceFile");
        return compressFilesTo(new File[]{sourceFile}, destinationFile, ZipEntryNameTransformer.createByParent(sourceFile), listener);
    }

    /**
     * Compress the specified file or directory
     *
     * @param sourceFile      The file to be compressed
     * @param destinationFile Output file
     * @return Output file
     * @throws IOException IO exceptions
     */
    public static File compressFileTo(@NotNull File sourceFile, @NotNull File destinationFile) throws IOException {
        return compressFileTo(sourceFile, destinationFile, null);
    }

    /**
     * Compress the specified file or directory
     *
     * @param sourceFile The file to be compressed
     * @param listener   Progress listener
     * @return Output file
     * @throws IOException IO exceptions
     */
    public static File compressFile(@NotNull File sourceFile, @Nullable final ZipListener listener) throws IOException {
        return compressFileTo(sourceFile, getCompressDstFile(sourceFile), listener);
    }

    /**
     * Compress the specified file or directory
     *
     * @param sourceFile The file to be compressed
     * @return Output file
     * @throws IOException IO exceptions
     */
    public static File compressFile(@NotNull File sourceFile) throws IOException {
        return compressFileTo(sourceFile, getCompressDstFile(sourceFile), null);
    }


    /**
     * Compress the specified file or directory (exclude source directory)
     *
     * @param sourceFile      The file to be compressed
     * @param destinationFile Output file
     * @param listener        Progress listener
     * @return Output file
     * @throws IOException IO exceptions
     */
    public static File compressChildFileTo(@NotNull final File sourceFile, @NotNull File destinationFile, @Nullable final ZipListener listener) throws IOException {
        Premisex.requireFileExist(sourceFile, "sourceFile");
        if (sourceFile.isFile()) {
            return compressFilesTo(new File[]{sourceFile}, destinationFile, ZipEntryNameTransformer.createByParent(sourceFile), listener);
        } else {
            return compressFilesTo(sourceFile.listFiles(), destinationFile, ZipEntryNameTransformer.createBySelf(sourceFile), listener);
        }
    }

    /**
     * Compress the specified file or directory (exclude source directory)
     *
     * @param sourceFile      The file to be compressed
     * @param destinationFile Output file
     * @return Output file
     * @throws IOException IO exceptions
     */
    public static File compressChildFileTo(@NotNull final File sourceFile, @NotNull File destinationFile) throws IOException {
        return compressChildFileTo(sourceFile, destinationFile, null);
    }

    /**
     * Compress the specified file or directory (exclude source directory)
     *
     * @param sourceFile The file to be compressed
     * @param listener   Progress listener
     * @return Output file
     * @throws IOException IO exceptions
     */
    public static File compressChildFile(@NotNull final File sourceFile, @Nullable final ZipListener listener) throws IOException {
        return compressChildFileTo(sourceFile, getCompressDstFile(sourceFile), listener);
    }

    /**
     * Compress the specified file or directory (exclude source directory)
     *
     * @param sourceFile The file to be compressed
     * @return Output file
     * @throws IOException IO exceptions
     */
    public static File compressChildFile(@NotNull final File sourceFile) throws IOException {
        return compressChildFile(sourceFile, null);
    }


    /**
     * Decompress the ZIP file to the specified folder
     *
     * @param zipSourceFile  ZIP file
     * @param destinationDir Out dir
     * @return Out dir
     * @throws IOException IO exceptions. include ZipException, UnableCreateDirException, UnableCreateFileException
     */
    @NotNull
    public static File decompressTo(@NotNull File zipSourceFile, @NotNull final File destinationDir, @Nullable final ZipListener listener) throws IOException {
        Premisex.requireFileExist(zipSourceFile, "zipSourceFile");
        Premisex.require(!destinationDir.exists() || destinationDir.isDirectory(), new LazyValue<String>() {
            @NotNull
            @Override
            public String get() {
                return destinationDir.getPath() + " not directory";
            }
        });

        ZipFile zipFile = new ZipFile(zipSourceFile);
        try {
            final long totalLength = listener != null ? getTrueSize(zipFile) : 0;
            final long[] totalCompletedLength = new long[1];
            final ZipEntry[] currentZipEntry = new ZipEntry[1];
            CopyListener copyListener = new CopyListener() {
                @Override
                public void onUpdateProgress(long completedLength) {
                    if (listener != null) {
                        totalCompletedLength[0] += completedLength;
                        listener.onUpdateProgress(totalLength, totalCompletedLength[0], currentZipEntry[0], currentZipEntry[0].getSize(), completedLength);
                    }
                }
            };

            Enumeration<? extends ZipEntry> entries = zipFile.entries();
            while (entries.hasMoreElements()) {
                ZipEntry zipEntry = entries.nextElement();
                currentZipEntry[0] = zipEntry;
                File file = new File(destinationDir, zipEntry.getName());
                if (zipEntry.isDirectory()) {
                    Filex.mkdirsOrThrow(file);
                } else {
                    Filex.createNewFileOrThrow(file);
                    InputStream inputStream = null;
                    OutputStream outputStream = null;
                    try {
                        inputStream = zipFile.getInputStream(zipEntry);
                        outputStream = new FileOutputStream(file, false);
                        if (listener != null) listener.onEntryStart(currentZipEntry[0]);
                        IOStreamx.copyTo(inputStream, outputStream, copyListener);
                        if (listener != null) listener.onEntryEnd(currentZipEntry[0]);
                    } finally {
                        IOStreamx.closeQuietly(outputStream);
                        IOStreamx.closeQuietly(inputStream);
                    }
                }
            }
        } finally {
            IOStreamx.closeQuietly(zipFile);
        }

        return destinationDir;
    }

    /**
     * Decompress the ZIP file to the specified folder
     *
     * @param zipSourceFile  ZIP file
     * @param destinationDir Out dir
     * @return Out dir
     * @throws IOException IO exceptions. include ZipException, UnableCreateDirException, UnableCreateFileException
     */
    @NotNull
    public static File decompressTo(@NotNull File zipSourceFile, @NotNull final File destinationDir) throws IOException {
        return decompressTo(zipSourceFile, destinationDir, null);
    }

    /**
     * Decompress the ZIP file to its directory, and the output folder name is the name of the ZIP file (without the suffix)
     *
     * @param zipSourceFile ZIP file
     * @param listener      Progress listener
     * @return Out dir
     * @throws IOException IO exceptions. include ZipException, UnableCreateDirException, UnableCreateFileException
     */
    @NotNull
    public static File decompress(@NotNull File zipSourceFile, @Nullable final ZipListener listener) throws IOException {
        return decompressTo(zipSourceFile, getDecompressDstDir(zipSourceFile), listener);
    }

    /**
     * Decompress the ZIP file to its directory, and the output folder name is the name of the ZIP file (without the suffix)
     *
     * @param zipSourceFile ZIP file
     * @return Out dir
     * @throws IOException IO exceptions. include ZipException, UnableCreateDirException, UnableCreateFileException
     */
    @NotNull
    public static File decompress(@NotNull File zipSourceFile) throws IOException {
        return decompress(zipSourceFile, null);
    }


    /**
     * Get the default compression dst file for the specified source file
     */
    public static File getCompressDstFile(@NotNull File sourceFile) {
        return new File(sourceFile.getPath() + ".zip");
    }

    /**
     * Get the default decompression directory for the specified ZIP file
     */
    public static File getDecompressDstDir(@NotNull File zipSourceFile) {
        return zipSourceFile.getParentFile();
    }


    /**
     * Get the original size of the Zip file
     */
    public static long getTrueSize(@NotNull ZipFile zipFile) {
        long totalSize = 0;
        Enumeration<? extends ZipEntry> elements = zipFile.entries();
        while (elements.hasMoreElements()) {
            totalSize += elements.nextElement().getSize();
        }
        return totalSize;
    }

    /**
     * Get the original size of the Zip file
     */
    public static long getTrueSize(@NotNull File file) throws IOException {
        try (ZipFile zipFile = new ZipFile(file)) {
            return getTrueSize(zipFile);
        }
    }

    @NotNull
    public static ArrayList<ZipEntry> listEntry(@NotNull ZipFile zipFile) {
        ArrayList<ZipEntry> zipEntries = new ArrayList<>(zipFile.size());
        Enumeration<? extends ZipEntry> entries = zipFile.entries();
        while (entries.hasMoreElements()) {
            zipEntries.add(entries.nextElement());
        }
        return zipEntries;
    }

    @NotNull
    public static ArrayList<ZipEntry> listEntry(@NotNull File file) throws IOException {
        try (ZipFile zipFile = new ZipFile(file)) {
            return listEntry(zipFile);
        }
    }

    @NotNull
    public static ArrayList<String> listEntryName(@NotNull ZipFile zipFile) {
        ArrayList<String> zipEntries = new ArrayList<>(zipFile.size());
        Enumeration<? extends ZipEntry> entries = zipFile.entries();
        while (entries.hasMoreElements()) {
            zipEntries.add(entries.nextElement().getName());
        }
        return zipEntries;
    }

    @NotNull
    public static ArrayList<String> listEntryName(@NotNull File file) throws IOException {
        try (ZipFile zipFile = new ZipFile(file)) {
            return listEntryName(zipFile);
        }
    }

    public static int size(@NotNull File file) throws IOException {
        try (ZipFile zipFile = new ZipFile(file)) {
            return zipFile.size();
        }
    }


    public static class ZipEntryNameTransformer implements Transformer<File, String> {
        private String sourceDirParentPath;

        public ZipEntryNameTransformer(String sourceDirParentPath) {
            this.sourceDirParentPath = sourceDirParentPath;
        }

        @NotNull
        @Override
        public String transform(@NotNull File file) {
            return file.getPath().replace(sourceDirParentPath, "");
        }

        public static ZipEntryNameTransformer createByParent(File sourceDir) {
            return new ZipEntryNameTransformer(sourceDir.getParent() + File.separator);
        }

        public static ZipEntryNameTransformer createBySelf(File sourceDir) {
            return new ZipEntryNameTransformer(sourceDir.getPath() + File.separator);
        }
    }
}
