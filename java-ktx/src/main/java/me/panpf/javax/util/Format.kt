/*
 * Copyright (C) 2018 Peng fei Pan <sky@panpf.me>
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

package me.panpf.javax.util

import java.text.DecimalFormat

/*
 * Mathematical related tool method
 */


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
    return DecimalFormat(buffString.toString()).format(this)
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
 * @param decimalPlacesLength   Keep a few decimal places
 * @param decimalPlacesFillZero Use 0 instead when the number of decimal places is insufficient
 * @return For example: 300 B, 150.25 KB, 500.46 MB, 300 GB
 */
fun Int.formatFileSize(decimalPlacesLength: Int = 2, decimalPlacesFillZero: Boolean = false): String {
    return this.toLong().formatFileSize(decimalPlacesLength, decimalPlacesFillZero)
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