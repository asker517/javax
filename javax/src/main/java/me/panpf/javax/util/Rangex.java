package me.panpf.javax.util;

import me.panpf.javax.util.range.*;
import org.jetbrains.annotations.NotNull;

import java.text.ParseException;
import java.util.Date;

@SuppressWarnings("WeakerAccess")
public class Rangex {

    /**
     * Checks whether the specified [value] belongs to the range.
     */
    public static <T extends Comparable<T>> boolean contains(ClosedRange<T> $this, @NotNull Comparable<T> value) {
        return value.compareTo($this.getStart()) >= 0 && value.compareTo($this.getEndInclusive()) <= 0;
    }

    /**
     * Checks whether the range is empty.
     */
    public static <T extends Comparable<T>> boolean isEmpty(ClosedRange<T> $this) {
        return $this.getStart().compareTo($this.getEndInclusive()) > 0;
    }


    /**
     * Create a positive-order year ranges
     */
    @NotNull
    public static YearRange yearRangeTo(@NotNull Date date, @NotNull Date endInclusive) {
        return new YearRange(date, endInclusive, 1);
    }

    /**
     * Create a reversed year range
     */
    @NotNull
    public static YearRange yearDownTo(@NotNull Date date, @NotNull Date endInclusive) {
        return new YearRange(date, endInclusive, -1);
    }

    /**
     * Create a positive-order year range that does not contain [end]
     */
    @NotNull
    public static YearRange yearUntilTo(@NotNull Date date, @NotNull Date end) {
        return new YearRange(date, Datex.addYear(end, -1), 1);
    }

    /**
     * Create a reversed year range that does not contain [end]
     */
    @NotNull
    public static YearRange yearDownUntilTo(@NotNull Date date, @NotNull Date end) {
        return new YearRange(date, Datex.addYear(end, 1), -1);
    }


    /**
     * Create a positive-order year ranges
     */
    @NotNull
    public static YearRange yearRangeTo(long millisecondValue, long endInclusive) {
        return yearRangeTo(Datex.toDate(millisecondValue), Datex.toDate(endInclusive));
    }

    /**
     * Create a reversed year range
     */
    @NotNull
    public static YearRange yearDownTo(long millisecondValue, long endInclusive) {
        return yearDownTo(Datex.toDate(millisecondValue), Datex.toDate(endInclusive));
    }

    /**
     * Create a positive-order year range that does not contain [end]
     */
    @NotNull
    public static YearRange yearUntilTo(long millisecondValue, long end) {
        return yearUntilTo(Datex.toDate(millisecondValue), Datex.toDate(end));
    }

    /**
     * Create a reversed year range that does not contain [end]
     */
    @NotNull
    public static YearRange yearDownUntilTo(long millisecondValue, long end) {
        return yearDownUntilTo(Datex.toDate(millisecondValue), Datex.toDate(end));
    }


    /**
     * Create a positive-order year ranges, parsing the formatted date string with 'yyyy'
     */
    @NotNull
    public static YearRange yearYRangeTo(@NotNull String formattedDate, @NotNull String endInclusive) throws ParseException {
        return yearRangeTo(Datex.toDateY(formattedDate, null), Datex.toDateY(endInclusive, null));
    }

    /**
     * Create a reversed year range, parsing the formatted date string with 'yyyy'
     */
    @NotNull
    public static YearRange yearYDownTo(@NotNull String formattedDate, @NotNull String endInclusive) throws ParseException {
        return yearDownTo(Datex.toDateY(formattedDate, null), Datex.toDateY(endInclusive, null));
    }

    /**
     * Create a positive-order year range that does not contain [end], parsing the formatted date string with 'yyyy'
     */
    @NotNull
    public static YearRange yearYUntilTo(@NotNull String formattedDate, @NotNull String end) throws ParseException {
        return yearUntilTo(Datex.toDateY(formattedDate, null), Datex.toDateY(end, null));
    }

    /**
     * Create a reversed year range that does not contain [end], parsing the formatted date string with 'yyyy'
     */
    @NotNull
    public static YearRange yearYDownUntilTo(@NotNull String formattedDate, @NotNull String end) throws ParseException {
        return yearDownUntilTo(Datex.toDateY(formattedDate, null), Datex.toDateY(end, null));
    }

    /**
     * Create a positive-order month ranges
     */
    @NotNull
    public static MonthRange monthRangeTo(@NotNull Date date, @NotNull Date endInclusive) {
        return new MonthRange(date, endInclusive, 1);
    }

