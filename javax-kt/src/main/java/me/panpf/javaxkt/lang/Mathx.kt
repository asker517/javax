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

package me.panpf.javaxkt.lang

import me.panpf.javax.lang.Mathx
import java.math.RoundingMode


/* ******************************************* divide *******************************************/


/**
 * Divide two numbers, if the divisor is 0, it always return 0
 */
inline fun Byte?.divide(divisor: Byte?): Float = Mathx.divide(this.orZero(), divisor.orZero())

/**
 * Divide two numbers, if the divisor is 0, it always return 0
 */
inline fun Short?.divide(divisor: Short?): Float = Mathx.divide(this.orZero(), divisor.orZero())

/**
 * Divide two numbers, if the divisor is 0, it always return 0
 */
inline fun Int?.divide(divisor: Int?): Float = Mathx.divide(this.orZero(), divisor.orZero())

/**
 * Divide two numbers, if the divisor is 0, it always return 0
 */
inline fun Long?.divide(divisor: Long?): Double = Mathx.divide(this.orZero(), divisor.orZero())

/**
 * Divide two numbers, if the divisor is 0, it always return 0
 */
inline fun Float?.divide(divisor: Float?): Float = Mathx.divide(this.orZero(), divisor.orZero())

/**
 * Divide two numbers, if the divisor is 0, it always return 0
 */
inline fun Double?.divide(divisor: Double?): Double = Mathx.divide(this.orZero(), divisor.orZero())


/**
 * Divide the two numbers and convert the result to int. If the divisor is 0, it always return 0.
 */
inline fun Byte?.divideToInt(divisor: Byte?): Int = Mathx.divideToInt(this.orZero(), divisor.orZero())

/**
 * Divide the two numbers and convert the result to int. If the divisor is 0, it always return 0.
 */
inline fun Short?.divideToInt(divisor: Short?): Int = Mathx.divideToInt(this.orZero(), divisor.orZero())

/**
 * Divide the two numbers and convert the result to int. If the divisor is 0, it always return 0.
 */
inline fun Int?.divideToInt(divisor: Int?): Int = Mathx.divideToInt(this.orZero(), divisor.orZero())

/**
 * Divide the two numbers and convert the result to int. If the divisor is 0, it always return 0.
 */
inline fun Long?.divideToInt(divisor: Long?): Int = Mathx.divideToInt(this.orZero(), divisor.orZero())

/**
 * Divide the two numbers and convert the result to int. If the divisor is 0, it always return 0.
 */
inline fun Float?.divideToInt(divisor: Float?): Int = Mathx.divideToInt(this.orZero(), divisor.orZero())

/**
 * Divide the two numbers and convert the result to int. If the divisor is 0, it always return 0.
 */
inline fun Double?.divideToInt(divisor: Double?): Int = Mathx.divideToInt(this.orZero(), divisor.orZero())


/**
 * Divide the two numbers and convert the result to long. If the divisor is 0, it always return 0.
 */
inline fun Byte?.divideToLong(divisor: Byte?): Long = Mathx.divideToLong(this.orZero(), divisor.orZero())

/**
 * Divide the two numbers and convert the result to long. If the divisor is 0, it always return 0.
 */
inline fun Short?.divideToLong(divisor: Short?): Long = Mathx.divideToLong(this.orZero(), divisor.orZero())

/**
 * Divide the two numbers and convert the result to long. If the divisor is 0, it always return 0.
 */
inline fun Int?.divideToLong(divisor: Int?): Long = Mathx.divideToLong(this.orZero(), divisor.orZero())

/**
 * Divide the two numbers and convert the result to long. If the divisor is 0, it always return 0.
 */
inline fun Long?.divideToLong(divisor: Long?): Long = Mathx.divideToLong(this.orZero(), divisor.orZero())

/**
 * Divide the two numbers and convert the result to long. If the divisor is 0, it always return 0.
 */
inline fun Float?.divideToLong(divisor: Float?): Long = Mathx.divideToLong(this.orZero(), divisor.orZero())

