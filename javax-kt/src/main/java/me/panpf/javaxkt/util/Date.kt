package me.panpf.javaxkt.util

import java.text.SimpleDateFormat
import java.util.*
import java.util.Calendar
import kotlin.math.absoluteValue


/*
 * Date related extension
 */

/**
 * Create a Calendar
 */
fun Long.createCalendar(firstDayOfWeek: Int? = null, minimalDaysInFirstWeek: Int? = null, timeZone: TimeZone? = null, locale: Locale? = null): Calendar {
    return when {
        timeZone != null && locale != null -> Calendar.getInstance(timeZone, locale)
        timeZone == null && locale != null -> Calendar.getInstance(locale)
        timeZone != null && locale == null -> Calendar.getInstance(timeZone)
        else -> Calendar.getInstance()
    }.apply {
        if (firstDayOfWeek != null) this@apply.firstDayOfWeek = firstDayOfWeek
        if (minimalDaysInFirstWeek != null) this@apply.minimalDaysInFirstWeek = minimalDaysInFirstWeek

        timeInMillis = this@createCalendar
    }
}

/**
 * Create a Calendar
 */
fun Date.createCalendar(firstDayOfWeek: Int? = null, minimalDaysInFirstWeek: Int? = null, timeZone: TimeZone? = null, locale: Locale? = null): Calendar {
    return time.createCalendar(firstDayOfWeek, minimalDaysInFirstWeek, timeZone, locale)
}


/*
 * toDate
 */

/**
 * Millisecond to Date
 */
fun Long.toDate(): Date = Date(this)

/**
 * Convert formatted date string to Date
 */
fun String.toDate(format: SimpleDateFormat): Date {
    return format.parse(this)
}

/**
 * Convert formatted date string to Date
 */
fun String.toDate(pattern: String, locale: Locale? = null): Date {
    return this.toDate(if (locale != null) SimpleDateFormat(pattern, locale) else SimpleDateFormat(pattern))
}

/**
 * Convert formatted date string to Date
 */
fun String.toDateY(locale: Locale? = null): Date {
    return this.toDate("yyyy", locale)
}

/**
 * Convert formatted date string to Date
 */
fun String.toDateYM(locale: Locale? = null): Date {
    return this.toDate("yyyy-MM", locale)
}

/**
 * Convert formatted date string to Date
 */
fun String.toDateYMCompact(locale: Locale? = null): Date {
    return this.toDate("yyyyMM", locale)
}

/**
 * Convert formatted date string to Date
 */
fun String.toDateYMD(locale: Locale? = null): Date {
    return this.toDate("yyyy-MM-dd", locale)
}

/**
 * Convert formatted date string to Date
 */
fun String.toDateYMDCompact(locale: Locale? = null): Date {
    return this.toDate("yyyyMMdd", locale)
}

/**
 * Convert formatted date string to Date
 */
fun String.toDateYMDH(locale: Locale? = null): Date {
    return this.toDate("yyyy-MM-dd HH", locale)
}

/**
 * Convert formatted date string to Date
 */
fun String.toDateYMDHM(locale: Locale? = null): Date {
    return this.toDate("yyyy-MM-dd HH:mm", locale)
}

/**
 * Convert formatted date string to Date
 */
fun String.toDateYMDHMS(locale: Locale? = null): Date {
    return this.toDate("yyyy-MM-dd HH:mm:ss", locale)
}

/**
 * Convert formatted date string to Date
 */
fun String.toDateYMDHMSM(locale: Locale? = null): Date {
    return this.toDate("yyyy-MM-dd HH:mm:ss SSS", locale)
}


/*
 * toMillisecond
 */


/**
 * Convert formatted date string to millisecond
 */
fun String.toMillisecond(format: SimpleDateFormat): Long {
    return format.parse(this).time
}

/**
 * Convert formatted date string to millisecond
 */
fun String.toMillisecond(pattern: String, locale: Locale? = null): Long {
    return this.toMillisecond(if (locale != null) SimpleDateFormat(pattern, locale) else SimpleDateFormat(pattern))
}

/**
 * Convert formatted date string to millisecond using pattern 'yyyy'
 */
fun String.toMillisecondY(locale: Locale? = null): Long {
    return this.toMillisecond("yyyy", locale)
}

/**
 * Convert formatted date string to millisecond using pattern 'yyyy-MM'
 */
fun String.toMillisecondYM(locale: Locale? = null): Long {
    return this.toMillisecond("yyyy-MM", locale)
}

/**
 * Convert formatted date string to millisecond using pattern 'yyyyMM'
 */
fun String.toMillisecondYMCompact(locale: Locale? = null): Long {
    return this.toMillisecond("yyyyMM", locale)
}

/**
 * Convert formatted date string to millisecond using pattern 'yyyy-MM-dd'
 */
fun String.toMillisecondYMD(locale: Locale? = null): Long {
    return this.toMillisecond("yyyy-MM-dd", locale)
}

/**
 * Convert formatted date string to millisecond using pattern 'yyyyMMdd'
 */
fun String.toMillisecondYMDCompact(locale: Locale? = null): Long {
    return this.toMillisecond("yyyyMMdd", locale)
}

/**
 * Convert formatted date string to millisecond using pattern 'yyyy-MM-dd HH'
 */
fun String.toMillisecondYMDH(locale: Locale? = null): Long {
    return this.toMillisecond("yyyy-MM-dd HH", locale)
}

/**
 * Convert formatted date string to millisecond using pattern 'yyyy-MM-dd HH:mm'
 */
fun String.toMillisecondYMDHM(locale: Locale? = null): Long {
    return this.toMillisecond("yyyy-MM-dd HH:mm", locale)
}

/**
 * Convert formatted date string to millisecond using pattern 'yyyy-MM-dd HH:mm:ss'
 */
fun String.toMillisecondYMDHMS(locale: Locale? = null): Long {
    return this.toMillisecond("yyyy-MM-dd HH:mm:ss", locale)
}

/**
 * Convert formatted date string to millisecond using pattern 'yyyy-MM-dd HH:mm:ss SSS'
 */
fun String.toMillisecondYMDHMSM(locale: Locale? = null): Long {
    return this.toMillisecond("yyyy-MM-dd HH:mm:ss SSS", locale)
}


/*
 * format
 */


/**
 * Convert Date to a formatted string
 */
fun Date.format(format: SimpleDateFormat): String {
    return format.format(this)
}

/**
 * Convert Date to a formatted string
 */
fun Date.format(pattern: String, locale: Locale? = null): String {
    return this.format(if (locale != null) SimpleDateFormat(pattern, locale) else SimpleDateFormat(pattern))
}

/**
 * Convert Date to a formatted string using pattern 'yyyy'
 */
fun Date.formatY(locale: Locale? = null): String {
    return format("yyyy", locale)
}

/**
 * Convert Date to a formatted string using pattern 'yyyy-MM'
 */
fun Date.formatYM(locale: Locale? = null): String {
    return format("yyyy-MM", locale)
}

/**
 * Convert Date to a formatted string using pattern 'yyyyMM'
 */
fun Date.formatYMCompact(locale: Locale? = null): String {
    return format("yyyyMM", locale)
}

/**
 * Convert Date to a formatted string using pattern 'yyyy-MM-dd'
 */
fun Date.formatYMD(locale: Locale? = null): String {
    return format("yyyy-MM-dd", locale)
}

/**
 * Convert Date to a formatted string using pattern 'yyyyMMdd'
 */
fun Date.formatYMDCompact(locale: Locale? = null): String {
    return format("yyyyMMdd", locale)
}

/**
 * Convert Date to a formatted string using pattern 'yyyy-MM-dd HH'
 */
fun Date.formatYMDH(locale: Locale? = null): String {
    return format("yyyy-MM-dd HH", locale)
}

/**
 * Convert Date to a formatted string using pattern 'yyyy-MM-dd HH:mm'
 */
fun Date.formatYMDHM(locale: Locale? = null): String {
    return format("yyyy-MM-dd HH:mm", locale)
}

/**
 * Convert Date to a formatted string using pattern 'yyyy-MM-dd HH:mm:ss'
 */
fun Date.formatYMDHMS(locale: Locale? = null): String {
    return format("yyyy-MM-dd HH:mm:ss", locale)
}

/**
 * Convert Date to a formatted string using pattern 'yyyy-MM-dd HH:mm:ss SSS'
 */
fun Date.formatYMDHMSM(locale: Locale? = null): String {
    return format("yyyy-MM-dd HH:mm:ss SSS", locale)
}


/**
 * Convert millisecond to a formatted string
 */
fun Long.format(format: SimpleDateFormat): String {
    return Date(this).format(format)
}

/**
 * Convert millisecond to a formatted string
 */
fun Long.format(pattern: String, locale: Locale? = null): String {
    return format(if (locale != null) SimpleDateFormat(pattern, locale) else SimpleDateFormat(pattern))
}

/**
 * Convert millisecond to a formatted string using pattern 'yyyy'
 */
fun Long.formatY(locale: Locale? = null): String {
    return format("yyyy", locale)
}

/**
 * Convert millisecond to a formatted string using pattern 'yyyy-MM'
 */
fun Long.formatYM(locale: Locale? = null): String {
    return format("yyyy-MM", locale)
}

/**
 * Convert millisecond to a formatted string using pattern 'yyyyMM'
 */
fun Long.formatYMCompact(locale: Locale? = null): String {
    return format("yyyyMM", locale)
}

/**
 * Convert millisecond to a formatted string using pattern 'yyyy-MM-dd'
 */
fun Long.formatYMD(locale: Locale? = null): String {
    return format("yyyy-MM-dd", locale)
}

/**
 * Convert millisecond to a formatted string using pattern 'yyyyMMdd'
 */
fun Long.formatYMDCompact(locale: Locale? = null): String {
    return format("yyyyMMdd", locale)
}

/**
 * Convert millisecond to a formatted string using pattern 'yyyy-MM-dd HH'
 */
fun Long.formatYMDH(locale: Locale? = null): String {
    return format("yyyy-MM-dd HH", locale)
}

/**
 * Convert millisecond to a formatted string using pattern 'yyyy-MM-dd HH:mm'
 */
fun Long.formatYMDHM(locale: Locale? = null): String {
    return format("yyyy-MM-dd HH:mm", locale)
}

/**
 * Convert millisecond to a formatted string using pattern 'yyyy-MM-dd HH:mm:ss'
 */
fun Long.formatYMDHMS(locale: Locale? = null): String {
    return format("yyyy-MM-dd HH:mm:ss", locale)
}

/**
 * Convert millisecond to a formatted string using pattern 'yyyy-MM-dd HH:mm:ss SSS'
 */
fun Long.formatYMDHMSM(locale: Locale? = null): String {
    return format("yyyy-MM-dd HH:mm:ss SSS", locale)
}


/*
 * get
 */


/**
 * Get year from calendar
 */
fun Calendar.getYear(): Int = this.get(Calendar.YEAR)

/**
 * Get month from calendar
 */
fun Calendar.getMonth(): Int = this.get(Calendar.MONTH)

/**
 * Get weekOfYear from calendar
 */
fun Calendar.getWeekOfYear(): Int = this.get(Calendar.WEEK_OF_YEAR)

/**
 * Get weekOfMonth from calendar
 */
fun Calendar.getWeekOfMonth(): Int = this.get(Calendar.WEEK_OF_MONTH)

/**
 * Get dayOfYear from calendar
 */
fun Calendar.getDayOfYear(): Int = this.get(Calendar.DAY_OF_YEAR)

/**
 * Get dayOfMonth from calendar
 */
