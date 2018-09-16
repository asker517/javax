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

// todo 支持 step

/**
 * Returns a progression from this value down to the specified [to] value with the step -1.
 *
 * The [to] value should be less than or equal to `this` value.
 * If the [to] value is greater than `this` value the returned progression is empty.
 */
infix fun Byte.downUntilTo(to: Byte): IntProgression {
    return IntProgression.fromClosedRange(this.toInt(), to.toInt() + 1, -1)
}

/**
 * Returns a progression from this value down to the specified [to] value with the step -1.
 *
 * The [to] value should be less than or equal to `this` value.
 * If the [to] value is greater than `this` value the returned progression is empty.
 */
infix fun Byte.downUntilTo(to: Short): IntProgression {
    return IntProgression.fromClosedRange(this.toInt(), to.toInt() + 1, -1)
}

/**
 * Returns a progression from this value down to the specified [to] value with the step -1.
 *
 * The [to] value should be less than or equal to `this` value.
 * If the [to] value is greater than `this` value the returned progression is empty.
 */
infix fun Byte.downUntilTo(to: Int): IntProgression {
    return IntProgression.fromClosedRange(this.toInt(), to + 1, -1)
}

/**
 * Returns a progression from this value down to the specified [to] value with the step -1.
 *
 * The [to] value should be less than or equal to `this` value.
 * If the [to] value is greater than `this` value the returned progression is empty.
 */
infix fun Byte.downUntilTo(to: Long): LongProgression {
    return LongProgression.fromClosedRange(this.toLong(), to + 1, -1L)
}


/**
 * Returns a progression from this value down to the specified [to] value with the step -1.
 *
 * The [to] value should be less than or equal to `this` value.
 * If the [to] value is greater than `this` value the returned progression is empty.
 */
infix fun Short.downUntilTo(to: Byte): IntProgression {
    return IntProgression.fromClosedRange(this.toInt(), to.toInt() + 1, -1)
}

/**
 * Returns a progression from this value down to the specified [to] value with the step -1.
 *
 * The [to] value should be less than or equal to `this` value.
 * If the [to] value is greater than `this` value the returned progression is empty.
 */
infix fun Short.downUntilTo(to: Short): IntProgression {
    return IntProgression.fromClosedRange(this.toInt(), to.toInt() + 1, -1)
}

/**
 * Returns a progression from this value down to the specified [to] value with the step -1.
 *
 * The [to] value should be less than or equal to `this` value.
 * If the [to] value is greater than `this` value the returned progression is empty.
 */
infix fun Short.downUntilTo(to: Int): IntProgression {
    return IntProgression.fromClosedRange(this.toInt(), to + 1, -1)
}

/**
 * Returns a progression from this value down to the specified [to] value with the step -1.
 *
 * The [to] value should be less than or equal to `this` value.
 * If the [to] value is greater than `this` value the returned progression is empty.
 */
infix fun Short.downUntilTo(to: Long): LongProgression {
    return LongProgression.fromClosedRange(this.toLong(), to + 1, -1L)
}


/**
 * Returns a progression from this value down to the specified [to] value with the step -1.
 *
 * The [to] value should be less than or equal to `this` value.
 * If the [to] value is greater than `this` value the returned progression is empty.
 */
infix fun Int.downUntilTo(to: Byte): IntProgression {
    return IntProgression.fromClosedRange(this, to.toInt() + 1, -1)
}

/**
 * Returns a progression from this value down to the specified [to] value with the step -1.
 *
 * The [to] value should be less than or equal to `this` value.
 * If the [to] value is greater than `this` value the returned progression is empty.
 */
infix fun Int.downUntilTo(to: Short): IntProgression {
    return IntProgression.fromClosedRange(this, to.toInt() + 1, -1)
}

/**
 * Returns a progression from this value down to the specified [to] value with the step -1.
 *
 * The [to] value should be less than or equal to `this` value.
 * If the [to] value is greater than `this` value the returned progression is empty.
 */
infix fun Int.downUntilTo(to: Int): IntProgression {
    return IntProgression.fromClosedRange(this, to + 1, -1)
}

/**
 * Returns a progression from this value down to the specified [to] value with the step -1.
 *
 * The [to] value should be less than or equal to `this` value.
 * If the [to] value is greater than `this` value the returned progression is empty.
 */
infix fun Int.downUntilTo(to: Long): LongProgression {
    return LongProgression.fromClosedRange(this.toLong(), to + 1, -1L)
}


/**
 * Returns a progression from this value down to the specified [to] value with the step -1.
 *
 * The [to] value should be less than or equal to `this` value.
 * If the [to] value is greater than `this` value the returned progression is empty.
 */
infix fun Long.downUntilTo(to: Byte): LongProgression {
    return LongProgression.fromClosedRange(this, to.toLong() + 1, -1L)
}

/**
 * Returns a progression from this value down to the specified [to] value with the step -1.
 *
 * The [to] value should be less than or equal to `this` value.
 * If the [to] value is greater than `this` value the returned progression is empty.
 */
infix fun Long.downUntilTo(to: Short): LongProgression {
    return LongProgression.fromClosedRange(this, to.toLong() + 1, -1L)
}

/**
 * Returns a progression from this value down to the specified [to] value with the step -1.
 *
 * The [to] value should be less than or equal to `this` value.
 * If the [to] value is greater than `this` value the returned progression is empty.
 */
infix fun Long.downUntilTo(to: Int): LongProgression {
    return LongProgression.fromClosedRange(this, to.toLong() + 1, -1L)
}

