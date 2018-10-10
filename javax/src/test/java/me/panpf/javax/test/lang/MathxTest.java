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

import me.panpf.javax.lang.Mathx;
import org.junit.Assert;
import org.junit.Test;

public class MathxTest {

    @Test
    public final void testNormalDivide() {
        try {
            //noinspection unused,NumericOverflow,divzero
            int result = 2 / 0;
            Assert.fail();
        } catch (Exception ignored) {
        }

        try {
            //noinspection unused,PointlessArithmeticExpression
            int var10000 = 2 / 2;
        } catch (Exception var2) {
            Assert.fail();
        }
    }

    @Test
    public final void testDivide() {
        Assert.assertEquals(Mathx.divide((byte) 15, (byte) 3), 5f, 0f);
        Assert.assertEquals(Mathx.divide((byte) 0, (byte) 3), 0f, 0f);
        Assert.assertEquals(Mathx.divide((byte) 15, (byte) 0), 0f, 0f);
        Assert.assertEquals(Mathx.divide((byte) 0, (byte) 0), 0f, 0f);

        Assert.assertEquals(Mathx.divide((short) 15, (short) 3), 5f, 0f);
        Assert.assertEquals(Mathx.divide((short) 0, (short) 3), 0f, 0f);
        Assert.assertEquals(Mathx.divide((short) 15, (short) 0), 0f, 0f);
        Assert.assertEquals(Mathx.divide((short) 0, (short) 0), 0f, 0f);

        Assert.assertEquals(Mathx.divide(15, 3), 5f, 0f);
        Assert.assertEquals(Mathx.divide(0, 3), 0f, 0f);
        Assert.assertEquals(Mathx.divide(15, 0), 0f, 0f);
        Assert.assertEquals(Mathx.divide(0, 0), 0f, 0f);

        Assert.assertEquals(Mathx.divide(15L, 3L), 5d, 0d);
        Assert.assertEquals(Mathx.divide(0L, 3L), 0d, 0d);
        Assert.assertEquals(Mathx.divide(15L, 0L), 0d, 0d);
        Assert.assertEquals(Mathx.divide(0L, 0L), 0d, 0d);

        Assert.assertEquals(Mathx.divide(15f, 3f), 5f, 0f);
        Assert.assertEquals(Mathx.divide(0f, 3f), 0f, 0f);
        Assert.assertEquals(Mathx.divide(15f, 0f), 0f, 0f);
        Assert.assertEquals(Mathx.divide(0f, 0f), 0f, 0f);

        Assert.assertEquals(Mathx.divide(15d, 3d), 5d, 0d);
        Assert.assertEquals(Mathx.divide(0d, 3d), 0d, 0d);
        Assert.assertEquals(Mathx.divide(15d, 0d), 0d, 0d);
        Assert.assertEquals(Mathx.divide(0d, 0d), 0d, 0d);
    }

    @Test
    public final void testDivideToInt() {
        Assert.assertEquals(Mathx.divideToInt((byte) 15, (byte) 3), 5);
        Assert.assertEquals(Mathx.divideToInt((byte) 0, (byte) 3), 0);
        Assert.assertEquals(Mathx.divideToInt((byte) 15, (byte) 0), 0);
        Assert.assertEquals(Mathx.divideToInt((byte) 0, (byte) 0), 0);

        Assert.assertEquals(Mathx.divideToInt((short) 15, (short) 3), 5);
        Assert.assertEquals(Mathx.divideToInt((short) 0, (short) 3), 0);
        Assert.assertEquals(Mathx.divideToInt((short) 15, (short) 0), 0);
        Assert.assertEquals(Mathx.divideToInt((short) 0, (short) 0), 0);

        Assert.assertEquals(Mathx.divideToInt(15, 3), 5);
        Assert.assertEquals(Mathx.divideToInt(0, 3), 0);
        Assert.assertEquals(Mathx.divideToInt(15, 0), 0);
        Assert.assertEquals(Mathx.divideToInt(0, 0), 0);

        Assert.assertEquals(Mathx.divideToInt(15L, 3L), 5);
        Assert.assertEquals(Mathx.divideToInt(0, 3L), 0);
        Assert.assertEquals(Mathx.divideToInt(15L, 0L), 0);
        Assert.assertEquals(Mathx.divideToInt(0, 0L), 0);

        Assert.assertEquals(Mathx.divideToInt(15f, 3f), 5);
        Assert.assertEquals(Mathx.divideToInt(0f, 3f), 0);
        Assert.assertEquals(Mathx.divideToInt(15f, 0f), 0);
        Assert.assertEquals(Mathx.divideToInt(0f, 0f), 0);

        Assert.assertEquals(Mathx.divideToInt(15d, 3d), 5);
        Assert.assertEquals(Mathx.divideToInt(0d, 3d), 0);
        Assert.assertEquals(Mathx.divideToInt(15d, 0d), 0);
        Assert.assertEquals(Mathx.divideToInt(0d, 0d), 0);
    }

