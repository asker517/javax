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

class CharTest {

    @Test
    fun testIsBlank() {
        Assert.assertTrue(' '.isBlank())
        Assert.assertFalse('*'.isBlank())
        Assert.assertFalse('8'.isBlank())
        Assert.assertFalse('a'.isBlank())
        Assert.assertFalse('天'.isBlank())

        Assert.assertTrue('*'.isNotBlank())
        Assert.assertTrue('8'.isNotBlank())
        Assert.assertTrue('a'.isNotBlank())
        Assert.assertTrue('天'.isNotBlank())
        Assert.assertFalse(' '.isNotBlank())

//        Assert.assertTrue(charArrayOf(' ', ' ').isAllBlank())
//        Assert.assertFalse(charArrayOf(' ', '*').isAllBlank())
//        Assert.assertFalse(charArrayOf(' ', '8').isAllBlank())
//        Assert.assertFalse(charArrayOf(' ', 'a').isAllBlank())
//        Assert.assertFalse(charArrayOf(' ', '天').isAllBlank())
//
//        Assert.assertTrue(listOf(' ', ' ').isAllBlank())
//        Assert.assertFalse(listOf(' ', '*').isAllBlank())
//        Assert.assertFalse(listOf(' ', '8').isAllBlank())
//        Assert.assertFalse(listOf(' ', 'a').isAllBlank())
//        Assert.assertFalse(listOf(' ', '天').isAllBlank())
//
//        Assert.assertTrue(charArrayOf('天', '天').isAllNotBlank())
//        Assert.assertFalse(charArrayOf(' ', ' ').isAllNotBlank())
//        Assert.assertFalse(charArrayOf(' ', '*').isAllNotBlank())
//        Assert.assertFalse(charArrayOf(' ', '8').isAllNotBlank())
//        Assert.assertFalse(charArrayOf(' ', 'a').isAllNotBlank())
//        Assert.assertFalse(charArrayOf(' ', '天').isAllNotBlank())
//
//        Assert.assertTrue(listOf('天', '天').isAllNotBlank())
//        Assert.assertFalse(listOf(' ', ' ').isAllNotBlank())
//        Assert.assertFalse(listOf(' ', '*').isAllNotBlank())
//        Assert.assertFalse(listOf(' ', '8').isAllNotBlank())
//        Assert.assertFalse(listOf(' ', 'a').isAllNotBlank())
//        Assert.assertFalse(listOf(' ', '天').isAllNotBlank())
//
//        Assert.assertTrue(charArrayOf(' ', '*').isPartBlank())
//        Assert.assertTrue(charArrayOf(' ', '8').isPartBlank())
//        Assert.assertTrue(charArrayOf(' ', 'a').isPartBlank())
//        Assert.assertTrue(charArrayOf(' ', '天').isPartBlank())
//        Assert.assertFalse(charArrayOf(' ', ' ').isPartBlank())
//        Assert.assertFalse(charArrayOf('8', '*').isPartBlank())
//
//        Assert.assertTrue(listOf(' ', '*').isPartBlank())
//        Assert.assertTrue(listOf(' ', '8').isPartBlank())
//        Assert.assertTrue(listOf(' ', 'a').isPartBlank())
//        Assert.assertTrue(listOf(' ', '天').isPartBlank())
//        Assert.assertFalse(listOf(' ', ' ').isPartBlank())
//        Assert.assertFalse(listOf('8', '*').isPartBlank())

        Assert.assertEquals(' '.isBlankOr('a'), 'a')
        Assert.assertEquals('%'.isBlankOr('a'), '%')
    }

