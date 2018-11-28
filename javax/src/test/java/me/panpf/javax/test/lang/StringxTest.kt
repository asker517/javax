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
import me.panpf.javax.collections.MapBuilder
import me.panpf.javax.collections.Mapx
import me.panpf.javax.lang.Charx
import me.panpf.javax.lang.Stringx
import me.panpf.javax.ranges.Rangex
import me.panpf.javax.test.Assertx.assertThreeEquals
import me.panpf.javax.util.Base64x
import me.panpf.javax.util.DefaultValue
import me.panpf.javax.util.Regexx
import org.junit.Assert
import org.junit.Assert.*
import org.junit.Test
import java.nio.charset.Charset
import java.util.*

class StringxTest {

    companion object {
        private const val BLANK = "     "
        private val BLANK_CHAR_SEQUENCE: CharSequence = "     "
        private const val SPACE = " "
        private const val ENTRY = "\r"
        private const val TAB = "\t"
        private const val WRAP = "\n"
        private const val EMPTY = ""
        private val EMPTY_CHAR_SEQUENCE: CharSequence = ""
        private const val YES = "yes"
        private val YES_CHAR_SEQUENCE: CharSequence = "yes"
        private const val DIGIT = "8"
        private val DIGIT_CHAR_SEQUENCE: CharSequence = "8"
        private const val LETTER = "a飞"
        private val LETTER_CHAR_SEQUENCE: CharSequence = "a飞"
        private const val CHINESE = "飞"
        private val CHINESE_CHAR_SEQUENCE: CharSequence = "飞"
        private const val LETTER_OR_DIGIT = "a飞8"
        private val LETTER_OR_DIGIT_CHAR_SEQUENCE: CharSequence = "a飞8"
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
        assertEquals(Stringx.isNotSafeOr(EMPTY_CHAR_SEQUENCE, "default"), "default")
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
        assertEquals(Stringx.isBlankOr(BLANK_CHAR_SEQUENCE, "default"), "default")
        assertEquals(Stringx.isBlankOr(YES, "default"), YES)
        assertEquals(Stringx.isBlankOr(YES_CHAR_SEQUENCE, "default"), YES_CHAR_SEQUENCE)
        assertEquals(Stringx.isBlankOr(null, "default"), "default")


        assertTrue(Stringx.isNullOrBlank(null))
        assertTrue(Stringx.isNullOrBlank(BLANK))
        assertTrue(Stringx.isNullOrBlank(EMPTY))
        assertFalse(Stringx.isNullOrBlank(YES))

        assertTrue(Stringx.isNotNullOrBlank(YES))
        assertFalse(Stringx.isNotNullOrBlank(null))
        assertFalse(Stringx.isNotNullOrBlank(BLANK))
        assertFalse(Stringx.isNotNullOrBlank(EMPTY))

        assertEquals(Stringx.isNullOrBlankOr(BLANK, "default"), "default")
        assertEquals(Stringx.isNullOrBlankOr(BLANK_CHAR_SEQUENCE, "default"), "default")
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
        assertEquals(Stringx.isEmptyOr(EMPTY_CHAR_SEQUENCE, "default"), "default")
        assertEquals(Stringx.isEmptyOr(YES, "default"), YES)
        assertEquals(Stringx.isEmptyOr(YES_CHAR_SEQUENCE, "default"), YES_CHAR_SEQUENCE)


        assertTrue(Stringx.isNullOrEmpty(null))
        assertTrue(Stringx.isNullOrEmpty(EMPTY))
        assertFalse(Stringx.isNullOrEmpty(YES))

        assertTrue(Stringx.isNotNullOrEmpty(YES))
        assertFalse(Stringx.isNotNullOrEmpty(null))
        assertFalse(Stringx.isNotNullOrEmpty(EMPTY))

        assertEquals(Stringx.isNullOrEmptyOr(EMPTY, "default"), "default")
        assertEquals(Stringx.isNullOrEmptyOr(EMPTY_CHAR_SEQUENCE, "default"), "default")
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
        assertEquals(Stringx.isNotChineseOr(LETTER_CHAR_SEQUENCE, "default"), "default")
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
        assertEquals(Stringx.isNotDigitOr(LETTER_CHAR_SEQUENCE, "3"), "3")
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
        assertEquals(Stringx.isNotLetterOr(DIGIT_CHAR_SEQUENCE, "default"), "default")
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
        assertEquals(Stringx.isNotLetterOrDigitOr(EMPTY_CHAR_SEQUENCE, "default"), "default")
        assertEquals(Stringx.isNotLetterOrDigitOr(null, "default"), "default")
        assertEquals(Stringx.isNotLetterOrDigitOr(LETTER_OR_DIGIT, "default"), LETTER_OR_DIGIT)
        assertEquals(Stringx.isNotLetterOrDigitOr(LETTER_OR_DIGIT_CHAR_SEQUENCE, "default"), LETTER_OR_DIGIT_CHAR_SEQUENCE)
    }

    @Test
    fun testContainsAnyAndAll() {
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
        Assert.assertEquals("", Stringx.removeChar(null, '9'))

        Assert.assertEquals("021456789", Stringx.removeFirstChar("0121456789", '1'))
        Assert.assertEquals("", Stringx.removeFirstChar(null, '1'))
        Assert.assertEquals("012456789", Stringx.removeLastChar("0121456789", '1'))
        Assert.assertEquals("", Stringx.removeLastChar(null, '1'))

        Assert.assertEquals("012456789", Stringx.removeIndex("0123456789", 3))
        Assert.assertEquals("123456789", Stringx.removeIndex("0123456789", 0))
        Assert.assertEquals("012345678", Stringx.removeIndex("0123456789", 9))
        Assert.assertEquals("", Stringx.removeIndex(null, 9))
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

        assertEquals("", Stringx.limit(null, 6, "..."))
        try {
            Stringx.limit("今天天气晴", -1, "...")
            fail()
        } catch (e: Exception) {
        }
    }


    /*
     * *****************************************************************************************************************
     * From kotlin standard library
     * *****************************************************************************************************************
     */


    @Test
    fun testStartsWith() {
        assertThreeEquals(true, Stringx.startsWith("JavaBean", 'J'), "JavaBean".startsWith('J'))
        assertThreeEquals(false, Stringx.startsWith("javaBean", 'b'), "javaBean".startsWith('b'))
        assertThreeEquals(false, Stringx.startsWith("javaBean", 'J'), "javaBean".startsWith('J'))
        assertThreeEquals(true, Stringx.startsWith("javaBean", 'J', true), "javaBean".startsWith('J', true))
        assertThreeEquals(false, Stringx.startsWith("", 'J', true), "".startsWith('J', true))
        assertThreeEquals(false, Stringx.startsWith(null, 'J', true), "".startsWith('J', true))

        assertThreeEquals(true, Stringx.startsWith(StringBuilder("JavaBean"), "Java"), StringBuilder("JavaBean").startsWith("Java"))
        assertThreeEquals(false, Stringx.startsWith(StringBuilder("JavaBean"), "java"), StringBuilder("JavaBean").startsWith("java"))
        assertThreeEquals(true, Stringx.startsWith(StringBuilder("JavaBean"), "java", true), StringBuilder("JavaBean").startsWith("java", true))
        assertThreeEquals(false, Stringx.startsWith(null as StringBuilder?, "java"), "".startsWith("java"))
        assertThreeEquals(true, Stringx.startsWith("JavaBean" as CharSequence, StringBuilder("Java")), ("JavaBean" as CharSequence).startsWith(StringBuilder("Java")))

        assertThreeEquals(true, Stringx.startsWith(StringBuilder("HeaderJavaBean"), "Java", 6), StringBuilder("HeaderJavaBean").startsWith("Java", 6))
        assertThreeEquals(false, Stringx.startsWith(StringBuilder("HeaderJavaBean"), "java", 6), StringBuilder("HeaderJavaBean").startsWith("java", 6))
        assertThreeEquals(true, Stringx.startsWith(StringBuilder("HeaderJavaBean"), "java", 6, true), StringBuilder("HeaderJavaBean").startsWith("java", 6, true))
        assertThreeEquals(true, Stringx.startsWith("HeaderJavaBean" as CharSequence, "Java" as CharSequence, 6), ("HeaderJavaBean" as CharSequence).startsWith("Java" as CharSequence, 6))
        assertThreeEquals(true, Stringx.startsWith("HeaderJavaBean" as CharSequence, StringBuilder("Java"), 6), ("HeaderJavaBean" as CharSequence).startsWith(StringBuilder("Java"), 6))

        assertThreeEquals(false, Stringx.startsWith("JavaBean", "Jave"), "JavaBean".startsWith("Jave"))
        assertThreeEquals(true, Stringx.startsWith("JavaBean", "Java"), "JavaBean".startsWith("Java"))
        assertThreeEquals(false, Stringx.startsWith("JavaBean", "Jave"), "JavaBean".startsWith("Jave"))
        assertThreeEquals(false, Stringx.startsWith("JavaBean", "java"), "JavaBean".startsWith("java"))
        assertThreeEquals(true, Stringx.startsWith("JavaBean", "java", true), "JavaBean".startsWith("java", true))
        assertThreeEquals(false, Stringx.startsWith(null, "java"), "".startsWith("java"))

        assertThreeEquals(true, Stringx.startsWith("HeaderJavaBean", "Java", 6), "HeaderJavaBean".startsWith("Java", 6))
        assertThreeEquals(false, Stringx.startsWith("HeaderJavaBean", "Jave", 6), "HeaderJavaBean".startsWith("Jave", 6))
        assertThreeEquals(false, Stringx.startsWith("HeaderJavaBean", "java", 6), "HeaderJavaBean".startsWith("java", 6))
        assertThreeEquals(true, Stringx.startsWith("HeaderJavaBean", "java", 6, true), "HeaderJavaBean".startsWith("java", 6, true))
        assertThreeEquals(false, Stringx.startsWith(null, "java", 6), "".startsWith("java", 6))
    }

