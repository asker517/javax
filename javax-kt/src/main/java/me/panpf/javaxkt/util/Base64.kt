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

package me.panpf.javaxkt.util

import java.io.FilterOutputStream
import java.io.IOException
import java.io.InputStream
import java.io.OutputStream
import java.nio.ByteBuffer
import java.nio.charset.Charset
import java.util.*

/*
 * Base64 tool method
 */


fun ByteArray.base64EncodeToString(): String {
    return Base64Internal.encoder.encodeToString(this)
}

fun String.base64EncodeToString(): String {
    return Base64Internal.encoder.encodeToString(this.toByteArray(Charset.forName("UTF-8")))
}

fun ByteBuffer.base64EncodeToString(): String {
    return Base64Internal.encoder.encodeToString(this.array())
}


fun ByteArray.base64EncodeToBytes(): ByteArray {
    return Base64Internal.encoder.encode(this)
}

fun String.base64EncodeToBytes(): ByteArray {
    return Base64Internal.encoder.encode(this.toByteArray(Charset.forName("UTF-8")))
}

fun ByteBuffer.base64EncodeToBytes(): ByteArray {
    return Base64Internal.encoder.encode(this.array())
}


fun ByteArray.base64EncodeTo(dst: ByteArray): Int {
    return Base64Internal.encoder.encode(this, dst)
}

fun String.base64EncodeTo(dst: ByteArray): Int {
    return Base64Internal.encoder.encode(this.toByteArray(Charset.forName("UTF-8")), dst)
}

fun ByteBuffer.base64EncodeTo(dst: ByteArray): Int {
    return Base64Internal.encoder.encode(this.array(), dst)
}


fun ByteArray.base64EncodeToBuffer(): ByteBuffer {
    return Base64Internal.encoder.encode(ByteBuffer.wrap(this))
}

fun String.base64EncodeToBuffer(): ByteBuffer {
    return Base64Internal.encoder.encode(ByteBuffer.wrap(this.toByteArray(Charset.forName("UTF-8"))))
}

fun ByteBuffer.base64EncodeToBuffer(): ByteBuffer {
    return Base64Internal.encoder.encode(this)
}


fun ByteArray.base64UrlEncodeToString(): String {
    return Base64Internal.urlEncoder.encodeToString(this)
}

fun String.base64UrlEncodeToString(): String {
    return Base64Internal.urlEncoder.encodeToString(this.toByteArray(Charset.forName("UTF-8")))
}

fun ByteBuffer.base64UrlEncodeToString(): String {
    return Base64Internal.urlEncoder.encodeToString(this.array())
}


fun ByteArray.base64UrlEncodeToBytes(): ByteArray {
    return Base64Internal.urlEncoder.encode(this)
}

fun String.base64UrlEncodeToBytes(): ByteArray {
    return Base64Internal.urlEncoder.encode(this.toByteArray(Charset.forName("UTF-8")))
}

fun ByteBuffer.base64UrlEncodeToBytes(): ByteArray {
    return Base64Internal.urlEncoder.encode(this.array())
}


fun ByteArray.base64UrlEncodeTo(dst: ByteArray): Int {
    return Base64Internal.urlEncoder.encode(this, dst)
}

fun String.base64UrlEncodeTo(dst: ByteArray): Int {
    return Base64Internal.urlEncoder.encode(this.toByteArray(Charset.forName("UTF-8")), dst)
}

fun ByteBuffer.base64UrlEncodeTo(dst: ByteArray): Int {
    return Base64Internal.urlEncoder.encode(this.array(), dst)
}


fun ByteArray.base64UrlEncodeToBuffer(): ByteBuffer {
    return Base64Internal.urlEncoder.encode(ByteBuffer.wrap(this))
}

fun String.base64UrlEncodeToBuffer(): ByteBuffer {
    return Base64Internal.urlEncoder.encode(ByteBuffer.wrap(this.toByteArray(Charset.forName("UTF-8"))))
}

fun ByteBuffer.base64UrlEncodeToBuffer(): ByteBuffer {
    return Base64Internal.urlEncoder.encode(this)
}


fun ByteArray.base64MimeEncodeToString(): String {
    return Base64Internal.mimeEncoder.encodeToString(this)
}

fun String.base64MimeEncodeToString(): String {
    return Base64Internal.mimeEncoder.encodeToString(this.toByteArray(Charset.forName("UTF-8")))
}

fun ByteBuffer.base64MimeEncodeToString(): String {
    return Base64Internal.mimeEncoder.encodeToString(this.array())
}


fun ByteArray.base64MimeEncodeToBytes(): ByteArray {
    return Base64Internal.mimeEncoder.encode(this)
}

fun String.base64MimeEncodeToBytes(): ByteArray {
    return Base64Internal.mimeEncoder.encode(this.toByteArray(Charset.forName("UTF-8")))
}

fun ByteBuffer.base64MimeEncodeToBytes(): ByteArray {
    return Base64Internal.mimeEncoder.encode(this.array())
}


fun ByteArray.base64MimeEncodeTo(dst: ByteArray): Int {
    return Base64Internal.mimeEncoder.encode(this, dst)
}

fun String.base64MimeEncodeTo(dst: ByteArray): Int {
    return Base64Internal.mimeEncoder.encode(this.toByteArray(Charset.forName("UTF-8")), dst)
}

fun ByteBuffer.base64MimeEncodeTo(dst: ByteArray): Int {
    return Base64Internal.mimeEncoder.encode(this.array(), dst)
}


fun ByteArray.base64MimeEncodeToBuffer(): ByteBuffer {
    return Base64Internal.mimeEncoder.encode(ByteBuffer.wrap(this))
}

fun String.base64MimeEncodeToBuffer(): ByteBuffer {
    return Base64Internal.mimeEncoder.encode(ByteBuffer.wrap(this.toByteArray(Charset.forName("UTF-8"))))
}