/**
 * Returns a progression from this value down to the specified [to] value with the step -1.
 *
 * The [to] value should be less than or equal to `this` value.
 * If the [to] value is greater than `this` value the returned progression is empty.
 */
infix fun Long.downUntilTo(to: Long): LongProgression {
    return LongProgression.fromClosedRange(this, to + 1, -1L)
}


/**
 * Returns a progression from this value down to the specified [to] value with the step -1.
 *
 * The [to] value should be less than or equal to `this` value.
 * If the [to] value is greater than `this` value the returned progression is empty.
 */
infix fun Char.downUntilTo(to: Char): CharProgression {
    return CharProgression.fromClosedRange(this, to + 1, -1)
}


/* ******************************************* Year range ******************************************* */


/**
 * Create a positive-order year ranges
 */
fun Date.yearRangeTo(endInclusive: Date, step: Int): YearRange = YearRange(this, endInclusive, step)

/**
 * Create a positive-order year ranges
 */
infix fun Date.yearRangeTo(endInclusive: Date): YearRange = yearRangeTo(endInclusive, 1)

/**
 * Create a positive-order year ranges
 */
fun Long.yearRangeTo(endInclusive: Long, step: Int): YearRange = this.toDate().yearRangeTo(endInclusive.toDate(), step)

/**
 * Create a positive-order year ranges
 */
infix fun Long.yearRangeTo(endInclusive: Long): YearRange = yearRangeTo(endInclusive, 1)

/**
 * Create a positive-order year ranges, parsing the formatted date string with 'yyyy'
 */
@Throws(ParseException::class)
fun String.yearYRangeTo(endInclusive: String, step: Int): YearRange = this.toDateY().yearRangeTo(endInclusive.toDateY(), step)

/**
 * Create a positive-order year ranges, parsing the formatted date string with 'yyyy'
 */
@Throws(ParseException::class)
infix fun String.yearYRangeTo(endInclusive: String): YearRange = this.yearYRangeTo(endInclusive, 1)


/**
 * Create a positive-order year range that does not contain [end]
 */
fun Date.yearUntilTo(end: Date, step: Int): YearRange = YearRange(this, end.addYear(-1), step)

/**
 * Create a positive-order year range that does not contain [end]
 */
infix fun Date.yearUntilTo(end: Date): YearRange = yearUntilTo(end, 1)

/**
 * Create a positive-order year range that does not contain [end]
 */
fun Long.yearUntilTo(end: Long, step: Int): YearRange = this.toDate().yearUntilTo(end.toDate(), step)

/**
 * Create a positive-order year range that does not contain [end]
 */
infix fun Long.yearUntilTo(end: Long): YearRange = yearUntilTo(end, 1)

/**
 * Create a positive-order year range that does not contain [end], parsing the formatted date string with 'yyyy'
 */
@Throws(ParseException::class)
fun String.yearYUntilTo(end: String, step: Int): YearRange = this.toDateY().yearUntilTo(end.toDateY(), step)

/**
 * Create a positive-order year range that does not contain [end], parsing the formatted date string with 'yyyy'
 */
@Throws(ParseException::class)
infix fun String.yearYUntilTo(end: String): YearRange = yearYUntilTo(end, 1)


/**
 * Create a reversed year range
 */
fun Date.yearDownTo(endInclusive: Date, step: Int): YearRange = YearRange(this, endInclusive, step)

/**
 * Create a reversed year range
 */
infix fun Date.yearDownTo(endInclusive: Date): YearRange = yearDownTo(endInclusive, -1)

/**
 * Create a reversed year range
 */
fun Long.yearDownTo(endInclusive: Long, step: Int): YearRange = this.toDate().yearDownTo(endInclusive.toDate(), step)

/**
 * Create a reversed year range
 */
infix fun Long.yearDownTo(endInclusive: Long): YearRange = yearDownTo(endInclusive, -1)

/**
 * Create a reversed year range, parsing the formatted date string with 'yyyy'
 */
@Throws(ParseException::class)
fun String.yearYDownTo(endInclusive: String, step: Int): YearRange = this.toDateY().yearDownTo(endInclusive.toDateY(), step)

/**
 * Create a reversed year range, parsing the formatted date string with 'yyyy'
 */
@Throws(ParseException::class)
infix fun String.yearYDownTo(endInclusive: String): YearRange = yearYDownTo(endInclusive, -1)


/**
 * Create a reversed year range that does not contain [end]
 */
fun Date.yearDownUntilTo(end: Date, step: Int): YearRange = YearRange(this, end.addYear(1), step)

/**
 * Create a reversed year range that does not contain [end]
 */
infix fun Date.yearDownUntilTo(end: Date): YearRange = yearDownUntilTo(end.addYear(1), -1)

/**
 * Create a reversed year range that does not contain [end]
 */
fun Long.yearDownUntilTo(end: Long, step: Int): YearRange = this.toDate().yearDownUntilTo(end.toDate(), step)

/**
 * Create a reversed year range that does not contain [end]
 */
infix fun Long.yearDownUntilTo(end: Long): YearRange = yearDownUntilTo(end, -1)

/**
 * Create a reversed year range that does not contain [end], parsing the formatted date string with 'yyyy'
 */
@Throws(ParseException::class)
fun String.yearYDownUntilTo(end: String, step: Int): YearRange = this.toDateY().yearDownUntilTo(end.toDateY(), step)

/**
 * Create a reversed year range that does not contain [end], parsing the formatted date string with 'yyyy'
 */
