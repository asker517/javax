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

package me.panpf.javaxkt.lang

import java.math.BigDecimal
import java.math.RoundingMode


/*
 * Number related extension methods or properties
 */


/**
 * Scale numbers in the specified mode
 *
 * @param newScale Number of digits after the decimal point
 */
fun Float.scale(newScale: Int, roundingMode: RoundingMode = RoundingMode.HALF_UP): Float {
    return BigDecimal(this.toDouble()).setScale(newScale, roundingMode).toFloat()
}

/**
 * Scale numbers in the specified mode
 *
 * @param newScale Number of digits after the decimal point
 */
fun Double.scale(newScale: Int, roundingMode: RoundingMode = RoundingMode.HALF_UP): Double {
    return BigDecimal(this).setScale(newScale, roundingMode).toDouble()
}


/**
 * Convert a String to an byte, returning a default value if the conversion fails.
 */
fun String?.toByteOrDefault(defaultValue: Byte): Byte {
    if (this == null || this.isEmpty()) {
        return defaultValue
    }
    return try {
        java.lang.Byte.parseByte(this)
    } catch (nfe: NumberFormatException) {
        defaultValue
    }
}

/**
 * Convert a String to a byte, returning 0 if the conversion fails.
 */
fun String?.toByteOrZero(): Byte {
    return this.toByteOrDefault(0.toByte())
}

/**
 * Convert a String to an short, returning a default value if the conversion fails.
 */
fun String?.toShortOrDefault(defaultValue: Short): Short {
    if (this == null) {
        return defaultValue
    }
    return try {
        return java.lang.Short.parseShort(this)
    } catch (nfe: NumberFormatException) {
        defaultValue
    }
}

/**
 * Convert a String to a short, returning 0 if the conversion fails.
 */
fun String?.toShortOrZero(): Short {
    return this.toShortOrDefault(0.toShort())
}

/**
 * Convert a String to an int, returning a default value if the conversion fails.
 */
fun String?.toIntOrDefault(defaultValue: Int): Int {
    if (this == null || this.isEmpty()) {
        return defaultValue
    }
    return try {
        Integer.parseInt(this)
    } catch (nfe: NumberFormatException) {
        defaultValue
    }
}

/**
 * Convert a String to a int, returning 0 if the conversion fails.
 */
fun String?.toIntOrZero(): Int {
    return this.toIntOrDefault(0)
}

/**
 * Convert a String to an long, returning a default value if the conversion fails.
 */
fun String?.toLongOrDefault(defaultValue: Long): Long {
    if (this == null) {
        return defaultValue
    }
    return try {
        java.lang.Long.parseLong(this)
    } catch (nfe: NumberFormatException) {
        defaultValue
    }
}

/**
 * Convert a String to a long, returning 0L if the conversion fails.
 */
fun String?.toLongOrZero(): Long {
    return this.toLongOrDefault(0L)
}

/**
 * Convert a String to an float, returning a default value if the conversion fails.
 */
fun String?.toFloatOrDefault(defaultValue: Float): Float {
    if (this == null) {
        return defaultValue
    }
    return try {
        java.lang.Float.parseFloat(this)
    } catch (nfe: NumberFormatException) {
        defaultValue
    }
}

/**
 * Convert a String to a float, returning 0.0f if the conversion fails.
 */
fun String?.toFloatOrZero(): Float {
    return this.toFloatOrDefault(0.0f)
}

/**
 * Convert a String to an double, returning a default value if the conversion fails.
 */
fun String?.toDoubleOrDefault(defaultValue: Double): Double {
    if (this == null) {
        return defaultValue
    }
    return try {
        java.lang.Double.parseDouble(this)
    } catch (nfe: NumberFormatException) {
        defaultValue
    }
}

/**
 * Convert a String to a double, returning 0.0d if the conversion fails.
 */
fun String?.toDoubleOrZero(): Double {
    return this.toDoubleOrDefault(0.0)
}