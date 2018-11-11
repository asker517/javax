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

package me.panpf.javax.test.util

import me.panpf.javax.util.*
import me.panpf.javax.util.ClosedRange
import org.junit.Assert
import org.junit.Assert.*
import org.junit.Test
import java.text.ParseException
import java.util.*

class RangexTest {

    @Test
    fun testIn() {
        assertTrue(Rangex.`in`(9.toByte(), 3.toByte(), 10.toByte()))
        assertFalse(Rangex.`in`(2.toByte(), 3.toByte(), 10.toByte()))
        assertFalse(Rangex.`in`(11.toByte(), 3.toByte(), 10.toByte()))

        assertTrue(Rangex.`in`(9.toShort(), 3.toShort(), 10.toShort()))
        assertFalse(Rangex.`in`(2.toShort(), 3.toShort(), 10.toShort()))
        assertFalse(Rangex.`in`(11.toShort(), 3.toShort(), 10.toShort()))

        assertTrue(Rangex.`in`(9, 3, 10))
        assertFalse(Rangex.`in`(2, 3, 10))
        assertFalse(Rangex.`in`(11, 3, 10))

        assertTrue(Rangex.`in`(9L, 3L, 10L))
        assertFalse(Rangex.`in`(2L, 3L, 10L))
        assertFalse(Rangex.`in`(11L, 3L, 10L))

        assertTrue(Rangex.`in`(9f, 3f, 10f))
        assertFalse(Rangex.`in`(2f, 3f, 10f))
        assertFalse(Rangex.`in`(11f, 3f, 10f))

        assertTrue(Rangex.`in`(9.0, 3.0, 10.0))
        assertFalse(Rangex.`in`(2.0, 3.0, 10.0))
        assertFalse(Rangex.`in`(11.0, 3.0, 10.0))
    }

    @Test
    fun testNotIn() {
        assertFalse(Rangex.notIn(9.toByte(), 3.toByte(), 10.toByte()))
        assertTrue(Rangex.notIn(2.toByte(), 3.toByte(), 10.toByte()))
        assertTrue(Rangex.notIn(11.toByte(), 3.toByte(), 10.toByte()))

        assertFalse(Rangex.notIn(9.toShort(), 3.toShort(), 10.toShort()))
        assertTrue(Rangex.notIn(2.toShort(), 3.toShort(), 10.toShort()))
        assertTrue(Rangex.notIn(11.toShort(), 3.toShort(), 10.toShort()))

        assertFalse(Rangex.notIn(9, 3, 10))
        assertTrue(Rangex.notIn(2, 3, 10))
        assertTrue(Rangex.notIn(11, 3, 10))

        assertFalse(Rangex.notIn(9L, 3L, 10L))
        assertTrue(Rangex.notIn(2L, 3L, 10L))
        assertTrue(Rangex.notIn(11L, 3L, 10L))

        assertFalse(Rangex.notIn(9f, 3f, 10f))
        assertTrue(Rangex.notIn(2f, 3f, 10f))
        assertTrue(Rangex.notIn(11f, 3f, 10f))

        assertFalse(Rangex.notIn(9.0, 3.0, 10.0))
        assertTrue(Rangex.notIn(2.0, 3.0, 10.0))
        assertTrue(Rangex.notIn(11.0, 3.0, 10.0))
    }

    @Test
    fun testByteRange() {
        Assert.assertEquals(Collectionx.count(Rangex.rangeTo(1.toByte(), 10.toByte())).toLong(), 10)
        Assert.assertEquals(Collectionx.count(Rangex.rangeTo(1.toByte(), 1.toByte())).toLong(), 1)
        Assert.assertEquals(Collectionx.count(Rangex.rangeTo(0.toByte(), 1.toByte())).toLong(), 2)
        Assert.assertEquals(Collectionx.count(Rangex.rangeTo(1.toByte(), 0.toByte())).toLong(), 0)

        Assert.assertEquals(Collectionx.count(Rangex.until(1.toByte(), 10.toByte())).toLong(), 9)
        Assert.assertEquals(Collectionx.count(Rangex.until(1.toByte(), 1.toByte())).toLong(), 0)
        Assert.assertEquals(Collectionx.count(Rangex.until(1.toByte(), 0.toByte())).toLong(), 0)
        Assert.assertEquals(Collectionx.count(Rangex.until(0.toByte(), 1.toByte())).toLong(), 1)

        Assert.assertEquals(Collectionx.count(Rangex.downTo(10.toByte(), 1.toByte())).toLong(), 10)
        Assert.assertEquals(Collectionx.count(Rangex.downTo(1.toByte(), 1.toByte())).toLong(), 1)
        Assert.assertEquals(Collectionx.count(Rangex.downTo(0.toByte(), 1.toByte())).toLong(), 0)
        Assert.assertEquals(Collectionx.count(Rangex.downTo(1.toByte(), 0.toByte())).toLong(), 2)

        Assert.assertEquals(Collectionx.count(Rangex.downUntilTo(10.toByte(), 1.toByte())).toLong(), 9)
        Assert.assertEquals(Collectionx.count(Rangex.downUntilTo(1.toByte(), 1.toByte())).toLong(), 0)
        Assert.assertEquals(Collectionx.count(Rangex.downUntilTo(0.toByte(), 1.toByte())).toLong(), 0)
        Assert.assertEquals(Collectionx.count(Rangex.downUntilTo(1.toByte(), 0.toByte())).toLong(), 1)

        Assert.assertEquals(Collectionx.count(Rangex.rangeTo(1.toByte(), 10.toByte(), 4.toByte().toInt())).toLong(), 3)
        Assert.assertEquals(Collectionx.count(Rangex.rangeTo(10.toByte(), 1.toByte(), (-4).toByte().toInt())).toLong(), 3)
    }

    @Test
    fun testShortRange() {
        Assert.assertEquals(Collectionx.count(Rangex.rangeTo(1.toShort(), 10.toShort())).toLong(), 10)
        Assert.assertEquals(Collectionx.count(Rangex.rangeTo(1.toShort(), 1.toShort())).toLong(), 1)
        Assert.assertEquals(Collectionx.count(Rangex.rangeTo(0.toShort(), 1.toShort())).toLong(), 2)
        Assert.assertEquals(Collectionx.count(Rangex.rangeTo(1.toShort(), 0.toShort())).toLong(), 0)

        Assert.assertEquals(Collectionx.count(Rangex.until(1.toShort(), 10.toShort())).toLong(), 9)
        Assert.assertEquals(Collectionx.count(Rangex.until(1.toShort(), 1.toShort())).toLong(), 0)
        Assert.assertEquals(Collectionx.count(Rangex.until(1.toShort(), 0.toShort())).toLong(), 0)
        Assert.assertEquals(Collectionx.count(Rangex.until(0.toShort(), 1.toShort())).toLong(), 1)

        Assert.assertEquals(Collectionx.count(Rangex.downTo(10.toShort(), 1.toShort())).toLong(), 10)
        Assert.assertEquals(Collectionx.count(Rangex.downTo(1.toShort(), 1.toShort())).toLong(), 1)
        Assert.assertEquals(Collectionx.count(Rangex.downTo(0.toShort(), 1.toShort())).toLong(), 0)
        Assert.assertEquals(Collectionx.count(Rangex.downTo(1.toShort(), 0.toShort())).toLong(), 2)

        Assert.assertEquals(Collectionx.count(Rangex.downUntilTo(10.toShort(), 1.toShort())).toLong(), 9)
        Assert.assertEquals(Collectionx.count(Rangex.downUntilTo(1.toShort(), 1.toShort())).toLong(), 0)
        Assert.assertEquals(Collectionx.count(Rangex.downUntilTo(0.toShort(), 1.toShort())).toLong(), 0)
        Assert.assertEquals(Collectionx.count(Rangex.downUntilTo(1.toShort(), 0.toByte().toShort())).toLong(), 1)

        Assert.assertEquals(Collectionx.count(Rangex.rangeTo(1.toShort(), 10.toShort(), 4.toShort().toInt())).toLong(), 3)
        Assert.assertEquals(Collectionx.count(Rangex.rangeTo(10.toShort(), 1.toShort(), (-4).toShort().toInt())).toLong(), 3)
    }