@Throws(ParseException::class)
infix fun String.yearYDownUntilTo(end: String): YearRange = yearYDownUntilTo(end, -1)


/* ******************************************* Month range ******************************************* */


/**
 * Create a positive-order month ranges
 */
fun Date.monthRangeTo(endInclusive: Date, step: Int): MonthRange = MonthRange(this, endInclusive, step)

/**
 * Create a positive-order month ranges
 */
infix fun Date.monthRangeTo(endInclusive: Date): MonthRange = monthRangeTo(endInclusive, 1)

/**
 * Create a positive-order month ranges
 */
fun Long.monthRangeTo(endInclusive: Long, step: Int): MonthRange = this.toDate().monthRangeTo(endInclusive.toDate(), step)

/**
 * Create a positive-order month ranges
 */
infix fun Long.monthRangeTo(endInclusive: Long): MonthRange = monthRangeTo(endInclusive, 1)

/**
 * Create a positive-order month ranges, parsing the formatted date string with 'yyyy-MM'
 */
@Throws(ParseException::class)
fun String.monthYMRangeTo(endInclusive: String, step: Int): MonthRange = this.toDateYM().monthRangeTo(endInclusive.toDateYM(), step)

/**
 * Create a positive-order month ranges, parsing the formatted date string with 'yyyy-MM'
 */
@Throws(ParseException::class)
infix fun String.monthYMRangeTo(endInclusive: String): MonthRange = monthYMRangeTo(endInclusive, 1)


/**
 * Create a positive-order month range that does not contain [end]
 */
fun Date.monthUntilTo(end: Date, step: Int): MonthRange = MonthRange(this, end.addMonth(-1), step)

/**
 * Create a positive-order month range that does not contain [end]
 */
infix fun Date.monthUntilTo(end: Date): MonthRange = monthUntilTo(end, 1)

/**
 * Create a positive-order month range that does not contain [end]
 */
fun Long.monthUntilTo(end: Long, step: Int): MonthRange = this.toDate().monthUntilTo(end.toDate(), step)

/**
 * Create a positive-order month range that does not contain [end]
 */
infix fun Long.monthUntilTo(end: Long): MonthRange = monthUntilTo(end, 1)

/**
 * Create a positive-order month range that does not contain [end], parsing the formatted date string with 'yyyy-MM'
 */
@Throws(ParseException::class)
fun String.monthYMUntilTo(end: String, step: Int): MonthRange = this.toDateYM().monthUntilTo(end.toDateYM(), step)

/**
 * Create a positive-order month range that does not contain [end], parsing the formatted date string with 'yyyy-MM'
 */
@Throws(ParseException::class)
infix fun String.monthYMUntilTo(end: String): MonthRange = monthYMUntilTo(end, 1)


/**
 * Create a reversed month range
 */
fun Date.monthDownTo(endInclusive: Date, step: Int): MonthRange = MonthRange(this, endInclusive, step)

/**
 * Create a reversed month range
 */
infix fun Date.monthDownTo(endInclusive: Date): MonthRange = monthDownTo(endInclusive, -1)

/**
 * Create a reversed month range
 */
fun Long.monthDownTo(endInclusive: Long, step: Int): MonthRange = this.toDate().monthDownTo(endInclusive.toDate(), step)

/**
 * Create a reversed month range
 */
infix fun Long.monthDownTo(endInclusive: Long): MonthRange = monthDownTo(endInclusive, -1)

/**
 * Create a reversed month range, parsing the formatted date string with 'yyyy-MM'
 */
@Throws(ParseException::class)
fun String.monthYMDownTo(endInclusive: String, step: Int): MonthRange = this.toDateYM().monthDownTo(endInclusive.toDateYM(), step)

/**
 * Create a reversed month range, parsing the formatted date string with 'yyyy-MM'
 */
@Throws(ParseException::class)
infix fun String.monthYMDownTo(endInclusive: String): MonthRange = monthYMDownTo(endInclusive, -1)


/**
 * Create a reversed month range that does not contain [end]
 */
fun Date.monthDownUntilTo(end: Date, step: Int): MonthRange = MonthRange(this, end.addMonth(1), step)

/**
 * Create a reversed month range that does not contain [end]
 */
infix fun Date.monthDownUntilTo(end: Date): MonthRange = monthDownUntilTo(end, -1)

/**
 * Create a reversed month range that does not contain [end]
 */
fun Long.monthDownUntilTo(end: Long, step: Int): MonthRange = this.toDate().monthDownUntilTo(end.toDate(), step)

/**
 * Create a reversed month range that does not contain [end]
 */
infix fun Long.monthDownUntilTo(end: Long): MonthRange = monthDownUntilTo(end, -1)

/**
 * Create a reversed month range that does not contain [end], parsing the formatted date string with 'yyyy-MM'
 */
@Throws(ParseException::class)
fun String.monthYMDownUntilTo(end: String, step: Int): MonthRange = this.toDateYM().monthDownUntilTo(end.toDateYM(), step)

/**
 * Create a reversed month range that does not contain [end], parsing the formatted date string with 'yyyy-MM'
 */
@Throws(ParseException::class)
infix fun String.monthYMDownUntilTo(end: String): MonthRange = monthYMDownUntilTo(end, -1)


/* ******************************************* Day range ******************************************* */


/**
 * Create a positive-order day ranges
 */
fun Date.dayRangeTo(endInclusive: Date, step: Int): DayRange = DayRange(this, endInclusive, step)

/**
 * Create a positive-order day ranges
 */
