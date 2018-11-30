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
import org.junit.Assert.assertEquals
import org.junit.Test

class NumberxTest {

    @Test
    fun testTo() {
        assertEquals("5".toByteOrDefault(4.toByte()).toString(), 5.toString())
        assertEquals("g".toByteOrDefault(4.toByte()).toString(), 4.toString())
        assertEquals("g".toByteOrZero().toString(), 0.toString())
        assertEquals("".toByteOrDefault(4.toByte()).toString(), 4.toString())
        assertEquals(null.toByteOrDefault(4.toByte()).toString(), 4.toString())

        assertEquals("5".toShortOrDefault(4.toShort()).toString(), 5.toString())
        assertEquals("g".toShortOrDefault(4.toShort()).toString(), 4.toString())
        assertEquals("g".toShortOrZero().toString(), 0.toString())
        assertEquals("".toShortOrDefault(4.toShort()).toString(), 4.toString())
        assertEquals(null.toShortOrDefault(4.toShort()).toString(), 4.toString())

        assertEquals("5".toIntOrDefault(4).toString(), 5.toString())
        assertEquals("g".toIntOrDefault(4).toString(), 4.toString())
        assertEquals("g".toIntOrZero().toString(), 0.toString())
        assertEquals("".toIntOrDefault(4).toString(), 4.toString())
        assertEquals(null.toIntOrDefault(4).toString(), 4.toString())

        assertEquals("5".toLongOrDefault(4).toString(), 5.toString())
        assertEquals("g".toLongOrDefault(4).toString(), 4.toString())
        assertEquals("g".toLongOrZero().toString(), 0.toString())
        assertEquals("".toLongOrDefault(4).toString(), 4.toString())
        assertEquals(null.toLongOrDefault(4).toString(), 4.toString())

        assertEquals("5.5".toFloatOrDefault(4.5f).toString(), 5.5f.toString())
        assertEquals("g".toFloatOrDefault(4.4f).toString(), 4.4f.toString())
        assertEquals("g".toFloatOrZero().toString(), 0.0f.toString())
        assertEquals("".toFloatOrDefault(4.4f).toString(), 4.4f.toString())
        assertEquals(null.toFloatOrDefault(4.4f).toString(), 4.4f.toString())

        assertEquals("5.5".toDoubleOrDefault(4.4).toString(), 5.5.toString())
        assertEquals("g".toDoubleOrDefault(4.4).toString(), 4.4.toString())
        assertEquals("g".toDoubleOrZero().toString(), 0.0.toString())
        assertEquals("".toDoubleOrDefault(4.4).toString(), 4.4.toString())
        assertEquals(null.toDoubleOrDefault(4.4).toString(), 4.4.toString())
    }
}