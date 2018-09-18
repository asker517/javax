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

package me.panpf.javax.lang;


import org.jetbrains.annotations.NotNull;

import java.nio.charset.Charset;

/**
 * Character tool class
 */
@SuppressWarnings({"WeakerAccess"})
public class Charx {

    public static final Charset UTF_8 = Charset.forName("UTF-8");


    /* ******************************************* isBlank *******************************************/


    /**
     * Return `true` if the given character is blank
     */
    public static boolean isBlank(char c) {
        return Character.isWhitespace(c) || Character.isSpaceChar(c);
    }

    /**
     * Return `true` if the given character is blank
     */
    public static boolean isNotBlank(char c) {
        return !isBlank(c);
    }

    /**
     * Return `true` if the given array of characters is all blank
     */
    public static boolean isAllBlank(@NotNull char[] chars) {
        for (char aChar : chars) if (isNotBlank(aChar)) return false;
        return true;
    }

    /**
     * Return `true` if the given array of characters is all blank
     */
    public static boolean isAllBlank(@NotNull Iterable<Character> chars) {
        for (char aChar : chars) if (isNotBlank(aChar)) return false;
        return true;
    }

    /**
     * Return `true` if the given array of characters is all not blank
     */
    public static boolean isAllNotBlank(@NotNull char[] chars) {
        for (char aChar : chars) if (isBlank(aChar)) return false;
        return true;
    }

    /**
     * Return `true` if the given array of characters is all not blank
     */
    public static boolean isAllNotBlank(@NotNull Iterable<Character> chars) {
        for (char aChar : chars) if (isBlank(aChar)) return false;
        return true;
    }

    /**
     * Return `true` if only a portion of the given characters is blank
     */
    public static boolean isPartBlank(@NotNull char[] chars) {
        boolean containsBlank = false;
        boolean containsNotBlank = false;
        for (char aChar : chars) {
            if (isBlank(aChar)) {
                containsBlank = true;
            } else {
                containsNotBlank = true;
            }
            if (containsBlank && containsNotBlank) {
                return true;
            }
        }
        return false;
    }

    /**
     * Return `true` if only a portion of the given characters is blank
     */
    public static boolean isPartBlank(@NotNull Iterable<Character> chars) {
        boolean containsBlank = false;
        boolean containsNotBlank = false;
        for (char aChar : chars) {
            if (isBlank(aChar)) {
                containsBlank = true;
            } else {
                containsNotBlank = true;
            }
            if (containsBlank && containsNotBlank) {
                return true;
            }
        }
        return false;
    }

    /**
     * If the given character is not blank, it return is itself, otherwise it returns the default value.
     */
    public static char isBlankOr(char c, char defaultValue) {
        return isNotBlank(c) ? c : defaultValue;
    }


    /* ******************************************* isChinese *******************************************/


    /**
     * Return `true` if the given character is Chinese
     */
    public static boolean isChinese(char cha) {
        Character.UnicodeBlock ub = Character.UnicodeBlock.of(cha);
        return ub == Character.UnicodeBlock.CJK_UNIFIED_IDEOGRAPHS || ub == Character.UnicodeBlock.CJK_COMPATIBILITY_IDEOGRAPHS
                || ub == Character.UnicodeBlock.CJK_UNIFIED_IDEOGRAPHS_EXTENSION_A || ub == Character.UnicodeBlock.GENERAL_PUNCTUATION
                || ub == Character.UnicodeBlock.CJK_SYMBOLS_AND_PUNCTUATION || ub == Character.UnicodeBlock.HALFWIDTH_AND_FULLWIDTH_FORMS;
    }

    /**
     * Return `true` if the given character is chinese
     */
    public static boolean isNotChinese(char cha) {
        return !isChinese(cha);
    }

    /**
     * Return `true` if the given array of characters is all chinese
     */
    public static boolean isAllChinese(@NotNull char[] chars) {
        for (char aChar : chars) if (isNotChinese(aChar)) return false;
        return true;
    }

    /**
     * Return `true` if the given array of characters is all chinese
     */
    public static boolean isAllChinese(@NotNull Iterable<Character> chars) {
        for (char aChar : chars) if (isNotChinese(aChar)) return false;
        return true;
    }

    /**
     * Return `true` if the given array of characters is all chinese
     */
    public static boolean isAllNotChinese(@NotNull char[] chars) {
        for (char aChar : chars) if (isChinese(aChar)) return false;
        return true;
    }

    /**
     * Return `true` if the given array of characters is all chinese
     */
    public static boolean isAllNotChinese(@NotNull Iterable<Character> chars) {
        for (char aChar : chars) if (isChinese(aChar)) return false;
        return true;
    }