    @Test
    fun testEndsWith() {
        assertThreeEquals(true, Stringx.endsWith(StringBuilder("JavaBean"), 'n'), StringBuilder("JavaBean").endsWith('n'))
        assertThreeEquals(false, Stringx.endsWith(StringBuilder("JavaBean"), 'N'), StringBuilder("JavaBean").endsWith('N'))
        assertThreeEquals(true, Stringx.endsWith(StringBuilder("JavaBean"), 'N', true), StringBuilder("JavaBean").endsWith('N', true))
        assertThreeEquals(false, Stringx.endsWith(StringBuilder(""), 'n'), StringBuilder("").endsWith('n'))
        assertThreeEquals(false, Stringx.endsWith(null, 'n'), StringBuilder("").endsWith('n'))

        assertThreeEquals(true, Stringx.endsWith(StringBuilder("JavaBean"), "Bean"), StringBuilder("JavaBean").endsWith("Bean"))
        assertThreeEquals(false, Stringx.endsWith(StringBuilder("JavaBean"), "bean"), StringBuilder("JavaBean").endsWith("bean"))
        assertThreeEquals(true, Stringx.endsWith(StringBuilder("JavaBean"), "bean", true), StringBuilder("JavaBean").endsWith("bean", true))
        assertThreeEquals(true, Stringx.endsWith("JavaBean" as CharSequence, "Bean" as CharSequence), ("JavaBean" as CharSequence).endsWith("Bean" as CharSequence))
        assertThreeEquals(true, Stringx.endsWith("JavaBean" as CharSequence, StringBuilder("Bean")), ("JavaBean" as CharSequence).endsWith(StringBuilder("Bean")))
        assertThreeEquals(false, Stringx.endsWith(null as CharSequence?, "bean"), "".endsWith("bean"))

        assertThreeEquals(true, Stringx.endsWith("JavaBean", "Bean"), "JavaBean".endsWith("Bean"))
        assertThreeEquals(false, Stringx.endsWith("JavaBean", "BEAN"), "JavaBean".endsWith("BEAN"))
        assertThreeEquals(true, Stringx.endsWith("JavaBean", "BEAN", true), "JavaBean".endsWith("BEAN", true))
        assertThreeEquals(false, Stringx.endsWith("JavaBean", "Bea"), "JavaBean".endsWith("Bea"))
        assertThreeEquals(false, Stringx.endsWith("", "Bea"), "".endsWith("Bea"))
        assertThreeEquals(false, Stringx.endsWith(null, "Bea"), "".endsWith("Bea"))
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
        assertEquals("0123456789", Stringx.removeRange("0123456789", Rangex.rangeTo(3, 2)))
        assertEquals("", Stringx.removeRange(null, Rangex.rangeTo(3, 5)))
        try {
            Stringx.removeRange("0123456789", Rangex.rangeTo(3, 1))
            fail()
        } catch (e: Exception) {
        }

        assertThreeEquals("3456789", Stringx.removePrefix(StringBuilder("0123456789"), "012"), StringBuilder("0123456789").removePrefix("012"))
        assertThreeEquals("0123456789", Stringx.removePrefix(StringBuilder("0123456789"), "210"), StringBuilder("0123456789").removePrefix("210"))

        assertThreeEquals("3456789", Stringx.removePrefix("0123456789", "012"), "0123456789".removePrefix("012"))
        assertThreeEquals("0123456789", Stringx.removePrefix("0123456789", "210"), "0123456789".removePrefix("210"))

        assertThreeEquals("0123456", Stringx.removeSuffix(StringBuilder("0123456789"), "789"), StringBuilder("0123456789").removeSuffix("789"))
        assertThreeEquals("0123456789", Stringx.removeSuffix(StringBuilder("0123456789"), "987"), StringBuilder("0123456789").removeSuffix("987"))

        assertThreeEquals("0123456", Stringx.removeSuffix("0123456789", "789"), "0123456789".removeSuffix("789"))
        assertThreeEquals("0123456789", Stringx.removeSuffix("0123456789", "987"), "0123456789".removeSuffix("987"))

        assertThreeEquals("3456", Stringx.removeSurrounding(StringBuilder("0123456789"), "012", "789"), StringBuilder("0123456789").removeSurrounding("012", "789"))
        assertThreeEquals("145", Stringx.removeSurrounding(StringBuilder("145"), "012", "789"), StringBuilder("145").removeSurrounding("012", "789"))
        assertThreeEquals("013456789", Stringx.removeSurrounding(StringBuilder("013456789"), "012", "789"), StringBuilder("013456789").removeSurrounding("012", "789"))
        assertThreeEquals("012345678", Stringx.removeSurrounding(StringBuilder("012345678"), "012", "789"), StringBuilder("012345678").removeSurrounding("012", "789"))
        assertThreeEquals("0123456789", Stringx.removeSurrounding(StringBuilder("0123456789"), "210", "987"), StringBuilder("0123456789").removeSurrounding("210", "987"))

        assertThreeEquals("3456", Stringx.removeSurrounding("0123456789", "012", "789"), "0123456789".removeSurrounding("012", "789"))
        assertThreeEquals("145", Stringx.removeSurrounding("145", "012", "789"), "145".removeSurrounding("012", "789"))
        assertThreeEquals("013456789", Stringx.removeSurrounding("013456789", "012", "789"), "013456789".removeSurrounding("012", "789"))
        assertThreeEquals("012345678", Stringx.removeSurrounding("012345678", "012", "789"), "012345678".removeSurrounding("012", "789"))
        assertThreeEquals("0123456789", Stringx.removeSurrounding("0123456789", "210", "987"), "0123456789".removeSurrounding("210", "987"))

        assertThreeEquals("456", Stringx.removeSurrounding(StringBuilder(".456."), "."), StringBuilder(".456.").removeSurrounding("."))
        assertThreeEquals("123.456.789", Stringx.removeSurrounding(StringBuilder("123.456.789"), "."), StringBuilder("123.456.789").removeSurrounding("."))

        assertThreeEquals("456", Stringx.removeSurrounding(".456.", "."), ".456.".removeSurrounding("."))
        assertThreeEquals("123.456.789", Stringx.removeSurrounding("123.456.789", "."), "123.456.789".removeSurrounding("."))
    }

    @Test
    fun testCapitalize() {
        assertThreeEquals("Android", Stringx.capitalize("android"), "android".capitalize())
        assertThreeEquals("Android", Stringx.capitalize("Android"), "Android".capitalize())
        assertThreeEquals("", Stringx.capitalize(""), "".capitalize())
        assertThreeEquals("", Stringx.capitalize(null), "".capitalize())

        assertThreeEquals("android", Stringx.decapitalize("Android"), "Android".decapitalize())
        assertThreeEquals("android", Stringx.decapitalize("android"), "android".decapitalize())
        assertThreeEquals("", Stringx.decapitalize(""), "".decapitalize())
        assertThreeEquals("", Stringx.decapitalize(null), "".decapitalize())
    }

    @Test
    fun testPad() {
        assertThreeEquals("今天天气晴", Stringx.padStart("今天天气晴", 4), "今天天气晴".padStart(4))
        assertThreeEquals("今天天气晴", Stringx.padStart("今天天气晴", 5), "今天天气晴".padStart(5))
        assertThreeEquals("     今天天气晴", Stringx.padStart("今天天气晴", 10), "     今天天气晴".padStart(10))
        assertThreeEquals(".....今天天气晴", Stringx.padStart("今天天气晴", 10, '.'), ".....今天天气晴".padStart(10, '.'))
        assertThreeEquals("     今天天气晴", Stringx.padStart(StringBuilder("今天天气晴"), 10).toString(), StringBuilder("今天天气晴").padStart(10).toString())
        assertThreeEquals(".....今天天气晴", Stringx.padStart(StringBuilder("今天天气晴"), 10, '.').toString(), StringBuilder(".....今天天气晴").padStart(10, '.').toString())
        try {
            Stringx.padStart("今天天气晴", -1)
            fail()
        } catch (e: Exception) {
        }

        assertThreeEquals("今天天气晴", Stringx.padEnd("今天天气晴", 4), "今天天气晴".padEnd(4))
        assertThreeEquals("今天天气晴", Stringx.padEnd("今天天气晴", 5), "今天天气晴".padEnd(5))
        assertThreeEquals("今天天气晴     ", Stringx.padEnd("今天天气晴", 10), "今天天气晴     ".padEnd(10))
        assertThreeEquals("今天天气晴.....", Stringx.padEnd("今天天气晴", 10, '.'), "今天天气晴.....".padEnd(10, '.'))
        assertThreeEquals("今天天气晴     ", Stringx.padEnd(StringBuilder("今天天气晴"), 10).toString(), StringBuilder("今天天气晴").padEnd(10).toString())
        assertThreeEquals("今天天气晴.....", Stringx.padEnd(StringBuilder("今天天气晴"), 10, '.').toString(), StringBuilder("今天天气晴").padEnd(10, '.').toString())
        assertThreeEquals("    ", Stringx.padEnd(null, 4), "".padEnd(4))
        try {
            Stringx.padEnd("今天天气晴", -1)
            fail()
        } catch (e: Exception) {
        }
    }

    @Test
    fun testMatches() {
        assertThreeEquals(true, Stringx.matches("hello@gmai.com", Regexx.EMAIL), "hello@gmai.com".matches(Regex(Regexx.EMAIL.pattern())))
        assertThreeEquals(false, Stringx.matches("hello@gmai", Regexx.EMAIL), "hello@gmai".matches(Regex(Regexx.EMAIL.pattern())))
        assertThreeEquals(false, Stringx.matches("", Regexx.EMAIL), "".matches(Regex(Regexx.EMAIL.pattern())))
        assertThreeEquals(false, Stringx.matches(null, Regexx.EMAIL), "".matches(Regex(Regexx.EMAIL.pattern())))

        assertThreeEquals(true, Stringx.regionMatches("onlyOne", 0, "onlyYou", 0, 4), "onlyOne".regionMatches(0, "onlyYou", 0, 4))
        assertThreeEquals(false, Stringx.regionMatches("onlyOne", 0, "OnlyYou", 0, 4), "onlyOne".regionMatches(0, "OnlyYou", 0, 4))
        assertThreeEquals(false, Stringx.regionMatches(null, 0, "onlyYou", 0, 4), "".regionMatches(0, "onlyYou", 0, 4))
        assertThreeEquals(false, Stringx.regionMatches("onlyOne", 0, null, 0, 4), "onlyOne".regionMatches(0, "", 0, 4))

        assertThreeEquals(true, Stringx.regionMatchesImpl("onlyOne", 0, "onlyYou", 0, 4), "onlyOne".regionMatches(0, "onlyYou", 0, 4))
        assertThreeEquals(false, Stringx.regionMatchesImpl("onlyOne", 0, "OnlyYou", 0, 4), "onlyOne".regionMatches(0, "OnlyYou", 0, 4))
        assertThreeEquals(false, Stringx.regionMatchesImpl(null, 0, "onlyYou", 0, 4), "".regionMatches(0, "onlyYou", 0, 4))
        assertThreeEquals(false, Stringx.regionMatchesImpl("onlyOne", 0, null, 0, 4), "onlyOne".regionMatches(0, "", 0, 4))
        assertThreeEquals(false, Stringx.regionMatchesImpl("onlyOne", -1, "onlyYou", 0, 4), "onlyOne".regionMatches(-1, "onlyYou", 0, 4))
        assertThreeEquals(false, Stringx.regionMatchesImpl("onlyOne", 0, "onlyYou", -1, 4), "onlyOne".regionMatches(0, "onlyYou", -1, 4))
    }

