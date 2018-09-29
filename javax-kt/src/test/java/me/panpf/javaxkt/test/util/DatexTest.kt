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
import java.util.*

class DatexTest {

    @Test
    fun testToDateAndFormat() {
        Assert.assertEquals("2018".toDateY().formatY(), "2018")

        Assert.assertEquals("2018-06".toDateYM().formatYM(), "2018-06")
        Assert.assertEquals("201806".toDateYMCompact().formatYMCompact(), "201806")

        Assert.assertEquals("2018-06-23".toDateYMD().formatYMD(), "2018-06-23")
        Assert.assertEquals("20180623".toDateYMDCompact().formatYMDCompact(), "20180623")

        Assert.assertEquals("2018-06-23 21".toDateYMDH().formatYMDH(), "2018-06-23 21")
        Assert.assertEquals("2018-06-23 21:59".toDateYMDHM().formatYMDHM(), "2018-06-23 21:59")
        Assert.assertEquals("2018-06-23 21:59:01".toDateYMDHMS().formatYMDHMS(), "2018-06-23 21:59:01")
        Assert.assertEquals("2018-06-23 21:59:01 999".toDateYMDHMSM().formatYMDHMSM(), "2018-06-23 21:59:01 999")

        Assert.assertEquals("2016-02-29".toDateYMD().formatYMD(), "2016-02-29")
        Assert.assertEquals("2017-02-29".toDateYMD().formatYMD(), "2017-03-01")
    }

    @Test
    fun testToMillisecondAndFormat() {
        Assert.assertEquals("2018".toMillisecondY().formatY(), "2018")

        Assert.assertEquals("2018-06".toMillisecondYM().formatYM(), "2018-06")
        Assert.assertEquals("201806".toMillisecondYMCompact().formatYMCompact(), "201806")

        Assert.assertEquals("2018-06-23".toMillisecondYMD().formatYMD(), "2018-06-23")
        Assert.assertEquals("20180623".toMillisecondYMDCompact().formatYMDCompact(), "20180623")

        Assert.assertEquals("2018-06-23 21".toMillisecondYMDH().formatYMDH(), "2018-06-23 21")
        Assert.assertEquals("2018-06-23 21:59".toMillisecondYMDHM().formatYMDHM(), "2018-06-23 21:59")
        Assert.assertEquals("2018-06-23 21:59:01".toMillisecondYMDHMS().formatYMDHMS(), "2018-06-23 21:59:01")
        Assert.assertEquals("2018-06-23 21:59:01 999".toMillisecondYMDHMSM().formatYMDHMSM(), "2018-06-23 21:59:01 999")

        Assert.assertEquals("2016-02-29".toMillisecondYMD().formatYMD(), "2016-02-29")
        Assert.assertEquals("2017-02-29".toMillisecondYMD().formatYMD(), "2017-03-01")
    }

    @Test
    fun testDateGet() {
        Assert.assertEquals("2016-02-29 15:59:34 897".toDateYMDHMSM().getCalendarYear(), 2016)
        Assert.assertEquals("2016-02-29 15:59:34 897".toDateYMDHMSM().getCalendarMonth(), 1)
        Assert.assertEquals("2016-02-29 15:59:34 897".toDateYMDHMSM().getCalendarWeekOfYear(), 10)
        Assert.assertEquals("2016-02-29 15:59:34 897".toDateYMDHMSM().getCalendarWeekOfMonth(), 5)
        Assert.assertEquals("2016-02-29 15:59:34 897".toDateYMDHMSM().getCalendarDayOfYear(), 60)
        Assert.assertEquals("2016-02-29 15:59:34 897".toDateYMDHMSM().getCalendarDayOfMonth(), 29)
        Assert.assertEquals("2016-02-29 15:59:34 897".toDateYMDHMSM().getCalendarDayOfWeekInMonth(), 5)
        Assert.assertEquals("2016-02-29 15:59:34 897".toDateYMDHMSM().getCalendarDayOfWeek(), 2)
        Assert.assertEquals("2016-02-29 15:59:34 897".toDateYMDHMSM().getCalendarHourOfDay(), 15)
        Assert.assertEquals("2016-02-29 15:59:34 897".toDateYMDHMSM().getCalendarHour(), 3)
        Assert.assertEquals("2016-02-29 15:59:34 897".toDateYMDHMSM().getCalendarMinute(), 59)
        Assert.assertEquals("2016-02-29 15:59:34 897".toDateYMDHMSM().getCalendarSecond(), 34)
        Assert.assertEquals("2016-02-29 15:59:34 897".toDateYMDHMSM().getCalendarMillisecond(), 897)
        Assert.assertEquals("2016-02-29 15:59:34 897".toDateYMDHMSM().getCalendarField(Calendar.MILLISECOND), 897)
    }

