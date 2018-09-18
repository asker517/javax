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

package me.panpf.javaxkt.lang

/*
 * String tool
 */


/* ******************************************* isSafe *******************************************/


/**
 * Returns `true` if this string is is not `null` and not empty and contains some characters except of whitespace characters.
 */
fun CharSequence?.isSafe(): Boolean {
    return this != null && this.isNotNullOrEmpty() && this.isNotBlank()
}

/**
 * Returns `true` if this string is is `null` or empty or consists solely of whitespace characters.
 */
fun CharSequence?.isNotSafe(): Boolean {
    return !this.isSafe()
}

/**
 * If the given character sequence is safe, it return is itself, otherwise it returns the default value.
 */
fun CharSequence?.isNotSafeOr(defaultValue: CharSequence): CharSequence? {
    return if (this.isSafe()) this else defaultValue
}


/* ******************************************* isBlank *******************************************/


///**
// * Returns `true` if this string is empty or consists solely of whitespace characters.
// */
//fun CharSequence?.isBlank(): Boolean {
//    if (this == null) return false
//    var index = 0
//    val size = this.length
//    while (index < size) {
//        if (this[index].isNotBlank()) {
//            return false
//        }
//        index++
//    }
//    return true
//}

///**
// * Returns `true` if this char sequence is not empty and contains some characters except of whitespace characters.
// */
//fun CharSequence?.isNotBlank(): Boolean {
//    return !this.isBlank()
//}

/**
 * If the given character sequence is not blank, it return is itself, otherwise it returns the default value.
 */
fun CharSequence?.isBlankOr(defaultValue: CharSequence): CharSequence? {
    return if (this != null && this.isNotBlank()) this else defaultValue
}


///**
// * Returns `true` if this nullable char sequence is either `null` or empty or consists solely of whitespace characters.
// */
//fun CharSequence?.isNullOrBlank(): Boolean {
//    return this == null || this.isBlank()
//}

/**
 * Return `true` if the character sequence is not `null` or whitespace characters.
 */
fun CharSequence?.isNotNullOrBlank(): Boolean {
    return !this.isNullOrBlank()
}

/**
 * If the given character sequence is not null or blank, it return is itself, otherwise it returns the default value.
 */
fun CharSequence?.isNullOrBlankOr(defaultValue: CharSequence): CharSequence {
    return if (this != null && this.isNotNullOrBlank()) this else defaultValue
}


/* ******************************************* isEmpty *******************************************/


///**
// * Returns `true` if this char sequence is empty (contains no characters).
// */
//fun CharSequence?.isEmpty(): Boolean {
//    return this != null && this.length == 0
//}

///**
// * Returns `true` if this char sequence is not empty.
// */
//fun CharSequence?.isNotEmpty(): Boolean {
//    return !this.isEmpty()
//}

/**
 * If the given character sequence is not empty, it return is itself, otherwise it returns the default value.
 */
fun CharSequence?.isEmptyOr(defaultValue: CharSequence): CharSequence? {
    return if (this != null && this.isNotEmpty()) this else defaultValue
}


///**
// * Returns `true` if this nullable char sequence is either `null` or empty.
// */
//fun CharSequence?.isNullOrEmpty(): Boolean {
//    return this == null || this.isEmpty()
//}

/**
 * Return `true` if the character sequence is not `null` or empty
 */
fun CharSequence?.isNotNullOrEmpty(): Boolean {
    return !this.isNullOrEmpty()
}

/**
 * If the given character sequence is not null or empty, it return is itself, otherwise it returns the default value.
 */
fun CharSequence?.isNullOrEmptyOr(defaultValue: CharSequence): CharSequence {
    return if (this != null && this.isNotNullOrEmpty()) this else defaultValue
}


/* ******************************************* isChinese *******************************************/


/**
 * Return `true` if the given sequence of characters is all chinese
 */
fun CharSequence?.isChinese(): Boolean {
    if (this == null || this.isNotSafe()) return false
    var index = 0
    val size = this.length
    while (index < size) {
        if (this[index].isNotChinese()) {
            return false
        }
        index++
    }
    return true
}

