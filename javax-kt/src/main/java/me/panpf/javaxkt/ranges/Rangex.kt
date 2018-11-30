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

package me.panpf.javaxkt.ranges

import me.panpf.javax.ranges.*
import me.panpf.javax.ranges.CharProgression
import me.panpf.javax.ranges.IntProgression
import me.panpf.javax.ranges.LongProgression
import java.util.*


/*
 * Range related extension methods or properties
 */


/* ******************************************* Byte Range *******************************************/


/**
 * Create a positive-order byte ranges
 */
inline fun Byte.rangeTo(endInclusive: Byte, step: Int): IntProgression = Rangex.rangeTo(this, endInclusive, step)

///**
// * Create a positive-order byte ranges
// */
//inline infix fun Byte.rangeTo(endInclusive: Byte): IntRange = Rangex.rangeTo(this, endInclusive)

/**
 * Create a positive-order byte ranges that does not contain [end]
 */
inline fun Byte.until(end: Byte, step: Int): IntProgression = Rangex.until(this, end, step)

///**
// * Create a positive-order byte ranges that does not contain [end]
// */
//inline infix fun Byte.until(end: Byte): IntRange = Rangex.until(this, end)

/**
 * Create a reversed byte range
 */
inline fun Byte.downTo(endInclusive: Byte, step: Int): IntProgression = Rangex.downTo(this, endInclusive, step)

///**
// * Create a reversed byte range
// */
//inline infix fun Byte.downTo(endInclusive: Byte): IntProgression = Rangex.downTo(this, endInclusive)

/**
 * Create a reversed byte range that does not contain [end]
 */
inline fun Byte.downUntilTo(end: Byte, step: Int): IntProgression = Rangex.downUntilTo(this, end, step)

/**
 * Create a reversed byte range that does not contain [end]
 */
inline infix fun Byte.downUntilTo(end: Byte): IntProgression = Rangex.downUntilTo(this, end)

/**
 * Create a reversed byte range that does not contain [end]
 */
inline infix fun Byte.downUntilTo(end: Short): IntProgression = Rangex.downUntilTo(this.toInt(), end.toInt())

/**
 * Create a reversed byte range that does not contain [end]
 */
inline infix fun Byte.downUntilTo(end: Int): IntProgression = Rangex.downUntilTo(this.toInt(), end)

/**
 * Create a reversed byte range that does not contain [end]
 */
inline infix fun Byte.downUntilTo(end: Long): LongProgression = Rangex.downUntilTo(this.toLong(), end)


/* ******************************************* Short Range *******************************************/


/**
 * Create a positive-order short ranges
 */
inline fun Short.rangeTo(endInclusive: Short, step: Int): IntProgression = Rangex.rangeTo(this, endInclusive, step)

///**
// * Create a positive-order short ranges
// */
//inline infix fun Short.rangeTo(endInclusive: Short): IntRange = Rangex.rangeTo(this, endInclusive)

/**
 * Create a positive-order short ranges that does not contain [end]
 */
inline fun Short.until(end: Short, step: Int): IntProgression = Rangex.until(this, end, step)

///**
// * Create a positive-order short ranges that does not contain [end]
// */
//inline infix fun Short.until(end: Short): IntRange = Rangex.until(this, end)

/**
 * Create a reversed short range
 */
inline fun Short.downTo(endInclusive: Short, step: Int): IntProgression = Rangex.downTo(this, endInclusive, step)

///**
// * Create a reversed short range
// */
//inline infix fun Short.downTo(endInclusive: Short): IntProgression = Rangex.downTo(this, endInclusive)

/**
 * Create a reversed short range that does not contain [end]
 */
inline fun Short.downUntilTo(end: Short, step: Int): IntProgression = Rangex.downUntilTo(this.toInt(), end.toInt(), step)

/**
 * Create a reversed short range that does not contain [end]
 */
inline infix fun Short.downUntilTo(end: Byte): IntProgression = Rangex.downUntilTo(this.toInt(), end.toInt())

/**
 * Create a reversed short range that does not contain [end]
 */
inline infix fun Short.downUntilTo(end: Short): IntProgression = Rangex.downUntilTo(this, end)

/**
 * Create a reversed short range that does not contain [end]
 */
inline infix fun Short.downUntilTo(end: Int): IntProgression = Rangex.downUntilTo(this.toInt(), end)

/**
 * Create a reversed short range that does not contain [end]
 */
