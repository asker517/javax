package me.panpf.javaxkt.util

import java.text.SimpleDateFormat
import java.util.*
import java.util.Calendar


/*
 * Date related extension
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


fun Date.createCalendar(firstDayOfWeek: Int? = null, minimalDaysInFirstWeek: Int? = null, timeZone: TimeZone? = null, locale: Locale? = null): Calendar {
    return time.createCalendar(firstDayOfWeek, minimalDaysInFirstWeek, timeZone, locale)
}


/*
 * toDate
 */


fun String.toDate(format: SimpleDateFormat): Date {
    return format.parse(this)
}

fun String.toDate(pattern: String, locale: Locale? = null): Date {
    return this.toDate(if (locale != null) SimpleDateFormat(pattern, locale) else SimpleDateFormat(pattern))
}

fun String.toDateY(locale: Locale? = null): Date {
    return this.toDate("yyyy", locale)
}

fun String.toDateYM(locale: Locale? = null): Date {
    return this.toDate("yyyy-MM", locale)
}

fun String.toDateYMCompact(locale: Locale? = null): Date {
    return this.toDate("yyyyMM", locale)
}

fun String.toDateYMD(locale: Locale? = null): Date {
    return this.toDate("yyyy-MM-dd", locale)
}

fun String.toDateYMDCompact(locale: Locale? = null): Date {
    return this.toDate("yyyyMMdd", locale)
}

fun String.toDateYMDHM(locale: Locale? = null): Date {
    return this.toDate("yyyy-MM-dd HH:mm", locale)
}

fun String.toDateYMDHMS(locale: Locale? = null): Date {
    return this.toDate("yyyy-MM-dd HH:mm:ss", locale)
}

fun String.toDateYMDHMSM(locale: Locale? = null): Date {
    return this.toDate("yyyy-MM-dd HH:mm:ss SSS", locale)
}


/*
 * toMillisecond
 */


fun String.toMillisecond(format: SimpleDateFormat): Long {
    return format.parse(this).time
}

fun String.toMillisecond(pattern: String, locale: Locale? = null): Long {
    return this.toMillisecond(if (locale != null) SimpleDateFormat(pattern, locale) else SimpleDateFormat(pattern))
}

fun String.toMillisecondY(locale: Locale? = null): Long {
    return this.toMillisecond("yyyy", locale)
}

fun String.toMillisecondYM(locale: Locale? = null): Long {
    return this.toMillisecond("yyyy-MM", locale)
}

fun String.toMillisecondYMCompact(locale: Locale? = null): Long {
    return this.toMillisecond("yyyyMM", locale)
}

fun String.toMillisecondYMD(locale: Locale? = null): Long {
    return this.toMillisecond("yyyy-MM-dd", locale)
}

fun String.toMillisecondYMDCompact(locale: Locale? = null): Long {
    return this.toMillisecond("yyyyMMdd", locale)
}

fun String.toMillisecondYMDHM(locale: Locale? = null): Long {
    return this.toMillisecond("yyyy-MM-dd HH:mm", locale)
}

fun String.toMillisecondYMDHMS(locale: Locale? = null): Long {
    return this.toMillisecond("yyyy-MM-dd HH:mm:ss", locale)
}

fun String.toMillisecondYMDHMSM(locale: Locale? = null): Long {
    return this.toMillisecond("yyyy-MM-dd HH:mm:ss SSS", locale)
}


/*
 * format
 */


fun Date.format(format: SimpleDateFormat): String {
    return format.format(this)
}


fun Date.format(pattern: String, locale: Locale? = null): String {
    return this.format(if (locale != null) SimpleDateFormat(pattern, locale) else SimpleDateFormat(pattern))
}

fun Date.formatY(locale: Locale? = null): String {
    return format("yyyy", locale)
}

fun Date.formatYM(locale: Locale? = null): String {
    return format("yyyy-MM", locale)
}

fun Date.formatYMCompact(locale: Locale? = null): String {
    return format("yyyyMM", locale)
}

fun Date.formatYMD(locale: Locale? = null): String {
    return format("yyyy-MM-dd", locale)
}

fun Date.formatYMDCompact(locale: Locale? = null): String {
    return format("yyyyMMdd", locale)
}

fun Date.formatYMDHM(locale: Locale? = null): String {
    return format("yyyy-MM-dd HH:mm", locale)
}

fun Date.formatYMDHMS(locale: Locale? = null): String {
    return format("yyyy-MM-dd HH:mm:ss", locale)
}

fun Date.formatYMDHMSM(locale: Locale? = null): String {
    return format("yyyy-MM-dd HH:mm:ss SSS", locale)
}


fun Long.format(format: SimpleDateFormat): String {
    return Date(this).format(format)
}

fun Long.format(pattern: String, locale: Locale? = null): String {
    return format(if (locale != null) SimpleDateFormat(pattern, locale) else SimpleDateFormat(pattern))
}

fun Long.formatY(locale: Locale? = null): String {
    return format("yyyy", locale)
}

fun Long.formatYM(locale: Locale? = null): String {
    return format("yyyy-MM", locale)
}

fun Long.formatYMCompact(locale: Locale? = null): String {
    return format("yyyyMM", locale)
}

fun Long.formatYMD(locale: Locale? = null): String {
    return format("yyyy-MM-dd", locale)
}

fun Long.formatYMDCompact(locale: Locale? = null): String {
    return format("yyyyMMdd", locale)
}

fun Long.formatYMDHM(locale: Locale? = null): String {
    return format("yyyy-MM-dd HH:mm", locale)
}

fun Long.formatYMDHMS(locale: Locale? = null): String {
    return format("yyyy-MM-dd HH:mm:ss", locale)
}

fun Long.formatYMDHMSM(locale: Locale? = null): String {
    return format("yyyy-MM-dd HH:mm:ss SSS", locale)
}


/*
 * get
 */


fun Calendar.getYear(): Int = this.get(Calendar.YEAR)

fun Calendar.getMonth(): Int = this.get(Calendar.MONTH)

fun Calendar.getWeekOfYear(): Int = this.get(Calendar.WEEK_OF_YEAR)

fun Calendar.getWeekOfMonth(): Int = this.get(Calendar.WEEK_OF_MONTH)

fun Calendar.getDayOfYear(): Int = this.get(Calendar.DAY_OF_YEAR)

fun Calendar.getDayOfMonth(): Int = this.get(Calendar.DAY_OF_MONTH)

fun Calendar.getDayOfWeekInMonth(): Int = this.get(Calendar.DAY_OF_WEEK_IN_MONTH)

fun Calendar.getDayOfWeek(): Int = this.get(Calendar.DAY_OF_WEEK)

fun Calendar.getHourDay(): Int = this.get(Calendar.HOUR_OF_DAY)

