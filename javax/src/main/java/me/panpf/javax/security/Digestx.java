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
import me.panpf.javax.io.IOStreamx;
import org.jetbrains.annotations.NotNull;

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

        byte[] buffer = new byte[IOStreamx.DEFAULT_BUFFER_SIZE];
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
     * Get the message digest of the input stream using the MD5 algorithm
     */
    @NotNull
    public static String getMD5(@NotNull InputStream inputStream) throws IOException {
        return getDigest(inputStream, "MD5");
    }

    /**
     * Get the message digest of the input stream using the MD5 algorithm, only the middle 16 bits are reserved
     */
    @NotNull
    public static String getMD5_16(@NotNull InputStream inputStream) throws IOException {
        return getDigest(inputStream, "MD5").substring(8, 24);
    }

    /**
     * Get the message digest of the input stream using the SHA1 algorithm
     */
    @NotNull
    public static String getSHA1(@NotNull InputStream inputStream) throws IOException {
        return getDigest(inputStream, "SHA1");
    }

    /**
     * Get the message digest of the input stream using the SHA-256 algorithm
     */
    @NotNull
    public static String getSHA256(@NotNull InputStream inputStream) throws IOException {
        return getDigest(inputStream, "SHA-256");
    }

    /**
     * Get the message digest of the input stream using the SHA-512 algorithm
     */
    @NotNull
    public static String getSHA512(@NotNull InputStream inputStream) throws IOException {
        return getDigest(inputStream, "SHA-512");
    }

    /**
     * Get the message digest of the text using the specified [algorithm]
     */
    @NotNull
    public static String getDigest(@NotNull String text, @NotNull String algorithm) {
        InputStream inputStream = null;
        try {
            inputStream = IOStreamx.byteInputStream(text);
            return getDigest(inputStream, algorithm);
        } catch (IOException e) {
            throw new RuntimeException(e);
        } finally {
            IOStreamx.safeClose(inputStream);
        }
    }

    /**
     * Get the message digest of the text using the MD5 algorithm
     */
    @NotNull
    public static String getMD5(@NotNull String text) {
        return getDigest(text, "MD5");
    }

    /**
     * Get the message digest of the text using the MD5 algorithm, only the middle 16 bits are reserved
     */
    @NotNull
    public static String getMD5_16(@NotNull String text) {
        return getDigest(text, "MD5").substring(8, 24);
    }

    /**
     * Get the message digest of the text using the SHA1 algorithm
     */
    @NotNull
    public static String getSHA1(@NotNull String text) {
        return getDigest(text, "SHA1");
    }

    /**
     * Get the message digest of the text using the SHA-256 algorithm
     */
    @NotNull
    public static String getSHA256(@NotNull String text) {
        return getDigest(text, "SHA-256");
    }

    /**
     * Get the message digest of the text using the SHA-512 algorithm
     */
    @NotNull
    public static String getSHA512(@NotNull String text) {
        return getDigest(text, "SHA-512");
    }

    /**
     * Get the message digest of the file using the specified [algorithm]
     */
    @NotNull
    public static String getDigest(@NotNull File file, @NotNull String algorithm) {
        InputStream inputStream = null;
        try {
            inputStream = Filex.inputStream(file);
            return getDigest(inputStream, algorithm);
        } catch (IOException e) {
            throw new RuntimeException(e);
        } finally {
            IOStreamx.safeClose(inputStream);
        }
    }

    /**
     * Get the message digest of the file using the MD5 algorithm
     */
    @NotNull
    public static String getMD5(@NotNull File file) {
        return getDigest(file, "MD5");
    }

    /**
     * Get the message digest of the file using the MD5 algorithm, only the middle 16 bits are reserved
     */
    @NotNull
    public static String getMD5_16(@NotNull File file) {
        return getDigest(file, "MD5").substring(8, 24);
    }

    /**
     * Get the message digest of the file using the SHA1 algorithm
     */
    @NotNull
    public static String getSHA1(@NotNull File file) {
        return getDigest(file, "SHA1");
    }

    /**
     * Get the message digest of the file using the SHA-256 algorithm
     */
    @NotNull
    public static String getSHA256(@NotNull File file) {
        return getDigest(file, "SHA-256");
    }

    /**
     * Get the message digest of the file using the SHA-512 algorithm
     */
    @NotNull
    public static String getSHA512(@NotNull File file) {
        return getDigest(file, "SHA-512");
    }
}