infix fun Date.dayRangeTo(endInclusive: Date): DayRange = dayRangeTo(endInclusive, 1)

/**
 * Create a positive-order day ranges
 */
fun Long.dayRangeTo(endInclusive: Long, step: Int): DayRange = this.toDate().dayRangeTo(endInclusive.toDate(), step)

/**
 * Create a positive-order day ranges
 */
infix fun Long.dayRangeTo(endInclusive: Long): DayRange = dayRangeTo(endInclusive, 1)

/**
 * Create a positive-order day ranges, parsing the formatted date string with 'yyyy-MM-dd'
 */
@Throws(ParseException::class)
fun String.dayYMDRangeTo(endInclusive: String, step: Int): DayRange = this.toDateYMD().dayRangeTo(endInclusive.toDateYMD(), step)

/**
 * Create a positive-order day ranges, parsing the formatted date string with 'yyyy-MM-dd'
 */
@Throws(ParseException::class)
infix fun String.dayYMDRangeTo(endInclusive: String): DayRange = dayYMDRangeTo(endInclusive, 1)


/**
 * Create a positive-order day range that does not contain [end]
 */
fun Date.dayUntilTo(end: Date, step: Int): DayRange = DayRange(this, end.addDayOfMonth(-1), step)

/**
 * Create a positive-order day range that does not contain [end]
 */
infix fun Date.dayUntilTo(end: Date): DayRange = dayUntilTo(end, 1)

/**
 * Create a positive-order day range that does not contain [end]
 */
fun Long.dayUntilTo(end: Long, step: Int): DayRange = this.toDate().dayUntilTo(end.toDate(), step)

/**
 * Create a positive-order day range that does not contain [end]
 */
infix fun Long.dayUntilTo(end: Long): DayRange = dayUntilTo(end, 1)

/**
 * Create a positive-order day range that does not contain [end], parsing the formatted date string with 'yyyy-MM-dd'
 */
@Throws(ParseException::class)
fun String.dayYMDUntilTo(end: String, step: Int): DayRange = this.toDateYMD().dayUntilTo(end.toDateYMD(), step)

/**
 * Create a positive-order day range that does not contain [end], parsing the formatted date string with 'yyyy-MM-dd'
 */
@Throws(ParseException::class)
infix fun String.dayYMDUntilTo(end: String): DayRange = dayYMDUntilTo(end, 1)


/**
 * Create a reversed day range
 */
fun Date.dayDownTo(endInclusive: Date, step: Int): DayRange = DayRange(this, endInclusive, step)

/**
 * Create a reversed day range
 */
infix fun Date.dayDownTo(endInclusive: Date): DayRange = dayDownTo(endInclusive, -1)

/**
 * Create a reversed day range
 */
fun Long.dayDownTo(endInclusive: Long, step: Int): DayRange = this.toDate().dayDownTo(endInclusive.toDate(), step)

/**
 * Create a reversed day range
 */
infix fun Long.dayDownTo(endInclusive: Long): DayRange = dayDownTo(endInclusive, -1)

/**
 * Create a reversed day range, parsing the formatted date string with 'yyyy-MM-dd'
 */
@Throws(ParseException::class)
fun String.dayYMDDownTo(endInclusive: String, step: Int): DayRange = this.toDateYMD().dayDownTo(endInclusive.toDateYMD(), step)

/**
 * Create a reversed day range, parsing the formatted date string with 'yyyy-MM-dd'
 */
@Throws(ParseException::class)
infix fun String.dayYMDDownTo(endInclusive: String): DayRange = dayYMDDownTo(endInclusive, -1)


/**
 * Create a reversed day range that does not contain [end]
 */
fun Date.dayDownUntilTo(end: Date, step: Int): DayRange = DayRange(this, end.addDayOfMonth(1), step)


/**
 * Create a reversed day range that does not contain [end]
 */
infix fun Date.dayDownUntilTo(end: Date): DayRange = dayDownUntilTo(end, -1)

/**
 * Create a reversed day range that does not contain [end]
 */
fun Long.dayDownUntilTo(end: Long, step: Int): DayRange = this.toDate().dayDownUntilTo(end.toDate(), step)

/**
 * Create a reversed day range that does not contain [end]
 */
infix fun Long.dayDownUntilTo(end: Long): DayRange = dayDownUntilTo(end, -1)

/**
 * Create a reversed day range that does not contain [end], parsing the formatted date string with 'yyyy-MM-dd'
 */
@Throws(ParseException::class)
fun String.dayYMDDownUntilTo(end: String, step: Int): DayRange = this.toDateYMD().dayDownUntilTo(end.toDateYMD(), step)

/**
 * Create a reversed day range that does not contain [end], parsing the formatted date string with 'yyyy-MM-dd'
 */
@Throws(ParseException::class)
infix fun String.dayYMDDownUntilTo(end: String): DayRange = dayYMDDownUntilTo(end, -1)


/* ******************************************* Hour range ******************************************* */


/**
 * Create a positive-order hour ranges
 */
fun Date.hourRangeTo(endInclusive: Date, step: Int): HourRange = HourRange(this, endInclusive, step)

/**
 * Create a positive-order hour ranges
 */
infix fun Date.hourRangeTo(endInclusive: Date): HourRange = hourRangeTo(endInclusive, 1)

/**
 * Create a positive-order hour ranges
 */
fun Long.hourRangeTo(endInclusive: Long, step: Int): HourRange = this.toDate().hourRangeTo(endInclusive.toDate(), step)

/**
 * Create a positive-order hour ranges
 */
