package me.panpf.javax.test.util;

import me.panpf.javax.util.Datex;
import org.junit.Assert;
import org.junit.Test;

import java.text.ParseException;
import java.util.Calendar;
import java.util.Locale;

public final class DatexTest {
    
    @Test
    public final void testToDateAndFormat() throws ParseException {
        Assert.assertEquals(Datex.formatY(Datex.toDateY("2018")), "2018");
        Assert.assertEquals(Datex.formatYM(Datex.toDateYM("2018-06")), "2018-06");
        Assert.assertEquals(Datex.formatYMCompact(Datex.toDateYMCompact("201806")), "201806");
        Assert.assertEquals(Datex.formatYMD(Datex.toDateYMD("2018-06-23")), "2018-06-23");
        Assert.assertEquals(Datex.formatYMDCompact(Datex.toDateYMDCompact("20180623")), "20180623");
        Assert.assertEquals(Datex.formatYMDH(Datex.toDateYMDH("2018-06-23 21")), "2018-06-23 21");
        Assert.assertEquals(Datex.formatYMDHM(Datex.toDateYMDHM("2018-06-23 21:59")), "2018-06-23 21:59");
        Assert.assertEquals(Datex.formatYMDHMS(Datex.toDateYMDHMS("2018-06-23 21:59:01")), "2018-06-23 21:59:01");
        Assert.assertEquals(Datex.formatYMDHMSM(Datex.toDateYMDHMSM("2018-06-23 21:59:01 999")), "2018-06-23 21:59:01 999");
        Assert.assertEquals(Datex.formatYMD(Datex.toDateYMD("2016-02-29")), "2016-02-29");
        Assert.assertEquals(Datex.formatYMD(Datex.toDateYMD("2017-02-29")), "2017-03-01");
    }

    @Test
    public final void testToMillisecondAndFormat() throws ParseException {
        Assert.assertEquals(Datex.formatY(Datex.toMillisecondY("2018")), "2018");
        Assert.assertEquals(Datex.formatYM(Datex.toMillisecondYM("2018-06")), "2018-06");
        Assert.assertEquals(Datex.formatYMCompact(Datex.toMillisecondYMCompact("201806")), "201806");
        Assert.assertEquals(Datex.formatYMD(Datex.toMillisecondYMD("2018-06-23")), "2018-06-23");
        Assert.assertEquals(Datex.formatYMDCompact(Datex.toMillisecondYMDCompact("20180623")), "20180623");
        Assert.assertEquals(Datex.formatYMDH(Datex.toMillisecondYMDH("2018-06-23 21")), "2018-06-23 21");
        Assert.assertEquals(Datex.formatYMDHM(Datex.toMillisecondYMDHM("2018-06-23 21:59")), "2018-06-23 21:59");
        Assert.assertEquals(Datex.formatYMDHMS(Datex.toMillisecondYMDHMS("2018-06-23 21:59:01")), "2018-06-23 21:59:01");
        Assert.assertEquals(Datex.formatYMDHMSM(Datex.toMillisecondYMDHMSM("2018-06-23 21:59:01 999")), "2018-06-23 21:59:01 999");
        Assert.assertEquals(Datex.formatYMD(Datex.toMillisecondYMD("2016-02-29")), "2016-02-29");
        Assert.assertEquals(Datex.formatYMD(Datex.toMillisecondYMD("2017-02-29")), "2017-03-01");
    }

    @Test
    public final void testDateGet() throws ParseException {
        Assert.assertEquals(Datex.getCalendarYear(Datex.toDateYMDHMSM("2016-02-29 15:59:34 897")), 2016);
        Assert.assertEquals(Datex.getCalendarMonth(Datex.toDateYMDHMSM("2016-02-29 15:59:34 897")), 1);
        Assert.assertEquals(Datex.getCalendarWeekOfYear(Datex.toDateYMDHMSM("2016-02-29 15:59:34 897")), 10);
        Assert.assertEquals(Datex.getCalendarWeekOfMonth(Datex.toDateYMDHMSM("2016-02-29 15:59:34 897")), 5);
        Assert.assertEquals(Datex.getCalendarDayOfYear(Datex.toDateYMDHMSM("2016-02-29 15:59:34 897")), 60);
        Assert.assertEquals(Datex.getCalendarDayOfMonth(Datex.toDateYMDHMSM("2016-02-29 15:59:34 897")), 29);
        Assert.assertEquals(Datex.getCalendarDayOfWeekInMonth(Datex.toDateYMDHMSM("2016-02-29 15:59:34 897")), 5);
        Assert.assertEquals(Datex.getCalendarDayOfWeek(Datex.toDateYMDHMSM("2016-02-29 15:59:34 897")), 2);
        Assert.assertEquals(Datex.getCalendarHourOfDay(Datex.toDateYMDHMSM("2016-02-29 15:59:34 897")), 15);
        Assert.assertEquals(Datex.getCalendarHour(Datex.toDateYMDHMSM("2016-02-29 15:59:34 897")), 3);
        Assert.assertEquals(Datex.getCalendarMinute(Datex.toDateYMDHMSM("2016-02-29 15:59:34 897")), 59);
        Assert.assertEquals(Datex.getCalendarSecond(Datex.toDateYMDHMSM("2016-02-29 15:59:34 897")), 34);
        Assert.assertEquals(Datex.getCalendarMillisecond(Datex.toDateYMDHMSM("2016-02-29 15:59:34 897")), 897);
        Assert.assertEquals(Datex.getCalendarField(Datex.toDateYMDHMSM("2016-02-29 15:59:34 897"), Calendar.MILLISECOND), 897);
    }

