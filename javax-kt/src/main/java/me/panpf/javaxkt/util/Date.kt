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
    return this.toDate(SimpleDateFormat(pattern, locale))
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


fun Date.add(field: Int, amount: Int, timeZone: TimeZone = TimeZone.getDefault(), locale: Locale = Locale.getDefault(Locale.Category.FORMAT)): Date {
    val calendar = Calendar.getInstance(timeZone, locale)
    calendar.timeInMillis = time
    calendar.add(field, amount)
    return Date(calendar.timeInMillis)
}

fun Date.addYear(amount: Int, timeZone: TimeZone = TimeZone.getDefault(), locale: Locale = Locale.getDefault(Locale.Category.FORMAT)): Date {
    return add(Calendar.YEAR, amount, timeZone, locale)
}

fun Date.addMonth(amount: Int, timeZone: TimeZone = TimeZone.getDefault(), locale: Locale = Locale.getDefault(Locale.Category.FORMAT)): Date {
    return add(Calendar.MONTH, amount, timeZone, locale)
}

fun Date.addDayOfWeek(amount: Int, timeZone: TimeZone = TimeZone.getDefault(), locale: Locale = Locale.getDefault(Locale.Category.FORMAT)): Date {
    return add(Calendar.DAY_OF_WEEK, amount, timeZone, locale)
}

fun Date.addDayOfWeekInMonth(amount: Int, timeZone: TimeZone = TimeZone.getDefault(), locale: Locale = Locale.getDefault(Locale.Category.FORMAT)): Date {
    return add(Calendar.DAY_OF_WEEK_IN_MONTH, amount, timeZone, locale)
}

fun Date.addDayOfMonth(amount: Int, timeZone: TimeZone = TimeZone.getDefault(), locale: Locale = Locale.getDefault(Locale.Category.FORMAT)): Date {
    return add(Calendar.DAY_OF_MONTH, amount, timeZone, locale)
}

fun Date.addDayOfYear(amount: Int, timeZone: TimeZone = TimeZone.getDefault(), locale: Locale = Locale.getDefault(Locale.Category.FORMAT)): Date {
    return add(Calendar.DAY_OF_YEAR, amount, timeZone, locale)
}

fun Date.addHour(amount: Int, timeZone: TimeZone = TimeZone.getDefault(), locale: Locale = Locale.getDefault(Locale.Category.FORMAT)): Date {
    return add(Calendar.HOUR, amount, timeZone, locale)
}

fun Date.addHourOfDay(amount: Int, timeZone: TimeZone = TimeZone.getDefault(), locale: Locale = Locale.getDefault(Locale.Category.FORMAT)): Date {
    return add(Calendar.HOUR_OF_DAY, amount, timeZone, locale)
}

fun Date.addMinute(amount: Int, timeZone: TimeZone = TimeZone.getDefault(), locale: Locale = Locale.getDefault(Locale.Category.FORMAT)): Date {
    return add(Calendar.MINUTE, amount, timeZone, locale)
}

fun Date.addSecond(amount: Int, timeZone: TimeZone = TimeZone.getDefault(), locale: Locale = Locale.getDefault(Locale.Category.FORMAT)): Date {
    return add(Calendar.SECOND, amount, timeZone, locale)
}

fun Date.addMillisecond(amount: Int, timeZone: TimeZone = TimeZone.getDefault(), locale: Locale = Locale.getDefault(Locale.Category.FORMAT)): Date {
    return add(Calendar.MILLISECOND, amount, timeZone, locale)
}


/*
 * Compare
 */

fun Calendar.isSameDay(cal2: Calendar): Boolean {
    return this.get(Calendar.ERA) == cal2.get(Calendar.ERA)
            && this.get(Calendar.YEAR) == cal2.get(Calendar.YEAR)
            && this.get(Calendar.DAY_OF_YEAR) == cal2.get(Calendar.DAY_OF_YEAR)
}

fun Date.isSameDay(date2: Date, timeZone: TimeZone = TimeZone.getDefault(), locale: Locale = Locale.getDefault(Locale.Category.FORMAT)): Boolean {
    val cal1 = Calendar.getInstance(timeZone, locale).apply { time = this@isSameDay }
    val cal2 = Calendar.getInstance(timeZone, locale).apply { time = date2 }
    return cal1.isSameDay(cal2)
}

