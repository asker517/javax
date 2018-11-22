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

@file:Suppress("PrivatePropertyName")

package me.panpf.javaxkt.test.lang

import me.panpf.javaxkt.lang.*
import org.junit.Assert
import org.junit.Assert.*
import org.junit.Test
import java.util.*

class StringxTest {

    private val BLANK = "     "
    private val BLANK_CHAR_SEQUENCE: CharSequence = "     "
    private val SPACE = " "
    private val ENTRY = "\r"
    private val TAB = "\t"
    private val WRAP = "\n"
    private val EMPTY = ""
    private val EMPTY_CHAR_SEQUENCE: CharSequence = ""
    private val YES = "yes"
    private val YES_CHAR_SEQUENCE: CharSequence = "*%￥#@"
    private val DIGIT = "8"
    private val DIGIT_CHAR_SEQUENCE: CharSequence = "8"
    private val LETTER = "a飞"
    private val LETTER_CHAR_SEQUENCE: CharSequence = "a飞"
    private val CHINESE = "飞"
    private val CHINESE_CHAR_SEQUENCE: CharSequence = "飞"
    private val LETTER_OR_DIGIT = "a飞8"
    private val LETTER_OR_DIGIT_CHAR_SEQUENCE: CharSequence = "a飞8"
    private val SYMBOL = "*%￥#@"

    @Test
    fun testSafe() {
        assertTrue(YES.isSafe())
        assertFalse(null.isSafe())
        assertFalse(BLANK.isSafe())
        assertFalse(EMPTY.isSafe())

        assertTrue((null as CharSequence?).isNotSafe())
        assertTrue(BLANK.isNotSafe())
        assertTrue(EMPTY.isNotSafe())
        assertFalse(YES.isNotSafe())

        assertEquals(EMPTY.isNotSafeOr("default"), "default")
        assertEquals(EMPTY_CHAR_SEQUENCE.isNotSafeOr("default"), "default")
        assertEquals(YES.isNotSafeOr("default"), YES)
        assertEquals(YES_CHAR_SEQUENCE.isNotSafeOr("default"), YES_CHAR_SEQUENCE)
    }

    @Test
    fun testIsBlank() {
        assertTrue(BLANK.isBlank())
        assertTrue(EMPTY.isBlank())
        assertTrue(SPACE.isBlank())
        assertTrue(ENTRY.isBlank())
        assertTrue(TAB.isBlank())
        assertTrue(WRAP.isBlank())
        assertFalse(YES.isBlank())
        assertFalse(DIGIT.isBlank())
        assertFalse(LETTER.isBlank())
        assertFalse(CHINESE.isBlank())
        assertFalse(LETTER_OR_DIGIT.isBlank())
        assertFalse(SYMBOL.isBlank())
//        assertFalse(null.isBlank())

        assertTrue(YES.isNotBlank())
        assertTrue(DIGIT.isNotBlank())
        assertTrue(LETTER.isNotBlank())
        assertTrue(CHINESE.isNotBlank())
        assertTrue(LETTER_OR_DIGIT.isNotBlank())
        assertTrue(SYMBOL.isNotBlank())
//        assertTrue(null.isNotBlank())
        assertFalse(BLANK.isNotBlank())
        assertFalse(EMPTY.isNotBlank())
        assertFalse(SPACE.isNotBlank())
        assertFalse(ENTRY.isNotBlank())
        assertFalse(TAB.isNotBlank())
        assertFalse(WRAP.isNotBlank())

        assertEquals(BLANK.isBlankOr("default"), "default")
        assertEquals(BLANK_CHAR_SEQUENCE.isBlankOr("default"), "default")
        assertEquals(YES.isBlankOr("default"), YES)
        assertEquals(YES_CHAR_SEQUENCE.isBlankOr("default"), YES_CHAR_SEQUENCE)
        assertEquals(null.isBlankOr("default"), "default")


        assertTrue(null.isNullOrBlank())
        @Suppress("UselessCallOnNotNull")
        assertTrue(BLANK.isNullOrBlank())
        @Suppress("UselessCallOnNotNull")
        assertTrue(EMPTY.isNullOrBlank())
        @Suppress("UselessCallOnNotNull")
        assertFalse(YES.isNullOrBlank())

        assertTrue(YES.isNotNullOrBlank())
        assertFalse(null.isNotNullOrBlank())
        assertFalse(BLANK.isNotNullOrBlank())
        assertFalse(EMPTY.isNotNullOrBlank())

        assertEquals(BLANK.isNullOrBlankOr("default"), "default")
        assertEquals(BLANK_CHAR_SEQUENCE.isNullOrBlankOr("default"), "default")
        assertEquals(null.isNullOrBlankOr("default"), "default")
        assertEquals(YES.isNullOrBlankOr("default"), YES)
        assertEquals(YES_CHAR_SEQUENCE.isNullOrBlankOr("default"), YES_CHAR_SEQUENCE)
    }

