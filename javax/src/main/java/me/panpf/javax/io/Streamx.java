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

import me.panpf.javax.collections.Sequence;
import me.panpf.javax.collections.Sequencex;
import me.panpf.javax.lang.Charx;
import me.panpf.javax.lang.Stringx;
import me.panpf.javax.util.Action;
import me.panpf.javax.util.Transformer;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import java.io.*;
import java.net.URL;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;

/**
 * I/O tools
 */
@SuppressWarnings({"WeakerAccess", "UnusedReturnValue"})
public class Streamx {

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

    private Streamx() {
    }

    /**
     * Quietly close
     */
    public static void closeQuietly(@Nullable Closeable closeable) {
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
     * Reads this stream completely into a byte array and Automatically close stream.
     */
    @NotNull
    public static byte[] readBytesClose(@NotNull InputStream inputStream, int estimatedSize) throws IOException {
        try {
            return readBytes(inputStream, estimatedSize);
        } finally {
            inputStream.close();
        }
    }

    /**
     * Reads this stream completely into a byte array and Automatically close stream.
     */
    @NotNull
    public static byte[] readBytesCloseQuietly(@NotNull InputStream inputStream, int estimatedSize) throws IOException {
        try {
            return readBytes(inputStream, estimatedSize);
        } finally {
            closeQuietly(inputStream);
        }
    }

    /**
     * Reads this stream completely into a byte array and Automatically close stream.
     */
    @NotNull
    public static byte[] readBytesClose(@NotNull InputStream inputStream) throws IOException {
        try {
            return readBytes(inputStream);
        } finally {
            inputStream.close();
        }
    }

    /**
     * Reads this stream completely into a byte array and Automatically close stream.
     */
    @NotNull
    public static byte[] readBytesCloseQuietly(@NotNull InputStream inputStream) throws IOException {
        try {
            return readBytes(inputStream);
        } finally {
            closeQuietly(inputStream);
        }
    }


    /**
     * Reads this reader completely as a String and Automatically close stream.
     *
     * @return the string with corresponding file content.
     */
    @NotNull
    public static String readTextClose(@NotNull Reader reader) throws IOException {
        try {
            return readText(reader);
        } finally {
            reader.close();
        }
    }

    /**
     * Reads this reader completely as a String and Automatically close stream.
     *
     * @return the string with corresponding file content.
     */
    @NotNull
    public static String readTextCloseQuietly(@NotNull Reader reader) throws IOException {
        try {
            return readText(reader);
        } finally {
            closeQuietly(reader);
        }
    }


    /**
     * Copies this stream to the given output stream, returning the number of bytes copied
     * <p>
     * **Note** It is the caller's responsibility to close both of these resources.
     */
    public static long copyTo(@NotNull InputStream inputStream, @NotNull OutputStream out, int bufferSize, @Nullable CopyListener listener) throws IOException {
        long bytesCopied = 0;
        byte[] buffer = new byte[bufferSize];
        int bytes = inputStream.read(buffer);
        while (bytes >= 0) {
            out.write(buffer, 0, bytes);
            bytesCopied += bytes;
            if (listener != null) listener.onUpdateProgress(bytesCopied);
            bytes = inputStream.read(buffer);
        }
        return bytesCopied;
    }

    /**
     * Copies this stream to the given output stream, returning the number of bytes copied
     * <p>
     * **Note** It is the caller's responsibility to close both of these resources.
     */
    @SuppressWarnings("UnusedReturnValue")
    public static long copyTo(@NotNull InputStream inputStream, @NotNull OutputStream out, @Nullable CopyListener listener) throws IOException {
        return copyTo(inputStream, out, DEFAULT_BUFFER_SIZE, listener);
    }

    /**
     * Copies this reader to the given [out] writer, returning the number of characters copied.
     * **Note** it is the caller's responsibility to close both of these resources.
     *
     * @param out        writer to write to.
     * @param bufferSize size of character buffer to use in process.
     * @return number of characters copied.
     */
    public static long copyTo(@NotNull Reader reader, @NotNull Writer out, int bufferSize, @Nullable CopyListener listener) throws IOException {
        long charsCopied = 0;
        char[] buffer = new char[bufferSize];
        int chars = reader.read(buffer);
        while (chars >= 0) {
            out.write(buffer, 0, chars);
            charsCopied += chars;
            if (listener != null) listener.onUpdateProgress(charsCopied);
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
    @SuppressWarnings("UnusedReturnValue")
    public static long copyTo(@NotNull Reader reader, @NotNull Writer out, @Nullable CopyListener listener) throws IOException {
        return copyTo(reader, out, DEFAULT_BUFFER_SIZE, listener);
    }


    /*
     * *****************************************************************************************************************
     * From kotlin standard library
     * *****************************************************************************************************************
     */


    /* ******************************************* inputStream ****************************************** */


    /**
     * Creates an input stream for reading data from this byte array.
     */
    @NotNull
    public static ByteArrayInputStream inputStream(@NotNull byte[] bytes) {
        return new ByteArrayInputStream(bytes);
    }

    /**
     * Creates an input stream for reading data from the specified portion of this byte array.
     *
     * @param offset the start offset of the portion of the array to read.
     * @param length the length of the portion of the array to read.
     */
    @NotNull
    public static ByteArrayInputStream inputStream(@NotNull byte[] bytes, int offset, int length) {
        return new ByteArrayInputStream(bytes, offset, length);
    }


    /**
     * Creates a new byte input stream for the string.
     */
    @NotNull
    public static ByteArrayInputStream byteInputStream(@NotNull String string, @NotNull Charset charset) {
        return inputStream(Stringx.toByteArray(string, charset));
    }

    /**
     * Creates a new byte input stream for the string.
     */
    @NotNull
    public static ByteArrayInputStream byteInputStream(@NotNull String string) {
        return inputStream(Stringx.toByteArray(string));
    }


    /**
     * Creates a reader on this input stream using the specified [charset].
     */
    @NotNull
    public static InputStreamReader reader(@NotNull InputStream inputStream, @NotNull Charset charset) {
        return new InputStreamReader(inputStream, charset);
    }

    /**
     * Creates a reader on this input stream using UTF-8
     */
    @NotNull
    public static InputStreamReader reader(@NotNull InputStream inputStream) {
        return reader(inputStream, Charx.UTF_8);
    }

    /**
     * Creates a new reader for the string.
     */
    @NotNull
    public static StringReader reader(@NotNull String string) {
        return new StringReader(string);
    }


    /**
     * Creates a buffered input stream wrapping this stream.
     *
     * @param bufferSize the buffer size to use.
     */
    @NotNull
    public static BufferedInputStream buffered(@NotNull InputStream inputStream, int bufferSize) {
        return inputStream instanceof BufferedInputStream ? (BufferedInputStream) inputStream
                : new BufferedInputStream(inputStream, bufferSize);
    }

    /**
     * Creates a buffered input stream wrapping this stream.
     */
    @NotNull
    public static BufferedInputStream buffered(@NotNull InputStream inputStream) {
        return buffered(inputStream, DEFAULT_BUFFER_SIZE);
    }

    /**
     * Returns a buffered reader wrapping this Reader, or this Reader itself if it is already buffered.
     */
    @NotNull
    public static BufferedReader buffered(@NotNull Reader reader, int bufferSize) {
        return reader instanceof BufferedReader ? (BufferedReader) reader : new BufferedReader(reader, bufferSize);
    }

    /**
     * Returns a buffered reader wrapping this Reader, or this Reader itself if it is already buffered.
     */
    @NotNull
    public static BufferedReader buffered(@NotNull Reader reader) {
        return buffered(reader, DEFAULT_BUFFER_SIZE);
    }


    /**
     * Creates a buffered reader on this input stream using UTF-8 or the specified [charset].
     */
    @NotNull
    public static BufferedReader bufferedReader(@NotNull InputStream inputStream, @NotNull Charset charset, int bufferSize) {
        return buffered(reader(inputStream, charset), bufferSize);
    }

    /**
     * Creates a buffered reader on this input stream using UTF-8 or the specified [charset].
     */
    @NotNull
    public static BufferedReader bufferedReader(@NotNull InputStream inputStream, int bufferSize) {
        return buffered(reader(inputStream), bufferSize);
    }

    /**
     * Creates a buffered reader on this input stream using UTF-8 or the specified [charset].
     */
    @NotNull
    public static BufferedReader bufferedReader(@NotNull InputStream inputStream, @NotNull Charset charset) {
        return buffered(reader(inputStream, charset));
    }

    /**
     * Creates a buffered reader on this input stream using UTF-8 or the specified [charset].
     */
    @NotNull
    public static BufferedReader bufferedReader(@NotNull InputStream inputStream) {
        return bufferedReader(inputStream, Charx.UTF_8);
    }


    /* ******************************************* read ****************************************** */


    /**
     * Reads this stream completely into a byte array.
     * **Note**: It is the caller's responsibility to close this stream.
     */
    @NotNull
    public static byte[] readBytes(@NotNull InputStream inputStream, int estimatedSize) throws IOException {
        ByteArrayOutputStream buffer = new ByteArrayOutputStream(Math.max(estimatedSize, inputStream.available()));
        copyTo(inputStream, buffer);
        return buffer.toByteArray();
    }

    /**
     * Reads this stream completely into a byte array.
     * **Note**: It is the caller's responsibility to close this stream.
     */
    @NotNull
    public static byte[] readBytes(@NotNull InputStream inputStream) throws IOException {
        return readBytes(inputStream, DEFAULT_BUFFER_SIZE);
    }

    /**
     * Reads this reader completely as a String.
     * <p>
     * *Note*:  It is the caller's responsibility to close this reader.
     *
     * @return the string with corresponding file content.
     */
    @NotNull
    public static String readText(@NotNull Reader reader) throws IOException {
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
    @NotNull
    public static String readText(@NotNull URL url, @NotNull Charset charset) throws IOException {
        return new String(readBytes(url), charset);
    }

    /**
     * Reads the entire content of this URL as a String using UTF-8.
     * This method is not recommended on huge files.
     *
     * @return a string with this URL entire content.
     */
    @NotNull
    public static String readText(@NotNull URL url) throws IOException {
        return readText(url, Charx.UTF_8);
    }

    /**
     * Reads the entire content of the URL as byte array.
     * This method is not recommended on huge files.
     *
     * @return a byte array with this URL entire content.
     */
    @NotNull
    public static byte[] readBytes(@NotNull URL url) throws IOException {
        InputStream inputStream = url.openStream();
        try {
            return readBytes(inputStream);
        } finally {
            closeQuietly(inputStream);
        }
    }


    /**
     * Reads this reader content as a list of lines.
     * Do not use this function for huge files.
     */
    @NotNull
    public static List<String> readLines(@NotNull Reader reader) throws IOException {
        final List<String> result = new ArrayList<>();
        forEachLine(reader, new Action<String>() {
            @Override
            public void action(@NotNull String s) {
                result.add(s);
            }
        });
        return result;
    }


    /* ******************************************* traversing ****************************************** */


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
    @NotNull
    public static Sequence<String> lineSequence(@NotNull BufferedReader bufferedReader) {
        return Sequencex.constrainOnce(new LinesSequence(bufferedReader));
    }

    /**
     * Calls the [block] callback giving it a sequence of all the lines in this file and closes the reader once
     * the processing is complete.
     *
     * @return the value returned by [block].
     */
    @SuppressWarnings("UnusedReturnValue")
    @NotNull
    public static <T> T useLines(@NotNull Reader reader, @NotNull Transformer<Sequence<String>, T> block) {
        BufferedReader bufferedReader = buffered(reader);
        T t;
        try {
            t = block.transform(lineSequence(bufferedReader));
        } finally {
            Streamx.closeQuietly(bufferedReader);
        }
        return t;
    }


    /**
     * Iterates through each line of this reader, calls [action] for each line read
     * and closes the [Reader] when it's completed.
     *
     * @param action function to process file lines.
     */
    public static void forEachLine(@NotNull Reader reader, @NotNull final Action<String> action) throws IOException {
        try {
            useLines(reader, new Transformer<Sequence<String>, Object>() {
                @NotNull
                @Override
                public Object transform(@NotNull Sequence<String> stringSequence) {
                    Sequencex.forEach(stringSequence, action);
                    return new Object();
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


    /* ******************************************* outputStream ****************************************** */


    /**
     * Creates a writer on this output stream using UTF-8 or the specified [charset].
     */
    @NotNull
    public static OutputStreamWriter writer(@NotNull OutputStream outputStream, @NotNull Charset charset) {
        return new OutputStreamWriter(outputStream, charset);
    }

    /**
     * Creates a writer on this output stream using UTF-8 or the specified [charset].
     */
    @NotNull
    public static OutputStreamWriter writer(@NotNull OutputStream outputStream) {
        return writer(outputStream, Charx.UTF_8);
    }


    /**
     * Creates a buffered output stream wrapping this stream.
     *
     * @param bufferSize the buffer size to use.
     */
    @NotNull
    public static BufferedOutputStream buffered(@NotNull OutputStream outputStream, int bufferSize) {
        return outputStream instanceof BufferedOutputStream ? (BufferedOutputStream) outputStream
                : new BufferedOutputStream(outputStream, bufferSize);
    }

    /**
     * Creates a buffered output stream wrapping this stream.
     */
    @NotNull
    public static BufferedOutputStream buffered(@NotNull OutputStream outputStream) {
        return buffered(outputStream, DEFAULT_BUFFER_SIZE);
    }

    /**
     * Returns a buffered reader wrapping this Writer, or this Writer itself if it is already buffered.
     */
    @NotNull
    public static BufferedWriter buffered(@NotNull Writer writer, int bufferSize) {
        return writer instanceof BufferedWriter ? (BufferedWriter) writer : new BufferedWriter(writer, bufferSize);
    }

    /**
     * Returns a buffered reader wrapping this Writer, or this Writer itself if it is already buffered.
     */
    @NotNull
    public static BufferedWriter buffered(@NotNull Writer writer) {
        return buffered(writer, DEFAULT_BUFFER_SIZE);
    }


    /**
     * Creates a buffered writer on this output stream using UTF-8 or the specified [charset].
     */
    @NotNull
    public static BufferedWriter bufferedWriter(@NotNull OutputStream outputStream, @NotNull Charset charset, int bufferSize) {
        return buffered(writer(outputStream, charset), bufferSize);
    }

    /**
     * Creates a buffered writer on this output stream using UTF-8 or the specified [charset].
     */
    @NotNull
    public static BufferedWriter bufferedWriter(@NotNull OutputStream outputStream, @NotNull Charset charset) {
        return buffered(writer(outputStream, charset));
    }

    /**
     * Creates a buffered writer on this output stream using UTF-8 or the specified [charset].
     */
    @NotNull
    public static BufferedWriter bufferedWriter(@NotNull OutputStream outputStream, int bufferSize) {
        return buffered(writer(outputStream), bufferSize);
    }

    /**
     * Creates a buffered writer on this output stream using UTF-8 or the specified [charset].
     */
    @NotNull
    public static BufferedWriter bufferedWriter(@NotNull OutputStream outputStream) {
        return buffered(writer(outputStream));
    }


    /* ******************************************* copyTo ****************************************** */


    /**
     * Copies this stream to the given output stream, returning the number of bytes copied
     * <p>
     * **Note** It is the caller's responsibility to close both of these resources.
     */
    public static long copyTo(@NotNull InputStream inputStream, @NotNull OutputStream out, int bufferSize) throws IOException {
        return copyTo(inputStream, out, bufferSize, null);
    }

    /**
     * Copies this stream to the given output stream, returning the number of bytes copied
     * <p>
     * **Note** It is the caller's responsibility to close both of these resources.
     */
    @SuppressWarnings("UnusedReturnValue")
    public static long copyTo(@NotNull InputStream inputStream, @NotNull OutputStream out) throws IOException {
        return copyTo(inputStream, out, DEFAULT_BUFFER_SIZE, null);
    }

    /**
     * Copies this reader to the given [out] writer, returning the number of characters copied.
     * **Note** it is the caller's responsibility to close both of these resources.
     *
     * @param out        writer to write to.
     * @param bufferSize size of character buffer to use in process.
     * @return number of characters copied.
     */
    public static long copyTo(@NotNull Reader reader, @NotNull Writer out, int bufferSize) throws IOException {
        return copyTo(reader, out, bufferSize, null);
    }

    /**
     * Copies this reader to the given [out] writer, returning the number of characters copied.
     * **Note** it is the caller's responsibility to close both of these resources.
     *
     * @param out writer to write to.
     * @return number of characters copied.
     */
    @SuppressWarnings("UnusedReturnValue")
    public static long copyTo(@NotNull Reader reader, @NotNull Writer out) throws IOException {
        return copyTo(reader, out, DEFAULT_BUFFER_SIZE, null);
    }


    private static class LinesSequence implements Sequence<String> {
        private BufferedReader reader;

        public LinesSequence(BufferedReader reader) {
            this.reader = reader;
        }

        @NotNull
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
}
