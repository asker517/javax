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

package me.panpf.javax.test.lang

import me.panpf.javax.collections.Collectionx
import me.panpf.javax.lang.Stringx
import me.panpf.javax.ranges.Rangex
import me.panpf.javax.test.Assertx.assertThreeEquals
import me.panpf.javax.util.Base64x
import me.panpf.javax.util.Regexx
import org.junit.Assert
import org.junit.Assert.*
import org.junit.Test
import java.nio.charset.Charset
import java.util.*

class StringxTest {

    companion object {
        private const val BLANK = "     "
        private const val SPACE = " "
        private const val ENTRY = "\r"
        private const val TAB = "\t"
        private const val WRAP = "\n"
        private const val EMPTY = ""
        private const val YES = "yes"
        private const val YES_CHAR_SEQUENCE = "yes"
        private const val DIGIT = "8"
        private const val DIGIT_CHAR_SEQUENCE = "8"
        private const val LETTER = "a飞"
        private const val LETTER_CHAR_SEQUENCE = "a飞"
        private const val CHINESE = "飞"
        private const val CHINESE_CHAR_SEQUENCE = "飞"
        private const val LETTER_OR_DIGIT = "a飞8"
        private const val LETTER_OR_DIGIT_CHAR_SEQUENCE = "a飞8"
        private const val SYMBOL = "*%￥#@"
    }

    @Test
    fun testSafe() {
        assertTrue(Stringx.isSafe(YES))
        assertFalse(Stringx.isSafe(null))
        assertFalse(Stringx.isSafe(BLANK))
        assertFalse(Stringx.isSafe(EMPTY))

        assertTrue(Stringx.isNotSafe(null))
        assertTrue(Stringx.isNotSafe(BLANK))
        assertTrue(Stringx.isNotSafe(EMPTY))
        assertFalse(Stringx.isNotSafe(YES))

        assertEquals(Stringx.isNotSafeOr(EMPTY, "default"), "default")
        assertEquals(Stringx.isNotSafeOr(YES, "default"), YES)
        assertEquals(Stringx.isNotSafeOr(YES_CHAR_SEQUENCE, "default"), YES_CHAR_SEQUENCE)
    }

    @Test
    fun testIsBlank() {
        assertTrue(Stringx.isBlank(BLANK))
        assertTrue(Stringx.isBlank(EMPTY))
        assertTrue(Stringx.isBlank(SPACE))
        assertTrue(Stringx.isBlank(ENTRY))
        assertTrue(Stringx.isBlank(TAB))
        assertTrue(Stringx.isBlank(WRAP))
        assertFalse(Stringx.isBlank(YES))
        assertFalse(Stringx.isBlank(DIGIT))
        assertFalse(Stringx.isBlank(LETTER))
        assertFalse(Stringx.isBlank(CHINESE))
        assertFalse(Stringx.isBlank(LETTER_OR_DIGIT))
        assertFalse(Stringx.isBlank(SYMBOL))
        assertFalse(Stringx.isBlank(null))

        assertTrue(Stringx.isNotBlank(YES))
        assertTrue(Stringx.isNotBlank(DIGIT))
        assertTrue(Stringx.isNotBlank(LETTER))
        assertTrue(Stringx.isNotBlank(CHINESE))
        assertTrue(Stringx.isNotBlank(LETTER_OR_DIGIT))
        assertTrue(Stringx.isNotBlank(SYMBOL))
        assertTrue(Stringx.isNotBlank(null))
        assertFalse(Stringx.isNotBlank(BLANK))
        assertFalse(Stringx.isNotBlank(EMPTY))
        assertFalse(Stringx.isNotBlank(SPACE))
        assertFalse(Stringx.isNotBlank(ENTRY))
        assertFalse(Stringx.isNotBlank(TAB))
        assertFalse(Stringx.isNotBlank(WRAP))

        assertEquals(Stringx.isBlankOr(BLANK, "default"), "default")
        assertEquals(Stringx.isBlankOr(YES, "default"), YES)
        assertEquals(Stringx.isBlankOr(YES_CHAR_SEQUENCE, "default"), YES_CHAR_SEQUENCE)


        assertTrue(Stringx.isNullOrBlank(null))
        assertTrue(Stringx.isNullOrBlank(BLANK))
        assertTrue(Stringx.isNullOrBlank(EMPTY))
        assertFalse(Stringx.isNullOrBlank(YES))

        assertTrue(Stringx.isNotNullOrBlank(YES))
        assertFalse(Stringx.isNotNullOrBlank(null))
        assertFalse(Stringx.isNotNullOrBlank(BLANK))
        assertFalse(Stringx.isNotNullOrBlank(EMPTY))

        assertEquals(Stringx.isNullOrBlankOr(BLANK, "default"), "default")
        assertEquals(Stringx.isNullOrBlankOr(null, "default"), "default")
        assertEquals(Stringx.isNullOrBlankOr(YES, "default"), YES)
        assertEquals(Stringx.isNullOrBlankOr(YES_CHAR_SEQUENCE, "default"), YES_CHAR_SEQUENCE)
    }

    @Test
    fun testIsEmpty() {
        assertTrue(Stringx.isEmpty(EMPTY))
        assertFalse(Stringx.isEmpty(BLANK))
        assertFalse(Stringx.isEmpty(YES))
        assertFalse(Stringx.isEmpty(null))

        assertTrue(Stringx.isNotEmpty(BLANK))
        assertTrue(Stringx.isNotEmpty(YES))
        assertFalse(Stringx.isNotEmpty(null))
        assertFalse(Stringx.isNotEmpty(EMPTY))

        assertEquals(Stringx.isEmptyOr(EMPTY, "default"), "default")
        assertEquals(Stringx.isEmptyOr(YES, "default"), YES)
        assertEquals(Stringx.isEmptyOr(YES_CHAR_SEQUENCE, "default"), YES_CHAR_SEQUENCE)


        assertTrue(Stringx.isNullOrEmpty(null))
        assertTrue(Stringx.isNullOrEmpty(EMPTY))
        assertFalse(Stringx.isNullOrEmpty(YES))

        assertTrue(Stringx.isNotNullOrEmpty(YES))
        assertFalse(Stringx.isNotNullOrEmpty(null))
        assertFalse(Stringx.isNotNullOrEmpty(EMPTY))

        assertEquals(Stringx.isNullOrEmptyOr(EMPTY, "default"), "default")
        assertEquals(Stringx.isNullOrEmptyOr(null, "default"), "default")
        assertEquals(Stringx.isNullOrEmptyOr(YES, "default"), YES)
        assertEquals(Stringx.isNullOrEmptyOr(YES_CHAR_SEQUENCE, "default"), YES_CHAR_SEQUENCE)
    }

    @Test
    fun testChinese() {
        assertTrue(Stringx.isChinese(CHINESE))
        assertFalse(Stringx.isChinese(EMPTY))
        assertFalse(Stringx.isChinese(DIGIT))
        assertFalse(Stringx.isChinese(LETTER))
        assertFalse(Stringx.isChinese(BLANK))
        assertFalse(Stringx.isChinese(null))

        assertTrue(Stringx.isNotChinese(EMPTY))
        assertTrue(Stringx.isNotChinese(DIGIT))
        assertTrue(Stringx.isNotChinese(LETTER))
        assertTrue(Stringx.isNotChinese(BLANK))
        assertTrue(Stringx.isNotChinese(null))
        assertFalse(Stringx.isNotChinese(CHINESE))

        assertEquals(Stringx.isNotChineseOr(LETTER, "default"), "default")
        assertEquals(Stringx.isNotChineseOr(null, "default"), "default")
        assertEquals(Stringx.isNotChineseOr(CHINESE, "default"), CHINESE)
        assertEquals(Stringx.isNotChineseOr(CHINESE_CHAR_SEQUENCE, "default"), CHINESE_CHAR_SEQUENCE)
    }