fun Calendar.getHour(): Int = this.get(Calendar.HOUR)

fun Calendar.getMinute(): Int = this.get(Calendar.MINUTE)

fun Calendar.getSecond(): Int = this.get(Calendar.SECOND)

fun Calendar.getMillisecond(): Int = this.get(Calendar.MILLISECOND)


fun Date.getCalendarYear(timeZone: TimeZone? = null, locale: Locale? = null): Int {
    return createCalendar(null, null, timeZone, locale).getYear()
}

fun Date.getCalendarMonth(timeZone: TimeZone? = null, locale: Locale? = null): Int {
    return createCalendar(null, null, timeZone, locale).getMonth()
}

fun Date.getCalendarWeekOfYear(firstDayOfWeek: Int? = null, minimalDaysInFirstWeek: Int? = null, timeZone: TimeZone? = null, locale: Locale? = null): Int {
    return createCalendar(firstDayOfWeek, minimalDaysInFirstWeek, timeZone, locale).getWeekOfYear()
}

fun Date.getCalendarWeekOfMonth(firstDayOfWeek: Int? = null, minimalDaysInFirstWeek: Int? = null, timeZone: TimeZone? = null, locale: Locale? = null): Int {
    return createCalendar(firstDayOfWeek, minimalDaysInFirstWeek, timeZone, locale).getWeekOfMonth()
}

fun Date.getCalendarDayOfYear(timeZone: TimeZone? = null, locale: Locale? = null): Int {
    return createCalendar(null, null, timeZone, locale).getDayOfYear()
}

fun Date.getCalendarDayOfMonth(timeZone: TimeZone? = null, locale: Locale? = null): Int {
    return createCalendar(null, null, timeZone, locale).getDayOfMonth()
}

fun Date.getCalendarDayOfWeekInMonth(firstDayOfWeek: Int? = null, minimalDaysInFirstWeek: Int? = null, timeZone: TimeZone? = null, locale: Locale? = null): Int {
    return createCalendar(firstDayOfWeek, minimalDaysInFirstWeek, timeZone, locale).getDayOfWeekInMonth()
}

fun Date.getCalendarDayOfWeek(firstDayOfWeek: Int? = null, minimalDaysInFirstWeek: Int? = null, timeZone: TimeZone? = null, locale: Locale? = null): Int {
    return createCalendar(firstDayOfWeek, minimalDaysInFirstWeek, timeZone, locale).getDayOfWeek()
}

fun Date.getCalendarHourDay(timeZone: TimeZone? = null, locale: Locale? = null): Int {
    return createCalendar(null, null, timeZone, locale).getHourDay()
}

fun Date.getCalendarHour(timeZone: TimeZone? = null, locale: Locale? = null): Int {
    return createCalendar(null, null, timeZone, locale).getHour()
}

fun Date.getCalendarMinute(timeZone: TimeZone? = null, locale: Locale? = null): Int {
    return createCalendar(null, null, timeZone, locale).getMinute()
}

fun Date.getCalendarSecond(timeZone: TimeZone? = null, locale: Locale? = null): Int {
    return createCalendar(null, null, timeZone, locale).getSecond()
}

fun Date.getCalendarMillisecond(timeZone: TimeZone? = null, locale: Locale? = null): Int {
    return createCalendar(null, null, timeZone, locale).getMillisecond()
}


fun Long.getYear(timeZone: TimeZone? = null, locale: Locale? = null): Int {
    return createCalendar(null, null, timeZone, locale).getYear()
}

fun Long.getMonth(timeZone: TimeZone? = null, locale: Locale? = null): Int {
    return createCalendar(null, null, timeZone, locale).getMonth()
}

fun Long.getWeekOfYear(firstDayOfWeek: Int? = null, minimalDaysInFirstWeek: Int? = null, timeZone: TimeZone? = null, locale: Locale? = null): Int {
    return createCalendar(firstDayOfWeek, minimalDaysInFirstWeek, timeZone, locale).getWeekOfYear()
}

fun Long.getWeekOfMonth(firstDayOfWeek: Int? = null, minimalDaysInFirstWeek: Int? = null, timeZone: TimeZone? = null, locale: Locale? = null): Int {
    return createCalendar(firstDayOfWeek, minimalDaysInFirstWeek, timeZone, locale).getWeekOfMonth()
}

fun Long.getDayOfYear(timeZone: TimeZone? = null, locale: Locale? = null): Int {
    return createCalendar(null, null, timeZone, locale).getDayOfYear()
}

fun Long.getDayOfMonth(timeZone: TimeZone? = null, locale: Locale? = null): Int {
    return createCalendar(null, null, timeZone, locale).getDayOfMonth()
}

fun Long.getDayOfWeekInMonth(firstDayOfWeek: Int? = null, minimalDaysInFirstWeek: Int? = null, timeZone: TimeZone? = null, locale: Locale? = null): Int {
    return createCalendar(firstDayOfWeek, minimalDaysInFirstWeek, timeZone, locale).getDayOfWeekInMonth()
}

fun Long.getDayOfWeek(firstDayOfWeek: Int? = null, minimalDaysInFirstWeek: Int? = null, timeZone: TimeZone? = null, locale: Locale? = null): Int {
    return createCalendar(firstDayOfWeek, minimalDaysInFirstWeek, timeZone, locale).getDayOfWeek()
}

fun Long.getHourDay(timeZone: TimeZone? = null, locale: Locale? = null): Int {
    return createCalendar(null, null, timeZone, locale).getHourDay()
}

fun Long.getHour(timeZone: TimeZone? = null, locale: Locale? = null): Int {
    return createCalendar(null, null, timeZone, locale).getHour()
}

fun Long.getMinute(timeZone: TimeZone? = null, locale: Locale? = null): Int {
    return createCalendar(null, null, timeZone, locale).getMinute()
}

fun Long.getSecond(timeZone: TimeZone? = null, locale: Locale? = null): Int {
    return createCalendar(null, null, timeZone, locale).getSecond()
}

fun Long.getMillisecond(timeZone: TimeZone? = null, locale: Locale? = null): Int {
    return createCalendar(null, null, timeZone, locale).getMillisecond()
}


/*
 * Date add
 */


fun Calendar.addToDate(field: Int, amount: Int): Date {
    this.add(field, amount)
    return Date(this.timeInMillis)
}

fun Date.add(field: Int, amount: Int, firstDayOfWeek: Int? = null, minimalDaysInFirstWeek: Int? = null, timeZone: TimeZone? = null, locale: Locale? = null): Date {
    return createCalendar(firstDayOfWeek, minimalDaysInFirstWeek, timeZone, locale).addToDate(field, amount)
}

fun Date.addYear(amount: Int, timeZone: TimeZone? = null, locale: Locale? = null): Date {
    return add(Calendar.YEAR, amount, null, null, timeZone, locale)
}

