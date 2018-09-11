package me.panpf.javaxkt.util

import java.text.SimpleDateFormat
import java.util.*
import java.util.Calendar
import java.util.GregorianCalendar




/*
 * Date related extension
 */


/*
 * To
 */


fun String.toDate(format: SimpleDateFormat): Date {
    return format.parse(this)
}

fun String.toDate(pattern: String, locale: Locale = Locale.getDefault(Locale.Category.FORMAT)): Date {
    return toDate(SimpleDateFormat(pattern, locale))
}

fun String.toDateYMD(locale: Locale = Locale.getDefault(Locale.Category.FORMAT)): Date {
    return this.toDate("yyyy-MM-dd", locale)
}

fun String.toDateYMDHM(locale: Locale = Locale.getDefault(Locale.Category.FORMAT)): Date {
    return this.toDate("yyyy-MM-dd HH:mm", locale)
}

fun String.toDateYMDHMS(locale: Locale = Locale.getDefault(Locale.Category.FORMAT)): Date {
    return this.toDate("yyyy-MM-dd HH:mm:ss", locale)
}

fun String.toDateYMDHMSM(locale: Locale = Locale.getDefault(Locale.Category.FORMAT)): Date {
    return this.toDate("yyyy-MM-dd HH:mm:ss SSS", locale)
}

fun String.toDateYMDCompact(locale: Locale = Locale.getDefault(Locale.Category.FORMAT)): Date {
    return this.toDate("yyyyMMdd", locale)
}


/*
 * Format
 */


fun Date.format(format: SimpleDateFormat): String {
    return format.format(this)
}


fun Date.format(pattern: String, locale: Locale = Locale.getDefault(Locale.Category.FORMAT)): String {
    return this.format(SimpleDateFormat(pattern, locale))
}

fun Date.formatYMD(locale: Locale = Locale.getDefault(Locale.Category.FORMAT)): String {
    return format("yyyy-MM-dd", locale)
}

fun Date.formatYMDHM(locale: Locale = Locale.getDefault(Locale.Category.FORMAT)): String {
    return format("yyyy-MM-dd HH:mm", locale)
}

fun Date.formatYMDHMS(locale: Locale = Locale.getDefault(Locale.Category.FORMAT)): String {
    return format("yyyy-MM-dd HH:mm:ss", locale)
}

fun Date.formatYMDHMSM(locale: Locale = Locale.getDefault(Locale.Category.FORMAT)): String {
    return format("yyyy-MM-dd HH:mm:ss SSS", locale)
}

fun Date.formatYMDCompact(locale: Locale = Locale.getDefault(Locale.Category.FORMAT)): String {
    return format("yyyyMMdd", locale)
}


/*
 * Add
 */


fun Date.add(timeZone: TimeZone = TimeZone.getDefault(), locale: Locale = Locale.getDefault(Locale.Category.FORMAT), field: Int, amount: Int): Date {
    val calendar = Calendar.getInstance(timeZone, locale)
    calendar.timeInMillis = time
    calendar.add(field, amount)
    return Date(calendar.timeInMillis)
}

fun Date.addYear(timeZone: TimeZone = TimeZone.getDefault(), locale: Locale = Locale.getDefault(Locale.Category.FORMAT), amount: Int): Date {
    return add(timeZone, locale, Calendar.YEAR, amount)
}

fun Date.addMonth(timeZone: TimeZone = TimeZone.getDefault(), locale: Locale = Locale.getDefault(Locale.Category.FORMAT), amount: Int): Date {
    return add(timeZone, locale, Calendar.MONTH, amount)
}

fun Date.addDayOfMonth(timeZone: TimeZone = TimeZone.getDefault(), locale: Locale = Locale.getDefault(Locale.Category.FORMAT), amount: Int): Date {
    return add(timeZone, locale, Calendar.DAY_OF_MONTH, amount)
}

fun Date.addHourOfDay(timeZone: TimeZone = TimeZone.getDefault(), locale: Locale = Locale.getDefault(Locale.Category.FORMAT), amount: Int): Date {
    return add(timeZone, locale, Calendar.HOUR_OF_DAY, amount)
}

fun Date.addMinute(timeZone: TimeZone = TimeZone.getDefault(), locale: Locale = Locale.getDefault(Locale.Category.FORMAT), amount: Int): Date {
    return add(timeZone, locale, Calendar.MINUTE, amount)
}

fun Date.addSecond(timeZone: TimeZone = TimeZone.getDefault(), locale: Locale = Locale.getDefault(Locale.Category.FORMAT), amount: Int): Date {
    return add(timeZone, locale, Calendar.SECOND, amount)
}

fun Date.addMillisecond(timeZone: TimeZone = TimeZone.getDefault(), locale: Locale = Locale.getDefault(Locale.Category.FORMAT), amount: Int): Date {
    return add(timeZone, locale, Calendar.MILLISECOND, amount)
}


/*
 * Compare
 */

