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

package me.panpf.javaxkt.collections

import me.panpf.javax.collections.Arrayx
import me.panpf.javax.util.Transformer


/*
 * Array related extension methods or properties
 */


/* ******************************************* null or empty ******************************************* */


/**
 * Returns `true` if the array is empty.
 */
inline fun <T> Array<T>?.isNullOrEmpty(): Boolean = Arrayx.isNullOrEmpty(this)

/**
 * Returns `true` if the array is empty.
 */
inline fun CharArray?.isNullOrEmpty(): Boolean = Arrayx.isNullOrEmpty(this)

/**
 * Returns `true` if the array is empty.
 */
inline fun ByteArray?.isNullOrEmpty(): Boolean = Arrayx.isNullOrEmpty(this)

/**
 * Returns `true` if the array is empty.
 */
inline fun ShortArray?.isNullOrEmpty(): Boolean = Arrayx.isNullOrEmpty(this)

/**
 * Returns `true` if the array is empty.
 */
inline fun IntArray?.isNullOrEmpty(): Boolean = Arrayx.isNullOrEmpty(this)

/**
 * Returns `true` if the array is empty.
 */
inline fun LongArray?.isNullOrEmpty(): Boolean = Arrayx.isNullOrEmpty(this)

/**
 * Returns `true` if the array is empty.
 */
inline fun FloatArray?.isNullOrEmpty(): Boolean = Arrayx.isNullOrEmpty(this)

/**
 * Returns `true` if the array is empty.
 */
inline fun DoubleArray?.isNullOrEmpty(): Boolean = Arrayx.isNullOrEmpty(this)

/**
 * Returns `true` if the array is empty.
 */
inline fun BooleanArray?.isNullOrEmpty(): Boolean = Arrayx.isNullOrEmpty(this)

/**
 * Returns `true` if the array is not empty.
 */
inline fun <T> Array<T>?.isNotNullOrEmpty(): Boolean = Arrayx.isNotNullOrEmpty(this)

/**
 * Returns `true` if the array is not empty.
 */
inline fun CharArray?.isNotNullOrEmpty(): Boolean = Arrayx.isNotNullOrEmpty(this)

/**
 * Returns `true` if the array is not empty.
 */
inline fun ByteArray?.isNotNullOrEmpty(): Boolean = Arrayx.isNotNullOrEmpty(this)

/**
 * Returns `true` if the array is not empty.
 */
inline fun ShortArray?.isNotNullOrEmpty(): Boolean = Arrayx.isNotNullOrEmpty(this)

/**
 * Returns `true` if the array is not empty.
 */
inline fun IntArray?.isNotNullOrEmpty(): Boolean = Arrayx.isNotNullOrEmpty(this)

/**
 * Returns `true` if the array is not empty.
 */
inline fun LongArray?.isNotNullOrEmpty(): Boolean = Arrayx.isNotNullOrEmpty(this)

/**
 * Returns `true` if the array is not empty.
 */
inline fun FloatArray?.isNotNullOrEmpty(): Boolean = Arrayx.isNotNullOrEmpty(this)

/**
 * Returns `true` if the array is not empty.
 */
inline fun DoubleArray?.isNotNullOrEmpty(): Boolean = Arrayx.isNotNullOrEmpty(this)

/**
 * Returns `true` if the array is not empty.
 */
inline fun BooleanArray?.isNotNullOrEmpty(): Boolean = Arrayx.isNotNullOrEmpty(this)


/* ******************************************* joinToArrayString ******************************************* */


/**
 * Creates a string from all the elements separated using ', ' and using the given '[' and ']' if supplied.
 */
inline fun <T> Array<T>?.joinToArrayString(transform: Transformer<T, CharSequence>?): String = Arrayx.joinToArrayString(this, transform)

/**
 * Creates a string from all the elements separated using ', ' and using the given '[' and ']' if supplied.
 */
inline fun <T> Array<T>?.joinToArrayString(): String = Arrayx.joinToArrayString(this)

/**
 * Creates a string from all the elements separated using ', ' and using the given '[' and ']' if supplied.
 */
inline fun ByteArray?.joinToArrayString(transform: Transformer<Byte, CharSequence>?): String = Arrayx.joinToArrayString(this, transform)

/**
 * Creates a string from all the elements separated using ', ' and using the given '[' and ']' if supplied.
 */
inline fun ByteArray?.joinToArrayString(): String = Arrayx.joinToArrayString(this)

/**
 * Creates a string from all the elements separated using ', ' and using the given '[' and ']' if supplied.
 */
inline fun ShortArray?.joinToArrayString(transform: Transformer<Short, CharSequence>?): String = Arrayx.joinToArrayString(this, transform)

/**
 * Creates a string from all the elements separated using ', ' and using the given '[' and ']' if supplied.
 */
inline fun ShortArray?.joinToArrayString(): String = Arrayx.joinToArrayString(this)

/**
 * Creates a string from all the elements separated using ', ' and using the given '[' and ']' if supplied.
 */
inline fun IntArray?.joinToArrayString(transform: Transformer<Int, CharSequence>?): String = Arrayx.joinToArrayString(this, transform)

/**
 * Creates a string from all the elements separated using ', ' and using the given '[' and ']' if supplied.
 */
inline fun IntArray?.joinToArrayString(): String = Arrayx.joinToArrayString(this)

/**
 * Creates a string from all the elements separated using ', ' and using the given '[' and ']' if supplied.
 */
inline fun LongArray?.joinToArrayString(transform: Transformer<Long, CharSequence>?): String = Arrayx.joinToArrayString(this, transform)

/**
 * Creates a string from all the elements separated using ', ' and using the given '[' and ']' if supplied.
 */
inline fun LongArray?.joinToArrayString(): String = Arrayx.joinToArrayString(this)

/**
 * Creates a string from all the elements separated using ', ' and using the given '[' and ']' if supplied.
 */
inline fun FloatArray?.joinToArrayString(transform: Transformer<Float, CharSequence>?): String = Arrayx.joinToArrayString(this, transform)

/**
 * Creates a string from all the elements separated using ', ' and using the given '[' and ']' if supplied.
 */
inline fun FloatArray?.joinToArrayString(): String = Arrayx.joinToArrayString(this)

/**
 * Creates a string from all the elements separated using ', ' and using the given '[' and ']' if supplied.
 */
inline fun DoubleArray?.joinToArrayString(transform: Transformer<Double, CharSequence>?): String = Arrayx.joinToArrayString(this, transform)

/**
 * Creates a string from all the elements separated using ', ' and using the given '[' and ']' if supplied.
 */
inline fun DoubleArray?.joinToArrayString(): String = Arrayx.joinToArrayString(this)

/**
 * Creates a string from all the elements separated using ', ' and using the given '[' and ']' if supplied.
 */
inline fun BooleanArray?.joinToArrayString(transform: Transformer<Boolean, CharSequence>?): String = Arrayx.joinToArrayString(this, transform)

/**
 * Creates a string from all the elements separated using ', ' and using the given '[' and ']' if supplied.
 */
inline fun BooleanArray?.joinToArrayString(): String = Arrayx.joinToArrayString(this)

/**
 * Creates a string from all the elements separated using ', ' and using the given '[' and ']' if supplied.
 */
inline fun CharArray?.joinToArrayString(transform: Transformer<Char, CharSequence>?): String = Arrayx.joinToArrayString(this, transform)

/**
 * Creates a string from all the elements separated using ', ' and using the given '[' and ']' if supplied.
 */
inline fun CharArray?.joinToArrayString(): String = Arrayx.joinToArrayString(this)