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

package me.panpf.javax.io;

import me.panpf.javax.collections.Arrayx;
import me.panpf.javax.collections.Collectionx;
import me.panpf.javax.sequences.Sequence;
import me.panpf.javax.lang.Charx;
import me.panpf.javax.lang.Stringx;
import me.panpf.javax.ranges.Rangex;
import me.panpf.javax.util.*;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import java.io.*;
import java.nio.charset.Charset;
import java.util.*;

/**
 * 文件工具类，提供一些有关文件的便捷方法
 */
@SuppressWarnings("WeakerAccess")
public class Filex {


    private Filex() {
    }


    /* ******************************************* mkdirs and create ****************************************** */


    /**
     * Create a directory and throw an exception if it cannot be created
     *
     * @throws UnableCreateDirException Unable to create directory
     */
    @NotNull
    public static File mkdirsOrThrow(@NotNull File dir) throws UnableCreateDirException {
        if (dir.exists()) return dir;
        //noinspection ResultOfMethodCallIgnored
        dir.mkdirs();
        if (!dir.exists()) throw new UnableCreateDirException(dir);
        return dir;
    }

    /**
     * Create a directory
     *
     * @return If true, the creation is successful.
     */
    public static boolean mkdirsOrCheck(@NotNull File dir) {
        if (dir.exists()) return true;
        //noinspection ResultOfMethodCallIgnored
        dir.mkdirs();
        return dir.exists();
    }

    /**
     * Create a file, create its parent directory first, and throw an exception if it cannot be created
     *
     * @throws UnableCreateFileException Unable to create file
     * @throws UnableCreateDirException  Unable to create parent directory
     */
    @NotNull
    public static File createNewFileOrThrow(@NotNull File file) throws UnableCreateFileException, UnableCreateDirException {
        if (file.exists()) return file;
        mkdirsOrThrow(file.getParentFile());

        try {
            //noinspection ResultOfMethodCallIgnored
            file.createNewFile();
        } catch (IOException e) {
            throw new UnableCreateFileException(file, e);
        }

        if (!file.exists()) throw new UnableCreateFileException(file);
        return file;
    }

    /**
     * Create a file, create its parent directory first
     *
     * @return If true, the creation is successful.
     */
    public static boolean createNewFileOrCheck(@NotNull File file) {
        if (file.exists()) return true;
        if (!mkdirsOrCheck(file.getParentFile())) return false;

        try {
            //noinspection ResultOfMethodCallIgnored
            file.createNewFile();
        } catch (IOException e) {
            return false;
        }

        return file.exists();
    }


    /* ******************************************* clean ****************************************** */


    /**
     * Delete all subfiles in the current directory (excluding subfolders)
     *
     * @return If true, the clean is successful, otherwise the clean fails.
     */
    public static boolean clean(@NotNull File dir) {
        if (!dir.exists() || dir.isFile()) return true;

        File[] childFiles = dir.listFiles();
        if (childFiles == null || Arrayx.isNullOrEmpty(childFiles)) return true;

        boolean result = true;
        for (File childFile : childFiles) {
            if (childFile.exists() && childFile.isFile()) {
                if (!childFile.delete()) {
                    result = false;
                    break;
                }
            }
        }
        return result;
    }


    /**
     * Loop delete all files or folders in the directory
     *
     * @return If true, the clean is successful, otherwise the clean fails.
     */
    public static boolean cleanRecursively(@NotNull final File dir) {
        return Collectionx.fold(walkBottomUp(dir), true, new Operation<File, Boolean>() {
            @NotNull
            @Override
            public Boolean operation(@NotNull Boolean aBoolean, @NotNull File file) {
                return (file.equals(dir) || file.delete() || !file.exists()) && aBoolean;
            }
        });
    }


    /* ******************************************* length ****************************************** */


    /**
     * Get the length of the file or dir, if it is a directory, it will superimpose the length of all subfiles
     */
    public static long lengthRecursively(@NotNull File file) {
        if (!file.exists()) return 0;
        if (file.isFile()) return file.length();

        long length = 0;

        Queue<File> fileQueue = new LinkedList<>();
        fileQueue.add(file);

        File childFile;
        while (true) {
            childFile = fileQueue.poll();
            if (childFile == null || !childFile.exists()) {
                break;
            }

            if (childFile.isFile()) {
                length += childFile.length();
            } else {
                File[] childChildFiles = childFile.listFiles();
                if (Arrayx.isNotNullOrEmpty(childChildFiles)) {
                    Collections.addAll(fileQueue, childChildFiles);
                }
            }
        }
        return length;
    }

    /**
     * Get the length of the files or dirs, if it is a directory, it will superimpose the length of all subfiles
     */
    public static long lengthRecursively(@Nullable File[] files) {
        return (long) Arrayx.sumByDouble(files, new Transformer<File, Double>() {
            @NotNull
            @Override
            public Double transform(@NotNull File file) {
                return (double) lengthRecursively(file);
            }
        });
    }

    /**
     * Get the length of the files or dirs, if it is a directory, it will superimpose the length of all subfiles
     */
    public static long lengthRecursively(@Nullable Iterable<File> files) {
        return (long) Collectionx.sumByDouble(files, new Transformer<File, Double>() {
            @NotNull
            @Override
            public Double transform(@NotNull File file) {
                return (double) lengthRecursively(file);
            }
        });
    }


    /* ******************************************* list ****************************************** */


    /**
     * Return the path to the file under this directory and all its subdirectories
     */
    @Nullable
    public static String[] listRecursively(@NotNull File dir, @NotNull FileFilter fileFilter) {
        if (!dir.exists()) return null;
        if (dir.isFile()) return null;

        List<String> files = new LinkedList<>();

        Queue<File> dirQueue = new LinkedList<>();
        dirQueue.add(dir);

        while (true) {
            File currentDir = dirQueue.poll();
            if (currentDir == null || !currentDir.exists()) break;

            String[] childPaths = currentDir.list();
            if (childPaths == null) continue;

            for (String childPath : childPaths) {
                File childFile = new File(currentDir, childPath);
                if (!childFile.exists()) continue;
                if (fileFilter.accept(childFile)) {
                    files.add(childFile.getPath().replace(dir.getPath() + File.separator, ""));
                }

                if (childFile.isDirectory()) {
                    dirQueue.add(childFile);
                }
            }
        }
        return files.isEmpty() ? null : files.toArray(new String[0]);
    }

    /**
     * Return the path to the file under this directory and all its subdirectories
     */
    @Nullable
    public static String[] listRecursively(@NotNull File dir, @NotNull FilenameFilter filenameFilter) {
        if (!dir.exists()) return null;
        if (dir.isFile()) return null;

        List<String> files = new LinkedList<>();

        Queue<File> dirQueue = new LinkedList<>();
        dirQueue.add(dir);

        while (true) {
            File currentDir = dirQueue.poll();
            if (currentDir == null || !currentDir.exists()) break;

            String[] childPaths = currentDir.list();
            if (childPaths == null) continue;

            for (String childPath : childPaths) {
                File childFile = new File(currentDir, childPath);
                if (!childFile.exists()) continue;
                if (filenameFilter.accept(currentDir, childPath)) {
                    files.add(childFile.getPath().replace(dir.getPath() + File.separator, ""));
                }

                if (childFile.isDirectory()) {
                    dirQueue.add(childFile);
                }
            }
        }
        return files.isEmpty() ? null : files.toArray(new String[0]);
    }

    /**
     * Return the path to the file under this directory and all its subdirectories
     */
    @Nullable
    public static String[] listRecursively(@NotNull File dir) {
        if (!dir.exists()) return null;
        if (dir.isFile()) return null;

        List<String> files = new LinkedList<>();

        Queue<File> dirQueue = new LinkedList<>();
        dirQueue.add(dir);

        while (true) {
            File currentDir = dirQueue.poll();
            if (currentDir == null || !currentDir.exists()) break;

            String[] childPaths = currentDir.list();
            if (childPaths == null) continue;

            for (String childPath : childPaths) {
                File childFile = new File(currentDir, childPath);
                if (!childFile.exists()) continue;
                files.add(childFile.getPath().replace(dir.getPath() + File.separator, ""));

                if (childFile.isDirectory()) {
                    dirQueue.add(childFile);
                }
            }
        }
        return files.isEmpty() ? null : files.toArray(new String[0]);
    }

