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

package me.panpf.javax.test.lang;

import me.panpf.javax.lang.Numberx;
import org.junit.Test;

import java.math.RoundingMode;

import static org.junit.Assert.*;

public class NumberxTest {

    @Test
    public void testScale() {
        assertEquals(String.valueOf(Numberx.scale(0.2489, 2)), String.valueOf(0.25f));
        assertEquals(String.valueOf(Numberx.scale(0.2449, 2)), String.valueOf(0.24f));

        assertEquals(String.valueOf(Numberx.scale(0.2489, 2, RoundingMode.UP)), String.valueOf(0.25f));
        assertEquals(String.valueOf(Numberx.scale(0.2449, 2, RoundingMode.UP)), String.valueOf(0.25f));

        assertEquals(String.valueOf(Numberx.scale(0.2589f, 1)), String.valueOf(0.3f));
        assertEquals(String.valueOf(Numberx.scale(0.2449f, 1)), String.valueOf(0.2f));

        assertEquals(String.valueOf(Numberx.scale(0.2589f, 1, RoundingMode.UP)), String.valueOf(0.3f));
        assertEquals(String.valueOf(Numberx.scale(0.2449f, 1, RoundingMode.UP)), String.valueOf(0.3f));

        assertEquals(String.valueOf(Numberx.scale(0.2489, 0)), String.valueOf(0f));
        assertEquals(String.valueOf(Numberx.scale(0.2449, 0)), String.valueOf(0f));
    }

    @Test
    public void testPad() {
        assertEquals(Numberx.pad(10, 5), "00010");
        assertEquals(Numberx.pad(10L, 5), "00010");
    }

    @Test
    public void testTo() {
        assertEquals(String.valueOf(Numberx.toByteOrDefault("5", (byte) 4)), String.valueOf(5));
        assertEquals(String.valueOf(Numberx.toByteOrDefault("g", (byte) 4)), String.valueOf(4));
        assertEquals(String.valueOf(Numberx.toByteOrZero("g")), String.valueOf(0));

        assertEquals(String.valueOf(Numberx.toShortOrDefault("5", (short) 4)), String.valueOf(5));
        assertEquals(String.valueOf(Numberx.toShortOrDefault("g", (short) 4)), String.valueOf(4));
        assertEquals(String.valueOf(Numberx.toShortOrZero("g")), String.valueOf(0));

        assertEquals(String.valueOf(Numberx.toIntOrDefault("5", 4)), String.valueOf(5));
        assertEquals(String.valueOf(Numberx.toIntOrDefault("g", 4)), String.valueOf(4));
        assertEquals(String.valueOf(Numberx.toIntOrZero("g")), String.valueOf(0));

        assertEquals(String.valueOf(Numberx.toLongOrDefault("5", 4)), String.valueOf(5));
        assertEquals(String.valueOf(Numberx.toLongOrDefault("g", 4)), String.valueOf(4));
        assertEquals(String.valueOf(Numberx.toLongOrZero("g")), String.valueOf(0));

        assertEquals(String.valueOf(Numberx.toFloatOrDefault("5.5", 4.5f)), String.valueOf(5.5f));
        assertEquals(String.valueOf(Numberx.toFloatOrDefault("g", 4.4f)), String.valueOf(4.4f));
        assertEquals(String.valueOf(Numberx.toFloatOrZero("g")), String.valueOf(0.0f));

        assertEquals(String.valueOf(Numberx.toDoubleOrDefault("5.5", 4.4d)), String.valueOf(5.5d));
        assertEquals(String.valueOf(Numberx.toDoubleOrDefault("g", 4.4d)), String.valueOf(4.4d));
        assertEquals(String.valueOf(Numberx.toDoubleOrZero("g")), String.valueOf(0.0d));
    }

    @Test
    public void testIn() {
        assertTrue(Numberx.in((byte) 9, (byte) 3, (byte) 10));
        assertFalse(Numberx.in((byte) 2, (byte) 3, (byte) 10));
        assertFalse(Numberx.in((byte) 11, (byte) 3, (byte) 10));

        assertTrue(Numberx.in((short) 9, (short) 3, (short) 10));
        assertFalse(Numberx.in((short) 2, (short) 3, (short) 10));
        assertFalse(Numberx.in((short) 11, (short) 3, (short) 10));

        assertTrue(Numberx.in(9, 3, 10));
        assertFalse(Numberx.in(2, 3, 10));
        assertFalse(Numberx.in(11, 3, 10));

        assertTrue(Numberx.in(9L, 3L, 10L));
        assertFalse(Numberx.in(2L, 3L, 10L));
        assertFalse(Numberx.in(11L, 3L, 10L));

        assertTrue(Numberx.in(9F, 3F, 10F));
        assertFalse(Numberx.in(2F, 3F, 10F));
        assertFalse(Numberx.in(11F, 3F, 10F));

        assertTrue(Numberx.in(9.0, 3.0, 10.0));
        assertFalse(Numberx.in(2.0, 3.0, 10.0));
        assertFalse(Numberx.in(11.0, 3.0, 10.0));
    }

    @Test
    public void testNotIn() {
        assertFalse(Numberx.notIn((byte) 9, (byte) 3, (byte) 10));
        assertTrue(Numberx.notIn((byte) 2, (byte) 3, (byte) 10));
        assertTrue(Numberx.notIn((byte) 11, (byte) 3, (byte) 10));

        assertFalse(Numberx.notIn((short) 9, (short) 3, (short) 10));
        assertTrue(Numberx.notIn((short) 2, (short) 3, (short) 10));
        assertTrue(Numberx.notIn((short) 11, (short) 3, (short) 10));

        assertFalse(Numberx.notIn(9, 3, 10));
        assertTrue(Numberx.notIn(2, 3, 10));
        assertTrue(Numberx.notIn(11, 3, 10));

        assertFalse(Numberx.notIn(9L, 3L, 10L));
        assertTrue(Numberx.notIn(2L, 3L, 10L));
        assertTrue(Numberx.notIn(11L, 3L, 10L));

        assertFalse(Numberx.notIn(9F, 3F, 10F));
        assertTrue(Numberx.notIn(2F, 3F, 10F));
        assertTrue(Numberx.notIn(11F, 3F, 10F));

        assertFalse(Numberx.notIn(9.0, 3.0, 10.0));
        assertTrue(Numberx.notIn(2.0, 3.0, 10.0));
        assertTrue(Numberx.notIn(11.0, 3.0, 10.0));
    }
}