    @Test
    fun testMillisecondGet() {
        Assert.assertEquals("2016-02-29 15:59:34 897".toMillisecondYMDHMSM().getYear(), 2016)
        Assert.assertEquals("2016-02-29 15:59:34 897".toMillisecondYMDHMSM().getMonth(), 1)
        Assert.assertEquals("2016-02-29 15:59:34 897".toMillisecondYMDHMSM().getWeekOfYear(), 10)
        Assert.assertEquals("2016-02-29 15:59:34 897".toMillisecondYMDHMSM().getWeekOfMonth(), 5)
        Assert.assertEquals("2016-02-29 15:59:34 897".toMillisecondYMDHMSM().getDayOfYear(), 60)
        Assert.assertEquals("2016-02-29 15:59:34 897".toMillisecondYMDHMSM().getDayOfMonth(), 29)
        Assert.assertEquals("2016-02-29 15:59:34 897".toMillisecondYMDHMSM().getDayOfWeekInMonth(), 5)
        Assert.assertEquals("2016-02-29 15:59:34 897".toMillisecondYMDHMSM().getDayOfWeek(), 2)
        Assert.assertEquals("2016-02-29 15:59:34 897".toMillisecondYMDHMSM().getHourOfDay(), 15)
        Assert.assertEquals("2016-02-29 15:59:34 897".toMillisecondYMDHMSM().getHour(), 3)
        Assert.assertEquals("2016-02-29 15:59:34 897".toMillisecondYMDHMSM().getMinute(), 59)
        Assert.assertEquals("2016-02-29 15:59:34 897".toMillisecondYMDHMSM().getSecond(), 34)
        Assert.assertEquals("2016-02-29 15:59:34 897".toMillisecondYMDHMSM().getMillisecond(), 897)
        Assert.assertEquals("2016-02-29 15:59:34 897".toMillisecondYMDHMSM().getCalendarField(Calendar.MILLISECOND), 897)
    }

    @Test
    fun testDateAdd() {
        Assert.assertEquals("2016-02-29".toDateYMD().addYear(1, locale = Locale.US).formatYMD(), "2017-02-28")
        Assert.assertEquals("2016-02-29".toDateYMD().addYear(-1, locale = Locale.US).formatYMD(), "2015-02-28")

        Assert.assertEquals("2017-01-29".toDateYMD().addMonth(1, locale = Locale.US).formatYMD(), "2017-02-28")
        Assert.assertEquals("2017-03-29".toDateYMD().addMonth(-1, locale = Locale.US).formatYMD(), "2017-02-28")

        Assert.assertEquals("2016-02-10".toDateYMD().addWeekOfMonth(1, firstDayOfWeek = Calendar.MONDAY, locale = Locale.US).formatYMD(), "2016-02-17")
        Assert.assertEquals("2016-02-10".toDateYMD().addWeekOfMonth(-1, firstDayOfWeek = Calendar.MONDAY, locale = Locale.US).formatYMD(), "2016-02-03")

        Assert.assertEquals("2016-02-10".toDateYMD().addWeekOfYear(1, firstDayOfWeek = Calendar.MONDAY, locale = Locale.US).formatYMD(), "2016-02-17")
        Assert.assertEquals("2016-02-10".toDateYMD().addWeekOfYear(-1, firstDayOfWeek = Calendar.MONDAY, locale = Locale.US).formatYMD(), "2016-02-03")

        Assert.assertEquals("2016-02-29".toDateYMD().addDayOfWeek(1, firstDayOfWeek = Calendar.MONDAY, locale = Locale.US).formatYMD(), "2016-03-01")
        Assert.assertEquals("2016-03-01".toDateYMD().addDayOfWeek(-1, firstDayOfWeek = Calendar.MONDAY, locale = Locale.US).formatYMD(), "2016-02-29")

        Assert.assertEquals("2016-02-29".toDateYMD().addDayOfWeekInMonth(1, firstDayOfWeek = Calendar.MONDAY, locale = Locale.US).formatYMD(), "2016-03-07")
        Assert.assertEquals("2016-03-07".toDateYMD().addDayOfWeekInMonth(-1, firstDayOfWeek = Calendar.MONDAY, locale = Locale.US).formatYMD(), "2016-02-29")

        Assert.assertEquals("2016-02-29".toDateYMD().addDayOfMonth(1, locale = Locale.US).formatYMD(), "2016-03-01")
        Assert.assertEquals("2016-03-01".toDateYMD().addDayOfMonth(-1, locale = Locale.US).formatYMD(), "2016-02-29")

        Assert.assertEquals("2016-02-29".toDateYMD().addDayOfYear(1, locale = Locale.US).formatYMD(), "2016-03-01")
        Assert.assertEquals("2016-03-01".toDateYMD().addDayOfYear(-1, locale = Locale.US).formatYMD(), "2016-02-29")

        Assert.assertEquals("2016-02-29 23:26:33".toDateYMDHMS().addHour(1, locale = Locale.US).formatYMDHMS(), "2016-03-01 00:26:33")
        Assert.assertEquals("2016-03-01 00:26:33".toDateYMDHMS().addHour(-1, locale = Locale.US).formatYMDHMS(), "2016-02-29 23:26:33")

        Assert.assertEquals("2016-02-29 23:26:33".toDateYMDHMS().addHourOfDay(1, locale = Locale.US).formatYMDHMS(), "2016-03-01 00:26:33")
        Assert.assertEquals("2016-03-01 00:26:33".toDateYMDHMS().addHourOfDay(-1, locale = Locale.US).formatYMDHMS(), "2016-02-29 23:26:33")

        Assert.assertEquals("2016-02-29 15:59:33".toDateYMDHMS().addMinute(1, locale = Locale.US).formatYMDHMS(), "2016-02-29 16:00:33")
        Assert.assertEquals("2016-02-29 16:00:33".toDateYMDHMS().addMinute(-1, locale = Locale.US).formatYMDHMS(), "2016-02-29 15:59:33")

        Assert.assertEquals("2016-02-29 15:59:59".toDateYMDHMS().addSecond(1, locale = Locale.US).formatYMDHMS(), "2016-02-29 16:00:00")
        Assert.assertEquals("2016-02-29 16:00:00".toDateYMDHMS().addSecond(-1, locale = Locale.US).formatYMDHMS(), "2016-02-29 15:59:59")

        Assert.assertEquals("2016-02-29 15:59:59 999".toDateYMDHMSM().addMillisecond(1, locale = Locale.US).formatYMDHMSM(), "2016-02-29 16:00:00 000")
        Assert.assertEquals("2016-02-29 16:00:00 000".toDateYMDHMSM().addMillisecond(-1, locale = Locale.US).formatYMDHMSM(), "2016-02-29 15:59:59 999")
    }