    /**
     * Return files in this directory and all its subdirectories
     */
    @Nullable
    public static File[] listFilesRecursively(@NotNull File dir, @NotNull FileFilter fileFilter) {
        if (!dir.exists()) return null;
        if (dir.isFile()) return null;

        List<File> files = new LinkedList<>();

        Queue<File> dirQueue = new LinkedList<>();
        dirQueue.add(dir);

        while (true) {
            File currentDir = dirQueue.poll();
            if (currentDir == null || !currentDir.exists()) break;

            File[] childFiles = currentDir.listFiles();
            if (childFiles == null) continue;

            for (File childFile : childFiles) {
                if (!childFile.exists()) continue;

                if (fileFilter.accept(childFile)) {
                    files.add(childFile);
                }

                if (childFile.isDirectory()) {
                    dirQueue.add(childFile);
                }
            }
        }
        return files.isEmpty() ? null : files.toArray(new File[0]);
    }

    /**
     * Return files in this directory and all its subdirectories
     */
    @Nullable
    public static File[] listFilesRecursively(@NotNull File dir, @NotNull FilenameFilter filenameFilter) {
        if (!dir.exists()) return null;
        if (dir.isFile()) return null;

        List<File> files = new LinkedList<>();

        Queue<File> dirQueue = new LinkedList<>();
        dirQueue.add(dir);

        File currentDir;
        while (true) {
            currentDir = dirQueue.poll();
            if (currentDir == null || !currentDir.exists()) break;

            File[] childFiles = currentDir.listFiles();
            if (childFiles == null) continue;

            for (File childFile : childFiles) {
                if (!childFile.exists()) continue;

                if (filenameFilter.accept(currentDir, childFile.getName())) {
                    files.add(childFile);
                }

                if (childFile.isDirectory()) {
                    dirQueue.add(childFile);
                }
            }
        }
        return files.isEmpty() ? null : files.toArray(new File[0]);
    }

    /**
     * Return files in this directory and all its subdirectories
     */
    @Nullable
    public static File[] listFilesRecursively(@NotNull File dir) {
        if (!dir.exists()) return null;
        if (dir.isFile()) return null;

        List<File> files = new LinkedList<>();

        Queue<File> dirQueue = new LinkedList<>();
        dirQueue.add(dir);

        while (true) {
            File currentDir = dirQueue.poll();
            if (currentDir == null || !currentDir.exists()) break;

            File[] childFiles = currentDir.listFiles();
            if (childFiles == null) continue;

            for (File childFile : childFiles) {
                if (!childFile.exists()) continue;

                files.add(childFile);

                if (childFile.isDirectory()) {
                    dirQueue.add(childFile);
                }
            }
        }
        return files.isEmpty() ? null : files.toArray(new File[0]);
    }


    /* ******************************************* listCount ****************************************** */


    /**
     * Returns the number of files in the specified folder, excluding subfiles and subfolders
     */
    public static int listCount(@NotNull File dir, @NotNull FileFilter fileFilter) {
        if (!dir.exists()) return 0;
        if (dir.isFile()) return 0;
        return Arrayx.count(dir.listFiles(fileFilter));
    }

    /**
     * Returns the number of files in the specified folder, excluding subfiles and subfolders
     */
    public static int listCount(@NotNull File dir, @NotNull FilenameFilter filenameFilter) {
        if (!dir.exists()) return 0;
        if (dir.isFile()) return 0;
        return Arrayx.count(dir.list(filenameFilter));
    }

    /**
     * Returns the number of files in the specified folder, excluding subfiles and subfolders
     */
    public static int listCount(@NotNull File dir) {
        if (!dir.exists()) return 0;
        if (dir.isFile()) return 0;
        return Arrayx.count(dir.list());
    }

    /**
     * Returns the number of files in the specified directory and all its subdirectories
     */
    public static int listCountRecursively(@NotNull final File dir, @NotNull final FileFilter fileFilter) {
        if (!dir.exists()) return 0;
        if (dir.isFile()) return 0;
        return Collectionx.count(walkTopDown(dir), new Predicate<File>() {
            @Override
            public boolean accept(@NotNull File file) {
                return !file.equals(dir) && fileFilter.accept(file);
            }
        });
    }

    /**
     * Returns the number of files in the specified directory and all its subdirectories
     */
    public static int listCountRecursively(@NotNull final File dir, @NotNull final FilenameFilter filenameFilter) {
        if (!dir.exists()) return 0;
        if (dir.isFile()) return 0;
        return Collectionx.count(walkTopDown(dir), new Predicate<File>() {
            @Override
            public boolean accept(@NotNull File file) {
                return !file.equals(dir) && filenameFilter.accept(file.getParentFile(), file.getName());
            }
        });
    }

    /**
     * Returns the number of files in the specified directory and all its subdirectories
     */
    public static int listCountRecursively(@NotNull final File dir) {
        if (!dir.exists()) return 0;
        if (dir.isFile()) return 0;
        return Collectionx.count(walkTopDown(dir), new Predicate<File>() {
            @Override
            public boolean accept(@NotNull File file) {
                return !file.equals(dir);
            }
        });
    }


    /* ******************************************* other ****************************************** */

    /**
     * Returns all extensions for this file, or an empty string if none. For example: '/tmp/testExtension.txt.zip' returns 'txt.zip'
     */
    public static String getAllExtension(@NotNull File file) {
        return Stringx.substringAfter(file.getName(), ".", "");
    }

    /**
     * Returns file's name without an all extension. For example: '/tmp/testExtension.txt.zip' returns 'testExtension'
     */
    public static String getNameWithoutAllExtension(@NotNull File file) {
        return Stringx.substringBefore(file.getName(), ".", file.getName());
    }

    /**
     * Create a file tree
     *
     * @param dir         Start directory
     * @param maxSpan     Max span. Decide how many files or directories are in the same directory
     * @param maxDepth    Max depth
     * @param fileName    File name. For example 'test.txt', 'test1.txt', 'test2.txt'... will be created in the folder...
     * @param fileContent The content to be written to the file
     * @return Start directory
     */
    public static File createFileTree(@NotNull File dir, int maxSpan, int maxDepth, @NotNull String fileName, @Nullable String fileContent) throws IOException {
        File file = new File(fileName);
        String nameWithoutExtension = Filex.getNameWithoutExtension(file);
        String extension = Filex.getExtension(file);
        for (int span : Rangex.rangeTo(1, maxSpan)) {
            File outFile = new File(dir, nameWithoutExtension + span + "." + extension);
            Filex.createNewFileOrThrow(outFile);
            Filex.writeText(outFile, maxDepth + "-" + span + "\n" + Stringx.orEmpty(fileContent));
            if (maxDepth > 1) createFileTree(new File(dir, "dir" + span), maxSpan, maxDepth - 1, fileName, fileContent);
        }
        return dir;
    }

    /**
     * Compare file paths, commonly used to sort, for example '/a/b/c' is greater than '/a/b' is greater than '/a/c'
     */
    public static int compareFilePath(@Nullable String filePath1, @Nullable String filePath2) {
        final String finalFilePath1 = Stringx.orEmpty(filePath1);
        final String finalFilePath2 = Stringx.orEmpty(filePath2);
        final int filePathLength1 = finalFilePath1.length();
        final int filePathLength2 = finalFilePath2.length();
        if (filePathLength1 != filePathLength2) {
            return filePathLength1 > filePathLength2 ? 1 : -1;
        } else {
            return finalFilePath1.compareTo(finalFilePath2);
        }
    }

    /**
     * Compare file paths, commonly used to sort, for example '/a/b/c' is greater than '/a/b' is greater than '/a/c'
     */
    public static int compareFilePath(@Nullable File file1, @Nullable File file2) {
        return compareFilePath(file1 != null ? file1.getPath() : null, file2 != null ? file2.getPath() : null);
    }

