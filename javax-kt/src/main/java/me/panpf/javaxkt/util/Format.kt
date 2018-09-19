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

import me.panpf.javaxkt.lang.scale
import java.math.RoundingMode
import java.text.DecimalFormat

/*
 * Formatting tool method for number, time, file length, count, etc.
 */


/* ******************************************* Double and Float *******************************************/


/**
 * Format a double number
 *
 * @param suffix                Suffix
 * @param decimalPlacesLength   Keep a few decimal places
 * @param decimalPlacesFillZero Use 0 instead when the number of decimal places is insufficient
 */
fun Double.format(suffix: String, decimalPlacesLength: Int = 2, decimalPlacesFillZero: Boolean = false): String {
    val buffString = StringBuilder()
    buffString.append("#")
    if (decimalPlacesLength > 0) {
        buffString.append(".")
        for (w in 0 until decimalPlacesLength) {
            buffString.append(if (decimalPlacesFillZero) "0" else "#")
        }
    }
    buffString.append(suffix)
    val format = DecimalFormat(buffString.toString())
    format.roundingMode = RoundingMode.HALF_UP
    return format.format(this)
}

/**
 * Format a float number
 *
 * @param suffix                Suffix
 * @param decimalPlacesLength   Keep a few decimal places
 * @param decimalPlacesFillZero Use 0 instead when the number of decimal places is insufficient
 */
fun Float.format(suffix: String, decimalPlacesLength: Int = 2, decimalPlacesFillZero: Boolean = false): String {
    val buffString = StringBuilder()
    buffString.append("#")
    if (decimalPlacesLength > 0) {
        buffString.append(".")
        for (w in 0 until decimalPlacesLength) {
            buffString.append(if (decimalPlacesFillZero) "0" else "#")
        }
    }
    buffString.append(suffix)
    return DecimalFormat(buffString.toString()).format(this.toDouble())
}


/* ******************************************* percent *******************************************/


/**
 * Calculate the percentage
 *
 * @param decimalPlacesLength   Keep a few decimal places
 * @param decimalPlacesFillZero Use 0 instead when the number of decimal places is insufficient
 */
@JvmOverloads
fun Double.formatPercent(decimalPlacesLength: Int = 2, decimalPlacesFillZero: Boolean = false): String {
    return this.format("%", decimalPlacesLength, decimalPlacesFillZero)
}

/**
 * Calculate the percentage
 *
 * @param other                Other double number
 * @param decimalPlacesLength   Keep a few decimal places
 * @param decimalPlacesFillZero Use 0 instead when the number of decimal places is insufficient
 */
fun Double.formatPercentWith(other: Double, decimalPlacesLength: Int = 2, decimalPlacesFillZero: Boolean = false): String {
    return (this / other).formatPercent(decimalPlacesLength, decimalPlacesFillZero)
}

/**
 * Calculate the percentage
 *
 * @param decimalPlacesLength   Keep a few decimal places
 * @param decimalPlacesFillZero Use 0 instead when the number of decimal places is insufficient
 */
fun Float.formatPercent(decimalPlacesLength: Int = 2, decimalPlacesFillZero: Boolean = false): String {
    return this.format("%", decimalPlacesLength, decimalPlacesFillZero)
}

/**
 * Calculate the percentage
 *
 * @param other                Other float number
 * @param decimalPlacesLength   Keep a few decimal places
 * @param decimalPlacesFillZero Use 0 instead when the number of decimal places is insufficient
 */
fun Float.formatPercentWith(other: Float, decimalPlacesLength: Int = 2, decimalPlacesFillZero: Boolean = false): String {
    return (this / other).formatPercent(decimalPlacesLength, decimalPlacesFillZero)
}

/**
 * Calculate the percentage
 *
 * @param other                Other int number
 * @param decimalPlacesLength   Keep a few decimal places
 * @param decimalPlacesFillZero Use 0 instead when the number of decimal places is insufficient
 */
fun Int.formatPercentWith(other: Int, decimalPlacesLength: Int = 2, decimalPlacesFillZero: Boolean = false): String {
    return (this.toDouble() / other).formatPercent(decimalPlacesLength, decimalPlacesFillZero)
}

