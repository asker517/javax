@file:Suppress("NOTHING_TO_INLINE")

package me.panpf.javaxkt.util

import me.panpf.javax.util.Premisex
import java.io.File
import java.io.FileNotFoundException


/*
 * Premise extension methods or properties
 */


/* ******************************************* null *******************************************/


/**
 * If the self is not null, it returns itself, otherwise it throws an IllegalArgumentException with the result of calling [lazyMessage]
 */
inline fun <T> T?.requireNotNull(crossinline lazyMessage: () -> String): T = Premisex.requireNotNull(this) { lazyMessage() }

/**
 * If the self is not null, it returns itself, otherwise it throws an IllegalArgumentException
 */
inline fun <T> T?.requireNotNull(): T = Premisex.requireNotNull(this)

/**
 * If the self is not null, it returns itself, otherwise it throws an IllegalArgumentException
 */
inline fun <T> T?.requireNotNull(paramName: String): T = Premisex.requireNotNull(this, paramName)


/**
 * If the self is not null, it returns itself, otherwise it throws an IllegalStateException with the result of calling [lazyMessage]
 */
inline fun <T> T?.checkNotNull(crossinline lazyMessage: () -> String): T = Premisex.requireNotNull(this) { lazyMessage() }

/**
 * If the self is not null, it returns itself, otherwise it throws an IllegalStateException
 */
inline fun <T> T?.checkNotNull(): T = Premisex.requireNotNull(this)

/**
 * If the self is not null, it returns itself, otherwise it throws an IllegalStateException
 */
inline fun <T> T?.checkNotNull(paramName: String): T = Premisex.requireNotNull(this, paramName)


/* ******************************************* file *******************************************/


/**
 * If the given file exist, it returns itself, otherwise it throws an FileNotFoundException
 */
@Throws(FileNotFoundException::class)
inline fun File.requireFileExist(paramName: String = "unknown"): File = Premisex.requireFileExist(this, paramName)

/**
 * If the given file is a directory, it returns itself, otherwise it throws an IllegalArgumentException
 */
inline fun File.requireIsDir(paramName: String = "unknown"): File = Premisex.requireIsDir(this, paramName)

/**
 * If the given file is a file, it returns itself, otherwise it throws an IllegalArgumentException
 */
inline fun File.requireIsFile(paramName: String = "unknown"): File = Premisex.requireIsFile(this, paramName)


/* ******************************************* range *******************************************/


/**
 * If self is within the range of [minValue] and [maxValue], it returns itself, otherwise it throws an IllegalArgumentException
 */
inline fun Byte.requireInRange(minValue: Byte, maxValue: Byte, paramName: String = "unknown"): Byte = Premisex.requireInRange(this, minValue, maxValue, paramName)

/**
 * If self is within the range of [minValue] and [maxValue], it returns itself, otherwise it throws an IllegalArgumentException
 */
inline fun Short.requireInRange(minValue: Short, maxValue: Short, paramName: String = "unknown"): Short = Premisex.requireInRange(this, minValue, maxValue, paramName)

/**
 * If self is within the range of [minValue] and [maxValue], it returns itself, otherwise it throws an IllegalArgumentException
 */
inline fun Int.requireInRange(minValue: Int, maxValue: Int, paramName: String = "unknown"): Int = Premisex.requireInRange(this, minValue, maxValue, paramName)

/**
 * If self is within the range of [minValue] and [maxValue], it returns itself, otherwise it throws an IllegalArgumentException
 */
inline fun Long.requireInRange(minValue: Long, maxValue: Long, paramName: String = "unknown"): Long = Premisex.requireInRange(this, minValue, maxValue, paramName)

/**
 * If self is within the range of [minValue] and [maxValue], it returns itself, otherwise it throws an IllegalArgumentException
 */
inline fun Float.requireInRange(minValue: Float, maxValue: Float, paramName: String = "unknown"): Float = Premisex.requireInRange(this, minValue, maxValue, paramName)