fun ByteBuffer.base64MimeEncodeToBuffer(): ByteBuffer {
    return Base64Internal.mimeEncoder.encode(this)
}


fun ByteArray.base64MimeEncodeToString(lineLength: Int, lineSeparator: ByteArray): String {
    return Base64Internal.getMimeEncoder(lineLength, lineSeparator).encodeToString(this)
}

fun String.base64MimeEncodeToString(lineLength: Int, lineSeparator: ByteArray): String {
    return Base64Internal.getMimeEncoder(lineLength, lineSeparator).encodeToString(this.toByteArray(Charset.forName("UTF-8")))
}

fun ByteBuffer.base64MimeEncodeToString(lineLength: Int, lineSeparator: ByteArray): String {
    return Base64Internal.getMimeEncoder(lineLength, lineSeparator).encodeToString(this.array())
}


fun ByteArray.base64MimeEncodeToBytes(lineLength: Int, lineSeparator: ByteArray): ByteArray {
    return Base64Internal.getMimeEncoder(lineLength, lineSeparator).encode(this)
}

fun String.base64MimeEncodeToBytes(lineLength: Int, lineSeparator: ByteArray): ByteArray {
    return Base64Internal.getMimeEncoder(lineLength, lineSeparator).encode(this.toByteArray(Charset.forName("UTF-8")))
}

fun ByteBuffer.base64MimeEncodeToBytes(lineLength: Int, lineSeparator: ByteArray): ByteArray {
    return Base64Internal.getMimeEncoder(lineLength, lineSeparator).encode(this.array())
}


fun ByteArray.base64MimeEncodeTo(lineLength: Int, lineSeparator: ByteArray, dst: ByteArray): Int {
    return Base64Internal.getMimeEncoder(lineLength, lineSeparator).encode(this, dst)
}

fun String.base64MimeEncodeTo(lineLength: Int, lineSeparator: ByteArray, dst: ByteArray): Int {
    return Base64Internal.getMimeEncoder(lineLength, lineSeparator).encode(this.toByteArray(Charset.forName("UTF-8")), dst)
}

fun ByteBuffer.base64MimeEncodeTo(lineLength: Int, lineSeparator: ByteArray, dst: ByteArray): Int {
    return Base64Internal.getMimeEncoder(lineLength, lineSeparator).encode(this.array(), dst)
}


fun ByteArray.base64MimeEncodeToBuffer(lineLength: Int, lineSeparator: ByteArray): ByteBuffer {
    return Base64Internal.getMimeEncoder(lineLength, lineSeparator).encode(ByteBuffer.wrap(this))
}

fun String.base64MimeEncodeToBuffer(lineLength: Int, lineSeparator: ByteArray): ByteBuffer {
    return Base64Internal.getMimeEncoder(lineLength, lineSeparator).encode(ByteBuffer.wrap(this.toByteArray(Charset.forName("UTF-8"))))
}

fun ByteBuffer.base64MimeEncodeToBuffer(lineLength: Int, lineSeparator: ByteArray): ByteBuffer {
    return Base64Internal.getMimeEncoder(lineLength, lineSeparator).encode(this)
}


fun ByteArray.base64DecodeToBytes(): ByteArray {
    return Base64Internal.decoder.decode(this)
}

fun String.base64DecodeToBytes(): ByteArray {
    return Base64Internal.decoder.decode(this.toByteArray(Charset.forName("UTF-8")))
}

fun ByteBuffer.base64DecodeToBytes(): ByteArray {
    return Base64Internal.decoder.decode(this).array()
}


fun ByteArray.base64DecodeToString(): String {
    return String(Base64Internal.decoder.decode(this), Charset.forName("UTF-8"))
}

fun String.base64DecodeToString(): String {
    return String(Base64Internal.decoder.decode(this.toByteArray(Charset.forName("UTF-8"))), Charset.forName("UTF-8"))
}

fun ByteBuffer.base64DecodeToString(): String {
    return String(Base64Internal.decoder.decode(this).array(), Charset.forName("UTF-8"))
}


fun ByteArray.base64DecodeTo(dst: ByteArray): Int {
    return Base64Internal.decoder.decode(this, dst)
}

fun String.base64DecodeTo(dst: ByteArray): Int {
    return Base64Internal.decoder.decode(this.toByteArray(Charset.forName("UTF-8")), dst)
}

fun ByteBuffer.base64DecodeTo(dst: ByteArray): Int {
    return Base64Internal.decoder.decode(this.array(), dst)
}


fun ByteArray.base64DecodeToBuffer(): ByteBuffer {
    return Base64Internal.decoder.decode(ByteBuffer.wrap(this))
}

fun String.base64DecodeToBuffer(): ByteBuffer {
    return Base64Internal.decoder.decode(ByteBuffer.wrap(this.toByteArray(Charset.forName("UTF-8"))))
}

fun ByteBuffer.base64DecodeToBuffer(): ByteBuffer {
    return Base64Internal.decoder.decode(this)
}


fun ByteArray.base64UrlDecodeToBytes(): ByteArray {
    return Base64Internal.urlDecoder.decode(this)
}

fun String.base64UrlDecodeToBytes(): ByteArray {
    return Base64Internal.urlDecoder.decode(this.toByteArray(Charset.forName("UTF-8")))
}

fun ByteBuffer.base64UrlDecodeToBytes(): ByteArray {
    return Base64Internal.urlDecoder.decode(this).array()
}


fun ByteArray.base64UrlDecodeToString(): String {
    return String(Base64Internal.urlDecoder.decode(this), Charset.forName("UTF-8"))
}

fun String.base64UrlDecodeToString(): String {
    return String(Base64Internal.urlDecoder.decode(this.toByteArray(Charset.forName("UTF-8"))), Charset.forName("UTF-8"))
}