    @Test
    fun testIntRange() {
        Assert.assertEquals(Collectionx.count(Rangex.rangeTo(1, 10)).toLong(), 10)
        Assert.assertEquals(Collectionx.count(Rangex.rangeTo(1, 1)).toLong(), 1)
        Assert.assertEquals(Collectionx.count(Rangex.rangeTo(0, 1)).toLong(), 2)
        Assert.assertEquals(Collectionx.count(Rangex.rangeTo(1, 0)).toLong(), 0)

        Assert.assertEquals(Collectionx.count(Rangex.until(1, 10)).toLong(), 9)
        Assert.assertEquals(Collectionx.count(Rangex.until(1, 1)).toLong(), 0)
        Assert.assertEquals(Collectionx.count(Rangex.until(1, 0)).toLong(), 0)
        Assert.assertEquals(Collectionx.count(Rangex.until(0, 1)).toLong(), 1)

        Assert.assertEquals(Collectionx.count(Rangex.downTo(10, 1)).toLong(), 10)
        Assert.assertEquals(Collectionx.count(Rangex.downTo(1, 1)).toLong(), 1)
        Assert.assertEquals(Collectionx.count(Rangex.downTo(0, 1)).toLong(), 0)
        Assert.assertEquals(Collectionx.count(Rangex.downTo(1, 0)).toLong(), 2)

        Assert.assertEquals(Collectionx.count(Rangex.downUntilTo(10, 1)).toLong(), 9)
        Assert.assertEquals(Collectionx.count(Rangex.downUntilTo(1, 1)).toLong(), 0)
        Assert.assertEquals(Collectionx.count(Rangex.downUntilTo(0, 1)).toLong(), 0)
        Assert.assertEquals(Collectionx.count(Rangex.downUntilTo(1, 0)).toLong(), 1)

        Assert.assertEquals(Collectionx.count(Rangex.rangeTo(1, 10, 4)).toLong(), 3)
        Assert.assertEquals(Collectionx.count(Rangex.rangeTo(10, 1, -4)).toLong(), 3)
    }

    @Test
    fun testLongRange() {
        Assert.assertEquals(Collectionx.count(Rangex.rangeTo(1L, 10L)).toLong(), 10)
        Assert.assertEquals(Collectionx.count(Rangex.rangeTo(1L, 1L)).toLong(), 1)
        Assert.assertEquals(Collectionx.count(Rangex.rangeTo(0L, 1L)).toLong(), 2)
        Assert.assertEquals(Collectionx.count(Rangex.rangeTo(1L, 0L)).toLong(), 0)

        Assert.assertEquals(Collectionx.count(Rangex.until(1L, 10L)).toLong(), 9)
        Assert.assertEquals(Collectionx.count(Rangex.until(1L, 1L)).toLong(), 0)
        Assert.assertEquals(Collectionx.count(Rangex.until(1L, 0L)).toLong(), 0)
        Assert.assertEquals(Collectionx.count(Rangex.until(0L, 1L)).toLong(), 1)

        Assert.assertEquals(Collectionx.count(Rangex.downTo(10L, 1L)).toLong(), 10)
        Assert.assertEquals(Collectionx.count(Rangex.downTo(1L, 1L)).toLong(), 1)
        Assert.assertEquals(Collectionx.count(Rangex.downTo(0L, 1L)).toLong(), 0)
        Assert.assertEquals(Collectionx.count(Rangex.downTo(1L, 0L)).toLong(), 2)

        Assert.assertEquals(Collectionx.count(Rangex.downUntilTo(10L, 1L)).toLong(), 9)
        Assert.assertEquals(Collectionx.count(Rangex.downUntilTo(1L, 1L)).toLong(), 0)
        Assert.assertEquals(Collectionx.count(Rangex.downUntilTo(0L, 1L)).toLong(), 0)
        Assert.assertEquals(Collectionx.count(Rangex.downUntilTo(1L, 0L)).toLong(), 1)

        Assert.assertEquals(Collectionx.count(Rangex.rangeTo(1L, 10L, 4)).toLong(), 3)
        Assert.assertEquals(Collectionx.count(Rangex.rangeTo(10L, 1L, -4)).toLong(), 3)
    }

    @Test
    fun tesFloatRange() {
        Assert.assertTrue(Rangex.rangeTo(1f, 10f).contains(5f))
        Assert.assertEquals(1f.rangeTo(10f).contains(5f), Rangex.rangeTo(1f, 10f).contains(5f))

        Assert.assertFalse(Rangex.rangeTo(1f, 10f).contains(0f))
        Assert.assertEquals(1f.rangeTo(10f).contains(0f), Rangex.rangeTo(1f, 10f).contains(0f))

        Assert.assertFalse(Rangex.rangeTo(1f, 10f).contains(11f))
        Assert.assertEquals(1f.rangeTo(10f).contains(11f), Rangex.rangeTo(1f, 10f).contains(11f))
    }

    @Test
    fun tesDoubleRange() {
        Assert.assertTrue(Rangex.rangeTo(1.toDouble(), 10.toDouble()).contains(5.toDouble()))
        Assert.assertFalse(Rangex.rangeTo(1.toDouble(), 10.toDouble()).contains(0.toDouble()))
        Assert.assertFalse(Rangex.rangeTo(1.toDouble(), 10.toDouble()).contains(11.toDouble()))
    }