    @Test
    fun testIsChinese() {
        Assert.assertTrue('今'.isChinese())
        Assert.assertFalse('*'.isChinese())
        Assert.assertFalse('8'.isChinese())
        Assert.assertFalse('a'.isChinese())
        Assert.assertFalse(' '.isChinese())

        Assert.assertTrue('*'.isNotChinese())
        Assert.assertTrue('8'.isNotChinese())
        Assert.assertTrue('a'.isNotChinese())
        Assert.assertTrue(' '.isNotChinese())
        Assert.assertFalse('今'.isNotChinese())

//        Assert.assertTrue(charArrayOf('今', '天').isAllChinese())
//        Assert.assertFalse(charArrayOf('今', '*').isAllChinese())
//        Assert.assertFalse(charArrayOf('今', '8').isAllChinese())
//        Assert.assertFalse(charArrayOf('今', 'a').isAllChinese())
//        Assert.assertFalse(charArrayOf('今', ' ').isAllChinese())
//
//        Assert.assertTrue(listOf('今', '天').isAllChinese())
//        Assert.assertFalse(listOf('今', '*').isAllChinese())
//        Assert.assertFalse(listOf('今', '8').isAllChinese())
//        Assert.assertFalse(listOf('今', 'a').isAllChinese())
//        Assert.assertFalse(listOf('今', ' ').isAllChinese())
//
//        Assert.assertTrue(charArrayOf(' ', ' ').isAllNotChinese())
//        Assert.assertTrue(charArrayOf('8', '2').isAllNotChinese())
//        Assert.assertTrue(charArrayOf('*', '&').isAllNotChinese())
//        Assert.assertFalse(charArrayOf('今', '天').isAllNotChinese())
//        Assert.assertFalse(charArrayOf('今', '*').isAllNotChinese())
//        Assert.assertFalse(charArrayOf('今', '8').isAllNotChinese())
//        Assert.assertFalse(charArrayOf('今', 'a').isAllNotChinese())
//        Assert.assertFalse(charArrayOf('今', ' ').isAllNotChinese())
//
//        Assert.assertTrue(listOf(' ', ' ').isAllNotChinese())
//        Assert.assertTrue(listOf('8', '2').isAllNotChinese())
//        Assert.assertTrue(listOf('*', '&').isAllNotChinese())
//        Assert.assertFalse(listOf('今', '天').isAllNotChinese())
//        Assert.assertFalse(listOf('今', '*').isAllNotChinese())
//        Assert.assertFalse(listOf('今', '8').isAllNotChinese())
//        Assert.assertFalse(listOf('今', 'a').isAllNotChinese())
//        Assert.assertFalse(listOf('今', ' ').isAllNotChinese())
//
//        Assert.assertTrue(charArrayOf('今', '*').isPartChinese())
//        Assert.assertTrue(charArrayOf('今', '8').isPartChinese())
//        Assert.assertTrue(charArrayOf('今', 'a').isPartChinese())
//        Assert.assertTrue(charArrayOf('今', ' ').isPartChinese())
//        Assert.assertFalse(charArrayOf('今', '天').isPartChinese())
//        Assert.assertFalse(charArrayOf(' ', ' ').isPartChinese())
//
//        Assert.assertTrue(listOf('今', '*').isPartChinese())
//        Assert.assertTrue(listOf('今', '8').isPartChinese())
//        Assert.assertTrue(listOf('今', 'a').isPartChinese())
//        Assert.assertTrue(listOf('今', ' ').isPartChinese())
//        Assert.assertFalse(listOf('今', '天').isPartChinese())
//        Assert.assertFalse(listOf(' ', ' ').isPartChinese())

        Assert.assertEquals(' '.isNotChineseOr('哈'), '哈')
        Assert.assertEquals('今'.isNotChineseOr('哈'), '今')
    }