    @Test
    fun testMillisecondAdd() {
        Assert.assertEquals("2016-02-29".toMillisecondYMD().addYear(1).formatYMD(), "2017-02-28")
        Assert.assertEquals("2016-02-29".toMillisecondYMD().addYear(-1).formatYMD(), "2015-02-28")

        Assert.assertEquals("2017-01-29".toMillisecondYMD().addMonth(1).formatYMD(), "2017-02-28")
        Assert.assertEquals("2017-03-29".toMillisecondYMD().addMonth(-1).formatYMD(), "2017-02-28")

        Assert.assertEquals("2016-02-10".toMillisecondYMD().addWeekOfMonth(1).formatYMD(), "2016-02-17")
        Assert.assertEquals("2016-02-10".toMillisecondYMD().addWeekOfMonth(-1).formatYMD(), "2016-02-03")

        Assert.assertEquals("2016-02-10".toMillisecondYMD().addWeekOfYear(1).formatYMD(), "2016-02-17")
        Assert.assertEquals("2016-02-10".toMillisecondYMD().addWeekOfYear(-1).formatYMD(), "2016-02-03")

        Assert.assertEquals("2016-02-29".toMillisecondYMD().addDayOfWeek(1).formatYMD(), "2016-03-01")
        Assert.assertEquals("2016-03-01".toMillisecondYMD().addDayOfWeek(-1).formatYMD(), "2016-02-29")

        Assert.assertEquals("2016-02-29".toMillisecondYMD().addDayOfWeekInMonth(1).formatYMD(), "2016-03-07")
        Assert.assertEquals("2016-03-07".toMillisecondYMD().addDayOfWeekInMonth(-1).formatYMD(), "2016-02-29")

        Assert.assertEquals("2016-02-29".toMillisecondYMD().addDayOfMonth(1).formatYMD(), "2016-03-01")
        Assert.assertEquals("2016-03-01".toMillisecondYMD().addDayOfMonth(-1).formatYMD(), "2016-02-29")

        Assert.assertEquals("2016-02-29".toMillisecondYMD().addDayOfYear(1).formatYMD(), "2016-03-01")
        Assert.assertEquals("2016-03-01".toMillisecondYMD().addDayOfYear(-1).formatYMD(), "2016-02-29")

        Assert.assertEquals("2016-02-29 23:26:33".toMillisecondYMDHMS().addHour(1).formatYMDHMS(), "2016-03-01 00:26:33")
        Assert.assertEquals("2016-03-01 00:26:33".toMillisecondYMDHMS().addHour(-1).formatYMDHMS(), "2016-02-29 23:26:33")

        Assert.assertEquals("2016-02-29 23:26:33".toMillisecondYMDHMS().addHourOfDay(1).formatYMDHMS(), "2016-03-01 00:26:33")
        Assert.assertEquals("2016-03-01 00:26:33".toMillisecondYMDHMS().addHourOfDay(-1).formatYMDHMS(), "2016-02-29 23:26:33")

        Assert.assertEquals("2016-02-29 15:59:33".toMillisecondYMDHMS().addMinute(1).formatYMDHMS(), "2016-02-29 16:00:33")
        Assert.assertEquals("2016-02-29 16:00:33".toMillisecondYMDHMS().addMinute(-1).formatYMDHMS(), "2016-02-29 15:59:33")

        Assert.assertEquals("2016-02-29 15:59:59".toMillisecondYMDHMS().addSecond(1).formatYMDHMS(), "2016-02-29 16:00:00")
        Assert.assertEquals("2016-02-29 16:00:00".toMillisecondYMDHMS().addSecond(-1).formatYMDHMS(), "2016-02-29 15:59:59")

        Assert.assertEquals("2016-02-29 15:59:59 999".toMillisecondYMDHMSM().addMillisecond(1).formatYMDHMSM(), "2016-02-29 16:00:00 000")
        Assert.assertEquals("2016-02-29 16:00:00 000".toMillisecondYMDHMSM().addMillisecond(-1).formatYMDHMSM(), "2016-02-29 15:59:59 999")
    }

