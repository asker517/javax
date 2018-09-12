package me.panpf.javaxkt.test.util

import me.panpf.javaxkt.util.*
import org.junit.Assert
import org.junit.Test
import java.util.*

class DateTest {

    @Test
    fun testToDateAndFormat() {
        Assert.assertEquals("2018".toDateY().formatY(), "2018")

        Assert.assertEquals("2018-06".toDateYM().formatYM(), "2018-06")
        Assert.assertEquals("201806".toDateYMCompact().formatYMCompact(), "201806")

        Assert.assertEquals("2018-06-23".toDateYMD().formatYMD(), "2018-06-23")
        Assert.assertEquals("20180623".toDateYMDCompact().formatYMDCompact(), "20180623")

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
        Assert.assertEquals("2016-02-29 15:59:34 897".toDateYMDHMSM().getCalendarHourDay(), 15)
        Assert.assertEquals("2016-02-29 15:59:34 897".toDateYMDHMSM().getCalendarHour(), 3)
        Assert.assertEquals("2016-02-29 15:59:34 897".toDateYMDHMSM().getCalendarMinute(), 59)
        Assert.assertEquals("2016-02-29 15:59:34 897".toDateYMDHMSM().getCalendarSecond(), 34)
        Assert.assertEquals("2016-02-29 15:59:34 897".toDateYMDHMSM().getCalendarMillisecond(), 897)
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
        Assert.assertEquals("2016-02-29 15:59:34 897".toMillisecondYMDHMSM().getHourDay(), 15)
        Assert.assertEquals("2016-02-29 15:59:34 897".toMillisecondYMDHMSM().getHour(), 3)
        Assert.assertEquals("2016-02-29 15:59:34 897".toMillisecondYMDHMSM().getMinute(), 59)
        Assert.assertEquals("2016-02-29 15:59:34 897".toMillisecondYMDHMSM().getSecond(), 34)
        Assert.assertEquals("2016-02-29 15:59:34 897".toMillisecondYMDHMSM().getMillisecond(), 897)
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
    fun testYearIterator() {
        Assert.assertEquals("2018".yearYRangeTo("2021").joinToString { it.formatY() }, "2018, 2019, 2020, 2021")
        Assert.assertEquals("2018".toMillisecondY().yearRangeTo("2015".toMillisecondY()).joinToString { it.formatY() }, "")

        Assert.assertEquals("2018".yearYUntilTo("2022").joinToString { it.formatY() }, "2018, 2019, 2020, 2021")
        Assert.assertEquals("2018".toMillisecondY().yearUntilTo("2015".toMillisecondY()).joinToString { it.formatY() }, "")

        Assert.assertEquals("2018".yearYDownTo("2015").joinToString { it.formatY() }, "2018, 2017, 2016, 2015")
        Assert.assertEquals("2018".toMillisecondY().yearDownTo("2021".toMillisecondY()).joinToString { it.formatY() }, "")

        Assert.assertEquals("2018".yearYDownUntilTo("2014").joinToString { it.formatY() }, "2018, 2017, 2016, 2015")
        Assert.assertEquals("2018".toMillisecondY().yearDownUntilTo("2021".toMillisecondY()).joinToString { it.formatY() }, "")
    }

    @Test
    fun testMonthIterator() {
        Assert.assertEquals("2018-08".monthYMRangeTo("2018-11").joinToString { it.formatYM() }, "2018-08, 2018-09, 2018-10, 2018-11")
        Assert.assertEquals("2018-08".toMillisecondYM().monthRangeTo("2018-05".toMillisecondYM()).joinToString { it.formatYM() }, "")

        Assert.assertEquals("2018-08".monthYMDownTo("2018-05").joinToString { it.formatYM() }, "2018-08, 2018-07, 2018-06, 2018-05")
        Assert.assertEquals("2018-08".toMillisecondYM().monthDownTo("2018-11".toMillisecondYM()).joinToString { it.formatYM() }, "")

        Assert.assertEquals("2018-08".monthYMUntilTo("2018-12").joinToString { it.formatYM() }, "2018-08, 2018-09, 2018-10, 2018-11")
        Assert.assertEquals("2018-08".toMillisecondYM().monthUntilTo("2018-05".toMillisecondYM()).joinToString { it.formatYM() }, "")

        Assert.assertEquals("2018-08".monthYMDownUntilTo("2018-04").joinToString { it.formatYM() }, "2018-08, 2018-07, 2018-06, 2018-05")
        Assert.assertEquals("2018-08".toMillisecondYM().monthDownUntilTo("2018-11".toMillisecondYM()).joinToString { it.formatYM() }, "")
    }

    @Test
    fun testDayIterator() {
        Assert.assertEquals("2018-08-06".dayYMDRangeTo("2018-08-09").joinToString { it.formatYMD() }, "2018-08-06, 2018-08-07, 2018-08-08, 2018-08-09")
        Assert.assertEquals("2018-08-06".toMillisecondYMD().dayRangeTo("2018-08-03".toMillisecondYMD()).joinToString { it.formatYMD() }, "")

        Assert.assertEquals("2018-08-06".dayYMDDownTo("2018-08-03").joinToString { it.formatYMD() }, "2018-08-06, 2018-08-05, 2018-08-04, 2018-08-03")
        Assert.assertEquals("2018-08-06".toMillisecondYMD().dayDownTo("2018-08-09".toMillisecondYMD()).joinToString { it.formatYMD() }, "")

        Assert.assertEquals("2018-08-06".dayYMDUntilTo("2018-08-10").joinToString { it.formatYMD() }, "2018-08-06, 2018-08-07, 2018-08-08, 2018-08-09")
        Assert.assertEquals("2018-08-06".toMillisecondYMD().dayUntilTo("2018-08-02".toMillisecondYMD()).joinToString { it.formatYMD() }, "")

        Assert.assertEquals("2018-08-06".dayYMDDownUntilTo("2018-08-02").joinToString { it.formatYMD() }, "2018-08-06, 2018-08-05, 2018-08-04, 2018-08-03")
        Assert.assertEquals("2018-08-06".toMillisecondYMD().dayDownUntilTo("2018-08-010".toMillisecondYMD()).joinToString { it.formatYMD() }, "")
    }

    @Test
    fun testHourIterator() {
        Assert.assertEquals("2018-08-06 18".hourYMDHRangeTo("2018-08-06 21").joinToString { it.formatYMDH() }, "2018-08-06 18, 2018-08-06 19, 2018-08-06 20, 2018-08-06 21")
        Assert.assertEquals("2018-08-06 18".toMillisecondYMDH().hourRangeTo("2018-08-06 15".toMillisecondYMDH()).joinToString { it.formatYMDH() }, "")

        Assert.assertEquals("2018-08-06 18".hourYMDHDownTo("2018-08-06 15").joinToString { it.formatYMDH() }, "2018-08-06 18, 2018-08-06 17, 2018-08-06 16, 2018-08-06 15")
        Assert.assertEquals("2018-08-06 18".toMillisecondYMDH().hourDownTo("2018-08-06 21".toMillisecondYMDH()).joinToString { it.formatYMDH() }, "")

        Assert.assertEquals("2018-08-06 18".hourYMDHUntilTo("2018-08-06 22").joinToString { it.formatYMDH() }, "2018-08-06 18, 2018-08-06 19, 2018-08-06 20, 2018-08-06 21")
        Assert.assertEquals("2018-08-06 18".toMillisecondYMDH().hourUntilTo("2018-08-06 14".toMillisecondYMDH()).joinToString { it.formatYMDH() }, "")

        Assert.assertEquals("2018-08-06 18".hourYMDHDownUntilTo("2018-08-06 14").joinToString { it.formatYMDH() }, "2018-08-06 18, 2018-08-06 17, 2018-08-06 16, 2018-08-06 15")
        Assert.assertEquals("2018-08-06 18".toMillisecondYMDH().hourDownUntilTo("2018-08-06 22".toMillisecondYMDH()).joinToString { it.formatYMDH() }, "")
    }

    @Test
    fun testMinuteIterator() {
        Assert.assertEquals("2018-08-06 18:22".minuteYMDHMRangeTo("2018-08-06 18:25").joinToString { it.formatYMDHM() }, "2018-08-06 18:22, 2018-08-06 18:23, 2018-08-06 18:24, 2018-08-06 18:25")
        Assert.assertEquals("2018-08-06 18:22".toMillisecondYMDHM().minuteRangeTo("2018-08-06 18:19".toMillisecondYMDHM()).joinToString { it.formatYMDHM() }, "")

        Assert.assertEquals("2018-08-06 18:22".minuteYMDHMDownTo("2018-08-06 18:19").joinToString { it.formatYMDHM() }, "2018-08-06 18:22, 2018-08-06 18:21, 2018-08-06 18:20, 2018-08-06 18:19")
        Assert.assertEquals("2018-08-06 18:22".toMillisecondYMDHM().minuteDownTo("2018-08-06 18:25".toMillisecondYMDHM()).joinToString { it.formatYMDHM() }, "")

        Assert.assertEquals("2018-08-06 18:22".minuteYMDHMUntilTo("2018-08-06 18:26").joinToString { it.formatYMDHM() }, "2018-08-06 18:22, 2018-08-06 18:23, 2018-08-06 18:24, 2018-08-06 18:25")
        Assert.assertEquals("2018-08-06 18:22".toMillisecondYMDHM().minuteUntilTo("2018-08-06 18:18".toMillisecondYMDHM()).joinToString { it.formatYMDHM() }, "")

        Assert.assertEquals("2018-08-06 18:22".minuteYMDHMDownUntilTo("2018-08-06 18:18").joinToString { it.formatYMDHM() }, "2018-08-06 18:22, 2018-08-06 18:21, 2018-08-06 18:20, 2018-08-06 18:19")
        Assert.assertEquals("2018-08-06 18:22".toMillisecondYMDHM().minuteDownUntilTo("2018-08-06 18:25".toMillisecondYMDHM()).joinToString { it.formatYMDHM() }, "")
    }
}