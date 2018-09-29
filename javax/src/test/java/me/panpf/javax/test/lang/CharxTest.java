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

import me.panpf.javax.lang.Charx;
import org.junit.Assert;
import org.junit.Test;

public class CharxTest {

    @Test
    public void testIsBlank() {
        Assert.assertTrue(Charx.isBlank(' '));
        Assert.assertFalse(Charx.isBlank('*'));
        Assert.assertFalse(Charx.isBlank('8'));
        Assert.assertFalse(Charx.isBlank('a'));
        Assert.assertFalse(Charx.isBlank('天'));

        Assert.assertTrue(Charx.isNotBlank('*'));
        Assert.assertTrue(Charx.isNotBlank('8'));
        Assert.assertTrue(Charx.isNotBlank('a'));
        Assert.assertTrue(Charx.isNotBlank('天'));
        Assert.assertFalse(Charx.isNotBlank(' '));

        Assert.assertEquals(Charx.isBlankOr(' ', 'a'), 'a');
        Assert.assertEquals(Charx.isBlankOr('%', 'a'), '%');
    }

    @Test
    public void testIsChinese() {
        Assert.assertTrue(Charx.isChinese('今'));
        Assert.assertFalse(Charx.isChinese('*'));
        Assert.assertFalse(Charx.isChinese('8'));
        Assert.assertFalse(Charx.isChinese('a'));
        Assert.assertFalse(Charx.isChinese(' '));

        Assert.assertTrue(Charx.isNotChinese('*'));
        Assert.assertTrue(Charx.isNotChinese('8'));
        Assert.assertTrue(Charx.isNotChinese('a'));
        Assert.assertTrue(Charx.isNotChinese(' '));
        Assert.assertFalse(Charx.isNotChinese('今'));

        Assert.assertEquals(Charx.isNotChineseOr(' ', '哈'), '哈');
        Assert.assertEquals(Charx.isNotChineseOr('今', '哈'), '今');
    }

    @Test
    public void testIsDigit() {
        Assert.assertTrue(Charx.isDigit('8'));
        Assert.assertFalse(Charx.isDigit('*'));
        Assert.assertFalse(Charx.isDigit('a'));
        Assert.assertFalse(Charx.isDigit(' '));
        Assert.assertFalse(Charx.isDigit('天'));

        Assert.assertTrue(Charx.isNotDigit('*'));
        Assert.assertTrue(Charx.isNotDigit('a'));
        Assert.assertTrue(Charx.isNotDigit(' '));
        Assert.assertTrue(Charx.isNotDigit('天'));
        Assert.assertFalse(Charx.isNotDigit('8'));

        Assert.assertEquals(Charx.isNotDigitOr(' ', '6'), '6');
        Assert.assertEquals(Charx.isNotDigitOr('7', '6'), '7');
    }

    @Test
    public void testIsLetter() {
        Assert.assertTrue(Charx.isLetter('a'));
        Assert.assertTrue(Charx.isLetter('天'));
        Assert.assertFalse(Charx.isLetter('*'));
        Assert.assertFalse(Charx.isLetter('8'));
        Assert.assertFalse(Charx.isLetter(' '));

        Assert.assertTrue(Charx.isNotLetter('*'));
        Assert.assertTrue(Charx.isNotLetter('8'));
        Assert.assertTrue(Charx.isNotLetter(' '));
        Assert.assertFalse(Charx.isNotLetter('a'));
        Assert.assertFalse(Charx.isNotLetter('天'));

        Assert.assertEquals(Charx.isNotLetterOr(' ', 'a'), 'a');
        Assert.assertEquals(Charx.isNotLetterOr('c', 'b'), 'c');
        Assert.assertEquals(Charx.isNotLetterOr('天', 'b'), '天');
    }

    @Test
    public void testIsLetterOrDigit() {
        Assert.assertTrue(Charx.isLetterOrDigit('a'));
        Assert.assertTrue(Charx.isLetterOrDigit('天'));
        Assert.assertTrue(Charx.isLetterOrDigit('8'));
        Assert.assertFalse(Charx.isLetterOrDigit('*'));
        Assert.assertFalse(Charx.isLetterOrDigit(' '));

        Assert.assertTrue(Charx.isNotLetterOrDigit('*'));
        Assert.assertTrue(Charx.isNotLetterOrDigit(' '));
        Assert.assertFalse(Charx.isNotLetterOrDigit('a'));
        Assert.assertFalse(Charx.isNotLetterOrDigit('天'));
        Assert.assertFalse(Charx.isNotLetterOrDigit('8'));

        Assert.assertEquals(Charx.isNotLetterOrDigitOr(' ', 'a'), 'a');
        Assert.assertEquals(Charx.isNotLetterOrDigitOr('c', 'b'), 'c');
        Assert.assertEquals(Charx.isNotLetterOrDigitOr('天', 'b'), '天');
        Assert.assertEquals(Charx.isNotLetterOrDigitOr('8', 'b'), '8');
    }

    @Test
    public void testEquals() {
        Assert.assertTrue(Charx.equals('a', 'a'));
        Assert.assertFalse(Charx.equals('a', 'A'));
        Assert.assertTrue(Charx.equals('a', 'A', true));
    }
}
