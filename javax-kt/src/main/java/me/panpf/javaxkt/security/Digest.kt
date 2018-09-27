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

package me.panpf.javaxkt.security

import me.panpf.javaxkt.io.safeClose
import java.io.File
import java.io.IOException
import java.io.InputStream
import java.security.MessageDigest
import java.security.NoSuchAlgorithmException


/*
 * Message digest related extension methods or properties
 */


private val HEX = charArrayOf('0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f')

/**
 * Get the message digest of the input stream using the specified [algorithm]
 */
@Throws(IOException::class)
fun InputStream.getDigest(algorithm: String): String {
    val messageDigest: MessageDigest
    try {
        messageDigest = MessageDigest.getInstance(algorithm)
    } catch (e: NoSuchAlgorithmException) {
        throw RuntimeException(e)
    }

    val sb = StringBuilder()

    val buffer = ByteArray(DEFAULT_BUFFER_SIZE)
    var readLength: Int
    while (true) {
        readLength = this.read(buffer)
        if (readLength == -1) {
            break
        } else {
            messageDigest.update(buffer, 0, readLength)
        }
    }
    val result = messageDigest.digest()
    for (aMd5Byte in result) {
        sb.append(HEX[(aMd5Byte.toInt() and 0xff) / 16])
        sb.append(HEX[(aMd5Byte.toInt() and 0xff) % 16])
    }
    return sb.toString()
}

/**
 * Get the message digest of the input stream using the MD5 algorithm
 */
fun InputStream.getMD5Digest(): String = this.getDigest("MD5")

/**
 * Get the message digest of the input stream using the MD5 algorithm, only the middle 16 bits are reserved
 */
fun InputStream.getMD5_16Digest(): String = this.getDigest("MD5").substring(8, 24)

/**
 * Get the message digest of the input stream using the SHA1 algorithm
 */
fun InputStream.getSHA1Digest(): String = this.getDigest("SHA1")

/**
 * Get the message digest of the input stream using the SHA-256 algorithm
 */
fun InputStream.getSHA256Digest(): String = this.getDigest("SHA-256")

/**
 * Get the message digest of the input stream using the SHA-512 algorithm
 */
fun InputStream.getSHA512Digest(): String = this.getDigest("SHA-512")


/**
 * Get the message digest of the text using the specified [algorithm]
 */
fun String.getDigest(algorithm: String): String {
    val inputStream = this.byteInputStream()
    try {
        return inputStream.getDigest(algorithm)
    } finally {
        inputStream.safeClose()
    }
}

/**
 * Get the message digest of the text using the MD5 algorithm
 */
fun String.getMD5Digest(): String {
    val inputStream = this.byteInputStream()
    try {
        return inputStream.getMD5Digest()
    } finally {
        inputStream.safeClose()
    }
}

/**
 * Get the message digest of the text using the MD5 algorithm, only the middle 16 bits are reserved
 */
fun String.getMD5_16Digest(): String {
    val inputStream = this.byteInputStream()
    try {
        return inputStream.getMD5_16Digest()
    } finally {
        inputStream.safeClose()
    }
}

/**
 * Get the message digest of the text using the SHA1 algorithm
 */
fun String.getSHA1Digest(): String {
    val inputStream = this.byteInputStream()
    try {
        return inputStream.getSHA1Digest()
    } finally {
        inputStream.safeClose()
    }
}

/**
 * Get the message digest of the text using the SHA-256 algorithm
 */
fun String.getSHA256Digest(): String {
    val inputStream = this.byteInputStream()
    try {
        return inputStream.getSHA256Digest()
    } finally {
        inputStream.safeClose()
    }
}

/**
 * Get the message digest of the text using the SHA-512 algorithm
 */
fun String.getSHA512Digest(): String {
    val inputStream = this.byteInputStream()
    try {
        return inputStream.getSHA512Digest()
    } finally {
        inputStream.safeClose()
    }
}


/**
 * Get the message digest of the file using the specified [algorithm]
 */
@Throws(IOException::class)
fun File.getDigest(algorithm: String): String {
    val inputStream = this.inputStream()
    try {
        return inputStream.getDigest(algorithm)
    } finally {
        inputStream.safeClose()
    }
}

/**
 * Get the message digest of the file using the MD5 algorithm
 */
@Throws(IOException::class)
fun File.getMD5Digest(): String {
    val inputStream = this.inputStream()
    try {
        return inputStream.getMD5Digest()
    } finally {
        inputStream.safeClose()
    }
}

/**
 * Get the message digest of the file using the MD5 algorithm, only the middle 16 bits are reserved
 */
@Throws(IOException::class)
fun File.getMD5_16Digest(): String {
    val inputStream = this.inputStream()
    try {
        return inputStream.getMD5_16Digest()
    } finally {
        inputStream.safeClose()
    }
}

/**
 * Get the message digest of the file using the SHA1 algorithm
 */
@Throws(IOException::class)
fun File.getSHA1Digest(): String {
    val inputStream = this.inputStream()
    try {
        return inputStream.getSHA1Digest()
    } finally {
        inputStream.safeClose()
    }
}

/**
 * Get the message digest of the file using the SHA-256 algorithm
 */
@Throws(IOException::class)
fun File.getSHA256Digest(): String {
    val inputStream = this.inputStream()
    try {
        return inputStream.getSHA256Digest()
    } finally {
        inputStream.safeClose()
    }
}

/**
 * Get the message digest of the file using the SHA-512 algorithm
 */
@Throws(IOException::class)
fun File.getSHA512Digest(): String {
    val inputStream = this.inputStream()
    try {
        return inputStream.getSHA512Digest()
    } finally {
        inputStream.safeClose()
    }
}