    @Test
    fun testSameYear() {
        Assert.assertTrue("2018".toDateY().isSameYear("2018".toDateY()))
        Assert.assertFalse("2018".toMillisecondY().isSameYear("2017".toMillisecondY()))
        Assert.assertFalse("2018".toMillisecondY().isSameYear("2019".toMillisecondY()))
    }

    @Test
    fun testSameMonth() {
        Assert.assertTrue("2018-08".toDateYM().isSameMonth("2018-08".toDateYM()))
        Assert.assertTrue("2018-08".toDateYM().isSameMonth("2018-08-01".toDateYMD()))
        Assert.assertTrue("2018-08".toDateYM().isSameMonth("2018-08-31".toDateYMD()))
        Assert.assertFalse("2018-08".toMillisecondYM().isSameMonth("2018-09".toMillisecondYM()))
        Assert.assertFalse("2018-08".toMillisecondYM().isSameMonth("2017-08".toMillisecondYM()))
        Assert.assertFalse("2018-08".toMillisecondYM().isSameMonth("2019-08".toMillisecondYM()))

        Assert.assertTrue("2018-08".toDateYM().isSameMonthOfYear("2019-08".toDateYM()))
        Assert.assertFalse("2018-08".toMillisecondYM().isSameMonthOfYear("2019-07".toMillisecondYM()))
    }

    @Test
    fun testSameWeek() {
        Assert.assertTrue("2018-08-07".toDateYMD().isSameWeek("2018-08-05".toDateYMD()))
        Assert.assertTrue("2018-08-07".toDateYMD().isSameWeek("2018-08-11".toDateYMD()))
        Assert.assertTrue("2018-08-31".toDateYMD().isSameWeek("2018-09-01".toDateYMD()))
        Assert.assertTrue("2018-12-31".toDateYMD().isSameWeek("2019-01-01".toDateYMD()))
        Assert.assertTrue("2019-01-01".toDateYMD().isSameWeek("2018-12-31".toDateYMD()))
        Assert.assertFalse("2018-08-07".toMillisecondYMD().isSameWeek("2018-08-04".toMillisecondYMD()))
        Assert.assertFalse("2018-08-07".toMillisecondYMD().isSameWeek("2018-08-12".toMillisecondYMD()))
        Assert.assertFalse("2019-12-31".toMillisecondYMD().isSameWeek("2018-12-31".toMillisecondYMD()))

        Assert.assertTrue("2018-08-07".toDateYMD().isSameWeek("2018-08-06".toDateYMD(), firstDayOfWeek = Calendar.MONDAY))
        Assert.assertTrue("2018-08-07".toDateYMD().isSameWeek("2018-08-12".toDateYMD(), firstDayOfWeek = Calendar.MONDAY))
        Assert.assertFalse("2018-08-07".toMillisecondYMD().isSameWeek("2018-08-05".toMillisecondYMD(), firstDayOfWeek = Calendar.MONDAY))
        Assert.assertFalse("2018-08-07".toMillisecondYMD().isSameWeek("2018-08-13".toMillisecondYMD(), firstDayOfWeek = Calendar.MONDAY))

        Assert.assertTrue("2018-08-07".toDateYMD().isSameWeekOfYear("2019-08-04".toDateYMD()))
        Assert.assertTrue("2018-08-07".toDateYMD().isSameWeekOfYear("2019-08-10".toDateYMD()))
        Assert.assertFalse("2018-08-07".toMillisecondYMD().isSameWeekOfYear("2019-08-03".toMillisecondYMD()))
        Assert.assertFalse("2018-08-07".toMillisecondYMD().isSameWeekOfYear("2019-08-11".toMillisecondYMD()))

        Assert.assertTrue("2018-08-07".toDateYMD().isSameWeekOfYear("2019-08-05".toDateYMD(), firstDayOfWeek = Calendar.MONDAY))
        Assert.assertTrue("2018-08-07".toDateYMD().isSameWeekOfYear("2019-08-11".toDateYMD(), firstDayOfWeek = Calendar.MONDAY))
        Assert.assertFalse("2018-08-07".toMillisecondYMD().isSameWeekOfYear("2019-08-04".toMillisecondYMD(), firstDayOfWeek = Calendar.MONDAY))
        Assert.assertFalse("2018-08-07".toMillisecondYMD().isSameWeekOfYear("2019-08-12".toMillisecondYMD(), firstDayOfWeek = Calendar.MONDAY))

        Assert.assertTrue("2018-08-07".toDateYMD().isSameWeekOfMonth("2018-07-08".toDateYMD()))
        Assert.assertTrue("2018-08-07".toDateYMD().isSameWeekOfMonth("2018-07-14".toDateYMD()))
        Assert.assertFalse("2018-08-07".toMillisecondYMD().isSameWeekOfMonth("2018-07-07".toMillisecondYMD()))
        Assert.assertFalse("2018-08-07".toMillisecondYMD().isSameWeekOfMonth("2018-07-15".toMillisecondYMD()))

        Assert.assertTrue("2018-08-07".toDateYMD().isSameWeekOfMonth("2018-07-02".toDateYMD(), firstDayOfWeek = Calendar.MONDAY))
        Assert.assertTrue("2018-08-07".toDateYMD().isSameWeekOfMonth("2018-07-08".toDateYMD(), firstDayOfWeek = Calendar.MONDAY))
        Assert.assertFalse("2018-08-07".toMillisecondYMD().isSameWeekOfMonth("2018-07-01".toMillisecondYMD(), firstDayOfWeek = Calendar.MONDAY))
        Assert.assertFalse("2018-08-07".toMillisecondYMD().isSameWeekOfMonth("2018-07-09".toMillisecondYMD(), firstDayOfWeek = Calendar.MONDAY))
    }