/**
 * Divide the two numbers and convert the result to long. If the divisor is 0, it always return 0.
 */
inline fun Double?.divideToLong(divisor: Double?): Long = Mathx.divideToLong(this.orZero(), divisor.orZero())


/* ******************************************* scale *******************************************/


/**
 * Scale numbers in the specified mode
 *
 * @param newScale Number of digits after the decimal point
 */
inline fun Float?.scale(newScale: Int, roundingMode: RoundingMode = RoundingMode.HALF_UP): Float = Mathx.scale(this.orZero(), newScale, roundingMode)

/**
 * Scale numbers in the specified mode
 *
 * @param newScale Number of digits after the decimal point
 */
inline fun Double?.scale(newScale: Int, roundingMode: RoundingMode = RoundingMode.HALF_UP): Double = Mathx.scale(this.orZero(), newScale, roundingMode)


/* ******************************************* proportion *******************************************/


/**
 * Divide two numbers, If the divisor is 0, then self is not equal to 0, then 1f is returned, otherwise 0f is returned.
 */
inline fun Byte?.proportion(divisor: Byte?, newScale: Int): Float = Mathx.proportion(this.orZero(), divisor.orZero(), newScale)

/**
 * Divide two numbers, If the divisor is 0, then self is not equal to 0, then 1f is returned, otherwise 0f is returned.
 */
inline fun Byte?.proportion(divisor: Byte?): Float = Mathx.proportion(this.orZero(), divisor.orZero())

/**
 * Divide two numbers, If the divisor is 0, then self is not equal to 0, then 1f is returned, otherwise 0f is returned.
 */
inline fun Short?.proportion(divisor: Short?, newScale: Int): Float = Mathx.proportion(this.orZero(), divisor.orZero(), newScale)

/**
 * Divide two numbers, If the divisor is 0, then self is not equal to 0, then 1f is returned, otherwise 0f is returned.
 */
inline fun Short?.proportion(divisor: Short?): Float = Mathx.proportion(this.orZero(), divisor.orZero())

/**
 * Divide two numbers, If the divisor is 0, then self is not equal to 0, then 1f is returned, otherwise 0f is returned.
 */
inline fun Int?.proportion(divisor: Int?, newScale: Int): Float = Mathx.proportion(this.orZero(), divisor.orZero(), newScale)

/**
 * Divide two numbers, If the divisor is 0, then self is not equal to 0, then 1f is returned, otherwise 0f is returned.
 */
inline fun Int?.proportion(divisor: Int?): Float = Mathx.proportion(this.orZero(), divisor.orZero())

/**
 * Divide two numbers, If the divisor is 0, then self is not equal to 0, then 1f is returned, otherwise 0f is returned.
 */
inline fun Long?.proportion(divisor: Long?, newScale: Int): Float = Mathx.proportion(this.orZero(), divisor.orZero(), newScale)

/**
 * Divide two numbers, If the divisor is 0, then self is not equal to 0, then 1f is returned, otherwise 0f is returned.
 */
inline fun Long?.proportion(divisor: Long?): Float = Mathx.proportion(this.orZero(), divisor.orZero())

/**
 * Divide two numbers, If the divisor is 0, then self is not equal to 0, then 1f is returned, otherwise 0f is returned.
 */
inline fun Float?.proportion(divisor: Float?, newScale: Int): Float = Mathx.proportion(this.orZero(), divisor.orZero(), newScale)

/**
 * Divide two numbers, If the divisor is 0, then self is not equal to 0, then 1f is returned, otherwise 0f is returned.
 */
inline fun Float?.proportion(divisor: Float?): Float = Mathx.proportion(this.orZero(), divisor.orZero())

/**
 * Divide two numbers, If the divisor is 0, then self is not equal to 0, then 1f is returned, otherwise 0f is returned.
 */
inline fun Double?.proportion(divisor: Double?, newScale: Int): Float = Mathx.proportion(this.orZero(), divisor.orZero(), newScale)

/**
 * Divide two numbers, If the divisor is 0, then self is not equal to 0, then 1f is returned, otherwise 0f is returned.
 */
