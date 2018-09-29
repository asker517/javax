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

import me.panpf.javax.util.Formatx


/*
 * Formatting related extension methods or properties for number, time, file length, count, etc.
 */


/* ******************************************* Double and Float *******************************************/


/**
 * Format a double number
 *
 * @param suffix                Suffix
 * @param decimalPlacesLength   Keep a few decimal places
 * @param decimalPlacesFillZero Use 0 instead when the number of decimal places is insufficient
 */
inline fun Double.format(suffix: String, decimalPlacesLength: Int = 2, decimalPlacesFillZero: Boolean = false): String = Formatx.format(this, suffix, decimalPlacesLength, decimalPlacesFillZero)

/**
 * Format a float number
 *
 * @param suffix                Suffix
 * @param decimalPlacesLength   Keep a few decimal places
 * @param decimalPlacesFillZero Use 0 instead when the number of decimal places is insufficient
 */
inline fun Float.format(suffix: String, decimalPlacesLength: Int = 2, decimalPlacesFillZero: Boolean = false): String = Formatx.format(this, suffix, decimalPlacesLength, decimalPlacesFillZero)


/* ******************************************* percent *******************************************/


/**
 * Calculate the percentage
 *
 * @param other                Other double number
 * @param decimalPlacesLength   Keep a few decimal places
 * @param decimalPlacesFillZero Use 0 instead when the number of decimal places is insufficient
 */
inline fun Double.formatPercentWith(other: Double, decimalPlacesLength: Int = 2, decimalPlacesFillZero: Boolean = false): String = Formatx.percent(this, other, decimalPlacesLength, decimalPlacesFillZero)

/**
 * Calculate the percentage
 *
 * @param other                Other float number
 * @param decimalPlacesLength   Keep a few decimal places
 * @param decimalPlacesFillZero Use 0 instead when the number of decimal places is insufficient
 */
inline fun Float.formatPercentWith(other: Float, decimalPlacesLength: Int = 2, decimalPlacesFillZero: Boolean = false): String = Formatx.percent(this, other, decimalPlacesLength, decimalPlacesFillZero)

/**
 * Calculate the percentage
 *
 * @param other                Other int number
 * @param decimalPlacesLength   Keep a few decimal places
 * @param decimalPlacesFillZero Use 0 instead when the number of decimal places is insufficient
 */
inline fun Int.formatPercentWith(other: Int, decimalPlacesLength: Int = 2, decimalPlacesFillZero: Boolean = false): String = Formatx.percent(this, other, decimalPlacesLength, decimalPlacesFillZero)

/**
 * Calculate the percentage
 *
 * @param other                Other long number
 * @param decimalPlacesLength   Keep a few decimal places
 * @param decimalPlacesFillZero Use 0 instead when the number of decimal places is insufficient
 */
inline fun Long.formatPercentWith(other: Long, decimalPlacesLength: Int = 2, decimalPlacesFillZero: Boolean = false): String = Formatx.percent(this, other, decimalPlacesLength, decimalPlacesFillZero)


/* ******************************************* fileSize *******************************************/


/**
 * Returns the formatted file length that can be displayed, up to EB
 *
 * @param decimalPlacesLength   Keep a few decimal places
 * @param decimalPlacesFillZero Use 0 instead when the number of decimal places is insufficient
 * @return For example: 300 B, 150.25 KB, 500.46 MB, 300 GB
 */
inline fun Long.formatFileSize(decimalPlacesLength: Int = 2, decimalPlacesFillZero: Boolean = false): String = Formatx.fileSize(this, decimalPlacesLength, decimalPlacesFillZero)

/**
 * Returns the formatted file length that can be displayed, up to EB
 *
 * @param decimalPlacesFillZero Use 0 instead when the number of decimal places is insufficient
 * @return For example: 300 B, 150.25 KB, 500.46 MB, 300 GB
 */
inline fun Long.formatFileSize(decimalPlacesFillZero: Boolean = false): String = Formatx.fileSize(this, decimalPlacesFillZero)

/**
 * Returns the formatted file length that can be displayed, up to EB
 *
 * @param decimalPlacesLength   Keep a few decimal places
 * @param decimalPlacesFillZero Use 0 instead when the number of decimal places is insufficient
 * @return For example: 300 B, 150.25 KB, 500.46 MB, 300 GB
 */
inline fun Int.formatFileSize(decimalPlacesLength: Int = 2, decimalPlacesFillZero: Boolean = false): String = Formatx.fileSize(this.toLong(), decimalPlacesLength, decimalPlacesFillZero)

/**
 * Returns the formatted file length that can be displayed, up to EB
 *
 * @param decimalPlacesFillZero Use 0 instead when the number of decimal places is insufficient
 * @return For example: 300 B, 150.25 KB, 500.46 MB, 300 GB
 */
