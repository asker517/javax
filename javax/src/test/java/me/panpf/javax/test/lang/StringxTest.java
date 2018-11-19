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
import me.panpf.javax.collections.Collectionx;
import org.junit.Assert;
import org.junit.Test;

import java.util.Collection;
import java.util.LinkedList;

import static org.junit.Assert.*;

public class StringxTest {

    private static final String BLANK = "     ";
    private static final String SPACE = " ";
    private static final String ENTRY = "\r";
    private static final String TAB = "\t";
    private static final String WRAP = "\n";
    private static final String EMPTY = "";
    private static final String YES = "yes";
    private static final String DIGIT = "8";
    private static final String LETTER = "a飞";
    private static final String CHINESE = "飞";
    private static final String LETTER_OR_DIGIT = "a飞8";
    private static final String SYMBOL = "*%￥#@";

    @Test
    public void testSafe() {
        assertTrue(Stringx.isSafe(YES));
        assertFalse(Stringx.isSafe(null));
        assertFalse(Stringx.isSafe(BLANK));
        assertFalse(Stringx.isSafe(EMPTY));

        assertTrue(Stringx.isNotSafe(null));
        assertTrue(Stringx.isNotSafe(BLANK));
        assertTrue(Stringx.isNotSafe(EMPTY));
        assertFalse(Stringx.isNotSafe(YES));

        assertEquals(Stringx.isNotSafeOr(EMPTY, "default"), "default");
        assertEquals(Stringx.isNotSafeOr(YES, "default"), YES);
    }

    @Test
    public void testIsBlank() {
        assertTrue(Stringx.isBlank(BLANK));
        assertTrue(Stringx.isBlank(EMPTY));
        assertTrue(Stringx.isBlank(SPACE));
        assertTrue(Stringx.isBlank(ENTRY));
        assertTrue(Stringx.isBlank(TAB));
        assertTrue(Stringx.isBlank(WRAP));
        assertFalse(Stringx.isBlank(YES));
        assertFalse(Stringx.isBlank(DIGIT));
        assertFalse(Stringx.isBlank(LETTER));
        assertFalse(Stringx.isBlank(CHINESE));
        assertFalse(Stringx.isBlank(LETTER_OR_DIGIT));
        assertFalse(Stringx.isBlank(SYMBOL));
        assertFalse(Stringx.isBlank(null));

        assertTrue(Stringx.isNotBlank(YES));
        assertTrue(Stringx.isNotBlank(DIGIT));
        assertTrue(Stringx.isNotBlank(LETTER));
        assertTrue(Stringx.isNotBlank(CHINESE));
        assertTrue(Stringx.isNotBlank(LETTER_OR_DIGIT));
        assertTrue(Stringx.isNotBlank(SYMBOL));
        assertTrue(Stringx.isNotBlank(null));
        assertFalse(Stringx.isNotBlank(BLANK));
        assertFalse(Stringx.isNotBlank(EMPTY));
        assertFalse(Stringx.isNotBlank(SPACE));
        assertFalse(Stringx.isNotBlank(ENTRY));
        assertFalse(Stringx.isNotBlank(TAB));
        assertFalse(Stringx.isNotBlank(WRAP));

        assertEquals(Stringx.isBlankOr(BLANK, "default"), "default");
        assertEquals(Stringx.isBlankOr(YES, "default"), YES);


        assertTrue(Stringx.isNullOrBlank(null));
        assertTrue(Stringx.isNullOrBlank(BLANK));
        assertTrue(Stringx.isNullOrBlank(EMPTY));
        assertFalse(Stringx.isNullOrBlank(YES));

        assertTrue(Stringx.isNotNullOrBlank(YES));
        assertFalse(Stringx.isNotNullOrBlank(null));
        assertFalse(Stringx.isNotNullOrBlank(BLANK));
        assertFalse(Stringx.isNotNullOrBlank(EMPTY));

        assertEquals(Stringx.isNullOrBlankOr(BLANK, "default"), "default");
        assertEquals(Stringx.isNullOrBlankOr(null, "default"), "default");
        assertEquals(Stringx.isNullOrBlankOr(YES, "default"), YES);
    }