    @Test
    fun testCharRange() {
        Assert.assertEquals(Collectionx.count(Rangex.rangeTo(1.toChar(), 10.toChar())).toLong(), 10)
        Assert.assertEquals(Collectionx.count(Rangex.rangeTo(1.toChar(), 1.toChar())).toLong(), 1)
        Assert.assertEquals(Collectionx.count(Rangex.rangeTo(0.toChar(), 1.toChar())).toLong(), 2)
        Assert.assertEquals(Collectionx.count(Rangex.rangeTo(1.toChar(), 0.toChar())).toLong(), 0)

        Assert.assertEquals(Collectionx.count(Rangex.until(1.toChar(), 10.toChar())).toLong(), 9)
        Assert.assertEquals(Collectionx.count(Rangex.until(1.toChar(), 1.toChar())).toLong(), 0)
        Assert.assertEquals(Collectionx.count(Rangex.until(1.toChar(), 0.toChar())).toLong(), 0)
        Assert.assertEquals(Collectionx.count(Rangex.until(0.toChar(), 1.toChar())).toLong(), 1)

        Assert.assertEquals(Collectionx.count(Rangex.downTo(10.toChar(), 1.toChar())).toLong(), 10)
        Assert.assertEquals(Collectionx.count(Rangex.downTo(1.toChar(), 1.toChar())).toLong(), 1)
        Assert.assertEquals(Collectionx.count(Rangex.downTo(0.toChar(), 1.toChar())).toLong(), 0)
        Assert.assertEquals(Collectionx.count(Rangex.downTo(1.toChar(), 0.toChar())).toLong(), 2)

        Assert.assertEquals(Collectionx.count(Rangex.downUntilTo(10.toChar(), 1.toChar())).toLong(), 9)
        Assert.assertEquals(Collectionx.count(Rangex.downUntilTo(1.toChar(), 1.toChar())).toLong(), 0)
        Assert.assertEquals(Collectionx.count(Rangex.downUntilTo(0.toChar(), 1.toChar())).toLong(), 0)
        Assert.assertEquals(Collectionx.count(Rangex.downUntilTo(1.toChar(), 0.toChar())).toLong(), 1)

        Assert.assertEquals(Collectionx.count(Rangex.rangeTo(1.toChar(), 10.toChar(), 4)).toLong(), 3)
        Assert.assertEquals(Collectionx.count(Rangex.rangeTo(10.toChar(), 1.toChar(), -4)).toLong(), 3)
    }

    @Test
    @Throws(ParseException::class)
    fun testYearIterator() {
        val transformer = Transformer<Date, CharSequence> { date -> Datex.formatY(date, null) }

        Assert.assertEquals(Collectionx.joinToString(Rangex.yearYRangeTo("2018", "2021"), transformer), "2018, 2019, 2020, 2021")
        Assert.assertEquals(Collectionx.joinToString(Rangex.yearYUntil("2018", "2022"), transformer), "2018, 2019, 2020, 2021")
        Assert.assertEquals(Collectionx.joinToString(Rangex.yearYDownTo("2018", "2015"), transformer), "2018, 2017, 2016, 2015")
        Assert.assertEquals(Collectionx.joinToString(Rangex.yearYDownUntilTo("2018", "2014"), transformer), "2018, 2017, 2016, 2015")

        Assert.assertEquals(Collectionx.joinToString(Rangex.yearRangeTo(Datex.toDateY("2018", null), Datex.toDateY("2015", null)), transformer), "")
        Assert.assertEquals(Collectionx.joinToString(Rangex.yearUntil(Datex.toDateY("2018", null), Datex.toDateY("2015", null)), transformer), "")
        Assert.assertEquals(Collectionx.joinToString(Rangex.yearDownTo(Datex.toDateY("2018", null), Datex.toDateY("2021", null)), transformer), "")
        Assert.assertEquals(Collectionx.joinToString(Rangex.yearDownUntilTo(Datex.toDateY("2018", null), Datex.toDateY("2021", null)), transformer), "")

        Assert.assertEquals(Collectionx.joinToString(Rangex.yearRangeTo(Datex.toMillisecondY("2018", null), Datex.toMillisecondY("2015", null)), transformer), "")
        Assert.assertEquals(Collectionx.joinToString(Rangex.yearUntil(Datex.toMillisecondY("2018", null), Datex.toMillisecondY("2015", null)), transformer), "")
        Assert.assertEquals(Collectionx.joinToString(Rangex.yearDownTo(Datex.toMillisecondY("2018", null), Datex.toMillisecondY("2021", null)), transformer), "")
        Assert.assertEquals(Collectionx.joinToString(Rangex.yearDownUntilTo(Datex.toMillisecondY("2018", null), Datex.toMillisecondY("2021", null)), transformer), "")

        Assert.assertEquals(Collectionx.joinToString(Rangex.yearYRangeTo("2018", "2031", 5), transformer), "2018, 2023, 2028")
        Assert.assertEquals(Collectionx.joinToString(Rangex.yearYRangeTo("2031", "2018", -5), transformer), "2031, 2026, 2021")
    }

    @Test
    @Throws(ParseException::class)
    fun testMonthIterator() {
        val transformer = Transformer<Date, CharSequence> { date -> Datex.formatYM(date, null) }

        Assert.assertEquals(Collectionx.joinToString(Rangex.monthYMRangeTo("2018-08", "2018-11"), transformer), "2018-08, 2018-09, 2018-10, 2018-11")
        Assert.assertEquals(Collectionx.joinToString(Rangex.monthYMUntil("2018-08", "2018-12"), transformer), "2018-08, 2018-09, 2018-10, 2018-11")
        Assert.assertEquals(Collectionx.joinToString(Rangex.monthYMDownTo("2018-08", "2018-05"), transformer), "2018-08, 2018-07, 2018-06, 2018-05")
        Assert.assertEquals(Collectionx.joinToString(Rangex.monthYMDownUntilTo("2018-08", "2018-04"), transformer), "2018-08, 2018-07, 2018-06, 2018-05")

        Assert.assertEquals(Collectionx.joinToString(Rangex.monthRangeTo(Datex.toDateYM("2018-08", null), Datex.toDateYM("2018-05", null)), transformer), "")
        Assert.assertEquals(Collectionx.joinToString(Rangex.monthUntil(Datex.toDateYM("2018-08", null), Datex.toDateYM("2018-05", null)), transformer), "")
        Assert.assertEquals(Collectionx.joinToString(Rangex.monthDownTo(Datex.toDateYM("2018-08", null), Datex.toDateYM("2018-11", null)), transformer), "")
        Assert.assertEquals(Collectionx.joinToString(Rangex.monthDownUntilTo(Datex.toDateYM("2018-08", null), Datex.toDateYM("2018-11", null)), transformer), "")

        Assert.assertEquals(Collectionx.joinToString(Rangex.monthRangeTo(Datex.toMillisecondYM("2018-08", null), Datex.toMillisecondYM("2018-05", null)), transformer), "")
        Assert.assertEquals(Collectionx.joinToString(Rangex.monthUntil(Datex.toMillisecondYM("2018-08", null), Datex.toMillisecondYM("2018-05", null)), transformer), "")
        Assert.assertEquals(Collectionx.joinToString(Rangex.monthDownTo(Datex.toMillisecondYM("2018-08", null), Datex.toMillisecondYM("2018-11", null)), transformer), "")
        Assert.assertEquals(Collectionx.joinToString(Rangex.monthDownUntilTo(Datex.toMillisecondYM("2018-08", null), Datex.toMillisecondYM("2018-11", null)), transformer), "")
    }