    @Test
    fun testFind() {
        assertThreeEquals('3'.toString(), Stringx.find(StringBuilder("0123456789")) { it == '3' }.toString(), StringBuilder("0123456789").find { it == '3' }.toString())
        assertThreeEquals("null", Stringx.find(StringBuilder("0123456789")) { it == 'a' }.toString(), StringBuilder("0123456789").find { it == 'a' }.toString())

        assertThreeEquals('3'.toString(), Stringx.findLast(StringBuilder("0123456789")) { it == '3' }.toString(), StringBuilder("0123456789").findLast { it == '3' }.toString())
        assertThreeEquals("null", Stringx.findLast(StringBuilder("0123456789")) { it == 'a' }.toString(), StringBuilder("0123456789").findLast { it == 'a' }.toString())

        assertThreeEquals(Pair(3, "3").toString(), Stringx.findAnyOf("0123456789", listOf("3", "8"), 0, false).toString(), "0123456789".findAnyOf(listOf("3", "8"), 0, false).toString())
        assertThreeEquals(Pair(8, "8").toString(), Stringx.findAnyOf("0123456789", listOf("a", "8"), 0, false).toString(), "0123456789".findAnyOf(listOf("a", "8"), 0, false).toString())
        assertThreeEquals(Pair(8, "8").toString(), Stringx.findAnyOf("0123456789", listOf("a", "8"), 0).toString(), "0123456789".findAnyOf(listOf("a", "8"), 0).toString())
        assertThreeEquals("null", Stringx.findAnyOf("abcdefg", listOf("F", "8")).toString(), "abcdefg".findAnyOf(listOf("F", "8")).toString())
        assertThreeEquals(Pair(5, "F").toString(), Stringx.findAnyOf("abcdefg", listOf("F", "8"), true).toString(), "abcdefg".findAnyOf(listOf("F", "8"), ignoreCase = true).toString())
        assertNull(Stringx.findAnyOf(null, listOf("3", "8"), 0, false))
        assertThreeEquals(Pair(3, "3").toString(), Stringx.findAnyOf(StringBuilder("0123456789"), listOf("3", "8"), 0, false).toString(), StringBuilder("0123456789").findAnyOf(listOf("3", "8"), 0, false).toString())
        assertThreeEquals(Pair(3, "3").toString(), Stringx.findAnyOf(StringBuilder("0123456789"), listOf("3"), 0, false).toString(), StringBuilder("0123456789").findAnyOf(listOf("3"), 0, false).toString())
        assertThreeEquals(null, Stringx.findAnyOf(StringBuilder("0123456789"), listOf("a"), 0, false), StringBuilder("0123456789").findAnyOf(listOf("a"), 0, false))

        assertThreeEquals(Pair(6, "d").toString(), Stringx.findLastAnyOf("android", listOf("d", "a"), Stringx.count("android") - 1, false).toString(), "android".findLastAnyOf(listOf("d", "a"), "android".lastIndex, false).toString())
        assertThreeEquals(Pair(6, "d").toString(), Stringx.findLastAnyOf("android", listOf("a", "d"), Stringx.count("android") - 1, false).toString(), "android".findLastAnyOf(listOf("a", "d"), "android".lastIndex, false).toString())
        assertThreeEquals(Pair(6, "d").toString(), Stringx.findLastAnyOf("android", listOf("d", "a"), Stringx.count("android") - 1).toString(), "android".findLastAnyOf(listOf("d", "a"), "android".lastIndex).toString())
        assertThreeEquals(null.toString(), Stringx.findLastAnyOf("android", listOf("D", "A")).toString(), "android".findLastAnyOf(listOf("D", "A")).toString())
        assertThreeEquals(Pair(6, "D").toString(), Stringx.findLastAnyOf("android", listOf("D", "A"), true).toString(), "android".findLastAnyOf(listOf("D", "A"), ignoreCase = true).toString())
        assertThreeEquals(Pair(6, "d").toString(), Stringx.findLastAnyOf("android", listOf("d")).toString(), "android".findLastAnyOf(listOf("d")).toString())
        assertThreeEquals(null, Stringx.findLastAnyOf("android", listOf("6")), "android".findLastAnyOf(listOf("6")))
        assertThreeEquals(null, Stringx.findLastAnyOf(StringBuilder(""), listOf("4", "6")), StringBuilder("").findLastAnyOf(listOf("4", "6")))
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
        assertThreeEquals('a', Stringx.getOrElse("0123456789", -1) { 'a' }, "0123456789".getOrElse(-1) { 'a' })
        assertThreeEquals('a', Stringx.getOrElse("", 2) { 'a' }, "".getOrElse(2) { 'a' })
        assertThreeEquals('a', Stringx.getOrElse(null, 2) { 'a' }, "".getOrElse(2) { 'a' })

        assertThreeEquals('2', Stringx.getOrNull("0123456789", 2), "0123456789".getOrNull(2))
        assertThreeEquals(null, Stringx.getOrNull("0123456789", 10), "0123456789".getOrNull(10))
        assertThreeEquals(null, Stringx.getOrNull("0123456789", -1), "0123456789".getOrNull(-1))
        assertThreeEquals(null, Stringx.getOrNull("", 2), "".getOrNull(2))
        assertThreeEquals(null, Stringx.getOrNull(null, 2), "".getOrNull(2))
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
        assertThreeEquals(-1, Stringx.indexOf(StringBuilder(sourceText), 'A'), StringBuilder(sourceText).indexOf('A'))

        assertThreeEquals(11, Stringx.indexOf(sourceText2, "bc", 0, false), sourceText2.indexOf("bc", 0, false))
        assertThreeEquals(28, Stringx.indexOf(sourceText2, "bc", 14, false), sourceText2.indexOf("bc", 14, false))
        assertThreeEquals(-1, Stringx.indexOf(sourceText2, "BC", 0, false), sourceText2.indexOf("BC", 0, false))
        assertThreeEquals(11, Stringx.indexOf(sourceText2, "BC", 0, true), sourceText2.indexOf("BC", 0, true))
        assertThreeEquals(11, Stringx.indexOf(StringBuilder(sourceText2), "BC", 0, true), StringBuilder(sourceText2).indexOf("BC", 0, true))
        assertThreeEquals(-1, Stringx.indexOf(sourceText2, "BC", false), sourceText2.indexOf("BC", ignoreCase = false))
        assertThreeEquals(11, Stringx.indexOf(sourceText2, "BC", true), sourceText2.indexOf("BC", ignoreCase = true))
        assertThreeEquals(11, Stringx.indexOf(sourceText2, "bc", 0), sourceText2.indexOf("bc", 0))
        assertThreeEquals(28, Stringx.indexOf(sourceText2, "bc", 14), sourceText2.indexOf("bc", 14))
        assertThreeEquals(11, Stringx.indexOf(sourceText2, "bc"), sourceText2.indexOf("bc"))
        assertThreeEquals(-1, Stringx.indexOf(sourceText2, "BC"), sourceText2.indexOf("BC"))
        assertThreeEquals(-1, Stringx.indexOf(StringBuilder(sourceText2), "BC"), StringBuilder(sourceText2).indexOf("BC"))

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
        assertThreeEquals(-1, Stringx.indexOfAny(sourceText, charArrayOf('t')), sourceText.indexOfAny(charArrayOf('t')))
        assertThreeEquals(-1, Stringx.indexOfAny(null, charArrayOf('t')), "".indexOfAny(charArrayOf('t')))

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
        assertThreeEquals(-1, Stringx.indexOfFirst("") { it == 'a' }, "".indexOfFirst { it == 'a' })
        assertThreeEquals(-1, Stringx.indexOfFirst(null) { it == 'a' }, "".indexOfFirst { it == 'a' })
        assertThreeEquals(22, Stringx.indexOfLast(sourceText) { it == 'a' }, sourceText.indexOfLast { it == 'a' })
        assertThreeEquals(-1, Stringx.indexOfLast("") { it == 'a' }, "".indexOfLast { it == 'a' })
        assertThreeEquals(-1, Stringx.indexOfLast(null) { it == 'a' }, "".indexOfLast { it == 'a' })

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
        assertThreeEquals(22, Stringx.lastIndexOf(StringBuilder(sourceText), 'a'), StringBuilder(sourceText).lastIndexOf('a'))

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
        assertThreeEquals(28, Stringx.lastIndexOf(StringBuilder(sourceText2), "bc"), StringBuilder(sourceText2).lastIndexOf("bc"))

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
        assertThreeEquals(-1, Stringx.lastIndexOfAny(null, charArrayOf('t', 'A')), "".lastIndexOfAny(charArrayOf('t', 'A')))
        assertThreeEquals(22, Stringx.lastIndexOfAny(sourceText, charArrayOf('a')), sourceText.lastIndexOfAny(charArrayOf('a')))
        assertThreeEquals(22, Stringx.lastIndexOfAny(StringBuilder(sourceText), charArrayOf('a')), StringBuilder(sourceText).lastIndexOfAny(charArrayOf('a')))

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
        assertThreeEquals("", Stringx.reversed(null), "".reversed())

        assertThreeEquals(StringBuilder(resultText).toString(), Stringx.reversed(StringBuilder(sourceText)).toString(), StringBuilder(sourceText).reversed().toString())
        assertThreeEquals(StringBuilder("").toString(), Stringx.reversed(null as StringBuilder?).toString(), StringBuilder("").reversed().toString())
    }