fun Calendar.getDayOfMonth(): Int = this.get(Calendar.DAY_OF_MONTH)

/**
 * Get dayOfWeek from calendar
 */
fun Calendar.getDayOfWeek(): Int = this.get(Calendar.DAY_OF_WEEK)

/**
 * Get dayOfWeekInMonth from calendar
 */
fun Calendar.getDayOfWeekInMonth(): Int = this.get(Calendar.DAY_OF_WEEK_IN_MONTH)

/**
 * Get hourOfDay from calendar
 */
fun Calendar.getHourOfDay(): Int = this.get(Calendar.HOUR_OF_DAY)

/**
 * Get hour from calendar
 */
fun Calendar.getHour(): Int = this.get(Calendar.HOUR)

/**
 * Get minute from calendar
 */
fun Calendar.getMinute(): Int = this.get(Calendar.MINUTE)

/**
 * Get second from calendar
 */
fun Calendar.getSecond(): Int = this.get(Calendar.SECOND)

/**
 * Get millisecond from calendar
 */
fun Calendar.getMillisecond(): Int = this.get(Calendar.MILLISECOND)


/**
 * Get calendar field from millisecond
 */
fun Date.getCalendarField(field: Int, firstDayOfWeek: Int? = null, minimalDaysInFirstWeek: Int? = null, timeZone: TimeZone? = null, locale: Locale? = null): Int {
    return createCalendar(firstDayOfWeek, minimalDaysInFirstWeek, timeZone, locale).get(field)
}

/**
 * Get year from date
 */
fun Date.getCalendarYear(timeZone: TimeZone? = null, locale: Locale? = null): Int {
    return createCalendar(null, null, timeZone, locale).getYear()
}

/**
 * Get month from date
 */
fun Date.getCalendarMonth(timeZone: TimeZone? = null, locale: Locale? = null): Int {
    return createCalendar(null, null, timeZone, locale).getMonth()
}

/**
 * Get weekOfYear from date
 */
fun Date.getCalendarWeekOfYear(firstDayOfWeek: Int? = null, minimalDaysInFirstWeek: Int? = null, timeZone: TimeZone? = null, locale: Locale? = null): Int {
    return createCalendar(firstDayOfWeek, minimalDaysInFirstWeek, timeZone, locale).getWeekOfYear()
}

/**
 * Get weekOfMonth from date
 */
fun Date.getCalendarWeekOfMonth(firstDayOfWeek: Int? = null, minimalDaysInFirstWeek: Int? = null, timeZone: TimeZone? = null, locale: Locale? = null): Int {
    return createCalendar(firstDayOfWeek, minimalDaysInFirstWeek, timeZone, locale).getWeekOfMonth()
}

/**
 * Get dayOfYear from date
 */
fun Date.getCalendarDayOfYear(timeZone: TimeZone? = null, locale: Locale? = null): Int {
    return createCalendar(null, null, timeZone, locale).getDayOfYear()
}

/**
 * Get dayOfMonth from date
 */
fun Date.getCalendarDayOfMonth(timeZone: TimeZone? = null, locale: Locale? = null): Int {
    return createCalendar(null, null, timeZone, locale).getDayOfMonth()
}

/**
 * Get dayOfWeek from date
 */
fun Date.getCalendarDayOfWeek(firstDayOfWeek: Int? = null, minimalDaysInFirstWeek: Int? = null, timeZone: TimeZone? = null, locale: Locale? = null): Int {
    return createCalendar(firstDayOfWeek, minimalDaysInFirstWeek, timeZone, locale).getDayOfWeek()
}

/**
 * Get dayOfWeekInMonth from date
 */
fun Date.getCalendarDayOfWeekInMonth(firstDayOfWeek: Int? = null, minimalDaysInFirstWeek: Int? = null, timeZone: TimeZone? = null, locale: Locale? = null): Int {
    return createCalendar(firstDayOfWeek, minimalDaysInFirstWeek, timeZone, locale).getDayOfWeekInMonth()
}

/**
 * Get hourOfDay from date
 */
fun Date.getCalendarHourOfDay(timeZone: TimeZone? = null, locale: Locale? = null): Int {
    return createCalendar(null, null, timeZone, locale).getHourOfDay()
}

/**
 * Get hour from date
 */
fun Date.getCalendarHour(timeZone: TimeZone? = null, locale: Locale? = null): Int {
    return createCalendar(null, null, timeZone, locale).getHour()
}

/**
 * Get minute from date
 */
fun Date.getCalendarMinute(timeZone: TimeZone? = null, locale: Locale? = null): Int {
    return createCalendar(null, null, timeZone, locale).getMinute()
}

/**
 * Get second from date
 */
fun Date.getCalendarSecond(timeZone: TimeZone? = null, locale: Locale? = null): Int {
    return createCalendar(null, null, timeZone, locale).getSecond()
}

/**
 * Get millisecond from date
 */
fun Date.getCalendarMillisecond(timeZone: TimeZone? = null, locale: Locale? = null): Int {
    return createCalendar(null, null, timeZone, locale).getMillisecond()
}


/**
 * Get calendar field from millisecond
 */
fun Long.getCalendarField(field: Int, firstDayOfWeek: Int? = null, minimalDaysInFirstWeek: Int? = null, timeZone: TimeZone? = null, locale: Locale? = null): Int {
    return createCalendar(firstDayOfWeek, minimalDaysInFirstWeek, timeZone, locale).get(field)
}

/**
 * Get year from millisecond
 */
fun Long.getYear(timeZone: TimeZone? = null, locale: Locale? = null): Int {
    return createCalendar(null, null, timeZone, locale).getYear()
}

/**
 * Get month from millisecond
 */
fun Long.getMonth(timeZone: TimeZone? = null, locale: Locale? = null): Int {
    return createCalendar(null, null, timeZone, locale).getMonth()
}

/**
 * Get weekOfYear from millisecond
 */
fun Long.getWeekOfYear(firstDayOfWeek: Int? = null, minimalDaysInFirstWeek: Int? = null, timeZone: TimeZone? = null, locale: Locale? = null): Int {
    return createCalendar(firstDayOfWeek, minimalDaysInFirstWeek, timeZone, locale).getWeekOfYear()
}

/**
 * Get weekOfMonth from millisecond
 */
fun Long.getWeekOfMonth(firstDayOfWeek: Int? = null, minimalDaysInFirstWeek: Int? = null, timeZone: TimeZone? = null, locale: Locale? = null): Int {
    return createCalendar(firstDayOfWeek, minimalDaysInFirstWeek, timeZone, locale).getWeekOfMonth()
}

/**
 * Get dayOfYear from millisecond
 */
fun Long.getDayOfYear(timeZone: TimeZone? = null, locale: Locale? = null): Int {
    return createCalendar(null, null, timeZone, locale).getDayOfYear()
}

/**
 * Get dayOfMonth from millisecond
 */
fun Long.getDayOfMonth(timeZone: TimeZone? = null, locale: Locale? = null): Int {
    return createCalendar(null, null, timeZone, locale).getDayOfMonth()
}

/**
 * Get dayOfWeek from millisecond
 */
fun Long.getDayOfWeek(firstDayOfWeek: Int? = null, minimalDaysInFirstWeek: Int? = null, timeZone: TimeZone? = null, locale: Locale? = null): Int {
    return createCalendar(firstDayOfWeek, minimalDaysInFirstWeek, timeZone, locale).getDayOfWeek()
}

/**
 * Get dayOfWeekInMonth from millisecond
 */
fun Long.getDayOfWeekInMonth(firstDayOfWeek: Int? = null, minimalDaysInFirstWeek: Int? = null, timeZone: TimeZone? = null, locale: Locale? = null): Int {
    return createCalendar(firstDayOfWeek, minimalDaysInFirstWeek, timeZone, locale).getDayOfWeekInMonth()
}

/**
 * Get hourOfDay from millisecond
 */
fun Long.getHourOfDay(timeZone: TimeZone? = null, locale: Locale? = null): Int {
    return createCalendar(null, null, timeZone, locale).getHourOfDay()
}

/**
 * Get hour from millisecond
 */
fun Long.getHour(timeZone: TimeZone? = null, locale: Locale? = null): Int {
    return createCalendar(null, null, timeZone, locale).getHour()
}

/**
 * Get minute from millisecond
 */
fun Long.getMinute(timeZone: TimeZone? = null, locale: Locale? = null): Int {
    return createCalendar(null, null, timeZone, locale).getMinute()
}

/**
 * Get second from millisecond
 */
fun Long.getSecond(timeZone: TimeZone? = null, locale: Locale? = null): Int {
    return createCalendar(null, null, timeZone, locale).getSecond()
}

/**
 * Get millisecond from millisecond
 */
fun Long.getMillisecond(timeZone: TimeZone? = null, locale: Locale? = null): Int {
    return createCalendar(null, null, timeZone, locale).getMillisecond()
}


/*
 * Date add
 */


/**
 * Increase the specified calendar field and return to Date
 */
fun Calendar.addToDate(field: Int, amount: Int): Date {
    this.add(field, amount)
    return Date(this.timeInMillis)
}

/**
 * Increase the specified calendar field
 */
fun Date.addCalendarField(field: Int, amount: Int, firstDayOfWeek: Int? = null, minimalDaysInFirstWeek: Int? = null, timeZone: TimeZone? = null, locale: Locale? = null): Date {
    return createCalendar(firstDayOfWeek, minimalDaysInFirstWeek, timeZone, locale).addToDate(field, amount)
}

/**
 * Increase the YEAR field
 */
fun Date.addYear(amount: Int, timeZone: TimeZone? = null, locale: Locale? = null): Date {
    return addCalendarField(Calendar.YEAR, amount, null, null, timeZone, locale)
}

/**
 * Increase the MONTH field
 */
fun Date.addMonth(amount: Int, timeZone: TimeZone? = null, locale: Locale? = null): Date {
    return addCalendarField(Calendar.MONTH, amount, null, null, timeZone, locale)
}

/**
 * Increase the WEEK_OF_YEAR field
 */
fun Date.addWeekOfYear(amount: Int, firstDayOfWeek: Int? = null, minimalDaysInFirstWeek: Int? = null, timeZone: TimeZone? = null, locale: Locale? = null): Date {
    return addCalendarField(Calendar.WEEK_OF_YEAR, amount, firstDayOfWeek, minimalDaysInFirstWeek, timeZone, locale)
}

/**
 * Increase the WEEK_OF_MONTH field
 */
fun Date.addWeekOfMonth(amount: Int, firstDayOfWeek: Int? = null, minimalDaysInFirstWeek: Int? = null, timeZone: TimeZone? = null, locale: Locale? = null): Date {
    return addCalendarField(Calendar.WEEK_OF_MONTH, amount, firstDayOfWeek, minimalDaysInFirstWeek, timeZone, locale)
}

/**
 * Increase the DAY_OF_YEAR field
 */
fun Date.addDayOfYear(amount: Int, timeZone: TimeZone? = null, locale: Locale? = null): Date {
    return addCalendarField(Calendar.DAY_OF_YEAR, amount, null, null, timeZone, locale)
}

/**
 * Increase the DAY_OF_MONTH field
 */
fun Date.addDayOfMonth(amount: Int, timeZone: TimeZone? = null, locale: Locale? = null): Date {
    return addCalendarField(Calendar.DAY_OF_MONTH, amount, null, null, timeZone, locale)
}

/**
 * Increase the DAY_OF_WEEK_IN_MONTH field
 */
