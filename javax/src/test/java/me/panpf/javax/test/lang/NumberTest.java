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

import me.panpf.javax.lang.Numberx;
import me.panpf.javax.util.Collectionx;
import org.junit.Assert;
import org.junit.Test;

import java.math.RoundingMode;

public class NumberTest {

    @Test
    public void testScale() {
        Assert.assertEquals(String.valueOf(Numberx.scale(0.2489, 2)), String.valueOf(0.25f));
        Assert.assertEquals(String.valueOf(Numberx.scale(0.2449, 2)), String.valueOf(0.24f));

        Assert.assertEquals(String.valueOf(Numberx.scale(0.2489, 2, RoundingMode.UP)), String.valueOf(0.25f));
        Assert.assertEquals(String.valueOf(Numberx.scale(0.2449, 2, RoundingMode.UP)), String.valueOf(0.25f));

        Assert.assertEquals(String.valueOf(Numberx.scale(0.2589f, 1)), String.valueOf(0.3f));
        Assert.assertEquals(String.valueOf(Numberx.scale(0.2449f, 1)), String.valueOf(0.2f));

        Assert.assertEquals(String.valueOf(Numberx.scale(0.2589f, 1, RoundingMode.UP)), String.valueOf(0.3f));
        Assert.assertEquals(String.valueOf(Numberx.scale(0.2449f, 1, RoundingMode.UP)), String.valueOf(0.3f));

        Assert.assertEquals(String.valueOf(Numberx.scale(0.2489, 0)), String.valueOf(0f));
        Assert.assertEquals(String.valueOf(Numberx.scale(0.2449, 0)), String.valueOf(0f));
    }

    @Test
    public void testPad() {
        Assert.assertEquals(Numberx.pad(10, 5), "00010");
        Assert.assertEquals(Numberx.pad(10L, 5), "00010");
    }

    @Test
    public void testRange() {
        Assert.assertEquals(Collectionx.count(Numberx.rangeTo(1, 10)), 10);
        Assert.assertEquals(Collectionx.count(Numberx.rangeTo(1, 1)), 1);
        Assert.assertEquals(Collectionx.count(Numberx.rangeTo(0, 1)), 2);
        Assert.assertEquals(Collectionx.count(Numberx.rangeTo(1, 0)), 0);
    }

    @Test
    public void testUnit() {
        Assert.assertEquals(Collectionx.count(Numberx.untilTo(1, 10)), 9);
        Assert.assertEquals(Collectionx.count(Numberx.untilTo(1, 1)), 0);
        Assert.assertEquals(Collectionx.count(Numberx.untilTo(1, 0)), 0);
        Assert.assertEquals(Collectionx.count(Numberx.untilTo(0, 1)), 1);
    }

    @Test
    public void testDownTo() {
        Assert.assertEquals(Collectionx.count(Numberx.downTo(10, 1)), 10);
        Assert.assertEquals(Collectionx.count(Numberx.downTo(1, 1)), 1);
        Assert.assertEquals(Collectionx.count(Numberx.downTo(0, 1)), 0);
        Assert.assertEquals(Collectionx.count(Numberx.downTo(1, 0)), 2);
    }

    @Test
    public void testDownUntilTo() {
        Assert.assertEquals(Collectionx.count(Numberx.downUntilTo(10, 1)), 9);
        Assert.assertEquals(Collectionx.count(Numberx.downUntilTo(1, 1)), 0);
        Assert.assertEquals(Collectionx.count(Numberx.downUntilTo(0, 1)), 0);
        Assert.assertEquals(Collectionx.count(Numberx.downUntilTo(1, 0)), 1);
    }

    @Test
    public void testToByte() {
        Assert.assertEquals(String.valueOf(Numberx.toByteOrDefault("5", (byte) 4)), String.valueOf(5));
        Assert.assertEquals(String.valueOf(Numberx.toByteOrDefault("g", (byte) 4)), String.valueOf(4));
        Assert.assertEquals(String.valueOf(Numberx.toByteOrZero("g")), String.valueOf(0));
    }

    @Test
    public void testToShort() {
        Assert.assertEquals(String.valueOf(Numberx.toShortOrDefault("5", (short) 4)), String.valueOf(5));
        Assert.assertEquals(String.valueOf(Numberx.toShortOrDefault("g", (short) 4)), String.valueOf(4));
        Assert.assertEquals(String.valueOf(Numberx.toShortOrZero("g")), String.valueOf(0));
    }

    @Test
    public void testToInt() {
        Assert.assertEquals(String.valueOf(Numberx.toIntOrDefault("5", 4)), String.valueOf(5));
        Assert.assertEquals(String.valueOf(Numberx.toIntOrDefault("g", 4)), String.valueOf(4));
        Assert.assertEquals(String.valueOf(Numberx.toIntOrZero("g")), String.valueOf(0));
    }

    @Test
    public void testToLong() {
        Assert.assertEquals(String.valueOf(Numberx.toLongOrDefault("5", 4)), String.valueOf(5));
        Assert.assertEquals(String.valueOf(Numberx.toLongOrDefault("g", 4)), String.valueOf(4));
        Assert.assertEquals(String.valueOf(Numberx.toLongOrZero("g")), String.valueOf(0));
    }

    @Test
    public void testToFloat() {
        Assert.assertEquals(String.valueOf(Numberx.toFloatOrDefault("5.5", 4.5f)), String.valueOf(5.5f));
        Assert.assertEquals(String.valueOf(Numberx.toFloatOrDefault("g", 4.4f)), String.valueOf(4.4f));
        Assert.assertEquals(String.valueOf(Numberx.toFloatOrZero("g")), String.valueOf(0.0f));
    }

    @Test
    public void testToDouble() {
        Assert.assertEquals(String.valueOf(Numberx.toDoubleOrDefault("5.5", 4.4d)), String.valueOf(5.5d));
        Assert.assertEquals(String.valueOf(Numberx.toDoubleOrDefault("g", 4.4d)), String.valueOf(4.4d));
        Assert.assertEquals(String.valueOf(Numberx.toDoubleOrZero("g")), String.valueOf(0.0d));
    }
}
