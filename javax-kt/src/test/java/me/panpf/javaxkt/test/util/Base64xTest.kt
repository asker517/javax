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

package me.panpf.javaxkt.test.util

import me.panpf.javaxkt.util.*
import org.junit.Assert
import org.junit.Test

import java.nio.ByteBuffer
import java.nio.charset.Charset

class Base64xTest {

    @Test
    fun testToBytes() {
        Assert.assertArrayEquals(SOURCE_BYTES, SOURCE.base64EncodeToBytes().base64DecodeToBytes())
        Assert.assertArrayEquals(SOURCE_BYTES, SOURCE_BYTES.base64EncodeToBytes().base64DecodeToBytes())
        Assert.assertArrayEquals(SOURCE_BYTES, ByteBuffer.wrap(SOURCE_BYTES).base64EncodeToBytes().base64DecodeToBytes())
        Assert.assertArrayEquals(SOURCE_BYTES, SOURCE.base64EncodeToString().base64DecodeToBytes())
        Assert.assertArrayEquals(SOURCE_BYTES, ByteBuffer.wrap(SOURCE_BYTES).base64EncodeToBuffer().base64DecodeToBytes())

        Assert.assertArrayEquals(SOURCE_BYTES, SOURCE.base64UrlEncodeToBytes().base64UrlDecodeToBytes())
        Assert.assertArrayEquals(SOURCE_BYTES, SOURCE_BYTES.base64UrlEncodeToBytes().base64UrlDecodeToBytes())
        Assert.assertArrayEquals(SOURCE_BYTES, ByteBuffer.wrap(SOURCE_BYTES).base64UrlEncodeToBytes().base64UrlDecodeToBytes())
        Assert.assertArrayEquals(SOURCE_BYTES, SOURCE.base64UrlEncodeToString().base64UrlDecodeToBytes())
        Assert.assertArrayEquals(SOURCE_BYTES, SOURCE.base64UrlEncodeToBuffer().base64UrlDecodeToBytes())

        Assert.assertArrayEquals(SOURCE_BYTES, SOURCE.base64MimeEncodeToBytes().base64MimeDecodeToBytes())
        Assert.assertArrayEquals(SOURCE_BYTES, SOURCE_BYTES.base64MimeEncodeToBytes().base64MimeDecodeToBytes())
        Assert.assertArrayEquals(SOURCE_BYTES, ByteBuffer.wrap(SOURCE_BYTES).base64MimeEncodeToBytes().base64MimeDecodeToBytes())
        Assert.assertArrayEquals(SOURCE_BYTES, SOURCE.base64MimeEncodeToString().base64MimeDecodeToBytes())
        Assert.assertArrayEquals(SOURCE_BYTES, SOURCE.base64MimeEncodeToBuffer().base64MimeDecodeToBytes())

        Assert.assertArrayEquals(SOURCE_BYTES, SOURCE.base64MimeEncodeToBytes(10, ",".toByteArray()).base64MimeDecodeToBytes())
        Assert.assertArrayEquals(SOURCE_BYTES, SOURCE_BYTES.base64MimeEncodeToBytes(10, ",".toByteArray()).base64MimeDecodeToBytes())
        Assert.assertArrayEquals(SOURCE_BYTES, ByteBuffer.wrap(SOURCE_BYTES).base64MimeEncodeToBytes(10, ",".toByteArray()).base64MimeDecodeToBytes())
        Assert.assertArrayEquals(SOURCE_BYTES, SOURCE.base64MimeEncodeToString(10, ",".toByteArray()).base64MimeDecodeToBytes())
        Assert.assertArrayEquals(SOURCE_BYTES, SOURCE.base64MimeEncodeToBuffer(10, ",".toByteArray()).base64MimeDecodeToBytes())

        arrayOf("").iterator()
    }