infix fun Long.hourRangeTo(endInclusive: Long): HourRange = hourRangeTo(endInclusive, 1)

/**
 * Create a positive-order hour ranges, parsing the formatted date string with 'yyyy-MM-dd HH'
 */
@Throws(ParseException::class)
fun String.hourYMDHRangeTo(endInclusive: String, step: Int): HourRange = this.toDateYMDH().hourRangeTo(endInclusive.toDateYMDH(), step)

/**
 * Create a positive-order hour ranges, parsing the formatted date string with 'yyyy-MM-dd HH'
 */
@Throws(ParseException::class)
infix fun String.hourYMDHRangeTo(endInclusive: String): HourRange = hourYMDHRangeTo(endInclusive, 1)


/**
 * Create a positive-order hour range that does not contain [end]
 */
fun Date.hourUntilTo(end: Date, step: Int): HourRange = HourRange(this, end.addHourOfDay(-1), step)

/**
 * Create a positive-order hour range that does not contain [end]
 */
infix fun Date.hourUntilTo(end: Date): HourRange = hourUntilTo(end, 1)

/**
 * Create a positive-order hour range that does not contain [end]
 */
fun Long.hourUntilTo(end: Long, step: Int): HourRange = this.toDate().hourUntilTo(end.toDate(), step)

/**
 * Create a positive-order hour range that does not contain [end]
 */
infix fun Long.hourUntilTo(end: Long): HourRange = hourUntilTo(end, 1)

/**
 * Create a positive-order hour range that does not contain [end], parsing the formatted date string with 'yyyy-MM-dd HH'
 */
@Throws(ParseException::class)
fun String.hourYMDHUntilTo(end: String, step: Int): HourRange = this.toDateYMDH().hourUntilTo(end.toDateYMDH(), step)

/**
 * Create a positive-order hour range that does not contain [end], parsing the formatted date string with 'yyyy-MM-dd HH'
 */
@Throws(ParseException::class)
infix fun String.hourYMDHUntilTo(end: String): HourRange = hourYMDHUntilTo(end, 1)


/**
 * Create a reversed hour range
 */
fun Date.hourDownTo(endInclusive: Date, step: Int): HourRange = HourRange(this, endInclusive, step)

/**
 * Create a reversed hour range
 */
infix fun Date.hourDownTo(endInclusive: Date): HourRange = hourDownTo(endInclusive, -1)

/**
 * Create a reversed hour range
 */
fun Long.hourDownTo(endInclusive: Long, step: Int): HourRange = this.toDate().hourDownTo(endInclusive.toDate(), step)

/**
 * Create a reversed hour range
 */
infix fun Long.hourDownTo(endInclusive: Long): HourRange = hourDownTo(endInclusive, -1)

/**
 * Create a reversed hour range, parsing the formatted date string with 'yyyy-MM-dd HH'
 */
@Throws(ParseException::class)
fun String.hourYMDHDownTo(endInclusive: String, step: Int): HourRange = this.toDateYMDH().hourDownTo(endInclusive.toDateYMDH(), step)

/**
 * Create a reversed hour range, parsing the formatted date string with 'yyyy-MM-dd HH'
 */
@Throws(ParseException::class)
infix fun String.hourYMDHDownTo(endInclusive: String): HourRange = hourYMDHDownTo(endInclusive, -1)


/**
 * Create a reversed hour range that does not contain [end]
 */
fun Date.hourDownUntilTo(end: Date, step: Int): HourRange = HourRange(this, end.addHourOfDay(1), step)

/**
 * Create a reversed hour range that does not contain [end]
 */
infix fun Date.hourDownUntilTo(end: Date): HourRange = hourDownUntilTo(end, -1)

/**
 * Create a reversed hour range that does not contain [end]
 */
fun Long.hourDownUntilTo(end: Long, step: Int): HourRange = this.toDate().hourDownUntilTo(end.toDate(), step)

/**
 * Create a reversed hour range that does not contain [end]
 */
infix fun Long.hourDownUntilTo(end: Long): HourRange = hourDownUntilTo(end, -1)

/**
 * Create a reversed hour range that does not contain [end], parsing the formatted date string with 'yyyy-MM-dd HH'
 */
@Throws(ParseException::class)
fun String.hourYMDHDownUntilTo(end: String, step: Int): HourRange = this.toDateYMDH().hourDownUntilTo(end.toDateYMDH(), step)

/**
 * Create a reversed hour range that does not contain [end], parsing the formatted date string with 'yyyy-MM-dd HH'
 */
@Throws(ParseException::class)
infix fun String.hourYMDHDownUntilTo(end: String): HourRange = hourYMDHDownUntilTo(end, -1)


/* ******************************************* Minute range ******************************************* */


/**
 * Create a positive-order minute ranges
 */
fun Date.minuteRangeTo(endInclusive: Date, step: Int): MinuteRange = MinuteRange(this, endInclusive, step)

/**
 * Create a positive-order minute ranges
 */
infix fun Date.minuteRangeTo(endInclusive: Date): MinuteRange = minuteRangeTo(endInclusive, 1)

/**
 * Create a positive-order minute ranges
 */
fun Long.minuteRangeTo(endInclusive: Long, step: Int): MinuteRange = this.toDate().minuteRangeTo(endInclusive.toDate(), step)

/**
 * Create a positive-order minute ranges
 */
infix fun Long.minuteRangeTo(endInclusive: Long): MinuteRange = minuteRangeTo(endInclusive, 1)

