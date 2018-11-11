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

import me.panpf.javax.util.*
import me.panpf.javax.util.CharRange
import me.panpf.javax.util.IntRange
import me.panpf.javax.util.LongRange
import java.text.ParseException
import java.util.*


/*
 * Range related extension methods or properties
 */


/* ******************************************* Byte Range *******************************************/


/**
 * Create a positive-order byte ranges
 */
inline fun Byte.rangeTo(endInclusive: Byte, step: Int): IntRange = Rangex.rangeTo(this, endInclusive, step)

///**
// * Create a positive-order byte ranges
// */
//inline infix fun Byte.rangeTo(endInclusive: Byte): IntRange = Rangex.rangeTo(this, endInclusive)

/**
 * Create a positive-order byte ranges that does not contain [end]
 */
inline fun Byte.until(end: Byte, step: Int): IntRange = Rangex.until(this, end, step)

///**
// * Create a positive-order byte ranges that does not contain [end]
// */
//inline infix fun Byte.until(end: Byte): IntRange = Rangex.until(this, end)

/**
 * Create a reversed byte range
 */
inline fun Byte.downTo(endInclusive: Byte, step: Int): IntRange = Rangex.downTo(this, endInclusive, step)

///**
// * Create a reversed byte range
// */
//inline infix fun Byte.downTo(endInclusive: Byte): IntRange = Rangex.downTo(this, endInclusive)

/**
 * Create a reversed byte range that does not contain [end]
 */
inline fun Byte.downUntilTo(end: Byte, step: Int): IntRange = Rangex.downUntilTo(this, end, step)

/**
 * Create a reversed byte range that does not contain [end]
 */
inline infix fun Byte.downUntilTo(end: Byte): IntRange = Rangex.downUntilTo(this, end)

/**
 * Create a reversed byte range that does not contain [end]
 */
inline infix fun Byte.downUntilTo(end: Short): IntRange = Rangex.downUntilTo(this.toInt(), end.toInt())

/**
 * Create a reversed byte range that does not contain [end]
 */
inline infix fun Byte.downUntilTo(end: Int): IntRange = Rangex.downUntilTo(this.toInt(), end)

/**
 * Create a reversed byte range that does not contain [end]
 */
inline infix fun Byte.downUntilTo(end: Long): LongRange = Rangex.downUntilTo(this.toLong(), end)


/* ******************************************* Short Range *******************************************/


/**
 * Create a positive-order short ranges
 */
inline fun Short.rangeTo(endInclusive: Short, step: Int): IntRange = Rangex.rangeTo(this, endInclusive, step)

///**
// * Create a positive-order short ranges
// */
//inline infix fun Short.rangeTo(endInclusive: Short): IntRange = Rangex.rangeTo(this, endInclusive)

/**
 * Create a positive-order short ranges that does not contain [end]
 */
inline fun Short.until(end: Short, step: Int): IntRange = Rangex.until(this, end, step)

///**
// * Create a positive-order short ranges that does not contain [end]
// */
//inline infix fun Short.until(end: Short): IntRange = Rangex.until(this, end)

/**
 * Create a reversed short range
 */
inline fun Short.downTo(endInclusive: Short, step: Int): IntRange = Rangex.downTo(this, endInclusive, step)

///**
// * Create a reversed short range
// */
//inline infix fun Short.downTo(endInclusive: Short): IntRange = Rangex.downTo(this, endInclusive)

/**
 * Create a reversed short range that does not contain [end]
 */
inline fun Short.downUntilTo(end: Short, step: Int): IntRange = Rangex.downUntilTo(this.toInt(), end.toInt(), step)

/**
 * Create a reversed short range that does not contain [end]
 */
inline infix fun Short.downUntilTo(end: Byte): IntRange = Rangex.downUntilTo(this.toInt(), end.toInt())

/**
 * Create a reversed short range that does not contain [end]
 */
inline infix fun Short.downUntilTo(end: Short): IntRange = Rangex.downUntilTo(this, end)

/**
 * Create a reversed short range that does not contain [end]
 */
inline infix fun Short.downUntilTo(end: Int): IntRange = Rangex.downUntilTo(this.toInt(), end)

/**
 * Create a reversed short range that does not contain [end]
 */
inline infix fun Short.downUntilTo(end: Long): LongRange = Rangex.downUntilTo(this.toLong(), end)


/* ******************************************* Int Range *******************************************/


/**
 * Create a positive-order int ranges
 */
inline fun Int.rangeTo(endInclusive: Int, step: Int): IntRange = Rangex.rangeTo(this, endInclusive, step)

///**
// * Create a positive-order int ranges
// */
//inline infix fun Int.rangeTo(endInclusive: Int): IntRange = Rangex.rangeTo(this, endInclusive)

/**
 * Create a positive-order int ranges that does not contain [end]
 */
inline fun Int.until(end: Int, step: Int): IntRange = Rangex.until(this, end, step)

///**
// * Create a positive-order int ranges that does not contain [end]
// */
//inline infix fun Int.until(end: Int): IntRange = Rangex.until(this, end)

/**
 * Create a reversed int range
 */
inline fun Int.downTo(endInclusive: Int, step: Int): IntRange = Rangex.downTo(this, endInclusive, step)

///**
// * Create a reversed int range
// */
//inline infix fun Int.downTo(endInclusive: Int): IntRange = Rangex.downTo(this, endInclusive)

/**
 * Create a reversed int range that does not contain [end]
 */
inline fun Int.downUntilTo(end: Int, step: Int): IntRange = Rangex.downUntilTo(this, end, step)

/**
 * Create a reversed int range that does not contain [end]
 */
inline infix fun Int.downUntilTo(end: Byte): IntRange = Rangex.downUntilTo(this, end.toInt())

/**
 * Create a reversed int range that does not contain [end]
 */
inline infix fun Int.downUntilTo(end: Short): IntRange = Rangex.downUntilTo(this, end.toInt())

/**
 * Create a reversed int range that does not contain [end]
 */
inline infix fun Int.downUntilTo(end: Int): IntRange = Rangex.downUntilTo(this, end)

/**
 * Create a reversed int range that does not contain [end]
 */
inline infix fun Int.downUntilTo(end: Long): LongRange = Rangex.downUntilTo(this.toLong(), end)