    @Test
    fun testFilter() {
        val sourceText = "abcdefgfedcba"
        val resultText = "abcdegedcba"

        assertThreeEquals(StringBuilder(resultText).toString(), Stringx.filterTo(StringBuilder(sourceText), StringBuilder()) { it != 'f' }.toString(),
                StringBuilder(sourceText).filterTo(StringBuilder()) { it != 'f' }.toString())
        assertThreeEquals(StringBuilder("").toString(), Stringx.filterTo(null, StringBuilder()) { it != 'f' }.toString(),
                StringBuilder("").filterTo(StringBuilder()) { it != 'f' }.toString())
        assertThreeEquals(StringBuilder(resultText).toString(), Stringx.filter(StringBuilder(sourceText)) { it != 'f' }.toString(),
                StringBuilder(sourceText).filter { it != 'f' }.toString())
        assertThreeEquals(resultText, Stringx.filter(sourceText) { it != 'f' }, sourceText.filter { it != 'f' })

        val indexed5 = StringBuilder()
        val indexed6 = StringBuilder()
        assertThreeEquals(StringBuilder(resultText).toString(), Stringx.filterIndexedTo(StringBuilder(sourceText), StringBuilder()) { index, it -> indexed5.append(index).append(","); it != 'f' }.toString(),
                StringBuilder(sourceText).filterIndexedTo(StringBuilder()) { index, it -> indexed6.append(index).append(","); it != 'f' }.toString()); assertEquals(indexed5.toString(), indexed6.toString())
        assertThreeEquals(StringBuilder().toString(), Stringx.filterIndexedTo(null, StringBuilder()) { index, it -> indexed5.append(index).append(","); it != 'f' }.toString(),
                StringBuilder("").filterIndexedTo(StringBuilder()) { index, it -> indexed6.append(index).append(","); it != 'f' }.toString()); assertEquals(indexed5.toString(), indexed6.toString())

        val indexed3 = StringBuilder()
        val indexed4 = StringBuilder()
        assertThreeEquals(StringBuilder(resultText).toString(), Stringx.filterIndexed(StringBuilder(sourceText)) { index, it -> indexed3.append(index).append(","); it != 'f' }.toString(),
                StringBuilder(sourceText).filterIndexed { index, it -> indexed4.append(index).append(","); it != 'f' }.toString()); assertEquals(indexed3.toString(), indexed4.toString())

        val indexed1 = StringBuilder()
        val indexed2 = StringBuilder()
        assertThreeEquals(resultText, Stringx.filterIndexed(sourceText) { index, it -> indexed1.append(index).append(","); it != 'f' },
                sourceText.filterIndexed { index, it -> indexed2.append(index).append(","); it != 'f' }); assertEquals(indexed1.toString(), indexed2.toString())

        assertThreeEquals(StringBuilder(resultText).toString(), Stringx.filterNotTo(StringBuilder(sourceText), StringBuilder()) { it == 'f' }.toString(),
                StringBuilder(sourceText).filterNotTo(StringBuilder()) { it == 'f' }.toString())
        assertThreeEquals(StringBuilder().toString(), Stringx.filterNotTo(null, StringBuilder()) { it == 'f' }.toString(),
                StringBuilder("").filterNotTo(StringBuilder()) { it == 'f' }.toString())
        assertThreeEquals(StringBuilder(resultText).toString(), Stringx.filterNot(StringBuilder(sourceText)) { it == 'f' }.toString(),
                StringBuilder(sourceText).filterNot { it == 'f' }.toString())
        assertThreeEquals(resultText, Stringx.filterNot(sourceText) { it == 'f' }, sourceText.filterNot { it == 'f' })
    }

    @Test
    fun testTrim() {
        val sourceText = " \tabcdefgfedcba \n"
        val resultText = "abcdefgfedcba"
        val sourceText2 = "abcdefgfedcba"
        val resultText2 = "bcdefgfedcb"
        assertThreeEquals(resultText2, Stringx.trim(StringBuilder(sourceText2)) { it == 'a' }, StringBuilder(sourceText2).trim { it == 'a' })
        assertThreeEquals("", Stringx.trim(StringBuilder("")) { it == 'a' }, StringBuilder("").trim { it == 'a' })
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
        assertThreeEquals("", Stringx.trimStart(StringBuilder("")) { it == 'a' }, StringBuilder("").trimStart { it == 'a' })
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
        assertThreeEquals("", Stringx.trimEnd(StringBuilder("")) { it == 'a' }, StringBuilder("").trimEnd { it == 'a' })
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
        try {
            Stringx.replaceRange(sourceTextRange, 2, 1, "aaaa")
            fail()
        } catch (e: Exception) {
        }

        val sourceTextBefore = "test.txt"
        val sourceTextBeforeError = "testtxt"
        val resultTextBefore = "simple.txt"
        assertThreeEquals(resultTextBefore, Stringx.replaceBefore(sourceTextBefore, '.', "simple", sourceTextBefore), sourceTextBefore.replaceBefore('.', "simple", sourceTextBefore))
        assertThreeEquals(resultTextBefore, Stringx.replaceBefore(sourceTextBefore, '.', "simple", null), sourceTextBefore.replaceBefore('.', "simple"))
        assertThreeEquals(resultTextBefore, Stringx.replaceBefore(sourceTextBeforeError, '.', "simple", resultTextBefore), sourceTextBeforeError.replaceBefore('.', "simple", resultTextBefore))
        assertThreeEquals(resultTextBefore, Stringx.replaceBefore(sourceTextBefore, ".", "simple", sourceTextBefore), sourceTextBefore.replaceBefore(".", "simple", sourceTextBefore))
        assertThreeEquals(resultTextBefore, Stringx.replaceBefore(sourceTextBefore, ".", "simple", null), sourceTextBefore.replaceBefore(".", "simple"))
        assertThreeEquals(resultTextBefore, Stringx.replaceBefore(sourceTextBeforeError, ".", "simple", resultTextBefore), sourceTextBeforeError.replaceBefore(".", "simple", resultTextBefore))
        assertThreeEquals(sourceTextBefore, Stringx.replaceBefore(null, '.', "simple", sourceTextBefore), "".replaceBefore('.', "simple", sourceTextBefore))
        assertThreeEquals(sourceTextBefore, Stringx.replaceBefore(null, ".", "simple", sourceTextBefore), "".replaceBefore(".", "simple", sourceTextBefore))

        val sourceTextBeforeLast = "test.txt.zip"
        val sourceTextBeforeLastError = "testtxtzip"
        val resultTextBeforeLast = "simple.txt.zip"
        assertThreeEquals(resultTextBeforeLast, Stringx.replaceBeforeLast(sourceTextBeforeLast, '.', "simple.txt", sourceTextBeforeLast), sourceTextBeforeLast.replaceBeforeLast('.', "simple.txt", sourceTextBeforeLast))
        assertThreeEquals(resultTextBeforeLast, Stringx.replaceBeforeLast(sourceTextBeforeLast, '.', "simple.txt", null), sourceTextBeforeLast.replaceBeforeLast('.', "simple.txt"))
        assertThreeEquals(resultTextBeforeLast, Stringx.replaceBeforeLast(sourceTextBeforeLastError, '.', "simple.txt", resultTextBeforeLast), sourceTextBeforeLastError.replaceBeforeLast('.', "simple.txt", resultTextBeforeLast))
        assertThreeEquals(resultTextBeforeLast, Stringx.replaceBeforeLast(sourceTextBeforeLast, ".", "simple.txt", sourceTextBeforeLast), sourceTextBeforeLast.replaceBeforeLast(".", "simple.txt", sourceTextBeforeLast))
        assertThreeEquals(resultTextBeforeLast, Stringx.replaceBeforeLast(sourceTextBeforeLast, ".", "simple.txt", null), sourceTextBeforeLast.replaceBeforeLast(".", "simple.txt"))
        assertThreeEquals(resultTextBeforeLast, Stringx.replaceBeforeLast(sourceTextBeforeLastError, ".", "simple.txt", resultTextBeforeLast), sourceTextBeforeLastError.replaceBeforeLast(".", "simple.txt", resultTextBeforeLast))
        assertThreeEquals(sourceTextBefore, Stringx.replaceBeforeLast(null, '.', "simple.txt", sourceTextBefore), "".replaceBeforeLast('.', "simple.txt", sourceTextBefore))
        assertThreeEquals(sourceTextBefore, Stringx.replaceBeforeLast(null, ".", "simple.txt", sourceTextBefore), "".replaceBeforeLast(".", "simple.txt", sourceTextBefore))

        val sourceTextAfter = "test.txt"
        val sourceTextAfterError = "testtxt"
        val resultTextAfter = "test.zip"
        assertThreeEquals(resultTextAfter, Stringx.replaceAfter(sourceTextAfter, '.', "zip", sourceTextAfter), sourceTextAfter.replaceAfter('.', "zip", sourceTextAfter))
        assertThreeEquals(resultTextAfter, Stringx.replaceAfter(sourceTextAfter, '.', "zip", null), sourceTextAfter.replaceAfter('.', "zip"))
        assertThreeEquals(resultTextAfter, Stringx.replaceAfter(sourceTextAfterError, '.', "zip", resultTextAfter), sourceTextAfterError.replaceAfter('.', "zip", resultTextAfter))
        assertThreeEquals(resultTextAfter, Stringx.replaceAfter(sourceTextAfter, ".", "zip", sourceTextAfter), sourceTextAfter.replaceAfter(".", "zip", sourceTextAfter))
        assertThreeEquals(resultTextAfter, Stringx.replaceAfter(sourceTextAfter, ".", "zip", null), sourceTextAfter.replaceAfter(".", "zip"))
        assertThreeEquals(resultTextAfter, Stringx.replaceAfter(sourceTextAfterError, ".", "zip", resultTextAfter), sourceTextAfterError.replaceAfter(".", "zip", resultTextAfter))
        assertThreeEquals(sourceTextAfter, Stringx.replaceAfter(null, '.', "zip", sourceTextAfter), "".replaceAfter('.', "zip", sourceTextAfter))
        assertThreeEquals(sourceTextAfter, Stringx.replaceAfter(null, ".", "zip", sourceTextAfter), "".replaceAfter(".", "zip", sourceTextAfter))

        val sourceTextAfterLast = "test.txt.zip"
        val sourceTextAfterLastError = "testtxtzip"
        val resultTextAfterLast = "test.txt.rar"
        assertThreeEquals(resultTextAfterLast, Stringx.replaceAfterLast(sourceTextAfterLast, '.', "rar", sourceTextAfterLast), sourceTextAfterLast.replaceAfterLast('.', "rar", sourceTextAfterLast))
        assertThreeEquals(resultTextAfterLast, Stringx.replaceAfterLast(sourceTextAfterLast, '.', "rar", null), sourceTextAfterLast.replaceAfterLast('.', "rar"))
        assertThreeEquals(resultTextAfterLast, Stringx.replaceAfterLast(sourceTextAfterLastError, '.', "rar", resultTextAfterLast), sourceTextAfterLastError.replaceAfterLast('.', "rar", resultTextAfterLast))
        assertThreeEquals(resultTextAfterLast, Stringx.replaceAfterLast(sourceTextAfterLast, ".", "rar", sourceTextAfterLast), sourceTextAfterLast.replaceAfterLast(".", "rar", sourceTextAfterLast))
        assertThreeEquals(resultTextAfterLast, Stringx.replaceAfterLast(sourceTextAfterLast, ".", "rar", null), sourceTextAfterLast.replaceAfterLast(".", "rar"))
        assertThreeEquals(resultTextAfterLast, Stringx.replaceAfterLast(sourceTextAfterLastError, ".", "rar", resultTextAfterLast), sourceTextAfterLastError.replaceAfterLast(".", "rar", resultTextAfterLast))
        assertThreeEquals(sourceTextAfterLast, Stringx.replaceAfterLast(null, '.', "rar", sourceTextAfterLast), "".replaceAfterLast('.', "rar", sourceTextAfterLast))
        assertThreeEquals(sourceTextAfterLast, Stringx.replaceAfterLast(null, ".", "rar", sourceTextAfterLast), "".replaceAfterLast(".", "rar", sourceTextAfterLast))

        val sourceTextPattern = "fasfjs hello@gmail.com fasf hello@outlook.com"
        val resultTextPattern = "fasfjs http://google.com fasf http://google.com"
        assertThreeEquals(resultTextPattern, Stringx.replace(sourceTextPattern, Regexx.EMAIL, "http://google.com"), sourceTextPattern.replace(Regex(Regexx.EMAIL.pattern()), "http://google.com"))
        assertThreeEquals("", Stringx.replace(null, Regexx.EMAIL, "http://google.com"), "".replace(Regex(Regexx.EMAIL.pattern()), "http://google.com"))

        val sourceTextFirstPattern = "fasfjs hello@gmail.com fasf hello@outlook.com"
        val resultTextFirstPattern = "fasfjs http://google.com fasf hello@outlook.com"
        assertThreeEquals(resultTextFirstPattern, Stringx.replaceFirst(sourceTextFirstPattern, Regexx.EMAIL, "http://google.com"), sourceTextFirstPattern.replaceFirst(Regex(Regexx.EMAIL.pattern()), "http://google.com"))
        assertThreeEquals("", Stringx.replaceFirst(null, Regexx.EMAIL, "http://google.com"), "".replaceFirst(Regex(Regexx.EMAIL.pattern()), "http://google.com"))
    }

