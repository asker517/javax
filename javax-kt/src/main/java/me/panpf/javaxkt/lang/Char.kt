package me.panpf.javaxkt.lang


/* ******************************************* isBlank *******************************************/


/**
 * Return `true` if the given character is blank
 */
fun Char.isBlank(): Boolean {
    return Character.isWhitespace(this) || Character.isSpaceChar(this)
}

/**
 * Return `true` if the given character is blank
 */
fun Char.isNotBlank(): Boolean {
    return !this.isBlank()
}

/**
 * Return `true` if the given array of characters is all blank
 */
fun CharArray.isAllBlank(): Boolean {
    for (aChar in this) if (aChar.isNotBlank()) return false
    return true
}

/**
 * Return `true` if the given array of characters is all blank
 */
fun Iterable<Char>.isAllBlank(): Boolean {
    for (aChar in this) if (aChar.isNotBlank()) return false
    return true
}

/**
 * Return `true` if the given array of characters is all not blank
 */
fun CharArray.isAllNotBlank(): Boolean {
    for (aChar in this) if (aChar.isBlank()) return false
    return true
}

/**
 * Return `true` if the given array of characters is all not blank
 */
fun Iterable<Char>.isAllNotBlank(): Boolean {
    for (aChar in this) if (aChar.isBlank()) return false
    return true
}

/**
 * Return `true` if only a portion of the given characters is blank
 */
fun CharArray.isPartBlank(): Boolean {
    var containsBlank = false
    var containsNotBlank = false
    for (aChar in this) {
        if (aChar.isBlank()) {
            containsBlank = true
        } else {
            containsNotBlank = true
        }
        if (containsBlank && containsNotBlank) {
            return true
        }
    }
    return false
}

/**
 * Return `true` if only a portion of the given characters is blank
 */
fun Iterable<Char>.isPartBlank(): Boolean {
    var containsBlank = false
    var containsNotBlank = false
    for (aChar in this) {
        if (aChar.isBlank()) {
            containsBlank = true
        } else {
            containsNotBlank = true
        }
        if (containsBlank && containsNotBlank) {
            return true
        }
    }
    return false
}

/**
 * If the given character is not blank, it return is itself, otherwise it returns the default value.
 */
fun Char.isBlankOr(defaultValue: Char): Char {
    return if (this.isNotBlank()) this else defaultValue
}


/* ******************************************* isChinese *******************************************/


/**
 * Return `true` if the given character is Chinese
 */
fun Char.isChinese(): Boolean {
    val ub = Character.UnicodeBlock.of(this)
    return (ub === Character.UnicodeBlock.CJK_UNIFIED_IDEOGRAPHS || ub === Character.UnicodeBlock.CJK_COMPATIBILITY_IDEOGRAPHS
            || ub === Character.UnicodeBlock.CJK_UNIFIED_IDEOGRAPHS_EXTENSION_A || ub === Character.UnicodeBlock.GENERAL_PUNCTUATION
            || ub === Character.UnicodeBlock.CJK_SYMBOLS_AND_PUNCTUATION || ub === Character.UnicodeBlock.HALFWIDTH_AND_FULLWIDTH_FORMS)
}

/**
 * Return `true` if the given character is chinese
 */
fun Char.isNotChinese(): Boolean {
    return !this.isChinese()
}

/**
 * Return `true` if the given array of characters is all chinese
 */
fun CharArray.isAllChinese(): Boolean {
    for (aChar in this) if (aChar.isNotChinese()) return false
    return true
}

/**
 * Return `true` if the given array of characters is all chinese
 */
fun Iterable<Char>.isAllChinese(): Boolean {
    for (aChar in this) if (aChar.isNotChinese()) return false
    return true
}

/**
 * Return `true` if the given array of characters is all chinese
 */
fun CharArray.isAllNotChinese(): Boolean {
    for (aChar in this) if (aChar.isChinese()) return false
    return true
}

/**
 * Return `true` if the given array of characters is all chinese
 */
