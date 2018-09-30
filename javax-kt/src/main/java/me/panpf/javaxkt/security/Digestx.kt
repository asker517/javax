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

@file:Suppress("NOTHING_TO_INLINE")

package me.panpf.javaxkt.security

import me.panpf.javax.security.Digestx
import java.io.File
import java.io.IOException
import java.io.InputStream


/*
 * Message digest related extension methods or properties
 */


/* ******************************************* InputStream *******************************************/


/**
 * Get the message digest of the input stream using the specified [algorithm]
 */
@Throws(IOException::class)
inline fun InputStream.getDigest(algorithm: String): String = Digestx.getDigest(this, algorithm)

/**
 * Get the message digest of the input stream using the MD5 algorithm
 */
inline fun InputStream.getMD5Digest(): String = Digestx.getMD5(this)

/**
 * Get the message digest of the input stream using the MD5 algorithm, only the middle 16 bits are reserved
 */
inline fun InputStream.getMD5_16Digest(): String = Digestx.getMD5_16(this)

/**
 * Get the message digest of the input stream using the SHA1 algorithm
 */
inline fun InputStream.getSHA1Digest(): String = Digestx.getSHA1(this)

/**
 * Get the message digest of the input stream using the SHA-256 algorithm
 */
inline fun InputStream.getSHA256Digest(): String = Digestx.getSHA256(this)

/**
 * Get the message digest of the input stream using the SHA-512 algorithm
 */
inline fun InputStream.getSHA512Digest(): String = Digestx.getSHA512(this)


/* ******************************************* ByteArray *******************************************/


/**
 * Get the message digest of the bytes using the specified [algorithm]
 */
inline fun ByteArray.getDigest(algorithm: String): String = Digestx.getDigest(this, algorithm)

/**
 * Get the message digest of the bytes using the MD5 algorithm
 */
inline fun ByteArray.getMD5Digest(): String = Digestx.getMD5(this)

/**
 * Get the message digest of the bytes using the MD5 algorithm, only the middle 16 bits are reserved
 */
inline fun ByteArray.getMD5_16Digest(): String = Digestx.getMD5_16(this)

/**
 * Get the message digest of the bytes using the SHA1 algorithm
 */
inline fun ByteArray.getSHA1Digest(): String = Digestx.getSHA1(this)

/**
 * Get the message digest of the bytes using the SHA-256 algorithm
 */
inline fun ByteArray.getSHA256Digest(): String = Digestx.getSHA256(this)

/**
 * Get the message digest of the bytes using the SHA-512 algorithm
 */
inline fun ByteArray.getSHA512Digest(): String = Digestx.getSHA512(this)


/* ******************************************* String *******************************************/


/**
 * Get the message digest of the text using the specified [algorithm]
 */
inline fun String.getDigest(algorithm: String): String = Digestx.getDigest(this, algorithm)

/**
 * Get the message digest of the text using the MD5 algorithm
 */
inline fun String.getMD5Digest(): String = Digestx.getMD5(this)

/**
 * Get the message digest of the text using the MD5 algorithm, only the middle 16 bits are reserved
 */
inline fun String.getMD5_16Digest(): String = Digestx.getMD5_16(this)

/**
 * Get the message digest of the text using the SHA1 algorithm
 */
inline fun String.getSHA1Digest(): String = Digestx.getSHA1(this)

/**
 * Get the message digest of the text using the SHA-256 algorithm
 */
inline fun String.getSHA256Digest(): String = Digestx.getSHA256(this)

/**
 * Get the message digest of the text using the SHA-512 algorithm
 */
inline fun String.getSHA512Digest(): String = Digestx.getSHA512(this)


/* ******************************************* File *******************************************/


/**
 * Get the message digest of the file using the specified [algorithm]
 */
@Throws(IOException::class)
inline fun File.getDigest(algorithm: String): String = Digestx.getDigest(this, algorithm)

/**
 * Get the message digest of the file using the MD5 algorithm
 */
@Throws(IOException::class)
inline fun File.getMD5Digest(): String = Digestx.getMD5(this)

/**
 * Get the message digest of the file using the MD5 algorithm, only the middle 16 bits are reserved
 */
@Throws(IOException::class)
inline fun File.getMD5_16Digest(): String = Digestx.getMD5_16(this)

/**
 * Get the message digest of the file using the SHA1 algorithm
 */
@Throws(IOException::class)
inline fun File.getSHA1Digest(): String = Digestx.getSHA1(this)

/**
 * Get the message digest of the file using the SHA-256 algorithm
 */
@Throws(IOException::class)
inline fun File.getSHA256Digest(): String = Digestx.getSHA256(this)

/**
 * Get the message digest of the file using the SHA-512 algorithm
 */
@Throws(IOException::class)
inline fun File.getSHA512Digest(): String = Digestx.getSHA512(this)