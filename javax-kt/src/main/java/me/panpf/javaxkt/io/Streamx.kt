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

package me.panpf.javaxkt.io

import me.panpf.javax.io.CopyListener
import me.panpf.javax.io.Streamx
import java.io.*


/*
 * I/O related extension methods or properties
 */


/**
 * Quietly close
 */
inline fun Closeable?.closeQuietly() = Streamx.closeQuietly(this)


/**
 * Reads this stream completely into a byte array and Automatically close stream.
 */
@Throws(IOException::class)
inline fun InputStream.readBytesClose(estimatedSize: Int): ByteArray = Streamx.readBytesClose(this, estimatedSize)

/**
 * Reads this stream completely into a byte array and Automatically close stream.
 */
@Throws(IOException::class)
inline fun InputStream.readBytesCloseQuietly(estimatedSize: Int): ByteArray = Streamx.readBytesCloseQuietly(this, estimatedSize)

/**
 * Reads this stream completely into a byte array and Automatically close stream.
 */
@Throws(IOException::class)
inline fun InputStream.readBytesClose(): ByteArray = Streamx.readBytesClose(this)

/**
 * Reads this stream completely into a byte array and Automatically close stream.
 */
@Throws(IOException::class)
inline fun InputStream.readBytesCloseQuietly(): ByteArray = Streamx.readBytesCloseQuietly(this)


/**
 * Reads this reader completely as a String and Automatically close stream.
 *
 * @return the string with corresponding file content.
 */
@Throws(IOException::class)
inline fun Reader.readTextClose(): String = Streamx.readTextClose(this)

/**
 * Reads this reader completely as a String and Automatically close stream.
 *
 * @return the string with corresponding file content.
 */
@Throws(IOException::class)
inline fun Reader.readTextCloseQuietly(): String = Streamx.readTextCloseQuietly(this)


/**
 * Copies this stream to the given output stream, returning the number of bytes copied
 *
 * **Note** It is the caller's responsibility to close both of these resources.
 */
@Throws(IOException::class)
inline fun InputStream.copyTo(out: OutputStream, bufferSize: Int, listener: CopyListener): Long =
        Streamx.copyTo(this, out, bufferSize, listener)

/**
 * Copies this stream to the given output stream, returning the number of bytes copied
 *
 * **Note** It is the caller's responsibility to close both of these resources.
 */
@Throws(IOException::class)
inline fun InputStream.copyTo(out: OutputStream, listener: CopyListener): Long =
        Streamx.copyTo(this, out, listener)


/**
 * Copies this reader to the given [out] writer, returning the number of characters copied.
 * **Note** it is the caller's responsibility to close both of these resources.
 *
 * @param out        writer to write to.
 * @param bufferSize size of character buffer to use in process.
 * @return number of characters copied.
 */
@Throws(IOException::class)
inline fun Reader.copyTo(out: Writer, bufferSize: Int, listener: CopyListener): Long =
        Streamx.copyTo(this, out, bufferSize, listener)


/**
 * Copies this reader to the given [out] writer, returning the number of characters copied.
 * **Note** it is the caller's responsibility to close both of these resources.
 *
 * @param out        writer to write to.
 * @return number of characters copied.
 */
@Throws(IOException::class)
inline fun Reader.copyTo(out: Writer, listener: CopyListener): Long =
        Streamx.copyTo(this, out, listener)