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

@file:Suppress("NOTHING_TO_INLINE")

package me.panpf.javaxkt.util

import me.panpf.javax.util.Datex
import java.text.ParseException
import java.text.SimpleDateFormat
import java.util.*


/*
 * Date related extension methods or properties
 */

/**
 * Create a Calendar
 */
inline fun Long.createCalendar(firstDayOfWeek: Int? = null, locale: Locale? = null): Calendar = Datex.createCalendar(this, firstDayOfWeek, locale)

/**
 * Create a Calendar
 */
inline fun Long.createCalendar(locale: Locale? = null): Calendar = Datex.createCalendar(this, locale)

/**
 * Create a Calendar
 */
inline fun Date.createCalendar(firstDayOfWeek: Int? = null, locale: Locale? = null): Calendar = Datex.createCalendar(this, firstDayOfWeek, locale)

/**
 * Create a Calendar
 */
inline fun Date.createCalendar(locale: Locale? = null): Calendar = Datex.createCalendar(this, locale)


/*
 * toDate
 */

/**
 * Millisecond to Date
 */
inline fun Long.toDate(): Date = Datex.toDate(this)


/**
 * Convert formatted date string to Date
 */
@Throws(ParseException::class)
inline fun String.toDate(format: SimpleDateFormat): Date = Datex.toDate(this, format)

/**
 * Convert formatted date string to Date
 */
@Throws(ParseException::class)
inline fun String.toDate(pattern: String, locale: Locale? = null): Date = Datex.toDate(this, pattern, locale)

/**
 * Convert formatted date string to Date using pattern 'yyyy'
 */
@Throws(ParseException::class)
inline fun String.toDateY(locale: Locale? = null): Date = Datex.toDateY(this, locale)

/**
 * Convert formatted date string to Date using pattern 'yyyy-MM'
 */
@Throws(ParseException::class)
inline fun String.toDateYM(locale: Locale? = null): Date = Datex.toDateYM(this, locale)

/**
 * Convert formatted date string to Date using pattern 'yyyyMM'
 */
@Throws(ParseException::class)
inline fun String.toDateYMCompact(locale: Locale? = null): Date = Datex.toDateYMCompact(this, locale)

/**
 * Convert formatted date string to Date using pattern 'yyyy-MM-dd'
 */
@Throws(ParseException::class)
inline fun String.toDateYMD(locale: Locale? = null): Date = Datex.toDateYMD(this, locale)

/**
 * Convert formatted date string to Date using pattern 'yyyyMMdd'
 */
@Throws(ParseException::class)
inline fun String.toDateYMDCompact(locale: Locale? = null): Date = Datex.toDateYMDCompact(this, locale)

/**
 * Convert formatted date string to Date using pattern 'yyyy-MM-dd HH'
 */
@Throws(ParseException::class)
inline fun String.toDateYMDH(locale: Locale? = null): Date = Datex.toDateYMDH(this, locale)

/**
 * Convert formatted date string to Date using pattern 'yyyy-MM-dd HH:mm'
 */
@Throws(ParseException::class)
inline fun String.toDateYMDHM(locale: Locale? = null): Date = Datex.toDateYMDHM(this, locale)

/**
 * Convert formatted date string to Date using pattern 'yyyy-MM-dd HH:mm:ss'
 */
@Throws(ParseException::class)
inline fun String.toDateYMDHMS(locale: Locale? = null): Date = Datex.toDateYMDHMS(this, locale)

/**
 * Convert formatted date string to Date using pattern 'yyyy-MM-dd HH:mm:ss SSS'
 */
@Throws(ParseException::class)
inline fun String.toDateYMDHMSM(locale: Locale? = null): Date = Datex.toDateYMDHMSM(this, locale)


/*
 * toMillisecond
 */


/**
 * Convert formatted date string to millisecond
 */
@Throws(ParseException::class)
inline fun String.toMillisecond(format: SimpleDateFormat): Long = Datex.toMillisecond(this, format)

/**
 * Convert formatted date string to millisecond
 */
@Throws(ParseException::class)
inline fun String.toMillisecond(pattern: String, locale: Locale? = null): Long = Datex.toMillisecond(this, pattern, locale)

/**
 * Convert formatted date string to millisecond using pattern 'yyyy'
 */
@Throws(ParseException::class)
inline fun String.toMillisecondY(locale: Locale? = null): Long = Datex.toMillisecondY(this, locale)

/**
 * Convert formatted date string to millisecond using pattern 'yyyy-MM'
 */
@Throws(ParseException::class)
inline fun String.toMillisecondYM(locale: Locale? = null): Long = Datex.toMillisecondYM(this, locale)

/**
 * Convert formatted date string to millisecond using pattern 'yyyyMM'
 */
@Throws(ParseException::class)
inline fun String.toMillisecondYMCompact(locale: Locale? = null): Long = Datex.toMillisecondYMCompact(this, locale)

/**
 * Convert formatted date string to millisecond using pattern 'yyyy-MM-dd'
 */
@Throws(ParseException::class)
inline fun String.toMillisecondYMD(locale: Locale? = null): Long = Datex.toMillisecondYMD(this, locale)

/**
 * Convert formatted date string to millisecond using pattern 'yyyyMMdd'
 */
@Throws(ParseException::class)
inline fun String.toMillisecondYMDCompact(locale: Locale? = null): Long = Datex.toMillisecondYMDCompact(this, locale)

/**
 * Convert formatted date string to millisecond using pattern 'yyyy-MM-dd HH'
 */
@Throws(ParseException::class)
inline fun String.toMillisecondYMDH(locale: Locale? = null): Long = Datex.toMillisecondYMDH(this, locale)

/**
 * Convert formatted date string to millisecond using pattern 'yyyy-MM-dd HH:mm'
 */
@Throws(ParseException::class)
inline fun String.toMillisecondYMDHM(locale: Locale? = null): Long = Datex.toMillisecondYMDHM(this, locale)

/**
 * Convert formatted date string to millisecond using pattern 'yyyy-MM-dd HH:mm:ss'
 */
