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

package me.panpf.javaxkt.test.util

import me.panpf.javaxkt.util.*
import org.junit.Assert
import org.junit.Test

class RangeTest {

    @Test
    fun testRange() {
        Assert.assertEquals((1..10).count().toLong(), 10)
        Assert.assertEquals((1..1).count().toLong(), 1)
        Assert.assertEquals((0..1).count().toLong(), 2)
        Assert.assertEquals((1..0).count().toLong(), 0)
    }

    @Test
    fun testUnit() {
        Assert.assertEquals((1 until 10).count().toLong(), 9)
        Assert.assertEquals((1 until 1).count().toLong(), 0)
        Assert.assertEquals((1 until 0).count().toLong(), 0)
        Assert.assertEquals((0 until 1).count().toLong(), 1)
    }

    @Test
    fun testDownTo() {
        Assert.assertEquals((10 downTo 1).count().toLong(), 10)
        Assert.assertEquals((1 downTo 1).count().toLong(), 1)
        Assert.assertEquals((0 downTo 1).count().toLong(), 0)
        Assert.assertEquals((1 downTo 0).count().toLong(), 2)
    }

    @Test
    fun testDownUntilTo() {
        Assert.assertEquals((10 downUntilTo 1).count().toLong(), 9)
        Assert.assertEquals((1 downUntilTo 1).count().toLong(), 0)
        Assert.assertEquals((0 downUntilTo 1).count().toLong(), 0)
        Assert.assertEquals((1 downUntilTo 0).count().toLong(), 1)
    }

    @Test
    fun testYearIterator() {
        Assert.assertEquals("2018".yearYRangeTo("2021").joinToString { it.formatY() }, "2018, 2019, 2020, 2021")
        Assert.assertEquals("2018".yearYUntilTo("2022").joinToString { it.formatY() }, "2018, 2019, 2020, 2021")
        Assert.assertEquals("2018".yearYDownTo("2015").joinToString { it.formatY() }, "2018, 2017, 2016, 2015")
        Assert.assertEquals("2018".yearYDownUntilTo("2014").joinToString { it.formatY() }, "2018, 2017, 2016, 2015")

        Assert.assertEquals("2018".toMillisecondY().yearRangeTo("2015".toMillisecondY()).joinToString { it.formatY() }, "")
        Assert.assertEquals("2018".toMillisecondY().yearUntilTo("2015".toMillisecondY()).joinToString { it.formatY() }, "")
        Assert.assertEquals("2018".toMillisecondY().yearDownTo("2021".toMillisecondY()).joinToString { it.formatY() }, "")
        Assert.assertEquals("2018".toMillisecondY().yearDownUntilTo("2021".toMillisecondY()).joinToString { it.formatY() }, "")
    }

    @Test
    fun testMonthIterator() {
        Assert.assertEquals("2018-08".monthYMRangeTo("2018-11").joinToString { it.formatYM() }, "2018-08, 2018-09, 2018-10, 2018-11")
        Assert.assertEquals("2018-08".monthYMUntilTo("2018-12").joinToString { it.formatYM() }, "2018-08, 2018-09, 2018-10, 2018-11")
        Assert.assertEquals("2018-08".monthYMDownTo("2018-05").joinToString { it.formatYM() }, "2018-08, 2018-07, 2018-06, 2018-05")
        Assert.assertEquals("2018-08".monthYMDownUntilTo("2018-04").joinToString { it.formatYM() }, "2018-08, 2018-07, 2018-06, 2018-05")

        Assert.assertEquals("2018-08".toMillisecondYM().monthRangeTo("2018-05".toMillisecondYM()).joinToString { it.formatYM() }, "")
        Assert.assertEquals("2018-08".toMillisecondYM().monthUntilTo("2018-05".toMillisecondYM()).joinToString { it.formatYM() }, "")
        Assert.assertEquals("2018-08".toMillisecondYM().monthDownTo("2018-11".toMillisecondYM()).joinToString { it.formatYM() }, "")
        Assert.assertEquals("2018-08".toMillisecondYM().monthDownUntilTo("2018-11".toMillisecondYM()).joinToString { it.formatYM() }, "")
    }