fun Iterable<Char>.isAllNotChinese(): Boolean {
    for (aChar in this) if (aChar.isChinese()) return false
    return true
}

/**
 * Return `true` if only a portion of the given characters is chinese
 */
fun CharArray.isPartChinese(): Boolean {
    var containsChinese = false
    var containsNotChinese = false
    for (aChar in this) {
        if (aChar.isChinese()) {
            containsChinese = true
        } else {
            containsNotChinese = true
        }
        if (containsChinese && containsNotChinese) {
            return true
        }
    }
    return false
}

/**
 * Return `true` if only a portion of the given characters is chinese
 */
fun Iterable<Char>.isPartChinese(): Boolean {
    var containsChinese = false
    var containsNotChinese = false
    for (aChar in this) {
        if (aChar.isChinese()) {
            containsChinese = true
        } else {
            containsNotChinese = true
        }
        if (containsChinese && containsNotChinese) {
            return true
        }
    }
    return false
}

/**
 * If the given character is chinese, it return is itself, otherwise it returns the default value.
 */
fun Char.isNotChineseOr(defaultValue: Char): Char {
    return if (this.isChinese()) this else defaultValue
}


/* ******************************************* isDigit *******************************************/


///**
// * Return `true` if the given character is digit
// */
//fun Char.isDigit(): Boolean {
//    return Character.isDigit(this)
//}

/**
 * Return `true` if the given character is not digit
 */
fun Char.isNotDigit(): Boolean {
    return !this.isDigit()
}

/**
 * Return `true` if the given array of characters is all digit
 */
fun CharArray.isAllDigit(): Boolean {
    for (aChar in this) if (aChar.isNotDigit()) return false
    return true
}

/**
 * Return `true` if the given array of characters is all digit
 */
fun Iterable<Char>.isAllDigit(): Boolean {
    for (aChar in this) if (aChar.isNotDigit()) return false
    return true
}

/**
 * Return `true` if the given array of characters is all not digit
 */
fun CharArray.isAllNotDigit(): Boolean {
    for (aChar in this) if (aChar.isDigit()) return false
    return true
}

/**
 * Return `true` if the given array of characters is all not digit
 */
fun Iterable<Char>.isAllNotDigit(): Boolean {
    for (aChar in this) if (aChar.isDigit()) return false
    return true
}

/**
 * Return `true` if only a portion of the given characters is digit
 */
fun CharArray.isPartDigit(): Boolean {
    var containsDigit = false
    var containsNotDigit = false
    for (aChar in this) {
        if (aChar.isDigit()) {
            containsDigit = true
        } else {
            containsNotDigit = true
        }
        if (containsDigit && containsNotDigit) {
            return true
        }
    }
    return false
}

/**
 * Return `true` if only a portion of the given characters is digit
 */
fun Iterable<Char>.isPartDigit(): Boolean {
    var containsDigit = false
    var containsNotDigit = false
    for (aChar in this) {
        if (aChar.isDigit()) {
            containsDigit = true
        } else {
            containsNotDigit = true
        }
        if (containsDigit && containsNotDigit) {
            return true
        }
    }
    return false
}

/**
 * If the given character is digit, it return is itself, otherwise it returns the default value.
 */
fun Char.isNotDigitOr(defaultValue: Char): Char {
    return if (this.isDigit()) this else defaultValue
}


/* ******************************************* isLetter *******************************************/


///**
// * Return `true` if the given character is letter
// */
//fun Char.isLetter(): Boolean {
//    return Character.isLetter(this)
//}

/**
 * Return `true` if the given character is not letter
 */
fun Char.isNotLetter(): Boolean {
    return !this.isLetter()
}

/**
 * Return `true` if the given array of characters is all letter
 */
fun CharArray.isAllLetter(): Boolean {
    for (aChar in this) if (aChar.isNotLetter()) return false
    return true
}

/**
 * Return `true` if the given array of characters is all letter
 */
fun Iterable<Char>.isAllLetter(): Boolean {
    for (aChar in this) if (aChar.isNotLetter()) return false
    return true
}