    /**
     * Create a reversed month range
     */
    @NotNull
    public static MonthRange monthDownTo(@NotNull Date date, @NotNull Date endInclusive) {
        return new MonthRange(date, endInclusive, -1);
    }

    /**
     * Create a positive-order month range that does not contain [end]
     */
    @NotNull
    public static MonthRange monthUntilTo(@NotNull Date date, @NotNull Date end) {
        return new MonthRange(date, Datex.addMonth(end, -1), 1);
    }

    /**
     * Create a reversed month range that does not contain [end]
     */
    @NotNull
    public static MonthRange monthDownUntilTo(@NotNull Date date, @NotNull Date end) {
        return new MonthRange(date, Datex.addMonth(end, 1), -1);
    }

    /**
     * Create a positive-order month ranges
     */
    @NotNull
    public static MonthRange monthRangeTo(long millisecondValue, long endInclusive) {
        return monthRangeTo(Datex.toDate(millisecondValue), Datex.toDate(endInclusive));
    }

    /**
     * Create a reversed month range
     */
    @NotNull
    public static MonthRange monthDownTo(long millisecondValue, long endInclusive) {
        return monthDownTo(Datex.toDate(millisecondValue), Datex.toDate(endInclusive));
    }

    /**
     * Create a positive-order month range that does not contain [end]
     */
    @NotNull
    public static MonthRange monthUntilTo(long millisecondValue, long end) {
        return monthUntilTo(Datex.toDate(millisecondValue), Datex.toDate(end));
    }

    /**
     * Create a reversed month range that does not contain [end]
     */
    @NotNull
    public static MonthRange monthDownUntilTo(long millisecondValue, long end) {
        return monthDownUntilTo(Datex.toDate(millisecondValue), Datex.toDate(end));
    }


    /**
     * Create a positive-order month ranges, parsing the formatted date string with 'yyyy-MM'
     */
    @NotNull
    public static MonthRange monthYMRangeTo(@NotNull String formattedDate, @NotNull String endInclusive) throws ParseException {
        return monthRangeTo(Datex.toDateYM(formattedDate, null), Datex.toDateYM(endInclusive, null));
    }

    /**
     * Create a reversed month range, parsing the formatted date string with 'yyyy-MM'
     */
    @NotNull
    public static MonthRange monthYMDownTo(@NotNull String formattedDate, @NotNull String endInclusive) throws ParseException {
        return monthDownTo(Datex.toDateYM(formattedDate, null), Datex.toDateYM(endInclusive, null));
    }

    /**
     * Create a positive-order month range that does not contain [end], parsing the formatted date string with 'yyyy-MM'
     */
    @NotNull
    public static MonthRange monthYMUntilTo(@NotNull String formattedDate, @NotNull String end) throws ParseException {
        return monthUntilTo(Datex.toDateYM(formattedDate, null), Datex.toDateYM(end, null));
    }

    /**
     * Create a reversed month range that does not contain [end], parsing the formatted date string with 'yyyy-MM'
     */
    @NotNull
    public static MonthRange monthYMDownUntilTo(@NotNull String formattedDate, @NotNull String end) throws ParseException {
        return monthDownUntilTo(Datex.toDateYM(formattedDate, null), Datex.toDateYM(end, null));
    }


    /**
     * Create a positive-order day ranges
     */
    @NotNull
    public static DayRange dayRangeTo(@NotNull Date date, @NotNull Date endInclusive) {
        return new DayRange(date, endInclusive, 1);
    }

    /**
     * Create a reversed day range
     */
    @NotNull
    public static DayRange dayDownTo(@NotNull Date date, @NotNull Date endInclusive) {
        return new DayRange(date, endInclusive, -1);
    }

    /**
     * Create a positive-order day range that does not contain [end]
     */
    @NotNull
    public static DayRange dayUntilTo(@NotNull Date date, @NotNull Date end) {
        return new DayRange(date, Datex.addDayOfMonth(end, -1), 1);
    }

    /**
     * Create a reversed day range that does not contain [end]
     */
    @NotNull
    public static DayRange dayDownUntilTo(@NotNull Date date, @NotNull Date end) {
        return new DayRange(date, Datex.addDayOfMonth(end, 1), -1);
    }