    @Test
    fun testDigit() {
        assertTrue(Stringx.isDigit(DIGIT))
        assertFalse(Stringx.isDigit(EMPTY))
        assertFalse(Stringx.isDigit(CHINESE))
        assertFalse(Stringx.isDigit(LETTER))
        assertFalse(Stringx.isDigit(BLANK))
        assertFalse(Stringx.isDigit(null))

        assertTrue(Stringx.isNotDigit(EMPTY))
        assertTrue(Stringx.isNotDigit(CHINESE))
        assertTrue(Stringx.isNotDigit(LETTER))
        assertTrue(Stringx.isNotDigit(BLANK))
        assertTrue(Stringx.isNotDigit(null))
        assertFalse(Stringx.isNotDigit(DIGIT))

        assertEquals(Stringx.isNotDigitOr(LETTER, "3"), "3")
        assertEquals(Stringx.isNotDigitOr(null, "3"), "3")
        assertEquals(Stringx.isNotDigitOr(DIGIT, "3"), DIGIT)
        assertEquals(Stringx.isNotDigitOr(DIGIT_CHAR_SEQUENCE, "3"), DIGIT_CHAR_SEQUENCE)
    }

    @Test
    fun testLetter() {
        assertTrue(Stringx.isLetter(LETTER))
        assertFalse(Stringx.isLetter(EMPTY))
        assertFalse(Stringx.isLetter(DIGIT))
        assertFalse(Stringx.isLetter(BLANK))
        assertFalse(Stringx.isLetter(null))

        assertTrue(Stringx.isNotLetter(EMPTY))
        assertTrue(Stringx.isNotLetter(DIGIT))
        assertTrue(Stringx.isNotLetter(BLANK))
        assertTrue(Stringx.isNotLetter(null))
        assertFalse(Stringx.isNotLetter(LETTER))

        assertEquals(Stringx.isNotLetterOr(DIGIT, "default"), "default")
        assertEquals(Stringx.isNotLetterOr(null, "default"), "default")
        assertEquals(Stringx.isNotLetterOr(LETTER, "default"), LETTER)
        assertEquals(Stringx.isNotLetterOr(LETTER_CHAR_SEQUENCE, "default"), LETTER_CHAR_SEQUENCE)
    }

    @Test
    fun testLetterOrDigit() {
        assertTrue(Stringx.isLetterOrDigit(LETTER_OR_DIGIT))
        assertFalse(Stringx.isLetterOrDigit(EMPTY))
        assertFalse(Stringx.isLetterOrDigit(BLANK))
        assertFalse(Stringx.isLetterOrDigit(SYMBOL))
        assertFalse(Stringx.isLetterOrDigit(null))

        assertTrue(Stringx.isNotLetterOrDigit(EMPTY))
        assertTrue(Stringx.isNotLetterOrDigit(BLANK))
        assertTrue(Stringx.isNotLetterOrDigit(null))
        assertTrue(Stringx.isNotLetterOrDigit(SYMBOL))
        assertFalse(Stringx.isNotLetterOrDigit(LETTER_OR_DIGIT))

        assertEquals(Stringx.isNotLetterOrDigitOr(EMPTY, "default"), "default")
        assertEquals(Stringx.isNotLetterOrDigitOr(null, "default"), "default")
        assertEquals(Stringx.isNotLetterOrDigitOr(LETTER_OR_DIGIT, "default"), LETTER_OR_DIGIT)
        assertEquals(Stringx.isNotLetterOrDigitOr(LETTER_OR_DIGIT_CHAR_SEQUENCE, "default"), LETTER_OR_DIGIT_CHAR_SEQUENCE)
    }

    @Test
    fun testContains() {
        assertTrue(Stringx.containsAny("今天天气晴", arrayOf("哈", "天")))
        assertFalse(Stringx.containsAny("今天天气晴", arrayOf("哈")))
        assertTrue(Stringx.containsAny("今天天气晴", Collectionx.listOf("哈", "天")))
        assertFalse(Stringx.containsAny("今天天气晴", Collectionx.listOf("哈")))
        assertFalse(Stringx.containsAny("今天天气晴", null as Array<String>?))
        assertFalse(Stringx.containsAny(null, null as Array<String>?))
        assertFalse(Stringx.containsAny("今天天气晴", null as Collection<String>?))
        assertFalse(Stringx.containsAny(null, null as Collection<String>?))
        assertFalse(Stringx.containsAny("今天天气晴", arrayOfNulls(0)))
        assertFalse(Stringx.containsAny("今天天气晴", LinkedList()))

        assertTrue(Stringx.containsAll("今天天气晴", arrayOf("晴", "天")))
        assertFalse(Stringx.containsAll("今天天气晴", arrayOf("哈", "天")))
        assertTrue(Stringx.containsAll("今天天气晴", Collectionx.listOf("晴", "天")))
        assertFalse(Stringx.containsAll("今天天气晴", Collectionx.listOf("哈", "天")))
        assertFalse(Stringx.containsAll("今天天气晴", null as Array<String>?))
        assertFalse(Stringx.containsAll(null, null as Array<String>?))
        assertFalse(Stringx.containsAll("今天天气晴", null as Collection<String>?))
        assertFalse(Stringx.containsAll(null, null as Collection<String>?))
        assertFalse(Stringx.containsAll("今天天气晴", arrayOfNulls(0)))
        assertFalse(Stringx.containsAll("今天天气晴", LinkedList()))

        assertFalse(Stringx.containsAny("HCHC", arrayOf("h", "a")))
        assertTrue(Stringx.containsAny("HCHC", arrayOf("h", "a"), true))
        assertFalse(Stringx.containsAny("HCHC", Collectionx.listOf("h", "a")))
        assertTrue(Stringx.containsAny("HCHC", Collectionx.listOf("h", "a"), true))

        assertFalse(Stringx.containsAll("HAHA", arrayOf("h", "a")))
        assertTrue(Stringx.containsAll("HAHA", arrayOf("h", "a"), true))
        assertFalse(Stringx.containsAll("HAHA", Collectionx.listOf("h", "a")))
        assertTrue(Stringx.containsAll("HAHA", Collectionx.listOf("h", "a"), true))
    }

    @Test
    fun testOrAndTo() {
        assertEquals(Stringx.orEmpty("今"), "今")
        assertEquals(Stringx.orEmpty(null), "")
        assertEquals(Stringx.orEmpty(StringBuilder("今")).toString(), "今")
        assertEquals(Stringx.orEmpty(null as CharSequence?).toString(), "")
        assertEquals(Stringx.orEmpty("JavaBean"), "JavaBean")
        assertEquals(Stringx.orEmpty(null), EMPTY)

        assertEquals(Stringx.orDefault("今", "天"), "今")
        assertEquals(Stringx.orDefault(null, "天"), "天")
        assertEquals(Stringx.orDefault(StringBuilder("今"), "天").toString(), "今")
        assertEquals(Stringx.orDefault(null as CharSequence?, "天").toString(), "天")
        assertEquals(Stringx.orDefault("JavaBean", "defaultValue"), "JavaBean")
        assertEquals(Stringx.orDefault(null, "defaultValue"), "defaultValue")

        assertNotNull(Stringx.emptyToNull("今"))
        assertNull(Stringx.emptyToNull(""))
        assertNotNull(Stringx.emptyToNull(StringBuilder("今")))
        assertNull(Stringx.emptyToNull(StringBuilder("")))
        assertEquals(Stringx.emptyToNull("JavaBean"), "JavaBean")
        assertNull(Stringx.emptyToNull(EMPTY))

        assertNotNull(Stringx.blankToNull("今"))
        assertNull(Stringx.blankToNull(" "))
        assertNotNull(Stringx.blankToNull(StringBuilder("今")))
        assertNull(Stringx.blankToNull(StringBuilder(" ")))
        assertEquals(Stringx.blankToNull("JavaBean"), "JavaBean")
        assertNull(Stringx.blankToNull("    "))
    }

    @Test
    fun testFilterBlank() {
        val source = " 费劲啊是否将as\n\n\t523\t\tcxbv\r\r而乏味 贵公司   "
        Assert.assertEquals(Stringx.filterBlank(source), "费劲啊是否将as523cxbv而乏味贵公司")
        Assert.assertEquals(Stringx.filterBlank(StringBuilder(source)).toString(), "费劲啊是否将as523cxbv而乏味贵公司")
    }