@Throws(ParseException::class)
inline fun String.toMillisecondYMDHMS(locale: Locale? = null): Long = Datex.toMillisecondYMDHMS(this, locale)

/**
 * Convert formatted date string to millisecond using pattern 'yyyy-MM-dd HH:mm:ss SSS'
 */
@Throws(ParseException::class)
inline fun String.toMillisecondYMDHMSM(locale: Locale? = null): Long = Datex.toMillisecondYMDHMSM(this, locale)


/*
 * format
 */


/**
 * Convert Date to a formatted string
 */
inline fun Date.format(format: SimpleDateFormat): String = Datex.format(this, format)

/**
 * Convert Date to a formatted string
 */
inline fun Date.format(pattern: String, locale: Locale? = null): String = Datex.format(this, pattern, locale)

/**
 * Convert Date to a formatted string using pattern 'yyyy'
 */
inline fun Date.formatY(locale: Locale? = null): String = Datex.formatY(this, locale)

/**
 * Convert Date to a formatted string using pattern 'yyyy-MM'
 */
inline fun Date.formatYM(locale: Locale? = null): String = Datex.formatYM(this, locale)

/**
 * Convert Date to a formatted string using pattern 'yyyyMM'
 */
inline fun Date.formatYMCompact(locale: Locale? = null): String = Datex.formatYMCompact(this, locale)

/**
 * Convert Date to a formatted string using pattern 'yyyy-MM-dd'
 */
inline fun Date.formatYMD(locale: Locale? = null): String = Datex.formatYMD(this, locale)

/**
 * Convert Date to a formatted string using pattern 'yyyyMMdd'
 */
inline fun Date.formatYMDCompact(locale: Locale? = null): String = Datex.formatYMDCompact(this, locale)

/**
 * Convert Date to a formatted string using pattern 'yyyy-MM-dd HH'
 */
inline fun Date.formatYMDH(locale: Locale? = null): String = Datex.formatYMDH(this, locale)

/**
 * Convert Date to a formatted string using pattern 'yyyy-MM-dd HH:mm'
 */
inline fun Date.formatYMDHM(locale: Locale? = null): String = Datex.formatYMDHM(this, locale)

/**
 * Convert Date to a formatted string using pattern 'yyyy-MM-dd HH:mm:ss'
 */
inline fun Date.formatYMDHMS(locale: Locale? = null): String = Datex.formatYMDHMS(this, locale)

/**
 * Convert Date to a formatted string using pattern 'yyyy-MM-dd HH:mm:ss SSS'
 */
inline fun Date.formatYMDHMSM(locale: Locale? = null): String = Datex.formatYMDHMSM(this, locale)


/**
 * Convert millisecond to a formatted string
 */
inline fun Long.format(format: SimpleDateFormat): String = Datex.format(this, format)

/**
 * Convert millisecond to a formatted string
 */
inline fun Long.format(pattern: String, locale: Locale? = null): String = Datex.format(this, pattern, locale)

/**
 * Convert millisecond to a formatted string using pattern 'yyyy'
 */
inline fun Long.formatY(locale: Locale? = null): String = Datex.formatY(this, locale)

/**
 * Convert millisecond to a formatted string using pattern 'yyyy-MM'
 */
inline fun Long.formatYM(locale: Locale? = null): String = Datex.formatYM(this, locale)

/**
 * Convert millisecond to a formatted string using pattern 'yyyyMM'
 */
inline fun Long.formatYMCompact(locale: Locale? = null): String = Datex.formatYMCompact(this, locale)

/**
 * Convert millisecond to a formatted string using pattern 'yyyy-MM-dd'
 */
inline fun Long.formatYMD(locale: Locale? = null): String = Datex.formatYMD(this, locale)

/**
 * Convert millisecond to a formatted string using pattern 'yyyyMMdd'
 */
inline fun Long.formatYMDCompact(locale: Locale? = null): String = Datex.formatYMDCompact(this, locale)

/**
 * Convert millisecond to a formatted string using pattern 'yyyy-MM-dd HH'
 */
inline fun Long.formatYMDH(locale: Locale? = null): String = Datex.formatYMDH(this, locale)

/**
 * Convert millisecond to a formatted string using pattern 'yyyy-MM-dd HH:mm'
 */
inline fun Long.formatYMDHM(locale: Locale? = null): String = Datex.formatYMDHM(this, locale)

/**
 * Convert millisecond to a formatted string using pattern 'yyyy-MM-dd HH:mm:ss'
 */
inline fun Long.formatYMDHMS(locale: Locale? = null): String = Datex.formatYMDHMS(this, locale)

/**
 * Convert millisecond to a formatted string using pattern 'yyyy-MM-dd HH:mm:ss SSS'
 */
inline fun Long.formatYMDHMSM(locale: Locale? = null): String = Datex.formatYMDHMSM(this, locale)


/*
 * get
 */


/**
 * Get year from calendar
 */
inline fun Calendar.getYear(): Int = Datex.getYear(this)

/**
 * Get month from calendar
 */
inline fun Calendar.getMonth(): Int = Datex.getMonth(this)

/**
 * Get weekOfYear from calendar
 */
inline fun Calendar.getWeekOfYear(): Int = Datex.getWeekOfYear(this)

/**
 * Get weekOfMonth from calendar
 */
inline fun Calendar.getWeekOfMonth(): Int = Datex.getWeekOfMonth(this)

/**
 * Get dayOfYear from calendar
 */
inline fun Calendar.getDayOfYear(): Int = Datex.getDayOfYear(this)

/**
 * Get dayOfMonth from calendar
 */
inline fun Calendar.getDayOfMonth(): Int = Datex.getDayOfMonth(this)

/**
 * Get dayOfWeek from calendar
 */
inline fun Calendar.getDayOfWeek(): Int = Datex.getDayOfWeek(this)

/**
 * Get dayOfWeekInMonth from calendar
 */
inline fun Calendar.getDayOfWeekInMonth(): Int = Datex.getDayOfWeekInMonth(this)