    /**
     * Create a positive-order day ranges
     */
    @NotNull
    public static DayRange dayRangeTo(long millisecondValue, long endInclusive) {
        return dayRangeTo(Datex.toDate(millisecondValue), Datex.toDate(endInclusive));
    }

    /**
     * Create a reversed day range
     */
    @NotNull
    public static DayRange dayDownTo(long millisecondValue, long endInclusive) {
        return dayDownTo(Datex.toDate(millisecondValue), Datex.toDate(endInclusive));
    }

    /**
     * Create a positive-order day range that does not contain [end]
     */
    @NotNull
    public static DayRange dayUntilTo(long millisecondValue, long end) {
        return dayUntilTo(Datex.toDate(millisecondValue), Datex.toDate(end));
    }

    /**
     * Create a reversed day range that does not contain [end]
     */
    @NotNull
    public static DayRange dayDownUntilTo(long millisecondValue, long end) {
        return dayDownUntilTo(Datex.toDate(millisecondValue), Datex.toDate(end));
    }


    /**
     * Create a positive-order day ranges, parsing the formatted date string with 'yyyy-MM-dd'
     */
    @NotNull
    public static DayRange dayYMDRangeTo(@NotNull String formattedDate, @NotNull String endInclusive) throws ParseException {
        return dayRangeTo(Datex.toDateYMD(formattedDate, null), Datex.toDateYMD(endInclusive, null));
    }

    /**
     * Create a reversed day range, parsing the formatted date string with 'yyyy-MM-dd'
     */
    @NotNull
    public static DayRange dayYMDDownTo(@NotNull String formattedDate, @NotNull String endInclusive) throws ParseException {
        return dayDownTo(Datex.toDateYMD(formattedDate, null), Datex.toDateYMD(endInclusive, null));
    }

    /**
     * Create a positive-order day range that does not contain [end], parsing the formatted date string with 'yyyy-MM-dd'
     */
    @NotNull
    public static DayRange dayYMDUntilTo(@NotNull String formattedDate, @NotNull String end) throws ParseException {
        return dayUntilTo(Datex.toDateYMD(formattedDate, null), Datex.toDateYMD(end, null));
    }

    /**
     * Create a reversed day range that does not contain [end], parsing the formatted date string with 'yyyy-MM-dd'
     */
    @NotNull
    public static DayRange dayYMDDownUntilTo(@NotNull String formattedDate, @NotNull String end) throws ParseException {
        return dayDownUntilTo(Datex.toDateYMD(formattedDate, null), Datex.toDateYMD(end, null));
    }


    /**
     * Create a positive-order hour ranges
     */
    @NotNull
    public static HourRange hourRangeTo(@NotNull Date date, @NotNull Date endInclusive) {
        return new HourRange(date, endInclusive, 1);
    }

    /**
     * Create a reversed hour range
     */
    @NotNull
    public static HourRange hourDownTo(@NotNull Date date, @NotNull Date endInclusive) {
        return new HourRange(date, endInclusive, -1);
    }

    /**
     * Create a positive-order hour range that does not contain [end]
     */
    @NotNull
    public static HourRange hourUntilTo(@NotNull Date date, @NotNull Date end) {
        return new HourRange(date, Datex.addHourOfDay(end, -1), 1);
    }

    /**
     * Create a reversed hour range that does not contain [end]
     */
    @NotNull
    public static HourRange hourDownUntilTo(@NotNull Date date, @NotNull Date end) {
        return new HourRange(date, Datex.addHourOfDay(end, 1), -1);
    }


    /**
     * Create a positive-order hour ranges
     */
    @NotNull
    public static HourRange hourRangeTo(long millisecondValue, long endInclusive) {
        return hourRangeTo(Datex.toDate(millisecondValue), Datex.toDate(endInclusive));
    }

    /**
     * Create a reversed hour range
     */
    @NotNull
    public static HourRange hourDownTo(long millisecondValue, long endInclusive) {
        return hourDownTo(Datex.toDate(millisecondValue), Datex.toDate(endInclusive));
    }

    /**
     * Create a positive-order hour range that does not contain [end]
     */
    @NotNull
    public static HourRange hourUntilTo(long millisecondValue, long end) {
        return hourUntilTo(Datex.toDate(millisecondValue), Datex.toDate(end));
    }

    /**
     * Create a reversed hour range that does not contain [end]
     */
    @NotNull
    public static HourRange hourDownUntilTo(long millisecondValue, long end) {
        return hourDownUntilTo(Datex.toDate(millisecondValue), Datex.toDate(end));
    }