    @Test
    public final void testMillisecondGet() throws ParseException {
        Assert.assertEquals(Datex.getYear(Datex.toMillisecondYMDHMSM("2016-02-29 15:59:34 897")), 2016);
        Assert.assertEquals(Datex.getMonth(Datex.toMillisecondYMDHMSM("2016-02-29 15:59:34 897")), 1);
        Assert.assertEquals(Datex.getWeekOfYear(Datex.toMillisecondYMDHMSM("2016-02-29 15:59:34 897")), 10);
        Assert.assertEquals(Datex.getWeekOfMonth(Datex.toMillisecondYMDHMSM("2016-02-29 15:59:34 897")), 5);
        Assert.assertEquals(Datex.getDayOfYear(Datex.toMillisecondYMDHMSM("2016-02-29 15:59:34 897")), 60);
        Assert.assertEquals(Datex.getDayOfMonth(Datex.toMillisecondYMDHMSM("2016-02-29 15:59:34 897")), 29);
        Assert.assertEquals(Datex.getDayOfWeekInMonth(Datex.toMillisecondYMDHMSM("2016-02-29 15:59:34 897")), 5);
        Assert.assertEquals(Datex.getDayOfWeek(Datex.toMillisecondYMDHMSM("2016-02-29 15:59:34 897")), 2);
        Assert.assertEquals(Datex.getHourOfDay(Datex.toMillisecondYMDHMSM("2016-02-29 15:59:34 897")), 15);
        Assert.assertEquals(Datex.getHour(Datex.toMillisecondYMDHMSM("2016-02-29 15:59:34 897")), 3);
        Assert.assertEquals(Datex.getMinute(Datex.toMillisecondYMDHMSM("2016-02-29 15:59:34 897")), 59);
        Assert.assertEquals(Datex.getSecond(Datex.toMillisecondYMDHMSM("2016-02-29 15:59:34 897")), 34);
        Assert.assertEquals(Datex.getMillisecond(Datex.toMillisecondYMDHMSM("2016-02-29 15:59:34 897")), 897);
        Assert.assertEquals(Datex.getCalendarField(Datex.toMillisecondYMDHMSM("2016-02-29 15:59:34 897"), Calendar.MILLISECOND), 897);
    }