inline fun Int.formatFileSize(decimalPlacesFillZero: Boolean = false): String = Formatx.fileSize(this.toLong(), decimalPlacesFillZero)

/**
 * Returns the length of the formatted file that can be displayed. The default is 1 decimal place. The maximum support is EB.
 *
 * @param decimalPlacesFillZero Use 0 instead when the number of decimal places is insufficient
 * @return For example: 300 B, 150.3 KB, 500.5 MB, 300 GB
 */
inline fun Long.formatMediumFileSize(decimalPlacesFillZero: Boolean = false): String = Formatx.mediumFileSize(this, decimalPlacesFillZero)

/**
 * Returns the length of the formatted file that can be displayed. The default is 1 decimal place. The maximum support is EB.
 *
 * @param decimalPlacesFillZero Use 0 instead when the number of decimal places is insufficient
 * @return For example: 300 B, 150.3 KB, 500.5 MB, 300 GB
 */
inline fun Int.formatMediumFileSize(decimalPlacesFillZero: Boolean = false): String = Formatx.mediumFileSize(this.toLong(), decimalPlacesFillZero)

/**
 * Returns the length of the formatted file that can be displayed. The default is not to retain decimals. The maximum support is EB.
 *
 * @return For example: 300 B, 150 KB, 500 MB, 300 GB
 */
inline fun Long.formatShortFileSize(): String = Formatx.shortFileSize(this)

/**
 * Returns the length of the formatted file that can be displayed. The default is not to retain decimals. The maximum support is EB.
 *
 * @return For example: 300 B, 150 KB, 500 MB, 300 GB
 */
inline fun Int.formatShortFileSize(): String = Formatx.shortFileSize(this.toLong())


/* ******************************************* totalTime *******************************************/


/**
 * Returns the total time of formatting that can be displayed
 *
 * @param ignoreMillisecond Ignore milliseconds
 */
inline fun Long.formatTotalTime(ignoreMillisecond: Boolean = false, divider: String, daySuffix: String, hourSuffix: String,
                         minuteSuffix: String, secondSuffix: String, millisecondSuffix: String): String {
    return Formatx.totalTime(this, ignoreMillisecond, divider, daySuffix, hourSuffix, minuteSuffix, secondSuffix, millisecondSuffix)
}

/**
 * Returns the total time of formatting that can be displayed
 *
 * @param ignoreMillisecond Ignore milliseconds
 */
inline fun Long.formatTotalTime(ignoreMillisecond: Boolean = false): String = Formatx.totalTime(this, ignoreMillisecond)

/**
 * Returns the total time of formatting that can be displayed
 *
 * @param ignoreMillisecond Ignore milliseconds
 */
inline fun Int.formatTotalTime(ignoreMillisecond: Boolean = false): String = Formatx.totalTime(this, ignoreMillisecond)

/**
 * Returns the total time of formatting that can be displayed
 *
 * @param ignoreMillisecond Ignore milliseconds
 */
inline fun Long.formatTotalTimeShort(ignoreMillisecond: Boolean = false): String = Formatx.totalTimeShort(this, ignoreMillisecond)

/**
 * Returns the total time of formatting that can be displayed
 *
 * @param ignoreMillisecond Ignore milliseconds
 */
inline fun Int.formatTotalTimeShort(ignoreMillisecond: Boolean = false): String = Formatx.totalTimeShort(this, ignoreMillisecond)

/**
 * Returns the total time of formatting that can be displayed
 *
 * @param ignoreMillisecond Ignore milliseconds
 */
inline fun Long.formatTotalTimeZH(ignoreMillisecond: Boolean = false): String = Formatx.totalTimeZH(this, ignoreMillisecond)

/**
 * Returns the total time of formatting that can be displayed
 *
 * @param ignoreMillisecond Ignore milliseconds
 */
inline fun Int.formatTotalTimeZH(ignoreMillisecond: Boolean = false): String = Formatx.totalTimeZH(this, ignoreMillisecond)

/**
 * Returns the total time of formatting that can be displayed
 *
 * @param ignoreMillisecond Ignore milliseconds
 */
inline fun Long.formatTotalTimeZHShort(ignoreMillisecond: Boolean = false): String = Formatx.totalTimeZHShort(this, ignoreMillisecond)

/**
 * Returns the total time of formatting that can be displayed
 *
 * @param ignoreMillisecond Ignore milliseconds
 */
inline fun Int.formatTotalTimeZHShort(ignoreMillisecond: Boolean = false): String = Formatx.totalTimeZHShort(this, ignoreMillisecond)


/* ******************************************* count *******************************************/

/**
 * Formatted count, for example 1100=1.1k,15001=1.5w
 */
inline fun Long.formatCount(): String = Formatx.count(this)

/**
 * Formatted count, for example 1100=1.1k,15001=1.5w
 */
inline fun Int.formatCount(): String = Formatx.count(this)