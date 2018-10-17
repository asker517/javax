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

import me.panpf.javax.lang.Stringx


/*
 * String related extension methods or properties
 */


/* ******************************************* isSafe *******************************************/


/**
 * Returns `true` if this string is is not `null` and not empty and contains some characters except of whitespace characters.
 */
inline fun CharSequence?.isSafe(): Boolean = Stringx.isSafe(this)

/**
 * Returns `true` if this string is is `null` or empty or consists solely of whitespace characters.
 */
inline fun CharSequence?.isNotSafe(): Boolean = Stringx.isNotSafe(this)

/**
 * If the given character sequence is safe, it return is itself, otherwise it returns the default value.
 */
inline fun CharSequence?.isNotSafeOr(defaultValue: CharSequence): CharSequence? = Stringx.isNotSafeOr(this, defaultValue)

/**
 * If the given character sequence is safe, it return is itself, otherwise it returns the default value.
 */
inline fun String?.isNotSafeOr(defaultValue: String): String? = Stringx.isNotSafeOr(this, defaultValue)


/* ******************************************* isBlank *******************************************/


///**
// * Returns `true` if this string is empty or consists solely of whitespace characters.
// */
//inline fun CharSequence?.isBlank(): Boolean = Stringx.isBlank(this)

///**
// * Returns `true` if this char sequence is not empty and contains some characters except of whitespace characters.
// */
//inline fun CharSequence?.isNotBlank(): Boolean = Stringx.isNotBlank(this)

/**
 * If the given character sequence is not blank, it return is itself, otherwise it returns the default value.
 */
inline fun CharSequence?.isBlankOr(defaultValue: CharSequence): CharSequence? = Stringx.isBlankOr(this, defaultValue)

/**
 * If the given character sequence is not blank, it return is itself, otherwise it returns the default value.
 */
inline fun String?.isBlankOr(defaultValue: String): String? = Stringx.isBlankOr(this, defaultValue)


///**
// * Returns `true` if this nullable char sequence is either `null` or empty or consists solely of whitespace characters.
// */
//inline fun CharSequence?.isNullOrBlank(): Boolean = Stringx.isNullOrBlank(this)

/**
 * Return `true` if the character sequence is not `null` or whitespace characters.
 */
inline fun CharSequence?.isNotNullOrBlank(): Boolean = Stringx.isNotNullOrBlank(this)

/**
 * If the given character sequence is not null or blank, it return is itself, otherwise it returns the default value.
 */
inline fun CharSequence?.isNullOrBlankOr(defaultValue: CharSequence): CharSequence = Stringx.isNullOrBlankOr(this, defaultValue)

/**
 * If the given character sequence is not null or blank, it return is itself, otherwise it returns the default value.
 */
inline fun String?.isNullOrBlankOr(defaultValue: String): String = Stringx.isNullOrBlankOr(this, defaultValue)


/* ******************************************* isEmpty *******************************************/


///**
// * Returns `true` if this char sequence is empty (contains no characters).
// */
//inline fun CharSequence?.isEmpty(): Boolean = Stringx.isEmpty(this)

///**
// * Returns `true` if this char sequence is not empty.
// */
//inline fun CharSequence?.isNotEmpty(): Boolean = Stringx.isNotEmpty(this)

/**
 * If the given character sequence is not empty, it return is itself, otherwise it returns the default value.
 */
inline fun CharSequence?.isEmptyOr(defaultValue: CharSequence): CharSequence? = Stringx.isEmptyOr(this, defaultValue)

/**
 * If the given character sequence is not empty, it return is itself, otherwise it returns the default value.
 */
inline fun String?.isEmptyOr(defaultValue: String): String? = Stringx.isEmptyOr(this, defaultValue)


///**
// * Returns `true` if this nullable char sequence is either `null` or empty.
// */
//inline fun CharSequence?.isNullOrEmpty(): Boolean = Stringx.isNullOrEmpty(this)

/**
 * Return `true` if the character sequence is not `null` or empty
 */
inline fun CharSequence?.isNotNullOrEmpty(): Boolean = Stringx.isNotNullOrEmpty(this)

/**
 * If the given character sequence is not null or empty, it return is itself, otherwise it returns the default value.
 */
inline fun CharSequence?.isNullOrEmptyOr(defaultValue: CharSequence): CharSequence = Stringx.isNullOrEmptyOr(this, defaultValue)

/**
 * If the given character sequence is not null or empty, it return is itself, otherwise it returns the default value.
 */
inline fun String?.isNullOrEmptyOr(defaultValue: String): String = Stringx.isNullOrEmptyOr(this, defaultValue)


/* ******************************************* isChinese *******************************************/


/**
 * Return `true` if the given sequence of characters is all chinese
 */
inline fun CharSequence?.isChinese(): Boolean = Stringx.isChinese(this)

/**
 * Return `true` if the given sequence of characters is all not chinese
 */
inline fun CharSequence?.isNotChinese(): Boolean = Stringx.isNotChinese(this)

/**
 * If the given character sequence is chinese, it return is itself, otherwise it returns the default value.
 */
inline fun CharSequence?.isNotChineseOr(defaultValue: CharSequence): CharSequence = Stringx.isNotChineseOr(this, defaultValue)

/**
 * If the given character sequence is chinese, it return is itself, otherwise it returns the default value.
 */
inline fun String?.isNotChineseOr(defaultValue: String): String = Stringx.isNotChineseOr(this, defaultValue)


/* ******************************************* isDigit *******************************************/


/**
 * Return `true` if the given sequence of characters is all digit
 */
inline fun CharSequence?.isDigit(): Boolean = Stringx.isDigit(this)

/**
 * Return `true` if the given sequence of characters is all not digit
 */