fun Date.addMonth(amount: Int, timeZone: TimeZone? = null, locale: Locale? = null): Date {
    return add(Calendar.MONTH, amount, null, null, timeZone, locale)
}

fun Date.addWeekOfYear(amount: Int, firstDayOfWeek: Int? = null, minimalDaysInFirstWeek: Int? = null, timeZone: TimeZone? = null, locale: Locale? = null): Date {
    return add(Calendar.WEEK_OF_YEAR, amount, firstDayOfWeek, minimalDaysInFirstWeek, timeZone, locale)
}

fun Date.addWeekOfMonth(amount: Int, firstDayOfWeek: Int? = null, minimalDaysInFirstWeek: Int? = null, timeZone: TimeZone? = null, locale: Locale? = null): Date {
    return add(Calendar.WEEK_OF_MONTH, amount, firstDayOfWeek, minimalDaysInFirstWeek, timeZone, locale)
}

fun Date.addDayOfYear(amount: Int, timeZone: TimeZone? = null, locale: Locale? = null): Date {
    return add(Calendar.DAY_OF_YEAR, amount, null, null, timeZone, locale)
}

fun Date.addDayOfMonth(amount: Int, timeZone: TimeZone? = null, locale: Locale? = null): Date {
    return add(Calendar.DAY_OF_MONTH, amount, null, null, timeZone, locale)
}

fun Date.addDayOfWeekInMonth(amount: Int, firstDayOfWeek: Int? = null, minimalDaysInFirstWeek: Int? = null, timeZone: TimeZone? = null, locale: Locale? = null): Date {
    return add(Calendar.DAY_OF_WEEK_IN_MONTH, amount, firstDayOfWeek, minimalDaysInFirstWeek, timeZone, locale)
}

fun Date.addDayOfWeek(amount: Int, firstDayOfWeek: Int? = null, minimalDaysInFirstWeek: Int? = null, timeZone: TimeZone? = null, locale: Locale? = null): Date {
    return add(Calendar.DAY_OF_WEEK, amount, firstDayOfWeek, minimalDaysInFirstWeek, timeZone, locale)
}

fun Date.addHourOfDay(amount: Int, timeZone: TimeZone? = null, locale: Locale? = null): Date {
    return add(Calendar.HOUR_OF_DAY, amount, null, null, timeZone, locale)
}

fun Date.addHour(amount: Int, timeZone: TimeZone? = null, locale: Locale? = null): Date {
    return add(Calendar.HOUR, amount, null, null, timeZone, locale)
}

fun Date.addMinute(amount: Int, timeZone: TimeZone? = null, locale: Locale? = null): Date {
    return add(Calendar.MINUTE, amount, null, null, timeZone, locale)
}

fun Date.addSecond(amount: Int, timeZone: TimeZone? = null, locale: Locale? = null): Date {
    return add(Calendar.SECOND, amount, null, null, timeZone, locale)
}

fun Date.addMillisecond(amount: Int, timeZone: TimeZone? = null, locale: Locale? = null): Date {
    return add(Calendar.MILLISECOND, amount, null, null, timeZone, locale)
}


/*
 * Long add
 */


fun Calendar.addToMillisecond(field: Int, amount: Int): Long {
    this.add(field, amount)
    return this.timeInMillis
}

fun Long.add(field: Int, amount: Int, firstDayOfWeek: Int? = null, minimalDaysInFirstWeek: Int? = null, timeZone: TimeZone? = null, locale: Locale? = null): Long {
    return createCalendar(firstDayOfWeek, minimalDaysInFirstWeek, timeZone, locale).addToMillisecond(field, amount)
}

fun Long.addYear(amount: Int, timeZone: TimeZone? = null, locale: Locale? = null): Long {
    return add(Calendar.YEAR, amount, null, null, timeZone, locale)
}

fun Long.addMonth(amount: Int, timeZone: TimeZone? = null, locale: Locale? = null): Long {
    return add(Calendar.MONTH, amount, null, null, timeZone, locale)
}

fun Long.addWeekOfYear(amount: Int, firstDayOfWeek: Int? = null, minimalDaysInFirstWeek: Int? = null, timeZone: TimeZone? = null, locale: Locale? = null): Long {
    return add(Calendar.WEEK_OF_YEAR, amount, firstDayOfWeek, minimalDaysInFirstWeek, timeZone, locale)
}

fun Long.addWeekOfMonth(amount: Int, firstDayOfWeek: Int? = null, minimalDaysInFirstWeek: Int? = null, timeZone: TimeZone? = null, locale: Locale? = null): Long {
    return add(Calendar.WEEK_OF_MONTH, amount, firstDayOfWeek, minimalDaysInFirstWeek, timeZone, locale)
}

fun Long.addDayOfYear(amount: Int, timeZone: TimeZone? = null, locale: Locale? = null): Long {
    return add(Calendar.DAY_OF_YEAR, amount, null, null, timeZone, locale)
}

fun Long.addDayOfMonth(amount: Int, timeZone: TimeZone? = null, locale: Locale? = null): Long {
    return add(Calendar.DAY_OF_MONTH, amount, null, null, timeZone, locale)
}

fun Long.addDayOfWeekInMonth(amount: Int, firstDayOfWeek: Int? = null, minimalDaysInFirstWeek: Int? = null, timeZone: TimeZone? = null, locale: Locale? = null): Long {
    return add(Calendar.DAY_OF_WEEK_IN_MONTH, amount, firstDayOfWeek, minimalDaysInFirstWeek, timeZone, locale)
}

fun Long.addDayOfWeek(amount: Int, firstDayOfWeek: Int? = null, minimalDaysInFirstWeek: Int? = null, timeZone: TimeZone? = null, locale: Locale? = null): Long {
    return add(Calendar.DAY_OF_WEEK, amount, firstDayOfWeek, minimalDaysInFirstWeek, timeZone, locale)
}

fun Long.addHourOfDay(amount: Int, timeZone: TimeZone? = null, locale: Locale? = null): Long {
    return add(Calendar.HOUR_OF_DAY, amount, null, null, timeZone, locale)
}

fun Long.addHour(amount: Int, timeZone: TimeZone? = null, locale: Locale? = null): Long {
    return add(Calendar.HOUR, amount, null, null, timeZone, locale)
}

fun Long.addMinute(amount: Int, timeZone: TimeZone? = null, locale: Locale? = null): Long {
    return add(Calendar.MINUTE, amount, null, null, timeZone, locale)
}

fun Long.addSecond(amount: Int, timeZone: TimeZone? = null, locale: Locale? = null): Long {
    return add(Calendar.SECOND, amount, null, null, timeZone, locale)
}