fun ByteBuffer.base64UrlDecodeToString(): String {
    return String(Base64Internal.urlDecoder.decode(this).array(), Charset.forName("UTF-8"))
}


fun ByteArray.base64UrlDecodeTo(dst: ByteArray): Int {
    return Base64Internal.urlDecoder.decode(this, dst)
}

fun String.base64UrlDecodeTo(dst: ByteArray): Int {
    return Base64Internal.urlDecoder.decode(this.toByteArray(Charset.forName("UTF-8")), dst)
}

fun ByteBuffer.base64UrlDecodeTo(dst: ByteArray): Int {
    return Base64Internal.urlDecoder.decode(this.array(), dst)
}


fun ByteArray.base64UrlDecodeToBuffer(): ByteBuffer {
    return Base64Internal.urlDecoder.decode(ByteBuffer.wrap(this))
}

fun String.base64UrlDecodeToBuffer(): ByteBuffer {
    return Base64Internal.urlDecoder.decode(ByteBuffer.wrap(this.toByteArray(Charset.forName("UTF-8"))))
}

fun ByteBuffer.base64UrlDecodeToBuffer(): ByteBuffer {
    return Base64Internal.urlDecoder.decode(this)
}


fun ByteArray.base64MimeDecodeToBytes(): ByteArray {
    return Base64Internal.mimeDecoder.decode(this)
}

fun String.base64MimeDecodeToBytes(): ByteArray {
    return Base64Internal.mimeDecoder.decode(this.toByteArray(Charset.forName("UTF-8")))
}

fun ByteBuffer.base64MimeDecodeToBytes(): ByteArray {
    return Base64Internal.mimeDecoder.decode(this).array()
}


fun ByteArray.base64MimeDecodeToString(): String {
    return String(Base64Internal.mimeDecoder.decode(this), Charset.forName("UTF-8"))
}

fun String.base64MimeDecodeToString(): String {
    return String(Base64Internal.mimeDecoder.decode(this.toByteArray(Charset.forName("UTF-8"))), Charset.forName("UTF-8"))
}

fun ByteBuffer.base64MimeDecodeToString(): String {
    return String(Base64Internal.mimeDecoder.decode(this).array(), Charset.forName("UTF-8"))
}


fun ByteArray.base64MimeDecodeTo(dst: ByteArray): Int {
    return Base64Internal.mimeDecoder.decode(this, dst)
}

fun String.base64MimeDecodeTo(dst: ByteArray): Int {
    return Base64Internal.mimeDecoder.decode(this.toByteArray(Charset.forName("UTF-8")), dst)
}

fun ByteBuffer.base64MimeDecodeTo(dst: ByteArray): Int {
    return Base64Internal.mimeDecoder.decode(this.array(), dst)
}


fun ByteArray.base64MimeDecodeToBuffer(): ByteBuffer {
    return Base64Internal.mimeDecoder.decode(ByteBuffer.wrap(this))
}

fun String.base64MimeDecodeToBuffer(): ByteBuffer {
    return Base64Internal.mimeDecoder.decode(ByteBuffer.wrap(this.toByteArray(Charset.forName("UTF-8"))))
}

fun ByteBuffer.base64MimeDecodeToBuffer(): ByteBuffer {
    return Base64Internal.mimeDecoder.decode(this)
}


/**
 * This class consists exclusively of static methods for obtaining
 * encoders and decoders for the Base64 encoding scheme. The
 * implementation of this class supports the following types of Base64
 * as specified in
 * [RFC 4648](http://www.ietf.org/rfc/rfc4648.txt) and
 * [RFC 2045](http://www.ietf.org/rfc/rfc2045.txt).
 *
 *
 *  * <a name="basic">**Basic**</a>
 *
 *  Uses "The Base64 Alphabet" as specified in Table 1 of
 * RFC 4648 and RFC 2045 for encoding and decoding operation.
 * The encoder does not add any line feed (line separator)
 * character. The decoder rejects data that contains characters
 * outside the base64 alphabet.
 *
 *  * <a name="url">**URL and Filename safe**</a>
 *
 *  Uses the "URL and Filename safe Base64 Alphabet" as specified
 * in Table 2 of RFC 4648 for encoding and decoding. The
 * encoder does not add any line feed (line separator) character.
 * The decoder rejects data that contains characters outside the
 * base64 alphabet.
 *
 *  * <a name="mime">**MIME**</a>
 *
 *  Uses the "The Base64 Alphabet" as specified in Table 1 of
 * RFC 2045 for encoding and decoding operation. The encoded output
 * must be represented in lines of no more than 76 characters each
 * and uses a carriage return `'\r'` followed immediately by
 * a linefeed `'\n'` as the line separator. No line separator
 * is added to the end of the encoded output. All line separators
 * or other characters not found in the base64 alphabet table are
 * ignored in decoding operation.
 *
 *
 *
 *  Unless otherwise noted, passing a `null` argument to a
 * method of this class will cause a [ NullPointerException][NullPointerException] to be thrown.
 *
 * @author  Xueming Shen
 */

private object Base64Internal {

    /**
     * Returns a [Encoder] that encodes using the
     * [Basic](#basic) type base64 encoding scheme.
     *
     * @return  A Base64 encoder.
     */
    val encoder: Encoder
        get() = Encoder.RFC4648

    /**
     * Returns a [Encoder] that encodes using the
     * [URL and Filename safe](#url) type base64
     * encoding scheme.
     *
     * @return  A Base64 encoder.
     */
    val urlEncoder: Encoder
        get() = Encoder.RFC4648_URLSAFE

    /**
     * Returns a [Encoder] that encodes using the
     * [MIME](#mime) type base64 encoding scheme.
     *
     * @return  A Base64 encoder.
     */
    val mimeEncoder: Encoder
        get() = Encoder.RFC2045

