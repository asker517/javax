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

    /* ******************************************* From Kotlin Standard library ********************************************************* */

    /**
     * Returns `true` if this character is equal to the [other] character, optionally ignoring character case.
     *
     * @param ignoreCase `true` to ignore character case when comparing characters. By default `false`.
     *
     * Two characters are considered the same ignoring case if at least one of the following is `true`:
     *   - The two characters are the same (as compared by the == operator)
     *   - Applying the method [toUpperCase] to each character produces the same result
     *   - Applying the method [toLowerCase] to each character produces the same result
     */
    public static boolean equals(char self, char other, boolean ignoreCase) {
        if (self == other) return true;
        if (!ignoreCase) return false;

        if (Character.toUpperCase(self) == Character.toUpperCase(other)) return true;
        if (Character.toUpperCase(self) == Character.toUpperCase(other)) return true;
        return false;
    }

    /**
     * Return `true` if the given character is blank
     */
    public static boolean isBlank(char c) {
        return Character.isWhitespace(c) || Character.isSpaceChar(c);
    }

    /**
     * Return `true` if the given array of characters is all blank
     */
    public static boolean isBlank(@NotNull char... chars) {
        for (char aChar : chars) {
            if (!isBlank(aChar)) {
                return false;
            }
        }
        return true;
    }

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
     * Return `true` if the given array of characters is all chinese
     */
    public static boolean isChinese(@NotNull char... chars) {
        for (char aChar : chars) {
            if (!isChinese(aChar)) {
                return false;
            }
        }
        return true;
    }

    /**
     * Return `true` if the given array of characters is all numeric
     */
    public static boolean isDigit(@NotNull char... chars) {
        for (char aChar : chars) {
            if (!Character.isDigit(aChar)) {
                return false;
            }
        }
        return true;
    }
}
