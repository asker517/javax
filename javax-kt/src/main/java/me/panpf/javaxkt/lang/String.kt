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
 * Return `true` if all character sequences are not `null` and not empty and contains some characters except of whitespace characters.
 */
fun Array<CharSequence>.isAllSafe(): Boolean {
    for (string in this) if (!string.isSafe()) return false
    return true
}

/**
 * Return `true` if all character sequences are not `null` and not empty and contains some characters except of whitespace characters.
 */
fun Iterable<CharSequence>.isAllSafe(): Boolean {
    for (string in this) if (!string.isSafe()) return false
    return true
}

// todo 貌似 isAllNotSafe ！= !this.isAllSafe()

/**
 * Return `true` if all character sequences are is `null` or empty or consists solely of whitespace characters.
 */
fun Array<CharSequence>.isAllNotSafe(): Boolean {
    return !this.isAllSafe()
}

/**
 * Return `true` if all character sequences are is `null` or empty or consists solely of whitespace characters.
 */
fun Iterable<CharSequence>.isAllNotSafe(): Boolean {
    return !this.isAllSafe()
}


/**
 * Return `true` if the character sequence is not `null` or whitespace characters.
 */
fun CharSequence?.isNotNullOrBlank(): Boolean {
    return !this.isNullOrBlank()
}

/**
 * Return `true` if all character sequences are whitespace characters
 */
fun Array<CharSequence>.isAllBlank(): Boolean {
    for (string in this) if (!string.isBlank()) return false
    return true
}

/**
 * Return `true` if all character sequences are whitespace characters
 */
fun Iterable<CharSequence>.isAllBlank(): Boolean {
    for (string in this) if (!string.isBlank()) return false
    return true
}

/**
 * Return `true` if all character sequences are not whitespace characters
 */
fun Array<CharSequence>.isAllNotBlank(): Boolean {
    return !this.isAllBlank()
}

/**
 * Return `true` if all character sequences are not whitespace characters
 */
fun Iterable<CharSequence>.isAllNotBlank(): Boolean {
    return !this.isAllBlank()
}

/**
 * Return `true` if all character sequences is either `null` or whitespace characters.
 */
fun Array<CharSequence?>?.isAllNullOrBlank(): Boolean {
    if (this == null) return true
    for (string in this) if (!string.isNullOrBlank()) return false
    return true
}

/**
 * Return `true` if all character sequences is either `null` or whitespace characters.
 */
fun Iterable<CharSequence?>?.isAllNullOrBlank(): Boolean {
    if (this == null) return true
    for (string in this) if (!string.isNullOrBlank()) return false
    return true
}

/**
 * Return `true` if all character sequences is not `null` or whitespace characters.
 */
fun Array<CharSequence?>?.isAllNotNullOrBlank(): Boolean {
    return !this.isAllNullOrBlank()
}

/**
 * Return `true` if all character sequences is not `null` or whitespace characters.
 */
fun Iterable<CharSequence>?.isAllNotNullOrBlank(): Boolean {
    return !this.isAllNullOrBlank()
}


/**
 * Return `true` if the character sequence is not `null` or empty
 */
fun CharSequence?.isNotNullOrEmpty(): Boolean {
    return !this.isNullOrEmpty()
}

/**
 * Return `true` if all character sequences are empty
 */
fun Array<CharSequence>.isAllEmpty(): Boolean {
    for (string in this) if (!string.isEmpty()) return false
    return true
}

/**
 * Return `true` if all character sequences are empty
 */
fun Iterable<CharSequence>.isAllEmpty(): Boolean {
    for (string in this) if (!string.isEmpty()) return false
    return true
}

/**
 * Return `true` if all character sequences are not empty
 */
fun Array<CharSequence>.isAllNotEmpty(): Boolean {
    return !this.isAllEmpty()
}

/**
 * Return `true` if all character sequences are not empty
 */
fun Iterable<CharSequence>.isAllNotEmpty(): Boolean {
    return !this.isAllEmpty()
}

/**
 * Return `true` if all character sequences is either `null` or empty.
 */
fun Array<CharSequence?>?.isAllNullOrEmpty(): Boolean {
    if (this == null) return true
    for (string in this) if (!string.isNullOrEmpty()) return false
    return true
}

/**
 * Return `true` if all character sequences is either `null` or empty.
 */
fun Iterable<CharSequence?>?.isAllNullOrEmpty(): Boolean {
    if (this == null) return true
    for (string in this) if (!string.isNullOrEmpty()) return false
    return true
}

/**
 * Return `true` if all character sequences is not `null` or empty.
 */
fun Array<CharSequence?>?.isAllNotNullOrEmpty(): Boolean {
    return !this.isAllNullOrEmpty()
}

/**
 * Return `true` if all character sequences is not `null` or empty.
 */
