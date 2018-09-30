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
import org.junit.Assert.*
import org.junit.Test
import java.util.*

class StringxTest {

    private val BLANK = "     "
    private val EMPTY = ""
    private val YES = "yes"
    private val DIGIT = "8"
    private val LETTER = "a飞"
    private val CHINESE = "飞"
    private val LETTER_OR_DIGIT = "a飞8"
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
        assertEquals(YES.isNotSafeOr("default"), YES)
    }

    @Test
    fun testIsBlank() {
        assertTrue(BLANK.isBlank())
        assertTrue(EMPTY.isBlank())
        assertFalse(YES.isBlank())
//        assertFalse(null.isBlank())

        assertTrue(YES.isNotBlank())
//        assertTrue(null.isNotBlank())
        assertFalse(BLANK.isNotBlank())
        assertFalse(EMPTY.isNotBlank())

        assertEquals(BLANK.isBlankOr("default"), "default")
        assertEquals(YES.isBlankOr("default"), YES)


        assertTrue(null.isNullOrBlank())
        assertTrue(BLANK.isNullOrBlank())
        assertTrue(EMPTY.isNullOrBlank())
        assertFalse(YES.isNullOrBlank())

        assertTrue(YES.isNotNullOrBlank())
        assertFalse(null.isNotNullOrBlank())
        assertFalse(BLANK.isNotNullOrBlank())
        assertFalse(EMPTY.isNotNullOrBlank())

        assertEquals(BLANK.isNullOrBlankOr("default"), "default")
        assertEquals(null.isNullOrBlankOr("default"), "default")
        assertEquals(YES.isNullOrBlankOr("default"), YES)
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
        assertEquals(YES.isEmptyOr("default"), YES)


        assertTrue(null.isNullOrEmpty())
        assertTrue(EMPTY.isNullOrEmpty())
        assertFalse(YES.isNullOrEmpty())

        assertTrue(YES.isNotNullOrEmpty())
        assertFalse(null.isNotNullOrEmpty())
        assertFalse(EMPTY.isNotNullOrEmpty())

        assertEquals(EMPTY.isNullOrEmptyOr("default"), "default")
        assertEquals(null.isNullOrEmptyOr("default"), "default")
        assertEquals(YES.isNullOrEmptyOr("default"), YES)
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
        assertEquals(null.isNotChineseOr("default"), "default")
        assertEquals(CHINESE.isNotChineseOr("default"), CHINESE)
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
        assertEquals(null.isNotDigitOr("3"), "3")
        assertEquals(DIGIT.isNotDigitOr("3"), DIGIT)
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
        assertEquals(null.isNotLetterOr("default"), "default")
        assertEquals(LETTER.isNotLetterOr("default"), LETTER)
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
        assertEquals(null.isNotLetterOrDigitOr("default"), "default")
        assertEquals(LETTER_OR_DIGIT.isNotLetterOrDigitOr("default"), LETTER_OR_DIGIT)
    }

    @Test
    fun testContains() {
        assertTrue("今天天气晴".orContains(arrayOf("哈", "天")))
        assertFalse("今天天气晴".orContains(arrayOf("哈")))
        assertTrue("今天天气晴".orContains(listOf("哈", "天")))
        assertFalse("今天天气晴".orContains(listOf("哈")))
        assertFalse("今天天气晴".orContains(null as Array<String>?))
        assertFalse(null.orContains(null as Array<String>?))
        assertFalse("今天天气晴".orContains(null as Collection<String>?))
        assertFalse(null.orContains(null as Collection<String>?))
        assertFalse("今天天气晴".orContains(arrayOf()))
        assertFalse("今天天气晴".orContains(LinkedList()))

        assertTrue("今天天气晴".andContains(arrayOf("晴", "天")))
        assertFalse("今天天气晴".andContains(arrayOf("哈", "天")))
        assertTrue("今天天气晴".andContains(listOf("晴", "天")))
        assertFalse("今天天气晴".andContains(listOf("哈", "天")))
        assertFalse("今天天气晴".andContains(null as Array<String>?))
        assertFalse(null.andContains(null as Array<String>?))
        assertFalse("今天天气晴".andContains(null as Collection<String>?))
        assertFalse(null.andContains(null as Collection<String>?))
        assertFalse("今天天气晴".andContains(arrayOf()))
        assertFalse("今天天气晴".andContains(LinkedList()))
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
}