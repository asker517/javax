package me.panpf.javaxkt.util

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
fun Byte.requireInRange(minValue: Byte, maxValue: Byte) {
    if (this < minValue || this > maxValue) {
        throw IllegalArgumentException(String.format("value %d must be >= %d && <= %d", this, minValue, maxValue))
    }
}

/**
 * Returns true if self is within the range of [minValue] and [maxValue]
 */
fun Short.requireInRange(minValue: Short, maxValue: Short) {
    if (this < minValue || this > maxValue) {
        throw IllegalArgumentException(String.format("value %d must be >= %d && <= %d", this, minValue, maxValue))
    }
}

/**
 * Returns true if self is within the range of [minValue] and [maxValue]
 */
fun Int.requireInRange(minValue: Int, maxValue: Int) {
    if (this < minValue || this > maxValue) {
        throw IllegalArgumentException(String.format("value %d must be >= %d && <= %d", this, minValue, maxValue))
    }
}

/**
 * Returns true if self is within the range of [minValue] and [maxValue]
 */
fun Long.requireInRange(minValue: Long, maxValue: Long) {
    if (this < minValue || this > maxValue) {
        throw IllegalArgumentException(String.format("value %d must be >= %d && <= %d", this, minValue, maxValue))
    }
}

/**
 * Returns true if self is within the range of [minValue] and [maxValue]
 */
fun Float.requireInRange(minValue: Float, maxValue: Float) {
    if (this < minValue || this > maxValue) {
        throw IllegalArgumentException(String.format("value %s must be >= %s && <= %s", this, minValue, maxValue))
    }
}

/**
 * Returns true if self is within the range of [minValue] and [maxValue]
 */
fun Double.requireInRange(minValue: Double, maxValue: Double) {
    if (this < minValue || this > maxValue) {
        throw IllegalArgumentException(String.format("value %s must be >= %s && <= %s", this, minValue, maxValue))
    }
}


/**
 * Return true if self is not in the range [minValue] and [maxValue]
 */
fun Byte.requireNotInRange(minValue: Byte, maxValue: Byte) {
    @Suppress("ConvertTwoComparisonsToRangeCheck")
    if (this >= minValue && this <= maxValue) {
        throw IllegalArgumentException(String.format("value %d must be < %d || > %d", this, minValue, maxValue))
    }
}

/**
 * Return true if self is not in the range [minValue] and [maxValue]
 */
fun Short.requireNotInRange(minValue: Short, maxValue: Short) {
    @Suppress("ConvertTwoComparisonsToRangeCheck")
    if (this >= minValue && this <= maxValue) {
        throw IllegalArgumentException(String.format("value %d must be < %d || > %d", this, minValue, maxValue))
    }
}

/**
 * Return true if self is not in the range [minValue] and [maxValue]
 */
fun Int.requireNotInRange(minValue: Int, maxValue: Int) {
    @Suppress("ConvertTwoComparisonsToRangeCheck")
    if (this >= minValue && this <= maxValue) {
        throw IllegalArgumentException(String.format("value %d must be < %d || > %d", this, minValue, maxValue))
    }
}

/**
 * Return true if self is not in the range [minValue] and [maxValue]
 */
fun Long.requireNotInRange(minValue: Long, maxValue: Long) {
    @Suppress("ConvertTwoComparisonsToRangeCheck")
    if (this >= minValue && this <= maxValue) {
        throw IllegalArgumentException(String.format("value %d must be < %d || > %d", this, minValue, maxValue))
    }
}

/**
 * Return true if self is not in the range [minValue] and [maxValue]
 */
fun Float.requireNotInRange(minValue: Float, maxValue: Float) {
    @Suppress("ConvertTwoComparisonsToRangeCheck")
    if (this >= minValue && this <= maxValue) {
        throw IllegalArgumentException(String.format("value %s must be < %s || > %s", this, minValue, maxValue))
    }
}

/**
 * Return true if self is not in the range [minValue] and [maxValue]
 */
fun Double.requireNotInRange(minValue: Double, maxValue: Double) {
    @Suppress("ConvertTwoComparisonsToRangeCheck")
    if (this >= minValue && this <= maxValue) {
        throw IllegalArgumentException(String.format("value %s must be < %s || > %s", this, minValue, maxValue))
    }
}