    @Test
    public final void testDivideToLong() {
        Assert.assertEquals(Mathx.divideToLong((byte) 15, (byte) 3), 5L);
        Assert.assertEquals(Mathx.divideToLong((byte) 0, (byte) 3), 0L);
        Assert.assertEquals(Mathx.divideToLong((byte) 15, (byte) 0), 0L);
        Assert.assertEquals(Mathx.divideToLong((byte) 0, (byte) 0), 0L);

        Assert.assertEquals(Mathx.divideToLong((short) 15, (short) 3), 5L);
        Assert.assertEquals(Mathx.divideToLong((short) 0, (short) 3), 0L);
        Assert.assertEquals(Mathx.divideToLong((short) 15, (short) 0), 0L);
        Assert.assertEquals(Mathx.divideToLong((short) 0, (short) 0), 0L);

        Assert.assertEquals(Mathx.divideToLong(15, 3), 5L);
        Assert.assertEquals(Mathx.divideToLong(0, 3), 0L);
        Assert.assertEquals(Mathx.divideToLong(15, 0), 0L);
        Assert.assertEquals(Mathx.divideToLong(0, 0), 0L);

        Assert.assertEquals(Mathx.divideToLong(15L, 3L), 5L);
        Assert.assertEquals(Mathx.divideToLong(0L, 3L), 0L);
        Assert.assertEquals(Mathx.divideToLong(15L, 0L), 0L);
        Assert.assertEquals(Mathx.divideToLong(0L, 0L), 0L);

        Assert.assertEquals(Mathx.divideToLong(15f, 3f), 5L);
        Assert.assertEquals(Mathx.divideToLong(0f, 3f), 0L);
        Assert.assertEquals(Mathx.divideToLong(15f, 0f), 0L);
        Assert.assertEquals(Mathx.divideToLong(0f, 0f), 0L);

        Assert.assertEquals(Mathx.divideToLong(15d, 3d), 5L);
        Assert.assertEquals(Mathx.divideToLong(0d, 3d), 0L);
        Assert.assertEquals(Mathx.divideToLong(15d, 0d), 0L);
        Assert.assertEquals(Mathx.divideToLong(0d, 0d), 0L);
    }

    @Test
    public final void testProportion() {
        Assert.assertEquals(Mathx.proportion((byte) 30, (byte) 11, 4), 2.7273f, 0f);
        Assert.assertEquals(Mathx.proportion((byte) 30, (byte) 11), 2.73f, 0f);
        Assert.assertEquals(Mathx.proportion((byte) 0, (byte) 11), 0f, 0f);
        Assert.assertEquals(Mathx.proportion((byte) 30, (byte) 0), 1f, 0f);
        Assert.assertEquals(Mathx.proportion((byte) 0, (byte) 0), 0f, 0f);

        Assert.assertEquals(Mathx.proportion((short) 30, (short) 11, 4), 2.7273f, 0f);
        Assert.assertEquals(Mathx.proportion((short) 30, (short) 11), 2.73f, 0f);
        Assert.assertEquals(Mathx.proportion((short) 0, (short) 11), 0f, 0f);
        Assert.assertEquals(Mathx.proportion((short) 30, (short) 0), 1f, 0f);
        Assert.assertEquals(Mathx.proportion((short) 0, (short) 0), 0f, 0f);

        Assert.assertEquals(Mathx.proportion(30, 11, 4), 2.7273f, 0f);
        Assert.assertEquals(Mathx.proportion(30, 11), 2.73f, 0f);
        Assert.assertEquals(Mathx.proportion(0, 11), 0f, 0f);
        Assert.assertEquals(Mathx.proportion(30, 0), 1f, 0f);
        Assert.assertEquals(Mathx.proportion(0, 0), 0f, 0f);

        Assert.assertEquals(Mathx.proportion(30L, 11L, 4), 2.7273f, 0f);
        Assert.assertEquals(Mathx.proportion(30L, 11L), 2.73f, 0f);
        Assert.assertEquals(Mathx.proportion(0L, 11L), 0f, 0f);
        Assert.assertEquals(Mathx.proportion(30L, 0L), 1f, 0f);
        Assert.assertEquals(Mathx.proportion(0L, 0L), 0f, 0f);

        Assert.assertEquals(Mathx.proportion(30f, 11f, 4), 2.7273f, 0f);
        Assert.assertEquals(Mathx.proportion(30f, 11f), 2.73f, 0f);
        Assert.assertEquals(Mathx.proportion(0f, 11f), 0f, 0f);
        Assert.assertEquals(Mathx.proportion(30f, 0f), 1f, 0f);
        Assert.assertEquals(Mathx.proportion(0f, 0f), 0f, 0f);

        Assert.assertEquals(Mathx.proportion(30d, 11d, 4), 2.7273f, 0f);
        Assert.assertEquals(Mathx.proportion(30d, 11d), 2.73f, 0f);
        Assert.assertEquals(Mathx.proportion(0d, 11d), 0f, 0f);
        Assert.assertEquals(Mathx.proportion(30d, 0d), 1f, 0f);
        Assert.assertEquals(Mathx.proportion(0d, 0d), 0f, 0f);
    }