    /**
     * If the specified file does not exist, return the file, otherwise add a number after the name of the original file until you find a file that does not exist.
     *
     * @param maxNumber Maximum number
     */
    @NotNull
    public static File existOrAddNumber(@NotNull File file, int maxNumber) {
        if (!file.exists()) return file;

        String nameWithoutExtension = Filex.getNameWithoutExtension(file);
        String extension = Filex.getExtension(file);
        File parentFile = file.getParentFile();

        final int finalMaxNumber = maxNumber > 0 ? maxNumber : Integer.MAX_VALUE;
        int number = 1;
        File finalFile;
        while (number <= finalMaxNumber) {
            finalFile = new File(parentFile, nameWithoutExtension + number + (Stringx.isSafe(extension) ? ("." + extension) : ""));
            if (!finalFile.exists()) return finalFile;
            number++;
        }

        finalFile = new File(parentFile, nameWithoutExtension + String.valueOf(System.currentTimeMillis()) + (Stringx.isSafe(extension) ? ("." + extension) : ""));
        if (!finalFile.exists()) return finalFile;

        finalFile = new File(parentFile, nameWithoutExtension + UUID.randomUUID().toString() + (Stringx.isSafe(extension) ? ("." + extension) : ""));
        if (!finalFile.exists()) return finalFile;

        throw new RuntimeException("Unable to find a file that does not exist: " + file.getPath());
    }

    /**
     * If the specified file does not exist, return the file, otherwise add a number after the name of the original file until you find a file that does not exist.
     */
    @NotNull
    public static File existOrAddNumber(@NotNull File file) {
        return existOrAddNumber(file, -1);
    }


    /*
     * *****************************************************************************************************************
     * From kotlin standard library
     * *****************************************************************************************************************
     */


    /* ******************************************* copy ****************************************** */


    /**
     * Copies this file to the given [target] file.
     * <p>
     * If some directories on a way to the [target] are missing, then they will be created.
     * If the [target] file already exists, this function will fail unless [overwrite] argument is set to `true`.
     * <p>
     * When [overwrite] is `true` and [target] is a directory, it is replaced only if it is empty.
     * <p>
     * If this file is a directory, it is copied without its content, i.e. an empty [target] directory is created.
     * If you want to copy directory including its contents, use [copyRecursively].
     * <p>
     * The operation doesn't preserve copied file attributes such as creation/modification date, permissions, etc.
     *
     * @param overwrite  `true` if destination overwrite is allowed.
     * @param bufferSize the buffer size to use when copying.
     * @return the [target] file.
     * @throws NoSuchFileException        if the source file doesn't exist.
     * @throws FileAlreadyExistsException if the destination file already exists and [overwrite] argument is set to `false`.
     * @throws IOException                if any errors occur while copying.
     */
    @NotNull
    public static File copyTo(@NotNull File source, @NotNull File target, boolean overwrite, int bufferSize) throws IOException {
        Premisex.requireFileExist(source);

        if (target.exists() && (!overwrite || !target.delete())) {
            throw new FileAlreadyExistsException(source, target, "The destination file already exists.");
        }

        if (source.isDirectory()) {
            if (!target.mkdirs()) {
                throw new FileSystemException(source, target, "Failed to create target directory.");
            }
        } else {
            //noinspection ResultOfMethodCallIgnored
            target.getParentFile().mkdirs();

            InputStream inputStream = null;
            OutputStream outputStream = null;
            try {
                inputStream = inputStream(source);
                outputStream = outputStream(target);
                Streamx.copyTo(inputStream, outputStream, bufferSize);
            } finally {
                Streamx.closeQuietly(inputStream);
                Streamx.closeQuietly(outputStream);
            }
        }

        return target;
    }

    /**
     * Copies this file to the given [target] file.
     * <p>
     * If some directories on a way to the [target] are missing, then they will be created.
     * If the [target] file already exists, this function will fail unless [overwrite] argument is set to `true`.
     * <p>
     * When [overwrite] is `true` and [target] is a directory, it is replaced only if it is empty.
     * <p>
     * If this file is a directory, it is copied without its content, i.e. an empty [target] directory is created.
     * If you want to copy directory including its contents, use [copyRecursively].
     * <p>
     * The operation doesn't preserve copied file attributes such as creation/modification date, permissions, etc.
     *
     * @param overwrite `true` if destination overwrite is allowed.
     * @return the [target] file.
     * @throws NoSuchFileException        if the source file doesn't exist.
     * @throws FileAlreadyExistsException if the destination file already exists and [overwrite] argument is set to `false`.
     * @throws IOException                if any errors occur while copying.
     */
    @NotNull
    public static File copyTo(@NotNull File source, @NotNull File target, boolean overwrite) throws IOException {
        return copyTo(source, target, overwrite, Streamx.DEFAULT_BUFFER_SIZE);
    }

    /**
     * Copies this file to the given [target] file.
     * <p>
     * If some directories on a way to the [target] are missing, then they will be created.
     * If the [target] file already exists, this function will fail unless [overwrite] argument is set to `true`.
     * <p>
     * When [overwrite] is `true` and [target] is a directory, it is replaced only if it is empty.
     * <p>
     * If this file is a directory, it is copied without its content, i.e. an empty [target] directory is created.
     * If you want to copy directory including its contents, use [copyRecursively].
     * <p>
     * The operation doesn't preserve copied file attributes such as creation/modification date, permissions, etc.
     *
     * @return the [target] file.
     * @throws NoSuchFileException        if the source file doesn't exist.
     * @throws FileAlreadyExistsException if the destination file already exists and [overwrite] argument is set to `false`.
     * @throws IOException                if any errors occur while copying.
     */
    @NotNull
    public static File copyTo(@NotNull File source, @NotNull File target, int bufferSize) throws IOException {
        return copyTo(source, target, false, bufferSize);
    }

    /**
     * Copies this file to the given [target] file.
     * <p>
     * If some directories on a way to the [target] are missing, then they will be created.
     * If the [target] file already exists, this function will fail unless [overwrite] argument is set to `true`.
     * <p>
     * When [overwrite] is `true` and [target] is a directory, it is replaced only if it is empty.
     * <p>
     * If this file is a directory, it is copied without its content, i.e. an empty [target] directory is created.
     * If you want to copy directory including its contents, use [copyRecursively].
     * <p>
     * The operation doesn't preserve copied file attributes such as creation/modification date, permissions, etc.
     *
     * @return the [target] file.
     * @throws NoSuchFileException        if the source file doesn't exist.
     * @throws FileAlreadyExistsException if the destination file already exists and [overwrite] argument is set to `false`.
     * @throws IOException                if any errors occur while copying.
     */
    @NotNull
    public static File copyTo(@NotNull File source, @NotNull File target) throws IOException {
        return copyTo(source, target, false, Streamx.DEFAULT_BUFFER_SIZE);
    }

