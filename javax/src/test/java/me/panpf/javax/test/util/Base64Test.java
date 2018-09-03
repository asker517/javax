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

package me.panpf.javax.test.util;

import me.panpf.javax.util.Arrayx;
import me.panpf.javax.util.Base64x;
import org.junit.Assert;
import org.junit.Test;

import java.nio.ByteBuffer;
import java.nio.charset.Charset;

public class Base64Test {

    private static final String SOURCE = "上山打老虎";
    private static final byte[] SOURCE_BYTES = SOURCE.getBytes(Charset.forName("UTF-8"));

    @Test
    public void testToBytes() {
        Assert.assertArrayEquals(SOURCE_BYTES, Base64x.decodeToBytes(Base64x.encodeToBytes(SOURCE)));
        Assert.assertArrayEquals(SOURCE_BYTES, Base64x.decodeToBytes(Base64x.encodeToBytes(SOURCE_BYTES)));
        Assert.assertArrayEquals(SOURCE_BYTES, Base64x.decodeToBytes(Base64x.encodeToBytes(ByteBuffer.wrap(SOURCE_BYTES))));
        Assert.assertArrayEquals(SOURCE_BYTES, Base64x.decodeToBytes(Base64x.encodeToString(SOURCE)));
        Assert.assertArrayEquals(SOURCE_BYTES, Base64x.decodeToBytes(Base64x.encodeToBuffer(ByteBuffer.wrap(SOURCE_BYTES))));

        Assert.assertArrayEquals(SOURCE_BYTES, Base64x.urlDecodeToBytes(Base64x.urlEncodeToBytes(SOURCE)));
        Assert.assertArrayEquals(SOURCE_BYTES, Base64x.urlDecodeToBytes(Base64x.urlEncodeToBytes(SOURCE_BYTES)));
        Assert.assertArrayEquals(SOURCE_BYTES, Base64x.urlDecodeToBytes(Base64x.urlEncodeToBytes(ByteBuffer.wrap(SOURCE_BYTES))));
        Assert.assertArrayEquals(SOURCE_BYTES, Base64x.urlDecodeToBytes(Base64x.urlEncodeToString(SOURCE)));
        Assert.assertArrayEquals(SOURCE_BYTES, Base64x.urlDecodeToBytes(Base64x.urlEncodeToBuffer(SOURCE)));

        Assert.assertArrayEquals(SOURCE_BYTES, Base64x.mimeDecodeToBytes(Base64x.mimeEncodeToBytes(SOURCE)));
        Assert.assertArrayEquals(SOURCE_BYTES, Base64x.mimeDecodeToBytes(Base64x.mimeEncodeToBytes(SOURCE_BYTES)));
        Assert.assertArrayEquals(SOURCE_BYTES, Base64x.mimeDecodeToBytes(Base64x.mimeEncodeToBytes(ByteBuffer.wrap(SOURCE_BYTES))));
        Assert.assertArrayEquals(SOURCE_BYTES, Base64x.mimeDecodeToBytes(Base64x.mimeEncodeToString(SOURCE)));
        Assert.assertArrayEquals(SOURCE_BYTES, Base64x.mimeDecodeToBytes(Base64x.mimeEncodeToBuffer(SOURCE)));

        Assert.assertArrayEquals(SOURCE_BYTES, Base64x.mimeDecodeToBytes(Base64x.mimeEncodeToBytes(10, ",".getBytes(), SOURCE)));
        Assert.assertArrayEquals(SOURCE_BYTES, Base64x.mimeDecodeToBytes(Base64x.mimeEncodeToBytes(10, ",".getBytes(), SOURCE_BYTES)));
        Assert.assertArrayEquals(SOURCE_BYTES, Base64x.mimeDecodeToBytes(Base64x.mimeEncodeToBytes(10, ",".getBytes(), ByteBuffer.wrap(SOURCE_BYTES))));
        Assert.assertArrayEquals(SOURCE_BYTES, Base64x.mimeDecodeToBytes(Base64x.mimeEncodeToString(10, ",".getBytes(), SOURCE)));
        Assert.assertArrayEquals(SOURCE_BYTES, Base64x.mimeDecodeToBytes(Base64x.mimeEncodeToBuffer(10, ",".getBytes(), SOURCE)));
    }