fun Long.addMillisecond(amount: Int, timeZone: TimeZone? = null, locale: Locale? = null): Long {
    return add(Calendar.MILLISECOND, amount, null, null, timeZone, locale)
}


/*
 * isSame
 */



fun Calendar.isSameYear(cal2: Calendar): Boolean {
    return this.get(Calendar.ERA) == cal2.get(Calendar.ERA) && this.get(Calendar.YEAR) == cal2.get(Calendar.YEAR)
}

fun Calendar.isSameMonth(cal2: Calendar): Boolean {
    return this.get(Calendar.ERA) == cal2.get(Calendar.ERA) && this.get(Calendar.YEAR) == cal2.get(Calendar.YEAR)
            && this.get(Calendar.MONTH) == cal2.get(Calendar.MONTH)
}

fun Calendar.isSameWeekOfYear(cal2: Calendar): Boolean {
    return this.get(Calendar.ERA) == cal2.get(Calendar.ERA) && this.get(Calendar.YEAR) == cal2.get(Calendar.YEAR)
            && this.get(Calendar.WEEK_OF_YEAR) == cal2.get(Calendar.WEEK_OF_YEAR)
}

fun Calendar.isSameWeekOfMonth(cal2: Calendar): Boolean {
    return this.get(Calendar.ERA) == cal2.get(Calendar.ERA) && this.get(Calendar.YEAR) == cal2.get(Calendar.YEAR)
            && this.get(Calendar.MONTH) == cal2.get(Calendar.MONTH) && this.get(Calendar.WEEK_OF_MONTH) == cal2.get(Calendar.WEEK_OF_MONTH)
}

fun Calendar.isSameDayOfYear(cal2: Calendar): Boolean {
    return this.get(Calendar.ERA) == cal2.get(Calendar.ERA) && this.get(Calendar.YEAR) == cal2.get(Calendar.YEAR)
            && this.get(Calendar.DAY_OF_YEAR) == cal2.get(Calendar.DAY_OF_YEAR)
}

fun Calendar.isSameDayOfMonth(cal2: Calendar): Boolean {
    return this.get(Calendar.ERA) == cal2.get(Calendar.ERA) && this.get(Calendar.YEAR) == cal2.get(Calendar.YEAR)
            && this.get(Calendar.MONTH) == cal2.get(Calendar.MONTH) && this.get(Calendar.DAY_OF_MONTH) == cal2.get(Calendar.DAY_OF_MONTH)
}

fun Calendar.isSameDayOfWeek(cal2: Calendar): Boolean {
    return this.get(Calendar.ERA) == cal2.get(Calendar.ERA) && this.get(Calendar.YEAR) == cal2.get(Calendar.YEAR)
            && this.get(Calendar.MONTH) == cal2.get(Calendar.MONTH) && this.get(Calendar.DAY_OF_WEEK) == cal2.get(Calendar.DAY_OF_WEEK)
}

fun Calendar.isSameDayOfWeekInMonth(cal2: Calendar): Boolean {
    return this.get(Calendar.ERA) == cal2.get(Calendar.ERA) && this.get(Calendar.YEAR) == cal2.get(Calendar.YEAR)
            && this.get(Calendar.MONTH) == cal2.get(Calendar.MONTH) && this.get(Calendar.DAY_OF_WEEK_IN_MONTH) == cal2.get(Calendar.DAY_OF_WEEK_IN_MONTH)
}

fun Calendar.isSameHourOfDay(cal2: Calendar): Boolean {
    return this.get(Calendar.ERA) == cal2.get(Calendar.ERA) && this.get(Calendar.YEAR) == cal2.get(Calendar.YEAR)
            && this.get(Calendar.MONTH) == cal2.get(Calendar.MONTH) && this.get(Calendar.DAY_OF_MONTH) == cal2.get(Calendar.DAY_OF_MONTH)
            && this.get(Calendar.HOUR_OF_DAY) == cal2.get(Calendar.HOUR_OF_DAY)
}

fun Calendar.isSameHour(cal2: Calendar): Boolean {
    return this.get(Calendar.ERA) == cal2.get(Calendar.ERA) && this.get(Calendar.YEAR) == cal2.get(Calendar.YEAR)
            && this.get(Calendar.MONTH) == cal2.get(Calendar.MONTH) && this.get(Calendar.DAY_OF_MONTH) == cal2.get(Calendar.DAY_OF_MONTH)
            && this.get(Calendar.HOUR) == cal2.get(Calendar.HOUR)
}

fun Calendar.isSameMinute(cal2: Calendar): Boolean {
    return this.get(Calendar.ERA) == cal2.get(Calendar.ERA) && this.get(Calendar.YEAR) == cal2.get(Calendar.YEAR)
            && this.get(Calendar.MONTH) == cal2.get(Calendar.MONTH) && this.get(Calendar.DAY_OF_MONTH) == cal2.get(Calendar.DAY_OF_MONTH)
            && this.get(Calendar.HOUR_OF_DAY) == cal2.get(Calendar.HOUR_OF_DAY) && this.get(Calendar.MINUTE) == cal2.get(Calendar.MINUTE)
}

fun Calendar.isSameSecond(cal2: Calendar): Boolean {
    return this.get(Calendar.ERA) == cal2.get(Calendar.ERA) && this.get(Calendar.YEAR) == cal2.get(Calendar.YEAR)
            && this.get(Calendar.MONTH) == cal2.get(Calendar.MONTH) && this.get(Calendar.DAY_OF_MONTH) == cal2.get(Calendar.DAY_OF_MONTH)
            && this.get(Calendar.HOUR_OF_DAY) == cal2.get(Calendar.HOUR_OF_DAY) && this.get(Calendar.MINUTE) == cal2.get(Calendar.MINUTE)
            && this.get(Calendar.SECOND) == cal2.get(Calendar.SECOND)
}

fun Calendar.isSameMillisecond(cal2: Calendar): Boolean {
    return this.get(Calendar.ERA) == cal2.get(Calendar.ERA) && this.get(Calendar.YEAR) == cal2.get(Calendar.YEAR)
            && this.get(Calendar.MONTH) == cal2.get(Calendar.MONTH) && this.get(Calendar.DAY_OF_MONTH) == cal2.get(Calendar.DAY_OF_MONTH)
            && this.get(Calendar.HOUR_OF_DAY) == cal2.get(Calendar.HOUR_OF_DAY) && this.get(Calendar.MINUTE) == cal2.get(Calendar.MINUTE)
            && this.get(Calendar.SECOND) == cal2.get(Calendar.SECOND) && this.get(Calendar.MILLISECOND) == cal2.get(Calendar.MILLISECOND)
}


fun Date.isSameYear(date2: Date, timeZone: TimeZone? = null, locale: Locale? = null): Boolean {
    return this.createCalendar(null, null, timeZone, locale).isSameYear(date2.createCalendar(null, null, timeZone, locale))
}

