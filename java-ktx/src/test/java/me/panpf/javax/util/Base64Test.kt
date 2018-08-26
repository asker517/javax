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

package me.panpf.javax.util

import org.junit.Assert
import org.junit.Test

import java.nio.ByteBuffer
import java.nio.charset.Charset

class Base64Test {

    @Test
    fun testToBytes() {
        Assert.assertArrayEquals(SOURCE_BYTES, SOURCE.encodeToBytes().decodeToBytes())
        Assert.assertArrayEquals(SOURCE_BYTES, SOURCE_BYTES.encodeToBytes().decodeToBytes())
        Assert.assertArrayEquals(SOURCE_BYTES, ByteBuffer.wrap(SOURCE_BYTES).encodeToBytes().decodeToBytes())
        Assert.assertArrayEquals(SOURCE_BYTES, SOURCE.encodeToString().decodeToBytes())
        Assert.assertArrayEquals(SOURCE_BYTES, ByteBuffer.wrap(SOURCE_BYTES).encodeToBuffer().decodeToBytes())

        Assert.assertArrayEquals(SOURCE_BYTES, SOURCE.urlEncodeToBytes().urlDecodeToBytes())
        Assert.assertArrayEquals(SOURCE_BYTES, SOURCE_BYTES.urlEncodeToBytes().urlDecodeToBytes())
        Assert.assertArrayEquals(SOURCE_BYTES, ByteBuffer.wrap(SOURCE_BYTES).urlEncodeToBytes().urlDecodeToBytes())
        Assert.assertArrayEquals(SOURCE_BYTES, SOURCE.urlEncodeToString().urlDecodeToBytes())
        Assert.assertArrayEquals(SOURCE_BYTES, SOURCE.urlEncodeToBuffer().urlDecodeToBytes())

        Assert.assertArrayEquals(SOURCE_BYTES, SOURCE.mimeEncodeToBytes().mimeDecodeToBytes())
        Assert.assertArrayEquals(SOURCE_BYTES, SOURCE_BYTES.mimeEncodeToBytes().mimeDecodeToBytes())
        Assert.assertArrayEquals(SOURCE_BYTES, ByteBuffer.wrap(SOURCE_BYTES).mimeEncodeToBytes().mimeDecodeToBytes())
        Assert.assertArrayEquals(SOURCE_BYTES, SOURCE.mimeEncodeToString().mimeDecodeToBytes())
        Assert.assertArrayEquals(SOURCE_BYTES, SOURCE.mimeEncodeToBuffer().mimeDecodeToBytes())

        Assert.assertArrayEquals(SOURCE_BYTES, SOURCE.mimeEncodeToBytes(10, ",".toByteArray()).mimeDecodeToBytes())
        Assert.assertArrayEquals(SOURCE_BYTES, SOURCE_BYTES.mimeEncodeToBytes(10, ",".toByteArray()).mimeDecodeToBytes())
        Assert.assertArrayEquals(SOURCE_BYTES, ByteBuffer.wrap(SOURCE_BYTES).mimeEncodeToBytes(10, ",".toByteArray()).mimeDecodeToBytes())
        Assert.assertArrayEquals(SOURCE_BYTES, SOURCE.mimeEncodeToString(10, ",".toByteArray()).mimeDecodeToBytes())
        Assert.assertArrayEquals(SOURCE_BYTES, SOURCE.mimeEncodeToBuffer(10, ",".toByteArray()).mimeDecodeToBytes())
    }

    @Test
    fun testToString() {
        Assert.assertEquals(SOURCE, SOURCE.encodeToString().decodeToString())
        Assert.assertEquals(SOURCE, SOURCE_BYTES.encodeToString().decodeToString())
        Assert.assertEquals(SOURCE, ByteBuffer.wrap(SOURCE_BYTES).encodeToString().decodeToString())
        Assert.assertEquals(SOURCE, SOURCE.encodeToBytes().decodeToString())
        Assert.assertEquals(SOURCE, SOURCE.encodeToBuffer().decodeToString())

        Assert.assertEquals(SOURCE, SOURCE.urlEncodeToString().urlDecodeToString())
        Assert.assertEquals(SOURCE, SOURCE_BYTES.urlEncodeToString().urlDecodeToString())
        Assert.assertEquals(SOURCE, ByteBuffer.wrap(SOURCE_BYTES).urlEncodeToString().urlDecodeToString())
        Assert.assertEquals(SOURCE, SOURCE.urlEncodeToBytes().urlDecodeToString())
        Assert.assertEquals(SOURCE, SOURCE.urlEncodeToBuffer().urlDecodeToString())

        Assert.assertEquals(SOURCE, SOURCE.mimeEncodeToString().mimeDecodeToString())
        Assert.assertEquals(SOURCE, SOURCE_BYTES.mimeEncodeToString().mimeDecodeToString())
        Assert.assertEquals(SOURCE, ByteBuffer.wrap(SOURCE_BYTES).mimeEncodeToString().mimeDecodeToString())
        Assert.assertEquals(SOURCE, SOURCE.mimeEncodeToBytes().mimeDecodeToString())
        Assert.assertEquals(SOURCE, SOURCE.mimeEncodeToBuffer().mimeDecodeToString())

        Assert.assertEquals(SOURCE, SOURCE.mimeEncodeToString(10, ",".toByteArray()).mimeDecodeToString())
        Assert.assertEquals(SOURCE, SOURCE_BYTES.mimeEncodeToString(10, ",".toByteArray()).mimeDecodeToString())
        Assert.assertEquals(SOURCE, ByteBuffer.wrap(SOURCE_BYTES).mimeEncodeToString(10, ",".toByteArray()).mimeDecodeToString())
        Assert.assertEquals(SOURCE, SOURCE.mimeEncodeToBytes(10, ",".toByteArray()).mimeDecodeToString())
        Assert.assertEquals(SOURCE, SOURCE.mimeEncodeToBuffer(10, ",".toByteArray()).mimeDecodeToString())
    }