    @Test
    fun testSameDay() {
        Assert.assertTrue("2018-08-07".toDateYMD().isSameDay("2018-08-07 01".toDateYMDH()))
        Assert.assertTrue("2018-08-07".toDateYMD().isSameDay("2018-08-07 23".toDateYMDH()))
        Assert.assertFalse("2018-08-07".toMillisecondYMD().isSameDay("2018-08-08".toMillisecondYMD()))
        Assert.assertFalse("2018-08-07".toMillisecondYMD().isSameDay("2018-08-06".toMillisecondYMD()))
        Assert.assertFalse("2018-08-07".toMillisecondYMD().isSameDay("2017-08-07".toMillisecondYMD()))
        Assert.assertFalse("2018-08-07".toMillisecondYMD().isSameDay("2019-08-07".toMillisecondYMD()))

        Assert.assertTrue("2018-08-07".toDateYMD().isSameDayOfYear("2016-08-06".toDateYMD()))
        Assert.assertTrue("2018-08-07".toDateYMD().isSameDayOfYear("2016-08-06 01".toDateYMDH()))
        Assert.assertTrue("2018-08-07".toDateYMD().isSameDayOfYear("2016-08-06 23".toDateYMDH()))
        Assert.assertFalse("2018-08-07".toMillisecondYMD().isSameDayOfYear("2016-08-07".toMillisecondYMD()))

        Assert.assertTrue("2018-08-07".toDateYMD().isSameDayOfMonth("2018-07-07".toDateYMD()))
        Assert.assertTrue("2018-08-07".toDateYMD().isSameDayOfMonth("2019-08-07".toDateYMD()))
        Assert.assertFalse("2018-08-07".toMillisecondYMD().isSameDayOfMonth("2018-08-06".toMillisecondYMD()))

        Assert.assertTrue("2018-08-07".toDateYMD().isSameDayOfWeek("2018-08-14".toDateYMD()))
        Assert.assertTrue("2018-08-07".toDateYMD().isSameDayOfWeek("2018-08-21".toDateYMD()))
        Assert.assertFalse("2018-08-07".toMillisecondYMD().isSameDayOfWeek("2018-08-08".toMillisecondYMD()))
        Assert.assertFalse("2018-08-07".toMillisecondYMD().isSameDayOfWeek("2018-08-15".toMillisecondYMD()))

        Assert.assertTrue("2018-08-07".toDateYMD().isSameDayOfWeek("2018-08-14".toDateYMD(), firstDayOfWeek = Calendar.MONDAY))
        Assert.assertTrue("2018-08-07".toDateYMD().isSameDayOfWeek("2018-08-21".toDateYMD(), firstDayOfWeek = Calendar.MONDAY))
        Assert.assertFalse("2018-08-07".toMillisecondYMD().isSameDayOfWeek("2018-08-08".toMillisecondYMD(), firstDayOfWeek = Calendar.MONDAY))
        Assert.assertFalse("2018-08-07".toMillisecondYMD().isSameDayOfWeek("2018-08-15".toMillisecondYMD(), firstDayOfWeek = Calendar.MONDAY))

        Assert.assertTrue("2018-08-07".toDateYMD().isSameDayOfWeekInMonth("2018-08-01".toDateYMD()))
        Assert.assertTrue("2018-08-07".toDateYMD().isSameDayOfWeekInMonth("2018-08-07".toDateYMD()))
        Assert.assertFalse("2018-08-07".toMillisecondYMD().isSameDayOfWeekInMonth("2018-07-08".toMillisecondYMD()))

        Assert.assertTrue("2018-08-07".toDateYMD().isSameDayOfWeekInMonth("2018-08-01".toDateYMD(), firstDayOfWeek = Calendar.MONDAY))
        Assert.assertTrue("2018-08-07".toDateYMD().isSameDayOfWeekInMonth("2018-08-07".toDateYMD(), firstDayOfWeek = Calendar.MONDAY))
        Assert.assertFalse("2018-08-07".toMillisecondYMD().isSameDayOfWeekInMonth("2018-07-08".toMillisecondYMD(), firstDayOfWeek = Calendar.MONDAY))
    }