    /**
     * Return `true` if only a portion of the given characters is chinese
     */
    public static boolean isPartChinese(@NotNull char[] chars) {
        boolean containsChinese = false;
        boolean containsNotChinese = false;
        for (char aChar : chars) {
            if (isChinese(aChar)) {
                containsChinese = true;
            } else {
                containsNotChinese = true;
            }
            if (containsChinese && containsNotChinese) {
                return true;
            }
        }
        return false;
    }

    /**
     * Return `true` if only a portion of the given characters is chinese
     */
    public static boolean isPartChinese(@NotNull Iterable<Character> chars) {
        boolean containsChinese = false;
        boolean containsNotChinese = false;
        for (char aChar : chars) {
            if (isChinese(aChar)) {
                containsChinese = true;
            } else {
                containsNotChinese = true;
            }
            if (containsChinese && containsNotChinese) {
                return true;
            }
        }
        return false;
    }

    /**
     * If the given character is chinese, it return is itself, otherwise it returns the default value.
     */
    public static char isNotChineseOr(char c, char defaultValue) {
        return isChinese(c) ? c : defaultValue;
    }


    /* ******************************************* isDigit *******************************************/


    /**
     * Return `true` if the given character is digit
     */
    public static boolean isDigit(char cha) {
        return Character.isDigit(cha);
    }

    /**
     * Return `true` if the given character is not digit
     */
    public static boolean isNotDigit(char cha) {
        return !isDigit(cha);
    }

    /**
     * Return `true` if the given array of characters is all digit
     */
    public static boolean isAllDigit(@NotNull char[] chars) {
        for (char aChar : chars) if (isNotDigit(aChar)) return false;
        return true;
    }

    /**
     * Return `true` if the given array of characters is all digit
     */
    public static boolean isAllDigit(@NotNull Iterable<Character> chars) {
        for (char aChar : chars) if (isNotDigit(aChar)) return false;
        return true;
    }

    /**
     * Return `true` if the given array of characters is all not digit
     */
    public static boolean isAllNotDigit(@NotNull char[] chars) {
        for (char aChar : chars) if (isDigit(aChar)) return false;
        return true;
    }

    /**
     * Return `true` if the given array of characters is all not digit
     */
    public static boolean isAllNotDigit(@NotNull Iterable<Character> chars) {
        for (char aChar : chars) if (isDigit(aChar)) return false;
        return true;
    }

    /**
     * Return `true` if only a portion of the given characters is digit
     */
    public static boolean isPartDigit(@NotNull char[] chars) {
        boolean containsDigit = false;
        boolean containsNotDigit = false;
        for (char aChar : chars) {
            if (isDigit(aChar)) {
                containsDigit = true;
            } else {
                containsNotDigit = true;
            }
            if (containsDigit && containsNotDigit) {
                return true;
            }
        }
        return false;
    }

    /**
     * Return `true` if only a portion of the given characters is digit
     */
    public static boolean isPartDigit(@NotNull Iterable<Character> chars) {
        boolean containsDigit = false;
        boolean containsNotDigit = false;
        for (char aChar : chars) {
            if (isDigit(aChar)) {
                containsDigit = true;
            } else {
                containsNotDigit = true;
            }
            if (containsDigit && containsNotDigit) {
                return true;
            }
        }
        return false;
    }

    /**
     * If the given character is digit, it return is itself, otherwise it returns the default value.
     */
    public static char isNotDigitOr(char c, char defaultValue) {
        return isDigit(c) ? c : defaultValue;
    }


    /* ******************************************* isLetter *******************************************/


    /**
     * Return `true` if the given character is letter
     */
    public static boolean isLetter(char cha) {
        return Character.isLetter(cha);
    }

    /**
     * Return `true` if the given character is not letter
     */
    public static boolean isNotLetter(char cha) {
        return !isLetter(cha);
    }

    /**
     * Return `true` if the given array of characters is all letter
     */
    public static boolean isAllLetter(@NotNull char[] chars) {
        for (char aChar : chars) if (isNotLetter(aChar)) return false;
        return true;
    }

    /**
     * Return `true` if the given array of characters is all letter
     */
    public static boolean isAllLetter(@NotNull Iterable<Character> chars) {
        for (char aChar : chars) if (isNotLetter(aChar)) return false;
        return true;
    }

    /**
     * Return `true` if the given array of characters is all not letter
     */
    public static boolean isAllNotLetter(@NotNull char[] chars) {
        for (char aChar : chars) if (isLetter(aChar)) return false;
        return true;
    }

    /**
     * Return `true` if the given array of characters is all not letter
     */
    public static boolean isAllNotLetter(@NotNull Iterable<Character> chars) {
        for (char aChar : chars) if (isLetter(aChar)) return false;
        return true;
    }