    @Test
    fun testIsEmpty() {
        assertTrue(EMPTY.isEmpty())
        assertFalse(BLANK.isEmpty())
        assertFalse(YES.isEmpty())
//        assertFalse(null.isEmpty())

        assertTrue(BLANK.isNotEmpty())
        assertTrue(YES.isNotEmpty())
//        assertTrue(null.isNotEmpty())
        assertFalse(EMPTY.isNotEmpty())

        assertEquals(EMPTY.isEmptyOr("default"), "default")
        assertEquals(EMPTY_CHAR_SEQUENCE.isEmptyOr("default"), "default")
        assertEquals(YES.isEmptyOr("default"), YES)
        assertEquals(YES_CHAR_SEQUENCE.isEmptyOr("default"), YES_CHAR_SEQUENCE)


        assertTrue(null.isNullOrEmpty())
        @Suppress("UselessCallOnNotNull")
        assertTrue(EMPTY.isNullOrEmpty())
        @Suppress("UselessCallOnNotNull")
        assertFalse(YES.isNullOrEmpty())

        assertTrue(YES.isNotNullOrEmpty())
        assertFalse(null.isNotNullOrEmpty())
        assertFalse(EMPTY.isNotNullOrEmpty())

        assertEquals(EMPTY.isNullOrEmptyOr("default"), "default")
        assertEquals(EMPTY_CHAR_SEQUENCE.isNullOrEmptyOr("default"), "default")
        assertEquals(null.isNullOrEmptyOr("default"), "default")
        assertEquals(YES.isNullOrEmptyOr("default"), YES)
        assertEquals(YES_CHAR_SEQUENCE.isNullOrEmptyOr("default"), YES_CHAR_SEQUENCE)
    }

    @Test
    fun testChinese() {
        assertTrue(CHINESE.isChinese())
        assertFalse(EMPTY.isChinese())
        assertFalse(DIGIT.isChinese())
        assertFalse(LETTER.isChinese())
        assertFalse(BLANK.isChinese())
        assertFalse(null.isChinese())

        assertTrue(EMPTY.isNotChinese())
        assertTrue(DIGIT.isNotChinese())
        assertTrue(LETTER.isNotChinese())
        assertTrue(BLANK.isNotChinese())
        assertTrue(null.isNotChinese())
        assertFalse(CHINESE.isNotChinese())

        assertEquals(LETTER.isNotChineseOr("default"), "default")
        assertEquals(LETTER_CHAR_SEQUENCE.isNotChineseOr("default"), "default")
        assertEquals(null.isNotChineseOr("default"), "default")
        assertEquals(CHINESE.isNotChineseOr("default"), CHINESE)
        assertEquals(CHINESE_CHAR_SEQUENCE.isNotChineseOr("default"), CHINESE_CHAR_SEQUENCE)
    }

    @Test
    fun testDigit() {
        assertTrue(DIGIT.isDigit())
        assertFalse(EMPTY.isDigit())
        assertFalse(CHINESE.isDigit())
        assertFalse(LETTER.isDigit())
        assertFalse(BLANK.isDigit())
        assertFalse(null.isDigit())

        assertTrue(EMPTY.isNotDigit())
        assertTrue(CHINESE.isNotDigit())
        assertTrue(LETTER.isNotDigit())
        assertTrue(BLANK.isNotDigit())
        assertTrue(null.isNotDigit())
        assertFalse(DIGIT.isNotDigit())

        assertEquals(LETTER.isNotDigitOr("3"), "3")
        assertEquals(LETTER_CHAR_SEQUENCE.isNotDigitOr("3"), "3")
        assertEquals(null.isNotDigitOr("3"), "3")
        assertEquals(DIGIT.isNotDigitOr("3"), DIGIT)
        assertEquals(DIGIT_CHAR_SEQUENCE.isNotDigitOr("3"), DIGIT_CHAR_SEQUENCE)
    }