    /**
     * Returns a [Decoder] that decodes using the
     * [Basic](#basic) type base64 encoding scheme.
     *
     * @return  A Base64 decoder.
     */
    val decoder: Decoder
        get() = Decoder.RFC4648

    /**
     * Returns a [Decoder] that decodes using the
     * [URL and Filename safe](#url) type base64
     * encoding scheme.
     *
     * @return  A Base64 decoder.
     */
    val urlDecoder: Decoder
        get() = Decoder.RFC4648_URLSAFE

    /**
     * Returns a [Decoder] that decodes using the
     * [MIME](#mime) type base64 decoding scheme.
     *
     * @return  A Base64 decoder.
     */
    val mimeDecoder: Decoder
        get() = Decoder.RFC2045

    /**
     * Returns a [Encoder] that encodes using the
     * [MIME](#mime) type base64 encoding scheme
     * with specified line length and line separators.
     *
     * @param   lineLength
     * the length of each output line (rounded down to nearest multiple
     * of 4). If `lineLength <= 0` the output will not be separated
     * in lines
     * @param   lineSeparator
     * the line separator for each output line
     *
     * @return  A Base64 encoder.
     *
     * @throws  IllegalArgumentException if `lineSeparator` includes any
     * character of "The Base64 Alphabet" as specified in Table 1 of
     * RFC 2045.
     */
    fun getMimeEncoder(lineLength: Int, lineSeparator: ByteArray?): Encoder {
        if (lineSeparator == null) {
            throw NullPointerException()
        }
        val base64 = Decoder.fromBase64
        for (b in lineSeparator) {
            if (base64[b.toInt() and 0xff] != -1)
                throw IllegalArgumentException(
                        "Illegal base64 line separator character 0x" + Integer.toString(b.toInt(), 16))
        }
        return if (lineLength <= 0) {
            Encoder.RFC4648
        } else Encoder(false, lineSeparator, lineLength shr 2 shl 2, true)
    }

    /**
     * This class implements an encoder for encoding byte data using
     * the Base64 encoding scheme as specified in RFC 4648 and RFC 2045.
     *
     *
     *  Instances of [Encoder] class are safe for use by
     * multiple concurrent threads.
     *
     *
     *  Unless otherwise noted, passing a `null` argument to
     * a method of this class will cause a
     * [NullPointerException] to
     * be thrown.
     *
     * @see Decoder
     *
     * @since   1.8
     */
    class Encoder constructor(private val isURL: Boolean, private val newline: ByteArray?, private val linemax: Int, private val doPadding: Boolean) {

        private fun outLength(srclen: Int): Int {
            var len = 0
            if (doPadding) {
                len = 4 * ((srclen + 2) / 3)
            } else {
                val n = srclen % 3
                len = 4 * (srclen / 3) + if (n == 0) 0 else n + 1
            }
            if (linemax > 0)
            // line separators
                len += (len - 1) / linemax * newline!!.size
            return len
        }

        /**
         * Encodes all bytes from the specified byte array into a newly-allocated
         * byte array using the [Base64Internal] encoding scheme. The returned byte
         * array is of the length of the resulting bytes.
         *
         * @param   src
         * the byte array to encode
         * @return  A newly-allocated byte array containing the resulting
         * encoded bytes.
         */
        fun encode(src: ByteArray): ByteArray {
            val len = outLength(src.size)          // dst array size
            val dst = ByteArray(len)
            val ret = encode0(src, 0, src.size, dst)
            return if (ret != dst.size) Arrays.copyOf(dst, ret) else dst
        }

        /**
         * Encodes all bytes from the specified byte array using the
         * [Base64Internal] encoding scheme, writing the resulting bytes to the
         * given output byte array, starting at offset 0.
         *
         *
         *  It is the responsibility of the invoker of this method to make
         * sure the output byte array `dst` has enough space for encoding
         * all bytes from the input byte array. No bytes will be written to the
         * output byte array if the output byte array is not big enough.
         *
         * @param   src
         * the byte array to encode
         * @param   dst
         * the output byte array
         * @return  The number of bytes written to the output byte array
         *
         * @throws  IllegalArgumentException if `dst` does not have enough
         * space for encoding all input bytes.
         */
        fun encode(src: ByteArray, dst: ByteArray): Int {
            val len = outLength(src.size)         // dst array size
            if (dst.size < len)
                throw IllegalArgumentException(
                        "Output byte array is too small for encoding all input bytes")
            return encode0(src, 0, src.size, dst)
        }

        /**
         * Encodes the specified byte array into a String using the [Base64Internal]
         * encoding scheme.
         *
         *
         *  This method first encodes all input bytes into a base64 encoded
         * byte array and then constructs a new String by using the encoded byte
         * array and the "ISO-8859-1" charset.
         *
         *
         *  In other words, an invocation of this method has exactly the same
         * effect as invoking
         * `new String(encode(src), StandardCharsets.ISO_8859_1)`.
         *
         * @param   src
         * the byte array to encode
         * @return  A String containing the resulting Base64 encoded characters
         */
        fun encodeToString(src: ByteArray): String {
            val encoded = encode(src)
            return String(encoded, 0, encoded.size)
        }