    @Test
    fun testRemoveChar() {
        Assert.assertEquals("012456789", Stringx.removeChar("0123456789", '3'))
        Assert.assertEquals("123456789", Stringx.removeChar("0123456789", '0'))
        Assert.assertEquals("012345678", Stringx.removeChar("0123456789", '9'))

        Assert.assertEquals("021456789", Stringx.removeFirstChar("0121456789", '1'))
        Assert.assertEquals("012456789", Stringx.removeLastChar("0121456789", '1'))

        Assert.assertEquals("012456789", Stringx.removeIndex("0123456789", 3))
        Assert.assertEquals("123456789", Stringx.removeIndex("0123456789", 0))
        Assert.assertEquals("012345678", Stringx.removeIndex("0123456789", 9))
    }

    @Test
    fun testLimit() {
        assertEquals("今天天气晴", Stringx.limit("今天天气晴", 6))
        assertEquals("今天天气晴", Stringx.limit("今天天气晴", 6))
        assertEquals("今天天气晴", Stringx.limit("今天天气晴", 6, "..."))
        assertEquals("今天天气晴朗", Stringx.limit("今天天气晴朗，万里无云", 6))
        assertEquals("今天天气晴朗...", Stringx.limit("今天天气晴朗，万里无云", 6, "..."))

        assertEquals("今天天气晴", Stringx.limit(StringBuilder("今天天气晴"), 6).toString())
        assertEquals("今天天气晴", Stringx.limit(StringBuilder("今天天气晴"), 6).toString())
        assertEquals("今天天气晴", Stringx.limit(StringBuilder("今天天气晴"), 6, "...").toString())
        assertEquals("今天天气晴朗", Stringx.limit(StringBuilder("今天天气晴朗，万里无云"), 6).toString())
        assertEquals("今天天气晴朗...", Stringx.limit(StringBuilder("今天天气晴朗，万里无云"), 6, "...").toString())
    }


    /*
     * *****************************************************************************************************************
     * From kotlin standard library
     * *****************************************************************************************************************
     */


    @Test
    fun testStartsWith() {
        assertTrue(Stringx.startsWith("JavaBean", 'J'))
        assertTrue("JavaBean".startsWith('J'))
        assertFalse(Stringx.startsWith("javaBean", 'b'))
        assertFalse("javaBean".startsWith('b'))
        assertFalse(Stringx.startsWith("javaBean", 'J'))
        assertFalse("javaBean".startsWith('J'))
        assertTrue(Stringx.startsWith("javaBean", 'J', true))
        assertTrue("javaBean".startsWith('J', true))

        assertTrue(Stringx.startsWith("JavaBean", "Java"))
        assertTrue("JavaBean".startsWith("Java"))
        assertFalse(Stringx.startsWith("JavaBean", "Jave"))
        assertFalse("JavaBean".startsWith("Jave"))
        assertFalse(Stringx.startsWith("JavaBean", "java"))
        assertFalse("JavaBean".startsWith("java"))
        assertTrue(Stringx.startsWith("JavaBean", "java", true))
        assertTrue("JavaBean".startsWith("java", true))

        assertTrue(Stringx.startsWith("HeaderJavaBean", "Java", 6))
        assertTrue("HeaderJavaBean".startsWith("Java", 6))
        assertFalse(Stringx.startsWith("HeaderJavaBean", "Jave", 6))
        assertFalse("HeaderJavaBean".startsWith("Jave", 6))
        assertFalse(Stringx.startsWith("HeaderJavaBean", "java", 6))
        assertFalse("HeaderJavaBean".startsWith("java", 6))
        assertTrue(Stringx.startsWith("HeaderJavaBean", "java", 6, true))
        assertTrue("HeaderJavaBean".startsWith("java", 6, true))

        assertTrue(Stringx.startsWith(StringBuilder("HeaderJavaBean"), "Java", 6))
        assertTrue((StringBuilder("HeaderJavaBean")).startsWith("Java", 6))
        assertFalse(Stringx.startsWith(StringBuilder("HeaderJavaBean"), "Jave", 6))
        assertFalse((StringBuilder("HeaderJavaBean")).startsWith("Jave", 6))
        assertFalse(Stringx.startsWith(StringBuilder("HeaderJavaBean"), "java", 6))
        assertFalse((StringBuilder("HeaderJavaBean")).startsWith("java", 6))
        assertTrue(Stringx.startsWith(StringBuilder("HeaderJavaBean"), "java", 6, true))
        assertTrue((StringBuilder("HeaderJavaBean")).startsWith("java", 6, true))
    }

    @Test
    fun testEndsWith() {
        assertTrue(Stringx.endsWith("JavaBean", "Bean"))
        assertTrue("JavaBean".endsWith("Bean"))
        assertFalse(Stringx.endsWith("JavaBean", "Bea"))
        assertFalse("JavaBean".endsWith("Bea"))

        assertFalse(Stringx.endsWith("JavaBean", "bean"))
        assertFalse("JavaBean".endsWith("bean"))
        assertTrue(Stringx.endsWith("JavaBean", "bean", true))
        assertTrue("JavaBean".endsWith("bean", true))
    }

    @Test
    fun testEquals() {
        assertTrue(Stringx.equals("JavaBean", "JavaBean"))
        assertTrue(Stringx.equals("JavaBean", "JavaBean"))
        assertFalse(Stringx.equals("JavaBean", "javabean"))
        assertTrue(Stringx.equals("JavaBean", "javabean", true))

        assertFalse(Stringx.equals("JavaBean", null))
        assertFalse(Stringx.equals(null, "javabean"))
        assertTrue(Stringx.equals(null, null))
    }

    @Test
    fun testRemoveRange() {
        assertThreeEquals("0126789", Stringx.removeRange("0123456789", 3, 6), "0123456789".removeRange(3, 6))
        assertThreeEquals("0126789", Stringx.removeRange("0123456789", Rangex.rangeTo(3, 5)), "0123456789".removeRange(3..5))

        assertThreeEquals("3456789", Stringx.removePrefix(StringBuilder("0123456789"), "012"), "0123456789".removePrefix("012"))
        assertThreeEquals("0123456789", Stringx.removePrefix("0123456789", "210"), "0123456789".removePrefix("210"))

        assertThreeEquals("0123456", Stringx.removeSuffix(StringBuilder("0123456789"), "789"), StringBuilder("0123456789").removeSuffix("789"))
        assertThreeEquals("0123456789", Stringx.removeSuffix("0123456789", "987"), StringBuilder("0123456789").removeSuffix("987"))

        assertThreeEquals("3456", Stringx.removeSurrounding(StringBuilder("0123456789"), "012", "789"), StringBuilder("0123456789").removeSurrounding("012", "789"))
        assertThreeEquals("0123456789", Stringx.removeSurrounding("0123456789", "210", "987"), "0123456789".removeSurrounding("210", "987"))

        assertThreeEquals("456", Stringx.removeSurrounding(StringBuilder(".456."), "."), StringBuilder(".456.").removeSurrounding("."))
        assertThreeEquals("123.456.789", Stringx.removeSurrounding("123.456.789", "."), "123.456.789".removeSurrounding("."))
    }

    @Test
    fun testCapitalize() {
        assertThreeEquals("Android", Stringx.capitalize("android"), "android".capitalize())
        assertThreeEquals("Android", Stringx.capitalize("Android"), "Android".capitalize())

        assertThreeEquals("android", Stringx.decapitalize("Android"), "Android".decapitalize())
        assertThreeEquals("android", Stringx.decapitalize("android"), "android".decapitalize())
    }

