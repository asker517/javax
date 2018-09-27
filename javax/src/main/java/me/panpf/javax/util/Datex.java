package me.panpf.javax.util;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;

/**
 * Date tool method
 */
@SuppressWarnings({"WeakerAccess"})
public class Datex {

    private Datex() {
    }

    /**
     * Create a Calendar
     */
    @NotNull
    public static Calendar createCalendar(long millisecondValue, @Nullable Integer firstDayOfWeek, @Nullable Locale locale) {
        Calendar calendar = locale != null ? Calendar.getInstance(locale) : Calendar.getInstance();
        if (firstDayOfWeek != null) calendar.setFirstDayOfWeek(firstDayOfWeek);
        calendar.setTimeInMillis(millisecondValue);
        return calendar;
    }

    /**
     * Create a Calendar
     */
    @NotNull
    public static Calendar createCalendar(long millisecondValue, @Nullable Integer firstDayOfWeek) {
        return createCalendar(millisecondValue, firstDayOfWeek, null);
    }

    /**
     * Create a Calendar
     */
    @NotNull
    public static Calendar createCalendar(long millisecondValue, @Nullable Locale locale) {
        return createCalendar(millisecondValue, null, locale);
    }

    /**
     * Create a Calendar
     */
    @NotNull
    public static Calendar createCalendar(long millisecondValue) {
        return createCalendar(millisecondValue, null, null);
    }

    /**
     * Create a Calendar
     */
    @NotNull
    public static Calendar createCalendar(@NotNull Date date, @Nullable Integer firstDayOfWeek, @Nullable Locale locale) {
        return createCalendar(date.getTime(), firstDayOfWeek, locale);
    }

    /**
     * Create a Calendar
     */
    @NotNull
    public static Calendar createCalendar(@NotNull Date date, @Nullable Integer firstDayOfWeek) {
        return createCalendar(date.getTime(), firstDayOfWeek);
    }

    /**
     * Create a Calendar
     */
    @NotNull
    public static Calendar createCalendar(@NotNull Date date, @Nullable Locale locale) {
        return createCalendar(date.getTime(), locale);
    }

    /**
     * Create a Calendar
     */
    @NotNull
    public static Calendar createCalendar(@NotNull Date date) {
        return createCalendar(date.getTime());
    }


    /*
     * toDate
     */


    /**
     * Millisecond to Date
     */
    @NotNull
    public static Date toDate(long millisecondValue) {
        return new Date(millisecondValue);
    }


    /**
     * Convert formatted date string to Date
     */
    @NotNull
    public static Date toDate(@NotNull String formattedDate, @NotNull SimpleDateFormat format) throws ParseException {
        return format.parse(formattedDate);
    }

    /**
     * Convert formatted date string to Date
     */
    @NotNull
    public static Date toDate(@NotNull String formattedDate, @NotNull String pattern, @Nullable Locale locale) throws ParseException {
        return toDate(formattedDate, locale != null ? new SimpleDateFormat(pattern, locale) : new SimpleDateFormat(pattern));
    }

    /**
     * Convert formatted date string to Date
     */
    @NotNull
    public static Date toDate(@NotNull String formattedDate, @NotNull String pattern) throws ParseException {
        return toDate(formattedDate, pattern, null);
    }

    /**
     * Convert formatted date string to Date using pattern 'yyyy'
     */
    @NotNull
    public static Date toDateY(@NotNull String formattedDate, @Nullable Locale locale) throws ParseException {
        return toDate(formattedDate, "yyyy", locale);
    }

    /**
     * Convert formatted date string to Date using pattern 'yyyy'
     */
    @NotNull
    public static Date toDateY(@NotNull String formattedDate) throws ParseException {
        return toDateY(formattedDate, null);
    }

    /**
     * Convert formatted date string to Date using pattern 'yyyy-MM'
     */
    @NotNull
    public static Date toDateYM(@NotNull String formattedDate, @Nullable Locale locale) throws ParseException {
        return toDate(formattedDate, "yyyy-MM", locale);
    }

    /**
     * Convert formatted date string to Date using pattern 'yyyy-MM'
     */
    @NotNull
    public static Date toDateYM(@NotNull String formattedDate) throws ParseException {
        return toDateYM(formattedDate, null);
    }

    /**
     * Convert formatted date string to Date using pattern 'yyyyMM'
     */
    @NotNull
    public static Date toDateYMCompact(@NotNull String formattedDate, @Nullable Locale locale) throws ParseException {
        return toDate(formattedDate, "yyyyMM", locale);
    }

    /**
     * Convert formatted date string to Date using pattern 'yyyyMM'
     */
    @NotNull
    public static Date toDateYMCompact(@NotNull String formattedDate) throws ParseException {
        return toDateYMCompact(formattedDate, null);
    }

    /**
     * Convert formatted date string to Date using pattern 'yyyy-MM-dd'
     */
    @NotNull
    public static Date toDateYMD(@NotNull String formattedDate, @Nullable Locale locale) throws ParseException {
        return toDate(formattedDate, "yyyy-MM-dd", locale);
    }

    /**
     * Convert formatted date string to Date using pattern 'yyyy-MM-dd'
     */
    @NotNull
    public static Date toDateYMD(@NotNull String formattedDate) throws ParseException {
        return toDateYMD(formattedDate, null);
    }

    /**
     * Convert formatted date string to Date using pattern 'yyyyMMdd'
     */
    @NotNull
    public static Date toDateYMDCompact(@NotNull String formattedDate, @Nullable Locale locale) throws ParseException {
        return toDate(formattedDate, "yyyyMMdd", locale);
    }

    /**
     * Convert formatted date string to Date using pattern 'yyyyMMdd'
     */
    @NotNull
    public static Date toDateYMDCompact(@NotNull String formattedDate) throws ParseException {
        return toDateYMDCompact(formattedDate, null);
    }

    /**
     * Convert formatted date string to Date using pattern 'yyyy-MM-dd HH'
     */
    @NotNull
    public static Date toDateYMDH(@NotNull String formattedDate, @Nullable Locale locale) throws ParseException {
        return toDate(formattedDate, "yyyy-MM-dd HH", locale);
    }

    /**
     * Convert formatted date string to Date using pattern 'yyyy-MM-dd HH'
     */
    @NotNull
    public static Date toDateYMDH(@NotNull String formattedDate) throws ParseException {
        return toDateYMDH(formattedDate, null);
    }

    /**
     * Convert formatted date string to Date using pattern 'yyyy-MM-dd HH:mm'
     */
    @NotNull
    public static Date toDateYMDHM(@NotNull String formattedDate, @Nullable Locale locale) throws ParseException {
        return toDate(formattedDate, "yyyy-MM-dd HH:mm", locale);
    }

    /**
     * Convert formatted date string to Date using pattern 'yyyy-MM-dd HH:mm'
     */
    @NotNull
    public static Date toDateYMDHM(@NotNull String formattedDate) throws ParseException {
        return toDateYMDHM(formattedDate, null);
    }

    /**
     * Convert formatted date string to Date using pattern 'yyyy-MM-dd HH:mm:ss'
     */
    @NotNull
    public static Date toDateYMDHMS(@NotNull String formattedDate, @Nullable Locale locale) throws ParseException {
        return toDate(formattedDate, "yyyy-MM-dd HH:mm:ss", locale);
    }

    /**
     * Convert formatted date string to Date using pattern 'yyyy-MM-dd HH:mm:ss'
     */
    @NotNull
    public static Date toDateYMDHMS(@NotNull String formattedDate) throws ParseException {
        return toDateYMDHMS(formattedDate, null);
    }

    /**
     * Convert formatted date string to Date using pattern 'yyyy-MM-dd HH:mm:ss SSS'
     */
    @NotNull
    public static Date toDateYMDHMSM(@NotNull String formattedDate, @Nullable Locale locale) throws ParseException {
        return toDate(formattedDate, "yyyy-MM-dd HH:mm:ss SSS", locale);
    }

    /**
     * Convert formatted date string to Date using pattern 'yyyy-MM-dd HH:mm:ss SSS'
     */
    @NotNull
    public static Date toDateYMDHMSM(@NotNull String formattedDate) throws ParseException {
        return toDateYMDHMSM(formattedDate, null);
    }


    /*
     * toMillisecond
     */


    /**
     * Convert formatted date string to millisecond
     */
    public static long toMillisecond(@NotNull String formattedDate, @NotNull SimpleDateFormat format) throws ParseException {
        Date var10000 = format.parse(formattedDate);
        return var10000.getTime();
    }

    /**
     * Convert formatted date string to millisecond
     */
    public static long toMillisecond(@NotNull String formattedDate, @NotNull String pattern, @Nullable Locale locale) throws ParseException {
        return toMillisecond(formattedDate, locale != null ? new SimpleDateFormat(pattern, locale) : new SimpleDateFormat(pattern));
    }

    /**
     * Convert formatted date string to millisecond
     */
    public static long toMillisecond(@NotNull String formattedDate, @NotNull String pattern) throws ParseException {
        return toMillisecond(formattedDate, pattern, null);
    }

    /**
     * Convert formatted date string to millisecond using pattern 'yyyy'
     */
    public static long toMillisecondY(@NotNull String formattedDate, @Nullable Locale locale) throws ParseException {
        return toMillisecond(formattedDate, "yyyy", locale);
    }

    /**
     * Convert formatted date string to millisecond using pattern 'yyyy'
     */
    public static long toMillisecondY(@NotNull String formattedDate) throws ParseException {
        return toMillisecondY(formattedDate, null);
    }

    /**
     * Convert formatted date string to millisecond using pattern 'yyyy-MM'
     */
    public static long toMillisecondYM(@NotNull String formattedDate, @Nullable Locale locale) throws ParseException {
        return toMillisecond(formattedDate, "yyyy-MM", locale);
    }

    /**
     * Convert formatted date string to millisecond using pattern 'yyyy-MM'
     */
    public static long toMillisecondYM(@NotNull String formattedDate) throws ParseException {
        return toMillisecondYM(formattedDate, null);
    }

    /**
     * Convert formatted date string to millisecond using pattern 'yyyyMM'
     */
    public static long toMillisecondYMCompact(@NotNull String formattedDate, @Nullable Locale locale) throws ParseException {
        return toMillisecond(formattedDate, "yyyyMM", locale);
    }

    /**
     * Convert formatted date string to millisecond using pattern 'yyyyMM'
     */
    public static long toMillisecondYMCompact(@NotNull String formattedDate) throws ParseException {
        return toMillisecondYMCompact(formattedDate, null);
    }

    /**
     * Convert formatted date string to millisecond using pattern 'yyyy-MM-dd'
     */
    public static long toMillisecondYMD(@NotNull String formattedDate, @Nullable Locale locale) throws ParseException {
        return toMillisecond(formattedDate, "yyyy-MM-dd", locale);
    }

    /**
     * Convert formatted date string to millisecond using pattern 'yyyy-MM-dd'
     */
    public static long toMillisecondYMD(@NotNull String formattedDate) throws ParseException {
        return toMillisecondYMD(formattedDate, null);
    }

    /**
     * Convert formatted date string to millisecond using pattern 'yyyyMMdd'
     */
    public static long toMillisecondYMDCompact(@NotNull String formattedDate, @Nullable Locale locale) throws ParseException {
        return toMillisecond(formattedDate, "yyyyMMdd", locale);
    }

    /**
     * Convert formatted date string to millisecond using pattern 'yyyyMMdd'
     */
    public static long toMillisecondYMDCompact(@NotNull String formattedDate) throws ParseException {
        return toMillisecondYMDCompact(formattedDate, null);
    }

    /**
     * Convert formatted date string to millisecond using pattern 'yyyy-MM-dd HH'
     */
    public static long toMillisecondYMDH(@NotNull String formattedDate, @Nullable Locale locale) throws ParseException {
        return toMillisecond(formattedDate, "yyyy-MM-dd HH", locale);
    }

    /**
     * Convert formatted date string to millisecond using pattern 'yyyy-MM-dd HH'
     */
    public static long toMillisecondYMDH(@NotNull String formattedDate) throws ParseException {
        return toMillisecondYMDH(formattedDate, null);
    }

    /**
     * Convert formatted date string to millisecond using pattern 'yyyy-MM-dd HH:mm'
     */
    public static long toMillisecondYMDHM(@NotNull String formattedDate, @Nullable Locale locale) throws ParseException {
        return toMillisecond(formattedDate, "yyyy-MM-dd HH:mm", locale);
    }

    /**
     * Convert formatted date string to millisecond using pattern 'yyyy-MM-dd HH:mm'
     */
    public static long toMillisecondYMDHM(@NotNull String formattedDate) throws ParseException {
        return toMillisecondYMDHM(formattedDate, null);
    }

    /**
     * Convert formatted date string to millisecond using pattern 'yyyy-MM-dd HH:mm:ss'
     */
    public static long toMillisecondYMDHMS(@NotNull String formattedDate, @Nullable Locale locale) throws ParseException {
        return toMillisecond(formattedDate, "yyyy-MM-dd HH:mm:ss", locale);
    }

    /**
     * Convert formatted date string to millisecond using pattern 'yyyy-MM-dd HH:mm:ss'
     */
    public static long toMillisecondYMDHMS(@NotNull String formattedDate) throws ParseException {
        return toMillisecondYMDHMS(formattedDate, null);
    }

    /**
     * Convert formatted date string to millisecond using pattern 'yyyy-MM-dd HH:mm:ss SSS'
     */
    public static long toMillisecondYMDHMSM(@NotNull String formattedDate, @Nullable Locale locale) throws ParseException {
        return toMillisecond(formattedDate, "yyyy-MM-dd HH:mm:ss SSS", locale);
    }

    /**
     * Convert formatted date string to millisecond using pattern 'yyyy-MM-dd HH:mm:ss SSS'
     */
    public static long toMillisecondYMDHMSM(@NotNull String formattedDate) throws ParseException {
        return toMillisecondYMDHMSM(formattedDate, null);
    }


    /*
     * format
     */


    /**
     * Convert Date to a formatted string
     */
    @NotNull
    public static String format(@NotNull Date date, @NotNull SimpleDateFormat format) {
        return format.format(date);
    }

    /**
     * Convert Date to a formatted string
     */
    @NotNull
    public static String format(@NotNull Date date, @NotNull String pattern, @Nullable Locale locale) {
        return format(date, locale != null ? new SimpleDateFormat(pattern, locale) : new SimpleDateFormat(pattern));
    }

    /**
     * Convert Date to a formatted string
     */
    @NotNull
    public static String format(@NotNull Date date, @NotNull String pattern) {
        return format(date, pattern, null);
    }

    /**
     * Convert Date to a formatted string using pattern 'yyyy'
     */
    @NotNull
    public static String formatY(@NotNull Date date, @Nullable Locale locale) {
        return format(date, "yyyy", locale);
    }

    /**
     * Convert Date to a formatted string using pattern 'yyyy'
     */
    @NotNull
    public static String formatY(@NotNull Date date) {
        return formatY(date, null);
    }

    /**
     * Convert Date to a formatted string using pattern 'yyyy-MM'
     */
    @NotNull
    public static String formatYM(@NotNull Date date, @Nullable Locale locale) {
        return format(date, "yyyy-MM", locale);
    }