    @Test
    fun testDayIterator() {
        Assert.assertEquals("2018-08-06".dayYMDRangeTo("2018-08-09").joinToString { it.formatYMD() }, "2018-08-06, 2018-08-07, 2018-08-08, 2018-08-09")
        Assert.assertEquals("2018-08-06".dayYMDUntilTo("2018-08-10").joinToString { it.formatYMD() }, "2018-08-06, 2018-08-07, 2018-08-08, 2018-08-09")
        Assert.assertEquals("2018-08-06".dayYMDDownTo("2018-08-03").joinToString { it.formatYMD() }, "2018-08-06, 2018-08-05, 2018-08-04, 2018-08-03")
        Assert.assertEquals("2018-08-06".dayYMDDownUntilTo("2018-08-02").joinToString { it.formatYMD() }, "2018-08-06, 2018-08-05, 2018-08-04, 2018-08-03")

        Assert.assertEquals("2018-08-06".toMillisecondYMD().dayRangeTo("2018-08-03".toMillisecondYMD()).joinToString { it.formatYMD() }, "")
        Assert.assertEquals("2018-08-06".toMillisecondYMD().dayUntilTo("2018-08-02".toMillisecondYMD()).joinToString { it.formatYMD() }, "")
        Assert.assertEquals("2018-08-06".toMillisecondYMD().dayDownTo("2018-08-09".toMillisecondYMD()).joinToString { it.formatYMD() }, "")
        Assert.assertEquals("2018-08-06".toMillisecondYMD().dayDownUntilTo("2018-08-010".toMillisecondYMD()).joinToString { it.formatYMD() }, "")
    }

    @Test
    fun testHourIterator() {
        Assert.assertEquals("2018-08-06 18".hourYMDHRangeTo("2018-08-06 21").joinToString { it.formatYMDH() }, "2018-08-06 18, 2018-08-06 19, 2018-08-06 20, 2018-08-06 21")
        Assert.assertEquals("2018-08-06 18".hourYMDHUntilTo("2018-08-06 22").joinToString { it.formatYMDH() }, "2018-08-06 18, 2018-08-06 19, 2018-08-06 20, 2018-08-06 21")
        Assert.assertEquals("2018-08-06 18".hourYMDHDownTo("2018-08-06 15").joinToString { it.formatYMDH() }, "2018-08-06 18, 2018-08-06 17, 2018-08-06 16, 2018-08-06 15")
        Assert.assertEquals("2018-08-06 18".hourYMDHDownUntilTo("2018-08-06 14").joinToString { it.formatYMDH() }, "2018-08-06 18, 2018-08-06 17, 2018-08-06 16, 2018-08-06 15")

        Assert.assertEquals("2018-08-06 18".toMillisecondYMDH().hourRangeTo("2018-08-06 15".toMillisecondYMDH()).joinToString { it.formatYMDH() }, "")
        Assert.assertEquals("2018-08-06 18".toMillisecondYMDH().hourUntilTo("2018-08-06 14".toMillisecondYMDH()).joinToString { it.formatYMDH() }, "")
        Assert.assertEquals("2018-08-06 18".toMillisecondYMDH().hourDownTo("2018-08-06 21".toMillisecondYMDH()).joinToString { it.formatYMDH() }, "")
        Assert.assertEquals("2018-08-06 18".toMillisecondYMDH().hourDownUntilTo("2018-08-06 22".toMillisecondYMDH()).joinToString { it.formatYMDH() }, "")
    }