    @Test
    public final void testDateAdd() throws ParseException {
        Assert.assertEquals(Datex.formatYMD(Datex.addYear(Datex.toDateYMD("2016-02-29"), 1)), "2017-02-28");
        Assert.assertEquals(Datex.formatYMD(Datex.addYear(Datex.toDateYMD("2016-02-29"), -1)), "2015-02-28");
        Assert.assertEquals(Datex.formatYMD(Datex.addMonth(Datex.toDateYMD("2017-01-29"), 1)), "2017-02-28");
        Assert.assertEquals(Datex.formatYMD(Datex.addMonth(Datex.toDateYMD("2017-03-29"), -1)), "2017-02-28");
        Assert.assertEquals(Datex.formatYMD(Datex.addWeekOfMonth(Datex.toDateYMD("2016-02-10"), 1, Calendar.MONDAY)), "2016-02-17");
        Assert.assertEquals(Datex.formatYMD(Datex.addWeekOfMonth(Datex.toDateYMD("2016-02-10"), -1, Calendar.MONDAY)), "2016-02-03");
        Assert.assertEquals(Datex.formatYMD(Datex.addWeekOfYear(Datex.toDateYMD("2016-02-10"), 1, Calendar.MONDAY)), "2016-02-17");
        Assert.assertEquals(Datex.formatYMD(Datex.addWeekOfYear(Datex.toDateYMD("2016-02-10"), -1, Calendar.MONDAY)), "2016-02-03");
        Assert.assertEquals(Datex.formatYMD(Datex.addDayOfWeek(Datex.toDateYMD("2016-02-29"), 1, Calendar.MONDAY)), "2016-03-01");
        Assert.assertEquals(Datex.formatYMD(Datex.addDayOfWeek(Datex.toDateYMD("2016-03-01"), -1, Calendar.MONDAY)), "2016-02-29");
        Assert.assertEquals(Datex.formatYMD(Datex.addDayOfWeekInMonth(Datex.toDateYMD("2016-02-29"), 1, Calendar.MONDAY)), "2016-03-07");
        Assert.assertEquals(Datex.formatYMD(Datex.addDayOfWeekInMonth(Datex.toDateYMD("2016-03-07"), -1, Calendar.MONDAY)), "2016-02-29");
        Assert.assertEquals(Datex.formatYMD(Datex.addDayOfMonth(Datex.toDateYMD("2016-02-29"), 1)), "2016-03-01");
        Assert.assertEquals(Datex.formatYMD(Datex.addDayOfMonth(Datex.toDateYMD("2016-03-01"), -1)), "2016-02-29");
        Assert.assertEquals(Datex.formatYMD(Datex.addDayOfYear(Datex.toDateYMD("2016-02-29"), 1)), "2016-03-01");
        Assert.assertEquals(Datex.formatYMD(Datex.addDayOfYear(Datex.toDateYMD("2016-03-01"), -1)), "2016-02-29");
        Assert.assertEquals(Datex.formatYMDHMS(Datex.addHour(Datex.toDateYMDHMS("2016-02-29 23:26:33"), 1)), "2016-03-01 00:26:33");
        Assert.assertEquals(Datex.formatYMDHMS(Datex.addHour(Datex.toDateYMDHMS("2016-03-01 00:26:33"), -1)), "2016-02-29 23:26:33");
        Assert.assertEquals(Datex.formatYMDHMS(Datex.addHourOfDay(Datex.toDateYMDHMS("2016-02-29 23:26:33"), 1)), "2016-03-01 00:26:33");
        Assert.assertEquals(Datex.formatYMDHMS(Datex.addHourOfDay(Datex.toDateYMDHMS("2016-03-01 00:26:33"), -1)), "2016-02-29 23:26:33");
        Assert.assertEquals(Datex.formatYMDHMS(Datex.addMinute(Datex.toDateYMDHMS("2016-02-29 15:59:33"), 1)), "2016-02-29 16:00:33");
        Assert.assertEquals(Datex.formatYMDHMS(Datex.addMinute(Datex.toDateYMDHMS("2016-02-29 16:00:33"), -1)), "2016-02-29 15:59:33");
        Assert.assertEquals(Datex.formatYMDHMS(Datex.addSecond(Datex.toDateYMDHMS("2016-02-29 15:59:59"), 1)), "2016-02-29 16:00:00");
        Assert.assertEquals(Datex.formatYMDHMS(Datex.addSecond(Datex.toDateYMDHMS("2016-02-29 16:00:00"), -1)), "2016-02-29 15:59:59");
        Assert.assertEquals(Datex.formatYMDHMSM(Datex.addMillisecond(Datex.toDateYMDHMSM("2016-02-29 15:59:59 999"), 1)), "2016-02-29 16:00:00 000");
        Assert.assertEquals(Datex.formatYMDHMSM(Datex.addMillisecond(Datex.toDateYMDHMSM("2016-02-29 16:00:00 000"), -1)), "2016-02-29 15:59:59 999");

        Assert.assertEquals(Datex.formatYMD(Datex.addYear(Datex.toDateYMD("2016-02-29"), 1, Locale.US)), "2017-02-28");
        Assert.assertEquals(Datex.formatYMD(Datex.addYear(Datex.toDateYMD("2016-02-29"), -1, Locale.US)), "2015-02-28");
        Assert.assertEquals(Datex.formatYMD(Datex.addMonth(Datex.toDateYMD("2017-01-29"), 1, Locale.US)), "2017-02-28");
        Assert.assertEquals(Datex.formatYMD(Datex.addMonth(Datex.toDateYMD("2017-03-29"), -1, Locale.US)), "2017-02-28");
        Assert.assertEquals(Datex.formatYMD(Datex.addWeekOfMonth(Datex.toDateYMD("2016-02-10"), 1, Calendar.MONDAY, Locale.US)), "2016-02-17");
        Assert.assertEquals(Datex.formatYMD(Datex.addWeekOfMonth(Datex.toDateYMD("2016-02-10"), -1, Calendar.MONDAY, Locale.US)), "2016-02-03");
        Assert.assertEquals(Datex.formatYMD(Datex.addWeekOfYear(Datex.toDateYMD("2016-02-10"), 1, Calendar.MONDAY, Locale.US)), "2016-02-17");
        Assert.assertEquals(Datex.formatYMD(Datex.addWeekOfYear(Datex.toDateYMD("2016-02-10"), -1, Calendar.MONDAY, Locale.US)), "2016-02-03");
        Assert.assertEquals(Datex.formatYMD(Datex.addDayOfWeek(Datex.toDateYMD("2016-02-29"), 1, Calendar.MONDAY, Locale.US)), "2016-03-01");
        Assert.assertEquals(Datex.formatYMD(Datex.addDayOfWeek(Datex.toDateYMD("2016-03-01"), -1, Calendar.MONDAY, Locale.US)), "2016-02-29");
        Assert.assertEquals(Datex.formatYMD(Datex.addDayOfWeekInMonth(Datex.toDateYMD("2016-02-29"), 1, Calendar.MONDAY, Locale.US)), "2016-03-07");
        Assert.assertEquals(Datex.formatYMD(Datex.addDayOfWeekInMonth(Datex.toDateYMD("2016-03-07"), -1, Calendar.MONDAY, Locale.US)), "2016-02-29");
        Assert.assertEquals(Datex.formatYMD(Datex.addDayOfMonth(Datex.toDateYMD("2016-02-29"), 1, Locale.US)), "2016-03-01");
        Assert.assertEquals(Datex.formatYMD(Datex.addDayOfMonth(Datex.toDateYMD("2016-03-01"), -1, Locale.US)), "2016-02-29");
        Assert.assertEquals(Datex.formatYMD(Datex.addDayOfYear(Datex.toDateYMD("2016-02-29"), 1, Locale.US)), "2016-03-01");
        Assert.assertEquals(Datex.formatYMD(Datex.addDayOfYear(Datex.toDateYMD("2016-03-01"), -1, Locale.US)), "2016-02-29");
        Assert.assertEquals(Datex.formatYMDHMS(Datex.addHour(Datex.toDateYMDHMS("2016-02-29 23:26:33"), 1, Locale.US)), "2016-03-01 00:26:33");
        Assert.assertEquals(Datex.formatYMDHMS(Datex.addHour(Datex.toDateYMDHMS("2016-03-01 00:26:33"), -1, Locale.US)), "2016-02-29 23:26:33");
        Assert.assertEquals(Datex.formatYMDHMS(Datex.addHourOfDay(Datex.toDateYMDHMS("2016-02-29 23:26:33"), 1, Locale.US)), "2016-03-01 00:26:33");
        Assert.assertEquals(Datex.formatYMDHMS(Datex.addHourOfDay(Datex.toDateYMDHMS("2016-03-01 00:26:33"), -1, Locale.US)), "2016-02-29 23:26:33");
        Assert.assertEquals(Datex.formatYMDHMS(Datex.addMinute(Datex.toDateYMDHMS("2016-02-29 15:59:33"), 1, Locale.US)), "2016-02-29 16:00:33");
        Assert.assertEquals(Datex.formatYMDHMS(Datex.addMinute(Datex.toDateYMDHMS("2016-02-29 16:00:33"), -1, Locale.US)), "2016-02-29 15:59:33");
        Assert.assertEquals(Datex.formatYMDHMS(Datex.addSecond(Datex.toDateYMDHMS("2016-02-29 15:59:59"), 1, Locale.US)), "2016-02-29 16:00:00");
        Assert.assertEquals(Datex.formatYMDHMS(Datex.addSecond(Datex.toDateYMDHMS("2016-02-29 16:00:00"), -1, Locale.US)), "2016-02-29 15:59:59");
        Assert.assertEquals(Datex.formatYMDHMSM(Datex.addMillisecond(Datex.toDateYMDHMSM("2016-02-29 15:59:59 999"), 1, Locale.US)), "2016-02-29 16:00:00 000");
        Assert.assertEquals(Datex.formatYMDHMSM(Datex.addMillisecond(Datex.toDateYMDHMSM("2016-02-29 16:00:00 000"), -1, Locale.US)), "2016-02-29 15:59:59 999");
    }

