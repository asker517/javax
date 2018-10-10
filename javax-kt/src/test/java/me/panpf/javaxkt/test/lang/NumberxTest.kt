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

package me.panpf.javaxkt.test.lang

import me.panpf.javaxkt.lang.*
import org.junit.Assert
import org.junit.Test
import java.math.RoundingMode

class NumberxTest {

    @Test
    fun testOrZero() {
        Assert.assertEquals(3.toByte().orZero(), 3.toByte())
        Assert.assertEquals((null as Byte?).orZero(), 0.toByte())

        Assert.assertEquals(3.toShort().orZero(), 3.toShort())
        Assert.assertEquals((null as Short?).orZero(), 0.toShort())

        Assert.assertEquals(3.orZero(), 3)
        Assert.assertEquals((null as Int?).orZero(), 0)

        Assert.assertEquals(3.toLong().orZero(), 3.toLong())
        Assert.assertEquals((null as Long?).orZero(), 0.toLong())

        Assert.assertEquals(3.toFloat().orZero(), 3.toFloat(), 0f)
        Assert.assertEquals((null as Float?).orZero(), 0.toFloat(), 0f)

        Assert.assertEquals(3.toDouble().orZero(), 3.toDouble(), 0.toDouble())
        Assert.assertEquals((null as Double?).orZero(), 0.toDouble(), 0.toDouble())
    }

    @Test
    fun testScale() {
        Assert.assertEquals(0.2489.scale(2).toString(), 0.25f.toString())
        Assert.assertEquals(0.2449.scale(2).toString(), 0.24f.toString())

        Assert.assertEquals(0.2489.scale(2, RoundingMode.UP).toString(), 0.25f.toString())
        Assert.assertEquals(0.2449.scale(2, RoundingMode.UP).toString(), 0.25f.toString())

        Assert.assertEquals(0.2589f.scale(1).toString(), 0.3f.toString())
        Assert.assertEquals(0.2449f.scale(1).toString(), 0.2f.toString())

        Assert.assertEquals(0.2589f.scale(1, RoundingMode.UP).toString(), 0.3f.toString())
        Assert.assertEquals(0.2449f.scale(1, RoundingMode.UP).toString(), 0.3f.toString())

        Assert.assertEquals(0.2489.scale(0).toString(), 0f.toString())
        Assert.assertEquals(0.2449.scale(0).toString(), 0f.toString())
    }

    @Test
    fun testToByte() {
        Assert.assertEquals("5".toByteOrDefault(4.toByte()).toString(), 5.toString())
        Assert.assertEquals("g".toByteOrDefault(4.toByte()).toString(), 4.toString())
        Assert.assertEquals("g".toByteOrZero().toString(), 0.toString())
    }

    @Test
    fun testToShort() {
        Assert.assertEquals("5".toShortOrDefault(4.toShort()).toString(), 5.toString())
        Assert.assertEquals("g".toShortOrDefault(4.toShort()).toString(), 4.toString())
        Assert.assertEquals("g".toShortOrZero().toString(), 0.toString())
    }

    @Test
    fun testToInt() {
        Assert.assertEquals("5".toIntOrDefault(4).toString(), 5.toString())
        Assert.assertEquals("g".toIntOrDefault(4).toString(), 4.toString())
        Assert.assertEquals("g".toIntOrZero().toString(), 0.toString())
    }

    @Test
    fun testToLong() {
        Assert.assertEquals("5".toLongOrDefault(4).toString(), 5.toString())
        Assert.assertEquals("g".toLongOrDefault(4).toString(), 4.toString())
        Assert.assertEquals("g".toLongOrZero().toString(), 0.toString())
    }

    @Test
    fun testToFloat() {
        Assert.assertEquals("5.5".toFloatOrDefault(4.5f).toString(), 5.5f.toString())
        Assert.assertEquals("g".toFloatOrDefault(4.4f).toString(), 4.4f.toString())
        Assert.assertEquals("g".toFloatOrZero().toString(), 0.0f.toString())
    }

    @Test
    fun testToDouble() {
        Assert.assertEquals("5.5".toDoubleOrDefault(4.4).toString(), 5.5.toString())
        Assert.assertEquals("g".toDoubleOrDefault(4.4).toString(), 4.4.toString())
        Assert.assertEquals("g".toDoubleOrZero().toString(), 0.0.toString())
    }
}