fun Date.isSameMonth(date2: Date, timeZone: TimeZone? = null, locale: Locale? = null): Boolean {
    return this.createCalendar(null, null, timeZone, locale).isSameMonth(date2.createCalendar(null, null, timeZone, locale))
}

fun Date.isSameWeekOfYear(date2: Date, firstDayOfWeek: Int? = null, minimalDaysInFirstWeek: Int? = null, timeZone: TimeZone? = null, locale: Locale? = null): Boolean {
    return this.createCalendar(firstDayOfWeek, minimalDaysInFirstWeek, timeZone, locale).isSameWeekOfYear(date2.createCalendar(firstDayOfWeek, minimalDaysInFirstWeek, timeZone, locale))
}

fun Date.isSameWeekOfMonth(date2: Date, firstDayOfWeek: Int? = null, minimalDaysInFirstWeek: Int? = null, timeZone: TimeZone? = null, locale: Locale? = null): Boolean {
    return this.createCalendar(firstDayOfWeek, minimalDaysInFirstWeek, timeZone, locale).isSameWeekOfMonth(date2.createCalendar(firstDayOfWeek, minimalDaysInFirstWeek, timeZone, locale))
}

fun Date.isSameDayOfYear(date2: Date, timeZone: TimeZone? = null, locale: Locale? = null): Boolean {
    return this.createCalendar(null, null, timeZone, locale).isSameDayOfYear(date2.createCalendar(null, null, timeZone, locale))
}

fun Date.isSameDayOfMonth(date2: Date, timeZone: TimeZone? = null, locale: Locale? = null): Boolean {
    return this.createCalendar(null, null, timeZone, locale).isSameDayOfMonth(date2.createCalendar(null, null, timeZone, locale))
}

fun Date.isSameDayOfWeek(date2: Date, firstDayOfWeek: Int? = null, minimalDaysInFirstWeek: Int? = null, timeZone: TimeZone? = null, locale: Locale? = null): Boolean {
    return this.createCalendar(firstDayOfWeek, minimalDaysInFirstWeek, timeZone, locale).isSameDayOfWeek(date2.createCalendar(firstDayOfWeek, minimalDaysInFirstWeek, timeZone, locale))
}

fun Date.isSameDayOfWeekInMonth(date2: Date, firstDayOfWeek: Int? = null, minimalDaysInFirstWeek: Int? = null, timeZone: TimeZone? = null, locale: Locale? = null): Boolean {
    return this.createCalendar(firstDayOfWeek, minimalDaysInFirstWeek, timeZone, locale).isSameDayOfWeekInMonth(date2.createCalendar(firstDayOfWeek, minimalDaysInFirstWeek, timeZone, locale))
}

fun Date.isSameHourOfDay(date2: Date, timeZone: TimeZone? = null, locale: Locale? = null): Boolean {
    return this.createCalendar(null, null, timeZone, locale).isSameHourOfDay(date2.createCalendar(null, null, timeZone, locale))
}

fun Date.isSameHour(date2: Date, timeZone: TimeZone? = null, locale: Locale? = null): Boolean {
    return this.createCalendar(null, null, timeZone, locale).isSameHour(date2.createCalendar(null, null, timeZone, locale))
}

fun Date.isSameMinute(date2: Date, timeZone: TimeZone? = null, locale: Locale? = null): Boolean {
    return this.createCalendar(null, null, timeZone, locale).isSameMinute(date2.createCalendar(null, null, timeZone, locale))
}

fun Date.isSameSecond(date2: Date, timeZone: TimeZone? = null, locale: Locale? = null): Boolean {
    return this.createCalendar(null, null, timeZone, locale).isSameSecond(date2.createCalendar(null, null, timeZone, locale))
}

fun Date.isSameMillisecond(date2: Date, timeZone: TimeZone? = null, locale: Locale? = null): Boolean {
    return this.createCalendar(null, null, timeZone, locale).isSameMillisecond(date2.createCalendar(null, null, timeZone, locale))
}


fun Long.isSameYear(date2: Long, timeZone: TimeZone? = null, locale: Locale? = null): Boolean {
    return this.createCalendar(null, null, timeZone, locale).isSameYear(date2.createCalendar(null, null, timeZone, locale))
}

fun Long.isSameMonth(date2: Long, timeZone: TimeZone? = null, locale: Locale? = null): Boolean {
    return this.createCalendar(null, null, timeZone, locale).isSameMonth(date2.createCalendar(null, null, timeZone, locale))
}

fun Long.isSameWeekOfYear(date2: Long, firstDayOfWeek: Int? = null, minimalDaysInFirstWeek: Int? = null, timeZone: TimeZone? = null, locale: Locale? = null): Boolean {
    return this.createCalendar(firstDayOfWeek, minimalDaysInFirstWeek, timeZone, locale).isSameWeekOfYear(date2.createCalendar(firstDayOfWeek, minimalDaysInFirstWeek, timeZone, locale))
}

fun Long.isSameWeekOfMonth(date2: Long, firstDayOfWeek: Int? = null, minimalDaysInFirstWeek: Int? = null, timeZone: TimeZone? = null, locale: Locale? = null): Boolean {
    return this.createCalendar(firstDayOfWeek, minimalDaysInFirstWeek, timeZone, locale).isSameWeekOfMonth(date2.createCalendar(firstDayOfWeek, minimalDaysInFirstWeek, timeZone, locale))
}

fun Long.isSameDayOfYear(date2: Long, timeZone: TimeZone? = null, locale: Locale? = null): Boolean {
    return this.createCalendar(null, null, timeZone, locale).isSameDayOfYear(date2.createCalendar(null, null, timeZone, locale))
}

fun Long.isSameDayOfMonth(date2: Long, timeZone: TimeZone? = null, locale: Locale? = null): Boolean {
    return this.createCalendar(null, null, timeZone, locale).isSameDayOfMonth(date2.createCalendar(null, null, timeZone, locale))
}

fun Long.isSameDayOfWeek(date2: Long, firstDayOfWeek: Int? = null, minimalDaysInFirstWeek: Int? = null, timeZone: TimeZone? = null, locale: Locale? = null): Boolean {
    return this.createCalendar(firstDayOfWeek, minimalDaysInFirstWeek, timeZone, locale).isSameDayOfWeek(date2.createCalendar(firstDayOfWeek, minimalDaysInFirstWeek, timeZone, locale))
}

fun Long.isSameDayOfWeekInMonth(date2: Long, firstDayOfWeek: Int? = null, minimalDaysInFirstWeek: Int? = null, timeZone: TimeZone? = null, locale: Locale? = null): Boolean {
    return this.createCalendar(firstDayOfWeek, minimalDaysInFirstWeek, timeZone, locale).isSameDayOfWeekInMonth(date2.createCalendar(firstDayOfWeek, minimalDaysInFirstWeek, timeZone, locale))
}