    @Test
    fun testPad() {
        assertThreeEquals("今天天气晴", Stringx.padStart("今天天气晴", 4), "今天天气晴".padStart(4))
        assertThreeEquals("今天天气晴", Stringx.padStart("今天天气晴", 5), "今天天气晴".padStart(5))
        assertThreeEquals("     今天天气晴", Stringx.padStart("今天天气晴", 10), "     今天天气晴".padStart(10))
        assertThreeEquals(".....今天天气晴", Stringx.padStart("今天天气晴", 10, '.'), ".....今天天气晴".padStart(10, '.'))
        assertThreeEquals("     今天天气晴", Stringx.padStart(StringBuilder("今天天气晴"), 10).toString(), (StringBuilder("今天天气晴")).padStart(10).toString())
        assertThreeEquals(".....今天天气晴", Stringx.padStart(StringBuilder("今天天气晴"), 10, '.').toString(), (StringBuilder(".....今天天气晴")).padStart(10, '.').toString())

        assertThreeEquals("今天天气晴", Stringx.padEnd("今天天气晴", 4), "今天天气晴".padEnd(4))
        assertThreeEquals("今天天气晴", Stringx.padEnd("今天天气晴", 5), "今天天气晴".padEnd(5))
        assertThreeEquals("今天天气晴     ", Stringx.padEnd("今天天气晴", 10), "今天天气晴     ".padEnd(10))
        assertThreeEquals("今天天气晴.....", Stringx.padEnd("今天天气晴", 10, '.'), "今天天气晴.....".padEnd(10, '.'))
        assertThreeEquals("今天天气晴     ", Stringx.padEnd(StringBuilder("今天天气晴"), 10).toString(), (StringBuilder("今天天气晴")).padEnd(10).toString())
        assertThreeEquals("今天天气晴.....", Stringx.padEnd(StringBuilder("今天天气晴"), 10, '.').toString(), (StringBuilder("今天天气晴")).padEnd(10, '.').toString())
    }

    @Test
    fun testFind() {
        assertThreeEquals('3'.toString(), Stringx.find(StringBuilder("0123456789")) { it == '3' }.toString(), (StringBuilder("0123456789")).find { it == '3' }.toString())
        assertThreeEquals("null", Stringx.find(StringBuilder("0123456789")) { it == 'a' }.toString(), (StringBuilder("0123456789")).find { it == 'a' }.toString())

        assertThreeEquals('3'.toString(), Stringx.findLast(StringBuilder("0123456789")) { it == '3' }.toString(), (StringBuilder("0123456789")).findLast { it == '3' }.toString())
        assertThreeEquals("null", Stringx.findLast(StringBuilder("0123456789")) { it == 'a' }.toString(), (StringBuilder("0123456789")).findLast { it == 'a' }.toString())

        assertThreeEquals(Pair(3, "3").toString(), Stringx.findAnyOf("0123456789", listOf("3", "8"), 0, false).toString(), "0123456789".findAnyOf(listOf("3", "8"), 0, false).toString())
        assertThreeEquals(Pair(8, "8").toString(), Stringx.findAnyOf("0123456789", listOf("a", "8"), 0, false).toString(), "0123456789".findAnyOf(listOf("a", "8"), 0, false).toString())
        assertThreeEquals(Pair(8, "8").toString(), Stringx.findAnyOf("0123456789", listOf("a", "8"), 0).toString(), "0123456789".findAnyOf(listOf("a", "8"), 0).toString())
        assertThreeEquals("null", Stringx.findAnyOf("abcdefg", listOf("F", "8")).toString(), "abcdefg".findAnyOf(listOf("F", "8")).toString())
        assertThreeEquals(Pair(5, "F").toString(), Stringx.findAnyOf("abcdefg", listOf("F", "8"), true).toString(), "abcdefg".findAnyOf(listOf("F", "8"), ignoreCase = true).toString())

        assertThreeEquals(Pair(6, "d").toString(), Stringx.findLastAnyOf("android", listOf("d", "a"), Stringx.count("android") - 1, false).toString(), "android".findLastAnyOf(listOf("d", "a"), "android".lastIndex, false).toString())
        assertThreeEquals(Pair(6, "d").toString(), Stringx.findLastAnyOf("android", listOf("a", "d"), Stringx.count("android") - 1, false).toString(), "android".findLastAnyOf(listOf("a", "d"), "android".lastIndex, false).toString())
        assertThreeEquals(Pair(6, "d").toString(), Stringx.findLastAnyOf("android", listOf("d", "a"), Stringx.count("android") - 1).toString(), "android".findLastAnyOf(listOf("d", "a"), "android".lastIndex).toString())
        assertThreeEquals(null.toString(), Stringx.findLastAnyOf("android", listOf("D", "A")).toString(), "android".findLastAnyOf(listOf("D", "A")).toString())
        assertThreeEquals(Pair(6, "D").toString(), Stringx.findLastAnyOf("android", listOf("D", "A"), true).toString(), "android".findLastAnyOf(listOf("D", "A"), ignoreCase = true).toString())
    }

    @Test
    fun testFirst() {
        assertThreeEquals('0', Stringx.first("0123456789"), "0123456789".first())
        try {
            Stringx.first("")
            fail()
        } catch (e: Exception) {
        }
        try {
            "".first(); fail()
        } catch (e: Exception) {
        }
        try {
            Stringx.first(null)
            fail()
        } catch (e: Exception) {
        }

        assertThreeEquals('3', Stringx.first("0123456789") { it == '3' }, "0123456789".first { it == '3' })
        try {
            Stringx.first("") { it == '3' }
            fail()
        } catch (e: Exception) {
        }
        try {
            "".first { it == '3' }
            fail()
        } catch (e: Exception) {
        }
        try {
            Stringx.first("") { it == 'a' }
            fail()
        } catch (e: Exception) {
        }
        try {
            "".first { it == 'a' }
            fail()
        } catch (e: Exception) {
        }
        try {
            Stringx.first(null) { it == '3' }
            fail()
        } catch (e: Exception) {
        }

        assertThreeEquals('0', Stringx.firstOrNull("0123456789"), "0123456789".firstOrNull())
        assertThreeEquals(null, Stringx.firstOrNull(""), "".firstOrNull())
        assertNull(Stringx.firstOrNull(null))

        assertThreeEquals('3', Stringx.firstOrNull("0123456789") { it == '3' }, "0123456789".firstOrNull { it == '3' })
        assertThreeEquals(null, Stringx.firstOrNull("") { it == '3' }, "".firstOrNull { it == '3' })
        assertThreeEquals(null, Stringx.firstOrNull("") { it == 'a' }, "".firstOrNull { it == 'a' })
        assertNull(Stringx.firstOrNull(null) { it == '3' })
    }

    @Test
    fun testLast() {
        assertThreeEquals('9', Stringx.last("0123456789"), "0123456789".last())
        try {
            Stringx.last("")
            fail()
        } catch (e: Exception) {
        }
        try {
            Stringx.last(null)
            fail()
        } catch (e: Exception) {
        }

        assertThreeEquals('3', Stringx.last("0123456789") { it == '3' }, "0123456789".last { it == '3' })
        try {
            Stringx.last("") { it == '3' }
            fail()
        } catch (e: Exception) {
        }
        try {
            Stringx.last("") { it == 'a' }
            fail()
        } catch (e: Exception) {
        }
        try {
            Stringx.last(null) { it == '3' }
            fail()
        } catch (e: Exception) {
        }

        assertThreeEquals('9', Stringx.lastOrNull("0123456789"), "0123456789".lastOrNull())
        assertThreeEquals(null, Stringx.lastOrNull(""), "".lastOrNull())
        assertNull(Stringx.lastOrNull(null))

        assertThreeEquals('3', Stringx.lastOrNull("0123456789") { it == '3' }, "0123456789".lastOrNull { it == '3' })
        assertThreeEquals(null, Stringx.lastOrNull("") { it == '3' }, "".lastOrNull { it == '3' })
        assertThreeEquals(null, Stringx.lastOrNull("") { it == 'a' }, "".lastOrNull { it == 'a' })
        assertNull(Stringx.lastOrNull(null) { it == '3' })
    }

    @Test
    fun testGet() {
        assertThreeEquals('2', Stringx.getOrElse("0123456789", 2) { 'a' }, "0123456789".getOrElse(2) { 'a' })
        assertThreeEquals('a', Stringx.getOrElse("0123456789", 10) { 'a' }, "0123456789".getOrElse(10) { 'a' })
        assertThreeEquals('a', Stringx.getOrElse("", 2) { 'a' }, "".getOrElse(2) { 'a' })
        assertEquals('a', Stringx.getOrElse(null, 2) { 'a' })

        assertThreeEquals('2', Stringx.getOrNull("0123456789", 2), "0123456789".getOrNull(2))
        assertThreeEquals(null, Stringx.getOrNull("0123456789", 10), "0123456789".getOrNull(10))
        assertThreeEquals(null, Stringx.getOrNull("", 2), "".getOrNull(2))
        assertNull(Stringx.getOrNull(null, 2))
    }