/* ******************************************* Long Range *******************************************/


/**
 * Create a positive-order long ranges
 */
inline fun Long.rangeTo(endInclusive: Long, step: Long): LongRange = Rangex.rangeTo(this, endInclusive, step)

///**
// * Create a positive-order long ranges
// */
//inline infix fun Long.rangeTo(endInclusive: Long): LongRange = Rangex.rangeTo(this, endInclusive)

/**
 * Create a positive-order long ranges that does not contain [end]
 */
inline fun Long.until(end: Long, step: Long): LongRange = Rangex.until(this, end, step)

///**
// * Create a positive-order long ranges that does not contain [end]
// */
//inline infix fun Long.until(end: Long): LongRange = Rangex.until(this, end)

/**
 * Create a reversed long range
 */
inline fun Long.downTo(endInclusive: Long, step: Long): LongRange = Rangex.downTo(this, endInclusive, step)

///**
// * Create a reversed long range
// */
//inline infix fun Long.downTo(endInclusive: Long): LongRange = Rangex.downTo(this, endInclusive)

/**
 * Create a reversed int range that does not contain [end]
 */
inline fun Long.downUntilTo(end: Long, step: Long): LongRange = Rangex.downUntilTo(this, end, step)

/**
 * Create a reversed long range that does not contain [end]
 */
inline infix fun Long.downUntilTo(end: Byte): LongRange = Rangex.downUntilTo(this, end.toLong())

/**
 * Create a reversed long range that does not contain [end]
 */
inline infix fun Long.downUntilTo(end: Short): LongRange = Rangex.downUntilTo(this, end.toLong())

/**
 * Create a reversed long range that does not contain [end]
 */
inline infix fun Long.downUntilTo(end: Int): LongRange = Rangex.downUntilTo(this, end.toLong())

/**
 * Create a reversed long range that does not contain [end]
 */
inline infix fun Long.downUntilTo(end: Long): LongRange = Rangex.downUntilTo(this, end)


///* ******************************************* Float Range *******************************************/
//
//
///**
// * Create a positive-order float ranges
// */
//inline infix fun Float.rangeTo(endInclusive: Float): ClosedFloatingPointRange<Float> = Rangex.rangeTo(this, endInclusive)
//
///**
// * Create a positive-order float ranges that does not contain [end]
// */
//inline infix fun Float.until(end: Float): ClosedFloatingPointRange<Float> = Rangex.until(this, end)
//
///**
// * Create a reversed float range
// */
//inline infix fun Float.downTo(endInclusive: Float): ClosedFloatingPointRange<Float> = Rangex.downTo(this, endInclusive)
//
///**
// * Create a reversed float range that does not contain [end]
// */
//inline infix fun Float.downUntilTo(end: Float): ClosedFloatingPointRange<Float> = Rangex.downUntilTo(this, end)
//
//
///* ******************************************* Double Range *******************************************/
//
//
///**
// * Create a positive-order double ranges
// */
//inline infix fun Double.rangeTo(endInclusive: Double): ClosedFloatingPointRange<Double> = Rangex.rangeTo(this, endInclusive)
//
///**
// * Create a positive-order double ranges that does not contain [end]
// */
//inline infix fun Double.until(end: Double): ClosedFloatingPointRange<Double> = Rangex.until(this, end)
//
///**
// * Create a reversed double range
// */
//inline infix fun Double.downTo(endInclusive: Double): ClosedFloatingPointRange<Double> = Rangex.downTo(this, endInclusive)
//
///**
// * Create a reversed double range that does not contain [end]
// */
//inline infix fun Double.downUntilTo(end: Double): ClosedFloatingPointRange<Double> = Rangex.downUntilTo(this, end)


/* ******************************************* Char Range *******************************************/


/**
 * Create a positive-order char ranges
 */
inline fun Char.rangeTo(endInclusive: Char, step: Int): CharRange = Rangex.rangeTo(this, endInclusive, step)

///**
// * Create a positive-order char ranges
// */
//inline infix fun Char.rangeTo(endInclusive: Char): CharRange = Rangex.rangeTo(this, endInclusive)

/**
 * Create a positive-order char ranges that does not contain [end]
 */
inline fun Char.until(end: Char, step: Int): CharRange = Rangex.until(this, end, step)

///**
// * Create a positive-order char ranges that does not contain [end]
// */
//inline infix fun Char.until(end: Char): CharRange = Rangex.until(this, end)

/**
 * Create a reversed char range
 */
inline fun Char.downTo(endInclusive: Char, step: Int): CharRange = Rangex.downTo(this, endInclusive, step)

///**
// * Create a reversed char range
// */
//inline infix fun Char.downTo(endInclusive: Char): CharRange = Rangex.downTo(this, endInclusive)

/**
 * Create a reversed char range that does not contain [end]
 */
inline fun Char.downUntilTo(end: Char, step: Int): CharRange = Rangex.downUntilTo(this, end, step)

/**
 * Create a reversed char range that does not contain [end]
 */
inline infix fun Char.downUntilTo(end: Char): CharRange = Rangex.downUntilTo(this, end)


/* ******************************************* Year range ******************************************* */


/**
 * Create a positive-order year ranges
 */
inline fun Date.yearRangeTo(endInclusive: Date, step: Int): YearRange = Rangex.yearRangeTo(this, endInclusive, step)

/**
 * Create a positive-order year ranges
 */
inline infix fun Date.yearRangeTo(endInclusive: Date): YearRange = Rangex.yearRangeTo(this, endInclusive)

/**
 * Create a positive-order year ranges
 */
inline fun Long.yearRangeTo(endInclusive: Long, step: Int): YearRange = Rangex.yearRangeTo(this, endInclusive, step)

/**
 * Create a positive-order year ranges
 */
inline infix fun Long.yearRangeTo(endInclusive: Long): YearRange = Rangex.yearRangeTo(this, endInclusive)

/**
 * Create a positive-order year ranges, parsing the formatted date string with 'yyyy'
 */
@Throws(ParseException::class)
inline fun String.yearYRangeTo(endInclusive: String, step: Int): YearRange = Rangex.yearYRangeTo(this, endInclusive, step)