    @Test
    fun testLetter() {
        assertTrue(LETTER.isLetter())
        assertFalse(EMPTY.isLetter())
        assertFalse(DIGIT.isLetter())
        assertFalse(BLANK.isLetter())
        assertFalse(null.isLetter())

        assertTrue(EMPTY.isNotLetter())
        assertTrue(DIGIT.isNotLetter())
        assertTrue(BLANK.isNotLetter())
        assertTrue(null.isNotLetter())
        assertFalse(LETTER.isNotLetter())

        assertEquals(DIGIT.isNotLetterOr("default"), "default")
        assertEquals(DIGIT_CHAR_SEQUENCE.isNotLetterOr("default"), "default")
        assertEquals(null.isNotLetterOr("default"), "default")
        assertEquals(LETTER.isNotLetterOr("default"), LETTER)
        assertEquals(LETTER_CHAR_SEQUENCE.isNotLetterOr("default"), LETTER_CHAR_SEQUENCE)
    }

    @Test
    fun testLetterOrDigit() {
        assertTrue(LETTER_OR_DIGIT.isLetterOrDigit())
        assertFalse(EMPTY.isLetterOrDigit())
        assertFalse(BLANK.isLetterOrDigit())
        assertFalse(SYMBOL.isLetterOrDigit())
        assertFalse(null.isLetterOrDigit())

        assertTrue(EMPTY.isNotLetterOrDigit())
        assertTrue(BLANK.isNotLetterOrDigit())
        assertTrue(null.isNotLetterOrDigit())
        assertTrue(SYMBOL.isNotLetterOrDigit())
        assertFalse(LETTER_OR_DIGIT.isNotLetterOrDigit())

        assertEquals(EMPTY.isNotLetterOrDigitOr("default"), "default")
        assertEquals(EMPTY_CHAR_SEQUENCE.isNotLetterOrDigitOr("default"), "default")
        assertEquals(null.isNotLetterOrDigitOr("default"), "default")
        assertEquals(LETTER_OR_DIGIT.isNotLetterOrDigitOr("default"), LETTER_OR_DIGIT)
        assertEquals(LETTER_OR_DIGIT_CHAR_SEQUENCE.isNotLetterOrDigitOr("default"), LETTER_OR_DIGIT_CHAR_SEQUENCE)
    }

    @Test
    fun testContains() {
        assertTrue("今天天气晴".containsAny(arrayOf("哈", "天")))
        assertFalse("今天天气晴".containsAny(arrayOf("哈")))
        assertTrue("今天天气晴".containsAny(listOf("哈", "天")))
        assertFalse("今天天气晴".containsAny(listOf("哈")))
        assertFalse("今天天气晴".containsAny(null as Array<String>?))
        assertFalse(null.containsAny(null as Array<String>?))
        assertFalse("今天天气晴".containsAny(null as Collection<String>?))
        assertFalse(null.containsAny(null as Collection<String>?))
        assertFalse("今天天气晴".containsAny(arrayOf()))
        assertFalse("今天天气晴".containsAny(LinkedList()))

        assertTrue("今天天气晴".containsAll(arrayOf("晴", "天")))
        assertFalse("今天天气晴".containsAll(arrayOf("哈", "天")))
        assertTrue("今天天气晴".containsAll(listOf("晴", "天")))
        assertFalse("今天天气晴".containsAll(listOf("哈", "天")))
        assertFalse("今天天气晴".containsAll(null as Array<String>?))
        assertFalse(null.containsAll(null as Array<String>?))
        assertFalse("今天天气晴".containsAll(null as Collection<String>?))
        assertFalse(null.containsAll(null as Collection<String>?))
        assertFalse("今天天气晴".containsAll(arrayOf()))
        assertFalse("今天天气晴".containsAll(LinkedList()))

        assertFalse("HCHC".containsAny(arrayOf("h", "a")))
        assertTrue("HCHC".containsAny(arrayOf("h", "a"), true))
        assertFalse("HCHC".containsAny(listOf("h", "a")))
        assertTrue("HCHC".containsAny(listOf("h", "a"), true))

        assertFalse("HAHA".containsAll(arrayOf("h", "a")))
        assertTrue("HAHA".containsAll(arrayOf("h", "a"), true))
        assertFalse("HAHA".containsAll(listOf("h", "a")))
        assertTrue("HAHA".containsAll(listOf("h", "a"), true))
    }

