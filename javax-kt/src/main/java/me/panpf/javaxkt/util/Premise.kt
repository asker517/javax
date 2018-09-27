package me.panpf.javaxkt.util

import me.panpf.javaxkt.lang.isNotSafe
import me.panpf.javaxkt.lang.isSafe
import java.io.File
import java.io.FileNotFoundException


/*
 * Premise extension methods or properties
 */


/* ******************************************* null *******************************************/


/**
 * If the [value] is not null, it returns itself, otherwise it throws an IllegalArgumentException
 */
fun <T> requireNotNull(value: T?, paramName: String): T {
    return value ?: throw IllegalArgumentException(String.format("The parameter '%s'cannot be null", paramName))
}


/**
 * If the [value] is not null, it returns itself, otherwise it throws an IllegalArgumentException
 */
fun <T> checkNotNull(value: T?, paramName: String): T {
    return value ?: throw IllegalStateException(String.format("The parameter '%s'cannot be null", paramName))
}


/* ******************************************* file *******************************************/


/**
 * If the given file exist, it returns itself, otherwise it throws an FileNotFoundException
 */
@Throws(FileNotFoundException::class)
fun File.requireFileExist(paramName: String = "unknown"): File {
    return if (this.exists()) {
        this
    } else {
        throw FileNotFoundException(String.format("The file pointed to by this parameter '%s': %s", paramName, this.path))
    }
}

/**
 * If the given file is a directory, it returns itself, otherwise it throws an IllegalArgumentException
 */
fun File.requireIsDir(paramName: String = "unknown"): File {
    return if (this.isDirectory) {
        this
    } else {
        throw IllegalArgumentException(String.format("The file pointed to by the parameter '%s' is not a directory: %s", paramName, this.path))
    }
}

/**
 * If the given file is a file, it returns itself, otherwise it throws an IllegalArgumentException
 */
fun File.requireIsFile(paramName: String = "unknown"): File {
    return if (this.isFile) {
        this
    } else {
        throw IllegalArgumentException(String.format("The file pointed to by the parameter '%s' is not a file: %s", paramName, this.path))
    }
}


/* ******************************************* range *******************************************/


/**
 * If self is within the range of [minValue] and [maxValue], it returns itself, otherwise it throws an IllegalArgumentException
 */
fun Byte.requireInRange(minValue: Byte, maxValue: Byte, paramName: String = "unknown"): Byte {
    @Suppress("ConvertTwoComparisonsToRangeCheck")
    return if (this >= minValue && this <= maxValue) {
        this
    } else {
        throw IllegalArgumentException(String.format("The byte parameter '%s' value is %d, must be >= %d && <= %d", paramName, this, minValue, maxValue))
    }
}

/**
 * If self is within the range of [minValue] and [maxValue], it returns itself, otherwise it throws an IllegalArgumentException
 */
fun Short.requireInRange(minValue: Short, maxValue: Short, paramName: String = "unknown"): Short {
    @Suppress("ConvertTwoComparisonsToRangeCheck")
    return if (this >= minValue && this <= maxValue) {
        this
    } else {
        throw IllegalArgumentException(String.format("The short parameter '%s' value is %d, must be >= %d && <= %d", paramName, this, minValue, maxValue))
    }
}

/**
 * If self is within the range of [minValue] and [maxValue], it returns itself, otherwise it throws an IllegalArgumentException
 */
fun Int.requireInRange(minValue: Int, maxValue: Int, paramName: String = "unknown"): Int {
    @Suppress("ConvertTwoComparisonsToRangeCheck")
    return if (this >= minValue && this <= maxValue) {
        this
    } else {
        throw IllegalArgumentException(String.format("The int parameter '%s' value is %d, must be >= %d && <= %d", paramName, this, minValue, maxValue))
    }
}

/**
 * If self is within the range of [minValue] and [maxValue], it returns itself, otherwise it throws an IllegalArgumentException
 */
fun Long.requireInRange(minValue: Long, maxValue: Long, paramName: String = "unknown"): Long {
    @Suppress("ConvertTwoComparisonsToRangeCheck")
    return if (this >= minValue && this <= maxValue) {
        this
    } else {
        throw IllegalArgumentException(String.format("The long parameter '%s' value is %d, must be >= %d && <= %d", paramName, this, minValue, maxValue))
    }
}

/**
 * If self is within the range of [minValue] and [maxValue], it returns itself, otherwise it throws an IllegalArgumentException
 */
fun Float.requireInRange(minValue: Float, maxValue: Float, paramName: String = "unknown"): Float {
    @Suppress("ConvertTwoComparisonsToRangeCheck")
    return if (this >= minValue && this <= maxValue) {
        this
    } else {
        throw IllegalArgumentException(String.format("The float parameter '%s' value is %s, must be >= %s && <= %s", paramName, this, minValue, maxValue))
    }
}

/**
 * If self is within the range of [minValue] and [maxValue], it returns itself, otherwise it throws an IllegalArgumentException
 */
fun Double.requireInRange(minValue: Double, maxValue: Double, paramName: String = "unknown"): Double {
    @Suppress("ConvertTwoComparisonsToRangeCheck")
    return if (this >= minValue && this <= maxValue) {
        this
    } else {
        throw IllegalArgumentException(String.format("The double parameter '%s' value is %s, must be >= %s && <= %s", paramName, this, minValue, maxValue))
    }
}


/**
 * If self is not in the range [minValue] and [maxValue], it returns itself, otherwise it throws an IllegalArgumentException
 */