    @Test
    public void testToString() {
        Assert.assertEquals(SOURCE, Base64x.decodeToString(Base64x.encodeToString(SOURCE)));
        Assert.assertEquals(SOURCE, Base64x.decodeToString(Base64x.encodeToString(SOURCE_BYTES)));
        Assert.assertEquals(SOURCE, Base64x.decodeToString(Base64x.encodeToString(ByteBuffer.wrap(SOURCE_BYTES))));
        Assert.assertEquals(SOURCE, Base64x.decodeToString(Base64x.encodeToBytes(SOURCE)));
        Assert.assertEquals(SOURCE, Base64x.decodeToString(Base64x.encodeToBuffer(SOURCE)));

        Assert.assertEquals(SOURCE, Base64x.urlDecodeToString(Base64x.urlEncodeToString(SOURCE)));
        Assert.assertEquals(SOURCE, Base64x.urlDecodeToString(Base64x.urlEncodeToString(SOURCE_BYTES)));
        Assert.assertEquals(SOURCE, Base64x.urlDecodeToString(Base64x.urlEncodeToString(ByteBuffer.wrap(SOURCE_BYTES))));
        Assert.assertEquals(SOURCE, Base64x.urlDecodeToString(Base64x.urlEncodeToBytes(SOURCE)));
        Assert.assertEquals(SOURCE, Base64x.urlDecodeToString(Base64x.urlEncodeToBuffer(SOURCE)));

        Assert.assertEquals(SOURCE, Base64x.mimeDecodeToString(Base64x.mimeEncodeToString(SOURCE)));
        Assert.assertEquals(SOURCE, Base64x.mimeDecodeToString(Base64x.mimeEncodeToString(SOURCE_BYTES)));
        Assert.assertEquals(SOURCE, Base64x.mimeDecodeToString(Base64x.mimeEncodeToString(ByteBuffer.wrap(SOURCE_BYTES))));
        Assert.assertEquals(SOURCE, Base64x.mimeDecodeToString(Base64x.mimeEncodeToBytes(SOURCE)));
        Assert.assertEquals(SOURCE, Base64x.mimeDecodeToString(Base64x.mimeEncodeToBuffer(SOURCE)));

        Assert.assertEquals(SOURCE, Base64x.mimeDecodeToString(Base64x.mimeEncodeToString(10, ",".getBytes(), SOURCE)));
        Assert.assertEquals(SOURCE, Base64x.mimeDecodeToString(Base64x.mimeEncodeToString(10, ",".getBytes(), SOURCE_BYTES)));
        Assert.assertEquals(SOURCE, Base64x.mimeDecodeToString(Base64x.mimeEncodeToString(10, ",".getBytes(), ByteBuffer.wrap(SOURCE_BYTES))));
        Assert.assertEquals(SOURCE, Base64x.mimeDecodeToString(Base64x.mimeEncodeToBytes(10, ",".getBytes(), SOURCE)));
        Assert.assertEquals(SOURCE, Base64x.mimeDecodeToString(Base64x.mimeEncodeToBuffer(10, ",".getBytes(), SOURCE)));
    }