inline fun Double?.proportion(divisor: Double?): Float = Mathx.proportion(this.orZero(), divisor.orZero())


/* ******************************************* percent *******************************************/


/**
 * Divide the two numbers, multiply the result by 100 and retain [newScale] decimal places. If the divisor is 0, then self is not equal to 0, then 100f is returned, otherwise 0f is returned.
 */
inline fun Byte?.percent(divisor: Byte?, newScale: Int): Float = Mathx.percent(this.orZero(), divisor.orZero(), newScale)

/**
 * Divide the two numbers, multiply the result by 100 and retain two decimal places. If the divisor is 0, then self is not equal to 0, then 100f is returned, otherwise 0f is returned.
 */
inline fun Byte?.percent(divisor: Byte?): Float = Mathx.percent(this.orZero(), divisor.orZero())

/**
 * Divide the two numbers, multiply the result by 100 and retain [newScale] decimal places. If the divisor is 0, then self is not equal to 0, then 100f is returned, otherwise 0f is returned.
 */
inline fun Short?.percent(divisor: Short?, newScale: Int): Float = Mathx.percent(this.orZero(), divisor.orZero(), newScale)

/**
 * Divide the two numbers, multiply the result by 100 and retain two decimal places. If the divisor is 0, then self is not equal to 0, then 100f is returned, otherwise 0f is returned.
 */
inline fun Short?.percent(divisor: Short?): Float = Mathx.percent(this.orZero(), divisor.orZero())

/**
 * Divide the two numbers, multiply the result by 100 and retain [newScale] decimal places. If the divisor is 0, then self is not equal to 0, then 100f is returned, otherwise 0f is returned.
 */
inline fun Int?.percent(divisor: Int?, newScale: Int): Float = Mathx.percent(this.orZero(), divisor.orZero(), newScale)

/**
 * Divide the two numbers, multiply the result by 100 and retain two decimal places. If the divisor is 0, then self is not equal to 0, then 100f is returned, otherwise 0f is returned.
 */
inline fun Int?.percent(divisor: Int?): Float = Mathx.percent(this.orZero(), divisor.orZero())

/**
 * Divide the two numbers, multiply the result by 100 and retain [newScale] decimal places. If the divisor is 0, then self is not equal to 0, then 100f is returned, otherwise 0f is returned.
 */
inline fun Long?.percent(divisor: Long?, newScale: Int): Float = Mathx.percent(this.orZero(), divisor.orZero(), newScale)

/**
 * Divide the two numbers, multiply the result by 100 and retain two decimal places. If the divisor is 0, then self is not equal to 0, then 100f is returned, otherwise 0f is returned.
 */
inline fun Long?.percent(divisor: Long?): Float = Mathx.percent(this.orZero(), divisor.orZero())

/**
 * Divide the two numbers, multiply the result by 100 and retain [newScale] decimal places. If the divisor is 0, then self is not equal to 0, then 100f is returned, otherwise 0f is returned.
 */
inline fun Float?.percent(divisor: Float?, newScale: Int): Float = Mathx.percent(this.orZero(), divisor.orZero(), newScale)

/**
 * Divide the two numbers, multiply the result by 100 and retain two decimal places. If the divisor is 0, then self is not equal to 0, then 100f is returned, otherwise 0f is returned.
 */
inline fun Float?.percent(divisor: Float?): Float = Mathx.percent(this.orZero(), divisor.orZero())

/**
 * Divide the two numbers, multiply the result by 100 and retain [newScale] decimal places. If the divisor is 0, then self is not equal to 0, then 100f is returned, otherwise 0f is returned.
 */
inline fun Double?.percent(divisor: Double?, newScale: Int): Float = Mathx.percent(this.orZero(), divisor.orZero(), newScale)

/**
 * Divide the two numbers, multiply the result by 100 and retain two decimal places. If the divisor is 0, then self is not equal to 0, then 100f is returned, otherwise 0f is returned.
 */
inline fun Double?.percent(divisor: Double?): Float = Mathx.percent(this.orZero(), divisor.orZero())