    @Test
    public final void testMillisecondAdd() throws ParseException {
        Assert.assertEquals(Datex.formatYMD(Datex.addYear(Datex.toMillisecondYMD("2016-02-29"), 1)), "2017-02-28");
        Assert.assertEquals(Datex.formatYMD(Datex.addYear(Datex.toMillisecondYMD("2016-02-29"), -1)), "2015-02-28");
        Assert.assertEquals(Datex.formatYMD(Datex.addMonth(Datex.toMillisecondYMD("2017-01-29"), 1)), "2017-02-28");
        Assert.assertEquals(Datex.formatYMD(Datex.addMonth(Datex.toMillisecondYMD("2017-03-29"), -1)), "2017-02-28");
        Assert.assertEquals(Datex.formatYMD(Datex.addWeekOfMonth(Datex.toMillisecondYMD("2016-02-10"), 1)), "2016-02-17");
        Assert.assertEquals(Datex.formatYMD(Datex.addWeekOfMonth(Datex.toMillisecondYMD("2016-02-10"), -1)), "2016-02-03");
        Assert.assertEquals(Datex.formatYMD(Datex.addWeekOfYear(Datex.toMillisecondYMD("2016-02-10"), 1)), "2016-02-17");
        Assert.assertEquals(Datex.formatYMD(Datex.addWeekOfYear(Datex.toMillisecondYMD("2016-02-10"), -1)), "2016-02-03");
        Assert.assertEquals(Datex.formatYMD(Datex.addDayOfWeek(Datex.toMillisecondYMD("2016-02-29"), 1)), "2016-03-01");
        Assert.assertEquals(Datex.formatYMD(Datex.addDayOfWeek(Datex.toMillisecondYMD("2016-03-01"), -1)), "2016-02-29");
        Assert.assertEquals(Datex.formatYMD(Datex.addDayOfWeekInMonth(Datex.toMillisecondYMD("2016-02-29"), 1)), "2016-03-07");
        Assert.assertEquals(Datex.formatYMD(Datex.addDayOfWeekInMonth(Datex.toMillisecondYMD("2016-03-07"), -1)), "2016-02-29");
        Assert.assertEquals(Datex.formatYMD(Datex.addDayOfMonth(Datex.toMillisecondYMD("2016-02-29"), 1)), "2016-03-01");
        Assert.assertEquals(Datex.formatYMD(Datex.addDayOfMonth(Datex.toMillisecondYMD("2016-03-01"), -1)), "2016-02-29");
        Assert.assertEquals(Datex.formatYMD(Datex.addDayOfYear(Datex.toMillisecondYMD("2016-02-29"), 1)), "2016-03-01");
        Assert.assertEquals(Datex.formatYMD(Datex.addDayOfYear(Datex.toMillisecondYMD("2016-03-01"), -1)), "2016-02-29");
        Assert.assertEquals(Datex.formatYMDHMS(Datex.addHour(Datex.toMillisecondYMDHMS("2016-02-29 23:26:33"), 1)), "2016-03-01 00:26:33");
        Assert.assertEquals(Datex.formatYMDHMS(Datex.addHour(Datex.toMillisecondYMDHMS("2016-03-01 00:26:33"), -1)), "2016-02-29 23:26:33");
        Assert.assertEquals(Datex.formatYMDHMS(Datex.addHourOfDay(Datex.toMillisecondYMDHMS("2016-02-29 23:26:33"), 1)), "2016-03-01 00:26:33");
        Assert.assertEquals(Datex.formatYMDHMS(Datex.addHourOfDay(Datex.toMillisecondYMDHMS("2016-03-01 00:26:33"), -1)), "2016-02-29 23:26:33");
        Assert.assertEquals(Datex.formatYMDHMS(Datex.addMinute(Datex.toMillisecondYMDHMS("2016-02-29 15:59:33"), 1)), "2016-02-29 16:00:33");
        Assert.assertEquals(Datex.formatYMDHMS(Datex.addMinute(Datex.toMillisecondYMDHMS("2016-02-29 16:00:33"), -1)), "2016-02-29 15:59:33");
        Assert.assertEquals(Datex.formatYMDHMS(Datex.addSecond(Datex.toMillisecondYMDHMS("2016-02-29 15:59:59"), 1)), "2016-02-29 16:00:00");
        Assert.assertEquals(Datex.formatYMDHMS(Datex.addSecond(Datex.toMillisecondYMDHMS("2016-02-29 16:00:00"), -1)), "2016-02-29 15:59:59");
        Assert.assertEquals(Datex.formatYMDHMSM(Datex.addMillisecond(Datex.toMillisecondYMDHMSM("2016-02-29 15:59:59 999"), 1)), "2016-02-29 16:00:00 000");
        Assert.assertEquals(Datex.formatYMDHMSM(Datex.addMillisecond(Datex.toMillisecondYMDHMSM("2016-02-29 16:00:00 000"), -1)), "2016-02-29 15:59:59 999");
    }

    @Test
    public final void testSameYear() throws ParseException {
        Assert.assertTrue(Datex.isSameYear(Datex.toDateY("2018"), Datex.toDateY("2018")));
        Assert.assertFalse(Datex.isSameYear(Datex.toMillisecondY("2018"), Datex.toMillisecondY("2017")));
        Assert.assertFalse(Datex.isSameYear(Datex.toMillisecondY("2018"), Datex.toMillisecondY("2019")));
    }

    @Test
    public final void testSameMonth() throws ParseException {
        Assert.assertTrue(Datex.isSameMonth(Datex.toDateYM("2018-08"), Datex.toDateYM("2018-08")));
        Assert.assertTrue(Datex.isSameMonth(Datex.toDateYM("2018-08"), Datex.toDateYMD("2018-08-01")));
        Assert.assertTrue(Datex.isSameMonth(Datex.toDateYM("2018-08"), Datex.toDateYMD("2018-08-31")));
        Assert.assertFalse(Datex.isSameMonth(Datex.toMillisecondYM("2018-08"), Datex.toMillisecondYM("2018-09")));
        Assert.assertFalse(Datex.isSameMonth(Datex.toMillisecondYM("2018-08"), Datex.toMillisecondYM("2017-08")));
        Assert.assertFalse(Datex.isSameMonth(Datex.toMillisecondYM("2018-08"), Datex.toMillisecondYM("2019-08")));
        Assert.assertTrue(Datex.isSameMonthOfYear(Datex.toDateYM("2018-08"), Datex.toDateYM("2019-08")));
        Assert.assertFalse(Datex.isSameMonthOfYear(Datex.toMillisecondYM("2018-08"), Datex.toMillisecondYM("2019-07")));
    }