    /**
     * Copies this file with all its children to the specified destination [target] path.
     * If some directories on the way to the destination are missing, then they will be created.
     * <p>
     * If this file path points to a single file, then it will be copied to a file with the path [target].
     * If this file path points to a directory, then its children will be copied to a directory with the path [target].
     * <p>
     * If the [target] already exists, it will be deleted before copying when the [overwrite] parameter permits so.
     * <p>
     * The operation doesn't preserve copied file attributes such as creation/modification date, permissions, etc.
     * <p>
     * If any errors occur during the copying, then further actions will depend on the result of the call
     * to `onError(File, IOException)` function, that will be called with arguments,
     * specifying the file that caused the error and the exception itself.
     * By default this function rethrows exceptions.
     * <p>
     * Exceptions that can be passed to the `onError` function:
     * <p>
     * - [NoSuchFileException] - if there was an attempt to copy a non-existent file
     * - [FileAlreadyExistsException] - if there is a conflict
     * - [AccessDeniedException] - if there was an attempt to open a directory that didn't succeed.
     * - [IOException] - if some problems occur when copying.
     * <p>
     * Note that if this function fails, then partial copying may have taken place.
     *
     * @param overwrite `true` if it is allowed to overwrite existing destination files and directories.
     * @return `false` if the copying was terminated, `true` otherwise.
     */
    public static boolean copyRecursively(@NotNull File source, @NotNull File target, boolean overwrite, @NotNull final OnError onError) throws IOException {
        if (!source.exists()) {
            return onError.onError(source, new NoSuchFileException(source, null, "The source file doesn't exist.")) != OnErrorAction.TERMINATE;
        }
        try {
            // We cannot break for loop from inside a lambda, so we have to use an exception here
            Sequence<File> sequence = walkTopDown(source).onFail(new OnFailed() {
                @Override
                public void onError(@NotNull File file, @NotNull IOException e) throws IOException {
                    if (onError.onError(file, e) == OnErrorAction.TERMINATE) {
                        throw new TerminateException(file);
                    }
                }
            });
            for (File src : sequence) {
                if (!src.exists()) {
                    if (onError.onError(src, new NoSuchFileException(src, null, "The source file doesn't exist.")) == OnErrorAction.TERMINATE) {
                        return false;
                    }
                } else {
                    String relPath = toRelativeString(src, source);
                    File dstFile = new File(target, relPath);
                    if (dstFile.exists() && !(src.isDirectory() && dstFile.isDirectory())) {
                        boolean stillExists;
                        if (!overwrite) {
                            stillExists = true;
                        } else {
                            if (dstFile.isDirectory()) {
                                stillExists = !deleteRecursively(dstFile);
                            } else {
                                stillExists = !dstFile.delete();
                            }
                        }

                        if (stillExists) {
                            if (onError.onError(dstFile, new FileAlreadyExistsException(src, dstFile, "The destination file already exists.")) == OnErrorAction.TERMINATE) {
                                return false;
                            }

                            continue;
                        }
                    }

                    if (src.isDirectory()) {
                        //noinspection ResultOfMethodCallIgnored
                        dstFile.mkdirs();
                    } else {
                        if (copyTo(src, dstFile, overwrite).length() != src.length()) {
                            if (onError.onError(src, new IOException("Source file wasn't copied completely, length of destination file differs.")) == OnErrorAction.TERMINATE) {
                                return false;
                            }
                        }
                    }
                }
            }
            return true;
        } catch (TerminateException e) {
            return false;
        }
    }

    /**
     * Copies this file with all its children to the specified destination [target] path.
     * If some directories on the way to the destination are missing, then they will be created.
     * <p>
     * If this file path points to a single file, then it will be copied to a file with the path [target].
     * If this file path points to a directory, then its children will be copied to a directory with the path [target].
     * <p>
     * If the [target] already exists, it will be deleted before copying when the [overwrite] parameter permits so.
     * <p>
     * The operation doesn't preserve copied file attributes such as creation/modification date, permissions, etc.
     * <p>
     * If any errors occur during the copying, then further actions will depend on the result of the call
     * to `onError(File, IOException)` function, that will be called with arguments,
     * specifying the file that caused the error and the exception itself.
     * By default this function rethrows exceptions.
     * <p>
     * Exceptions that can be passed to the `onError` function:
     * <p>
     * - [NoSuchFileException] - if there was an attempt to copy a non-existent file
     * - [FileAlreadyExistsException] - if there is a conflict
     * - [AccessDeniedException] - if there was an attempt to open a directory that didn't succeed.
     * - [IOException] - if some problems occur when copying.
     * <p>
     * Note that if this function fails, then partial copying may have taken place.
     *
     * @param overwrite `true` if it is allowed to overwrite existing destination files and directories.
     * @return `false` if the copying was terminated, `true` otherwise.
     */
    public static boolean copyRecursively(@NotNull File source, @NotNull File target, boolean overwrite) throws IOException {
        return copyRecursively(source, target, overwrite, new OnError() {
            @Override
            public OnErrorAction onError(@NotNull File file, @NotNull IOException e) throws IOException {
                throw e;
            }
        });
    }

    /**
     * Copies this file with all its children to the specified destination [target] path.
     * If some directories on the way to the destination are missing, then they will be created.
     * <p>
     * If this file path points to a single file, then it will be copied to a file with the path [target].
     * If this file path points to a directory, then its children will be copied to a directory with the path [target].
     * <p>
     * If the [target] already exists, it will be deleted before copying when the [overwrite] parameter permits so.
     * <p>
     * The operation doesn't preserve copied file attributes such as creation/modification date, permissions, etc.
     * <p>
     * If any errors occur during the copying, then further actions will depend on the result of the call
     * to `onError(File, IOException)` function, that will be called with arguments,
     * specifying the file that caused the error and the exception itself.
     * By default this function rethrows exceptions.
     * <p>
     * Exceptions that can be passed to the `onError` function:
     * <p>
     * - [NoSuchFileException] - if there was an attempt to copy a non-existent file
     * - [FileAlreadyExistsException] - if there is a conflict
     * - [AccessDeniedException] - if there was an attempt to open a directory that didn't succeed.
     * - [IOException] - if some problems occur when copying.
     * <p>
     * Note that if this function fails, then partial copying may have taken place.
     *
     * @return `false` if the copying was terminated, `true` otherwise.
     */
    public static boolean copyRecursively(@NotNull File source, @NotNull File target, @NotNull final OnError onError) throws IOException {
        return copyRecursively(source, target, false, onError);
    }

    /**
     * Copies this file with all its children to the specified destination [target] path.
     * If some directories on the way to the destination are missing, then they will be created.
     * <p>
     * If this file path points to a single file, then it will be copied to a file with the path [target].
     * If this file path points to a directory, then its children will be copied to a directory with the path [target].
     * <p>
     * If the [target] already exists, it will be deleted before copying when the [overwrite] parameter permits so.
     * <p>
     * The operation doesn't preserve copied file attributes such as creation/modification date, permissions, etc.
     * <p>
     * If any errors occur during the copying, then further actions will depend on the result of the call
     * to `onError(File, IOException)` function, that will be called with arguments,
     * specifying the file that caused the error and the exception itself.
     * By default this function rethrows exceptions.
     * <p>
     * Exceptions that can be passed to the `onError` function:
     * <p>
     * - [NoSuchFileException] - if there was an attempt to copy a non-existent file
     * - [FileAlreadyExistsException] - if there is a conflict
     * - [AccessDeniedException] - if there was an attempt to open a directory that didn't succeed.
     * - [IOException] - if some problems occur when copying.
     * <p>
     * Note that if this function fails, then partial copying may have taken place.
     *
     * @return `false` if the copying was terminated, `true` otherwise.
     */
    public static boolean copyRecursively(@NotNull File source, @NotNull File target) throws IOException {
        return copyRecursively(source, target, false, new OnError() {
            @Override
            public OnErrorAction onError(@NotNull File file, @NotNull IOException e) throws IOException {
                throw e;
            }
        });
    }


    /* ******************************************* delete ****************************************** */


    /**
     * Delete this file with all its children.
     * Note that if this operation fails then partial deletion may have taken place.
     *
     * @return `true` if the file or directory is successfully deleted, `false` otherwise.
     */
    public static boolean deleteRecursively(@NotNull File file) {
        return Collectionx.fold(walkBottomUp(file), true, new Operation<File, Boolean>() {
            @NotNull
            @Override
            public Boolean operation(@NotNull Boolean aBoolean, @NotNull File file) {
                return (file.delete() || !file.exists()) && aBoolean;
            }
        });
    }


    /* ******************************************* startsWith ****************************************** */


    /**
     * Determines whether this file belongs to the same root as [other]
     * and starts with all components of [other] in the same order.
     * So if [other] has N components, first N components of `this` must be the same as in [other].
     *
     * @return `true` if this path starts with [other] path, `false` otherwise.
     */
    public static boolean startsWith(@NotNull File self, @NotNull File other) {
        FilePathComponents components = toComponents(self);
        FilePathComponents otherComponents = toComponents(other);
        if (!components.root.equals(otherComponents.root)) {
            return false;
        } else if (components.size < otherComponents.size) {
            return false;
        } else {
            return components.segments.subList(0, otherComponents.size).equals(otherComponents.segments);
        }
    }

    /**
     * Determines whether this file belongs to the same root as [other]
     * and starts with all components of [other] in the same order.
     * So if [other] has N components, first N components of `this` must be the same as in [other].
     *
     * @return `true` if this path starts with [other] path, `false` otherwise.
     */
    public static boolean startsWith(@NotNull File self, @NotNull String other) {
        return startsWith(self, new File(other));
    }


    /* ******************************************* endsWith ****************************************** */