fun Date.addDayOfWeekInMonth(amount: Int, firstDayOfWeek: Int? = null, minimalDaysInFirstWeek: Int? = null, timeZone: TimeZone? = null, locale: Locale? = null): Date {
    return addCalendarField(Calendar.DAY_OF_WEEK_IN_MONTH, amount, firstDayOfWeek, minimalDaysInFirstWeek, timeZone, locale)
}

/**
 * Increase the DAY_OF_WEEK field
 */
fun Date.addDayOfWeek(amount: Int, firstDayOfWeek: Int? = null, minimalDaysInFirstWeek: Int? = null, timeZone: TimeZone? = null, locale: Locale? = null): Date {
    return addCalendarField(Calendar.DAY_OF_WEEK, amount, firstDayOfWeek, minimalDaysInFirstWeek, timeZone, locale)
}

/**
 * Increase the HOUR_OF_DAY field
 */
fun Date.addHourOfDay(amount: Int, timeZone: TimeZone? = null, locale: Locale? = null): Date {
    return addCalendarField(Calendar.HOUR_OF_DAY, amount, null, null, timeZone, locale)
}

/**
 * Increase the HOUR field
 */
fun Date.addHour(amount: Int, timeZone: TimeZone? = null, locale: Locale? = null): Date {
    return addCalendarField(Calendar.HOUR, amount, null, null, timeZone, locale)
}

/**
 * Increase the MINUTE field
 */
fun Date.addMinute(amount: Int, timeZone: TimeZone? = null, locale: Locale? = null): Date {
    return addCalendarField(Calendar.MINUTE, amount, null, null, timeZone, locale)
}

/**
 * Increase the SECOND field
 */
fun Date.addSecond(amount: Int, timeZone: TimeZone? = null, locale: Locale? = null): Date {
    return addCalendarField(Calendar.SECOND, amount, null, null, timeZone, locale)
}

/**
 * Increase the MILLISECOND field
 */
fun Date.addMillisecond(amount: Int, timeZone: TimeZone? = null, locale: Locale? = null): Date {
    return addCalendarField(Calendar.MILLISECOND, amount, null, null, timeZone, locale)
}


/*
 * Long add
 */


/**
 * Increase the specified calendar field and return to millisecond
 */
fun Calendar.addToMillisecond(field: Int, amount: Int): Long {
    this.add(field, amount)
    return this.timeInMillis
}

/**
 * Increase the specified calendar field
 */
fun Long.addCalendarField(field: Int, amount: Int, firstDayOfWeek: Int? = null, minimalDaysInFirstWeek: Int? = null, timeZone: TimeZone? = null, locale: Locale? = null): Long {
    return createCalendar(firstDayOfWeek, minimalDaysInFirstWeek, timeZone, locale).addToMillisecond(field, amount)
}

/**
 * Increase the YEAR field
 */
fun Long.addYear(amount: Int, timeZone: TimeZone? = null, locale: Locale? = null): Long {
    return addCalendarField(Calendar.YEAR, amount, null, null, timeZone, locale)
}

/**
 * Increase the MONTH field
 */
fun Long.addMonth(amount: Int, timeZone: TimeZone? = null, locale: Locale? = null): Long {
    return addCalendarField(Calendar.MONTH, amount, null, null, timeZone, locale)
}

/**
 * Increase the WEEK_OF_YEAR field
 */
fun Long.addWeekOfYear(amount: Int, firstDayOfWeek: Int? = null, minimalDaysInFirstWeek: Int? = null, timeZone: TimeZone? = null, locale: Locale? = null): Long {
    return addCalendarField(Calendar.WEEK_OF_YEAR, amount, firstDayOfWeek, minimalDaysInFirstWeek, timeZone, locale)
}

/**
 * Increase the WEEK_OF_MONTH field
 */
fun Long.addWeekOfMonth(amount: Int, firstDayOfWeek: Int? = null, minimalDaysInFirstWeek: Int? = null, timeZone: TimeZone? = null, locale: Locale? = null): Long {
    return addCalendarField(Calendar.WEEK_OF_MONTH, amount, firstDayOfWeek, minimalDaysInFirstWeek, timeZone, locale)
}

/**
 * Increase the DAY_OF_YEAR field
 */
fun Long.addDayOfYear(amount: Int, timeZone: TimeZone? = null, locale: Locale? = null): Long {
    return addCalendarField(Calendar.DAY_OF_YEAR, amount, null, null, timeZone, locale)
}

/**
 * Increase the DAY_OF_MONTH field
 */
fun Long.addDayOfMonth(amount: Int, timeZone: TimeZone? = null, locale: Locale? = null): Long {
    return addCalendarField(Calendar.DAY_OF_MONTH, amount, null, null, timeZone, locale)
}

/**
 * Increase the DAY_OF_WEEK_IN_MONTH field
 */
fun Long.addDayOfWeekInMonth(amount: Int, firstDayOfWeek: Int? = null, minimalDaysInFirstWeek: Int? = null, timeZone: TimeZone? = null, locale: Locale? = null): Long {
    return addCalendarField(Calendar.DAY_OF_WEEK_IN_MONTH, amount, firstDayOfWeek, minimalDaysInFirstWeek, timeZone, locale)
}

/**
 * Increase the DAY_OF_WEEK field
 */
fun Long.addDayOfWeek(amount: Int, firstDayOfWeek: Int? = null, minimalDaysInFirstWeek: Int? = null, timeZone: TimeZone? = null, locale: Locale? = null): Long {
    return addCalendarField(Calendar.DAY_OF_WEEK, amount, firstDayOfWeek, minimalDaysInFirstWeek, timeZone, locale)
}

/**
 * Increase the HOUR_OF_DAY field
 */
fun Long.addHourOfDay(amount: Int, timeZone: TimeZone? = null, locale: Locale? = null): Long {
    return addCalendarField(Calendar.HOUR_OF_DAY, amount, null, null, timeZone, locale)
}

/**
 * Increase the HOUR field
 */
fun Long.addHour(amount: Int, timeZone: TimeZone? = null, locale: Locale? = null): Long {
    return addCalendarField(Calendar.HOUR, amount, null, null, timeZone, locale)
}

/**
 * Increase the MINUTE field
 */
fun Long.addMinute(amount: Int, timeZone: TimeZone? = null, locale: Locale? = null): Long {
    return addCalendarField(Calendar.MINUTE, amount, null, null, timeZone, locale)
}

/**
 * Increase the SECOND field
 */
fun Long.addSecond(amount: Int, timeZone: TimeZone? = null, locale: Locale? = null): Long {
    return addCalendarField(Calendar.SECOND, amount, null, null, timeZone, locale)
}

/**
 * Increase the MILLISECOND field
 */
fun Long.addMillisecond(amount: Int, timeZone: TimeZone? = null, locale: Locale? = null): Long {
    return addCalendarField(Calendar.MILLISECOND, amount, null, null, timeZone, locale)
}


/*
 * isSame
 */


/**
 * Return true if the year is the same
 */
fun Calendar.isSameYear(target: Calendar): Boolean {
    return this.get(Calendar.ERA) == target.get(Calendar.ERA) && this.get(Calendar.YEAR) == target.get(Calendar.YEAR)
}

/**
 * Returns true if the year and month are the same
 */
fun Calendar.isSameMonth(target: Calendar): Boolean {
    return this.get(Calendar.ERA) == target.get(Calendar.ERA) && this.get(Calendar.YEAR) == target.get(Calendar.YEAR)
            && this.get(Calendar.MONTH) == target.get(Calendar.MONTH)
}

/**
 * Return true if the months is the same
 */
fun Calendar.isSameMonthOfYear(target: Calendar): Boolean {
    return this.get(Calendar.ERA) == target.get(Calendar.ERA) && this.get(Calendar.MONTH) == target.get(Calendar.MONTH)
}

/**
 * Returns true if the year, month, and week are the same
 */
fun Calendar.isSameWeek(target: Calendar): Boolean {
    if (this.get(Calendar.ERA) != target.get(Calendar.ERA)) return false
    return when {
    // 年份一样可以直接用 WEEK_OF_YEAR 对比
        this.get(Calendar.YEAR) == target.get(Calendar.YEAR) -> this.get(Calendar.WEEK_OF_YEAR) == target.get(Calendar.WEEK_OF_YEAR)
    // day 只相差 7 天说明是年末那几天，也可以直接用 WEEK_OF_YEAR 对比
        this.differDayOfYear(target, 7) -> this.get(Calendar.WEEK_OF_YEAR) == target.get(Calendar.WEEK_OF_YEAR)
    // day 相差超 7 天以上绝不可能是同一周
        else -> false
    }
}

/**
 * Return true if the weekOfYear is the same
 */
fun Calendar.isSameWeekOfYear(target: Calendar): Boolean {
    return this.get(Calendar.ERA) == target.get(Calendar.ERA) && this.get(Calendar.WEEK_OF_YEAR) == target.get(Calendar.WEEK_OF_YEAR)
}

/**
 * Return true if the weekOfMonth is the same
 */
fun Calendar.isSameWeekOfMonth(target: Calendar): Boolean {
    return this.get(Calendar.ERA) == target.get(Calendar.ERA) && this.get(Calendar.WEEK_OF_MONTH) == target.get(Calendar.WEEK_OF_MONTH)
}

/**
 * Returns true if the year, month, week and day are the same
 */
fun Calendar.isSameDay(target: Calendar): Boolean {
    return this.get(Calendar.ERA) == target.get(Calendar.ERA) && this.get(Calendar.YEAR) == target.get(Calendar.YEAR)
            && this.get(Calendar.MONTH) == target.get(Calendar.MONTH) && this.get(Calendar.DAY_OF_MONTH) == target.get(Calendar.DAY_OF_MONTH)
}

/**
 * Return true if the dayOfYear is the same
 */
fun Calendar.isSameDayOfYear(target: Calendar): Boolean {
    return this.get(Calendar.ERA) == target.get(Calendar.ERA) && this.get(Calendar.DAY_OF_YEAR) == target.get(Calendar.DAY_OF_YEAR)
}

/**
 * Return true if the dayOfMonth is the same
 */
fun Calendar.isSameDayOfMonth(target: Calendar): Boolean {
    return this.get(Calendar.ERA) == target.get(Calendar.ERA) && this.get(Calendar.DAY_OF_MONTH) == target.get(Calendar.DAY_OF_MONTH)
}

/**
 * Return true if the dayOfWeek is the same
 */
fun Calendar.isSameDayOfWeek(target: Calendar): Boolean {
    return this.get(Calendar.ERA) == target.get(Calendar.ERA) && this.get(Calendar.DAY_OF_WEEK) == target.get(Calendar.DAY_OF_WEEK)
}

/**
 * Return true if the dayOfWeekInMonth is the same
 */
fun Calendar.isSameDayOfWeekInMonth(target: Calendar): Boolean {
    return this.get(Calendar.ERA) == target.get(Calendar.ERA) && this.get(Calendar.DAY_OF_WEEK_IN_MONTH) == target.get(Calendar.DAY_OF_WEEK_IN_MONTH)
}

/**
 * Returns true if the year, month, week, day and hour are the same
 */
fun Calendar.isSameHour(target: Calendar): Boolean {
    return this.get(Calendar.ERA) == target.get(Calendar.ERA) && this.get(Calendar.YEAR) == target.get(Calendar.YEAR)
            && this.get(Calendar.MONTH) == target.get(Calendar.MONTH) && this.get(Calendar.DAY_OF_MONTH) == target.get(Calendar.DAY_OF_MONTH)
            && this.get(Calendar.HOUR_OF_DAY) == target.get(Calendar.HOUR_OF_DAY)
}

/**
 * Return true if the 24H hour is the same
 */