    /**
     * Convert Date to a formatted string using pattern 'yyyy-MM'
     */
    @NotNull
    public static String formatYM(@NotNull Date date) {
        return formatYM(date, null);
    }

    /**
     * Convert Date to a formatted string using pattern 'yyyyMM'
     */
    @NotNull
    public static String formatYMCompact(@NotNull Date date, @Nullable Locale locale) {
        return format(date, "yyyyMM", locale);
    }

    /**
     * Convert Date to a formatted string using pattern 'yyyyMM'
     */
    @NotNull
    public static String formatYMCompact(@NotNull Date date) {
        return formatYMCompact(date, null);
    }

    /**
     * Convert Date to a formatted string using pattern 'yyyy-MM-dd'
     */
    @NotNull
    public static String formatYMD(@NotNull Date date, @Nullable Locale locale) {
        return format(date, "yyyy-MM-dd", locale);
    }

    /**
     * Convert Date to a formatted string using pattern 'yyyy-MM-dd'
     */
    @NotNull
    public static String formatYMD(@NotNull Date date) {
        return formatYMD(date, null);
    }

    /**
     * Convert Date to a formatted string using pattern 'yyyyMMdd'
     */
    @NotNull
    public static String formatYMDCompact(@NotNull Date date, @Nullable Locale locale) {
        return format(date, "yyyyMMdd", locale);
    }

    /**
     * Convert Date to a formatted string using pattern 'yyyyMMdd'
     */
    @NotNull
    public static String formatYMDCompact(@NotNull Date date) {
        return formatYMDCompact(date, null);
    }

    /**
     * Convert Date to a formatted string using pattern 'yyyy-MM-dd HH'
     */
    @NotNull
    public static String formatYMDH(@NotNull Date date, @Nullable Locale locale) {
        return format(date, "yyyy-MM-dd HH", locale);
    }

    /**
     * Convert Date to a formatted string using pattern 'yyyy-MM-dd HH'
     */
    @NotNull
    public static String formatYMDH(@NotNull Date date) {
        return formatYMDH(date, null);
    }

    /**
     * Convert Date to a formatted string using pattern 'yyyy-MM-dd HH:mm'
     */
    @NotNull
    public static String formatYMDHM(@NotNull Date date, @Nullable Locale locale) {
        return format(date, "yyyy-MM-dd HH:mm", locale);
    }

    /**
     * Convert Date to a formatted string using pattern 'yyyy-MM-dd HH:mm'
     */
    @NotNull
    public static String formatYMDHM(@NotNull Date date) {
        return formatYMDHM(date, null);
    }

    /**
     * Convert Date to a formatted string using pattern 'yyyy-MM-dd HH:mm:ss'
     */
    @NotNull
    public static String formatYMDHMS(@NotNull Date date, @Nullable Locale locale) {
        return format(date, "yyyy-MM-dd HH:mm:ss", locale);
    }

    /**
     * Convert Date to a formatted string using pattern 'yyyy-MM-dd HH:mm:ss'
     */
    @NotNull
    public static String formatYMDHMS(@NotNull Date date) {
        return formatYMDHMS(date, null);
    }

    /**
     * Convert Date to a formatted string using pattern 'yyyy-MM-dd HH:mm:ss SSS'
     */
    @NotNull
    public static String formatYMDHMSM(@NotNull Date date, @Nullable Locale locale) {
        return format(date, "yyyy-MM-dd HH:mm:ss SSS", locale);
    }

    /**
     * Convert Date to a formatted string using pattern 'yyyy-MM-dd HH:mm:ss SSS'
     */
    @NotNull
    public static String formatYMDHMSM(@NotNull Date date) {
        return formatYMDHMSM(date, null);
    }


    /**
     * Convert millisecond to a formatted string
     */
    @NotNull
    public static String format(long millisecondValue, @NotNull SimpleDateFormat format) {
        return format(new Date(millisecondValue), format);
    }

    /**
     * Convert millisecond to a formatted string
     */
    @NotNull
    public static String format(long millisecondValue, @NotNull String pattern, @Nullable Locale locale) {
        return format(millisecondValue, locale != null ? new SimpleDateFormat(pattern, locale) : new SimpleDateFormat(pattern));
    }

    /**
     * Convert millisecond to a formatted string
     */
    @NotNull
    public static String format(long millisecondValue, @NotNull String pattern) {
        return format(millisecondValue, pattern, null);
    }

    /**
     * Convert millisecond to a formatted string using pattern 'yyyy'
     */
    @NotNull
    public static String formatY(long millisecondValue, @Nullable Locale locale) {
        return format(millisecondValue, "yyyy", locale);
    }

    /**
     * Convert millisecond to a formatted string using pattern 'yyyy'
     */
    @NotNull
    public static String formatY(long millisecondValue) {
        return formatY(millisecondValue, null);
    }

    /**
     * Convert millisecond to a formatted string using pattern 'yyyy-MM'
     */
    @NotNull
    public static String formatYM(long millisecondValue, @Nullable Locale locale) {
        return format(millisecondValue, "yyyy-MM", locale);
    }

    /**
     * Convert millisecond to a formatted string using pattern 'yyyy-MM'
     */
    @NotNull
    public static String formatYM(long millisecondValue) {
        return formatYM(millisecondValue, null);
    }

    /**
     * Convert millisecond to a formatted string using pattern 'yyyyMM'
     */
    @NotNull
    public static String formatYMCompact(long millisecondValue, @Nullable Locale locale) {
        return format(millisecondValue, "yyyyMM", locale);
    }

    /**
     * Convert millisecond to a formatted string using pattern 'yyyyMM'
     */
    @NotNull
    public static String formatYMCompact(long millisecondValue) {
        return formatYMCompact(millisecondValue, null);
    }

    /**
     * Convert millisecond to a formatted string using pattern 'yyyy-MM-dd'
     */
    @NotNull
    public static String formatYMD(long millisecondValue, @Nullable Locale locale) {
        return format(millisecondValue, "yyyy-MM-dd", locale);
    }

    /**
     * Convert millisecond to a formatted string using pattern 'yyyy-MM-dd'
     */
    @NotNull
    public static String formatYMD(long millisecondValue) {
        return formatYMD(millisecondValue, null);
    }

    /**
     * Convert millisecond to a formatted string using pattern 'yyyyMMdd'
     */
    @NotNull
    public static String formatYMDCompact(long millisecondValue, @Nullable Locale locale) {
        return format(millisecondValue, "yyyyMMdd", locale);
    }

    /**
     * Convert millisecond to a formatted string using pattern 'yyyyMMdd'
     */
    @NotNull
    public static String formatYMDCompact(long millisecondValue) {
        return formatYMDCompact(millisecondValue, null);
    }

    /**
     * Convert millisecond to a formatted string using pattern 'yyyy-MM-dd HH'
     */
    @NotNull
    public static String formatYMDH(long millisecondValue, @Nullable Locale locale) {
        return format(millisecondValue, "yyyy-MM-dd HH", locale);
    }

    /**
     * Convert millisecond to a formatted string using pattern 'yyyy-MM-dd HH'
     */
    @NotNull
    public static String formatYMDH(long millisecondValue) {
        return formatYMDH(millisecondValue, null);
    }

    /**
     * Convert millisecond to a formatted string using pattern 'yyyy-MM-dd HH:mm'
     */
    @NotNull
    public static String formatYMDHM(long millisecondValue, @Nullable Locale locale) {
        return format(millisecondValue, "yyyy-MM-dd HH:mm", locale);
    }

    /**
     * Convert millisecond to a formatted string using pattern 'yyyy-MM-dd HH:mm'
     */
    @NotNull
    public static String formatYMDHM(long millisecondValue) {
        return formatYMDHM(millisecondValue, null);
    }

    /**
     * Convert millisecond to a formatted string using pattern 'yyyy-MM-dd HH:mm:ss'
     */
    @NotNull
    public static String formatYMDHMS(long millisecondValue, @Nullable Locale locale) {
        return format(millisecondValue, "yyyy-MM-dd HH:mm:ss", locale);
    }

    /**
     * Convert millisecond to a formatted string using pattern 'yyyy-MM-dd HH:mm:ss'
     */
    @NotNull
    public static String formatYMDHMS(long millisecondValue) {
        return formatYMDHMS(millisecondValue, null);
    }

    /**
     * Convert millisecond to a formatted string using pattern 'yyyy-MM-dd HH:mm:ss SSS'
     */
    @NotNull
    public static String formatYMDHMSM(long millisecondValue, @Nullable Locale locale) {
        return format(millisecondValue, "yyyy-MM-dd HH:mm:ss SSS", locale);
    }

    /**
     * Convert millisecond to a formatted string using pattern 'yyyy-MM-dd HH:mm:ss SSS'
     */
    @NotNull
    public static String formatYMDHMSM(long millisecondValue) {
        return formatYMDHMSM(millisecondValue, null);
    }


    /*
     * get
     */


    /**
     * Get year from calendar
     */
    public static int getYear(@NotNull Calendar calendar) {
        return calendar.get(Calendar.YEAR);
    }

    /**
     * Get month from calendar
     */
    public static int getMonth(@NotNull Calendar calendar) {
        return calendar.get(Calendar.MONTH);
    }

    /**
     * Get weekOfYear from calendar
     */
    public static int getWeekOfYear(@NotNull Calendar calendar) {
        return calendar.get(Calendar.WEEK_OF_YEAR);
    }

    /**
     * Get weekOfMonth from calendar
     */
    public static int getWeekOfMonth(@NotNull Calendar calendar) {
        return calendar.get(Calendar.WEEK_OF_MONTH);
    }

    /**
     * Get dayOfYear from calendar
     */
    public static int getDayOfYear(@NotNull Calendar calendar) {
        return calendar.get(Calendar.DAY_OF_YEAR);
    }

    /**
     * Get dayOfMonth from calendar
     */
    public static int getDayOfMonth(@NotNull Calendar calendar) {
        return calendar.get(Calendar.DAY_OF_MONTH);
    }

    /**
     * Get dayOfWeek from calendar
     */
    public static int getDayOfWeek(@NotNull Calendar calendar) {
        return calendar.get(Calendar.DAY_OF_WEEK);
    }

    /**
     * Get dayOfWeekInMonth from calendar
     */
    public static int getDayOfWeekInMonth(@NotNull Calendar calendar) {
        return calendar.get(Calendar.DAY_OF_WEEK_IN_MONTH);
    }

    /**
     * Get hourOfDay from calendar
     */
    public static int getHourOfDay(@NotNull Calendar calendar) {
        return calendar.get(Calendar.HOUR_OF_DAY);
    }

    /**
     * Get hour from calendar
     */
    public static int getHour(@NotNull Calendar calendar) {
        return calendar.get(Calendar.HOUR);
    }

    /**
     * Get minute from calendar
     */
    public static int getMinute(@NotNull Calendar calendar) {
        return calendar.get(Calendar.MINUTE);
    }

    /**
     * Get second from calendar
     */
    public static int getSecond(@NotNull Calendar calendar) {
        return calendar.get(Calendar.SECOND);
    }

    /**
     * Get millisecond from calendar
     */
    public static int getMillisecond(@NotNull Calendar calendar) {
        return calendar.get(Calendar.MILLISECOND);
    }


    /**
     * Get calendar field from millisecond
     */
    public static int getCalendarField(@NotNull Date date, int field, @Nullable Integer firstDayOfWeek, @Nullable Locale locale) {
        return createCalendar(date, firstDayOfWeek, locale).get(field);
    }

    /**
     * Get calendar field from millisecond
     */
    public static int getCalendarField(@NotNull Date date, int field, @Nullable Integer firstDayOfWeek) {
        return getCalendarField(date, field, firstDayOfWeek, null);
    }

    /**
     * Get calendar field from millisecond
     */
    public static int getCalendarField(@NotNull Date date, int field, @Nullable Locale locale) {
        return getCalendarField(date, field, null, locale);
    }

    /**
     * Get calendar field from millisecond
     */
    public static int getCalendarField(@NotNull Date date, int field) {
        return getCalendarField(date, field, null, null);
    }

    /**
     * Get year from date
     */
    public static int getCalendarYear(@NotNull Date date, @Nullable Locale locale) {
        return getYear(createCalendar(date, locale));
    }

    /**
     * Get year from date
     */
    public static int getCalendarYear(@NotNull Date date) {
        return getCalendarYear(date, null);
    }

    /**
     * Get month from date
     */
    public static int getCalendarMonth(@NotNull Date date, @Nullable Locale locale) {
        return getMonth(createCalendar(date, locale));
    }

    /**
     * Get month from date
     */
    public static int getCalendarMonth(@NotNull Date date) {
        return getCalendarMonth(date, null);
    }

    /**
     * Get weekOfYear from date
     */
    public static int getCalendarWeekOfYear(@NotNull Date date, @Nullable Integer firstDayOfWeek, @Nullable Locale locale) {
        return getWeekOfYear(createCalendar(date, firstDayOfWeek, locale));
    }

    /**
     * Get weekOfYear from date
     */
    public static int getCalendarWeekOfYear(@NotNull Date date, @Nullable Integer firstDayOfWeek) {
        return getCalendarWeekOfYear(date, firstDayOfWeek, null);
    }

    /**
     * Get weekOfYear from date
     */
    public static int getCalendarWeekOfYear(@NotNull Date date, @Nullable Locale locale) {
        return getCalendarWeekOfYear(date, null, locale);
    }

    /**
     * Get weekOfYear from date
     */
    public static int getCalendarWeekOfYear(@NotNull Date date) {
        return getCalendarWeekOfYear(date, null, null);
    }

    /**
     * Get weekOfMonth from date
     */
    public static int getCalendarWeekOfMonth(@NotNull Date date, @Nullable Integer firstDayOfWeek, @Nullable Locale locale) {
        return getWeekOfMonth(createCalendar(date, firstDayOfWeek, locale));
    }

    /**
     * Get weekOfMonth from date
     */
    public static int getCalendarWeekOfMonth(@NotNull Date date, @Nullable Integer firstDayOfWeek) {
        return getCalendarWeekOfMonth(date, firstDayOfWeek, null);
    }

    /**
     * Get weekOfMonth from date
     */
    public static int getCalendarWeekOfMonth(@NotNull Date date, @Nullable Locale locale) {
        return getCalendarWeekOfMonth(date, null, locale);
    }

    /**
     * Get weekOfMonth from date
     */
    public static int getCalendarWeekOfMonth(@NotNull Date date) {
        return getCalendarWeekOfMonth(date, null, null);
    }

    /**
     * Get dayOfYear from date
     */
    public static int getCalendarDayOfYear(@NotNull Date date, @Nullable Locale locale) {
        return getDayOfYear(createCalendar(date, locale));
    }

    /**
     * Get dayOfYear from date
     */
    public static int getCalendarDayOfYear(@NotNull Date date) {
        return getCalendarDayOfYear(date, null);
    }

    /**
     * Get dayOfMonth from date
     */
    public static int getCalendarDayOfMonth(@NotNull Date date, @Nullable Locale locale) {
        return getDayOfMonth(createCalendar(date, locale));
    }

    /**
     * Get dayOfMonth from date
     */
    public static int getCalendarDayOfMonth(@NotNull Date date) {
        return getCalendarDayOfMonth(date, null);
    }

