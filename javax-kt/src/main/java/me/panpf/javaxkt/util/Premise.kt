package me.panpf.javaxkt.util

import me.panpf.javaxkt.lang.isSafe
import java.io.File
import java.io.FileNotFoundException


/**
 * Throws an [IllegalArgumentException] with [errorMessage] if the [value] is false.
 */
fun require(value: Boolean, errorMessage: String) {
    if (!value) throw IllegalArgumentException(errorMessage)
}

/**
 * Throws an [IllegalArgumentException] with [errorMessage] if the [value] is null. Otherwise returns the not null value.
 */
fun <T> requireNotNull(value: T?, errorMessage: String): T {
    if (value == null) throw IllegalArgumentException(errorMessage)
    return value
}


/**
 * Throws an [IllegalStateException] with [errorMessage] if the [value] is false.
 */
fun check(value: Boolean, errorMessage: String) {
    if (!value) throw IllegalStateException(errorMessage)
}

/**
 * Throws an [IllegalStateException] with [errorMessage] if the [value] is null. Otherwise returns the not null value.
 */
fun <T> checkNotNull(value: T?, errorMessage: String): T {
    if (value == null) throw IllegalStateException(errorMessage)
    return value
}


/**
 * Throws a [FileNotFoundException] exception if the given file does not exist
 */
@Throws(FileNotFoundException::class)
fun File.requireExist() {
    if (!this.exists()) throw FileNotFoundException(this.path)
}

/**
 * Throws an [IllegalArgumentException] exception if the given file is not a directory
 */
fun File.requireIsDir() {
    if (!this.isDirectory) throw IllegalArgumentException("Must be directory： " + this.path)
}

/**
 * Throws an [IllegalArgumentException] exception if the given file is not a file
 */
fun File.requireIsFile() {
    if (!this.isFile) throw IllegalArgumentException("Must be file： " + this.path)
}


/**
 * Returns true if self is within the range of [minValue] and [maxValue]
 */
fun Byte.requireInRange(minValue: Byte, maxValue: Byte): Byte {
    if (this < minValue || this > maxValue) {
        throw IllegalArgumentException(String.format("value %d must be >= %d && <= %d", this, minValue, maxValue))
    }
    return this
}

/**
 * Returns true if self is within the range of [minValue] and [maxValue]
 */
fun Short.requireInRange(minValue: Short, maxValue: Short): Short {
    if (this < minValue || this > maxValue) {
        throw IllegalArgumentException(String.format("value %d must be >= %d && <= %d", this, minValue, maxValue))
    }
    return this
}

/**
 * Returns true if self is within the range of [minValue] and [maxValue]
 */
fun Int.requireInRange(minValue: Int, maxValue: Int): Int {
    if (this < minValue || this > maxValue) {
        throw IllegalArgumentException(String.format("value %d must be >= %d && <= %d", this, minValue, maxValue))
    }
    return this
}

/**
 * Returns true if self is within the range of [minValue] and [maxValue]
 */
fun Long.requireInRange(minValue: Long, maxValue: Long): Long {
    if (this < minValue || this > maxValue) {
        throw IllegalArgumentException(String.format("value %d must be >= %d && <= %d", this, minValue, maxValue))
    }
    return this
}

/**
 * Returns true if self is within the range of [minValue] and [maxValue]
 */
fun Float.requireInRange(minValue: Float, maxValue: Float): Float {
    if (this < minValue || this > maxValue) {
        throw IllegalArgumentException(String.format("value %s must be >= %s && <= %s", this, minValue, maxValue))
    }
    return this
}

/**
 * Returns true if self is within the range of [minValue] and [maxValue]
 */
fun Double.requireInRange(minValue: Double, maxValue: Double): Double {
    if (this < minValue || this > maxValue) {
        throw IllegalArgumentException(String.format("value %s must be >= %s && <= %s", this, minValue, maxValue))
    }
    return this
}


/**
 * Return true if self is not in the range [minValue] and [maxValue]
 */