fun Calendar.isSameHourOf24H(target: Calendar): Boolean {
    return this.get(Calendar.ERA) == target.get(Calendar.ERA) && this.get(Calendar.HOUR_OF_DAY) == target.get(Calendar.HOUR_OF_DAY)
}

/**
 * Return true if the 12H hour is the same
 */
fun Calendar.isSameHourOf12H(target: Calendar): Boolean {
    return this.get(Calendar.ERA) == target.get(Calendar.ERA) && this.get(Calendar.HOUR) == target.get(Calendar.HOUR)
}

/**
 * Returns true if the year, month, week, day, hour and minute are the same
 */
fun Calendar.isSameMinute(target: Calendar): Boolean {
    return this.get(Calendar.ERA) == target.get(Calendar.ERA) && this.get(Calendar.YEAR) == target.get(Calendar.YEAR)
            && this.get(Calendar.MONTH) == target.get(Calendar.MONTH) && this.get(Calendar.DAY_OF_MONTH) == target.get(Calendar.DAY_OF_MONTH)
            && this.get(Calendar.HOUR_OF_DAY) == target.get(Calendar.HOUR_OF_DAY) && this.get(Calendar.MINUTE) == target.get(Calendar.MINUTE)
}

/**
 * Return true if the minuteOfHour is the same
 */
fun Calendar.isSameMinuteOfHour(target: Calendar): Boolean {
    return this.get(Calendar.ERA) == target.get(Calendar.ERA) && this.get(Calendar.MINUTE) == target.get(Calendar.MINUTE)
}

/**
 * Returns true if the year, month, week, day, hour, minute and second are the same
 */
fun Calendar.isSameSecond(target: Calendar): Boolean {
    return this.get(Calendar.ERA) == target.get(Calendar.ERA) && this.get(Calendar.YEAR) == target.get(Calendar.YEAR)
            && this.get(Calendar.MONTH) == target.get(Calendar.MONTH) && this.get(Calendar.DAY_OF_MONTH) == target.get(Calendar.DAY_OF_MONTH)
            && this.get(Calendar.HOUR_OF_DAY) == target.get(Calendar.HOUR_OF_DAY) && this.get(Calendar.MINUTE) == target.get(Calendar.MINUTE)
            && this.get(Calendar.SECOND) == target.get(Calendar.SECOND)
}

/**
 * Return true if the secondOfMinute is the same
 */
fun Calendar.isSameSecondOfMinute(target: Calendar): Boolean {
    return this.get(Calendar.ERA) == target.get(Calendar.ERA) && this.get(Calendar.SECOND) == target.get(Calendar.SECOND)
}

/**
 * Returns true if the year, month, week, day, hour, minute, second and millisecond are the same
 */
fun Calendar.isSameMillisecond(target: Calendar): Boolean {
    return this.get(Calendar.ERA) == target.get(Calendar.ERA) && this.get(Calendar.YEAR) == target.get(Calendar.YEAR)
            && this.get(Calendar.MONTH) == target.get(Calendar.MONTH) && this.get(Calendar.DAY_OF_MONTH) == target.get(Calendar.DAY_OF_MONTH)
            && this.get(Calendar.HOUR_OF_DAY) == target.get(Calendar.HOUR_OF_DAY) && this.get(Calendar.MINUTE) == target.get(Calendar.MINUTE)
            && this.get(Calendar.SECOND) == target.get(Calendar.SECOND) && this.get(Calendar.MILLISECOND) == target.get(Calendar.MILLISECOND)
}

/**
 * Return true if the millisecondOfSecond is the same
 */
fun Calendar.isSameMillisecondOfSecond(target: Calendar): Boolean {
    return this.get(Calendar.ERA) == target.get(Calendar.ERA) && this.get(Calendar.MILLISECOND) == target.get(Calendar.MILLISECOND)
}


/**
 * Return true if the two calendars are the same year
 */
fun Date.isSameYear(target: Date, timeZone: TimeZone? = null, locale: Locale? = null): Boolean {
    return this.createCalendar(null, null, timeZone, locale).isSameYear(target.createCalendar(null, null, timeZone, locale))
}

/**
 * Return true if both calendars have the same year and month are the same
 */
fun Date.isSameMonth(target: Date, timeZone: TimeZone? = null, locale: Locale? = null): Boolean {
    return this.createCalendar(null, null, timeZone, locale).isSameMonth(target.createCalendar(null, null, timeZone, locale))
}

/**
 * Return true if the months is the same
 */
fun Date.isSameMonthOfYear(target: Date, timeZone: TimeZone? = null, locale: Locale? = null): Boolean {
    return this.createCalendar(null, null, timeZone, locale).isSameMonthOfYear(target.createCalendar(null, null, timeZone, locale))
}

/**
 * Returns true if the year, month, and week are the same
 */
fun Date.isSameWeek(target: Date, firstDayOfWeek: Int? = null, minimalDaysInFirstWeek: Int? = null, timeZone: TimeZone? = null, locale: Locale? = null): Boolean {
    return this.createCalendar(firstDayOfWeek, minimalDaysInFirstWeek, timeZone, locale).isSameWeek(target.createCalendar(firstDayOfWeek, minimalDaysInFirstWeek, timeZone, locale))
}

/**
 * Return true if the weekOfYear is the same
 */
fun Date.isSameWeekOfYear(target: Date, firstDayOfWeek: Int? = null, minimalDaysInFirstWeek: Int? = null, timeZone: TimeZone? = null, locale: Locale? = null): Boolean {
    return this.createCalendar(firstDayOfWeek, minimalDaysInFirstWeek, timeZone, locale).isSameWeekOfYear(target.createCalendar(firstDayOfWeek, minimalDaysInFirstWeek, timeZone, locale))
}

/**
 * Return true if the weekOfMonth is the same
 */
fun Date.isSameWeekOfMonth(target: Date, firstDayOfWeek: Int? = null, minimalDaysInFirstWeek: Int? = null, timeZone: TimeZone? = null, locale: Locale? = null): Boolean {
    return this.createCalendar(firstDayOfWeek, minimalDaysInFirstWeek, timeZone, locale).isSameWeekOfMonth(target.createCalendar(firstDayOfWeek, minimalDaysInFirstWeek, timeZone, locale))
}

/**
 * Returns true if the year, month, week and day are the same
 */
fun Date.isSameDay(target: Date, timeZone: TimeZone? = null, locale: Locale? = null): Boolean {
    return this.createCalendar(null, null, timeZone, locale).isSameDay(target.createCalendar(null, null, timeZone, locale))
}

/**
 * Return true if the dayOfYear is the same
 */
fun Date.isSameDayOfYear(target: Date, timeZone: TimeZone? = null, locale: Locale? = null): Boolean {
    return this.createCalendar(null, null, timeZone, locale).isSameDayOfYear(target.createCalendar(null, null, timeZone, locale))
}

/**
 * Return true if the dayOfMonth is the same
 */
fun Date.isSameDayOfMonth(target: Date, timeZone: TimeZone? = null, locale: Locale? = null): Boolean {
    return this.createCalendar(null, null, timeZone, locale).isSameDayOfMonth(target.createCalendar(null, null, timeZone, locale))
}

/**
 * Return true if the dayOfWeek is the same
 */
fun Date.isSameDayOfWeek(target: Date, firstDayOfWeek: Int? = null, minimalDaysInFirstWeek: Int? = null, timeZone: TimeZone? = null, locale: Locale? = null): Boolean {
    return this.createCalendar(firstDayOfWeek, minimalDaysInFirstWeek, timeZone, locale).isSameDayOfWeek(target.createCalendar(firstDayOfWeek, minimalDaysInFirstWeek, timeZone, locale))
}

/**
 * Return true if the dayOfWeekInMonth is the same
 */
fun Date.isSameDayOfWeekInMonth(target: Date, firstDayOfWeek: Int? = null, minimalDaysInFirstWeek: Int? = null, timeZone: TimeZone? = null, locale: Locale? = null): Boolean {
    return this.createCalendar(firstDayOfWeek, minimalDaysInFirstWeek, timeZone, locale).isSameDayOfWeekInMonth(target.createCalendar(firstDayOfWeek, minimalDaysInFirstWeek, timeZone, locale))
}

/**
 * Returns true if the year, month, week, day and hour are the same
 */
fun Date.isSameHour(target: Date, timeZone: TimeZone? = null, locale: Locale? = null): Boolean {
    return this.createCalendar(null, null, timeZone, locale).isSameHour(target.createCalendar(null, null, timeZone, locale))
}

/**
 * Return true if the 24H hour is the same
 */
fun Date.isSameHourOf24H(target: Date, timeZone: TimeZone? = null, locale: Locale? = null): Boolean {
    return this.createCalendar(null, null, timeZone, locale).isSameHourOf24H(target.createCalendar(null, null, timeZone, locale))
}

/**
 * Return true if the 12H hour is the same
 */
fun Date.isSameHourOf12H(target: Date, timeZone: TimeZone? = null, locale: Locale? = null): Boolean {
    return this.createCalendar(null, null, timeZone, locale).isSameHourOf12H(target.createCalendar(null, null, timeZone, locale))
}

/**
 * Returns true if the year, month, week, day, hour and minute are the same
 */
fun Date.isSameMinute(target: Date, timeZone: TimeZone? = null, locale: Locale? = null): Boolean {
    return this.createCalendar(null, null, timeZone, locale).isSameMinute(target.createCalendar(null, null, timeZone, locale))
}

/**
 * Return true if the minuteOfHour is the same
 */
fun Date.isSameMinuteOfHour(target: Date, timeZone: TimeZone? = null, locale: Locale? = null): Boolean {
    return this.createCalendar(null, null, timeZone, locale).isSameMinuteOfHour(target.createCalendar(null, null, timeZone, locale))
}

/**
 * Returns true if the year, month, week, day, hour, minute and second are the same
 */
fun Date.isSameSecond(target: Date, timeZone: TimeZone? = null, locale: Locale? = null): Boolean {
    return this.createCalendar(null, null, timeZone, locale).isSameSecond(target.createCalendar(null, null, timeZone, locale))
}

/**
 * Return true if the secondOfMinute is the same
 */
fun Date.isSameSecondOfMinute(target: Date, timeZone: TimeZone? = null, locale: Locale? = null): Boolean {
    return this.createCalendar(null, null, timeZone, locale).isSameSecondOfMinute(target.createCalendar(null, null, timeZone, locale))
}

/**
 * Returns true if the year, month, week, day, hour, minute, second and millisecond are the same
 */
fun Date.isSameMillisecond(target: Date, timeZone: TimeZone? = null, locale: Locale? = null): Boolean {
    return this.createCalendar(null, null, timeZone, locale).isSameMillisecond(target.createCalendar(null, null, timeZone, locale))
}

/**
 * Return true if the millisecondOfSecond is the same
 */
fun Date.isSameMillisecondOfSecond(target: Date, timeZone: TimeZone? = null, locale: Locale? = null): Boolean {
    return this.createCalendar(null, null, timeZone, locale).isSameMillisecondOfSecond(target.createCalendar(null, null, timeZone, locale))
}


/**
 * Return true if the two calendars are the same year
 */
fun Long.isSameYear(target: Long, timeZone: TimeZone? = null, locale: Locale? = null): Boolean {
    return this.createCalendar(null, null, timeZone, locale).isSameYear(target.createCalendar(null, null, timeZone, locale))
}

/**
 * Return true if both calendars have the same year and month are the same
 */