    @Test
    fun testCommonWith() {
        val self = "startYourPerformance"
        val other = "startyourTrip"
        assertThreeEquals("start", Stringx.commonPrefixWith(self, other), self.commonPrefixWith(other))
        assertThreeEquals("startYour", Stringx.commonPrefixWith(self, other, true), self.commonPrefixWith(other, true))
        assertThreeEquals("startyour", Stringx.commonPrefixWith(other, self, true), other.commonPrefixWith(self, true))
        assertThreeEquals("", Stringx.commonPrefixWith(self, "unknown", true), self.commonPrefixWith("unknown", true))
        assertEquals("", Stringx.commonPrefixWith(null, other, true))
        assertEquals("", Stringx.commonPrefixWith(self, null, true))

        val self2 = "GoFromHome"
        val other2 = "LeavefromHome"
        assertThreeEquals("romHome", Stringx.commonSuffixWith(self2, other2), self2.commonSuffixWith(other2))
        assertThreeEquals("FromHome", Stringx.commonSuffixWith(self2, other2, true), self2.commonSuffixWith(other2, true))
        assertThreeEquals("fromHome", Stringx.commonSuffixWith(other2, self2, true), other2.commonSuffixWith(self2, true))
        assertThreeEquals("", Stringx.commonSuffixWith(self2, "unknown", true), self2.commonSuffixWith("unknown", true))
        assertEquals("", Stringx.commonSuffixWith(null, other2, true))
        assertEquals("", Stringx.commonSuffixWith(self2, null, true))
    }

    @Test
    fun testContains() {
        val self = "abcdefg"

        assertThreeEquals(true, Stringx.contains(self, "cd"), self.contains("cd"))
        assertThreeEquals(false, Stringx.contains(self, "cD"), self.contains("cD"))
        assertThreeEquals(true, Stringx.contains(self, "cD", true), self.contains("cD", true))

        assertThreeEquals(true, Stringx.contains(StringBuilder(self), StringBuilder("cd")), StringBuilder(self).contains("cd"))
        assertThreeEquals(false, Stringx.contains(StringBuilder(self), StringBuilder("cD")), StringBuilder(self).contains("cD"))
        assertThreeEquals(true, Stringx.contains(StringBuilder(self), StringBuilder("cD"), true), StringBuilder(self).contains("cD", true))

        assertThreeEquals(true, Stringx.contains(self, 'd'), self.contains('d'))
        assertThreeEquals(false, Stringx.contains(self, 'D'), self.contains('D'))
        assertThreeEquals(true, Stringx.contains(self, 'D', true), self.contains('D', true))

        val self2 = "abc hello@gmail.com defg"

        assertThreeEquals(true, Stringx.contains(self2, Regexx.EMAIL), self2.contains(Regex(Regexx.EMAIL.pattern())))
        assertThreeEquals(false, Stringx.contains(self2, Regexx.IPV4), self2.contains(Regex(Regexx.IPV4.pattern())))
        assertFalse(Stringx.contains(null, Regexx.IPV4))
    }

    @Test
    fun testElementAt() {
        val self = "abcdefg"

        assertThreeEquals('e', Stringx.elementAt(self, 4), self.elementAt(4))
        try {
            Stringx.elementAt(self, 9)
            fail()
        } catch (e: Exception) {
        }

        assertThreeEquals('e', Stringx.elementAtOrElse(self, 4) { 'g' }, self.elementAtOrElse(4) { 'g' })
        assertThreeEquals('g', Stringx.elementAtOrElse(self, 9) { 'g' }, self.elementAtOrElse(9) { 'g' })
        assertThreeEquals('g', Stringx.elementAtOrElse("", 9) { 'g' }, "".elementAtOrElse(9) { 'g' })
        assertThreeEquals('g', Stringx.elementAtOrElse(null, 9) { 'g' }, "".elementAtOrElse(9) { 'g' })
        assertThreeEquals('g', Stringx.elementAtOrElse(self, -1) { 'g' }, self.elementAtOrElse(-1) { 'g' })

        assertThreeEquals('e', Stringx.elementAtOrNull(self, 4), self.elementAtOrNull(4))
        assertThreeEquals(null, Stringx.elementAtOrNull(self, 9), self.elementAtOrNull(9))
        assertThreeEquals(null, Stringx.elementAtOrNull("", 9), "".elementAtOrNull(9))
        assertThreeEquals(null, Stringx.elementAtOrNull(null, 9), "".elementAtOrNull(9))
        assertThreeEquals(null, Stringx.elementAtOrNull(self, -1), self.elementAtOrNull(-1))
    }

    @Test
    fun testSingle() {
        assertThreeEquals('a', Stringx.single("a"), "a".single())
        try {
            Stringx.single("ab")
            fail()
        } catch (e: Exception) {
        }
        try {
            Stringx.single(null)
            fail()
        } catch (e: Exception) {
        }
        try {
            Stringx.single("")
            fail()
        } catch (e: Exception) {
        }
        assertThreeEquals('a', Stringx.singleOrNull("a"), "a".singleOrNull())
        assertThreeEquals(null, Stringx.singleOrNull("ab"), "ab".singleOrNull())
        assertThreeEquals(null, Stringx.singleOrNull(""), "".singleOrNull())
        assertNull(Stringx.singleOrNull(null))


        assertThreeEquals('b', Stringx.single("ab") { it == 'b' }, "ab".single { it == 'b' })
        try {
            Stringx.single("abcb") { it == 'b' }
            fail()
        } catch (e: Exception) {
        }
        try {
            Stringx.single("ac") { it == 'b' }
            fail()
        } catch (e: Exception) {
        }
        try {
            Stringx.single("") { it == 'b' }
            fail()
        } catch (e: Exception) {
        }
        assertThreeEquals('a', Stringx.singleOrNull("abcb") { it == 'a' }, "abcb".singleOrNull { it == 'a' })
        assertThreeEquals(null, Stringx.singleOrNull("abcb") { it == 'b' }, "abcb".singleOrNull { it == 'b' })
        assertThreeEquals(null, Stringx.singleOrNull("ac") { it == 'b' }, "ac".singleOrNull { it == 'b' })
        assertThreeEquals(null, Stringx.singleOrNull("") { it == 'b' }, "".singleOrNull { it == 'b' })
    }

    @Test
    fun testDrop() {
        val self = "abcdefg"

        assertThreeEquals("defg", Stringx.drop(self, 3), self.drop(3))
        assertThreeEquals("", Stringx.drop(self, self.length + 1), self.drop(self.length + 1))
        assertThreeEquals(self, Stringx.drop(self, 0), self.drop(0))
        try {
            Stringx.drop(self, -1)
            fail()
        } catch (e: Exception) {
        }

        assertThreeEquals("defg", Stringx.drop(StringBuilder(self), 3).toString(), StringBuilder(self).drop(3).toString())
        assertThreeEquals("", Stringx.drop(StringBuilder(self), self.length + 1).toString(), StringBuilder(self).drop(self.length + 1).toString())
        assertThreeEquals(self, Stringx.drop(StringBuilder(self), 0).toString(), StringBuilder(self).drop(0).toString())
        try {
            Stringx.drop(StringBuilder(self), -1)
            fail()
        } catch (e: Exception) {
        }

        assertThreeEquals("abcd", Stringx.dropLast(self, 3), self.dropLast(3))
        assertThreeEquals("", Stringx.dropLast(self, self.length + 1), self.dropLast(self.length + 1))
        assertThreeEquals(self, Stringx.dropLast(self, 0), self.dropLast(0))
        try {
            Stringx.dropLast(self, -1)
            fail()
        } catch (e: Exception) {
        }

        assertThreeEquals("abcd", Stringx.dropLast(StringBuilder(self), 3).toString(), StringBuilder(self).dropLast(3).toString())
        assertThreeEquals("", Stringx.dropLast(StringBuilder(self), self.length + 1).toString(), StringBuilder(self).dropLast(self.length + 1).toString())
        assertThreeEquals(self, Stringx.dropLast(StringBuilder(self), 0).toString(), StringBuilder(self).dropLast(0).toString())
        try {
            Stringx.dropLast(StringBuilder(self), -1)
            fail()
        } catch (e: Exception) {
        }

        assertThreeEquals("abcdef", Stringx.dropLastWhile(StringBuilder(self)) { it != 'f' }.toString(), StringBuilder(self).dropLastWhile { it != 'f' }.toString())
        assertThreeEquals("", Stringx.dropLastWhile(StringBuilder("")) { it != 'f' }.toString(), StringBuilder("").dropLastWhile { it != 'f' }.toString())
        assertThreeEquals("", Stringx.dropLastWhile(null as StringBuilder?) { it != 'f' }.toString(), StringBuilder("").dropLastWhile { it != 'f' }.toString())

        assertThreeEquals("abcdef", Stringx.dropLastWhile(self) { it != 'f' }, self.dropLastWhile { it != 'f' })
        assertThreeEquals("", Stringx.dropLastWhile("") { it != 'f' }, "".dropLastWhile { it != 'f' })
        assertThreeEquals("", Stringx.dropLastWhile(null as String?) { it != 'f' }, "".dropLastWhile { it != 'f' })

        assertThreeEquals("bcdefg", Stringx.dropWhile(StringBuilder(self)) { it != 'b' }.toString(), StringBuilder(self).dropWhile { it != 'b' }.toString())
        assertThreeEquals("", Stringx.dropWhile(StringBuilder("")) { it != 'b' }.toString(), StringBuilder("").dropWhile { it != 'b' }.toString())
        assertThreeEquals("", Stringx.dropWhile(null as StringBuilder?) { it != 'b' }.toString(), StringBuilder("").dropWhile { it != 'b' }.toString())

        assertThreeEquals("bcdefg", Stringx.dropWhile(self) { it != 'b' }, self.dropWhile { it != 'b' })
        assertThreeEquals("", Stringx.dropWhile("") { it != 'b' }, "".dropWhile { it != 'b' })
        assertThreeEquals("", Stringx.dropWhile(null as String?) { it != 'b' }, "".dropWhile { it != 'b' })
    }