    @Test
    public final void testSameWeek() throws ParseException {
        Assert.assertTrue(Datex.isSameWeek(Datex.toDateYMD("2018-08-07"), Datex.toDateYMD("2018-08-05")));
        Assert.assertTrue(Datex.isSameWeek(Datex.toDateYMD("2018-08-07"), Datex.toDateYMD("2018-08-11")));
        Assert.assertTrue(Datex.isSameWeek(Datex.toDateYMD("2018-08-31"), Datex.toDateYMD("2018-09-01")));
        Assert.assertTrue(Datex.isSameWeek(Datex.toDateYMD("2018-12-31"), Datex.toDateYMD("2019-01-01")));
        Assert.assertTrue(Datex.isSameWeek(Datex.toDateYMD("2019-01-01"), Datex.toDateYMD("2018-12-31")));
        Assert.assertFalse(Datex.isSameWeek(Datex.toMillisecondYMD("2018-08-07"), Datex.toMillisecondYMD("2018-08-04")));
        Assert.assertFalse(Datex.isSameWeek(Datex.toMillisecondYMD("2018-08-07"), Datex.toMillisecondYMD("2018-08-12")));
        Assert.assertFalse(Datex.isSameWeek(Datex.toMillisecondYMD("2019-12-31"), Datex.toMillisecondYMD("2018-12-31")));
        Assert.assertTrue(Datex.isSameWeek(Datex.toDateYMD("2018-08-07"), Datex.toDateYMD("2018-08-06"), Calendar.MONDAY));
        Assert.assertTrue(Datex.isSameWeek(Datex.toDateYMD("2018-08-07"), Datex.toDateYMD("2018-08-12"), Calendar.MONDAY));
        Assert.assertFalse(Datex.isSameWeek(Datex.toMillisecondYMD("2018-08-07"), Datex.toMillisecondYMD("2018-08-05"), Calendar.MONDAY));
        Assert.assertFalse(Datex.isSameWeek(Datex.toMillisecondYMD("2018-08-07"), Datex.toMillisecondYMD("2018-08-13"), Calendar.MONDAY));
        Assert.assertTrue(Datex.isSameWeekOfYear(Datex.toDateYMD("2018-08-07"), Datex.toDateYMD("2019-08-04")));
        Assert.assertTrue(Datex.isSameWeekOfYear(Datex.toDateYMD("2018-08-07"), Datex.toDateYMD("2019-08-10")));
        Assert.assertFalse(Datex.isSameWeekOfYear(Datex.toMillisecondYMD("2018-08-07"), Datex.toMillisecondYMD("2019-08-03")));
        Assert.assertFalse(Datex.isSameWeekOfYear(Datex.toMillisecondYMD("2018-08-07"), Datex.toMillisecondYMD("2019-08-11")));
        Assert.assertTrue(Datex.isSameWeekOfYear(Datex.toDateYMD("2018-08-07"), Datex.toDateYMD("2019-08-05"), Calendar.MONDAY));
        Assert.assertTrue(Datex.isSameWeekOfYear(Datex.toDateYMD("2018-08-07"), Datex.toDateYMD("2019-08-11"), Calendar.MONDAY));
        Assert.assertFalse(Datex.isSameWeekOfYear(Datex.toMillisecondYMD("2018-08-07"), Datex.toMillisecondYMD("2019-08-04"), Calendar.MONDAY));
        Assert.assertFalse(Datex.isSameWeekOfYear(Datex.toMillisecondYMD("2018-08-07"), Datex.toMillisecondYMD("2019-08-12"), Calendar.MONDAY));
        Assert.assertTrue(Datex.isSameWeekOfMonth(Datex.toDateYMD("2018-08-07"), Datex.toDateYMD("2018-07-08")));
        Assert.assertTrue(Datex.isSameWeekOfMonth(Datex.toDateYMD("2018-08-07"), Datex.toDateYMD("2018-07-14")));
        Assert.assertFalse(Datex.isSameWeekOfMonth(Datex.toMillisecondYMD("2018-08-07"), Datex.toMillisecondYMD("2018-07-07")));
        Assert.assertFalse(Datex.isSameWeekOfMonth(Datex.toMillisecondYMD("2018-08-07"), Datex.toMillisecondYMD("2018-07-15")));
        Assert.assertTrue(Datex.isSameWeekOfMonth(Datex.toDateYMD("2018-08-07"), Datex.toDateYMD("2018-07-02"), Calendar.MONDAY));
        Assert.assertTrue(Datex.isSameWeekOfMonth(Datex.toDateYMD("2018-08-07"), Datex.toDateYMD("2018-07-08"), Calendar.MONDAY));
        Assert.assertFalse(Datex.isSameWeekOfMonth(Datex.toMillisecondYMD("2018-08-07"), Datex.toMillisecondYMD("2018-07-01"), Calendar.MONDAY));
        Assert.assertFalse(Datex.isSameWeekOfMonth(Datex.toMillisecondYMD("2018-08-07"), Datex.toMillisecondYMD("2018-07-09"), Calendar.MONDAY));
    }

