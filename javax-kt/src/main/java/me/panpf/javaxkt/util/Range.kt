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

package me.panpf.javaxkt.util

import java.text.ParseException
import java.util.*


/*
 * Date range
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
@Throws(ParseException::class)
infix fun String.yearYRangeTo(endInclusive: String): YearRange = this.toDateY().yearRangeTo(endInclusive.toDateY())

/**
 * Create a reversed year range, parsing the formatted date string with 'yyyy'
 */
@Throws(ParseException::class)
infix fun String.yearYDownTo(endInclusive: String): YearRange = this.toDateY().yearDownTo(endInclusive.toDateY())

/**
 * Create a positive-order year range that does not contain [end], parsing the formatted date string with 'yyyy'
 */
@Throws(ParseException::class)
infix fun String.yearYUntilTo(end: String): YearRange = this.toDateY().yearUntilTo(end.toDateY())

/**
 * Create a reversed year range that does not contain [end], parsing the formatted date string with 'yyyy'
 */
@Throws(ParseException::class)
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
@Throws(ParseException::class)
infix fun String.monthYMRangeTo(endInclusive: String): MonthRange = this.toDateYM().monthRangeTo(endInclusive.toDateYM())

/**
 * Create a reversed month range, parsing the formatted date string with 'yyyy-MM'
 */
@Throws(ParseException::class)
infix fun String.monthYMDownTo(endInclusive: String): MonthRange = this.toDateYM().monthDownTo(endInclusive.toDateYM())

/**
 * Create a positive-order month range that does not contain [end], parsing the formatted date string with 'yyyy-MM'
 */
@Throws(ParseException::class)
infix fun String.monthYMUntilTo(end: String): MonthRange = this.toDateYM().monthUntilTo(end.toDateYM())

/**
 * Create a reversed month range that does not contain [end], parsing the formatted date string with 'yyyy-MM'
 */
@Throws(ParseException::class)
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
@Throws(ParseException::class)
infix fun String.dayYMDRangeTo(endInclusive: String): DayRange = this.toDateYMD().dayRangeTo(endInclusive.toDateYMD())

/**
 * Create a reversed day range, parsing the formatted date string with 'yyyy-MM-dd'
 */
@Throws(ParseException::class)
infix fun String.dayYMDDownTo(endInclusive: String): DayRange = this.toDateYMD().dayDownTo(endInclusive.toDateYMD())

/**
 * Create a positive-order day range that does not contain [end], parsing the formatted date string with 'yyyy-MM-dd'
 */
@Throws(ParseException::class)
infix fun String.dayYMDUntilTo(end: String): DayRange = this.toDateYMD().dayUntilTo(end.toDateYMD())

/**
 * Create a reversed day range that does not contain [end], parsing the formatted date string with 'yyyy-MM-dd'
 */
@Throws(ParseException::class)
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
@Throws(ParseException::class)
infix fun String.hourYMDHRangeTo(endInclusive: String): HourRange = this.toDateYMDH().hourRangeTo(endInclusive.toDateYMDH())

/**
 * Create a reversed hour range, parsing the formatted date string with 'yyyy-MM-dd HH'
 */
@Throws(ParseException::class)
infix fun String.hourYMDHDownTo(endInclusive: String): HourRange = this.toDateYMDH().hourDownTo(endInclusive.toDateYMDH())

/**
 * Create a positive-order hour range that does not contain [end], parsing the formatted date string with 'yyyy-MM-dd HH'
 */
@Throws(ParseException::class)
infix fun String.hourYMDHUntilTo(end: String): HourRange = this.toDateYMDH().hourUntilTo(end.toDateYMDH())

/**
 * Create a reversed hour range that does not contain [end], parsing the formatted date string with 'yyyy-MM-dd HH'
 */
@Throws(ParseException::class)
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
@Throws(ParseException::class)
infix fun String.minuteYMDHMRangeTo(endInclusive: String): MinuteRange = this.toDateYMDHM().minuteRangeTo(endInclusive.toDateYMDHM())

/**
 * Create a reversed minute range, parsing the formatted date string with 'yyyy-MM-dd HH:mm'
 */
@Throws(ParseException::class)
infix fun String.minuteYMDHMDownTo(endInclusive: String): MinuteRange = this.toDateYMDHM().minuteDownTo(endInclusive.toDateYMDHM())

/**
 * Create a positive-order minute range that does not contain [end], parsing the formatted date string with 'yyyy-MM-dd HH:mm'
 */
@Throws(ParseException::class)
infix fun String.minuteYMDHMUntilTo(end: String): MinuteRange = this.toDateYMDHM().minuteUntilTo(end.toDateYMDHM())

/**
 * Create a reversed minute range that does not contain [end], parsing the formatted date string with 'yyyy-MM-dd HH:mm'
 */
@Throws(ParseException::class)
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
@Throws(ParseException::class)
infix fun String.secondYMDHMSRangeTo(endInclusive: String): SecondRange = this.toDateYMDHMS().secondRangeTo(endInclusive.toDateYMDHMS())

/**
 * Create a reversed second range, parsing the formatted date string with 'yyyy-MM-dd HH:mm:ss'
 */
@Throws(ParseException::class)
infix fun String.secondYMDHMSDownTo(endInclusive: String): SecondRange = this.toDateYMDHMS().secondDownTo(endInclusive.toDateYMDHMS())

/**
 * Create a positive-order second range that does not contain [end], parsing the formatted date string with 'yyyy-MM-dd HH:mm:ss'
 */
@Throws(ParseException::class)
infix fun String.secondYMDHMSUntilTo(end: String): SecondRange = this.toDateYMDHMS().secondUntilTo(end.toDateYMDHMS())

/**
 * Create a reversed second range that does not contain [end], parsing the formatted date string with 'yyyy-MM-dd HH:mm:ss'
 */
@Throws(ParseException::class)
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
@Throws(ParseException::class)
infix fun String.millisecondYMDHMSMRangeTo(endInclusive: String): MillisecondRange = this.toDateYMDHMSM().millisecondRangeTo(endInclusive.toDateYMDHMSM())

/**
 * Create a reversed millisecond range, parsing the formatted date string with 'yyyy-MM-dd HH:mm:ss SSS'
 */
@Throws(ParseException::class)
infix fun String.millisecondYMDHMSMDownTo(endInclusive: String): MillisecondRange = this.toDateYMDHMSM().millisecondDownTo(endInclusive.toDateYMDHMSM())

/**
 * Create a positive-order millisecond range that does not contain [end], parsing the formatted date string with 'yyyy-MM-dd HH:mm:ss SSS'
 */
@Throws(ParseException::class)
infix fun String.millisecondYMDHMSMUntilTo(end: String): MillisecondRange = this.toDateYMDHMSM().millisecondUntilTo(end.toDateYMDHMSM())

/**
 * Create a reversed millisecond range that does not contain [end], parsing the formatted date string with 'yyyy-MM-dd HH:mm:ss SSS'
 */
@Throws(ParseException::class)
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