/**
 * Create a positive-order year ranges, parsing the formatted date string with 'yyyy'
 */
@Throws(ParseException::class)
inline infix fun String.yearYRangeTo(endInclusive: String): YearRange = Rangex.yearYRangeTo(this, endInclusive)


/**
 * Create a positive-order year range that does not contain [end]
 */
inline fun Date.yearUntil(end: Date, step: Int): YearRange = Rangex.yearUntil(this, end, step)

/**
 * Create a positive-order year range that does not contain [end]
 */
inline infix fun Date.yearUntil(end: Date): YearRange = Rangex.yearUntil(this, end)

/**
 * Create a positive-order year range that does not contain [end]
 */
inline fun Long.yearUntil(end: Long, step: Int): YearRange = Rangex.yearUntil(this, end, step)

/**
 * Create a positive-order year range that does not contain [end]
 */
inline infix fun Long.yearUntil(end: Long): YearRange = Rangex.yearUntil(this, end)

/**
 * Create a positive-order year range that does not contain [end], parsing the formatted date string with 'yyyy'
 */
@Throws(ParseException::class)
inline fun String.yearYUntil(end: String, step: Int): YearRange = Rangex.yearYUntil(this, end, step)

/**
 * Create a positive-order year range that does not contain [end], parsing the formatted date string with 'yyyy'
 */
@Throws(ParseException::class)
inline infix fun String.yearYUntil(end: String): YearRange = Rangex.yearYUntil(this, end)


/**
 * Create a reversed year range
 */
inline fun Date.yearDownTo(endInclusive: Date, step: Int): YearRange = Rangex.yearDownTo(this, endInclusive, step)

/**
 * Create a reversed year range
 */
inline infix fun Date.yearDownTo(endInclusive: Date): YearRange = Rangex.yearDownTo(this, endInclusive)

/**
 * Create a reversed year range
 */
inline fun Long.yearDownTo(endInclusive: Long, step: Int): YearRange = Rangex.yearDownTo(this, endInclusive, step)

/**
 * Create a reversed year range
 */
inline infix fun Long.yearDownTo(endInclusive: Long): YearRange = Rangex.yearDownTo(this, endInclusive)

/**
 * Create a reversed year range, parsing the formatted date string with 'yyyy'
 */
@Throws(ParseException::class)
inline fun String.yearYDownTo(endInclusive: String, step: Int): YearRange = Rangex.yearYDownTo(this, endInclusive, step)

/**
 * Create a reversed year range, parsing the formatted date string with 'yyyy'
 */
@Throws(ParseException::class)
inline infix fun String.yearYDownTo(endInclusive: String): YearRange = Rangex.yearYDownTo(this, endInclusive)


/**
 * Create a reversed year range that does not contain [end]
 */
inline fun Date.yearDownUntilTo(end: Date, step: Int): YearRange = Rangex.yearDownUntilTo(this, end, step)

/**
 * Create a reversed year range that does not contain [end]
 */
inline infix fun Date.yearDownUntilTo(end: Date): YearRange = Rangex.yearDownUntilTo(this, end)

/**
 * Create a reversed year range that does not contain [end]
 */
inline fun Long.yearDownUntilTo(end: Long, step: Int): YearRange = Rangex.yearDownUntilTo(this, end, step)

/**
 * Create a reversed year range that does not contain [end]
 */
inline infix fun Long.yearDownUntilTo(end: Long): YearRange = Rangex.yearDownUntilTo(this, end)

/**
 * Create a reversed year range that does not contain [end], parsing the formatted date string with 'yyyy'
 */
@Throws(ParseException::class)
inline fun String.yearYDownUntilTo(end: String, step: Int): YearRange = Rangex.yearYDownUntilTo(this, end, step)

/**
 * Create a reversed year range that does not contain [end], parsing the formatted date string with 'yyyy'
 */
@Throws(ParseException::class)
inline infix fun String.yearYDownUntilTo(end: String): YearRange = Rangex.yearYDownUntilTo(this, end)


/* ******************************************* Month range ******************************************* */


/**
 * Create a positive-order month ranges
 */
inline fun Date.monthRangeTo(endInclusive: Date, step: Int): MonthRange = Rangex.monthRangeTo(this, endInclusive, step)

/**
 * Create a positive-order month ranges
 */
inline infix fun Date.monthRangeTo(endInclusive: Date): MonthRange = Rangex.monthRangeTo(this, endInclusive)

/**
 * Create a positive-order month ranges
 */
inline fun Long.monthRangeTo(endInclusive: Long, step: Int): MonthRange = Rangex.monthRangeTo(this, endInclusive, step)

/**
 * Create a positive-order month ranges
 */
inline infix fun Long.monthRangeTo(endInclusive: Long): MonthRange = Rangex.monthRangeTo(this, endInclusive)

/**
 * Create a positive-order month ranges, parsing the formatted date string with 'yyyy-MM'
 */
@Throws(ParseException::class)
inline fun String.monthYMRangeTo(endInclusive: String, step: Int): MonthRange = Rangex.monthYMRangeTo(this, endInclusive, step)

/**
 * Create a positive-order month ranges, parsing the formatted date string with 'yyyy-MM'
 */
@Throws(ParseException::class)
inline infix fun String.monthYMRangeTo(endInclusive: String): MonthRange = Rangex.monthYMRangeTo(this, endInclusive)


/**
 * Create a positive-order month range that does not contain [end]
 */
inline fun Date.monthUntil(end: Date, step: Int): MonthRange = Rangex.monthUntil(this, end, step)

/**
 * Create a positive-order month range that does not contain [end]
 */
inline infix fun Date.monthUntil(end: Date): MonthRange = Rangex.monthUntil(this, end)

/**
 * Create a positive-order month range that does not contain [end]
 */
inline fun Long.monthUntil(end: Long, step: Int): MonthRange = Rangex.monthUntil(this, end, step)

/**
 * Create a positive-order month range that does not contain [end]
 */
inline infix fun Long.monthUntil(end: Long): MonthRange = Rangex.monthUntil(this, end)

/**
 * Create a positive-order month range that does not contain [end], parsing the formatted date string with 'yyyy-MM'
 */