    /**
     * Get dayOfWeek from date
     */
    public static int getCalendarDayOfWeek(@NotNull Date date, @Nullable Integer firstDayOfWeek, @Nullable Locale locale) {
        return getDayOfWeek(createCalendar(date, firstDayOfWeek, locale));
    }

    /**
     * Get dayOfWeek from date
     */
    public static int getCalendarDayOfWeek(@NotNull Date date, @Nullable Integer firstDayOfWeek) {
        return getCalendarDayOfWeek(date, firstDayOfWeek, null);
    }

    /**
     * Get dayOfWeek from date
     */
    public static int getCalendarDayOfWeek(@NotNull Date date, @Nullable Locale locale) {
        return getCalendarDayOfWeek(date, null, locale);
    }

    /**
     * Get dayOfWeek from date
     */
    public static int getCalendarDayOfWeek(@NotNull Date date) {
        return getCalendarDayOfWeek(date, null, null);
    }

    /**
     * Get dayOfWeekInMonth from date
     */
    public static int getCalendarDayOfWeekInMonth(@NotNull Date date, @Nullable Integer firstDayOfWeek, @Nullable Locale locale) {
        return getDayOfWeekInMonth(createCalendar(date, firstDayOfWeek, locale));
    }

    /**
     * Get dayOfWeekInMonth from date
     */
    public static int getCalendarDayOfWeekInMonth(@NotNull Date date, @Nullable Integer firstDayOfWeek) {
        return getCalendarDayOfWeekInMonth(date, firstDayOfWeek, null);
    }

    /**
     * Get dayOfWeekInMonth from date
     */
    public static int getCalendarDayOfWeekInMonth(@NotNull Date date, @Nullable Locale locale) {
        return getCalendarDayOfWeekInMonth(date, null, locale);
    }

    /**
     * Get dayOfWeekInMonth from date
     */
    public static int getCalendarDayOfWeekInMonth(@NotNull Date date) {
        return getCalendarDayOfWeekInMonth(date, null, null);
    }

    /**
     * Get hourOfDay from date
     */
    public static int getCalendarHourOfDay(@NotNull Date date, @Nullable Locale locale) {
        return getHourOfDay(createCalendar(date, locale));
    }

    /**
     * Get hourOfDay from date
     */
    public static int getCalendarHourOfDay(@NotNull Date date) {
        return getCalendarHourOfDay(date, null);
    }

    /**
     * Get hour from date
     */
    public static int getCalendarHour(@NotNull Date date, @Nullable Locale locale) {
        return getHour(createCalendar(date, locale));
    }

    /**
     * Get hour from date
     */
    public static int getCalendarHour(@NotNull Date date) {
        return getCalendarHour(date, null);
    }

    /**
     * Get minute from date
     */
    public static int getCalendarMinute(@NotNull Date date, @Nullable Locale locale) {
        return getMinute(createCalendar(date, locale));
    }

    /**
     * Get minute from date
     */
    public static int getCalendarMinute(@NotNull Date date) {
        return getCalendarMinute(date, null);
    }

    /**
     * Get second from date
     */
    public static int getCalendarSecond(@NotNull Date date, @Nullable Locale locale) {
        return getSecond(createCalendar(date, locale));
    }

    /**
     * Get second from date
     */
    public static int getCalendarSecond(@NotNull Date date) {
        return getCalendarSecond(date, null);
    }

    /**
     * Get millisecond from date
     */
    public static int getCalendarMillisecond(@NotNull Date date, @Nullable Locale locale) {
        return getMillisecond(createCalendar(date, locale));
    }

    /**
     * Get millisecond from date
     */
    public static int getCalendarMillisecond(@NotNull Date date) {
        return getCalendarMillisecond(date, null);
    }


    /**
     * Get calendar field from millisecond
     */
    public static int getCalendarField(long millisecondValue, int field, @Nullable Integer firstDayOfWeek, @Nullable Locale locale) {
        return createCalendar(millisecondValue, firstDayOfWeek, locale).get(field);
    }

    /**
     * Get calendar field from millisecond
     */
    public static int getCalendarField(long millisecondValue, int field, @Nullable Integer firstDayOfWeek) {
        return getCalendarField(millisecondValue, field, firstDayOfWeek, null);
    }

    /**
     * Get calendar field from millisecond
     */
    public static int getCalendarField(long millisecondValue, int field, @Nullable Locale locale) {
        return getCalendarField(millisecondValue, field, null, locale);
    }

    /**
     * Get calendar field from millisecond
     */
    public static int getCalendarField(long millisecondValue, int field) {
        return getCalendarField(millisecondValue, field, null, null);
    }

    /**
     * Get year from millisecond
     */
    public static int getYear(long millisecondValue, @Nullable Locale locale) {
        return getYear(createCalendar(millisecondValue, locale));
    }

    /**
     * Get year from millisecond
     */
    public static int getYear(long millisecondValue) {
        return getYear(millisecondValue, null);
    }

    /**
     * Get month from millisecond
     */
    public static int getMonth(long millisecondValue, @Nullable Locale locale) {
        return getMonth(createCalendar(millisecondValue, locale));
    }

    /**
     * Get month from millisecond
     */
    public static int getMonth(long millisecondValue) {
        return getMonth(millisecondValue, null);
    }

    /**
     * Get weekOfYear from millisecond
     */
    public static int getWeekOfYear(long millisecondValue, @Nullable Integer firstDayOfWeek, @Nullable Locale locale) {
        return getWeekOfYear(createCalendar(millisecondValue, firstDayOfWeek, locale));
    }

    /**
     * Get weekOfYear from millisecond
     */
    public static int getWeekOfYear(long millisecondValue, @Nullable Integer firstDayOfWeek) {
        return getWeekOfYear(millisecondValue, firstDayOfWeek, null);
    }

    /**
     * Get weekOfYear from millisecond
     */
    public static int getWeekOfYear(long millisecondValue, @Nullable Locale locale) {
        return getWeekOfYear(millisecondValue, null, locale);
    }

    /**
     * Get weekOfYear from millisecond
     */
    public static int getWeekOfYear(long millisecondValue) {
        return getWeekOfYear(millisecondValue, null, null);
    }

    /**
     * Get weekOfMonth from millisecond
     */
    public static int getWeekOfMonth(long millisecondValue, @Nullable Integer firstDayOfWeek, @Nullable Locale locale) {
        return getWeekOfMonth(createCalendar(millisecondValue, firstDayOfWeek, locale));
    }

    /**
     * Get weekOfMonth from millisecond
     */
    public static int getWeekOfMonth(long millisecondValue, @Nullable Integer firstDayOfWeek) {
        return getWeekOfMonth(millisecondValue, firstDayOfWeek, null);
    }

    /**
     * Get weekOfMonth from millisecond
     */
    public static int getWeekOfMonth(long millisecondValue, @Nullable Locale locale) {
        return getWeekOfMonth(millisecondValue, null, locale);
    }

    /**
     * Get weekOfMonth from millisecond
     */
    public static int getWeekOfMonth(long millisecondValue) {
        return getWeekOfMonth(millisecondValue, null, null);
    }

    /**
     * Get dayOfYear from millisecond
     */
    public static int getDayOfYear(long millisecondValue, @Nullable Locale locale) {
        return getDayOfYear(createCalendar(millisecondValue, locale));
    }

    /**
     * Get dayOfYear from millisecond
     */
    public static int getDayOfYear(long millisecondValue) {
        return getDayOfYear(millisecondValue, null);
    }

    /**
     * Get dayOfMonth from millisecond
     */
    public static int getDayOfMonth(long millisecondValue, @Nullable Locale locale) {
        return getDayOfMonth(createCalendar(millisecondValue, locale));
    }

    /**
     * Get dayOfMonth from millisecond
     */
    public static int getDayOfMonth(long millisecondValue) {
        return getDayOfMonth(millisecondValue, null);
    }

    /**
     * Get dayOfWeek from millisecond
     */
    public static int getDayOfWeek(long millisecondValue, @Nullable Integer firstDayOfWeek, @Nullable Locale locale) {
        return getDayOfWeek(createCalendar(millisecondValue, firstDayOfWeek, locale));
    }

    /**
     * Get dayOfWeek from millisecond
     */
    public static int getDayOfWeek(long millisecondValue, @Nullable Integer firstDayOfWeek) {
        return getDayOfWeek(millisecondValue, firstDayOfWeek, null);
    }

    /**
     * Get dayOfWeek from millisecond
     */
    public static int getDayOfWeek(long millisecondValue, @Nullable Locale locale) {
        return getDayOfWeek(millisecondValue, null, locale);
    }

    /**
     * Get dayOfWeek from millisecond
     */
    public static int getDayOfWeek(long millisecondValue) {
        return getDayOfWeek(millisecondValue, null, null);
    }

    /**
     * Get dayOfWeekInMonth from millisecond
     */
    public static int getDayOfWeekInMonth(long millisecondValue, @Nullable Integer firstDayOfWeek, @Nullable Locale locale) {
        return getDayOfWeekInMonth(createCalendar(millisecondValue, firstDayOfWeek, locale));
    }

    /**
     * Get dayOfWeekInMonth from millisecond
     */
    public static int getDayOfWeekInMonth(long millisecondValue, @Nullable Integer firstDayOfWeek) {
        return getDayOfWeekInMonth(millisecondValue, firstDayOfWeek, null);
    }

    /**
     * Get dayOfWeekInMonth from millisecond
     */
    public static int getDayOfWeekInMonth(long millisecondValue, @Nullable Locale locale) {
        return getDayOfWeekInMonth(millisecondValue, null, locale);
    }

    /**
     * Get dayOfWeekInMonth from millisecond
     */
    public static int getDayOfWeekInMonth(long millisecondValue) {
        return getDayOfWeekInMonth(millisecondValue, null, null);
    }

    /**
     * Get hourOfDay from millisecond
     */
    public static int getHourOfDay(long millisecondValue, @Nullable Locale locale) {
        return getHourOfDay(createCalendar(millisecondValue, locale));
    }

    /**
     * Get hourOfDay from millisecond
     */
    public static int getHourOfDay(long millisecondValue) {
        return getHourOfDay(millisecondValue, null);
    }

    /**
     * Get hour from millisecond
     */
    public static int getHour(long millisecondValue, @Nullable Locale locale) {
        return getHour(createCalendar(millisecondValue, locale));
    }

    /**
     * Get hour from millisecond
     */
    public static int getHour(long millisecondValue) {
        return getHour(millisecondValue, null);
    }

    /**
     * Get minute from millisecond
     */
    public static int getMinute(long millisecondValue, @Nullable Locale locale) {
        return getMinute(createCalendar(millisecondValue, locale));
    }

    /**
     * Get minute from millisecond
     */
    public static int getMinute(long millisecondValue) {
        return getMinute(millisecondValue, null);
    }

    /**
     * Get second from millisecond
     */
    public static int getSecond(long millisecondValue, @Nullable Locale locale) {
        return getSecond(createCalendar(millisecondValue, locale));
    }

    /**
     * Get second from millisecond
     */
    public static int getSecond(long millisecondValue) {
        return getSecond(millisecondValue, null);
    }

    /**
     * Get millisecond from millisecond
     */
    public static int getMillisecond(long millisecondValue, @Nullable Locale locale) {
        return getMillisecond(createCalendar(millisecondValue, locale));
    }

    /**
     * Get millisecond from millisecond
     */
    public static int getMillisecond(long millisecondValue) {
        return getMillisecond(millisecondValue, null);
    }


    /*
     * add
     */


    /**
     * Increase the specified calendar field and return to Date
     */
    @NotNull
    public static Date addToDate(@NotNull Calendar calendar, int field, int amount) {
        calendar.add(field, amount);
        return new Date(calendar.getTimeInMillis());
    }

    /**
     * Increase the specified calendar field and return to millisecond
     */
    public static long addToMillisecond(@NotNull Calendar calendar, int field, int amount) {
        calendar.add(field, amount);
        return calendar.getTimeInMillis();
    }


    /**
     * Increase the specified calendar field
     */
    @NotNull
    public static Date addCalendarField(@NotNull Date date, int field, int amount, @Nullable Integer firstDayOfWeek, @Nullable Locale locale) {
        return addToDate(createCalendar(date, firstDayOfWeek, locale), field, amount);
    }

    /**
     * Increase the specified calendar field
     */
    @NotNull
    public static Date addCalendarField(@NotNull Date date, int field, int amount, @Nullable Integer firstDayOfWeek) {
        return addCalendarField(date, field, amount, firstDayOfWeek, null);
    }

    /**
     * Increase the specified calendar field
     */
    @NotNull
    public static Date addCalendarField(@NotNull Date date, int field, int amount, @Nullable Locale locale) {
        return addCalendarField(date, field, amount, null, locale);
    }

    /**
     * Increase the specified calendar field
     */
    @NotNull
    public static Date addCalendarField(@NotNull Date date, int field, int amount) {
        return addCalendarField(date, field, amount, null, null);
    }

    /**
     * Increase the YEAR field
     */
    @NotNull
    public static Date addYear(@NotNull Date date, int amount, @Nullable Locale locale) {
        return addCalendarField(date, Calendar.YEAR, amount, null, locale);
    }

    /**
     * Increase the YEAR field
     */
    @NotNull
    public static Date addYear(@NotNull Date date, int amount) {
        return addCalendarField(date, Calendar.YEAR, amount, null, null);
    }

    /**
     * Increase the MONTH field
     */
    @NotNull
    public static Date addMonth(@NotNull Date date, int amount, @Nullable Locale locale) {
        return addCalendarField(date, Calendar.MONTH, amount, null, locale);
    }

    /**
     * Increase the MONTH field
     */
    @NotNull
    public static Date addMonth(@NotNull Date date, int amount) {
        return addCalendarField(date, Calendar.MONTH, amount, null, null);
    }

    /**
     * Increase the WEEK_OF_YEAR field
     */
    @NotNull
    public static Date addWeekOfYear(@NotNull Date date, int amount, @Nullable Integer firstDayOfWeek, @Nullable Locale locale) {
        return addCalendarField(date, Calendar.WEEK_OF_YEAR, amount, firstDayOfWeek, locale);
    }

    /**
     * Increase the WEEK_OF_YEAR field
     */
    @NotNull
    public static Date addWeekOfYear(@NotNull Date date, int amount, @Nullable Integer firstDayOfWeek) {
        return addWeekOfYear(date, amount, firstDayOfWeek, null);
    }

    /**
     * Increase the WEEK_OF_YEAR field
     */
    @NotNull
    public static Date addWeekOfYear(@NotNull Date date, int amount, @Nullable Locale locale) {
        return addWeekOfYear(date, amount, null, locale);
    }

    /**
     * Increase the WEEK_OF_YEAR field
     */
    @NotNull
    public static Date addWeekOfYear(@NotNull Date date, int amount) {
        return addWeekOfYear(date, amount, null, null);
    }

    /**
     * Increase the WEEK_OF_MONTH field
     */
    @NotNull
    public static Date addWeekOfMonth(@NotNull Date date, int amount, @Nullable Integer firstDayOfWeek, @Nullable Locale locale) {
        return addCalendarField(date, Calendar.WEEK_OF_MONTH, amount, firstDayOfWeek, locale);
    }