/**
 * Create a positive-order minute ranges, parsing the formatted date string with 'yyyy-MM-dd HH:mm'
 */
@Throws(ParseException::class)
fun String.minuteYMDHMRangeTo(endInclusive: String, step: Int): MinuteRange = this.toDateYMDHM().minuteRangeTo(endInclusive.toDateYMDHM(), step)

/**
 * Create a positive-order minute ranges, parsing the formatted date string with 'yyyy-MM-dd HH:mm'
 */
@Throws(ParseException::class)
infix fun String.minuteYMDHMRangeTo(endInclusive: String): MinuteRange = minuteYMDHMRangeTo(endInclusive, 1)


/**
 * Create a positive-order minute range that does not contain [end]
 */
fun Date.minuteUntilTo(end: Date, step: Int): MinuteRange = MinuteRange(this, end.addMinute(-1), step)

/**
 * Create a positive-order minute range that does not contain [end]
 */
infix fun Date.minuteUntilTo(end: Date): MinuteRange = minuteUntilTo(end, 1)

/**
 * Create a positive-order minute range that does not contain [end]
 */
fun Long.minuteUntilTo(end: Long, step: Int): MinuteRange = this.toDate().minuteUntilTo(end.toDate(), step)

/**
 * Create a positive-order minute range that does not contain [end]
 */
infix fun Long.minuteUntilTo(end: Long): MinuteRange = minuteUntilTo(end, 1)

/**
 * Create a positive-order minute range that does not contain [end], parsing the formatted date string with 'yyyy-MM-dd HH:mm'
 */
@Throws(ParseException::class)
fun String.minuteYMDHMUntilTo(end: String, step: Int): MinuteRange = this.toDateYMDHM().minuteUntilTo(end.toDateYMDHM(), step)

/**
 * Create a positive-order minute range that does not contain [end], parsing the formatted date string with 'yyyy-MM-dd HH:mm'
 */
@Throws(ParseException::class)
infix fun String.minuteYMDHMUntilTo(end: String): MinuteRange = minuteYMDHMUntilTo(end, 1)


/**
 * Create a reversed minute range
 */
fun Date.minuteDownTo(endInclusive: Date, step: Int): MinuteRange = MinuteRange(this, endInclusive, step)

/**
 * Create a reversed minute range
 */
infix fun Date.minuteDownTo(endInclusive: Date): MinuteRange = minuteDownTo(endInclusive, -1)

/**
 * Create a reversed minute range
 */
fun Long.minuteDownTo(endInclusive: Long, step: Int): MinuteRange = this.toDate().minuteDownTo(endInclusive.toDate(), step)

/**
 * Create a reversed minute range
 */
infix fun Long.minuteDownTo(endInclusive: Long): MinuteRange = minuteDownTo(endInclusive, -1)

/**
 * Create a reversed minute range, parsing the formatted date string with 'yyyy-MM-dd HH:mm'
 */
@Throws(ParseException::class)
fun String.minuteYMDHMDownTo(endInclusive: String, step: Int): MinuteRange = this.toDateYMDHM().minuteDownTo(endInclusive.toDateYMDHM(), step)

/**
 * Create a reversed minute range, parsing the formatted date string with 'yyyy-MM-dd HH:mm'
 */
@Throws(ParseException::class)
infix fun String.minuteYMDHMDownTo(endInclusive: String): MinuteRange = minuteYMDHMDownTo(endInclusive, -1)


/**
 * Create a reversed minute range that does not contain [end]
 */
fun Date.minuteDownUntilTo(end: Date, step: Int): MinuteRange = MinuteRange(this, end.addMinute(1), step)

/**
 * Create a reversed minute range that does not contain [end]
 */
infix fun Date.minuteDownUntilTo(end: Date): MinuteRange = minuteDownUntilTo(end, -1)

/**
 * Create a reversed minute range that does not contain [end]
 */
fun Long.minuteDownUntilTo(end: Long, step: Int): MinuteRange = this.toDate().minuteDownUntilTo(end.toDate(), step)

/**
 * Create a reversed minute range that does not contain [end]
 */
infix fun Long.minuteDownUntilTo(end: Long): MinuteRange = minuteDownUntilTo(end, -1)

/**
 * Create a reversed minute range that does not contain [end], parsing the formatted date string with 'yyyy-MM-dd HH:mm'
 */
@Throws(ParseException::class)
fun String.minuteYMDHMDownUntilTo(end: String, step: Int): MinuteRange = this.toDateYMDHM().minuteDownUntilTo(end.toDateYMDHM(), step)

/**
 * Create a reversed minute range that does not contain [end], parsing the formatted date string with 'yyyy-MM-dd HH:mm'
 */
@Throws(ParseException::class)
infix fun String.minuteYMDHMDownUntilTo(end: String): MinuteRange = minuteYMDHMDownUntilTo(end, -1)


/* ******************************************* Second range ******************************************* */


/**
 * Create a positive-order second ranges
 */
fun Date.secondRangeTo(endInclusive: Date, step: Int): SecondRange = SecondRange(this, endInclusive, step)

/**
 * Create a positive-order second ranges
 */
infix fun Date.secondRangeTo(endInclusive: Date): SecondRange = secondRangeTo(endInclusive, 1)

/**
 * Create a positive-order second ranges
 */
fun Long.secondRangeTo(endInclusive: Long, step: Int): SecondRange = this.toDate().secondRangeTo(endInclusive.toDate(), step)

/**
 * Create a positive-order second ranges
 */