    @Test
    @Throws(ParseException::class)
    fun testDayIterator() {
        val transformer = Transformer<Date, CharSequence> { date -> Datex.formatYMD(date, null) }

        Assert.assertEquals(Collectionx.joinToString(Rangex.dayYMDRangeTo("2018-08-06", "2018-08-09"), transformer), "2018-08-06, 2018-08-07, 2018-08-08, 2018-08-09")
        Assert.assertEquals(Collectionx.joinToString(Rangex.dayYMDUntil("2018-08-06", "2018-08-10"), transformer), "2018-08-06, 2018-08-07, 2018-08-08, 2018-08-09")
        Assert.assertEquals(Collectionx.joinToString(Rangex.dayYMDDownTo("2018-08-06", "2018-08-03"), transformer), "2018-08-06, 2018-08-05, 2018-08-04, 2018-08-03")
        Assert.assertEquals(Collectionx.joinToString(Rangex.dayYMDDownUntilTo("2018-08-06", "2018-08-02"), transformer), "2018-08-06, 2018-08-05, 2018-08-04, 2018-08-03")

        Assert.assertEquals(Collectionx.joinToString(Rangex.dayRangeTo(Datex.toDateYMD("2018-08-06", null), Datex.toDateYMD("2018-08-03", null)), transformer), "")
        Assert.assertEquals(Collectionx.joinToString(Rangex.dayUntil(Datex.toDateYMD("2018-08-06", null), Datex.toDateYMD("2018-08-02", null)), transformer), "")
        Assert.assertEquals(Collectionx.joinToString(Rangex.dayDownTo(Datex.toDateYMD("2018-08-06", null), Datex.toDateYMD("2018-08-09", null)), transformer), "")
        Assert.assertEquals(Collectionx.joinToString(Rangex.dayDownUntilTo(Datex.toDateYMD("2018-08-06", null), Datex.toDateYMD("2018-08-010", null)), transformer), "")

        Assert.assertEquals(Collectionx.joinToString(Rangex.dayRangeTo(Datex.toMillisecondYMD("2018-08-06", null), Datex.toMillisecondYMD("2018-08-03", null)), transformer), "")
        Assert.assertEquals(Collectionx.joinToString(Rangex.dayUntil(Datex.toMillisecondYMD("2018-08-06", null), Datex.toMillisecondYMD("2018-08-02", null)), transformer), "")
        Assert.assertEquals(Collectionx.joinToString(Rangex.dayDownTo(Datex.toMillisecondYMD("2018-08-06", null), Datex.toMillisecondYMD("2018-08-09", null)), transformer), "")
        Assert.assertEquals(Collectionx.joinToString(Rangex.dayDownUntilTo(Datex.toMillisecondYMD("2018-08-06", null), Datex.toMillisecondYMD("2018-08-010", null)), transformer), "")
    }

    @Test
    @Throws(ParseException::class)
    fun testHourIterator() {
        val transformer = Transformer<Date, CharSequence> { date -> Datex.formatYMDH(date, null) }

        Assert.assertEquals(Collectionx.joinToString(Rangex.hourYMDHRangeTo("2018-08-06 18", "2018-08-06 21"), transformer), "2018-08-06 18, 2018-08-06 19, 2018-08-06 20, 2018-08-06 21")
        Assert.assertEquals(Collectionx.joinToString(Rangex.hourYMDHUntil("2018-08-06 18", "2018-08-06 22"), transformer), "2018-08-06 18, 2018-08-06 19, 2018-08-06 20, 2018-08-06 21")
        Assert.assertEquals(Collectionx.joinToString(Rangex.hourYMDHDownTo("2018-08-06 18", "2018-08-06 15"), transformer), "2018-08-06 18, 2018-08-06 17, 2018-08-06 16, 2018-08-06 15")
        Assert.assertEquals(Collectionx.joinToString(Rangex.hourYMDHDownUntilTo("2018-08-06 18", "2018-08-06 14"), transformer), "2018-08-06 18, 2018-08-06 17, 2018-08-06 16, 2018-08-06 15")

        Assert.assertEquals(Collectionx.joinToString(Rangex.hourRangeTo(Datex.toDateYMDH("2018-08-06 18", null), Datex.toDateYMDH("2018-08-06 15", null)), transformer), "")
        Assert.assertEquals(Collectionx.joinToString(Rangex.hourUntil(Datex.toDateYMDH("2018-08-06 18", null), Datex.toDateYMDH("2018-08-06 14", null)), transformer), "")
        Assert.assertEquals(Collectionx.joinToString(Rangex.hourDownTo(Datex.toDateYMDH("2018-08-06 18", null), Datex.toDateYMDH("2018-08-06 21", null)), transformer), "")
        Assert.assertEquals(Collectionx.joinToString(Rangex.hourDownUntilTo(Datex.toDateYMDH("2018-08-06 18", null), Datex.toDateYMDH("2018-08-06 22", null)), transformer), "")

        Assert.assertEquals(Collectionx.joinToString(Rangex.hourRangeTo(Datex.toMillisecondYMDH("2018-08-06 18", null), Datex.toMillisecondYMDH("2018-08-06 15", null)), transformer), "")
        Assert.assertEquals(Collectionx.joinToString(Rangex.hourUntil(Datex.toMillisecondYMDH("2018-08-06 18", null), Datex.toMillisecondYMDH("2018-08-06 14", null)), transformer), "")
        Assert.assertEquals(Collectionx.joinToString(Rangex.hourDownTo(Datex.toMillisecondYMDH("2018-08-06 18", null), Datex.toMillisecondYMDH("2018-08-06 21", null)), transformer), "")
        Assert.assertEquals(Collectionx.joinToString(Rangex.hourDownUntilTo(Datex.toMillisecondYMDH("2018-08-06 18", null), Datex.toMillisecondYMDH("2018-08-06 22", null)), transformer), "")
    }

    @Test
    @Throws(ParseException::class)
    fun testMinuteIterator() {
        val transformer = Transformer<Date, CharSequence> { date -> Datex.formatYMDHM(date, null) }

        Assert.assertEquals(Collectionx.joinToString(Rangex.minuteYMDHMRangeTo("2018-08-06 18:22", "2018-08-06 18:25"), transformer), "2018-08-06 18:22, 2018-08-06 18:23, 2018-08-06 18:24, 2018-08-06 18:25")
        Assert.assertEquals(Collectionx.joinToString(Rangex.minuteYMDHMUntil("2018-08-06 18:22", "2018-08-06 18:26"), transformer), "2018-08-06 18:22, 2018-08-06 18:23, 2018-08-06 18:24, 2018-08-06 18:25")
        Assert.assertEquals(Collectionx.joinToString(Rangex.minuteYMDHMDownTo("2018-08-06 18:22", "2018-08-06 18:19"), transformer), "2018-08-06 18:22, 2018-08-06 18:21, 2018-08-06 18:20, 2018-08-06 18:19")
        Assert.assertEquals(Collectionx.joinToString(Rangex.minuteYMDHMDownUntilTo("2018-08-06 18:22", "2018-08-06 18:18"), transformer), "2018-08-06 18:22, 2018-08-06 18:21, 2018-08-06 18:20, 2018-08-06 18:19")

        Assert.assertEquals(Collectionx.joinToString(Rangex.minuteRangeTo(Datex.toDateYMDHM("2018-08-06 18:22", null), Datex.toDateYMDHM("2018-08-06 18:19", null)), transformer), "")
        Assert.assertEquals(Collectionx.joinToString(Rangex.minuteUntil(Datex.toDateYMDHM("2018-08-06 18:22", null), Datex.toDateYMDHM("2018-08-06 18:18", null)), transformer), "")
        Assert.assertEquals(Collectionx.joinToString(Rangex.minuteDownTo(Datex.toDateYMDHM("2018-08-06 18:22", null), Datex.toDateYMDHM("2018-08-06 18:25", null)), transformer), "")
        Assert.assertEquals(Collectionx.joinToString(Rangex.minuteDownUntilTo(Datex.toDateYMDHM("2018-08-06 18:22", null), Datex.toDateYMDHM("2018-08-06 18:25", null)), transformer), "")

        Assert.assertEquals(Collectionx.joinToString(Rangex.minuteRangeTo(Datex.toMillisecondYMDHM("2018-08-06 18:22", null), Datex.toMillisecondYMDHM("2018-08-06 18:19", null)), transformer), "")
        Assert.assertEquals(Collectionx.joinToString(Rangex.minuteUntil(Datex.toMillisecondYMDHM("2018-08-06 18:22", null), Datex.toMillisecondYMDHM("2018-08-06 18:18", null)), transformer), "")
        Assert.assertEquals(Collectionx.joinToString(Rangex.minuteDownTo(Datex.toMillisecondYMDHM("2018-08-06 18:22", null), Datex.toMillisecondYMDHM("2018-08-06 18:25", null)), transformer), "")
        Assert.assertEquals(Collectionx.joinToString(Rangex.minuteDownUntilTo(Datex.toMillisecondYMDHM("2018-08-06 18:22", null), Datex.toMillisecondYMDHM("2018-08-06 18:25", null)), transformer), "")
    }

