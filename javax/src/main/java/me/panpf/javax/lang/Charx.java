/*
 * Copyright (C) 2018 Peng fei Pan <sky@panpf.me>
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

/**
 * Character tool class
 */
@SuppressWarnings({"WeakerAccess"})
public class Charx {

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
