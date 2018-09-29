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

class CharxTest {

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

        Assert.assertEquals(' '.isNotLetterOrDigitOr('a'), 'a')
        Assert.assertEquals('c'.isNotLetterOrDigitOr('b'), 'c')
        Assert.assertEquals('天'.isNotLetterOrDigitOr('b'), '天')
        Assert.assertEquals('8'.isNotLetterOrDigitOr('b'), '8')
    }
}
