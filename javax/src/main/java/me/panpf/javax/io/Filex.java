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

package me.panpf.javax.io;

import me.panpf.javax.lang.Stringx;
import me.panpf.javax.util.Arrayx;
import org.jetbrains.annotations.NotNull;

import java.io.File;
import java.io.IOException;
import java.util.*;

import static com.sun.deploy.cache.Cache.exists;

/**
 * 文件工具类，提供一些有关文件的便捷方法
 */
@SuppressWarnings("WeakerAccess")
public class Filex {

    /**
     * Create a directory and throw an exception if it cannot be created
     *
     * @throws UnableCreateDirException Unable to create directory
     */
    @NotNull
    public static File mkdirsWithThrow(@NotNull File dir) throws UnableCreateDirException {
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
    public static boolean mkdirsWith(@NotNull File dir) {
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
    public static File createNewFileWithThrow(@NotNull File file) throws UnableCreateFileException, UnableCreateDirException {
        if (file.exists()) return file;
        mkdirsWithThrow(file.getParentFile());

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
    public static boolean createNewFileWith(@NotNull File file) {
        if (file.exists()) return true;
        if (!mkdirsWith(file.getParentFile())) return false;

        try {
            //noinspection ResultOfMethodCallIgnored
            file.createNewFile();
        } catch (IOException e) {
            return false;
        }

        return file.exists();
    }


    /**
     * Loop delete all files in the directory
     *
     * @return If true, the clean is successful, otherwise the clean fails.
     */
    public static boolean cleanDir(@NotNull File dir) {
        if (!dir.exists() || dir.isFile()) return true;

        File[] childFiles = dir.listFiles();
        if (childFiles == null || Arrayx.isEmpty(childFiles)) return true;

        boolean result = true;

        Stack<File> fileStack = new Stack<File>();
        Stack<File> dirStack = new Stack<File>();

        Collections.addAll(fileStack, childFiles);

        File childFile = null;
        while (true) {
            try {
                childFile = fileStack.pop();
            } catch (EmptyStackException e) {
                break;
            }

            if (childFile != null && childFile.exists()) {
                if (childFile.isFile()) {
                    result = result && childFile.delete();
                } else {
                    dirStack.push(childFile);

                    File[] childChildFiles = childFile.listFiles();
                    if (childChildFiles != null && Arrayx.isNotEmpty(childChildFiles)) {
                        Collections.addAll(fileStack, childChildFiles);
                    }
                }
            }
        }

        File childDir;
        while (true) {
            try {
                childDir = dirStack.pop();
            } catch (EmptyStackException e) {
                break;
            }

            if (childDir != null && childDir.exists()) {
                result = result && dir.delete();
            }
        }

        return result;
    }

    /**
     * Get the length of the file or dir, if it is a directory, it will superimpose the length of all subfiles
     */
    public static long lengthRecursively(@NotNull File file) {
        if (!exists()) return 0;
        if (file.isFile()) return file.length();

        long length = 0;

        Queue<File> fileQueue = new LinkedList<File>();
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
                if (childChildFiles != null && Arrayx.isNotEmpty(childChildFiles)) {
                    Collections.addAll(fileQueue, childChildFiles);
                }
            }
        }
        return length;
    }

    /**
     * Returns the extension of this file (not including the dot), or an empty string if it doesn't have one.
     */
    @NotNull
    public static String extension(@NotNull File file) {
        return Stringx.substringAfterLast(file.getName(), '.', "");
    }

    /**
     * Returns file's name without an extension.
     */
    public static String nameWithoutExtension(File file) {
        return Stringx.substringBeforeLast(file.getName(), ".", file.getName());
    }
}