fun Long.isSameDay(date2: Long, timeZone: TimeZone = TimeZone.getDefault(), locale: Locale = Locale.getDefault(Locale.Category.FORMAT)): Boolean {
    val cal1 = Calendar.getInstance(timeZone, locale).apply { timeInMillis = this@isSameDay }
    val cal2 = Calendar.getInstance(timeZone, locale).apply { timeInMillis = date2 }
    return cal1.isSameDay(cal2)
}

// 涉及到周日还是周一是一周的开始的问题

fun Calendar.isSameWeek(cal2: Calendar): Boolean {
    return this.get(Calendar.ERA) == cal2.get(Calendar.ERA)
            && this.get(Calendar.WEEK_OF_YEAR) == cal2.get(Calendar.WEEK_OF_YEAR)
}

fun Date.isSameWeek(date2: Date, timeZone: TimeZone = TimeZone.getDefault(), locale: Locale = Locale.getDefault(Locale.Category.FORMAT)): Boolean {
    val cal1 = Calendar.getInstance(timeZone, locale).apply { time = this@isSameWeek }
    val cal2 = Calendar.getInstance(timeZone, locale).apply { time = date2 }
    return cal1.isSameWeek(cal2)
}

fun Long.isSameWeek(date2: Long, timeZone: TimeZone = TimeZone.getDefault(), locale: Locale = Locale.getDefault(Locale.Category.FORMAT)): Boolean {
    val cal1 = Calendar.getInstance(timeZone, locale).apply { timeInMillis = this@isSameWeek }
    val cal2 = Calendar.getInstance(timeZone, locale).apply { timeInMillis = date2 }
    return cal1.isSameDay(cal2)
}


fun Calendar.isSameMonth(cal2: Calendar): Boolean {
    return this.get(Calendar.ERA) == cal2.get(Calendar.ERA)
            && this.get(Calendar.YEAR) == cal2.get(Calendar.YEAR)
            && this.get(Calendar.MONTH) == cal2.get(Calendar.MONTH)
}

fun Date.isSameMonth(date2: Date, timeZone: TimeZone = TimeZone.getDefault(), locale: Locale = Locale.getDefault(Locale.Category.FORMAT)): Boolean {
    val cal1 = Calendar.getInstance(timeZone, locale).apply { time = this@isSameMonth }
    val cal2 = Calendar.getInstance(timeZone, locale).apply { time = date2 }
    return cal1.isSameMonth(cal2)
}

fun Long.isSameMonth(date2: Long, timeZone: TimeZone = TimeZone.getDefault(), locale: Locale = Locale.getDefault(Locale.Category.FORMAT)): Boolean {
    val cal1 = Calendar.getInstance(timeZone, locale).apply { timeInMillis = this@isSameMonth }
    val cal2 = Calendar.getInstance(timeZone, locale).apply { timeInMillis = date2 }
    return cal1.isSameMonth(cal2)
}


/*
 * Iterator
 */


infix fun Date.dayRangeTo(other: Date) = DayRange(this, other, 1)

infix fun Date.dayDownTo(other: Date) = DayRange(this, other, -1)

infix fun Date.dayUntilTo(other: Date) = DayRange(this, other.addDayOfMonth(-1), 1)

infix fun Date.dayDownUntilTo(other: Date) = DayRange(this, other.addDayOfMonth(1), -1)

// 还要有 YearRange, MonthRange, HourRange, MinuteRange, SecondRange, MillisecondRange

class DayRange(override val start: Date, override val endInclusive: Date, val step: Int) : Iterable<Date>, ClosedRange<Date> {
    override fun iterator(): Iterator<Date> = DayIterator(start, endInclusive, step)
}

class DayIterator(first: Date, private val last: Date, val step: Int) : Iterator<Date> {
    var hasNext: Boolean
    var next: Date

    init {
        // 抽出 day 再比较
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
            // 抽出 day 再比较
            step > 0 -> next <= last
            step < 0 -> next >= last
            else -> false
        }
        return result
    }
}

// 说不得还要出一套 Day、month year、hour、minute、second、millisecond 比大小的方法


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