    @Test
    fun testOrAndTo() {
        assertEquals("今".orEmpty(), "今")
        assertEquals(null.orEmpty(), "")
        assertEquals(("今" as CharSequence).orEmpty(), "今")
        assertEquals((null as CharSequence?).orEmpty(), "")

        assertEquals("今".orDefault("天"), "今")
        assertEquals(null.orDefault("天"), "天")
        assertEquals(("今" as CharSequence).orDefault("天"), "今")
        assertEquals((null as CharSequence?).orDefault("天"), "天")

        assertNotNull("今".emptyToNull())
        assertNull("".emptyToNull())
        assertNotNull(("今" as CharSequence).emptyToNull())
        assertNull(("" as CharSequence).emptyToNull())

        assertNotNull("今".blankToNull())
        assertNull(" ".blankToNull())
        assertNotNull(("今" as CharSequence).blankToNull())
        assertNull((" " as CharSequence).blankToNull())
    }

    @Test
    fun testFilterBlank() {
        val source = " 费劲啊是否将as\n\n\t523\t\tcxbv\r\r而乏味 贵公司   "
        Assert.assertEquals(source.filterBlank(), "费劲啊是否将as523cxbv而乏味贵公司")
        Assert.assertEquals(StringBuilder(source).filterBlank().toString(), "费劲啊是否将as523cxbv而乏味贵公司")
    }

    @Test
    fun testRemoveChar() {
        Assert.assertEquals("012456789", "0123456789".removeChar('3'))
        Assert.assertEquals("123456789", "0123456789".removeChar('0'))
        Assert.assertEquals("012345678", "0123456789".removeChar('9'))
        Assert.assertEquals("", null.removeChar('9'))

        Assert.assertEquals("021456789", "0121456789".removeFirstChar('1'))
        Assert.assertEquals("", null.removeFirstChar('1'))
        Assert.assertEquals("012456789", "0121456789".removeLastChar('1'))
        Assert.assertEquals("", null.removeLastChar('1'))

        Assert.assertEquals("012456789", "0123456789".removeIndex(3))
        Assert.assertEquals("123456789", "0123456789".removeIndex(0))
        Assert.assertEquals("012345678", "0123456789".removeIndex(9))
        Assert.assertEquals("", null.removeIndex(9))
    }

    @Test
    fun testLimit() {
        assertEquals("今天天气晴", "今天天气晴".limit(6))
        assertEquals("今天天气晴", "今天天气晴".limit(6))
        assertEquals("今天天气晴", "今天天气晴".limit(6, "..."))
        assertEquals("今天天气晴朗", "今天天气晴朗，万里无云".limit(6))
        assertEquals("今天天气晴朗...", "今天天气晴朗，万里无云".limit(6, "..."))

        assertEquals("今天天气晴", ("今天天气晴" as CharSequence).limit(6))
        assertEquals("今天天气晴", ("今天天气晴" as CharSequence).limit(6))
        assertEquals("今天天气晴", ("今天天气晴" as CharSequence).limit(6, "..."))
        assertEquals("今天天气晴朗", ("今天天气晴朗，万里无云" as CharSequence).limit(6))
        assertEquals("今天天气晴朗...", ("今天天气晴朗，万里无云" as CharSequence).limit(6, "..."))

        assertEquals("", null.limit(6, "..."))
        try {
            "今天天气晴".limit(-1, "...")
            fail()
        } catch (e: Exception) {
        }
    }
}