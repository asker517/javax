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

package me.panpf.javax.test.util;

import me.panpf.javax.util.Collectionx;
import me.panpf.javax.util.Datex;
import me.panpf.javax.util.Rangex;
import me.panpf.javax.util.Transformer;
import org.jetbrains.annotations.NotNull;
import org.junit.Assert;
import org.junit.Test;

import java.text.ParseException;
import java.util.Date;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public final class RangexTest {

    @Test
    public void testIn() {
        assertTrue(Rangex.in((byte) 9, (byte) 3, (byte) 10));
        assertFalse(Rangex.in((byte) 2, (byte) 3, (byte) 10));
        assertFalse(Rangex.in((byte) 11, (byte) 3, (byte) 10));

        assertTrue(Rangex.in((short) 9, (short) 3, (short) 10));
        assertFalse(Rangex.in((short) 2, (short) 3, (short) 10));
        assertFalse(Rangex.in((short) 11, (short) 3, (short) 10));

        assertTrue(Rangex.in(9, 3, 10));
        assertFalse(Rangex.in(2, 3, 10));
        assertFalse(Rangex.in(11, 3, 10));

        assertTrue(Rangex.in(9L, 3L, 10L));
        assertFalse(Rangex.in(2L, 3L, 10L));
        assertFalse(Rangex.in(11L, 3L, 10L));

        assertTrue(Rangex.in(9F, 3F, 10F));
        assertFalse(Rangex.in(2F, 3F, 10F));
        assertFalse(Rangex.in(11F, 3F, 10F));

        assertTrue(Rangex.in(9.0, 3.0, 10.0));
        assertFalse(Rangex.in(2.0, 3.0, 10.0));
        assertFalse(Rangex.in(11.0, 3.0, 10.0));
    }

    @Test
    public void testNotIn() {
        assertFalse(Rangex.notIn((byte) 9, (byte) 3, (byte) 10));
        assertTrue(Rangex.notIn((byte) 2, (byte) 3, (byte) 10));
        assertTrue(Rangex.notIn((byte) 11, (byte) 3, (byte) 10));

        assertFalse(Rangex.notIn((short) 9, (short) 3, (short) 10));
        assertTrue(Rangex.notIn((short) 2, (short) 3, (short) 10));
        assertTrue(Rangex.notIn((short) 11, (short) 3, (short) 10));

        assertFalse(Rangex.notIn(9, 3, 10));
        assertTrue(Rangex.notIn(2, 3, 10));
        assertTrue(Rangex.notIn(11, 3, 10));

        assertFalse(Rangex.notIn(9L, 3L, 10L));
        assertTrue(Rangex.notIn(2L, 3L, 10L));
        assertTrue(Rangex.notIn(11L, 3L, 10L));

        assertFalse(Rangex.notIn(9F, 3F, 10F));
        assertTrue(Rangex.notIn(2F, 3F, 10F));
        assertTrue(Rangex.notIn(11F, 3F, 10F));

        assertFalse(Rangex.notIn(9.0, 3.0, 10.0));
        assertTrue(Rangex.notIn(2.0, 3.0, 10.0));
        assertTrue(Rangex.notIn(11.0, 3.0, 10.0));
    }

    @Test
    public void testByteRange() {
        Assert.assertEquals(Collectionx.count(Rangex.rangeTo((byte) 1, (byte) 10)), 10);
        Assert.assertEquals(Collectionx.count(Rangex.rangeTo((byte) 1, (byte) 1)), 1);
        Assert.assertEquals(Collectionx.count(Rangex.rangeTo((byte) 0, (byte) 1)), 2);
        Assert.assertEquals(Collectionx.count(Rangex.rangeTo((byte) 1, (byte) 0)), 0);

        Assert.assertEquals(Collectionx.count(Rangex.until((byte) 1, (byte) 10)), 9);
        Assert.assertEquals(Collectionx.count(Rangex.until((byte) 1, (byte) 1)), 0);
        Assert.assertEquals(Collectionx.count(Rangex.until((byte) 1, (byte) 0)), 0);
        Assert.assertEquals(Collectionx.count(Rangex.until((byte) 0, (byte) 1)), 1);

        Assert.assertEquals(Collectionx.count(Rangex.downTo((byte) 10, (byte) 1)), 10);
        Assert.assertEquals(Collectionx.count(Rangex.downTo((byte) 1, (byte) 1)), 1);
        Assert.assertEquals(Collectionx.count(Rangex.downTo((byte) 0, (byte) 1)), 0);
        Assert.assertEquals(Collectionx.count(Rangex.downTo((byte) 1, (byte) 0)), 2);

        Assert.assertEquals(Collectionx.count(Rangex.downUntilTo((byte) 10, (byte) 1)), 9);
        Assert.assertEquals(Collectionx.count(Rangex.downUntilTo((byte) 1, (byte) 1)), 0);
        Assert.assertEquals(Collectionx.count(Rangex.downUntilTo((byte) 0, (byte) 1)), 0);
        Assert.assertEquals(Collectionx.count(Rangex.downUntilTo((byte) 1, (byte) 0)), 1);

        Assert.assertEquals(Collectionx.count(Rangex.rangeTo((byte) 1, (byte) 10, (byte) 4)), 3);
        Assert.assertEquals(Collectionx.count(Rangex.rangeTo((byte) 10, (byte) 1, (byte) -4)), 3);
    }

    @Test
    public void testShortRange() {
        Assert.assertEquals(Collectionx.count(Rangex.rangeTo((short) 1, (short) 10)), 10);
        Assert.assertEquals(Collectionx.count(Rangex.rangeTo((short) 1, (short) 1)), 1);
        Assert.assertEquals(Collectionx.count(Rangex.rangeTo((short) 0, (short) 1)), 2);
        Assert.assertEquals(Collectionx.count(Rangex.rangeTo((short) 1, (short) 0)), 0);

        Assert.assertEquals(Collectionx.count(Rangex.until((short) 1, (short) 10)), 9);
        Assert.assertEquals(Collectionx.count(Rangex.until((short) 1, (short) 1)), 0);
        Assert.assertEquals(Collectionx.count(Rangex.until((short) 1, (short) 0)), 0);
        Assert.assertEquals(Collectionx.count(Rangex.until((short) 0, (short) 1)), 1);

        Assert.assertEquals(Collectionx.count(Rangex.downTo((short) 10, (short) 1)), 10);
        Assert.assertEquals(Collectionx.count(Rangex.downTo((short) 1, (short) 1)), 1);
        Assert.assertEquals(Collectionx.count(Rangex.downTo((short) 0, (short) 1)), 0);
        Assert.assertEquals(Collectionx.count(Rangex.downTo((short) 1, (short) 0)), 2);

        Assert.assertEquals(Collectionx.count(Rangex.downUntilTo((short) 10, (short) 1)), 9);
        Assert.assertEquals(Collectionx.count(Rangex.downUntilTo((short) 1, (short) 1)), 0);
        Assert.assertEquals(Collectionx.count(Rangex.downUntilTo((short) 0, (short) 1)), 0);
        Assert.assertEquals(Collectionx.count(Rangex.downUntilTo((short) 1, (byte) 0)), 1);

        Assert.assertEquals(Collectionx.count(Rangex.rangeTo((short) 1, (short) 10, (short) 4)), 3);
        Assert.assertEquals(Collectionx.count(Rangex.rangeTo((short) 10, (short) 1, (short) -4)), 3);
    }

    @Test
    public void testIntRange() {
        Assert.assertEquals(Collectionx.count(Rangex.rangeTo(1, 10)), 10);
        Assert.assertEquals(Collectionx.count(Rangex.rangeTo(1, 1)), 1);
        Assert.assertEquals(Collectionx.count(Rangex.rangeTo(0, 1)), 2);
        Assert.assertEquals(Collectionx.count(Rangex.rangeTo(1, 0)), 0);

        Assert.assertEquals(Collectionx.count(Rangex.until(1, 10)), 9);
        Assert.assertEquals(Collectionx.count(Rangex.until(1, 1)), 0);
        Assert.assertEquals(Collectionx.count(Rangex.until(1, 0)), 0);
        Assert.assertEquals(Collectionx.count(Rangex.until(0, 1)), 1);

        Assert.assertEquals(Collectionx.count(Rangex.downTo(10, 1)), 10);
        Assert.assertEquals(Collectionx.count(Rangex.downTo(1, 1)), 1);
        Assert.assertEquals(Collectionx.count(Rangex.downTo(0, 1)), 0);
        Assert.assertEquals(Collectionx.count(Rangex.downTo(1, 0)), 2);

        Assert.assertEquals(Collectionx.count(Rangex.downUntilTo(10, 1)), 9);
        Assert.assertEquals(Collectionx.count(Rangex.downUntilTo(1, 1)), 0);
        Assert.assertEquals(Collectionx.count(Rangex.downUntilTo(0, 1)), 0);
        Assert.assertEquals(Collectionx.count(Rangex.downUntilTo(1, 0)), 1);

        Assert.assertEquals(Collectionx.count(Rangex.rangeTo(1, 10, 4)), 3);
        Assert.assertEquals(Collectionx.count(Rangex.rangeTo(10, 1, -4)), 3);
    }

    @Test
    public void testLongRange() {
        Assert.assertEquals(Collectionx.count(Rangex.rangeTo(1L, 10L)), 10);
        Assert.assertEquals(Collectionx.count(Rangex.rangeTo(1L, 1L)), 1);
        Assert.assertEquals(Collectionx.count(Rangex.rangeTo(0L, 1L)), 2);
        Assert.assertEquals(Collectionx.count(Rangex.rangeTo(1L, 0L)), 0);

        Assert.assertEquals(Collectionx.count(Rangex.until(1L, 10L)), 9);
        Assert.assertEquals(Collectionx.count(Rangex.until(1L, 1L)), 0);
        Assert.assertEquals(Collectionx.count(Rangex.until(1L, 0L)), 0);
        Assert.assertEquals(Collectionx.count(Rangex.until(0L, 1L)), 1);

        Assert.assertEquals(Collectionx.count(Rangex.downTo(10L, 1L)), 10);
        Assert.assertEquals(Collectionx.count(Rangex.downTo(1L, 1L)), 1);
        Assert.assertEquals(Collectionx.count(Rangex.downTo(0L, 1L)), 0);
        Assert.assertEquals(Collectionx.count(Rangex.downTo(1L, 0L)), 2);

        Assert.assertEquals(Collectionx.count(Rangex.downUntilTo(10L, 1L)), 9);
        Assert.assertEquals(Collectionx.count(Rangex.downUntilTo(1L, 1L)), 0);
        Assert.assertEquals(Collectionx.count(Rangex.downUntilTo(0L, 1L)), 0);
        Assert.assertEquals(Collectionx.count(Rangex.downUntilTo(1L, 0L)), 1);

        Assert.assertEquals(Collectionx.count(Rangex.rangeTo(1L, 10L, 4)), 3);
        Assert.assertEquals(Collectionx.count(Rangex.rangeTo(10L, 1L, -4)), 3);
    }

    @Test
    public void tesFloatRange() {
        Assert.assertEquals(Collectionx.count(Rangex.rangeTo(1F, 10F)), 10);
        Assert.assertEquals(Collectionx.count(Rangex.rangeTo(1F, 1F)), 1);
        Assert.assertEquals(Collectionx.count(Rangex.rangeTo(0F, 1F)), 2);
        Assert.assertEquals(Collectionx.count(Rangex.rangeTo(1F, 0F)), 0);

        Assert.assertEquals(Collectionx.count(Rangex.until(1F, 10F)), 9);
        Assert.assertEquals(Collectionx.count(Rangex.until(1F, 1F)), 0);
        Assert.assertEquals(Collectionx.count(Rangex.until(1F, 0F)), 0);
        Assert.assertEquals(Collectionx.count(Rangex.until(0F, 1F)), 1);

        Assert.assertEquals(Collectionx.count(Rangex.downTo(10F, 1F)), 10);
        Assert.assertEquals(Collectionx.count(Rangex.downTo(1F, 1F)), 1);
        Assert.assertEquals(Collectionx.count(Rangex.downTo(0F, 1F)), 0);
        Assert.assertEquals(Collectionx.count(Rangex.downTo(1F, 0F)), 2);

        Assert.assertEquals(Collectionx.count(Rangex.downUntilTo(10F, 1F)), 9);
        Assert.assertEquals(Collectionx.count(Rangex.downUntilTo(1F, 1F)), 0);
        Assert.assertEquals(Collectionx.count(Rangex.downUntilTo(0F, 1F)), 0);
        Assert.assertEquals(Collectionx.count(Rangex.downUntilTo(1F, 0F)), 1);

        Assert.assertEquals(Collectionx.count(Rangex.rangeTo(1F, 10F, 1.3f)), 8);
        Assert.assertEquals(Collectionx.count(Rangex.rangeTo(10F, 1F, -1.3f)), 8);
    }

    @Test
    public void tesDoubleRange() {
        Assert.assertEquals(Collectionx.count(Rangex.rangeTo(1.0, 10.0)), 10);
        Assert.assertEquals(Collectionx.count(Rangex.rangeTo(1.0, 1.0)), 1);
        Assert.assertEquals(Collectionx.count(Rangex.rangeTo(0.0, 1.0)), 2);
        Assert.assertEquals(Collectionx.count(Rangex.rangeTo(1.0, 0.0)), 0);

        Assert.assertEquals(Collectionx.count(Rangex.until(1.0, 10.0)), 9);
        Assert.assertEquals(Collectionx.count(Rangex.until(1.0, 1.0)), 0);
        Assert.assertEquals(Collectionx.count(Rangex.until(1.0, 0.0)), 0);
        Assert.assertEquals(Collectionx.count(Rangex.until(0.0, 1.0)), 1);

        Assert.assertEquals(Collectionx.count(Rangex.downTo(10.0, 1.0)), 10);
        Assert.assertEquals(Collectionx.count(Rangex.downTo(1.0, 1.0)), 1);
        Assert.assertEquals(Collectionx.count(Rangex.downTo(0.0, 1.0)), 0);
        Assert.assertEquals(Collectionx.count(Rangex.downTo(1.0, 0.0)), 2);

        Assert.assertEquals(Collectionx.count(Rangex.downUntilTo(10.0, 1.0)), 9);
        Assert.assertEquals(Collectionx.count(Rangex.downUntilTo(1.0, 1.0)), 0);
        Assert.assertEquals(Collectionx.count(Rangex.downUntilTo(0.0, 1.0)), 0);
        Assert.assertEquals(Collectionx.count(Rangex.downUntilTo(1.0, 0.0)), 1);

        Assert.assertEquals(Collectionx.count(Rangex.rangeTo(1.0, 10.0, 1.3)), 8);
        Assert.assertEquals(Collectionx.count(Rangex.rangeTo(10.0, 1.0, -1.3)), 8);
    }

    @Test
    public void testCharRange() {
        Assert.assertEquals(Collectionx.count(Rangex.rangeTo((char) 1, (char) 10)), 10);
        Assert.assertEquals(Collectionx.count(Rangex.rangeTo((char) 1, (char) 1)), 1);
        Assert.assertEquals(Collectionx.count(Rangex.rangeTo((char) 0, (char) 1)), 2);
        Assert.assertEquals(Collectionx.count(Rangex.rangeTo((char) 1, (char) 0)), 0);

        Assert.assertEquals(Collectionx.count(Rangex.until((char) 1, (char) 10)), 9);
        Assert.assertEquals(Collectionx.count(Rangex.until((char) 1, (char) 1)), 0);
        Assert.assertEquals(Collectionx.count(Rangex.until((char) 1, (char) 0)), 0);
        Assert.assertEquals(Collectionx.count(Rangex.until((char) 0, (char) 1)), 1);

        Assert.assertEquals(Collectionx.count(Rangex.downTo((char) 10, (char) 1)), 10);
        Assert.assertEquals(Collectionx.count(Rangex.downTo((char) 1, (char) 1)), 1);
        Assert.assertEquals(Collectionx.count(Rangex.downTo((char) 0, (char) 1)), 0);
        Assert.assertEquals(Collectionx.count(Rangex.downTo((char) 1, (char) 0)), 2);

        Assert.assertEquals(Collectionx.count(Rangex.downUntilTo((char) 10, (char) 1)), 9);
        Assert.assertEquals(Collectionx.count(Rangex.downUntilTo((char) 1, (char) 1)), 0);
        Assert.assertEquals(Collectionx.count(Rangex.downUntilTo((char) 0, (char) 1)), 0);
        Assert.assertEquals(Collectionx.count(Rangex.downUntilTo((char) 1, (char) 0)), 1);

        Assert.assertEquals(Collectionx.count(Rangex.rangeTo((char) 1, (char) 10, 4)), 3);
        Assert.assertEquals(Collectionx.count(Rangex.rangeTo((char) 10, (char) 1, -4)), 3);
    }

    @Test
    public final void testYearIterator() throws ParseException {
        Transformer<Date, CharSequence> transformer = new Transformer<Date, CharSequence>() {
            @NotNull
            @Override
            public CharSequence transform(@NotNull Date date) {
                return Datex.formatY(date, null);
            }
        };

        Assert.assertEquals(Collectionx.joinToString(Rangex.yearYRangeTo("2018", "2021"), transformer), "2018, 2019, 2020, 2021");
        Assert.assertEquals(Collectionx.joinToString(Rangex.yearYUntil("2018", "2022"), transformer), "2018, 2019, 2020, 2021");
        Assert.assertEquals(Collectionx.joinToString(Rangex.yearYDownTo("2018", "2015"), transformer), "2018, 2017, 2016, 2015");
        Assert.assertEquals(Collectionx.joinToString(Rangex.yearYDownUntilTo("2018", "2014"), transformer), "2018, 2017, 2016, 2015");

        Assert.assertEquals(Collectionx.joinToString(Rangex.yearRangeTo(Datex.toDateY("2018", null), Datex.toDateY("2015", null)), transformer), "");
        Assert.assertEquals(Collectionx.joinToString(Rangex.yearUntil(Datex.toDateY("2018", null), Datex.toDateY("2015", null)), transformer), "");
        Assert.assertEquals(Collectionx.joinToString(Rangex.yearDownTo(Datex.toDateY("2018", null), Datex.toDateY("2021", null)), transformer), "");
        Assert.assertEquals(Collectionx.joinToString(Rangex.yearDownUntilTo(Datex.toDateY("2018", null), Datex.toDateY("2021", null)), transformer), "");

        Assert.assertEquals(Collectionx.joinToString(Rangex.yearRangeTo(Datex.toMillisecondY("2018", null), Datex.toMillisecondY("2015", null)), transformer), "");
        Assert.assertEquals(Collectionx.joinToString(Rangex.yearUntil(Datex.toMillisecondY("2018", null), Datex.toMillisecondY("2015", null)), transformer), "");
        Assert.assertEquals(Collectionx.joinToString(Rangex.yearDownTo(Datex.toMillisecondY("2018", null), Datex.toMillisecondY("2021", null)), transformer), "");
        Assert.assertEquals(Collectionx.joinToString(Rangex.yearDownUntilTo(Datex.toMillisecondY("2018", null), Datex.toMillisecondY("2021", null)), transformer), "");

        Assert.assertEquals(Collectionx.joinToString(Rangex.yearYRangeTo("2018", "2031", 5), transformer), "2018, 2023, 2028");
        Assert.assertEquals(Collectionx.joinToString(Rangex.yearYRangeTo("2031", "2018", -5), transformer), "2031, 2026, 2021");
    }

    @Test
    public final void testMonthIterator() throws ParseException {
        Transformer<Date, CharSequence> transformer = new Transformer<Date, CharSequence>() {
            @NotNull
            @Override
            public CharSequence transform(@NotNull Date date) {
                return Datex.formatYM(date, null);
            }
        };

        Assert.assertEquals(Collectionx.joinToString(Rangex.monthYMRangeTo("2018-08", "2018-11"), transformer), "2018-08, 2018-09, 2018-10, 2018-11");
        Assert.assertEquals(Collectionx.joinToString(Rangex.monthYMUntil("2018-08", "2018-12"), transformer), "2018-08, 2018-09, 2018-10, 2018-11");
        Assert.assertEquals(Collectionx.joinToString(Rangex.monthYMDownTo("2018-08", "2018-05"), transformer), "2018-08, 2018-07, 2018-06, 2018-05");
        Assert.assertEquals(Collectionx.joinToString(Rangex.monthYMDownUntilTo("2018-08", "2018-04"), transformer), "2018-08, 2018-07, 2018-06, 2018-05");

        Assert.assertEquals(Collectionx.joinToString(Rangex.monthRangeTo(Datex.toDateYM("2018-08", null), Datex.toDateYM("2018-05", null)), transformer), "");
        Assert.assertEquals(Collectionx.joinToString(Rangex.monthUntil(Datex.toDateYM("2018-08", null), Datex.toDateYM("2018-05", null)), transformer), "");
        Assert.assertEquals(Collectionx.joinToString(Rangex.monthDownTo(Datex.toDateYM("2018-08", null), Datex.toDateYM("2018-11", null)), transformer), "");
        Assert.assertEquals(Collectionx.joinToString(Rangex.monthDownUntilTo(Datex.toDateYM("2018-08", null), Datex.toDateYM("2018-11", null)), transformer), "");

        Assert.assertEquals(Collectionx.joinToString(Rangex.monthRangeTo(Datex.toMillisecondYM("2018-08", null), Datex.toMillisecondYM("2018-05", null)), transformer), "");
        Assert.assertEquals(Collectionx.joinToString(Rangex.monthUntil(Datex.toMillisecondYM("2018-08", null), Datex.toMillisecondYM("2018-05", null)), transformer), "");
        Assert.assertEquals(Collectionx.joinToString(Rangex.monthDownTo(Datex.toMillisecondYM("2018-08", null), Datex.toMillisecondYM("2018-11", null)), transformer), "");
        Assert.assertEquals(Collectionx.joinToString(Rangex.monthDownUntilTo(Datex.toMillisecondYM("2018-08", null), Datex.toMillisecondYM("2018-11", null)), transformer), "");
    }

    @Test
    public final void testDayIterator() throws ParseException {
        Transformer<Date, CharSequence> transformer = new Transformer<Date, CharSequence>() {
            @NotNull
            @Override
            public CharSequence transform(@NotNull Date date) {
                return Datex.formatYMD(date, null);
            }
        };

        Assert.assertEquals(Collectionx.joinToString(Rangex.dayYMDRangeTo("2018-08-06", "2018-08-09"), transformer), "2018-08-06, 2018-08-07, 2018-08-08, 2018-08-09");
        Assert.assertEquals(Collectionx.joinToString(Rangex.dayYMDUntil("2018-08-06", "2018-08-10"), transformer), "2018-08-06, 2018-08-07, 2018-08-08, 2018-08-09");
        Assert.assertEquals(Collectionx.joinToString(Rangex.dayYMDDownTo("2018-08-06", "2018-08-03"), transformer), "2018-08-06, 2018-08-05, 2018-08-04, 2018-08-03");
        Assert.assertEquals(Collectionx.joinToString(Rangex.dayYMDDownUntilTo("2018-08-06", "2018-08-02"), transformer), "2018-08-06, 2018-08-05, 2018-08-04, 2018-08-03");

        Assert.assertEquals(Collectionx.joinToString(Rangex.dayRangeTo(Datex.toDateYMD("2018-08-06", null), Datex.toDateYMD("2018-08-03", null)), transformer), "");
        Assert.assertEquals(Collectionx.joinToString(Rangex.dayUntil(Datex.toDateYMD("2018-08-06", null), Datex.toDateYMD("2018-08-02", null)), transformer), "");
        Assert.assertEquals(Collectionx.joinToString(Rangex.dayDownTo(Datex.toDateYMD("2018-08-06", null), Datex.toDateYMD("2018-08-09", null)), transformer), "");
        Assert.assertEquals(Collectionx.joinToString(Rangex.dayDownUntilTo(Datex.toDateYMD("2018-08-06", null), Datex.toDateYMD("2018-08-010", null)), transformer), "");

        Assert.assertEquals(Collectionx.joinToString(Rangex.dayRangeTo(Datex.toMillisecondYMD("2018-08-06", null), Datex.toMillisecondYMD("2018-08-03", null)), transformer), "");
        Assert.assertEquals(Collectionx.joinToString(Rangex.dayUntil(Datex.toMillisecondYMD("2018-08-06", null), Datex.toMillisecondYMD("2018-08-02", null)), transformer), "");
        Assert.assertEquals(Collectionx.joinToString(Rangex.dayDownTo(Datex.toMillisecondYMD("2018-08-06", null), Datex.toMillisecondYMD("2018-08-09", null)), transformer), "");
        Assert.assertEquals(Collectionx.joinToString(Rangex.dayDownUntilTo(Datex.toMillisecondYMD("2018-08-06", null), Datex.toMillisecondYMD("2018-08-010", null)), transformer), "");
    }

    @Test
    public final void testHourIterator() throws ParseException {
        Transformer<Date, CharSequence> transformer = new Transformer<Date, CharSequence>() {
            @NotNull
            @Override
            public CharSequence transform(@NotNull Date date) { return Datex.formatYMDH(date, null);
            }
        };

        Assert.assertEquals(Collectionx.joinToString(Rangex.hourYMDHRangeTo("2018-08-06 18", "2018-08-06 21"), transformer), "2018-08-06 18, 2018-08-06 19, 2018-08-06 20, 2018-08-06 21");
        Assert.assertEquals(Collectionx.joinToString(Rangex.hourYMDHUntil("2018-08-06 18", "2018-08-06 22"), transformer), "2018-08-06 18, 2018-08-06 19, 2018-08-06 20, 2018-08-06 21");
        Assert.assertEquals(Collectionx.joinToString(Rangex.hourYMDHDownTo("2018-08-06 18", "2018-08-06 15"), transformer), "2018-08-06 18, 2018-08-06 17, 2018-08-06 16, 2018-08-06 15");
        Assert.assertEquals(Collectionx.joinToString(Rangex.hourYMDHDownUntilTo("2018-08-06 18", "2018-08-06 14"), transformer), "2018-08-06 18, 2018-08-06 17, 2018-08-06 16, 2018-08-06 15");

        Assert.assertEquals(Collectionx.joinToString(Rangex.hourRangeTo(Datex.toDateYMDH("2018-08-06 18", null), Datex.toDateYMDH("2018-08-06 15", null)), transformer), "");
        Assert.assertEquals(Collectionx.joinToString(Rangex.hourUntil(Datex.toDateYMDH("2018-08-06 18", null), Datex.toDateYMDH("2018-08-06 14", null)), transformer), "");
        Assert.assertEquals(Collectionx.joinToString(Rangex.hourDownTo(Datex.toDateYMDH("2018-08-06 18", null), Datex.toDateYMDH("2018-08-06 21", null)), transformer), "");
        Assert.assertEquals(Collectionx.joinToString(Rangex.hourDownUntilTo(Datex.toDateYMDH("2018-08-06 18", null), Datex.toDateYMDH("2018-08-06 22", null)), transformer), "");

        Assert.assertEquals(Collectionx.joinToString(Rangex.hourRangeTo(Datex.toMillisecondYMDH("2018-08-06 18", null), Datex.toMillisecondYMDH("2018-08-06 15", null)), transformer), "");
        Assert.assertEquals(Collectionx.joinToString(Rangex.hourUntil(Datex.toMillisecondYMDH("2018-08-06 18", null), Datex.toMillisecondYMDH("2018-08-06 14", null)), transformer), "");
        Assert.assertEquals(Collectionx.joinToString(Rangex.hourDownTo(Datex.toMillisecondYMDH("2018-08-06 18", null), Datex.toMillisecondYMDH("2018-08-06 21", null)), transformer), "");
        Assert.assertEquals(Collectionx.joinToString(Rangex.hourDownUntilTo(Datex.toMillisecondYMDH("2018-08-06 18", null), Datex.toMillisecondYMDH("2018-08-06 22", null)), transformer), "");
    }

    @Test
    public final void testMinuteIterator() throws ParseException {
        Transformer<Date, CharSequence> transformer = new Transformer<Date, CharSequence>() {
            @NotNull
            @Override
            public CharSequence transform(@NotNull Date date) {
                return Datex.formatYMDHM(date, null);
            }
        };

        Assert.assertEquals(Collectionx.joinToString(Rangex.minuteYMDHMRangeTo("2018-08-06 18:22", "2018-08-06 18:25"), transformer), "2018-08-06 18:22, 2018-08-06 18:23, 2018-08-06 18:24, 2018-08-06 18:25");
        Assert.assertEquals(Collectionx.joinToString(Rangex.minuteYMDHMUntil("2018-08-06 18:22", "2018-08-06 18:26"), transformer), "2018-08-06 18:22, 2018-08-06 18:23, 2018-08-06 18:24, 2018-08-06 18:25");
        Assert.assertEquals(Collectionx.joinToString(Rangex.minuteYMDHMDownTo("2018-08-06 18:22", "2018-08-06 18:19"), transformer), "2018-08-06 18:22, 2018-08-06 18:21, 2018-08-06 18:20, 2018-08-06 18:19");
        Assert.assertEquals(Collectionx.joinToString(Rangex.minuteYMDHMDownUntilTo("2018-08-06 18:22", "2018-08-06 18:18"), transformer), "2018-08-06 18:22, 2018-08-06 18:21, 2018-08-06 18:20, 2018-08-06 18:19");

        Assert.assertEquals(Collectionx.joinToString(Rangex.minuteRangeTo(Datex.toDateYMDHM("2018-08-06 18:22", null), Datex.toDateYMDHM("2018-08-06 18:19", null)), transformer), "");
        Assert.assertEquals(Collectionx.joinToString(Rangex.minuteUntil(Datex.toDateYMDHM("2018-08-06 18:22", null), Datex.toDateYMDHM("2018-08-06 18:18", null)), transformer), "");
        Assert.assertEquals(Collectionx.joinToString(Rangex.minuteDownTo(Datex.toDateYMDHM("2018-08-06 18:22", null), Datex.toDateYMDHM("2018-08-06 18:25", null)), transformer), "");
        Assert.assertEquals(Collectionx.joinToString(Rangex.minuteDownUntilTo(Datex.toDateYMDHM("2018-08-06 18:22", null), Datex.toDateYMDHM("2018-08-06 18:25", null)), transformer), "");

        Assert.assertEquals(Collectionx.joinToString(Rangex.minuteRangeTo(Datex.toMillisecondYMDHM("2018-08-06 18:22", null), Datex.toMillisecondYMDHM("2018-08-06 18:19", null)), transformer), "");
        Assert.assertEquals(Collectionx.joinToString(Rangex.minuteUntil(Datex.toMillisecondYMDHM("2018-08-06 18:22", null), Datex.toMillisecondYMDHM("2018-08-06 18:18", null)), transformer), "");
        Assert.assertEquals(Collectionx.joinToString(Rangex.minuteDownTo(Datex.toMillisecondYMDHM("2018-08-06 18:22", null), Datex.toMillisecondYMDHM("2018-08-06 18:25", null)), transformer), "");
        Assert.assertEquals(Collectionx.joinToString(Rangex.minuteDownUntilTo(Datex.toMillisecondYMDHM("2018-08-06 18:22", null), Datex.toMillisecondYMDHM("2018-08-06 18:25", null)), transformer), "");
    }

    @Test
    public final void testSecondIterator() throws ParseException {
        Transformer<Date, CharSequence> transformer = new Transformer<Date, CharSequence>() {
            @NotNull
            @Override
            public CharSequence transform(@NotNull Date date) {
                return Datex.formatYMDHMS(date, null);
            }
        };

        Assert.assertEquals(Collectionx.joinToString(Rangex.secondYMDHMSRangeTo("2018-08-06 18:22:15", "2018-08-06 18:22:18"), transformer), "2018-08-06 18:22:15, 2018-08-06 18:22:16, 2018-08-06 18:22:17, 2018-08-06 18:22:18");
        Assert.assertEquals(Collectionx.joinToString(Rangex.secondYMDHMSUntil("2018-08-06 18:22:15", "2018-08-06 18:22:19"), transformer), "2018-08-06 18:22:15, 2018-08-06 18:22:16, 2018-08-06 18:22:17, 2018-08-06 18:22:18");
        Assert.assertEquals(Collectionx.joinToString(Rangex.secondYMDHMSDownTo("2018-08-06 18:22:15", "2018-08-06 18:22:12"), transformer), "2018-08-06 18:22:15, 2018-08-06 18:22:14, 2018-08-06 18:22:13, 2018-08-06 18:22:12");
        Assert.assertEquals(Collectionx.joinToString(Rangex.secondYMDHMSDownUntilTo("2018-08-06 18:22:15", "2018-08-06 18:22:11"), transformer), "2018-08-06 18:22:15, 2018-08-06 18:22:14, 2018-08-06 18:22:13, 2018-08-06 18:22:12");

        Assert.assertEquals(Collectionx.joinToString(Rangex.secondRangeTo(Datex.toDateYMDHMS("2018-08-06 18:22:15", null), Datex.toDateYMDHMS("2018-08-06 18:22:12", null)), transformer), "");
        Assert.assertEquals(Collectionx.joinToString(Rangex.secondUntil(Datex.toDateYMDHMS("2018-08-06 18:22:15", null), Datex.toDateYMDHMS("2018-08-06 18:22:11", null)), transformer), "");
        Assert.assertEquals(Collectionx.joinToString(Rangex.secondDownTo(Datex.toDateYMDHMS("2018-08-06 18:22:15", null), Datex.toDateYMDHMS("2018-08-06 18:22:18", null)), transformer), "");
        Assert.assertEquals(Collectionx.joinToString(Rangex.secondDownUntilTo(Datex.toDateYMDHMS("2018-08-06 18:22:15", null), Datex.toDateYMDHMS("2018-08-06 18:22:19", null)), transformer), "");

        Assert.assertEquals(Collectionx.joinToString(Rangex.secondRangeTo(Datex.toMillisecondYMDHMS("2018-08-06 18:22:15", null), Datex.toMillisecondYMDHMS("2018-08-06 18:22:12", null)), transformer), "");
        Assert.assertEquals(Collectionx.joinToString(Rangex.secondUntil(Datex.toMillisecondYMDHMS("2018-08-06 18:22:15", null), Datex.toMillisecondYMDHMS("2018-08-06 18:22:11", null)), transformer), "");
        Assert.assertEquals(Collectionx.joinToString(Rangex.secondDownTo(Datex.toMillisecondYMDHMS("2018-08-06 18:22:15", null), Datex.toMillisecondYMDHMS("2018-08-06 18:22:18", null)), transformer), "");
        Assert.assertEquals(Collectionx.joinToString(Rangex.secondDownUntilTo(Datex.toMillisecondYMDHMS("2018-08-06 18:22:15", null), Datex.toMillisecondYMDHMS("2018-08-06 18:22:19", null)), transformer), "");
    }

    @Test
    public final void testMillisecondIterator() throws ParseException {
        Transformer<Date, CharSequence> transformer = new Transformer<Date, CharSequence>() {
            @NotNull
            @Override
            public CharSequence transform(@NotNull Date date) {
                return Datex.formatYMDHMSM(date, null);
            }
        };

        Assert.assertEquals(Collectionx.joinToString(Rangex.millisecondYMDHMSMRangeTo("2018-08-06 18:22:15 666", "2018-08-06 18:22:15 669"), transformer), "2018-08-06 18:22:15 666, 2018-08-06 18:22:15 667, 2018-08-06 18:22:15 668, 2018-08-06 18:22:15 669");
        Assert.assertEquals(Collectionx.joinToString(Rangex.millisecondYMDHMSMUntil("2018-08-06 18:22:15 666", "2018-08-06 18:22:15 670"), transformer), "2018-08-06 18:22:15 666, 2018-08-06 18:22:15 667, 2018-08-06 18:22:15 668, 2018-08-06 18:22:15 669");
        Assert.assertEquals(Collectionx.joinToString(Rangex.millisecondYMDHMSMDownTo("2018-08-06 18:22:15 666", "2018-08-06 18:22:15 663"), transformer), "2018-08-06 18:22:15 666, 2018-08-06 18:22:15 665, 2018-08-06 18:22:15 664, 2018-08-06 18:22:15 663");
        Assert.assertEquals(Collectionx.joinToString(Rangex.millisecondYMDHMSMDownUntilTo("2018-08-06 18:22:15 666", "2018-08-06 18:22:15 662"), transformer), "2018-08-06 18:22:15 666, 2018-08-06 18:22:15 665, 2018-08-06 18:22:15 664, 2018-08-06 18:22:15 663");

        Assert.assertEquals(Collectionx.joinToString(Rangex.millisecondRangeTo(Datex.toDateYMDHMSM("2018-08-06 18:22:15 666", null), Datex.toDateYMDHMSM("2018-08-06 18:22:15 663", null)), transformer), "");
        Assert.assertEquals(Collectionx.joinToString(Rangex.millisecondUntil(Datex.toDateYMDHMSM("2018-08-06 18:22:15 666", null), Datex.toDateYMDHMSM("2018-08-06 18:22:15 662", null)), transformer), "");
        Assert.assertEquals(Collectionx.joinToString(Rangex.millisecondDownTo(Datex.toDateYMDHMSM("2018-08-06 18:22:15 666", null), Datex.toDateYMDHMSM("2018-08-06 18:22:15 669", null)), transformer), "");
        Assert.assertEquals(Collectionx.joinToString(Rangex.millisecondDownUntilTo(Datex.toDateYMDHMSM("2018-08-06 18:22:15 666", null), Datex.toDateYMDHMSM("2018-08-06 18:22:15 670", null)), transformer), "");

        Assert.assertEquals(Collectionx.joinToString(Rangex.millisecondRangeTo(Datex.toMillisecondYMDHMSM("2018-08-06 18:22:15 666", null), Datex.toMillisecondYMDHMSM("2018-08-06 18:22:15 663", null)), transformer), "");
        Assert.assertEquals(Collectionx.joinToString(Rangex.millisecondUntil(Datex.toMillisecondYMDHMSM("2018-08-06 18:22:15 666", null), Datex.toMillisecondYMDHMSM("2018-08-06 18:22:15 662", null)), transformer), "");
        Assert.assertEquals(Collectionx.joinToString(Rangex.millisecondDownTo(Datex.toMillisecondYMDHMSM("2018-08-06 18:22:15 666", null), Datex.toMillisecondYMDHMSM("2018-08-06 18:22:15 669", null)), transformer), "");
        Assert.assertEquals(Collectionx.joinToString(Rangex.millisecondDownUntilTo(Datex.toMillisecondYMDHMSM("2018-08-06 18:22:15 666", null), Datex.toMillisecondYMDHMSM("2018-08-06 18:22:15 670", null)), transformer), "");
    }

    @Test
    public final void testContains() throws ParseException {
        assertTrue(Rangex.millisecondYMDHMSMRangeTo("2018-08-06 18:22:15 666", "2018-08-06 18:22:15 669").contains(Datex.toDateYMDHMSM("2018-08-06 18:22:15 666", null)));
        assertTrue(Rangex.millisecondYMDHMSMRangeTo("2018-08-06 18:22:15 666", "2018-08-06 18:22:15 669").contains(Datex.toDateYMDHMSM("2018-08-06 18:22:15 669", null)));
        assertTrue(Rangex.millisecondYMDHMSMRangeTo("2018-08-06 18:22:15 666", "2018-08-06 18:22:15 669").contains(Datex.toDateYMDHMSM("2018-08-06 18:22:15 667", null)));
        assertTrue(Rangex.millisecondYMDHMSMRangeTo("2018-08-06 18:22:15 666", "2018-08-06 18:22:15 669").contains(Datex.toDateYMDHMSM("2018-08-06 18:22:15 668", null)));
        assertFalse(Rangex.millisecondYMDHMSMRangeTo("2018-08-06 18:22:15 666", "2018-08-06 18:22:15 669").contains(Datex.toDateYMDHMSM("2018-08-06 18:22:15 665", null)));
        assertFalse(Rangex.millisecondYMDHMSMRangeTo("2018-08-06 18:22:15 666", "2018-08-06 18:22:15 669").contains(Datex.toDateYMDHMSM("2018-08-06 18:22:15 670", null)));
    }

    @Test
    public final void testEmpty() throws ParseException {
        assertTrue(Rangex.millisecondYMDHMSMRangeTo("2018-08-06 18:22:15 666", "2018-08-06 18:22:15 665").isEmpty());
        assertFalse(Rangex.millisecondYMDHMSMRangeTo("2018-08-06 18:22:15 666", "2018-08-06 18:22:15 669").isEmpty());
        assertFalse(Rangex.millisecondYMDHMSMRangeTo("2018-08-06 18:22:15 666", "2018-08-06 18:22:15 666").isEmpty());
    }
}