        /**
         * Encodes all remaining bytes from the specified byte buffer into
         * a newly-allocated ByteBuffer using the [Base64Internal] encoding
         * scheme.
         *
         * Upon return, the source buffer's position will be updated to
         * its limit; its limit will not have been changed. The returned
         * output buffer's position will be zero and its limit will be the
         * number of resulting encoded bytes.
         *
         * @param   buffer
         * the source ByteBuffer to encode
         * @return  A newly-allocated byte buffer containing the encoded bytes.
         */
        fun encode(buffer: ByteBuffer): ByteBuffer {
            val len = outLength(buffer.remaining())
            var dst = ByteArray(len)
            var ret = 0
            if (buffer.hasArray()) {
                ret = encode0(buffer.array(),
                        buffer.arrayOffset() + buffer.position(),
                        buffer.arrayOffset() + buffer.limit(),
                        dst)
                buffer.position(buffer.limit())
            } else {
                val src = ByteArray(buffer.remaining())
                buffer.get(src)
                ret = encode0(src, 0, src.size, dst)
            }
            if (ret != dst.size)
                dst = Arrays.copyOf(dst, ret)
            return ByteBuffer.wrap(dst)
        }

        /**
         * Wraps an output stream for encoding byte data using the [Base64Internal]
         * encoding scheme.
         *
         *
         *  It is recommended to promptly close the returned output stream after
         * use, during which it will flush all possible leftover bytes to the underlying
         * output stream. Closing the returned output stream will close the underlying
         * output stream.
         *
         * @param   os
         * the output stream.
         * @return  the output stream for encoding the byte data into the
         * specified Base64 encoded format
         */
        fun wrap(os: OutputStream?): OutputStream {
            if (os == null) {
                throw NullPointerException()
            }
            return EncOutputStream(os, if (isURL) toBase64URL else toBase64,
                    newline, linemax, doPadding)
        }

        /**
         * Returns an encoder instance that encodes equivalently to this one,
         * but without adding any padding character at the end of the encoded
         * byte data.
         *
         *
         *  The encoding scheme of this encoder instance is unaffected by
         * this invocation. The returned encoder instance should be used for
         * non-padding encoding operation.
         *
         * @return an equivalent encoder that encodes without adding any
         * padding character at the end
         */
        fun withoutPadding(): Encoder {
            return if (!doPadding) this else Encoder(isURL, newline, linemax, false)
        }

        private fun encode0(src: ByteArray, off: Int, end: Int, dst: ByteArray): Int {
            val base64 = if (isURL) toBase64URL else toBase64
            var sp = off
            var slen = (end - off) / 3 * 3
            val sl = off + slen
            if (linemax > 0 && slen > linemax / 4 * 3)
                slen = linemax / 4 * 3
            var dp = 0
            while (sp < sl) {
                val sl0 = Math.min(sp + slen, sl)
                var sp0 = sp
                var dp0 = dp
                while (sp0 < sl0) {
                    val bits = src[sp0++].toInt() and 0xff shl 16 or (
                            src[sp0++].toInt() and 0xff shl 8) or
                            (src[sp0++].toInt() and 0xff)
                    dst[dp0++] = base64[bits.ushr(18) and 0x3f].toByte()
                    dst[dp0++] = base64[bits.ushr(12) and 0x3f].toByte()
                    dst[dp0++] = base64[bits.ushr(6) and 0x3f].toByte()
                    dst[dp0++] = base64[bits and 0x3f].toByte()
                }
                val dlen = (sl0 - sp) / 3 * 4
                dp += dlen
                sp = sl0
                if (dlen == linemax && sp < end) {
                    for (b in newline!!) {
                        dst[dp++] = b
                    }
                }
            }
            if (sp < end) {               // 1 or 2 leftover bytes
                val b0 = src[sp++].toInt() and 0xff
                dst[dp++] = base64[b0 shr 2].toByte()
                if (sp == end) {
                    dst[dp++] = base64[b0 shl 4 and 0x3f].toByte()
                    if (doPadding) {
                        dst[dp++] = '='.toByte()
                        dst[dp++] = '='.toByte()
                    }
                } else {
                    val b1 = src[sp++].toInt() and 0xff
                    dst[dp++] = base64[b0 shl 4 and 0x3f or (b1 shr 4)].toByte()
                    dst[dp++] = base64[b1 shl 2 and 0x3f].toByte()
                    if (doPadding) {
                        dst[dp++] = '='.toByte()
                    }
                }
            }
            return dp
        }