    @Test
    public void testIsEmpty() {
        assertTrue(Stringx.isEmpty(EMPTY));
        assertFalse(Stringx.isEmpty(BLANK));
        assertFalse(Stringx.isEmpty(YES));
        assertFalse(Stringx.isEmpty(null));

        assertTrue(Stringx.isNotEmpty(BLANK));
        assertTrue(Stringx.isNotEmpty(YES));
        assertFalse(Stringx.isNotEmpty(null));
        assertFalse(Stringx.isNotEmpty(EMPTY));

        assertEquals(Stringx.isEmptyOr(EMPTY, "default"), "default");
        assertEquals(Stringx.isEmptyOr(YES, "default"), YES);


        assertTrue(Stringx.isNullOrEmpty(null));
        assertTrue(Stringx.isNullOrEmpty(EMPTY));
        assertFalse(Stringx.isNullOrEmpty(YES));

        assertTrue(Stringx.isNotNullOrEmpty(YES));
        assertFalse(Stringx.isNotNullOrEmpty(null));
        assertFalse(Stringx.isNotNullOrEmpty(EMPTY));

        assertEquals(Stringx.isNullOrEmptyOr(EMPTY, "default"), "default");
        assertEquals(Stringx.isNullOrEmptyOr(null, "default"), "default");
        assertEquals(Stringx.isNullOrEmptyOr(YES, "default"), YES);
    }

    @Test
    public void testChinese() {
        assertTrue(Stringx.isChinese(CHINESE));
        assertFalse(Stringx.isChinese(EMPTY));
        assertFalse(Stringx.isChinese(DIGIT));
        assertFalse(Stringx.isChinese(LETTER));
        assertFalse(Stringx.isChinese(BLANK));
        assertFalse(Stringx.isChinese(null));

        assertTrue(Stringx.isNotChinese(EMPTY));
        assertTrue(Stringx.isNotChinese(DIGIT));
        assertTrue(Stringx.isNotChinese(LETTER));
        assertTrue(Stringx.isNotChinese(BLANK));
        assertTrue(Stringx.isNotChinese(null));
        assertFalse(Stringx.isNotChinese(CHINESE));

        assertEquals(Stringx.isNotChineseOr(LETTER, "default"), "default");
        assertEquals(Stringx.isNotChineseOr(null, "default"), "default");
        assertEquals(Stringx.isNotChineseOr(CHINESE, "default"), CHINESE);
    }

    @Test
    public void testDigit() {
        assertTrue(Stringx.isDigit(DIGIT));
        assertFalse(Stringx.isDigit(EMPTY));
        assertFalse(Stringx.isDigit(CHINESE));
        assertFalse(Stringx.isDigit(LETTER));
        assertFalse(Stringx.isDigit(BLANK));
        assertFalse(Stringx.isDigit(null));

        assertTrue(Stringx.isNotDigit(EMPTY));
        assertTrue(Stringx.isNotDigit(CHINESE));
        assertTrue(Stringx.isNotDigit(LETTER));
        assertTrue(Stringx.isNotDigit(BLANK));
        assertTrue(Stringx.isNotDigit(null));
        assertFalse(Stringx.isNotDigit(DIGIT));

        assertEquals(Stringx.isNotDigitOr(LETTER, "3"), "3");
        assertEquals(Stringx.isNotDigitOr(null, "3"), "3");
        assertEquals(Stringx.isNotDigitOr(DIGIT, "3"), DIGIT);
    }

    @Test
    public void testLetter() {
        assertTrue(Stringx.isLetter(LETTER));
        assertFalse(Stringx.isLetter(EMPTY));
        assertFalse(Stringx.isLetter(DIGIT));
        assertFalse(Stringx.isLetter(BLANK));
        assertFalse(Stringx.isLetter(null));

        assertTrue(Stringx.isNotLetter(EMPTY));
        assertTrue(Stringx.isNotLetter(DIGIT));
        assertTrue(Stringx.isNotLetter(BLANK));
        assertTrue(Stringx.isNotLetter(null));
        assertFalse(Stringx.isNotLetter(LETTER));

        assertEquals(Stringx.isNotLetterOr(DIGIT, "default"), "default");
        assertEquals(Stringx.isNotLetterOr(null, "default"), "default");
        assertEquals(Stringx.isNotLetterOr(LETTER, "default"), LETTER);
    }

    @Test
    public void testLetterOrDigit() {
        assertTrue(Stringx.isLetterOrDigit(LETTER_OR_DIGIT));
        assertFalse(Stringx.isLetterOrDigit(EMPTY));
        assertFalse(Stringx.isLetterOrDigit(BLANK));
        assertFalse(Stringx.isLetterOrDigit(SYMBOL));
        assertFalse(Stringx.isLetterOrDigit(null));

        assertTrue(Stringx.isNotLetterOrDigit(EMPTY));
        assertTrue(Stringx.isNotLetterOrDigit(BLANK));
        assertTrue(Stringx.isNotLetterOrDigit(null));
        assertTrue(Stringx.isNotLetterOrDigit(SYMBOL));
        assertFalse(Stringx.isNotLetterOrDigit(LETTER_OR_DIGIT));

        assertEquals(Stringx.isNotLetterOrDigitOr(EMPTY, "default"), "default");
        assertEquals(Stringx.isNotLetterOrDigitOr(null, "default"), "default");
        assertEquals(Stringx.isNotLetterOrDigitOr(LETTER_OR_DIGIT, "default"), LETTER_OR_DIGIT);
    }