    /**
     * Increase the WEEK_OF_MONTH field
     */
    @NotNull
    public static Date addWeekOfMonth(@NotNull Date date, int amount, @Nullable Integer firstDayOfWeek) {
        return addWeekOfMonth(date, amount, firstDayOfWeek, null);
    }

    /**
     * Increase the WEEK_OF_MONTH field
     */
    @NotNull
    public static Date addWeekOfMonth(@NotNull Date date, int amount, @Nullable Locale locale) {
        return addWeekOfMonth(date, amount, null, locale);
    }

    /**
     * Increase the WEEK_OF_MONTH field
     */
    @NotNull
    public static Date addWeekOfMonth(@NotNull Date date, int amount) {
        return addWeekOfMonth(date, amount, null, null);
    }

    /**
     * Increase the DAY_OF_YEAR field
     */
    @NotNull
    public static Date addDayOfYear(@NotNull Date date, int amount, @Nullable Locale locale) {
        return addCalendarField(date, Calendar.DAY_OF_YEAR, amount, null, locale);
    }

    /**
     * Increase the DAY_OF_YEAR field
     */
    @NotNull
    public static Date addDayOfYear(@NotNull Date date, int amount) {
        return addDayOfYear(date, amount, null);
    }

    /**
     * Increase the DAY_OF_MONTH field
     */
    @NotNull
    public static Date addDayOfMonth(@NotNull Date date, int amount, @Nullable Locale locale) {
        return addCalendarField(date, Calendar.DAY_OF_MONTH, amount, null, locale);
    }

    /**
     * Increase the DAY_OF_MONTH field
     */
    @NotNull
    public static Date addDayOfMonth(@NotNull Date date, int amount) {
        return addCalendarField(date, Calendar.DAY_OF_MONTH, amount);
    }

    /**
     * Increase the DAY_OF_WEEK_IN_MONTH field
     */
    @NotNull
    public static Date addDayOfWeekInMonth(@NotNull Date date, int amount, @Nullable Integer firstDayOfWeek, @Nullable Locale locale) {
        return addCalendarField(date, Calendar.DAY_OF_WEEK_IN_MONTH, amount, firstDayOfWeek, locale);
    }

    /**
     * Increase the DAY_OF_WEEK_IN_MONTH field
     */
    @NotNull
    public static Date addDayOfWeekInMonth(@NotNull Date date, int amount, @Nullable Integer firstDayOfWeek) {
        return addDayOfWeekInMonth(date, amount, firstDayOfWeek, null);
    }

    /**
     * Increase the DAY_OF_WEEK_IN_MONTH field
     */
    @NotNull
    public static Date addDayOfWeekInMonth(@NotNull Date date, int amount, @Nullable Locale locale) {
        return addDayOfWeekInMonth(date, amount, null, locale);
    }

    /**
     * Increase the DAY_OF_WEEK_IN_MONTH field
     */
    @NotNull
    public static Date addDayOfWeekInMonth(@NotNull Date date, int amount) {
        return addDayOfWeekInMonth(date, amount, null, null);
    }

    /**
     * Increase the DAY_OF_WEEK field
     */
    @NotNull
    public static Date addDayOfWeek(@NotNull Date date, int amount, @Nullable Integer firstDayOfWeek, @Nullable Locale locale) {
        return addCalendarField(date, Calendar.DAY_OF_WEEK, amount, firstDayOfWeek, locale);
    }

    /**
     * Increase the DAY_OF_WEEK field
     */
    @NotNull
    public static Date addDayOfWeek(@NotNull Date date, int amount, @Nullable Integer firstDayOfWeek) {
        return addDayOfWeek(date, amount, firstDayOfWeek, null);
    }

    /**
     * Increase the DAY_OF_WEEK field
     */
    @NotNull
    public static Date addDayOfWeek(@NotNull Date date, int amount, @Nullable Locale locale) {
        return addDayOfWeek(date, amount, null, locale);
    }

    /**
     * Increase the DAY_OF_WEEK field
     */
    @NotNull
    public static Date addDayOfWeek(@NotNull Date date, int amount) {
        return addDayOfWeek(date, amount, null, null);
    }

    /**
     * Increase the HOUR_OF_DAY field
     */
    @NotNull
    public static Date addHourOfDay(@NotNull Date date, int amount, @Nullable Locale locale) {
        return addCalendarField(date, Calendar.HOUR_OF_DAY, amount, null, locale);
    }

    /**
     * Increase the HOUR_OF_DAY field
     */
    @NotNull
    public static Date addHourOfDay(@NotNull Date date, int amount) {
        return addCalendarField(date, Calendar.HOUR_OF_DAY, amount);
    }

    /**
     * Increase the HOUR field
     */
    @NotNull
    public static Date addHour(@NotNull Date date, int amount, @Nullable Locale locale) {
        return addCalendarField(date, Calendar.HOUR, amount, null, locale);
    }

    /**
     * Increase the HOUR field
     */
    @NotNull
    public static Date addHour(@NotNull Date date, int amount) {
        return addCalendarField(date, Calendar.HOUR, amount);
    }

    /**
     * Increase the MINUTE field
     */
    @NotNull
    public static Date addMinute(@NotNull Date date, int amount, @Nullable Locale locale) {
        return addCalendarField(date, Calendar.MINUTE, amount, null, locale);
    }

    /**
     * Increase the MINUTE field
     */
    @NotNull
    public static Date addMinute(@NotNull Date date, int amount) {
        return addCalendarField(date, Calendar.MINUTE, amount);
    }

    /**
     * Increase the SECOND field
     */
    @NotNull
    public static Date addSecond(@NotNull Date date, int amount, @Nullable Locale locale) {
        return addCalendarField(date, Calendar.SECOND, amount, null, locale);
    }

    /**
     * Increase the SECOND field
     */
    @NotNull
    public static Date addSecond(@NotNull Date date, int amount) {
        return addCalendarField(date, Calendar.SECOND, amount);
    }

    /**
     * Increase the MILLISECOND field
     */
    @NotNull
    public static Date addMillisecond(@NotNull Date date, int amount, @Nullable Locale locale) {
        return addCalendarField(date, Calendar.MILLISECOND, amount, null, locale);
    }

    /**
     * Increase the MILLISECOND field
     */
    @NotNull
    public static Date addMillisecond(@NotNull Date date, int amount) {
        return addCalendarField(date, Calendar.MILLISECOND, amount);
    }


    /**
     * Increase the specified calendar field
     */
    public static long addCalendarField(long millisecondValue, int field, int amount, @Nullable Integer firstDayOfWeek, @Nullable Locale locale) {
        return addToMillisecond(createCalendar(millisecondValue, firstDayOfWeek, locale), field, amount);
    }

    /**
     * Increase the specified calendar field
     */
    public static long addCalendarField(long millisecondValue, int field, int amount, @Nullable Integer firstDayOfWeek) {
        return addCalendarField(millisecondValue, field, amount, firstDayOfWeek, null);
    }

    /**
     * Increase the specified calendar field
     */
    public static long addCalendarField(long millisecondValue, int field, int amount, @Nullable Locale locale) {
        return addCalendarField(millisecondValue, field, amount, null, locale);
    }

    /**
     * Increase the specified calendar field
     */
    public static long addCalendarField(long millisecondValue, int field, int amount) {
        return addCalendarField(millisecondValue, field, amount, null, null);
    }

    /**
     * Increase the YEAR field
     */
    public static long addYear(long millisecondValue, int amount, @Nullable Locale locale) {
        return addCalendarField(millisecondValue, Calendar.YEAR, amount, null, locale);
    }

    /**
     * Increase the YEAR field
     */
    public static long addYear(long millisecondValue, int amount) {
        return addYear(millisecondValue, amount, null);
    }

    /**
     * Increase the MONTH field
     */
    public static long addMonth(long millisecondValue, int amount, @Nullable Locale locale) {
        return addCalendarField(millisecondValue, Calendar.MONTH, amount, null, locale);
    }

    /**
     * Increase the MONTH field
     */
    public static long addMonth(long millisecondValue, int amount) {
        return addMonth(millisecondValue, amount, null);
    }

    /**
     * Increase the WEEK_OF_YEAR field
     */
    public static long addWeekOfYear(long millisecondValue, int amount, @Nullable Integer firstDayOfWeek, @Nullable Locale locale) {
        return addCalendarField(millisecondValue, Calendar.WEEK_OF_YEAR, amount, firstDayOfWeek, locale);
    }

    /**
     * Increase the WEEK_OF_YEAR field
     */
    public static long addWeekOfYear(long millisecondValue, int amount, @Nullable Integer firstDayOfWeek) {
        return addWeekOfYear(millisecondValue, amount, firstDayOfWeek, null);
    }

    /**
     * Increase the WEEK_OF_YEAR field
     */
    public static long addWeekOfYear(long millisecondValue, int amount, @Nullable Locale locale) {
        return addWeekOfYear(millisecondValue, amount, null, locale);
    }

    /**
     * Increase the WEEK_OF_YEAR field
     */
    public static long addWeekOfYear(long millisecondValue, int amount) {
        return addWeekOfYear(millisecondValue, amount, null, null);
    }

    /**
     * Increase the WEEK_OF_MONTH field
     */
    public static long addWeekOfMonth(long millisecondValue, int amount, @Nullable Integer firstDayOfWeek, @Nullable Locale locale) {
        return addCalendarField(millisecondValue, Calendar.WEEK_OF_MONTH, amount, firstDayOfWeek, locale);
    }

    /**
     * Increase the WEEK_OF_MONTH field
     */
    public static long addWeekOfMonth(long millisecondValue, int amount, @Nullable Integer firstDayOfWeek) {
        return addWeekOfMonth(millisecondValue, amount, firstDayOfWeek, null);
    }

    /**
     * Increase the WEEK_OF_MONTH field
     */
    public static long addWeekOfMonth(long millisecondValue, int amount, @Nullable Locale locale) {
        return addWeekOfMonth(millisecondValue, amount, null, locale);
    }

    /**
     * Increase the WEEK_OF_MONTH field
     */
    public static long addWeekOfMonth(long millisecondValue, int amount) {
        return addWeekOfMonth(millisecondValue, amount, null, null);
    }

    /**
     * Increase the DAY_OF_YEAR field
     */
    public static long addDayOfYear(long millisecondValue, int amount, @Nullable Locale locale) {
        return addCalendarField(millisecondValue, Calendar.DAY_OF_YEAR, amount, null, locale);
    }

    /**
     * Increase the DAY_OF_YEAR field
     */
    public static long addDayOfYear(long millisecondValue, int amount) {
        return addDayOfYear(millisecondValue, amount, null);
    }

    /**
     * Increase the DAY_OF_MONTH field
     */
    public static long addDayOfMonth(long millisecondValue, int amount, @Nullable Locale locale) {
        return addCalendarField(millisecondValue, Calendar.DAY_OF_MONTH, amount, null, locale);
    }

    /**
     * Increase the DAY_OF_MONTH field
     */
    public static long addDayOfMonth(long millisecondValue, int amount) {
        return addDayOfMonth(millisecondValue, amount, null);
    }

    /**
     * Increase the DAY_OF_WEEK_IN_MONTH field
     */
    public static long addDayOfWeekInMonth(long millisecondValue, int amount, @Nullable Integer firstDayOfWeek, @Nullable Locale locale) {
        return addCalendarField(millisecondValue, Calendar.DAY_OF_WEEK_IN_MONTH, amount, firstDayOfWeek, locale);
    }

    /**
     * Increase the DAY_OF_WEEK_IN_MONTH field
     */
    public static long addDayOfWeekInMonth(long millisecondValue, int amount, @Nullable Integer firstDayOfWeek) {
        return addDayOfWeekInMonth(millisecondValue, amount, firstDayOfWeek, null);
    }

    /**
     * Increase the DAY_OF_WEEK_IN_MONTH field
     */
    public static long addDayOfWeekInMonth(long millisecondValue, int amount, @Nullable Locale locale) {
        return addDayOfWeekInMonth(millisecondValue, amount, null, locale);
    }

    /**
     * Increase the DAY_OF_WEEK_IN_MONTH field
     */
    public static long addDayOfWeekInMonth(long millisecondValue, int amount) {
        return addDayOfWeekInMonth(millisecondValue, amount, null, null);
    }

    /**
     * Increase the DAY_OF_WEEK field
     */
    public static long addDayOfWeek(long millisecondValue, int amount, @Nullable Integer firstDayOfWeek, @Nullable Locale locale) {
        return addCalendarField(millisecondValue, Calendar.DAY_OF_WEEK, amount, firstDayOfWeek, locale);
    }

    /**
     * Increase the DAY_OF_WEEK field
     */
    public static long addDayOfWeek(long millisecondValue, int amount, @Nullable Integer firstDayOfWeek) {
        return addDayOfWeek(millisecondValue, amount, firstDayOfWeek, null);
    }

    /**
     * Increase the DAY_OF_WEEK field
     */
    public static long addDayOfWeek(long millisecondValue, int amount, @Nullable Locale locale) {
        return addDayOfWeek(millisecondValue, amount, null, locale);
    }

    /**
     * Increase the DAY_OF_WEEK field
     */
    public static long addDayOfWeek(long millisecondValue, int amount) {
        return addDayOfWeek(millisecondValue, amount, null, null);
    }

    /**
     * Increase the HOUR_OF_DAY field
     */
    public static long addHourOfDay(long millisecondValue, int amount, @Nullable Locale locale) {
        return addCalendarField(millisecondValue, Calendar.HOUR_OF_DAY, amount, null, locale);
    }

    /**
     * Increase the HOUR_OF_DAY field
     */
    public static long addHourOfDay(long millisecondValue, int amount) {
        return addHourOfDay(millisecondValue, amount, null);
    }

    /**
     * Increase the HOUR field
     */
    public static long addHour(long millisecondValue, int amount, @Nullable Locale locale) {
        return addCalendarField(millisecondValue, Calendar.HOUR, amount, null, locale);
    }

    /**
     * Increase the HOUR field
     */
    public static long addHour(long millisecondValue, int amount) {
        return addHour(millisecondValue, amount, null);
    }

    /**
     * Increase the MINUTE field
     */
    public static long addMinute(long millisecondValue, int amount, @Nullable Locale locale) {
        return addCalendarField(millisecondValue, Calendar.MINUTE, amount, null, locale);
    }

    /**
     * Increase the MINUTE field
     */
    public static long addMinute(long millisecondValue, int amount) {
        return addMinute(millisecondValue, amount, null);
    }

    /**
     * Increase the SECOND field
     */
    public static long addSecond(long millisecondValue, int amount, @Nullable Locale locale) {
        return addCalendarField(millisecondValue, Calendar.SECOND, amount, null, locale);
    }

    /**
     * Increase the SECOND field
     */
    public static long addSecond(long millisecondValue, int amount) {
        return addSecond(millisecondValue, amount, null);
    }

    /**
     * Increase the MILLISECOND field
     */
    public static long addMillisecond(long millisecondValue, int amount, @Nullable Locale locale) {
        return addCalendarField(millisecondValue, Calendar.MILLISECOND, amount, null, locale);
    }