    @Test
    fun testSlice() {
        val source = "0123456789"

        assertThreeEquals("34567", Stringx.slice(source, Rangex.rangeTo(3, 7)), source.slice(3..7))
        @Suppress("EmptyRange")
        assertThreeEquals("", Stringx.slice(source, Rangex.rangeTo(3, 2)), source.slice(3..2))
        assertThreeEquals("34567", Stringx.slice(StringBuilder(source), Rangex.rangeTo(3, 7)).toString(), StringBuilder(source).slice(3..7).toString())
        @Suppress("EmptyRange")
        assertThreeEquals("", Stringx.slice(StringBuilder(source), Rangex.rangeTo(3, 2)).toString(), StringBuilder(source).slice(3..2).toString())

        assertThreeEquals("158", Stringx.slice(source, Collectionx.listOf(1, 5, 8)), source.slice(listOf(1, 5, 8)))
        assertThreeEquals("", Stringx.slice(source, Collectionx.listOf()), source.slice(listOf()))
        assertThreeEquals("158", Stringx.slice(StringBuilder(source), Collectionx.listOf(1, 5, 8)).toString(), StringBuilder(source).slice(listOf(1, 5, 8)).toString())
        assertThreeEquals("", Stringx.slice(StringBuilder(source), Collectionx.listOf()).toString(), StringBuilder(source).slice(listOf()).toString())
        assertThreeEquals("", Stringx.slice(null, Collectionx.listOf()), "".slice(Collectionx.listOf()))
    }

    @Test
    fun testTake() {
        val source = "0123456789"

        assertThreeEquals("0123456", Stringx.take(source, 7), source.take(7))
        assertThreeEquals(source, Stringx.take(source, 15), source.take(15))
        assertThreeEquals("", Stringx.take(source, 0), source.take(0))
        try {
            Stringx.take(source, -1)
            fail()
        } catch (e: Exception) {
        }
        assertThreeEquals(StringBuilder("0123456").toString(), Stringx.take(StringBuilder(source), 7).toString(), StringBuilder(source).take(7).toString())
        assertThreeEquals(StringBuilder(source).toString(), Stringx.take(StringBuilder(source), 15).toString(), StringBuilder(source).take(15).toString())
        assertThreeEquals(StringBuilder("").toString(), Stringx.take(StringBuilder(source), 0).toString(), StringBuilder(source).take(0).toString())
        try {
            Stringx.take(StringBuilder(source), -1)
            fail()
        } catch (e: Exception) {
        }

        assertThreeEquals("3456789", Stringx.takeLast(source, 7), source.takeLast(7))
        assertThreeEquals(source, Stringx.takeLast(source, 15), source.takeLast(15))
        assertThreeEquals("", Stringx.takeLast(source, 0), source.takeLast(0))
        try {
            Stringx.takeLast(source, -1)
            fail()
        } catch (e: Exception) {
        }
        assertThreeEquals(StringBuilder("3456789").toString(), Stringx.takeLast(StringBuilder(source), 7).toString(), StringBuilder(source).takeLast(7).toString())
        assertThreeEquals(StringBuilder(source).toString(), Stringx.takeLast(StringBuilder(source), 15).toString(), StringBuilder(source).takeLast(15).toString())
        assertThreeEquals(StringBuilder("").toString(), Stringx.takeLast(StringBuilder(source), 0).toString(), StringBuilder(source).takeLast(0).toString())
        try {
            Stringx.takeLast(StringBuilder(source), -1)
            fail()
        } catch (e: Exception) {
        }

        assertThreeEquals("012345", Stringx.takeWhile(source) { it != '6' }, source.takeWhile { it != '6' })
        assertThreeEquals("", Stringx.takeWhile(null) { it != '6' }, "".takeWhile { it != '6' })
        assertThreeEquals(source, Stringx.takeWhile(source) { it != 'a' }, source.takeWhile { it != 'a' })

        assertThreeEquals(StringBuilder("012345").toString(), Stringx.takeWhile(StringBuilder(source)) { it != '6' }.toString(), StringBuilder(source).takeWhile { it != '6' }.toString())
        assertThreeEquals("", Stringx.takeWhile(StringBuilder("")) { it != '6' }.toString(), StringBuilder("").takeWhile { it != '6' }.toString())
        assertThreeEquals(StringBuilder("").toString(), Stringx.takeWhile(null as StringBuilder?) { it != '6' }, StringBuilder("").takeWhile { it != '6' })

        assertThreeEquals("789", Stringx.takeLastWhile(source) { it != '6' }, source.takeLastWhile { it != '6' })
        assertThreeEquals("", Stringx.takeLastWhile(null) { it != '6' }, "".takeLastWhile { it != '6' })
        assertThreeEquals(source, Stringx.takeLastWhile(source) { it != 'a' }, source.takeLastWhile { it != 'a' })

        assertThreeEquals(StringBuilder("789").toString(), Stringx.takeLastWhile(StringBuilder(source)) { it != '6' }.toString(), StringBuilder(source).takeLastWhile { it != '6' }.toString())
        assertThreeEquals("", Stringx.takeLastWhile(StringBuilder("")) { it != '6' }.toString(), StringBuilder("").takeLastWhile { it != '6' }.toString())
        assertThreeEquals(StringBuilder("").toString(), Stringx.takeLastWhile(null as StringBuilder?) { it != '6' }, StringBuilder("").takeLastWhile { it != '6' })
    }

    @Test
    fun testAssociate() {
        val source = "0123456789"
        assertEquals(source.associate { Pair(it.toString(), it.toInt()) }.toList(), Stringx.associate(source) { me.panpf.javax.util.Pair<String, Int>(it.toString(), it.toInt()) }.toList())
        assertEquals(source.associateBy { it.toString() }.toList(), Stringx.associateBy(source) { it.toString() }.toList())
        assertEquals(source.associateBy({ it.toString() }) { it.toInt() }.toList(), Stringx.associateBy(source, { it.toString() }) { it.toInt() }.toList())
        assertEquals(source.associateTo(LinkedHashMap()) { Pair(it.toString(), it.toInt()) }.toList(), Stringx.associateTo(source, LinkedHashMap()) { me.panpf.javax.util.Pair<String, Int>(it.toString(), it.toInt()) }.toList())
        assertEquals(source.associateByTo(LinkedHashMap()) { it.toString() }.toList(), Stringx.associateByTo(source, LinkedHashMap()) { it.toString() }.toList())
        assertEquals(source.associateByTo(LinkedHashMap(), { it.toString() }) { it.toInt() }.toList(), Stringx.associateByTo(source, LinkedHashMap(), { it.toString() }) { it.toInt() }.toList())
    }

    @Test
    fun testTo() {
        val source = "0123456789"
        assertThreeEquals(source, Collectionx.joinToString(Stringx.toList(source), ""), source.toList().joinToString(""))
        assertThreeEquals(source, Collectionx.joinToString(Stringx.toSet(source), ""), source.toSet().joinToString(""))
        assertThreeEquals("", Collectionx.joinToString(Stringx.toSet(""), ""), "".toSet().joinToString(""))
        assertEquals("", Collectionx.joinToString(Stringx.toSet(null), ""))
        assertEquals("0", Collectionx.joinToString(Stringx.toSet("0"), ""))
        assertThreeEquals(source, Collectionx.joinToString(Stringx.toHashSet(source), ""), source.toHashSet().joinToString(""))
        assertThreeEquals(source, Collectionx.joinToString(Stringx.toSortedSet(source), ""), source.toSortedSet().joinToString(""))
        assertThreeEquals(source, Collectionx.joinToString(Stringx.toCollection(source, LinkedList<Char>()), ""), source.toCollection(LinkedList()).joinToString(""))
    }

    @Test
    fun testFlatMap() {
        val source = "0123456789"
        assertThreeEquals(listOf("1", "2", "2", "3", "3", "3", "4", "4", "4", "4", "5", "5", "5", "5", "5",
                "6", "6", "6", "6", "6", "6", "7", "7", "7", "7", "7", "7", "7",
                "8", "8", "8", "8", "8", "8", "8", "8", "9", "9", "9", "9", "9", "9", "9", "9", "9"), Stringx.flatMap(source) {
            LinkedList<String>().apply {
                for (int in 0 until it.toString().toInt()) {
                    add(it.toString())
                }
            }
        }, source.flatMap {
            LinkedList<String>().apply {
                for (int in 0 until it.toString().toInt()) {
                    add(it.toString())
                }
            }
        })

        assertThreeEquals(listOf("1", "2", "2", "3", "3", "3", "4", "4", "4", "4", "5", "5", "5", "5", "5",
                "6", "6", "6", "6", "6", "6", "7", "7", "7", "7", "7", "7", "7",
                "8", "8", "8", "8", "8", "8", "8", "8", "9", "9", "9", "9", "9", "9", "9", "9", "9"), Stringx.flatMapTo(source, ArrayList<String>()) {
            LinkedList<String>().apply {
                for (int in 0 until it.toString().toInt()) {
                    add(it.toString())
                }
            }
        }, source.flatMapTo(ArrayList()) {
            LinkedList<String>().apply {
                for (int in 0 until it.toString().toInt()) {
                    add(it.toString())
                }
            }
        })
    }

