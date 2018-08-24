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

import me.panpf.javax.lang.Charx;
import me.panpf.javax.lang.Intx;
import me.panpf.javax.lang.Stringx;
import me.panpf.javax.util.*;
import org.jetbrains.annotations.NotNull;

import java.io.*;
import java.nio.charset.Charset;
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

        File childFile;
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


    /**
     * Constructs a new FileInputStream of this file and returns it as a result.
     */
    public static FileInputStream inputStream(@NotNull File file) throws FileNotFoundException {
        return new FileInputStream(file);
    }

    /**
     * Returns a new [FileReader] for reading the content of this file.
     */
    public static InputStreamReader reader(@NotNull File file, Charset charset) throws FileNotFoundException {
        return IOStreamx.reader(inputStream(file), charset);
    }

    /**
     * Returns a new [FileReader] for reading the content of this file.
     */
    public static InputStreamReader reader(@NotNull File file) throws FileNotFoundException {
        return reader(file, Charx.UTF_8);
    }

    /**
     * Returns a new [BufferedReader] for reading the content of this file.
     *
     * @param bufferSize necessary size of the buffer.
     */
    public static BufferedReader bufferedReader(@NotNull File file, Charset charset, int bufferSize) throws FileNotFoundException {
        return IOStreamx.buffered(reader(file, charset), bufferSize);
    }

    /**
     * Returns a new [BufferedReader] for reading the content of this file.
     *
     * @param bufferSize necessary size of the buffer.
     */
    public static BufferedReader bufferedReader(@NotNull File file, int bufferSize) throws FileNotFoundException {
        return bufferedReader(file, Charx.UTF_8, bufferSize);
    }

    /**
     * Returns a new [BufferedReader] for reading the content of this file.
     */
    public static BufferedReader bufferedReader(@NotNull File file, Charset charset) throws FileNotFoundException {
        return bufferedReader(file, charset, IOStreamx.DEFAULT_BUFFER_SIZE);
    }

    /**
     * Returns a new [BufferedReader] for reading the content of this file.
     */
    public static BufferedReader bufferedReader(@NotNull File file) throws FileNotFoundException {
        return bufferedReader(file, Charx.UTF_8, IOStreamx.DEFAULT_BUFFER_SIZE);
    }


    /**
     * Gets the entire content of this file as a byte array.
     * <p>
     * This method is not recommended on huge files. It has an internal limitation of 2 GB byte array size.
     *
     * @return the entire content of this file as a byte array.
     */
    public static byte[] readBytes(@NotNull File file) throws IOException {
        if (file.length() > Integer.MAX_VALUE) {
            throw new OutOfMemoryError("File $this is too big ($length bytes) to fit in memory.");
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
            IOStreamx.safeClose(input);
        }
        return remaining == 0 ? result : Arrayx.copyOf(result, offset);
    }

    /**
     * Gets the entire content of this file as a String using UTF-8 or specified [charset].
     * <p>
     * This method is not recommended on huge files. It has an internal limitation of 2 GB file size.
     *
     * @param charset character set to use.
     * @return the entire content of this file as a String.
     */
    public static String readText(@NotNull File file, Charset charset) throws IOException {
        return Arrayx.toString(readBytes(file), charset);
    }

    /**
     * Gets the entire content of this file as a String using UTF-8 or specified [charset].
     * <p>
     * This method is not recommended on huge files. It has an internal limitation of 2 GB file size.
     *
     * @return the entire content of this file as a String.
     */
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
    public static List<String> readLines(@NotNull File file, Charset charset) throws IOException {
        final ArrayList<String> result = new ArrayList<String>();
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
    public static List<String> readLines(@NotNull File file) throws IOException {
        return readLines(file, Charx.UTF_8);
    }

    /**
     * Calls the [block] callback giving it a sequence of all the lines in this file and closes the reader once
     * the processing is complete.
     *
     * @param charset character set to use
     * @return the value returned by [block].
     */
    public static <T> T useLines(@NotNull File file, Charset charset, Transformer<Sequence<String>, T> block) throws FileNotFoundException {
        BufferedReader bufferedReader = bufferedReader(file, charset);
        T result;
        try {
            result = block.transform(IOStreamx.lineSequence(bufferedReader));
        } finally {
            IOStreamx.safeClose(bufferedReader);
        }
        return result;
    }

    /**
     * Calls the [block] callback giving it a sequence of all the lines in this file and closes the reader once
     * the processing is complete.
     *
     * @return the value returned by [block].
     */
    public static <T> T useLines(@NotNull File file, Transformer<Sequence<String>, T> block) throws FileNotFoundException {
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
    public static void forEachBlock(@NotNull File file, int blockSize, Action2<byte[], Integer> action) throws IOException {
        byte[] arr = new byte[Intx.coerceAtLeast(blockSize, IOStreamx.MINIMUM_BLOCK_SIZE)];

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
            IOStreamx.safeClose(input);
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
    public static void forEachBlock(@NotNull File file, Action2<byte[], Integer> action) throws IOException {
        forEachBlock(file, IOStreamx.DEFAULT_BLOCK_SIZE, action);
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
    public static void forEachLine(@NotNull File file, Charset charset, Action<String> action) throws IOException {
        // Note: close is called at forEachLine
        IOStreamx.forEachLine(new BufferedReader(new InputStreamReader(new FileInputStream(file), charset)), action);
    }

    /**
     * Reads this file line by line using the specified [charset] and calls [action] for each line.
     * Default charset is UTF-8.
     * <p>
     * You may use this function on huge files.
     *
     * @param action function to process file lines.
     */
    public static void forEachLine(@NotNull File file, Action<String> action) throws IOException {
        // Note: close is called at forEachLine
        forEachLine(file, Charx.UTF_8, action);
    }


    /**
     * Constructs a new FileOutputStream of this file and returns it as a result.
     */
    public static FileOutputStream outputStream(@NotNull File file) throws FileNotFoundException {
        return new FileOutputStream(file);
    }

    /**
     * Returns a new [FileWriter] for writing the content of this file.
     */
    public static OutputStreamWriter writer(@NotNull File file, Charset charset) throws FileNotFoundException {
        return IOStreamx.writer(outputStream(file), charset);
    }

    /**
     * Returns a new [FileWriter] for writing the content of this file.
     */
    public static OutputStreamWriter writer(@NotNull File file) throws FileNotFoundException {
        return writer(file, Charx.UTF_8);
    }

    /**
     * Returns a new [BufferedWriter] for writing the content of this file.
     *
     * @param bufferSize necessary size of the buffer.
     */
    public static BufferedWriter bufferedWriter(@NotNull File file, Charset charset, int bufferSize) throws FileNotFoundException {
        return IOStreamx.buffered(writer(file, charset), bufferSize);
    }

    /**
     * Returns a new [BufferedWriter] for writing the content of this file.
     *
     * @param bufferSize necessary size of the buffer.
     */
    public static BufferedWriter bufferedWriter(@NotNull File file, int bufferSize) throws FileNotFoundException {
        return IOStreamx.buffered(writer(file, Charx.UTF_8), bufferSize);
    }

    /**
     * Returns a new [BufferedWriter] for writing the content of this file.
     */
    public static BufferedWriter bufferedWriter(@NotNull File file, Charset charset) throws FileNotFoundException {
        return IOStreamx.buffered(writer(file, charset), IOStreamx.DEFAULT_BUFFER_SIZE);
    }

    /**
     * Returns a new [BufferedWriter] for writing the content of this file.
     */
    public static BufferedWriter bufferedWriter(@NotNull File file) throws FileNotFoundException {
        return bufferedWriter(file, Charx.UTF_8, IOStreamx.DEFAULT_BUFFER_SIZE);
    }

    /**
     * Returns a new [PrintWriter] for writing the content of this file.
     */
    public static PrintWriter printWriter(@NotNull File file, Charset charset) throws FileNotFoundException {
        return new PrintWriter(bufferedWriter(file, charset));
    }

    /**
     * Returns a new [PrintWriter] for writing the content of this file.
     */
    public static PrintWriter printWriter(@NotNull File file) throws FileNotFoundException {
        return printWriter(file, Charx.UTF_8);
    }

    /**
     * Sets the content of this file as an [array] of bytes.
     * If this file already exists, it becomes overwritten.
     *
     * @param array byte array to write into this file.
     */
    public static void writeBytes(@NotNull File file, byte[] array) throws IOException {
        FileOutputStream outputStream = new FileOutputStream(file);
        try {
            outputStream.write(array);
        } finally {
            IOStreamx.safeClose(outputStream);
        }
    }

    /**
     * Appends an [array] of bytes to the content of this file.
     *
     * @param array byte array to append to this file.
     */
    public static void appendBytes(@NotNull File file, byte[] array) throws IOException {
        FileOutputStream outputStream = new FileOutputStream(file, true);
        try {
            outputStream.write(array);
        } finally {
            IOStreamx.safeClose(outputStream);
        }
    }

    /**
     * Sets the content of this file as [text] encoded using UTF-8 or specified [charset].
     * If this file exists, it becomes overwritten.
     *
     * @param text    text to write into file.
     * @param charset character set to use.
     */
    public static void writeText(@NotNull File file, String text, Charset charset) throws IOException {
        writeBytes(file, Stringx.toByteArray(text, charset));
    }

    /**
     * Sets the content of this file as [text] encoded using UTF-8 or specified [charset].
     * If this file exists, it becomes overwritten.
     *
     * @param text text to write into file.
     */
    public static void writeText(@NotNull File file, String text) throws IOException {
        writeText(file, text, Charx.UTF_8);
    }

    /**
     * Appends [text] to the content of this file using UTF-8 or the specified [charset].
     *
     * @param text    text to append to file.
     * @param charset character set to use.
     */
    public static void appendText(@NotNull File file, String text, Charset charset) throws IOException {
        appendBytes(file, Stringx.toByteArray(text, charset));
    }

    /**
     * Appends [text] to the content of this file using UTF-8 or the specified [charset].
     *
     * @param text    text to append to file.
     */
    public static void appendText(@NotNull File file, String text) throws IOException {
        appendText(file, text, Charx.UTF_8);
    }
}