    @Test
    fun testIndexOf() {
        val sourceText = "0123456789abcdefgfedcba987654321"
        val sourceTextCount = Stringx.count(sourceText)
        val sourceText2 = "0123456789abcdefg0123456789abcdefg"
        val sourceText2Count = Stringx.count(sourceText2)

        assertThreeEquals(10, Stringx.indexOf(sourceText, 'a', 0, false), sourceText.indexOf('a', 0, false))
        assertThreeEquals(22, Stringx.indexOf(sourceText, 'a', 14, false), sourceText.indexOf('a', 14, false))
        assertThreeEquals(-1, Stringx.indexOf(sourceText, 'A', 0, false), sourceText.indexOf('A', 0, false))
        assertThreeEquals(10, Stringx.indexOf(sourceText, 'A', 0, true), sourceText.indexOf('A', 0, true))
        assertThreeEquals(-1, Stringx.indexOf(sourceText, 'A', false), sourceText.indexOf('A', ignoreCase = false))
        assertThreeEquals(10, Stringx.indexOf(sourceText, 'A', true), sourceText.indexOf('A', ignoreCase = true))
        assertThreeEquals(10, Stringx.indexOf(sourceText, 'a', 0), sourceText.indexOf('a', 0))
        assertThreeEquals(22, Stringx.indexOf(sourceText, 'a', 14), sourceText.indexOf('a', 14))
        assertThreeEquals(10, Stringx.indexOf(sourceText, 'a'), sourceText.indexOf('a'))
        assertThreeEquals(-1, Stringx.indexOf(sourceText, 'A'), sourceText.indexOf('A'))

        assertThreeEquals(11, Stringx.indexOf(sourceText2, "bc", 0, false), sourceText2.indexOf("bc", 0, false))
        assertThreeEquals(28, Stringx.indexOf(sourceText2, "bc", 14, false), sourceText2.indexOf("bc", 14, false))
        assertThreeEquals(-1, Stringx.indexOf(sourceText2, "BC", 0, false), sourceText2.indexOf("BC", 0, false))
        assertThreeEquals(11, Stringx.indexOf(sourceText2, "BC", 0, true), sourceText2.indexOf("BC", 0, true))
        assertThreeEquals(-1, Stringx.indexOf(sourceText2, "BC", false), sourceText2.indexOf("BC", ignoreCase = false))
        assertThreeEquals(11, Stringx.indexOf(sourceText2, "BC", true), sourceText2.indexOf("BC", ignoreCase = true))
        assertThreeEquals(11, Stringx.indexOf(sourceText2, "bc", 0), sourceText2.indexOf("bc", 0))
        assertThreeEquals(28, Stringx.indexOf(sourceText2, "bc", 14), sourceText2.indexOf("bc", 14))
        assertThreeEquals(11, Stringx.indexOf(sourceText2, "bc"), sourceText2.indexOf("bc"))
        assertThreeEquals(-1, Stringx.indexOf(sourceText2, "BC"), sourceText2.indexOf("BC"))

        assertThreeEquals(10, Stringx.indexOfAny(sourceText, charArrayOf('t', 'a'), 0, false), sourceText.indexOfAny(charArrayOf('t', 'a'), 0, false))
        assertThreeEquals(22, Stringx.indexOfAny(sourceText, charArrayOf('t', 'a'), 14, false), sourceText.indexOfAny(charArrayOf('t', 'a'), 14, false))
        assertThreeEquals(-1, Stringx.indexOfAny(sourceText, charArrayOf('t', 'A'), 0, false), sourceText.indexOfAny(charArrayOf('t', 'A'), 0, false))
        assertThreeEquals(10, Stringx.indexOfAny(sourceText, charArrayOf('t', 'A'), 0, true), sourceText.indexOfAny(charArrayOf('t', 'A'), 0, true))
        assertThreeEquals(-1, Stringx.indexOfAny(sourceText, charArrayOf('t', 'A'), false), sourceText.indexOfAny(charArrayOf('t', 'A'), ignoreCase = false))
        assertThreeEquals(10, Stringx.indexOfAny(sourceText, charArrayOf('t', 'A'), true), sourceText.indexOfAny(charArrayOf('t', 'A'), ignoreCase = true))
        assertThreeEquals(10, Stringx.indexOfAny(sourceText, charArrayOf('t', 'a'), 0), sourceText.indexOfAny(charArrayOf('t', 'a'), 0))
        assertThreeEquals(22, Stringx.indexOfAny(sourceText, charArrayOf('t', 'a'), 14), sourceText.indexOfAny(charArrayOf('t', 'a'), 14))
        assertThreeEquals(10, Stringx.indexOfAny(sourceText, charArrayOf('t', 'a')), sourceText.indexOfAny(charArrayOf('t', 'a')))
        assertThreeEquals(-1, Stringx.indexOfAny(sourceText, charArrayOf('t', 'A')), sourceText.indexOfAny(charArrayOf('t', 'A')))

        assertThreeEquals(11, Stringx.indexOfAny(sourceText2, listOf("bg", "bc"), 0, false), sourceText2.indexOfAny(listOf("bg", "bc"), 0, false))
        assertThreeEquals(28, Stringx.indexOfAny(sourceText2, listOf("bg", "bc"), 14, false), sourceText2.indexOfAny(listOf("bg", "bc"), 14, false))
        assertThreeEquals(-1, Stringx.indexOfAny(sourceText2, listOf("bg", "BC"), 0, false), sourceText2.indexOfAny(listOf("bg", "BC"), 0, false))
        assertThreeEquals(11, Stringx.indexOfAny(sourceText2, listOf("bg", "BC"), 0, true), sourceText2.indexOfAny(listOf("bg", "BC"), 0, true))
        assertThreeEquals(-1, Stringx.indexOfAny(sourceText2, listOf("bg", "BC"), false), sourceText2.indexOfAny(listOf("bg", "BC"), ignoreCase = false))
        assertThreeEquals(11, Stringx.indexOfAny(sourceText2, listOf("bg", "BC"), true), sourceText2.indexOfAny(listOf("bg", "BC"), ignoreCase = true))
        assertThreeEquals(11, Stringx.indexOfAny(sourceText2, listOf("bg", "bc"), 0), sourceText2.indexOfAny(listOf("bg", "bc"), 0))
        assertThreeEquals(28, Stringx.indexOfAny(sourceText2, listOf("bg", "bc"), 14), sourceText2.indexOfAny(listOf("bg", "bc"), 14))
        assertThreeEquals(11, Stringx.indexOfAny(sourceText2, listOf("bg", "bc")), sourceText2.indexOfAny(listOf("bg", "bc")))
        assertThreeEquals(-1, Stringx.indexOfAny(sourceText2, listOf("bg", "BC")), sourceText2.indexOfAny(listOf("bg", "BC")))

        assertThreeEquals(10, Stringx.indexOfFirst(sourceText) { it == 'a' }, sourceText.indexOfFirst { it == 'a' })
        assertThreeEquals(22, Stringx.indexOfLast(sourceText) { it == 'a' }, sourceText.indexOfLast { it == 'a' })

        assertThreeEquals(22, Stringx.lastIndexOf(sourceText, 'a', sourceTextCount - 1, false), sourceText.lastIndexOf('a', sourceTextCount - 1, false))
        assertThreeEquals(10, Stringx.lastIndexOf(sourceText, 'a', 14, false), sourceText.lastIndexOf('a', 14, false))
        assertThreeEquals(-1, Stringx.lastIndexOf(sourceText, 'A', sourceTextCount - 1, false), sourceText.lastIndexOf('A', sourceTextCount - 1, false))
        assertThreeEquals(22, Stringx.lastIndexOf(sourceText, 'A', sourceTextCount - 1, true), sourceText.lastIndexOf('A', sourceTextCount - 1, true))
        assertThreeEquals(-1, Stringx.lastIndexOf(sourceText, 'A', false), sourceText.lastIndexOf('A', ignoreCase = false))
        assertThreeEquals(22, Stringx.lastIndexOf(sourceText, 'A', true), sourceText.lastIndexOf('A', ignoreCase = true))
        assertThreeEquals(22, Stringx.lastIndexOf(sourceText, 'a', sourceTextCount - 1), sourceText.lastIndexOf('a', sourceTextCount - 1))
        assertThreeEquals(10, Stringx.lastIndexOf(sourceText, 'a', 14), sourceText.lastIndexOf('a', 14))
        assertThreeEquals(22, Stringx.lastIndexOf(sourceText, 'a'), sourceText.lastIndexOf('a'))
        assertThreeEquals(-1, Stringx.lastIndexOf(sourceText, 'A'), sourceText.lastIndexOf('A'))

        assertThreeEquals(28, Stringx.lastIndexOf(sourceText2, "bc", sourceText2Count - 1, false), sourceText2.lastIndexOf("bc", sourceText2Count - 1, false))
        assertThreeEquals(11, Stringx.lastIndexOf(sourceText2, "bc", 14, false), sourceText2.lastIndexOf("bc", 14, false))
        assertThreeEquals(-1, Stringx.lastIndexOf(sourceText2, "BC", sourceText2Count - 1, false), sourceText2.lastIndexOf("BC", sourceText2Count - 1, false))
        assertThreeEquals(28, Stringx.lastIndexOf(sourceText2, "BC", sourceText2Count - 1, true), sourceText2.lastIndexOf("BC", sourceText2Count - 1, true))
        assertThreeEquals(-1, Stringx.lastIndexOf(sourceText2, "BC", false), sourceText2.lastIndexOf("BC", ignoreCase = false))
        assertThreeEquals(28, Stringx.lastIndexOf(sourceText2, "BC", true), sourceText2.lastIndexOf("BC", ignoreCase = true))
        assertThreeEquals(28, Stringx.lastIndexOf(sourceText2, "bc", sourceText2Count - 1), sourceText2.lastIndexOf("bc", sourceText2Count - 1))
        assertThreeEquals(11, Stringx.lastIndexOf(sourceText2, "bc", 14), sourceText2.lastIndexOf("bc", 14))
        assertThreeEquals(28, Stringx.lastIndexOf(sourceText2, "bc"), sourceText2.lastIndexOf("bc"))
        assertThreeEquals(-1, Stringx.lastIndexOf(sourceText2, "BC"), sourceText2.lastIndexOf("BC"))

        assertThreeEquals(22, Stringx.lastIndexOfAny(sourceText, charArrayOf('t', 'a'), sourceTextCount - 1, false), sourceText.lastIndexOfAny(charArrayOf('t', 'a'), sourceTextCount - 1, false))
        assertThreeEquals(10, Stringx.lastIndexOfAny(sourceText, charArrayOf('t', 'a'), 14, false), sourceText.lastIndexOfAny(charArrayOf('t', 'a'), 14, false))
        assertThreeEquals(-1, Stringx.lastIndexOfAny(sourceText, charArrayOf('t', 'A'), sourceTextCount - 1, false), sourceText.lastIndexOfAny(charArrayOf('t', 'A'), sourceTextCount - 1, false))
        assertThreeEquals(22, Stringx.lastIndexOfAny(sourceText, charArrayOf('t', 'A'), sourceTextCount - 1, true), sourceText.lastIndexOfAny(charArrayOf('t', 'A'), sourceTextCount - 1, true))
        assertThreeEquals(-1, Stringx.lastIndexOfAny(sourceText, charArrayOf('t', 'A'), false), sourceText.lastIndexOfAny(charArrayOf('t', 'A'), ignoreCase = false))
        assertThreeEquals(22, Stringx.lastIndexOfAny(sourceText, charArrayOf('t', 'A'), true), sourceText.lastIndexOfAny(charArrayOf('t', 'A'), ignoreCase = true))
        assertThreeEquals(22, Stringx.lastIndexOfAny(sourceText, charArrayOf('t', 'a'), sourceTextCount - 1), sourceText.lastIndexOfAny(charArrayOf('t', 'a'), sourceTextCount - 1))
        assertThreeEquals(10, Stringx.lastIndexOfAny(sourceText, charArrayOf('t', 'a'), 14), sourceText.lastIndexOfAny(charArrayOf('t', 'a'), 14))
        assertThreeEquals(22, Stringx.lastIndexOfAny(sourceText, charArrayOf('t', 'a')), sourceText.lastIndexOfAny(charArrayOf('t', 'a')))
        assertThreeEquals(-1, Stringx.lastIndexOfAny(sourceText, charArrayOf('t', 'A')), sourceText.lastIndexOfAny(charArrayOf('t', 'A')))

        assertThreeEquals(28, Stringx.lastIndexOfAny(sourceText2, listOf("bg", "bc"), sourceText2Count - 1, false), sourceText2.lastIndexOfAny(listOf("bg", "bc"), sourceText2Count - 1, false))
        assertThreeEquals(11, Stringx.lastIndexOfAny(sourceText2, listOf("bg", "bc"), 14, false), sourceText2.lastIndexOfAny(listOf("bg", "bc"), 14, false))
        assertThreeEquals(-1, Stringx.lastIndexOfAny(sourceText2, listOf("bg", "BC"), sourceText2Count - 1, false), sourceText2.lastIndexOfAny(listOf("bg", "BC"), sourceText2Count - 1, false))
        assertThreeEquals(28, Stringx.lastIndexOfAny(sourceText2, listOf("bg", "BC"), sourceText2Count - 1, true), sourceText2.lastIndexOfAny(listOf("bg", "BC"), sourceText2Count - 1, true))
        assertThreeEquals(-1, Stringx.lastIndexOfAny(sourceText2, listOf("bg", "BC"), false), sourceText2.lastIndexOfAny(listOf("bg", "BC"), ignoreCase = false))
        assertThreeEquals(28, Stringx.lastIndexOfAny(sourceText2, listOf("bg", "BC"), true), sourceText2.lastIndexOfAny(listOf("bg", "BC"), ignoreCase = true))
        assertThreeEquals(28, Stringx.lastIndexOfAny(sourceText2, listOf("bg", "bc"), sourceText2Count - 1), sourceText2.lastIndexOfAny(listOf("bg", "bc"), sourceText2Count - 1))
        assertThreeEquals(11, Stringx.lastIndexOfAny(sourceText2, listOf("bg", "bc"), 14), sourceText2.lastIndexOfAny(listOf("bg", "bc"), 14))
        assertThreeEquals(28, Stringx.lastIndexOfAny(sourceText2, listOf("bg", "bc")), sourceText2.lastIndexOfAny(listOf("bg", "bc")))
        assertThreeEquals(-1, Stringx.lastIndexOfAny(sourceText2, listOf("bg", "BC")), sourceText2.lastIndexOfAny(listOf("bg", "BC")))
    }