@Throws(ParseException::class)
inline fun String.monthYMUntil(end: String, step: Int): MonthRange = Rangex.monthYMUntil(this, end, step)

/**
 * Create a positive-order month range that does not contain [end], parsing the formatted date string with 'yyyy-MM'
 */
@Throws(ParseException::class)
inline infix fun String.monthYMUntil(end: String): MonthRange = Rangex.monthYMUntil(this, end)


/**
 * Create a reversed month range
 */
inline fun Date.monthDownTo(endInclusive: Date, step: Int): MonthRange = Rangex.monthDownTo(this, endInclusive, step)

/**
 * Create a reversed month range
 */
inline infix fun Date.monthDownTo(endInclusive: Date): MonthRange = Rangex.monthDownTo(this, endInclusive)

/**
 * Create a reversed month range
 */
inline fun Long.monthDownTo(endInclusive: Long, step: Int): MonthRange = Rangex.monthDownTo(this, endInclusive, step)

/**
 * Create a reversed month range
 */
inline infix fun Long.monthDownTo(endInclusive: Long): MonthRange = Rangex.monthDownTo(this, endInclusive)

/**
 * Create a reversed month range, parsing the formatted date string with 'yyyy-MM'
 */
@Throws(ParseException::class)
inline fun String.monthYMDownTo(endInclusive: String, step: Int): MonthRange = Rangex.monthYMDownTo(this, endInclusive, step)

/**
 * Create a reversed month range, parsing the formatted date string with 'yyyy-MM'
 */
@Throws(ParseException::class)
inline infix fun String.monthYMDownTo(endInclusive: String): MonthRange = Rangex.monthYMDownTo(this, endInclusive)


/**
 * Create a reversed month range that does not contain [end]
 */
inline fun Date.monthDownUntilTo(end: Date, step: Int): MonthRange = Rangex.monthDownUntilTo(this, end, step)

/**
 * Create a reversed month range that does not contain [end]
 */
inline infix fun Date.monthDownUntilTo(end: Date): MonthRange = Rangex.monthDownUntilTo(this, end)

/**
 * Create a reversed month range that does not contain [end]
 */
inline fun Long.monthDownUntilTo(end: Long, step: Int): MonthRange = Rangex.monthDownUntilTo(this, end, step)

/**
 * Create a reversed month range that does not contain [end]
 */
inline infix fun Long.monthDownUntilTo(end: Long): MonthRange = Rangex.monthDownUntilTo(this, end)

/**
 * Create a reversed month range that does not contain [end], parsing the formatted date string with 'yyyy-MM'
 */
@Throws(ParseException::class)
inline fun String.monthYMDownUntilTo(end: String, step: Int): MonthRange = Rangex.monthYMDownUntilTo(this, end, step)

/**
 * Create a reversed month range that does not contain [end], parsing the formatted date string with 'yyyy-MM'
 */
@Throws(ParseException::class)
inline infix fun String.monthYMDownUntilTo(end: String): MonthRange = Rangex.monthYMDownUntilTo(this, end)


/* ******************************************* Day range ******************************************* */


/**
 * Create a positive-order day ranges
 */
inline fun Date.dayRangeTo(endInclusive: Date, step: Int): DayRange = Rangex.dayRangeTo(this, endInclusive, step)

/**
 * Create a positive-order day ranges
 */
inline infix fun Date.dayRangeTo(endInclusive: Date): DayRange = Rangex.dayRangeTo(this, endInclusive)

/**
 * Create a positive-order day ranges
 */
inline fun Long.dayRangeTo(endInclusive: Long, step: Int): DayRange = Rangex.dayRangeTo(this, endInclusive, step)

/**
 * Create a positive-order day ranges
 */
inline infix fun Long.dayRangeTo(endInclusive: Long): DayRange = Rangex.dayRangeTo(this, endInclusive)

/**
 * Create a positive-order day ranges, parsing the formatted date string with 'yyyy-MM-dd'
 */
@Throws(ParseException::class)
inline fun String.dayYMDRangeTo(endInclusive: String, step: Int): DayRange = Rangex.dayYMDRangeTo(this, endInclusive, step)

/**
 * Create a positive-order day ranges, parsing the formatted date string with 'yyyy-MM-dd'
 */
@Throws(ParseException::class)
inline infix fun String.dayYMDRangeTo(endInclusive: String): DayRange = Rangex.dayYMDRangeTo(this, endInclusive)


/**
 * Create a positive-order day range that does not contain [end]
 */
inline fun Date.dayUntil(end: Date, step: Int): DayRange = Rangex.dayUntil(this, end, step)

/**
 * Create a positive-order day range that does not contain [end]
 */
inline infix fun Date.dayUntil(end: Date): DayRange = Rangex.dayUntil(this, end)

/**
 * Create a positive-order day range that does not contain [end]
 */
inline fun Long.dayUntil(end: Long, step: Int): DayRange = Rangex.dayUntil(this, end, step)

/**
 * Create a positive-order day range that does not contain [end]
 */
inline infix fun Long.dayUntil(end: Long): DayRange = Rangex.dayUntil(this, end)

/**
 * Create a positive-order day range that does not contain [end], parsing the formatted date string with 'yyyy-MM-dd'
 */
@Throws(ParseException::class)
inline fun String.dayYMDUntil(end: String, step: Int): DayRange = Rangex.dayYMDUntil(this, end, step)

/**
 * Create a positive-order day range that does not contain [end], parsing the formatted date string with 'yyyy-MM-dd'
 */
@Throws(ParseException::class)
inline infix fun String.dayYMDUntil(end: String): DayRange = Rangex.dayYMDUntil(this, end)


/**
 * Create a reversed day range
 */
inline fun Date.dayDownTo(endInclusive: Date, step: Int): DayRange = Rangex.dayDownTo(this, endInclusive, step)

/**
 * Create a reversed day range
 */
inline infix fun Date.dayDownTo(endInclusive: Date): DayRange = Rangex.dayDownTo(this, endInclusive)

/**
 * Create a reversed day range
 */
inline fun Long.dayDownTo(endInclusive: Long, step: Int): DayRange = Rangex.dayDownTo(this, endInclusive, step)

/**
 * Create a reversed day range
 */
inline infix fun Long.dayDownTo(endInclusive: Long): DayRange = Rangex.dayDownTo(this, endInclusive)