    /**
     * Create a positive-order hour ranges, parsing the formatted date string with 'yyyy-MM-dd HH'
     */
    @NotNull
    public static HourRange hourYMDHRangeTo(@NotNull String formattedDate, @NotNull String endInclusive) throws ParseException {
        return hourRangeTo(Datex.toDateYMDH(formattedDate, null), Datex.toDateYMDH(endInclusive, null));
    }

    /**
     * Create a reversed hour range, parsing the formatted date string with 'yyyy-MM-dd HH'
     */
    @NotNull
    public static HourRange hourYMDHDownTo(@NotNull String formattedDate, @NotNull String endInclusive) throws ParseException {
        return hourDownTo(Datex.toDateYMDH(formattedDate, null), Datex.toDateYMDH(endInclusive, null));
    }

    /**
     * Create a positive-order hour range that does not contain [end], parsing the formatted date string with 'yyyy-MM-dd HH'
     */
    @NotNull
    public static HourRange hourYMDHUntilTo(@NotNull String formattedDate, @NotNull String end) throws ParseException {
        return hourUntilTo(Datex.toDateYMDH(formattedDate, null), Datex.toDateYMDH(end, null));
    }

    /**
     * Create a reversed hour range that does not contain [end], parsing the formatted date string with 'yyyy-MM-dd HH'
     */
    @NotNull
    public static HourRange hourYMDHDownUntilTo(@NotNull String formattedDate, @NotNull String end) throws ParseException {
        return hourDownUntilTo(Datex.toDateYMDH(formattedDate, null), Datex.toDateYMDH(end, null));
    }


    /**
     * Create a positive-order minute ranges
     */
    @NotNull
    public static MinuteRange minuteRangeTo(@NotNull Date date, @NotNull Date endInclusive) {
        return new MinuteRange(date, endInclusive, 1);
    }

    /**
     * Create a reversed minute range
     */
    @NotNull
    public static MinuteRange minuteDownTo(@NotNull Date date, @NotNull Date endInclusive) {
        return new MinuteRange(date, endInclusive, -1);
    }

    /**
     * Create a positive-order minute range that does not contain [end]
     */
    @NotNull
    public static MinuteRange minuteUntilTo(@NotNull Date date, @NotNull Date end) {
        return new MinuteRange(date, Datex.addMinute(end, -1), 1);
    }

    /**
     * Create a reversed minute range that does not contain [end]
     */
    @NotNull
    public static MinuteRange minuteDownUntilTo(@NotNull Date date, @NotNull Date end) {
        return new MinuteRange(date, Datex.addMinute(end, 1), -1);
    }


    /**
     * Create a positive-order minute ranges
     */
    @NotNull
    public static MinuteRange minuteRangeTo(long millisecondValue, long endInclusive) {
        return minuteRangeTo(Datex.toDate(millisecondValue), Datex.toDate(endInclusive));
    }

    /**
     * Create a reversed minute range
     */
    @NotNull
    public static MinuteRange minuteDownTo(long millisecondValue, long endInclusive) {
        return minuteDownTo(Datex.toDate(millisecondValue), Datex.toDate(endInclusive));
    }

    /**
     * Create a positive-order minute range that does not contain [end]
     */
    @NotNull
    public static MinuteRange minuteUntilTo(long millisecondValue, long end) {
        return minuteUntilTo(Datex.toDate(millisecondValue), Datex.toDate(end));
    }

    /**
     * Create a reversed minute range that does not contain [end]
     */
    @NotNull
    public static MinuteRange minuteDownUntilTo(long millisecondValue, long end) {
        return minuteDownUntilTo(Datex.toDate(millisecondValue), Datex.toDate(end));
    }


    /**
     * Create a positive-order minute ranges, parsing the formatted date string with 'yyyy-MM-dd HH:mm'
     */
    @NotNull
    public static MinuteRange minuteYMDHMRangeTo(@NotNull String formattedDate, @NotNull String endInclusive) throws ParseException {
        return minuteRangeTo(Datex.toDateYMDHM(formattedDate, null), Datex.toDateYMDHM(endInclusive, null));
    }

    /**
     * Create a reversed minute range, parsing the formatted date string with 'yyyy-MM-dd HH:mm'
     */
    @NotNull
    public static MinuteRange minuteYMDHMDownTo(@NotNull String formattedDate, @NotNull String endInclusive) throws ParseException {
        return minuteDownTo(Datex.toDateYMDHM(formattedDate, null), Datex.toDateYMDHM(endInclusive, null));
    }