    @Test
    fun testToString() {
        Assert.assertEquals(SOURCE, SOURCE.base64EncodeToString().base64DecodeToString())
        Assert.assertEquals(SOURCE, SOURCE_BYTES.base64EncodeToString().base64DecodeToString())
        Assert.assertEquals(SOURCE, ByteBuffer.wrap(SOURCE_BYTES).base64EncodeToString().base64DecodeToString())
        Assert.assertEquals(SOURCE, SOURCE.base64EncodeToBytes().base64DecodeToString())
        Assert.assertEquals(SOURCE, SOURCE.base64EncodeToBuffer().base64DecodeToString())

        Assert.assertEquals(SOURCE, SOURCE.base64UrlEncodeToString().base64UrlDecodeToString())
        Assert.assertEquals(SOURCE, SOURCE_BYTES.base64UrlEncodeToString().base64UrlDecodeToString())
        Assert.assertEquals(SOURCE, ByteBuffer.wrap(SOURCE_BYTES).base64UrlEncodeToString().base64UrlDecodeToString())
        Assert.assertEquals(SOURCE, SOURCE.base64UrlEncodeToBytes().base64UrlDecodeToString())
        Assert.assertEquals(SOURCE, SOURCE.base64UrlEncodeToBuffer().base64UrlDecodeToString())

        Assert.assertEquals(SOURCE, SOURCE.base64MimeEncodeToString().base64MimeDecodeToString())
        Assert.assertEquals(SOURCE, SOURCE_BYTES.base64MimeEncodeToString().base64MimeDecodeToString())
        Assert.assertEquals(SOURCE, ByteBuffer.wrap(SOURCE_BYTES).base64MimeEncodeToString().base64MimeDecodeToString())
        Assert.assertEquals(SOURCE, SOURCE.base64MimeEncodeToBytes().base64MimeDecodeToString())
        Assert.assertEquals(SOURCE, SOURCE.base64MimeEncodeToBuffer().base64MimeDecodeToString())

        Assert.assertEquals(SOURCE, SOURCE.base64MimeEncodeToString(10, ",".toByteArray()).base64MimeDecodeToString())
        Assert.assertEquals(SOURCE, SOURCE_BYTES.base64MimeEncodeToString(10, ",".toByteArray()).base64MimeDecodeToString())
        Assert.assertEquals(SOURCE, ByteBuffer.wrap(SOURCE_BYTES).base64MimeEncodeToString(10, ",".toByteArray()).base64MimeDecodeToString())
        Assert.assertEquals(SOURCE, SOURCE.base64MimeEncodeToBytes(10, ",".toByteArray()).base64MimeDecodeToString())
        Assert.assertEquals(SOURCE, SOURCE.base64MimeEncodeToBuffer(10, ",".toByteArray()).base64MimeDecodeToString())
    }

