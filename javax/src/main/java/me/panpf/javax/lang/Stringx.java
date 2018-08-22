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

import me.panpf.javax.util.Predicatex;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import static java.lang.Character.isLowerCase;
import static java.lang.Character.isUpperCase;

/**
 * String tool class
 */
@SuppressWarnings({"WeakerAccess"})
public class Stringx {

    /**
     * Returns `true` if this string is empty or consists solely of whitespace characters.
     */
    public static boolean isBlank(@NotNull CharSequence string) {
        for (int index = 0, size = string.length(); index < size; index++) {
            if (!Charx.isBlank(string.charAt(index))) {
                return false;
            }
        }
        return true;
    }

    /**
     * Returns `true` if this char sequence is not empty and contains some characters except of whitespace characters.
     */
    public static boolean isNotBlank(@NotNull CharSequence string) {
        return !isBlank(string);
    }

    /**
     * Returns `true` if this nullable char sequence is either `null` or empty or consists solely of whitespace characters.
     */
    public static boolean isNullOrBlank(@Nullable CharSequence string) {
        return string == null || isBlank(string);
    }

    /**
     * Return `true` if the character sequence is not `null` or whitespace characters.
     */
    public static boolean isNotNullOrBlank(@Nullable CharSequence string) {
        return !isNullOrBlank(string);
    }

    /**
     * Return `true` if all character sequences are whitespace characters
     */
    public static boolean isAllBlank(@NotNull CharSequence... strings) {
        for (CharSequence string : strings) {
            if (!isBlank(string)) {
                return false;
            }
        }
        return true;
    }

    /**
     * Return `true` if all character sequences are not whitespace characters
     */
    public static boolean isAllNotBlank(@NotNull CharSequence... strings) {
        for (CharSequence string : strings) {
            if (isBlank(string)) {
                return false;
            }
        }
        return true;
    }

    /**
     * Return `true` if all character sequences is either `null` or whitespace characters.
     */
    public static boolean isAllNullOrBlank(@Nullable CharSequence... strings) {
        if (strings != null) {
            for (CharSequence string : strings) {
                if (!isNullOrBlank(string)) {
                    return false;
                }
            }
        }
        return true;
    }

    /**
     * Return `true` if all character sequences is not `null` or whitespace characters.
     */
    public static boolean isAllNotNullOrBlank(@Nullable CharSequence... strings) {
        if (strings != null) {
            for (CharSequence string : strings) {
                if (isNullOrBlank(string)) {
                    return false;
                }
            }
            return true;
        } else {
            return false;
        }
    }


    /**
     * Returns `true` if this char sequence is empty (contains no characters).
     */
    public static boolean isEmpty(@NotNull CharSequence string) {
        return string.length() == 0;
    }

    /**
     * Returns `true` if this char sequence is not empty.
     */
    public static boolean isNotEmpty(@NotNull CharSequence string) {
        return string.length() > 0;
    }

    /**
     * Returns `true` if this nullable char sequence is either `null` or empty.
     */
    public static boolean isNullOrEmpty(@Nullable CharSequence string) {
        return string == null || string.length() == 0;
    }

    /**
     * Return `true` if the character sequence is not `null` or empty
     */
    public static boolean isNotNullOrEmpty(@Nullable CharSequence string) {
        return !isNullOrEmpty(string);
    }

    /**
     * Return `true` if all character sequences are empty
     */
    public static boolean isAllEmpty(@NotNull CharSequence... strings) {
        for (CharSequence string : strings) {
            if (!isEmpty(string)) {
                return false;
            }
        }
        return true;
    }

    /**
     * Return `true` if all character sequences are not empty
     */
    public static boolean isAllNotEmpty(@NotNull CharSequence... strings) {
        for (CharSequence string : strings) {
            if (isEmpty(string)) {
                return false;
            }
        }
        return true;
    }

    /**
     * Return `true` if all character sequences is either `null` or empty.
     */
    public static boolean isAllNullOrEmpty(@Nullable CharSequence... strings) {
        if (strings != null) {
            for (CharSequence string : strings) {
                if (!isNullOrEmpty(string)) {
                    return false;
                }
            }
        }
        return true;
    }

    /**
     * Return `true` if all character sequences is not `null` or empty.
     */
    public static boolean isAllNotNullOrEmpty(@Nullable CharSequence... strings) {
        if (strings != null) {
            for (CharSequence string : strings) {
                if (isNullOrEmpty(string)) {
                    return false;
                }
            }
            return true;
        } else {
            return false;
        }
    }


