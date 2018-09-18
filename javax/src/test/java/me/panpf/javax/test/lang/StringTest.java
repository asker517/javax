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

import me.panpf.javax.lang.Stringx;
import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class StringTest {

    private static final String BLANK = "     ";
    private static final String EMPTY = "";
    private static final String YES = "yes";

    @Test
    public void testSafe(){
        assertTrue(Stringx.isSafe(YES));
        assertFalse(Stringx.isSafe(null));
        assertFalse(Stringx.isSafe(BLANK));
        assertFalse(Stringx.isSafe(EMPTY));

        assertTrue(Stringx.isNotSafe(null));
        assertTrue(Stringx.isNotSafe(BLANK));
        assertTrue(Stringx.isNotSafe(EMPTY));
        assertFalse(Stringx.isNotSafe(YES));
    }

    @Test
    public void testIsBlank() {
        assertTrue(Stringx.isBlank(BLANK));
        assertTrue(Stringx.isBlank(EMPTY));
        assertFalse(Stringx.isBlank(YES));

        assertTrue(Stringx.isNotBlank(YES));
        assertFalse(Stringx.isNotBlank(BLANK));

        assertTrue(Stringx.isNullOrBlank(null));
        assertTrue(Stringx.isNullOrBlank(BLANK));
        assertFalse(Stringx.isNullOrBlank(YES));

        assertTrue(Stringx.isNotNullOrBlank(YES));
        assertFalse(Stringx.isNotNullOrBlank(null));
        assertFalse(Stringx.isNotNullOrBlank(BLANK));

        assertTrue(Stringx.isAllBlank(BLANK, BLANK));
        assertFalse(Stringx.isAllBlank(YES, BLANK));

        assertTrue(Stringx.isAllNotBlank(YES, YES));
        assertFalse(Stringx.isAllNotBlank(YES, BLANK));

        assertTrue(Stringx.isAllNullOrBlank(null, null));
        assertTrue(Stringx.isAllNullOrBlank(BLANK, BLANK));
        assertTrue(Stringx.isAllNullOrBlank(null, BLANK));
        assertFalse(Stringx.isAllNullOrBlank(YES, YES));

        assertTrue(Stringx.isAllNotNullOrBlank(YES, YES));
        assertFalse(Stringx.isAllNotNullOrBlank(YES, null));
        assertFalse(Stringx.isAllNotNullOrBlank(YES, BLANK));
    }

    @Test
    public void testIsEmpty() {
        assertTrue(Stringx.isEmpty(EMPTY));
        assertFalse(Stringx.isEmpty(BLANK));
        assertFalse(Stringx.isEmpty(YES));

        assertTrue(Stringx.isNotEmpty(YES));
        assertFalse(Stringx.isNotEmpty(EMPTY));

        assertTrue(Stringx.isNullOrEmpty(null));
        assertTrue(Stringx.isNullOrEmpty(EMPTY));
        assertFalse(Stringx.isNullOrEmpty(YES));

        assertTrue(Stringx.isNotNullOrEmpty(YES));
        assertFalse(Stringx.isNotNullOrEmpty(null));
        assertFalse(Stringx.isNotNullOrEmpty(EMPTY));

        assertTrue(Stringx.isAllEmpty(EMPTY, EMPTY));
        assertFalse(Stringx.isAllEmpty(YES, EMPTY));

        assertTrue(Stringx.isAllNotEmpty(YES, YES));
        assertFalse(Stringx.isAllNotEmpty(YES, EMPTY));

        assertTrue(Stringx.isAllNullOrEmpty(null, null));
        assertTrue(Stringx.isAllNullOrEmpty(EMPTY, EMPTY));
        assertTrue(Stringx.isAllNullOrEmpty(null, EMPTY));
        assertFalse(Stringx.isAllNullOrEmpty(YES, YES));

        assertTrue(Stringx.isAllNotNullOrEmpty(YES, YES));
        assertFalse(Stringx.isAllNotNullOrEmpty(YES, null));
        assertFalse(Stringx.isAllNotNullOrEmpty(YES, EMPTY));
    }

    @Test
    public void testCharType() {
        assertTrue(Stringx.isDigit("412412340124"));
        assertFalse(Stringx.isDigit("412412340124a"));
        assertFalse(Stringx.isDigit("412412340124 "));
        assertFalse(Stringx.isDigit(" "));
        assertFalse(Stringx.isDigit("412412340124-#"));
        assertFalse(Stringx.isDigit("-#"));

        assertTrue(Stringx.isLetterOrDigit("412412340124"));
        assertTrue(Stringx.isLetterOrDigit("412412340124afasfs"));
        assertFalse(Stringx.isLetterOrDigit("412412340124-"));
        assertFalse(Stringx.isLetterOrDigit("fasfsvxvsfasf-"));
        assertFalse(Stringx.isLetterOrDigit("41241xvsfasf-"));
        assertFalse(Stringx.isLetterOrDigit("-"));
        assertFalse(Stringx.isLetterOrDigit("412412340124 "));
        assertFalse(Stringx.isLetterOrDigit("fasfsvxvsfasf "));
        assertFalse(Stringx.isLetterOrDigit("41241xvsfasf "));
        assertFalse(Stringx.isLetterOrDigit(" "));

        assertTrue(Stringx.isChinese("中文测试，。，。，？；"));
        assertFalse(Stringx.isChinese(" 中文测试"));
        assertFalse(Stringx.isChinese("中文测试 1"));
        assertFalse(Stringx.isChinese("中文测试 &"));
        assertFalse(Stringx.isChinese("41242"));
        assertFalse(Stringx.isChinese("#%$%^("));
        assertFalse(Stringx.isChinese(" "));
        assertFalse(Stringx.isChinese("  "));
    }

    @Test
    public void testStartsWith() {
        assertTrue(Stringx.startsWith("JavaBean", "Java"));
        assertFalse(Stringx.startsWith("JavaBean", "Jave"));

        assertFalse(Stringx.startsWith("JavaBean", "java"));
        assertTrue(Stringx.startsWith("JavaBean", "java", true));
    }

    @Test
    public void testEndsWith() {
        assertTrue(Stringx.endsWith("JavaBean", "Bean"));
        assertFalse(Stringx.endsWith("JavaBean", "Bea"));

        assertFalse(Stringx.endsWith("JavaBean", "bean"));
        assertTrue(Stringx.endsWith("JavaBean", "bean", true));
    }

    @Test
    public void testEquals() {
        assertTrue(Stringx.equals("JavaBean", "JavaBean"));
        assertFalse(Stringx.equals("JavaBean", "javabean"));
        assertTrue(Stringx.equals("JavaBean", "javabean", true));

        assertFalse(Stringx.equals("JavaBean", null));
        assertFalse(Stringx.equals(null, "javabean"));
        assertTrue(Stringx.equals(null, null));
    }

    @Test
    public void testConvert() {
        assertEquals(Stringx.orEmpty("JavaBean"), "JavaBean");
        assertEquals(Stringx.orEmpty(null), "");

        assertEquals(Stringx.orDefault("JavaBean", "defaultValue"), "JavaBean");
        assertEquals(Stringx.orDefault(null, "defaultValue"), "defaultValue");

        assertEquals(Stringx.emptyToNull("JavaBean"), "JavaBean");
        assertNull(Stringx.emptyToNull(""));

        assertEquals(Stringx.blankToNull("JavaBean"), "JavaBean");
        assertNull(Stringx.blankToNull("    "));
    }

    @Test
    public void testRemoveChar() {
        assertEquals(Stringx.removeChar("JavaBean", 'a'), "JvBen");
        assertEquals(Stringx.removeFirstChar("JavaBean", 'a'), "JvaBean");
        assertEquals(Stringx.removeLastChar("JavaBean", 'a'), "JavaBen");
        assertEquals(Stringx.removeIndex("JavaBean", 4), "Javaean");
    }

    @Test
    public void testCapitalize() {
        assertEquals(Stringx.capitalize("android"), "Android");
        assertEquals(Stringx.decapitalize("Android"), "android");
    }

    @Test
    public void testLimit() {
        assertEquals(Stringx.limit("今天天气晴", 6), "今天天气晴");
        assertEquals(Stringx.limit("今天天气晴", 6, "..."), "今天天气晴");

        assertEquals(Stringx.limit("今天天气晴朗，万里无云", 6), "今天天气晴朗");
        assertEquals(Stringx.limit("今天天气晴朗，万里无云", 6, "..."), "今天天气晴朗...");
    }

    @Test
    public void testPad() {
        assertEquals(Stringx.padStart("今天天气晴", 4), "今天天气晴");
        assertEquals(Stringx.padStart("今天天气晴", 5), "今天天气晴");
        assertEquals(Stringx.padStart("今天天气晴", 10), "     今天天气晴");
        assertEquals(Stringx.padStart("今天天气晴", 10, '.'), ".....今天天气晴");

        assertEquals(Stringx.padEnd("今天天气晴", 4), "今天天气晴");
        assertEquals(Stringx.padEnd("今天天气晴", 5), "今天天气晴");
        assertEquals(Stringx.padEnd("今天天气晴", 10), "今天天气晴     ");
        assertEquals(Stringx.padEnd("今天天气晴", 10, '.'), "今天天气晴.....");
    }

    @Test
    public void testContains() {
        Assert.assertTrue(Stringx.orContains("今天天气晴", new String[]{"哈", "天"}));
        Assert.assertFalse(Stringx.orContains("今天天气晴", new String[]{"哈"}));

        Assert.assertTrue(Stringx.andContains("今天天气晴", new String[]{"晴", "天"}));
        Assert.assertFalse(Stringx.andContains("今天天气晴", new String[]{"哈", "天"}));
    }
}