/**
 * If self is within the range of [minValue] and [maxValue], it returns itself, otherwise it throws an IllegalArgumentException
 */
inline fun Double.requireInRange(minValue: Double, maxValue: Double, paramName: String = "unknown"): Double = Premisex.requireInRange(this, minValue, maxValue, paramName)


/**
 * If self is not in the range [minValue] and [maxValue], it returns itself, otherwise it throws an IllegalArgumentException
 */
inline fun Byte.requireNotInRange(minValue: Byte, maxValue: Byte, paramName: String = "unknown"): Byte = Premisex.requireNotInRange(this, minValue, maxValue, paramName)

/**
 * If self is not in the range [minValue] and [maxValue], it returns itself, otherwise it throws an IllegalArgumentException
 */
inline fun Short.requireNotInRange(minValue: Short, maxValue: Short, paramName: String = "unknown"): Short = Premisex.requireNotInRange(this, minValue, maxValue, paramName)

/**
 * If self is not in the range [minValue] and [maxValue], it returns itself, otherwise it throws an IllegalArgumentException
 */
inline fun Int.requireNotInRange(minValue: Int, maxValue: Int, paramName: String = "unknown"): Int = Premisex.requireNotInRange(this, minValue, maxValue, paramName)

/**
 * If self is not in the range [minValue] and [maxValue], it returns itself, otherwise it throws an IllegalArgumentException
 */
inline fun Long.requireNotInRange(minValue: Long, maxValue: Long, paramName: String = "unknown"): Long = Premisex.requireNotInRange(this, minValue, maxValue, paramName)

/**
 * If self is not in the range [minValue] and [maxValue], it returns itself, otherwise it throws an IllegalArgumentException
 */
inline fun Float.requireNotInRange(minValue: Float, maxValue: Float, paramName: String = "unknown"): Float = Premisex.requireNotInRange(this, minValue, maxValue, paramName)

/**
 * If self is not in the range [minValue] and [maxValue], it returns itself, otherwise it throws an IllegalArgumentException
 */
inline fun Double.requireNotInRange(minValue: Double, maxValue: Double, paramName: String = "unknown"): Double = Premisex.requireNotInRange(this, minValue, maxValue, paramName)


/* ******************************************* string safe *******************************************/


/**
 * If the self is null or empty or blank, it returns itself, otherwise it throws an IllegalArgumentException.
 */
inline fun <T : CharSequence> T?.requireSafe(paramName: String = "unknown"): T? = Premisex.requireSafe(this, paramName)

/**
 * If the self is not null or empty or blank, it returns itself, otherwise it throws an IllegalArgumentException.
 */
inline fun <T : CharSequence> T?.requireNotSafe(paramName: String = "unknown"): T? = Premisex.requireNotSafe(this, paramName)


/* ******************************************* number zero *******************************************/


/**
 * If self is not 0, it returns itself, otherwise it throws an exception.
 */
inline fun Byte.requireNotZero(paramName: String = "unknown"): Byte = Premisex.requireNotZero(this, paramName)

/**
 * If self is not 0, it returns itself, otherwise it throws an exception.
 */
inline fun Short.requireNotZero(paramName: String = "unknown"): Short = Premisex.requireNotZero(this, paramName)

/**
 * If self is not 0, it returns itself, otherwise it throws an exception.
 */
inline fun Int.requireNotZero(paramName: String = "unknown"): Int = Premisex.requireNotZero(this, paramName)

/**
 * If self is not 0, it returns itself, otherwise it throws an exception.
 */
inline fun Long.requireNotZero(paramName: String = "unknown"): Long = Premisex.requireNotZero(this, paramName)

/**
 * If self is not 0, it returns itself, otherwise it throws an exception.
 */
inline fun Float.requireNotZero(paramName: String = "unknown"): Float = Premisex.requireNotZero(this, paramName)

/**
 * If self is not 0, it returns itself, otherwise it throws an exception.
 */
inline fun Double.requireNotZero(paramName: String = "unknown"): Double = Premisex.requireNotZero(this, paramName)