/**
 * Calculate the percentage
 *
 * @param other                Other long number
 * @param decimalPlacesLength   Keep a few decimal places
 * @param decimalPlacesFillZero Use 0 instead when the number of decimal places is insufficient
 */
fun Long.formatPercentWith(other: Long, decimalPlacesLength: Int = 2, decimalPlacesFillZero: Boolean = false): String {
    return (this.toDouble() / other).formatPercent(decimalPlacesLength, decimalPlacesFillZero)
}


/* ******************************************* fileSize *******************************************/


/**
 * Returns the formatted file length that can be displayed, up to EB
 *
 * @param decimalPlacesLength   Keep a few decimal places
 * @param decimalPlacesFillZero Use 0 instead when the number of decimal places is insufficient
 * @return For example: 300 B, 150.25 KB, 500.46 MB, 300 GB
 */
fun Long.formatFileSize(decimalPlacesLength: Int = 2, decimalPlacesFillZero: Boolean = false): String {
    return when {
        this < 1024 -> this.toString() + " B"
        this < 1024L * 1024 -> (this.toDouble() / 1024).format(" KB", decimalPlacesLength, decimalPlacesFillZero)
        this < 1024L * 1024 * 1024 -> (this.toDouble() / 1024 / 1024).format(" MB", decimalPlacesLength, decimalPlacesFillZero)
        this < 1024L * 1024 * 1024 * 1024 -> (this.toDouble() / 1024 / 1024 / 1024).format(" GB", decimalPlacesLength, decimalPlacesFillZero)
        this < 1024L * 1024 * 1024 * 1024 * 1024 -> (this.toDouble() / 1024 / 1024 / 1024 / 1024).format(" TB", decimalPlacesLength, decimalPlacesFillZero)
        this < 1024L * 1024 * 1024 * 1024 * 1024 * 1024 -> (this.toDouble() / 1024 / 1024 / 1024 / 1024 / 1024).format(" PB", decimalPlacesLength, decimalPlacesFillZero)
        else -> (this.toDouble() / 1024 / 1024 / 1024 / 1024 / 1024 / 1024).format(" EB", decimalPlacesLength, decimalPlacesFillZero)
    }
}

/**
 * Returns the formatted file length that can be displayed, up to EB
 *
 * @param decimalPlacesFillZero Use 0 instead when the number of decimal places is insufficient
 * @return For example: 300 B, 150.25 KB, 500.46 MB, 300 GB
 */
fun Long.formatFileSize(decimalPlacesFillZero: Boolean = false): String {
    return this.formatFileSize(2, decimalPlacesFillZero)
}

/**
 * Returns the formatted file length that can be displayed, up to EB
 *
 * @param decimalPlacesLength   Keep a few decimal places
 * @param decimalPlacesFillZero Use 0 instead when the number of decimal places is insufficient
 * @return For example: 300 B, 150.25 KB, 500.46 MB, 300 GB
 */
fun Int.formatFileSize(decimalPlacesLength: Int = 2, decimalPlacesFillZero: Boolean = false): String {
    return this.toLong().formatFileSize(decimalPlacesLength, decimalPlacesFillZero)
}

/**
 * Returns the formatted file length that can be displayed, up to EB
 *
 * @param decimalPlacesFillZero Use 0 instead when the number of decimal places is insufficient
 * @return For example: 300 B, 150.25 KB, 500.46 MB, 300 GB
 */
fun Int.formatFileSize(decimalPlacesFillZero: Boolean = false): String {
    return this.toLong().formatFileSize(2, decimalPlacesFillZero)
}

/**
 * Returns the length of the formatted file that can be displayed. The default is 1 decimal place. The maximum support is EB.
 *
 * @param decimalPlacesFillZero Use 0 instead when the number of decimal places is insufficient
 * @return For example: 300 B, 150.3 KB, 500.5 MB, 300 GB
 */
fun Long.formatMediumFileSize(decimalPlacesFillZero: Boolean = false): String {
    return this.formatFileSize(1, decimalPlacesFillZero)
}