/**
 * Get hourOfDay from calendar
 */
inline fun Calendar.getHourOfDay(): Int = Datex.getHourOfDay(this)

/**
 * Get hour from calendar
 */
inline fun Calendar.getHour(): Int = Datex.getHour(this)

/**
 * Get minute from calendar
 */
inline fun Calendar.getMinute(): Int = Datex.getMinute(this)

/**
 * Get second from calendar
 */
inline fun Calendar.getSecond(): Int = Datex.getSecond(this)

/**
 * Get millisecond from calendar
 */
inline fun Calendar.getMillisecond(): Int = Datex.getMillisecond(this)


/**
 * Get calendar field from millisecond
 */
inline fun Date.getCalendarField(field: Int, firstDayOfWeek: Int? = null, locale: Locale? = null): Int = Datex.getCalendarField(this, field, firstDayOfWeek, locale)

/**
 * Get year from date
 */
inline fun Date.getCalendarYear(locale: Locale? = null): Int = Datex.getCalendarYear(this, locale)

/**
 * Get month from date
 */
inline fun Date.getCalendarMonth(locale: Locale? = null): Int = Datex.getCalendarMonth(this, locale)

/**
 * Get weekOfYear from date
 */
inline fun Date.getCalendarWeekOfYear(firstDayOfWeek: Int? = null, locale: Locale? = null): Int = Datex.getCalendarWeekOfYear(this, firstDayOfWeek, locale)

/**
 * Get weekOfMonth from date
 */
inline fun Date.getCalendarWeekOfMonth(firstDayOfWeek: Int? = null, locale: Locale? = null): Int = Datex.getCalendarWeekOfMonth(this, firstDayOfWeek, locale)

/**
 * Get dayOfYear from date
 */
inline fun Date.getCalendarDayOfYear(locale: Locale? = null): Int = Datex.getCalendarDayOfYear(this, locale)

/**
 * Get dayOfMonth from date
 */
inline fun Date.getCalendarDayOfMonth(locale: Locale? = null): Int = Datex.getCalendarDayOfMonth(this, locale)

/**
 * Get dayOfWeek from date
 */
inline fun Date.getCalendarDayOfWeek(firstDayOfWeek: Int? = null, locale: Locale? = null): Int = Datex.getCalendarDayOfWeek(this, firstDayOfWeek, locale)

/**
 * Get dayOfWeekInMonth from date
 */
inline fun Date.getCalendarDayOfWeekInMonth(firstDayOfWeek: Int? = null, locale: Locale? = null): Int = Datex.getCalendarDayOfWeekInMonth(this, firstDayOfWeek, locale)

/**
 * Get hourOfDay from date
 */
inline fun Date.getCalendarHourOfDay(locale: Locale? = null): Int = Datex.getCalendarHourOfDay(this, locale)

/**
 * Get hour from date
 */
inline fun Date.getCalendarHour(locale: Locale? = null): Int = Datex.getCalendarHour(this, locale)

/**
 * Get minute from date
 */
inline fun Date.getCalendarMinute(locale: Locale? = null): Int = Datex.getCalendarMinute(this, locale)

/**
 * Get second from date
 */
inline fun Date.getCalendarSecond(locale: Locale? = null): Int = Datex.getCalendarSecond(this, locale)

/**
 * Get millisecond from date
 */
inline fun Date.getCalendarMillisecond(locale: Locale? = null): Int = Datex.getCalendarMillisecond(this, locale)


/**
 * Get calendar field from millisecond
 */
inline fun Long.getCalendarField(field: Int, firstDayOfWeek: Int? = null, locale: Locale? = null): Int = Datex.getCalendarField(this, field, firstDayOfWeek, locale)

/**
 * Get year from millisecond
 */
inline fun Long.getYear(locale: Locale? = null): Int = Datex.getYear(this, locale)

/**
 * Get month from millisecond
 */
inline fun Long.getMonth(locale: Locale? = null): Int = Datex.getMonth(this, locale)

/**
 * Get weekOfYear from millisecond
 */
inline fun Long.getWeekOfYear(firstDayOfWeek: Int? = null, locale: Locale? = null): Int = Datex.getWeekOfYear(this, firstDayOfWeek, locale)

/**
 * Get weekOfMonth from millisecond
 */
inline fun Long.getWeekOfMonth(firstDayOfWeek: Int? = null, locale: Locale? = null): Int = Datex.getWeekOfMonth(this, firstDayOfWeek, locale)

/**
 * Get dayOfYear from millisecond
 */
inline fun Long.getDayOfYear(locale: Locale? = null): Int = Datex.getDayOfYear(this, locale)

/**
 * Get dayOfMonth from millisecond
 */
inline fun Long.getDayOfMonth(locale: Locale? = null): Int = Datex.getDayOfMonth(this, locale)

/**
 * Get dayOfWeek from millisecond
 */
inline fun Long.getDayOfWeek(firstDayOfWeek: Int? = null, locale: Locale? = null): Int = Datex.getDayOfWeek(this, firstDayOfWeek, locale)

/**
 * Get dayOfWeekInMonth from millisecond
 */
inline fun Long.getDayOfWeekInMonth(firstDayOfWeek: Int? = null, locale: Locale? = null): Int = Datex.getDayOfWeekInMonth(this, firstDayOfWeek, locale)

/**
 * Get hourOfDay from millisecond
 */
inline fun Long.getHourOfDay(locale: Locale? = null): Int = Datex.getHourOfDay(this, locale)

/**
 * Get hour from millisecond
 */
inline fun Long.getHour(locale: Locale? = null): Int = Datex.getHour(this, locale)

/**
 * Get minute from millisecond
 */
inline fun Long.getMinute(locale: Locale? = null): Int = Datex.getMinute(this, locale)

/**
 * Get second from millisecond
 */
inline fun Long.getSecond(locale: Locale? = null): Int = Datex.getSecond(this, locale)

/**
 * Get millisecond from millisecond
 */