fun Long.isSameMonth(target: Long, timeZone: TimeZone? = null, locale: Locale? = null): Boolean {
    return this.createCalendar(null, null, timeZone, locale).isSameMonth(target.createCalendar(null, null, timeZone, locale))
}

/**
 * Return true if the months is the same
 */
fun Long.isSameMonthOfYear(target: Long, timeZone: TimeZone? = null, locale: Locale? = null): Boolean {
    return this.createCalendar(null, null, timeZone, locale).isSameMonthOfYear(target.createCalendar(null, null, timeZone, locale))
}

/**
 * Returns true if the year, month, and week are the same
 */
fun Long.isSameWeek(target: Long, firstDayOfWeek: Int? = null, minimalDaysInFirstWeek: Int? = null, timeZone: TimeZone? = null, locale: Locale? = null): Boolean {
    return this.createCalendar(firstDayOfWeek, minimalDaysInFirstWeek, timeZone, locale).isSameWeek(target.createCalendar(firstDayOfWeek, minimalDaysInFirstWeek, timeZone, locale))
}

/**
 * Return true if the weekOfYear is the same
 */
fun Long.isSameWeekOfYear(target: Long, firstDayOfWeek: Int? = null, minimalDaysInFirstWeek: Int? = null, timeZone: TimeZone? = null, locale: Locale? = null): Boolean {
    return this.createCalendar(firstDayOfWeek, minimalDaysInFirstWeek, timeZone, locale).isSameWeekOfYear(target.createCalendar(firstDayOfWeek, minimalDaysInFirstWeek, timeZone, locale))
}

/**
 * Return true if the weekOfMonth is the same
 */
fun Long.isSameWeekOfMonth(target: Long, firstDayOfWeek: Int? = null, minimalDaysInFirstWeek: Int? = null, timeZone: TimeZone? = null, locale: Locale? = null): Boolean {
    return this.createCalendar(firstDayOfWeek, minimalDaysInFirstWeek, timeZone, locale).isSameWeekOfMonth(target.createCalendar(firstDayOfWeek, minimalDaysInFirstWeek, timeZone, locale))
}

/**
 * Returns true if the year, month, week and day are the same
 */
fun Long.isSameDay(target: Long, timeZone: TimeZone? = null, locale: Locale? = null): Boolean {
    return this.createCalendar(null, null, timeZone, locale).isSameDay(target.createCalendar(null, null, timeZone, locale))
}

/**
 * Return true if the dayOfYear is the same
 */
fun Long.isSameDayOfYear(target: Long, timeZone: TimeZone? = null, locale: Locale? = null): Boolean {
    return this.createCalendar(null, null, timeZone, locale).isSameDayOfYear(target.createCalendar(null, null, timeZone, locale))
}

/**
 * Return true if the dayOfMonth is the same
 */
fun Long.isSameDayOfMonth(target: Long, timeZone: TimeZone? = null, locale: Locale? = null): Boolean {
    return this.createCalendar(null, null, timeZone, locale).isSameDayOfMonth(target.createCalendar(null, null, timeZone, locale))
}

/**
 * Return true if the dayOfWeek is the same
 */
fun Long.isSameDayOfWeek(target: Long, firstDayOfWeek: Int? = null, minimalDaysInFirstWeek: Int? = null, timeZone: TimeZone? = null, locale: Locale? = null): Boolean {
    return this.createCalendar(firstDayOfWeek, minimalDaysInFirstWeek, timeZone, locale).isSameDayOfWeek(target.createCalendar(firstDayOfWeek, minimalDaysInFirstWeek, timeZone, locale))
}

/**
 * Return true if the dayOfWeekInMonth is the same
 */
fun Long.isSameDayOfWeekInMonth(target: Long, firstDayOfWeek: Int? = null, minimalDaysInFirstWeek: Int? = null, timeZone: TimeZone? = null, locale: Locale? = null): Boolean {
    return this.createCalendar(firstDayOfWeek, minimalDaysInFirstWeek, timeZone, locale).isSameDayOfWeekInMonth(target.createCalendar(firstDayOfWeek, minimalDaysInFirstWeek, timeZone, locale))
}

/**
 * Returns true if the year, month, week, day and hour are the same
 */
fun Long.isSameHour(target: Long, timeZone: TimeZone? = null, locale: Locale? = null): Boolean {
    return this.createCalendar(null, null, timeZone, locale).isSameHour(target.createCalendar(null, null, timeZone, locale))
}

/**
 * Return true if the 24H hour is the same
 */
fun Long.isSameHourOf24H(target: Long, timeZone: TimeZone? = null, locale: Locale? = null): Boolean {
    return this.createCalendar(null, null, timeZone, locale).isSameHourOf24H(target.createCalendar(null, null, timeZone, locale))
}

/**
 * Return true if the 12H hour is the same
 */
fun Long.isSameHourOf12H(target: Long, timeZone: TimeZone? = null, locale: Locale? = null): Boolean {
    return this.createCalendar(null, null, timeZone, locale).isSameHourOf12H(target.createCalendar(null, null, timeZone, locale))
}

/**
 * Returns true if the year, month, week, day, hour and minute are the same
 */
fun Long.isSameMinute(target: Long, timeZone: TimeZone? = null, locale: Locale? = null): Boolean {
    return this.createCalendar(null, null, timeZone, locale).isSameMinute(target.createCalendar(null, null, timeZone, locale))
}

/**
 * Return true if the minuteOfHour is the same
 */
fun Long.isSameMinuteOfHour(target: Long, timeZone: TimeZone? = null, locale: Locale? = null): Boolean {
    return this.createCalendar(null, null, timeZone, locale).isSameMinuteOfHour(target.createCalendar(null, null, timeZone, locale))
}

/**
 * Returns true if the year, month, week, day, hour, minute and second are the same
 */
fun Long.isSameSecond(target: Long, timeZone: TimeZone? = null, locale: Locale? = null): Boolean {
    return this.createCalendar(null, null, timeZone, locale).isSameSecond(target.createCalendar(null, null, timeZone, locale))
}

/**
 * Return true if the secondOfMinute is the same
 */
fun Long.isSameSecondOfMinute(target: Long, timeZone: TimeZone? = null, locale: Locale? = null): Boolean {
    return this.createCalendar(null, null, timeZone, locale).isSameSecondOfMinute(target.createCalendar(null, null, timeZone, locale))
}

/**
 * Returns true if the year, month, week, day, hour, minute, second and millisecond are the same
 */
fun Long.isSameMillisecond(target: Long, timeZone: TimeZone? = null, locale: Locale? = null): Boolean {
    return this.createCalendar(null, null, timeZone, locale).isSameMillisecond(target.createCalendar(null, null, timeZone, locale))
}

/**
 * Return true if the millisecondOfSecond is the same
 */
fun Long.isSameMillisecondOfSecond(target: Long, timeZone: TimeZone? = null, locale: Locale? = null): Boolean {
    return this.createCalendar(null, null, timeZone, locale).isSameMillisecondOfSecond(target.createCalendar(null, null, timeZone, locale))
}


/*
 * differ
 */


/**
 * Return true if the difference from the [target] does not exceed the [amount] specified calendar field
 */
fun Calendar.differFiled(target: Calendar, field: Int, amount: Int): Boolean {
    if (amount == 0) return true
    val finalAmount = if (this.timeInMillis < target.timeInMillis) amount.absoluteValue else amount.absoluteValue * -1
    val cacheTimeInMillis = this.timeInMillis
    this.add(field, finalAmount)
    val newTimeInMillis = this.timeInMillis
    this.timeInMillis = cacheTimeInMillis
    return if (finalAmount > 0) target.timeInMillis <= newTimeInMillis else target.timeInMillis >= newTimeInMillis
}


/**
 * Return true if the difference from the [target] does not exceed the [amount] year
 */
fun Calendar.differYear(target: Calendar, amount: Int): Boolean = differFiled(target, Calendar.YEAR, amount)

/**
 * Return true if the difference from the [target] does not exceed the [amount] month
 */
fun Calendar.differMonth(target: Calendar, amount: Int): Boolean = differFiled(target, Calendar.MONTH, amount)

/**
 * Return true if the difference from the [target] does not exceed the [amount] weekOfYear
 */
fun Calendar.differWeekOfYear(target: Calendar, amount: Int): Boolean = differFiled(target, Calendar.WEEK_OF_YEAR, amount)

/**
 * Return true if the difference from the [target] does not exceed the [amount] weekOfMonth
 */
fun Calendar.differWeekOfMonth(target: Calendar, amount: Int): Boolean = differFiled(target, Calendar.WEEK_OF_MONTH, amount)

/**
 * Return true if the difference from the [target] does not exceed the [amount] dayOfYear
 */
fun Calendar.differDayOfYear(target: Calendar, amount: Int): Boolean = differFiled(target, Calendar.DAY_OF_YEAR, amount)

/**
 * Return true if the difference from the [target] does not exceed the [amount] dayOfMonth
 */
fun Calendar.differDayOfMonth(target: Calendar, amount: Int): Boolean = differFiled(target, Calendar.DAY_OF_MONTH, amount)

/**
 * Return true if the difference from the [target] does not exceed the [amount] dayOfWeek
 */
fun Calendar.differDayOfWeek(target: Calendar, amount: Int): Boolean = differFiled(target, Calendar.DAY_OF_WEEK, amount)

/**
 * Return true if the difference from the [target] does not exceed the [amount] dayOfWeekInMonth
 */
fun Calendar.differDayOfWeekInMonth(target: Calendar, amount: Int): Boolean = differFiled(target, Calendar.DAY_OF_WEEK_IN_MONTH, amount)

/**
 * Return true if the difference from the [target] does not exceed the [amount] hourOfDay
 */
fun Calendar.differHourOfDay(target: Calendar, amount: Int): Boolean = differFiled(target, Calendar.HOUR_OF_DAY, amount)

/**
 * Return true if the difference from the [target] does not exceed the [amount] hour
 */
fun Calendar.differHour(target: Calendar, amount: Int): Boolean = differFiled(target, Calendar.HOUR, amount)

/**
 * Return true if the difference from the [target] does not exceed the [amount] minute
 */
fun Calendar.differMinute(target: Calendar, amount: Int): Boolean = differFiled(target, Calendar.MINUTE, amount)

/**
 * Return true if the difference from the [target] does not exceed the [amount] second
 */
fun Calendar.differSecond(target: Calendar, amount: Int): Boolean = differFiled(target, Calendar.SECOND, amount)

/**
 * Return true if the difference from the [target] does not exceed the [amount] millisecond
 */
fun Calendar.differMillisecond(target: Calendar, amount: Int): Boolean = differFiled(target, Calendar.MILLISECOND, amount)


/**
 * Return true if the difference from the [target] does not exceed the [amount] specified calendar field
 */
fun Date.differCalendarField(target: Date, field: Int, amount: Int, firstDayOfWeek: Int? = null, minimalDaysInFirstWeek: Int? = null, timeZone: TimeZone? = null, locale: Locale? = null): Boolean {
    return this.createCalendar(firstDayOfWeek, minimalDaysInFirstWeek, timeZone, locale).differFiled(target.createCalendar(firstDayOfWeek, minimalDaysInFirstWeek, timeZone, locale), field, amount)
}

/**
 * Return true if the difference from the [target] does not exceed the [amount] year
 */
fun Date.differYear(target: Date, amount: Int, firstDayOfWeek: Int? = null, minimalDaysInFirstWeek: Int? = null, timeZone: TimeZone? = null, locale: Locale? = null): Boolean {
    return this.createCalendar(firstDayOfWeek, minimalDaysInFirstWeek, timeZone, locale).differYear(target.createCalendar(firstDayOfWeek, minimalDaysInFirstWeek, timeZone, locale), amount)
}