    @Test
    fun testToBuffer() {
        Assert.assertArrayEquals(ByteBuffer.wrap(SOURCE_BYTES).array(), SOURCE.base64EncodeToBuffer().base64DecodeToBuffer().array())
        Assert.assertArrayEquals(ByteBuffer.wrap(SOURCE_BYTES).array(), SOURCE_BYTES.base64EncodeToBuffer().base64DecodeToBuffer().array())
        Assert.assertArrayEquals(ByteBuffer.wrap(SOURCE_BYTES).array(), ByteBuffer.wrap(SOURCE_BYTES).base64EncodeToBuffer().base64DecodeToBuffer().array())
        Assert.assertArrayEquals(ByteBuffer.wrap(SOURCE_BYTES).array(), SOURCE.base64EncodeToBytes().base64DecodeToBuffer().array())
        Assert.assertArrayEquals(ByteBuffer.wrap(SOURCE_BYTES).array(), SOURCE.base64EncodeToString().base64DecodeToBuffer().array())

        Assert.assertArrayEquals(ByteBuffer.wrap(SOURCE_BYTES).array(), SOURCE.base64UrlEncodeToBuffer().base64UrlDecodeToBuffer().array())
        Assert.assertArrayEquals(ByteBuffer.wrap(SOURCE_BYTES).array(), SOURCE_BYTES.base64UrlEncodeToBuffer().base64UrlDecodeToBuffer().array())
        Assert.assertArrayEquals(ByteBuffer.wrap(SOURCE_BYTES).array(), ByteBuffer.wrap(SOURCE_BYTES).base64UrlEncodeToBuffer().base64UrlDecodeToBuffer().array())
        Assert.assertArrayEquals(ByteBuffer.wrap(SOURCE_BYTES).array(), SOURCE.base64UrlEncodeToBytes().base64UrlDecodeToBuffer().array())
        Assert.assertArrayEquals(ByteBuffer.wrap(SOURCE_BYTES).array(), SOURCE.base64UrlEncodeToString().base64UrlDecodeToBuffer().array())

        Assert.assertArrayEquals(ByteBuffer.wrap(SOURCE_BYTES).array(), SOURCE.base64MimeEncodeToBuffer().base64MimeDecodeToBuffer().array())
        Assert.assertArrayEquals(ByteBuffer.wrap(SOURCE_BYTES).array(), SOURCE_BYTES.base64MimeEncodeToBuffer().base64MimeDecodeToBuffer().array())
        Assert.assertArrayEquals(ByteBuffer.wrap(SOURCE_BYTES).array(), ByteBuffer.wrap(SOURCE_BYTES).base64MimeEncodeToBuffer().base64MimeDecodeToBuffer().array())
        Assert.assertArrayEquals(ByteBuffer.wrap(SOURCE_BYTES).array(), SOURCE.base64MimeEncodeToBytes().base64MimeDecodeToBuffer().array())
        Assert.assertArrayEquals(ByteBuffer.wrap(SOURCE_BYTES).array(), SOURCE.base64MimeEncodeToString().base64MimeDecodeToBuffer().array())

        Assert.assertArrayEquals(ByteBuffer.wrap(SOURCE_BYTES).array(), SOURCE.base64MimeEncodeToBuffer(10, ",".toByteArray()).base64MimeDecodeToBuffer().array())
        Assert.assertArrayEquals(ByteBuffer.wrap(SOURCE_BYTES).array(), SOURCE_BYTES.base64MimeEncodeToBuffer(10, ",".toByteArray()).base64MimeDecodeToBuffer().array())
        Assert.assertArrayEquals(ByteBuffer.wrap(SOURCE_BYTES).array(), ByteBuffer.wrap(SOURCE_BYTES).base64MimeEncodeToBuffer(10, ",".toByteArray()).base64MimeDecodeToBuffer().array())
        Assert.assertArrayEquals(ByteBuffer.wrap(SOURCE_BYTES).array(), SOURCE.base64MimeEncodeToBytes(10, ",".toByteArray()).base64MimeDecodeToBuffer().array())
        Assert.assertArrayEquals(ByteBuffer.wrap(SOURCE_BYTES).array(), SOURCE.base64MimeEncodeToString(10, ",".toByteArray()).base64MimeDecodeToBuffer().array())
    }