    @Test
    public void testContains() {
        assertTrue(Stringx.containsAny("今天天气晴", new String[]{"哈", "天"}));
        assertFalse(Stringx.containsAny("今天天气晴", new String[]{"哈"}));
        assertTrue(Stringx.containsAny("今天天气晴", Collectionx.listOf("哈", "天")));
        assertFalse(Stringx.containsAny("今天天气晴", Collectionx.listOf("哈")));
        assertFalse(Stringx.containsAny("今天天气晴", (String[]) null));
        assertFalse(Stringx.containsAny(null, (String[]) null));
        assertFalse(Stringx.containsAny("今天天气晴", (Collection<String>) null));
        assertFalse(Stringx.containsAny(null, (Collection<String>) null));
        assertFalse(Stringx.containsAny("今天天气晴", new String[0]));
        assertFalse(Stringx.containsAny("今天天气晴", new LinkedList<String>()));

        assertTrue(Stringx.containsAll("今天天气晴", new String[]{"晴", "天"}));
        assertFalse(Stringx.containsAll("今天天气晴", new String[]{"哈", "天"}));
        assertTrue(Stringx.containsAll("今天天气晴", Collectionx.listOf("晴", "天")));
        assertFalse(Stringx.containsAll("今天天气晴", Collectionx.listOf("哈", "天")));
        assertFalse(Stringx.containsAll("今天天气晴", (String[]) null));
        assertFalse(Stringx.containsAll(null, (String[]) null));
        assertFalse(Stringx.containsAll("今天天气晴", (Collection<String>) null));
        assertFalse(Stringx.containsAll(null, (Collection<String>) null));
        assertFalse(Stringx.containsAll("今天天气晴", new String[0]));
        assertFalse(Stringx.containsAll("今天天气晴", new LinkedList<String>()));

        assertFalse(Stringx.containsAny("HCHC", new String[]{"h", "a"}));
        assertTrue(Stringx.containsAny("HCHC", new String[]{"h", "a"}, true));
        assertFalse(Stringx.containsAny("HCHC", Collectionx.listOf("h", "a")));
        assertTrue(Stringx.containsAny("HCHC", Collectionx.listOf("h", "a"), true));

        assertFalse(Stringx.containsAll("HAHA", new String[]{"h", "a"}));
        assertTrue(Stringx.containsAll("HAHA", new String[]{"h", "a"}, true));
        assertFalse(Stringx.containsAll("HAHA", Collectionx.listOf("h", "a")));
        assertTrue(Stringx.containsAll("HAHA", Collectionx.listOf("h", "a"), true));
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
        assertEquals(Stringx.orEmpty(null), EMPTY);

        assertEquals(Stringx.orDefault("JavaBean", "defaultValue"), "JavaBean");
        assertEquals(Stringx.orDefault(null, "defaultValue"), "defaultValue");

        assertEquals(Stringx.emptyToNull("JavaBean"), "JavaBean");
        assertNull(Stringx.emptyToNull(EMPTY));

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
    public void testOrAndTo() {
        assertEquals(Stringx.orEmpty("今"), "今");
        assertEquals(Stringx.orEmpty(null), "");
        assertEquals(Stringx.orEmpty((CharSequence) "今"), "今");
        assertEquals(Stringx.orEmpty((CharSequence) null), "");

        assertEquals(Stringx.orDefault("今", "天"), "今");
        assertEquals(Stringx.orDefault(null, "天"), "天");
        assertEquals(Stringx.orDefault((CharSequence) "今", "天"), "今");
        assertEquals(Stringx.orDefault((CharSequence) null, "天"), "天");

        assertNotNull(Stringx.emptyToNull("今"));
        assertNull(Stringx.emptyToNull(""));
        assertNotNull(Stringx.emptyToNull((CharSequence) "今"));
        assertNull(Stringx.emptyToNull((CharSequence) ""));

        assertNotNull(Stringx.blankToNull("今"));
        assertNull(Stringx.blankToNull(" "));
        assertNotNull(Stringx.blankToNull((CharSequence) "今"));
        assertNull(Stringx.blankToNull((CharSequence) " "));
    }

    @Test
    public void testFilterBlank() {
        String source = " 费劲啊是否将as\n\n\t523\t\tcxbv\r\r而乏味 贵公司   ";
        Assert.assertEquals(Stringx.filterBlank(source), "费劲啊是否将as523cxbv而乏味贵公司");
        Assert.assertEquals(Stringx.filterBlank(new StringBuilder(source)).toString(), "费劲啊是否将as523cxbv而乏味贵公司");
    }
}