/**
 * Return true if the difference from the [target] does not exceed the [amount] month
 */
fun Date.differMonth(target: Date, amount: Int, firstDayOfWeek: Int? = null, minimalDaysInFirstWeek: Int? = null, timeZone: TimeZone? = null, locale: Locale? = null): Boolean {
    return this.createCalendar(firstDayOfWeek, minimalDaysInFirstWeek, timeZone, locale).differMonth(target.createCalendar(firstDayOfWeek, minimalDaysInFirstWeek, timeZone, locale), amount)
}

/**
 * Return true if the difference from the [target] does not exceed the [amount] weekOfYear
 */
fun Date.differWeekOfYear(target: Date, amount: Int, firstDayOfWeek: Int? = null, minimalDaysInFirstWeek: Int? = null, timeZone: TimeZone? = null, locale: Locale? = null): Boolean {
    return this.createCalendar(firstDayOfWeek, minimalDaysInFirstWeek, timeZone, locale).differWeekOfYear(target.createCalendar(firstDayOfWeek, minimalDaysInFirstWeek, timeZone, locale), amount)
}

/**
 * Return true if the difference from the [target] does not exceed the [amount] weekOfMonth
 */
fun Date.differWeekOfMonth(target: Date, amount: Int, firstDayOfWeek: Int? = null, minimalDaysInFirstWeek: Int? = null, timeZone: TimeZone? = null, locale: Locale? = null): Boolean {
    return this.createCalendar(firstDayOfWeek, minimalDaysInFirstWeek, timeZone, locale).differWeekOfMonth(target.createCalendar(firstDayOfWeek, minimalDaysInFirstWeek, timeZone, locale), amount)
}

/**
 * Return true if the difference from the [target] does not exceed the [amount] dayOfYear
 */
fun Date.differDayOfYear(target: Date, amount: Int, firstDayOfWeek: Int? = null, minimalDaysInFirstWeek: Int? = null, timeZone: TimeZone? = null, locale: Locale? = null): Boolean {
    return this.createCalendar(firstDayOfWeek, minimalDaysInFirstWeek, timeZone, locale).differDayOfYear(target.createCalendar(firstDayOfWeek, minimalDaysInFirstWeek, timeZone, locale), amount)
}

/**
 * Return true if the difference from the [target] does not exceed the [amount] dayOfMonth
 */
fun Date.differDayOfMonth(target: Date, amount: Int, firstDayOfWeek: Int? = null, minimalDaysInFirstWeek: Int? = null, timeZone: TimeZone? = null, locale: Locale? = null): Boolean {
    return this.createCalendar(firstDayOfWeek, minimalDaysInFirstWeek, timeZone, locale).differDayOfMonth(target.createCalendar(firstDayOfWeek, minimalDaysInFirstWeek, timeZone, locale), amount)
}

/**
 * Return true if the difference from the [target] does not exceed the [amount] dayOfWeek
 */
fun Date.differDayOfWeek(target: Date, amount: Int, firstDayOfWeek: Int? = null, minimalDaysInFirstWeek: Int? = null, timeZone: TimeZone? = null, locale: Locale? = null): Boolean {
    return this.createCalendar(firstDayOfWeek, minimalDaysInFirstWeek, timeZone, locale).differDayOfWeek(target.createCalendar(firstDayOfWeek, minimalDaysInFirstWeek, timeZone, locale), amount)
}

/**
 * Return true if the difference from the [target] does not exceed the [amount] dayOfWeekInMonth
 */
fun Date.differDayOfWeekInMonth(target: Date, amount: Int, firstDayOfWeek: Int? = null, minimalDaysInFirstWeek: Int? = null, timeZone: TimeZone? = null, locale: Locale? = null): Boolean {
    return this.createCalendar(firstDayOfWeek, minimalDaysInFirstWeek, timeZone, locale).differDayOfWeekInMonth(target.createCalendar(firstDayOfWeek, minimalDaysInFirstWeek, timeZone, locale), amount)
}

/**
 * Return true if the difference from the [target] does not exceed the [amount] hourOfDay
 */
fun Date.differHourOfDay(target: Date, amount: Int, firstDayOfWeek: Int? = null, minimalDaysInFirstWeek: Int? = null, timeZone: TimeZone? = null, locale: Locale? = null): Boolean {
    return this.createCalendar(firstDayOfWeek, minimalDaysInFirstWeek, timeZone, locale).differHourOfDay(target.createCalendar(firstDayOfWeek, minimalDaysInFirstWeek, timeZone, locale), amount)
}

/**
 * Return true if the difference from the [target] does not exceed the [amount] hour
 */
fun Date.differHour(target: Date, amount: Int, firstDayOfWeek: Int? = null, minimalDaysInFirstWeek: Int? = null, timeZone: TimeZone? = null, locale: Locale? = null): Boolean {
    return this.createCalendar(firstDayOfWeek, minimalDaysInFirstWeek, timeZone, locale).differHour(target.createCalendar(firstDayOfWeek, minimalDaysInFirstWeek, timeZone, locale), amount)
}

/**
 * Return true if the difference from the [target] does not exceed the [amount] minute
 */
fun Date.differMinute(target: Date, amount: Int, firstDayOfWeek: Int? = null, minimalDaysInFirstWeek: Int? = null, timeZone: TimeZone? = null, locale: Locale? = null): Boolean {
    return this.createCalendar(firstDayOfWeek, minimalDaysInFirstWeek, timeZone, locale).differMinute(target.createCalendar(firstDayOfWeek, minimalDaysInFirstWeek, timeZone, locale), amount)
}

/**
 * Return true if the difference from the [target] does not exceed the [amount] second
 */
fun Date.differSecond(target: Date, amount: Int, firstDayOfWeek: Int? = null, minimalDaysInFirstWeek: Int? = null, timeZone: TimeZone? = null, locale: Locale? = null): Boolean {
    return this.createCalendar(firstDayOfWeek, minimalDaysInFirstWeek, timeZone, locale).differSecond(target.createCalendar(firstDayOfWeek, minimalDaysInFirstWeek, timeZone, locale), amount)
}

/**
 * Return true if the difference from the [target] does not exceed the [amount] millisecond
 */
fun Date.differMillisecond(target: Date, amount: Int, firstDayOfWeek: Int? = null, minimalDaysInFirstWeek: Int? = null, timeZone: TimeZone? = null, locale: Locale? = null): Boolean {
    return this.createCalendar(firstDayOfWeek, minimalDaysInFirstWeek, timeZone, locale).differMillisecond(target.createCalendar(firstDayOfWeek, minimalDaysInFirstWeek, timeZone, locale), amount)
}


/**
 * Return true if the difference from the [target] does not exceed the [amount] year
 */
fun Long.differCalendarField(target: Long, field: Int, amount: Int, firstDayOfWeek: Int? = null, minimalDaysInFirstWeek: Int? = null, timeZone: TimeZone? = null, locale: Locale? = null): Boolean {
    return this.createCalendar(firstDayOfWeek, minimalDaysInFirstWeek, timeZone, locale).differFiled(target.createCalendar(firstDayOfWeek, minimalDaysInFirstWeek, timeZone, locale), field, amount)
}

/**
 * Return true if the difference from the [target] does not exceed the [amount] year
 */
fun Long.differYear(target: Long, amount: Int, firstDayOfWeek: Int? = null, minimalDaysInFirstWeek: Int? = null, timeZone: TimeZone? = null, locale: Locale? = null): Boolean {
    return this.createCalendar(firstDayOfWeek, minimalDaysInFirstWeek, timeZone, locale).differYear(target.createCalendar(firstDayOfWeek, minimalDaysInFirstWeek, timeZone, locale), amount)
}

/**
 * Return true if the difference from the [target] does not exceed the [amount] month
 */
fun Long.differMonth(target: Long, amount: Int, firstDayOfWeek: Int? = null, minimalDaysInFirstWeek: Int? = null, timeZone: TimeZone? = null, locale: Locale? = null): Boolean {
    return this.createCalendar(firstDayOfWeek, minimalDaysInFirstWeek, timeZone, locale).differMonth(target.createCalendar(firstDayOfWeek, minimalDaysInFirstWeek, timeZone, locale), amount)
}

/**
 * Return true if the difference from the [target] does not exceed the [amount] weekOfYear
 */
fun Long.differWeekOfYear(target: Long, amount: Int, firstDayOfWeek: Int? = null, minimalDaysInFirstWeek: Int? = null, timeZone: TimeZone? = null, locale: Locale? = null): Boolean {
    return this.createCalendar(firstDayOfWeek, minimalDaysInFirstWeek, timeZone, locale).differWeekOfYear(target.createCalendar(firstDayOfWeek, minimalDaysInFirstWeek, timeZone, locale), amount)
}

/**
 * Return true if the difference from the [target] does not exceed the [amount] weekOfMonth
 */
fun Long.differWeekOfMonth(target: Long, amount: Int, firstDayOfWeek: Int? = null, minimalDaysInFirstWeek: Int? = null, timeZone: TimeZone? = null, locale: Locale? = null): Boolean {
    return this.createCalendar(firstDayOfWeek, minimalDaysInFirstWeek, timeZone, locale).differWeekOfMonth(target.createCalendar(firstDayOfWeek, minimalDaysInFirstWeek, timeZone, locale), amount)
}

/**
 * Return true if the difference from the [target] does not exceed the [amount] dayOfYear
 */
fun Long.differDayOfYear(target: Long, amount: Int, firstDayOfWeek: Int? = null, minimalDaysInFirstWeek: Int? = null, timeZone: TimeZone? = null, locale: Locale? = null): Boolean {
    return this.createCalendar(firstDayOfWeek, minimalDaysInFirstWeek, timeZone, locale).differDayOfYear(target.createCalendar(firstDayOfWeek, minimalDaysInFirstWeek, timeZone, locale), amount)
}

/**
 * Return true if the difference from the [target] does not exceed the [amount] dayOfMonth
 */
fun Long.differDayOfMonth(target: Long, amount: Int, firstDayOfWeek: Int? = null, minimalDaysInFirstWeek: Int? = null, timeZone: TimeZone? = null, locale: Locale? = null): Boolean {
    return this.createCalendar(firstDayOfWeek, minimalDaysInFirstWeek, timeZone, locale).differDayOfMonth(target.createCalendar(firstDayOfWeek, minimalDaysInFirstWeek, timeZone, locale), amount)
}

/**
 * Return true if the difference from the [target] does not exceed the [amount] dayOfWeek
 */
fun Long.differDayOfWeek(target: Long, amount: Int, firstDayOfWeek: Int? = null, minimalDaysInFirstWeek: Int? = null, timeZone: TimeZone? = null, locale: Locale? = null): Boolean {
    return this.createCalendar(firstDayOfWeek, minimalDaysInFirstWeek, timeZone, locale).differDayOfWeek(target.createCalendar(firstDayOfWeek, minimalDaysInFirstWeek, timeZone, locale), amount)
}

/**
 * Return true if the difference from the [target] does not exceed the [amount] dayOfWeekInMonth
 */
fun Long.differDayOfWeekInMonth(target: Long, amount: Int, firstDayOfWeek: Int? = null, minimalDaysInFirstWeek: Int? = null, timeZone: TimeZone? = null, locale: Locale? = null): Boolean {
    return this.createCalendar(firstDayOfWeek, minimalDaysInFirstWeek, timeZone, locale).differDayOfWeekInMonth(target.createCalendar(firstDayOfWeek, minimalDaysInFirstWeek, timeZone, locale), amount)
}