fun Long.isSameHourOfDay(date2: Long, timeZone: TimeZone? = null, locale: Locale? = null): Boolean {
    return this.createCalendar(null, null, timeZone, locale).isSameHourOfDay(date2.createCalendar(null, null, timeZone, locale))
}

fun Long.isSameHour(date2: Long, timeZone: TimeZone? = null, locale: Locale? = null): Boolean {
    return this.createCalendar(null, null, timeZone, locale).isSameHour(date2.createCalendar(null, null, timeZone, locale))
}

fun Long.isSameMinute(date2: Long, timeZone: TimeZone? = null, locale: Locale? = null): Boolean {
    return this.createCalendar(null, null, timeZone, locale).isSameMinute(date2.createCalendar(null, null, timeZone, locale))
}

fun Long.isSameSecond(date2: Long, timeZone: TimeZone? = null, locale: Locale? = null): Boolean {
    return this.createCalendar(null, null, timeZone, locale).isSameSecond(date2.createCalendar(null, null, timeZone, locale))
}

fun Long.isSameMillisecond(date2: Long, timeZone: TimeZone? = null, locale: Locale? = null): Boolean {
    return this.createCalendar(null, null, timeZone, locale).isSameMillisecond(date2.createCalendar(null, null, timeZone, locale))
}


/*
 * differ
 */


fun Calendar.differYear(target: Calendar, amount: Int): Boolean {
    if (amount == 0) return true
    this.add(Calendar.YEAR, amount)
    return if (amount > 0) target.timeInMillis <= target.timeInMillis else target.timeInMillis >= target.timeInMillis
}

fun Calendar.differMonth(target: Calendar, amount: Int): Boolean {
    if (amount == 0) return true
    this.add(Calendar.MONTH, amount)
    return if (amount > 0) target.timeInMillis <= target.timeInMillis else target.timeInMillis >= target.timeInMillis
}

fun Calendar.differWeekOfYear(target: Calendar, amount: Int): Boolean {
    if (amount == 0) return true
    this.add(Calendar.WEEK_OF_YEAR, amount)
    return if (amount > 0) target.timeInMillis <= target.timeInMillis else target.timeInMillis >= target.timeInMillis
}

fun Calendar.differWeekOfMonth(target: Calendar, amount: Int): Boolean {
    if (amount == 0) return true
    this.add(Calendar.WEEK_OF_MONTH, amount)
    return if (amount > 0) target.timeInMillis <= target.timeInMillis else target.timeInMillis >= target.timeInMillis
}

fun Calendar.differDayOfYear(target: Calendar, amount: Int): Boolean {
    if (amount == 0) return true
    this.add(Calendar.DAY_OF_YEAR, amount)
    return if (amount > 0) target.timeInMillis <= target.timeInMillis else target.timeInMillis >= target.timeInMillis
}

fun Calendar.differDayOfMonth(target: Calendar, amount: Int): Boolean {
    if (amount == 0) return true
    this.add(Calendar.DAY_OF_MONTH, amount)
    return if (amount > 0) target.timeInMillis <= target.timeInMillis else target.timeInMillis >= target.timeInMillis
}

fun Calendar.differDayOfWeek(target: Calendar, amount: Int): Boolean {
    if (amount == 0) return true
    this.add(Calendar.DAY_OF_WEEK, amount)
    return if (amount > 0) target.timeInMillis <= target.timeInMillis else target.timeInMillis >= target.timeInMillis
}

fun Calendar.differDayOfWeekInMonth(target: Calendar, amount: Int): Boolean {
    if (amount == 0) return true
    this.add(Calendar.DAY_OF_WEEK_IN_MONTH, amount)
    return if (amount > 0) target.timeInMillis <= target.timeInMillis else target.timeInMillis >= target.timeInMillis
}

fun Calendar.differHourOfDay(target: Calendar, amount: Int): Boolean {
    if (amount == 0) return true
    this.add(Calendar.HOUR_OF_DAY, amount)
    return if (amount > 0) target.timeInMillis <= target.timeInMillis else target.timeInMillis >= target.timeInMillis
}

fun Calendar.differHour(target: Calendar, amount: Int): Boolean {
    if (amount == 0) return true
    this.add(Calendar.HOUR, amount)
    return if (amount > 0) target.timeInMillis <= target.timeInMillis else target.timeInMillis >= target.timeInMillis
}

fun Calendar.differMinute(target: Calendar, amount: Int): Boolean {
    if (amount == 0) return true
    this.add(Calendar.MINUTE, amount)
    return if (amount > 0) target.timeInMillis <= target.timeInMillis else target.timeInMillis >= target.timeInMillis
}

fun Calendar.differSecond(target: Calendar, amount: Int): Boolean {
    if (amount == 0) return true
    this.add(Calendar.SECOND, amount)
    return if (amount > 0) target.timeInMillis <= target.timeInMillis else target.timeInMillis >= target.timeInMillis
}

fun Calendar.differMillisecond(target: Calendar, amount: Int): Boolean {
    if (amount == 0) return true
    this.add(Calendar.MILLISECOND, amount)
    return if (amount > 0) target.timeInMillis <= target.timeInMillis else target.timeInMillis >= target.timeInMillis
}


fun Date.differYear(target: Date, amount: Int, firstDayOfWeek: Int? = null, minimalDaysInFirstWeek: Int? = null, timeZone: TimeZone? = null, locale: Locale? = null): Boolean {
    return this.createCalendar(firstDayOfWeek, minimalDaysInFirstWeek, timeZone, locale).differYear(target.createCalendar(firstDayOfWeek, minimalDaysInFirstWeek, timeZone, locale), amount)
}

fun Date.differMonth(target: Date, amount: Int, firstDayOfWeek: Int? = null, minimalDaysInFirstWeek: Int? = null, timeZone: TimeZone? = null, locale: Locale? = null): Boolean {
    return this.createCalendar(firstDayOfWeek, minimalDaysInFirstWeek, timeZone, locale).differMonth(target.createCalendar(firstDayOfWeek, minimalDaysInFirstWeek, timeZone, locale), amount)
}

fun Date.differWeekOfYear(target: Date, amount: Int, firstDayOfWeek: Int? = null, minimalDaysInFirstWeek: Int? = null, timeZone: TimeZone? = null, locale: Locale? = null): Boolean {
    return this.createCalendar(firstDayOfWeek, minimalDaysInFirstWeek, timeZone, locale).differWeekOfYear(target.createCalendar(firstDayOfWeek, minimalDaysInFirstWeek, timeZone, locale), amount)
}