    @Test
    fun testIsDigit() {
        Assert.assertTrue('8'.isDigit())
        Assert.assertFalse('*'.isDigit())
        Assert.assertFalse('a'.isDigit())
        Assert.assertFalse(' '.isDigit())
        Assert.assertFalse('天'.isDigit())

        Assert.assertTrue('*'.isNotDigit())
        Assert.assertTrue('a'.isNotDigit())
        Assert.assertTrue(' '.isNotDigit())
        Assert.assertTrue('天'.isNotDigit())
        Assert.assertFalse('8'.isNotDigit())

//        Assert.assertTrue(charArrayOf('8', '6').isAllDigit())
//        Assert.assertFalse(charArrayOf('8', '*').isAllDigit())
//        Assert.assertFalse(charArrayOf('8', 'a').isAllDigit())
//        Assert.assertFalse(charArrayOf('8', ' ').isAllDigit())
//        Assert.assertFalse(charArrayOf('8', '天').isAllDigit())
//
//        Assert.assertTrue(listOf('8', '6').isAllDigit())
//        Assert.assertFalse(listOf('8', '*').isAllDigit())
//        Assert.assertFalse(listOf('8', 'a').isAllDigit())
//        Assert.assertFalse(listOf('8', ' ').isAllDigit())
//        Assert.assertFalse(listOf('8', '天').isAllDigit())
//
//        Assert.assertTrue(charArrayOf('*', '今', ' ', 'a').isAllNotDigit())
//        Assert.assertFalse(charArrayOf('8', '*').isAllNotDigit())
//        Assert.assertFalse(charArrayOf('8', 'a').isAllNotDigit())
//        Assert.assertFalse(charArrayOf('8', ' ').isAllNotDigit())
//        Assert.assertFalse(charArrayOf('8', '天').isAllNotDigit())
//
//        Assert.assertTrue(listOf('*', '今', ' ', 'a').isAllNotDigit())
//        Assert.assertFalse(listOf('8', '*').isAllNotDigit())
//        Assert.assertFalse(listOf('8', 'a').isAllNotDigit())
//        Assert.assertFalse(listOf('8', ' ').isAllNotDigit())
//        Assert.assertFalse(listOf('8', '天').isAllNotDigit())
//
//        Assert.assertTrue(charArrayOf('8', '*').isPartDigit())
//        Assert.assertTrue(charArrayOf('8', 'a').isPartDigit())
//        Assert.assertTrue(charArrayOf('8', ' ').isPartDigit())
//        Assert.assertTrue(charArrayOf('8', '天').isPartDigit())
//        Assert.assertFalse(charArrayOf('8', '6').isPartDigit())
//        Assert.assertFalse(charArrayOf(' ', ' ').isPartDigit())
//
//        Assert.assertTrue(listOf('8', '*').isPartDigit())
//        Assert.assertTrue(listOf('8', 'a').isPartDigit())
//        Assert.assertTrue(listOf('8', ' ').isPartDigit())
//        Assert.assertTrue(listOf('8', '天').isPartDigit())
//        Assert.assertFalse(listOf('8', '6').isPartDigit())
//        Assert.assertFalse(listOf(' ', ' ').isPartDigit())

        Assert.assertEquals(' '.isNotDigitOr('6'), '6')
        Assert.assertEquals('7'.isNotDigitOr('6'), '7')
    }

    @Test
    fun testIsLetter() {
        Assert.assertTrue('a'.isLetter())
        Assert.assertTrue('天'.isLetter())
        Assert.assertFalse('*'.isLetter())
        Assert.assertFalse('8'.isLetter())
        Assert.assertFalse(' '.isLetter())

        Assert.assertTrue('*'.isNotLetter())
        Assert.assertTrue('8'.isNotLetter())
        Assert.assertTrue(' '.isNotLetter())
        Assert.assertFalse('a'.isNotLetter())
        Assert.assertFalse('天'.isNotLetter())

//        Assert.assertTrue(charArrayOf('a', '天').isAllLetter())
//        Assert.assertFalse(charArrayOf('a', '*').isAllLetter())
//        Assert.assertFalse(charArrayOf('a', '8').isAllLetter())
//        Assert.assertFalse(charArrayOf('a', ' ').isAllLetter())
//
//        Assert.assertTrue(listOf('a', '天').isAllLetter())
//        Assert.assertFalse(listOf('a', '*').isAllLetter())
//        Assert.assertFalse(listOf('a', '8').isAllLetter())
//        Assert.assertFalse(listOf('a', ' ').isAllLetter())
//
//        Assert.assertTrue(charArrayOf('*', ' ', '8').isAllNotLetter())
//        Assert.assertFalse(charArrayOf('a', '*').isAllNotLetter())
//        Assert.assertFalse(charArrayOf('a', '8').isAllNotLetter())
//        Assert.assertFalse(charArrayOf('a', ' ').isAllNotLetter())
//
//        Assert.assertTrue(listOf('*', ' ', '8').isAllNotLetter())
//        Assert.assertFalse(listOf('a', '*').isAllNotLetter())
//        Assert.assertFalse(listOf('a', '8').isAllNotLetter())
//        Assert.assertFalse(listOf('a', ' ').isAllNotLetter())
//
//        Assert.assertTrue(charArrayOf('a', '*').isPartLetter())
//        Assert.assertTrue(charArrayOf('a', '8').isPartLetter())
//        Assert.assertTrue(charArrayOf('a', ' ').isPartLetter())
//        Assert.assertFalse(charArrayOf('a', '天').isPartLetter())
//        Assert.assertFalse(charArrayOf('8', '6').isPartLetter())
//        Assert.assertFalse(charArrayOf(' ', ' ').isPartLetter())
//
//        Assert.assertTrue(listOf('a', '*').isPartLetter())
//        Assert.assertTrue(listOf('a', '8').isPartLetter())
//        Assert.assertTrue(listOf('a', ' ').isPartLetter())
//        Assert.assertFalse(listOf('a', '天').isPartLetter())
//        Assert.assertFalse(listOf('8', '6').isPartLetter())
//        Assert.assertFalse(listOf(' ', ' ').isPartLetter())

        Assert.assertEquals(' '.isNotLetterOr('a'), 'a')
        Assert.assertEquals('c'.isNotLetterOr('b'), 'c')
        Assert.assertEquals('天'.isNotLetterOr('b'), '天')
    }