/**
 * Returns the length of the formatted file that can be displayed. The default is 1 decimal place. The maximum support is EB.
 *
 * @param decimalPlacesFillZero Use 0 instead when the number of decimal places is insufficient
 * @return For example: 300 B, 150.3 KB, 500.5 MB, 300 GB
 */
fun Int.formatMediumFileSize(decimalPlacesFillZero: Boolean = false): String {
    return this.toLong().formatFileSize(1, decimalPlacesFillZero)
}

/**
 * Returns the length of the formatted file that can be displayed. The default is not to retain decimals. The maximum support is EB.
 *
 * @return For example: 300 B, 150 KB, 500 MB, 300 GB
 */
fun Long.formatShortFileSize(): String {
    return this.formatFileSize(0, false)
}

/**
 * Returns the length of the formatted file that can be displayed. The default is not to retain decimals. The maximum support is EB.
 *
 * @return For example: 300 B, 150 KB, 500 MB, 300 GB
 */
fun Int.formatShortFileSize(): String {
    return this.toLong().formatFileSize(0, false)
}


/* ******************************************* totalTime *******************************************/


private const val ONE_DAY_MILLISECONDS = (1000 * 60 * 60 * 24).toLong()
private const val ONE_HOUR_MILLISECONDS = (1000 * 60 * 60).toLong()
private const val ONE_MINUTE_MILLISECONDS = (1000 * 60).toLong()
private const val ONE_SECOND_MILLISECONDS: Long = 1000

/**
 * Returns the total time of formatting that can be displayed
 *
 * @param ignoreMillisecond Ignore milliseconds
 */
fun Long.formatTotalTime(ignoreMillisecond: Boolean = false, divider: String,
                         daySuffix: String, hourSuffix: String, minuteSuffix: String,
                         secondSuffix: String, millisecondSuffix: String): String {
    val finalTotalTimeMillis = if (this >= 0) this else 0

    return when {
        !ignoreMillisecond && finalTotalTimeMillis < ONE_SECOND_MILLISECONDS -> // millisecond
            finalTotalTimeMillis.toString() + millisecondSuffix
        finalTotalTimeMillis < ONE_MINUTE_MILLISECONDS -> {
            // second
            val second = finalTotalTimeMillis / ONE_SECOND_MILLISECONDS
            val millisecond = if (!ignoreMillisecond) finalTotalTimeMillis % ONE_SECOND_MILLISECONDS else 0
            second.toString() + secondSuffix +
                    (if (millisecond > 0) divider + millisecond.toString() + millisecondSuffix else "")
        }
        finalTotalTimeMillis < ONE_HOUR_MILLISECONDS -> {
            // minute
            val minute = finalTotalTimeMillis / ONE_MINUTE_MILLISECONDS
            val second = finalTotalTimeMillis % ONE_MINUTE_MILLISECONDS / ONE_SECOND_MILLISECONDS
            val millisecond = if (!ignoreMillisecond) finalTotalTimeMillis % ONE_SECOND_MILLISECONDS else 0
            minute.toString() + minuteSuffix +
                    (if (second > 0) divider + second.toString() + secondSuffix else "") +
                    (if (millisecond > 0) divider + millisecond.toString() + millisecondSuffix else "")
        }
        finalTotalTimeMillis < ONE_DAY_MILLISECONDS -> {
            // hour
            val hour = finalTotalTimeMillis / ONE_HOUR_MILLISECONDS
            val minute = finalTotalTimeMillis % ONE_HOUR_MILLISECONDS / ONE_MINUTE_MILLISECONDS
            val second = finalTotalTimeMillis % ONE_MINUTE_MILLISECONDS / ONE_SECOND_MILLISECONDS
            val millisecond = if (!ignoreMillisecond) finalTotalTimeMillis % ONE_SECOND_MILLISECONDS else 0
            hour.toString() + hourSuffix +
                    (if (minute > 0) divider + minute.toString() + minuteSuffix else "") +
                    (if (second > 0) divider + second.toString() + secondSuffix else "") +
                    (if (millisecond > 0) divider + millisecond.toString() + millisecondSuffix else "")
        }
        else -> {
            // day
            val day = finalTotalTimeMillis / ONE_DAY_MILLISECONDS
            val hour = finalTotalTimeMillis % ONE_DAY_MILLISECONDS / ONE_HOUR_MILLISECONDS
            val minute = finalTotalTimeMillis % ONE_HOUR_MILLISECONDS / ONE_MINUTE_MILLISECONDS
            val second = finalTotalTimeMillis % ONE_MINUTE_MILLISECONDS / ONE_SECOND_MILLISECONDS
            val millisecond = if (!ignoreMillisecond) finalTotalTimeMillis % ONE_SECOND_MILLISECONDS else 0
            day.toString() + daySuffix +
                    (if (hour > 0) divider + hour.toString() + hourSuffix else "") +
                    (if (minute > 0) divider + minute.toString() + minuteSuffix else "") +
                    (if (second > 0) divider + second.toString() + secondSuffix else "") +
                    (if (millisecond > 0) divider + millisecond.toString() + millisecondSuffix else "")
        }
    }
}