inline infix fun Short.downUntilTo(end: Long): LongProgression = Rangex.downUntilTo(this.toLong(), end)


/* ******************************************* Int Range *******************************************/


/**
 * Create a positive-order int ranges
 */
inline fun Int.rangeTo(endInclusive: Int, step: Int): IntProgression = Rangex.rangeTo(this, endInclusive, step)

///**
// * Create a positive-order int ranges
// */
//inline infix fun Int.rangeTo(endInclusive: Int): IntRange = Rangex.rangeTo(this, endInclusive)

/**
 * Create a positive-order int ranges that does not contain [end]
 */
inline fun Int.until(end: Int, step: Int): IntProgression = Rangex.until(this, end, step)

///**
// * Create a positive-order int ranges that does not contain [end]
// */
//inline infix fun Int.until(end: Int): IntRange = Rangex.until(this, end)

/**
 * Create a reversed int range
 */
inline fun Int.downTo(endInclusive: Int, step: Int): IntProgression = Rangex.downTo(this, endInclusive, step)

///**
// * Create a reversed int range
// */
//inline infix fun Int.downTo(endInclusive: Int): IntProgression = Rangex.downTo(this, endInclusive)

/**
 * Create a reversed int range that does not contain [end]
 */
inline fun Int.downUntilTo(end: Int, step: Int): IntProgression = Rangex.downUntilTo(this, end, step)

/**
 * Create a reversed int range that does not contain [end]
 */
inline infix fun Int.downUntilTo(end: Byte): IntProgression = Rangex.downUntilTo(this, end.toInt())

/**
 * Create a reversed int range that does not contain [end]
 */
inline infix fun Int.downUntilTo(end: Short): IntProgression = Rangex.downUntilTo(this, end.toInt())

/**
 * Create a reversed int range that does not contain [end]
 */
inline infix fun Int.downUntilTo(end: Int): IntProgression = Rangex.downUntilTo(this, end)

/**
 * Create a reversed int range that does not contain [end]
 */
inline infix fun Int.downUntilTo(end: Long): LongProgression = Rangex.downUntilTo(this.toLong(), end)


/* ******************************************* Long Range *******************************************/


/**
 * Create a positive-order long ranges
 */
inline fun Long.rangeTo(endInclusive: Long, step: Long): LongProgression = Rangex.rangeTo(this, endInclusive, step)

///**
// * Create a positive-order long ranges
// */
//inline infix fun Long.rangeTo(endInclusive: Long): LongRange = Rangex.rangeTo(this, endInclusive)

/**
 * Create a positive-order long ranges that does not contain [end]
 */
inline fun Long.until(end: Long, step: Long): LongProgression = Rangex.until(this, end, step)

///**
// * Create a positive-order long ranges that does not contain [end]
// */
//inline infix fun Long.until(end: Long): LongRange = Rangex.until(this, end)

/**
 * Create a reversed long range
 */
inline fun Long.downTo(endInclusive: Long, step: Long): LongProgression = Rangex.downTo(this, endInclusive, step)

///**
// * Create a reversed long range
// */
//inline infix fun Long.downTo(endInclusive: Long): LongProgression = Rangex.downTo(this, endInclusive)

/**
 * Create a reversed int range that does not contain [end]
 */
inline fun Long.downUntilTo(end: Long, step: Long): LongProgression = Rangex.downUntilTo(this, end, step)

/**
 * Create a reversed long range that does not contain [end]
 */
inline infix fun Long.downUntilTo(end: Byte): LongProgression = Rangex.downUntilTo(this, end.toLong())

/**
 * Create a reversed long range that does not contain [end]
 */
inline infix fun Long.downUntilTo(end: Short): LongProgression = Rangex.downUntilTo(this, end.toLong())

/**
 * Create a reversed long range that does not contain [end]
 */
inline infix fun Long.downUntilTo(end: Int): LongProgression = Rangex.downUntilTo(this, end.toLong())

/**
 * Create a reversed long range that does not contain [end]
 */
inline infix fun Long.downUntilTo(end: Long): LongProgression = Rangex.downUntilTo(this, end)


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
inline fun Char.rangeTo(endInclusive: Char, step: Int): CharProgression = Rangex.rangeTo(this, endInclusive, step)

///**
// * Create a positive-order char ranges
// */
//inline infix fun Char.rangeTo(endInclusive: Char): CharRange = Rangex.rangeTo(this, endInclusive)

/**
 * Create a positive-order char ranges that does not contain [end]
 */