        companion object {

            /**
             * This array is a lookup table that translates 6-bit positive integer
             * index values into their "Base64 Alphabet" equivalents as specified
             * in "Table 1: The Base64 Alphabet" of RFC 2045 (and RFC 4648).
             */
            val toBase64 = charArrayOf('A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z', 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z', '0', '1', '2', '3', '4', '5', '6', '7', '8', '9', '+', '/')

            /**
             * It's the lookup table for "URL and Filename safe Base64" as specified
             * in Table 2 of the RFC 4648, with the '+' and '/' changed to '-' and
             * '_'. This table is used when BASE64_URL is specified.
             */
            val toBase64URL = charArrayOf('A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z', 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z', '0', '1', '2', '3', '4', '5', '6', '7', '8', '9', '-', '_')

            private val MIMELINEMAX = 76
            private val CRLF = byteArrayOf('\r'.toByte(), '\n'.toByte())

            internal val RFC4648 = Encoder(false, null, -1, true)
            internal val RFC4648_URLSAFE = Encoder(true, null, -1, true)
            internal val RFC2045 = Encoder(false, CRLF, MIMELINEMAX, true)
        }
    }

    /**
     * This class implements a decoder for decoding byte data using the
     * Base64 encoding scheme as specified in RFC 4648 and RFC 2045.
     *
     *
     *  The Base64 padding character `'='` is accepted and
     * interpreted as the end of the encoded byte data, but is not
     * required. So if the final unit of the encoded byte data only has
     * two or three Base64 characters (without the corresponding padding
     * character(s) padded), they are decoded as if followed by padding
     * character(s). If there is a padding character present in the
     * final unit, the correct number of padding character(s) must be
     * present, otherwise `IllegalArgumentException` (
     * `IOException` when reading from a Base64 stream) is thrown
     * during decoding.
     *
     *
     *  Instances of [Decoder] class are safe for use by
     * multiple concurrent threads.
     *
     *
     *  Unless otherwise noted, passing a `null` argument to
     * a method of this class will cause a
     * [NullPointerException] to
     * be thrown.
     *
     * @see Encoder
     *
     * @since   1.8
     */
    class Decoder private constructor(private val isURL: Boolean, private val isMIME: Boolean) {

        /**
         * Decodes all bytes from the input byte array using the [Base64Internal]
         * encoding scheme, writing the results into a newly-allocated output
         * byte array. The returned byte array is of the length of the resulting
         * bytes.
         *
         * @param   src
         * the byte array to decode
         *
         * @return  A newly-allocated byte array containing the decoded bytes.
         *
         * @throws  IllegalArgumentException
         * if `src` is not in valid Base64 scheme
         */
        fun decode(src: ByteArray): ByteArray {
            var dst = ByteArray(outLength(src, 0, src.size))
            val ret = decode0(src, 0, src.size, dst)
            if (ret != dst.size) {
                dst = Arrays.copyOf(dst, ret)
            }
            return dst
        }

        /**
         * Decodes a Base64 encoded String into a newly-allocated byte array
         * using the [Base64Internal] encoding scheme.
         *
         *
         *  An invocation of this method has exactly the same effect as invoking
         * `decode(src.getBytes(StandardCharsets.ISO_8859_1))`
         *
         * @param   src
         * the string to decode
         *
         * @return  A newly-allocated byte array containing the decoded bytes.
         *
         * @throws  IllegalArgumentException
         * if `src` is not in valid Base64 scheme
         */
        fun decode(src: String): ByteArray {
            return decode(src.toByteArray(Charset.forName("ISO-8859-1")))
        }

        /**
         * Decodes all bytes from the input byte array using the [Base64Internal]
         * encoding scheme, writing the results into the given output byte array,
         * starting at offset 0.
         *
         *
         *  It is the responsibility of the invoker of this method to make
         * sure the output byte array `dst` has enough space for decoding
         * all bytes from the input byte array. No bytes will be be written to
         * the output byte array if the output byte array is not big enough.
         *
         *
         *  If the input byte array is not in valid Base64 encoding scheme
         * then some bytes may have been written to the output byte array before
         * IllegalargumentException is thrown.
         *
         * @param   src
         * the byte array to decode
         * @param   dst
         * the output byte array
         *
         * @return  The number of bytes written to the output byte array
         *
         * @throws  IllegalArgumentException
         * if `src` is not in valid Base64 scheme, or `dst`
         * does not have enough space for decoding all input bytes.
         */
        fun decode(src: ByteArray, dst: ByteArray): Int {
            val len = outLength(src, 0, src.size)
            if (dst.size < len)
                throw IllegalArgumentException(
                        "Output byte array is too small for decoding all input bytes")
            return decode0(src, 0, src.size, dst)
        }

        /**
         * Decodes all bytes from the input byte buffer using the [Base64Internal]
         * encoding scheme, writing the results into a newly-allocated ByteBuffer.
         *
         *
         *  Upon return, the source buffer's position will be updated to
         * its limit; its limit will not have been changed. The returned
         * output buffer's position will be zero and its limit will be the
         * number of resulting decoded bytes
         *
         *
         *  `IllegalArgumentException` is thrown if the input buffer
         * is not in valid Base64 encoding scheme. The position of the input
         * buffer will not be advanced in this case.
         *
         * @param   buffer
         * the ByteBuffer to decode
         *
         * @return  A newly-allocated byte buffer containing the decoded bytes
         *
         * @throws  IllegalArgumentException
         * if `src` is not in valid Base64 scheme.
         */
        fun decode(buffer: ByteBuffer): ByteBuffer {
            val pos0 = buffer.position()
            try {
                val src: ByteArray
                val sp: Int
                val sl: Int
                if (buffer.hasArray()) {
                    src = buffer.array()
                    sp = buffer.arrayOffset() + buffer.position()
                    sl = buffer.arrayOffset() + buffer.limit()
                    buffer.position(buffer.limit())
                } else {
                    src = ByteArray(buffer.remaining())
                    buffer.get(src)
                    sp = 0
                    sl = src.size
                }
                val dst = ByteArray(outLength(src, sp, sl))
                return ByteBuffer.wrap(dst, 0, decode0(src, sp, sl, dst))
            } catch (iae: IllegalArgumentException) {
                buffer.position(pos0)
                throw iae
            }

        }

        /**
         * Returns an input stream for decoding [Base64Internal] encoded byte stream.
         *
         *
         *  The `read`  methods of the returned `InputStream` will
         * throw `IOException` when reading bytes that cannot be decoded.
         *
         *
         *  Closing the returned input stream will close the underlying
         * input stream.
         *
         * @param   is
         * the input stream
         *
         * @return  the input stream for decoding the specified Base64 encoded
         * byte stream
         */
        fun wrap(`is`: InputStream?): InputStream {
            if (`is` == null) {
                throw NullPointerException()
            }
            return DecInputStream(`is`, if (isURL) fromBase64URL else fromBase64, isMIME)
        }

        private fun outLength(src: ByteArray, sp: Int, sl: Int): Int {
            var sp = sp
            val base64 = if (isURL) fromBase64URL else fromBase64
            var paddings = 0
            var len = sl - sp
            if (len == 0)
                return 0
            if (len < 2) {
                if (isMIME && base64[0] == -1)
                    return 0
                throw IllegalArgumentException(
                        "Input byte[] should at least have 2 bytes for base64 bytes")
            }
            if (isMIME) {
                // scan all bytes to fill out all non-alphabet. a performance
                // trade-off of pre-scan or Arrays.copyOf
                var n = 0
                while (sp < sl) {
                    var b = src[sp++].toInt() and 0xff
                    if (b == '='.toInt()) {
                        len -= sl - sp + 1
                        break
                    }
                    b = base64[b]
                    if ((b) == -1)
                        n++
                }
                len -= n
            } else {
                if (src[sl - 1] == '='.toByte()) {
                    paddings++
                    if (src[sl - 2] == '='.toByte())
                        paddings++
                }
            }
            if (paddings == 0 && len and 0x3 != 0)
                paddings = 4 - (len and 0x3)
            return 3 * ((len + 3) / 4) - paddings
        }

        private fun decode0(src: ByteArray, sp: Int, sl: Int, dst: ByteArray): Int {
            var sp = sp
            val base64 = if (isURL) fromBase64URL else fromBase64
            var dp = 0
            var bits = 0
            var shiftto = 18       // pos of first byte of 4-byte atom
            while (sp < sl) {
                var b = src[sp++].toInt() and 0xff
                b = base64[b]
                if ((b) < 0) {
                    if (b == -2) {         // padding byte '='
                        // =     shiftto==18 unnecessary padding
                        // x=    shiftto==12 a dangling single x
                        // x     to be handled together with non-padding case
                        // xx=   shiftto==6&&sp==sl missing last =
                        // xx=y  shiftto==6 last is not =
                        if (shiftto == 6 && (sp == sl || src[sp++] != '='.toByte()) || shiftto == 18) {
                            throw IllegalArgumentException(
                                    "Input byte array has wrong 4-byte ending unit")
                        }
                        break
                    }
                    if (isMIME)
                    // skip if for rfc2045
                        continue
                    else
                        throw IllegalArgumentException(
                                "Illegal base64 character " + Integer.toString(src[sp - 1].toInt(), 16))
                }
                bits = bits or (b shl shiftto)
                shiftto -= 6
                if (shiftto < 0) {
                    dst[dp++] = (bits shr 16).toByte()
                    dst[dp++] = (bits shr 8).toByte()
                    dst[dp++] = bits.toByte()
                    shiftto = 18
                    bits = 0
                }
            }
            // reached end of byte array or hit padding '=' characters.
            if (shiftto == 6) {
                dst[dp++] = (bits shr 16).toByte()
            } else if (shiftto == 0) {
                dst[dp++] = (bits shr 16).toByte()
                dst[dp++] = (bits shr 8).toByte()
            } else if (shiftto == 12) {
                // dangling single "x", incorrectly encoded.
                throw IllegalArgumentException(
                        "Last unit does not have enough valid bits")
            }
            // anything left is invalid, if is not MIME.
            // if MIME, ignore all non-base64 character
            while (sp < sl) {
                if (isMIME && base64[src[sp++].toInt()] < 0)
                    continue
                throw IllegalArgumentException(
                        "Input byte array has incorrect ending byte at $sp")
            }
            return dp
        }

        companion object {

            /**
             * Lookup table for decoding unicode characters drawn from the
             * "Base64 Alphabet" (as specified in Table 1 of RFC 2045) into
             * their 6-bit positive integer equivalents.  Characters that
             * are not in the Base64 alphabet but fall within the bounds of
             * the array are encoded to -1.
             *
             */
            val fromBase64 = IntArray(256)

            init {
                Arrays.fill(fromBase64, -1)
                for (i in Encoder.toBase64.indices)
                    fromBase64[Encoder.toBase64[i].toInt()] = i
                fromBase64['='.toInt()] = -2
            }

            /**
             * Lookup table for decoding "URL and Filename safe Base64 Alphabet"
             * as specified in Table2 of the RFC 4648.
             */
            private val fromBase64URL = IntArray(256)

            init {
                Arrays.fill(fromBase64URL, -1)
                for (i in Encoder.toBase64URL.indices)
                    fromBase64URL[Encoder.toBase64URL[i].toInt()] = i
                fromBase64URL['='.toInt()] = -2
            }

            internal val RFC4648 = Decoder(false, false)
            internal val RFC4648_URLSAFE = Decoder(true, false)
            internal val RFC2045 = Decoder(false, true)
        }
    }

    /*
     * An output stream for encoding bytes into the Base64.
     */
    private class EncOutputStream internal constructor(os: OutputStream, private val base64: CharArray    // byte->base64 mapping
                                                       ,
                                                       private val newline: ByteArray?   // line separator, if needed
                                                       , private val linemax: Int, private val doPadding: Boolean// whether or not to pad
    ) : FilterOutputStream(os) {

        private var leftover = 0
        private var b0: Int = 0
        private var b1: Int = 0
        private var b2: Int = 0
        private var closed = false
        private var linepos = 0

        @Throws(IOException::class)
        override fun write(b: Int) {
            val buf = ByteArray(1)
            buf[0] = (b and 0xff).toByte()
            write(buf, 0, 1)
        }

        @Throws(IOException::class)
        private fun checkNewline() {
            if (linepos == linemax) {
                out.write(newline)
                linepos = 0
            }
        }

        @Throws(IOException::class)
        override fun write(b: ByteArray, off: Int, len: Int) {
            var off = off
            var len = len
            if (closed)
                throw IOException("Stream is closed")
            if (off < 0 || len < 0 || off + len > b.size)
                throw ArrayIndexOutOfBoundsException()
            if (len == 0)
                return
            if (leftover != 0) {
                if (leftover == 1) {
                    b1 = b[off++].toInt() and 0xff
                    len--
                    if (len == 0) {
                        leftover++
                        return
                    }
                }
                b2 = b[off++].toInt() and 0xff
                len--
                checkNewline()
                out.write(base64[b0 shr 2].toInt())
                out.write(base64[b0 shl 4 and 0x3f or (b1 shr 4)].toInt())
                out.write(base64[b1 shl 2 and 0x3f or (b2 shr 6)].toInt())
                out.write(base64[b2 and 0x3f].toInt())
                linepos += 4
            }
            var nBits24 = len / 3
            leftover = len - nBits24 * 3
            while (nBits24-- > 0) {
                checkNewline()
                val bits = b[off++].toInt() and 0xff shl 16 or (
                        b[off++].toInt() and 0xff shl 8) or
                        (b[off++].toInt() and 0xff)
                out.write(base64[bits.ushr(18) and 0x3f].toInt())
                out.write(base64[bits.ushr(12) and 0x3f].toInt())
                out.write(base64[bits.ushr(6) and 0x3f].toInt())
                out.write(base64[bits and 0x3f].toInt())
                linepos += 4
            }
            if (leftover == 1) {
                b0 = b[off++].toInt() and 0xff
            } else if (leftover == 2) {
                b0 = b[off++].toInt() and 0xff
                b1 = b[off++].toInt() and 0xff
            }
        }

        @Throws(IOException::class)
        override fun close() {
            if (!closed) {
                closed = true
                if (leftover == 1) {
                    checkNewline()
                    out.write(base64[b0 shr 2].toInt())
                    out.write(base64[b0 shl 4 and 0x3f].toInt())
                    if (doPadding) {
                        out.write('='.toInt())
                        out.write('='.toInt())
                    }
                } else if (leftover == 2) {
                    checkNewline()
                    out.write(base64[b0 shr 2].toInt())
                    out.write(base64[b0 shl 4 and 0x3f or (b1 shr 4)].toInt())
                    out.write(base64[b1 shl 2 and 0x3f].toInt())
                    if (doPadding) {
                        out.write('='.toInt())
                    }
                }
                leftover = 0
                out.close()
            }
        }
    }

    /*
     * An input stream for decoding Base64 bytes
     */
    private class DecInputStream internal constructor(private val `is`: InputStream, private val base64: IntArray      // base64 -> byte mapping
                                                      , private val isMIME: Boolean) : InputStream() {
        private var bits = 0            // 24-bit buffer for decoding
        private var nextin = 18         // next available "off" in "bits" for input;
        // -> 18, 12, 6, 0
        private var nextout = -8        // next available "off" in "bits" for output;
        // -> 8, 0, -8 (no byte for output)
        private var eof = false
        private var closed = false

        private val sbBuf = ByteArray(1)

        @Throws(IOException::class)
        override fun read(): Int {
            return if (read(sbBuf, 0, 1) == -1) -1 else sbBuf[0].toInt() and 0xff
        }

        @Throws(IOException::class)
        override fun read(b: ByteArray, off: Int, len: Int): Int {
            var off = off
            var len = len
            if (closed)
                throw IOException("Stream is closed")
            if (eof && nextout < 0)
            // eof and no leftover
                return -1
            if (off < 0 || len < 0 || len > b.size - off)
                throw IndexOutOfBoundsException()
            val oldOff = off
            if (nextout >= 0) {       // leftover output byte(s) in bits buf
                do {
                    if (len == 0)
                        return off - oldOff
                    b[off++] = (bits shr nextout).toByte()
                    len--
                    nextout -= 8
                } while (nextout >= 0)
                bits = 0
            }
            while (len > 0) {
                var v = `is`.read()
                if (v == -1) {
                    eof = true
                    if (nextin != 18) {
                        if (nextin == 12)
                            throw IOException("Base64 stream has one un-decoded dangling byte.")
                        // treat ending xx/xxx without padding character legal.
                        // same logic as v == '=' below
                        b[off++] = (bits shr 16).toByte()
                        len--
                        if (nextin == 0) {           // only one padding byte
                            if (len == 0) {          // no enough output space
                                bits = bits shr 8          // shift to lowest byte
                                nextout = 0
                            } else {
                                b[off++] = (bits shr 8).toByte()
                            }
                        }
                    }
                    return if (off == oldOff)
                        -1
                    else
                        off - oldOff
                }
                if (v == '='.toInt()) {                  // padding byte(s)
                    // =     shiftto==18 unnecessary padding
                    // x=    shiftto==12 dangling x, invalid unit
                    // xx=   shiftto==6 && missing last '='
                    // xx=y  or last is not '='
                    if (nextin == 18 || nextin == 12 ||
                            nextin == 6 && `is`.read() != '='.toInt()) {
                        throw IOException("Illegal base64 ending sequence:$nextin")
                    }
                    b[off++] = (bits shr 16).toByte()
                    len--
                    if (nextin == 0) {           // only one padding byte
                        if (len == 0) {          // no enough output space
                            bits = bits shr 8          // shift to lowest byte
                            nextout = 0
                        } else {
                            b[off++] = (bits shr 8).toByte()
                        }
                    }
                    eof = true
                    break
                }
                v = base64[v]
                if ((v) == -1) {
                    if (isMIME)
                    // skip if for rfc2045
                        continue
                    else
                        throw IOException("Illegal base64 character " + Integer.toString(v, 16))
                }
                bits = bits or (v shl nextin)
                if (nextin == 0) {
                    nextin = 18    // clear for next
                    nextout = 16
                    while (nextout >= 0) {
                        b[off++] = (bits shr nextout).toByte()
                        len--
                        nextout -= 8
                        if (len == 0 && nextout >= 0) {  // don't clean "bits"
                            return off - oldOff
                        }
                    }
                    bits = 0
                } else {
                    nextin -= 6
                }
            }
            return off - oldOff
        }

        @Throws(IOException::class)
        override fun available(): Int {
            if (closed)
                throw IOException("Stream is closed")
            return `is`.available()   // TBD:
        }

        @Throws(IOException::class)
        override fun close() {
            if (!closed) {
                closed = true
                `is`.close()
            }
        }
    }
}