    @Test
    fun testToBuffer() {
        Assert.assertArrayEquals(ByteBuffer.wrap(SOURCE_BYTES).array(), SOURCE.encodeToBuffer().decodeToBuffer().array())
        Assert.assertArrayEquals(ByteBuffer.wrap(SOURCE_BYTES).array(), SOURCE_BYTES.encodeToBuffer().decodeToBuffer().array())
        Assert.assertArrayEquals(ByteBuffer.wrap(SOURCE_BYTES).array(), ByteBuffer.wrap(SOURCE_BYTES).encodeToBuffer().decodeToBuffer().array())
        Assert.assertArrayEquals(ByteBuffer.wrap(SOURCE_BYTES).array(), SOURCE.encodeToBytes().decodeToBuffer().array())
        Assert.assertArrayEquals(ByteBuffer.wrap(SOURCE_BYTES).array(), SOURCE.encodeToString().decodeToBuffer().array())

        Assert.assertArrayEquals(ByteBuffer.wrap(SOURCE_BYTES).array(), SOURCE.urlEncodeToBuffer().urlDecodeToBuffer().array())
        Assert.assertArrayEquals(ByteBuffer.wrap(SOURCE_BYTES).array(), SOURCE_BYTES.urlEncodeToBuffer().urlDecodeToBuffer().array())
        Assert.assertArrayEquals(ByteBuffer.wrap(SOURCE_BYTES).array(), ByteBuffer.wrap(SOURCE_BYTES).urlEncodeToBuffer().urlDecodeToBuffer().array())
        Assert.assertArrayEquals(ByteBuffer.wrap(SOURCE_BYTES).array(), SOURCE.urlEncodeToBytes().urlDecodeToBuffer().array())
        Assert.assertArrayEquals(ByteBuffer.wrap(SOURCE_BYTES).array(), SOURCE.urlEncodeToString().urlDecodeToBuffer().array())

        Assert.assertArrayEquals(ByteBuffer.wrap(SOURCE_BYTES).array(), SOURCE.mimeEncodeToBuffer().mimeDecodeToBuffer().array())
        Assert.assertArrayEquals(ByteBuffer.wrap(SOURCE_BYTES).array(), SOURCE_BYTES.mimeEncodeToBuffer().mimeDecodeToBuffer().array())
        Assert.assertArrayEquals(ByteBuffer.wrap(SOURCE_BYTES).array(), ByteBuffer.wrap(SOURCE_BYTES).mimeEncodeToBuffer().mimeDecodeToBuffer().array())
        Assert.assertArrayEquals(ByteBuffer.wrap(SOURCE_BYTES).array(), SOURCE.mimeEncodeToBytes().mimeDecodeToBuffer().array())
        Assert.assertArrayEquals(ByteBuffer.wrap(SOURCE_BYTES).array(), SOURCE.mimeEncodeToString().mimeDecodeToBuffer().array())

        Assert.assertArrayEquals(ByteBuffer.wrap(SOURCE_BYTES).array(), SOURCE.mimeEncodeToBuffer(10, ",".toByteArray()).mimeDecodeToBuffer().array())
        Assert.assertArrayEquals(ByteBuffer.wrap(SOURCE_BYTES).array(), SOURCE_BYTES.mimeEncodeToBuffer(10, ",".toByteArray()).mimeDecodeToBuffer().array())
        Assert.assertArrayEquals(ByteBuffer.wrap(SOURCE_BYTES).array(), ByteBuffer.wrap(SOURCE_BYTES).mimeEncodeToBuffer(10, ",".toByteArray()).mimeDecodeToBuffer().array())
        Assert.assertArrayEquals(ByteBuffer.wrap(SOURCE_BYTES).array(), SOURCE.mimeEncodeToBytes(10, ",".toByteArray()).mimeDecodeToBuffer().array())
        Assert.assertArrayEquals(ByteBuffer.wrap(SOURCE_BYTES).array(), SOURCE.mimeEncodeToString(10, ",".toByteArray()).mimeDecodeToBuffer().array())
    }