    @Test
    fun testGroup() {
        val source = "1365268945336807532324589"
        val map = MapBuilder<String, List<Char>>("0", listOf('0'))
                .put("1", listOf('1'))
                .put("2", listOf('2', '2', '2'))
                .put("3", listOf('3', '3', '3', '3', '3'))
                .put("4", listOf('4', '4'))
                .put("5", listOf('5', '5', '5', '5'))
                .put("6", listOf('6', '6', '6'))
                .put("7", listOf('7'))
                .put("8", listOf('8', '8', '8'))
                .put("9", listOf('9', '9')).build().toSortedMap()
        val map2 = MapBuilder<String, List<String>>("0", listOf("0"))
                .put("1", listOf("1"))
                .put("2", listOf("2", "2", "2"))
                .put("3", listOf("3", "3", "3", "3", "3"))
                .put("4", listOf("4", "4"))
                .put("5", listOf("5", "5", "5", "5"))
                .put("6", listOf("6", "6", "6"))
                .put("7", listOf("7"))
                .put("8", listOf("8", "8", "8"))
                .put("9", listOf("9", "9")).build().toSortedMap()

        assertThreeEquals(map, Stringx.groupBy(source) { it.toString() }.toSortedMap(), source.groupBy { it.toString() }.toSortedMap())
        assertThreeEquals(map2, Stringx.groupBy(source, { it.toString() }) { it.toString() }.toSortedMap(), source.groupBy({ it.toString() }) { it.toString() }.toSortedMap())

        assertThreeEquals(map, Stringx.groupByTo(source, LinkedHashMap<String, List<Char>>()) { it.toString() }.toSortedMap(),
                source.groupByTo(LinkedHashMap()) { it.toString() }.toSortedMap())
        assertThreeEquals(map2, Stringx.groupByTo(source, LinkedHashMap<String, List<String>>(), { it.toString() }) { it.toString() }.toSortedMap(),
                source.groupByTo(LinkedHashMap(), { it.toString() }) { it.toString() }.toSortedMap())

        val destination = LinkedHashMap<String, MutableList<String>>()
        val grouping = Stringx.groupingBy(source) { it.toString() }
        val defaultValue = DefaultValue<MutableList<String>> { ArrayList() }
        for (element in grouping.sourceIterator()) {
            val key = grouping.keyOf(element)
            val list = Mapx.getOrPut<String, MutableList<String>>(destination, key, defaultValue)
            list.add(element.toString())
        }
        assertThreeEquals(map2, destination, source.groupByTo(LinkedHashMap(), { it.toString() }) { it.toString() }.toSortedMap())
    }

    @Test
    fun testMap() {
        val source = "1365268945336"
        val result = listOf("1", "3", "6", "5", "2", "6", "8", "9", "4", "5", "3", "3", "6")

        assertThreeEquals(result, Stringx.map(source) { it.toString() }, source.map { it.toString() })
        assertThreeEquals(result, Stringx.mapTo(source, ArrayList(source.length)) { it.toString() },
                source.mapTo(ArrayList(source.length)) { it.toString() })

        val indexPair1 = Pair(StringBuilder(), StringBuilder())
        assertThreeEquals(result, Stringx.mapIndexed(source) { index, it -> indexPair1.first.append(index);it.toString() },
                source.mapIndexed { index, it -> indexPair1.second.append(index); it.toString() })
        assertThreeEquals("0123456789101112", indexPair1.first.toString(), indexPair1.second.toString())
        val indexPair2 = Pair(StringBuilder(), StringBuilder())
        assertThreeEquals(result, Stringx.mapIndexedTo(source, ArrayList(source.length)) { index, it -> indexPair2.first.append(index);it.toString() },
                source.mapIndexedTo(ArrayList(source.length)) { index, it -> indexPair2.second.append(index); it.toString() })
        assertThreeEquals("0123456789101112", indexPair2.first.toString(), indexPair2.second.toString())

        val resultNotNull = listOf("1", "6", "5", "2", "6", "8", "9", "4", "5", "6")
        assertThreeEquals(resultNotNull, Stringx.mapNotNull(source) { if (it != '3') it.toString() else null },
                source.mapNotNull { if (it != '3') it.toString() else null })
        assertThreeEquals(resultNotNull, Stringx.mapNotNullTo(source, ArrayList(source.length)) { if (it != '3') it.toString() else null },
                source.mapNotNullTo(ArrayList(source.length)) { if (it != '3') it.toString() else null })

        val indexPair3 = Pair(StringBuilder(), StringBuilder())
        assertThreeEquals(resultNotNull, Stringx.mapIndexedNotNull(source) { index, it -> indexPair3.first.append(index);if (it != '3') it.toString() else null },
                source.mapIndexedNotNull { index, it -> indexPair3.second.append(index);if (it != '3') it.toString() else null })
        assertThreeEquals("0123456789101112", indexPair3.first.toString(), indexPair3.second.toString())
        val indexPair4 = Pair(StringBuilder(), StringBuilder())
        assertThreeEquals(resultNotNull, Stringx.mapIndexedNotNullTo(source, ArrayList(source.length)) { index, it -> indexPair4.first.append(index);if (it != '3') it.toString() else null },
                source.mapIndexedNotNullTo(ArrayList(source.length)) { index, it -> indexPair4.second.append(index);if (it != '3') it.toString() else null })
        assertThreeEquals("0123456789101112", indexPair4.first.toString(), indexPair4.second.toString())
    }

    @Test
    fun testWithIndex() {
        val source = "1365268945336"
        assertThreeEquals(listOf(Pair(0, '1')
                , Pair(1, '3')
                , Pair(2, '6')
                , Pair(3, '5')
                , Pair(4, '2')
                , Pair(5, '6')
                , Pair(6, '8')
                , Pair(7, '9')
                , Pair(8, '4')
                , Pair(9, '5')
                , Pair(10, '3')
                , Pair(11, '3')
                , Pair(12, '6')
        ), Stringx.withIndex(source).map { Pair(it.index, it.value) }, source.withIndex().map { Pair(it.index, it.value) })
    }

    @Test
    fun testAll() {
        assertThreeEquals(true, Stringx.all("14134543") { it.isDigit() }, "14134543".all { it.isDigit() })
        assertThreeEquals(false, Stringx.all("fas42rqwr  \nrqw") { it.isDigit() }, "fas42rqwr  \nrqw".all { it.isDigit() })
    }

    @Test
    fun testAny() {
        assertThreeEquals(true, Stringx.any("14134543"), "14134543".any())
        assertThreeEquals(false, Stringx.any(""), "".any())
        assertThreeEquals(true, Stringx.any("as发生法萨芬") { Charx.isChinese(it) }, "as发生法萨芬".any { Charx.isChinese(it) })
        assertThreeEquals(false, Stringx.any("as789fksnfs") { Charx.isChinese(it) }, "as789fksnfs".any { Charx.isChinese(it) })
    }

    @Test
    fun testCount() {
        val source = "1365268945336"
        assertThreeEquals(13, Stringx.count(source), source.count())
        assertThreeEquals(0, Stringx.count(""), "".count())
        assertEquals(0, Stringx.count(null))

        assertThreeEquals(6, Stringx.count(source) { it.toString().toInt() % 2 == 0 }, source.count { it.toString().toInt() % 2 == 0 })
        assertEquals(0, Stringx.count(null) { it.toString().toInt() % 2 == 0 })
    }

    @Test
    fun testFold() {
        val source = "1365268945336"

        assertThreeEquals(61, Stringx.fold(source, 0) { accumulator, it -> accumulator + it.toString().toInt() },
                source.fold(0) { accumulator, it -> accumulator + it.toString().toInt() })
        assertThreeEquals(63, Stringx.fold(source, 2) { accumulator, it -> accumulator + it.toString().toInt() },
                source.fold(2) { accumulator, it -> accumulator + it.toString().toInt() })

        val indexPair1 = Pair(StringBuilder(), StringBuilder())
        assertThreeEquals(61, Stringx.foldIndexed(source, 0) { index, accumulator, it -> indexPair1.first.append(index);accumulator + it.toString().toInt() },
                source.foldIndexed(0) { index, accumulator, it -> indexPair1.second.append(index);accumulator + it.toString().toInt() })
        assertThreeEquals("0123456789101112", indexPair1.first.toString(), indexPair1.second.toString())

        assertThreeEquals(61, Stringx.foldRight(source, 0) { it, accumulator -> accumulator + it.toString().toInt() },
                source.foldRight(0) { it, accumulator -> accumulator + it.toString().toInt() })
        assertThreeEquals(63, Stringx.foldRight(source, 2) { it, accumulator -> accumulator + it.toString().toInt() },
                source.foldRight(2) { it, accumulator -> accumulator + it.toString().toInt() })
        assertEquals(3, Stringx.foldRight(null, 3) { it, accumulator -> accumulator + it.toString().toInt() })

        val indexPair2 = Pair(StringBuilder(), StringBuilder())
        assertThreeEquals(61, Stringx.foldRightIndexed(source, 0) { index, it, accumulator -> indexPair2.first.append(index);accumulator + it.toString().toInt() },
                source.foldRightIndexed(0) { index, it, accumulator -> indexPair2.second.append(index);accumulator + it.toString().toInt() })
        assertThreeEquals("1211109876543210", indexPair2.first.toString(), indexPair2.second.toString())
        assertEquals(3, Stringx.foldRightIndexed(null, 3) { _, it, accumulator -> accumulator + it.toString().toInt() })
    }

    @Test
    fun testForEach() {
        val source = "1365268945336"

        assertThreeEquals(source, StringBuilder().apply { Stringx.forEach(source) { append(it) } }.toString(),
                StringBuilder().apply { source.forEach { append(it) } }.toString())
        assertThreeEquals("0:11:32:63:54:25:66:87:98:49:510:311:312:6", StringBuilder().apply { Stringx.forEachIndexed(source) { index, it -> append(index.toString() + ":" + it) } }.toString(),
                StringBuilder().apply { source.forEachIndexed { index, it -> append(index.toString() + ":" + it) } }.toString())
    }