    @Test
    fun testSameHour() {
        Assert.assertTrue("2018-08-07 13".toDateYMDH().isSameHour("2018-08-07 13:01".toDateYMDHM()))
        Assert.assertTrue("2018-08-07 13".toDateYMDH().isSameHour("2018-08-07 13:59".toDateYMDHM()))
        Assert.assertFalse("2018-08-07 13".toMillisecondYMDH().isSameHour("2018-08-07 14:00".toMillisecondYMDHM()))
        Assert.assertFalse("2018-08-07 13".toMillisecondYMDH().isSameHour("2018-08-07 12:59".toMillisecondYMDHM()))

        Assert.assertTrue("2018-08-07 13".toDateYMDH().isSameHourOf24H("2018-08-06 13".toDateYMDH()))
        Assert.assertFalse("2018-08-07 13".toMillisecondYMDH().isSameHourOf24H("2018-08-06 14".toMillisecondYMDH()))

        Assert.assertTrue("2018-08-07 13".toDateYMDH().isSameHourOf12H("2018-08-07 01".toDateYMDH()))
        Assert.assertFalse("2018-08-07 13".toMillisecondYMDH().isSameHourOf12H("2018-08-07 02".toMillisecondYMDH()))
    }

    @Test
    fun testSameMinute() {
        Assert.assertTrue("2018-08-07 13:01".toDateYMDHM().isSameMinute("2018-08-07 13:01:01".toDateYMDHMS()))
        Assert.assertTrue("2018-08-07 13:01".toDateYMDHM().isSameMinute("2018-08-07 13:01:59".toDateYMDHMS()))
        Assert.assertFalse("2018-08-07 13:01".toMillisecondYMDHM().isSameMinute("2018-08-07 13:02:00".toMillisecondYMDHMS()))
        Assert.assertFalse("2018-08-07 13:01".toMillisecondYMDHM().isSameMinute("2018-08-07 13:00:59".toMillisecondYMDHMS()))

        Assert.assertTrue("2018-08-07 13:01".toDateYMDHM().isSameMinuteOfHour("2018-08-07 14:01".toDateYMDHM()))
        Assert.assertFalse("2018-08-07 13:01".toMillisecondYMDHM().isSameMinuteOfHour("2018-08-07 14:02".toMillisecondYMDHM()))
    }

    @Test
    fun testSameSecond() {
        Assert.assertTrue("2018-08-07 13:01:25".toDateYMDHMS().isSameSecond("2018-08-07 13:01:25 001".toDateYMDHMSM()))
        Assert.assertTrue("2018-08-07 13:01:25".toDateYMDHMS().isSameSecond("2018-08-07 13:01:25 999".toDateYMDHMSM()))
        Assert.assertFalse("2018-08-07 13:01:25".toMillisecondYMDHMS().isSameSecond("2018-08-07 13:01:26 000".toMillisecondYMDHMSM()))
        Assert.assertFalse("2018-08-07 13:01:25".toMillisecondYMDHMS().isSameSecond("2018-08-07 13:01:24 999".toMillisecondYMDHMSM()))

        Assert.assertTrue("2018-08-07 13:01:25".toDateYMDHMS().isSameSecondOfMinute("2018-08-07 13:02:25".toDateYMDHMS()))
        Assert.assertFalse("2018-08-07 13:01:25".toMillisecondYMDHMS().isSameSecondOfMinute("2018-08-07 13:02:26".toMillisecondYMDHMS()))
    }

    @Test
    fun testSameMillisecond() {
        Assert.assertTrue("2018-08-07 13:01:25 333".toDateYMDHMSM().isSameMillisecond("2018-08-07 13:01:25 333".toDateYMDHMSM()))
        Assert.assertFalse("2018-08-07 13:01:25 333".toDateYMDHMSM().isSameMillisecond("2018-08-07 13:01:26 334".toDateYMDHMSM()))
        Assert.assertFalse("2018-08-07 13:01:25 333".toMillisecondYMDHMSM().isSameMillisecond("2018-08-07 13:01:26 332".toMillisecondYMDHMSM()))

        Assert.assertTrue("2018-08-07 13:01:25 333".toDateYMDHMSM().isSameMillisecondOfSecond("2018-08-07 13:01:26 333".toDateYMDHMSM()))
        Assert.assertFalse("2018-08-07 13:01:25 333".toMillisecondYMDHMSM().isSameMillisecondOfSecond("2018-08-07 13:01:26 334".toMillisecondYMDHMSM()))
    }