inline fun Long.getMillisecond(locale: Locale? = null): Int = Datex.getMillisecond(this, locale)


/*
 * add
 */


/**
 * Increase the specified calendar field and return to Date
 */
inline fun Calendar.addToDate(field: Int, amount: Int): Date = Datex.addToDate(this, field, amount)

/**
 * Increase the specified calendar field and return to millisecond
 */
inline fun Calendar.addToMillisecond(field: Int, amount: Int): Long = Datex.addToMillisecond(this, field, amount)


/**
 * Increase the specified calendar field
 */
inline fun Date.addCalendarField(field: Int, amount: Int, firstDayOfWeek: Int? = null, locale: Locale? = null): Date = Datex.addCalendarField(this, field, amount, firstDayOfWeek, locale)

/**
 * Increase the YEAR field
 */
inline fun Date.addYear(amount: Int, locale: Locale? = null): Date = Datex.addYear(this, amount, locale)

/**
 * Increase the MONTH field
 */
inline fun Date.addMonth(amount: Int, locale: Locale? = null): Date = Datex.addMonth(this, amount, locale)

/**
 * Increase the WEEK_OF_YEAR field
 */
inline fun Date.addWeekOfYear(amount: Int, firstDayOfWeek: Int? = null, locale: Locale? = null): Date = Datex.addWeekOfYear(this, amount, firstDayOfWeek, locale)

/**
 * Increase the WEEK_OF_MONTH field
 */
inline fun Date.addWeekOfMonth(amount: Int, firstDayOfWeek: Int? = null, locale: Locale? = null): Date = Datex.addWeekOfMonth(this, amount, firstDayOfWeek, locale)

/**
 * Increase the DAY_OF_YEAR field
 */
inline fun Date.addDayOfYear(amount: Int, locale: Locale? = null): Date = Datex.addDayOfYear(this, amount, locale)

/**
 * Increase the DAY_OF_MONTH field
 */
inline fun Date.addDayOfMonth(amount: Int, locale: Locale? = null): Date = Datex.addDayOfMonth(this, amount, locale)

/**
 * Increase the DAY_OF_WEEK_IN_MONTH field
 */
inline fun Date.addDayOfWeekInMonth(amount: Int, firstDayOfWeek: Int? = null, locale: Locale? = null): Date = Datex.addDayOfWeekInMonth(this, amount, firstDayOfWeek, locale)

/**
 * Increase the DAY_OF_WEEK field
 */
inline fun Date.addDayOfWeek(amount: Int, firstDayOfWeek: Int? = null, locale: Locale? = null): Date = Datex.addDayOfWeek(this, amount, firstDayOfWeek, locale)

/**
 * Increase the HOUR_OF_DAY field
 */
inline fun Date.addHourOfDay(amount: Int, locale: Locale? = null): Date = Datex.addHourOfDay(this, amount, locale)

/**
 * Increase the HOUR field
 */
inline fun Date.addHour(amount: Int, locale: Locale? = null): Date = Datex.addHour(this, amount, locale)

/**
 * Increase the MINUTE field
 */
inline fun Date.addMinute(amount: Int, locale: Locale? = null): Date = Datex.addMinute(this, amount, locale)

/**
 * Increase the SECOND field
 */
inline fun Date.addSecond(amount: Int, locale: Locale? = null): Date = Datex.addSecond(this, amount, locale)

/**
 * Increase the MILLISECOND field
 */
inline fun Date.addMillisecond(amount: Int, locale: Locale? = null): Date = Datex.addMillisecond(this, amount, locale)


/**
 * Increase the specified calendar field
 */
inline fun Long.addCalendarField(field: Int, amount: Int, firstDayOfWeek: Int? = null, locale: Locale? = null): Long = Datex.addCalendarField(this, field, amount, firstDayOfWeek, locale)

/**
 * Increase the YEAR field
 */
inline fun Long.addYear(amount: Int, locale: Locale? = null): Long = Datex.addYear(this, amount, locale)

/**
 * Increase the MONTH field
 */
inline fun Long.addMonth(amount: Int, locale: Locale? = null): Long = Datex.addMonth(this, amount, locale)

/**
 * Increase the WEEK_OF_YEAR field
 */
inline fun Long.addWeekOfYear(amount: Int, firstDayOfWeek: Int? = null, locale: Locale? = null): Long = Datex.addWeekOfYear(this, amount, firstDayOfWeek, locale)

/**
 * Increase the WEEK_OF_MONTH field
 */
inline fun Long.addWeekOfMonth(amount: Int, firstDayOfWeek: Int? = null, locale: Locale? = null): Long = Datex.addWeekOfMonth(this, amount, firstDayOfWeek, locale)

/**
 * Increase the DAY_OF_YEAR field
 */
inline fun Long.addDayOfYear(amount: Int, locale: Locale? = null): Long = Datex.addDayOfYear(this, amount, locale)

/**
 * Increase the DAY_OF_MONTH field
 */
inline fun Long.addDayOfMonth(amount: Int, locale: Locale? = null): Long = Datex.addDayOfMonth(this, amount, locale)

/**
 * Increase the DAY_OF_WEEK_IN_MONTH field
 */
inline fun Long.addDayOfWeekInMonth(amount: Int, firstDayOfWeek: Int? = null, locale: Locale? = null): Long = Datex.addDayOfWeekInMonth(this, amount, firstDayOfWeek, locale)

/**
 * Increase the DAY_OF_WEEK field
 */
inline fun Long.addDayOfWeek(amount: Int, firstDayOfWeek: Int? = null, locale: Locale? = null): Long = Datex.addDayOfWeek(this, amount, firstDayOfWeek, locale)

/**
 * Increase the HOUR_OF_DAY field
 */
inline fun Long.addHourOfDay(amount: Int, locale: Locale? = null): Long = Datex.addHourOfDay(this, amount, locale)

/**
 * Increase the HOUR field
 */
inline fun Long.addHour(amount: Int, locale: Locale? = null): Long = Datex.addHour(this, amount, locale)

/**
 * Increase the MINUTE field
 */