    /**
     * Create a positive-order minute range that does not contain [end], parsing the formatted date string with 'yyyy-MM-dd HH:mm'
     */
    @NotNull
    public static MinuteRange minuteYMDHMUntilTo(@NotNull String formattedDate, @NotNull String end) throws ParseException {
        return minuteUntilTo(Datex.toDateYMDHM(formattedDate, null), Datex.toDateYMDHM(end, null));
    }

    /**
     * Create a reversed minute range that does not contain [end], parsing the formatted date string with 'yyyy-MM-dd HH:mm'
     */
    @NotNull
    public static MinuteRange minuteYMDHMDownUntilTo(@NotNull String formattedDate, @NotNull String end) throws ParseException {
        return minuteDownUntilTo(Datex.toDateYMDHM(formattedDate, null), Datex.toDateYMDHM(end, null));
    }


    /**
     * Create a positive-order second ranges
     */
    @NotNull
    public static SecondRange secondRangeTo(@NotNull Date date, @NotNull Date endInclusive) {
        return new SecondRange(date, endInclusive, 1);
    }

    /**
     * Create a reversed second range
     */
    @NotNull
    public static SecondRange secondDownTo(@NotNull Date date, @NotNull Date endInclusive) {
        return new SecondRange(date, endInclusive, -1);
    }

    /**
     * Create a positive-order second range that does not contain [end]
     */
    @NotNull
    public static SecondRange secondUntilTo(@NotNull Date date, @NotNull Date end) {
        return new SecondRange(date, Datex.addSecond(end, -1), 1);
    }

    /**
     * Create a reversed second range that does not contain [end]
     */
    @NotNull
    public static SecondRange secondDownUntilTo(@NotNull Date date, @NotNull Date end) {
        return new SecondRange(date, Datex.addSecond(end, 1), -1);
    }


    /**
     * Create a positive-order second ranges
     */
    @NotNull
    public static SecondRange secondRangeTo(long millisecondValue, long endInclusive) {
        return secondRangeTo(Datex.toDate(millisecondValue), Datex.toDate(endInclusive));
    }

    /**
     * Create a reversed second range
     */
    @NotNull
    public static SecondRange secondDownTo(long millisecondValue, long endInclusive) {
        return secondDownTo(Datex.toDate(millisecondValue), Datex.toDate(endInclusive));
    }

    /**
     * Create a positive-order second range that does not contain [end]
     */
    @NotNull
    public static SecondRange secondUntilTo(long millisecondValue, long end) {
        return secondUntilTo(Datex.toDate(millisecondValue), Datex.toDate(end));
    }

    /**
     * Create a reversed second range that does not contain [end]
     */
    @NotNull
    public static SecondRange secondDownUntilTo(long millisecondValue, long end) {
        return secondDownUntilTo(Datex.toDate(millisecondValue), Datex.toDate(end));
    }


    /**
     * Create a positive-order second ranges, parsing the formatted date string with 'yyyy-MM-dd HH:mm:ss'
     */
    @NotNull
    public static SecondRange secondYMDHMSRangeTo(@NotNull String formattedDate, @NotNull String endInclusive) throws ParseException {
        return secondRangeTo(Datex.toDateYMDHMS(formattedDate, null), Datex.toDateYMDHMS(endInclusive, null));
    }

    /**
     * Create a reversed second range, parsing the formatted date string with 'yyyy-MM-dd HH:mm:ss'
     */
    @NotNull
    public static SecondRange secondYMDHMSDownTo(@NotNull String formattedDate, @NotNull String endInclusive) throws ParseException {
        return secondDownTo(Datex.toDateYMDHMS(formattedDate, null), Datex.toDateYMDHMS(endInclusive, null));
    }

    /**
     * Create a positive-order second range that does not contain [end], parsing the formatted date string with 'yyyy-MM-dd HH:mm:ss'
     */
    @NotNull
    public static SecondRange secondYMDHMSUntilTo(@NotNull String formattedDate, @NotNull String end) throws ParseException {
        return secondUntilTo(Datex.toDateYMDHMS(formattedDate, null), Datex.toDateYMDHMS(end, null));
    }