    @Test
    @Throws(ParseException::class)
    fun testSecondIterator() {
        val transformer = Transformer<Date, CharSequence> { date -> Datex.formatYMDHMS(date, null) }

        Assert.assertEquals(Collectionx.joinToString(Rangex.secondYMDHMSRangeTo("2018-08-06 18:22:15", "2018-08-06 18:22:18"), transformer), "2018-08-06 18:22:15, 2018-08-06 18:22:16, 2018-08-06 18:22:17, 2018-08-06 18:22:18")
        Assert.assertEquals(Collectionx.joinToString(Rangex.secondYMDHMSUntil("2018-08-06 18:22:15", "2018-08-06 18:22:19"), transformer), "2018-08-06 18:22:15, 2018-08-06 18:22:16, 2018-08-06 18:22:17, 2018-08-06 18:22:18")
        Assert.assertEquals(Collectionx.joinToString(Rangex.secondYMDHMSDownTo("2018-08-06 18:22:15", "2018-08-06 18:22:12"), transformer), "2018-08-06 18:22:15, 2018-08-06 18:22:14, 2018-08-06 18:22:13, 2018-08-06 18:22:12")
        Assert.assertEquals(Collectionx.joinToString(Rangex.secondYMDHMSDownUntilTo("2018-08-06 18:22:15", "2018-08-06 18:22:11"), transformer), "2018-08-06 18:22:15, 2018-08-06 18:22:14, 2018-08-06 18:22:13, 2018-08-06 18:22:12")

        Assert.assertEquals(Collectionx.joinToString(Rangex.secondRangeTo(Datex.toDateYMDHMS("2018-08-06 18:22:15", null), Datex.toDateYMDHMS("2018-08-06 18:22:12", null)), transformer), "")
        Assert.assertEquals(Collectionx.joinToString(Rangex.secondUntil(Datex.toDateYMDHMS("2018-08-06 18:22:15", null), Datex.toDateYMDHMS("2018-08-06 18:22:11", null)), transformer), "")
        Assert.assertEquals(Collectionx.joinToString(Rangex.secondDownTo(Datex.toDateYMDHMS("2018-08-06 18:22:15", null), Datex.toDateYMDHMS("2018-08-06 18:22:18", null)), transformer), "")
        Assert.assertEquals(Collectionx.joinToString(Rangex.secondDownUntilTo(Datex.toDateYMDHMS("2018-08-06 18:22:15", null), Datex.toDateYMDHMS("2018-08-06 18:22:19", null)), transformer), "")

        Assert.assertEquals(Collectionx.joinToString(Rangex.secondRangeTo(Datex.toMillisecondYMDHMS("2018-08-06 18:22:15", null), Datex.toMillisecondYMDHMS("2018-08-06 18:22:12", null)), transformer), "")
        Assert.assertEquals(Collectionx.joinToString(Rangex.secondUntil(Datex.toMillisecondYMDHMS("2018-08-06 18:22:15", null), Datex.toMillisecondYMDHMS("2018-08-06 18:22:11", null)), transformer), "")
        Assert.assertEquals(Collectionx.joinToString(Rangex.secondDownTo(Datex.toMillisecondYMDHMS("2018-08-06 18:22:15", null), Datex.toMillisecondYMDHMS("2018-08-06 18:22:18", null)), transformer), "")
        Assert.assertEquals(Collectionx.joinToString(Rangex.secondDownUntilTo(Datex.toMillisecondYMDHMS("2018-08-06 18:22:15", null), Datex.toMillisecondYMDHMS("2018-08-06 18:22:19", null)), transformer), "")
    }

    @Test
    @Throws(ParseException::class)
    fun testMillisecondIterator() {
        val transformer = Transformer<Date, CharSequence> { date -> Datex.formatYMDHMSM(date, null) }

        Assert.assertEquals(Collectionx.joinToString(Rangex.millisecondYMDHMSMRangeTo("2018-08-06 18:22:15 666", "2018-08-06 18:22:15 669"), transformer), "2018-08-06 18:22:15 666, 2018-08-06 18:22:15 667, 2018-08-06 18:22:15 668, 2018-08-06 18:22:15 669")
        Assert.assertEquals(Collectionx.joinToString(Rangex.millisecondYMDHMSMUntil("2018-08-06 18:22:15 666", "2018-08-06 18:22:15 670"), transformer), "2018-08-06 18:22:15 666, 2018-08-06 18:22:15 667, 2018-08-06 18:22:15 668, 2018-08-06 18:22:15 669")
        Assert.assertEquals(Collectionx.joinToString(Rangex.millisecondYMDHMSMDownTo("2018-08-06 18:22:15 666", "2018-08-06 18:22:15 663"), transformer), "2018-08-06 18:22:15 666, 2018-08-06 18:22:15 665, 2018-08-06 18:22:15 664, 2018-08-06 18:22:15 663")
        Assert.assertEquals(Collectionx.joinToString(Rangex.millisecondYMDHMSMDownUntilTo("2018-08-06 18:22:15 666", "2018-08-06 18:22:15 662"), transformer), "2018-08-06 18:22:15 666, 2018-08-06 18:22:15 665, 2018-08-06 18:22:15 664, 2018-08-06 18:22:15 663")

        Assert.assertEquals(Collectionx.joinToString(Rangex.millisecondRangeTo(Datex.toDateYMDHMSM("2018-08-06 18:22:15 666", null), Datex.toDateYMDHMSM("2018-08-06 18:22:15 663", null)), transformer), "")
        Assert.assertEquals(Collectionx.joinToString(Rangex.millisecondUntil(Datex.toDateYMDHMSM("2018-08-06 18:22:15 666", null), Datex.toDateYMDHMSM("2018-08-06 18:22:15 662", null)), transformer), "")
        Assert.assertEquals(Collectionx.joinToString(Rangex.millisecondDownTo(Datex.toDateYMDHMSM("2018-08-06 18:22:15 666", null), Datex.toDateYMDHMSM("2018-08-06 18:22:15 669", null)), transformer), "")
        Assert.assertEquals(Collectionx.joinToString(Rangex.millisecondDownUntilTo(Datex.toDateYMDHMSM("2018-08-06 18:22:15 666", null), Datex.toDateYMDHMSM("2018-08-06 18:22:15 670", null)), transformer), "")

        Assert.assertEquals(Collectionx.joinToString(Rangex.millisecondRangeTo(Datex.toMillisecondYMDHMSM("2018-08-06 18:22:15 666", null), Datex.toMillisecondYMDHMSM("2018-08-06 18:22:15 663", null)), transformer), "")
        Assert.assertEquals(Collectionx.joinToString(Rangex.millisecondUntil(Datex.toMillisecondYMDHMSM("2018-08-06 18:22:15 666", null), Datex.toMillisecondYMDHMSM("2018-08-06 18:22:15 662", null)), transformer), "")
        Assert.assertEquals(Collectionx.joinToString(Rangex.millisecondDownTo(Datex.toMillisecondYMDHMSM("2018-08-06 18:22:15 666", null), Datex.toMillisecondYMDHMSM("2018-08-06 18:22:15 669", null)), transformer), "")
        Assert.assertEquals(Collectionx.joinToString(Rangex.millisecondDownUntilTo(Datex.toMillisecondYMDHMSM("2018-08-06 18:22:15 666", null), Datex.toMillisecondYMDHMSM("2018-08-06 18:22:15 670", null)), transformer), "")
    }