    /**
     * Increase the MILLISECOND field
     */
    public static long addMillisecond(long millisecondValue, int amount) {
        return addMillisecond(millisecondValue, amount, null);
    }


    /*
     * isSame
     */


    /**
     * Return true if the year is the same
     */
    public static boolean isSameYear(@NotNull Calendar calendar, @NotNull Calendar target) {
        return calendar.get(Calendar.ERA) == target.get(Calendar.ERA) && calendar.get(Calendar.YEAR) == target.get(Calendar.YEAR);
    }

    /**
     * Returns true if the year and month are the same
     */
    public static boolean isSameMonth(@NotNull Calendar calendar, @NotNull Calendar target) {
        return calendar.get(Calendar.ERA) == target.get(Calendar.ERA) && calendar.get(Calendar.YEAR) == target.get(Calendar.YEAR)
                && calendar.get(Calendar.MONTH) == target.get(Calendar.MONTH);
    }

    /**
     * Return true if the months is the same
     */
    public static boolean isSameMonthOfYear(@NotNull Calendar calendar, @NotNull Calendar target) {
        return calendar.get(Calendar.ERA) == target.get(Calendar.ERA) && calendar.get(Calendar.MONTH) == target.get(Calendar.MONTH);
    }

    /**
     * Returns true if the year, month, and week are the same
     */
    public static boolean isSameWeek(@NotNull Calendar calendar, @NotNull Calendar target) {
        if (calendar.get(Calendar.ERA) != target.get(Calendar.ERA)) {
            return false;
        } else if (calendar.get(Calendar.YEAR) == target.get(Calendar.YEAR)) {
            // 年份一样可以直接用 WEEK_OF_YEAR 对比
            return calendar.get(Calendar.WEEK_OF_YEAR) == target.get(Calendar.WEEK_OF_YEAR);
        } else if (differDayOfYear(calendar, target, 7)) {
            // day 只相差 7 天说明是年末那几天，也可以直接用 WEEK_OF_YEAR 对比
            return calendar.get(Calendar.WEEK_OF_YEAR) == target.get(Calendar.WEEK_OF_YEAR);
        } else {
            // day 相差超 7 天以上绝不可能是同一周
            return false;
        }
    }

    /**
     * Return true if the weekOfYear is the same
     */
    public static boolean isSameWeekOfYear(@NotNull Calendar calendar, @NotNull Calendar target) {
        return calendar.get(Calendar.ERA) == target.get(Calendar.ERA) && calendar.get(Calendar.WEEK_OF_YEAR) == target.get(Calendar.WEEK_OF_YEAR);
    }

    /**
     * Return true if the weekOfMonth is the same
     */
    public static boolean isSameWeekOfMonth(@NotNull Calendar calendar, @NotNull Calendar target) {
        return calendar.get(Calendar.ERA) == target.get(Calendar.ERA) && calendar.get(Calendar.WEEK_OF_MONTH) == target.get(Calendar.WEEK_OF_MONTH);
    }

    /**
     * Returns true if the year, month, week and day are the same
     */
    public static boolean isSameDay(@NotNull Calendar calendar, @NotNull Calendar target) {
        return calendar.get(Calendar.ERA) == target.get(Calendar.ERA) && calendar.get(Calendar.YEAR) == target.get(Calendar.YEAR)
                && calendar.get(Calendar.MONTH) == target.get(Calendar.MONTH) && calendar.get(Calendar.DAY_OF_MONTH) == target.get(Calendar.DAY_OF_MONTH);
    }

    /**
     * Return true if the dayOfYear is the same
     */
    public static boolean isSameDayOfYear(@NotNull Calendar calendar, @NotNull Calendar target) {
        return calendar.get(Calendar.ERA) == target.get(Calendar.ERA) && calendar.get(Calendar.DAY_OF_YEAR) == target.get(Calendar.DAY_OF_YEAR);
    }

    /**
     * Return true if the dayOfMonth is the same
     */
    public static boolean isSameDayOfMonth(@NotNull Calendar calendar, @NotNull Calendar target) {
        return calendar.get(Calendar.ERA) == target.get(Calendar.ERA) && calendar.get(Calendar.DAY_OF_MONTH) == target.get(Calendar.DAY_OF_MONTH);
    }

    /**
     * Return true if the dayOfWeek is the same
     */
    public static boolean isSameDayOfWeek(@NotNull Calendar calendar, @NotNull Calendar target) {
        return calendar.get(Calendar.ERA) == target.get(Calendar.ERA) && calendar.get(Calendar.DAY_OF_WEEK) == target.get(Calendar.DAY_OF_WEEK);
    }

    /**
     * Return true if the dayOfWeekInMonth is the same
     */
    public static boolean isSameDayOfWeekInMonth(@NotNull Calendar calendar, @NotNull Calendar target) {
        return calendar.get(Calendar.ERA) == target.get(Calendar.ERA) && calendar.get(Calendar.DAY_OF_WEEK_IN_MONTH) == target.get(Calendar.DAY_OF_WEEK_IN_MONTH);
    }

    /**
     * Returns true if the year, month, week, day and hour are the same
     */
    public static boolean isSameHour(@NotNull Calendar calendar, @NotNull Calendar target) {
        return calendar.get(Calendar.ERA) == target.get(Calendar.ERA) && calendar.get(Calendar.YEAR) == target.get(Calendar.YEAR)
                && calendar.get(Calendar.MONTH) == target.get(Calendar.MONTH) && calendar.get(Calendar.DAY_OF_MONTH) == target.get(Calendar.DAY_OF_MONTH)
                && calendar.get(Calendar.HOUR_OF_DAY) == target.get(Calendar.HOUR_OF_DAY);
    }

    /**
     * Return true if the 24H hour is the same
     */
    public static boolean isSameHourOf24H(@NotNull Calendar calendar, @NotNull Calendar target) {
        return calendar.get(Calendar.ERA) == target.get(Calendar.ERA) && calendar.get(Calendar.HOUR_OF_DAY) == target.get(Calendar.HOUR_OF_DAY);
    }

    /**
     * Return true if the 12H hour is the same
     */
    public static boolean isSameHourOf12H(@NotNull Calendar calendar, @NotNull Calendar target) {
        return calendar.get(Calendar.ERA) == target.get(Calendar.ERA) && calendar.get(Calendar.HOUR) == target.get(Calendar.HOUR);
    }

    /**
     * Returns true if the year, month, week, day, hour and minute are the same
     */
    public static boolean isSameMinute(@NotNull Calendar calendar, @NotNull Calendar target) {
        return calendar.get(Calendar.ERA) == target.get(Calendar.ERA) && calendar.get(Calendar.YEAR) == target.get(Calendar.YEAR)
                && calendar.get(Calendar.MONTH) == target.get(Calendar.MONTH) && calendar.get(Calendar.DAY_OF_MONTH) == target.get(Calendar.DAY_OF_MONTH)
                && calendar.get(Calendar.HOUR_OF_DAY) == target.get(Calendar.HOUR_OF_DAY) && calendar.get(Calendar.MINUTE) == target.get(Calendar.MINUTE);
    }

    /**
     * Return true if the minuteOfHour is the same
     */
    public static boolean isSameMinuteOfHour(@NotNull Calendar calendar, @NotNull Calendar target) {
        return calendar.get(Calendar.ERA) == target.get(Calendar.ERA) && calendar.get(Calendar.MINUTE) == target.get(Calendar.MINUTE);
    }

    /**
     * Returns true if the year, month, week, day, hour, minute and second are the same
     */
    public static boolean isSameSecond(@NotNull Calendar calendar, @NotNull Calendar target) {
        return calendar.get(Calendar.ERA) == target.get(Calendar.ERA) && calendar.get(Calendar.YEAR) == target.get(Calendar.YEAR)
                && calendar.get(Calendar.MONTH) == target.get(Calendar.MONTH) && calendar.get(Calendar.DAY_OF_MONTH) == target.get(Calendar.DAY_OF_MONTH)
                && calendar.get(Calendar.HOUR_OF_DAY) == target.get(Calendar.HOUR_OF_DAY) && calendar.get(Calendar.MINUTE) == target.get(Calendar.MINUTE)
                && calendar.get(Calendar.SECOND) == target.get(Calendar.SECOND);
    }

    /**
     * Return true if the secondOfMinute is the same
     */
    public static boolean isSameSecondOfMinute(@NotNull Calendar calendar, @NotNull Calendar target) {
        return calendar.get(Calendar.ERA) == target.get(Calendar.ERA) && calendar.get(Calendar.SECOND) == target.get(Calendar.SECOND);
    }

    /**
     * Returns true if the year, month, week, day, hour, minute, second and millisecond are the same
     */
    public static boolean isSameMillisecond(@NotNull Calendar calendar, @NotNull Calendar target) {
        return calendar.get(Calendar.ERA) == target.get(Calendar.ERA) && calendar.get(Calendar.YEAR) == target.get(Calendar.YEAR)
                && calendar.get(Calendar.MONTH) == target.get(Calendar.MONTH) && calendar.get(Calendar.DAY_OF_MONTH) == target.get(Calendar.DAY_OF_MONTH)
                && calendar.get(Calendar.HOUR_OF_DAY) == target.get(Calendar.HOUR_OF_DAY) && calendar.get(Calendar.MINUTE) == target.get(Calendar.MINUTE)
                && calendar.get(Calendar.SECOND) == target.get(Calendar.SECOND) && calendar.get(Calendar.MILLISECOND) == target.get(Calendar.MILLISECOND);
    }

    /**
     * Return true if the millisecondOfSecond is the same
     */
    public static boolean isSameMillisecondOfSecond(@NotNull Calendar calendar, @NotNull Calendar target) {
        return calendar.get(Calendar.ERA) == target.get(Calendar.ERA) && calendar.get(Calendar.MILLISECOND) == target.get(Calendar.MILLISECOND);
    }


    /**
     * Return true if the year is the same
     */
    public static boolean isSameYear(@NotNull Date date, @NotNull Date target, @Nullable Locale locale) {
        return isSameYear(createCalendar(date, locale), createCalendar(target, locale));
    }

    /**
     * Return true if the year is the same
     */
    public static boolean isSameYear(@NotNull Date date, @NotNull Date target) {
        return isSameYear(date, target, null);
    }

    /**
     * Returns true if the year and month are the same
     */
    public static boolean isSameMonth(@NotNull Date date, @NotNull Date target, @Nullable Locale locale) {
        return isSameMonth(createCalendar(date, locale), createCalendar(target, locale));
    }

    /**
     * Returns true if the year and month are the same
     */
    public static boolean isSameMonth(@NotNull Date date, @NotNull Date target) {
        return isSameMonth(date, target, null);
    }

    /**
     * Return true if the months is the same
     */
    public static boolean isSameMonthOfYear(@NotNull Date date, @NotNull Date target, @Nullable Locale locale) {
        return isSameMonthOfYear(createCalendar(date, locale), createCalendar(target, locale));
    }

    /**
     * Return true if the months is the same
     */
    public static boolean isSameMonthOfYear(@NotNull Date date, @NotNull Date target) {
        return isSameMonthOfYear(date, target, null);
    }

    /**
     * Returns true if the year, month, and week are the same
     */
    public static boolean isSameWeek(@NotNull Date date, @NotNull Date target, @Nullable Integer firstDayOfWeek, @Nullable Locale locale) {
        return isSameWeek(createCalendar(date, firstDayOfWeek, locale), createCalendar(target, firstDayOfWeek, locale));
    }

    /**
     * Returns true if the year, month, and week are the same
     */
    public static boolean isSameWeek(@NotNull Date date, @NotNull Date target, @Nullable Integer firstDayOfWeek) {
        return isSameWeek(date, target, firstDayOfWeek, null);
    }

    /**
     * Returns true if the year, month, and week are the same
     */
    public static boolean isSameWeek(@NotNull Date date, @NotNull Date target, @Nullable Locale locale) {
        return isSameWeek(date, target, null, locale);
    }

    /**
     * Returns true if the year, month, and week are the same
     */
    public static boolean isSameWeek(@NotNull Date date, @NotNull Date target) {
        return isSameWeek(date, target, null, null);
    }

    /**
     * Return true if the weekOfYear is the same
     */
    public static boolean isSameWeekOfYear(@NotNull Date date, @NotNull Date target, @Nullable Integer firstDayOfWeek, @Nullable Locale locale) {
        return isSameWeekOfYear(createCalendar(date, firstDayOfWeek, locale), createCalendar(target, firstDayOfWeek, locale));
    }

    /**
     * Return true if the weekOfYear is the same
     */
    public static boolean isSameWeekOfYear(@NotNull Date date, @NotNull Date target, @Nullable Integer firstDayOfWeek) {
        return isSameWeekOfYear(date, target, firstDayOfWeek, null);
    }

    /**
     * Return true if the weekOfYear is the same
     */
    public static boolean isSameWeekOfYear(@NotNull Date date, @NotNull Date target, @Nullable Locale locale) {
        return isSameWeekOfYear(date, target, null, locale);
    }

    /**
     * Return true if the weekOfYear is the same
     */
    public static boolean isSameWeekOfYear(@NotNull Date date, @NotNull Date target) {
        return isSameWeekOfYear(date, target, null, null);
    }

    /**
     * Return true if the weekOfMonth is the same
     */
    public static boolean isSameWeekOfMonth(@NotNull Date date, @NotNull Date target, @Nullable Integer firstDayOfWeek, @Nullable Locale locale) {
        return isSameWeekOfMonth(createCalendar(date, firstDayOfWeek, locale), createCalendar(target, firstDayOfWeek, locale));
    }

    /**
     * Return true if the weekOfMonth is the same
     */
    public static boolean isSameWeekOfMonth(@NotNull Date date, @NotNull Date target, @Nullable Integer firstDayOfWeek) {
        return isSameWeekOfMonth(date, target, firstDayOfWeek, null);
    }

    /**
     * Return true if the weekOfMonth is the same
     */
    public static boolean isSameWeekOfMonth(@NotNull Date date, @NotNull Date target, @Nullable Locale locale) {
        return isSameWeekOfMonth(date, target, null, locale);
    }

    /**
     * Return true if the weekOfMonth is the same
     */
    public static boolean isSameWeekOfMonth(@NotNull Date date, @NotNull Date target) {
        return isSameWeekOfMonth(date, target, null, null);
    }

    /**
     * Returns true if the year, month, week and day are the same
     */
    public static boolean isSameDay(@NotNull Date date, @NotNull Date target, @Nullable Locale locale) {
        return isSameDay(createCalendar(date, locale), createCalendar(target, locale));
    }

    /**
     * Returns true if the year, month, week and day are the same
     */
    public static boolean isSameDay(@NotNull Date date, @NotNull Date target) {
        return isSameDay(date, target, null);
    }

    /**
     * Return true if the dayOfYear is the same
     */
    public static boolean isSameDayOfYear(@NotNull Date date, @NotNull Date target, @Nullable Locale locale) {
        return isSameDayOfYear(createCalendar(date, locale), createCalendar(target, locale));
    }

    /**
     * Return true if the dayOfYear is the same
     */
    public static boolean isSameDayOfYear(@NotNull Date date, @NotNull Date target) {
        return isSameDayOfYear(date, target, null);
    }