inline fun Char.until(end: Char, step: Int): CharProgression = Rangex.until(this, end, step)

///**
// * Create a positive-order char ranges that does not contain [end]
// */
//inline infix fun Char.until(end: Char): CharRange = Rangex.until(this, end)

/**
 * Create a reversed char range
 */
inline fun Char.downTo(endInclusive: Char, step: Int): CharProgression = Rangex.downTo(this, endInclusive, step)

///**
// * Create a reversed char range
// */
//inline infix fun Char.downTo(endInclusive: Char): CharProgression = Rangex.downTo(this, endInclusive)

/**
 * Create a reversed char range that does not contain [end]
 */
inline fun Char.downUntilTo(end: Char, step: Int): CharProgression = Rangex.downUntilTo(this, end, step)

/**
 * Create a reversed char range that does not contain [end]
 */
inline infix fun Char.downUntilTo(end: Char): CharProgression = Rangex.downUntilTo(this, end)


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
 * Create a positive-order year range that does not contain [end]
 */
inline fun Date.yearUntil(end: Date, step: Int): YearRange = Rangex.yearUntil(this, end, step)

/**
 * Create a positive-order year range that does not contain [end]
 */
inline infix fun Date.yearUntil(end: Date): YearRange = Rangex.yearUntil(this, end)


/**
 * Create a reversed year range
 */
inline fun Date.yearDownTo(endInclusive: Date, step: Int): YearRange = Rangex.yearDownTo(this, endInclusive, step)

/**
 * Create a reversed year range
 */
inline infix fun Date.yearDownTo(endInclusive: Date): YearRange = Rangex.yearDownTo(this, endInclusive)


/**
 * Create a reversed year range that does not contain [end]
 */
inline fun Date.yearDownUntilTo(end: Date, step: Int): YearRange = Rangex.yearDownUntilTo(this, end, step)

/**
 * Create a reversed year range that does not contain [end]
 */
inline infix fun Date.yearDownUntilTo(end: Date): YearRange = Rangex.yearDownUntilTo(this, end)


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
 * Create a positive-order month range that does not contain [end]
 */
inline fun Date.monthUntil(end: Date, step: Int): MonthRange = Rangex.monthUntil(this, end, step)

/**
 * Create a positive-order month range that does not contain [end]
 */
inline infix fun Date.monthUntil(end: Date): MonthRange = Rangex.monthUntil(this, end)


/**
 * Create a reversed month range
 */
inline fun Date.monthDownTo(endInclusive: Date, step: Int): MonthRange = Rangex.monthDownTo(this, endInclusive, step)

/**
 * Create a reversed month range
 */
inline infix fun Date.monthDownTo(endInclusive: Date): MonthRange = Rangex.monthDownTo(this, endInclusive)


/**
 * Create a reversed month range that does not contain [end]
 */
inline fun Date.monthDownUntilTo(end: Date, step: Int): MonthRange = Rangex.monthDownUntilTo(this, end, step)

/**
 * Create a reversed month range that does not contain [end]
 */
inline infix fun Date.monthDownUntilTo(end: Date): MonthRange = Rangex.monthDownUntilTo(this, end)


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
 * Create a positive-order day range that does not contain [end]
 */
inline fun Date.dayUntil(end: Date, step: Int): DayRange = Rangex.dayUntil(this, end, step)

/**
 * Create a positive-order day range that does not contain [end]
 */
inline infix fun Date.dayUntil(end: Date): DayRange = Rangex.dayUntil(this, end)


/**
 * Create a reversed day range
 */
inline fun Date.dayDownTo(endInclusive: Date, step: Int): DayRange = Rangex.dayDownTo(this, endInclusive, step)

/**
 * Create a reversed day range
 */
inline infix fun Date.dayDownTo(endInclusive: Date): DayRange = Rangex.dayDownTo(this, endInclusive)


/**
 * Create a reversed day range that does not contain [end]
 */
inline fun Date.dayDownUntilTo(end: Date, step: Int): DayRange = Rangex.dayDownUntilTo(this, end, step)

/**
 * Create a reversed day range that does not contain [end]
 */
inline infix fun Date.dayDownUntilTo(end: Date): DayRange = Rangex.dayDownUntilTo(this, end)


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
 * Create a positive-order hour range that does not contain [end]
 */
inline fun Date.hourUntil(end: Date, step: Int): HourRange = Rangex.hourUntil(this, end, step)