inline fun Long.addMinute(amount: Int, locale: Locale? = null): Long = Datex.addMinute(this, amount, locale)

/**
 * Increase the SECOND field
 */
inline fun Long.addSecond(amount: Int, locale: Locale? = null): Long = Datex.addSecond(this, amount, locale)

/**
 * Increase the MILLISECOND field
 */
inline fun Long.addMillisecond(amount: Int, locale: Locale? = null): Long = Datex.addMillisecond(this, amount, locale)


/*
 * isSame
 */


/**
 * Return true if the year is the same
 */
inline fun Calendar.isSameYear(target: Calendar): Boolean = Datex.isSameYear(this, target)

/**
 * Returns true if the year and month are the same
 */
inline fun Calendar.isSameMonth(target: Calendar): Boolean = Datex.isSameMonth(this, target)

/**
 * Return true if the months is the same
 */
inline fun Calendar.isSameMonthOfYear(target: Calendar): Boolean = Datex.isSameMonthOfYear(this, target)

/**
 * Returns true if the year, month, and week are the same
 */
inline fun Calendar.isSameWeek(target: Calendar): Boolean = Datex.isSameWeek(this, target)

/**
 * Return true if the weekOfYear is the same
 */
inline fun Calendar.isSameWeekOfYear(target: Calendar): Boolean = Datex.isSameWeekOfYear(this, target)

/**
 * Return true if the weekOfMonth is the same
 */
inline fun Calendar.isSameWeekOfMonth(target: Calendar): Boolean = Datex.isSameWeekOfMonth(this, target)

/**
 * Returns true if the year, month, week and day are the same
 */
inline fun Calendar.isSameDay(target: Calendar): Boolean = Datex.isSameDay(this, target)

/**
 * Return true if the dayOfYear is the same
 */
inline fun Calendar.isSameDayOfYear(target: Calendar): Boolean = Datex.isSameDayOfYear(this, target)

/**
 * Return true if the dayOfMonth is the same
 */
inline fun Calendar.isSameDayOfMonth(target: Calendar): Boolean = Datex.isSameDayOfMonth(this, target)

/**
 * Return true if the dayOfWeek is the same
 */
inline fun Calendar.isSameDayOfWeek(target: Calendar): Boolean = Datex.isSameDayOfWeek(this, target)

/**
 * Return true if the dayOfWeekInMonth is the same
 */
inline fun Calendar.isSameDayOfWeekInMonth(target: Calendar): Boolean = Datex.isSameDayOfWeekInMonth(this, target)

/**
 * Returns true if the year, month, week, day and hour are the same
 */
inline fun Calendar.isSameHour(target: Calendar): Boolean = Datex.isSameHour(this, target)

/**
 * Return true if the 24H hour is the same
 */
inline fun Calendar.isSameHourOf24H(target: Calendar): Boolean = Datex.isSameHourOf24H(this, target)

/**
 * Return true if the 12H hour is the same
 */
inline fun Calendar.isSameHourOf12H(target: Calendar): Boolean = Datex.isSameHourOf12H(this, target)

/**
 * Returns true if the year, month, week, day, hour and minute are the same
 */
inline fun Calendar.isSameMinute(target: Calendar): Boolean = Datex.isSameMinute(this, target)

/**
 * Return true if the minuteOfHour is the same
 */
inline fun Calendar.isSameMinuteOfHour(target: Calendar): Boolean = Datex.isSameMinuteOfHour(this, target)

/**
 * Returns true if the year, month, week, day, hour, minute and second are the same
 */
inline fun Calendar.isSameSecond(target: Calendar): Boolean = Datex.isSameSecond(this, target)

/**
 * Return true if the secondOfMinute is the same
 */
inline fun Calendar.isSameSecondOfMinute(target: Calendar): Boolean = Datex.isSameSecondOfMinute(this, target)

/**
 * Returns true if the year, month, week, day, hour, minute, second and millisecond are the same
 */
inline fun Calendar.isSameMillisecond(target: Calendar): Boolean = Datex.isSameMillisecond(this, target)

/**
 * Return true if the millisecondOfSecond is the same
 */
inline fun Calendar.isSameMillisecondOfSecond(target: Calendar): Boolean = Datex.isSameMillisecondOfSecond(this, target)


/**
 * Return true if the year is the same
 */
inline fun Date.isSameYear(target: Date, locale: Locale? = null): Boolean = Datex.isSameYear(this, target, locale)

/**
 * Returns true if the year and month are the same
 */
inline fun Date.isSameMonth(target: Date, locale: Locale? = null): Boolean = Datex.isSameMonth(this, target, locale)

/**
 * Return true if the months is the same
 */
inline fun Date.isSameMonthOfYear(target: Date, locale: Locale? = null): Boolean = Datex.isSameMonthOfYear(this, target, locale)

/**
 * Returns true if the year, month, and week are the same
 */
inline fun Date.isSameWeek(target: Date, firstDayOfWeek: Int? = null, locale: Locale? = null): Boolean = Datex.isSameWeek(this, target, firstDayOfWeek, locale)

/**
 * Return true if the weekOfYear is the same
 */
inline fun Date.isSameWeekOfYear(target: Date, firstDayOfWeek: Int? = null, locale: Locale? = null): Boolean = Datex.isSameWeekOfYear(this, target, firstDayOfWeek, locale)

/**
 * Return true if the weekOfMonth is the same
 */
inline fun Date.isSameWeekOfMonth(target: Date, firstDayOfWeek: Int? = null, locale: Locale? = null): Boolean = Datex.isSameWeekOfMonth(this, target, firstDayOfWeek, locale)

/**
 * Returns true if the year, month, week and day are the same
 */
inline fun Date.isSameDay(target: Date, locale: Locale? = null): Boolean = Datex.isSameDay(this, target, locale)

/**
 * Return true if the dayOfYear is the same
 */
inline fun Date.isSameDayOfYear(target: Date, locale: Locale? = null): Boolean = Datex.isSameDayOfYear(this, target, locale)