    /**
     * Determines whether this file path ends with the path of [other] file.
     * <p>
     * If [other] is rooted path it must be equal to this.
     * If [other] is relative path then last N components of `this` must be the same as all components in [other],
     * where N is the number of components in [other].
     *
     * @return `true` if this path ends with [other] path, `false` otherwise.
     */
    public static boolean endsWith(@NotNull File self, @NotNull File other) {
        FilePathComponents components = toComponents(self);
        FilePathComponents otherComponents = toComponents(other);
        if (otherComponents.isRooted) {
            return self.equals(other);
        } else {
            int shift = components.size - otherComponents.size;
            if (shift < 0) {
                return false;
            } else {
                return components.segments.subList(shift, components.size).equals(otherComponents.segments);
            }
        }
    }

    /**
     * Determines whether this file belongs to the same root as [other]
     * and ends with all components of [other] in the same order.
     * So if [other] has N components, last N components of `this` must be the same as in [other].
     * For relative [other], `this` can belong to any root.
     *
     * @return `true` if this path ends with [other] path, `false` otherwise.
     */
    public static boolean endsWith(@NotNull File self, @NotNull String other) {
        return endsWith(self, new File(other));
    }


    /* ******************************************* normalize ****************************************** */


    /**
     * Removes all . and resolves all possible .. in this file name.
     * For instance, `File("/foo/./bar/gav/../baaz").normalize()` is `File("/foo/bar/baaz")`.
     *
     * @return normalized pathname with . and possibly .. removed.
     */
    @NotNull
    public static File normalize(@NotNull File file) {
        FilePathComponents components = toComponents(file);
        return resolve(components.root, Collectionx.joinToString(normalize(components.segments), File.separator));
    }

    @NotNull
    private static FilePathComponents normalize(@NotNull FilePathComponents components) {
        return new FilePathComponents(components.root, normalize(components.segments));
    }

    @NotNull
    private static List<File> normalize(@NotNull List<File> files) {
        List<File> list = new ArrayList<>(files.size());
        for (File file : files) {
            String name = file.getName();
            //noinspection StatementWithEmptyBody
            if (".".equals(name)) {

            } else if ("..".equals(name)) {
                if (!list.isEmpty() && !Collectionx.last(list).getName().equals("..")) {
                    list.remove(list.size() - 1);
                } else {
                    list.add(file);
                }
            } else {
                list.add(file);
            }
        }
        return list;
    }


    /* ******************************************* resolve ****************************************** */


    /**
     * Adds [relative] file to this, considering this as a directory.
     * If [relative] has a root, [relative] is returned back.
     * For instance, `File("/foo/bar").resolve(File("gav"))` is `File("/foo/bar/gav")`.
     * This function is complementary with [relativeTo],
     * so `f.resolve(g.relativeTo(f)) == g` should be always `true` except for different roots case.
     *
     * @return concatenated this and [relative] paths, or just [relative] if it's absolute.
     */
    @NotNull
    public static File resolve(@NotNull File file, @NotNull File relative) {
        if (isRooted(relative)) {
            return relative;
        } else {
            String baseName = file.toString();
            return baseName.isEmpty() || Stringx.endsWith(baseName, File.separatorChar) ? new File(baseName + relative)
                    : new File(baseName + File.separatorChar + relative);
        }
    }

    /**
     * Adds [relative] name to this, considering this as a directory.
     * If [relative] has a root, [relative] is returned back.
     * For instance, `File("/foo/bar").resolve("gav")` is `File("/foo/bar/gav")`.
     *
     * @return concatenated this and [relative] paths, or just [relative] if it's absolute.
     */
    @NotNull
    public static File resolve(@NotNull File file, @NotNull String relative) {
        return resolve(file, new File(relative));
    }

    /**
     * Adds [relative] file to this parent directory.
     * If [relative] has a root or this has no parent directory, [relative] is returned back.
     * For instance, `File("/foo/bar").resolveSibling(File("gav"))` is `File("/foo/gav")`.
     *
     * @return concatenated this.parent and [relative] paths, or just [relative] if it's absolute or this has no parent.
     */
    @NotNull
    public static File resolveSibling(@NotNull File self, @NotNull File relative) {
        FilePathComponents components = toComponents(self);
        File parentSubPath = components.size == 0 ? new File("..") : components.subPath(0, components.size - 1);
        return resolve(resolve(components.root, parentSubPath), relative);
    }

    /**
     * Adds [relative] name to this parent directory.
     * If [relative] has a root or this has no parent directory, [relative] is returned back.
     * For instance, `File("/foo/bar").resolveSibling("gav")` is `File("/foo/gav")`.
     *
     * @return concatenated this.parent and [relative] paths, or just [relative] if it's absolute or this has no parent.
     */
    @NotNull
    public static File resolveSibling(@NotNull File self, @NotNull String relative) {
        return resolveSibling(self, new File(relative));
    }


    /* ******************************************* temp ****************************************** */


    /**
     * Creates an empty directory in the specified [directory], using the given [prefix] and [suffix] to generate its name.
     * <p>
     * If [prefix] is not specified then some unspecified name will be used.
     * If [suffix] is not specified then ".tmp" will be used.
     * If [directory] is not specified then the default temporary-file directory will be used.
     *
     * @return a file object corresponding to a newly-created directory.
     * @throws IOException              in case of input/output error.
     * @throws IllegalArgumentException if [prefix] is shorter than three symbols.
     */
    @NotNull
    public static File createTempDir(@NotNull String prefix, @Nullable String suffix, @Nullable File directory) throws IOException {
        File dir = File.createTempFile(prefix, suffix, directory);
        //noinspection ResultOfMethodCallIgnored
        dir.delete();
        if (dir.mkdir()) {
            return dir;
        } else {
            throw new IOException("Unable to create temporary directory " + dir.getPath() + ".");
        }
    }

    /**
     * Creates an empty directory in the specified [directory], using the given [prefix] and [suffix] to generate its name.
     * <p>
     * If [prefix] is not specified then some unspecified name will be used.
     * If [suffix] is not specified then ".tmp" will be used.
     *
     * @return a file object corresponding to a newly-created directory.
     * @throws IOException              in case of input/output error.
     * @throws IllegalArgumentException if [prefix] is shorter than three symbols.
     */
    @NotNull
    public static File createTempDir(@NotNull String prefix, @Nullable String suffix) throws IOException {
        return createTempDir(prefix, suffix, null);
    }

    /**
     * Creates an empty directory in the specified [directory], using the given [prefix] and [suffix] to generate its name.
     * <p>
     * If [directory] is not specified then the default temporary-file directory will be used.
     *
     * @return a file object corresponding to a newly-created directory.
     * @throws IOException              in case of input/output error.
     * @throws IllegalArgumentException if [prefix] is shorter than three symbols.
     */
    @NotNull
    public static File createTempDir(@Nullable File directory) throws IOException {
        return createTempDir("tmp", null, directory);
    }

    /**
     * Creates an empty directory in the specified [directory], using the given [prefix] and [suffix] to generate its name.
     *
     * @return a file object corresponding to a newly-created directory.
     * @throws IOException              in case of input/output error.
     * @throws IllegalArgumentException if [prefix] is shorter than three symbols.
     */
    @NotNull
    public static File createTempDir() throws IOException {
        return createTempDir("tmp", null, null);
    }

    /**
     * Creates a new empty file in the specified [directory], using the given [prefix] and [suffix] to generate its name.
     * <p>
     * If [prefix] is not specified then some unspecified name will be used.
     * If [suffix] is not specified then ".tmp" will be used.
     * If [directory] is not specified then the default temporary-file directory will be used.
     *
     * @return a file object corresponding to a newly-created file.
     * @throws IOException              in case of input/output error.
     * @throws IllegalArgumentException if [prefix] is shorter than three symbols.
     */
    @NotNull
    public static File createTempFile(@NotNull String prefix, @Nullable String suffix, @Nullable File directory) throws IOException {
        return File.createTempFile(prefix, suffix, directory);
    }