    @Test
    @Throws(ParseException::class)
    fun testContains() {
        assertTrue(Rangex.millisecondYMDHMSMRangeTo("2018-08-06 18:22:15 666", "2018-08-06 18:22:15 669").contains(Datex.toDateYMDHMSM("2018-08-06 18:22:15 666", null)))
        assertTrue(Rangex.millisecondYMDHMSMRangeTo("2018-08-06 18:22:15 666", "2018-08-06 18:22:15 669").contains(Datex.toDateYMDHMSM("2018-08-06 18:22:15 669", null)))
        assertTrue(Rangex.millisecondYMDHMSMRangeTo("2018-08-06 18:22:15 666", "2018-08-06 18:22:15 669").contains(Datex.toDateYMDHMSM("2018-08-06 18:22:15 667", null)))
        assertTrue(Rangex.millisecondYMDHMSMRangeTo("2018-08-06 18:22:15 666", "2018-08-06 18:22:15 669").contains(Datex.toDateYMDHMSM("2018-08-06 18:22:15 668", null)))
        assertFalse(Rangex.millisecondYMDHMSMRangeTo("2018-08-06 18:22:15 666", "2018-08-06 18:22:15 669").contains(Datex.toDateYMDHMSM("2018-08-06 18:22:15 665", null)))
        assertFalse(Rangex.millisecondYMDHMSMRangeTo("2018-08-06 18:22:15 666", "2018-08-06 18:22:15 669").contains(Datex.toDateYMDHMSM("2018-08-06 18:22:15 670", null)))
    }

    @Test
    @Throws(ParseException::class)
    fun testEmpty() {
        assertTrue(Rangex.millisecondYMDHMSMRangeTo("2018-08-06 18:22:15 666", "2018-08-06 18:22:15 665").isEmpty)
        assertFalse(Rangex.millisecondYMDHMSMRangeTo("2018-08-06 18:22:15 666", "2018-08-06 18:22:15 669").isEmpty)
        assertFalse(Rangex.millisecondYMDHMSMRangeTo("2018-08-06 18:22:15 666", "2018-08-06 18:22:15 666").isEmpty)
    }


    /*
     * *****************************************************************************************************************
     * From kotlin standard library
     * *****************************************************************************************************************
     */


    @Test
    fun testCoerceAtLeast() {
        assertEquals(5.toByte(), Rangex.coerceAtLeast(5.toByte(), 4.toByte()))
        assertEquals(5.toByte().coerceAtLeast(4.toByte()), Rangex.coerceAtLeast(5.toByte(), 4.toByte()))
        assertEquals(6.toByte(), Rangex.coerceAtLeast(5.toByte(), 6.toByte()))
        assertEquals(5.toByte().coerceAtLeast(6.toByte()), Rangex.coerceAtLeast(5.toByte(), 6.toByte()))

        assertEquals(5.toShort(), Rangex.coerceAtLeast(5.toShort(), 4.toShort()))
        assertEquals(5.toShort().coerceAtLeast(4.toShort()), Rangex.coerceAtLeast(5.toShort(), 4.toShort()))
        assertEquals(6.toShort(), Rangex.coerceAtLeast(5.toShort(), 6.toShort()))
        assertEquals(5.toShort().coerceAtLeast(6.toShort()), Rangex.coerceAtLeast(5.toShort(), 6.toShort()))

        assertEquals(5, Rangex.coerceAtLeast(5, 4))
        assertEquals(5.coerceAtLeast(4), Rangex.coerceAtLeast(5, 4))
        assertEquals(6, Rangex.coerceAtLeast(5, 6))
        assertEquals(5.coerceAtLeast(6), Rangex.coerceAtLeast(5, 6))

        assertEquals(5.toLong(), Rangex.coerceAtLeast(5.toLong(), 4.toLong()))
        assertEquals(5.toLong().coerceAtLeast(4.toLong()), Rangex.coerceAtLeast(5.toLong(), 4.toLong()))
        assertEquals(6.toLong(), Rangex.coerceAtLeast(5.toLong(), 6.toLong()))
        assertEquals(5.toLong().coerceAtLeast(6.toLong()), Rangex.coerceAtLeast(5.toLong(), 6.toLong()))

        assertEquals(5.toFloat(), Rangex.coerceAtLeast(5.toFloat(), 4.toFloat()), 0.toFloat())
        assertEquals(5.toFloat().coerceAtLeast(4.toFloat()), Rangex.coerceAtLeast(5.toFloat(), 4.toFloat()), 0.toFloat())
        assertEquals(6.toFloat(), Rangex.coerceAtLeast(5.toFloat(), 6.toFloat()), 0.toFloat())
        assertEquals(5.toFloat().coerceAtLeast(6.toFloat()), Rangex.coerceAtLeast(5.toFloat(), 6.toFloat()), 0.toFloat())

        assertEquals(5.toDouble(), Rangex.coerceAtLeast(5.toDouble(), 4.toDouble()), 0.toDouble())
        assertEquals(5.toDouble().coerceAtLeast(4.toDouble()), Rangex.coerceAtLeast(5.toDouble(), 4.toDouble()), 0.toDouble())
        assertEquals(6.toDouble(), Rangex.coerceAtLeast(5.toDouble(), 6.toDouble()), 0.toDouble())
        assertEquals(5.toDouble().coerceAtLeast(6.toDouble()), Rangex.coerceAtLeast(5.toDouble(), 6.toDouble()), 0.toDouble())

        assertEquals("5", Rangex.coerceAtLeast("5", "4"))
        assertEquals("5".coerceAtLeast("4"), Rangex.coerceAtLeast("5", "4"))
        assertEquals("6", Rangex.coerceAtLeast("5", "6"))
        assertEquals("5".coerceAtLeast("6"), Rangex.coerceAtLeast("5", "6"))
    }