    @Test
    public final void testPercent() {
        Assert.assertEquals(Mathx.percent((byte) 11, (byte) 30, 4), 36.6667f, 0f);
        Assert.assertEquals(Mathx.percent((byte) 11, (byte) 30), 36.67f, 0f);
        Assert.assertEquals(Mathx.percent((byte) 0, (byte) 30), 0f, 0f);
        Assert.assertEquals(Mathx.percent((byte) 11, (byte) 0), 100f, 0f);
        Assert.assertEquals(Mathx.percent((byte) 0, (byte) 0), 0f, 0f);

        Assert.assertEquals(Mathx.percent((short) 11, (short) 30, 4), 36.6667f, 0f);
        Assert.assertEquals(Mathx.percent((short) 11, (short) 30), 36.67f, 0f);
        Assert.assertEquals(Mathx.percent((short) 0, (short) 30), 0f, 0f);
        Assert.assertEquals(Mathx.percent((short) 11, (short) 0), 100f, 0f);
        Assert.assertEquals(Mathx.percent((short) 0, (short) 0), 0f, 0f);

        Assert.assertEquals(Mathx.percent(11, 30, 4), 36.6667f, 0f);
        Assert.assertEquals(Mathx.percent(11, 30), 36.67f, 0f);
        Assert.assertEquals(Mathx.percent(0, 30), 0f, 0f);
        Assert.assertEquals(Mathx.percent(11, 0), 100f, 0f);
        Assert.assertEquals(Mathx.percent(0, 0), 0f, 0f);

        Assert.assertEquals(Mathx.percent(11L, 30L, 4), 36.6667f, 0f);
        Assert.assertEquals(Mathx.percent(11L, 30L), 36.67f, 0f);
        Assert.assertEquals(Mathx.percent(0L, 30L), 0f, 0f);
        Assert.assertEquals(Mathx.percent(11L, 0L), 100f, 0f);
        Assert.assertEquals(Mathx.percent(0L, 0L), 0f, 0f);

        Assert.assertEquals(Mathx.percent(11f, 30f, 4), 36.6667f, 0f);
        Assert.assertEquals(Mathx.percent(11f, 30f), 36.67f, 0f);
        Assert.assertEquals(Mathx.percent(0f, 30f), 0f, 0f);
        Assert.assertEquals(Mathx.percent(11f, 0f), 100f, 0f);
        Assert.assertEquals(Mathx.percent(0f, 0f), 0f, 0f);

        Assert.assertEquals(Mathx.percent(11d, 30d, 4), 36.6667f, 0f);
        Assert.assertEquals(Mathx.percent(11d, 30d), 36.67f, 0f);
        Assert.assertEquals(Mathx.percent(0d, 30d), 0f, 0f);
        Assert.assertEquals(Mathx.percent(11d, 0d), 100f, 0f);
        Assert.assertEquals(Mathx.percent(0d, 0d), 0f, 0f);
    }
}
