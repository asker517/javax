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

package me.panpf.javax.test.ranges

import me.panpf.javax.collections.Collectionx
import me.panpf.javax.ranges.ClosedRange
import me.panpf.javax.ranges.Rangex
import me.panpf.javax.util.Datex
import org.junit.Assert
import org.junit.Assert.*
import org.junit.Test
import java.text.ParseException

class RangexTest {

    @Test
    fun testGetProgressionLastElement() {
        assertEquals(10, Rangex.getProgressionLastElement(0, 10, 1))
        assertEquals(10, Rangex.getProgressionLastElement(0, 11, 2))
        try {
            Rangex.getProgressionLastElement(0, 10, 0)
            Assert.fail()
        } catch (e: IllegalArgumentException) {
        }

        assertEquals(10L, Rangex.getProgressionLastElement(0L, 10L, 1L))
        assertEquals(10L, Rangex.getProgressionLastElement(0L, 11L, 2L))
        try {
            Rangex.getProgressionLastElement(0L, 10L, 0L)
            Assert.fail()
        } catch (e: IllegalArgumentException) {
        }

        assertEquals(0, Rangex.getProgressionLastElement(10, 0, -1))
        assertEquals(1, Rangex.getProgressionLastElement(11, 0, -2))
        try {
            Rangex.getProgressionLastElement(10, 0, 0)
            Assert.fail()
        } catch (e: IllegalArgumentException) {
        }

        assertEquals(0L, Rangex.getProgressionLastElement(10L, 0L, -1L))
        assertEquals(1L, Rangex.getProgressionLastElement(11L, 0L, -2L))
        try {
            Rangex.getProgressionLastElement(10L, 0L, 0L)
            Assert.fail()
        } catch (e: IllegalArgumentException) {
        }
    }

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
        Assert.assertEquals(Collectionx.count(Rangex.rangeTo(1.toByte(), 10.toByte(), 4)).toLong(), 3)

        Assert.assertEquals(Collectionx.count(Rangex.until(1.toByte(), 10.toByte())).toLong(), 9)
        Assert.assertEquals(Collectionx.count(Rangex.until(1.toByte(), 1.toByte())).toLong(), 0)
        Assert.assertEquals(Collectionx.count(Rangex.until(1.toByte(), 0.toByte())).toLong(), 0)
        Assert.assertEquals(Collectionx.count(Rangex.until(0.toByte(), 1.toByte())).toLong(), 1)
        Assert.assertEquals(Collectionx.count(Rangex.until(1.toByte(), 11.toByte(), 4)).toLong(), 3)

        Assert.assertEquals(Collectionx.count(Rangex.downTo(10.toByte(), 1.toByte())).toLong(), 10)
        Assert.assertEquals(Collectionx.count(Rangex.downTo(1.toByte(), 1.toByte())).toLong(), 1)
        Assert.assertEquals(Collectionx.count(Rangex.downTo(0.toByte(), 1.toByte())).toLong(), 0)
        Assert.assertEquals(Collectionx.count(Rangex.downTo(1.toByte(), 0.toByte())).toLong(), 2)
        Assert.assertEquals(Collectionx.count(Rangex.downTo(10.toByte(), 1.toByte(), -4)).toLong(), 3)