    @Test
    fun testTo() {
        val encodeResult = ByteArray(SOURCE.length * 8)
        val decodeResult = ByteArray(SOURCE.length * 8)
        var encodeLength: Int
        var decodeLength: Int

        // encodeTo
        encodeLength = SOURCE.base64EncodeTo(encodeResult)
        decodeLength = encodeResult.copyOf(encodeLength).base64DecodeTo(decodeResult)
        Assert.assertEquals(SOURCE, String(decodeResult, 0, decodeLength))

        encodeLength = SOURCE_BYTES.base64EncodeTo(encodeResult)
        decodeLength = encodeResult.copyOf(encodeLength).base64DecodeTo(decodeResult)
        Assert.assertEquals(SOURCE, String(decodeResult, 0, decodeLength))

        encodeLength = ByteBuffer.wrap(SOURCE_BYTES).base64EncodeTo(encodeResult)
        decodeLength = ByteBuffer.wrap(encodeResult.copyOf(encodeLength)).base64DecodeTo(decodeResult)
        Assert.assertEquals(SOURCE, String(decodeResult, 0, decodeLength))

        decodeLength = SOURCE.base64EncodeToString().base64DecodeTo(decodeResult)
        Assert.assertEquals(SOURCE, String(decodeResult, 0, decodeLength))


        // urlEncodeTo
        encodeLength = SOURCE.base64UrlEncodeTo(encodeResult)
        decodeLength = encodeResult.copyOf(encodeLength).base64UrlDecodeTo(decodeResult)
        Assert.assertEquals(SOURCE, String(decodeResult, 0, decodeLength))

        encodeLength = SOURCE_BYTES.base64UrlEncodeTo(encodeResult)
        decodeLength = encodeResult.copyOf(encodeLength).base64UrlDecodeTo(decodeResult)
        Assert.assertEquals(SOURCE, String(decodeResult, 0, decodeLength))

        encodeLength = ByteBuffer.wrap(SOURCE_BYTES).base64UrlEncodeTo(encodeResult)
        decodeLength = ByteBuffer.wrap(encodeResult.copyOf(encodeLength)).base64UrlDecodeTo(decodeResult)
        Assert.assertEquals(SOURCE, String(decodeResult, 0, decodeLength))

        decodeLength = SOURCE.base64UrlEncodeToString().base64UrlDecodeTo(decodeResult)
        Assert.assertEquals(SOURCE, String(decodeResult, 0, decodeLength))


        // mimeEncodeTo
        encodeLength = SOURCE.base64MimeEncodeTo(encodeResult)
        decodeLength = encodeResult.copyOf(encodeLength).base64MimeDecodeTo(decodeResult)
        Assert.assertEquals(SOURCE, String(decodeResult, 0, decodeLength))

        encodeLength = SOURCE_BYTES.base64MimeEncodeTo(encodeResult)
        decodeLength = encodeResult.copyOf(encodeLength).base64MimeDecodeTo(decodeResult)
        Assert.assertEquals(SOURCE, String(decodeResult, 0, decodeLength))

        encodeLength = ByteBuffer.wrap(SOURCE_BYTES).base64MimeEncodeTo(encodeResult)
        decodeLength = ByteBuffer.wrap(encodeResult.copyOf(encodeLength)).base64MimeDecodeTo(decodeResult)
        Assert.assertEquals(SOURCE, String(decodeResult, 0, decodeLength))

        decodeLength = SOURCE.base64MimeEncodeToString().base64MimeDecodeTo(decodeResult)
        Assert.assertEquals(SOURCE, String(decodeResult, 0, decodeLength))


        // mimeEncodeTo int lineLength, @NotNull byte[] lineSeparator
        encodeLength = SOURCE.base64MimeEncodeTo(10, ",".toByteArray(), encodeResult)
        decodeLength = encodeResult.copyOf(encodeLength).base64MimeDecodeTo(decodeResult)
        Assert.assertEquals(SOURCE, String(decodeResult, 0, decodeLength))

        encodeLength = SOURCE_BYTES.base64MimeEncodeTo(10, ",".toByteArray(), encodeResult)
        decodeLength = encodeResult.copyOf(encodeLength).base64MimeDecodeTo(decodeResult)
        Assert.assertEquals(SOURCE, String(decodeResult, 0, decodeLength))

        encodeLength = ByteBuffer.wrap(SOURCE_BYTES).base64MimeEncodeTo(10, ",".toByteArray(), encodeResult)
        decodeLength = ByteBuffer.wrap(encodeResult.copyOf(encodeLength)).base64MimeDecodeTo(decodeResult)
        Assert.assertEquals(SOURCE, String(decodeResult, 0, decodeLength))

        decodeLength = SOURCE.base64MimeEncodeToString().base64MimeDecodeTo(decodeResult)
        Assert.assertEquals(SOURCE, String(decodeResult, 0, decodeLength))
    }

    companion object {
        private const val SOURCE = "上山打老虎"
        private val SOURCE_BYTES = SOURCE.toByteArray(Charset.forName("UTF-8"))
    }
}