/**
 * Create a reversed day range, parsing the formatted date string with 'yyyy-MM-dd'
 */
@Throws(ParseException::class)
inline fun String.dayYMDDownTo(endInclusive: String, step: Int): DayRange = Rangex.dayYMDDownTo(this, endInclusive, step)

/**
 * Create a reversed day range, parsing the formatted date string with 'yyyy-MM-dd'
 */
@Throws(ParseException::class)
inline infix fun String.dayYMDDownTo(endInclusive: String): DayRange = Rangex.dayYMDDownTo(this, endInclusive)


/**
 * Create a reversed day range that does not contain [end]
 */
inline fun Date.dayDownUntilTo(end: Date, step: Int): DayRange = Rangex.dayDownUntilTo(this, end, step)

/**
 * Create a reversed day range that does not contain [end]
 */
inline infix fun Date.dayDownUntilTo(end: Date): DayRange = Rangex.dayDownUntilTo(this, end)

/**
 * Create a reversed day range that does not contain [end]
 */
inline fun Long.dayDownUntilTo(end: Long, step: Int): DayRange = Rangex.dayDownUntilTo(this, end, step)

/**
 * Create a reversed day range that does not contain [end]
 */
inline infix fun Long.dayDownUntilTo(end: Long): DayRange = Rangex.dayDownUntilTo(this, end)

/**
 * Create a reversed day range that does not contain [end], parsing the formatted date string with 'yyyy-MM-dd'
 */
@Throws(ParseException::class)
inline fun String.dayYMDDownUntilTo(end: String, step: Int): DayRange = Rangex.dayYMDDownUntilTo(this, end, step)

/**
 * Create a reversed day range that does not contain [end], parsing the formatted date string with 'yyyy-MM-dd'
 */
@Throws(ParseException::class)
inline infix fun String.dayYMDDownUntilTo(end: String): DayRange = Rangex.dayYMDDownUntilTo(this, end)


/* ******************************************* Hour range ******************************************* */


/**
 * Create a positive-order hour ranges
 */
inline fun Date.hourRangeTo(endInclusive: Date, step: Int): HourRange = Rangex.hourRangeTo(this, endInclusive, step)

/**
 * Create a positive-order hour ranges
 */
inline infix fun Date.hourRangeTo(endInclusive: Date): HourRange = Rangex.hourRangeTo(this, endInclusive)

/**
 * Create a positive-order hour ranges
 */
inline fun Long.hourRangeTo(endInclusive: Long, step: Int): HourRange = Rangex.hourRangeTo(this, endInclusive, step)

/**
 * Create a positive-order hour ranges
 */
inline infix fun Long.hourRangeTo(endInclusive: Long): HourRange = Rangex.hourRangeTo(this, endInclusive)

/**
 * Create a positive-order hour ranges, parsing the formatted date string with 'yyyy-MM-dd HH'
 */
@Throws(ParseException::class)
inline fun String.hourYMDHRangeTo(endInclusive: String, step: Int): HourRange = Rangex.hourYMDHRangeTo(this, endInclusive, step)

/**
 * Create a positive-order hour ranges, parsing the formatted date string with 'yyyy-MM-dd HH'
 */
@Throws(ParseException::class)
inline infix fun String.hourYMDHRangeTo(endInclusive: String): HourRange = Rangex.hourYMDHRangeTo(this, endInclusive)


/**
 * Create a positive-order hour range that does not contain [end]
 */
inline fun Date.hourUntil(end: Date, step: Int): HourRange = Rangex.hourUntil(this, end, step)

/**
 * Create a positive-order hour range that does not contain [end]
 */
inline infix fun Date.hourUntil(end: Date): HourRange = Rangex.hourUntil(this, end)

/**
 * Create a positive-order hour range that does not contain [end]
 */
inline fun Long.hourUntil(end: Long, step: Int): HourRange = Rangex.hourUntil(this, end, step)

/**
 * Create a positive-order hour range that does not contain [end]
 */
inline infix fun Long.hourUntil(end: Long): HourRange = Rangex.hourUntil(this, end)

/**
 * Create a positive-order hour range that does not contain [end], parsing the formatted date string with 'yyyy-MM-dd HH'
 */
@Throws(ParseException::class)
inline fun String.hourYMDHUntil(end: String, step: Int): HourRange = Rangex.hourYMDHUntil(this, end, step)

/**
 * Create a positive-order hour range that does not contain [end], parsing the formatted date string with 'yyyy-MM-dd HH'
 */
@Throws(ParseException::class)
inline infix fun String.hourYMDHUntil(end: String): HourRange = Rangex.hourYMDHUntil(this, end)


/**
 * Create a reversed hour range
 */
inline fun Date.hourDownTo(endInclusive: Date, step: Int): HourRange = Rangex.hourDownTo(this, endInclusive, step)

/**
 * Create a reversed hour range
 */
inline infix fun Date.hourDownTo(endInclusive: Date): HourRange = Rangex.hourDownTo(this, endInclusive)

/**
 * Create a reversed hour range
 */
inline fun Long.hourDownTo(endInclusive: Long, step: Int): HourRange = Rangex.hourDownTo(this, endInclusive, step)

/**
 * Create a reversed hour range
 */
inline infix fun Long.hourDownTo(endInclusive: Long): HourRange = Rangex.hourDownTo(this, endInclusive)

/**
 * Create a reversed hour range, parsing the formatted date string with 'yyyy-MM-dd HH'
 */
@Throws(ParseException::class)
inline fun String.hourYMDHDownTo(endInclusive: String, step: Int): HourRange = Rangex.hourYMDHDownTo(this, endInclusive, step)

/**
 * Create a reversed hour range, parsing the formatted date string with 'yyyy-MM-dd HH'
 */
@Throws(ParseException::class)
inline infix fun String.hourYMDHDownTo(endInclusive: String): HourRange = Rangex.hourYMDHDownTo(this, endInclusive)


/**
 * Create a reversed hour range that does not contain [end]
 */
inline fun Date.hourDownUntilTo(end: Date, step: Int): HourRange = Rangex.hourDownUntilTo(this, end, step)

/**
 * Create a reversed hour range that does not contain [end]
 */