    /**
     * Return true if the dayOfMonth is the same
     */
    public static boolean isSameDayOfMonth(@NotNull Date date, @NotNull Date target, @Nullable Locale locale) {
        return isSameDayOfMonth(createCalendar(date, locale), createCalendar(target, locale));
    }

    /**
     * Return true if the dayOfMonth is the same
     */
    public static boolean isSameDayOfMonth(@NotNull Date date, @NotNull Date target) {
        return isSameDayOfMonth(date, target, null);
    }

    /**
     * Return true if the dayOfWeek is the same
     */
    public static boolean isSameDayOfWeek(@NotNull Date date, @NotNull Date target, @Nullable Integer firstDayOfWeek, @Nullable Locale locale) {
        return isSameDayOfWeek(createCalendar(date, firstDayOfWeek, locale), createCalendar(target, firstDayOfWeek, locale));
    }

    /**
     * Return true if the dayOfWeek is the same
     */
    public static boolean isSameDayOfWeek(@NotNull Date date, @NotNull Date target, @Nullable Integer firstDayOfWeek) {
        return isSameDayOfWeek(date, target, firstDayOfWeek, null);
    }

    /**
     * Return true if the dayOfWeek is the same
     */
    public static boolean isSameDayOfWeek(@NotNull Date date, @NotNull Date target, @Nullable Locale locale) {
        return isSameDayOfWeek(date, target, null, locale);
    }

    /**
     * Return true if the dayOfWeek is the same
     */
    public static boolean isSameDayOfWeek(@NotNull Date date, @NotNull Date target) {
        return isSameDayOfWeek(date, target, null, null);
    }

    /**
     * Return true if the dayOfWeekInMonth is the same
     */
    public static boolean isSameDayOfWeekInMonth(@NotNull Date date, @NotNull Date target, @Nullable Integer firstDayOfWeek, @Nullable Locale locale) {
        return isSameDayOfWeekInMonth(createCalendar(date, firstDayOfWeek, locale), createCalendar(target, firstDayOfWeek, locale));
    }

    /**
     * Return true if the dayOfWeekInMonth is the same
     */
    public static boolean isSameDayOfWeekInMonth(@NotNull Date date, @NotNull Date target, @Nullable Integer firstDayOfWeek) {
        return isSameDayOfWeekInMonth(date, target, firstDayOfWeek, null);
    }

    /**
     * Return true if the dayOfWeekInMonth is the same
     */
    public static boolean isSameDayOfWeekInMonth(@NotNull Date date, @NotNull Date target, @Nullable Locale locale) {
        return isSameDayOfWeekInMonth(date, target, null, locale);
    }

    /**
     * Return true if the dayOfWeekInMonth is the same
     */
    public static boolean isSameDayOfWeekInMonth(@NotNull Date date, @NotNull Date target) {
        return isSameDayOfWeekInMonth(date, target, null, null);
    }

    /**
     * Returns true if the year, month, week, day and hour are the same
     */
    public static boolean isSameHour(@NotNull Date date, @NotNull Date target, @Nullable Locale locale) {
        return isSameHour(createCalendar(date, locale), createCalendar(target, locale));
    }

    /**
     * Returns true if the year, month, week, day and hour are the same
     */
    public static boolean isSameHour(@NotNull Date date, @NotNull Date target) {
        return isSameHour(date, target, null);
    }

    /**
     * Return true if the 24H hour is the same
     */
    public static boolean isSameHourOf24H(@NotNull Date date, @NotNull Date target, @Nullable Locale locale) {
        return isSameHourOf24H(createCalendar(date, locale), createCalendar(target, locale));
    }

    /**
     * Return true if the 24H hour is the same
     */
    public static boolean isSameHourOf24H(@NotNull Date date, @NotNull Date target) {
        return isSameHourOf24H(date, target, null);
    }

    /**
     * Return true if the 12H hour is the same
     */
    public static boolean isSameHourOf12H(@NotNull Date date, @NotNull Date target, @Nullable Locale locale) {
        return isSameHourOf12H(createCalendar(date, locale), createCalendar(target, locale));
    }

    /**
     * Return true if the 12H hour is the same
     */
    public static boolean isSameHourOf12H(@NotNull Date date, @NotNull Date target) {
        return isSameHourOf12H(date, target, null);
    }

    /**
     * Returns true if the year, month, week, day, hour and minute are the same
     */
    public static boolean isSameMinute(@NotNull Date date, @NotNull Date target, @Nullable Locale locale) {
        return isSameMinute(createCalendar(date, locale), createCalendar(target, locale));
    }

    /**
     * Returns true if the year, month, week, day, hour and minute are the same
     */
    public static boolean isSameMinute(@NotNull Date date, @NotNull Date target) {
        return isSameMinute(date, target, null);
    }

    /**
     * Return true if the minuteOfHour is the same
     */
    public static boolean isSameMinuteOfHour(@NotNull Date date, @NotNull Date target, @Nullable Locale locale) {
        return isSameMinuteOfHour(createCalendar(date, locale), createCalendar(target, locale));
    }

    /**
     * Return true if the minuteOfHour is the same
     */
    public static boolean isSameMinuteOfHour(@NotNull Date date, @NotNull Date target) {
        return isSameMinuteOfHour(date, target, null);
    }

    /**
     * Returns true if the year, month, week, day, hour, minute and second are the same
     */
    public static boolean isSameSecond(@NotNull Date date, @NotNull Date target, @Nullable Locale locale) {
        return isSameSecond(createCalendar(date, locale), createCalendar(target, locale));
    }

    /**
     * Returns true if the year, month, week, day, hour, minute and second are the same
     */
    public static boolean isSameSecond(@NotNull Date date, @NotNull Date target) {
        return isSameSecond(date, target, null);
    }

    /**
     * Return true if the secondOfMinute is the same
     */
    public static boolean isSameSecondOfMinute(@NotNull Date date, @NotNull Date target, @Nullable Locale locale) {
        return isSameSecondOfMinute(createCalendar(date, locale), createCalendar(target, locale));
    }

    /**
     * Return true if the secondOfMinute is the same
     */
    public static boolean isSameSecondOfMinute(@NotNull Date date, @NotNull Date target) {
        return isSameSecondOfMinute(date, target, null);
    }

    /**
     * Returns true if the year, month, week, day, hour, minute, second and millisecond are the same
     */
    public static boolean isSameMillisecond(@NotNull Date date, @NotNull Date target, @Nullable Locale locale) {
        return isSameMillisecond(createCalendar(date, locale), createCalendar(target, locale));
    }

    /**
     * Returns true if the year, month, week, day, hour, minute, second and millisecond are the same
     */
    public static boolean isSameMillisecond(@NotNull Date date, @NotNull Date target) {
        return isSameMillisecond(date, target, null);
    }

    /**
     * Return true if the millisecondOfSecond is the same
     */
    public static boolean isSameMillisecondOfSecond(@NotNull Date date, @NotNull Date target, @Nullable Locale locale) {
        return isSameMillisecondOfSecond(createCalendar(date, locale), createCalendar(target, locale));
    }

    /**
     * Return true if the millisecondOfSecond is the same
     */
    public static boolean isSameMillisecondOfSecond(@NotNull Date date, @NotNull Date target) {
        return isSameMillisecondOfSecond(date, target, null);
    }


    /**
     * Return true if the year is the same
     */
    public static boolean isSameYear(long millisecondValue, long target, @Nullable Locale locale) {
        return isSameYear(createCalendar(millisecondValue, locale), createCalendar(target, locale));
    }

    /**
     * Return true if the year is the same
     */
    public static boolean isSameYear(long millisecondValue, long target) {
        return isSameYear(millisecondValue, target, null);
    }

    /**
     * Returns true if the year and month are the same
     */
    public static boolean isSameMonth(long millisecondValue, long target, @Nullable Locale locale) {
        return isSameMonth(createCalendar(millisecondValue, locale), createCalendar(target, locale));
    }

    /**
     * Returns true if the year and month are the same
     */
    public static boolean isSameMonth(long millisecondValue, long target) {
        return isSameMonth(millisecondValue, target, null);
    }

    /**
     * Return true if the months is the same
     */
    public static boolean isSameMonthOfYear(long millisecondValue, long target, @Nullable Locale locale) {
        return isSameMonthOfYear(createCalendar(millisecondValue, locale), createCalendar(target, locale));
    }

    /**
     * Return true if the months is the same
     */
    public static boolean isSameMonthOfYear(long millisecondValue, long target) {
        return isSameMonthOfYear(millisecondValue, target, null);
    }

    /**
     * Returns true if the year, month, and week are the same
     */
    public static boolean isSameWeek(long millisecondValue, long target, @Nullable Integer firstDayOfWeek, @Nullable Locale locale) {
        return isSameWeek(createCalendar(millisecondValue, firstDayOfWeek, locale), createCalendar(target, firstDayOfWeek, locale));
    }

    /**
     * Returns true if the year, month, and week are the same
     */
    public static boolean isSameWeek(long millisecondValue, long target, @Nullable Integer firstDayOfWeek) {
        return isSameWeek(millisecondValue, target, firstDayOfWeek, null);
    }

    /**
     * Returns true if the year, month, and week are the same
     */
    public static boolean isSameWeek(long millisecondValue, long target, @Nullable Locale locale) {
        return isSameWeek(millisecondValue, target, null, locale);
    }

    /**
     * Returns true if the year, month, and week are the same
     */
    public static boolean isSameWeek(long millisecondValue, long target) {
        return isSameWeek(millisecondValue, target, null, null);
    }

    /**
     * Return true if the weekOfYear is the same
     */
    public static boolean isSameWeekOfYear(long millisecondValue, long target, @Nullable Integer firstDayOfWeek, @Nullable Locale locale) {
        return isSameWeekOfYear(createCalendar(millisecondValue, firstDayOfWeek, locale), createCalendar(target, firstDayOfWeek, locale));
    }

    /**
     * Return true if the weekOfYear is the same
     */
    public static boolean isSameWeekOfYear(long millisecondValue, long target, @Nullable Integer firstDayOfWeek) {
        return isSameWeekOfYear(millisecondValue, target, firstDayOfWeek, null);
    }

    /**
     * Return true if the weekOfYear is the same
     */
    public static boolean isSameWeekOfYear(long millisecondValue, long target, @Nullable Locale locale) {
        return isSameWeekOfYear(millisecondValue, target, null, locale);
    }

    /**
     * Return true if the weekOfYear is the same
     */
    public static boolean isSameWeekOfYear(long millisecondValue, long target) {
        return isSameWeekOfYear(millisecondValue, target, null, null);
    }

    /**
     * Return true if the weekOfMonth is the same
     */
    public static boolean isSameWeekOfMonth(long millisecondValue, long target, @Nullable Integer firstDayOfWeek, @Nullable Locale locale) {
        return isSameWeekOfMonth(createCalendar(millisecondValue, firstDayOfWeek, locale), createCalendar(target, firstDayOfWeek, locale));
    }

    /**
     * Return true if the weekOfMonth is the same
     */
    public static boolean isSameWeekOfMonth(long millisecondValue, long target, @Nullable Integer firstDayOfWeek) {
        return isSameWeekOfMonth(millisecondValue, target, firstDayOfWeek, null);
    }

    /**
     * Return true if the weekOfMonth is the same
     */
    public static boolean isSameWeekOfMonth(long millisecondValue, long target, @Nullable Locale locale) {
        return isSameWeekOfMonth(millisecondValue, target, null, locale);
    }

    /**
     * Return true if the weekOfMonth is the same
     */
    public static boolean isSameWeekOfMonth(long millisecondValue, long target) {
        return isSameWeekOfMonth(millisecondValue, target, null, null);
    }

    /**
     * Returns true if the year, month, week and day are the same
     */
    public static boolean isSameDay(long millisecondValue, long target, @Nullable Locale locale) {
        return isSameDay(createCalendar(millisecondValue, locale), createCalendar(target, locale));
    }

    /**
     * Returns true if the year, month, week and day are the same
     */
    public static boolean isSameDay(long millisecondValue, long target) {
        return isSameDay(millisecondValue, target, null);
    }

    /**
     * Return true if the dayOfYear is the same
     */
    public static boolean isSameDayOfYear(long millisecondValue, long target, @Nullable Locale locale) {
        return isSameDayOfYear(createCalendar(millisecondValue, locale), createCalendar(target, locale));
    }

    /**
     * Return true if the dayOfYear is the same
     */
    public static boolean isSameDayOfYear(long millisecondValue, long target) {
        return isSameDayOfYear(millisecondValue, target, null);
    }

    /**
     * Return true if the dayOfMonth is the same
     */
    public static boolean isSameDayOfMonth(long millisecondValue, long target, @Nullable Locale locale) {
        return isSameDayOfMonth(createCalendar(millisecondValue, locale), createCalendar(target, locale));
    }

    /**
     * Return true if the dayOfMonth is the same
     */
    public static boolean isSameDayOfMonth(long millisecondValue, long target) {
        return isSameDayOfMonth(millisecondValue, target, null);
    }

    /**
     * Return true if the dayOfWeek is the same
     */
    public static boolean isSameDayOfWeek(long millisecondValue, long target, @Nullable Integer firstDayOfWeek, @Nullable Locale locale) {
        return isSameDayOfWeek(createCalendar(millisecondValue, firstDayOfWeek, locale), createCalendar(target, firstDayOfWeek, locale));
    }

    /**
     * Return true if the dayOfWeek is the same
     */
    public static boolean isSameDayOfWeek(long millisecondValue, long target, @Nullable Integer firstDayOfWeek) {
        return isSameDayOfWeek(millisecondValue, target, firstDayOfWeek, null);
    }

    /**
     * Return true if the dayOfWeek is the same
     */
    public static boolean isSameDayOfWeek(long millisecondValue, long target, @Nullable Locale locale) {
        return isSameDayOfWeek(millisecondValue, target, null, locale);
    }

    /**
     * Return true if the dayOfWeek is the same
     */
    public static boolean isSameDayOfWeek(long millisecondValue, long target) {
        return isSameDayOfWeek(millisecondValue, target, null, null);
    }

    /**
     * Return true if the dayOfWeekInMonth is the same
     */
    public static boolean isSameDayOfWeekInMonth(long millisecondValue, long target, @Nullable Integer firstDayOfWeek, @Nullable Locale locale) {
        return isSameDayOfWeekInMonth(createCalendar(millisecondValue, firstDayOfWeek, locale), createCalendar(target, firstDayOfWeek, locale));
    }

    /**
     * Return true if the dayOfWeekInMonth is the same
     */
    public static boolean isSameDayOfWeekInMonth(long millisecondValue, long target, @Nullable Integer firstDayOfWeek) {
        return isSameDayOfWeekInMonth(millisecondValue, target, firstDayOfWeek, null);
    }

    /**
     * Return true if the dayOfWeekInMonth is the same
     */
    public static boolean isSameDayOfWeekInMonth(long millisecondValue, long target, @Nullable Locale locale) {
        return isSameDayOfWeekInMonth(millisecondValue, target, null, locale);
    }

    /**
     * Return true if the dayOfWeekInMonth is the same
     */
    public static boolean isSameDayOfWeekInMonth(long millisecondValue, long target) {
        return isSameDayOfWeekInMonth(millisecondValue, target, null, null);
    }