    /**
     * Return `true` if the given sequence of characters is all digit
     */
    public static boolean isDigit(@NotNull CharSequence string) {
        for (int index = 0, size = string.length(); index < size; index++) {
            if (!Character.isDigit(string.charAt(index))) {
                return false;
            }
        }
        return true;
    }

    /**
     * Return `true` if the given sequence of characters is all chinese
     */
    public static boolean isChinese(@NotNull CharSequence string) {
        for (int index = 0, size = string.length(); index < size; index++) {
            if (!Charx.isChinese(string.charAt(index))) {
                return false;
            }
        }
        return true;
    }

    /**
     * Return `true` if the given sequence of characters is all digit or letter
     */
    public static boolean isLetterOrDigit(@NotNull CharSequence string) {
        for (int index = 0, size = string.length(); index < size; index++) {
            if (!Character.isLetterOrDigit(string.charAt(index))) {
                return false;
            }
        }
        return true;
    }


    /**
     * Return `tru`e if the specified character sequence begins with the specified prefix
     *
     * @param ignoreCase If true, ignore case
     */
    public static boolean startsWith(@NotNull CharSequence string, @NotNull String prefix, boolean ignoreCase) {
        if (string.length() < prefix.length()) return false;
        String subPrefix = string.subSequence(0, prefix.length()).toString();
        if (ignoreCase) {
            return subPrefix.equalsIgnoreCase(prefix);
        } else {
            return subPrefix.equals(prefix);
        }
    }

    /**
     * Return `tru`e if the specified character sequence begins with the specified prefix
     */
    public static boolean startsWith(@NotNull CharSequence string, @NotNull String prefix) {
        return startsWith(string, prefix, false);
    }

    /**
     * Return `tru`e if the specified string begins with the specified prefix
     *
     * @param ignoreCase If true, ignore case
     */
    public static boolean startsWith(@NotNull String string, @NotNull String prefix, boolean ignoreCase) {
        return startsWith((CharSequence) string, prefix, ignoreCase);
    }

    /**
     * Return `tru`e if the specified string begins with the specified prefix
     */
    public static boolean startsWith(@NotNull String string, @NotNull String prefix) {
        return startsWith((CharSequence) string, prefix, false);
    }


    /**
     * Return `tru`e if the specified character sequence end with the specified suffix
     *
     * @param ignoreCase If true, ignore case
     */
    public static boolean endsWith(@NotNull CharSequence string, @NotNull String suffix, boolean ignoreCase) {
        if (string.length() < suffix.length()) return false;
        String subSuffix = string.subSequence(string.length() - suffix.length(), string.length()).toString();
        if (ignoreCase) {
            return subSuffix.equalsIgnoreCase(suffix);
        } else {
            return subSuffix.equals(suffix);
        }
    }

    /**
     * Return `tru`e if the specified character sequence end with the specified suffix
     */
    public static boolean endsWith(@NotNull CharSequence string, @NotNull String suffix) {
        return startsWith(string, suffix, false);
    }

    /**
     * Return `tru`e if the specified string end with the specified suffix
     *
     * @param ignoreCase If true, ignore case
     */
    public static boolean endsWith(@NotNull String string, @NotNull String suffix, boolean ignoreCase) {
        return endsWith((CharSequence) string, suffix, ignoreCase);
    }

    /**
     * Return `tru`e if the specified string end with the specified suffix
     */
    public static boolean endsWith(@NotNull String string, @NotNull String suffix) {
        return endsWith((CharSequence) string, suffix, false);
    }


    /**
     * Returns `true` if this string is equal to [other], optionally ignoring character case.
     *
     * @param ignoreCase `true` to ignore character case when comparing strings.
     */
    public static boolean equals(@Nullable String self, @Nullable String other, boolean ignoreCase) {
        if (self == null) {
            return other == null;
        } else if (!ignoreCase) {
            return self.equals(other);
        } else {
            return self.equalsIgnoreCase(other);
        }
    }

    /**
     * Returns `true` if this string is equal to [other], no ignoring character case.
     */
    public static boolean equals(@Nullable String self, @Nullable String other) {
        return equals(self, other, false);
    }


    /**
     * Returns the given character sequence if it is not null, otherwise return an empty sequence of characters
     */
    @NotNull
    public static String orEmpty(@Nullable String string) {
        return string != null ? string : "";
    }