fun Date.differWeekOfMonth(target: Date, amount: Int, firstDayOfWeek: Int? = null, minimalDaysInFirstWeek: Int? = null, timeZone: TimeZone? = null, locale: Locale? = null): Boolean {
    return this.createCalendar(firstDayOfWeek, minimalDaysInFirstWeek, timeZone, locale).differWeekOfMonth(target.createCalendar(firstDayOfWeek, minimalDaysInFirstWeek, timeZone, locale), amount)
}

fun Date.differDayOfYear(target: Date, amount: Int, firstDayOfWeek: Int? = null, minimalDaysInFirstWeek: Int? = null, timeZone: TimeZone? = null, locale: Locale? = null): Boolean {
    return this.createCalendar(firstDayOfWeek, minimalDaysInFirstWeek, timeZone, locale).differDayOfYear(target.createCalendar(firstDayOfWeek, minimalDaysInFirstWeek, timeZone, locale), amount)
}

fun Date.differDayOfMonth(target: Date, amount: Int, firstDayOfWeek: Int? = null, minimalDaysInFirstWeek: Int? = null, timeZone: TimeZone? = null, locale: Locale? = null): Boolean {
    return this.createCalendar(firstDayOfWeek, minimalDaysInFirstWeek, timeZone, locale).differDayOfMonth(target.createCalendar(firstDayOfWeek, minimalDaysInFirstWeek, timeZone, locale), amount)
}

fun Date.differDayOfWeek(target: Date, amount: Int, firstDayOfWeek: Int? = null, minimalDaysInFirstWeek: Int? = null, timeZone: TimeZone? = null, locale: Locale? = null): Boolean {
    return this.createCalendar(firstDayOfWeek, minimalDaysInFirstWeek, timeZone, locale).differDayOfWeek(target.createCalendar(firstDayOfWeek, minimalDaysInFirstWeek, timeZone, locale), amount)
}

fun Date.differDayOfWeekInMonth(target: Date, amount: Int, firstDayOfWeek: Int? = null, minimalDaysInFirstWeek: Int? = null, timeZone: TimeZone? = null, locale: Locale? = null): Boolean {
    return this.createCalendar(firstDayOfWeek, minimalDaysInFirstWeek, timeZone, locale).differDayOfWeekInMonth(target.createCalendar(firstDayOfWeek, minimalDaysInFirstWeek, timeZone, locale), amount)
}

fun Date.differHourOfDay(target: Date, amount: Int, firstDayOfWeek: Int? = null, minimalDaysInFirstWeek: Int? = null, timeZone: TimeZone? = null, locale: Locale? = null): Boolean {
    return this.createCalendar(firstDayOfWeek, minimalDaysInFirstWeek, timeZone, locale).differHourOfDay(target.createCalendar(firstDayOfWeek, minimalDaysInFirstWeek, timeZone, locale), amount)
}

fun Date.differHour(target: Date, amount: Int, firstDayOfWeek: Int? = null, minimalDaysInFirstWeek: Int? = null, timeZone: TimeZone? = null, locale: Locale? = null): Boolean {
    return this.createCalendar(firstDayOfWeek, minimalDaysInFirstWeek, timeZone, locale).differHour(target.createCalendar(firstDayOfWeek, minimalDaysInFirstWeek, timeZone, locale), amount)
}

fun Date.differMinute(target: Date, amount: Int, firstDayOfWeek: Int? = null, minimalDaysInFirstWeek: Int? = null, timeZone: TimeZone? = null, locale: Locale? = null): Boolean {
    return this.createCalendar(firstDayOfWeek, minimalDaysInFirstWeek, timeZone, locale).differMinute(target.createCalendar(firstDayOfWeek, minimalDaysInFirstWeek, timeZone, locale), amount)
}

fun Date.differSecond(target: Date, amount: Int, firstDayOfWeek: Int? = null, minimalDaysInFirstWeek: Int? = null, timeZone: TimeZone? = null, locale: Locale? = null): Boolean {
    return this.createCalendar(firstDayOfWeek, minimalDaysInFirstWeek, timeZone, locale).differSecond(target.createCalendar(firstDayOfWeek, minimalDaysInFirstWeek, timeZone, locale), amount)
}

fun Date.differMillisecond(target: Date, amount: Int, firstDayOfWeek: Int? = null, minimalDaysInFirstWeek: Int? = null, timeZone: TimeZone? = null, locale: Locale? = null): Boolean {
    return this.createCalendar(firstDayOfWeek, minimalDaysInFirstWeek, timeZone, locale).differMillisecond(target.createCalendar(firstDayOfWeek, minimalDaysInFirstWeek, timeZone, locale), amount)
}


fun Long.differYear(target: Long, amount: Int, firstDayOfWeek: Int? = null, minimalDaysInFirstWeek: Int? = null, timeZone: TimeZone? = null, locale: Locale? = null): Boolean {
    return this.createCalendar(firstDayOfWeek, minimalDaysInFirstWeek, timeZone, locale).differYear(target.createCalendar(firstDayOfWeek, minimalDaysInFirstWeek, timeZone, locale), amount)
}

fun Long.differMonth(target: Long, amount: Int, firstDayOfWeek: Int? = null, minimalDaysInFirstWeek: Int? = null, timeZone: TimeZone? = null, locale: Locale? = null): Boolean {
    return this.createCalendar(firstDayOfWeek, minimalDaysInFirstWeek, timeZone, locale).differMonth(target.createCalendar(firstDayOfWeek, minimalDaysInFirstWeek, timeZone, locale), amount)
}

fun Long.differWeekOfYear(target: Long, amount: Int, firstDayOfWeek: Int? = null, minimalDaysInFirstWeek: Int? = null, timeZone: TimeZone? = null, locale: Locale? = null): Boolean {
    return this.createCalendar(firstDayOfWeek, minimalDaysInFirstWeek, timeZone, locale).differWeekOfYear(target.createCalendar(firstDayOfWeek, minimalDaysInFirstWeek, timeZone, locale), amount)
}

fun Long.differWeekOfMonth(target: Long, amount: Int, firstDayOfWeek: Int? = null, minimalDaysInFirstWeek: Int? = null, timeZone: TimeZone? = null, locale: Locale? = null): Boolean {
    return this.createCalendar(firstDayOfWeek, minimalDaysInFirstWeek, timeZone, locale).differWeekOfMonth(target.createCalendar(firstDayOfWeek, minimalDaysInFirstWeek, timeZone, locale), amount)
}

fun Long.differDayOfYear(target: Long, amount: Int, firstDayOfWeek: Int? = null, minimalDaysInFirstWeek: Int? = null, timeZone: TimeZone? = null, locale: Locale? = null): Boolean {
    return this.createCalendar(firstDayOfWeek, minimalDaysInFirstWeek, timeZone, locale).differDayOfYear(target.createCalendar(firstDayOfWeek, minimalDaysInFirstWeek, timeZone, locale), amount)
}