/**
 * Return true if the dayOfMonth is the same
 */
inline fun Date.isSameDayOfMonth(target: Date, locale: Locale? = null): Boolean = Datex.isSameDayOfMonth(this, target, locale)

/**
 * Return true if the dayOfWeek is the same
 */
inline fun Date.isSameDayOfWeek(target: Date, firstDayOfWeek: Int? = null, locale: Locale? = null): Boolean = Datex.isSameDayOfWeek(this, target, firstDayOfWeek, locale)

/**
 * Return true if the dayOfWeekInMonth is the same
 */
inline fun Date.isSameDayOfWeekInMonth(target: Date, firstDayOfWeek: Int? = null, locale: Locale? = null): Boolean = Datex.isSameDayOfWeekInMonth(this, target, firstDayOfWeek, locale)

/**
 * Returns true if the year, month, week, day and hour are the same
 */
inline fun Date.isSameHour(target: Date, locale: Locale? = null): Boolean = Datex.isSameHour(this, target, locale)

/**
 * Return true if the 24H hour is the same
 */
inline fun Date.isSameHourOf24H(target: Date, locale: Locale? = null): Boolean = Datex.isSameHourOf24H(this, target, locale)

/**
 * Return true if the 12H hour is the same
 */
inline fun Date.isSameHourOf12H(target: Date, locale: Locale? = null): Boolean = Datex.isSameHourOf12H(this, target, locale)

/**
 * Returns true if the year, month, week, day, hour and minute are the same
 */
inline fun Date.isSameMinute(target: Date, locale: Locale? = null): Boolean = Datex.isSameMinute(this, target, locale)

/**
 * Return true if the minuteOfHour is the same
 */
inline fun Date.isSameMinuteOfHour(target: Date, locale: Locale? = null): Boolean = Datex.isSameMinuteOfHour(this, target, locale)

/**
 * Returns true if the year, month, week, day, hour, minute and second are the same
 */
inline fun Date.isSameSecond(target: Date, locale: Locale? = null): Boolean = Datex.isSameSecond(this, target, locale)

/**
 * Return true if the secondOfMinute is the same
 */
inline fun Date.isSameSecondOfMinute(target: Date, locale: Locale? = null): Boolean = Datex.isSameSecondOfMinute(this, target, locale)

/**
 * Returns true if the year, month, week, day, hour, minute, second and millisecond are the same
 */
inline fun Date.isSameMillisecond(target: Date, locale: Locale? = null): Boolean = Datex.isSameMillisecond(this, target, locale)

/**
 * Return true if the millisecondOfSecond is the same
 */
inline fun Date.isSameMillisecondOfSecond(target: Date, locale: Locale? = null): Boolean = Datex.isSameMillisecondOfSecond(this, target, locale)


/**
 * Return true if the year is the same
 */
inline fun Long.isSameYear(target: Long, locale: Locale? = null): Boolean = Datex.isSameYear(this, target, locale)

/**
 * Returns true if the year and month are the same
 */
inline fun Long.isSameMonth(target: Long, locale: Locale? = null): Boolean = Datex.isSameMonth(this, target, locale)

/**
 * Return true if the months is the same
 */
inline fun Long.isSameMonthOfYear(target: Long, locale: Locale? = null): Boolean = Datex.isSameMonthOfYear(this, target, locale)

/**
 * Returns true if the year, month, and week are the same
 */
inline fun Long.isSameWeek(target: Long, firstDayOfWeek: Int? = null, locale: Locale? = null): Boolean = Datex.isSameWeek(this, target, firstDayOfWeek, locale)

/**
 * Return true if the weekOfYear is the same
 */
inline fun Long.isSameWeekOfYear(target: Long, firstDayOfWeek: Int? = null, locale: Locale? = null): Boolean = Datex.isSameWeekOfYear(this, target, firstDayOfWeek, locale)

/**
 * Return true if the weekOfMonth is the same
 */
inline fun Long.isSameWeekOfMonth(target: Long, firstDayOfWeek: Int? = null, locale: Locale? = null): Boolean = Datex.isSameWeekOfMonth(this, target, firstDayOfWeek, locale)

/**
 * Returns true if the year, month, week and day are the same
 */
inline fun Long.isSameDay(target: Long, locale: Locale? = null): Boolean = Datex.isSameDay(this, target, locale)

/**
 * Return true if the dayOfYear is the same
 */
inline fun Long.isSameDayOfYear(target: Long, locale: Locale? = null): Boolean = Datex.isSameDayOfYear(this, target, locale)

/**
 * Return true if the dayOfMonth is the same
 */
inline fun Long.isSameDayOfMonth(target: Long, locale: Locale? = null): Boolean = Datex.isSameDayOfMonth(this, target, locale)

/**
 * Return true if the dayOfWeek is the same
 */
inline fun Long.isSameDayOfWeek(target: Long, firstDayOfWeek: Int? = null, locale: Locale? = null): Boolean = Datex.isSameDayOfWeek(this, target, firstDayOfWeek, locale)

/**
 * Return true if the dayOfWeekInMonth is the same
 */
inline fun Long.isSameDayOfWeekInMonth(target: Long, firstDayOfWeek: Int? = null, locale: Locale? = null): Boolean = Datex.isSameDayOfWeekInMonth(this, target, firstDayOfWeek, locale)

/**
 * Returns true if the year, month, week, day and hour are the same
 */
inline fun Long.isSameHour(target: Long, locale: Locale? = null): Boolean = Datex.isSameHour(this, target, locale)

/**
 * Return true if the 24H hour is the same
 */
inline fun Long.isSameHourOf24H(target: Long, locale: Locale? = null): Boolean = Datex.isSameHourOf24H(this, target, locale)

/**
 * Return true if the 12H hour is the same
 */
inline fun Long.isSameHourOf12H(target: Long, locale: Locale? = null): Boolean = Datex.isSameHourOf12H(this, target, locale)

/**
 * Returns true if the year, month, week, day, hour and minute are the same
 */