    @Test
    public void testToBuffer() {
        Assert.assertArrayEquals(ByteBuffer.wrap(SOURCE_BYTES).array(), Base64x.decodeToBuffer(Base64x.encodeToBuffer(SOURCE)).array());
        Assert.assertArrayEquals(ByteBuffer.wrap(SOURCE_BYTES).array(), Base64x.decodeToBuffer(Base64x.encodeToBuffer(SOURCE_BYTES)).array());
        Assert.assertArrayEquals(ByteBuffer.wrap(SOURCE_BYTES).array(), Base64x.decodeToBuffer(Base64x.encodeToBuffer(ByteBuffer.wrap(SOURCE_BYTES))).array());
        Assert.assertArrayEquals(ByteBuffer.wrap(SOURCE_BYTES).array(), Base64x.decodeToBuffer(Base64x.encodeToBytes(SOURCE)).array());
        Assert.assertArrayEquals(ByteBuffer.wrap(SOURCE_BYTES).array(), Base64x.decodeToBuffer(Base64x.encodeToString(SOURCE)).array());

        Assert.assertArrayEquals(ByteBuffer.wrap(SOURCE_BYTES).array(), Base64x.urlDecodeToBuffer(Base64x.urlEncodeToBuffer(SOURCE)).array());
        Assert.assertArrayEquals(ByteBuffer.wrap(SOURCE_BYTES).array(), Base64x.urlDecodeToBuffer(Base64x.urlEncodeToBuffer(SOURCE_BYTES)).array());
        Assert.assertArrayEquals(ByteBuffer.wrap(SOURCE_BYTES).array(), Base64x.urlDecodeToBuffer(Base64x.urlEncodeToBuffer(ByteBuffer.wrap(SOURCE_BYTES))).array());
        Assert.assertArrayEquals(ByteBuffer.wrap(SOURCE_BYTES).array(), Base64x.urlDecodeToBuffer(Base64x.urlEncodeToBytes(SOURCE)).array());
        Assert.assertArrayEquals(ByteBuffer.wrap(SOURCE_BYTES).array(), Base64x.urlDecodeToBuffer(Base64x.urlEncodeToString(SOURCE)).array());

        Assert.assertArrayEquals(ByteBuffer.wrap(SOURCE_BYTES).array(), Base64x.mimeDecodeToBuffer(Base64x.mimeEncodeToBuffer(SOURCE)).array());
        Assert.assertArrayEquals(ByteBuffer.wrap(SOURCE_BYTES).array(), Base64x.mimeDecodeToBuffer(Base64x.mimeEncodeToBuffer(SOURCE_BYTES)).array());
        Assert.assertArrayEquals(ByteBuffer.wrap(SOURCE_BYTES).array(), Base64x.mimeDecodeToBuffer(Base64x.mimeEncodeToBuffer(ByteBuffer.wrap(SOURCE_BYTES))).array());
        Assert.assertArrayEquals(ByteBuffer.wrap(SOURCE_BYTES).array(), Base64x.mimeDecodeToBuffer(Base64x.mimeEncodeToBytes(SOURCE)).array());
        Assert.assertArrayEquals(ByteBuffer.wrap(SOURCE_BYTES).array(), Base64x.mimeDecodeToBuffer(Base64x.mimeEncodeToString(SOURCE)).array());

        Assert.assertArrayEquals(ByteBuffer.wrap(SOURCE_BYTES).array(), Base64x.mimeDecodeToBuffer(Base64x.mimeEncodeToBuffer(10, ",".getBytes(), SOURCE)).array());
        Assert.assertArrayEquals(ByteBuffer.wrap(SOURCE_BYTES).array(), Base64x.mimeDecodeToBuffer(Base64x.mimeEncodeToBuffer(10, ",".getBytes(), SOURCE_BYTES)).array());
        Assert.assertArrayEquals(ByteBuffer.wrap(SOURCE_BYTES).array(), Base64x.mimeDecodeToBuffer(Base64x.mimeEncodeToBuffer(10, ",".getBytes(), ByteBuffer.wrap(SOURCE_BYTES))).array());
        Assert.assertArrayEquals(ByteBuffer.wrap(SOURCE_BYTES).array(), Base64x.mimeDecodeToBuffer(Base64x.mimeEncodeToBytes(10, ",".getBytes(), SOURCE)).array());
        Assert.assertArrayEquals(ByteBuffer.wrap(SOURCE_BYTES).array(), Base64x.mimeDecodeToBuffer(Base64x.mimeEncodeToString(10, ",".getBytes(), SOURCE)).array());
    }

