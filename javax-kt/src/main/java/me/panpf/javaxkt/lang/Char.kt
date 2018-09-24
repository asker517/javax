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
 * If the given character is letter or digit, it return is itself, otherwise it returns the default value.
 */
fun Char.isNotLetterOrDigitOr(defaultValue: Char): Char {
    return if (this.isLetterOrDigit()) this else defaultValue
}