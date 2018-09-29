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

import me.panpf.javax.lang.Numberx
import java.math.RoundingMode


/*
 * Number related extension methods or properties
 */


/**
 * Scale numbers in the specified mode
 *
 * @param newScale Number of digits after the decimal point
 */
inline fun Float.scale(newScale: Int, roundingMode: RoundingMode = RoundingMode.HALF_UP): Float = Numberx.scale(this, newScale, roundingMode)

/**
 * Scale numbers in the specified mode
 *
 * @param newScale Number of digits after the decimal point
 */
inline fun Double.scale(newScale: Int, roundingMode: RoundingMode = RoundingMode.HALF_UP): Double = Numberx.scale(this, newScale, roundingMode)


/**
 * Convert a String to an byte, returning a default value if the conversion fails.
 */
inline fun String?.toByteOrDefault(defaultValue: Byte): Byte = Numberx.toByteOrDefault(this, defaultValue)

/**
 * Convert a String to a byte, returning 0 if the conversion fails.
 */
inline fun String?.toByteOrZero(): Byte = Numberx.toByteOrZero(this)

/**
 * Convert a String to an short, returning a default value if the conversion fails.
 */
inline fun String?.toShortOrDefault(defaultValue: Short): Short = Numberx.toShortOrDefault(this, defaultValue)

/**
 * Convert a String to a short, returning 0 if the conversion fails.
 */
inline fun String?.toShortOrZero(): Short = Numberx.toShortOrZero(this)

/**
 * Convert a String to an int, returning a default value if the conversion fails.
 */
inline fun String?.toIntOrDefault(defaultValue: Int): Int = Numberx.toIntOrDefault(this, defaultValue)

/**
 * Convert a String to a int, returning 0 if the conversion fails.
 */
inline fun String?.toIntOrZero(): Int = Numberx.toIntOrZero(this)

/**
 * Convert a String to an long, returning a default value if the conversion fails.
 */
inline fun String?.toLongOrDefault(defaultValue: Long): Long = Numberx.toLongOrDefault(this, defaultValue)

/**
 * Convert a String to a long, returning 0L if the conversion fails.
 */
inline fun String?.toLongOrZero(): Long = Numberx.toLongOrZero(this)

/**
 * Convert a String to an float, returning a default value if the conversion fails.
 */
inline fun String?.toFloatOrDefault(defaultValue: Float): Float = Numberx.toFloatOrDefault(this, defaultValue)

/**
 * Convert a String to a float, returning 0.0f if the conversion fails.
 */
inline fun String?.toFloatOrZero(): Float = Numberx.toFloatOrZero(this)

/**
 * Convert a String to an double, returning a default value if the conversion fails.
 */
inline fun String?.toDoubleOrDefault(defaultValue: Double): Double = Numberx.toDoubleOrDefault(this, defaultValue)

/**
 * Convert a String to a double, returning 0.0d if the conversion fails.
 */
inline fun String?.toDoubleOrZero(): Double = Numberx.toDoubleOrZero(this)