/**
 * Return `true` if the given sequence of characters is all not chinese
 */
fun CharSequence?.isNotChinese(): Boolean {
    return !this.isChinese()
}

/**
 * If the given character sequence is chinese, it return is itself, otherwise it returns the default value.
 */
fun CharSequence?.isNotChineseOr(defaultValue: CharSequence): CharSequence {
    return if (this != null && this.isChinese()) this else defaultValue
}


/* ******************************************* isDigit *******************************************/


/**
 * Return `true` if the given sequence of characters is all digit
 */
fun CharSequence?.isDigit(): Boolean {
    if (this == null || this.isNotSafe()) return false
    var index = 0
    val size = this.length
    while (index < size) {
        if (this[index].isNotDigit()) {
            return false
        }
        index++
    }
    return true
}

/**
 * Return `true` if the given sequence of characters is all not digit
 */
fun CharSequence?.isNotDigit(): Boolean {
    return !this.isDigit()
}

/**
 * If the given character sequence is digit, it return is itself, otherwise it returns the default value.
 */
fun CharSequence?.isNotDigitOr(defaultValue: CharSequence): CharSequence {
    return if (this != null && this.isDigit()) this else defaultValue
}


/* ******************************************* isLetter *******************************************/


/**
 * Return `true` if the given sequence of characters is all letter
 */
fun CharSequence?.isLetter(): Boolean {
    if (this == null || this.isNotSafe()) return false
    var index = 0
    val size = this.length
    while (index < size) {
        if (this[index].isNotLetter()) {
            return false
        }
        index++
    }
    return true
}

/**
 * Return `true` if the given sequence of characters is all not letter
 */
fun CharSequence?.isNotLetter(): Boolean {
    return !this.isLetter()
}

/**
 * If the given character sequence is letter, it return is itself, otherwise it returns the default value.
 */
fun CharSequence?.isNotLetterOr(defaultValue: CharSequence): CharSequence {
    return if (this != null && this.isLetter()) this else defaultValue
}


/* ******************************************* isLetterOrDigit *******************************************/


/**
 * Return `true` if the given sequence of characters is all digit or letter
 */
fun CharSequence?.isLetterOrDigit(): Boolean {
    if (this == null || this.isNotSafe()) return false
    var index = 0
    val size = this.length
    while (index < size) {
        if (this[index].isNotLetterOrDigit()) {
            return false
        }
        index++
    }
    return true
}

/**
 * Return `true` if the given sequence of characters is all not digit or letter
 */
fun CharSequence?.isNotLetterOrDigit(): Boolean {
    return !this.isLetterOrDigit()
}

/**
 * If the given character sequence is digit or letter, it return is itself, otherwise it returns the default value.
 */
fun CharSequence?.isNotLetterOrDigitOr(defaultValue: CharSequence): CharSequence {
    return if (this != null && this.isLetterOrDigit()) this else defaultValue
}


/* ******************************************* orContains and andContains *******************************************/


/**
 * Return true if the specified string contains one of the strings in [params]
 */
fun orContains(string: String?, params: Array<String>?): Boolean {
    if (string == null || params == null || params.isEmpty()) return false
    for (param in params) if (string.contains(param)) return true
    return false
}

/**
 * Return true if the specified string contains one of the strings in [params]
 */
fun orContains(string: String?, params: Collection<String>?): Boolean {
    if (string == null || params == null || params.isEmpty()) return false
    for (param in params) if (string.contains(param)) return true
    return false
}

/**
 * Return true if the specified string contains all the strings in[params]
 */
fun andContains(string: String?, params: Array<String>?): Boolean {
    if (string == null || params == null || params.isEmpty()) return false
    for (param in params) if (!string.contains(param)) return false
    return true
}

/**
 * Return true if the specified string contains all the strings in[params]
 */
fun andContains(string: String?, params: Collection<String>?): Boolean {
    if (string == null || params == null || params.isEmpty()) return false
    for (param in params) if (!string.contains(param)) return false
    return true
}