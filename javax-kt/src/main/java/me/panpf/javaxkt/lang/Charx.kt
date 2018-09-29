@file:Suppress("NOTHING_TO_INLINE")

package me.panpf.javaxkt.lang

import me.panpf.javax.lang.Charx


/*
 * Char related extension methods or properties
 */


/* ******************************************* isBlank *******************************************/


/**
 * Return `true` if the given character is blank
 */
inline fun Char.isBlank(): Boolean = Charx.isBlank(this)

/**
 * Return `true` if the given character is blank
 */
inline fun Char.isNotBlank(): Boolean = Charx.isNotBlank(this)

/**
 * If the given character is not blank, it return is itself, otherwise it returns the default value.
 */
inline fun Char.isBlankOr(defaultValue: Char): Char = Charx.isBlankOr(this, defaultValue)


/* ******************************************* isChinese *******************************************/


/**
 * Return `true` if the given character is Chinese
 */
inline fun Char.isChinese(): Boolean = Charx.isChinese(this)

/**
 * Return `true` if the given character is chinese
 */
inline fun Char.isNotChinese(): Boolean = Charx.isNotChinese(this)

/**
 * If the given character is chinese, it return is itself, otherwise it returns the default value.
 */
inline fun Char.isNotChineseOr(defaultValue: Char): Char = Charx.isNotChineseOr(this, defaultValue)


/* ******************************************* isDigit *******************************************/


///**
// * Return `true` if the given character is digit
// */
//inline fun Char.isDigit(): Boolean = Charx.isDigit(this)

/**
 * Return `true` if the given character is not digit
 */
inline fun Char.isNotDigit(): Boolean = Charx.isNotDigit(this)


/**
 * If the given character is digit, it return is itself, otherwise it returns the default value.
 */
inline fun Char.isNotDigitOr(defaultValue: Char): Char = Charx.isNotDigitOr(this, defaultValue)


/* ******************************************* isLetter *******************************************/


///**
// * Return `true` if the given character is letter
// */
//inline fun Char.isLetter(): Boolean = Charx.isLetter(this)

/**
 * Return `true` if the given character is not letter
 */
inline fun Char.isNotLetter(): Boolean = Charx.isNotLetter(this)

/**
 * If the given character is letter, it return is itself, otherwise it returns the default value.
 */
inline fun Char.isNotLetterOr(defaultValue: Char): Char = Charx.isNotLetterOr(this, defaultValue)


/* ******************************************* isLetterOrDigit *******************************************/


///**
// * Return `true` if the given character is letter or digit
// */
//inline fun Char.isLetterOrDigit(): Boolean = Charx.isLetterOrDigit(this)

/**
 * Return `true` if the given character is not letter or digit
 */
inline fun Char.isNotLetterOrDigit(): Boolean = Charx.isNotLetterOrDigit(this)

/**
 * If the given character is letter or digit, it return is itself, otherwise it returns the default value.
 */
inline fun Char.isNotLetterOrDigitOr(defaultValue: Char): Char = Charx.isNotLetterOrDigitOr(this, defaultValue)