inline fun CharSequence?.isNotDigit(): Boolean = Stringx.isNotDigit(this)

/**
 * If the given character sequence is digit, it return is itself, otherwise it returns the default value.
 */
inline fun CharSequence?.isNotDigitOr(defaultValue: CharSequence): CharSequence = Stringx.isNotDigitOr(this, defaultValue)

/**
 * If the given character sequence is digit, it return is itself, otherwise it returns the default value.
 */
inline fun String?.isNotDigitOr(defaultValue: String): String = Stringx.isNotDigitOr(this, defaultValue)


/* ******************************************* isLetter *******************************************/


/**
 * Return `true` if the given sequence of characters is all letter
 */
inline fun CharSequence?.isLetter(): Boolean = Stringx.isLetter(this)

/**
 * Return `true` if the given sequence of characters is all not letter
 */
inline fun CharSequence?.isNotLetter(): Boolean = Stringx.isNotLetter(this)

/**
 * If the given character sequence is letter, it return is itself, otherwise it returns the default value.
 */
inline fun CharSequence?.isNotLetterOr(defaultValue: CharSequence): CharSequence = Stringx.isNotLetterOr(this, defaultValue)

/**
 * If the given character sequence is letter, it return is itself, otherwise it returns the default value.
 */
inline fun String?.isNotLetterOr(defaultValue: String): String = Stringx.isNotLetterOr(this, defaultValue)


/* ******************************************* isLetterOrDigit *******************************************/


/**
 * Return `true` if the given sequence of characters is all digit or letter
 */
inline fun CharSequence?.isLetterOrDigit(): Boolean = Stringx.isLetterOrDigit(this)

/**
 * Return `true` if the given sequence of characters is all not digit or letter
 */
inline fun CharSequence?.isNotLetterOrDigit(): Boolean = Stringx.isNotLetterOrDigit(this)

/**
 * If the given character sequence is digit or letter, it return is itself, otherwise it returns the default value.
 */
inline fun CharSequence?.isNotLetterOrDigitOr(defaultValue: CharSequence): CharSequence = Stringx.isNotLetterOrDigitOr(this, defaultValue)

/**
 * If the given character sequence is digit or letter, it return is itself, otherwise it returns the default value.
 */
inline fun String?.isNotLetterOrDigitOr(defaultValue: String): String = Stringx.isNotLetterOrDigitOr(this, defaultValue)


/* ******************************************* orContains and andContains *******************************************/


/**
 * Return true if the specified string contains one of the strings in [params]
 */
inline fun String?.orContains(params: Array<String>?): Boolean = Stringx.orContains(this, params)

/**
 * Return true if the specified string contains one of the strings in [params]
 */
inline fun String?.orContains(params: Collection<String>?): Boolean = Stringx.orContains(this, params)

/**
 * Return true if the specified string contains all the strings in[params]
 */
inline fun String?.andContains(params: Array<String>?): Boolean = Stringx.andContains(this, params)

/**
 * Return true if the specified string contains all the strings in[params]
 */
inline fun String?.andContains(params: Collection<String>?): Boolean = Stringx.andContains(this, params)


/* ******************************************* or and to *******************************************/


/**
 * Returns the given character sequence if it is not null, otherwise return an empty sequence of characters
 */
inline fun CharSequence?.orEmpty(): CharSequence = Stringx.orEmpty(this)

/**
 * Returns the given character sequence if it is not null, otherwise return an empty sequence of characters
 */
inline fun String?.orEmpty(): String = Stringx.orEmpty(this)

/**
 * Returns the given character sequence if it is not null, otherwise return given defaultValue
 */
inline fun CharSequence?.orDefault(defaultValue: CharSequence): CharSequence = Stringx.orDefault(this, defaultValue)

/**
 * Returns the given character sequence if it is not null, otherwise return given defaultValue
 */
inline fun String?.orDefault(defaultValue: String): String = Stringx.orDefault(this, defaultValue)


/**
 * If the given char sequence is empty, it return `null` otherwise it return itself
 */
inline fun CharSequence?.emptyToNull(): CharSequence? = Stringx.emptyToNull(this)

/**
 * If the given char sequence is empty, it return `null` otherwise it return itself
 */
inline fun String?.emptyToNull(): String? = Stringx.emptyToNull(this)

/**
 * If the given char sequence is blank, it return `null` otherwise it return itself
 */
inline fun CharSequence?.blankToNull(): CharSequence? = Stringx.blankToNull(this)

/**
 * If the given char sequence is blank, it return `null` otherwise it return itself
 */
inline fun String?.blankToNull(): String? = Stringx.blankToNull(this)


/* ******************************************* filterBlank *******************************************/


/**
 * Filter out whitespace characters in a sequence of characters
 */
inline fun CharSequence?.filterBlank(): CharSequence = Stringx.filterBlank(this)

/**
 * Filter out whitespace characters in a sequence of characters
 */
inline fun String?.filterBlank(): String = Stringx.filterBlank(this)


/* ******************************************* remove *******************************************/


/**
 * Delete all specified characters in the string and return the new string
 */
inline fun String.removeChar(ch: Char): String = Stringx.removeChar(this, ch)

/**
 * Delete the first occurrence of the specified character in the string and return the new string
 */
inline fun String.removeFirstChar(ch: Char): String = Stringx.removeFirstChar(this, ch)

/**
 * Delete the last specified character in the string and return the new string
 */
inline fun String.removeLastChar(ch: Char): String = Stringx.removeLastChar(this, ch)

/**
 * Delete the character at the specified position in the string and return the new string
 */
inline fun String.removeIndex(removeIndex: Int): String = Stringx.removeIndex(this, removeIndex)