inline fun Long.isSameMinute(target: Long, locale: Locale? = null): Boolean = Datex.isSameMinute(this, target, locale)

/**
 * Return true if the minuteOfHour is the same
 */
inline fun Long.isSameMinuteOfHour(target: Long, locale: Locale? = null): Boolean = Datex.isSameMinuteOfHour(this, target, locale)

/**
 * Returns true if the year, month, week, day, hour, minute and second are the same
 */
inline fun Long.isSameSecond(target: Long, locale: Locale? = null): Boolean = Datex.isSameSecond(this, target, locale)

/**
 * Return true if the secondOfMinute is the same
 */
inline fun Long.isSameSecondOfMinute(target: Long, locale: Locale? = null): Boolean = Datex.isSameSecondOfMinute(this, target, locale)

/**
 * Returns true if the year, month, week, day, hour, minute, second and millisecond are the same
 */
inline fun Long.isSameMillisecond(target: Long, locale: Locale? = null): Boolean = Datex.isSameMillisecond(this, target, locale)

/**
 * Return true if the millisecondOfSecond is the same
 */
inline fun Long.isSameMillisecondOfSecond(target: Long, locale: Locale? = null): Boolean = Datex.isSameMillisecondOfSecond(this, target, locale)


/*
 * differ
 */


/**
 * Return true if the difference from the [target] does not exceed the [amount] specified calendar field
 */
inline fun Calendar.differFiled(target: Calendar, field: Int, amount: Int): Boolean = Datex.differFiled(this, target, field, amount)

/**
 * Return true if the difference from the [target] does not exceed the [amount] year
 */
inline fun Calendar.differYear(target: Calendar, amount: Int): Boolean = Datex.differYear(this, target, amount)

/**
 * Return true if the difference from the [target] does not exceed the [amount] month
 */
inline fun Calendar.differMonth(target: Calendar, amount: Int): Boolean = Datex.differMonth(this, target, amount)

/**
 * Return true if the difference from the [target] does not exceed the [amount] weekOfYear
 */
inline fun Calendar.differWeekOfYear(target: Calendar, amount: Int): Boolean = Datex.differWeekOfYear(this, target, amount)

/**
 * Return true if the difference from the [target] does not exceed the [amount] weekOfMonth
 */
inline fun Calendar.differWeekOfMonth(target: Calendar, amount: Int): Boolean = Datex.differWeekOfMonth(this, target, amount)

/**
 * Return true if the difference from the [target] does not exceed the [amount] dayOfYear
 */
inline fun Calendar.differDayOfYear(target: Calendar, amount: Int): Boolean = Datex.differDayOfYear(this, target, amount)

/**
 * Return true if the difference from the [target] does not exceed the [amount] dayOfMonth
 */
inline fun Calendar.differDayOfMonth(target: Calendar, amount: Int): Boolean = Datex.differDayOfMonth(this, target, amount)

/**
 * Return true if the difference from the [target] does not exceed the [amount] dayOfWeek
 */
inline fun Calendar.differDayOfWeek(target: Calendar, amount: Int): Boolean = Datex.differDayOfWeek(this, target, amount)

/**
 * Return true if the difference from the [target] does not exceed the [amount] dayOfWeekInMonth
 */
inline fun Calendar.differDayOfWeekInMonth(target: Calendar, amount: Int): Boolean = Datex.differDayOfWeekInMonth(this, target, amount)

/**
 * Return true if the difference from the [target] does not exceed the [amount] hourOfDay
 */
inline fun Calendar.differHourOfDay(target: Calendar, amount: Int): Boolean = Datex.differHourOfDay(this, target, amount)

/**
 * Return true if the difference from the [target] does not exceed the [amount] hour
 */
inline fun Calendar.differHour(target: Calendar, amount: Int): Boolean = Datex.differHour(this, target, amount)

/**
 * Return true if the difference from the [target] does not exceed the [amount] minute
 */
inline fun Calendar.differMinute(target: Calendar, amount: Int): Boolean = Datex.differMinute(this, target, amount)

/**
 * Return true if the difference from the [target] does not exceed the [amount] second
 */
inline fun Calendar.differSecond(target: Calendar, amount: Int): Boolean = Datex.differSecond(this, target, amount)

/**
 * Return true if the difference from the [target] does not exceed the [amount] millisecond
 */
inline fun Calendar.differMillisecond(target: Calendar, amount: Int): Boolean = Datex.differMillisecond(this, target, amount)


/**
 * Return true if the difference from the [target] does not exceed the [amount] specified calendar field
 */
inline fun Date.differCalendarField(target: Date, field: Int, amount: Int, firstDayOfWeek: Int? = null, locale: Locale? = null): Boolean {
    return Datex.differCalendarField(this, target, field, amount, firstDayOfWeek, locale)
}

/**
 * Return true if the difference from the [target] does not exceed the [amount] year
 */
inline fun Date.differYear(target: Date, amount: Int, locale: Locale? = null): Boolean = Datex.differYear(this, target, amount, locale)

/**
 * Return true if the difference from the [target] does not exceed the [amount] month
 */
inline fun Date.differMonth(target: Date, amount: Int, locale: Locale? = null): Boolean = Datex.differMonth(this, target, amount, locale)

/**
 * Return true if the difference from the [target] does not exceed the [amount] weekOfYear
 */
inline fun Date.differWeekOfYear(target: Date, amount: Int, firstDayOfWeek: Int? = null, locale: Locale? = null): Boolean = Datex.differWeekOfYear(this, target, amount, firstDayOfWeek, locale)

/**
 * Return true if the difference from the [target] does not exceed the [amount] weekOfMonth
 */
inline fun Date.differWeekOfMonth(target: Date, amount: Int, firstDayOfWeek: Int? = null, locale: Locale? = null): Boolean = Datex.differWeekOfMonth(this, target, amount, firstDayOfWeek, locale)

/**
 * Return true if the difference from the [target] does not exceed the [amount] dayOfYear
 */