    @Test
    public final void testSameDay() throws ParseException {
        Assert.assertTrue(Datex.isSameDay(Datex.toDateYMD("2018-08-07"), Datex.toDateYMDH("2018-08-07 01")));
        Assert.assertTrue(Datex.isSameDay(Datex.toDateYMD("2018-08-07"), Datex.toDateYMDH("2018-08-07 23")));
        Assert.assertFalse(Datex.isSameDay(Datex.toMillisecondYMD("2018-08-07"), Datex.toMillisecondYMD("2018-08-08")));
        Assert.assertFalse(Datex.isSameDay(Datex.toMillisecondYMD("2018-08-07"), Datex.toMillisecondYMD("2018-08-06")));
        Assert.assertFalse(Datex.isSameDay(Datex.toMillisecondYMD("2018-08-07"), Datex.toMillisecondYMD("2017-08-07")));
        Assert.assertFalse(Datex.isSameDay(Datex.toMillisecondYMD("2018-08-07"), Datex.toMillisecondYMD("2019-08-07")));
        Assert.assertTrue(Datex.isSameDayOfYear(Datex.toDateYMD("2018-08-07"), Datex.toDateYMD("2016-08-06")));
        Assert.assertTrue(Datex.isSameDayOfYear(Datex.toDateYMD("2018-08-07"), Datex.toDateYMDH("2016-08-06 01")));
        Assert.assertTrue(Datex.isSameDayOfYear(Datex.toDateYMD("2018-08-07"), Datex.toDateYMDH("2016-08-06 23")));
        Assert.assertFalse(Datex.isSameDayOfYear(Datex.toMillisecondYMD("2018-08-07"), Datex.toMillisecondYMD("2016-08-07")));
        Assert.assertTrue(Datex.isSameDayOfMonth(Datex.toDateYMD("2018-08-07"), Datex.toDateYMD("2018-07-07")));
        Assert.assertTrue(Datex.isSameDayOfMonth(Datex.toDateYMD("2018-08-07"), Datex.toDateYMD("2019-08-07")));
        Assert.assertFalse(Datex.isSameDayOfMonth(Datex.toMillisecondYMD("2018-08-07"), Datex.toMillisecondYMD("2018-08-06")));
        Assert.assertTrue(Datex.isSameDayOfWeek(Datex.toDateYMD("2018-08-07"), Datex.toDateYMD("2018-08-14")));
        Assert.assertTrue(Datex.isSameDayOfWeek(Datex.toDateYMD("2018-08-07"), Datex.toDateYMD("2018-08-21")));
        Assert.assertFalse(Datex.isSameDayOfWeek(Datex.toMillisecondYMD("2018-08-07"), Datex.toMillisecondYMD("2018-08-08")));
        Assert.assertFalse(Datex.isSameDayOfWeek(Datex.toMillisecondYMD("2018-08-07"), Datex.toMillisecondYMD("2018-08-15")));
        Assert.assertTrue(Datex.isSameDayOfWeek(Datex.toDateYMD("2018-08-07"), Datex.toDateYMD("2018-08-14"), Calendar.MONDAY));
        Assert.assertTrue(Datex.isSameDayOfWeek(Datex.toDateYMD("2018-08-07"), Datex.toDateYMD("2018-08-21"), Calendar.MONDAY));
        Assert.assertFalse(Datex.isSameDayOfWeek(Datex.toMillisecondYMD("2018-08-07"), Datex.toMillisecondYMD("2018-08-08"), Calendar.MONDAY));
        Assert.assertFalse(Datex.isSameDayOfWeek(Datex.toMillisecondYMD("2018-08-07"), Datex.toMillisecondYMD("2018-08-15"), Calendar.MONDAY));
        Assert.assertTrue(Datex.isSameDayOfWeekInMonth(Datex.toDateYMD("2018-08-07"), Datex.toDateYMD("2018-08-01")));
        Assert.assertTrue(Datex.isSameDayOfWeekInMonth(Datex.toDateYMD("2018-08-07"), Datex.toDateYMD("2018-08-07")));
        Assert.assertFalse(Datex.isSameDayOfWeekInMonth(Datex.toMillisecondYMD("2018-08-07"), Datex.toMillisecondYMD("2018-07-08")));
        Assert.assertTrue(Datex.isSameDayOfWeekInMonth(Datex.toDateYMD("2018-08-07"), Datex.toDateYMD("2018-08-01"), Calendar.MONDAY));
        Assert.assertTrue(Datex.isSameDayOfWeekInMonth(Datex.toDateYMD("2018-08-07"), Datex.toDateYMD("2018-08-07"), Calendar.MONDAY));
        Assert.assertFalse(Datex.isSameDayOfWeekInMonth(Datex.toMillisecondYMD("2018-08-07"), Datex.toMillisecondYMD("2018-07-08"), Calendar.MONDAY));
    }

    @Test
    public final void testSameHour() throws ParseException {
        Assert.assertTrue(Datex.isSameHour(Datex.toDateYMDH("2018-08-07 13"), Datex.toDateYMDHM("2018-08-07 13:01")));
        Assert.assertTrue(Datex.isSameHour(Datex.toDateYMDH("2018-08-07 13"), Datex.toDateYMDHM("2018-08-07 13:59")));
        Assert.assertFalse(Datex.isSameHour(Datex.toMillisecondYMDH("2018-08-07 13"), Datex.toMillisecondYMDHM("2018-08-07 14:00")));
        Assert.assertFalse(Datex.isSameHour(Datex.toMillisecondYMDH("2018-08-07 13"), Datex.toMillisecondYMDHM("2018-08-07 12:59")));
        Assert.assertTrue(Datex.isSameHourOf24H(Datex.toDateYMDH("2018-08-07 13"), Datex.toDateYMDH("2018-08-06 13")));
        Assert.assertFalse(Datex.isSameHourOf24H(Datex.toMillisecondYMDH("2018-08-07 13"), Datex.toMillisecondYMDH("2018-08-06 14")));
        Assert.assertTrue(Datex.isSameHourOf12H(Datex.toDateYMDH("2018-08-07 13"), Datex.toDateYMDH("2018-08-07 01")));
        Assert.assertFalse(Datex.isSameHourOf12H(Datex.toMillisecondYMDH("2018-08-07 13"), Datex.toMillisecondYMDH("2018-08-07 02")));
    }

    @Test
    public final void testSameMinute() throws ParseException {
        Assert.assertTrue(Datex.isSameMinute(Datex.toDateYMDHM("2018-08-07 13:01"), Datex.toDateYMDHMS("2018-08-07 13:01:01")));
        Assert.assertTrue(Datex.isSameMinute(Datex.toDateYMDHM("2018-08-07 13:01"), Datex.toDateYMDHMS("2018-08-07 13:01:59")));
        Assert.assertFalse(Datex.isSameMinute(Datex.toMillisecondYMDHM("2018-08-07 13:01"), Datex.toMillisecondYMDHMS("2018-08-07 13:02:00")));
        Assert.assertFalse(Datex.isSameMinute(Datex.toMillisecondYMDHM("2018-08-07 13:01"), Datex.toMillisecondYMDHMS("2018-08-07 13:00:59")));
        Assert.assertTrue(Datex.isSameMinuteOfHour(Datex.toDateYMDHM("2018-08-07 13:01"), Datex.toDateYMDHM("2018-08-07 14:01")));
        Assert.assertFalse(Datex.isSameMinuteOfHour(Datex.toMillisecondYMDHM("2018-08-07 13:01"), Datex.toMillisecondYMDHM("2018-08-07 14:02")));
    }

    @Test
    public final void testSameSecond() throws ParseException {
        Assert.assertTrue(Datex.isSameSecond(Datex.toDateYMDHMS("2018-08-07 13:01:25"), Datex.toDateYMDHMSM("2018-08-07 13:01:25 001")));
        Assert.assertTrue(Datex.isSameSecond(Datex.toDateYMDHMS("2018-08-07 13:01:25"), Datex.toDateYMDHMSM("2018-08-07 13:01:25 999")));
        Assert.assertFalse(Datex.isSameSecond(Datex.toMillisecondYMDHMS("2018-08-07 13:01:25"), Datex.toMillisecondYMDHMSM("2018-08-07 13:01:26 000")));
        Assert.assertFalse(Datex.isSameSecond(Datex.toMillisecondYMDHMS("2018-08-07 13:01:25"), Datex.toMillisecondYMDHMSM("2018-08-07 13:01:24 999")));
        Assert.assertTrue(Datex.isSameSecondOfMinute(Datex.toDateYMDHMS("2018-08-07 13:01:25"), Datex.toDateYMDHMS("2018-08-07 13:02:25")));
        Assert.assertFalse(Datex.isSameSecondOfMinute(Datex.toMillisecondYMDHMS("2018-08-07 13:01:25"), Datex.toMillisecondYMDHMS("2018-08-07 13:02:26")));
    }