    @Test
    fun testCoerceAtMost() {
        assertEquals(5.toByte(), Rangex.coerceAtMost(5.toByte(), 6.toByte()))
        assertEquals(5.toByte().coerceAtMost(6.toByte()), Rangex.coerceAtMost(5.toByte(), 6.toByte()))
        assertEquals(4.toByte(), Rangex.coerceAtMost(5.toByte(), 4.toByte()))
        assertEquals(5.toByte().coerceAtMost(4.toByte()), Rangex.coerceAtMost(5.toByte(), 4.toByte()))

        assertEquals(5.toShort(), Rangex.coerceAtMost(5.toShort(), 6.toShort()))
        assertEquals(5.toShort().coerceAtMost(6.toShort()), Rangex.coerceAtMost(5.toShort(), 6.toShort()))
        assertEquals(4.toShort(), Rangex.coerceAtMost(5.toShort(), 4.toShort()))
        assertEquals(5.toShort().coerceAtMost(4.toShort()), Rangex.coerceAtMost(5.toShort(), 4.toShort()))

        assertEquals(5, Rangex.coerceAtMost(5, 6))
        assertEquals(5.coerceAtMost(6), Rangex.coerceAtMost(5, 6))
        assertEquals(4, Rangex.coerceAtMost(5, 4))
        assertEquals(5.coerceAtMost(4), Rangex.coerceAtMost(5, 4))

        assertEquals(5.toLong(), Rangex.coerceAtMost(5.toLong(), 6.toLong()))
        assertEquals(5.toLong().coerceAtMost(6.toLong()), Rangex.coerceAtMost(5.toLong(), 6.toLong()))
        assertEquals(4.toLong(), Rangex.coerceAtMost(5.toLong(), 4.toLong()))
        assertEquals(5.toLong().coerceAtMost(4.toLong()), Rangex.coerceAtMost(5.toLong(), 4.toLong()))

        assertEquals(5.toFloat(), Rangex.coerceAtMost(5.toFloat(), 6.toFloat()), 0.toFloat())
        assertEquals(5.toFloat().coerceAtMost(6.toFloat()), Rangex.coerceAtMost(5.toFloat(), 6.toFloat()), 0.toFloat())
        assertEquals(4.toFloat(), Rangex.coerceAtMost(5.toFloat(), 4.toFloat()), 0.toFloat())
        assertEquals(5.toFloat().coerceAtMost(4.toFloat()), Rangex.coerceAtMost(5.toFloat(), 4.toFloat()), 0.toFloat())

        assertEquals(5.toDouble(), Rangex.coerceAtMost(5.toDouble(), 6.toDouble()), 0.toDouble())
        assertEquals(5.toDouble().coerceAtMost(6.toDouble()), Rangex.coerceAtMost(5.toDouble(), 6.toDouble()), 0.toDouble())
        assertEquals(4.toDouble(), Rangex.coerceAtMost(5.toDouble(), 4.toDouble()), 0.toDouble())
        assertEquals(5.toDouble().coerceAtMost(4.toDouble()), Rangex.coerceAtMost(5.toDouble(), 4.toDouble()), 0.toDouble())

        assertEquals("5", Rangex.coerceAtMost("5", "6"))
        assertEquals("5".coerceAtMost("6"), Rangex.coerceAtMost("5", "6"))
        assertEquals("4", Rangex.coerceAtMost("5", "4"))
        assertEquals("5".coerceAtMost("4"), Rangex.coerceAtMost("5", "4"))
    }