    /**
     * Create a reversed second range that does not contain [end], parsing the formatted date string with 'yyyy-MM-dd HH:mm:ss'
     */
    @NotNull
    public static SecondRange secondYMDHMSDownUntilTo(@NotNull String formattedDate, @NotNull String end) throws ParseException {
        return secondDownUntilTo(Datex.toDateYMDHMS(formattedDate, null), Datex.toDateYMDHMS(end, null));
    }


    /**
     * Create a positive-order millisecond ranges
     */
    @NotNull
    public static MillisecondRange millisecondRangeTo(@NotNull Date date, @NotNull Date endInclusive) {
        return new MillisecondRange(date, endInclusive, 1);
    }

    /**
     * Create a reversed millisecond range
     */
    @NotNull
    public static MillisecondRange millisecondDownTo(@NotNull Date date, @NotNull Date endInclusive) {
        return new MillisecondRange(date, endInclusive, -1);
    }

    /**
     * Create a positive-order millisecond range that does not contain [end]
     */
    @NotNull
    public static MillisecondRange millisecondUntilTo(@NotNull Date date, @NotNull Date end) {
        return new MillisecondRange(date, Datex.addMillisecond(end, -1), 1);
    }

    /**
     * Create a reversed millisecond range that does not contain [end]
     */
    @NotNull
    public static MillisecondRange millisecondDownUntilTo(@NotNull Date date, @NotNull Date end) {
        return new MillisecondRange(date, Datex.addMillisecond(end, 1), -1);
    }


    /**
     * Create a positive-order millisecond ranges
     */
    @NotNull
    public static MillisecondRange millisecondRangeTo(long millisecondValue, long endInclusive) {
        return millisecondRangeTo(Datex.toDate(millisecondValue), Datex.toDate(endInclusive));
    }

    /**
     * Create a reversed millisecond range
     */
    @NotNull
    public static MillisecondRange millisecondDownTo(long millisecondValue, long endInclusive) {
        return millisecondDownTo(Datex.toDate(millisecondValue), Datex.toDate(endInclusive));
    }

    /**
     * Create a positive-order millisecond range that does not contain [end]
     */
    @NotNull
    public static MillisecondRange millisecondUntilTo(long millisecondValue, long end) {
        return millisecondUntilTo(Datex.toDate(millisecondValue), Datex.toDate(end));
    }

    /**
     * Create a reversed millisecond range that does not contain [end]
     */
    @NotNull
    public static MillisecondRange millisecondDownUntilTo(long millisecondValue, long end) {
        return millisecondDownUntilTo(Datex.toDate(millisecondValue), Datex.toDate(end));
    }


    /**
     * Create a positive-order millisecond ranges, parsing the formatted date string with 'yyyy-MM-dd HH:mm:ss SSS'
     */
    @NotNull
    public static MillisecondRange millisecondYMDHMSMRangeTo(@NotNull String formattedDate, @NotNull String endInclusive) throws ParseException {
        return millisecondRangeTo(Datex.toDateYMDHMSM(formattedDate, null), Datex.toDateYMDHMSM(endInclusive, null));
    }

    /**
     * Create a reversed millisecond range, parsing the formatted date string with 'yyyy-MM-dd HH:mm:ss SSS'
     */
    @NotNull
    public static MillisecondRange millisecondYMDHMSMDownTo(@NotNull String formattedDate, @NotNull String endInclusive) throws ParseException {
        return millisecondDownTo(Datex.toDateYMDHMSM(formattedDate, null), Datex.toDateYMDHMSM(endInclusive, null));
    }

    /**
     * Create a positive-order millisecond range that does not contain [end], parsing the formatted date string with 'yyyy-MM-dd HH:mm:ss SSS'
     */
    @NotNull
    public static MillisecondRange millisecondYMDHMSMUntilTo(@NotNull String formattedDate, @NotNull String end) throws ParseException {
        return millisecondUntilTo(Datex.toDateYMDHMSM(formattedDate, null), Datex.toDateYMDHMSM(end, null));
    }

    /**
     * Create a reversed millisecond range that does not contain [end], parsing the formatted date string with 'yyyy-MM-dd HH:mm:ss SSS'
     */
    @NotNull
    public static MillisecondRange millisecondYMDHMSMDownUntilTo(@NotNull String formattedDate, @NotNull String end) throws ParseException {
        return millisecondDownUntilTo(Datex.toDateYMDHMSM(formattedDate, null), Datex.toDateYMDHMSM(end, null));
    }
}