    @Test
    public final void testSameMillisecond() throws ParseException {
        Assert.assertTrue(Datex.isSameMillisecond(Datex.toDateYMDHMSM("2018-08-07 13:01:25 333"), Datex.toDateYMDHMSM("2018-08-07 13:01:25 333")));
        Assert.assertFalse(Datex.isSameMillisecond(Datex.toDateYMDHMSM("2018-08-07 13:01:25 333"), Datex.toDateYMDHMSM("2018-08-07 13:01:26 334")));
        Assert.assertFalse(Datex.isSameMillisecond(Datex.toMillisecondYMDHMSM("2018-08-07 13:01:25 333"), Datex.toMillisecondYMDHMSM("2018-08-07 13:01:26 332")));
        Assert.assertTrue(Datex.isSameMillisecondOfSecond(Datex.toDateYMDHMSM("2018-08-07 13:01:25 333"), Datex.toDateYMDHMSM("2018-08-07 13:01:26 333")));
        Assert.assertFalse(Datex.isSameMillisecondOfSecond(Datex.toMillisecondYMDHMSM("2018-08-07 13:01:25 333"), Datex.toMillisecondYMDHMSM("2018-08-07 13:01:26 334")));
    }

    @Test
    public final void testDifferYear() throws ParseException {
        Assert.assertTrue(Datex.differYear(Datex.toDateY("2018"), Datex.toDateY("2011"), 7));
        Assert.assertTrue(Datex.differYear(Datex.toDateY("2018"), Datex.toDateY("2025"), 7));
        Assert.assertFalse(Datex.differYear(Datex.toMillisecondY("2018"), Datex.toMillisecondY("2010"), 7));
        Assert.assertFalse(Datex.differYear(Datex.toMillisecondY("2018"), Datex.toMillisecondY("2026"), 7));
    }

    @Test
    public final void testDifferMonth() throws ParseException {
        Assert.assertTrue(Datex.differMonth(Datex.toDateYM("2018-05"), Datex.toDateYM("2018-12"), 7));
        Assert.assertTrue(Datex.differMonth(Datex.toDateYM("2018-05"), Datex.toDateYM("2017-10"), 7));
        Assert.assertFalse(Datex.differMonth(Datex.toMillisecondYM("2018-05"), Datex.toMillisecondYM("2019-01"), 7));
        Assert.assertFalse(Datex.differMonth(Datex.toMillisecondYM("2018-05"), Datex.toMillisecondYM("2017-09"), 7));
    }

    @Test
    public final void testDifferWeekOfYear() throws ParseException {
        Assert.assertTrue(Datex.differWeekOfYear(Datex.toDateYMD("2018-05-28"), Datex.toDateYMD("2018-06-25"), 4));
        Assert.assertTrue(Datex.differWeekOfYear(Datex.toDateYMD("2018-05-28"), Datex.toDateYMD("2018-04-30"), 4));
        Assert.assertFalse(Datex.differWeekOfYear(Datex.toMillisecondYMD("2018-05-28"), Datex.toMillisecondYMD("2018-06-26"), 4));
        Assert.assertFalse(Datex.differWeekOfYear(Datex.toMillisecondYMD("2018-05-28"), Datex.toMillisecondYMD("2018-04-29"), 4));
    }

    @Test
    public final void testDifferWeekOfMonth() throws ParseException {
        Assert.assertTrue(Datex.differWeekOfMonth(Datex.toDateYMD("2018-05-28"), Datex.toDateYMD("2018-06-25"), 4));
        Assert.assertTrue(Datex.differWeekOfMonth(Datex.toDateYMD("2018-05-28"), Datex.toDateYMD("2018-04-30"), 4));
        Assert.assertFalse(Datex.differWeekOfMonth(Datex.toMillisecondYMD("2018-05-28"), Datex.toMillisecondYMD("2018-06-26"), 4));
        Assert.assertFalse(Datex.differWeekOfMonth(Datex.toMillisecondYMD("2018-05-28"), Datex.toMillisecondYMD("2018-04-29"), 4));
    }

    @Test
    public final void testDifferDayOfYear() throws ParseException {
        Assert.assertTrue(Datex.differDayOfYear(Datex.toDateYMD("2018-05-28"), Datex.toDateYMD("2018-06-04"), 7));
        Assert.assertTrue(Datex.differDayOfYear(Datex.toDateYMD("2018-05-28"), Datex.toDateYMD("2018-05-21"), 7));
        Assert.assertFalse(Datex.differDayOfYear(Datex.toMillisecondYMD("2018-05-28"), Datex.toMillisecondYMD("2018-06-05"), 7));
        Assert.assertFalse(Datex.differDayOfYear(Datex.toMillisecondYMD("2018-05-28"), Datex.toMillisecondYMD("2018-05-20"), 7));
    }

    @Test
    public final void testDifferDayOfMonth() throws ParseException {
        Assert.assertTrue(Datex.differDayOfMonth(Datex.toDateYMD("2018-05-28"), Datex.toDateYMD("2018-06-04"), 7));
        Assert.assertTrue(Datex.differDayOfMonth(Datex.toDateYMD("2018-05-28"), Datex.toDateYMD("2018-05-21"), 7));
        Assert.assertFalse(Datex.differDayOfMonth(Datex.toMillisecondYMD("2018-05-28"), Datex.toMillisecondYMD("2018-06-05"), 7));
        Assert.assertFalse(Datex.differDayOfMonth(Datex.toMillisecondYMD("2018-05-28"), Datex.toMillisecondYMD("2018-05-20"), 7));
    }

    @Test
    public final void testDifferDayOfWeek() throws ParseException {
        Assert.assertTrue(Datex.differDayOfWeek(Datex.toDateYMD("2018-05-28"), Datex.toDateYMD("2018-06-04"), 7));
        Assert.assertTrue(Datex.differDayOfWeek(Datex.toDateYMD("2018-05-28"), Datex.toDateYMD("2018-05-21"), 7));
        Assert.assertFalse(Datex.differDayOfWeek(Datex.toMillisecondYMD("2018-05-28"), Datex.toMillisecondYMD("2018-06-05"), 7));
        Assert.assertFalse(Datex.differDayOfWeek(Datex.toMillisecondYMD("2018-05-28"), Datex.toMillisecondYMD("2018-05-20"), 7));
    }