    @Test
    fun testMax() {
        val source = "1365268945336"
        assertThreeEquals('9', Stringx.max(source), source.max())
        assertThreeEquals(null, Stringx.max(""), "".max())
        assertNull(Stringx.max(null))

        assertThreeEquals('9', Stringx.maxBy(source) { it.toString().toInt() }, source.maxBy { it.toString().toInt() })
        assertThreeEquals(null, Stringx.maxBy("") { it.toString().toInt() }, "".maxBy { it.toString().toInt() })
        assertNull(Stringx.maxBy(null) { it.toString().toInt() })

        assertThreeEquals('9', Stringx.maxWith(source) { it1, it2 -> it1 - it2 }, source.maxWith(kotlin.Comparator { o1, o2 -> o1 - o2 }))
        assertThreeEquals(null, Stringx.maxWith("") { it1, it2 -> it1 - it2 }, "".maxWith(kotlin.Comparator { o1, o2 -> o1 - o2 }))
        assertNull(Stringx.maxWith(null) { it1, it2 -> it1 - it2 })
    }

    @Test
    fun testMin() {
        val source = "3652689453361"
        assertThreeEquals('1', Stringx.min(source), source.min())
        assertThreeEquals(null, Stringx.min(""), "".min())
        assertNull(Stringx.min(null))

        assertThreeEquals('1', Stringx.minBy(source) { it.toString().toInt() }, source.minBy { it.toString().toInt() })
        assertThreeEquals(null, Stringx.minBy("") { it.toString().toInt() }, "".minBy { it.toString().toInt() })
        assertNull(Stringx.minBy(null) { it.toString().toInt() })

        assertThreeEquals('1', Stringx.minWith(source) { it1, it2 -> it1 - it2 }, source.minWith(kotlin.Comparator { o1, o2 -> o1 - o2 }))
        assertThreeEquals(null, Stringx.minWith("") { it1, it2 -> it1 - it2 }, "".minWith(kotlin.Comparator { o1, o2 -> o1 - o2 }))
        assertNull(Stringx.minWith(null) { it1, it2 -> it1 - it2 })
    }

    @Test
    fun testNone() {
        assertThreeEquals(true, Stringx.none(""), "".none())
        assertThreeEquals(false, Stringx.none("1"), "1".none())
        assertEquals(false, Stringx.none(null))

        assertThreeEquals(true, Stringx.none("132412dsg") { Charx.isChinese(it) }, "132412dsg".none { Charx.isChinese(it) })
        assertThreeEquals(false, Stringx.none("13241天2dsg") { Charx.isChinese(it) }, "13241天2dsg".none { Charx.isChinese(it) })
        assertEquals(true, Stringx.none(null) { Charx.isChinese(it) })
    }

    @Test
    fun testOnEach() {
        val source = "1365268945336"

        val pair1 = Pair(StringBuilder(), StringBuilder())
        assertThreeEquals(source, Stringx.onEach(source) { pair1.first.append(it) }, source.onEach { pair1.second.append(it) })
        assertThreeEquals(source, pair1.first.toString(), pair1.second.toString())

        val pair2 = Pair(StringBuilder(), StringBuilder())
        assertThreeEquals("", Stringx.onEach("") { pair2.first.append(it) }, "".onEach { pair2.second.append(it) })
        assertThreeEquals("", pair2.first.toString(), pair2.second.toString())

        val pair3 = Pair(StringBuilder(), StringBuilder())
        assertEquals("", Stringx.onEach(null as String?) { pair3.first.append(it) })
        assertThreeEquals("", pair3.first.toString(), pair3.second.toString())
    }

    @Test
    fun testReduce() {
        val source = "1365268945336"

        assertThreeEquals('m', Stringx.reduce(source) { accumulator, it -> accumulator + it.toString().toInt() },
                source.reduce { accumulator, it -> accumulator + it.toString().toInt() })
        try {
            Stringx.reduce("") { accumulator, it -> accumulator + it.toString().toInt() }
            fail()
        } catch (e: Exception) {
        }
        try {
            Stringx.reduce(null) { accumulator, it -> accumulator + it.toString().toInt() }
            fail()
        } catch (e: Exception) {
        }

        val indexPair1 = Pair(StringBuilder(), StringBuilder())
        assertThreeEquals('m', Stringx.reduceIndexed(source) { index, accumulator, it -> indexPair1.first.append(index);accumulator + it.toString().toInt() },
                source.reduceIndexed { index, accumulator, it -> indexPair1.second.append(index);accumulator + it.toString().toInt() })
        assertThreeEquals("123456789101112", indexPair1.first.toString(), indexPair1.second.toString())
        try {
            Stringx.reduceIndexed("") { _, accumulator, it -> accumulator + it.toString().toInt() }
            fail()
        } catch (e: Exception) {
        }
        try {
            Stringx.reduceIndexed(null) { _, accumulator, it -> accumulator + it.toString().toInt() }
            fail()
        } catch (e: Exception) {
        }

        assertThreeEquals('m', Stringx.reduceRight(source) { it, accumulator -> accumulator + it.toString().toInt() },
                source.reduceRight { it, accumulator -> accumulator + it.toString().toInt() })
        try {
            Stringx.reduceRight("") { accumulator, it -> accumulator + it.toString().toInt() }
            fail()
        } catch (e: Exception) {
        }
        try {
            Stringx.reduceRight(null) { accumulator, it -> accumulator + it.toString().toInt() }
            fail()
        } catch (e: Exception) {
        }

        val indexPair2 = Pair(StringBuilder(), StringBuilder())
        assertThreeEquals('m', Stringx.reduceRightIndexed(source) { index, it, accumulator -> indexPair2.first.append(index);accumulator + it.toString().toInt() },
                source.reduceRightIndexed { index, it, accumulator -> indexPair2.second.append(index);accumulator + it.toString().toInt() })
        assertThreeEquals("11109876543210", indexPair2.first.toString(), indexPair2.second.toString())
        try {
            Stringx.reduceRightIndexed("") { _, accumulator, it -> accumulator + it.toString().toInt() }
            fail()
        } catch (e: Exception) {
        }
        try {
            Stringx.reduceRightIndexed(null) { _, accumulator, it -> accumulator + it.toString().toInt() }
            fail()
        } catch (e: Exception) {
        }
    }

    @Test
    fun testSum() {
        val source = "1365268945336"

        assertThreeEquals(61, Stringx.sumBy(source) { it.toString().toInt() }, source.sumBy { it.toString().toInt() })
        assertThreeEquals(61.0, Stringx.sumByDouble(source) { it.toString().toDouble() }, source.sumByDouble { it.toString().toDouble() })
    }

    @Test
    fun testChunked() {
        val source = "0123456789"
        assertThreeEquals(listOf("012", "345", "678", "9"), Stringx.chunked(source, 3), source.chunked(3))
        assertThreeEquals(listOf(3, 12, 21, 9), Stringx.chunked(source, 3) { partial -> partial.sumBy { it.toString().toInt() } },
                source.chunked(3) { partial -> partial.sumBy { it.toString().toInt() } })
    }

    @Test
    fun testPartition() {
        val source = "0123456789"
        assertThreeEquals(Pair("02468", "13579").toString(), Stringx.partition(source) { it.toString().toInt() % 2 == 0 }.toString(),
                source.partition { it.toString().toInt() % 2 == 0 }.toString())
        assertThreeEquals(Pair("02468", "13579").toString(), Stringx.partition(StringBuilder(source)) { it.toString().toInt() % 2 == 0 }.toString(),
                StringBuilder(source).partition { it.toString().toInt() % 2 == 0 }.toString())
    }

    @Test
    fun testWindowed() {
        val source = "0123456789"
        assertThreeEquals(listOf("012", "234", "456", "678"), Stringx.windowed(source, 3, 2, false), source.windowed(3, 2, false))
        assertThreeEquals(listOf("012", "234", "456", "678", "89"), Stringx.windowed(source, 3, 2, true), source.windowed(3, 2, true))

        assertThreeEquals(listOf(3, 9, 15, 21), Stringx.windowed(source, 3, 2, false) { partial -> partial.sumBy { it.toString().toInt() } },
                source.windowed(3, 2, false) { partial -> partial.sumBy { it.toString().toInt() } })

        assertEquals(listOf<String>(), Stringx.windowed(null, 3, 2, false) { partial -> partial.sumBy { it.toString().toInt() } })

        try {
            Stringx.windowed(source, 3, 0, false)
            fail()
        } catch (e: Exception) {
        }
        try {
            Stringx.windowed(source, 0, 3, false)
            fail()
        } catch (e: Exception) {
        }
        try {
            Stringx.windowed(source, 0, 0, false)
            fail()
        } catch (e: Exception) {
        }
    }

    @Test
    fun testZip() {
        val source = "0123456789"
        val other = "01234567"
        assertThreeEquals(listOf("0:0", "1:1", "2:2", "3:3", "4:4", "5:5", "6:6", "7:7"), Stringx.zip(source, other) { it1, it2 -> "$it1:$it2" },
                source.zip(other) { it1, it2 -> "$it1:$it2" })
        assertThreeEquals(listOf(Pair("0", "0").toString(), Pair("1", "1").toString(), Pair("2", "2").toString(), Pair("3", "3").toString(), Pair("4", "4").toString(), Pair("5", "5").toString(), Pair("6", "6").toString(), Pair("7", "7").toString()),
                Stringx.zip(source, other).map { it.toString() },
                source.zip(other).map { it.toString() })

        assertEquals(listOf<String>(), Stringx.zip(null, other).map { it.toString() })
        assertEquals(listOf<String>(), Stringx.zip(source, null).map { it.toString() })

        assertThreeEquals(listOf("0:1", "1:2", "2:3", "3:4", "4:5", "5:6", "6:7", "7:8", "8:9"),
                Stringx.zipWithNext(source) { it1, it2 -> "$it1:$it2" },
                source.zipWithNext { it1, it2 -> "$it1:$it2" })
        assertThreeEquals(listOf(Pair("0", "1").toString(), Pair("1", "2").toString(), Pair("2", "3").toString(), Pair("3", "4").toString(), Pair("4", "5").toString(), Pair("5", "6").toString(), Pair("6", "7").toString(), Pair("7", "8").toString(), Pair("8", "9").toString()),
                Stringx.zipWithNext(source).map { it.toString() },
                source.zipWithNext().map { it.toString() })
        assertEquals(listOf<String>(), Stringx.zipWithNext("").map { it.toString() })
        assertEquals(listOf<String>(), Stringx.zipWithNext(null).map { it.toString() })
    }

    @Test
    fun testAsIterable() {
        val source = "0123456789"
        assertThreeEquals("0,1,2,3,4,5,6,7,8,9", Stringx.asIterable(source).joinToString(","), source.asIterable().joinToString(","))
        assertThreeEquals("", Stringx.asIterable(StringBuilder("")).joinToString(","), StringBuilder("").asIterable().joinToString(","))
        assertEquals(listOf<Char>(), Stringx.asIterable(null))
        assertEquals(listOf<Char>(), Stringx.asIterable(""))
    }
}