    /**
     * Returns true if the year, month, week, day and hour are the same
     */
    public static boolean isSameHour(long millisecondValue, long target, @Nullable Locale locale) {
        return isSameHour(createCalendar(millisecondValue, locale), createCalendar(target, locale));
    }

    /**
     * Returns true if the year, month, week, day and hour are the same
     */
    public static boolean isSameHour(long millisecondValue, long target) {
        return isSameHour(millisecondValue, target, null);
    }

    /**
     * Return true if the 24H hour is the same
     */
    public static boolean isSameHourOf24H(long millisecondValue, long target, @Nullable Locale locale) {
        return isSameHourOf24H(createCalendar(millisecondValue, locale), createCalendar(target, locale));
    }

    /**
     * Return true if the 24H hour is the same
     */
    public static boolean isSameHourOf24H(long millisecondValue, long target) {
        return isSameHourOf24H(millisecondValue, target, null);
    }

    /**
     * Return true if the 12H hour is the same
     */
    public static boolean isSameHourOf12H(long millisecondValue, long target, @Nullable Locale locale) {
        return isSameHourOf12H(createCalendar(millisecondValue, locale), createCalendar(target, locale));
    }

    /**
     * Return true if the 12H hour is the same
     */
    public static boolean isSameHourOf12H(long millisecondValue, long target) {
        return isSameHourOf12H(millisecondValue, target, null);
    }

    /**
     * Returns true if the year, month, week, day, hour and minute are the same
     */
    public static boolean isSameMinute(long millisecondValue, long target, @Nullable Locale locale) {
        return isSameMinute(createCalendar(millisecondValue, locale), createCalendar(target, locale));
    }

    /**
     * Returns true if the year, month, week, day, hour and minute are the same
     */
    public static boolean isSameMinute(long millisecondValue, long target) {
        return isSameMinute(millisecondValue, target, null);
    }

    /**
     * Return true if the minuteOfHour is the same
     */
    public static boolean isSameMinuteOfHour(long millisecondValue, long target, @Nullable Locale locale) {
        return isSameMinuteOfHour(createCalendar(millisecondValue, locale), createCalendar(target, locale));
    }

    /**
     * Return true if the minuteOfHour is the same
     */
    public static boolean isSameMinuteOfHour(long millisecondValue, long target) {
        return isSameMinuteOfHour(millisecondValue, target, null);
    }

    /**
     * Returns true if the year, month, week, day, hour, minute and second are the same
     */
    public static boolean isSameSecond(long millisecondValue, long target, @Nullable Locale locale) {
        return isSameSecond(createCalendar(millisecondValue, locale), createCalendar(target, locale));
    }

    /**
     * Returns true if the year, month, week, day, hour, minute and second are the same
     */
    public static boolean isSameSecond(long millisecondValue, long target) {
        return isSameSecond(millisecondValue, target, null);
    }

    /**
     * Return true if the secondOfMinute is the same
     */
    public static boolean isSameSecondOfMinute(long millisecondValue, long target, @Nullable Locale locale) {
        return isSameSecondOfMinute(createCalendar(millisecondValue, locale), createCalendar(target, locale));
    }

    /**
     * Return true if the secondOfMinute is the same
     */
    public static boolean isSameSecondOfMinute(long millisecondValue, long target) {
        return isSameSecondOfMinute(millisecondValue, target, null);
    }

    /**
     * Returns true if the year, month, week, day, hour, minute, second and millisecond are the same
     */
    public static boolean isSameMillisecond(long millisecondValue, long target, @Nullable Locale locale) {
        return isSameMillisecond(createCalendar(millisecondValue, locale), createCalendar(target, locale));
    }

    /**
     * Returns true if the year, month, week, day, hour, minute, second and millisecond are the same
     */
    public static boolean isSameMillisecond(long millisecondValue, long target) {
        return isSameMillisecond(millisecondValue, target, null);
    }

    /**
     * Return true if the millisecondOfSecond is the same
     */
    public static boolean isSameMillisecondOfSecond(long millisecondValue, long target, @Nullable Locale locale) {
        return isSameMillisecondOfSecond(createCalendar(millisecondValue, locale), createCalendar(target, locale));
    }

    /**
     * Return true if the millisecondOfSecond is the same
     */
    public static boolean isSameMillisecondOfSecond(long millisecondValue, long target) {
        return isSameMillisecondOfSecond(millisecondValue, target, null);
    }


    /*
     * differ
     */


    /**
     * Return true if the difference from the [target] does not exceed the [amount] specified calendar field
     */
    public static boolean differFiled(@NotNull Calendar calendar, @NotNull Calendar target, int field, int amount) {
        if (amount == 0) {
            return true;
        } else {
            int finalAmount = calendar.getTimeInMillis() < target.getTimeInMillis() ? Math.abs(amount) : Math.abs(amount) * -1;
            long cacheTimeInMillis = calendar.getTimeInMillis();
            calendar.add(field, finalAmount);
            long newTimeInMillis = calendar.getTimeInMillis();
            calendar.setTimeInMillis(cacheTimeInMillis);
            return finalAmount > 0 ? target.getTimeInMillis() <= newTimeInMillis : target.getTimeInMillis() >= newTimeInMillis;
        }
    }

    /**
     * Return true if the difference from the [target] does not exceed the [amount] year
     */
    public static boolean differYear(@NotNull Calendar calendar, @NotNull Calendar target, int amount) {
        return differFiled(calendar, target, Calendar.YEAR, amount);
    }

    /**
     * Return true if the difference from the [target] does not exceed the [amount] month
     */
    public static boolean differMonth(@NotNull Calendar calendar, @NotNull Calendar target, int amount) {
        return differFiled(calendar, target, Calendar.MONTH, amount);
    }

    /**
     * Return true if the difference from the [target] does not exceed the [amount] weekOfYear
     */
    public static boolean differWeekOfYear(@NotNull Calendar calendar, @NotNull Calendar target, int amount) {
        return differFiled(calendar, target, Calendar.WEEK_OF_YEAR, amount);
    }

    /**
     * Return true if the difference from the [target] does not exceed the [amount] weekOfMonth
     */
    public static boolean differWeekOfMonth(@NotNull Calendar calendar, @NotNull Calendar target, int amount) {
        return differFiled(calendar, target, Calendar.WEEK_OF_MONTH, amount);
    }

    /**
     * Return true if the difference from the [target] does not exceed the [amount] dayOfYear
     */
    public static boolean differDayOfYear(@NotNull Calendar calendar, @NotNull Calendar target, int amount) {
        return differFiled(calendar, target, Calendar.DAY_OF_YEAR, amount);
    }

    /**
     * Return true if the difference from the [target] does not exceed the [amount] dayOfMonth
     */
    public static boolean differDayOfMonth(@NotNull Calendar calendar, @NotNull Calendar target, int amount) {
        return differFiled(calendar, target, Calendar.DAY_OF_MONTH, amount);
    }

    /**
     * Return true if the difference from the [target] does not exceed the [amount] dayOfWeek
     */
    public static boolean differDayOfWeek(@NotNull Calendar calendar, @NotNull Calendar target, int amount) {
        return differFiled(calendar, target, Calendar.DAY_OF_WEEK, amount);
    }

    /**
     * Return true if the difference from the [target] does not exceed the [amount] dayOfWeekInMonth
     */
    public static boolean differDayOfWeekInMonth(@NotNull Calendar calendar, @NotNull Calendar target, int amount) {
        return differFiled(calendar, target, Calendar.DAY_OF_WEEK_IN_MONTH, amount);
    }

    /**
     * Return true if the difference from the [target] does not exceed the [amount] hourOfDay
     */
    public static boolean differHourOfDay(@NotNull Calendar calendar, @NotNull Calendar target, int amount) {
        return differFiled(calendar, target, Calendar.HOUR_OF_DAY, amount);
    }

    /**
     * Return true if the difference from the [target] does not exceed the [amount] hour
     */
    public static boolean differHour(@NotNull Calendar calendar, @NotNull Calendar target, int amount) {
        return differFiled(calendar, target, Calendar.HOUR, amount);
    }

    /**
     * Return true if the difference from the [target] does not exceed the [amount] minute
     */
    public static boolean differMinute(@NotNull Calendar calendar, @NotNull Calendar target, int amount) {
        return differFiled(calendar, target, Calendar.MINUTE, amount);
    }

    /**
     * Return true if the difference from the [target] does not exceed the [amount] second
     */
    public static boolean differSecond(@NotNull Calendar calendar, @NotNull Calendar target, int amount) {
        return differFiled(calendar, target, Calendar.SECOND, amount);
    }

    /**
     * Return true if the difference from the [target] does not exceed the [amount] millisecond
     */
    public static boolean differMillisecond(@NotNull Calendar calendar, @NotNull Calendar target, int amount) {
        return differFiled(calendar, target, Calendar.MILLISECOND, amount);
    }


    /**
     * Return true if the difference from the [target] does not exceed the [amount] specified calendar field
     */
    public static boolean differCalendarField(@NotNull Date date, @NotNull Date target, int field, int amount, @Nullable Integer firstDayOfWeek, @Nullable Locale locale) {
        return differFiled(createCalendar(date, firstDayOfWeek, locale), createCalendar(target, firstDayOfWeek, locale), field, amount);
    }

    /**
     * Return true if the difference from the [target] does not exceed the [amount] specified calendar field
     */
    public static boolean differCalendarField(@NotNull Date date, @NotNull Date target, int field, int amount, @Nullable Integer firstDayOfWeek) {
        return differCalendarField(date, target, field, amount, firstDayOfWeek, null);
    }

    /**
     * Return true if the difference from the [target] does not exceed the [amount] specified calendar field
     */
    public static boolean differCalendarField(@NotNull Date date, @NotNull Date target, int field, int amount, @Nullable Locale locale) {
        return differCalendarField(date, target, field, amount, null, locale);
    }

    /**
     * Return true if the difference from the [target] does not exceed the [amount] specified calendar field
     */
    public static boolean differCalendarField(@NotNull Date date, @NotNull Date target, int field, int amount) {
        return differCalendarField(date, target, field, amount, null, null);
    }

    /**
     * Return true if the difference from the [target] does not exceed the [amount] year
     */
    public static boolean differYear(@NotNull Date date, @NotNull Date target, int amount, @Nullable Locale locale) {
        return differYear(createCalendar(date, locale), createCalendar(target, locale), amount);
    }

    /**
     * Return true if the difference from the [target] does not exceed the [amount] year
     */
    public static boolean differYear(@NotNull Date date, @NotNull Date target, int amount) {
        return differYear(date, target, amount, null);
    }

    /**
     * Return true if the difference from the [target] does not exceed the [amount] month
     */
    public static boolean differMonth(@NotNull Date date, @NotNull Date target, int amount, @Nullable Locale locale) {
        return differMonth(createCalendar(date, locale), createCalendar(target, locale), amount);
    }

    /**
     * Return true if the difference from the [target] does not exceed the [amount] month
     */
    public static boolean differMonth(@NotNull Date date, @NotNull Date target, int amount) {
        return differMonth(date, target, amount, null);
    }

    /**
     * Return true if the difference from the [target] does not exceed the [amount] weekOfYear
     */
    public static boolean differWeekOfYear(@NotNull Date date, @NotNull Date target, int amount, @Nullable Integer firstDayOfWeek, @Nullable Locale locale) {
        return differWeekOfYear(createCalendar(date, firstDayOfWeek, locale), createCalendar(target, firstDayOfWeek, locale), amount);
    }

    /**
     * Return true if the difference from the [target] does not exceed the [amount] weekOfYear
     */
    public static boolean differWeekOfYear(@NotNull Date date, @NotNull Date target, int amount, @Nullable Integer firstDayOfWeek) {
        return differWeekOfYear(createCalendar(date, firstDayOfWeek), createCalendar(target, firstDayOfWeek), amount);
    }

    /**
     * Return true if the difference from the [target] does not exceed the [amount] weekOfYear
     */
    public static boolean differWeekOfYear(@NotNull Date date, @NotNull Date target, int amount, @Nullable Locale locale) {
        return differWeekOfYear(createCalendar(date, locale), createCalendar(target, locale), amount);
    }

    /**
     * Return true if the difference from the [target] does not exceed the [amount] weekOfYear
     */
    public static boolean differWeekOfYear(@NotNull Date date, @NotNull Date target, int amount) {
        return differWeekOfYear(date, target, amount, null, null);
    }

    /**
     * Return true if the difference from the [target] does not exceed the [amount] weekOfMonth
     */
    public static boolean differWeekOfMonth(@NotNull Date date, @NotNull Date target, int amount, @Nullable Integer firstDayOfWeek, @Nullable Locale locale) {
        return differWeekOfMonth(createCalendar(date, firstDayOfWeek, locale), createCalendar(target, firstDayOfWeek, locale), amount);
    }

    /**
     * Return true if the difference from the [target] does not exceed the [amount] weekOfMonth
     */
    public static boolean differWeekOfMonth(@NotNull Date date, @NotNull Date target, int amount, @Nullable Integer firstDayOfWeek) {
        return differWeekOfMonth(createCalendar(date, firstDayOfWeek), createCalendar(target, firstDayOfWeek), amount);
    }

    /**
     * Return true if the difference from the [target] does not exceed the [amount] weekOfMonth
     */
    public static boolean differWeekOfMonth(@NotNull Date date, @NotNull Date target, int amount, @Nullable Locale locale) {
        return differWeekOfMonth(createCalendar(date, locale), createCalendar(target, locale), amount);
    }

    /**
     * Return true if the difference from the [target] does not exceed the [amount] weekOfMonth
     */
    public static boolean differWeekOfMonth(@NotNull Date date, @NotNull Date target, int amount) {
        return differWeekOfMonth(date, target, amount, null, null);
    }

    /**
     * Return true if the difference from the [target] does not exceed the [amount] dayOfYear
     */
    public static boolean differDayOfYear(@NotNull Date date, @NotNull Date target, int amount, @Nullable Locale locale) {
        return differDayOfYear(createCalendar(date, locale), createCalendar(target, locale), amount);
    }

    /**
     * Return true if the difference from the [target] does not exceed the [amount] dayOfYear
     */
    public static boolean differDayOfYear(@NotNull Date date, @NotNull Date target, int amount) {
        return differDayOfYear(date, target, amount, null);
    }

    /**
     * Return true if the difference from the [target] does not exceed the [amount] dayOfMonth
     */
    public static boolean differDayOfMonth(@NotNull Date date, @NotNull Date target, int amount, @Nullable Locale locale) {
        return differDayOfMonth(createCalendar(date, locale), createCalendar(target, locale), amount);
    }

    /**
     * Return true if the difference from the [target] does not exceed the [amount] dayOfMonth
     */
    public static boolean differDayOfMonth(@NotNull Date date, @NotNull Date target, int amount) {
        return differDayOfMonth(date, target, amount, null);
    }

    /**
     * Return true if the difference from the [target] does not exceed the [amount] dayOfWeek
     */
    public static boolean differDayOfWeek(@NotNull Date date, @NotNull Date target, int amount, @Nullable Integer firstDayOfWeek, @Nullable Locale locale) {
        return differDayOfWeek(createCalendar(date, firstDayOfWeek, locale), createCalendar(target, firstDayOfWeek, locale), amount);
    }