    /**
     * Creates a new empty file in the specified [directory], using the given [prefix] and [suffix] to generate its name.
     * <p>
     * If [prefix] is not specified then some unspecified name will be used.
     * If [suffix] is not specified then ".tmp" will be used.
     * If [directory] is not specified then the default temporary-file directory will be used.
     *
     * @return a file object corresponding to a newly-created file.
     * @throws IOException              in case of input/output error.
     * @throws IllegalArgumentException if [prefix] is shorter than three symbols.
     */
    @NotNull
    public static File createTempFile(@NotNull String prefix, @Nullable String suffix) throws IOException {
        return File.createTempFile(prefix, suffix, null);
    }

    /**
     * Creates a new empty file in the specified [directory], using the given [prefix] and [suffix] to generate its name.
     * <p>
     * If [prefix] is not specified then some unspecified name will be used.
     * If [suffix] is not specified then ".tmp" will be used.
     * If [directory] is not specified then the default temporary-file directory will be used.
     *
     * @return a file object corresponding to a newly-created file.
     * @throws IOException              in case of input/output error.
     * @throws IllegalArgumentException if [prefix] is shorter than three symbols.
     */
    @NotNull
    public static File createTempFile(@Nullable File directory) throws IOException {
        return createTempFile("tmp", null, directory);
    }

    /**
     * Creates a new empty file in the specified [directory], using the given [prefix] and [suffix] to generate its name.
     *
     * @return a file object corresponding to a newly-created file.
     * @throws IOException              in case of input/output error.
     * @throws IllegalArgumentException if [prefix] is shorter than three symbols.
     */
    @NotNull
    public static File createTempFile() throws IOException {
        return createTempFile("tmp", null, null);
    }



    /* ******************************************* extension ****************************************** */


    /**
     * Returns the extension of this file (not including the dot), or an empty string if it doesn't have one.
     */
    @NotNull
    public static String getExtension(@NotNull File file) {
        return Stringx.substringAfterLast(file.getName(), '.', "");
    }

    /**
     * Returns file's name without an extension.
     */
    @NotNull
    public static String getNameWithoutExtension(@NotNull File file) {
        return Stringx.substringBeforeLast(file.getName(), ".", file.getName());
    }


    /* ******************************************* relative ****************************************** */


    /**
     * Calculates the relative path for this file from [base] file.
     * Note that the [base] file is treated as a directory.
     * If this file matches the [base] file, then an empty string will be returned.
     *
     * @return relative path from [base] to this.
     * @throws IllegalArgumentException if this and base paths have different roots.
     */
    @NotNull
    public static String toRelativeString(@NotNull final File self, @NotNull final File base) {
        String relative = toRelativeStringOrNull(self, base);
        Premisex.require(relative != null, new LazyValue<String>() {
            @NotNull
            @Override
            public String get() {
                return String.format("this and base files have different roots: %s and %s.", self.getPath(), base.getPath());
            }
        });
        return relative;
    }

    /**
     * Calculates the relative path for this file from [base] file.
     * Note that the [base] file is treated as a directory.
     * If this file matches the [base] file, then a [File] with empty path will be returned.
     *
     * @return File with relative path from [base] to this.
     * @throws IllegalArgumentException if this and base paths have different roots.
     */
    @NotNull
    public static File relativeTo(@NotNull File self, @NotNull File base) {
        return new File(toRelativeString(self, base));
    }

    /**
     * Calculates the relative path for this file from [base] file.
     * Note that the [base] file is treated as a directory.
     * If this file matches the [base] file, then a [File] with empty path will be returned.
     *
     * @return File with relative path from [base] to this, or `this` if this and base paths have different roots.
     */
    @NotNull
    public static File relativeToOrSelf(@NotNull File self, @NotNull File base) {
        String relative = toRelativeStringOrNull(self, base);
        return relative != null ? new File(relative) : self;
    }

    /**
     * Calculates the relative path for this file from [base] file.
     * Note that the [base] file is treated as a directory.
     * If this file matches the [base] file, then a [File] with empty path will be returned.
     *
     * @return File with relative path from [base] to this, or `null` if this and base paths have different roots.
     */
    @Nullable
    public static File relativeToOrNull(@NotNull File self, @NotNull File base) {
        String relative = toRelativeStringOrNull(self, base);
        return relative != null ? new File(relative) : null;
    }


    @Nullable
    private static String toRelativeStringOrNull(@NotNull File self, @NotNull File base) {
        // Check roots
        FilePathComponents thisComponents = normalize(toComponents(self));
        FilePathComponents baseComponents = normalize(toComponents(base));
        if (!thisComponents.root.equals(baseComponents.root)) {
            return null;
        }

        int baseCount = baseComponents.size;
        int thisCount = thisComponents.size;

        int sameCount = 0;
        int maxSameCount = Math.min(thisCount, baseCount);
        while (sameCount < maxSameCount && Comparisonx.areEqual(thisComponents.segments.get(sameCount), baseComponents.segments.get(sameCount))) {
            sameCount++;
        }

        // Annihilate differing base components by adding required number of .. parts
        StringBuilder res = new StringBuilder();
        for (int i : Rangex.downTo(baseCount - 1, sameCount)) {
            if ("..".equals(baseComponents.segments.get(i).getName())) {
                return null;
            }

            res.append("..");

            if (i != sameCount) {
                res.append(File.separatorChar);
            }
        }

        // Add remaining this components
        if (sameCount < thisCount) {
            // If some .. were appended
            if (sameCount < baseCount)
                res.append(File.separatorChar);

            Collectionx.joinTo(Collectionx.drop(thisComponents.segments, sameCount), res, File.separator);
        }

        return res.toString();
    }


    /* ******************************************* root ****************************************** */


    /**
     * Estimation of a root name by a given file name.
     * <p>
     * This implementation is able to find /, Drive:/, Drive: or
     * //network.name/root as possible root names.
     * / denotes File.separator here so \ can be used instead.
     * All other possible roots cannot be identified by this implementation.
     * It's also not guaranteed (but possible) that function will be able to detect a root
     * which is incorrect for current OS. For instance, in Unix function cannot detect
     * network root names like //network.name/root, but can detect Windows roots like C:/.
     *
     * @return length or a substring representing the root for this path, or zero if this file name is relative.
     */
    private static int getRootLength(@NotNull String path) {
        // Note: separators should be already replaced to system ones
        int first = Stringx.indexOf(path, File.separatorChar, 0);
        if (first == 0) {
            if (path.length() > 1 && path.charAt(1) == File.separatorChar) {
                // Network names like //my.host/home/something ? => //my.host/home/ should be root
                // NB: does not work in Unix because //my.host/home is converted into /my.host/home there
                // So in Windows we'll have root of //my.host/home but in Unix just /
                first = Stringx.indexOf(path, File.separatorChar, 2);
                if (first >= 0) {
                    first = Stringx.indexOf(path, File.separatorChar, first + 1);
                    if (first >= 0)
                        return first + 1;
                    else
                        return path.length();
                }
            }
            return 1;
        }
        // C:\
        if (first > 0 && path.charAt(first - 1) == ':') {
            first++;
            return first;
        }
        // C:
        if (first == -1 && Stringx.endsWith(path, ':'))
            return path.length();
        return 0;
    }

    /**
     * Determines whether this file has a root or it represents a relative path.
     * <p>
     * Returns `true` when this file has non-empty root.
     */
    public static boolean isRooted(@NotNull File file) {
        return getRootLength(file.getPath()) > 0;
    }


    /* ******************************************* components ****************************************** */


    /**
     * Splits the file into path components (the names of containing directories and the name of the file
     * itself) and returns the resulting collection of components.
     */
    @NotNull
    public static FilePathComponents toComponents(@NotNull File file) {
        String path = file.getPath();
        int rootLength = getRootLength(path);
        String rootName = path.substring(0, rootLength);
        String subPath = path.substring(rootLength);
        List<File> list = subPath.isEmpty() ? new ArrayList<File>(0) : Arrayx.map(subPath.split(String.valueOf(File.separatorChar)), new Transformer<String, File>() {
            @NotNull
            @Override
            public File transform(@NotNull String s) {
                return new File(s);
            }
        });
        return new FilePathComponents(new File(rootName), list);
    }


    /* ******************************************* path ****************************************** */


    /**
     * Returns [path][File.path] of this File using the invariant separator '/' to
     * separate the names in the name sequence.
     */
    @NotNull
    public static String getInvariantSeparatorsPath(@NotNull File file) {
        return File.separatorChar != '/' ? file.getPath().replace(File.separatorChar, '/') : file.getPath();
    }