/**
 * Return `true` if the given array of characters is all not letter
 */
fun CharArray.isAllNotLetter(): Boolean {
    for (aChar in this) if (aChar.isLetter()) return false
    return true
}

/**
 * Return `true` if the given array of characters is all not letter
 */
fun Iterable<Char>.isAllNotLetter(): Boolean {
    for (aChar in this) if (aChar.isLetter()) return false
    return true
}

/**
 * Return `true` if only a portion of the given characters is letter
 */
fun CharArray.isPartLetter(): Boolean {
    var containsLetter = false
    var containsNotLetter = false
    for (aChar in this) {
        if (aChar.isLetter()) {
            containsLetter = true
        } else {
            containsNotLetter = true
        }
        if (containsLetter && containsNotLetter) {
            return true
        }
    }
    return false
}

/**
 * Return `true` if only a portion of the given characters is letter
 */
fun Iterable<Char>.isPartLetter(): Boolean {
    var containsLetter = false
    var containsNotLetter = false
    for (aChar in this) {
        if (aChar.isLetter()) {
            containsLetter = true
        } else {
            containsNotLetter = true
        }
        if (containsLetter && containsNotLetter) {
            return true
        }
    }
    return false
}

/**
 * If the given character is letter, it return is itself, otherwise it returns the default value.
 */
fun Char.isNotLetterOr(defaultValue: Char): Char {
    return if (this.isLetter()) this else defaultValue
}


/* ******************************************* isLetterOrDigit *******************************************/


///**
// * Return `true` if the given character is letter or digit
// */
//fun Char.isLetterOrDigit(): Boolean {
//    return Character.isLetterOrDigit(this)
//}

/**
 * Return `true` if the given character is not letter or digit
 */
fun Char.isNotLetterOrDigit(): Boolean {
    return !this.isLetterOrDigit()
}

/**
 * Return `true` if the given array of characters is all letter or digit
 */
fun CharArray.isAllLetterOrDigit(): Boolean {
    for (aChar in this) if (aChar.isNotLetterOrDigit()) return false
    return true
}

/**
 * Return `true` if the given array of characters is all letter or digit
 */
fun Iterable<Char>.isAllLetterOrDigit(): Boolean {
    for (aChar in this) if (aChar.isNotLetterOrDigit()) return false
    return true
}

/**
 * Return `true` if the given array of characters is all not letter or digit
 */
fun CharArray.isAllNotLetterOrDigit(): Boolean {
    for (aChar in this) if (aChar.isLetterOrDigit()) return false
    return true
}

/**
 * Return `true` if the given array of characters is all not letter or digit
 */
fun Iterable<Char>.isAllNotLetterOrDigit(): Boolean {
    for (aChar in this) if (aChar.isLetterOrDigit()) return false
    return true
}

/**
 * Return `true` if only a portion of the given characters is letter or digit
 */
fun CharArray.isPartLetterOrDigit(): Boolean {
    var containsLetterOrDigit = false
    var containsNotLetterOrDigit = false
    for (aChar in this) {
        if (aChar.isLetterOrDigit()) {
            containsLetterOrDigit = true
        } else {
            containsNotLetterOrDigit = true
        }
        if (containsLetterOrDigit && containsNotLetterOrDigit) {
            return true
        }
    }
    return false
}

/**
 * Return `true` if only a portion of the given characters is letter or digit
 */
fun Iterable<Char>.isPartLetterOrDigit(): Boolean {
    var containsLetterOrDigit = false
    var containsNotLetterOrDigit = false
    for (aChar in this) {
        if (aChar.isLetterOrDigit()) {
            containsLetterOrDigit = true
        } else {
            containsNotLetterOrDigit = true
        }
        if (containsLetterOrDigit && containsNotLetterOrDigit) {
            return true
        }
    }
    return false
}

/**
 * If the given character is letter or digit, it return is itself, otherwise it returns the default value.
 */
fun Char.isNotLetterOrDigitOr(defaultValue: Char): Char {
    return if (this.isLetterOrDigit()) this else defaultValue
}