    @Test
    public final void testDifferDayOfWeekInMonth() throws ParseException {
        Assert.assertTrue(Datex.differDayOfWeekInMonth(Datex.toDateYMD("2018-05-28"), Datex.toDateYMD("2018-06-25"), 4));
        Assert.assertTrue(Datex.differDayOfWeekInMonth(Datex.toDateYMD("2018-05-28"), Datex.toDateYMD("2018-04-30"), 4));
        Assert.assertFalse(Datex.differDayOfWeekInMonth(Datex.toMillisecondYMD("2018-05-28"), Datex.toMillisecondYMD("2018-06-26"), 4));
        Assert.assertFalse(Datex.differDayOfWeekInMonth(Datex.toMillisecondYMD("2018-05-28"), Datex.toMillisecondYMD("2018-04-29"), 4));
    }

    @Test
    public final void testDifferHourOfDay() throws ParseException {
        Assert.assertTrue(Datex.differHourOfDay(Datex.toDateYMDH("2018-05-28 20"), Datex.toDateYMDH("2018-05-29 3"), 7));
        Assert.assertTrue(Datex.differHourOfDay(Datex.toDateYMDH("2018-05-28 20"), Datex.toDateYMDH("2018-05-28 13"), 7));
        Assert.assertFalse(Datex.differHourOfDay(Datex.toMillisecondYMDH("2018-05-28 20"), Datex.toMillisecondYMDH("2018-05-29 4"), 7));
        Assert.assertFalse(Datex.differHourOfDay(Datex.toMillisecondYMDH("2018-05-28 20"), Datex.toMillisecondYMDH("2018-05-28 12"), 7));
    }

    @Test
    public final void testDifferHour() throws ParseException {
        Assert.assertTrue(Datex.differHour(Datex.toDateYMDH("2018-05-28 08"), Datex.toDateYMDH("2018-05-28 15"), 7));
        Assert.assertTrue(Datex.differHour(Datex.toDateYMDH("2018-05-28 08"), Datex.toDateYMDH("2018-05-28 01"), 7));
        Assert.assertFalse(Datex.differHour(Datex.toMillisecondYMDH("2018-05-28 08"), Datex.toMillisecondYMDH("2018-05-28 16"), 7));
        Assert.assertFalse(Datex.differHour(Datex.toMillisecondYMDH("2018-05-28 08"), Datex.toMillisecondYMDH("2018-05-28 00"), 7));
    }

    @Test
    public final void testDifferMinute() throws ParseException {
        Assert.assertTrue(Datex.differMinute(Datex.toDateYMDHM("2018-05-28 08:58"), Datex.toDateYMDHM("2018-05-28 09:05"), 7));
        Assert.assertTrue(Datex.differMinute(Datex.toDateYMDHM("2018-05-28 08:58"), Datex.toDateYMDHM("2018-05-28 08:51"), 7));
        Assert.assertFalse(Datex.differMinute(Datex.toMillisecondYMDHM("2018-05-28 08:58"), Datex.toMillisecondYMDHM("2018-05-28 09:06"), 7));
        Assert.assertFalse(Datex.differMinute(Datex.toMillisecondYMDHM("2018-05-28 08:58"), Datex.toMillisecondYMDHM("2018-05-28 08:50"), 7));
    }

    @Test
    public final void testDifferSecond() throws ParseException {
        Assert.assertTrue(Datex.differSecond(Datex.toDateYMDHMS("2018-05-28 08:58:58"), Datex.toDateYMDHMS("2018-05-28 08:59:05"), 7));
        Assert.assertTrue(Datex.differSecond(Datex.toDateYMDHMS("2018-05-28 08:58:58"), Datex.toDateYMDHMS("2018-05-28 08:58:51"), 7));
        Assert.assertFalse(Datex.differSecond(Datex.toMillisecondYMDHMS("2018-05-28 08:58:58"), Datex.toMillisecondYMDHMS("2018-05-28 08:59:06"), 7));
        Assert.assertFalse(Datex.differSecond(Datex.toMillisecondYMDHMS("2018-05-28 08:58:58"), Datex.toMillisecondYMDHMS("2018-05-28 08:58:50"), 7));
    }

    @Test
    public final void testDifferMillisecond() throws ParseException {
        Assert.assertTrue(Datex.differMillisecond(Datex.toDateYMDHMSM("2018-05-28 08:58:58 888"), Datex.toDateYMDHMSM("2018-05-28 08:58:58 895"), 7));
        Assert.assertTrue(Datex.differMillisecond(Datex.toDateYMDHMSM("2018-05-28 08:58:58 888"), Datex.toDateYMDHMSM("2018-05-28 08:58:58 881"), 7));
        Assert.assertFalse(Datex.differMillisecond(Datex.toMillisecondYMDHMSM("2018-05-28 08:58:58 888"), Datex.toMillisecondYMDHMSM("2018-05-28 08:58:58 896"), 7));
        Assert.assertFalse(Datex.differMillisecond(Datex.toMillisecondYMDHMSM("2018-05-28 08:58:58 888"), Datex.toMillisecondYMDHMSM("2018-05-28 08:58:58 850"), 7));
    }

    @Test
    public final void testDifferField() throws ParseException {
        Assert.assertTrue(Datex.differCalendarField(Datex.toDateYMDHMSM("2018-05-28 08:58:58 888"), Datex.toDateYMDHMSM("2018-05-28 08:58:58 895"), Calendar.MILLISECOND, 7));
        Assert.assertTrue(Datex.differCalendarField(Datex.toDateYMDHMSM("2018-05-28 08:58:58 888"), Datex.toDateYMDHMSM("2018-05-28 08:58:58 881"), Calendar.MILLISECOND, 7));
        Assert.assertFalse(Datex.differCalendarField(Datex.toMillisecondYMDHMSM("2018-05-28 08:58:58 888"), Datex.toMillisecondYMDHMSM("2018-05-28 08:58:58 896"), Calendar.MILLISECOND, 7));
        Assert.assertFalse(Datex.differCalendarField(Datex.toMillisecondYMDHMSM("2018-05-28 08:58:58 888"), Datex.toMillisecondYMDHMSM("2018-05-28 08:58:58 850"), Calendar.MILLISECOND, 7));
    }
}