    @Test
    fun testCoerceIn() {
        assertEquals(5.toByte(), Rangex.coerceIn(5.toByte(), 4.toByte(), 6.toByte()))
        assertEquals(5.toByte().coerceIn(4.toByte(), 6.toByte()), Rangex.coerceIn(5.toByte(), 4.toByte(), 6.toByte()))
        assertEquals(4.toByte(), Rangex.coerceIn(3.toByte(), 4.toByte(), 6.toByte()))
        assertEquals(3.toByte().coerceIn(4.toByte(), 6.toByte()), Rangex.coerceIn(3.toByte(), 4.toByte(), 6.toByte()))
        assertEquals(6.toByte(), Rangex.coerceIn(7.toByte(), 4.toByte(), 6.toByte()))
        assertEquals(7.toByte().coerceIn(4.toByte(), 6.toByte()), Rangex.coerceIn(7.toByte(), 4.toByte(), 6.toByte()))
        try {
            Rangex.coerceIn(7.toByte(), 4.toByte(), 3.toByte())
            Assert.fail()
        } catch (e: Exception) {
        }

        assertEquals(5.toShort(), Rangex.coerceIn(5.toShort(), 4.toShort(), 6.toShort()))
        assertEquals(5.toShort().coerceIn(4.toShort(), 6.toShort()), Rangex.coerceIn(5.toShort(), 4.toShort(), 6.toShort()))
        assertEquals(4.toShort(), Rangex.coerceIn(3.toShort(), 4.toShort(), 6.toShort()))
        assertEquals(3.toShort().coerceIn(4.toShort(), 6.toShort()), Rangex.coerceIn(3.toShort(), 4.toShort(), 6.toShort()))
        assertEquals(6.toShort(), Rangex.coerceIn(7.toShort(), 4.toShort(), 6.toShort()))
        assertEquals(7.toShort().coerceIn(4.toShort(), 6.toShort()), Rangex.coerceIn(7.toShort(), 4.toShort(), 6.toShort()))
        try {
            Rangex.coerceIn(7.toShort(), 4.toShort(), 3.toShort())
            Assert.fail()
        } catch (e: Exception) {
        }

        assertEquals(5, Rangex.coerceIn(5, 4, 6))
        assertEquals(5.coerceIn(4, 6), Rangex.coerceIn(5, 4, 6))
        assertEquals(4, Rangex.coerceIn(3, 4, 6))
        assertEquals(3.coerceIn(4, 6), Rangex.coerceIn(3, 4, 6))
        assertEquals(6, Rangex.coerceIn(7, 4, 6))
        assertEquals(7.coerceIn(4, 6), Rangex.coerceIn(7, 4, 6))
        try {
            Rangex.coerceIn(7, 4, 3)
            Assert.fail()
        } catch (e: Exception) {
        }

        assertEquals(5.toLong(), Rangex.coerceIn(5.toLong(), 4.toLong(), 6.toLong()))
        assertEquals(5.toLong().coerceIn(4.toLong(), 6.toLong()), Rangex.coerceIn(5.toLong(), 4.toLong(), 6.toLong()))
        assertEquals(4.toLong(), Rangex.coerceIn(3.toLong(), 4.toLong(), 6.toLong()))
        assertEquals(3.toLong().coerceIn(4.toLong(), 6.toLong()), Rangex.coerceIn(3.toLong(), 4.toLong(), 6.toLong()))
        assertEquals(6.toLong(), Rangex.coerceIn(7.toLong(), 4.toLong(), 6.toLong()))
        assertEquals(7.toLong().coerceIn(4.toLong(), 6.toLong()), Rangex.coerceIn(7.toLong(), 4.toLong(), 6.toLong()))
        try {
            Rangex.coerceIn(7.toLong(), 4.toLong(), 3.toLong())
            Assert.fail()
        } catch (e: Exception) {
        }

        assertEquals(5.toFloat(), Rangex.coerceIn(5.toFloat(), 4.toFloat(), 6.toFloat()), 0.0f)
        assertEquals(5.toFloat().coerceIn(4.toFloat(), 6.toFloat()), Rangex.coerceIn(5.toFloat(), 4.toFloat(), 6.toFloat()), 0.0f)
        assertEquals(4.toFloat(), Rangex.coerceIn(3.toFloat(), 4.toFloat(), 6.toFloat()), 0.0f)
        assertEquals(3.toFloat().coerceIn(4.toFloat(), 6.toFloat()), Rangex.coerceIn(3.toFloat(), 4.toFloat(), 6.toFloat()), 0.0f)
        assertEquals(6.toFloat(), Rangex.coerceIn(7.toFloat(), 4.toFloat(), 6.toFloat()), 0.0f)
        assertEquals(7.toFloat().coerceIn(4.toFloat(), 6.toFloat()), Rangex.coerceIn(7.toFloat(), 4.toFloat(), 6.toFloat()), 0.0f)
        try {
            Rangex.coerceIn(7.toFloat(), 4.toFloat(), 3.toFloat())
            Assert.fail()
        } catch (e: Exception) {
        }

        assertEquals(5.toDouble(), Rangex.coerceIn(5.toDouble(), 4.toDouble(), 6.toDouble()), 0.0)
        assertEquals(5.toDouble().coerceIn(4.toDouble(), 6.toDouble()), Rangex.coerceIn(5.toDouble(), 4.toDouble(), 6.toDouble()), 0.0)
        assertEquals(4.toDouble(), Rangex.coerceIn(3.toDouble(), 4.toDouble(), 6.toDouble()), 0.0)
        assertEquals(3.toDouble().coerceIn(4.toDouble(), 6.toDouble()), Rangex.coerceIn(3.toDouble(), 4.toDouble(), 6.toDouble()), 0.0)
        assertEquals(6.toDouble(), Rangex.coerceIn(7.toDouble(), 4.toDouble(), 6.toDouble()), 0.0)
        assertEquals(7.toDouble().coerceIn(4.toDouble(), 6.toDouble()), Rangex.coerceIn(7.toDouble(), 4.toDouble(), 6.toDouble()), 0.0)
        try {
            Rangex.coerceIn(7.toDouble(), 4.toDouble(), 3.toDouble())
            Assert.fail()
        } catch (e: Exception) {
        }

        assertEquals("5", Rangex.coerceIn("5", "4", "6"))
        assertEquals("5".coerceIn("4", "6"), Rangex.coerceIn("5", "4", "6"))
        assertEquals("4", Rangex.coerceIn("3", "4", "6"))
        assertEquals("3".coerceIn("4", "6"), Rangex.coerceIn("3", "4", "6"))
        assertEquals("6", Rangex.coerceIn("7", "4", "6"))
        assertEquals("7".coerceIn("4", "6"), Rangex.coerceIn("7", "4", "6"))
        assertEquals("3", Rangex.coerceIn("3", null, "6"))
        assertEquals("7", Rangex.coerceIn("7", "4", null))
        try {
            Rangex.coerceIn("7", "4", "3")
            Assert.fail()
        } catch (e: Exception) {
        }

        assertEquals(5, Rangex.coerceIn(5, Rangex.rangeTo(4, 6)))
        assertEquals(5.coerceIn(4..6), Rangex.coerceIn(5, Rangex.rangeTo(4, 6)))
        assertEquals(4, Rangex.coerceIn(3, Rangex.rangeTo(4, 6)))
        assertEquals(3.coerceIn(4..6), Rangex.coerceIn(3, Rangex.rangeTo(4, 6)))
        assertEquals(6, Rangex.coerceIn(7, Rangex.rangeTo(4, 6)))
        assertEquals(7.coerceIn(4..6), Rangex.coerceIn(7, Rangex.rangeTo(4, 6)))
        try {
            Rangex.coerceIn(7, Rangex.rangeTo(4, 3))
            Assert.fail()
        } catch (e: Exception) {
        }

        assertEquals(5.toLong(), Rangex.coerceIn(5.toLong(), Rangex.rangeTo(4.toLong(), 6.toLong())))
        assertEquals(5.toLong().coerceIn(4.toLong()..6.toLong()), Rangex.coerceIn(5.toLong(), Rangex.rangeTo(4.toLong(), 6.toLong())))
        assertEquals(4.toLong(), Rangex.coerceIn(3.toLong(), Rangex.rangeTo(4.toLong(), 6.toLong())))
        assertEquals(3.toLong().coerceIn(4.toLong()..6.toLong()), Rangex.coerceIn(3.toLong(), Rangex.rangeTo(4.toLong(), 6.toLong())))
        assertEquals(6.toLong(), Rangex.coerceIn(7.toLong(), Rangex.rangeTo(4.toLong(), 6.toLong())))
        assertEquals(7.toLong().coerceIn(4.toLong()..6.toLong()), Rangex.coerceIn(7.toLong(), Rangex.rangeTo(4.toLong(), 6.toLong())))
        try {
            Rangex.coerceIn(7.toLong(), Rangex.rangeTo(4.toLong(), 3.toLong()))
            Assert.fail()
        } catch (e: Exception) {
        }

        assertEquals(5f, Rangex.coerceIn(5f, Rangex.rangeTo(4f, 6f)))
        assertEquals(5f.coerceIn(4f..6f), Rangex.coerceIn(5f, Rangex.rangeTo(4f, 6f)))
        assertEquals(4f, Rangex.coerceIn(3f, Rangex.rangeTo(4f, 6f)))
        assertEquals(3f.coerceIn(4f..6f), Rangex.coerceIn(3f, Rangex.rangeTo(4f, 6f)))
        assertEquals(6f, Rangex.coerceIn(7f, Rangex.rangeTo(4f, 6f)))
        assertEquals(7f.coerceIn(4f..6f), Rangex.coerceIn(7f, Rangex.rangeTo(4f, 6f)))
        try {
            Rangex.coerceIn(7f, Rangex.rangeTo(4f, 3f))
            Assert.fail()
        } catch (e: Exception) {
        }

        assertEquals(5f, Rangex.coerceIn(5f, Rangex.rangeTo(4f, 6f) as ClosedRange<Float>))
        assertEquals(Datex.toDateY("2015"), Rangex.coerceIn(Datex.toDateY("2015"), Rangex.yearRangeTo(Datex.toDateY("2014"), Datex.toDateY("2016"))))
        assertEquals(Datex.toDateY("2014"), Rangex.coerceIn(Datex.toDateY("2013"), Rangex.yearRangeTo(Datex.toDateY("2014"), Datex.toDateY("2016"))))
        assertEquals(Datex.toDateY("2016"), Rangex.coerceIn(Datex.toDateY("2017"), Rangex.yearRangeTo(Datex.toDateY("2014"), Datex.toDateY("2016"))))
        try {
            Rangex.coerceIn(Datex.toDateY("2015"), Rangex.yearRangeTo(Datex.toDateY("2014"), Datex.toDateY("2013")))
            Assert.fail()
        } catch (e: Exception) {
        }
    }
}