inline infix fun Date.hourDownUntilTo(end: Date): HourRange = Rangex.hourDownUntilTo(this, end)

/**
 * Create a reversed hour range that does not contain [end]
 */
inline fun Long.hourDownUntilTo(end: Long, step: Int): HourRange = Rangex.hourDownUntilTo(this, end, step)

/**
 * Create a reversed hour range that does not contain [end]
 */
inline infix fun Long.hourDownUntilTo(end: Long): HourRange = Rangex.hourDownUntilTo(this, end)

/**
 * Create a reversed hour range that does not contain [end], parsing the formatted date string with 'yyyy-MM-dd HH'
 */
@Throws(ParseException::class)
inline fun String.hourYMDHDownUntilTo(end: String, step: Int): HourRange = Rangex.hourYMDHDownUntilTo(this, end, step)

/**
 * Create a reversed hour range that does not contain [end], parsing the formatted date string with 'yyyy-MM-dd HH'
 */
@Throws(ParseException::class)
inline infix fun String.hourYMDHDownUntilTo(end: String): HourRange = Rangex.hourYMDHDownUntilTo(this, end)


/* ******************************************* Minute range ******************************************* */


/**
 * Create a positive-order minute ranges
 */
inline fun Date.minuteRangeTo(endInclusive: Date, step: Int): MinuteRange = Rangex.minuteRangeTo(this, endInclusive, step)

/**
 * Create a positive-order minute ranges
 */
inline infix fun Date.minuteRangeTo(endInclusive: Date): MinuteRange = Rangex.minuteRangeTo(this, endInclusive)

/**
 * Create a positive-order minute ranges
 */
inline fun Long.minuteRangeTo(endInclusive: Long, step: Int): MinuteRange = Rangex.minuteRangeTo(this, endInclusive, step)

/**
 * Create a positive-order minute ranges
 */
inline infix fun Long.minuteRangeTo(endInclusive: Long): MinuteRange = Rangex.minuteRangeTo(this, endInclusive)

/**
 * Create a positive-order minute ranges, parsing the formatted date string with 'yyyy-MM-dd HH:mm'
 */
@Throws(ParseException::class)
inline fun String.minuteYMDHMRangeTo(endInclusive: String, step: Int): MinuteRange = Rangex.minuteYMDHMRangeTo(this, endInclusive, step)

/**
 * Create a positive-order minute ranges, parsing the formatted date string with 'yyyy-MM-dd HH:mm'
 */
@Throws(ParseException::class)
inline infix fun String.minuteYMDHMRangeTo(endInclusive: String): MinuteRange = Rangex.minuteYMDHMRangeTo(this, endInclusive)


/**
 * Create a positive-order minute range that does not contain [end]
 */
inline fun Date.minuteUntil(end: Date, step: Int): MinuteRange = Rangex.minuteUntil(this, end, step)

/**
 * Create a positive-order minute range that does not contain [end]
 */
inline infix fun Date.minuteUntil(end: Date): MinuteRange = Rangex.minuteUntil(this, end)

/**
 * Create a positive-order minute range that does not contain [end]
 */
inline fun Long.minuteUntil(end: Long, step: Int): MinuteRange = Rangex.minuteUntil(this, end, step)

/**
 * Create a positive-order minute range that does not contain [end]
 */
inline infix fun Long.minuteUntil(end: Long): MinuteRange = Rangex.minuteUntil(this, end)

/**
 * Create a positive-order minute range that does not contain [end], parsing the formatted date string with 'yyyy-MM-dd HH:mm'
 */
@Throws(ParseException::class)
inline fun String.minuteYMDHMUntil(end: String, step: Int): MinuteRange = Rangex.minuteYMDHMUntil(this, end, step)

/**
 * Create a positive-order minute range that does not contain [end], parsing the formatted date string with 'yyyy-MM-dd HH:mm'
 */
@Throws(ParseException::class)
inline infix fun String.minuteYMDHMUntil(end: String): MinuteRange = Rangex.minuteYMDHMUntil(this, end)


/**
 * Create a reversed minute range
 */
inline fun Date.minuteDownTo(endInclusive: Date, step: Int): MinuteRange = Rangex.minuteDownTo(this, endInclusive, step)

/**
 * Create a reversed minute range
 */
inline infix fun Date.minuteDownTo(endInclusive: Date): MinuteRange = Rangex.minuteDownTo(this, endInclusive)

/**
 * Create a reversed minute range
 */
inline fun Long.minuteDownTo(endInclusive: Long, step: Int): MinuteRange = Rangex.minuteDownTo(this, endInclusive, step)

/**
 * Create a reversed minute range
 */
inline infix fun Long.minuteDownTo(endInclusive: Long): MinuteRange = Rangex.minuteDownTo(this, endInclusive)

/**
 * Create a reversed minute range, parsing the formatted date string with 'yyyy-MM-dd HH:mm'
 */
@Throws(ParseException::class)
inline fun String.minuteYMDHMDownTo(endInclusive: String, step: Int): MinuteRange = Rangex.minuteYMDHMDownTo(this, endInclusive, step)

/**
 * Create a reversed minute range, parsing the formatted date string with 'yyyy-MM-dd HH:mm'
 */
@Throws(ParseException::class)
inline infix fun String.minuteYMDHMDownTo(endInclusive: String): MinuteRange = Rangex.minuteYMDHMDownTo(this, endInclusive)


/**
 * Create a reversed minute range that does not contain [end]
 */
inline fun Date.minuteDownUntilTo(end: Date, step: Int): MinuteRange = Rangex.minuteDownUntilTo(this, end, step)

/**
 * Create a reversed minute range that does not contain [end]
 */
inline infix fun Date.minuteDownUntilTo(end: Date): MinuteRange = Rangex.minuteDownUntilTo(this, end)

/**
 * Create a reversed minute range that does not contain [end]
 */
inline fun Long.minuteDownUntilTo(end: Long, step: Int): MinuteRange = Rangex.minuteDownUntilTo(this, end, step)

/**
 * Create a reversed minute range that does not contain [end]
 */
inline infix fun Long.minuteDownUntilTo(end: Long): MinuteRange = Rangex.minuteDownUntilTo(this, end)