    /**
     * Returns the given character sequence if it is not null, otherwise return given defaultValue
     */
    @NotNull
    public static String orDefault(@Nullable String string, @NotNull String defaultValue) {
        return string != null ? string : defaultValue;
    }

    /**
     * If the given string is empty, it return `null` otherwise it return itself
     */
    @Nullable
    public static String emptyToNull(@NotNull String string) {
        return isEmpty(string) ? null : string;
    }

    /**
     * If the given string is blank, it return `null` otherwise it return itself
     */
    @Nullable
    public static String blankToNull(@NotNull String string) {
        return isBlank(string) ? null : string;
    }


    /**
     * Delete all specified characters in the string and return the new string
     */
    @NotNull
    public static String removeChar(@NotNull String string, char ch) {
        StringBuilder sb = new StringBuilder();
        for (char cha : string.toCharArray()) {
            if (cha != ch) {
                sb.append(cha);
            }
        }
        return sb.toString();
    }

    /**
     * Delete the first occurrence of the specified character in the string and return the new string
     */
    @NotNull
    public static String removeFirstChar(@NotNull String string, char ch) {
        boolean removed = false;
        StringBuilder sb = new StringBuilder();
        for (int index = 0, size = string.length(); index < size; index++) {
            char cha = string.charAt(index);
            if (cha != ch || removed) {
                sb.append(cha);
            } else {
                removed = true;
            }
        }
        return sb.toString();
    }

    /**
     * Delete the last specified character in the string and return the new string
     */
    @NotNull
    public static String removeLastChar(@NotNull String string, char ch) {
        boolean removed = false;
        StringBuilder sb = new StringBuilder();
        for (int index = string.length() - 1; index >= 0; index--) {
            char cha = string.charAt(index);
            if (cha != ch || removed) {
                sb.insert(0, cha);
            } else {
                removed = true;
            }
        }
        return sb.toString();
    }

    /**
     * Delete the character at the specified position in the string and return the new string
     */
    @NotNull
    public static String removeIndex(@NotNull String string, int removeIndex) {
        boolean removed = false;
        StringBuilder sb = new StringBuilder();
        for (int index = 0, size = string.length(); index < size; index++) {
            char cha = string.charAt(index);
            if (index != removeIndex || removed) {
                sb.append(cha);
            } else {
                removed = true;
            }
        }
        return sb.toString();
    }


    /**
     * Returns a copy of this string having its first letter uppercased, or the original string,
     * if it's empty or already starts with an upper case letter.
     */
    @NotNull
    public static String capitalize(@NotNull String string) {
        return isNotEmpty(string) && isLowerCase(string.charAt(0)) ? string.substring(0, 1).toUpperCase() + string.substring(1) : string;
    }

    /**
     * Returns a copy of this string having its first letter lowercased, or the original string,
     * if it's empty or already starts with a lower case letter.
     */
    @NotNull
    public static String decapitalize(@NotNull String string) {
        return isNotEmpty(string) && isUpperCase(string.charAt(0)) ? string.substring(0, 1).toLowerCase() + string.substring(1) : string;
    }


    /**
     * If the length of the character sequences exceeds the specified length, the character sequences is intercepted
     * and the specified suffix is ​​returned to return the new character sequences, otherwise it return itself.
     */
    @NotNull
    public static CharSequence limit(@NotNull CharSequence string, int length, @Nullable String suffix) {
        Predicatex.require(length >= 0, "Desired length $length is less than zero.");
        if (string.length() <= length) return string;

        CharSequence limitString = string.subSequence(0, length);
        if (suffix != null) {
            return limitString + suffix;
        } else {
            return limitString;
        }
    }

    /**
     * If the length of the character sequences exceeds the specified length, the character sequences is intercepted
     * and the specified suffix is ​​returned to return the new character sequences, otherwise it return itself.
     */
    @NotNull
    public static CharSequence limit(@NotNull CharSequence string, int length) {
        return limit(string, length, null);
    }

    /**
     * If the length of the string exceeds the specified length, the string is intercepted and the specified suffix
     * is ​​returned to return the new string, otherwise it return itself.
     */
    @NotNull
    public static String limit(@NotNull String string, int length, @Nullable String suffix) {
        return limit((CharSequence) string, length, suffix).toString();
    }

    /**
     * If the length of the string exceeds the specified length, the string is intercepted and the specified suffix
     * is ​​returned to return the new string, otherwise it return itself.
     */
    @NotNull
    public static String limit(@NotNull String string, int length) {
        return limit((CharSequence) string, length, null).toString();
    }