/**
 * Returns the total time of formatting that can be displayed
 *
 * @param ignoreMillisecond Ignore milliseconds
 */
fun Long.formatTotalTime(ignoreMillisecond: Boolean = false): String {
    return this.formatTotalTime(ignoreMillisecond, " ", "d", "h", "m", "s", "ms")
}

/**
 * Returns the total time of formatting that can be displayed
 *
 * @param ignoreMillisecond Ignore milliseconds
 */
fun Int.formatTotalTime(ignoreMillisecond: Boolean = false): String {
    return this.toLong().formatTotalTime(ignoreMillisecond)
}

/**
 * Returns the total time of formatting that can be displayed
 *
 * @param ignoreMillisecond Ignore milliseconds
 */
fun Long.formatTotalTimeShort(ignoreMillisecond: Boolean = false): String {
    return this.formatTotalTime(ignoreMillisecond, "", "d", "h", "m", "s", "ms")
}

/**
 * Returns the total time of formatting that can be displayed
 *
 * @param ignoreMillisecond Ignore milliseconds
 */
fun Int.formatTotalTimeShort(ignoreMillisecond: Boolean = false): String {
    return this.toLong().formatTotalTimeShort(ignoreMillisecond)
}

/**
 * Returns the total time of formatting that can be displayed
 *
 * @param ignoreMillisecond Ignore milliseconds
 */
fun Long.formatTotalTimeZH(ignoreMillisecond: Boolean = false): String {
    return this.formatTotalTime(ignoreMillisecond, " ", "天", "小时", "分", "秒", "毫秒")
}

/**
 * Returns the total time of formatting that can be displayed
 *
 * @param ignoreMillisecond Ignore milliseconds
 */
fun Int.formatTotalTimeZH(ignoreMillisecond: Boolean = false): String {
    return this.toLong().formatTotalTimeZH(ignoreMillisecond)
}

/**
 * Returns the total time of formatting that can be displayed
 *
 * @param ignoreMillisecond Ignore milliseconds
 */
fun Long.formatTotalTimeZHShort(ignoreMillisecond: Boolean = false): String {
    return this.formatTotalTime(ignoreMillisecond, "", "天", "小时", "分", "秒", "毫秒")
}

/**
 * Returns the total time of formatting that can be displayed
 *
 * @param ignoreMillisecond Ignore milliseconds
 */
fun Int.formatTotalTimeZHShort(ignoreMillisecond: Boolean = false): String {
    return this.toLong().formatTotalTimeZHShort(ignoreMillisecond)
}


/* ******************************************* count *******************************************/

/**
 * Formatted count, for example 1100=1.1k,15001=1.5w
 */
fun Long.formatCount(): String {
    return when {
        this < 1000 -> this.toString()
        this < 10000 -> (this.toFloat() / 1000).scale(1, RoundingMode.DOWN).format("k", 1)
        else -> (this.toFloat() / 10000).scale(1, RoundingMode.DOWN).format("w", 1)
    }
}

/**
 * Formatted count, for example 1100=1.1k,15001=1.5w
 */
fun Int.formatCount(): String = this.toLong().formatCount()