    /**
     * Return true if the difference from the [target] does not exceed the [amount] dayOfWeek
     */
    public static boolean differDayOfWeek(@NotNull Date date, @NotNull Date target, int amount, @Nullable Integer firstDayOfWeek) {
        return differDayOfWeek(createCalendar(date, firstDayOfWeek), createCalendar(target, firstDayOfWeek), amount);
    }

    /**
     * Return true if the difference from the [target] does not exceed the [amount] dayOfWeek
     */
    public static boolean differDayOfWeek(@NotNull Date date, @NotNull Date target, int amount, @Nullable Locale locale) {
        return differDayOfWeek(createCalendar(date, locale), createCalendar(target, locale), amount);
    }

    /**
     * Return true if the difference from the [target] does not exceed the [amount] dayOfWeek
     */
    public static boolean differDayOfWeek(@NotNull Date date, @NotNull Date target, int amount) {
        return differDayOfWeek(date, target, amount, null, null);
    }

    /**
     * Return true if the difference from the [target] does not exceed the [amount] dayOfWeekInMonth
     */
    public static boolean differDayOfWeekInMonth(@NotNull Date date, @NotNull Date target, int amount, @Nullable Integer firstDayOfWeek, @Nullable Locale locale) {
        return differDayOfWeekInMonth(createCalendar(date, firstDayOfWeek, locale), createCalendar(target, firstDayOfWeek, locale), amount);
    }

    /**
     * Return true if the difference from the [target] does not exceed the [amount] dayOfWeekInMonth
     */
    public static boolean differDayOfWeekInMonth(@NotNull Date date, @NotNull Date target, int amount, @Nullable Integer firstDayOfWeek) {
        return differDayOfWeekInMonth(createCalendar(date, firstDayOfWeek), createCalendar(target, firstDayOfWeek), amount);
    }

    /**
     * Return true if the difference from the [target] does not exceed the [amount] dayOfWeekInMonth
     */
    public static boolean differDayOfWeekInMonth(@NotNull Date date, @NotNull Date target, int amount, @Nullable Locale locale) {
        return differDayOfWeekInMonth(createCalendar(date, locale), createCalendar(target, locale), amount);
    }

    /**
     * Return true if the difference from the [target] does not exceed the [amount] dayOfWeekInMonth
     */
    public static boolean differDayOfWeekInMonth(@NotNull Date date, @NotNull Date target, int amount) {
        return differDayOfWeekInMonth(date, target, amount, null, null);
    }

    /**
     * Return true if the difference from the [target] does not exceed the [amount] hourOfDay
     */
    public static boolean differHourOfDay(@NotNull Date date, @NotNull Date target, int amount, @Nullable Locale locale) {
        return differHourOfDay(createCalendar(date, locale), createCalendar(target, locale), amount);
    }

    /**
     * Return true if the difference from the [target] does not exceed the [amount] hourOfDay
     */
    public static boolean differHourOfDay(@NotNull Date date, @NotNull Date target, int amount) {
        return differHourOfDay(date, target, amount, null);
    }

    /**
     * Return true if the difference from the [target] does not exceed the [amount] hour
     */
    public static boolean differHour(@NotNull Date date, @NotNull Date target, int amount, @Nullable Locale locale) {
        return differHour(createCalendar(date, locale), createCalendar(target, locale), amount);
    }

    /**
     * Return true if the difference from the [target] does not exceed the [amount] hour
     */
    public static boolean differHour(@NotNull Date date, @NotNull Date target, int amount) {
        return differHour(date, target, amount, null);
    }

    /**
     * Return true if the difference from the [target] does not exceed the [amount] minute
     */
    public static boolean differMinute(@NotNull Date date, @NotNull Date target, int amount, @Nullable Locale locale) {
        return differMinute(createCalendar(date, locale), createCalendar(target, locale), amount);
    }

    /**
     * Return true if the difference from the [target] does not exceed the [amount] minute
     */
    public static boolean differMinute(@NotNull Date date, @NotNull Date target, int amount) {
        return differMinute(date, target, amount, null);
    }

    /**
     * Return true if the difference from the [target] does not exceed the [amount] second
     */
    public static boolean differSecond(@NotNull Date date, @NotNull Date target, int amount, @Nullable Locale locale) {
        return differSecond(createCalendar(date, locale), createCalendar(target, locale), amount);
    }

    /**
     * Return true if the difference from the [target] does not exceed the [amount] second
     */
    public static boolean differSecond(@NotNull Date date, @NotNull Date target, int amount) {
        return differSecond(date, target, amount, null);
    }

    /**
     * Return true if the difference from the [target] does not exceed the [amount] millisecond
     */
    public static boolean differMillisecond(@NotNull Date date, @NotNull Date target, int amount, @Nullable Locale locale) {
        return differMillisecond(createCalendar(date, locale), createCalendar(target, locale), amount);
    }

    /**
     * Return true if the difference from the [target] does not exceed the [amount] millisecond
     */
    public static boolean differMillisecond(@NotNull Date date, @NotNull Date target, int amount) {
        return differMillisecond(date, target, amount, null);
    }


    /**
     * Return true if the difference from the [target] does not exceed the [amount] year
     */
    public static boolean differCalendarField(long millisecondValue, long target, int field, int amount, @Nullable Locale locale) {
        return differFiled(createCalendar(millisecondValue, locale), createCalendar(target, locale), field, amount);
    }

    /**
     * Return true if the difference from the [target] does not exceed the [amount] year
     */
    public static boolean differCalendarField(long millisecondValue, long target, int field, int amount) {
        return differCalendarField(millisecondValue, target, field, amount, null);
    }

    /**
     * Return true if the difference from the [target] does not exceed the [amount] year
     */
    public static boolean differYear(long millisecondValue, long target, int amount, @Nullable Locale locale) {
        return differYear(createCalendar(millisecondValue, locale), createCalendar(target, locale), amount);
    }

    /**
     * Return true if the difference from the [target] does not exceed the [amount] year
     */
    public static boolean differYear(long millisecondValue, long target, int amount) {
        return differYear(millisecondValue, target, amount, null);
    }

    /**
     * Return true if the difference from the [target] does not exceed the [amount] month
     */
    public static boolean differMonth(long millisecondValue, long target, int amount, @Nullable Locale locale) {
        return differMonth(createCalendar(millisecondValue, locale), createCalendar(target, locale), amount);
    }

    /**
     * Return true if the difference from the [target] does not exceed the [amount] month
     */
    public static boolean differMonth(long millisecondValue, long target, int amount) {
        return differMonth(millisecondValue, target, amount, null);
    }

    /**
     * Return true if the difference from the [target] does not exceed the [amount] weekOfYear
     */
    public static boolean differWeekOfYear(long millisecondValue, long target, int amount, @Nullable Integer firstDayOfWeek, @Nullable Locale locale) {
        return differWeekOfYear(createCalendar(millisecondValue, firstDayOfWeek, locale), createCalendar(target, firstDayOfWeek, locale), amount);
    }

    /**
     * Return true if the difference from the [target] does not exceed the [amount] weekOfYear
     */
    public static boolean differWeekOfYear(long millisecondValue, long target, int amount, @Nullable Integer firstDayOfWeek) {
        return differWeekOfYear(millisecondValue, target, amount, firstDayOfWeek, null);
    }

    /**
     * Return true if the difference from the [target] does not exceed the [amount] weekOfYear
     */
    public static boolean differWeekOfYear(long millisecondValue, long target, int amount, @Nullable Locale locale) {
        return differWeekOfYear(millisecondValue, target, amount, null, locale);
    }

    /**
     * Return true if the difference from the [target] does not exceed the [amount] weekOfYear
     */
    public static boolean differWeekOfYear(long millisecondValue, long target, int amount) {
        return differWeekOfYear(millisecondValue, target, amount, null, null);
    }

    /**
     * Return true if the difference from the [target] does not exceed the [amount] weekOfMonth
     */
    public static boolean differWeekOfMonth(long millisecondValue, long target, int amount, @Nullable Integer firstDayOfWeek, @Nullable Locale locale) {
        return differWeekOfMonth(createCalendar(millisecondValue, firstDayOfWeek, locale), createCalendar(target, firstDayOfWeek, locale), amount);
    }

    /**
     * Return true if the difference from the [target] does not exceed the [amount] weekOfMonth
     */
    public static boolean differWeekOfMonth(long millisecondValue, long target, int amount, @Nullable Integer firstDayOfWeek) {
        return differWeekOfMonth(millisecondValue, target, amount, firstDayOfWeek, null);
    }

    /**
     * Return true if the difference from the [target] does not exceed the [amount] weekOfMonth
     */
    public static boolean differWeekOfMonth(long millisecondValue, long target, int amount, @Nullable Locale locale) {
        return differWeekOfMonth(millisecondValue, target, amount, null, locale);
    }

    /**
     * Return true if the difference from the [target] does not exceed the [amount] weekOfMonth
     */
    public static boolean differWeekOfMonth(long millisecondValue, long target, int amount) {
        return differWeekOfMonth(millisecondValue, target, amount, null, null);
    }

    /**
     * Return true if the difference from the [target] does not exceed the [amount] dayOfYear
     */
    public static boolean differDayOfYear(long millisecondValue, long target, int amount, @Nullable Locale locale) {
        return differDayOfYear(createCalendar(millisecondValue, locale), createCalendar(target, locale), amount);
    }

    /**
     * Return true if the difference from the [target] does not exceed the [amount] dayOfYear
     */
    public static boolean differDayOfYear(long millisecondValue, long target, int amount) {
        return differDayOfYear(millisecondValue, target, amount, null);
    }

    /**
     * Return true if the difference from the [target] does not exceed the [amount] dayOfMonth
     */
    public static boolean differDayOfMonth(long millisecondValue, long target, int amount, @Nullable Locale locale) {
        return differDayOfMonth(createCalendar(millisecondValue, locale), createCalendar(target, locale), amount);
    }

    /**
     * Return true if the difference from the [target] does not exceed the [amount] dayOfMonth
     */
    public static boolean differDayOfMonth(long millisecondValue, long target, int amount) {
        return differDayOfMonth(millisecondValue, target, amount, null);
    }

    /**
     * Return true if the difference from the [target] does not exceed the [amount] dayOfWeek
     */
    public static boolean differDayOfWeek(long millisecondValue, long target, int amount, @Nullable Integer firstDayOfWeek, @Nullable Locale locale) {
        return differDayOfWeek(createCalendar(millisecondValue, firstDayOfWeek, locale), createCalendar(target, firstDayOfWeek, locale), amount);
    }

    /**
     * Return true if the difference from the [target] does not exceed the [amount] dayOfWeek
     */
    public static boolean differDayOfWeek(long millisecondValue, long target, int amount, @Nullable Integer firstDayOfWeek) {
        return differDayOfWeek(millisecondValue, target, amount, firstDayOfWeek, null);
    }

    /**
     * Return true if the difference from the [target] does not exceed the [amount] dayOfWeek
     */
    public static boolean differDayOfWeek(long millisecondValue, long target, int amount, @Nullable Locale locale) {
        return differDayOfWeek(millisecondValue, target, amount, null, locale);
    }

    /**
     * Return true if the difference from the [target] does not exceed the [amount] dayOfWeek
     */
    public static boolean differDayOfWeek(long millisecondValue, long target, int amount) {
        return differDayOfWeek(millisecondValue, target, amount, null, null);
    }

    /**
     * Return true if the difference from the [target] does not exceed the [amount] dayOfWeekInMonth
     */
    public static boolean differDayOfWeekInMonth(long millisecondValue, long target, int amount, @Nullable Integer firstDayOfWeek, @Nullable Locale locale) {
        return differDayOfWeekInMonth(createCalendar(millisecondValue, firstDayOfWeek, locale), createCalendar(target, firstDayOfWeek, locale), amount);
    }

    /**
     * Return true if the difference from the [target] does not exceed the [amount] dayOfWeekInMonth
     */
    public static boolean differDayOfWeekInMonth(long millisecondValue, long target, int amount, @Nullable Integer firstDayOfWeek) {
        return differDayOfWeekInMonth(millisecondValue, target, amount, firstDayOfWeek, null);
    }

    /**
     * Return true if the difference from the [target] does not exceed the [amount] dayOfWeekInMonth
     */
    public static boolean differDayOfWeekInMonth(long millisecondValue, long target, int amount, @Nullable Locale locale) {
        return differDayOfWeekInMonth(millisecondValue, target, amount, null, locale);
    }

    /**
     * Return true if the difference from the [target] does not exceed the [amount] dayOfWeekInMonth
     */
    public static boolean differDayOfWeekInMonth(long millisecondValue, long target, int amount) {
        return differDayOfWeekInMonth(millisecondValue, target, amount, null, null);
    }

    /**
     * Return true if the difference from the [target] does not exceed the [amount] hourOfDay
     */
    public static boolean differHourOfDay(long millisecondValue, long target, int amount, @Nullable Locale locale) {
        return differHourOfDay(createCalendar(millisecondValue, locale), createCalendar(target, locale), amount);
    }

    /**
     * Return true if the difference from the [target] does not exceed the [amount] hourOfDay
     */
    public static boolean differHourOfDay(long millisecondValue, long target, int amount) {
        return differHourOfDay(millisecondValue, target, amount, null);
    }

    /**
     * Return true if the difference from the [target] does not exceed the [amount] hour
     */
    public static boolean differHour(long millisecondValue, long target, int amount, @Nullable Locale locale) {
        return differHour(createCalendar(millisecondValue, locale), createCalendar(target, locale), amount);
    }

    /**
     * Return true if the difference from the [target] does not exceed the [amount] hour
     */
    public static boolean differHour(long millisecondValue, long target, int amount) {
        return differHour(millisecondValue, target, amount, null);
    }

    /**
     * Return true if the difference from the [target] does not exceed the [amount] minute
     */
    public static boolean differMinute(long millisecondValue, long target, int amount, @Nullable Locale locale) {
        return differMinute(createCalendar(millisecondValue, locale), createCalendar(target, locale), amount);
    }

    /**
     * Return true if the difference from the [target] does not exceed the [amount] minute
     */
    public static boolean differMinute(long millisecondValue, long target, int amount) {
        return differMinute(millisecondValue, target, amount, null);
    }

    /**
     * Return true if the difference from the [target] does not exceed the [amount] second
     */
    public static boolean differSecond(long millisecondValue, long target, int amount, @Nullable Locale locale) {
        return differSecond(createCalendar(millisecondValue, locale), createCalendar(target, locale), amount);
    }

    /**
     * Return true if the difference from the [target] does not exceed the [amount] second
     */
    public static boolean differSecond(long millisecondValue, long target, int amount) {
        return differSecond(millisecondValue, target, amount, null);
    }

    /**
     * Return true if the difference from the [target] does not exceed the [amount] millisecond
     */
    public static boolean differMillisecond(long millisecondValue, long target, int amount, @Nullable Locale locale) {
        return differMillisecond(createCalendar(millisecondValue, locale), createCalendar(target, locale), amount);
    }

    /**
     * Return true if the difference from the [target] does not exceed the [amount] millisecond
     */
    public static boolean differMillisecond(long millisecondValue, long target, int amount) {
        return differMillisecond(millisecondValue, target, amount, null);
    }
}