    @Test
    fun testSubstring() {
        assertThreeEquals("345678", Stringx.subSequence(StringBuilder("0123456789"), Rangex.rangeTo(3, 8)).toString(), StringBuilder("0123456789").subSequence(3..8).toString())

        assertThreeEquals("345678", Stringx.substring("0123456789", Rangex.rangeTo(3, 8)), "0123456789".substring(3..8))
        assertThreeEquals("345678", Stringx.substring(StringBuilder("0123456789"), 3, 9), StringBuilder("0123456789").substring(3, 9))
        assertThreeEquals("345678", Stringx.substring(StringBuilder("0123456789"), Rangex.rangeTo(3, 8)), StringBuilder("0123456789").substring(3..8))

        assertThreeEquals("test", Stringx.substringBefore("test.txt.zip", '.', "test.txt.zip"), "test.txt.zip".substringBefore('.', "test.txt.zip"))
        assertThreeEquals("test", Stringx.substringBefore("testtxtzip", '.', "test"), "testtxtzip".substringBefore('.', "test"))

        assertThreeEquals("test", Stringx.substringBefore("test.txt.zip", ".", "test.txt.zip"), "test.txt.zip".substringBefore('.', "test.txt.zip"))
        assertThreeEquals("test", Stringx.substringBefore("testtxtzip", ".", "test"), "testtxtzip".substringBefore('.', "test"))

        assertThreeEquals("txt.zip", Stringx.substringAfter("test.txt.zip", '.', "test.txt.zip"), "test.txt.zip".substringAfter('.', "test.txt.zip"))
        assertThreeEquals("txt.zip", Stringx.substringAfter("testtxtzip", '.', "txt.zip"), "testtxtzip".substringAfter('.', "txt.zip"))

        assertThreeEquals("txt.zip", Stringx.substringAfter("test.txt.zip", ".", "test.txt.zip"), "test.txt.zip".substringAfter('.', "test.txt.zip"))
        assertThreeEquals("txt.zip", Stringx.substringAfter("testtxtzip", ".", "txt.zip"), "testtxtzip".substringAfter('.', "txt.zip"))

        assertThreeEquals("test.txt", Stringx.substringBeforeLast("test.txt.zip", '.', "test.txt.zip"), "test.txt.zip".substringBeforeLast('.', "test.txt.zip"))
        assertThreeEquals("test.txt", Stringx.substringBeforeLast("testtxtzip", '.', "test.txt"), "testtxtzip".substringBeforeLast('.', "test.txt"))

        assertThreeEquals("test.txt", Stringx.substringBeforeLast("test.txt.zip", ".", "test.txt.zip"), "test.txt.zip".substringBeforeLast('.', "test.txt.zip"))
        assertThreeEquals("test.txt", Stringx.substringBeforeLast("testtxtzip", ".", "test.txt"), "testtxtzip".substringBeforeLast('.', "test.txt"))

        assertThreeEquals("zip", Stringx.substringAfterLast("test.txt.zip", '.', "test.txt.zip"), "test.txt.zip".substringAfterLast('.', "test.txt.zip"))
        assertThreeEquals("zip", Stringx.substringAfterLast("testtxtzip", '.', "zip"), "testtxtzip".substringAfterLast('.', "zip"))

        assertThreeEquals("zip", Stringx.substringAfterLast("test.txt.zip", ".", "test.txt.zip"), "test.txt.zip".substringAfterLast('.', "test.txt.zip"))
        assertThreeEquals("zip", Stringx.substringAfterLast("testtxtzip", ".", "zip"), "testtxtzip".substringAfterLast('.', "zip"))
    }

