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

public class CharTest {

    @Test
    public void testIsBlank() {
        Assert.assertTrue(Charx.isBlank(' '));
        Assert.assertFalse(Charx.isBlank('*'));
        Assert.assertFalse(Charx.isBlank('8'));
        Assert.assertFalse(Charx.isBlank('a'));
        Assert.assertFalse(Charx.isBlank('天'));

        Assert.assertTrue(Charx.isBlank(' ', ' '));
        Assert.assertFalse(Charx.isBlank(' ', '*'));
        Assert.assertFalse(Charx.isBlank(' ', '8'));
        Assert.assertFalse(Charx.isBlank(' ', 'a'));
        Assert.assertFalse(Charx.isBlank(' ', '天'));
    }

    @Test
    public void testIsChinese() {
        Assert.assertTrue(Charx.isChinese('今'));
        Assert.assertFalse(Charx.isChinese('*'));
        Assert.assertFalse(Charx.isChinese('8'));
        Assert.assertFalse(Charx.isChinese('a'));
        Assert.assertFalse(Charx.isChinese(' '));

        Assert.assertTrue(Charx.isChinese('今', '天'));
        Assert.assertFalse(Charx.isChinese('今', '*'));
        Assert.assertFalse(Charx.isChinese('今', '8'));
        Assert.assertFalse(Charx.isChinese('今', 'a'));
        Assert.assertFalse(Charx.isChinese('今', ' '));
    }

    @Test
    public void testIsDigit() {
        Assert.assertTrue(Charx.isDigit('8'));
        Assert.assertFalse(Charx.isDigit('*'));
        Assert.assertFalse(Charx.isDigit('a'));
        Assert.assertFalse(Charx.isDigit(' '));
        Assert.assertFalse(Charx.isDigit('天'));

        Assert.assertTrue(Charx.isDigit('8', '8'));
        Assert.assertFalse(Charx.isDigit('8', '*'));
        Assert.assertFalse(Charx.isDigit('8', 'a'));
        Assert.assertFalse(Charx.isDigit('8', ' '));
        Assert.assertFalse(Charx.isDigit('8', '天'));
    }
}