infix fun Long.secondRangeTo(endInclusive: Long): SecondRange = secondRangeTo(endInclusive, 1)

/**
 * Create a positive-order second ranges, parsing the formatted date string with 'yyyy-MM-dd HH:mm:ss'
 */
@Throws(ParseException::class)
fun String.secondYMDHMSRangeTo(endInclusive: String, step: Int): SecondRange = this.toDateYMDHMS().secondRangeTo(endInclusive.toDateYMDHMS(), step)

/**
 * Create a positive-order second ranges, parsing the formatted date string with 'yyyy-MM-dd HH:mm:ss'
 */
@Throws(ParseException::class)
infix fun String.secondYMDHMSRangeTo(endInclusive: String): SecondRange = secondYMDHMSRangeTo(endInclusive, 1)


/**
 * Create a positive-order second range that does not contain [end]
 */
fun Date.secondUntilTo(end: Date, step: Int): SecondRange = SecondRange(this, end.addSecond(-1), step)

/**
 * Create a positive-order second range that does not contain [end]
 */
infix fun Date.secondUntilTo(end: Date): SecondRange = secondUntilTo(end, 1)

/**
 * Create a positive-order second range that does not contain [end]
 */
fun Long.secondUntilTo(end: Long, step: Int): SecondRange = this.toDate().secondUntilTo(end.toDate(), step)

/**
 * Create a positive-order second range that does not contain [end]
 */
infix fun Long.secondUntilTo(end: Long): SecondRange = secondUntilTo(end, 1)

/**
 * Create a positive-order second range that does not contain [end], parsing the formatted date string with 'yyyy-MM-dd HH:mm:ss'
 */
@Throws(ParseException::class)
fun String.secondYMDHMSUntilTo(end: String, step: Int): SecondRange = this.toDateYMDHMS().secondUntilTo(end.toDateYMDHMS(), step)

/**
 * Create a positive-order second range that does not contain [end], parsing the formatted date string with 'yyyy-MM-dd HH:mm:ss'
 */
@Throws(ParseException::class)
infix fun String.secondYMDHMSUntilTo(end: String): SecondRange = secondYMDHMSUntilTo(end, 1)


/**
 * Create a reversed second range
 */
fun Date.secondDownTo(endInclusive: Date, step: Int): SecondRange = SecondRange(this, endInclusive, step)


/**
 * Create a reversed second range
 */
infix fun Date.secondDownTo(endInclusive: Date): SecondRange = secondDownTo(endInclusive, -1)

/**
 * Create a reversed second range
 */
fun Long.secondDownTo(endInclusive: Long, step: Int): SecondRange = this.toDate().secondDownTo(endInclusive.toDate(), step)

/**
 * Create a reversed second range
 */
infix fun Long.secondDownTo(endInclusive: Long): SecondRange = secondDownTo(endInclusive, -1)

/**
 * Create a reversed second range, parsing the formatted date string with 'yyyy-MM-dd HH:mm:ss'
 */
@Throws(ParseException::class)
fun String.secondYMDHMSDownTo(endInclusive: String, step: Int): SecondRange = this.toDateYMDHMS().secondDownTo(endInclusive.toDateYMDHMS(), step)

/**
 * Create a reversed second range, parsing the formatted date string with 'yyyy-MM-dd HH:mm:ss'
 */
@Throws(ParseException::class)
infix fun String.secondYMDHMSDownTo(endInclusive: String): SecondRange = secondYMDHMSDownTo(endInclusive, -1)


/**
 * Create a reversed second range that does not contain [end]
 */
fun Date.secondDownUntilTo(end: Date, step: Int): SecondRange = SecondRange(this, end.addSecond(1), step)

/**
 * Create a reversed second range that does not contain [end]
 */
infix fun Date.secondDownUntilTo(end: Date): SecondRange = secondDownUntilTo(end, -1)

/**
 * Create a reversed second range that does not contain [end]
 */
fun Long.secondDownUntilTo(end: Long, step: Int): SecondRange = this.toDate().secondDownUntilTo(end.toDate(), step)

/**
 * Create a reversed second range that does not contain [end]
 */
infix fun Long.secondDownUntilTo(end: Long): SecondRange = secondDownUntilTo(end, -1)

/**
 * Create a reversed second range that does not contain [end], parsing the formatted date string with 'yyyy-MM-dd HH:mm:ss'
 */
@Throws(ParseException::class)
fun String.secondYMDHMSDownUntilTo(end: String, step: Int): SecondRange = this.toDateYMDHMS().secondDownUntilTo(end.toDateYMDHMS(), step)

/**
 * Create a reversed second range that does not contain [end], parsing the formatted date string with 'yyyy-MM-dd HH:mm:ss'
 */
@Throws(ParseException::class)
infix fun String.secondYMDHMSDownUntilTo(end: String): SecondRange = secondYMDHMSDownUntilTo(end, -1)


/* ******************************************* Millisecond range ******************************************* */


/**
 * Create a positive-order millisecond ranges
 */
fun Date.millisecondRangeTo(endInclusive: Date, step: Int): MillisecondRange = MillisecondRange(this, endInclusive, step)

/**
 * Create a positive-order millisecond ranges
 */
infix fun Date.millisecondRangeTo(endInclusive: Date): MillisecondRange = millisecondRangeTo(endInclusive, 1)

/**
 * Create a positive-order millisecond ranges
 */
fun Long.millisecondRangeTo(endInclusive: Long, step: Int): MillisecondRange = this.toDate().millisecondRangeTo(endInclusive.toDate(), step)