    @Test
    fun testToByteArray() {
        val sourceText = Base64x.encodeToString("abcdefg")
        val charset = Charset.defaultCharset()

        assertThreeEquals(sourceText, String(Stringx.toByteArray(sourceText, charset), charset), String(sourceText.toByteArray(charset), charset))
        assertEquals("", String(Stringx.toByteArray(null, charset), charset))

        assertThreeEquals(sourceText, String(Stringx.toByteArray(sourceText)), String(sourceText.toByteArray()))
        assertEquals("", String(Stringx.toByteArray(null)))
    }

    @Test
    fun testReversed() {
        val sourceText = "abcdefg"
        val resultText = "gfedcba"

        assertThreeEquals(resultText, Stringx.reversed(sourceText), sourceText.reversed())
        assertEquals("", Stringx.reversed(null))

        assertThreeEquals(StringBuilder(resultText).toString(), Stringx.reversed(StringBuilder(sourceText)).toString(), StringBuilder(sourceText).reversed().toString())
        assertEquals(StringBuilder("").toString(), Stringx.reversed(null))
    }

    @Test
    fun testFilter() {
        val sourceText = "abcdefgfedcba"
        val resultText = "abcdegedcba"

        assertThreeEquals(StringBuilder(resultText).toString(), Stringx.filterTo(StringBuilder(sourceText), StringBuilder()) { it != 'f' }.toString(), StringBuilder(sourceText).filterTo(StringBuilder()) { it != 'f' }.toString())
        assertThreeEquals(StringBuilder(resultText).toString(), Stringx.filter(StringBuilder(sourceText)) { it != 'f' }.toString(), StringBuilder(sourceText).filter { it != 'f' }.toString())
        assertThreeEquals(resultText, Stringx.filter(sourceText) { it != 'f' }, sourceText.filter { it != 'f' })

        val indexed5 = StringBuilder()
        val indexed6 = StringBuilder()
        assertThreeEquals(StringBuilder(resultText).toString(), Stringx.filterIndexedTo(StringBuilder(sourceText), StringBuilder()) { index, it -> indexed5.append(index).append(","); it != 'f' }.toString(), StringBuilder(sourceText).filterIndexedTo(StringBuilder()) { index, it -> indexed6.append(index).append(","); it != 'f' }.toString()); assertEquals(indexed5.toString(), indexed6.toString())

        val indexed3 = StringBuilder()
        val indexed4 = StringBuilder()
        assertThreeEquals(StringBuilder(resultText).toString(), Stringx.filterIndexed(StringBuilder(sourceText)) { index, it -> indexed3.append(index).append(","); it != 'f' }.toString(), StringBuilder(sourceText).filterIndexed { index, it -> indexed4.append(index).append(","); it != 'f' }.toString()); assertEquals(indexed3.toString(), indexed4.toString())

        val indexed1 = StringBuilder()
        val indexed2 = StringBuilder()
        assertThreeEquals(resultText, Stringx.filterIndexed(sourceText) { index, it -> indexed1.append(index).append(","); it != 'f' }, sourceText.filterIndexed { index, it -> indexed2.append(index).append(","); it != 'f' }); assertEquals(indexed1.toString(), indexed2.toString())

        assertThreeEquals(StringBuilder(resultText).toString(), Stringx.filterNotTo(StringBuilder(sourceText), StringBuilder()) { it == 'f' }.toString(), StringBuilder(sourceText).filterNotTo(StringBuilder()) { it == 'f' }.toString())
        assertThreeEquals(StringBuilder(resultText).toString(), Stringx.filterNot(StringBuilder(sourceText)) { it == 'f' }.toString(), StringBuilder(sourceText).filterNot { it == 'f' }.toString())
        assertThreeEquals(resultText, Stringx.filterNot(sourceText) { it == 'f' }, sourceText.filterNot { it == 'f' })
    }

    @Test
    fun testTrim() {
        val sourceText = " \tabcdefgfedcba \n"
        val resultText = "abcdefgfedcba"
        val sourceText2 = "abcdefgfedcba"
        val resultText2 = "bcdefgfedcb"
        assertThreeEquals(resultText2, Stringx.trim(StringBuilder(sourceText2)) { it == 'a' }, StringBuilder(sourceText2).trim { it == 'a' })
        assertThreeEquals(resultText2, Stringx.trim(sourceText2) { it == 'a' }, sourceText2.trim { it == 'a' })
        assertThreeEquals(resultText2, Stringx.trim(StringBuilder(sourceText2), 'a'), StringBuilder(sourceText2).trim('a'))
        assertThreeEquals(resultText2, Stringx.trim(sourceText2, 'a'), sourceText2.trim('a'))
        assertThreeEquals(resultText, Stringx.trim(StringBuilder(sourceText)), StringBuilder(sourceText).trim())
        assertThreeEquals(resultText, Stringx.trim(sourceText), sourceText.trim())

        val sourceTextStart = " \tabcdefgfedcba \n"
        val resultTextStart = "abcdefgfedcba \n"
        val sourceTextStart2 = "abcdefgfedcba"
        val resultTextStart2 = "bcdefgfedcba"
        assertThreeEquals(resultTextStart2, Stringx.trimStart(StringBuilder(sourceTextStart2)) { it == 'a' }, StringBuilder(sourceTextStart2).trimStart { it == 'a' })
        assertThreeEquals(resultTextStart2, Stringx.trimStart(sourceTextStart2) { it == 'a' }, sourceTextStart2.trimStart { it == 'a' })
        assertThreeEquals(resultTextStart2, Stringx.trimStart(StringBuilder(sourceTextStart2), 'a'), StringBuilder(sourceTextStart2).trimStart('a'))
        assertThreeEquals(resultTextStart2, Stringx.trimStart(sourceTextStart2, 'a'), sourceTextStart2.trimStart('a'))
        assertThreeEquals(resultTextStart, Stringx.trimStart(StringBuilder(sourceTextStart)), StringBuilder(sourceTextStart).trimStart())
        assertThreeEquals(resultTextStart, Stringx.trimStart(sourceTextStart), sourceTextStart.trimStart())
        assertThreeEquals(resultText, Stringx.trim(sourceText), sourceText.trim())

        val sourceTextEnd = " \tabcdefgfedcba \n"
        val resultTextEnd = " \tabcdefgfedcba"
        val sourceTextEnd2 = "abcdefgfedcba"
        val resultTextEnd2 = "abcdefgfedcb"
        assertThreeEquals(resultTextEnd2, Stringx.trimEnd(StringBuilder(sourceTextEnd2)) { it == 'a' }, StringBuilder(sourceTextEnd2).trimEnd { it == 'a' })
        assertThreeEquals(resultTextEnd2, Stringx.trimEnd(sourceTextEnd2) { it == 'a' }, sourceTextEnd2.trimEnd { it == 'a' })
        assertThreeEquals(resultTextEnd2, Stringx.trimEnd(StringBuilder(sourceTextEnd2), 'a'), StringBuilder(sourceTextEnd2).trimEnd('a'))
        assertThreeEquals(resultTextEnd2, Stringx.trimEnd(sourceTextEnd2, 'a'), sourceTextEnd2.trimEnd('a'))
        assertThreeEquals(resultTextEnd, Stringx.trimEnd(StringBuilder(sourceTextEnd)), StringBuilder(sourceTextEnd).trimEnd())
        assertThreeEquals(resultTextEnd, Stringx.trimEnd(sourceTextEnd), sourceTextEnd.trimEnd())
    }