    @Test
    fun testIsLetterOrDigit() {
        Assert.assertTrue('a'.isLetterOrDigit())
        Assert.assertTrue('天'.isLetterOrDigit())
        Assert.assertTrue('8'.isLetterOrDigit())
        Assert.assertFalse('*'.isLetterOrDigit())
        Assert.assertFalse(' '.isLetterOrDigit())

        Assert.assertTrue('*'.isNotLetterOrDigit())
        Assert.assertTrue(' '.isNotLetterOrDigit())
        Assert.assertFalse('a'.isNotLetterOrDigit())
        Assert.assertFalse('天'.isNotLetterOrDigit())
        Assert.assertFalse('8'.isNotLetterOrDigit())

//        Assert.assertTrue(charArrayOf('a', '天', '8').isAllLetterOrDigit())
//        Assert.assertFalse(charArrayOf('a', '*').isAllLetterOrDigit())
//        Assert.assertFalse(charArrayOf('a', ' ').isAllLetterOrDigit())
//
//        Assert.assertTrue(listOf('a', '天', '8').isAllLetterOrDigit())
//        Assert.assertFalse(listOf('a', '*').isAllLetterOrDigit())
//        Assert.assertFalse(listOf('a', ' ').isAllLetterOrDigit())
//
//        Assert.assertTrue(charArrayOf('*', ' ').isAllNotLetterOrDigit())
//        Assert.assertFalse(charArrayOf('a', '*').isAllNotLetterOrDigit())
//        Assert.assertFalse(charArrayOf('a', '8').isAllNotLetterOrDigit())
//        Assert.assertFalse(charArrayOf('a', ' ').isAllNotLetterOrDigit())
//
//        Assert.assertTrue(listOf('*', ' ').isAllNotLetterOrDigit())
//        Assert.assertFalse(listOf('a', '*').isAllNotLetterOrDigit())
//        Assert.assertFalse(listOf('a', '8').isAllNotLetterOrDigit())
//        Assert.assertFalse(listOf('a', ' ').isAllNotLetterOrDigit())
//
//        Assert.assertTrue(charArrayOf('a', '*').isPartLetterOrDigit())
//        Assert.assertTrue(charArrayOf('a', ' ').isPartLetterOrDigit())
//        Assert.assertFalse(charArrayOf('a', '8').isPartLetterOrDigit())
//        Assert.assertFalse(charArrayOf('a', '天').isPartLetterOrDigit())
//        Assert.assertFalse(charArrayOf('8', '6').isPartLetterOrDigit())
//        Assert.assertFalse(charArrayOf(' ', ' ').isPartLetterOrDigit())
//
//        Assert.assertTrue(listOf('a', '*').isPartLetterOrDigit())
//        Assert.assertTrue(listOf('a', ' ').isPartLetterOrDigit())
//        Assert.assertFalse(listOf('a', '8').isPartLetterOrDigit())
//        Assert.assertFalse(listOf('a', '天').isPartLetterOrDigit())
//        Assert.assertFalse(listOf('8', '6').isPartLetterOrDigit())
//        Assert.assertFalse(listOf(' ', ' ').isPartLetterOrDigit())

        Assert.assertEquals(' '.isNotLetterOrDigitOr('a'), 'a')
        Assert.assertEquals('c'.isNotLetterOrDigitOr('b'), 'c')
        Assert.assertEquals('天'.isNotLetterOrDigitOr('b'), '天')
        Assert.assertEquals('8'.isNotLetterOrDigitOr('b'), '8')
    }
}
