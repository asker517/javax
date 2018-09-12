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
        Assert.assertEquals("2018".toDateY().yearRangeTo("2021".toDateY()).joinToString { it.formatY() }, "2018, 2019, 2020, 2021")
        Assert.assertEquals("2018".toDateY().yearRangeTo("2018-01".toDateYM()).joinToString { it.formatY() }, "2018")
        Assert.assertEquals("2018".toDateY().yearRangeTo("2015".toDateY()).joinToString { it.formatY() }, "")

        Assert.assertEquals("2018".toDateY().yearUntilTo("2022".toDateY()).joinToString { it.formatY() }, "2018, 2019, 2020, 2021")
        Assert.assertEquals("2018".toDateY().yearUntilTo("2019-01".toDateYM()).joinToString { it.formatY() }, "2018")
        Assert.assertEquals("2018".toDateY().yearUntilTo("2015".toDateY()).joinToString { it.formatY() }, "")

        Assert.assertEquals("2018".toDateY().yearDownTo("2015".toDateY()).joinToString { it.formatY() }, "2018, 2017, 2016, 2015")
        Assert.assertEquals("2018-01".toDateYM().yearDownTo("2018".toDateY()).joinToString { it.formatY() }, "2018")
        Assert.assertEquals("2018".toDateY().yearDownTo("2021".toDateY()).joinToString { it.formatY() }, "")

        Assert.assertEquals("2018".toDateY().yearDownUntilTo("2014".toDateY()).joinToString { it.formatY() }, "2018, 2017, 2016, 2015")
        Assert.assertEquals("2018".toDateY().yearDownUntilTo("2017-01".toDateYM()).joinToString { it.formatY() }, "2018")
        Assert.assertEquals("2018".toDateY().yearDownUntilTo("2021".toDateY()).joinToString { it.formatY() }, "")
    }

    @Test
    fun testMonthIterator() {
        Assert.assertEquals("2018-08".toDateYM().monthRangeTo("2018-11".toDateYM()).joinToString { it.formatYM() }, "2018-08, 2018-09, 2018-10, 2018-11")
        Assert.assertEquals("2018-08".toDateYM().monthRangeTo("2018-08-10".toDateYMD()).joinToString { it.formatYM() }, "2018-08")
        Assert.assertEquals("2018-08".toDateYM().monthRangeTo("2018-05".toDateYM()).joinToString { it.formatYM() }, "")

        Assert.assertEquals("2018-08".toDateYM().monthDownTo("2018-05".toDateYM()).joinToString { it.formatYM() }, "2018-08, 2018-07, 2018-06, 2018-05")
        Assert.assertEquals("2018-08".toDateYM().monthDownTo("2018-07-10".toDateYMD()).joinToString { it.formatYM() }, "2018-08")
        Assert.assertEquals("2018-08".toDateYM().monthDownTo("2018-11".toDateYM()).joinToString { it.formatYM() }, "")

        Assert.assertEquals("2018-08".toDateYM().monthUntilTo("2018-12".toDateYM()).joinToString { it.formatYM() }, "2018-08, 2018-09, 2018-10, 2018-11")
        Assert.assertEquals("2018-08".toDateYM().monthUntilTo("2018-09-10".toDateYM()).joinToString { it.formatYM() }, "2018-08")
        Assert.assertEquals("2018-08".toDateYM().monthUntilTo("2018-05".toDateYM()).joinToString { it.formatYM() }, "")

        Assert.assertEquals("2018-08".toDateYM().monthDownUntilTo("2018-04".toDateYM()).joinToString { it.formatYM() }, "2018-08, 2018-07, 2018-06, 2018-05")
        Assert.assertEquals("2018-08".toDateYM().monthDownUntilTo("2018-7-10".toDateYM()).joinToString { it.formatYM() }, "2018-08")
        Assert.assertEquals("2018-08".toDateYM().monthDownUntilTo("2018-11".toDateYM()).joinToString { it.formatYM() }, "")
    }

    @Test
    fun testDayIterator() {
        Assert.assertEquals("2018-08-06".toDateYMD().dayRangeTo("2018-08-21".toDateYMD()).count(), 16)
        Assert.assertEquals("2018-08-06".toDateYMD().dayRangeTo("2018-08-06 10:59".toDateYMDHM()).count(), 1)
        Assert.assertEquals("2018-08-06".toDateYMD().dayRangeTo("2018-08-08".toDateYMD()).joinToString { it.formatYMD() }, "2018-08-06, 2018-08-07, 2018-08-08")
    }
}