        Assert.assertEquals(Collectionx.count(Rangex.downUntilTo(10.toByte(), 1.toByte())).toLong(), 9)
        Assert.assertEquals(Collectionx.count(Rangex.downUntilTo(1.toByte(), 1.toByte())).toLong(), 0)
        Assert.assertEquals(Collectionx.count(Rangex.downUntilTo(0.toByte(), 1.toByte())).toLong(), 0)
        Assert.assertEquals(Collectionx.count(Rangex.downUntilTo(1.toByte(), 0.toByte())).toLong(), 1)
        Assert.assertEquals(Collectionx.count(Rangex.downUntilTo(10.toByte(), 0.toByte(), -4)).toLong(), 3)
    }

    @Test
    fun testShortRange() {
        Assert.assertEquals(Collectionx.count(Rangex.rangeTo(1.toShort(), 10.toShort())).toLong(), 10)
        Assert.assertEquals(Collectionx.count(Rangex.rangeTo(1.toShort(), 1.toShort())).toLong(), 1)
        Assert.assertEquals(Collectionx.count(Rangex.rangeTo(0.toShort(), 1.toShort())).toLong(), 2)
        Assert.assertEquals(Collectionx.count(Rangex.rangeTo(1.toShort(), 0.toShort())).toLong(), 0)
        Assert.assertEquals(Collectionx.count(Rangex.rangeTo(1.toShort(), 10.toShort(), 4)).toLong(), 3)

        Assert.assertEquals(Collectionx.count(Rangex.until(1.toShort(), 10.toShort())).toLong(), 9)
        Assert.assertEquals(Collectionx.count(Rangex.until(1.toShort(), 1.toShort())).toLong(), 0)
        Assert.assertEquals(Collectionx.count(Rangex.until(1.toShort(), 0.toShort())).toLong(), 0)
        Assert.assertEquals(Collectionx.count(Rangex.until(0.toShort(), 1.toShort())).toLong(), 1)
        Assert.assertEquals(Collectionx.count(Rangex.until(1.toShort(), 11.toShort(), 4)).toLong(), 3)

        Assert.assertEquals(Collectionx.count(Rangex.downTo(10.toShort(), 1.toShort())).toLong(), 10)
        Assert.assertEquals(Collectionx.count(Rangex.downTo(1.toShort(), 1.toShort())).toLong(), 1)
        Assert.assertEquals(Collectionx.count(Rangex.downTo(0.toShort(), 1.toShort())).toLong(), 0)
        Assert.assertEquals(Collectionx.count(Rangex.downTo(1.toShort(), 0.toShort())).toLong(), 2)
        Assert.assertEquals(Collectionx.count(Rangex.downTo(10.toShort(), 1.toShort(), -4)).toLong(), 3)

        Assert.assertEquals(Collectionx.count(Rangex.downUntilTo(10.toShort(), 1.toShort())).toLong(), 9)
        Assert.assertEquals(Collectionx.count(Rangex.downUntilTo(1.toShort(), 1.toShort())).toLong(), 0)
        Assert.assertEquals(Collectionx.count(Rangex.downUntilTo(0.toShort(), 1.toShort())).toLong(), 0)
        Assert.assertEquals(Collectionx.count(Rangex.downUntilTo(1.toShort(), 0.toByte().toShort())).toLong(), 1)
        Assert.assertEquals(Collectionx.count(Rangex.downUntilTo(10.toShort(), 0.toShort(), -4)).toLong(), 3)
    }

    @Test
    fun testIntRange() {
        Assert.assertEquals(Collectionx.count(Rangex.rangeTo(1, 10)).toLong(), 10)
        Assert.assertEquals(Collectionx.count(Rangex.rangeTo(1, 1)).toLong(), 1)
        Assert.assertEquals(Collectionx.count(Rangex.rangeTo(0, 1)).toLong(), 2)
        Assert.assertEquals(Collectionx.count(Rangex.rangeTo(1, 0)).toLong(), 0)
        Assert.assertEquals(Collectionx.count(Rangex.rangeTo(1, 10, 4)).toLong(), 3)

        Assert.assertEquals(Collectionx.count(Rangex.until(1, 10)).toLong(), 9)
        Assert.assertEquals(Collectionx.count(Rangex.until(1, 1)).toLong(), 0)
        Assert.assertEquals(Collectionx.count(Rangex.until(1, 0)).toLong(), 0)
        Assert.assertEquals(Collectionx.count(Rangex.until(0, 1)).toLong(), 1)
        Assert.assertEquals(Collectionx.count(Rangex.until(1, 11, 4)).toLong(), 3)

        Assert.assertEquals(Collectionx.count(Rangex.downTo(10, 1)).toLong(), 10)
        Assert.assertEquals(Collectionx.count(Rangex.downTo(1, 1)).toLong(), 1)
        Assert.assertEquals(Collectionx.count(Rangex.downTo(0, 1)).toLong(), 0)
        Assert.assertEquals(Collectionx.count(Rangex.downTo(1, 0)).toLong(), 2)
        Assert.assertEquals(Collectionx.count(Rangex.downTo(10, 1, -4)).toLong(), 3)

        Assert.assertEquals(Collectionx.count(Rangex.downUntilTo(10, 1)).toLong(), 9)
        Assert.assertEquals(Collectionx.count(Rangex.downUntilTo(1, 1)).toLong(), 0)
        Assert.assertEquals(Collectionx.count(Rangex.downUntilTo(0, 1)).toLong(), 0)
        Assert.assertEquals(Collectionx.count(Rangex.downUntilTo(1, 0)).toLong(), 1)
        Assert.assertEquals(Collectionx.count(Rangex.downUntilTo(10, 0, -4)).toLong(), 3)
    }

    @Test
    fun testLongRange() {
        Assert.assertEquals(Collectionx.count(Rangex.rangeTo(1L, 10L)).toLong(), 10)
        Assert.assertEquals(Collectionx.count(Rangex.rangeTo(1L, 1L)).toLong(), 1)
        Assert.assertEquals(Collectionx.count(Rangex.rangeTo(0L, 1L)).toLong(), 2)
        Assert.assertEquals(Collectionx.count(Rangex.rangeTo(1L, 0L)).toLong(), 0)
        Assert.assertEquals(Collectionx.count(Rangex.rangeTo(1L, 10L, 4L)).toLong(), 3)

        Assert.assertEquals(Collectionx.count(Rangex.until(1L, 10L)).toLong(), 9)
        Assert.assertEquals(Collectionx.count(Rangex.until(1L, 1L)).toLong(), 0)
        Assert.assertEquals(Collectionx.count(Rangex.until(1L, 0L)).toLong(), 0)
        Assert.assertEquals(Collectionx.count(Rangex.until(0L, 1L)).toLong(), 1)
        Assert.assertEquals(Collectionx.count(Rangex.until(1L, 11L, 4L)).toLong(), 3)

        Assert.assertEquals(Collectionx.count(Rangex.downTo(10L, 1L)).toLong(), 10)
        Assert.assertEquals(Collectionx.count(Rangex.downTo(1L, 1L)).toLong(), 1)
        Assert.assertEquals(Collectionx.count(Rangex.downTo(0L, 1L)).toLong(), 0)
        Assert.assertEquals(Collectionx.count(Rangex.downTo(1L, 0L)).toLong(), 2)
        Assert.assertEquals(Collectionx.count(Rangex.downTo(10L, 1L, -4L)).toLong(), 3)

        Assert.assertEquals(Collectionx.count(Rangex.downUntilTo(10L, 1L)).toLong(), 9)
        Assert.assertEquals(Collectionx.count(Rangex.downUntilTo(1L, 1L)).toLong(), 0)
        Assert.assertEquals(Collectionx.count(Rangex.downUntilTo(0L, 1L)).toLong(), 0)
        Assert.assertEquals(Collectionx.count(Rangex.downUntilTo(1L, 0L)).toLong(), 1)
        Assert.assertEquals(Collectionx.count(Rangex.downUntilTo(10L, 0L, -4L)).toLong(), 3)
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
        Assert.assertEquals(Collectionx.count(Rangex.rangeTo(1.toChar(), 10.toChar(), 4)).toLong(), 3)

        Assert.assertEquals(Collectionx.count(Rangex.until(1.toChar(), 10.toChar())).toLong(), 9)
        Assert.assertEquals(Collectionx.count(Rangex.until(1.toChar(), 1.toChar())).toLong(), 0)
        Assert.assertEquals(Collectionx.count(Rangex.until(1.toChar(), 0.toChar())).toLong(), 0)
        Assert.assertEquals(Collectionx.count(Rangex.until(0.toChar(), 1.toChar())).toLong(), 1)
        Assert.assertEquals(Collectionx.count(Rangex.until(1.toChar(), 11.toChar(), 4)).toLong(), 3)

        Assert.assertEquals(Collectionx.count(Rangex.downTo(10.toChar(), 1.toChar())).toLong(), 10)
        Assert.assertEquals(Collectionx.count(Rangex.downTo(1.toChar(), 1.toChar())).toLong(), 1)
        Assert.assertEquals(Collectionx.count(Rangex.downTo(0.toChar(), 1.toChar())).toLong(), 0)
        Assert.assertEquals(Collectionx.count(Rangex.downTo(1.toChar(), 0.toChar())).toLong(), 2)
        Assert.assertEquals(Collectionx.count(Rangex.downTo(10.toChar(), 0.toChar(), -4)).toLong(), 3)

        Assert.assertEquals(Collectionx.count(Rangex.downUntilTo(10.toChar(), 1.toChar())).toLong(), 9)
        Assert.assertEquals(Collectionx.count(Rangex.downUntilTo(1.toChar(), 1.toChar())).toLong(), 0)
        Assert.assertEquals(Collectionx.count(Rangex.downUntilTo(0.toChar(), 1.toChar())).toLong(), 0)
        Assert.assertEquals(Collectionx.count(Rangex.downUntilTo(1.toChar(), 0.toChar())).toLong(), 1)
        Assert.assertEquals(Collectionx.count(Rangex.downUntilTo(10.toChar(), 0.toChar(), -4)).toLong(), 3)
    }

    @Test
    fun testYearIterator() {
        Assert.assertEquals(Collectionx.joinToString(Rangex.yearRangeTo(Datex.toDateY("2018"), Datex.toDateY("2021"))) { Datex.formatY(it) }, "2018, 2019, 2020, 2021")
        Assert.assertEquals(Rangex.yearRangeTo(Datex.toDateY("2018"), Datex.toDateY("2021"), 2).joinToString { Datex.formatY(it) }, "2018, 2020")
        Assert.assertEquals(Rangex.yearUntil(Datex.toDateY("2018"), Datex.toDateY("2022")).joinToString { Datex.formatY(it) }, "2018, 2019, 2020, 2021")
        Assert.assertEquals(Rangex.yearUntil(Datex.toDateY("2018"), Datex.toDateY("2022"), 2).joinToString { Datex.formatY(it) }, "2018, 2020")
        Assert.assertEquals(Rangex.yearDownTo(Datex.toDateY("2018"), Datex.toDateY("2015")).joinToString { Datex.formatY(it) }, "2018, 2017, 2016, 2015")
        Assert.assertEquals(Rangex.yearDownTo(Datex.toDateY("2018"), Datex.toDateY("2015"), -2).joinToString { Datex.formatY(it) }, "2018, 2016")
        Assert.assertEquals(Rangex.yearDownUntilTo(Datex.toDateY("2018"), Datex.toDateY("2014")).joinToString { Datex.formatY(it) }, "2018, 2017, 2016, 2015")
        Assert.assertEquals(Rangex.yearDownUntilTo(Datex.toDateY("2018"), Datex.toDateY("2014"), -2).joinToString { Datex.formatY(it) }, "2018, 2016")
        Assert.assertEquals(Rangex.yearRangeTo(Datex.toDateY("2018"), Datex.toDateY("2015")).joinToString { Datex.formatY(it) }, "")
        Assert.assertEquals(Rangex.yearRangeTo(Datex.toDateY("2018"), Datex.toDateY("2021"), -2).joinToString { Datex.formatY(it) }, "")
        Assert.assertEquals(Rangex.yearUntil(Datex.toDateY("2018"), Datex.toDateY("2015")).joinToString { Datex.formatY(it) }, "")
        Assert.assertEquals(Rangex.yearUntil(Datex.toDateY("2018"), Datex.toDateY("2022"), -2).joinToString { Datex.formatY(it) }, "")
        Assert.assertEquals(Rangex.yearDownTo(Datex.toDateY("2018"), Datex.toDateY("2021")).joinToString { Datex.formatY(it) }, "")
        Assert.assertEquals(Rangex.yearDownTo(Datex.toDateY("2018"), Datex.toDateY("2015"), 2).joinToString { Datex.formatY(it) }, "")
        Assert.assertEquals(Rangex.yearDownUntilTo(Datex.toDateY("2018"), Datex.toDateY("2022")).joinToString { Datex.formatY(it) }, "")
        Assert.assertEquals(Rangex.yearDownUntilTo(Datex.toDateY("2018"), Datex.toDateY("2015"), 2).joinToString { Datex.formatY(it) }, "")

        Assert.assertEquals(Rangex.yearRangeTo(Datex.toMillisecondY("2018"), Datex.toMillisecondY("2021")).joinToString { Datex.formatY(it) }, "2018, 2019, 2020, 2021")
        Assert.assertEquals(Rangex.yearRangeTo(Datex.toMillisecondY("2018"), Datex.toMillisecondY("2021"), 2).joinToString { Datex.formatY(it) }, "2018, 2020")
        Assert.assertEquals(Rangex.yearUntil(Datex.toMillisecondY("2018"), Datex.toMillisecondY("2022")).joinToString { Datex.formatY(it) }, "2018, 2019, 2020, 2021")
        Assert.assertEquals(Rangex.yearUntil(Datex.toMillisecondY("2018"), Datex.toMillisecondY("2022"), 2).joinToString { Datex.formatY(it) }, "2018, 2020")
        Assert.assertEquals(Rangex.yearDownTo(Datex.toMillisecondY("2018"), Datex.toMillisecondY("2015")).joinToString { Datex.formatY(it) }, "2018, 2017, 2016, 2015")
        Assert.assertEquals(Rangex.yearDownTo(Datex.toMillisecondY("2018"), Datex.toMillisecondY("2015"), -2).joinToString { Datex.formatY(it) }, "2018, 2016")
        Assert.assertEquals(Rangex.yearDownUntilTo(Datex.toMillisecondY("2018"), Datex.toMillisecondY("2014")).joinToString { Datex.formatY(it) }, "2018, 2017, 2016, 2015")
        Assert.assertEquals(Rangex.yearDownUntilTo(Datex.toMillisecondY("2018"), Datex.toMillisecondY("2014"), -2).joinToString { Datex.formatY(it) }, "2018, 2016")
        Assert.assertEquals(Rangex.yearRangeTo(Datex.toMillisecondY("2018"), Datex.toMillisecondY("2015")).joinToString { Datex.formatY(it) }, "")
        Assert.assertEquals(Rangex.yearRangeTo(Datex.toMillisecondY("2018"), Datex.toMillisecondY("2021"), -2).joinToString { Datex.formatY(it) }, "")
        Assert.assertEquals(Rangex.yearUntil(Datex.toMillisecondY("2018"), Datex.toMillisecondY("2015")).joinToString { Datex.formatY(it) }, "")
        Assert.assertEquals(Rangex.yearUntil(Datex.toMillisecondY("2018"), Datex.toMillisecondY("2022"), -2).joinToString { Datex.formatY(it) }, "")
        Assert.assertEquals(Rangex.yearDownTo(Datex.toMillisecondY("2018"), Datex.toMillisecondY("2021")).joinToString { Datex.formatY(it) }, "")
        Assert.assertEquals(Rangex.yearDownTo(Datex.toMillisecondY("2018"), Datex.toMillisecondY("2015"), 2).joinToString { Datex.formatY(it) }, "")
        Assert.assertEquals(Rangex.yearDownUntilTo(Datex.toMillisecondY("2018"), Datex.toMillisecondY("2022")).joinToString { Datex.formatY(it) }, "")
        Assert.assertEquals(Rangex.yearDownUntilTo(Datex.toMillisecondY("2018"), Datex.toMillisecondY("2015"), 2).joinToString { Datex.formatY(it) }, "")

        Assert.assertEquals(Rangex.yearYRangeTo("2018", "2021").joinToString { Datex.formatY(it) }, "2018, 2019, 2020, 2021")
        Assert.assertEquals(Rangex.yearYRangeTo("2018", "2021", 2).joinToString { Datex.formatY(it) }, "2018, 2020")
        Assert.assertEquals(Rangex.yearYUntil("2018", "2022").joinToString { Datex.formatY(it) }, "2018, 2019, 2020, 2021")
        Assert.assertEquals(Rangex.yearYUntil("2018", "2022", 2).joinToString { Datex.formatY(it) }, "2018, 2020")
        Assert.assertEquals(Rangex.yearYDownTo("2018", "2015").joinToString { Datex.formatY(it) }, "2018, 2017, 2016, 2015")
        Assert.assertEquals(Rangex.yearYDownTo("2018", "2015", -2).joinToString { Datex.formatY(it) }, "2018, 2016")
        Assert.assertEquals(Rangex.yearYDownUntilTo("2018", "2014").joinToString { Datex.formatY(it) }, "2018, 2017, 2016, 2015")
        Assert.assertEquals(Rangex.yearYDownUntilTo("2018", "2014", -2).joinToString { Datex.formatY(it) }, "2018, 2016")
        Assert.assertEquals(Rangex.yearYRangeTo("2018", "2015").joinToString { Datex.formatY(it) }, "")
        Assert.assertEquals(Rangex.yearYRangeTo("2018", "2021", -2).joinToString { Datex.formatY(it) }, "")
        Assert.assertEquals(Rangex.yearYUntil("2018", "2015").joinToString { Datex.formatY(it) }, "")
        Assert.assertEquals(Rangex.yearYUntil("2018", "2022", -2).joinToString { Datex.formatY(it) }, "")
        Assert.assertEquals(Rangex.yearYDownTo("2018", "2021").joinToString { Datex.formatY(it) }, "")
        Assert.assertEquals(Rangex.yearYDownTo("2018", "2015", 2).joinToString { Datex.formatY(it) }, "")
        Assert.assertEquals(Rangex.yearYDownUntilTo("2018", "2022").joinToString { Datex.formatY(it) }, "")
        Assert.assertEquals(Rangex.yearYDownUntilTo("2018", "2015", 2).joinToString { Datex.formatY(it) }, "")
    }

    @Test
    fun testMonthIterator() {
        Assert.assertEquals(Rangex.monthRangeTo(Datex.toDateYM("2018-08"), Datex.toDateYM("2018-11")).joinToString { Datex.formatYM(it) }, "2018-08, 2018-09, 2018-10, 2018-11")
        Assert.assertEquals(Rangex.monthRangeTo(Datex.toDateYM("2018-08"), Datex.toDateYM("2018-11"), 2).joinToString { Datex.formatYM(it) }, "2018-08, 2018-10")
        Assert.assertEquals(Rangex.monthUntil(Datex.toDateYM("2018-08"), Datex.toDateYM("2018-12")).joinToString { Datex.formatYM(it) }, "2018-08, 2018-09, 2018-10, 2018-11")
        Assert.assertEquals(Rangex.monthUntil(Datex.toDateYM("2018-08"), Datex.toDateYM("2018-12"), 2).joinToString { Datex.formatYM(it) }, "2018-08, 2018-10")
        Assert.assertEquals(Rangex.monthDownTo(Datex.toDateYM("2018-08"), Datex.toDateYM("2018-05")).joinToString { Datex.formatYM(it) }, "2018-08, 2018-07, 2018-06, 2018-05")
        Assert.assertEquals(Rangex.monthDownTo(Datex.toDateYM("2018-08"), Datex.toDateYM("2018-05"), -2).joinToString { Datex.formatYM(it) }, "2018-08, 2018-06")
        Assert.assertEquals(Rangex.monthDownUntilTo(Datex.toDateYM("2018-08"), Datex.toDateYM("2018-04")).joinToString { Datex.formatYM(it) }, "2018-08, 2018-07, 2018-06, 2018-05")
        Assert.assertEquals(Rangex.monthDownUntilTo(Datex.toDateYM("2018-08"), Datex.toDateYM("2018-04"), -2).joinToString { Datex.formatYM(it) }, "2018-08, 2018-06")
        Assert.assertEquals(Rangex.monthRangeTo(Datex.toDateYM("2018-08"), Datex.toDateYM("2018-05")).joinToString { Datex.formatYM(it) }, "")
        Assert.assertEquals(Rangex.monthRangeTo(Datex.toDateYM("2018-08"), Datex.toDateYM("2018-11"), -2).joinToString { Datex.formatYM(it) }, "")
        Assert.assertEquals(Rangex.monthUntil(Datex.toDateYM("2018-08"), Datex.toDateYM("2018-04")).joinToString { Datex.formatYM(it) }, "")
        Assert.assertEquals(Rangex.monthUntil(Datex.toDateYM("2018-08"), Datex.toDateYM("2018-12"), -2).joinToString { Datex.formatYM(it) }, "")
        Assert.assertEquals(Rangex.monthDownTo(Datex.toDateYM("2018-08"), Datex.toDateYM("2018-11")).joinToString { Datex.formatYM(it) }, "")
        Assert.assertEquals(Rangex.monthDownTo(Datex.toDateYM("2018-08"), Datex.toDateYM("2018-05"), 2).joinToString { Datex.formatYM(it) }, "")
        Assert.assertEquals(Rangex.monthDownUntilTo(Datex.toDateYM("2018-08"), Datex.toDateYM("2018-12")).joinToString { Datex.formatYM(it) }, "")
        Assert.assertEquals(Rangex.monthDownUntilTo(Datex.toDateYM("2018-08"), Datex.toDateYM("2018-04"), 2).joinToString { Datex.formatYM(it) }, "")

        Assert.assertEquals(Rangex.monthRangeTo(Datex.toMillisecondYM("2018-08"), Datex.toMillisecondYM("2018-11")).joinToString { Datex.formatYM(it) }, "2018-08, 2018-09, 2018-10, 2018-11")
        Assert.assertEquals(Rangex.monthRangeTo(Datex.toMillisecondYM("2018-08"), Datex.toMillisecondYM("2018-11"), 2).joinToString { Datex.formatYM(it) }, "2018-08, 2018-10")
        Assert.assertEquals(Rangex.monthUntil(Datex.toMillisecondYM("2018-08"), Datex.toMillisecondYM("2018-12")).joinToString { Datex.formatYM(it) }, "2018-08, 2018-09, 2018-10, 2018-11")
        Assert.assertEquals(Rangex.monthUntil(Datex.toMillisecondYM("2018-08"), Datex.toMillisecondYM("2018-12"), 2).joinToString { Datex.formatYM(it) }, "2018-08, 2018-10")
        Assert.assertEquals(Rangex.monthDownTo(Datex.toMillisecondYM("2018-08"), Datex.toMillisecondYM("2018-05")).joinToString { Datex.formatYM(it) }, "2018-08, 2018-07, 2018-06, 2018-05")
        Assert.assertEquals(Rangex.monthDownTo(Datex.toMillisecondYM("2018-08"), Datex.toMillisecondYM("2018-05"), -2).joinToString { Datex.formatYM(it) }, "2018-08, 2018-06")
        Assert.assertEquals(Rangex.monthDownUntilTo(Datex.toMillisecondYM("2018-08"), Datex.toMillisecondYM("2018-04")).joinToString { Datex.formatYM(it) }, "2018-08, 2018-07, 2018-06, 2018-05")
        Assert.assertEquals(Rangex.monthDownUntilTo(Datex.toMillisecondYM("2018-08"), Datex.toMillisecondYM("2018-04"), -2).joinToString { Datex.formatYM(it) }, "2018-08, 2018-06")
        Assert.assertEquals(Rangex.monthRangeTo(Datex.toMillisecondYM("2018-08"), Datex.toMillisecondYM("2018-05")).joinToString { Datex.formatYM(it) }, "")
        Assert.assertEquals(Rangex.monthRangeTo(Datex.toMillisecondYM("2018-08"), Datex.toMillisecondYM("2018-11"), -2).joinToString { Datex.formatYM(it) }, "")
        Assert.assertEquals(Rangex.monthUntil(Datex.toMillisecondYM("2018-08"), Datex.toMillisecondYM("2018-04")).joinToString { Datex.formatYM(it) }, "")
        Assert.assertEquals(Rangex.monthUntil(Datex.toMillisecondYM("2018-08"), Datex.toMillisecondYM("2018-12"), -2).joinToString { Datex.formatYM(it) }, "")
        Assert.assertEquals(Rangex.monthDownTo(Datex.toMillisecondYM("2018-08"), Datex.toMillisecondYM("2018-11")).joinToString { Datex.formatYM(it) }, "")
        Assert.assertEquals(Rangex.monthDownTo(Datex.toMillisecondYM("2018-08"), Datex.toMillisecondYM("2018-05"), 2).joinToString { Datex.formatYM(it) }, "")
        Assert.assertEquals(Rangex.monthDownUntilTo(Datex.toMillisecondYM("2018-08"), Datex.toMillisecondYM("2018-12")).joinToString { Datex.formatYM(it) }, "")
        Assert.assertEquals(Rangex.monthDownUntilTo(Datex.toMillisecondYM("2018-08"), Datex.toMillisecondYM("2018-04"), 2).joinToString { Datex.formatYM(it) }, "")

        Assert.assertEquals(Rangex.monthYMRangeTo("2018-08", "2018-11").joinToString { Datex.formatYM(it) }, "2018-08, 2018-09, 2018-10, 2018-11")
        Assert.assertEquals(Rangex.monthYMRangeTo("2018-08", "2018-11", 2).joinToString { Datex.formatYM(it) }, "2018-08, 2018-10")
        Assert.assertEquals(Rangex.monthYMUntil("2018-08", "2018-12").joinToString { Datex.formatYM(it) }, "2018-08, 2018-09, 2018-10, 2018-11")
        Assert.assertEquals(Rangex.monthYMUntil("2018-08", "2018-12", 2).joinToString { Datex.formatYM(it) }, "2018-08, 2018-10")
        Assert.assertEquals(Rangex.monthYMDownTo("2018-08", "2018-05").joinToString { Datex.formatYM(it) }, "2018-08, 2018-07, 2018-06, 2018-05")
        Assert.assertEquals(Rangex.monthYMDownTo("2018-08", "2018-05", -2).joinToString { Datex.formatYM(it) }, "2018-08, 2018-06")
        Assert.assertEquals(Rangex.monthYMDownUntilTo("2018-08", "2018-04").joinToString { Datex.formatYM(it) }, "2018-08, 2018-07, 2018-06, 2018-05")
        Assert.assertEquals(Rangex.monthYMDownUntilTo("2018-08", "2018-04", -2).joinToString { Datex.formatYM(it) }, "2018-08, 2018-06")
        Assert.assertEquals(Rangex.monthYMRangeTo("2018-08", "2018-05").joinToString { Datex.formatYM(it) }, "")
        Assert.assertEquals(Rangex.monthYMRangeTo("2018-08", "2018-11", -2).joinToString { Datex.formatYM(it) }, "")
        Assert.assertEquals(Rangex.monthYMUntil("2018-08", "2018-04").joinToString { Datex.formatYM(it) }, "")
        Assert.assertEquals(Rangex.monthYMUntil("2018-08", "2018-12", -2).joinToString { Datex.formatYM(it) }, "")
        Assert.assertEquals(Rangex.monthYMDownTo("2018-08", "2018-11").joinToString { Datex.formatYM(it) }, "")
        Assert.assertEquals(Rangex.monthYMDownTo("2018-08", "2018-05", 2).joinToString { Datex.formatYM(it) }, "")
        Assert.assertEquals(Rangex.monthYMDownUntilTo("2018-08", "2018-12").joinToString { Datex.formatYM(it) }, "")
        Assert.assertEquals(Rangex.monthYMDownUntilTo("2018-08", "2018-04", 2).joinToString { Datex.formatYM(it) }, "")
    }

    @Test
    fun testDayIterator() {
        Assert.assertEquals(Rangex.dayRangeTo(Datex.toDateYMD("2018-08-06"), Datex.toDateYMD("2018-08-09")).joinToString { Datex.formatYMD(it) }, "2018-08-06, 2018-08-07, 2018-08-08, 2018-08-09")
        Assert.assertEquals(Rangex.dayRangeTo(Datex.toDateYMD("2018-08-06"), Datex.toDateYMD("2018-08-09"), 2).joinToString { Datex.formatYMD(it) }, "2018-08-06, 2018-08-08")
        Assert.assertEquals(Rangex.dayUntil(Datex.toDateYMD("2018-08-06"), Datex.toDateYMD("2018-08-10")).joinToString { Datex.formatYMD(it) }, "2018-08-06, 2018-08-07, 2018-08-08, 2018-08-09")
        Assert.assertEquals(Rangex.dayUntil(Datex.toDateYMD("2018-08-06"), Datex.toDateYMD("2018-08-10"), 2).joinToString { Datex.formatYMD(it) }, "2018-08-06, 2018-08-08")
        Assert.assertEquals(Rangex.dayDownTo(Datex.toDateYMD("2018-08-06"), Datex.toDateYMD("2018-08-03")).joinToString { Datex.formatYMD(it) }, "2018-08-06, 2018-08-05, 2018-08-04, 2018-08-03")
        Assert.assertEquals(Rangex.dayDownTo(Datex.toDateYMD("2018-08-06"), Datex.toDateYMD("2018-08-03"), -2).joinToString { Datex.formatYMD(it) }, "2018-08-06, 2018-08-04")
        Assert.assertEquals(Rangex.dayDownUntilTo(Datex.toDateYMD("2018-08-06"), Datex.toDateYMD("2018-08-02")).joinToString { Datex.formatYMD(it) }, "2018-08-06, 2018-08-05, 2018-08-04, 2018-08-03")
        Assert.assertEquals(Rangex.dayDownUntilTo(Datex.toDateYMD("2018-08-06"), Datex.toDateYMD("2018-08-02"), -2).joinToString { Datex.formatYMD(it) }, "2018-08-06, 2018-08-04")
        Assert.assertEquals(Rangex.dayRangeTo(Datex.toDateYMD("2018-08-06"), Datex.toDateYMD("2018-08-02")).joinToString { Datex.formatYMD(it) }, "")
        Assert.assertEquals(Rangex.dayRangeTo(Datex.toDateYMD("2018-08-06"), Datex.toDateYMD("2018-08-09"), -2).joinToString { Datex.formatYMD(it) }, "")
        Assert.assertEquals(Rangex.dayUntil(Datex.toDateYMD("2018-08-06"), Datex.toDateYMD("2018-08-03")).joinToString { Datex.formatYMD(it) }, "")
        Assert.assertEquals(Rangex.dayUntil(Datex.toDateYMD("2018-08-06"), Datex.toDateYMD("2018-08-10"), -2).joinToString { Datex.formatYMD(it) }, "")
        Assert.assertEquals(Rangex.dayDownTo(Datex.toDateYMD("2018-08-06"), Datex.toDateYMD("2018-08-10")).joinToString { Datex.formatYMD(it) }, "")
        Assert.assertEquals(Rangex.dayDownTo(Datex.toDateYMD("2018-08-06"), Datex.toDateYMD("2018-08-03"), 2).joinToString { Datex.formatYMD(it) }, "")
        Assert.assertEquals(Rangex.dayDownUntilTo(Datex.toDateYMD("2018-08-06"), Datex.toDateYMD("2018-08-09")).joinToString { Datex.formatYMD(it) }, "")
        Assert.assertEquals(Rangex.dayDownUntilTo(Datex.toDateYMD("2018-08-06"), Datex.toDateYMD("2018-08-02"), 2).joinToString { Datex.formatYMD(it) }, "")

        Assert.assertEquals(Rangex.dayRangeTo(Datex.toMillisecondYMD("2018-08-06"), Datex.toMillisecondYMD("2018-08-09")).joinToString { Datex.formatYMD(it) }, "2018-08-06, 2018-08-07, 2018-08-08, 2018-08-09")
        Assert.assertEquals(Rangex.dayRangeTo(Datex.toMillisecondYMD("2018-08-06"), Datex.toMillisecondYMD("2018-08-09"), 2).joinToString { Datex.formatYMD(it) }, "2018-08-06, 2018-08-08")
        Assert.assertEquals(Rangex.dayUntil(Datex.toMillisecondYMD("2018-08-06"), Datex.toMillisecondYMD("2018-08-10")).joinToString { Datex.formatYMD(it) }, "2018-08-06, 2018-08-07, 2018-08-08, 2018-08-09")
        Assert.assertEquals(Rangex.dayUntil(Datex.toMillisecondYMD("2018-08-06"), Datex.toMillisecondYMD("2018-08-10"), 2).joinToString { Datex.formatYMD(it) }, "2018-08-06, 2018-08-08")
        Assert.assertEquals(Rangex.dayDownTo(Datex.toMillisecondYMD("2018-08-06"), Datex.toMillisecondYMD("2018-08-03")).joinToString { Datex.formatYMD(it) }, "2018-08-06, 2018-08-05, 2018-08-04, 2018-08-03")
        Assert.assertEquals(Rangex.dayDownTo(Datex.toMillisecondYMD("2018-08-06"), Datex.toMillisecondYMD("2018-08-03"), -2).joinToString { Datex.formatYMD(it) }, "2018-08-06, 2018-08-04")
        Assert.assertEquals(Rangex.dayDownUntilTo(Datex.toMillisecondYMD("2018-08-06"), Datex.toMillisecondYMD("2018-08-02")).joinToString { Datex.formatYMD(it) }, "2018-08-06, 2018-08-05, 2018-08-04, 2018-08-03")
        Assert.assertEquals(Rangex.dayDownUntilTo(Datex.toMillisecondYMD("2018-08-06"), Datex.toMillisecondYMD("2018-08-02"), -2).joinToString { Datex.formatYMD(it) }, "2018-08-06, 2018-08-04")
        Assert.assertEquals(Rangex.dayRangeTo(Datex.toMillisecondYMD("2018-08-06"), Datex.toMillisecondYMD("2018-08-02")).joinToString { Datex.formatYMD(it) }, "")
        Assert.assertEquals(Rangex.dayRangeTo(Datex.toMillisecondYMD("2018-08-06"), Datex.toMillisecondYMD("2018-08-09"), -2).joinToString { Datex.formatYMD(it) }, "")
        Assert.assertEquals(Rangex.dayUntil(Datex.toMillisecondYMD("2018-08-06"), Datex.toMillisecondYMD("2018-08-03")).joinToString { Datex.formatYMD(it) }, "")
        Assert.assertEquals(Rangex.dayUntil(Datex.toMillisecondYMD("2018-08-06"), Datex.toMillisecondYMD("2018-08-10"), -2).joinToString { Datex.formatYMD(it) }, "")
        Assert.assertEquals(Rangex.dayDownTo(Datex.toMillisecondYMD("2018-08-06"), Datex.toMillisecondYMD("2018-08-10")).joinToString { Datex.formatYMD(it) }, "")
        Assert.assertEquals(Rangex.dayDownTo(Datex.toMillisecondYMD("2018-08-06"), Datex.toMillisecondYMD("2018-08-03"), 2).joinToString { Datex.formatYMD(it) }, "")
        Assert.assertEquals(Rangex.dayDownUntilTo(Datex.toMillisecondYMD("2018-08-06"), Datex.toMillisecondYMD("2018-08-09")).joinToString { Datex.formatYMD(it) }, "")
        Assert.assertEquals(Rangex.dayDownUntilTo(Datex.toMillisecondYMD("2018-08-06"), Datex.toMillisecondYMD("2018-08-02"), 2).joinToString { Datex.formatYMD(it) }, "")

        Assert.assertEquals(Rangex.dayYMDRangeTo("2018-08-06", "2018-08-09").joinToString { Datex.formatYMD(it) }, "2018-08-06, 2018-08-07, 2018-08-08, 2018-08-09")
        Assert.assertEquals(Rangex.dayYMDRangeTo("2018-08-06", "2018-08-09", 2).joinToString { Datex.formatYMD(it) }, "2018-08-06, 2018-08-08")
        Assert.assertEquals(Rangex.dayYMDUntil("2018-08-06", "2018-08-10").joinToString { Datex.formatYMD(it) }, "2018-08-06, 2018-08-07, 2018-08-08, 2018-08-09")
        Assert.assertEquals(Rangex.dayYMDUntil("2018-08-06", "2018-08-10", 2).joinToString { Datex.formatYMD(it) }, "2018-08-06, 2018-08-08")
        Assert.assertEquals(Rangex.dayYMDDownTo("2018-08-06", "2018-08-03").joinToString { Datex.formatYMD(it) }, "2018-08-06, 2018-08-05, 2018-08-04, 2018-08-03")
        Assert.assertEquals(Rangex.dayYMDDownTo("2018-08-06", "2018-08-03", -2).joinToString { Datex.formatYMD(it) }, "2018-08-06, 2018-08-04")
        Assert.assertEquals(Rangex.dayYMDDownUntilTo("2018-08-06", "2018-08-02").joinToString { Datex.formatYMD(it) }, "2018-08-06, 2018-08-05, 2018-08-04, 2018-08-03")
        Assert.assertEquals(Rangex.dayYMDDownUntilTo("2018-08-06", "2018-08-02", -2).joinToString { Datex.formatYMD(it) }, "2018-08-06, 2018-08-04")
        Assert.assertEquals(Rangex.dayYMDRangeTo("2018-08-06", "2018-08-02").joinToString { Datex.formatYMD(it) }, "")
        Assert.assertEquals(Rangex.dayYMDRangeTo("2018-08-06", "2018-08-09", -2).joinToString { Datex.formatYMD(it) }, "")
        Assert.assertEquals(Rangex.dayYMDUntil("2018-08-06", "2018-08-03").joinToString { Datex.formatYMD(it) }, "")
        Assert.assertEquals(Rangex.dayYMDUntil("2018-08-06", "2018-08-10", -2).joinToString { Datex.formatYMD(it) }, "")
        Assert.assertEquals(Rangex.dayYMDDownTo("2018-08-06", "2018-08-10").joinToString { Datex.formatYMD(it) }, "")
        Assert.assertEquals(Rangex.dayYMDDownTo("2018-08-06", "2018-08-03", 2).joinToString { Datex.formatYMD(it) }, "")
        Assert.assertEquals(Rangex.dayYMDDownUntilTo("2018-08-06", "2018-08-09").joinToString { Datex.formatYMD(it) }, "")
        Assert.assertEquals(Rangex.dayYMDDownUntilTo("2018-08-06", "2018-08-02", 2).joinToString { Datex.formatYMD(it) }, "")
    }

    @Test
    fun testHourIterator() {
        Assert.assertEquals(Rangex.hourRangeTo(Datex.toDateYMDH("2018-08-06 18"), Datex.toDateYMDH("2018-08-06 21")).joinToString { Datex.formatYMDH(it) }, "2018-08-06 18, 2018-08-06 19, 2018-08-06 20, 2018-08-06 21")
        Assert.assertEquals(Rangex.hourRangeTo(Datex.toDateYMDH("2018-08-06 18"), Datex.toDateYMDH("2018-08-06 21"), 2).joinToString { Datex.formatYMDH(it) }, "2018-08-06 18, 2018-08-06 20")
        Assert.assertEquals(Rangex.hourUntil(Datex.toDateYMDH("2018-08-06 18"), Datex.toDateYMDH("2018-08-06 22")).joinToString { Datex.formatYMDH(it) }, "2018-08-06 18, 2018-08-06 19, 2018-08-06 20, 2018-08-06 21")
        Assert.assertEquals(Rangex.hourUntil(Datex.toDateYMDH("2018-08-06 18"), Datex.toDateYMDH("2018-08-06 22"), 2).joinToString { Datex.formatYMDH(it) }, "2018-08-06 18, 2018-08-06 20")
        Assert.assertEquals(Rangex.hourDownTo(Datex.toDateYMDH("2018-08-06 18"), Datex.toDateYMDH("2018-08-06 15")).joinToString { Datex.formatYMDH(it) }, "2018-08-06 18, 2018-08-06 17, 2018-08-06 16, 2018-08-06 15")
        Assert.assertEquals(Rangex.hourDownTo(Datex.toDateYMDH("2018-08-06 18"), Datex.toDateYMDH("2018-08-06 15"), -2).joinToString { Datex.formatYMDH(it) }, "2018-08-06 18, 2018-08-06 16")
        Assert.assertEquals(Rangex.hourDownUntilTo(Datex.toDateYMDH("2018-08-06 18"), Datex.toDateYMDH("2018-08-06 14")).joinToString { Datex.formatYMDH(it) }, "2018-08-06 18, 2018-08-06 17, 2018-08-06 16, 2018-08-06 15")
        Assert.assertEquals(Rangex.hourDownUntilTo(Datex.toDateYMDH("2018-08-06 18"), Datex.toDateYMDH("2018-08-06 14"), -2).joinToString { Datex.formatYMDH(it) }, "2018-08-06 18, 2018-08-06 16")
        Assert.assertEquals(Rangex.hourRangeTo(Datex.toDateYMDH("2018-08-06 18"), Datex.toDateYMDH("2018-08-06 14")).joinToString { Datex.formatYMDH(it) }, "")
        Assert.assertEquals(Rangex.hourRangeTo(Datex.toDateYMDH("2018-08-06 18"), Datex.toDateYMDH("2018-08-06 21"), -2).joinToString { Datex.formatYMDH(it) }, "")
        Assert.assertEquals(Rangex.hourUntil(Datex.toDateYMDH("2018-08-06 18"), Datex.toDateYMDH("2018-08-06 15")).joinToString { Datex.formatYMDH(it) }, "")
        Assert.assertEquals(Rangex.hourUntil(Datex.toDateYMDH("2018-08-06 18"), Datex.toDateYMDH("2018-08-06 22"), -2).joinToString { Datex.formatYMDH(it) }, "")
        Assert.assertEquals(Rangex.hourDownTo(Datex.toDateYMDH("2018-08-06 18"), Datex.toDateYMDH("2018-08-06 22")).joinToString { Datex.formatYMDH(it) }, "")
        Assert.assertEquals(Rangex.hourDownTo(Datex.toDateYMDH("2018-08-06 18"), Datex.toDateYMDH("2018-08-06 15"), 2).joinToString { Datex.formatYMDH(it) }, "")
        Assert.assertEquals(Rangex.hourDownUntilTo(Datex.toDateYMDH("2018-08-06 18"), Datex.toDateYMDH("2018-08-06 21")).joinToString { Datex.formatYMDH(it) }, "")
        Assert.assertEquals(Rangex.hourDownUntilTo(Datex.toDateYMDH("2018-08-06 18"), Datex.toDateYMDH("2018-08-06 14"), 2).joinToString { Datex.formatYMDH(it) }, "")

        Assert.assertEquals(Rangex.hourRangeTo(Datex.toMillisecondYMDH("2018-08-06 18"), Datex.toMillisecondYMDH("2018-08-06 21")).joinToString { Datex.formatYMDH(it) }, "2018-08-06 18, 2018-08-06 19, 2018-08-06 20, 2018-08-06 21")
        Assert.assertEquals(Rangex.hourRangeTo(Datex.toMillisecondYMDH("2018-08-06 18"), Datex.toMillisecondYMDH("2018-08-06 21"), 2).joinToString { Datex.formatYMDH(it) }, "2018-08-06 18, 2018-08-06 20")
        Assert.assertEquals(Rangex.hourUntil(Datex.toMillisecondYMDH("2018-08-06 18"), Datex.toMillisecondYMDH("2018-08-06 22")).joinToString { Datex.formatYMDH(it) }, "2018-08-06 18, 2018-08-06 19, 2018-08-06 20, 2018-08-06 21")
        Assert.assertEquals(Rangex.hourUntil(Datex.toMillisecondYMDH("2018-08-06 18"), Datex.toMillisecondYMDH("2018-08-06 22"), 2).joinToString { Datex.formatYMDH(it) }, "2018-08-06 18, 2018-08-06 20")
        Assert.assertEquals(Rangex.hourDownTo(Datex.toMillisecondYMDH("2018-08-06 18"), Datex.toMillisecondYMDH("2018-08-06 15")).joinToString { Datex.formatYMDH(it) }, "2018-08-06 18, 2018-08-06 17, 2018-08-06 16, 2018-08-06 15")
        Assert.assertEquals(Rangex.hourDownTo(Datex.toMillisecondYMDH("2018-08-06 18"), Datex.toMillisecondYMDH("2018-08-06 15"), -2).joinToString { Datex.formatYMDH(it) }, "2018-08-06 18, 2018-08-06 16")
        Assert.assertEquals(Rangex.hourDownUntilTo(Datex.toMillisecondYMDH("2018-08-06 18"), Datex.toMillisecondYMDH("2018-08-06 14")).joinToString { Datex.formatYMDH(it) }, "2018-08-06 18, 2018-08-06 17, 2018-08-06 16, 2018-08-06 15")
        Assert.assertEquals(Rangex.hourDownUntilTo(Datex.toMillisecondYMDH("2018-08-06 18"), Datex.toMillisecondYMDH("2018-08-06 14"), -2).joinToString { Datex.formatYMDH(it) }, "2018-08-06 18, 2018-08-06 16")
        Assert.assertEquals(Rangex.hourRangeTo(Datex.toMillisecondYMDH("2018-08-06 18"), Datex.toMillisecondYMDH("2018-08-06 14")).joinToString { Datex.formatYMDH(it) }, "")
        Assert.assertEquals(Rangex.hourRangeTo(Datex.toMillisecondYMDH("2018-08-06 18"), Datex.toMillisecondYMDH("2018-08-06 21"), -2).joinToString { Datex.formatYMDH(it) }, "")
        Assert.assertEquals(Rangex.hourUntil(Datex.toMillisecondYMDH("2018-08-06 18"), Datex.toMillisecondYMDH("2018-08-06 15")).joinToString { Datex.formatYMDH(it) }, "")
        Assert.assertEquals(Rangex.hourUntil(Datex.toMillisecondYMDH("2018-08-06 18"), Datex.toMillisecondYMDH("2018-08-06 22"), -2).joinToString { Datex.formatYMDH(it) }, "")
        Assert.assertEquals(Rangex.hourDownTo(Datex.toMillisecondYMDH("2018-08-06 18"), Datex.toMillisecondYMDH("2018-08-06 22")).joinToString { Datex.formatYMDH(it) }, "")
        Assert.assertEquals(Rangex.hourDownTo(Datex.toMillisecondYMDH("2018-08-06 18"), Datex.toMillisecondYMDH("2018-08-06 15"), 2).joinToString { Datex.formatYMDH(it) }, "")
        Assert.assertEquals(Rangex.hourDownUntilTo(Datex.toMillisecondYMDH("2018-08-06 18"), Datex.toMillisecondYMDH("2018-08-06 21")).joinToString { Datex.formatYMDH(it) }, "")
        Assert.assertEquals(Rangex.hourDownUntilTo(Datex.toMillisecondYMDH("2018-08-06 18"), Datex.toMillisecondYMDH("2018-08-06 14"), 2).joinToString { Datex.formatYMDH(it) }, "")

        Assert.assertEquals(Rangex.hourYMDHRangeTo("2018-08-06 18", "2018-08-06 21").joinToString { Datex.formatYMDH(it) }, "2018-08-06 18, 2018-08-06 19, 2018-08-06 20, 2018-08-06 21")
        Assert.assertEquals(Rangex.hourYMDHRangeTo("2018-08-06 18", "2018-08-06 21", 2).joinToString { Datex.formatYMDH(it) }, "2018-08-06 18, 2018-08-06 20")
        Assert.assertEquals(Rangex.hourYMDHUntil("2018-08-06 18", "2018-08-06 22").joinToString { Datex.formatYMDH(it) }, "2018-08-06 18, 2018-08-06 19, 2018-08-06 20, 2018-08-06 21")
        Assert.assertEquals(Rangex.hourYMDHUntil("2018-08-06 18", "2018-08-06 22", 2).joinToString { Datex.formatYMDH(it) }, "2018-08-06 18, 2018-08-06 20")
        Assert.assertEquals(Rangex.hourYMDHDownTo("2018-08-06 18", "2018-08-06 15").joinToString { Datex.formatYMDH(it) }, "2018-08-06 18, 2018-08-06 17, 2018-08-06 16, 2018-08-06 15")
        Assert.assertEquals(Rangex.hourYMDHDownTo("2018-08-06 18", "2018-08-06 15", -2).joinToString { Datex.formatYMDH(it) }, "2018-08-06 18, 2018-08-06 16")
        Assert.assertEquals(Rangex.hourYMDHDownUntilTo("2018-08-06 18", "2018-08-06 14").joinToString { Datex.formatYMDH(it) }, "2018-08-06 18, 2018-08-06 17, 2018-08-06 16, 2018-08-06 15")
        Assert.assertEquals(Rangex.hourYMDHDownUntilTo("2018-08-06 18", "2018-08-06 14", -2).joinToString { Datex.formatYMDH(it) }, "2018-08-06 18, 2018-08-06 16")
        Assert.assertEquals(Rangex.hourYMDHRangeTo("2018-08-06 18", "2018-08-06 14").joinToString { Datex.formatYMDH(it) }, "")
        Assert.assertEquals(Rangex.hourYMDHRangeTo("2018-08-06 18", "2018-08-06 21", -2).joinToString { Datex.formatYMDH(it) }, "")
        Assert.assertEquals(Rangex.hourYMDHUntil("2018-08-06 18", "2018-08-06 15").joinToString { Datex.formatYMDH(it) }, "")
        Assert.assertEquals(Rangex.hourYMDHUntil("2018-08-06 18", "2018-08-06 22", -2).joinToString { Datex.formatYMDH(it) }, "")
        Assert.assertEquals(Rangex.hourYMDHDownTo("2018-08-06 18", "2018-08-06 22").joinToString { Datex.formatYMDH(it) }, "")
        Assert.assertEquals(Rangex.hourYMDHDownTo("2018-08-06 18", "2018-08-06 15", 2).joinToString { Datex.formatYMDH(it) }, "")
        Assert.assertEquals(Rangex.hourYMDHDownUntilTo("2018-08-06 18", "2018-08-06 21").joinToString { Datex.formatYMDH(it) }, "")
        Assert.assertEquals(Rangex.hourYMDHDownUntilTo("2018-08-06 18", "2018-08-06 14", 2).joinToString { Datex.formatYMDH(it) }, "")
    }

    @Test
    fun testMinuteIterator() {
        Assert.assertEquals(Rangex.minuteRangeTo(Datex.toDateYMDHM("2018-08-06 18:22"), Datex.toDateYMDHM("2018-08-06 18:25")).joinToString { Datex.formatYMDHM(it) }, "2018-08-06 18:22, 2018-08-06 18:23, 2018-08-06 18:24, 2018-08-06 18:25")
        Assert.assertEquals(Rangex.minuteRangeTo(Datex.toDateYMDHM("2018-08-06 18:22"), Datex.toDateYMDHM("2018-08-06 18:25"), 2).joinToString { Datex.formatYMDHM(it) }, "2018-08-06 18:22, 2018-08-06 18:24")
        Assert.assertEquals(Rangex.minuteUntil(Datex.toDateYMDHM("2018-08-06 18:22"), Datex.toDateYMDHM("2018-08-06 18:26")).joinToString { Datex.formatYMDHM(it) }, "2018-08-06 18:22, 2018-08-06 18:23, 2018-08-06 18:24, 2018-08-06 18:25")
        Assert.assertEquals(Rangex.minuteUntil(Datex.toDateYMDHM("2018-08-06 18:22"), Datex.toDateYMDHM("2018-08-06 18:26"), 2).joinToString { Datex.formatYMDHM(it) }, "2018-08-06 18:22, 2018-08-06 18:24")
        Assert.assertEquals(Rangex.minuteDownTo(Datex.toDateYMDHM("2018-08-06 18:22"), Datex.toDateYMDHM("2018-08-06 18:19")).joinToString { Datex.formatYMDHM(it) }, "2018-08-06 18:22, 2018-08-06 18:21, 2018-08-06 18:20, 2018-08-06 18:19")
        Assert.assertEquals(Rangex.minuteDownTo(Datex.toDateYMDHM("2018-08-06 18:22"), Datex.toDateYMDHM("2018-08-06 18:19"), -2).joinToString { Datex.formatYMDHM(it) }, "2018-08-06 18:22, 2018-08-06 18:20")
        Assert.assertEquals(Rangex.minuteDownUntilTo(Datex.toDateYMDHM("2018-08-06 18:22"), Datex.toDateYMDHM("2018-08-06 18:18")).joinToString { Datex.formatYMDHM(it) }, "2018-08-06 18:22, 2018-08-06 18:21, 2018-08-06 18:20, 2018-08-06 18:19")
        Assert.assertEquals(Rangex.minuteDownUntilTo(Datex.toDateYMDHM("2018-08-06 18:22"), Datex.toDateYMDHM("2018-08-06 18:18"), -2).joinToString { Datex.formatYMDHM(it) }, "2018-08-06 18:22, 2018-08-06 18:20")
        Assert.assertEquals(Rangex.minuteRangeTo(Datex.toDateYMDHM("2018-08-06 18:22"), Datex.toDateYMDHM("2018-08-06 18:18")).joinToString { Datex.formatYMDHM(it) }, "")
        Assert.assertEquals(Rangex.minuteRangeTo(Datex.toDateYMDHM("2018-08-06 18:22"), Datex.toDateYMDHM("2018-08-06 18:25"), -2).joinToString { Datex.formatYMDHM(it) }, "")
        Assert.assertEquals(Rangex.minuteUntil(Datex.toDateYMDHM("2018-08-06 18:22"), Datex.toDateYMDHM("2018-08-06 18:19")).joinToString { Datex.formatYMDHM(it) }, "")
        Assert.assertEquals(Rangex.minuteUntil(Datex.toDateYMDHM("2018-08-06 18:22"), Datex.toDateYMDHM("2018-08-06 18:26"), -2).joinToString { Datex.formatYMDHM(it) }, "")
        Assert.assertEquals(Rangex.minuteDownTo(Datex.toDateYMDHM("2018-08-06 18:22"), Datex.toDateYMDHM("2018-08-06 18:26")).joinToString { Datex.formatYMDHM(it) }, "")
        Assert.assertEquals(Rangex.minuteDownTo(Datex.toDateYMDHM("2018-08-06 18:22"), Datex.toDateYMDHM("2018-08-06 18:19"), 2).joinToString { Datex.formatYMDHM(it) }, "")
        Assert.assertEquals(Rangex.minuteDownUntilTo(Datex.toDateYMDHM("2018-08-06 18:22"), Datex.toDateYMDHM("2018-08-06 18:25")).joinToString { Datex.formatYMDHM(it) }, "")
        Assert.assertEquals(Rangex.minuteDownUntilTo(Datex.toDateYMDHM("2018-08-06 18:22"), Datex.toDateYMDHM("2018-08-06 18:18"), 2).joinToString { Datex.formatYMDHM(it) }, "")

        Assert.assertEquals(Rangex.minuteRangeTo(Datex.toMillisecondYMDHM("2018-08-06 18:22"), Datex.toMillisecondYMDHM("2018-08-06 18:25")).joinToString { Datex.formatYMDHM(it) }, "2018-08-06 18:22, 2018-08-06 18:23, 2018-08-06 18:24, 2018-08-06 18:25")
        Assert.assertEquals(Rangex.minuteRangeTo(Datex.toMillisecondYMDHM("2018-08-06 18:22"), Datex.toMillisecondYMDHM("2018-08-06 18:25"), 2).joinToString { Datex.formatYMDHM(it) }, "2018-08-06 18:22, 2018-08-06 18:24")
        Assert.assertEquals(Rangex.minuteUntil(Datex.toMillisecondYMDHM("2018-08-06 18:22"), Datex.toMillisecondYMDHM("2018-08-06 18:26")).joinToString { Datex.formatYMDHM(it) }, "2018-08-06 18:22, 2018-08-06 18:23, 2018-08-06 18:24, 2018-08-06 18:25")
        Assert.assertEquals(Rangex.minuteUntil(Datex.toMillisecondYMDHM("2018-08-06 18:22"), Datex.toMillisecondYMDHM("2018-08-06 18:26"), 2).joinToString { Datex.formatYMDHM(it) }, "2018-08-06 18:22, 2018-08-06 18:24")
        Assert.assertEquals(Rangex.minuteDownTo(Datex.toMillisecondYMDHM("2018-08-06 18:22"), Datex.toMillisecondYMDHM("2018-08-06 18:19")).joinToString { Datex.formatYMDHM(it) }, "2018-08-06 18:22, 2018-08-06 18:21, 2018-08-06 18:20, 2018-08-06 18:19")
        Assert.assertEquals(Rangex.minuteDownTo(Datex.toMillisecondYMDHM("2018-08-06 18:22"), Datex.toMillisecondYMDHM("2018-08-06 18:19"), -2).joinToString { Datex.formatYMDHM(it) }, "2018-08-06 18:22, 2018-08-06 18:20")
        Assert.assertEquals(Rangex.minuteDownUntilTo(Datex.toMillisecondYMDHM("2018-08-06 18:22"), Datex.toMillisecondYMDHM("2018-08-06 18:18")).joinToString { Datex.formatYMDHM(it) }, "2018-08-06 18:22, 2018-08-06 18:21, 2018-08-06 18:20, 2018-08-06 18:19")
        Assert.assertEquals(Rangex.minuteDownUntilTo(Datex.toMillisecondYMDHM("2018-08-06 18:22"), Datex.toMillisecondYMDHM("2018-08-06 18:18"), -2).joinToString { Datex.formatYMDHM(it) }, "2018-08-06 18:22, 2018-08-06 18:20")
        Assert.assertEquals(Rangex.minuteRangeTo(Datex.toMillisecondYMDHM("2018-08-06 18:22"), Datex.toMillisecondYMDHM("2018-08-06 18:18")).joinToString { Datex.formatYMDHM(it) }, "")
        Assert.assertEquals(Rangex.minuteRangeTo(Datex.toMillisecondYMDHM("2018-08-06 18:22"), Datex.toMillisecondYMDHM("2018-08-06 18:25"), -2).joinToString { Datex.formatYMDHM(it) }, "")
        Assert.assertEquals(Rangex.minuteUntil(Datex.toMillisecondYMDHM("2018-08-06 18:22"), Datex.toMillisecondYMDHM("2018-08-06 18:19")).joinToString { Datex.formatYMDHM(it) }, "")
        Assert.assertEquals(Rangex.minuteUntil(Datex.toMillisecondYMDHM("2018-08-06 18:22"), Datex.toMillisecondYMDHM("2018-08-06 18:26"), -2).joinToString { Datex.formatYMDHM(it) }, "")
        Assert.assertEquals(Rangex.minuteDownTo(Datex.toMillisecondYMDHM("2018-08-06 18:22"), Datex.toMillisecondYMDHM("2018-08-06 18:26")).joinToString { Datex.formatYMDHM(it) }, "")
        Assert.assertEquals(Rangex.minuteDownTo(Datex.toMillisecondYMDHM("2018-08-06 18:22"), Datex.toMillisecondYMDHM("2018-08-06 18:19"), 2).joinToString { Datex.formatYMDHM(it) }, "")
        Assert.assertEquals(Rangex.minuteDownUntilTo(Datex.toMillisecondYMDHM("2018-08-06 18:22"), Datex.toMillisecondYMDHM("2018-08-06 18:25")).joinToString { Datex.formatYMDHM(it) }, "")
        Assert.assertEquals(Rangex.minuteDownUntilTo(Datex.toMillisecondYMDHM("2018-08-06 18:22"), Datex.toMillisecondYMDHM("2018-08-06 18:18"), 2).joinToString { Datex.formatYMDHM(it) }, "")

        Assert.assertEquals(Rangex.minuteYMDHMRangeTo("2018-08-06 18:22", "2018-08-06 18:25").joinToString { Datex.formatYMDHM(it) }, "2018-08-06 18:22, 2018-08-06 18:23, 2018-08-06 18:24, 2018-08-06 18:25")
        Assert.assertEquals(Rangex.minuteYMDHMRangeTo("2018-08-06 18:22", "2018-08-06 18:25", 2).joinToString { Datex.formatYMDHM(it) }, "2018-08-06 18:22, 2018-08-06 18:24")
        Assert.assertEquals(Rangex.minuteYMDHMUntil("2018-08-06 18:22", "2018-08-06 18:26").joinToString { Datex.formatYMDHM(it) }, "2018-08-06 18:22, 2018-08-06 18:23, 2018-08-06 18:24, 2018-08-06 18:25")
        Assert.assertEquals(Rangex.minuteYMDHMUntil("2018-08-06 18:22", "2018-08-06 18:26", 2).joinToString { Datex.formatYMDHM(it) }, "2018-08-06 18:22, 2018-08-06 18:24")
        Assert.assertEquals(Rangex.minuteYMDHMDownTo("2018-08-06 18:22", "2018-08-06 18:19").joinToString { Datex.formatYMDHM(it) }, "2018-08-06 18:22, 2018-08-06 18:21, 2018-08-06 18:20, 2018-08-06 18:19")
        Assert.assertEquals(Rangex.minuteYMDHMDownTo("2018-08-06 18:22", "2018-08-06 18:19", -2).joinToString { Datex.formatYMDHM(it) }, "2018-08-06 18:22, 2018-08-06 18:20")
        Assert.assertEquals(Rangex.minuteYMDHMDownUntilTo("2018-08-06 18:22", "2018-08-06 18:18").joinToString { Datex.formatYMDHM(it) }, "2018-08-06 18:22, 2018-08-06 18:21, 2018-08-06 18:20, 2018-08-06 18:19")
        Assert.assertEquals(Rangex.minuteYMDHMDownUntilTo("2018-08-06 18:22", "2018-08-06 18:18", -2).joinToString { Datex.formatYMDHM(it) }, "2018-08-06 18:22, 2018-08-06 18:20")
        Assert.assertEquals(Rangex.minuteYMDHMRangeTo("2018-08-06 18:22", "2018-08-06 18:18").joinToString { Datex.formatYMDHM(it) }, "")
        Assert.assertEquals(Rangex.minuteYMDHMRangeTo("2018-08-06 18:22", "2018-08-06 18:25", -2).joinToString { Datex.formatYMDHM(it) }, "")
        Assert.assertEquals(Rangex.minuteYMDHMUntil("2018-08-06 18:22", "2018-08-06 18:19").joinToString { Datex.formatYMDHM(it) }, "")
        Assert.assertEquals(Rangex.minuteYMDHMUntil("2018-08-06 18:22", "2018-08-06 18:26", -2).joinToString { Datex.formatYMDHM(it) }, "")
        Assert.assertEquals(Rangex.minuteYMDHMDownTo("2018-08-06 18:22", "2018-08-06 18:26").joinToString { Datex.formatYMDHM(it) }, "")
        Assert.assertEquals(Rangex.minuteYMDHMDownTo("2018-08-06 18:22", "2018-08-06 18:19", 2).joinToString { Datex.formatYMDHM(it) }, "")
        Assert.assertEquals(Rangex.minuteYMDHMDownUntilTo("2018-08-06 18:22", "2018-08-06 18:25").joinToString { Datex.formatYMDHM(it) }, "")
        Assert.assertEquals(Rangex.minuteYMDHMDownUntilTo("2018-08-06 18:22", "2018-08-06 18:18", 2).joinToString { Datex.formatYMDHM(it) }, "")
    }

    @Test
    fun testSecondIterator() {
        Assert.assertEquals(Rangex.secondRangeTo(Datex.toDateYMDHMS("2018-08-06 18:22:15"), Datex.toDateYMDHMS("2018-08-06 18:22:18")).joinToString { Datex.formatYMDHMS(it) }, "2018-08-06 18:22:15, 2018-08-06 18:22:16, 2018-08-06 18:22:17, 2018-08-06 18:22:18")
        Assert.assertEquals(Rangex.secondRangeTo(Datex.toDateYMDHMS("2018-08-06 18:22:15"), Datex.toDateYMDHMS("2018-08-06 18:22:18"), 2).joinToString { Datex.formatYMDHMS(it) }, "2018-08-06 18:22:15, 2018-08-06 18:22:17")
        Assert.assertEquals(Rangex.secondUntil(Datex.toDateYMDHMS("2018-08-06 18:22:15"), Datex.toDateYMDHMS("2018-08-06 18:22:19")).joinToString { Datex.formatYMDHMS(it) }, "2018-08-06 18:22:15, 2018-08-06 18:22:16, 2018-08-06 18:22:17, 2018-08-06 18:22:18")
        Assert.assertEquals(Rangex.secondUntil(Datex.toDateYMDHMS("2018-08-06 18:22:15"), Datex.toDateYMDHMS("2018-08-06 18:22:19"), 2).joinToString { Datex.formatYMDHMS(it) }, "2018-08-06 18:22:15, 2018-08-06 18:22:17")
        Assert.assertEquals(Rangex.secondDownTo(Datex.toDateYMDHMS("2018-08-06 18:22:15"), Datex.toDateYMDHMS("2018-08-06 18:22:12")).joinToString { Datex.formatYMDHMS(it) }, "2018-08-06 18:22:15, 2018-08-06 18:22:14, 2018-08-06 18:22:13, 2018-08-06 18:22:12")
        Assert.assertEquals(Rangex.secondDownTo(Datex.toDateYMDHMS("2018-08-06 18:22:15"), Datex.toDateYMDHMS("2018-08-06 18:22:12"), -2).joinToString { Datex.formatYMDHMS(it) }, "2018-08-06 18:22:15, 2018-08-06 18:22:13")
        Assert.assertEquals(Rangex.secondDownUntilTo(Datex.toDateYMDHMS("2018-08-06 18:22:15"), Datex.toDateYMDHMS("2018-08-06 18:22:11")).joinToString { Datex.formatYMDHMS(it) }, "2018-08-06 18:22:15, 2018-08-06 18:22:14, 2018-08-06 18:22:13, 2018-08-06 18:22:12")
        Assert.assertEquals(Rangex.secondDownUntilTo(Datex.toDateYMDHMS("2018-08-06 18:22:15"), Datex.toDateYMDHMS("2018-08-06 18:22:11"), -2).joinToString { Datex.formatYMDHMS(it) }, "2018-08-06 18:22:15, 2018-08-06 18:22:13")
        Assert.assertEquals(Rangex.secondRangeTo(Datex.toDateYMDHMS("2018-08-06 18:22:15"), Datex.toDateYMDHMS("2018-08-06 18:22:11")).joinToString { Datex.formatYMDHMS(it) }, "")
        Assert.assertEquals(Rangex.secondRangeTo(Datex.toDateYMDHMS("2018-08-06 18:22:15"), Datex.toDateYMDHMS("2018-08-06 18:22:18"), -2).joinToString { Datex.formatYMDHMS(it) }, "")
        Assert.assertEquals(Rangex.secondUntil(Datex.toDateYMDHMS("2018-08-06 18:22:15"), Datex.toDateYMDHMS("2018-08-06 18:22:12")).joinToString { Datex.formatYMDHMS(it) }, "")
        Assert.assertEquals(Rangex.secondUntil(Datex.toDateYMDHMS("2018-08-06 18:22:15"), Datex.toDateYMDHMS("2018-08-06 18:22:19"), -2).joinToString { Datex.formatYMDHMS(it) }, "")
        Assert.assertEquals(Rangex.secondDownTo(Datex.toDateYMDHMS("2018-08-06 18:22:15"), Datex.toDateYMDHMS("2018-08-06 18:22:19")).joinToString { Datex.formatYMDHMS(it) }, "")
        Assert.assertEquals(Rangex.secondDownTo(Datex.toDateYMDHMS("2018-08-06 18:22:15"), Datex.toDateYMDHMS("2018-08-06 18:22:12"), 2).joinToString { Datex.formatYMDHMS(it) }, "")
        Assert.assertEquals(Rangex.secondDownUntilTo(Datex.toDateYMDHMS("2018-08-06 18:22:15"), Datex.toDateYMDHMS("2018-08-06 18:22:18")).joinToString { Datex.formatYMDHMS(it) }, "")
        Assert.assertEquals(Rangex.secondDownUntilTo(Datex.toDateYMDHMS("2018-08-06 18:22:15"), Datex.toDateYMDHMS("2018-08-06 18:22:12"), 2).joinToString { Datex.formatYMDHMS(it) }, "")

        Assert.assertEquals(Rangex.secondRangeTo(Datex.toMillisecondYMDHMS("2018-08-06 18:22:15"), Datex.toMillisecondYMDHMS("2018-08-06 18:22:18")).joinToString { Datex.formatYMDHMS(it) }, "2018-08-06 18:22:15, 2018-08-06 18:22:16, 2018-08-06 18:22:17, 2018-08-06 18:22:18")
        Assert.assertEquals(Rangex.secondRangeTo(Datex.toMillisecondYMDHMS("2018-08-06 18:22:15"), Datex.toMillisecondYMDHMS("2018-08-06 18:22:18"), 2).joinToString { Datex.formatYMDHMS(it) }, "2018-08-06 18:22:15, 2018-08-06 18:22:17")
        Assert.assertEquals(Rangex.secondUntil(Datex.toMillisecondYMDHMS("2018-08-06 18:22:15"), Datex.toMillisecondYMDHMS("2018-08-06 18:22:19")).joinToString { Datex.formatYMDHMS(it) }, "2018-08-06 18:22:15, 2018-08-06 18:22:16, 2018-08-06 18:22:17, 2018-08-06 18:22:18")
        Assert.assertEquals(Rangex.secondUntil(Datex.toMillisecondYMDHMS("2018-08-06 18:22:15"), Datex.toMillisecondYMDHMS("2018-08-06 18:22:19"), 2).joinToString { Datex.formatYMDHMS(it) }, "2018-08-06 18:22:15, 2018-08-06 18:22:17")
        Assert.assertEquals(Rangex.secondDownTo(Datex.toMillisecondYMDHMS("2018-08-06 18:22:15"), Datex.toMillisecondYMDHMS("2018-08-06 18:22:12")).joinToString { Datex.formatYMDHMS(it) }, "2018-08-06 18:22:15, 2018-08-06 18:22:14, 2018-08-06 18:22:13, 2018-08-06 18:22:12")
        Assert.assertEquals(Rangex.secondDownTo(Datex.toMillisecondYMDHMS("2018-08-06 18:22:15"), Datex.toMillisecondYMDHMS("2018-08-06 18:22:12"), -2).joinToString { Datex.formatYMDHMS(it) }, "2018-08-06 18:22:15, 2018-08-06 18:22:13")
        Assert.assertEquals(Rangex.secondDownUntilTo(Datex.toMillisecondYMDHMS("2018-08-06 18:22:15"), Datex.toMillisecondYMDHMS("2018-08-06 18:22:11")).joinToString { Datex.formatYMDHMS(it) }, "2018-08-06 18:22:15, 2018-08-06 18:22:14, 2018-08-06 18:22:13, 2018-08-06 18:22:12")
        Assert.assertEquals(Rangex.secondDownUntilTo(Datex.toMillisecondYMDHMS("2018-08-06 18:22:15"), Datex.toMillisecondYMDHMS("2018-08-06 18:22:11"), -2).joinToString { Datex.formatYMDHMS(it) }, "2018-08-06 18:22:15, 2018-08-06 18:22:13")
        Assert.assertEquals(Rangex.secondRangeTo(Datex.toMillisecondYMDHMS("2018-08-06 18:22:15"), Datex.toMillisecondYMDHMS("2018-08-06 18:22:11")).joinToString { Datex.formatYMDHMS(it) }, "")
        Assert.assertEquals(Rangex.secondRangeTo(Datex.toMillisecondYMDHMS("2018-08-06 18:22:15"), Datex.toMillisecondYMDHMS("2018-08-06 18:22:18"), -2).joinToString { Datex.formatYMDHMS(it) }, "")
        Assert.assertEquals(Rangex.secondUntil(Datex.toMillisecondYMDHMS("2018-08-06 18:22:15"), Datex.toMillisecondYMDHMS("2018-08-06 18:22:12")).joinToString { Datex.formatYMDHMS(it) }, "")
        Assert.assertEquals(Rangex.secondUntil(Datex.toMillisecondYMDHMS("2018-08-06 18:22:15"), Datex.toMillisecondYMDHMS("2018-08-06 18:22:19"), -2).joinToString { Datex.formatYMDHMS(it) }, "")
        Assert.assertEquals(Rangex.secondDownTo(Datex.toMillisecondYMDHMS("2018-08-06 18:22:15"), Datex.toMillisecondYMDHMS("2018-08-06 18:22:19")).joinToString { Datex.formatYMDHMS(it) }, "")
        Assert.assertEquals(Rangex.secondDownTo(Datex.toMillisecondYMDHMS("2018-08-06 18:22:15"), Datex.toMillisecondYMDHMS("2018-08-06 18:22:12"), 2).joinToString { Datex.formatYMDHMS(it) }, "")
        Assert.assertEquals(Rangex.secondDownUntilTo(Datex.toMillisecondYMDHMS("2018-08-06 18:22:15"), Datex.toMillisecondYMDHMS("2018-08-06 18:22:18")).joinToString { Datex.formatYMDHMS(it) }, "")
        Assert.assertEquals(Rangex.secondDownUntilTo(Datex.toMillisecondYMDHMS("2018-08-06 18:22:15"), Datex.toMillisecondYMDHMS("2018-08-06 18:22:12"), 2).joinToString { Datex.formatYMDHMS(it) }, "")

        Assert.assertEquals(Rangex.secondYMDHMSRangeTo("2018-08-06 18:22:15", "2018-08-06 18:22:18").joinToString { Datex.formatYMDHMS(it) }, "2018-08-06 18:22:15, 2018-08-06 18:22:16, 2018-08-06 18:22:17, 2018-08-06 18:22:18")
        Assert.assertEquals(Rangex.secondYMDHMSRangeTo("2018-08-06 18:22:15", "2018-08-06 18:22:18", 2).joinToString { Datex.formatYMDHMS(it) }, "2018-08-06 18:22:15, 2018-08-06 18:22:17")
        Assert.assertEquals(Rangex.secondYMDHMSUntil("2018-08-06 18:22:15", "2018-08-06 18:22:19").joinToString { Datex.formatYMDHMS(it) }, "2018-08-06 18:22:15, 2018-08-06 18:22:16, 2018-08-06 18:22:17, 2018-08-06 18:22:18")
        Assert.assertEquals(Rangex.secondYMDHMSUntil("2018-08-06 18:22:15", "2018-08-06 18:22:19", 2).joinToString { Datex.formatYMDHMS(it) }, "2018-08-06 18:22:15, 2018-08-06 18:22:17")
        Assert.assertEquals(Rangex.secondYMDHMSDownTo("2018-08-06 18:22:15", "2018-08-06 18:22:12").joinToString { Datex.formatYMDHMS(it) }, "2018-08-06 18:22:15, 2018-08-06 18:22:14, 2018-08-06 18:22:13, 2018-08-06 18:22:12")
        Assert.assertEquals(Rangex.secondYMDHMSDownTo("2018-08-06 18:22:15", "2018-08-06 18:22:12", -2).joinToString { Datex.formatYMDHMS(it) }, "2018-08-06 18:22:15, 2018-08-06 18:22:13")
        Assert.assertEquals(Rangex.secondYMDHMSDownUntilTo("2018-08-06 18:22:15", "2018-08-06 18:22:11").joinToString { Datex.formatYMDHMS(it) }, "2018-08-06 18:22:15, 2018-08-06 18:22:14, 2018-08-06 18:22:13, 2018-08-06 18:22:12")
        Assert.assertEquals(Rangex.secondYMDHMSDownUntilTo("2018-08-06 18:22:15", "2018-08-06 18:22:11", -2).joinToString { Datex.formatYMDHMS(it) }, "2018-08-06 18:22:15, 2018-08-06 18:22:13")
        Assert.assertEquals(Rangex.secondYMDHMSRangeTo("2018-08-06 18:22:15", "2018-08-06 18:22:11").joinToString { Datex.formatYMDHMS(it) }, "")
        Assert.assertEquals(Rangex.secondYMDHMSRangeTo("2018-08-06 18:22:15", "2018-08-06 18:22:18", -2).joinToString { Datex.formatYMDHMS(it) }, "")
        Assert.assertEquals(Rangex.secondYMDHMSUntil("2018-08-06 18:22:15", "2018-08-06 18:22:12").joinToString { Datex.formatYMDHMS(it) }, "")
        Assert.assertEquals(Rangex.secondYMDHMSUntil("2018-08-06 18:22:15", "2018-08-06 18:22:19", -2).joinToString { Datex.formatYMDHMS(it) }, "")
        Assert.assertEquals(Rangex.secondYMDHMSDownTo("2018-08-06 18:22:15", "2018-08-06 18:22:19").joinToString { Datex.formatYMDHMS(it) }, "")
        Assert.assertEquals(Rangex.secondYMDHMSDownTo("2018-08-06 18:22:15", "2018-08-06 18:22:12", 2).joinToString { Datex.formatYMDHMS(it) }, "")
        Assert.assertEquals(Rangex.secondYMDHMSDownUntilTo("2018-08-06 18:22:15", "2018-08-06 18:22:18").joinToString { Datex.formatYMDHMS(it) }, "")
        Assert.assertEquals(Rangex.secondYMDHMSDownUntilTo("2018-08-06 18:22:15", "2018-08-06 18:22:12", 2).joinToString { Datex.formatYMDHMS(it) }, "")
    }

    @Test
    fun testMillisecondIterator() {
        Assert.assertEquals(Rangex.millisecondRangeTo(Datex.toDateYMDHMSM("2018-08-06 18:22:15 666"), Datex.toDateYMDHMSM("2018-08-06 18:22:15 669")).joinToString { Datex.formatYMDHMSM(it) }, "2018-08-06 18:22:15 666, 2018-08-06 18:22:15 667, 2018-08-06 18:22:15 668, 2018-08-06 18:22:15 669")
        Assert.assertEquals(Rangex.millisecondRangeTo(Datex.toDateYMDHMSM("2018-08-06 18:22:15 666"), Datex.toDateYMDHMSM("2018-08-06 18:22:15 669"), 2).joinToString { Datex.formatYMDHMSM(it) }, "2018-08-06 18:22:15 666, 2018-08-06 18:22:15 668")
        Assert.assertEquals(Rangex.millisecondUntil(Datex.toDateYMDHMSM("2018-08-06 18:22:15 666"), Datex.toDateYMDHMSM("2018-08-06 18:22:15 670")).joinToString { Datex.formatYMDHMSM(it) }, "2018-08-06 18:22:15 666, 2018-08-06 18:22:15 667, 2018-08-06 18:22:15 668, 2018-08-06 18:22:15 669")
        Assert.assertEquals(Rangex.millisecondUntil(Datex.toDateYMDHMSM("2018-08-06 18:22:15 666"), Datex.toDateYMDHMSM("2018-08-06 18:22:15 670"), 2).joinToString { Datex.formatYMDHMSM(it) }, "2018-08-06 18:22:15 666, 2018-08-06 18:22:15 668")
        Assert.assertEquals(Rangex.millisecondDownTo(Datex.toDateYMDHMSM("2018-08-06 18:22:15 666"), Datex.toDateYMDHMSM("2018-08-06 18:22:15 663")).joinToString { Datex.formatYMDHMSM(it) }, "2018-08-06 18:22:15 666, 2018-08-06 18:22:15 665, 2018-08-06 18:22:15 664, 2018-08-06 18:22:15 663")
        Assert.assertEquals(Rangex.millisecondDownTo(Datex.toDateYMDHMSM("2018-08-06 18:22:15 666"), Datex.toDateYMDHMSM("2018-08-06 18:22:15 663"), -2).joinToString { Datex.formatYMDHMSM(it) }, "2018-08-06 18:22:15 666, 2018-08-06 18:22:15 664")
        Assert.assertEquals(Rangex.millisecondDownUntilTo(Datex.toDateYMDHMSM("2018-08-06 18:22:15 666"), Datex.toDateYMDHMSM("2018-08-06 18:22:15 662")).joinToString { Datex.formatYMDHMSM(it) }, "2018-08-06 18:22:15 666, 2018-08-06 18:22:15 665, 2018-08-06 18:22:15 664, 2018-08-06 18:22:15 663")
        Assert.assertEquals(Rangex.millisecondDownUntilTo(Datex.toDateYMDHMSM("2018-08-06 18:22:15 666"), Datex.toDateYMDHMSM("2018-08-06 18:22:15 662"), -2).joinToString { Datex.formatYMDHMSM(it) }, "2018-08-06 18:22:15 666, 2018-08-06 18:22:15 664")
        Assert.assertEquals(Rangex.millisecondRangeTo(Datex.toDateYMDHMSM("2018-08-06 18:22:15 666"), Datex.toDateYMDHMSM("2018-08-06 18:22:15 662")).joinToString { Datex.formatYMDHMSM(it) }, "")
        Assert.assertEquals(Rangex.millisecondRangeTo(Datex.toDateYMDHMSM("2018-08-06 18:22:15 666"), Datex.toDateYMDHMSM("2018-08-06 18:22:15 669"), -2).joinToString { Datex.formatYMDHMSM(it) }, "")
        Assert.assertEquals(Rangex.millisecondUntil(Datex.toDateYMDHMSM("2018-08-06 18:22:15 666"), Datex.toDateYMDHMSM("2018-08-06 18:22:15 663")).joinToString { Datex.formatYMDHMSM(it) }, "")
        Assert.assertEquals(Rangex.millisecondUntil(Datex.toDateYMDHMSM("2018-08-06 18:22:15 666"), Datex.toDateYMDHMSM("2018-08-06 18:22:15 670"), -2).joinToString { Datex.formatYMDHMSM(it) }, "")
        Assert.assertEquals(Rangex.millisecondDownTo(Datex.toDateYMDHMSM("2018-08-06 18:22:15 666"), Datex.toDateYMDHMSM("2018-08-06 18:22:15 670")).joinToString { Datex.formatYMDHMSM(it) }, "")
        Assert.assertEquals(Rangex.millisecondDownTo(Datex.toDateYMDHMSM("2018-08-06 18:22:15 666"), Datex.toDateYMDHMSM("2018-08-06 18:22:15 663"), 2).joinToString { Datex.formatYMDHMSM(it) }, "")
        Assert.assertEquals(Rangex.millisecondDownUntilTo(Datex.toDateYMDHMSM("2018-08-06 18:22:15 666"), Datex.toDateYMDHMSM("2018-08-06 18:22:15 669")).joinToString { Datex.formatYMDHMSM(it) }, "")
        Assert.assertEquals(Rangex.millisecondDownUntilTo(Datex.toDateYMDHMSM("2018-08-06 18:22:15 666"), Datex.toDateYMDHMSM("2018-08-06 18:22:15 662"), 2).joinToString { Datex.formatYMDHMSM(it) }, "")

        Assert.assertEquals(Rangex.millisecondRangeTo(Datex.toMillisecondYMDHMSM("2018-08-06 18:22:15 666"), Datex.toMillisecondYMDHMSM("2018-08-06 18:22:15 669")).joinToString { Datex.formatYMDHMSM(it) }, "2018-08-06 18:22:15 666, 2018-08-06 18:22:15 667, 2018-08-06 18:22:15 668, 2018-08-06 18:22:15 669")
        Assert.assertEquals(Rangex.millisecondRangeTo(Datex.toMillisecondYMDHMSM("2018-08-06 18:22:15 666"), Datex.toMillisecondYMDHMSM("2018-08-06 18:22:15 669"), 2).joinToString { Datex.formatYMDHMSM(it) }, "2018-08-06 18:22:15 666, 2018-08-06 18:22:15 668")
        Assert.assertEquals(Rangex.millisecondUntil(Datex.toMillisecondYMDHMSM("2018-08-06 18:22:15 666"), Datex.toMillisecondYMDHMSM("2018-08-06 18:22:15 670")).joinToString { Datex.formatYMDHMSM(it) }, "2018-08-06 18:22:15 666, 2018-08-06 18:22:15 667, 2018-08-06 18:22:15 668, 2018-08-06 18:22:15 669")
        Assert.assertEquals(Rangex.millisecondUntil(Datex.toMillisecondYMDHMSM("2018-08-06 18:22:15 666"), Datex.toMillisecondYMDHMSM("2018-08-06 18:22:15 670"), 2).joinToString { Datex.formatYMDHMSM(it) }, "2018-08-06 18:22:15 666, 2018-08-06 18:22:15 668")
        Assert.assertEquals(Rangex.millisecondDownTo(Datex.toMillisecondYMDHMSM("2018-08-06 18:22:15 666"), Datex.toMillisecondYMDHMSM("2018-08-06 18:22:15 663")).joinToString { Datex.formatYMDHMSM(it) }, "2018-08-06 18:22:15 666, 2018-08-06 18:22:15 665, 2018-08-06 18:22:15 664, 2018-08-06 18:22:15 663")
        Assert.assertEquals(Rangex.millisecondDownTo(Datex.toMillisecondYMDHMSM("2018-08-06 18:22:15 666"), Datex.toMillisecondYMDHMSM("2018-08-06 18:22:15 663"), -2).joinToString { Datex.formatYMDHMSM(it) }, "2018-08-06 18:22:15 666, 2018-08-06 18:22:15 664")
        Assert.assertEquals(Rangex.millisecondDownUntilTo(Datex.toMillisecondYMDHMSM("2018-08-06 18:22:15 666"), Datex.toMillisecondYMDHMSM("2018-08-06 18:22:15 662")).joinToString { Datex.formatYMDHMSM(it) }, "2018-08-06 18:22:15 666, 2018-08-06 18:22:15 665, 2018-08-06 18:22:15 664, 2018-08-06 18:22:15 663")
        Assert.assertEquals(Rangex.millisecondDownUntilTo(Datex.toMillisecondYMDHMSM("2018-08-06 18:22:15 666"), Datex.toMillisecondYMDHMSM("2018-08-06 18:22:15 662"), -2).joinToString { Datex.formatYMDHMSM(it) }, "2018-08-06 18:22:15 666, 2018-08-06 18:22:15 664")
        Assert.assertEquals(Rangex.millisecondRangeTo(Datex.toMillisecondYMDHMSM("2018-08-06 18:22:15 666"), Datex.toMillisecondYMDHMSM("2018-08-06 18:22:15 662")).joinToString { Datex.formatYMDHMSM(it) }, "")
        Assert.assertEquals(Rangex.millisecondRangeTo(Datex.toMillisecondYMDHMSM("2018-08-06 18:22:15 666"), Datex.toMillisecondYMDHMSM("2018-08-06 18:22:15 669"), -2).joinToString { Datex.formatYMDHMSM(it) }, "")
        Assert.assertEquals(Rangex.millisecondUntil(Datex.toMillisecondYMDHMSM("2018-08-06 18:22:15 666"), Datex.toMillisecondYMDHMSM("2018-08-06 18:22:15 663")).joinToString { Datex.formatYMDHMSM(it) }, "")
        Assert.assertEquals(Rangex.millisecondUntil(Datex.toMillisecondYMDHMSM("2018-08-06 18:22:15 666"), Datex.toMillisecondYMDHMSM("2018-08-06 18:22:15 670"), -2).joinToString { Datex.formatYMDHMSM(it) }, "")
        Assert.assertEquals(Rangex.millisecondDownTo(Datex.toMillisecondYMDHMSM("2018-08-06 18:22:15 666"), Datex.toMillisecondYMDHMSM("2018-08-06 18:22:15 670")).joinToString { Datex.formatYMDHMSM(it) }, "")
        Assert.assertEquals(Rangex.millisecondDownTo(Datex.toMillisecondYMDHMSM("2018-08-06 18:22:15 666"), Datex.toMillisecondYMDHMSM("2018-08-06 18:22:15 663"), 2).joinToString { Datex.formatYMDHMSM(it) }, "")
        Assert.assertEquals(Rangex.millisecondDownUntilTo(Datex.toMillisecondYMDHMSM("2018-08-06 18:22:15 666"), Datex.toMillisecondYMDHMSM("2018-08-06 18:22:15 669")).joinToString { Datex.formatYMDHMSM(it) }, "")
        Assert.assertEquals(Rangex.millisecondDownUntilTo(Datex.toMillisecondYMDHMSM("2018-08-06 18:22:15 666"), Datex.toMillisecondYMDHMSM("2018-08-06 18:22:15 662"), 2).joinToString { Datex.formatYMDHMSM(it) }, "")

        Assert.assertEquals(Rangex.millisecondYMDHMSMRangeTo("2018-08-06 18:22:15 666", "2018-08-06 18:22:15 669").joinToString { Datex.formatYMDHMSM(it) }, "2018-08-06 18:22:15 666, 2018-08-06 18:22:15 667, 2018-08-06 18:22:15 668, 2018-08-06 18:22:15 669")
        Assert.assertEquals(Rangex.millisecondYMDHMSMRangeTo("2018-08-06 18:22:15 666", "2018-08-06 18:22:15 669", 2).joinToString { Datex.formatYMDHMSM(it) }, "2018-08-06 18:22:15 666, 2018-08-06 18:22:15 668")
        Assert.assertEquals(Rangex.millisecondYMDHMSMUntil("2018-08-06 18:22:15 666", "2018-08-06 18:22:15 670").joinToString { Datex.formatYMDHMSM(it) }, "2018-08-06 18:22:15 666, 2018-08-06 18:22:15 667, 2018-08-06 18:22:15 668, 2018-08-06 18:22:15 669")
        Assert.assertEquals(Rangex.millisecondYMDHMSMUntil("2018-08-06 18:22:15 666", "2018-08-06 18:22:15 670", 2).joinToString { Datex.formatYMDHMSM(it) }, "2018-08-06 18:22:15 666, 2018-08-06 18:22:15 668")
        Assert.assertEquals(Rangex.millisecondYMDHMSMDownTo("2018-08-06 18:22:15 666", "2018-08-06 18:22:15 663").joinToString { Datex.formatYMDHMSM(it) }, "2018-08-06 18:22:15 666, 2018-08-06 18:22:15 665, 2018-08-06 18:22:15 664, 2018-08-06 18:22:15 663")
        Assert.assertEquals(Rangex.millisecondYMDHMSMDownTo("2018-08-06 18:22:15 666", "2018-08-06 18:22:15 663", -2).joinToString { Datex.formatYMDHMSM(it) }, "2018-08-06 18:22:15 666, 2018-08-06 18:22:15 664")
        Assert.assertEquals(Rangex.millisecondYMDHMSMDownUntilTo("2018-08-06 18:22:15 666", "2018-08-06 18:22:15 662").joinToString { Datex.formatYMDHMSM(it) }, "2018-08-06 18:22:15 666, 2018-08-06 18:22:15 665, 2018-08-06 18:22:15 664, 2018-08-06 18:22:15 663")
        Assert.assertEquals(Rangex.millisecondYMDHMSMDownUntilTo("2018-08-06 18:22:15 666", "2018-08-06 18:22:15 662", -2).joinToString { Datex.formatYMDHMSM(it) }, "2018-08-06 18:22:15 666, 2018-08-06 18:22:15 664")
        Assert.assertEquals(Rangex.millisecondYMDHMSMRangeTo("2018-08-06 18:22:15 666", "2018-08-06 18:22:15 662").joinToString { Datex.formatYMDHMSM(it) }, "")
        Assert.assertEquals(Rangex.millisecondYMDHMSMRangeTo("2018-08-06 18:22:15 666", "2018-08-06 18:22:15 669", -2).joinToString { Datex.formatYMDHMSM(it) }, "")
        Assert.assertEquals(Rangex.millisecondYMDHMSMUntil("2018-08-06 18:22:15 666", "2018-08-06 18:22:15 663").joinToString { Datex.formatYMDHMSM(it) }, "")
        Assert.assertEquals(Rangex.millisecondYMDHMSMUntil("2018-08-06 18:22:15 666", "2018-08-06 18:22:15 670", -2).joinToString { Datex.formatYMDHMSM(it) }, "")
        Assert.assertEquals(Rangex.millisecondYMDHMSMDownTo("2018-08-06 18:22:15 666", "2018-08-06 18:22:15 670").joinToString { Datex.formatYMDHMSM(it) }, "")
        Assert.assertEquals(Rangex.millisecondYMDHMSMDownTo("2018-08-06 18:22:15 666", "2018-08-06 18:22:15 663", 2).joinToString { Datex.formatYMDHMSM(it) }, "")
        Assert.assertEquals(Rangex.millisecondYMDHMSMDownUntilTo("2018-08-06 18:22:15 666", "2018-08-06 18:22:15 669").joinToString { Datex.formatYMDHMSM(it) }, "")
        Assert.assertEquals(Rangex.millisecondYMDHMSMDownUntilTo("2018-08-06 18:22:15 666", "2018-08-06 18:22:15 662", 2).joinToString { Datex.formatYMDHMSM(it) }, "")
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