    @Test
    fun testMinuteIterator() {
        Assert.assertEquals("2018-08-06 18:22".minuteYMDHMRangeTo("2018-08-06 18:25").joinToString { it.formatYMDHM() }, "2018-08-06 18:22, 2018-08-06 18:23, 2018-08-06 18:24, 2018-08-06 18:25")
        Assert.assertEquals("2018-08-06 18:22".minuteYMDHMUntilTo("2018-08-06 18:26").joinToString { it.formatYMDHM() }, "2018-08-06 18:22, 2018-08-06 18:23, 2018-08-06 18:24, 2018-08-06 18:25")
        Assert.assertEquals("2018-08-06 18:22".minuteYMDHMDownTo("2018-08-06 18:19").joinToString { it.formatYMDHM() }, "2018-08-06 18:22, 2018-08-06 18:21, 2018-08-06 18:20, 2018-08-06 18:19")
        Assert.assertEquals("2018-08-06 18:22".minuteYMDHMDownUntilTo("2018-08-06 18:18").joinToString { it.formatYMDHM() }, "2018-08-06 18:22, 2018-08-06 18:21, 2018-08-06 18:20, 2018-08-06 18:19")

        Assert.assertEquals("2018-08-06 18:22".toMillisecondYMDHM().minuteRangeTo("2018-08-06 18:19".toMillisecondYMDHM()).joinToString { it.formatYMDHM() }, "")
        Assert.assertEquals("2018-08-06 18:22".toMillisecondYMDHM().minuteUntilTo("2018-08-06 18:18".toMillisecondYMDHM()).joinToString { it.formatYMDHM() }, "")
        Assert.assertEquals("2018-08-06 18:22".toMillisecondYMDHM().minuteDownTo("2018-08-06 18:25".toMillisecondYMDHM()).joinToString { it.formatYMDHM() }, "")
        Assert.assertEquals("2018-08-06 18:22".toMillisecondYMDHM().minuteDownUntilTo("2018-08-06 18:25".toMillisecondYMDHM()).joinToString { it.formatYMDHM() }, "")
    }

    @Test
    fun testSecondIterator() {
        Assert.assertEquals("2018-08-06 18:22:15".secondYMDHMSRangeTo("2018-08-06 18:22:18").joinToString { it.formatYMDHMS() }, "2018-08-06 18:22:15, 2018-08-06 18:22:16, 2018-08-06 18:22:17, 2018-08-06 18:22:18")
        Assert.assertEquals("2018-08-06 18:22:15".secondYMDHMSUntilTo("2018-08-06 18:22:19").joinToString { it.formatYMDHMS() }, "2018-08-06 18:22:15, 2018-08-06 18:22:16, 2018-08-06 18:22:17, 2018-08-06 18:22:18")
        Assert.assertEquals("2018-08-06 18:22:15".secondYMDHMSDownTo("2018-08-06 18:22:12").joinToString { it.formatYMDHMS() }, "2018-08-06 18:22:15, 2018-08-06 18:22:14, 2018-08-06 18:22:13, 2018-08-06 18:22:12")
        Assert.assertEquals("2018-08-06 18:22:15".secondYMDHMSDownUntilTo("2018-08-06 18:22:11").joinToString { it.formatYMDHMS() }, "2018-08-06 18:22:15, 2018-08-06 18:22:14, 2018-08-06 18:22:13, 2018-08-06 18:22:12")

        Assert.assertEquals("2018-08-06 18:22:15".toMillisecondYMDHMS().secondRangeTo("2018-08-06 18:22:12".toMillisecondYMDHMS()).joinToString { it.formatYMDHMS() }, "")
        Assert.assertEquals("2018-08-06 18:22:15".toMillisecondYMDHMS().secondUntilTo("2018-08-06 18:22:11".toMillisecondYMDHMS()).joinToString { it.formatYMDHMS() }, "")
        Assert.assertEquals("2018-08-06 18:22:15".toMillisecondYMDHMS().secondDownTo("2018-08-06 18:22:18".toMillisecondYMDHMS()).joinToString { it.formatYMDHMS() }, "")
        Assert.assertEquals("2018-08-06 18:22:15".toMillisecondYMDHMS().secondDownUntilTo("2018-08-06 18:22:19".toMillisecondYMDHMS()).joinToString { it.formatYMDHMS() }, "")
    }

