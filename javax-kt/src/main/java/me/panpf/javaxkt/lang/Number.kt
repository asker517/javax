package me.panpf.javaxkt.lang

import java.math.BigDecimal
import java.math.RoundingMode

/*
 * Number tool
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
 * Returns a progression from this value down to the specified [to] value with the step -1.
 *
 * The [to] value should be less than or equal to `this` value.
 * If the [to] value is greater than `this` value the returned progression is empty.
 */
infix fun Int.downUntilTo(to: Byte): IntProgression {
    return IntProgression.fromClosedRange(this, to.toInt() + 1, -1)
}

/**
 * Returns a progression from this value down to the specified [to] value with the step -1.
 *
 * The [to] value should be less than or equal to `this` value.
 * If the [to] value is greater than `this` value the returned progression is empty.
 */
infix fun Long.downUntilTo(to: Byte): LongProgression {
    return LongProgression.fromClosedRange(this, to.toLong() + 1, -1L)
}

/**
 * Returns a progression from this value down to the specified [to] value with the step -1.
 *
 * The [to] value should be less than or equal to `this` value.
 * If the [to] value is greater than `this` value the returned progression is empty.
 */
infix fun Byte.downUntilTo(to: Byte): IntProgression {
    return IntProgression.fromClosedRange(this.toInt(), to.toInt() + 1, -1)
}

/**
 * Returns a progression from this value down to the specified [to] value with the step -1.
 *
 * The [to] value should be less than or equal to `this` value.
 * If the [to] value is greater than `this` value the returned progression is empty.
 */
infix fun Short.downUntilTo(to: Byte): IntProgression {
    return IntProgression.fromClosedRange(this.toInt(), to.toInt() + 1, -1)
}

/**
 * Returns a progression from this value down to the specified [to] value with the step -1.
 *
 * The [to] value should be less than or equal to `this` value.
 * If the [to] value is greater than `this` value the returned progression is empty.
 */
infix fun Char.downUntilTo(to: Char): CharProgression {
    return CharProgression.fromClosedRange(this, to + 1, -1)
}

/**
 * Returns a progression from this value down to the specified [to] value with the step -1.
 *
 * The [to] value should be less than or equal to `this` value.
 * If the [to] value is greater than `this` value the returned progression is empty.
 */
infix fun Int.downUntilTo(to: Int): IntProgression {
    return IntProgression.fromClosedRange(this, to + 1, -1)
}

/**
 * Returns a progression from this value down to the specified [to] value with the step -1.
 *
 * The [to] value should be less than or equal to `this` value.
 * If the [to] value is greater than `this` value the returned progression is empty.
 */
infix fun Long.downUntilTo(to: Int): LongProgression {
    return LongProgression.fromClosedRange(this, to.toLong() + 1, -1L)
}

/**
 * Returns a progression from this value down to the specified [to] value with the step -1.
 *
 * The [to] value should be less than or equal to `this` value.
 * If the [to] value is greater than `this` value the returned progression is empty.
 */
infix fun Byte.downUntilTo(to: Int): IntProgression {
    return IntProgression.fromClosedRange(this.toInt(), to + 1, -1)
}

/**
 * Returns a progression from this value down to the specified [to] value with the step -1.
 *
 * The [to] value should be less than or equal to `this` value.
 * If the [to] value is greater than `this` value the returned progression is empty.
 */
infix fun Short.downUntilTo(to: Int): IntProgression {
    return IntProgression.fromClosedRange(this.toInt(), to + 1, -1)
}

/**
 * Returns a progression from this value down to the specified [to] value with the step -1.
 *
 * The [to] value should be less than or equal to `this` value.
 * If the [to] value is greater than `this` value the returned progression is empty.
 */
infix fun Int.downUntilTo(to: Long): LongProgression {
    return LongProgression.fromClosedRange(this.toLong(), to + 1, -1L)
}

/**
 * Returns a progression from this value down to the specified [to] value with the step -1.
 *
 * The [to] value should be less than or equal to `this` value.
 * If the [to] value is greater than `this` value the returned progression is empty.
 */
infix fun Long.downUntilTo(to: Long): LongProgression {
    return LongProgression.fromClosedRange(this, to + 1, -1L)
}

/**
 * Returns a progression from this value down to the specified [to] value with the step -1.
 *
 * The [to] value should be less than or equal to `this` value.
 * If the [to] value is greater than `this` value the returned progression is empty.
 */
infix fun Byte.downUntilTo(to: Long): LongProgression {
    return LongProgression.fromClosedRange(this.toLong(), to + 1, -1L)
}

/**
 * Returns a progression from this value down to the specified [to] value with the step -1.
 *
 * The [to] value should be less than or equal to `this` value.
 * If the [to] value is greater than `this` value the returned progression is empty.
 */
infix fun Short.downUntilTo(to: Long): LongProgression {
    return LongProgression.fromClosedRange(this.toLong(), to + 1, -1L)
}

/**
 * Returns a progression from this value down to the specified [to] value with the step -1.
 *
 * The [to] value should be less than or equal to `this` value.
 * If the [to] value is greater than `this` value the returned progression is empty.
 */
infix fun Int.downUntilTo(to: Short): IntProgression {
    return IntProgression.fromClosedRange(this, to.toInt() + 1, -1)
}

/**
 * Returns a progression from this value down to the specified [to] value with the step -1.
 *
 * The [to] value should be less than or equal to `this` value.
 * If the [to] value is greater than `this` value the returned progression is empty.
 */
infix fun Long.downUntilTo(to: Short): LongProgression {
    return LongProgression.fromClosedRange(this, to.toLong() + 1, -1L)
}

/**
 * Returns a progression from this value down to the specified [to] value with the step -1.
 *
 * The [to] value should be less than or equal to `this` value.
 * If the [to] value is greater than `this` value the returned progression is empty.
 */
infix fun Byte.downUntilTo(to: Short): IntProgression {
    return IntProgression.fromClosedRange(this.toInt(), to.toInt() + 1, -1)
}

/**
 * Returns a progression from this value down to the specified [to] value with the step -1.
 *
 * The [to] value should be less than or equal to `this` value.
 * If the [to] value is greater than `this` value the returned progression is empty.
 */
infix fun Short.downUntilTo(to: Short): IntProgression {
    return IntProgression.fromClosedRange(this.toInt(), to.toInt() + 1, -1)
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