/**
 * Create a reversed minute range that does not contain [end], parsing the formatted date string with 'yyyy-MM-dd HH:mm'
 */
@Throws(ParseException::class)
inline fun String.minuteYMDHMDownUntilTo(end: String, step: Int): MinuteRange = Rangex.minuteYMDHMDownUntilTo(this, end, step)

/**
 * Create a reversed minute range that does not contain [end], parsing the formatted date string with 'yyyy-MM-dd HH:mm'
 */
@Throws(ParseException::class)
inline infix fun String.minuteYMDHMDownUntilTo(end: String): MinuteRange = Rangex.minuteYMDHMDownUntilTo(this, end)


/* ******************************************* Second range ******************************************* */


/**
 * Create a positive-order second ranges
 */
inline fun Date.secondRangeTo(endInclusive: Date, step: Int): SecondRange = Rangex.secondRangeTo(this, endInclusive, step)

/**
 * Create a positive-order second ranges
 */
inline infix fun Date.secondRangeTo(endInclusive: Date): SecondRange = Rangex.secondRangeTo(this, endInclusive)

/**
 * Create a positive-order second ranges
 */
inline fun Long.secondRangeTo(endInclusive: Long, step: Int): SecondRange = Rangex.secondRangeTo(this, endInclusive, step)

/**
 * Create a positive-order second ranges
 */
inline infix fun Long.secondRangeTo(endInclusive: Long): SecondRange = Rangex.secondRangeTo(this, endInclusive)

/**
 * Create a positive-order second ranges, parsing the formatted date string with 'yyyy-MM-dd HH:mm:ss'
 */
@Throws(ParseException::class)
inline fun String.secondYMDHMSRangeTo(endInclusive: String, step: Int): SecondRange = Rangex.secondYMDHMSRangeTo(this, endInclusive, step)

/**
 * Create a positive-order second ranges, parsing the formatted date string with 'yyyy-MM-dd HH:mm:ss'
 */
@Throws(ParseException::class)
inline infix fun String.secondYMDHMSRangeTo(endInclusive: String): SecondRange = Rangex.secondYMDHMSRangeTo(this, endInclusive)


/**
 * Create a positive-order second range that does not contain [end]
 */
inline fun Date.secondUntil(end: Date, step: Int): SecondRange = Rangex.secondUntil(this, end, step)

/**
 * Create a positive-order second range that does not contain [end]
 */
inline infix fun Date.secondUntil(end: Date): SecondRange = Rangex.secondUntil(this, end)

/**
 * Create a positive-order second range that does not contain [end]
 */
inline fun Long.secondUntil(end: Long, step: Int): SecondRange = Rangex.secondUntil(this, end, step)

/**
 * Create a positive-order second range that does not contain [end]
 */
inline infix fun Long.secondUntil(end: Long): SecondRange = Rangex.secondUntil(this, end)

/**
 * Create a positive-order second range that does not contain [end], parsing the formatted date string with 'yyyy-MM-dd HH:mm:ss'
 */
@Throws(ParseException::class)
inline fun String.secondYMDHMSUntil(end: String, step: Int): SecondRange = Rangex.secondYMDHMSUntil(this, end, step)

/**
 * Create a positive-order second range that does not contain [end], parsing the formatted date string with 'yyyy-MM-dd HH:mm:ss'
 */
@Throws(ParseException::class)
inline infix fun String.secondYMDHMSUntil(end: String): SecondRange = Rangex.secondYMDHMSUntil(this, end)


/**
 * Create a reversed second range
 */
inline fun Date.secondDownTo(endInclusive: Date, step: Int): SecondRange = Rangex.secondDownTo(this, endInclusive, step)


/**
 * Create a reversed second range
 */
inline infix fun Date.secondDownTo(endInclusive: Date): SecondRange = Rangex.secondDownTo(this, endInclusive)

/**
 * Create a reversed second range
 */
inline fun Long.secondDownTo(endInclusive: Long, step: Int): SecondRange = Rangex.secondDownTo(this, endInclusive, step)

/**
 * Create a reversed second range
 */
inline infix fun Long.secondDownTo(endInclusive: Long): SecondRange = Rangex.secondDownTo(this, endInclusive)

/**
 * Create a reversed second range, parsing the formatted date string with 'yyyy-MM-dd HH:mm:ss'
 */
@Throws(ParseException::class)
inline fun String.secondYMDHMSDownTo(endInclusive: String, step: Int): SecondRange = Rangex.secondYMDHMSDownTo(this, endInclusive, step)

/**
 * Create a reversed second range, parsing the formatted date string with 'yyyy-MM-dd HH:mm:ss'
 */
@Throws(ParseException::class)
inline infix fun String.secondYMDHMSDownTo(endInclusive: String): SecondRange = Rangex.secondYMDHMSDownTo(this, endInclusive)


/**
 * Create a reversed second range that does not contain [end]
 */
inline fun Date.secondDownUntilTo(end: Date, step: Int): SecondRange = Rangex.secondDownUntilTo(this, end, step)

/**
 * Create a reversed second range that does not contain [end]
 */
inline infix fun Date.secondDownUntilTo(end: Date): SecondRange = Rangex.secondDownUntilTo(this, end)

/**
 * Create a reversed second range that does not contain [end]
 */
inline fun Long.secondDownUntilTo(end: Long, step: Int): SecondRange = Rangex.secondDownUntilTo(this, end, step)

/**
 * Create a reversed second range that does not contain [end]
 */
inline infix fun Long.secondDownUntilTo(end: Long): SecondRange = Rangex.secondDownUntilTo(this, end)

/**
 * Create a reversed second range that does not contain [end], parsing the formatted date string with 'yyyy-MM-dd HH:mm:ss'
 */
@Throws(ParseException::class)
inline fun String.secondYMDHMSDownUntilTo(end: String, step: Int): SecondRange = Rangex.secondYMDHMSDownUntilTo(this, end, step)

/**
 * Create a reversed second range that does not contain [end], parsing the formatted date string with 'yyyy-MM-dd HH:mm:ss'
 */
@Throws(ParseException::class)
inline infix fun String.secondYMDHMSDownUntilTo(end: String): SecondRange = Rangex.secondYMDHMSDownUntilTo(this, end)


