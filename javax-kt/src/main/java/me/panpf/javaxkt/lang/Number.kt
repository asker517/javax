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