/**
 * Return true if the difference from the [target] does not exceed the [amount] hourOfDay
 */
fun Long.differHourOfDay(target: Long, amount: Int, firstDayOfWeek: Int? = null, minimalDaysInFirstWeek: Int? = null, timeZone: TimeZone? = null, locale: Locale? = null): Boolean {
    return this.createCalendar(firstDayOfWeek, minimalDaysInFirstWeek, timeZone, locale).differHourOfDay(target.createCalendar(firstDayOfWeek, minimalDaysInFirstWeek, timeZone, locale), amount)
}

/**
 * Return true if the difference from the [target] does not exceed the [amount] hour
 */
fun Long.differHour(target: Long, amount: Int, firstDayOfWeek: Int? = null, minimalDaysInFirstWeek: Int? = null, timeZone: TimeZone? = null, locale: Locale? = null): Boolean {
    return this.createCalendar(firstDayOfWeek, minimalDaysInFirstWeek, timeZone, locale).differHour(target.createCalendar(firstDayOfWeek, minimalDaysInFirstWeek, timeZone, locale), amount)
}

/**
 * Return true if the difference from the [target] does not exceed the [amount] minute
 */
fun Long.differMinute(target: Long, amount: Int, firstDayOfWeek: Int? = null, minimalDaysInFirstWeek: Int? = null, timeZone: TimeZone? = null, locale: Locale? = null): Boolean {
    return this.createCalendar(firstDayOfWeek, minimalDaysInFirstWeek, timeZone, locale).differMinute(target.createCalendar(firstDayOfWeek, minimalDaysInFirstWeek, timeZone, locale), amount)
}

/**
 * Return true if the difference from the [target] does not exceed the [amount] second
 */
fun Long.differSecond(target: Long, amount: Int, firstDayOfWeek: Int? = null, minimalDaysInFirstWeek: Int? = null, timeZone: TimeZone? = null, locale: Locale? = null): Boolean {
    return this.createCalendar(firstDayOfWeek, minimalDaysInFirstWeek, timeZone, locale).differSecond(target.createCalendar(firstDayOfWeek, minimalDaysInFirstWeek, timeZone, locale), amount)
}

/**
 * Return true if the difference from the [target] does not exceed the [amount] millisecond
 */
fun Long.differMillisecond(target: Long, amount: Int, firstDayOfWeek: Int? = null, minimalDaysInFirstWeek: Int? = null, timeZone: TimeZone? = null, locale: Locale? = null): Boolean {
    return this.createCalendar(firstDayOfWeek, minimalDaysInFirstWeek, timeZone, locale).differMillisecond(target.createCalendar(firstDayOfWeek, minimalDaysInFirstWeek, timeZone, locale), amount)
}


/*
 * Iterator
 */


/**
 * Create a positive-order year ranges
 */
infix fun Date.yearRangeTo(endInclusive: Date): YearRange = YearRange(this, endInclusive, 1)

/**
 * Create a reversed year range
 */
infix fun Date.yearDownTo(endInclusive: Date): YearRange = YearRange(this, endInclusive, -1)

/**
 * Create a positive-order year range that does not contain [end]
 */
infix fun Date.yearUntilTo(end: Date): YearRange = YearRange(this, end.addYear(-1), 1)

/**
 * Create a reversed year range that does not contain [end]
 */
infix fun Date.yearDownUntilTo(end: Date): YearRange = YearRange(this, end.addYear(1), -1)


/**
 * Create a positive-order year ranges
 */
infix fun Long.yearRangeTo(endInclusive: Long): YearRange = this.toDate().yearRangeTo(endInclusive.toDate())

/**
 * Create a reversed year range
 */
infix fun Long.yearDownTo(endInclusive: Long): YearRange = this.toDate().yearDownTo(endInclusive.toDate())

/**
 * Create a positive-order year range that does not contain [end]
 */
infix fun Long.yearUntilTo(end: Long): YearRange = this.toDate().yearUntilTo(end.toDate())

/**
 * Create a reversed year range that does not contain [end]
 */
infix fun Long.yearDownUntilTo(end: Long): YearRange = this.toDate().yearDownUntilTo(end.toDate())


/**
 * Create a positive-order year ranges, parsing the formatted date string with 'yyyy'
 */
infix fun String.yearYRangeTo(endInclusive: String): YearRange = this.toDateY().yearRangeTo(endInclusive.toDateY())

/**
 * Create a reversed year range, parsing the formatted date string with 'yyyy'
 */
infix fun String.yearYDownTo(endInclusive: String): YearRange = this.toDateY().yearDownTo(endInclusive.toDateY())

/**
 * Create a positive-order year range that does not contain [end], parsing the formatted date string with 'yyyy'
 */
infix fun String.yearYUntilTo(end: String): YearRange = this.toDateY().yearUntilTo(end.toDateY())

/**
 * Create a reversed year range that does not contain [end], parsing the formatted date string with 'yyyy'
 */
infix fun String.yearYDownUntilTo(end: String): YearRange = this.toDateY().yearDownUntilTo(end.toDateY())


/**
 * Create a positive-order month ranges
 */
infix fun Date.monthRangeTo(endInclusive: Date): MonthRange = MonthRange(this, endInclusive, 1)

/**
 * Create a reversed month range
 */
infix fun Date.monthDownTo(endInclusive: Date): MonthRange = MonthRange(this, endInclusive, -1)

/**
 * Create a positive-order month range that does not contain [end]
 */
infix fun Date.monthUntilTo(end: Date): MonthRange = MonthRange(this, end.addMonth(-1), 1)

/**
 * Create a reversed month range that does not contain [end]
 */
infix fun Date.monthDownUntilTo(end: Date): MonthRange = MonthRange(this, end.addMonth(1), -1)


/**
 * Create a positive-order month ranges
 */
infix fun Long.monthRangeTo(endInclusive: Long): MonthRange = this.toDate().monthRangeTo(endInclusive.toDate())

/**
 * Create a reversed month range
 */
infix fun Long.monthDownTo(endInclusive: Long): MonthRange = this.toDate().monthDownTo(endInclusive.toDate())

/**
 * Create a positive-order month range that does not contain [end]
 */
infix fun Long.monthUntilTo(end: Long): MonthRange = this.toDate().monthUntilTo(end.toDate())

/**
 * Create a reversed month range that does not contain [end]
 */
infix fun Long.monthDownUntilTo(end: Long): MonthRange = this.toDate().monthDownUntilTo(end.toDate())


/**
 * Create a positive-order month ranges, parsing the formatted date string with 'yyyy-MM'
 */
infix fun String.monthYMRangeTo(endInclusive: String): MonthRange = this.toDateYM().monthRangeTo(endInclusive.toDateYM())

/**
 * Create a reversed month range, parsing the formatted date string with 'yyyy-MM'
 */
infix fun String.monthYMDownTo(endInclusive: String): MonthRange = this.toDateYM().monthDownTo(endInclusive.toDateYM())

/**
 * Create a positive-order month range that does not contain [end], parsing the formatted date string with 'yyyy-MM'
 */
infix fun String.monthYMUntilTo(end: String): MonthRange = this.toDateYM().monthUntilTo(end.toDateYM())

/**
 * Create a reversed month range that does not contain [end], parsing the formatted date string with 'yyyy-MM'
 */
infix fun String.monthYMDownUntilTo(end: String): MonthRange = this.toDateYM().monthDownUntilTo(end.toDateYM())


/**
 * Create a positive-order day ranges
 */
infix fun Date.dayRangeTo(endInclusive: Date): DayRange = DayRange(this, endInclusive, 1)

/**
 * Create a reversed day range
 */
infix fun Date.dayDownTo(endInclusive: Date): DayRange = DayRange(this, endInclusive, -1)

/**
 * Create a positive-order day range that does not contain [end]
 */
infix fun Date.dayUntilTo(end: Date): DayRange = DayRange(this, end.addDayOfMonth(-1), 1)

/**
 * Create a reversed day range that does not contain [end]
 */
infix fun Date.dayDownUntilTo(end: Date): DayRange = DayRange(this, end.addDayOfMonth(1), -1)


/**
 * Create a positive-order day ranges
 */
infix fun Long.dayRangeTo(endInclusive: Long): DayRange = this.toDate().dayRangeTo(endInclusive.toDate())

/**
 * Create a reversed day range
 */
infix fun Long.dayDownTo(endInclusive: Long): DayRange = this.toDate().dayDownTo(endInclusive.toDate())

/**
 * Create a positive-order day range that does not contain [end]
 */
infix fun Long.dayUntilTo(end: Long): DayRange = this.toDate().dayUntilTo(end.toDate())

/**
 * Create a reversed day range that does not contain [end]
 */
infix fun Long.dayDownUntilTo(end: Long): DayRange = this.toDate().dayDownUntilTo(end.toDate())


/**
 * Create a positive-order day ranges, parsing the formatted date string with 'yyyy-MM-dd'
 */
infix fun String.dayYMDRangeTo(endInclusive: String): DayRange = this.toDateYMD().dayRangeTo(endInclusive.toDateYMD())

/**
 * Create a reversed day range, parsing the formatted date string with 'yyyy-MM-dd'
 */
infix fun String.dayYMDDownTo(endInclusive: String): DayRange = this.toDateYMD().dayDownTo(endInclusive.toDateYMD())

/**
 * Create a positive-order day range that does not contain [end], parsing the formatted date string with 'yyyy-MM-dd'
 */
infix fun String.dayYMDUntilTo(end: String): DayRange = this.toDateYMD().dayUntilTo(end.toDateYMD())

/**
 * Create a reversed day range that does not contain [end], parsing the formatted date string with 'yyyy-MM-dd'
 */
infix fun String.dayYMDDownUntilTo(end: String): DayRange = this.toDateYMD().dayDownUntilTo(end.toDateYMD())


/**
 * Create a positive-order hour ranges
 */
infix fun Date.hourRangeTo(endInclusive: Date): HourRange = HourRange(this, endInclusive, 1)

/**
 * Create a reversed hour range
 */
infix fun Date.hourDownTo(endInclusive: Date): HourRange = HourRange(this, endInclusive, -1)

/**
 * Create a positive-order hour range that does not contain [end]
 */
infix fun Date.hourUntilTo(end: Date): HourRange = HourRange(this, end.addHourOfDay(-1), 1)

/**
 * Create a reversed hour range that does not contain [end]
 */
infix fun Date.hourDownUntilTo(end: Date): HourRange = HourRange(this, end.addHourOfDay(1), -1)


/**
 * Create a positive-order hour ranges
 */
infix fun Long.hourRangeTo(endInclusive: Long): HourRange = this.toDate().hourRangeTo(endInclusive.toDate())

/**
 * Create a reversed hour range
 */
infix fun Long.hourDownTo(endInclusive: Long): HourRange = this.toDate().hourDownTo(endInclusive.toDate())

/**
 * Create a positive-order hour range that does not contain [end]
 */
infix fun Long.hourUntilTo(end: Long): HourRange = this.toDate().hourUntilTo(end.toDate())

/**
 * Create a reversed hour range that does not contain [end]
 */
infix fun Long.hourDownUntilTo(end: Long): HourRange = this.toDate().hourDownUntilTo(end.toDate())


/**
 * Create a positive-order hour ranges, parsing the formatted date string with 'yyyy-MM-dd HH'
 */
infix fun String.hourYMDHRangeTo(endInclusive: String): HourRange = this.toDateYMDH().hourRangeTo(endInclusive.toDateYMDH())

/**
 * Create a reversed hour range, parsing the formatted date string with 'yyyy-MM-dd HH'
 */
