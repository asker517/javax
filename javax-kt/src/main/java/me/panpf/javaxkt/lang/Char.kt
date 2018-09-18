package me.panpf.javaxkt.lang


/**
 * Return `true` if the given character is blank
 */
fun Char.isBlank(): Boolean {
    return Character.isWhitespace(this) || Character.isSpaceChar(this)
}

/**
 * Return `true` if the given array of characters is all blank
 */
fun CharArray.isAllBlank(): Boolean {
    for (aChar in this) {
        if (!aChar.isBlank()) {
            return false
        }
    }
    return true
}

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
 * Return `true` if the given array of characters is all chinese
 */
fun CharArray.isAllChinese(): Boolean {
    for (aChar in this) {
        if (!aChar.isChinese()) {
            return false
        }
    }
    return true
}

/**
 * Return `true` if the given array of characters is all numeric
 */
fun CharArray.isAllDigit(): Boolean {
    for (aChar in this) {
        if (!aChar.isDigit()) {
            return false
        }
    }
    return true
}