    @Test
    fun testDifferYear() {
        Assert.assertTrue("2018".toDateY().differYear("2011".toDateY(), 7))
        Assert.assertTrue("2018".toDateY().differYear("2025".toDateY(), 7))

        Assert.assertFalse("2018".toMillisecondY().differYear("2010".toMillisecondY(), 7))
        Assert.assertFalse("2018".toMillisecondY().differYear("2026".toMillisecondY(), 7))
    }

    @Test
    fun testDifferMonth() {
        Assert.assertTrue("2018-05".toDateYM().differMonth("2018-12".toDateYM(), 7))
        Assert.assertTrue("2018-05".toDateYM().differMonth("2017-10".toDateYM(), 7))

        Assert.assertFalse("2018-05".toMillisecondYM().differMonth("2019-01".toMillisecondYM(), 7))
        Assert.assertFalse("2018-05".toMillisecondYM().differMonth("2017-09".toMillisecondYM(), 7))
    }

    @Test
    fun testDifferWeekOfYear() {
        Assert.assertTrue("2018-05-28".toDateYMD().differWeekOfYear("2018-06-25".toDateYMD(), 4))
        Assert.assertTrue("2018-05-28".toDateYMD().differWeekOfYear("2018-04-30".toDateYMD(), 4))

        Assert.assertFalse("2018-05-28".toMillisecondYMD().differWeekOfYear("2018-06-26".toMillisecondYMD(), 4))
        Assert.assertFalse("2018-05-28".toMillisecondYMD().differWeekOfYear("2018-04-29".toMillisecondYMD(), 4))
    }

    @Test
    fun testDifferWeekOfMonth() {
        Assert.assertTrue("2018-05-28".toDateYMD().differWeekOfMonth("2018-06-25".toDateYMD(), 4))
        Assert.assertTrue("2018-05-28".toDateYMD().differWeekOfMonth("2018-04-30".toDateYMD(), 4))

        Assert.assertFalse("2018-05-28".toMillisecondYMD().differWeekOfMonth("2018-06-26".toMillisecondYMD(), 4))
        Assert.assertFalse("2018-05-28".toMillisecondYMD().differWeekOfMonth("2018-04-29".toMillisecondYMD(), 4))
    }

    @Test
    fun testDifferDayOfYear() {
        Assert.assertTrue("2018-05-28".toDateYMD().differDayOfYear("2018-06-04".toDateYMD(), 7))
        Assert.assertTrue("2018-05-28".toDateYMD().differDayOfYear("2018-05-21".toDateYMD(), 7))

        Assert.assertFalse("2018-05-28".toMillisecondYMD().differDayOfYear("2018-06-05".toMillisecondYMD(), 7))
        Assert.assertFalse("2018-05-28".toMillisecondYMD().differDayOfYear("2018-05-20".toMillisecondYMD(), 7))
    }

    @Test
    fun testDifferDayOfMonth() {
        Assert.assertTrue("2018-05-28".toDateYMD().differDayOfMonth("2018-06-04".toDateYMD(), 7))
        Assert.assertTrue("2018-05-28".toDateYMD().differDayOfMonth("2018-05-21".toDateYMD(), 7))

        Assert.assertFalse("2018-05-28".toMillisecondYMD().differDayOfMonth("2018-06-05".toMillisecondYMD(), 7))
        Assert.assertFalse("2018-05-28".toMillisecondYMD().differDayOfMonth("2018-05-20".toMillisecondYMD(), 7))
    }

    @Test
    fun testDifferDayOfWeek() {
        Assert.assertTrue("2018-05-28".toDateYMD().differDayOfWeek("2018-06-04".toDateYMD(), 7))
        Assert.assertTrue("2018-05-28".toDateYMD().differDayOfWeek("2018-05-21".toDateYMD(), 7))

        Assert.assertFalse("2018-05-28".toMillisecondYMD().differDayOfWeek("2018-06-05".toMillisecondYMD(), 7))
        Assert.assertFalse("2018-05-28".toMillisecondYMD().differDayOfWeek("2018-05-20".toMillisecondYMD(), 7))
    }