    /**
     * Returns a relative pathname which is a subsequence of this pathname,
     * beginning from component [beginIndex], inclusive,
     * ending at component [endIndex], exclusive.
     * Number 0 belongs to a component closest to the root,
     * number count-1 belongs to a component farthest from the root.
     *
     * @throws IllegalArgumentException if [beginIndex] is negative,
     *                                  or [endIndex] is greater than existing number of components,
     *                                  or [beginIndex] is greater than [endIndex].
     */
    @NotNull
    public static File subPath(@NotNull File file, int beginIndex, int endIndex) {
        return toComponents(file).subPath(beginIndex, endIndex);
    }


    /* ******************************************* inputStream ****************************************** */


    /**
     * Constructs a new FileInputStream of this file and returns it as a result.
     */
    public static FileInputStream inputStream(@NotNull File file) throws FileNotFoundException {
        return new FileInputStream(file);
    }

    /**
     * Returns a new [BufferedInputStream] for reading the content of this file.
     *
     * @param bufferSize necessary size of the buffer.
     */
    @NotNull
    public static BufferedInputStream bufferedInputStream(@NotNull File file, int bufferSize) throws FileNotFoundException {
        return Streamx.buffered(inputStream(file), bufferSize);
    }

    /**
     * Returns a new [BufferedInputStream] for reading the content of this file.
     */
    @NotNull
    public static BufferedInputStream bufferedInputStream(@NotNull File file) throws FileNotFoundException {
        return Streamx.buffered(inputStream(file));
    }

    /**
     * Returns a new [FileReader] for reading the content of this file.
     */
    @NotNull
    public static InputStreamReader reader(@NotNull File file, @NotNull Charset charset) throws FileNotFoundException {
        return Streamx.reader(inputStream(file), charset);
    }

    /**
     * Returns a new [FileReader] for reading the content of this file.
     */
    @NotNull
    public static InputStreamReader reader(@NotNull File file) throws FileNotFoundException {
        return Streamx.reader(inputStream(file));
    }

    /**
     * Returns a new [BufferedReader] for reading the content of this file.
     *
     * @param bufferSize necessary size of the buffer.
     */
    @NotNull
    public static BufferedReader bufferedReader(@NotNull File file, @NotNull Charset charset, int bufferSize) throws FileNotFoundException {
        return Streamx.bufferedReader(inputStream(file), charset, bufferSize);
    }

    /**
     * Returns a new [BufferedReader] for reading the content of this file.
     *
     * @param bufferSize necessary size of the buffer.
     */
    @NotNull
    public static BufferedReader bufferedReader(@NotNull File file, int bufferSize) throws FileNotFoundException {
        return Streamx.bufferedReader(inputStream(file), bufferSize);
    }

    /**
     * Returns a new [BufferedReader] for reading the content of this file.
     */
    @NotNull
    public static BufferedReader bufferedReader(@NotNull File file, @NotNull Charset charset) throws FileNotFoundException {
        return Streamx.bufferedReader(inputStream(file), charset);
    }

    /**
     * Returns a new [BufferedReader] for reading the content of this file.
     */
    @NotNull
    public static BufferedReader bufferedReader(@NotNull File file) throws FileNotFoundException {
        return Streamx.bufferedReader(inputStream(file));
    }


    /* ******************************************* read ****************************************** */


    /**
     * Gets the entire content of this file as a byte array.
     * <p>
     * This method is not recommended on huge files. It has an internal limitation of 2 GB byte array size.
     *
     * @return the entire content of this file as a byte array.
     */
    @NotNull
    public static byte[] readBytes(@NotNull File file) throws IOException {
        if (file.length() > Integer.MAX_VALUE) {
            throw new OutOfMemoryError("File " + file.getPath() + " is too big (" + file.length() + " bytes) to fit in memory.");
        }

        int offset = 0;
        int remaining = (int) file.length();
        byte[] result = new byte[remaining];

        InputStream input = inputStream(file);
        try {
            while (remaining > 0) {
                int read = input.read(result, offset, remaining);
                if (read < 0) {
                    break;
                }
                remaining -= read;
                offset += read;
            }
        } finally {
            Streamx.closeQuietly(input);
        }
        return remaining == 0 ? result : Arrays.copyOf(result, offset);
    }

    /**
     * Gets the entire content of this file as a String using UTF-8 or specified [charset].
     * <p>
     * This method is not recommended on huge files. It has an internal limitation of 2 GB file size.
     *
     * @param charset character set to use.
     * @return the entire content of this file as a String.
     */
    @NotNull
    public static String readText(@NotNull File file, @NotNull Charset charset) throws IOException {
        return new String(readBytes(file), charset);
    }

    /**
     * Gets the entire content of this file as a String using UTF-8 or specified [charset].
     * <p>
     * This method is not recommended on huge files. It has an internal limitation of 2 GB file size.
     *
     * @return the entire content of this file as a String.
     */
    @NotNull
    public static String readText(@NotNull File file) throws IOException {
        return readText(file, Charx.UTF_8);
    }

    /**
     * Reads the file content as a list of lines.
     * <p>
     * Do not use this function for huge files.
     *
     * @param charset character set to use.
     * @return list of file lines.
     */
    @NotNull
    public static List<String> readLines(@NotNull File file, @NotNull Charset charset) throws IOException {
        final ArrayList<String> result = new ArrayList<>();
        forEachLine(file, charset, new Action<String>() {
            @Override
            public void action(@NotNull String s) {
                result.add(s);
            }
        });
        return result;
    }

    /**
     * Reads the file content as a list of lines.
     * <p>
     * Do not use this function for huge files.
     *
     * @return list of file lines.
     */
    @NotNull
    public static List<String> readLines(@NotNull File file) throws IOException {
        return readLines(file, Charx.UTF_8);
    }


    /* ******************************************* traversing ****************************************** */


    /**
     * Calls the [block] callback giving it a sequence of all the lines in this file and closes the reader once
     * the processing is complete.
     *
     * @param charset character set to use
     * @return the value returned by [block].
     */
    @NotNull
    public static <T> T useLines(@NotNull File file, @NotNull Charset charset, @NotNull Transformer<Sequence<String>, T> block) throws FileNotFoundException {
        BufferedReader bufferedReader = bufferedReader(file, charset);
        T result;
        try {
            result = block.transform(Streamx.lineSequence(bufferedReader));
        } finally {
            Streamx.closeQuietly(bufferedReader);
        }
        return result;
    }

    /**
     * Calls the [block] callback giving it a sequence of all the lines in this file and closes the reader once
     * the processing is complete.
     *
     * @return the value returned by [block].
     */
    @NotNull
    public static <T> T useLines(@NotNull File file, @NotNull Transformer<Sequence<String>, T> block) throws FileNotFoundException {
        return useLines(file, Charx.UTF_8, block);
    }

    /**
     * Reads file by byte blocks and calls [action] for each block read.
     * This functions passes the byte array and amount of bytes in the array to the [action] function.
     * <p>
     * You can use this function for huge files.
     *
     * @param action    function to process file blocks.
     * @param blockSize size of a block, replaced by 512 if it's less, 4096 by default.
     */
    public static void forEachBlock(@NotNull File file, int blockSize, @NotNull Action2<byte[], Integer> action) throws IOException {
        byte[] arr = new byte[Rangex.coerceAtLeast(blockSize, Streamx.MINIMUM_BLOCK_SIZE)];

        InputStream input = inputStream(file);
        try {
            do {
                int size = input.read(arr);
                if (size <= 0) {
                    break;
                } else {
                    action.action(arr, size);
                }
            } while (true);
        } finally {
            Streamx.closeQuietly(input);
        }
    }

    /**
     * Reads file by byte blocks and calls [action] for each block read.
     * Block has default size which is implementation-dependent.
     * This functions passes the byte array and amount of bytes in the array to the [action] function.
     * <p>
     * You can use this function for huge files.
     *
     * @param action function to process file blocks.
     */
    public static void forEachBlock(@NotNull File file, @NotNull Action2<byte[], Integer> action) throws IOException {
        forEachBlock(file, Streamx.DEFAULT_BLOCK_SIZE, action);
    }