    @Test
    fun testTo() {
        val encodeResult = ByteArray(SOURCE.length * 8)
        val decodeResult = ByteArray(SOURCE.length * 8)
        var encodeLength: Int
        var decodeLength: Int

        // encodeTo
        encodeLength = SOURCE.encodeTo(encodeResult)
        decodeLength = encodeResult.copyOf(encodeLength).decodeTo(decodeResult)
        Assert.assertEquals(SOURCE, String(decodeResult, 0, decodeLength))

        encodeLength = SOURCE_BYTES.encodeTo(encodeResult)
        decodeLength = encodeResult.copyOf(encodeLength).decodeTo(decodeResult)
        Assert.assertEquals(SOURCE, String(decodeResult, 0, decodeLength))

        encodeLength = ByteBuffer.wrap(SOURCE_BYTES).encodeTo(encodeResult)
        decodeLength = ByteBuffer.wrap(encodeResult.copyOf(encodeLength)).decodeTo(decodeResult)
        Assert.assertEquals(SOURCE, String(decodeResult, 0, decodeLength))

        decodeLength = SOURCE.encodeToString().decodeTo(decodeResult)
        Assert.assertEquals(SOURCE, String(decodeResult, 0, decodeLength))


        // urlEncodeTo
        encodeLength = SOURCE.urlEncodeTo(encodeResult)
        decodeLength = encodeResult.copyOf(encodeLength).urlDecodeTo(decodeResult)
        Assert.assertEquals(SOURCE, String(decodeResult, 0, decodeLength))

        encodeLength = SOURCE_BYTES.urlEncodeTo(encodeResult)
        decodeLength = encodeResult.copyOf(encodeLength).urlDecodeTo(decodeResult)
        Assert.assertEquals(SOURCE, String(decodeResult, 0, decodeLength))

        encodeLength = ByteBuffer.wrap(SOURCE_BYTES).urlEncodeTo(encodeResult)
        decodeLength = ByteBuffer.wrap(encodeResult.copyOf(encodeLength)).urlDecodeTo(decodeResult)
        Assert.assertEquals(SOURCE, String(decodeResult, 0, decodeLength))

        decodeLength = SOURCE.urlEncodeToString().urlDecodeTo(decodeResult)
        Assert.assertEquals(SOURCE, String(decodeResult, 0, decodeLength))


        // mimeEncodeTo
        encodeLength = SOURCE.mimeEncodeTo(encodeResult)
        decodeLength = encodeResult.copyOf(encodeLength).mimeDecodeTo(decodeResult)
        Assert.assertEquals(SOURCE, String(decodeResult, 0, decodeLength))

        encodeLength = SOURCE_BYTES.mimeEncodeTo(encodeResult)
        decodeLength = encodeResult.copyOf(encodeLength).mimeDecodeTo(decodeResult)
        Assert.assertEquals(SOURCE, String(decodeResult, 0, decodeLength))

        encodeLength = ByteBuffer.wrap(SOURCE_BYTES).mimeEncodeTo(encodeResult)
        decodeLength = ByteBuffer.wrap(encodeResult.copyOf(encodeLength)).mimeDecodeTo(decodeResult)
        Assert.assertEquals(SOURCE, String(decodeResult, 0, decodeLength))

        decodeLength = SOURCE.mimeEncodeToString().mimeDecodeTo(decodeResult)
        Assert.assertEquals(SOURCE, String(decodeResult, 0, decodeLength))


        // mimeEncodeTo int lineLength, @NotNull byte[] lineSeparator
        encodeLength = SOURCE.mimeEncodeTo(10, ",".toByteArray(), encodeResult)
        decodeLength = encodeResult.copyOf(encodeLength).mimeDecodeTo(decodeResult)
        Assert.assertEquals(SOURCE, String(decodeResult, 0, decodeLength))

        encodeLength = SOURCE_BYTES.mimeEncodeTo(10, ",".toByteArray(), encodeResult)
        decodeLength = encodeResult.copyOf(encodeLength).mimeDecodeTo(decodeResult)
        Assert.assertEquals(SOURCE, String(decodeResult, 0, decodeLength))

        encodeLength = ByteBuffer.wrap(SOURCE_BYTES).mimeEncodeTo(10, ",".toByteArray(), encodeResult)
        decodeLength = ByteBuffer.wrap(encodeResult.copyOf(encodeLength)).mimeDecodeTo(decodeResult)
        Assert.assertEquals(SOURCE, String(decodeResult, 0, decodeLength))

        decodeLength = SOURCE.mimeEncodeToString().mimeDecodeTo(decodeResult)
        Assert.assertEquals(SOURCE, String(decodeResult, 0, decodeLength))
    }

    companion object {
        private const val SOURCE = "上山打老虎"
        private val SOURCE_BYTES = SOURCE.toByteArray(Charset.forName("UTF-8"))
    }
}