/* ******************************************* Millisecond range ******************************************* */


/**
 * Create a positive-order millisecond ranges
 */
inline fun Date.millisecondRangeTo(endInclusive: Date, step: Int): MillisecondRange = Rangex.millisecondRangeTo(this, endInclusive, step)

/**
 * Create a positive-order millisecond ranges
 */
inline infix fun Date.millisecondRangeTo(endInclusive: Date): MillisecondRange = Rangex.millisecondRangeTo(this, endInclusive)

/**
 * Create a positive-order millisecond ranges
 */
inline fun Long.millisecondRangeTo(endInclusive: Long, step: Int): MillisecondRange = Rangex.millisecondRangeTo(this, endInclusive, step)

/**
 * Create a positive-order millisecond ranges
 */
inline infix fun Long.millisecondRangeTo(endInclusive: Long): MillisecondRange = Rangex.millisecondRangeTo(this, endInclusive)

/**
 * Create a positive-order millisecond ranges, parsing the formatted date string with 'yyyy-MM-dd HH:mm:ss SSS'
 */
@Throws(ParseException::class)
inline fun String.millisecondYMDHMSMRangeTo(endInclusive: String, step: Int): MillisecondRange = Rangex.millisecondYMDHMSMRangeTo(this, endInclusive, step)

/**
 * Create a positive-order millisecond ranges, parsing the formatted date string with 'yyyy-MM-dd HH:mm:ss SSS'
 */
@Throws(ParseException::class)
inline infix fun String.millisecondYMDHMSMRangeTo(endInclusive: String): MillisecondRange = Rangex.millisecondYMDHMSMRangeTo(this, endInclusive)


/**
 * Create a positive-order millisecond range that does not contain [end]
 */
inline fun Date.millisecondUntil(end: Date, step: Int): MillisecondRange = Rangex.millisecondUntil(this, end, step)

/**
 * Create a positive-order millisecond range that does not contain [end]
 */
inline infix fun Date.millisecondUntil(end: Date): MillisecondRange = Rangex.millisecondUntil(this, end)

/**
 * Create a positive-order millisecond range that does not contain [end]
 */
inline fun Long.millisecondUntil(end: Long, step: Int): MillisecondRange = Rangex.millisecondUntil(this, end, step)

/**
 * Create a positive-order millisecond range that does not contain [end]
 */
inline infix fun Long.millisecondUntil(end: Long): MillisecondRange = Rangex.millisecondUntil(this, end)

/**
 * Create a positive-order millisecond range that does not contain [end], parsing the formatted date string with 'yyyy-MM-dd HH:mm:ss SSS'
 */
@Throws(ParseException::class)
inline fun String.millisecondYMDHMSMUntil(end: String, step: Int): MillisecondRange = Rangex.millisecondYMDHMSMUntil(this, end, step)

/**
 * Create a positive-order millisecond range that does not contain [end], parsing the formatted date string with 'yyyy-MM-dd HH:mm:ss SSS'
 */
@Throws(ParseException::class)
inline infix fun String.millisecondYMDHMSMUntil(end: String): MillisecondRange = Rangex.millisecondYMDHMSMUntil(this, end)


/**
 * Create a reversed millisecond range
 */
inline fun Date.millisecondDownTo(endInclusive: Date, step: Int): MillisecondRange = Rangex.millisecondDownTo(this, endInclusive, step)

/**
 * Create a reversed millisecond range
 */
inline infix fun Date.millisecondDownTo(endInclusive: Date): MillisecondRange = Rangex.millisecondDownTo(this, endInclusive)

/**
 * Create a reversed millisecond range
 */
inline fun Long.millisecondDownTo(endInclusive: Long, step: Int): MillisecondRange = Rangex.millisecondDownTo(this, endInclusive, step)

/**
 * Create a reversed millisecond range
 */
inline infix fun Long.millisecondDownTo(endInclusive: Long): MillisecondRange = Rangex.millisecondDownTo(this, endInclusive)

/**
 * Create a reversed millisecond range, parsing the formatted date string with 'yyyy-MM-dd HH:mm:ss SSS'
 */
@Throws(ParseException::class)
inline fun String.millisecondYMDHMSMDownTo(endInclusive: String, step: Int): MillisecondRange = Rangex.millisecondYMDHMSMDownTo(this, endInclusive, step)

/**
 * Create a reversed millisecond range, parsing the formatted date string with 'yyyy-MM-dd HH:mm:ss SSS'
 */
@Throws(ParseException::class)
inline infix fun String.millisecondYMDHMSMDownTo(endInclusive: String): MillisecondRange = Rangex.millisecondYMDHMSMDownTo(this, endInclusive)


/**
 * Create a reversed millisecond range that does not contain [end]
 */
inline fun Date.millisecondDownUntilTo(end: Date, step: Int): MillisecondRange = Rangex.millisecondDownUntilTo(this, end, step)

/**
 * Create a reversed millisecond range that does not contain [end]
 */
inline infix fun Date.millisecondDownUntilTo(end: Date): MillisecondRange = Rangex.millisecondDownUntilTo(this, end)

/**
 * Create a reversed millisecond range that does not contain [end]
 */
inline fun Long.millisecondDownUntilTo(end: Long, step: Int): MillisecondRange = Rangex.millisecondDownUntilTo(this, end, step)

/**
 * Create a reversed millisecond range that does not contain [end]
 */
inline infix fun Long.millisecondDownUntilTo(end: Long): MillisecondRange = Rangex.millisecondDownUntilTo(this, end)

/**
 * Create a reversed millisecond range that does not contain [end], parsing the formatted date string with 'yyyy-MM-dd HH:mm:ss SSS'
 */
@Throws(ParseException::class)
inline fun String.millisecondYMDHMSMDownUntilTo(end: String, step: Int): MillisecondRange = Rangex.millisecondYMDHMSMDownUntilTo(this, end, step)

/**
 * Create a reversed millisecond range that does not contain [end], parsing the formatted date string with 'yyyy-MM-dd HH:mm:ss SSS'
 */
@Throws(ParseException::class)
inline infix fun String.millisecondYMDHMSMDownUntilTo(end: String): MillisecondRange = Rangex.millisecondYMDHMSMDownUntilTo(this, end)