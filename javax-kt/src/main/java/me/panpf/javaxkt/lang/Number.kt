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