/**
 * Create a positive-order millisecond ranges
 */
infix fun Long.millisecondRangeTo(endInclusive: Long): MillisecondRange = millisecondRangeTo(endInclusive, 1)

/**
 * Create a positive-order millisecond ranges, parsing the formatted date string with 'yyyy-MM-dd HH:mm:ss SSS'
 */
@Throws(ParseException::class)
fun String.millisecondYMDHMSMRangeTo(endInclusive: String, step: Int): MillisecondRange = this.toDateYMDHMSM().millisecondRangeTo(endInclusive.toDateYMDHMSM(), step)

/**
 * Create a positive-order millisecond ranges, parsing the formatted date string with 'yyyy-MM-dd HH:mm:ss SSS'
 */
@Throws(ParseException::class)
infix fun String.millisecondYMDHMSMRangeTo(endInclusive: String): MillisecondRange = millisecondYMDHMSMRangeTo(endInclusive, 1)


/**
 * Create a positive-order millisecond range that does not contain [end]
 */
fun Date.millisecondUntilTo(end: Date, step: Int): MillisecondRange = MillisecondRange(this, end.addMillisecond(-1), step)

/**
 * Create a positive-order millisecond range that does not contain [end]
 */
infix fun Date.millisecondUntilTo(end: Date): MillisecondRange = millisecondUntilTo(end, 1)

/**
 * Create a positive-order millisecond range that does not contain [end]
 */
fun Long.millisecondUntilTo(end: Long, step: Int): MillisecondRange = this.toDate().millisecondUntilTo(end.toDate(), step)

/**
 * Create a positive-order millisecond range that does not contain [end]
 */
infix fun Long.millisecondUntilTo(end: Long): MillisecondRange = millisecondUntilTo(end, 1)

/**
 * Create a positive-order millisecond range that does not contain [end], parsing the formatted date string with 'yyyy-MM-dd HH:mm:ss SSS'
 */
@Throws(ParseException::class)
fun String.millisecondYMDHMSMUntilTo(end: String, step: Int): MillisecondRange = this.toDateYMDHMSM().millisecondUntilTo(end.toDateYMDHMSM(), step)

/**
 * Create a positive-order millisecond range that does not contain [end], parsing the formatted date string with 'yyyy-MM-dd HH:mm:ss SSS'
 */
@Throws(ParseException::class)
infix fun String.millisecondYMDHMSMUntilTo(end: String): MillisecondRange = millisecondYMDHMSMUntilTo(end, 1)


/**
 * Create a reversed millisecond range
 */
fun Date.millisecondDownTo(endInclusive: Date, step: Int): MillisecondRange = MillisecondRange(this, endInclusive, step)

/**
 * Create a reversed millisecond range
 */
infix fun Date.millisecondDownTo(endInclusive: Date): MillisecondRange = millisecondDownTo(endInclusive, -1)

/**
 * Create a reversed millisecond range
 */
fun Long.millisecondDownTo(endInclusive: Long, step: Int): MillisecondRange = this.toDate().millisecondDownTo(endInclusive.toDate(), step)

/**
 * Create a reversed millisecond range
 */
infix fun Long.millisecondDownTo(endInclusive: Long): MillisecondRange = millisecondDownTo(endInclusive, -1)

/**
 * Create a reversed millisecond range, parsing the formatted date string with 'yyyy-MM-dd HH:mm:ss SSS'
 */
@Throws(ParseException::class)
fun String.millisecondYMDHMSMDownTo(endInclusive: String, step: Int): MillisecondRange = this.toDateYMDHMSM().millisecondDownTo(endInclusive.toDateYMDHMSM(), step)

/**
 * Create a reversed millisecond range, parsing the formatted date string with 'yyyy-MM-dd HH:mm:ss SSS'
 */
@Throws(ParseException::class)
infix fun String.millisecondYMDHMSMDownTo(endInclusive: String): MillisecondRange = millisecondYMDHMSMDownTo(endInclusive, -1)


/**
 * Create a reversed millisecond range that does not contain [end]
 */
fun Date.millisecondDownUntilTo(end: Date, step: Int): MillisecondRange = MillisecondRange(this, end.addMillisecond(1), step)

/**
 * Create a reversed millisecond range that does not contain [end]
 */
infix fun Date.millisecondDownUntilTo(end: Date): MillisecondRange = millisecondDownUntilTo(end.addMillisecond(1), -1)

/**
 * Create a reversed millisecond range that does not contain [end]
 */
fun Long.millisecondDownUntilTo(end: Long, step: Int): MillisecondRange = this.toDate().millisecondDownUntilTo(end.toDate(), step)

/**
 * Create a reversed millisecond range that does not contain [end]
 */
infix fun Long.millisecondDownUntilTo(end: Long): MillisecondRange = millisecondDownUntilTo(end, -1)

/**
 * Create a reversed millisecond range that does not contain [end], parsing the formatted date string with 'yyyy-MM-dd HH:mm:ss SSS'
 */
@Throws(ParseException::class)
fun String.millisecondYMDHMSMDownUntilTo(end: String, step: Int): MillisecondRange = this.toDateYMDHMSM().millisecondDownUntilTo(end.toDateYMDHMSM(), step)

/**
 * Create a reversed millisecond range that does not contain [end], parsing the formatted date string with 'yyyy-MM-dd HH:mm:ss SSS'
 */
@Throws(ParseException::class)
infix fun String.millisecondYMDHMSMDownUntilTo(end: String): MillisecondRange = millisecondYMDHMSMDownUntilTo(end, -1)