    /**
     * Return `true` if only a portion of the given characters is letter
     */
    public static boolean isPartLetter(@NotNull char[] chars) {
        boolean containsLetter = false;
        boolean containsNotLetter = false;
        for (char aChar : chars) {
            if (isLetter(aChar)) {
                containsLetter = true;
            } else {
                containsNotLetter = true;
            }
            if (containsLetter && containsNotLetter) {
                return true;
            }
        }
        return false;
    }

    /**
     * Return `true` if only a portion of the given characters is letter
     */
    public static boolean isPartLetter(@NotNull Iterable<Character> chars) {
        boolean containsLetter = false;
        boolean containsNotLetter = false;
        for (char aChar : chars) {
            if (isLetter(aChar)) {
                containsLetter = true;
            } else {
                containsNotLetter = true;
            }
            if (containsLetter && containsNotLetter) {
                return true;
            }
        }
        return false;
    }

    /**
     * If the given character is letter, it return is itself, otherwise it returns the default value.
     */
    public static char isNotLetterOr(char c, char defaultValue) {
        return isLetter(c) ? c : defaultValue;
    }


    /* ******************************************* isLetterOrDigit *******************************************/


    /**
     * Return `true` if the given character is letter or digit
     */
    public static boolean isLetterOrDigit(char cha) {
        return Character.isLetterOrDigit(cha);
    }

    /**
     * Return `true` if the given character is not letter or digit
     */
    public static boolean isNotLetterOrDigit(char cha) {
        return !isLetterOrDigit(cha);
    }

    /**
     * Return `true` if the given array of characters is all letter or digit
     */
    public static boolean isAllLetterOrDigit(@NotNull char[] chars) {
        for (char aChar : chars) if (isNotLetterOrDigit(aChar)) return false;
        return true;
    }

    /**
     * Return `true` if the given array of characters is all letter or digit
     */
    public static boolean isAllLetterOrDigit(@NotNull Iterable<Character> chars) {
        for (char aChar : chars) if (isNotLetterOrDigit(aChar)) return false;
        return true;
    }

    /**
     * Return `true` if the given array of characters is all not letter or digit
     */
    public static boolean isAllNotLetterOrDigit(@NotNull char[] chars) {
        for (char aChar : chars) if (isLetterOrDigit(aChar)) return false;
        return true;
    }

    /**
     * Return `true` if the given array of characters is all not letter or digit
     */
    public static boolean isAllNotLetterOrDigit(@NotNull Iterable<Character> chars) {
        for (char aChar : chars) if (isLetterOrDigit(aChar)) return false;
        return true;
    }

    /**
     * Return `true` if only a portion of the given characters is letter or digit
     */
    public static boolean isPartLetterOrDigit(@NotNull char[] chars) {
        boolean containsLetterOrDigit = false;
        boolean containsNotLetterOrDigit = false;
        for (char aChar : chars) {
            if (isLetterOrDigit(aChar)) {
                containsLetterOrDigit = true;
            } else {
                containsNotLetterOrDigit = true;
            }
            if (containsLetterOrDigit && containsNotLetterOrDigit) {
                return true;
            }
        }
        return false;
    }

    /**
     * Return `true` if only a portion of the given characters is letter or digit
     */
    public static boolean isPartLetterOrDigit(@NotNull Iterable<Character> chars) {
        boolean containsLetterOrDigit = false;
        boolean containsNotLetterOrDigit = false;
        for (char aChar : chars) {
            if (isLetterOrDigit(aChar)) {
                containsLetterOrDigit = true;
            } else {
                containsNotLetterOrDigit = true;
            }
            if (containsLetterOrDigit && containsNotLetterOrDigit) {
                return true;
            }
        }
        return false;
    }

    /**
     * If the given character is letter or digit, it return is itself, otherwise it returns the default value.
     */
    public static char isNotLetterOrDigitOr(char c, char defaultValue) {
        return isLetterOrDigit(c) ? c : defaultValue;
    }


    /*
     * *****************************************************************************************************************
     * From kotlin standard library
     * *****************************************************************************************************************
     */


    /**
     * Returns `true` if this character is equal to the [other] character, optionally ignoring character case.
     *
     * @param ignoreCase `true` to ignore character case when comparing characters. By default `false`.
     *                   <p>
     *                   Two characters are considered the same ignoring case if at least one of the following is `true`:
     *                   - The two characters are the same (as compared by the == operator)
     *                   - Applying the method [toUpperCase] to each character produces the same result
     *                   - Applying the method [toLowerCase] to each character produces the same result
     */
    public static boolean equals(char self, char other, boolean ignoreCase) {
        if (self == other) return true;
        if (!ignoreCase) return false;

        if (Character.toUpperCase(self) == Character.toUpperCase(other)) return true;
        return Character.toUpperCase(self) == Character.toUpperCase(other);
    }

    /**
     * Returns `true` if this character is equal to the [other] character, optionally ignoring character case.
     */
    public static boolean equals(char self, char other) {
        return equals(self, other, false);
    }
}