/**
 *
 *
 * Checks if two date objects are on the same day ignoring time.
 *
 *
 *
 *
 *
 * 28 Mar 2002 13:45 and 28 Mar 2002 06:01 would return true. 28 Mar 2002
 * 13:45 and 12 Mar 2002 13:45 would return false.
 *
 *
 * @param date1 the first date, not altered, not null
 * @param date2 the second date, not altered, not null
 * @return true if they represent the same day
 * @throws IllegalArgumentException if either date is `null`
 * @since 2.1
 */
fun isSameDay(date1: Date?, date2: Date?): Boolean {
    if (date1 == null || date2 == null) {
        throw IllegalArgumentException("The date must not be null")
    }
    val cal1 = Calendar.getInstance()
    cal1.time = date1
    val cal2 = Calendar.getInstance()
    cal2.time = date2
    return isSameDay(cal1, cal2)
}

/**
 *
 *
 * Checks if two calendar objects are on the same day ignoring time.
 *
 *
 *
 *
 *
 * 28 Mar 2002 13:45 and 28 Mar 2002 06:01 would return true. 28 Mar 2002
 * 13:45 and 12 Mar 2002 13:45 would return false.
 *
 *
 * @param cal1 the first calendar, not altered, not null
 * @param cal2 the second calendar, not altered, not null
 * @return true if they represent the same day
 * @throws IllegalArgumentException if either calendar is `null`
 * @since 2.1
 */
fun isSameDay(cal1: Calendar?, cal2: Calendar?): Boolean {
    if (cal1 == null || cal2 == null) {
        throw IllegalArgumentException("The date must not be null")
    }
    return (cal1.get(Calendar.ERA) == cal2.get(Calendar.ERA)
            && cal1.get(Calendar.YEAR) == cal2.get(Calendar.YEAR) && cal1
            .get(Calendar.DAY_OF_YEAR) == cal2
            .get(Calendar.DAY_OF_YEAR))
}

/**
 * 相对时间，两个毫秒时间的相对时间在一周之内为true
 *
 * @param ms1
 * @param ms2
 * @return
 */
fun isSameWeek(ms1: Long, ms2: Long): Boolean {
    val res = ms1 - ms2
    return !(res > MILLIS_PER_WEEK || res < -MILLIS_PER_WEEK)
}

/**
 * 相对时间 是否在同一个月内
 *
 * @param ms1
 * @param ms2
 * @return
 */
fun isSameMonth(ms1: Long, ms2: Long): Boolean {
    val res = ms1 - ms2
    return !(res > MILLIS_PER_MONTH || res < -MILLIS_PER_MONTH)
}


/*
 * Iterator
 */


infix operator fun Date.rangeTo(other: Date) = DateRange(this, other, 1)

infix fun Date.downTo(other: Date) = DateRange(this, other, -1)

class DateRange(override val start: Date, override val endInclusive: Date, val step: Int) : Iterable<Date>, ClosedRange<Date> {
    override fun iterator(): Iterator<Date> = DateIterator(start, endInclusive, step)
}

class DateIterator(first: Date, private val last: Date, val step: Int) : Iterator<Date> {
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

    override fun hasNext(): Boolean = hasNext
    override fun next(): Date {
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


fun getNextTime(currentTime: Long, intervalHour: Int, disabledLimits: Array<HourOfDayLimit>?): Long {
    val calendar = GregorianCalendar()
    calendar.timeInMillis = currentTime

    while (true) {
        calendar.add(Calendar.HOUR_OF_DAY, intervalHour)
        val addedStartHourOfDay = calendar.get(Calendar.HOUR_OF_DAY)

        var pass = true
        if (disabledLimits != null && disabledLimits.size > 0) {
            for (hourOfDayLimit in disabledLimits) {
                if (hourOfDayLimit.contains(addedStartHourOfDay)) {
                    pass = false
                    break
                }
            }
        }
        if (pass) {
            break
        }
    }

    return calendar.timeInMillis
}

fun `in`(currentTime: Long, disabledLimits: Array<HourOfDayLimit>?): Boolean {
    val calendar = GregorianCalendar()
    calendar.timeInMillis = currentTime
    if (disabledLimits != null && disabledLimits.size > 0) {
        val hourOfDay = calendar.get(Calendar.HOUR_OF_DAY)
        for (hourOfDayLimit in disabledLimits) {
            if (hourOfDayLimit.contains(hourOfDay)) {
                return true
            }
        }
    }
    return false
}

class HourOfDayLimit(private val startHourOfDay: Int, private val endHourOfDay: Int) {

    operator fun contains(hourOfDay: Int): Boolean {
        return if (startHourOfDay > endHourOfDay) {
            hourOfDay >= startHourOfDay || hourOfDay < endHourOfDay
        } else if (startHourOfDay < endHourOfDay) {
            hourOfDay >= startHourOfDay && hourOfDay < endHourOfDay
        } else {
            hourOfDay == startHourOfDay
        }
    }
}