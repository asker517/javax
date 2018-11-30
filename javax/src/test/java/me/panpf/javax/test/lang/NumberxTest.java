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

import static org.junit.Assert.*;

public class NumberxTest {

    @Test
    public void testTo() {
        assertEquals(String.valueOf(Numberx.toByteOrDefault("5", (byte) 4)), String.valueOf(5));
        assertEquals(String.valueOf(Numberx.toByteOrDefault("g", (byte) 4)), String.valueOf(4));
        assertEquals(String.valueOf(Numberx.toByteOrZero("g")), String.valueOf(0));
        assertEquals(String.valueOf(Numberx.toByteOrDefault("", (byte) 4)), String.valueOf(4));
        assertEquals(String.valueOf(Numberx.toByteOrDefault(null, (byte) 4)), String.valueOf(4));

        assertEquals(String.valueOf(Numberx.toShortOrDefault("5", (short) 4)), String.valueOf(5));
        assertEquals(String.valueOf(Numberx.toShortOrDefault("g", (short) 4)), String.valueOf(4));
        assertEquals(String.valueOf(Numberx.toShortOrZero("g")), String.valueOf(0));
        assertEquals(String.valueOf(Numberx.toShortOrDefault("", (short) 4)), String.valueOf(4));
        assertEquals(String.valueOf(Numberx.toShortOrDefault(null, (short) 4)), String.valueOf(4));

        assertEquals(String.valueOf(Numberx.toIntOrDefault("5", 4)), String.valueOf(5));
        assertEquals(String.valueOf(Numberx.toIntOrDefault("g", 4)), String.valueOf(4));
        assertEquals(String.valueOf(Numberx.toIntOrZero("g")), String.valueOf(0));
        assertEquals(String.valueOf(Numberx.toIntOrDefault("", 4)), String.valueOf(4));
        assertEquals(String.valueOf(Numberx.toIntOrDefault(null, 4)), String.valueOf(4));

        assertEquals(String.valueOf(Numberx.toLongOrDefault("5", 4)), String.valueOf(5));
        assertEquals(String.valueOf(Numberx.toLongOrDefault("g", 4)), String.valueOf(4));
        assertEquals(String.valueOf(Numberx.toLongOrZero("g")), String.valueOf(0));
        assertEquals(String.valueOf(Numberx.toLongOrDefault("", 4)), String.valueOf(4));
        assertEquals(String.valueOf(Numberx.toLongOrDefault(null, 4)), String.valueOf(4));

        assertEquals(String.valueOf(Numberx.toFloatOrDefault("5.5", 4.5f)), String.valueOf(5.5f));
        assertEquals(String.valueOf(Numberx.toFloatOrDefault("g", 4.4f)), String.valueOf(4.4f));
        assertEquals(String.valueOf(Numberx.toFloatOrZero("g")), String.valueOf(0.0f));
        assertEquals(String.valueOf(Numberx.toFloatOrDefault("", 4.4f)), String.valueOf(4.4f));
        assertEquals(String.valueOf(Numberx.toFloatOrDefault(null, 4.4f)), String.valueOf(4.4f));

        assertEquals(String.valueOf(Numberx.toDoubleOrDefault("5.5", 4.4d)), String.valueOf(5.5d));
        assertEquals(String.valueOf(Numberx.toDoubleOrDefault("g", 4.4d)), String.valueOf(4.4d));
        assertEquals(String.valueOf(Numberx.toDoubleOrZero("g")), String.valueOf(0.0d));
        assertEquals(String.valueOf(Numberx.toDoubleOrDefault("", 4.4d)), String.valueOf(4.4d));
        assertEquals(String.valueOf(Numberx.toDoubleOrDefault(null, 4.4d)), String.valueOf(4.4d));
    }
}