    @Test
    fun testMillisecondIterator() {
        Assert.assertEquals("2018-08-06 18:22:15 666".millisecondYMDHMSMRangeTo("2018-08-06 18:22:15 669").joinToString { it.formatYMDHMSM() }, "2018-08-06 18:22:15 666, 2018-08-06 18:22:15 667, 2018-08-06 18:22:15 668, 2018-08-06 18:22:15 669")
        Assert.assertEquals("2018-08-06 18:22:15 666".millisecondYMDHMSMUntilTo("2018-08-06 18:22:15 670").joinToString { it.formatYMDHMSM() }, "2018-08-06 18:22:15 666, 2018-08-06 18:22:15 667, 2018-08-06 18:22:15 668, 2018-08-06 18:22:15 669")
        Assert.assertEquals("2018-08-06 18:22:15 666".millisecondYMDHMSMDownTo("2018-08-06 18:22:15 663").joinToString { it.formatYMDHMSM() }, "2018-08-06 18:22:15 666, 2018-08-06 18:22:15 665, 2018-08-06 18:22:15 664, 2018-08-06 18:22:15 663")
        Assert.assertEquals("2018-08-06 18:22:15 666".millisecondYMDHMSMDownUntilTo("2018-08-06 18:22:15 662").joinToString { it.formatYMDHMSM() }, "2018-08-06 18:22:15 666, 2018-08-06 18:22:15 665, 2018-08-06 18:22:15 664, 2018-08-06 18:22:15 663")

        Assert.assertEquals("2018-08-06 18:22:15 666".toMillisecondYMDHMSM().millisecondRangeTo("2018-08-06 18:22:15 663".toMillisecondYMDHMSM()).joinToString { it.formatYMDHMSM() }, "")
        Assert.assertEquals("2018-08-06 18:22:15 666".toMillisecondYMDHMSM().millisecondUntilTo("2018-08-06 18:22:15 662".toMillisecondYMDHMSM()).joinToString { it.formatYMDHMSM() }, "")
        Assert.assertEquals("2018-08-06 18:22:15 666".toMillisecondYMDHMSM().millisecondDownTo("2018-08-06 18:22:15 669".toMillisecondYMDHMSM()).joinToString { it.formatYMDHMSM() }, "")
        Assert.assertEquals("2018-08-06 18:22:15 666".toMillisecondYMDHMSM().millisecondDownUntilTo("2018-08-06 18:22:15 670".toMillisecondYMDHMSM()).joinToString { it.formatYMDHMSM() }, "")
    }

    @Test
    fun testContains() {
        Assert.assertTrue("2018-08-06 18:22:15 666".toDateYMDHMSM() in "2018-08-06 18:22:15 666".millisecondYMDHMSMRangeTo("2018-08-06 18:22:15 669"))
        Assert.assertTrue("2018-08-06 18:22:15 669".toDateYMDHMSM() in "2018-08-06 18:22:15 666".millisecondYMDHMSMRangeTo("2018-08-06 18:22:15 669"))
        Assert.assertTrue("2018-08-06 18:22:15 667".toDateYMDHMSM() in "2018-08-06 18:22:15 666".millisecondYMDHMSMRangeTo("2018-08-06 18:22:15 669"))
        Assert.assertTrue("2018-08-06 18:22:15 668".toDateYMDHMSM() in "2018-08-06 18:22:15 666".millisecondYMDHMSMRangeTo("2018-08-06 18:22:15 669"))

        Assert.assertFalse("2018-08-06 18:22:15 665".toDateYMDHMSM() in "2018-08-06 18:22:15 666".millisecondYMDHMSMRangeTo("2018-08-06 18:22:15 669"))
        Assert.assertFalse("2018-08-06 18:22:15 670".toDateYMDHMSM() in "2018-08-06 18:22:15 666".millisecondYMDHMSMRangeTo("2018-08-06 18:22:15 669"))
    }

    @Test
    fun testEmpty() {
        Assert.assertTrue("2018-08-06 18:22:15 666".millisecondYMDHMSMRangeTo("2018-08-06 18:22:15 665").isEmpty())
        Assert.assertFalse("2018-08-06 18:22:15 666".millisecondYMDHMSMRangeTo("2018-08-06 18:22:15 669").isEmpty())
        Assert.assertFalse("2018-08-06 18:22:15 666".millisecondYMDHMSMRangeTo("2018-08-06 18:22:15 666").isEmpty())
    }
}