/**
 * Create a positive-order hour range that does not contain [end]
 */
inline infix fun Date.hourUntil(end: Date): HourRange = Rangex.hourUntil(this, end)


/**
 * Create a reversed hour range
 */
inline fun Date.hourDownTo(endInclusive: Date, step: Int): HourRange = Rangex.hourDownTo(this, endInclusive, step)

/**
 * Create a reversed hour range
 */
inline infix fun Date.hourDownTo(endInclusive: Date): HourRange = Rangex.hourDownTo(this, endInclusive)


/**
 * Create a reversed hour range that does not contain [end]
 */
inline fun Date.hourDownUntilTo(end: Date, step: Int): HourRange = Rangex.hourDownUntilTo(this, end, step)

/**
 * Create a reversed hour range that does not contain [end]
 */
inline infix fun Date.hourDownUntilTo(end: Date): HourRange = Rangex.hourDownUntilTo(this, end)


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
 * Create a positive-order minute range that does not contain [end]
 */
inline fun Date.minuteUntil(end: Date, step: Int): MinuteRange = Rangex.minuteUntil(this, end, step)

/**
 * Create a positive-order minute range that does not contain [end]
 */
inline infix fun Date.minuteUntil(end: Date): MinuteRange = Rangex.minuteUntil(this, end)


/**
 * Create a reversed minute range
 */
inline fun Date.minuteDownTo(endInclusive: Date, step: Int): MinuteRange = Rangex.minuteDownTo(this, endInclusive, step)

/**
 * Create a reversed minute range
 */
inline infix fun Date.minuteDownTo(endInclusive: Date): MinuteRange = Rangex.minuteDownTo(this, endInclusive)


/**
 * Create a reversed minute range that does not contain [end]
 */
inline fun Date.minuteDownUntilTo(end: Date, step: Int): MinuteRange = Rangex.minuteDownUntilTo(this, end, step)

/**
 * Create a reversed minute range that does not contain [end]
 */
inline infix fun Date.minuteDownUntilTo(end: Date): MinuteRange = Rangex.minuteDownUntilTo(this, end)


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
 * Create a positive-order second range that does not contain [end]
 */
inline fun Date.secondUntil(end: Date, step: Int): SecondRange = Rangex.secondUntil(this, end, step)

/**
 * Create a positive-order second range that does not contain [end]
 */
inline infix fun Date.secondUntil(end: Date): SecondRange = Rangex.secondUntil(this, end)


/**
 * Create a reversed second range
 */
inline fun Date.secondDownTo(endInclusive: Date, step: Int): SecondRange = Rangex.secondDownTo(this, endInclusive, step)


/**
 * Create a reversed second range
 */
inline infix fun Date.secondDownTo(endInclusive: Date): SecondRange = Rangex.secondDownTo(this, endInclusive)


/**
 * Create a reversed second range that does not contain [end]
 */
inline fun Date.secondDownUntilTo(end: Date, step: Int): SecondRange = Rangex.secondDownUntilTo(this, end, step)

/**
 * Create a reversed second range that does not contain [end]
 */
inline infix fun Date.secondDownUntilTo(end: Date): SecondRange = Rangex.secondDownUntilTo(this, end)


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
 * Create a positive-order millisecond range that does not contain [end]
 */
inline fun Date.millisecondUntil(end: Date, step: Int): MillisecondRange = Rangex.millisecondUntil(this, end, step)

/**
 * Create a positive-order millisecond range that does not contain [end]
 */
inline infix fun Date.millisecondUntil(end: Date): MillisecondRange = Rangex.millisecondUntil(this, end)


/**
 * Create a reversed millisecond range
 */
inline fun Date.millisecondDownTo(endInclusive: Date, step: Int): MillisecondRange = Rangex.millisecondDownTo(this, endInclusive, step)

/**
 * Create a reversed millisecond range
 */
inline infix fun Date.millisecondDownTo(endInclusive: Date): MillisecondRange = Rangex.millisecondDownTo(this, endInclusive)


/**
 * Create a reversed millisecond range that does not contain [end]
 */
inline fun Date.millisecondDownUntilTo(end: Date, step: Int): MillisecondRange = Rangex.millisecondDownUntilTo(this, end, step)

/**
 * Create a reversed millisecond range that does not contain [end]
 */
inline infix fun Date.millisecondDownUntilTo(end: Date): MillisecondRange = Rangex.millisecondDownUntilTo(this, end)