    @Test
    fun testDifferDayOfWeekInMonth() {
        Assert.assertTrue("2018-05-28".toDateYMD().differDayOfWeekInMonth("2018-06-25".toDateYMD(), 4))
        Assert.assertTrue("2018-05-28".toDateYMD().differDayOfWeekInMonth("2018-04-30".toDateYMD(), 4))

        Assert.assertFalse("2018-05-28".toMillisecondYMD().differDayOfWeekInMonth("2018-06-26".toMillisecondYMD(), 4))
        Assert.assertFalse("2018-05-28".toMillisecondYMD().differDayOfWeekInMonth("2018-04-29".toMillisecondYMD(), 4))
    }

    @Test
    fun testDifferHourOfDay() {
        Assert.assertTrue("2018-05-28 20".toDateYMDH().differHourOfDay("2018-05-29 3".toDateYMDH(), 7))
        Assert.assertTrue("2018-05-28 20".toDateYMDH().differHourOfDay("2018-05-28 13".toDateYMDH(), 7))

        Assert.assertFalse("2018-05-28 20".toMillisecondYMDH().differHourOfDay("2018-05-29 4".toMillisecondYMDH(), 7))
        Assert.assertFalse("2018-05-28 20".toMillisecondYMDH().differHourOfDay("2018-05-28 12".toMillisecondYMDH(), 7))
    }

    @Test
    fun testDifferHour() {
        Assert.assertTrue("2018-05-28 08".toDateYMDH().differHour("2018-05-28 15".toDateYMDH(), 7))
        Assert.assertTrue("2018-05-28 08".toDateYMDH().differHour("2018-05-28 01".toDateYMDH(), 7))

        Assert.assertFalse("2018-05-28 08".toMillisecondYMDH().differHour("2018-05-28 16".toMillisecondYMDH(), 7))
        Assert.assertFalse("2018-05-28 08".toMillisecondYMDH().differHour("2018-05-28 00".toMillisecondYMDH(), 7))
    }

    @Test
    fun testDifferMinute() {
        Assert.assertTrue("2018-05-28 08:58".toDateYMDHM().differMinute("2018-05-28 09:05".toDateYMDHM(), 7))
        Assert.assertTrue("2018-05-28 08:58".toDateYMDHM().differMinute("2018-05-28 08:51".toDateYMDHM(), 7))

        Assert.assertFalse("2018-05-28 08:58".toMillisecondYMDHM().differMinute("2018-05-28 09:06".toMillisecondYMDHM(), 7))
        Assert.assertFalse("2018-05-28 08:58".toMillisecondYMDHM().differMinute("2018-05-28 08:50".toMillisecondYMDHM(), 7))
    }

    @Test
    fun testDifferSecond() {
        Assert.assertTrue("2018-05-28 08:58:58".toDateYMDHMS().differSecond("2018-05-28 08:59:05".toDateYMDHMS(), 7))
        Assert.assertTrue("2018-05-28 08:58:58".toDateYMDHMS().differSecond("2018-05-28 08:58:51".toDateYMDHMS(), 7))

        Assert.assertFalse("2018-05-28 08:58:58".toMillisecondYMDHMS().differSecond("2018-05-28 08:59:06".toMillisecondYMDHMS(), 7))
        Assert.assertFalse("2018-05-28 08:58:58".toMillisecondYMDHMS().differSecond("2018-05-28 08:58:50".toMillisecondYMDHMS(), 7))
    }

    @Test
    fun testDifferMillisecond() {
        Assert.assertTrue("2018-05-28 08:58:58 888".toDateYMDHMSM().differMillisecond("2018-05-28 08:58:58 895".toDateYMDHMSM(), 7))
        Assert.assertTrue("2018-05-28 08:58:58 888".toDateYMDHMSM().differMillisecond("2018-05-28 08:58:58 881".toDateYMDHMSM(), 7))

        Assert.assertFalse("2018-05-28 08:58:58 888".toMillisecondYMDHMSM().differMillisecond("2018-05-28 08:58:58 896".toMillisecondYMDHMSM(), 7))
        Assert.assertFalse("2018-05-28 08:58:58 888".toMillisecondYMDHMSM().differMillisecond("2018-05-28 08:58:58 850".toMillisecondYMDHMSM(), 7))
    }

    @Test
    fun testDifferField() {
        Assert.assertTrue("2018-05-28 08:58:58 888".toDateYMDHMSM().differCalendarField("2018-05-28 08:58:58 895".toDateYMDHMSM(), Calendar.MILLISECOND, 7))
        Assert.assertTrue("2018-05-28 08:58:58 888".toDateYMDHMSM().differCalendarField("2018-05-28 08:58:58 881".toDateYMDHMSM(), Calendar.MILLISECOND, 7))

        Assert.assertFalse("2018-05-28 08:58:58 888".toMillisecondYMDHMSM().differCalendarField("2018-05-28 08:58:58 896".toMillisecondYMDHMSM(), Calendar.MILLISECOND, 7))
        Assert.assertFalse("2018-05-28 08:58:58 888".toMillisecondYMDHMSM().differCalendarField("2018-05-28 08:58:58 850".toMillisecondYMDHMSM(), Calendar.MILLISECOND, 7))
    }
}