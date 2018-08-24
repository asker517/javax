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
import me.panpf.javax.lang.Stringx;
import me.panpf.javax.util.*;
import org.jetbrains.annotations.NotNull;

import java.io.*;
import java.net.URL;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;

/**
 * I / O tools
 */
@SuppressWarnings("WeakerAccess")
public class IOStreamx {

    /**
     * Returns the default buffer size when working with buffered streams.
     */
    public static final int DEFAULT_BUFFER_SIZE = 1024 * 8;

    /**
     * Returns the default block size for forEachBlock().
     */
    public static final int DEFAULT_BLOCK_SIZE = 4096;

    /**
     * Returns the minimum block size for forEachBlock().
     */
    public static final int MINIMUM_BLOCK_SIZE = 512;

    /**
     * Close
     */
    public static void safeClose(Closeable closeable) {
        if (closeable != null) {
            if (closeable instanceof OutputStream) {
                try {
                    ((OutputStream) closeable).flush();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }

            try {
                closeable.close();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    /**
     * Creates a new byte input stream for the string.
     */
    public static ByteArrayInputStream byteInputStream(String string, Charset charset) {
        return new ByteArrayInputStream(Stringx.toByteArray(string, charset));
    }

    /**
     * Creates a new byte input stream for the string.
     */
    public static ByteArrayInputStream byteInputStream(String string) {
        return new ByteArrayInputStream(Stringx.toByteArray(string));
    }

    /**
     * Creates an input stream for reading data from this byte array.
     */
    public static ByteArrayInputStream inputStream(byte[] bytes) {
        return new ByteArrayInputStream(bytes);
    }

    /**
     * Creates an input stream for reading data from the specified portion of this byte array.
     *
     * @param offset the start offset of the portion of the array to read.
     * @param length the length of the portion of the array to read.
     */
    public static ByteArrayInputStream inputStream(byte[] bytes, int offset, int length) {
        return new ByteArrayInputStream(bytes, offset, length);
    }


    /**
     * Creates a reader on this input stream using the specified [charset].
     */
    public static InputStreamReader reader(InputStream inputStream, Charset charset) {
        return new InputStreamReader(inputStream, charset);
    }

    /**
     * Creates a reader on this input stream using UTF-8
     */
    public static InputStreamReader reader(InputStream inputStream) {
        return reader(inputStream, Charx.UTF_8);
    }

    /**
     * Creates a new reader for the string.
     */
    public static StringReader reader(String string) {
        return new StringReader(string);
    }


    /**
     * Creates a writer on this output stream using UTF-8 or the specified [charset].
     */
    public static OutputStreamWriter writer(OutputStream outputStream, Charset charset) {
        return new OutputStreamWriter(outputStream, charset);
    }

    /**
     * Creates a writer on this output stream using UTF-8 or the specified [charset].
     */
    public static OutputStreamWriter writer(OutputStream outputStream) {
        return writer(outputStream, Charx.UTF_8);
    }


    /**
     * Creates a buffered input stream wrapping this stream.
     *
     * @param bufferSize the buffer size to use.
     */
    public static BufferedInputStream buffered(InputStream inputStream, int bufferSize) {
        return inputStream instanceof BufferedInputStream ? (BufferedInputStream) inputStream
                : new BufferedInputStream(inputStream, bufferSize);
    }

    /**
     * Creates a buffered input stream wrapping this stream.
     */
    public static BufferedInputStream buffered(InputStream inputStream) {
        return buffered(inputStream, DEFAULT_BUFFER_SIZE);
    }

    /**
     * Returns a buffered reader wrapping this Reader, or this Reader itself if it is already buffered.
     */
    public static BufferedReader buffered(Reader reader, int bufferSize) {
        return reader instanceof BufferedReader ? (BufferedReader) reader : new BufferedReader(reader, bufferSize);
    }

    /**
     * Returns a buffered reader wrapping this Reader, or this Reader itself if it is already buffered.
     */
    public static BufferedReader buffered(Reader reader) {
        return buffered(reader, DEFAULT_BUFFER_SIZE);
    }

    /**
     * Creates a buffered reader on this input stream using UTF-8 or the specified [charset].
     */
    public static BufferedReader bufferedReader(InputStream inputStream, Charset charset) {
        return buffered(reader(inputStream, charset));
    }

    /**
     * Creates a buffered reader on this input stream using UTF-8 or the specified [charset].
     */
    public static BufferedReader bufferedReader(InputStream inputStream) {
        return bufferedReader(inputStream, Charx.UTF_8);
    }

    /**
     * Creates a buffered output stream wrapping this stream.
     *
     * @param bufferSize the buffer size to use.
     */
    public static BufferedOutputStream buffered(OutputStream outputStream, int bufferSize) {
        return outputStream instanceof BufferedOutputStream ? (BufferedOutputStream) outputStream
                : new BufferedOutputStream(outputStream, bufferSize);
    }

    /**
     * Creates a buffered writer on this output stream using UTF-8 or the specified [charset].
     */
    public static BufferedWriter bufferedWriter(OutputStream outputStream, Charset charset) {
        return buffered(writer(outputStream, charset));
    }

    /**
     * Returns a buffered reader wrapping this Writer, or this Writer itself if it is already buffered.
     */
    public static BufferedWriter buffered(Writer writer, int bufferSize) {
        return writer instanceof BufferedWriter ? (BufferedWriter) writer : new BufferedWriter(writer, bufferSize);
    }

    /**
     * Returns a buffered reader wrapping this Writer, or this Writer itself if it is already buffered.
     */
    public static BufferedWriter buffered(Writer writer) {
        return buffered(writer, DEFAULT_BUFFER_SIZE);
    }


    /**
     * Reads this stream completely into a byte array.
     * **Note**: It is the caller's responsibility to close this stream.
     */
    public static byte[] readBytes(InputStream inputStream, int estimatedSize) throws IOException {
        ByteArrayOutputStream buffer = new ByteArrayOutputStream(Math.max(estimatedSize, inputStream.available()));
        copyTo(inputStream, buffer);
        return buffer.toByteArray();
    }

    /**
     * Reads this stream completely into a byte array.
     * **Note**: It is the caller's responsibility to close this stream.
     */
    public static byte[] readBytes(InputStream inputStream) throws IOException {
        return readBytes(inputStream, DEFAULT_BUFFER_SIZE);
    }

    /**
     * Reads this reader completely as a String.
     * <p>
     * *Note*:  It is the caller's responsibility to close this reader.
     *
     * @return the string with corresponding file content.
     */
    public static String readText(Reader reader) throws IOException {
        StringWriter buffer = new StringWriter();
        copyTo(reader, buffer);
        return buffer.toString();
    }


    /**
     * Reads the entire content of this URL as a String using the specified [charset].
     * This method is not recommended on huge files.
     *
     * @param charset a character set to use.
     * @return a string with this URL entire content.
     */
    public static String readText(URL url, Charset charset) throws IOException {
        return Arrayx.toString(readBytes(url), charset);
    }

    /**
     * Reads the entire content of this URL as a String using UTF-8.
     * This method is not recommended on huge files.
     *
     * @return a string with this URL entire content.
     */
    public static String readText(URL url) throws IOException {
        return readText(url, Charx.UTF_8);
    }

    /**
     * Reads the entire content of the URL as byte array.
     * This method is not recommended on huge files.
     *
     * @return a byte array with this URL entire content.
     */
    public static byte[] readBytes(URL url) throws IOException {
        return readBytes(url.openStream());
    }


    /**
     * Copies this stream to the given output stream, returning the number of bytes copied
     * <p>
     * **Note** It is the caller's responsibility to close both of these resources.
     */
    public static long copyTo(InputStream inputStream, OutputStream out, int bufferSize) throws IOException {
        long bytesCopied = 0;
        byte[] buffer = new byte[bufferSize];
        int bytes = inputStream.read(buffer);
        while (bytes >= 0) {
            out.write(buffer, 0, bytes);
            bytesCopied += bytes;
            bytes = inputStream.read(buffer);
        }
        return bytesCopied;
    }

    /**
     * Copies this stream to the given output stream, returning the number of bytes copied
     * <p>
     * **Note** It is the caller's responsibility to close both of these resources.
     */
    public static long copyTo(InputStream inputStream, OutputStream out) throws IOException {
        return copyTo(inputStream, out, DEFAULT_BUFFER_SIZE);
    }

    /**
     * Copies this reader to the given [out] writer, returning the number of characters copied.
     * **Note** it is the caller's responsibility to close both of these resources.
     *
     * @param out        writer to write to.
     * @param bufferSize size of character buffer to use in process.
     * @return number of characters copied.
     */
    public static long copyTo(Reader reader, Writer out, int bufferSize) throws IOException {
        long charsCopied = 0;
        char[] buffer = new char[bufferSize];
        int chars = reader.read(buffer);
        while (chars >= 0) {
            out.write(buffer, 0, chars);
            charsCopied += chars;
            chars = reader.read(buffer);
        }
        return charsCopied;
    }

    /**
     * Copies this reader to the given [out] writer, returning the number of characters copied.
     * **Note** it is the caller's responsibility to close both of these resources.
     *
     * @param out writer to write to.
     * @return number of characters copied.
     */
    public static long copyTo(Reader reader, Writer out) throws IOException {
        return copyTo(reader, out, DEFAULT_BUFFER_SIZE);
    }


    /**
     * Returns a sequence of corresponding file lines.
     * <p>
     * *Note*: the caller must close the underlying `BufferedReader`
     * when the iteration is finished; as the user may not complete the iteration loop (e.g. using a method like find() or any() on the iterator
     * may terminate the iteration early.
     * <p>
     * We suggest you try the method [useLines] instead which closes the stream when the processing is complete.
     *
     * @return a sequence of corresponding file lines. The sequence returned can be iterated only once.
     */
    public static Sequence<String> lineSequence(BufferedReader bufferedReader) {
        return Sequencex.constrainOnce(new LinesSequence(bufferedReader));
    }

    private static class LinesSequence implements Sequence<String> {
        private BufferedReader reader;

        public LinesSequence(BufferedReader reader) {
            this.reader = reader;
        }

        @Override
        public Iterator<String> iterator() {
            return new Iterator<String>() {

                private String nextValue = null;
                private boolean done = false;

                @Override
                public boolean hasNext() {
                    if (nextValue == null && !done) {
                        try {
                            nextValue = reader.readLine();
                        } catch (IOException e) {
                            e.printStackTrace();
                            throw new IllegalStateException("hasNextIOException", e);
                        }
                        if (nextValue == null) {
                            done = true;
                        }
                    }
                    return nextValue != null;
                }

                @Override
                public String next() {
                    if (!hasNext()) {
                        throw new NoSuchElementException();
                    }
                    String answer = nextValue;
                    nextValue = null;
                    return answer;
                }

                @Override
                public void remove() {

                }
            };
        }
    }

    /**
     * Calls the [block] callback giving it a sequence of all the lines in this file and closes the reader once
     * the processing is complete.
     *
     * @return the value returned by [block].
     */
    public static <T> T useLines(Reader reader, Transformer<Sequence<String>, T> block) {
        BufferedReader bufferedReader = buffered(reader);
        T t;
        try {
            t = block.transform(lineSequence(bufferedReader));
        } finally {
            IOStreamx.safeClose(bufferedReader);
        }
        return t;
    }


    /**
     * Iterates through each line of this reader, calls [action] for each line read
     * and closes the [Reader] when it's completed.
     *
     * @param action function to process file lines.
     */
    public static void forEachLine(Reader reader, final Action<String> action) throws IOException {
        try {
            useLines(reader, new Transformer<Sequence<String>, Object>() {
                @NotNull
                @Override
                public Object transform(@NotNull Sequence<String> stringSequence) {
                    Sequencex.forEach(stringSequence, action);
                    return null;
                }
            });
        } catch (Exception e) {
            if (e instanceof IllegalStateException) {
                if ("hasNextIOException".equals(e.getMessage()) && e.getCause() instanceof IOException) {
                    throw (IOException) e.getCause();
                } else {
                    throw new RuntimeException(e);
                }
            } else {
                throw new RuntimeException(e);
            }
        }
    }

    /**
     * Reads this reader content as a list of lines.
     * Do not use this function for huge files.
     */
    public static List<String> readLines(Reader reader) throws IOException {
        final List<String> result = new ArrayList<String>();
        forEachLine(reader, new Action<String>() {
            @Override
            public void action(@NotNull String s) {
                result.add(s);
            }
        });
        return result;
    }
}