    /**
     * Returns a char sequence with content of this char sequence padded at the beginning
     * to the specified [length] with the specified character or space.
     *
     * @param length  the desired string length.
     * @param padChar the character to pad string with, if it has length less than the [length] specified. Space is used by default.
     * @return Returns a string, of length at least [length], consisting of string prepended with [padChar] as many times.
     * as are necessary to reach that length.
     */
    @NotNull
    public static CharSequence padStart(@NotNull CharSequence string, int length, char padChar) {
        Predicatex.require(length >= 0, "Desired length $length is less than zero.");
        if (length <= string.length()) return string.subSequence(0, string.length());

        StringBuilder sb = new StringBuilder(length);
        for (int i = 0, size = length - string.length(); i < size; i++) {
            sb.append(padChar);
        }
        sb.append(string);
        return sb;
    }

    /**
     * Returns a char sequence with content of this char sequence padded at the beginning
     * to the specified [length] with the specified character or space. Default padding ' '
     *
     * @param length the desired string length.
     * @return Returns a string, of length at least [length], consisting of string prepended with [padChar] as many times.
     * as are necessary to reach that length.
     */
    @NotNull
    public static CharSequence padStart(@NotNull CharSequence string, int length) {
        return padStart(string, length, ' ');
    }

    /**
     * Pads the string to the specified [length] at the beginning with the specified character or space.
     *
     * @param length  the desired string length.
     * @param padChar the character to pad string with, if it has length less than the [length] specified. Space is used by default.
     * @return Returns a string, of length at least [length], consisting of string prepended with [padChar] as many times.
     * as are necessary to reach that length.
     */
    @NotNull
    public static String padStart(@NotNull String string, int length, char padChar) {
        return padStart((CharSequence) string, length, padChar).toString();
    }

    /**
     * Pads the string to the specified [length] at the beginning with the specified character or space. Default padding ' '
     *
     * @param length the desired string length.
     * @return Returns a string, of length at least [length], consisting of string prepended with [padChar] as many times.
     * as are necessary to reach that length.
     */
    @NotNull
    public static String padStart(@NotNull String string, int length) {
        return padStart((CharSequence) string, length, ' ').toString();
    }


    /**
     * Returns a char sequence with content of this char sequence padded at the end
     * to the specified [length] with the specified character or space.
     *
     * @param length  the desired string length.
     * @param padChar the character to pad string with, if it has length less than the [length] specified. Space is used by default.
     * @return Returns a string, of length at least [length], consisting of string prepended with [padChar] as many times.
     * as are necessary to reach that length.
     */
    @NotNull
    public static CharSequence padEnd(@NotNull CharSequence string, int length, char padChar) {
        Predicatex.require(length >= 0, "Desired length $length is less than zero.");
        if (length <= string.length()) return string.subSequence(0, string.length());

        StringBuilder sb = new StringBuilder(length);
        sb.append(string);
        for (int i = 0, size = length - string.length(); i < size; i++) {
            sb.append(padChar);
        }
        return sb;
    }

    /**
     * Returns a char sequence with content of this char sequence padded at the end
     * to the specified [length] with the specified character or space. Default padding ' '
     *
     * @param length the desired string length.
     * @return Returns a string, of length at least [length], consisting of string prepended with [padChar] as many times.
     * as are necessary to reach that length.
     */
    @NotNull
    public static CharSequence padEnd(@NotNull CharSequence string, int length) {
        return padEnd(string, length, ' ');
    }

    /**
     * Pads the string to the specified [length] at the end with the specified character or space.
     *
     * @param length  the desired string length.
     * @param padChar the character to pad string with, if it has length less than the [length] specified. Space is used by default.
     * @return Returns a string, of length at least [length], consisting of string prepended with [padChar] as many times.
     * as are necessary to reach that length.
     */
    @NotNull
    public static String padEnd(@NotNull String string, int length, char padChar) {
        return padEnd((CharSequence) string, length, padChar).toString();
    }

    /**
     * Pads the string to the specified [length] at the end with the specified character or space. Default padding ' '
     *
     * @param length the desired string length.
     * @return Returns a string, of length at least [length], consisting of string prepended with [padChar] as many times.
     * as are necessary to reach that length.
     */
    @NotNull
    public static String padEnd(@NotNull String string, int length) {
        return padEnd((CharSequence) string, length, ' ').toString();
    }
}