    /**
     * Reads this file line by line using the specified [charset] and calls [action] for each line.
     * Default charset is UTF-8.
     * <p>
     * You may use this function on huge files.
     *
     * @param charset character set to use.
     * @param action  function to process file lines.
     */
    public static void forEachLine(@NotNull File file, @NotNull Charset charset, @NotNull Action<String> action) throws IOException {
        // Note: close is called at forEachLine
        Streamx.forEachLine(new BufferedReader(new InputStreamReader(new FileInputStream(file), charset)), action);
    }

    /**
     * Reads this file line by line using the specified [charset] and calls [action] for each line.
     * Default charset is UTF-8.
     * <p>
     * You may use this function on huge files.
     *
     * @param action function to process file lines.
     */
    public static void forEachLine(@NotNull File file, @NotNull Action<String> action) throws IOException {
        // Note: close is called at forEachLine
        forEachLine(file, Charx.UTF_8, action);
    }


    /* ******************************************* outputStream ****************************************** */


    /**
     * Constructs a new FileOutputStream of this file and returns it as a result.
     */
    @NotNull
    public static FileOutputStream outputStream(@NotNull File file) throws FileNotFoundException {
        return new FileOutputStream(file);
    }

    /**
     * Returns a new [BufferedOutputStream] for writing the content of this file.
     *
     * @param bufferSize necessary size of the buffer.
     */
    @NotNull
    public static BufferedOutputStream bufferedOutputStream(@NotNull File file, int bufferSize) throws FileNotFoundException {
        return Streamx.buffered(outputStream(file), bufferSize);
    }

    /**
     * Returns a new [BufferedOutputStream] for writing the content of this file.
     */
    @NotNull
    public static BufferedOutputStream bufferedOutputStream(@NotNull File file) throws FileNotFoundException {
        return Streamx.buffered(outputStream(file));
    }

    /**
     * Returns a new [FileWriter] for writing the content of this file.
     */
    @NotNull
    public static OutputStreamWriter writer(@NotNull File file, @NotNull Charset charset) throws FileNotFoundException {
        return Streamx.writer(outputStream(file), charset);
    }

    /**
     * Returns a new [FileWriter] for writing the content of this file.
     */
    @NotNull
    public static OutputStreamWriter writer(@NotNull File file) throws FileNotFoundException {
        return Streamx.writer(outputStream(file));
    }

    /**
     * Returns a new [BufferedWriter] for writing the content of this file.
     *
     * @param bufferSize necessary size of the buffer.
     */
    @NotNull
    public static BufferedWriter bufferedWriter(@NotNull File file, @NotNull Charset charset, int bufferSize) throws FileNotFoundException {
        return Streamx.bufferedWriter(outputStream(file), charset, bufferSize);
    }

    /**
     * Returns a new [BufferedWriter] for writing the content of this file.
     *
     * @param bufferSize necessary size of the buffer.
     */
    @NotNull
    public static BufferedWriter bufferedWriter(@NotNull File file, int bufferSize) throws FileNotFoundException {
        return Streamx.bufferedWriter(outputStream(file), bufferSize);
    }

    /**
     * Returns a new [BufferedWriter] for writing the content of this file.
     */
    @NotNull
    public static BufferedWriter bufferedWriter(@NotNull File file, @NotNull Charset charset) throws FileNotFoundException {
        return Streamx.bufferedWriter(outputStream(file), charset);
    }

    /**
     * Returns a new [BufferedWriter] for writing the content of this file.
     */
    @NotNull
    public static BufferedWriter bufferedWriter(@NotNull File file) throws FileNotFoundException {
        return Streamx.bufferedWriter(outputStream(file));
    }

    /**
     * Returns a new [PrintWriter] for writing the content of this file.
     */
    @NotNull
    public static PrintWriter printWriter(@NotNull File file, @NotNull Charset charset) throws FileNotFoundException {
        return new PrintWriter(bufferedWriter(file, charset));
    }

    /**
     * Returns a new [PrintWriter] for writing the content of this file.
     */
    @NotNull
    public static PrintWriter printWriter(@NotNull File file) throws FileNotFoundException {
        return printWriter(file, Charx.UTF_8);
    }


    /* ******************************************* write ****************************************** */


    /**
     * Sets the content of this file as an [array] of bytes.
     * If this file already exists, it becomes overwritten.
     *
     * @param array byte array to write into this file.
     */
    public static void writeBytes(@NotNull File file, @NotNull byte[] array) throws IOException {
        FileOutputStream outputStream = new FileOutputStream(file);
        try {
            outputStream.write(array);
        } finally {
            Streamx.closeQuietly(outputStream);
        }
    }

    /**
     * Appends an [array] of bytes to the content of this file.
     *
     * @param array byte array to append to this file.
     */
    public static void appendBytes(@NotNull File file, @NotNull byte[] array) throws IOException {
        FileOutputStream outputStream = new FileOutputStream(file, true);
        try {
            outputStream.write(array);
        } finally {
            Streamx.closeQuietly(outputStream);
        }
    }

    /**
     * Sets the content of this file as [text] encoded using UTF-8 or specified [charset].
     * If this file exists, it becomes overwritten.
     *
     * @param text    text to write into file.
     * @param charset character set to use.
     */
    public static void writeText(@NotNull File file, @NotNull String text, @NotNull Charset charset) throws IOException {
        writeBytes(file, Stringx.toByteArray(text, charset));
    }

    /**
     * Sets the content of this file as [text] encoded using UTF-8 or specified [charset].
     * If this file exists, it becomes overwritten.
     *
     * @param text text to write into file.
     */
    public static void writeText(@NotNull File file, @NotNull String text) throws IOException {
        writeText(file, text, Charx.UTF_8);
    }

    /**
     * Appends [text] to the content of this file using UTF-8 or the specified [charset].
     *
     * @param text    text to append to file.
     * @param charset character set to use.
     */
    public static void appendText(@NotNull File file, @NotNull String text, @NotNull Charset charset) throws IOException {
        appendBytes(file, Stringx.toByteArray(text, charset));
    }

    /**
     * Appends [text] to the content of this file using UTF-8 or the specified [charset].
     *
     * @param text text to append to file.
     */
    public static void appendText(@NotNull File file, @NotNull String text) throws IOException {
        appendText(file, text, Charx.UTF_8);
    }


    /* ******************************************* walk ****************************************** */


    /**
     * Gets a sequence for visiting this directory and all its content.
     *
     * @param direction walk direction, top-down (by default) or bottom-up.
     */
    @NotNull
    public static FileTreeWalk walk(@NotNull File file, @NotNull FileWalkDirection direction) {
        return new FileTreeWalk(file, direction);
    }

    /**
     * Gets a sequence for visiting this directory and all its content.
     */
    @NotNull
    public static FileTreeWalk walk(@NotNull File file) {
        return walk(file, FileWalkDirection.TOP_DOWN);
    }

    /**
     * Gets a sequence for visiting this directory and all its content in top-down order.
     * Depth-first search is used and directories are visited before all their files.
     */
    @NotNull
    public static FileTreeWalk walkTopDown(@NotNull File file) {
        return walk(file, FileWalkDirection.TOP_DOWN);
    }

    /**
     * Gets a sequence for visiting this directory and all its content in bottom-up order.
     * Depth-first search is used and directories are visited after all their files.
     */
    @NotNull
    public static FileTreeWalk walkBottomUp(@NotNull File file) {
        return walk(file, FileWalkDirection.BOTTOM_UP);
    }

    public static class FilePredicate implements Predicate<File> {

        @Override
        public boolean accept(@NotNull File file) {
            return file.isFile();
        }
    }

    @SuppressWarnings("unused")
    public static class DirectoryPredicate implements Predicate<File> {

        @Override
        public boolean accept(@NotNull File file) {
            return file.isDirectory();
        }
    }

    @SuppressWarnings("unused")
    public static class FileComparator implements Comparator<File> {

        @Override
        public int compare(File o1, File o2) {
            return compareFilePath(o1, o2);
        }
    }

    public static class FilePathComparator implements Comparator<String> {

        @Override
        public int compare(String o1, String o2) {
            return compareFilePath(o1, o2);
        }
    }
}