fun Iterable<CharSequence?>?.isAllNotNullOrEmpty(): Boolean {
    return !this.isAllNullOrEmpty()
}


/**
 * Return `true` if the given sequence of characters is all digit
 */
fun CharSequence.isDigit(): Boolean {
    var index = 0
    val size = this.length
    while (index < size) {
        if (!Character.isDigit(this[index])) {
            return false
        }
        index++
    }
    return true
}

/**
 * Return `true` if the given sequence of characters is all not digit
 */
fun CharSequence.isNotDigit(): Boolean {
    return !this.isDigit()
}

/**
 * Return `true` if the given sequence of characters is all digit
 */
fun Array<CharSequence>.isAllDigit(): Boolean {
    for (string in this) if (!string.isDigit()) return false
    return true
}

/**
 * Return `true` if the given sequence of characters is all digit
 */
fun Iterable<CharSequence>.isAllDigit(): Boolean {
    for (string in this) if (!string.isDigit()) return false
    return true
}

/**
 * Return `true` if the given sequence of characters is all not digit
 */
fun Array<CharSequence>.isAllNotDigit(): Boolean {
    return !this.isAllDigit()
}

/**
 * Return `true` if the given sequence of characters is all not digit
 */
fun Iterable<CharSequence>.isAllNotDigit(): Boolean {
    return !this.isAllDigit()
}


/**
 * Return `true` if the given sequence of characters is all chinese
 */
fun CharSequence.isChinese(): Boolean {
    var index = 0
    val size = this.length
    while (index < size) {
        if (!this[index].isChinese()) {
            return false
        }
        index++
    }
    return true
}

/**
 * Return `true` if the given sequence of characters is all not chinese
 */
fun CharSequence.isNotChinese(): Boolean {
    return !this.isChinese()
}

/**
 * Return `true` if the given sequence of characters is all chinese
 */
fun Array<CharSequence>.isAllChines(): Boolean {
    for (string in this) if (!string.isChinese()) return false
    return true
}

/**
 * Return `true` if the given sequence of characters is all chinese
 */
fun Iterable<CharSequence>.isAllChines(): Boolean {
    for (string in this) if (!string.isChinese()) return false
    return true
}

/**
 * Return `true` if the given sequence of characters is all not chinese
 */
fun Array<CharSequence>.isAllNotChines(): Boolean {
    return !this.isAllChines()
}

/**
 * Return `true` if the given sequence of characters is all not chinese
 */
fun Iterable<CharSequence>.isAllNotChines(): Boolean {
    return !this.isAllChines()
}


/**
 * Return `true` if the given sequence of characters is all digit or letter
 */
fun CharSequence.isLetterOrDigit(): Boolean {
    var index = 0
    val size = this.length
    while (index < size) {
        if (!Character.isLetterOrDigit(this[index])) {
            return false
        }
        index++
    }
    return true
}

/**
 * Return `true` if the given sequence of characters is all not digit or letter
 */
fun CharSequence.isNotLetterOrDigit(): Boolean {
    return !this.isLetterOrDigit()
}

/**
 * Return `true` if the given sequence of characters is all digit or letter
 */
fun Array<CharSequence>.isAllLetterOrDigit(): Boolean {
    for (string in this) if (!string.isLetterOrDigit()) return false
    return true
}

/**
 * Return `true` if the given sequence of characters is all digit or letter
 */
fun Iterable<CharSequence>.isAllLetterOrDigit(): Boolean {
    for (string in this) if (!string.isLetterOrDigit()) return false
    return true
}

/**
 * Return `true` if the given sequence of characters is all not digit or letter
 */
fun Array<CharSequence>.isAllNotLetterOrDigit(): Boolean {
    return !this.isAllLetterOrDigit()
}

/**
 * Return `true` if the given sequence of characters is all not digit or letter
 */
fun Iterable<CharSequence>.isAllNotLetterOrDigit(): Boolean {
    return !this.isAllLetterOrDigit()
}


/**
 * Return true if the specified string contains one of the strings in [params]
 */
fun String.orContains(params: Array<String>): Boolean {
    for (param in params) {
        if (this.contains(param)) {
            return true
        }
    }

    return false
}

/**
 * Return true if the specified string contains one of the strings in [params]
 */
fun String.orContains(params: Iterable<String>): Boolean {
    for (param in params) {
        if (this.contains(param)) {
            return true
        }
    }

    return false
}

/**
 * Return true if the specified string contains all the strings in[params]
 */
fun String.andContains(params: Array<String>): Boolean {
    for (param in params) {
        if (!this.contains(param)) {
            return false
        }
    }

    return true
}

/**
 * Return true if the specified string contains all the strings in[params]
 */
fun String.andContains(params: Iterable<String>): Boolean {
    for (param in params) {
        if (!this.contains(param)) {
            return false
        }
    }

    return true
}