fun Long.differDayOfMonth(target: Long, amount: Int, firstDayOfWeek: Int? = null, minimalDaysInFirstWeek: Int? = null, timeZone: TimeZone? = null, locale: Locale? = null): Boolean {
    return this.createCalendar(firstDayOfWeek, minimalDaysInFirstWeek, timeZone, locale).differDayOfMonth(target.createCalendar(firstDayOfWeek, minimalDaysInFirstWeek, timeZone, locale), amount)
}

fun Long.differDayOfWeek(target: Long, amount: Int, firstDayOfWeek: Int? = null, minimalDaysInFirstWeek: Int? = null, timeZone: TimeZone? = null, locale: Locale? = null): Boolean {
    return this.createCalendar(firstDayOfWeek, minimalDaysInFirstWeek, timeZone, locale).differDayOfWeek(target.createCalendar(firstDayOfWeek, minimalDaysInFirstWeek, timeZone, locale), amount)
}

fun Long.differDayOfWeekInMonth(target: Long, amount: Int, firstDayOfWeek: Int? = null, minimalDaysInFirstWeek: Int? = null, timeZone: TimeZone? = null, locale: Locale? = null): Boolean {
    return this.createCalendar(firstDayOfWeek, minimalDaysInFirstWeek, timeZone, locale).differDayOfWeekInMonth(target.createCalendar(firstDayOfWeek, minimalDaysInFirstWeek, timeZone, locale), amount)
}

fun Long.differHourOfDay(target: Long, amount: Int, firstDayOfWeek: Int? = null, minimalDaysInFirstWeek: Int? = null, timeZone: TimeZone? = null, locale: Locale? = null): Boolean {
    return this.createCalendar(firstDayOfWeek, minimalDaysInFirstWeek, timeZone, locale).differHourOfDay(target.createCalendar(firstDayOfWeek, minimalDaysInFirstWeek, timeZone, locale), amount)
}

fun Long.differHour(target: Long, amount: Int, firstDayOfWeek: Int? = null, minimalDaysInFirstWeek: Int? = null, timeZone: TimeZone? = null, locale: Locale? = null): Boolean {
    return this.createCalendar(firstDayOfWeek, minimalDaysInFirstWeek, timeZone, locale).differHour(target.createCalendar(firstDayOfWeek, minimalDaysInFirstWeek, timeZone, locale), amount)
}

fun Long.differMinute(target: Long, amount: Int, firstDayOfWeek: Int? = null, minimalDaysInFirstWeek: Int? = null, timeZone: TimeZone? = null, locale: Locale? = null): Boolean {
    return this.createCalendar(firstDayOfWeek, minimalDaysInFirstWeek, timeZone, locale).differMinute(target.createCalendar(firstDayOfWeek, minimalDaysInFirstWeek, timeZone, locale), amount)
}

fun Long.differSecond(target: Long, amount: Int, firstDayOfWeek: Int? = null, minimalDaysInFirstWeek: Int? = null, timeZone: TimeZone? = null, locale: Locale? = null): Boolean {
    return this.createCalendar(firstDayOfWeek, minimalDaysInFirstWeek, timeZone, locale).differSecond(target.createCalendar(firstDayOfWeek, minimalDaysInFirstWeek, timeZone, locale), amount)
}

fun Long.differMillisecond(target: Long, amount: Int, firstDayOfWeek: Int? = null, minimalDaysInFirstWeek: Int? = null, timeZone: TimeZone? = null, locale: Locale? = null): Boolean {
    return this.createCalendar(firstDayOfWeek, minimalDaysInFirstWeek, timeZone, locale).differMillisecond(target.createCalendar(firstDayOfWeek, minimalDaysInFirstWeek, timeZone, locale), amount)
}


/*
 * year、month、day, hour、minute、second、millisecond 比大小
 */


/*
 * Iterator
 */


infix fun Date.yearRangeTo(other: Date): YearRange = YearRange(this, other, 1)

infix fun Date.yearDownTo(other: Date): YearRange = YearRange(this, other, -1)

infix fun Date.yearUntilTo(other: Date): YearRange = YearRange(this, other.addYear(-1), 1)

infix fun Date.yearDownUntilTo(other: Date): YearRange = YearRange(this, other.addYear(1), -1)


infix fun Date.monthRangeTo(other: Date): MonthRange = MonthRange(this, other, 1)

infix fun Date.monthDownTo(other: Date): MonthRange = MonthRange(this, other, -1)

infix fun Date.monthUntilTo(other: Date): MonthRange = MonthRange(this, other.addMonth(-1), 1)

infix fun Date.monthDownUntilTo(other: Date): MonthRange = MonthRange(this, other.addMonth(1), -1)


infix fun Date.dayRangeTo(other: Date): DayRange = DayRange(this, other, 1)

infix fun Date.dayDownTo(other: Date): DayRange = DayRange(this, other, -1)

infix fun Date.dayUntilTo(other: Date): DayRange = DayRange(this, other.addDayOfMonth(-1), 1)

infix fun Date.dayDownUntilTo(other: Date): DayRange = DayRange(this, other.addDayOfMonth(1), -1)

// 还要有 YearRange, MonthRange, HourRange, MinuteRange, SecondRange, MillisecondRange

class YearRange(override val start: Date, override val endInclusive: Date, private val step: Int) : Iterable<Date>, ClosedRange<Date> {

    override fun iterator(): Iterator<Date> = YearIterator(start, endInclusive, step)

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
}

class YearIterator(first: Date, private val last: Date, private val step: Int) : Iterator<Date> {
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
        next = next.addYear(step)
        hasNext = when {
            step > 0 -> next <= last
            step < 0 -> next >= last
            else -> false
        }
        return result
    }
}

class MonthRange(override val start: Date, override val endInclusive: Date, private val step: Int) : Iterable<Date>, ClosedRange<Date> {

    override fun iterator(): Iterator<Date> = MonthIterator(start, endInclusive, step)

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
}

class MonthIterator(first: Date, private val last: Date, private val step: Int) : Iterator<Date> {
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
        next = next.addMonth(step)
        hasNext = when {
            step > 0 -> next <= last
            step < 0 -> next >= last
            else -> false
        }
        return result
    }
}

class DayRange(override val start: Date, override val endInclusive: Date, private val step: Int) : Iterable<Date>, ClosedRange<Date> {

    override fun iterator(): Iterator<Date> = DayIterator(start, endInclusive, step)

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
}

class DayIterator(first: Date, private val last: Date, private val step: Int) : Iterator<Date> {
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
        next = next.addDayOfMonth(step)
        hasNext = when {
            step > 0 -> next <= last
            step < 0 -> next >= last
            else -> false
        }
        return result
    }
}