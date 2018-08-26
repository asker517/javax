/*
 * Copyright (C) 2018 Peng fei Pan <sky@panpf.me>
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

import java.io.*;
import java.util.*;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;
import java.util.zip.ZipOutputStream;

import me.panpf.javax.io.Filex;
import me.panpf.javax.io.IOStreamx;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/**
 * ZIP tool method
 */
@SuppressWarnings("WeakerAccess")
public class Zipx {

    /**
     * Compress the specified file
     *
     * @param sourceFiles           The file to be compressed
     * @param destinationFile       Output file
     * @param zipEntryNameTransform Get the name of the file compressed into the zip package
     * @return Output file
     * @throws IOException IO exceptions
     */
    public static File compressionFiles(@Nullable File[] sourceFiles, @NotNull File destinationFile,
                                        @NotNull Transformer<File, String> zipEntryNameTransform) throws IOException {
        ZipOutputStream zipOutputStream = null;
        try {
            zipOutputStream = new ZipOutputStream(new BufferedOutputStream(new FileOutputStream(destinationFile, false)));

            Stack<File> files = new Stack<File>();
            if (sourceFiles != null) {
                Collectionx.addAll(files, sourceFiles);
            }

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
                    zipOutputStream.putNextEntry(new ZipEntry(zipEntryNameTransform.transform(childFile)));
                    InputStream inputStream = null;
                    try {
                        inputStream = new BufferedInputStream(new FileInputStream(childFile));
                        IOStreamx.copyTo(inputStream, zipOutputStream);
                    } finally {
                        zipOutputStream.closeEntry();
                        IOStreamx.safeClose(inputStream);
                    }
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
            //noinspection ResultOfMethodCallIgnored
            destinationFile.delete();
            throw e;
        } finally {
            IOStreamx.safeClose(zipOutputStream);
        }

        return destinationFile;
    }

    /**
     * Compress all files in the specified directory to
     *
     * @param sourceDirectory The directory to be compressed
     * @param destinationFile Output file
     * @return Output file
     * @throws IOException IO exceptions
     */
    public static File compressionDir(@NotNull final File sourceDirectory, @NotNull File destinationFile) throws IOException {
        Filex.requireExist(sourceDirectory);
        Premisex.require(sourceDirectory.isDirectory(), sourceDirectory.getPath() + " not directory");
        return compressionFiles(sourceDirectory.listFiles(), destinationFile, new Transformer<File, String>() {
            @NotNull
            @Override
            public String transform(@NotNull File file) {
                return file.getPath().replace(sourceDirectory.getPath() + "/", "");
            }
        });
    }

    /**
     * Compress all files under the specified folder, output ZIP file and [sourceDirectory] in the same directory, name is [sourceDirectory] plus '.zip'
     *
     * @param sourceDirectory The directory to be compressed
     * @return Output file
     * @throws IOException IO exceptions
     */
    public static File compressionDir(@NotNull File sourceDirectory) throws IOException {
        return compressionDir(sourceDirectory, new File(sourceDirectory.getPath() + ".zip"));
    }


    /**
     * Unzip the ZIP file to the specified folder
     *
     * @param zipSourceFile  ZIP file
     * @param destinationDir Out dir
     * @return Out dir
     * @throws IOException IO exceptions. include ZipException, UnableCreateDirException, UnableCreateFileException
     */
    @NotNull
    public static File decompression(@NotNull File zipSourceFile, @NotNull File destinationDir) throws IOException {
        Filex.requireExist(zipSourceFile);
        Premisex.require(!destinationDir.exists() || destinationDir.isDirectory(), destinationDir.getPath() + " not directory");

        ZipFile zipFile = new ZipFile(zipSourceFile);
        try {
            Enumeration<?> entries = zipFile.entries();
            while (entries.hasMoreElements()) {
                ZipEntry zipEntry = (ZipEntry) entries.nextElement();
                File file = new File(destinationDir, zipEntry.getName());
                if (zipEntry.isDirectory()) {
                    Filex.mkdirsWithThrow(file);
                } else {
                    Filex.createNewFileWithThrow(file);
                    InputStream inputStream = null;
                    OutputStream outputStream = null;
                    try {
                        inputStream = zipFile.getInputStream(zipEntry);
                        outputStream = new FileOutputStream(file, false);
                        IOStreamx.copyTo(inputStream, outputStream);
                    } finally {
                        IOStreamx.safeClose(outputStream);
                        IOStreamx.safeClose(inputStream);
                    }
                }
            }
        } finally {
            IOStreamx.safeClose(zipFile);
        }

        return destinationDir;
    }

    /**
     * Unzip the ZIP file to its directory, and the output folder name is the name of the ZIP file (without the suffix)
     *
     * @param zipSourceFile ZIP file
     * @return Out dir
     * @throws IOException IO exceptions. include ZipException, UnableCreateDirException, UnableCreateFileException
     */
    @NotNull
    public static File decompression(@NotNull File zipSourceFile) throws IOException {
        return decompression(zipSourceFile, new File(zipSourceFile.getParentFile(), Filex.getNameWithoutExtension(zipSourceFile)));
    }
}