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

fun Long.toDate(): Date = Date(this)


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

fun String.toDateYMDH(locale: Locale? = null): Date {
    return this.toDate("yyyy-MM-dd HH", locale)
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

fun String.toMillisecondYMDH(locale: Locale? = null): Long {
    return this.toMillisecond("yyyy-MM-dd HH", locale)
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

fun Date.formatYMDH(locale: Locale? = null): String {
    return format("yyyy-MM-dd HH", locale)
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

fun Long.formatYMDH(locale: Locale? = null): String {
    return format("yyyy-MM-dd HH", locale)
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


fun Calendar.isSameYear(target: Calendar): Boolean {
    return this.get(Calendar.ERA) == target.get(Calendar.ERA) && this.get(Calendar.YEAR) == target.get(Calendar.YEAR)
}

fun Calendar.isSameMonth(target: Calendar): Boolean {
    return this.get(Calendar.ERA) == target.get(Calendar.ERA) && this.get(Calendar.YEAR) == target.get(Calendar.YEAR)
            && this.get(Calendar.MONTH) == target.get(Calendar.MONTH)
}

fun Calendar.isSameMonthOfYear(target: Calendar): Boolean {
    return this.get(Calendar.ERA) == target.get(Calendar.ERA) && this.get(Calendar.MONTH) == target.get(Calendar.MONTH)
}

// TODO 跨年或者跨月的时候可能会有问题
fun Calendar.isSameWeek(target: Calendar): Boolean {
    return this.get(Calendar.ERA) == target.get(Calendar.ERA) && this.get(Calendar.YEAR) == target.get(Calendar.YEAR)
            && this.get(Calendar.MONTH) == target.get(Calendar.MONTH) && this.get(Calendar.WEEK_OF_MONTH) == target.get(Calendar.WEEK_OF_MONTH)
}

fun Calendar.isSameWeekOfYear(target: Calendar): Boolean {
    return this.get(Calendar.ERA) == target.get(Calendar.ERA) && this.get(Calendar.WEEK_OF_YEAR) == target.get(Calendar.WEEK_OF_YEAR)
}

fun Calendar.isSameWeekOfMonth(target: Calendar): Boolean {
    return this.get(Calendar.ERA) == target.get(Calendar.ERA) && this.get(Calendar.WEEK_OF_MONTH) == target.get(Calendar.WEEK_OF_MONTH)
}

fun Calendar.isSameDay(target: Calendar): Boolean {
    return this.get(Calendar.ERA) == target.get(Calendar.ERA) && this.get(Calendar.YEAR) == target.get(Calendar.YEAR)
            && this.get(Calendar.MONTH) == target.get(Calendar.MONTH) && this.get(Calendar.DAY_OF_MONTH) == target.get(Calendar.DAY_OF_MONTH)
}

fun Calendar.isSameDayOfYear(target: Calendar): Boolean {
    return this.get(Calendar.ERA) == target.get(Calendar.ERA) && this.get(Calendar.DAY_OF_YEAR) == target.get(Calendar.DAY_OF_YEAR)
}

fun Calendar.isSameDayOfMonth(target: Calendar): Boolean {
    return this.get(Calendar.ERA) == target.get(Calendar.ERA) && this.get(Calendar.DAY_OF_MONTH) == target.get(Calendar.DAY_OF_MONTH)
}

fun Calendar.isSameDayOfWeek(target: Calendar): Boolean {
    return this.get(Calendar.ERA) == target.get(Calendar.ERA) && this.get(Calendar.DAY_OF_WEEK) == target.get(Calendar.DAY_OF_WEEK)
}

fun Calendar.isSameDayOfWeekInMonth(target: Calendar): Boolean {
    return this.get(Calendar.ERA) == target.get(Calendar.ERA) && this.get(Calendar.DAY_OF_WEEK_IN_MONTH) == target.get(Calendar.DAY_OF_WEEK_IN_MONTH)
}

fun Calendar.isSameHour(target: Calendar): Boolean {
    return this.get(Calendar.ERA) == target.get(Calendar.ERA) && this.get(Calendar.YEAR) == target.get(Calendar.YEAR)
            && this.get(Calendar.MONTH) == target.get(Calendar.MONTH) && this.get(Calendar.DAY_OF_MONTH) == target.get(Calendar.DAY_OF_MONTH)
            && this.get(Calendar.HOUR_OF_DAY) == target.get(Calendar.HOUR_OF_DAY)
}

fun Calendar.isSameHourOf24H(target: Calendar): Boolean {
    return this.get(Calendar.ERA) == target.get(Calendar.ERA) && this.get(Calendar.HOUR_OF_DAY) == target.get(Calendar.HOUR_OF_DAY)
}

fun Calendar.isSameHourOf12H(target: Calendar): Boolean {
    return this.get(Calendar.ERA) == target.get(Calendar.ERA) && this.get(Calendar.HOUR) == target.get(Calendar.HOUR)
}

fun Calendar.isSameMinute(target: Calendar): Boolean {
    return this.get(Calendar.ERA) == target.get(Calendar.ERA) && this.get(Calendar.YEAR) == target.get(Calendar.YEAR)
            && this.get(Calendar.MONTH) == target.get(Calendar.MONTH) && this.get(Calendar.DAY_OF_MONTH) == target.get(Calendar.DAY_OF_MONTH)
            && this.get(Calendar.HOUR_OF_DAY) == target.get(Calendar.HOUR_OF_DAY) && this.get(Calendar.MINUTE) == target.get(Calendar.MINUTE)
}

fun Calendar.isSameMinuteOfHour(target: Calendar): Boolean {
    return this.get(Calendar.ERA) == target.get(Calendar.ERA) && this.get(Calendar.MINUTE) == target.get(Calendar.MINUTE)
}

fun Calendar.isSameSecond(target: Calendar): Boolean {
    return this.get(Calendar.ERA) == target.get(Calendar.ERA) && this.get(Calendar.YEAR) == target.get(Calendar.YEAR)
            && this.get(Calendar.MONTH) == target.get(Calendar.MONTH) && this.get(Calendar.DAY_OF_MONTH) == target.get(Calendar.DAY_OF_MONTH)
            && this.get(Calendar.HOUR_OF_DAY) == target.get(Calendar.HOUR_OF_DAY) && this.get(Calendar.MINUTE) == target.get(Calendar.MINUTE)
            && this.get(Calendar.SECOND) == target.get(Calendar.SECOND)
}

fun Calendar.isSameSecondOfMinute(target: Calendar): Boolean {
    return this.get(Calendar.ERA) == target.get(Calendar.ERA) && this.get(Calendar.SECOND) == target.get(Calendar.SECOND)
}

fun Calendar.isSameMillisecond(target: Calendar): Boolean {
    return this.get(Calendar.ERA) == target.get(Calendar.ERA) && this.get(Calendar.YEAR) == target.get(Calendar.YEAR)
            && this.get(Calendar.MONTH) == target.get(Calendar.MONTH) && this.get(Calendar.DAY_OF_MONTH) == target.get(Calendar.DAY_OF_MONTH)
            && this.get(Calendar.HOUR_OF_DAY) == target.get(Calendar.HOUR_OF_DAY) && this.get(Calendar.MINUTE) == target.get(Calendar.MINUTE)
            && this.get(Calendar.SECOND) == target.get(Calendar.SECOND) && this.get(Calendar.MILLISECOND) == target.get(Calendar.MILLISECOND)
}

fun Calendar.isSameMillisecondOfSecond(target: Calendar): Boolean {
    return this.get(Calendar.ERA) == target.get(Calendar.ERA) && this.get(Calendar.MILLISECOND) == target.get(Calendar.MILLISECOND)
}


fun Date.isSameYear(target: Date, timeZone: TimeZone? = null, locale: Locale? = null): Boolean {
    return this.createCalendar(null, null, timeZone, locale).isSameYear(target.createCalendar(null, null, timeZone, locale))
}

fun Date.isSameMonth(target: Date, timeZone: TimeZone? = null, locale: Locale? = null): Boolean {
    return this.createCalendar(null, null, timeZone, locale).isSameMonth(target.createCalendar(null, null, timeZone, locale))
}

fun Date.isSameMonthOfYear(target: Date, timeZone: TimeZone? = null, locale: Locale? = null): Boolean {
    return this.createCalendar(null, null, timeZone, locale).isSameMonthOfYear(target.createCalendar(null, null, timeZone, locale))
}

fun Date.isSameWeek(target: Date, firstDayOfWeek: Int? = null, minimalDaysInFirstWeek: Int? = null, timeZone: TimeZone? = null, locale: Locale? = null): Boolean {
    return this.createCalendar(firstDayOfWeek, minimalDaysInFirstWeek, timeZone, locale).isSameWeek(target.createCalendar(firstDayOfWeek, minimalDaysInFirstWeek, timeZone, locale))
}

fun Date.isSameWeekOfYear(target: Date, firstDayOfWeek: Int? = null, minimalDaysInFirstWeek: Int? = null, timeZone: TimeZone? = null, locale: Locale? = null): Boolean {
    return this.createCalendar(firstDayOfWeek, minimalDaysInFirstWeek, timeZone, locale).isSameWeekOfYear(target.createCalendar(firstDayOfWeek, minimalDaysInFirstWeek, timeZone, locale))
}

fun Date.isSameWeekOfMonth(target: Date, firstDayOfWeek: Int? = null, minimalDaysInFirstWeek: Int? = null, timeZone: TimeZone? = null, locale: Locale? = null): Boolean {
    return this.createCalendar(firstDayOfWeek, minimalDaysInFirstWeek, timeZone, locale).isSameWeekOfMonth(target.createCalendar(firstDayOfWeek, minimalDaysInFirstWeek, timeZone, locale))
}

fun Date.isSameDay(target: Date, timeZone: TimeZone? = null, locale: Locale? = null): Boolean {
    return this.createCalendar(null, null, timeZone, locale).isSameDay(target.createCalendar(null, null, timeZone, locale))
}

fun Date.isSameDayOfYear(target: Date, timeZone: TimeZone? = null, locale: Locale? = null): Boolean {
    return this.createCalendar(null, null, timeZone, locale).isSameDayOfYear(target.createCalendar(null, null, timeZone, locale))
}

fun Date.isSameDayOfMonth(target: Date, timeZone: TimeZone? = null, locale: Locale? = null): Boolean {
    return this.createCalendar(null, null, timeZone, locale).isSameDayOfMonth(target.createCalendar(null, null, timeZone, locale))
}

fun Date.isSameDayOfWeek(target: Date, firstDayOfWeek: Int? = null, minimalDaysInFirstWeek: Int? = null, timeZone: TimeZone? = null, locale: Locale? = null): Boolean {
    return this.createCalendar(firstDayOfWeek, minimalDaysInFirstWeek, timeZone, locale).isSameDayOfWeek(target.createCalendar(firstDayOfWeek, minimalDaysInFirstWeek, timeZone, locale))
}

fun Date.isSameDayOfWeekInMonth(target: Date, firstDayOfWeek: Int? = null, minimalDaysInFirstWeek: Int? = null, timeZone: TimeZone? = null, locale: Locale? = null): Boolean {
    return this.createCalendar(firstDayOfWeek, minimalDaysInFirstWeek, timeZone, locale).isSameDayOfWeekInMonth(target.createCalendar(firstDayOfWeek, minimalDaysInFirstWeek, timeZone, locale))
}

fun Date.isSameHour(target: Date, timeZone: TimeZone? = null, locale: Locale? = null): Boolean {
    return this.createCalendar(null, null, timeZone, locale).isSameHour(target.createCalendar(null, null, timeZone, locale))
}

fun Date.isSameHourOf24H(target: Date, timeZone: TimeZone? = null, locale: Locale? = null): Boolean {
    return this.createCalendar(null, null, timeZone, locale).isSameHourOf24H(target.createCalendar(null, null, timeZone, locale))
}

fun Date.isSameHourOf12H(target: Date, timeZone: TimeZone? = null, locale: Locale? = null): Boolean {
    return this.createCalendar(null, null, timeZone, locale).isSameHourOf12H(target.createCalendar(null, null, timeZone, locale))
}

fun Date.isSameMinute(target: Date, timeZone: TimeZone? = null, locale: Locale? = null): Boolean {
    return this.createCalendar(null, null, timeZone, locale).isSameMinute(target.createCalendar(null, null, timeZone, locale))
}

fun Date.isSameMinuteOfHour(target: Date, timeZone: TimeZone? = null, locale: Locale? = null): Boolean {
    return this.createCalendar(null, null, timeZone, locale).isSameMinuteOfHour(target.createCalendar(null, null, timeZone, locale))
}

fun Date.isSameSecond(target: Date, timeZone: TimeZone? = null, locale: Locale? = null): Boolean {
    return this.createCalendar(null, null, timeZone, locale).isSameSecond(target.createCalendar(null, null, timeZone, locale))
}

fun Date.isSameSecondOfMinute(target: Date, timeZone: TimeZone? = null, locale: Locale? = null): Boolean {
    return this.createCalendar(null, null, timeZone, locale).isSameSecondOfMinute(target.createCalendar(null, null, timeZone, locale))
}

fun Date.isSameMillisecond(target: Date, timeZone: TimeZone? = null, locale: Locale? = null): Boolean {
    return this.createCalendar(null, null, timeZone, locale).isSameMillisecond(target.createCalendar(null, null, timeZone, locale))
}

fun Date.isSameMillisecondOfSecond(target: Date, timeZone: TimeZone? = null, locale: Locale? = null): Boolean {
    return this.createCalendar(null, null, timeZone, locale).isSameMillisecondOfSecond(target.createCalendar(null, null, timeZone, locale))
}


fun Long.isSameYear(target: Long, timeZone: TimeZone? = null, locale: Locale? = null): Boolean {
    return this.createCalendar(null, null, timeZone, locale).isSameYear(target.createCalendar(null, null, timeZone, locale))
}

fun Long.isSameMonth(target: Long, timeZone: TimeZone? = null, locale: Locale? = null): Boolean {
    return this.createCalendar(null, null, timeZone, locale).isSameMonth(target.createCalendar(null, null, timeZone, locale))
}

fun Long.isSameMonthOfYear(target: Long, timeZone: TimeZone? = null, locale: Locale? = null): Boolean {
    return this.createCalendar(null, null, timeZone, locale).isSameMonthOfYear(target.createCalendar(null, null, timeZone, locale))
}

fun Long.isSameWeek(target: Long, firstDayOfWeek: Int? = null, minimalDaysInFirstWeek: Int? = null, timeZone: TimeZone? = null, locale: Locale? = null): Boolean {
    return this.createCalendar(firstDayOfWeek, minimalDaysInFirstWeek, timeZone, locale).isSameWeek(target.createCalendar(firstDayOfWeek, minimalDaysInFirstWeek, timeZone, locale))
}

fun Long.isSameWeekOfYear(target: Long, firstDayOfWeek: Int? = null, minimalDaysInFirstWeek: Int? = null, timeZone: TimeZone? = null, locale: Locale? = null): Boolean {
    return this.createCalendar(firstDayOfWeek, minimalDaysInFirstWeek, timeZone, locale).isSameWeekOfYear(target.createCalendar(firstDayOfWeek, minimalDaysInFirstWeek, timeZone, locale))
}

fun Long.isSameWeekOfMonth(target: Long, firstDayOfWeek: Int? = null, minimalDaysInFirstWeek: Int? = null, timeZone: TimeZone? = null, locale: Locale? = null): Boolean {
    return this.createCalendar(firstDayOfWeek, minimalDaysInFirstWeek, timeZone, locale).isSameWeekOfMonth(target.createCalendar(firstDayOfWeek, minimalDaysInFirstWeek, timeZone, locale))
}

fun Long.isSameDay(target: Long, timeZone: TimeZone? = null, locale: Locale? = null): Boolean {
    return this.createCalendar(null, null, timeZone, locale).isSameDay(target.createCalendar(null, null, timeZone, locale))
}

fun Long.isSameDayOfYear(target: Long, timeZone: TimeZone? = null, locale: Locale? = null): Boolean {
    return this.createCalendar(null, null, timeZone, locale).isSameDayOfYear(target.createCalendar(null, null, timeZone, locale))
}

fun Long.isSameDayOfMonth(target: Long, timeZone: TimeZone? = null, locale: Locale? = null): Boolean {
    return this.createCalendar(null, null, timeZone, locale).isSameDayOfMonth(target.createCalendar(null, null, timeZone, locale))
}

fun Long.isSameDayOfWeek(target: Long, firstDayOfWeek: Int? = null, minimalDaysInFirstWeek: Int? = null, timeZone: TimeZone? = null, locale: Locale? = null): Boolean {
    return this.createCalendar(firstDayOfWeek, minimalDaysInFirstWeek, timeZone, locale).isSameDayOfWeek(target.createCalendar(firstDayOfWeek, minimalDaysInFirstWeek, timeZone, locale))
}

fun Long.isSameDayOfWeekInMonth(target: Long, firstDayOfWeek: Int? = null, minimalDaysInFirstWeek: Int? = null, timeZone: TimeZone? = null, locale: Locale? = null): Boolean {
    return this.createCalendar(firstDayOfWeek, minimalDaysInFirstWeek, timeZone, locale).isSameDayOfWeekInMonth(target.createCalendar(firstDayOfWeek, minimalDaysInFirstWeek, timeZone, locale))
}

fun Long.isSameHour(target: Long, timeZone: TimeZone? = null, locale: Locale? = null): Boolean {
    return this.createCalendar(null, null, timeZone, locale).isSameHour(target.createCalendar(null, null, timeZone, locale))
}

fun Long.isSameHourOf24H(target: Long, timeZone: TimeZone? = null, locale: Locale? = null): Boolean {
    return this.createCalendar(null, null, timeZone, locale).isSameHourOf24H(target.createCalendar(null, null, timeZone, locale))
}

fun Long.isSameHourOf12H(target: Long, timeZone: TimeZone? = null, locale: Locale? = null): Boolean {
    return this.createCalendar(null, null, timeZone, locale).isSameHourOf12H(target.createCalendar(null, null, timeZone, locale))
}

fun Long.isSameMinute(target: Long, timeZone: TimeZone? = null, locale: Locale? = null): Boolean {
    return this.createCalendar(null, null, timeZone, locale).isSameMinute(target.createCalendar(null, null, timeZone, locale))
}

fun Long.isSameMinuteOfHour(target: Long, timeZone: TimeZone? = null, locale: Locale? = null): Boolean {
    return this.createCalendar(null, null, timeZone, locale).isSameMinuteOfHour(target.createCalendar(null, null, timeZone, locale))
}

fun Long.isSameSecond(target: Long, timeZone: TimeZone? = null, locale: Locale? = null): Boolean {
    return this.createCalendar(null, null, timeZone, locale).isSameSecond(target.createCalendar(null, null, timeZone, locale))
}

fun Long.isSameSecondOfMinute(target: Long, timeZone: TimeZone? = null, locale: Locale? = null): Boolean {
    return this.createCalendar(null, null, timeZone, locale).isSameSecondOfMinute(target.createCalendar(null, null, timeZone, locale))
}

fun Long.isSameMillisecond(target: Long, timeZone: TimeZone? = null, locale: Locale? = null): Boolean {
    return this.createCalendar(null, null, timeZone, locale).isSameMillisecond(target.createCalendar(null, null, timeZone, locale))
}

fun Long.isSameMillisecondOfSecond(target: Long, timeZone: TimeZone? = null, locale: Locale? = null): Boolean {
    return this.createCalendar(null, null, timeZone, locale).isSameMillisecondOfSecond(target.createCalendar(null, null, timeZone, locale))
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


infix fun Date.yearRangeTo(endInclusive: Date): YearRange = YearRange(this, endInclusive, 1)

infix fun Date.yearDownTo(endInclusive: Date): YearRange = YearRange(this, endInclusive, -1)

infix fun Date.yearUntilTo(other: Date): YearRange = YearRange(this, other.addYear(-1), 1)

infix fun Date.yearDownUntilTo(other: Date): YearRange = YearRange(this, other.addYear(1), -1)


infix fun Long.yearRangeTo(endInclusive: Long): YearRange = this.toDate().yearRangeTo(endInclusive.toDate())

infix fun Long.yearDownTo(endInclusive: Long): YearRange = this.toDate().yearDownTo(endInclusive.toDate())

infix fun Long.yearUntilTo(end: Long): YearRange = this.toDate().yearUntilTo(end.toDate())

infix fun Long.yearDownUntilTo(end: Long): YearRange = this.toDate().yearDownUntilTo(end.toDate())


infix fun String.yearYRangeTo(endInclusive: String): YearRange = this.toDateY().yearRangeTo(endInclusive.toDateY())

infix fun String.yearYDownTo(endInclusive: String): YearRange = this.toDateY().yearDownTo(endInclusive.toDateY())

infix fun String.yearYUntilTo(end: String): YearRange = this.toDateY().yearUntilTo(end.toDateY())

infix fun String.yearYDownUntilTo(end: String): YearRange = this.toDateY().yearDownUntilTo(end.toDateY())


infix fun Date.monthRangeTo(endInclusive: Date): MonthRange = MonthRange(this, endInclusive, 1)

infix fun Date.monthDownTo(endInclusive: Date): MonthRange = MonthRange(this, endInclusive, -1)

infix fun Date.monthUntilTo(end: Date): MonthRange = MonthRange(this, end.addMonth(-1), 1)

infix fun Date.monthDownUntilTo(end: Date): MonthRange = MonthRange(this, end.addMonth(1), -1)


infix fun Long.monthRangeTo(endInclusive: Long): MonthRange = this.toDate().monthRangeTo(endInclusive.toDate())

infix fun Long.monthDownTo(endInclusive: Long): MonthRange = this.toDate().monthDownTo(endInclusive.toDate())

infix fun Long.monthUntilTo(end: Long): MonthRange = this.toDate().monthUntilTo(end.toDate())

infix fun Long.monthDownUntilTo(end: Long): MonthRange = this.toDate().monthDownUntilTo(end.toDate())


infix fun String.monthYMRangeTo(endInclusive: String): MonthRange = this.toDateYM().monthRangeTo(endInclusive.toDateYM())

infix fun String.monthYMDownTo(endInclusive: String): MonthRange = this.toDateYM().monthDownTo(endInclusive.toDateYM())

infix fun String.monthYMUntilTo(end: String): MonthRange = this.toDateYM().monthUntilTo(end.toDateYM())

infix fun String.monthYMDownUntilTo(end: String): MonthRange = this.toDateYM().monthDownUntilTo(end.toDateYM())


infix fun Date.dayRangeTo(endInclusive: Date): DayRange = DayRange(this, endInclusive, 1)

infix fun Date.dayDownTo(endInclusive: Date): DayRange = DayRange(this, endInclusive, -1)

infix fun Date.dayUntilTo(end: Date): DayRange = DayRange(this, end.addDayOfMonth(-1), 1)

infix fun Date.dayDownUntilTo(end: Date): DayRange = DayRange(this, end.addDayOfMonth(1), -1)


infix fun Long.dayRangeTo(endInclusive: Long): DayRange = this.toDate().dayRangeTo(endInclusive.toDate())

infix fun Long.dayDownTo(endInclusive: Long): DayRange = this.toDate().dayDownTo(endInclusive.toDate())

infix fun Long.dayUntilTo(end: Long): DayRange = this.toDate().dayUntilTo(end.toDate())

infix fun Long.dayDownUntilTo(end: Long): DayRange = this.toDate().dayDownUntilTo(end.toDate())


infix fun String.dayYMDRangeTo(endInclusive: String): DayRange = this.toDateYMD().dayRangeTo(endInclusive.toDateYMD())

infix fun String.dayYMDDownTo(endInclusive: String): DayRange = this.toDateYMD().dayDownTo(endInclusive.toDateYMD())

infix fun String.dayYMDUntilTo(end: String): DayRange = this.toDateYMD().dayUntilTo(end.toDateYMD())

infix fun String.dayYMDDownUntilTo(end: String): DayRange = this.toDateYMD().dayDownUntilTo(end.toDateYMD())


infix fun Date.hourRangeTo(endInclusive: Date): HourRange = HourRange(this, endInclusive, 1)

infix fun Date.hourDownTo(endInclusive: Date): HourRange = HourRange(this, endInclusive, -1)

infix fun Date.hourUntilTo(end: Date): HourRange = HourRange(this, end.addHourOfDay(-1), 1)

infix fun Date.hourDownUntilTo(end: Date): HourRange = HourRange(this, end.addHourOfDay(1), -1)


infix fun Long.hourRangeTo(endInclusive: Long): HourRange = this.toDate().hourRangeTo(endInclusive.toDate())

infix fun Long.hourDownTo(endInclusive: Long): HourRange = this.toDate().hourDownTo(endInclusive.toDate())

infix fun Long.hourUntilTo(end: Long): HourRange = this.toDate().hourUntilTo(end.toDate())

infix fun Long.hourDownUntilTo(end: Long): HourRange = this.toDate().hourDownUntilTo(end.toDate())


infix fun String.hourYMDHRangeTo(endInclusive: String): HourRange = this.toDateYMDH().hourRangeTo(endInclusive.toDateYMDH())

infix fun String.hourYMDHDownTo(endInclusive: String): HourRange = this.toDateYMDH().hourDownTo(endInclusive.toDateYMDH())

infix fun String.hourYMDHUntilTo(end: String): HourRange = this.toDateYMDH().hourUntilTo(end.toDateYMDH())

infix fun String.hourYMDHDownUntilTo(end: String): HourRange = this.toDateYMDH().hourDownUntilTo(end.toDateYMDH())


infix fun Date.minuteRangeTo(endInclusive: Date): MinuteRange = MinuteRange(this, endInclusive, 1)

infix fun Date.minuteDownTo(endInclusive: Date): MinuteRange = MinuteRange(this, endInclusive, -1)

infix fun Date.minuteUntilTo(end: Date): MinuteRange = MinuteRange(this, end.addMinute(-1), 1)

infix fun Date.minuteDownUntilTo(end: Date): MinuteRange = MinuteRange(this, end.addMinute(1), -1)


infix fun Long.minuteRangeTo(endInclusive: Long): MinuteRange = this.toDate().minuteRangeTo(endInclusive.toDate())

infix fun Long.minuteDownTo(endInclusive: Long): MinuteRange = this.toDate().minuteDownTo(endInclusive.toDate())

infix fun Long.minuteUntilTo(end: Long): MinuteRange = this.toDate().minuteUntilTo(end.toDate())

infix fun Long.minuteDownUntilTo(end: Long): MinuteRange = this.toDate().minuteDownUntilTo(end.toDate())


infix fun String.minuteYMDHMRangeTo(endInclusive: String): MinuteRange = this.toDateYMDHM().minuteRangeTo(endInclusive.toDateYMDHM())

infix fun String.minuteYMDHMDownTo(endInclusive: String): MinuteRange = this.toDateYMDHM().minuteDownTo(endInclusive.toDateYMDHM())

infix fun String.minuteYMDHMUntilTo(end: String): MinuteRange = this.toDateYMDHM().minuteUntilTo(end.toDateYMDHM())

infix fun String.minuteYMDHMDownUntilTo(end: String): MinuteRange = this.toDateYMDHM().minuteDownUntilTo(end.toDateYMDHM())


infix fun Date.secondRangeTo(endInclusive: Date): SecondRange = SecondRange(this, endInclusive, 1)

infix fun Date.secondDownTo(endInclusive: Date): SecondRange = SecondRange(this, endInclusive, -1)

infix fun Date.secondUntilTo(end: Date): SecondRange = SecondRange(this, end.addSecond(-1), 1)

infix fun Date.secondDownUntilTo(end: Date): SecondRange = SecondRange(this, end.addSecond(1), -1)


infix fun Long.secondRangeTo(endInclusive: Long): SecondRange = this.toDate().secondRangeTo(endInclusive.toDate())

infix fun Long.secondDownTo(endInclusive: Long): SecondRange = this.toDate().secondDownTo(endInclusive.toDate())

infix fun Long.secondUntilTo(end: Long): SecondRange = this.toDate().secondUntilTo(end.toDate())

infix fun Long.secondDownUntilTo(end: Long): SecondRange = this.toDate().secondDownUntilTo(end.toDate())


infix fun String.secondYMDHMSRangeTo(endInclusive: String): SecondRange = this.toDateYMDHMS().secondRangeTo(endInclusive.toDateYMDHMS())

infix fun String.secondYMDHMSDownTo(endInclusive: String): SecondRange = this.toDateYMDHMS().secondDownTo(endInclusive.toDateYMDHMS())

infix fun String.secondYMDHMSUntilTo(end: String): SecondRange = this.toDateYMDHMS().secondUntilTo(end.toDateYMDHMS())

infix fun String.secondYMDHMSDownUntilTo(end: String): SecondRange = this.toDateYMDHMS().secondDownUntilTo(end.toDateYMDHMS())


infix fun Date.millisecondRangeTo(endInclusive: Date): MillisecondRange = MillisecondRange(this, endInclusive, 1)

infix fun Date.millisecondDownTo(endInclusive: Date): MillisecondRange = MillisecondRange(this, endInclusive, -1)

infix fun Date.millisecondUntilTo(end: Date): MillisecondRange = MillisecondRange(this, end.addMillisecond(-1), 1)

infix fun Date.millisecondDownUntilTo(end: Date): MillisecondRange = MillisecondRange(this, end.addMillisecond(1), -1)


infix fun Long.millisecondRangeTo(endInclusive: Long): MillisecondRange = this.toDate().millisecondRangeTo(endInclusive.toDate())

infix fun Long.millisecondDownTo(endInclusive: Long): MillisecondRange = this.toDate().millisecondDownTo(endInclusive.toDate())

infix fun Long.millisecondUntilTo(end: Long): MillisecondRange = this.toDate().millisecondUntilTo(end.toDate())

infix fun Long.millisecondDownUntilTo(end: Long): MillisecondRange = this.toDate().millisecondDownUntilTo(end.toDate())


infix fun String.millisecondYMDHMSMRangeTo(endInclusive: String): MillisecondRange = this.toDateYMDHMSM().millisecondRangeTo(endInclusive.toDateYMDHMSM())

infix fun String.millisecondYMDHMSMDownTo(endInclusive: String): MillisecondRange = this.toDateYMDHMSM().millisecondDownTo(endInclusive.toDateYMDHMSM())

infix fun String.millisecondYMDHMSMUntilTo(end: String): MillisecondRange = this.toDateYMDHMSM().millisecondUntilTo(end.toDateYMDHMSM())

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

    class IteratorInternal(val range: DateRange, first: Date, private val last: Date, private val step: Int) : Iterator<Date> {
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