infix fun String.hourYMDHDownTo(endInclusive: String): HourRange = this.toDateYMDH().hourDownTo(endInclusive.toDateYMDH())

/**
 * Create a positive-order hour range that does not contain [end], parsing the formatted date string with 'yyyy-MM-dd HH'
 */
infix fun String.hourYMDHUntilTo(end: String): HourRange = this.toDateYMDH().hourUntilTo(end.toDateYMDH())

/**
 * Create a reversed hour range that does not contain [end], parsing the formatted date string with 'yyyy-MM-dd HH'
 */
infix fun String.hourYMDHDownUntilTo(end: String): HourRange = this.toDateYMDH().hourDownUntilTo(end.toDateYMDH())


/**
 * Create a positive-order minute ranges
 */
infix fun Date.minuteRangeTo(endInclusive: Date): MinuteRange = MinuteRange(this, endInclusive, 1)

/**
 * Create a reversed minute range
 */
infix fun Date.minuteDownTo(endInclusive: Date): MinuteRange = MinuteRange(this, endInclusive, -1)

/**
 * Create a positive-order minute range that does not contain [end]
 */
infix fun Date.minuteUntilTo(end: Date): MinuteRange = MinuteRange(this, end.addMinute(-1), 1)

/**
 * Create a reversed minute range that does not contain [end]
 */
infix fun Date.minuteDownUntilTo(end: Date): MinuteRange = MinuteRange(this, end.addMinute(1), -1)


/**
 * Create a positive-order minute ranges
 */
infix fun Long.minuteRangeTo(endInclusive: Long): MinuteRange = this.toDate().minuteRangeTo(endInclusive.toDate())

/**
 * Create a reversed minute range
 */
infix fun Long.minuteDownTo(endInclusive: Long): MinuteRange = this.toDate().minuteDownTo(endInclusive.toDate())

/**
 * Create a positive-order minute range that does not contain [end]
 */
infix fun Long.minuteUntilTo(end: Long): MinuteRange = this.toDate().minuteUntilTo(end.toDate())

/**
 * Create a reversed minute range that does not contain [end]
 */
infix fun Long.minuteDownUntilTo(end: Long): MinuteRange = this.toDate().minuteDownUntilTo(end.toDate())


/**
 * Create a positive-order minute ranges, parsing the formatted date string with 'yyyy-MM-dd HH:mm'
 */
infix fun String.minuteYMDHMRangeTo(endInclusive: String): MinuteRange = this.toDateYMDHM().minuteRangeTo(endInclusive.toDateYMDHM())

/**
 * Create a reversed minute range, parsing the formatted date string with 'yyyy-MM-dd HH:mm'
 */
infix fun String.minuteYMDHMDownTo(endInclusive: String): MinuteRange = this.toDateYMDHM().minuteDownTo(endInclusive.toDateYMDHM())

/**
 * Create a positive-order minute range that does not contain [end], parsing the formatted date string with 'yyyy-MM-dd HH:mm'
 */
infix fun String.minuteYMDHMUntilTo(end: String): MinuteRange = this.toDateYMDHM().minuteUntilTo(end.toDateYMDHM())

/**
 * Create a reversed minute range that does not contain [end], parsing the formatted date string with 'yyyy-MM-dd HH:mm'
 */
infix fun String.minuteYMDHMDownUntilTo(end: String): MinuteRange = this.toDateYMDHM().minuteDownUntilTo(end.toDateYMDHM())


/**
 * Create a positive-order second ranges
 */
infix fun Date.secondRangeTo(endInclusive: Date): SecondRange = SecondRange(this, endInclusive, 1)

/**
 * Create a reversed second range
 */
infix fun Date.secondDownTo(endInclusive: Date): SecondRange = SecondRange(this, endInclusive, -1)

/**
 * Create a positive-order second range that does not contain [end]
 */
infix fun Date.secondUntilTo(end: Date): SecondRange = SecondRange(this, end.addSecond(-1), 1)

/**
 * Create a reversed second range that does not contain [end]
 */
infix fun Date.secondDownUntilTo(end: Date): SecondRange = SecondRange(this, end.addSecond(1), -1)


/**
 * Create a positive-order second ranges
 */
infix fun Long.secondRangeTo(endInclusive: Long): SecondRange = this.toDate().secondRangeTo(endInclusive.toDate())

/**
 * Create a reversed second range
 */
infix fun Long.secondDownTo(endInclusive: Long): SecondRange = this.toDate().secondDownTo(endInclusive.toDate())

/**
 * Create a positive-order second range that does not contain [end]
 */
infix fun Long.secondUntilTo(end: Long): SecondRange = this.toDate().secondUntilTo(end.toDate())

/**
 * Create a reversed second range that does not contain [end]
 */
infix fun Long.secondDownUntilTo(end: Long): SecondRange = this.toDate().secondDownUntilTo(end.toDate())


/**
 * Create a positive-order second ranges, parsing the formatted date string with 'yyyy-MM-dd HH:mm:ss'
 */
infix fun String.secondYMDHMSRangeTo(endInclusive: String): SecondRange = this.toDateYMDHMS().secondRangeTo(endInclusive.toDateYMDHMS())

/**
 * Create a reversed second range, parsing the formatted date string with 'yyyy-MM-dd HH:mm:ss'
 */
infix fun String.secondYMDHMSDownTo(endInclusive: String): SecondRange = this.toDateYMDHMS().secondDownTo(endInclusive.toDateYMDHMS())

/**
 * Create a positive-order second range that does not contain [end], parsing the formatted date string with 'yyyy-MM-dd HH:mm:ss'
 */
infix fun String.secondYMDHMSUntilTo(end: String): SecondRange = this.toDateYMDHMS().secondUntilTo(end.toDateYMDHMS())

/**
 * Create a reversed second range that does not contain [end], parsing the formatted date string with 'yyyy-MM-dd HH:mm:ss'
 */
infix fun String.secondYMDHMSDownUntilTo(end: String): SecondRange = this.toDateYMDHMS().secondDownUntilTo(end.toDateYMDHMS())


/**
 * Create a positive-order millisecond ranges
 */
infix fun Date.millisecondRangeTo(endInclusive: Date): MillisecondRange = MillisecondRange(this, endInclusive, 1)

/**
 * Create a reversed millisecond range
 */
infix fun Date.millisecondDownTo(endInclusive: Date): MillisecondRange = MillisecondRange(this, endInclusive, -1)

/**
 * Create a positive-order millisecond range that does not contain [end]
 */
infix fun Date.millisecondUntilTo(end: Date): MillisecondRange = MillisecondRange(this, end.addMillisecond(-1), 1)

/**
 * Create a reversed millisecond range that does not contain [end]
 */
infix fun Date.millisecondDownUntilTo(end: Date): MillisecondRange = MillisecondRange(this, end.addMillisecond(1), -1)


/**
 * Create a positive-order millisecond ranges
 */
infix fun Long.millisecondRangeTo(endInclusive: Long): MillisecondRange = this.toDate().millisecondRangeTo(endInclusive.toDate())

/**
 * Create a reversed millisecond range
 */
infix fun Long.millisecondDownTo(endInclusive: Long): MillisecondRange = this.toDate().millisecondDownTo(endInclusive.toDate())

/**
 * Create a positive-order millisecond range that does not contain [end]
 */
infix fun Long.millisecondUntilTo(end: Long): MillisecondRange = this.toDate().millisecondUntilTo(end.toDate())

/**
 * Create a reversed millisecond range that does not contain [end]
 */
infix fun Long.millisecondDownUntilTo(end: Long): MillisecondRange = this.toDate().millisecondDownUntilTo(end.toDate())


/**
 * Create a positive-order millisecond ranges, parsing the formatted date string with 'yyyy-MM-dd HH:mm:ss SSS'
 */
infix fun String.millisecondYMDHMSMRangeTo(endInclusive: String): MillisecondRange = this.toDateYMDHMSM().millisecondRangeTo(endInclusive.toDateYMDHMSM())

/**
 * Create a reversed millisecond range, parsing the formatted date string with 'yyyy-MM-dd HH:mm:ss SSS'
 */
infix fun String.millisecondYMDHMSMDownTo(endInclusive: String): MillisecondRange = this.toDateYMDHMSM().millisecondDownTo(endInclusive.toDateYMDHMSM())

/**
 * Create a positive-order millisecond range that does not contain [end], parsing the formatted date string with 'yyyy-MM-dd HH:mm:ss SSS'
 */
infix fun String.millisecondYMDHMSMUntilTo(end: String): MillisecondRange = this.toDateYMDHMSM().millisecondUntilTo(end.toDateYMDHMSM())

/**
 * Create a reversed millisecond range that does not contain [end], parsing the formatted date string with 'yyyy-MM-dd HH:mm:ss SSS'
 */
infix fun String.millisecondYMDHMSMDownUntilTo(end: String): MillisecondRange = this.toDateYMDHMSM().millisecondDownUntilTo(end.toDateYMDHMSM())


abstract class DateRange(override val start: Date, override val endInclusive: Date, val step: Int) : Iterable<Date>, ClosedRange<Date> {

    override fun iterator(): Iterator<Date> = IteratorInternal(this, start, endInclusive, step)

    override fun contains(value: Date): Boolean {
        @Suppress("ConvertTwoComparisonsToRangeCheck")
        return when {
            step > 0 -> value >= start && value <= endInclusive
            step < 0 -> value <= start && value >= endInclusive
            else -> false
        }
    }

    override fun isEmpty(): Boolean {
        return when {
            step > 0 -> start > endInclusive
            step < 0 -> start < endInclusive
            else -> true
        }
    }

    abstract fun nextDate(date: Date): Date

    class IteratorInternal(private val range: DateRange, first: Date, private val last: Date, private val step: Int) : Iterator<Date> {
        var hasNext: Boolean
        var next: Date

        init {
            hasNext = when {
                step > 0 -> first <= last
                step < 0 -> first >= last
                else -> false
            }
            next = if (hasNext) first else last
        }

        override fun hasNext(): Boolean {
            return hasNext
        }

        override fun next(): Date {
            if (!hasNext) {
                throw NoSuchElementException()
            }

            val result = next
            next = range.nextDate(next)
            hasNext = when {
                step > 0 -> next <= last
                step < 0 -> next >= last
                else -> false
            }
            return result
        }
    }
}

class YearRange(start: Date, endInclusive: Date, step: Int) : DateRange(start, endInclusive, step) {
    override fun nextDate(date: Date): Date = date.addYear(step)
}

class MonthRange(start: Date, endInclusive: Date, step: Int) : DateRange(start, endInclusive, step) {
    override fun nextDate(date: Date): Date = date.addMonth(step)
}

class DayRange(start: Date, endInclusive: Date, step: Int) : DateRange(start, endInclusive, step) {
    override fun nextDate(date: Date): Date = date.addDayOfMonth(step)
}

class HourRange(start: Date, endInclusive: Date, step: Int) : DateRange(start, endInclusive, step) {
    override fun nextDate(date: Date): Date = date.addHourOfDay(step)
}

class MinuteRange(start: Date, endInclusive: Date, step: Int) : DateRange(start, endInclusive, step) {
    override fun nextDate(date: Date): Date = date.addMinute(step)
}

class SecondRange(start: Date, endInclusive: Date, step: Int) : DateRange(start, endInclusive, step) {
    override fun nextDate(date: Date): Date = date.addSecond(step)
}

class MillisecondRange(start: Date, endInclusive: Date, step: Int) : DateRange(start, endInclusive, step) {
    override fun nextDate(date: Date): Date = date.addMillisecond(step)
}