    @Test
    fun testIterator() {
        val sourceText = "0123456789"
        val resultText = "0, 1, 2, 3, 4, 5, 6, 7, 8, 9"
        assertEquals(resultText, Collectionx.joinToString(Stringx.iterable(sourceText)))

        val list = LinkedList<Char>()
        for (char in Stringx.iterator(sourceText)) {
            list.add(char)
        }
        assertEquals(resultText, Collectionx.joinToString(list))
    }

    @Test
    fun testReplace() {
        val sourceTextRange = "0123456789"
        val resultTextRange = "01aaaaaa89"
        assertThreeEquals(resultTextRange, Stringx.replaceRange(StringBuilder(sourceTextRange), 2, 8, "aaaaaa").toString(), StringBuilder(sourceTextRange).replaceRange(2, 8, "aaaaaa").toString())
        assertThreeEquals(resultTextRange, Stringx.replaceRange(sourceTextRange, 2, 8, "aaaaaa"), sourceTextRange.replaceRange(2, 8, "aaaaaa"))
        assertThreeEquals(resultTextRange, Stringx.replaceRange(StringBuilder(sourceTextRange), Rangex.rangeTo(2, 7), "aaaaaa").toString(), StringBuilder(sourceTextRange).replaceRange(2..7, "aaaaaa").toString())
        assertThreeEquals(resultTextRange, Stringx.replaceRange(sourceTextRange, Rangex.rangeTo(2, 7), "aaaaaa"), sourceTextRange.replaceRange(2..7, "aaaaaa"))

        val sourceTextBefore = "test.txt"
        val sourceTextBeforeError = "testtxt"
        val resultTextBefore = "simple.txt"
        assertThreeEquals(resultTextBefore, Stringx.replaceBefore(sourceTextBefore, '.', "simple", sourceTextBefore), sourceTextBefore.replaceBefore('.', "simple", sourceTextBefore))
        assertThreeEquals(resultTextBefore, Stringx.replaceBefore(sourceTextBeforeError, '.', "simple", resultTextBefore), sourceTextBeforeError.replaceBefore('.', "simple", resultTextBefore))
        assertThreeEquals(resultTextBefore, Stringx.replaceBefore(sourceTextBefore, ".", "simple", sourceTextBefore), sourceTextBefore.replaceBefore(".", "simple", sourceTextBefore))
        assertThreeEquals(resultTextBefore, Stringx.replaceBefore(sourceTextBeforeError, ".", "simple", resultTextBefore), sourceTextBeforeError.replaceBefore(".", "simple", resultTextBefore))

        val sourceTextBeforeLast = "test.txt.zip"
        val sourceTextBeforeLastError = "testtxtzip"
        val resultTextBeforeLast = "simple.txt.zip"
        assertThreeEquals(resultTextBeforeLast, Stringx.replaceBeforeLast(sourceTextBeforeLast, '.', "simple.txt", sourceTextBeforeLast), sourceTextBeforeLast.replaceBeforeLast('.', "simple.txt", sourceTextBeforeLast))
        assertThreeEquals(resultTextBeforeLast, Stringx.replaceBeforeLast(sourceTextBeforeLastError, '.', "simple.txt", resultTextBeforeLast), sourceTextBeforeLastError.replaceBeforeLast('.', "simple.txt", resultTextBeforeLast))
        assertThreeEquals(resultTextBeforeLast, Stringx.replaceBeforeLast(sourceTextBeforeLast, ".", "simple.txt", sourceTextBeforeLast), sourceTextBeforeLast.replaceBeforeLast(".", "simple.txt", sourceTextBeforeLast))
        assertThreeEquals(resultTextBeforeLast, Stringx.replaceBeforeLast(sourceTextBeforeLastError, ".", "simple.txt", resultTextBeforeLast), sourceTextBeforeLastError.replaceBeforeLast(".", "simple.txt", resultTextBeforeLast))

        val sourceTextAfter = "test.txt"
        val sourceTextAfterError = "testtxt"
        val resultTextAfter = "test.zip"
        assertThreeEquals(resultTextAfter, Stringx.replaceAfter(sourceTextAfter, '.', "zip", sourceTextAfter), sourceTextAfter.replaceAfter('.', "zip", sourceTextAfter))
        assertThreeEquals(resultTextAfter, Stringx.replaceAfter(sourceTextAfterError, '.', "zip", resultTextAfter), sourceTextAfterError.replaceAfter('.', "zip", resultTextAfter))
        assertThreeEquals(resultTextAfter, Stringx.replaceAfter(sourceTextAfter, ".", "zip", sourceTextAfter), sourceTextAfter.replaceAfter(".", "zip", sourceTextAfter))
        assertThreeEquals(resultTextAfter, Stringx.replaceAfter(sourceTextAfterError, ".", "zip", resultTextAfter), sourceTextAfterError.replaceAfter(".", "zip", resultTextAfter))

        val sourceTextAfterLast = "test.txt.zip"
        val sourceTextAfterLastError = "testtxtzip"
        val resultTextAfterLast = "test.txt.rar"
        assertThreeEquals(resultTextAfterLast, Stringx.replaceAfterLast(sourceTextAfterLast, '.', "rar", sourceTextAfterLast), sourceTextAfterLast.replaceAfterLast('.', "rar", sourceTextAfterLast))
        assertThreeEquals(resultTextAfterLast, Stringx.replaceAfterLast(sourceTextAfterLastError, '.', "rar", resultTextAfterLast), sourceTextAfterLastError.replaceAfterLast('.', "rar", resultTextAfterLast))
        assertThreeEquals(resultTextAfterLast, Stringx.replaceAfterLast(sourceTextAfterLast, ".", "rar", sourceTextAfterLast), sourceTextAfterLast.replaceAfterLast(".", "rar", sourceTextAfterLast))
        assertThreeEquals(resultTextAfterLast, Stringx.replaceAfterLast(sourceTextAfterLastError, ".", "rar", resultTextAfterLast), sourceTextAfterLastError.replaceAfterLast(".", "rar", resultTextAfterLast))

        val sourceTextPattern = "fasfjs hello@gmail.com fasf hello@outlook.com"
        val resultTextPattern = "fasfjs http://google.com fasf http://google.com"
        assertThreeEquals(resultTextPattern, Stringx.replace(sourceTextPattern, Regexx.EMAIL, "http://google.com"), sourceTextPattern.replace(Regex(Regexx.EMAIL.pattern()), "http://google.com"))

        val sourceTextFirstPattern = "fasfjs hello@gmail.com fasf hello@outlook.com"
        val resultTextFirstPattern = "fasfjs http://google.com fasf hello@outlook.com"
        assertThreeEquals(resultTextFirstPattern, Stringx.replaceFirst(sourceTextFirstPattern, Regexx.EMAIL, "http://google.com"), sourceTextFirstPattern.replaceFirst(Regex(Regexx.EMAIL.pattern()), "http://google.com"))
    }
}