fun Byte.requireNotInRange(minValue: Byte, maxValue: Byte, paramName: String = "unknown"): Byte {
    return if (this < minValue || this > maxValue) {
        this
    } else {
        throw IllegalArgumentException(String.format("The byte parameter '%s' value is %d, must be < %d || > %d", paramName, this, minValue, maxValue))
    }
}

/**
 * If self is not in the range [minValue] and [maxValue], it returns itself, otherwise it throws an IllegalArgumentException
 */
fun Short.requireNotInRange(minValue: Short, maxValue: Short, paramName: String = "unknown"): Short {
    return if (this < minValue || this > maxValue) {
        this
    } else {
        throw IllegalArgumentException(String.format("The short parameter '%s' value is %d, must be < %d || > %d", paramName, this, minValue, maxValue))
    }
}

/**
 * If self is not in the range [minValue] and [maxValue], it returns itself, otherwise it throws an IllegalArgumentException
 */
fun Int.requireNotInRange(minValue: Int, maxValue: Int, paramName: String = "unknown"): Int {
    return if (this < minValue || this > maxValue) {
        this
    } else {
        throw IllegalArgumentException(String.format("The int parameter '%s' value is %d, must be < %d || > %d", paramName, this, minValue, maxValue))
    }
}

/**
 * If self is not in the range [minValue] and [maxValue], it returns itself, otherwise it throws an IllegalArgumentException
 */
fun Long.requireNotInRange(minValue: Long, maxValue: Long, paramName: String = "unknown"): Long {
    return if (this < minValue || this > maxValue) {
        this
    } else {
        throw IllegalArgumentException(String.format("The long parameter '%s' value is %d, must be < %d || > %d", paramName, this, minValue, maxValue))
    }
}

/**
 * If self is not in the range [minValue] and [maxValue], it returns itself, otherwise it throws an IllegalArgumentException
 */
fun Float.requireNotInRange(minValue: Float, maxValue: Float, paramName: String = "unknown"): Float {
    return if (this < minValue || this > maxValue) {
        this
    } else {
        throw IllegalArgumentException(String.format("The float parameter '%s' value is %s, must be < %s || > %s", paramName, this, minValue, maxValue))
    }
}

/**
 * If self is not in the range [minValue] and [maxValue], it returns itself, otherwise it throws an IllegalArgumentException
 */
fun Double.requireNotInRange(minValue: Double, maxValue: Double, paramName: String = "unknown"): Double {
    return if (this < minValue || this > maxValue) {
        this
    } else {
        throw IllegalArgumentException(String.format("The double parameter '%s' value is %s, must be < %s || > %s", paramName, this, minValue, maxValue))
    }
}


/* ******************************************* string safe *******************************************/


/**
 * If the self is null or empty or blank, it returns itself, otherwise it throws an IllegalArgumentException.
 */
fun <T : CharSequence> T?.requireSafe(paramName: String = "unknown"): T? {
    return if (this.isSafe()) {
        this
    } else {
        throw IllegalArgumentException(String.format("The string parameter '%s' is null or empty or blank", paramName))
    }
}

/**
 * If the self is not null or empty or blank, it returns itself, otherwise it throws an IllegalArgumentException.
 */
fun <T : CharSequence> T?.requireNotSafe(paramName: String = "unknown"): T? {
    return if (this.isNotSafe()) {
        this
    } else {
        throw IllegalArgumentException(String.format("The string parameter '%s' is not null or empty or blank", paramName))
    }
}


/* ******************************************* number zero *******************************************/


/**
 * If self is not 0, it returns itself, otherwise it throws an exception.
 */
fun Byte.requireNotZero(paramName: String = "unknown"): Byte {
    return if (this != 0.toByte()) {
        this
    } else {
        throw IllegalArgumentException(String.format("The parameter '%s' cannot be 0", paramName))
    }
}

/**
 * If self is not 0, it returns itself, otherwise it throws an exception.
 */
fun Short.requireNotZero(paramName: String = "unknown"): Short {
    return if (this != 0.toShort()) {
        this
    } else {
        throw IllegalArgumentException(String.format("The parameter '%s' cannot be 0", paramName))
    }
}

/**
 * If self is not 0, it returns itself, otherwise it throws an exception.
 */
fun Int.requireNotZero(paramName: String = "unknown"): Int {
    return if (this != 0) {
        this
    } else {
        throw IllegalArgumentException(String.format("The parameter '%s' cannot be 0", paramName))
    }
}

/**
 * If self is not 0, it returns itself, otherwise it throws an exception.
 */
fun Long.requireNotZero(paramName: String = "unknown"): Long {
    return if (this != 0L) {
        this
    } else {
        throw IllegalArgumentException(String.format("The parameter '%s' cannot be 0", paramName))
    }
}

/**
 * If self is not 0, it returns itself, otherwise it throws an exception.
 */
fun Float.requireNotZero(paramName: String = "unknown"): Float {
    return if (this != 0f) {
        this
    } else {
        throw IllegalArgumentException(String.format("The parameter '%s' cannot be 0", paramName))
    }
}

/**
 * If self is not 0, it returns itself, otherwise it throws an exception.
 */
fun Double.requireNotZero(paramName: String = "unknown"): Double {
    return if (this != 0.0) {
        this
    } else {
        throw IllegalArgumentException(String.format("The parameter '%s' cannot be 0", paramName))
    }
}