inline fun Date.differDayOfYear(target: Date, amount: Int, locale: Locale? = null): Boolean = Datex.differDayOfYear(this, target, amount, locale)

/**
 * Return true if the difference from the [target] does not exceed the [amount] dayOfMonth
 */
inline fun Date.differDayOfMonth(target: Date, amount: Int, locale: Locale? = null): Boolean = Datex.differDayOfMonth(this, target, amount, locale)

/**
 * Return true if the difference from the [target] does not exceed the [amount] dayOfWeek
 */
inline fun Date.differDayOfWeek(target: Date, amount: Int, firstDayOfWeek: Int? = null, locale: Locale? = null): Boolean = Datex.differDayOfWeek(this, target, amount, firstDayOfWeek, locale)

/**
 * Return true if the difference from the [target] does not exceed the [amount] dayOfWeekInMonth
 */
inline fun Date.differDayOfWeekInMonth(target: Date, amount: Int, firstDayOfWeek: Int? = null, locale: Locale? = null): Boolean = Datex.differDayOfWeekInMonth(this, target, amount, firstDayOfWeek, locale)

/**
 * Return true if the difference from the [target] does not exceed the [amount] hourOfDay
 */
inline fun Date.differHourOfDay(target: Date, amount: Int, locale: Locale? = null): Boolean = Datex.differHourOfDay(this, target, amount, locale)

/**
 * Return true if the difference from the [target] does not exceed the [amount] hour
 */
inline fun Date.differHour(target: Date, amount: Int, locale: Locale? = null): Boolean = Datex.differHour(this, target, amount, locale)

/**
 * Return true if the difference from the [target] does not exceed the [amount] minute
 */
inline fun Date.differMinute(target: Date, amount: Int, locale: Locale? = null): Boolean = Datex.differMinute(this, target, amount, locale)

/**
 * Return true if the difference from the [target] does not exceed the [amount] second
 */
inline fun Date.differSecond(target: Date, amount: Int, locale: Locale? = null): Boolean = Datex.differSecond(this, target, amount, locale)

/**
 * Return true if the difference from the [target] does not exceed the [amount] millisecond
 */
inline fun Date.differMillisecond(target: Date, amount: Int, locale: Locale? = null): Boolean = Datex.differMillisecond(this, target, amount, locale)


/**
 * Return true if the difference from the [target] does not exceed the [amount] year
 */
inline fun Long.differCalendarField(target: Long, field: Int, amount: Int, firstDayOfWeek: Int? = null, locale: Locale? = null): Boolean {
    return Datex.differCalendarField(this, target, field, amount, firstDayOfWeek, locale)
}

/**
 * Return true if the difference from the [target] does not exceed the [amount] year
 */
inline fun Long.differYear(target: Long, amount: Int, locale: Locale? = null): Boolean = Datex.differYear(this, target, amount, locale)

/**
 * Return true if the difference from the [target] does not exceed the [amount] month
 */
inline fun Long.differMonth(target: Long, amount: Int, locale: Locale? = null): Boolean = Datex.differMonth(this, target, amount, locale)

/**
 * Return true if the difference from the [target] does not exceed the [amount] weekOfYear
 */
inline fun Long.differWeekOfYear(target: Long, amount: Int, firstDayOfWeek: Int? = null, locale: Locale? = null): Boolean = Datex.differWeekOfYear(this, target, amount, firstDayOfWeek, locale)

/**
 * Return true if the difference from the [target] does not exceed the [amount] weekOfMonth
 */
inline fun Long.differWeekOfMonth(target: Long, amount: Int, firstDayOfWeek: Int? = null, locale: Locale? = null): Boolean = Datex.differWeekOfMonth(this, target, amount, firstDayOfWeek, locale)

/**
 * Return true if the difference from the [target] does not exceed the [amount] dayOfYear
 */
inline fun Long.differDayOfYear(target: Long, amount: Int, locale: Locale? = null): Boolean = Datex.differDayOfYear(this, target, amount, locale)

/**
 * Return true if the difference from the [target] does not exceed the [amount] dayOfMonth
 */
inline fun Long.differDayOfMonth(target: Long, amount: Int, locale: Locale? = null): Boolean = Datex.differDayOfMonth(this, target, amount, locale)

/**
 * Return true if the difference from the [target] does not exceed the [amount] dayOfWeek
 */
inline fun Long.differDayOfWeek(target: Long, amount: Int, firstDayOfWeek: Int? = null, locale: Locale? = null): Boolean = Datex.differDayOfWeek(this, target, amount, firstDayOfWeek, locale)

/**
 * Return true if the difference from the [target] does not exceed the [amount] dayOfWeekInMonth
 */
inline fun Long.differDayOfWeekInMonth(target: Long, amount: Int, firstDayOfWeek: Int? = null, locale: Locale? = null): Boolean = Datex.differDayOfWeekInMonth(this, target, amount, firstDayOfWeek, locale)

/**
 * Return true if the difference from the [target] does not exceed the [amount] hourOfDay
 */
inline fun Long.differHourOfDay(target: Long, amount: Int, locale: Locale? = null): Boolean = Datex.differHourOfDay(this, target, amount, locale)

/**
 * Return true if the difference from the [target] does not exceed the [amount] hour
 */
inline fun Long.differHour(target: Long, amount: Int, locale: Locale? = null): Boolean = Datex.differHour(this, target, amount, locale)

/**
 * Return true if the difference from the [target] does not exceed the [amount] minute
 */
inline fun Long.differMinute(target: Long, amount: Int, locale: Locale? = null): Boolean = Datex.differMinute(this, target, amount, locale)

/**
 * Return true if the difference from the [target] does not exceed the [amount] second
 */
inline fun Long.differSecond(target: Long, amount: Int, locale: Locale? = null): Boolean = Datex.differSecond(this, target, amount, locale)

/**
 * Return true if the difference from the [target] does not exceed the [amount] millisecond
 */
inline fun Long.differMillisecond(target: Long, amount: Int, locale: Locale? = null): Boolean = Datex.differMillisecond(this, target, amount, locale)