    @Test
    public void testTo() {
        byte[] encodeResult = new byte[SOURCE.length() * 8];
        byte[] decodeResult = new byte[SOURCE.length() * 8];
        int encodeLength;
        int decodeLength;

        // encodeTo
        encodeLength = Base64x.encodeTo(SOURCE, encodeResult);
        decodeLength = Base64x.decodeTo(Arrayx.copyOf(encodeResult, encodeLength), decodeResult);
        Assert.assertEquals(SOURCE, new String(decodeResult, 0, decodeLength));

        encodeLength = Base64x.encodeTo(SOURCE_BYTES, encodeResult);
        decodeLength = Base64x.decodeTo(Arrayx.copyOf(encodeResult, encodeLength), decodeResult);
        Assert.assertEquals(SOURCE, new String(decodeResult, 0, decodeLength));

        encodeLength = Base64x.encodeTo(ByteBuffer.wrap(SOURCE_BYTES), encodeResult);
        decodeLength = Base64x.decodeTo(ByteBuffer.wrap(Arrayx.copyOf(encodeResult, encodeLength)), decodeResult);
        Assert.assertEquals(SOURCE, new String(decodeResult, 0, decodeLength));

        decodeLength = Base64x.decodeTo(Base64x.encodeToString(SOURCE), decodeResult);
        Assert.assertEquals(SOURCE, new String(decodeResult, 0, decodeLength));


        // urlEncodeTo
        encodeLength = Base64x.urlEncodeTo(SOURCE, encodeResult);
        decodeLength = Base64x.urlDecodeTo(Arrayx.copyOf(encodeResult, encodeLength), decodeResult);
        Assert.assertEquals(SOURCE, new String(decodeResult, 0, decodeLength));

        encodeLength = Base64x.urlEncodeTo(SOURCE_BYTES, encodeResult);
        decodeLength = Base64x.urlDecodeTo(Arrayx.copyOf(encodeResult, encodeLength), decodeResult);
        Assert.assertEquals(SOURCE, new String(decodeResult, 0, decodeLength));

        encodeLength = Base64x.urlEncodeTo(ByteBuffer.wrap(SOURCE_BYTES), encodeResult);
        decodeLength = Base64x.urlDecodeTo(ByteBuffer.wrap(Arrayx.copyOf(encodeResult, encodeLength)), decodeResult);
        Assert.assertEquals(SOURCE, new String(decodeResult, 0, decodeLength));

        decodeLength = Base64x.urlDecodeTo(Base64x.urlEncodeToString(SOURCE), decodeResult);
        Assert.assertEquals(SOURCE, new String(decodeResult, 0, decodeLength));


        // mimeEncodeTo
        encodeLength = Base64x.mimeEncodeTo(SOURCE, encodeResult);
        decodeLength = Base64x.mimeDecodeTo(Arrayx.copyOf(encodeResult, encodeLength), decodeResult);
        Assert.assertEquals(SOURCE, new String(decodeResult, 0, decodeLength));

        encodeLength = Base64x.mimeEncodeTo(SOURCE_BYTES, encodeResult);
        decodeLength = Base64x.mimeDecodeTo(Arrayx.copyOf(encodeResult, encodeLength), decodeResult);
        Assert.assertEquals(SOURCE, new String(decodeResult, 0, decodeLength));

        encodeLength = Base64x.mimeEncodeTo(ByteBuffer.wrap(SOURCE_BYTES), encodeResult);
        decodeLength = Base64x.mimeDecodeTo(ByteBuffer.wrap(Arrayx.copyOf(encodeResult, encodeLength)), decodeResult);
        Assert.assertEquals(SOURCE, new String(decodeResult, 0, decodeLength));

        decodeLength = Base64x.mimeDecodeTo(Base64x.mimeEncodeToString(SOURCE), decodeResult);
        Assert.assertEquals(SOURCE, new String(decodeResult, 0, decodeLength));


        // mimeEncodeTo int lineLength, @NotNull byte[] lineSeparator
        encodeLength = Base64x.mimeEncodeTo(10, ",".getBytes(), SOURCE, encodeResult);
        decodeLength = Base64x.mimeDecodeTo(Arrayx.copyOf(encodeResult, encodeLength), decodeResult);
        Assert.assertEquals(SOURCE, new String(decodeResult, 0, decodeLength));

        encodeLength = Base64x.mimeEncodeTo(10, ",".getBytes(), SOURCE_BYTES, encodeResult);
        decodeLength = Base64x.mimeDecodeTo(Arrayx.copyOf(encodeResult, encodeLength), decodeResult);
        Assert.assertEquals(SOURCE, new String(decodeResult, 0, decodeLength));

        encodeLength = Base64x.mimeEncodeTo(10, ",".getBytes(), ByteBuffer.wrap(SOURCE_BYTES), encodeResult);
        decodeLength = Base64x.mimeDecodeTo(ByteBuffer.wrap(Arrayx.copyOf(encodeResult, encodeLength)), decodeResult);
        Assert.assertEquals(SOURCE, new String(decodeResult, 0, decodeLength));

        decodeLength = Base64x.mimeDecodeTo(Base64x.mimeEncodeToString(SOURCE), decodeResult);
        Assert.assertEquals(SOURCE, new String(decodeResult, 0, decodeLength));
    }
}
