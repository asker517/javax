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

package me.panpf.javax.security;

import me.panpf.javax.io.Filex;
import me.panpf.javax.io.Streamx;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/**
 * Message digest tool method
 */
@SuppressWarnings("WeakerAccess")
public class Digestx {

    private static final char[] HEX = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};

    private Digestx() {
    }


    /* ******************************************* InputStream *******************************************/

    /**
     * Get the message digest of the input stream using the specified [algorithm]
     */
    @NotNull
    public static String getDigest(@NotNull InputStream inputStream, @NotNull String algorithm) throws IOException {
        MessageDigest messageDigest;
        try {
            messageDigest = MessageDigest.getInstance(algorithm);
        } catch (NoSuchAlgorithmException e) {
            throw new RuntimeException(e);
        }
        StringBuilder sb = new StringBuilder();

        byte[] buffer = new byte[Streamx.DEFAULT_BUFFER_SIZE];
        int readLength;
        while (true) {
            readLength = inputStream.read(buffer);
            if (readLength == -1) {
                break;
            } else {
                messageDigest.update(buffer, 0, readLength);
            }
        }
        byte[] result = messageDigest.digest();
        for (byte aMd5Byte : result) {
            sb.append(HEX[(aMd5Byte & 0xff) / 16]);
            sb.append(HEX[(aMd5Byte & 0xff) % 16]);
        }
        return sb.toString();
    }

    /**
     * Get the message digest of the input stream using the specified [algorithm]
     */
    @NotNull
    public static String getDigestOrEmpty(@NotNull InputStream inputStream, @NotNull String algorithm) {
        try {
            return getDigest(inputStream, algorithm);
        } catch (IOException e) {
            e.printStackTrace();
            return "";
        }
    }

    /**
     * Get the message digest of the input stream using the specified [algorithm]
     */
    @Nullable
    public static String getDigestOrNull(@NotNull InputStream inputStream, @NotNull String algorithm) {
        try {
            return getDigest(inputStream, algorithm);
        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }
    }

    /**
     * Get the message digest of the input stream using the MD5 algorithm
     */
    @NotNull
    public static String getMD5(@NotNull InputStream inputStream) throws IOException {
        return getDigest(inputStream, "MD5");
    }

    /**
     * Get the message digest of the input stream using the MD5 algorithm
     */
    @NotNull
    public static String getMD5OrEmpty(@NotNull InputStream inputStream) {
        try {
            return getMD5(inputStream);
        } catch (IOException e) {
            e.printStackTrace();
            return "";
        }
    }

    /**
     * Get the message digest of the input stream using the MD5 algorithm
     */
    @Nullable
    public static String getMD5OrNull(@NotNull InputStream inputStream) {
        try {
            return getMD5(inputStream);
        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }
    }

    /**
     * Get the message digest of the input stream using the MD5 algorithm, only the middle 16 bits are reserved
     */
    @NotNull
    public static String getMD5_16(@NotNull InputStream inputStream) throws IOException {
        return getDigest(inputStream, "MD5").substring(8, 24);
    }

    /**
     * Get the message digest of the input stream using the MD5 algorithm, only the middle 16 bits are reserved
     */
    @NotNull
    public static String getMD5_16OrEmpty(@NotNull InputStream inputStream) {
        try {
            return getMD5_16(inputStream);
        } catch (IOException e) {
            e.printStackTrace();
            return "";
        }
    }

    /**
     * Get the message digest of the input stream using the MD5 algorithm, only the middle 16 bits are reserved
     */
    @Nullable
    public static String getMD5_16OrNull(@NotNull InputStream inputStream) {
        try {
            return getMD5_16(inputStream);
        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }
    }

    /**
     * Get the message digest of the input stream using the SHA1 algorithm
     */
    @NotNull
    public static String getSHA1(@NotNull InputStream inputStream) throws IOException {
        return getDigest(inputStream, "SHA1");
    }

    /**
     * Get the message digest of the input stream using the SHA1 algorithm
     */
    @NotNull
    public static String getSHA1OrEmpty(@NotNull InputStream inputStream) {
        try {
            return getSHA1(inputStream);
        } catch (IOException e) {
            e.printStackTrace();
            return "";
        }
    }

    /**
     * Get the message digest of the input stream using the SHA1 algorithm
     */
    @Nullable
    public static String getSHA1OrNull(@NotNull InputStream inputStream) {
        try {
            return getSHA1(inputStream);
        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }
    }

    /**
     * Get the message digest of the input stream using the SHA-256 algorithm
     */
    @NotNull
    public static String getSHA256(@NotNull InputStream inputStream) throws IOException {
        return getDigest(inputStream, "SHA-256");
    }

    /**
     * Get the message digest of the input stream using the SHA-256 algorithm
     */
    @NotNull
    public static String getSHA256OrEmpty(@NotNull InputStream inputStream) {
        try {
            return getSHA256(inputStream);
        } catch (IOException e) {
            e.printStackTrace();
            return "";
        }
    }

    /**
     * Get the message digest of the input stream using the SHA-256 algorithm
     */
    @Nullable
    public static String getSHA256OrNull(@NotNull InputStream inputStream) {
        try {
            return getSHA256(inputStream);
        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }
    }

    /**
     * Get the message digest of the input stream using the SHA-512 algorithm
     */
    @NotNull
    public static String getSHA512(@NotNull InputStream inputStream) throws IOException {
        return getDigest(inputStream, "SHA-512");
    }

    /**
     * Get the message digest of the input stream using the SHA-512 algorithm
     */
    @NotNull
    public static String getSHA512OrEmpty(@NotNull InputStream inputStream) {
        try {
            return getSHA512(inputStream);
        } catch (IOException e) {
            e.printStackTrace();
            return "";
        }
    }

    /**
     * Get the message digest of the input stream using the SHA-512 algorithm
     */
    @Nullable
    public static String getSHA512OrNull(@NotNull InputStream inputStream) {
        try {
            return getSHA512(inputStream);
        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }
    }


    /* ******************************************* bytes *******************************************/


    /**
     * Get the message digest of the bytes using the specified [algorithm]
     */
    @NotNull
    public static String getDigest(@NotNull byte[] data, @NotNull String algorithm) {
        InputStream inputStream = Streamx.inputStream(data);
        try {
            return getDigest(inputStream, algorithm);
        } catch (IOException e) {
            throw new RuntimeException(e);
        } finally {
            Streamx.closeQuietly(inputStream);
        }
    }

    /**
     * Get the message digest of the bytes using the MD5 algorithm
     */
    @NotNull
    public static String getMD5(@NotNull byte[] data) {
        InputStream inputStream = Streamx.inputStream(data);
        try {
            return getMD5(inputStream);
        } catch (IOException e) {
            throw new RuntimeException(e);
        } finally {
            Streamx.closeQuietly(inputStream);
        }
    }

    /**
     * Get the message digest of the bytes using the MD5 algorithm, only the middle 16 bits are reserved
     */
    @NotNull
    public static String getMD5_16(@NotNull byte[] data) {
        InputStream inputStream = Streamx.inputStream(data);
        try {
            return getMD5_16(inputStream);
        } catch (IOException e) {
            throw new RuntimeException(e);
        } finally {
            Streamx.closeQuietly(inputStream);
        }
    }

    /**
     * Get the message digest of the bytes using the SHA1 algorithm
     */
    @NotNull
    public static String getSHA1(@NotNull byte[] data) {
        InputStream inputStream = Streamx.inputStream(data);
        try {
            return getSHA1(inputStream);
        } catch (IOException e) {
            throw new RuntimeException(e);
        } finally {
            Streamx.closeQuietly(inputStream);
        }
    }

    /**
     * Get the message digest of the bytes using the SHA-256 algorithm
     */
    @NotNull
    public static String getSHA256(@NotNull byte[] data) {
        InputStream inputStream = Streamx.inputStream(data);
        try {
            return getSHA256(inputStream);
        } catch (IOException e) {
            throw new RuntimeException(e);
        } finally {
            Streamx.closeQuietly(inputStream);
        }
    }

    /**
     * Get the message digest of the bytes using the SHA-512 algorithm
     */
    @NotNull
    public static String getSHA512(@NotNull byte[] data) {
        InputStream inputStream = Streamx.inputStream(data);
        try {
            return getSHA512(inputStream);
        } catch (IOException e) {
            throw new RuntimeException(e);
        } finally {
            Streamx.closeQuietly(inputStream);
        }
    }


    /* ******************************************* String *******************************************/


    /**
     * Get the message digest of the text using the specified [algorithm]
     */
    @NotNull
    public static String getDigest(@NotNull String text, @NotNull String algorithm) {
        InputStream inputStream = Streamx.byteInputStream(text);
        try {
            return getDigest(inputStream, algorithm);
        } catch (IOException e) {
            throw new RuntimeException(e);
        } finally {
            Streamx.closeQuietly(inputStream);
        }
    }

    /**
     * Get the message digest of the text using the MD5 algorithm
     */
    @NotNull
    public static String getMD5(@NotNull String text) {
        InputStream inputStream = Streamx.byteInputStream(text);
        try {
            return getMD5(inputStream);
        } catch (IOException e) {
            throw new RuntimeException(e);
        } finally {
            Streamx.closeQuietly(inputStream);
        }
    }

    /**
     * Get the message digest of the text using the MD5 algorithm, only the middle 16 bits are reserved
     */
    @NotNull
    public static String getMD5_16(@NotNull String text) {
        InputStream inputStream = Streamx.byteInputStream(text);
        try {
            return getMD5_16(inputStream);
        } catch (IOException e) {
            throw new RuntimeException(e);
        } finally {
            Streamx.closeQuietly(inputStream);
        }
    }

    /**
     * Get the message digest of the text using the SHA1 algorithm
     */
    @NotNull
    public static String getSHA1(@NotNull String text) {
        InputStream inputStream = Streamx.byteInputStream(text);
        try {
            return getSHA1(inputStream);
        } catch (IOException e) {
            throw new RuntimeException(e);
        } finally {
            Streamx.closeQuietly(inputStream);
        }
    }

    /**
     * Get the message digest of the text using the SHA-256 algorithm
     */
    @NotNull
    public static String getSHA256(@NotNull String text) {
        InputStream inputStream = Streamx.byteInputStream(text);
        try {
            return getSHA256(inputStream);
        } catch (IOException e) {
            throw new RuntimeException(e);
        } finally {
            Streamx.closeQuietly(inputStream);
        }
    }

    /**
     * Get the message digest of the text using the SHA-512 algorithm
     */
    @NotNull
    public static String getSHA512(@NotNull String text) {
        InputStream inputStream = Streamx.byteInputStream(text);
        try {
            return getSHA512(inputStream);
        } catch (IOException e) {
            throw new RuntimeException(e);
        } finally {
            Streamx.closeQuietly(inputStream);
        }
    }


    /* ******************************************* File *******************************************/


    /**
     * Get the message digest of the file using the specified [algorithm]
     */
    @NotNull
    public static String getDigest(@NotNull File file, @NotNull String algorithm) throws IOException {
        InputStream inputStream = null;
        try {
            inputStream = Filex.inputStream(file);
            return getDigest(inputStream, algorithm);
        } finally {
            Streamx.closeQuietly(inputStream);
        }
    }

    /**
     * Get the message digest of the file using the specified [algorithm]
     */
    @NotNull
    public static String getDigestOrEmpty(@NotNull File file, @NotNull String algorithm) {
        InputStream inputStream = null;
        try {
            inputStream = Filex.inputStream(file);
            return getDigest(inputStream, algorithm);
        } catch (IOException e) {
            e.printStackTrace();
            return "";
        } finally {
            Streamx.closeQuietly(inputStream);
        }
    }

    /**
     * Get the message digest of the file using the specified [algorithm]
     */
    @Nullable
    public static String getDigestOrNull(@NotNull File file, @NotNull String algorithm) {
        InputStream inputStream = null;
        try {
            inputStream = Filex.inputStream(file);
            return getDigest(inputStream, algorithm);
        } catch (IOException e) {
            e.printStackTrace();
            return null;
        } finally {
            Streamx.closeQuietly(inputStream);
        }
    }

    /**
     * Get the message digest of the file using the MD5 algorithm
     */
    @NotNull
    public static String getMD5(@NotNull File file) throws IOException {
        InputStream inputStream = null;
        try {
            inputStream = Filex.inputStream(file);
            return getMD5(inputStream);
        } finally {
            Streamx.closeQuietly(inputStream);
        }
    }

    /**
     * Get the message digest of the file using the MD5 algorithm
     */
    @NotNull
    public static String getMD5OrEmpty(@NotNull File file) {
        InputStream inputStream = null;
        try {
            inputStream = Filex.inputStream(file);
            return getMD5(inputStream);
        } catch (IOException e) {
            e.printStackTrace();
            return "";
        } finally {
            Streamx.closeQuietly(inputStream);
        }
    }

    /**
     * Get the message digest of the file using the MD5 algorithm
     */
    @Nullable
    public static String getMD5OrNull(@NotNull File file) {
        InputStream inputStream = null;
        try {
            inputStream = Filex.inputStream(file);
            return getMD5(inputStream);
        } catch (IOException e) {
            e.printStackTrace();
            return null;
        } finally {
            Streamx.closeQuietly(inputStream);
        }
    }

    /**
     * Get the message digest of the file using the MD5 algorithm, only the middle 16 bits are reserved
     */
    @NotNull
    public static String getMD5_16(@NotNull File file) throws IOException {
        InputStream inputStream = null;
        try {
            inputStream = Filex.inputStream(file);
            return getMD5_16(inputStream);
        } finally {
            Streamx.closeQuietly(inputStream);
        }
    }

    /**
     * Get the message digest of the file using the MD5 algorithm, only the middle 16 bits are reserved
     */
    @NotNull
    public static String getMD5_16OrEmpty(@NotNull File file) {
        InputStream inputStream = null;
        try {
            inputStream = Filex.inputStream(file);
            return getMD5_16(inputStream);
        } catch (IOException e) {
            e.printStackTrace();
            return "";
        } finally {
            Streamx.closeQuietly(inputStream);
        }
    }

    /**
     * Get the message digest of the file using the MD5 algorithm, only the middle 16 bits are reserved
     */
    @Nullable
    public static String getMD5_16OrNull(@NotNull File file) {
        InputStream inputStream = null;
        try {
            inputStream = Filex.inputStream(file);
            return getMD5_16(inputStream);
        } catch (IOException e) {
            e.printStackTrace();
            return null;
        } finally {
            Streamx.closeQuietly(inputStream);
        }
    }

    /**
     * Get the message digest of the file using the SHA1 algorithm
     */
    @NotNull
    public static String getSHA1(@NotNull File file) throws IOException {
        InputStream inputStream = null;
        try {
            inputStream = Filex.inputStream(file);
            return getSHA1(inputStream);
        } finally {
            Streamx.closeQuietly(inputStream);
        }
    }

    /**
     * Get the message digest of the file using the SHA1 algorithm
     */
    @NotNull
    public static String getSHA1OrEmpty(@NotNull File file) {
        InputStream inputStream = null;
        try {
            inputStream = Filex.inputStream(file);
            return getSHA1(inputStream);
        } catch (IOException e) {
            e.printStackTrace();
            return "";
        } finally {
            Streamx.closeQuietly(inputStream);
        }
    }

    /**
     * Get the message digest of the file using the SHA1 algorithm
     */
    @Nullable
    public static String getSHA1OrNull(@NotNull File file) {
        InputStream inputStream = null;
        try {
            inputStream = Filex.inputStream(file);
            return getSHA1(inputStream);
        } catch (IOException e) {
            e.printStackTrace();
            return null;
        } finally {
            Streamx.closeQuietly(inputStream);
        }
    }

    /**
     * Get the message digest of the file using the SHA-256 algorithm
     */
    @NotNull
    public static String getSHA256(@NotNull File file) throws IOException {
        InputStream inputStream = null;
        try {
            inputStream = Filex.inputStream(file);
            return getSHA256(inputStream);
        } finally {
            Streamx.closeQuietly(inputStream);
        }
    }

    /**
     * Get the message digest of the file using the SHA-256 algorithm
     */
    @NotNull
    public static String getSHA256OrEmpty(@NotNull File file) {
        InputStream inputStream = null;
        try {
            inputStream = Filex.inputStream(file);
            return getSHA256(inputStream);
        } catch (IOException e) {
            e.printStackTrace();
            return "";
        } finally {
            Streamx.closeQuietly(inputStream);
        }
    }

    /**
     * Get the message digest of the file using the SHA-256 algorithm
     */
    @Nullable
    public static String getSHA256OrNull(@NotNull File file) {
        InputStream inputStream = null;
        try {
            inputStream = Filex.inputStream(file);
            return getSHA256(inputStream);
        } catch (IOException e) {
            e.printStackTrace();
            return null;
        } finally {
            Streamx.closeQuietly(inputStream);
        }
    }

    /**
     * Get the message digest of the file using the SHA-512 algorithm
     */
    @NotNull
    public static String getSHA512(@NotNull File file) throws IOException {
        InputStream inputStream = null;
        try {
            inputStream = Filex.inputStream(file);
            return getSHA512(inputStream);
        } finally {
            Streamx.closeQuietly(inputStream);
        }
    }

    /**
     * Get the message digest of the file using the SHA-512 algorithm
     */
    @NotNull
    public static String getSHA512OrEmpty(@NotNull File file) {
        InputStream inputStream = null;
        try {
            inputStream = Filex.inputStream(file);
            return getSHA512(inputStream);
        } catch (IOException e) {
            e.printStackTrace();
            return "";
        } finally {
            Streamx.closeQuietly(inputStream);
        }
    }

    /**
     * Get the message digest of the file using the SHA-512 algorithm
     */
    @Nullable
    public static String getSHA512OrNull(@NotNull File file) {
        InputStream inputStream = null;
        try {
            inputStream = Filex.inputStream(file);
            return getSHA512(inputStream);
        } catch (IOException e) {
            e.printStackTrace();
            return null;
        } finally {
            Streamx.closeQuietly(inputStream);
        }
    }
}