fun Byte.requireNotInRange(minValue: Byte, maxValue: Byte): Byte {
    @Suppress("ConvertTwoComparisonsToRangeCheck")
    if (this >= minValue && this <= maxValue) {
        throw IllegalArgumentException(String.format("value %d must be < %d || > %d", this, minValue, maxValue))
    }
    return this
}

/**
 * Return true if self is not in the range [minValue] and [maxValue]
 */
fun Short.requireNotInRange(minValue: Short, maxValue: Short): Short {
    @Suppress("ConvertTwoComparisonsToRangeCheck")
    if (this >= minValue && this <= maxValue) {
        throw IllegalArgumentException(String.format("value %d must be < %d || > %d", this, minValue, maxValue))
    }
    return this
}

/**
 * Return true if self is not in the range [minValue] and [maxValue]
 */
fun Int.requireNotInRange(minValue: Int, maxValue: Int): Int {
    @Suppress("ConvertTwoComparisonsToRangeCheck")
    if (this >= minValue && this <= maxValue) {
        throw IllegalArgumentException(String.format("value %d must be < %d || > %d", this, minValue, maxValue))
    }
    return this
}

/**
 * Return true if self is not in the range [minValue] and [maxValue]
 */
fun Long.requireNotInRange(minValue: Long, maxValue: Long): Long {
    @Suppress("ConvertTwoComparisonsToRangeCheck")
    if (this >= minValue && this <= maxValue) {
        throw IllegalArgumentException(String.format("value %d must be < %d || > %d", this, minValue, maxValue))
    }
    return this
}

/**
 * Return true if self is not in the range [minValue] and [maxValue]
 */
fun Float.requireNotInRange(minValue: Float, maxValue: Float): Float {
    @Suppress("ConvertTwoComparisonsToRangeCheck")
    if (this >= minValue && this <= maxValue) {
        throw IllegalArgumentException(String.format("value %s must be < %s || > %s", this, minValue, maxValue))
    }
    return this
}

/**
 * Return true if self is not in the range [minValue] and [maxValue]
 */
fun Double.requireNotInRange(minValue: Double, maxValue: Double): Double {
    @Suppress("ConvertTwoComparisonsToRangeCheck")
    if (this >= minValue && this <= maxValue) {
        throw IllegalArgumentException(String.format("value %s must be < %s || > %s", this, minValue, maxValue))
    }
    return this
}


/**
 * Throws an [IllegalArgumentException] with the result of calling [lazyMessage] if the self is not safe. Otherwise returns the value.
 */
fun <T : CharSequence> T?.requireSafe(lazyMessage: () -> Any): T? {
    if (!this.isSafe()) throw IllegalArgumentException(lazyMessage().toString())
    return this
}

/**
 * Throws an [IllegalArgumentException] with [errorMessage] if the self is not safe. Otherwise returns the value.
 */
fun <T : CharSequence> T?.requireSafe(errorMessage: String): T? {
    if (!this.isSafe()) throw IllegalArgumentException(errorMessage)
    return this
}

/**
 * Throws an [IllegalArgumentException] if the self is not safe. Otherwise returns the value.
 */
fun <T : CharSequence> T?.requireSafe(): T? {
    this.requireSafe("Failed requireSafe.")
    return this
}

/**
 * Throws an [IllegalArgumentException] with the result of calling [lazyMessage] if the self is safe. Otherwise returns the value.
 */
fun <T : CharSequence> T?.requireNotSafe(lazyMessage: () -> Any): T? {
    if (this.isSafe()) throw IllegalArgumentException(lazyMessage().toString())
    return this
}

/**
 * Throws an [IllegalArgumentException] with [errorMessage] if the self is safe. Otherwise returns the value.
 */
fun <T : CharSequence> T?.requireNotSafe(errorMessage: String): T? {
    if (this.isSafe()) throw IllegalArgumentException(errorMessage)
    return this
}

/**
 * Throws an [IllegalArgumentException] if the self is safe. Otherwise returns the value.
 */
fun <T : CharSequence> T?.requireNotSafe(): T? {
    this.requireNotSafe("Failed requireNotSafe.")
    return this
}