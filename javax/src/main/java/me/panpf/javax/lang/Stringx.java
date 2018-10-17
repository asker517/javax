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

import me.panpf.javax.util.*;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import java.io.IOException;
import java.nio.charset.Charset;
import java.util.Collection;

import static java.lang.Character.isLowerCase;
import static java.lang.Character.isUpperCase;

/**
 * String tool method
 */
@SuppressWarnings({"WeakerAccess"})
public class Stringx {

    private Stringx() {
    }


    /* ******************************************* isSafe *******************************************/


    /**
     * Returns `true` if this string is is not `null` and not empty and contains some characters except of whitespace characters.
     */
    public static boolean isSafe(@Nullable CharSequence sequence) {
        return isNotNullOrEmpty(sequence) && isNotBlank(sequence);
    }

    /**
     * Returns `true` if this string is is `null` or empty or consists solely of whitespace characters.
     */
    public static boolean isNotSafe(@Nullable CharSequence sequence) {
        return !isSafe(sequence);
    }

    /**
     * If the given character sequence is safe, it return is itself, otherwise it returns the default value.
     */
    public static CharSequence isNotSafeOr(@Nullable CharSequence sequence, @NotNull CharSequence defaultValue) {
        return isSafe(sequence) ? sequence : defaultValue;
    }

    /**
     * If the given character sequence is safe, it return is itself, otherwise it returns the default value.
     */
    public static String isNotSafeOr(@Nullable String string, @NotNull String defaultValue) {
        return string != null && isSafe(string) ? string : defaultValue;
    }


    /* ******************************************* isBlank *******************************************/


    /**
     * Returns `true` if this string is empty or consists solely of whitespace characters.
     */
    public static boolean isBlank(@Nullable CharSequence sequence) {
        if (sequence == null) return false;
        for (int index = 0, size = sequence.length(); index < size; index++) {
            if (Charx.isNotBlank(sequence.charAt(index))) {
                return false;
            }
        }
        return true;
    }

    /**
     * Returns `true` if this char sequence is not empty and contains some characters except of whitespace characters.
     */
    public static boolean isNotBlank(@Nullable CharSequence sequence) {
        return !isBlank(sequence);
    }

    /**
     * If the given character sequence is not blank, it return is itself, otherwise it returns the default value.
     */
    public static CharSequence isBlankOr(@Nullable CharSequence sequence, @NotNull CharSequence defaultValue) {
        return isNotBlank(sequence) ? sequence : defaultValue;
    }

    /**
     * If the given character sequence is not blank, it return is itself, otherwise it returns the default value.
     */
    public static String isBlankOr(@Nullable String string, @NotNull String defaultValue) {
        return string != null && isNotBlank(string) ? string : defaultValue;
    }


    /**
     * Returns `true` if this nullable char sequence is either `null` or empty or consists solely of whitespace characters.
     */
    public static boolean isNullOrBlank(@Nullable CharSequence sequence) {
        return sequence == null || isBlank(sequence);
    }

    /**
     * Return `true` if the character sequence is not `null` or whitespace characters.
     */
    public static boolean isNotNullOrBlank(@Nullable CharSequence sequence) {
        return !isNullOrBlank(sequence);
    }

    /**
     * If the given character sequence is not null or blank, it return is itself, otherwise it returns the default value.
     */
    public static CharSequence isNullOrBlankOr(@Nullable CharSequence sequence, @NotNull CharSequence defaultValue) {
        return isNotNullOrBlank(sequence) ? sequence : defaultValue;
    }

    /**
     * If the given character sequence is not null or blank, it return is itself, otherwise it returns the default value.
     */
    public static String isNullOrBlankOr(@Nullable String string, @NotNull String defaultValue) {
        return isNotNullOrBlank(string) ? string : defaultValue;
    }


    /* ******************************************* isEmpty *******************************************/


    /**
     * Returns `true` if this char sequence is empty (contains no characters).
     */
    public static boolean isEmpty(@Nullable CharSequence sequence) {
        return sequence != null && sequence.length() == 0;
    }

    /**
     * Returns `true` if this char sequence is not empty.
     */
    public static boolean isNotEmpty(@Nullable CharSequence sequence) {
        return !isEmpty(sequence);
    }

    /**
     * If the given character sequence is not empty, it return is itself, otherwise it returns the default value.
     */
    public static CharSequence isEmptyOr(@Nullable CharSequence sequence, @NotNull CharSequence defaultValue) {
        return isNotEmpty(sequence) ? sequence : defaultValue;
    }

    /**
     * If the given character sequence is not empty, it return is itself, otherwise it returns the default value.
     */
    public static String isEmptyOr(@Nullable String string, @NotNull String defaultValue) {
        return string != null && isNotEmpty(string) ? string : defaultValue;
    }


    /**
     * Returns `true` if this nullable char sequence is either `null` or empty.
     */
    public static boolean isNullOrEmpty(@Nullable CharSequence sequence) {
        return sequence == null || sequence.length() == 0;
    }

    /**
     * Return `true` if the character sequence is not `null` or empty
     */
    public static boolean isNotNullOrEmpty(@Nullable CharSequence sequence) {
        return !isNullOrEmpty(sequence);
    }

    /**
     * If the given character sequence is not null or empty, it return is itself, otherwise it returns the default value.
     */
    public static CharSequence isNullOrEmptyOr(@Nullable CharSequence sequence, @NotNull CharSequence defaultValue) {
        return isNotNullOrEmpty(sequence) ? sequence : defaultValue;
    }

    /**
     * If the given character sequence is not null or empty, it return is itself, otherwise it returns the default value.
     */
    public static String isNullOrEmptyOr(@Nullable String string, @NotNull String defaultValue) {
        return isNotNullOrEmpty(string) ? string : defaultValue;
    }


    /* ******************************************* isChinese *******************************************/


    /**
     * Return `true` if the given sequence of characters is all chinese
     */
    public static boolean isChinese(@Nullable CharSequence sequence) {
        if (sequence == null || isNotSafe(sequence)) return false;
        for (int index = 0, size = sequence.length(); index < size; index++) {
            if (Charx.isNotChinese(sequence.charAt(index))) {
                return false;
            }
        }
        return true;
    }

    /**
     * Return `true` if the given sequence of characters is all not chinese
     */
    public static boolean isNotChinese(@Nullable CharSequence sequence) {
        return !isChinese(sequence);
    }

    /**
     * If the given character sequence is chinese, it return is itself, otherwise it returns the default value.
     */
    public static CharSequence isNotChineseOr(@Nullable CharSequence sequence, @NotNull CharSequence defaultValue) {
        return isChinese(sequence) ? sequence : defaultValue;
    }

    /**
     * If the given character sequence is chinese, it return is itself, otherwise it returns the default value.
     */
    public static String isNotChineseOr(@Nullable String string, @NotNull String defaultValue) {
        return isChinese(string) ? string : defaultValue;
    }


    /* ******************************************* isDigit *******************************************/


    /**
     * Return `true` if the given sequence of characters is all digit
     */
    public static boolean isDigit(@Nullable CharSequence sequence) {
        if (sequence == null || isNotSafe(sequence)) return false;
        for (int index = 0, size = sequence.length(); index < size; index++) {
            if (Charx.isNotDigit(sequence.charAt(index))) {
                return false;
            }
        }
        return true;
    }

    /**
     * Return `true` if the given sequence of characters is all not digit
     */
    public static boolean isNotDigit(@Nullable CharSequence sequence) {
        return !isDigit(sequence);
    }

    /**
     * If the given character sequence is digit, it return is itself, otherwise it returns the default value.
     */
    public static CharSequence isNotDigitOr(@Nullable CharSequence sequence, @NotNull CharSequence defaultValue) {
        return isDigit(sequence) ? sequence : defaultValue;
    }

    /**
     * If the given character sequence is digit, it return is itself, otherwise it returns the default value.
     */
    public static String isNotDigitOr(@Nullable String string, @NotNull String defaultValue) {
        return isDigit(string) ? string : defaultValue;
    }


    /* ******************************************* isLetter *******************************************/


    /**
     * Return `true` if the given sequence of characters is all letter
     */
    public static boolean isLetter(@Nullable CharSequence sequence) {
        if (sequence == null || isNotSafe(sequence)) return false;
        for (int index = 0, size = sequence.length(); index < size; index++) {
            if (Charx.isNotLetter(sequence.charAt(index))) {
                return false;
            }
        }
        return true;
    }

    /**
     * Return `true` if the given sequence of characters is all not letter
     */
    public static boolean isNotLetter(@Nullable CharSequence sequence) {
        return !isLetter(sequence);
    }

    /**
     * If the given character sequence is letter, it return is itself, otherwise it returns the default value.
     */
    public static CharSequence isNotLetterOr(@Nullable CharSequence sequence, @NotNull CharSequence defaultValue) {
        return isLetter(sequence) ? sequence : defaultValue;
    }

    /**
     * If the given character sequence is letter, it return is itself, otherwise it returns the default value.
     */
    public static String isNotLetterOr(@Nullable String string, @NotNull String defaultValue) {
        return isLetter(string) ? string : defaultValue;
    }


    /* ******************************************* isLetterOrDigit *******************************************/


    /**
     * Return `true` if the given sequence of characters is all digit or letter
     */
    public static boolean isLetterOrDigit(@Nullable CharSequence sequence) {
        if (sequence == null || isNotSafe(sequence)) return false;
        for (int index = 0, size = sequence.length(); index < size; index++) {
            if (Charx.isNotLetterOrDigit(sequence.charAt(index))) {
                return false;
            }
        }
        return true;
    }

    /**
     * Return `true` if the given sequence of characters is all not digit or letter
     */
    public static boolean isNotLetterOrDigit(@Nullable CharSequence sequence) {
        return !isLetterOrDigit(sequence);
    }

    /**
     * If the given character sequence is digit or letter, it return is itself, otherwise it returns the default value.
     */
    public static CharSequence isNotLetterOrDigitOr(@Nullable CharSequence sequence, @NotNull CharSequence defaultValue) {
        return isLetterOrDigit(sequence) ? sequence : defaultValue;
    }

    /**
     * If the given character sequence is digit or letter, it return is itself, otherwise it returns the default value.
     */
    public static String isNotLetterOrDigitOr(@Nullable String string, @NotNull String defaultValue) {
        return isLetterOrDigit(string) ? string : defaultValue;
    }


    /* ******************************************* orContains and andContains *******************************************/


    /**
     * Return true if the specified string contains one of the strings in [params]
     */
    public static boolean orContains(@Nullable String string, @Nullable String[] params) {
        if (string == null || params == null || params.length == 0) return false;
        for (String param : params) if (string.contains(param)) return true;
        return false;
    }

    /**
     * Return true if the specified string contains one of the strings in [params]
     */
    public static boolean orContains(@Nullable String string, @Nullable Collection<String> params) {
        if (string == null || params == null || params.size() == 0) return false;
        for (String param : params) if (string.contains(param)) return true;
        return false;
    }

    /**
     * Return true if the specified string contains all the strings in[params]
     */
    public static boolean andContains(@Nullable String string, @Nullable String[] params) {
        if (string == null || params == null || params.length == 0) return false;
        for (String param : params) if (!string.contains(param)) return false;
        return true;
    }

    /**
     * Return true if the specified string contains all the strings in[params]
     */
    public static boolean andContains(@Nullable String string, @Nullable Collection<String> params) {
        if (string == null || params == null || params.size() == 0) return false;
        for (String param : params) if (!string.contains(param)) return false;
        return true;
    }


    /* ******************************************* or and to *******************************************/


    /**
     * Returns the given character sequence if it is not null, otherwise return an empty sequence of characters
     */
    @NotNull
    public static CharSequence orEmpty(@Nullable CharSequence sequence) {
        return sequence != null ? sequence : "";
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
    public static CharSequence orDefault(@Nullable CharSequence sequence, @NotNull CharSequence defaultValue) {
        return sequence != null ? sequence : defaultValue;
    }

    /**
     * Returns the given character sequence if it is not null, otherwise return given defaultValue
     */
    @NotNull
    public static String orDefault(@Nullable String string, @NotNull String defaultValue) {
        return string != null ? string : defaultValue;
    }

    /**
     * If the given char sequence is empty, it return `null` otherwise it return itself
     */
    @Nullable
    public static CharSequence emptyToNull(@Nullable CharSequence sequence) {
        return isEmpty(sequence) ? null : sequence;
    }

    /**
     * If the given string is empty, it return `null` otherwise it return itself
     */
    @Nullable
    public static String emptyToNull(@Nullable String string) {
        return isEmpty(string) ? null : string;
    }

    /**
     * If the given char sequence is blank, it return `null` otherwise it return itself
     */
    @Nullable
    public static CharSequence blankToNull(@Nullable CharSequence sequence) {
        return isBlank(sequence) ? null : sequence;
    }

    /**
     * If the given string is blank, it return `null` otherwise it return itself
     */
    @Nullable
    public static String blankToNull(@Nullable String string) {
        return isBlank(string) ? null : string;
    }


    /* ******************************************* filterBlank *******************************************/


    /**
     * Filter out whitespace characters in a sequence of characters
     */
    @NotNull
    public static CharSequence filterBlank(@Nullable CharSequence sequence) {
        return filter(sequence, new Predicate<Character>() {
            @Override
            public boolean accept(@NotNull Character character) {
                return Charx.isNotBlank(character);
            }
        });
    }

    /**
     * Filter out whitespace characters in a sequence of characters
     */
    @NotNull
    public static String filterBlank(@Nullable String string) {
        return filterBlank((CharSequence) string).toString();
    }


    /* ******************************************* remove *******************************************/


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




    /*
     * *****************************************************************************************************************
     * From kotlin standard library
     * *****************************************************************************************************************
     */


    /* ******************************************* startsWith *******************************************/


    /**
     * Returns `true` if this char sequence starts with the specified character.
     */
    public static boolean startsWith(CharSequence charSequence, char cha, boolean ignoreCase) {
        return charSequence.length() > 0 && Charx.equals(charSequence.charAt(0), cha, ignoreCase);
    }

    /**
     * Returns `true` if this char sequence starts with the specified character.
     */
    public static boolean startsWith(CharSequence charSequence, char cha) {
        return startsWith(charSequence, cha, false);
    }

    /**
     * Returns `true` if this char sequence starts with the specified prefix.
     */
    public static boolean startsWith(CharSequence charSequence, CharSequence prefix, boolean ignoreCase) {
        if (!ignoreCase && charSequence instanceof String && prefix instanceof String) {
            return ((String) charSequence).startsWith((String) prefix);
        } else {
            return regionMatchesImpl(charSequence, 0, prefix, 0, prefix.length(), ignoreCase);
        }
    }

    /**
     * Returns `true` if this char sequence starts with the specified prefix.
     */
    public static boolean startsWith(CharSequence charSequence, CharSequence prefix) {
        return startsWith(charSequence, prefix, false);
    }

    /**
     * Returns `true` if a substring of this char sequence starting at the specified offset [startIndex] starts with the specified prefix.
     */
    public static boolean startsWith(CharSequence charSequence, CharSequence prefix, int startIndex, boolean ignoreCase) {
        if (!ignoreCase && charSequence instanceof String && prefix instanceof String) {
            return ((String) charSequence).startsWith((String) prefix, startIndex);
        } else {
            return regionMatchesImpl(charSequence, startIndex, prefix, 0, prefix.length(), ignoreCase);
        }
    }

    /**
     * Returns `true` if a substring of this char sequence starting at the specified offset [startIndex] starts with the specified prefix.
     */
    public static boolean startsWith(CharSequence charSequence, CharSequence prefix, int startIndex) {
        return startsWith(charSequence, prefix, startIndex, false);
    }

    /**
     * Returns `true` if this string starts with the specified prefix.
     */
    public static boolean startsWith(String string, String prefix, boolean ignoreCase) {
        if (!ignoreCase) {
            return string.startsWith(prefix);
        } else {
            return regionMatches(string, 0, prefix, 0, prefix.length(), ignoreCase);
        }
    }

    /**
     * Returns `true` if this string starts with the specified prefix.
     */
    public static boolean startsWith(String string, String prefix) {
        return startsWith(string, prefix, false);
    }

    /**
     * Returns `true` if a substring of this string starting at the specified offset [startIndex] starts with the specified prefix.
     */
    public static boolean startsWith(String string, String prefix, int startIndex, boolean ignoreCase) {
        if (!ignoreCase) {
            return string.startsWith(prefix, startIndex);
        } else {
            return regionMatches(string, startIndex, prefix, 0, prefix.length(), ignoreCase);
        }
    }

    /**
     * Returns `true` if a substring of this string starting at the specified offset [startIndex] starts with the specified prefix.
     */
    public static boolean startsWith(String string, String prefix, int startIndex) {
        return startsWith(string, prefix, startIndex, false);
    }


    /* ******************************************* endsWith *******************************************/


    /**
     * Returns `true` if this char sequence ends with the specified character.
     */
    public static boolean endsWith(CharSequence charSequence, char cha, boolean ignoreCase) {
        return charSequence.length() > 0 && Charx.equals(charSequence.charAt(charSequence.length() - 1), cha, ignoreCase);
    }

    /**
     * Returns `true` if this char sequence ends with the specified character.
     */
    public static boolean endsWith(CharSequence charSequence, char cha) {
        return endsWith(charSequence, cha, false);
    }

    /**
     * Returns `true` if this char sequence ends with the specified suffix.
     */
    public static boolean endsWith(CharSequence charSequence, CharSequence suffix, boolean ignoreCase) {
        if (!ignoreCase && charSequence instanceof String && suffix instanceof String) {
            return ((String) charSequence).endsWith((String) suffix);
        } else {
            return regionMatchesImpl(charSequence, charSequence.length() - suffix.length(), suffix, 0, suffix.length(), ignoreCase);
        }
    }

    /**
     * Returns `true` if this char sequence ends with the specified suffix.
     */
    public static boolean endsWith(CharSequence charSequence, CharSequence suffix) {
        return endsWith(charSequence, suffix, false);
    }

    /**
     * Returns `true` if this string ends with the specified suffix.
     */
    public static boolean endsWith(String string, String suffix, boolean ignoreCase) {
        if (!ignoreCase) {
            return string.endsWith(suffix);
        } else {
            return regionMatches(string, string.length() - suffix.length(), suffix, 0, suffix.length(), ignoreCase);
        }
    }

    /**
     * Returns `true` if this string ends with the specified suffix.
     */
    public static boolean endsWith(String string, String suffix) {
        return endsWith(string, suffix, false);
    }


    /* ******************************************* startsWith *******************************************/


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


    /* ******************************************* remove *******************************************/

//    /**
//     * Returns a char sequence with content of this char sequence where its part at the given range is removed.
//     *
//     * @param startIndex the index of the first character to be removed.
//     * @param endIndex   the index of the first character after the removed part to keep in the string.
//     *                   <p>
//     *                   [endIndex] is not included in the removed part.
//     */
//    public CharSequence removeRange(CharSequence charSequence, int startIndex, int endIndex) {
//        if (endIndex < startIndex)
//            throw new IndexOutOfBoundsException("End index (" + endIndex + ") is less than start index (" + startIndex + ").");
//        if (endIndex == startIndex) return charSequence.subSequence(0, charSequence.length());
//
//        StringBuilder sb = new StringBuilder(charSequence.length() - (endIndex - startIndex));
//        sb.append(charSequence, 0, startIndex);
//        sb.append(charSequence, endIndex, charSequence.length());
//        return sb;
//    }
//
//    /**
//     * Removes the part of a string at a given range.
//     *
//     * @param startIndex the index of the first character to be removed.
//     * @param endIndex   the index of the first character after the removed part to keep in the string.
//     *                   <p>
//     *                   [endIndex] is not included in the removed part.
//     */
//    public String removeRange(String string, int startIndex, int endIndex) {
//        return removeRange((CharSequence) string, startIndex, endIndex).toString();
//    }
//
//    /**
//     * Returns a char sequence with content of this char sequence where its part at the given [range] is removed.
//     * <p>
//     * The end index of the [range] is included in the removed part.
//     */
//    public CharSequence removeRange(CharSequence charSequence, IntRange range) {
//        return removeRange(charSequence, range.getStart(), range.getEndInclusive() + 1);
//    }
//
//    /**
//     * Removes the part of a string at the given [range].
//     * <p>
//     * The end index of the [range] is included in the removed part.
//     */
//    public String removeRange(String string, IntRange range) {
//        return removeRange((CharSequence) string, range).toString();
//    }
//     // todo 继续翻译
//
//    /**
//     * If this char sequence starts with the given [prefix], returns a new char sequence
//     * with the prefix removed. Otherwise, returns a new char sequence with the same characters.
//     */
//    public CharSequence removePrefix(CharSequence charSequence, CharSequence prefix) {
//        if (startsWith(charSequence, prefix)) {
//            return subSequence(prefix.length, length)
//        }
//        return subSequence(0, length)
//    }
//
//    /**
//     * If this string starts with the given [prefix], returns a copy of this string
//     * with the prefix removed. Otherwise, returns this string.
//     */
//    public fun String.removePrefix(prefix: CharSequence): String {
//        if (startsWith(prefix)) {
//            return substring(prefix.length)
//        }
//        return this
//    }
//
//    /**
//     * If this char sequence ends with the given [suffix], returns a new char sequence
//     * with the suffix removed. Otherwise, returns a new char sequence with the same characters.
//     */
//    public fun CharSequence.removeSuffix(suffix: CharSequence): CharSequence {
//        if (endsWith(suffix)) {
//            return subSequence(0, length - suffix.length)
//        }
//        return subSequence(0, length)
//    }
//
//    /**
//     * If this string ends with the given [suffix], returns a copy of this string
//     * with the suffix removed. Otherwise, returns this string.
//     */
//    public fun String.removeSuffix(suffix: CharSequence): String {
//        if (endsWith(suffix)) {
//            return substring(0, length - suffix.length)
//        }
//        return this
//    }
//
//    /**
//     * When this char sequence starts with the given [prefix] and ends with the given [suffix],
//     * returns a new char sequence having both the given [prefix] and [suffix] removed.
//     * Otherwise returns a new char sequence with the same characters.
//     */
//    public fun CharSequence.removeSurrounding(prefix: CharSequence, suffix: CharSequence): CharSequence {
//        if ((length >= prefix.length + suffix.length) && startsWith(prefix) && endsWith(suffix)) {
//            return subSequence(prefix.length, length - suffix.length)
//        }
//        return subSequence(0, length)
//    }
//
//    /**
//     * Removes from a string both the given [prefix] and [suffix] if and only if
//     * it starts with the [prefix] and ends with the [suffix].
//     * Otherwise returns this string unchanged.
//     */
//    public fun String.removeSurrounding(prefix: CharSequence, suffix: CharSequence): String {
//        if ((length >= prefix.length + suffix.length) && startsWith(prefix) && endsWith(suffix)) {
//            return substring(prefix.length, length - suffix.length)
//        }
//        return this
//    }
//
//    /**
//     * When this char sequence starts with and ends with the given [delimiter],
//     * returns a new char sequence having this [delimiter] removed both from the start and end.
//     * Otherwise returns a new char sequence with the same characters.
//     */
//    public fun CharSequence.removeSurrounding(delimiter: CharSequence): CharSequence = removeSurrounding(delimiter, delimiter)
//
//    /**
//     * Removes the given [delimiter] string from both the start and the end of this string
//     * if and only if it starts with and ends with the [delimiter].
//     * Otherwise returns this string unchanged.
//     */
//    public fun String.removeSurrounding(delimiter: CharSequence): String = removeSurrounding(delimiter, delimiter)


    /* ******************************************* capitalize *******************************************/


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


    /* ******************************************* limit *******************************************/


    /**
     * If the length of the character sequences exceeds the specified length, the character sequences is intercepted
     * and the specified suffix is ​​returned to return the new character sequences, otherwise it return itself.
     */
    @NotNull
    public static CharSequence limit(@NotNull CharSequence sequence, final int length, @Nullable String suffix) {
        Premisex.require(length >= 0, new LazyValue<String>() {
            @NotNull
            @Override
            public String get() {
                return String.format("Desired length %d is less than zero.", length);
            }
        });
        if (sequence.length() <= length) return sequence;

        CharSequence limitString = sequence.subSequence(0, length);
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
    public static CharSequence limit(@NotNull CharSequence sequence, int length) {
        return limit(sequence, length, null);
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


    /* ******************************************* pad *******************************************/


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
    public static CharSequence padStart(@NotNull CharSequence sequence, final int length, char padChar) {
        Premisex.require(length >= 0, new LazyValue<String>() {
            @NotNull
            @Override
            public String get() {
                return String.format("Desired length %d is less than zero.", length);
            }
        });
        if (length <= sequence.length()) return sequence.subSequence(0, sequence.length());

        StringBuilder sb = new StringBuilder(length);
        for (int i = 0, size = length - sequence.length(); i < size; i++) {
            sb.append(padChar);
        }
        sb.append(sequence);
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
    public static CharSequence padStart(@NotNull CharSequence sequence, int length) {
        return padStart(sequence, length, ' ');
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
    public static CharSequence padEnd(@NotNull CharSequence sequence, final int length, char padChar) {
        Premisex.require(length >= 0, new LazyValue<String>() {
            @NotNull
            @Override
            public String get() {
                return String.format("Desired length %d is less than zero.", length);
            }
        });
        if (length <= sequence.length()) return sequence.subSequence(0, sequence.length());

        StringBuilder sb = new StringBuilder(length);
        sb.append(sequence);
        for (int i = 0, size = length - sequence.length(); i < size; i++) {
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
    public static CharSequence padEnd(@NotNull CharSequence sequence, int length) {
        return padEnd(sequence, length, ' ');
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


    /* ******************************************* matches *******************************************/
    // todo 继续翻译


///**
// * Returns `true` if this char sequence matches the given regular expression.
// */
//    @kotlin.internal.InlineOnly
//    public inline infix fun CharSequence.matches(regex: Regex): Boolean = regex.matches(this)

    /**
     * Returns `true` if the specified range in this string is equal to the specified range in another string.
     *
     * @param thisOffset  the start offset in this string of the substring to compare.
     * @param other       the string against a substring of which the comparison is performed.
     * @param otherOffset the start offset in the other string of the substring to compare.
     * @param length      the length of the substring to compare.
     */
    public static boolean regionMatches(@NotNull String self, int thisOffset, @NotNull String other, int otherOffset, int length, boolean ignoreCase) {
        if (!ignoreCase) {
            return self.regionMatches(thisOffset, other, otherOffset, length);
        } else {
            return self.regionMatches(ignoreCase, thisOffset, other, otherOffset, length);
        }
    }

    /**
     * Implementation of [regionMatches] for CharSequences.
     * Invoked when it's already known that arguments are not Strings, so that no additional type checks are performed.
     */
    public static boolean regionMatchesImpl(@NotNull CharSequence self, int thisOffset, @NotNull CharSequence other, int otherOffset, int length, boolean ignoreCase) {
        if ((otherOffset < 0) || (thisOffset < 0) || (thisOffset > self.length() - length)
                || (otherOffset > other.length() - length)) {
            return false;
        }

        for (int index : Rangex.until(0, self.length())) {
            if (!Charx.equals(self.charAt(thisOffset + index), (other.charAt(otherOffset + index)), ignoreCase)) {
                return false;
            }
        }
        return true;
    }


    /* ******************************************* find *******************************************/
    // todo 继续翻译


//    /**
//     * Returns the first character matching the given [predicate], or `null` if no such character was found.
//     */
//    @kotlin.internal.InlineOnly
//    public inline fun CharSequence.find(predicate: (Char) -> Boolean): Char? {
//        return firstOrNull(predicate)
//    }
//
///**
// * Returns the last character matching the given [predicate], or `null` if no such character was found.
// */
//    @kotlin.internal.InlineOnly
//    public inline fun CharSequence.findLast(predicate: (Char) -> Boolean): Char? {
//        return lastOrNull(predicate)
//    }


    @Nullable
    private static Pair<Integer, String> findAnyOf(@NotNull final CharSequence charSequence, @NotNull Collection<String> strings, int startIndex, final boolean ignoreCase, boolean last) {
        if (!ignoreCase && strings.size() == 1) {
            String string = Collectionx.single(strings);
            int index = !last ? indexOf(charSequence, string, startIndex, false) : lastIndexOf(charSequence, string, startIndex, false);
            return index < 0 ? null : Pair.of(index, string);
        }

        IntRange indices = !last ? Rangex.rangeTo(Rangex.coerceAtLeast(startIndex, 0), charSequence.length())
                : Rangex.downTo(Rangex.coerceAtMost(startIndex, charSequence.length() - 1), 0);

        if (charSequence instanceof String) {
            for (final int index : indices) {
                String matchingString = Collectionx.firstOrNull(strings, new Predicate<String>() {
                    @Override
                    public boolean accept(@NotNull String s) {
                        return regionMatches(s, 0, (String) charSequence, index, s.length(), ignoreCase);
                    }
                });
                if (matchingString != null) {
                    return Pair.of(index, matchingString);
                }
            }
        } else {
            for (final int index : indices) {
                String matchingString = Collectionx.firstOrNull(strings, new Predicate<String>() {
                    @Override
                    public boolean accept(@NotNull String s) {
                        return regionMatchesImpl(s, 0, charSequence, index, s.length(), ignoreCase);
                    }
                });
                if (matchingString != null) {
                    return Pair.of(index, matchingString);
                }
            }
        }

        return null;
    }

    /**
     * Finds the first occurrence of any of the specified [strings] in this char sequence,
     * starting from the specified [startIndex] and optionally ignoring the case.
     *
     * @param ignoreCase `true` to ignore character case when matching a string. By default `false`.
     * @return A pair of an index of the first occurrence of matched string from [strings] and the string matched
     * or `null` if none of [strings] are found.
     * To avoid ambiguous results when strings in [strings] have characters in common, this method proceeds from
     * the beginning to the end of this string, and finds at each position the first element in [strings]
     * that matches this string at that position.
     */
    @Nullable
    public static Pair<Integer, String> indAnyOf(@NotNull CharSequence charSequence, @NotNull Collection<String> strings, int startIndex, boolean ignoreCase) {
        return findAnyOf(charSequence, strings, startIndex, ignoreCase, false);
    }

    /**
     * Finds the last occurrence of any of the specified [strings] in this char sequence,
     * starting from the specified [startIndex] and optionally ignoring the case.
     *
     * @param startIndex The index of character to start searching at. The search proceeds backward toward the beginning of the string.
     * @param ignoreCase `true` to ignore character case when matching a string. By default `false`.
     * @return A pair of an index of the last occurrence of matched string from [strings] and the string matched or `null` if none of [strings] are found.
     * To avoid ambiguous results when strings in [strings] have characters in common, this method proceeds from
     * the end toward the beginning of this string, and finds at each position the first element in [strings]
     * that matches this string at that position.
     */
    @Nullable
    public static Pair<Integer, String> findLastAnyOf(@NotNull CharSequence charSequence, @NotNull Collection<String> strings, int startIndex, boolean ignoreCase) {
        return findAnyOf(charSequence, strings, startIndex, ignoreCase, true);
    }


    /* ******************************************* first *******************************************/
    // todo 继续翻译

//    /**
//     * Returns first character.
//     * @throws [NoSuchElementException] if the char sequence is empty.
//     */
//    public fun CharSequence.first(): Char {
//        if (isEmpty())
//            throw NoSuchElementException("Char sequence is empty.")
//        return this[0]
//    }
//
//    /**
//     * Returns the first character matching the given [predicate].
//     * @throws [NoSuchElementException] if no such character is found.
//     */
//    public inline fun CharSequence.first(predicate: (Char) -> Boolean): Char {
//        for (element in this) if (predicate(element)) return element
//        throw NoSuchElementException("Char sequence contains no character matching the predicate.")
//    }
//
//    /**
//     * Returns the first character, or `null` if the char sequence is empty.
//     */
//    public fun CharSequence.firstOrNull(): Char? {
//        return if (isEmpty()) null else this[0]
//    }
//
//    /**
//     * Returns the first character matching the given [predicate], or `null` if character was not found.
//     */
//    public inline fun CharSequence.firstOrNull(predicate: (Char) -> Boolean): Char? {
//        for (element in this) if (predicate(element)) return element
//        return null
//    }


    /* ******************************************* last *******************************************/
    // todo 继续翻译

//    /**
//     * Returns the last character.
//     * @throws [NoSuchElementException] if the char sequence is empty.
//     */
//    public fun CharSequence.last(): Char {
//        if (isEmpty())
//            throw NoSuchElementException("Char sequence is empty.")
//        return this[lastIndex]
//    }
//
//    /**
//     * Returns the last character matching the given [predicate].
//     * @throws [NoSuchElementException] if no such character is found.
//     */
//    public inline fun CharSequence.last(predicate: (Char) -> Boolean): Char {
//        for (index in this.indices.reversed()) {
//            val element = this[index]
//            if (predicate(element)) return element
//        }
//        throw NoSuchElementException("Char sequence contains no character matching the predicate.")
//    }
//
//    /**
//     * Returns the last character, or `null` if the char sequence is empty.
//     */
//    public fun CharSequence.lastOrNull(): Char? {
//        return if (isEmpty()) null else this[length - 1]
//    }
//
//    /**
//     * Returns the last character matching the given [predicate], or `null` if no such character was found.
//     */
//    public inline fun CharSequence.lastOrNull(predicate: (Char) -> Boolean): Char? {
//        for (index in this.indices.reversed()) {
//            val element = this[index]
//            if (predicate(element)) return element
//        }
//        return null
//    }


    /* ******************************************* get *******************************************/
    // todo 继续翻译

///**
// * Returns a character at the given [index] or the result of calling the [defaultValue] function if the [index] is out of bounds of this char sequence.
// */
//    @kotlin.internal.InlineOnly
//    public inline fun CharSequence.getOrElse(index: Int, defaultValue: (Int) -> Char): Char {
//        return if (index >= 0 && index <= lastIndex) get(index) else defaultValue(index)
//    }
//
//    /**
//     * Returns a character at the given [index] or `null` if the [index] is out of bounds of this char sequence.
//     */
//    public fun CharSequence.getOrNull(index: Int): Char? {
//        return if (index >= 0 && index <= lastIndex) get(index) else null
//    }


    /* ******************************************* indexOf *******************************************/


    private static int indexOf(@NotNull CharSequence self, @NotNull CharSequence other, int startIndex, int endIndex, boolean ignoreCase, boolean last) {
        int finalStartIndex;
        int finalEndIndex;
        int step;

        if (!last) {
            finalStartIndex = Rangex.coerceAtLeast(startIndex, 0);
            finalEndIndex = Rangex.coerceAtMost(endIndex, self.length());
            step = 1;
        } else {
            finalStartIndex = Rangex.coerceAtMost(startIndex, self.length() - 1);
            finalEndIndex = Rangex.coerceAtLeast(endIndex, 0);
            step = -1;
        }

        if (self instanceof String && other instanceof String) { // smart cast
            for (int index : Rangex.rangeTo(finalStartIndex, finalEndIndex, step)) {
                if (regionMatches((String) other, 0, (String) self, index, other.length(), ignoreCase)) {
                    return index;
                }
            }
        } else {
            for (int index : Rangex.rangeTo(finalStartIndex, finalEndIndex, step)) {
                if (regionMatchesImpl(other, 0, self, index, other.length(), ignoreCase))
                    return index;
            }
        }
        return -1;
    }


    /**
     * Returns the index within this string of the first occurrence of the specified character, starting from the specified [startIndex].
     *
     * @param ignoreCase `true` to ignore character case when matching a character. By default `false`.
     * @return An index of the first occurrence of [char] or -1 if none is found.
     */
    public static int indexOf(@NotNull CharSequence charSequence, char delimiter, int startIndex, boolean ignoreCase) {
        if (ignoreCase || !(charSequence instanceof String)) {
            return indexOfAny(charSequence, Arrayx.charArrayOf(delimiter), startIndex, ignoreCase);
        } else {
            return ((String) charSequence).indexOf(delimiter, startIndex);
        }
    }

    /**
     * Returns the index within this string of the first occurrence of the specified character, starting from the specified [startIndex].
     *
     * @return An index of the first occurrence of [char] or -1 if none is found.
     */
    public static int indexOf(@NotNull CharSequence charSequence, char delimiter, int startIndex) {
        return indexOf(charSequence, delimiter, startIndex, false);
    }

    /**
     * Returns the index within this char sequence of the first occurrence of the specified [string],
     * starting from the specified [startIndex].
     *
     * @param ignoreCase `true` to ignore character case when matching a string. By default `false`.
     * @return An index of the first occurrence of [string] or `-1` if none is found.
     */
    public static int indexOf(@NotNull CharSequence charSequence, @NotNull String string, int startIndex, boolean ignoreCase) {
        if (ignoreCase || !(charSequence instanceof String)) {
            return indexOf(charSequence, string, startIndex, charSequence.length(), ignoreCase, false);
        } else {
            return ((String) charSequence).indexOf(string, startIndex);
        }
    }

    /**
     * Returns the index within this char sequence of the first occurrence of the specified [string],
     * starting from the specified [startIndex].
     *
     * @return An index of the first occurrence of [string] or `-1` if none is found.
     */
    public static int indexOf(@NotNull CharSequence charSequence, @NotNull String string, int startIndex) {
        return indexOf(charSequence, string, startIndex, false);
    }

    /**
     * Finds the index of the first occurrence of any of the specified [chars] in this char sequence,
     * starting from the specified [startIndex] and optionally ignoring the case.
     *
     * @param ignoreCase `true` to ignore character case when matching a character. By default `false`.
     * @return An index of the first occurrence of matched character from [chars] or -1 if none of [chars] are found.
     */
    public static int indexOfAny(@NotNull CharSequence charSequence, char[] chars, int startIndex, final boolean ignoreCase) {
        if (!ignoreCase && chars.length == 1 && charSequence instanceof String) {
            char charr = Arrayx.single(chars);
            return ((String) charSequence).indexOf(charr, startIndex);
        } else {
            for (int index = Rangex.coerceAtLeast(startIndex, 0), size = charSequence.length(); index < size; index++) {
                final char charAtIndex = charSequence.charAt(index);
                if (Arrayx.any(chars, new Predicate<Character>() {
                    @Override
                    public boolean accept(@NotNull Character character) {
                        return Charx.equals(character, charAtIndex, ignoreCase);
                    }
                })) {
                    return index;
                }
            }
            return -1;
        }
    }

    /**
     * Finds the index of the first occurrence of any of the specified [strings] in this char sequence,
     * starting from the specified [startIndex] and optionally ignoring the case.
     *
     * @param ignoreCase `true` to ignore character case when matching a string. By default `false`.
     * @return An index of the first occurrence of matched string from [strings] or -1 if none of [strings] are found.
     * To avoid ambiguous results when strings in [strings] have characters in common, this method proceeds from
     * the beginning to the end of this string, and finds at each position the first element in [strings]
     * that matches this string at that position.
     */
    public static int indexOfAny(@NotNull CharSequence charSequence, @NotNull Collection<String> strings, int startIndex, boolean ignoreCase) {
        Pair<Integer, String> pair = findAnyOf(charSequence, strings, startIndex, ignoreCase, false);
        return pair != null ? pair.first : -1;
    }
    // todo 继续翻译

//    /**
//     * Returns index of the first character matching the given [predicate], or -1 if the char sequence does not contain such character.
//     */
//    public inline fun CharSequence.indexOfFirst(predicate: (Char) -> Boolean): Int {
//        for (index in indices) {
//            if (predicate(this[index])) {
//                return index
//            }
//        }
//        return -1
//    }
//
//    /**
//     * Returns index of the last character matching the given [predicate], or -1 if the char sequence does not contain such character.
//     */
//    public inline fun CharSequence.indexOfLast(predicate: (Char) -> Boolean): Int {
//        for (index in indices.reversed()) {
//            if (predicate(this[index])) {
//                return index
//            }
//        }
//        return -1
//    }


    /**
     * Returns the index within this char sequence of the last occurrence of the specified character,
     * starting from the specified [startIndex].
     *
     * @param startIndex The index of character to start searching at. The search proceeds backward toward the beginning of the string.
     * @param ignoreCase `true` to ignore character case when matching a character. By default `false`.
     * @return An index of the first occurrence of [char] or -1 if none is found.
     */
    public static int lastIndexOf(@NotNull CharSequence charSequence, char charr, int startIndex, Boolean ignoreCase) {
        if (ignoreCase || !(charSequence instanceof String)) {
            return lastIndexOfAny(charSequence, Arrayx.charArrayOf(charr), startIndex, ignoreCase);
        } else {
            return ((String) charSequence).lastIndexOf(charr, startIndex);
        }
    }

    /**
     * Returns the index within this char sequence of the last occurrence of the specified [string],
     * starting from the specified [startIndex].
     *
     * @param startIndex The index of character to start searching at. The search proceeds backward toward the beginning of the string.
     * @param ignoreCase `true` to ignore character case when matching a string. By default `false`.
     * @return An index of the first occurrence of [string] or -1 if none is found.
     */
    public static int lastIndexOf(@NotNull CharSequence charSequence, @NotNull String string, int startIndex, boolean ignoreCase) {
        if (ignoreCase || !(charSequence instanceof String)) {
            return indexOf(charSequence, string, startIndex, 0, ignoreCase, true);
        } else {
            return ((String) charSequence).lastIndexOf(string, startIndex);
        }
    }


    /**
     * Finds the index of the last occurrence of any of the specified [chars] in this char sequence,
     * starting from the specified [startIndex] and optionally ignoring the case.
     *
     * @param startIndex The index of character to start searching at. The search proceeds backward toward the beginning of the string.
     * @param ignoreCase `true` to ignore character case when matching a character. By default `false`.
     * @return An index of the last occurrence of matched character from [chars] or -1 if none of [chars] are found.
     */
    public static int lastIndexOfAny(@NotNull CharSequence charSequence, char[] chars, int startIndex, final boolean ignoreCase) {
        if (!ignoreCase && chars.length == 1 && charSequence instanceof String) {
            char charr = Arrayx.single(chars);
            return ((String) charSequence).lastIndexOf(charr, startIndex);
        }

        for (int index : Rangex.downTo(Rangex.coerceAtMost(startIndex, charSequence.length() - 1), 0)) {
            final char charAtIndex = charSequence.charAt(index);
            if (Arrayx.any(chars, new Predicate<Character>() {
                @Override
                public boolean accept(@NotNull Character character) {
                    return Charx.equals(character, charAtIndex, ignoreCase);
                }
            })) ;
            return index;
        }

        return -1;
    }

    /**
     * Finds the index of the last occurrence of any of the specified [strings] in this char sequence,
     * starting from the specified [startIndex] and optionally ignoring the case.
     *
     * @param startIndex The index of character to start searching at. The search proceeds backward toward the beginning of the string.
     * @param ignoreCase `true` to ignore character case when matching a string. By default `false`.
     * @return An index of the last occurrence of matched string from [strings] or -1 if none of [strings] are found.
     * To avoid ambiguous results when strings in [strings] have characters in common, this method proceeds from
     * the end toward the beginning of this string, and finds at each position the first element in [strings]
     * that matches this string at that position.
     */
    public static int lastIndexOfAny(@NotNull CharSequence charSequence, @NotNull Collection<String> strings, int startIndex, boolean ignoreCase) {
        Pair<Integer, String> pair = findAnyOf(charSequence, strings, startIndex, ignoreCase, true);
        return pair != null ? pair.first : -1;
    }


    /* ******************************************* substring *******************************************/
    // todo 继续翻译


//    /**
//     * Returns a substring specified by the given [range] of indices.
//     */
//    public fun String.substring(range: IntRange): String = substring(range.start, range.endInclusive + 1)
//
//    /**
//     * Returns a subsequence of this char sequence specified by the given [range] of indices.
//     */
//    public fun CharSequence.subSequence(range: IntRange): CharSequence = subSequence(range.start, range.endInclusive + 1)
//
///**
// * Returns a subsequence of this char sequence.
// *
// * This extension is chosen only for invocation with old-named parameters.
// * Replace parameter names with the same as those of [CharSequence.subSequence].
// */
//    @kotlin.internal.InlineOnly
//    @Suppress("EXTENSION_SHADOWED_BY_MEMBER") // false warning
//    @Deprecated("Use parameters named startIndex and endIndex.", ReplaceWith("subSequence(startIndex = start, endIndex = end)"))
//    public inline fun String.subSequence(start: Int, end: Int): CharSequence = subSequence(start, end)
//
///**
// * Returns a substring of chars from a range of this char sequence starting at the [startIndex] and ending right before the [endIndex].
// *
// * @param startIndex the start index (inclusive).
// * @param endIndex the end index (exclusive). If not specified, the length of the char sequence is used.
// */
//    @kotlin.internal.InlineOnly
//    public inline fun CharSequence.substring(startIndex: Int, endIndex: Int = length): String = subSequence(startIndex, endIndex).toString()
//
//    /**
//     * Returns a substring of chars at indices from the specified [range] of this char sequence.
//     */
//    public fun CharSequence.substring(range: IntRange): String = subSequence(range.start, range.endInclusive + 1).toString()


    /**
     * Returns a substring before the first occurrence of [delimiter].
     * If the string does not contain the delimiter, returns [missingDelimiterValue] which defaults to the original string.
     */
    @NotNull
    public static String substringBefore(@NotNull String string, char delimiter, @Nullable String missingDelimiterValue) {
        if (missingDelimiterValue == null) {
            missingDelimiterValue = string;
        }
        int index = indexOf(string, delimiter, 0, false);
        return index == -1 ? missingDelimiterValue : string.substring(0, index);
    }

    /**
     * Returns a substring before the first occurrence of [delimiter].
     * If the string does not contain the delimiter, returns [missingDelimiterValue] which defaults to the original string.
     */
    @NotNull
    public static String substringBefore(@NotNull String string, @NotNull String delimiter, @Nullable String missingDelimiterValue) {
        if (missingDelimiterValue == null) {
            missingDelimiterValue = string;
        }
        int index = indexOf(string, delimiter, 0, false);
        return index == -1 ? missingDelimiterValue : string.substring(0, index);
    }

    /**
     * Returns a substring after the first occurrence of [delimiter].
     * If the string does not contain the delimiter, returns [missingDelimiterValue] which defaults to the original string.
     */
    @NotNull
    public static String substringAfter(@NotNull String string, char delimiter, @Nullable String missingDelimiterValue) {
        if (missingDelimiterValue == null) {
            missingDelimiterValue = string;
        }
        int index = indexOf(string, delimiter, 0, false);
        return index == -1 ? missingDelimiterValue : string.substring(index + 1, string.length());
    }

    /**
     * Returns a substring after the first occurrence of [delimiter].
     * If the string does not contain the delimiter, returns [missingDelimiterValue] which defaults to the original string.
     */
    @NotNull
    public static String substringAfter(@NotNull String string, @NotNull String delimiter, @Nullable String missingDelimiterValue) {
        if (missingDelimiterValue == null) {
            missingDelimiterValue = string;
        }
        int index = indexOf(string, delimiter, 0, false);
        return index == -1 ? missingDelimiterValue : string.substring(index + delimiter.length(), string.length());
    }

    /**
     * Returns a substring before the last occurrence of [delimiter].
     * If the string does not contain the delimiter, returns [missingDelimiterValue] which defaults to the original string.
     */
    @NotNull
    public static String substringBeforeLast(@NotNull String string, char delimiter, @Nullable String missingDelimiterValue) {
        if (missingDelimiterValue == null) {
            missingDelimiterValue = string;
        }
        int index = lastIndexOf(string, delimiter, string.length() - 1, false);
        return index == -1 ? missingDelimiterValue : string.substring(0, index);
    }

    /**
     * Returns a substring before the last occurrence of [delimiter].
     * If the string does not contain the delimiter, returns [missingDelimiterValue] which defaults to the original string.
     */
    @NotNull
    public static String substringBeforeLast(@NotNull String string, @NotNull String delimiter, @Nullable String missingDelimiterValue) {
        if (missingDelimiterValue == null) {
            missingDelimiterValue = string;
        }
        int index = lastIndexOf(string, delimiter, string.length() - 1, false);
        return index == -1 ? missingDelimiterValue : string.substring(0, index);
    }

    /**
     * Returns a substring after the last occurrence of [delimiter].
     * If the string does not contain the delimiter, returns [missingDelimiterValue] which defaults to the original string.
     */
    @NotNull
    public static String substringAfterLast(@NotNull String string, char delimiter, @Nullable String missingDelimiterValue) {
        if (missingDelimiterValue == null) {
            missingDelimiterValue = string;
        }
        int index = lastIndexOf(string, delimiter, string.length() - 1, false);
        return index == -1 ? missingDelimiterValue : string.substring(index + 1, string.length());
    }

    /**
     * Returns a substring after the last occurrence of [delimiter].
     * If the string does not contain the delimiter, returns [missingDelimiterValue] which defaults to the original string.
     */
    @NotNull
    public static String substringAfterLast(@NotNull String string, @NotNull String delimiter, @Nullable String missingDelimiterValue) {
        if (missingDelimiterValue == null) {
            missingDelimiterValue = string;
        }
        int index = lastIndexOf(string, delimiter, string.length() - 1, false);
        return index == -1 ? missingDelimiterValue : string.substring(index + delimiter.length(), string.length());
    }


    /* ******************************************* toByteArray *******************************************/

    /**
     * Encodes the contents of this string using the specified character set and returns the resulting byte array.
     */
    @NotNull
    public static byte[] toByteArray(@NotNull String string, @NotNull Charset charset) {
        return string.getBytes(charset);
    }

    /**
     * Encodes the contents of this string using UTF-8 set and returns the resulting byte array.
     */
    @NotNull
    public static byte[] toByteArray(@NotNull String string) {
        return string.getBytes(Charx.UTF_8);
    }


    /* ******************************************* reversed *******************************************/


    /**
     * Returns a char sequence with characters in reversed order.
     */
    @NotNull
    public static CharSequence reversed(@Nullable CharSequence sequence) {
        return sequence != null ? new StringBuilder(sequence).reverse() : new StringBuilder(0);
    }

    /**
     * Returns a string with characters in reversed order.
     */
    @NotNull
    public static String reversed(@Nullable String string) {
        return string != null ? new StringBuilder(string).reverse().toString() : "";
    }


    /* ******************************************* filter *******************************************/


    /**
     * Returns a char sequence containing only those characters from the original char sequence that match the given [predicate].
     */
    @NotNull
    public static CharSequence filter(@Nullable CharSequence sequence, @NotNull Predicate<Character> predicate) {
        return filterTo(sequence, new StringBuilder(), predicate);
    }

    /**
     * Returns a string containing only those characters from the original string that match the given [predicate].
     */
    @NotNull
    public static String filter(@Nullable String string, @NotNull Predicate<Character> predicate) {
        return filterTo(string, new StringBuilder(), predicate).toString();
    }

    /**
     * Returns a char sequence containing only those characters from the original char sequence that match the given [predicate].
     *
     * @param predicate function that takes the index of a character and the character itself
     *                  and returns the result of predicate evaluation on the character.
     */
    @NotNull
    public static CharSequence filterIndexed(@Nullable CharSequence sequence, @NotNull IndexedPredicate<Character> predicate) {
        return filterIndexedTo(sequence, new StringBuilder(), predicate);
    }

    /**
     * Returns a string containing only those characters from the original string that match the given [predicate].
     *
     * @param predicate function that takes the index of a character and the character itself
     *                  and returns the result of predicate evaluation on the character.
     */
    @NotNull
    public static String filterIndexed(@Nullable String string, @NotNull IndexedPredicate<Character> predicate) {
        return filterIndexedTo(string, new StringBuilder(), predicate).toString();
    }

    /**
     * Appends all characters matching the given [predicate] to the given [destination].
     *
     * @param predicate function that takes the index of a character and the character itself
     *                  and returns the result of predicate evaluation on the character.
     */
    @NotNull
    public static <C extends Appendable> C filterIndexedTo(@Nullable CharSequence sequence, @NotNull C destination, @NotNull IndexedPredicate<Character> predicate) {
        if (sequence != null) {
            for (int index : Rangex.until(0, sequence.length())) {
                char element = sequence.charAt(index);
                if (predicate.accept(index, element)) {
                    try {
                        destination.append(element);
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                }
            }
        }
        return destination;
    }

    /**
     * Returns a char sequence containing only those characters from the original char sequence that do not match the given [predicate].
     */
    @NotNull
    public static CharSequence filterNot(@Nullable CharSequence sequence, @NotNull Predicate<Character> predicate) {
        return filterNotTo(sequence, new StringBuilder(), predicate);
    }

    /**
     * Returns a string containing only those characters from the original string that do not match the given [predicate].
     */
    @NotNull
    public static String filterNot(@Nullable String string, @NotNull Predicate<Character> predicate) {
        return filterNotTo(string, new StringBuilder(), predicate).toString();
    }

    /**
     * Appends all characters not matching the given [predicate] to the given [destination].
     */
    @NotNull
    public static <C extends Appendable> C filterNotTo(@Nullable CharSequence sequence, @NotNull C destination, @NotNull Predicate<Character> predicate) {
        if (sequence != null) {
            for (int index : Rangex.until(0, sequence.length())) {
                char element = sequence.charAt(index);
                if (!predicate.accept(element)) {
                    try {
                        destination.append(element);
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                }
            }
        }
        return destination;
    }

    /**
     * Appends all characters matching the given [predicate] to the given [destination].
     */
    @NotNull
    public static <C extends Appendable> C filterTo(@Nullable CharSequence sequence, @NotNull C destination, @NotNull Predicate<Character> predicate) {
        if (sequence != null) {
            for (int index : Rangex.until(0, sequence.length())) {
                char element = sequence.charAt(index);
                if (predicate.accept(element)) {
                    try {
                        destination.append(element);
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                }
            }
        }
        return destination;
    }


    /* ******************************************* trim *******************************************/

    // todo 继续翻译


//    /**
//     * Returns a sub sequence of this char sequence having leading and trailing characters matching the [predicate] removed.
//     */
//    public inline fun CharSequence.trim(predicate: (Char) -> Boolean): CharSequence {
//        var startIndex = 0
//        var endIndex = length - 1
//        var startFound = false
//
//        while (startIndex <= endIndex) {
//            val index = if (!startFound) startIndex else endIndex
//            val match = predicate(this[index])
//
//            if (!startFound) {
//                if (!match)
//                    startFound = true
//                else
//                    startIndex += 1
//            } else {
//                if (!match)
//                    break
//                else
//                    endIndex -= 1
//            }
//        }
//
//        return subSequence(startIndex, endIndex + 1)
//    }
//
//    /**
//     * Returns a string having leading and trailing characters matching the [predicate] removed.
//     */
//    public inline fun String.trim(predicate: (Char) -> Boolean): String =
//            (this as CharSequence).trim(predicate).toString()
//
//    /**
//     * Returns a sub sequence of this char sequence having leading characters matching the [predicate] removed.
//     */
//    public inline fun CharSequence.trimStart(predicate: (Char) -> Boolean): CharSequence {
//        for (index in this.indices)
//            if (!predicate(this[index]))
//                return subSequence(index, length)
//
//        return ""
//    }
//
//    /**
//     * Returns a string having leading characters matching the [predicate] removed.
//     */
//    public inline fun String.trimStart(predicate: (Char) -> Boolean): String =
//            (this as CharSequence).trimStart(predicate).toString()
//
//    /**
//     * Returns a sub sequence of this char sequence having trailing characters matching the [predicate] removed.
//     */
//    public inline fun CharSequence.trimEnd(predicate: (Char) -> Boolean): CharSequence {
//        for (index in this.indices.reversed())
//            if (!predicate(this[index]))
//                return subSequence(0, index + 1)
//
//        return ""
//    }
//
//    /**
//     * Returns a string having trailing characters matching the [predicate] removed.
//     */
//    public inline fun String.trimEnd(predicate: (Char) -> Boolean): String =
//            (this as CharSequence).trimEnd(predicate).toString()
//
//    /**
//     * Returns a sub sequence of this char sequence having leading and trailing characters from the [chars] array removed.
//     */
//    public fun CharSequence.trim(vararg chars: Char): CharSequence = trim { it in chars }
//
//    /**
//     * Returns a string having leading and trailing characters from the [chars] array removed.
//     */
//    public fun String.trim(vararg chars: Char): String = trim { it in chars }
//
//    /**
//     * Returns a sub sequence of this char sequence having leading characters from the [chars] array removed.
//     */
//    public fun CharSequence.trimStart(vararg chars: Char): CharSequence = trimStart { it in chars }
//
//    /**
//     * Returns a string having leading characters from the [chars] array removed.
//     */
//    public fun String.trimStart(vararg chars: Char): String = trimStart { it in chars }
//
//    /**
//     * Returns a sub sequence of this char sequence having trailing characters from the [chars] array removed.
//     */
//    public fun CharSequence.trimEnd(vararg chars: Char): CharSequence = trimEnd { it in chars }
//
//    /**
//     * Returns a string having trailing characters from the [chars] array removed.
//     */
//    public fun String.trimEnd(vararg chars: Char): String = trimEnd { it in chars }
//
//    /**
//     * Returns a sub sequence of this char sequence having leading and trailing whitespace removed.
//     */
//    public fun CharSequence.trim(): CharSequence = trim(Char::isWhitespace)
//
///**
// * Returns a string having leading and trailing whitespace removed.
// */
//    @kotlin.internal.InlineOnly
//    public inline fun String.trim(): String = (this as CharSequence).trim().toString()
//
//    /**
//     * Returns a sub sequence of this char sequence having leading whitespace removed.
//     */
//    public fun CharSequence.trimStart(): CharSequence = trimStart(Char::isWhitespace)
//
///**
// * Returns a string having leading whitespace removed.
// */
//    @kotlin.internal.InlineOnly
//    public inline fun String.trimStart(): String = (this as CharSequence).trimStart().toString()
//
//    /**
//     * Returns a sub sequence of this char sequence having trailing whitespace removed.
//     */
//    public fun CharSequence.trimEnd(): CharSequence = trimEnd(Char::isWhitespace)
//
///**
// * Returns a string having trailing whitespace removed.
// */
//    @kotlin.internal.InlineOnly
//    public inline fun String.trimEnd(): String = (this as CharSequence).trimEnd().toString()
//
//
//    /* ******************************************* iterator *******************************************/
//
//
//    /**
//     * Iterator for characters of the given char sequence.
//     */
//    public operator fun CharSequence.iterator(): CharIterator = object : CharIterator() {
//        private var index = 0
//
//        public override fun nextChar(): Char = get(index++)
//
//        public override fun hasNext(): Boolean = index < length
//    }
//
//    /**
//     * Returns the range of valid character indices for this char sequence.
//     */
//    public val CharSequence.indices: IntRange
//    get() = 0..length - 1
//
//    /**
//     * Returns the index of the last character in the char sequence or -1 if it is empty.
//     */
//    public val CharSequence.lastIndex: Int
//    get() = this.length - 1
//
//    /**
//     * Returns `true` if this CharSequence has Unicode surrogate pair at the specified [index].
//     */
//    public fun CharSequence.hasSurrogatePairAt(index: Int): Boolean {
//        return index in 0..length - 2
//                && this[index].isHighSurrogate()
//                && this[index + 1].isLowSurrogate()
//    }
//
//
//    /* ******************************************* replace *******************************************/
//
//
//    /**
//     * Returns a char sequence with content of this char sequence where its part at the given range
//     * is replaced with the [replacement] char sequence.
//     * @param startIndex the index of the first character to be replaced.
//     * @param endIndex the index of the first character after the replacement to keep in the string.
//     */
//    public fun CharSequence.replaceRange(startIndex: Int, endIndex: Int, replacement: CharSequence): CharSequence {
//        if (endIndex < startIndex)
//            throw IndexOutOfBoundsException("End index ($endIndex) is less than start index ($startIndex).")
//        val sb = StringBuilder()
//        sb.append(this, 0, startIndex)
//        sb.append(replacement)
//        sb.append(this, endIndex, length)
//        return sb
//    }
//
///**
// * Replaces the part of the string at the given range with the [replacement] char sequence.
// * @param startIndex the index of the first character to be replaced.
// * @param endIndex the index of the first character after the replacement to keep in the string.
// */
//    @kotlin.internal.InlineOnly
//    public inline fun String.replaceRange(startIndex: Int, endIndex: Int, replacement: CharSequence): String =
//            (this as CharSequence).replaceRange(startIndex, endIndex, replacement).toString()
//
//    /**
//     * Returns a char sequence with content of this char sequence where its part at the given [range]
//     * is replaced with the [replacement] char sequence.
//     *
//     * The end index of the [range] is included in the part to be replaced.
//     */
//    public fun CharSequence.replaceRange(range: IntRange, replacement: CharSequence): CharSequence =
//    replaceRange(range.start, range.endInclusive + 1, replacement)
//
///**
// * Replace the part of string at the given [range] with the [replacement] string.
// *
// * The end index of the [range] is included in the part to be replaced.
// */
//    @kotlin.internal.InlineOnly
//    public inline fun String.replaceRange(range: IntRange, replacement: CharSequence): String =
//            (this as CharSequence).replaceRange(range, replacement).toString()/**
//     * Replace part of string before the first occurrence of given delimiter with the [replacement] string.
//     * If the string does not contain the delimiter, returns [missingDelimiterValue] which defaults to the original string.
//     */
//    public fun String.replaceBefore(delimiter: Char, replacement: String, missingDelimiterValue: String = this): String {
//        val index = indexOf(delimiter)
//        return if (index == -1) missingDelimiterValue else replaceRange(0, index, replacement)
//    }
//
//    /**
//     * Replace part of string before the first occurrence of given delimiter with the [replacement] string.
//     * If the string does not contain the delimiter, returns [missingDelimiterValue] which defaults to the original string.
//     */
//    public fun String.replaceBefore(delimiter: String, replacement: String, missingDelimiterValue: String = this): String {
//        val index = indexOf(delimiter)
//        return if (index == -1) missingDelimiterValue else replaceRange(0, index, replacement)
//    }
//
//    /**
//     * Replace part of string after the first occurrence of given delimiter with the [replacement] string.
//     * If the string does not contain the delimiter, returns [missingDelimiterValue] which defaults to the original string.
//     */
//    public fun String.replaceAfter(delimiter: Char, replacement: String, missingDelimiterValue: String = this): String {
//        val index = indexOf(delimiter)
//        return if (index == -1) missingDelimiterValue else replaceRange(index + 1, length, replacement)
//    }
//
//    /**
//     * Replace part of string after the first occurrence of given delimiter with the [replacement] string.
//     * If the string does not contain the delimiter, returns [missingDelimiterValue] which defaults to the original string.
//     */
//    public fun String.replaceAfter(delimiter: String, replacement: String, missingDelimiterValue: String = this): String {
//        val index = indexOf(delimiter)
//        return if (index == -1) missingDelimiterValue else replaceRange(index + delimiter.length, length, replacement)
//    }
//
//    /**
//     * Replace part of string after the last occurrence of given delimiter with the [replacement] string.
//     * If the string does not contain the delimiter, returns [missingDelimiterValue] which defaults to the original string.
//     */
//    public fun String.replaceAfterLast(delimiter: String, replacement: String, missingDelimiterValue: String = this): String {
//        val index = lastIndexOf(delimiter)
//        return if (index == -1) missingDelimiterValue else replaceRange(index + delimiter.length, length, replacement)
//    }
//
//    /**
//     * Replace part of string after the last occurrence of given delimiter with the [replacement] string.
//     * If the string does not contain the delimiter, returns [missingDelimiterValue] which defaults to the original string.
//     */
//    public fun String.replaceAfterLast(delimiter: Char, replacement: String, missingDelimiterValue: String = this): String {
//        val index = lastIndexOf(delimiter)
//        return if (index == -1) missingDelimiterValue else replaceRange(index + 1, length, replacement)
//    }
//
//    /**
//     * Replace part of string before the last occurrence of given delimiter with the [replacement] string.
//     * If the string does not contain the delimiter, returns [missingDelimiterValue] which defaults to the original string.
//     */
//    public fun String.replaceBeforeLast(delimiter: Char, replacement: String, missingDelimiterValue: String = this): String {
//        val index = lastIndexOf(delimiter)
//        return if (index == -1) missingDelimiterValue else replaceRange(0, index, replacement)
//    }
//
//    /**
//     * Replace part of string before the last occurrence of given delimiter with the [replacement] string.
//     * If the string does not contain the delimiter, returns [missingDelimiterValue] which defaults to the original string.
//     */
//    public fun String.replaceBeforeLast(delimiter: String, replacement: String, missingDelimiterValue: String = this): String {
//        val index = lastIndexOf(delimiter)
//        return if (index == -1) missingDelimiterValue else replaceRange(0, index, replacement)
//    }
//
//
//// public fun String.replace(oldChar: Char, newChar: Char, ignoreCase: Boolean): String // JVM- and JS-specific
//// public fun String.replace(oldValue: String, newValue: String, ignoreCase: Boolean): String // JVM- and JS-specific
//
///**
// * Returns a new string obtained by replacing each substring of this char sequence that matches the given regular expression
// * with the given [replacement].
// *
// * The [replacement] can consist of any combination of literal text and $-substitutions. To treat the replacement string
// * literally escape it with the [kotlin.text.Regex.Companion.escapeReplacement] method.
// */
//    @kotlin.internal.InlineOnly
//    public inline fun CharSequence.replace(regex: Regex, replacement: String): String = regex.replace(this, replacement)
//
///**
// * Returns a new string obtained by replacing each substring of this char sequence that matches the given regular expression
// * with the result of the given function [transform] that takes [MatchResult] and returns a string to be used as a
// * replacement for that match.
// */
//    @kotlin.internal.InlineOnly
//    public inline fun CharSequence.replace(regex: Regex, noinline transform: (MatchResult) -> CharSequence): String =
//            regex.replace(this, transform)
//
///**
// * Replaces the first occurrence of the given regular expression [regex] in this char sequence with specified [replacement] expression.
// *
// * @param replacement A replacement expression that can include substitutions. See [Regex.replaceFirst] for details.
// */
//    @kotlin.internal.InlineOnly
//    public inline fun CharSequence.replaceFirst(regex: Regex, replacement: String): String = regex.replaceFirst(this, replacement)// common prefix and suffix
//
//
//    /* ******************************************* commonWith *******************************************/
//
//
//    /**
//     * Returns the longest string `prefix` such that this char sequence and [other] char sequence both start with this prefix,
//     * taking care not to split surrogate pairs.
//     * If this and [other] have no common prefix, returns the empty string.
//
//     * @param ignoreCase `true` to ignore character case when matching a character. By default `false`.
//     */
//    public fun CharSequence.commonPrefixWith(other: CharSequence, ignoreCase: Boolean = false): String {
//        val shortestLength = minOf(this.length, other.length)
//
//        var i = 0
//        while (i < shortestLength && this[i].equals(other[i], ignoreCase = ignoreCase)) {
//            i++
//        }
//        if (this.hasSurrogatePairAt(i - 1) || other.hasSurrogatePairAt(i - 1)) {
//            i--
//        }
//        return subSequence(0, i).toString()
//    }
//
//    /**
//     * Returns the longest string `suffix` such that this char sequence and [other] char sequence both end with this suffix,
//     * taking care not to split surrogate pairs.
//     * If this and [other] have no common suffix, returns the empty string.
//
//     * @param ignoreCase `true` to ignore character case when matching a character. By default `false`.
//     */
//    public fun CharSequence.commonSuffixWith(other: CharSequence, ignoreCase: Boolean = false): String {
//        val thisLength = this.length
//        val otherLength = other.length
//        val shortestLength = minOf(thisLength, otherLength)
//
//        var i = 0
//        while (i < shortestLength && this[thisLength - i - 1].equals(other[otherLength - i - 1], ignoreCase = ignoreCase)) {
//            i++
//        }
//        if (this.hasSurrogatePairAt(thisLength - i - 1) || other.hasSurrogatePairAt(otherLength - i - 1)) {
//            i--
//        }
//        return subSequence(thisLength - i, thisLength).toString()
//    }
//
//
//    /* ******************************************* contains *******************************************/
//
//
///**
// * Returns `true` if this char sequence contains the specified [other] sequence of characters as a substring.
// *
// * @param ignoreCase `true` to ignore character case when comparing strings. By default `false`.
// */
//    @Suppress("INAPPLICABLE_OPERATOR_MODIFIER")
//    public operator fun CharSequence.contains(other: CharSequence, ignoreCase: Boolean = false): Boolean =
//            if (other is String)
//    indexOf(other, ignoreCase = ignoreCase) >= 0
//            else
//    indexOf(other, 0, length, ignoreCase) >= 0
//
//
//
///**
// * Returns `true` if this char sequence contains the specified character [char].
// *
// * @param ignoreCase `true` to ignore character case when comparing characters. By default `false`.
// */
//    @Suppress("INAPPLICABLE_OPERATOR_MODIFIER")
//    public operator fun CharSequence.contains(char: Char, ignoreCase: Boolean = false): Boolean =
//    indexOf(char, ignoreCase = ignoreCase) >= 0
//
///**
// * Returns `true` if this char sequence contains at least one match of the specified regular expression [regex].
// */
//    @kotlin.internal.InlineOnly
//    public inline operator fun CharSequence.contains(regex: Regex): Boolean = regex.containsMatchIn(this)/**
//     * Returns a sequence of index ranges of substrings in this char sequence around occurrences of the specified [delimiters].
//     *
//     * @param delimiters One or more characters to be used as delimiters.
//     * @param startIndex The index to start searching delimiters from.
//     *  No range having its start value less than [startIndex] is returned.
//     *  [startIndex] is coerced to be non-negative and not greater than length of this string.
//     * @param ignoreCase `true` to ignore character case when matching a delimiter. By default `false`.
//     * @param limit The maximum number of substrings to return. Zero by default means no limit is set.
//     */
//    private fun CharSequence.rangesDelimitedBy(delimiters: CharArray, startIndex: Int = 0, ignoreCase: Boolean = false, limit: Int = 0): Sequence<IntRange> {
//        require(limit >= 0, { "Limit must be non-negative, but was $limit." })
//
//        return DelimitedRangesSequence(this, startIndex, limit, { startIndex ->
//                indexOfAny(delimiters, startIndex, ignoreCase = ignoreCase).let { if (it < 0) null else it to 1 }
//    })
//    }
//
//
//    /**
//     * Returns a sequence of index ranges of substrings in this char sequence around occurrences of the specified [delimiters].
//     *
//     * @param delimiters One or more strings to be used as delimiters.
//     * @param startIndex The index to start searching delimiters from.
//     *  No range having its start value less than [startIndex] is returned.
//     *  [startIndex] is coerced to be non-negative and not greater than length of this string.
//     * @param ignoreCase `true` to ignore character case when matching a delimiter. By default `false`.
//     * @param limit The maximum number of substrings to return. Zero by default means no limit is set.
//     *
//     * To avoid ambiguous results when strings in [delimiters] have characters in common, this method proceeds from
//     * the beginning to the end of this string, and finds at each position the first element in [delimiters]
//     * that matches this string at that position.
//     */
//    private fun CharSequence.rangesDelimitedBy(delimiters: Array<out String>, startIndex: Int = 0, ignoreCase: Boolean = false, limit: Int = 0): Sequence<IntRange> {
//        require(limit >= 0, { "Limit must be non-negative, but was $limit." } )
//        val delimitersList = delimiters.asList()
//
//        return DelimitedRangesSequence(this, startIndex, limit, { startIndex -> findAnyOf(delimitersList, startIndex, ignoreCase = ignoreCase, last = false)?.let { it.first to it.second.length } })
//
//    }
//
//
//// split
//
//    /**
//     * Splits this char sequence to a sequence of strings around occurrences of the specified [delimiters].
//     *
//     * @param delimiters One or more strings to be used as delimiters.
//     * @param ignoreCase `true` to ignore character case when matching a delimiter. By default `false`.
//     * @param limit The maximum number of substrings to return. Zero by default means no limit is set.
//     *
//     * To avoid ambiguous results when strings in [delimiters] have characters in common, this method proceeds from
//     * the beginning to the end of this string, and finds at each position the first element in [delimiters]
//     * that matches this string at that position.
//     */
//    public fun CharSequence.splitToSequence(vararg delimiters: String, ignoreCase: Boolean = false, limit: Int = 0): Sequence<String> =
//    rangesDelimitedBy(delimiters, ignoreCase = ignoreCase, limit = limit).map { substring(it) }
//
//    /**
//     * Splits this char sequence to a list of strings around occurrences of the specified [delimiters].
//     *
//     * @param delimiters One or more strings to be used as delimiters.
//     * @param ignoreCase `true` to ignore character case when matching a delimiter. By default `false`.
//     * @param limit The maximum number of substrings to return. Zero by default means no limit is set.
//     *
//     * To avoid ambiguous results when strings in [delimiters] have characters in common, this method proceeds from
//     * the beginning to the end of this string, and matches at each position the first element in [delimiters]
//     * that is equal to a delimiter in this instance at that position.
//     */
//    public fun CharSequence.split(vararg delimiters: String, ignoreCase: Boolean = false, limit: Int = 0): List<String> {
//        if (delimiters.size == 1) {
//            val delimiter = delimiters[0]
//            if (!delimiter.isEmpty()) {
//                return split(delimiter, ignoreCase, limit)
//            }
//        }
//
//        return rangesDelimitedBy(delimiters, ignoreCase = ignoreCase, limit = limit).asIterable().map { substring(it) }
//    }
//
//    /**
//     * Splits this char sequence to a sequence of strings around occurrences of the specified [delimiters].
//     *
//     * @param delimiters One or more characters to be used as delimiters.
//     * @param ignoreCase `true` to ignore character case when matching a delimiter. By default `false`.
//     * @param limit The maximum number of substrings to return.
//     */
//    public fun CharSequence.splitToSequence(vararg delimiters: Char, ignoreCase: Boolean = false, limit: Int = 0): Sequence<String> =
//    rangesDelimitedBy(delimiters, ignoreCase = ignoreCase, limit = limit).map { substring(it) }
//
//    /**
//     * Splits this char sequence to a list of strings around occurrences of the specified [delimiters].
//     *
//     * @param delimiters One or more characters to be used as delimiters.
//     * @param ignoreCase `true` to ignore character case when matching a delimiter. By default `false`.
//     * @param limit The maximum number of substrings to return.
//     */
//    public fun CharSequence.split(vararg delimiters: Char, ignoreCase: Boolean = false, limit: Int = 0): List<String> {
//        if (delimiters.size == 1) {
//            return split(delimiters[0].toString(), ignoreCase, limit)
//        }
//
//        return rangesDelimitedBy(delimiters, ignoreCase = ignoreCase, limit = limit).asIterable().map { substring(it) }
//    }
//
//    /**
//     * Splits this char sequence to a list of strings around occurrences of the specified [delimiter].
//     * This is specialized version of split which receives single non-empty delimiter and offers better performance
//     *
//     * @param delimiter String used as delimiter
//     * @param ignoreCase `true` to ignore character case when matching a delimiter. By default `false`.
//     * @param limit The maximum number of substrings to return.
//     */
//    private fun CharSequence.split(delimiter: String, ignoreCase: Boolean, limit: Int): List<String> {
//        require(limit >= 0, { "Limit must be non-negative, but was $limit." })
//
//        var currentOffset = 0
//        var nextIndex = indexOf(delimiter, currentOffset, ignoreCase)
//        if (nextIndex == -1 || limit == 1) {
//            return listOf(this.toString())
//        }
//
//        val isLimited = limit > 0
//        val result = ArrayList<String>(if (isLimited) limit.coerceAtMost(10) else 10)
//        do {
//            result.add(substring(currentOffset, nextIndex))
//            currentOffset = nextIndex + delimiter.length
//            // Do not search for next occurrence if we're reaching limit
//            if (isLimited && result.size == limit - 1) break
//            nextIndex = indexOf(delimiter, currentOffset, ignoreCase)
//        } while (nextIndex != -1)
//
//        result.add(substring(currentOffset, length))
//        return result
//    }
//
///**
// * Splits this char sequence around matches of the given regular expression.
// *
// * @param limit Non-negative value specifying the maximum number of substrings to return.
// * Zero by default means no limit is set.
// */
//    @kotlin.internal.InlineOnly
//    public inline fun CharSequence.split(regex: Regex, limit: Int = 0): List<String> = regex.split(this, limit)
//
//    /**
//     * Splits this char sequence to a sequence of lines delimited by any of the following character sequences: CRLF, LF or CR.
//     */
//    public fun CharSequence.lineSequence(): Sequence<String> = splitToSequence("\r\n", "\n", "\r")
//
//    /**
//     * * Splits this char sequence to a list of lines delimited by any of the following character sequences: CRLF, LF or CR.
//     */
//    public fun CharSequence.lines(): List<String> = lineSequence().toList()
//
//    /**
//     * Returns a character at the given [index] or throws an [IndexOutOfBoundsException] if the [index] is out of bounds of this char sequence.
//     */
//    @kotlin.internal.InlineOnly
//    public inline fun CharSequence.elementAt(index: Int): Char {
//        return get(index)
//    }
//
///**
// * Returns a character at the given [index] or the result of calling the [defaultValue] function if the [index] is out of bounds of this char sequence.
// */
//    @kotlin.internal.InlineOnly
//    public inline fun CharSequence.elementAtOrElse(index: Int, defaultValue: (Int) -> Char): Char {
//        return if (index >= 0 && index <= lastIndex) get(index) else defaultValue(index)
//    }
//
///**
// * Returns a character at the given [index] or `null` if the [index] is out of bounds of this char sequence.
// */
//    @kotlin.internal.InlineOnly
//    public inline fun CharSequence.elementAtOrNull(index: Int): Char? {
//        return this.getOrNull(index)
//    }
//
//
//    /* ******************************************* single *******************************************/
//
//    /**
//     * Returns the single character, or throws an exception if the char sequence is empty or has more than one character.
//     */
//    public fun CharSequence.single(): Char {
//        return when (length) {
//            0 -> throw NoSuchElementException("Char sequence is empty.")
//            1 -> this[0]
//        else -> throw IllegalArgumentException("Char sequence has more than one element.")
//        }
//    }
//
//    /**
//     * Returns the single character matching the given [predicate], or throws exception if there is no or more than one matching character.
//     */
//    public inline fun CharSequence.single(predicate: (Char) -> Boolean): Char {
//        var single: Char? = null
//        var found = false
//        for (element in this) {
//            if (predicate(element)) {
//                if (found) throw IllegalArgumentException("Char sequence contains more than one matching element.")
//                single = element
//                found = true
//            }
//        }
//        if (!found) throw NoSuchElementException("Char sequence contains no character matching the predicate.")
//        @Suppress("UNCHECKED_CAST")
//        return single as Char
//    }
//
//    /**
//     * Returns single character, or `null` if the char sequence is empty or has more than one character.
//     */
//    public fun CharSequence.singleOrNull(): Char? {
//        return if (length == 1) this[0] else null
//    }
//
//    /**
//     * Returns the single character matching the given [predicate], or `null` if character was not found or more than one character was found.
//     */
//    public inline fun CharSequence.singleOrNull(predicate: (Char) -> Boolean): Char? {
//        var single: Char? = null
//        var found = false
//        for (element in this) {
//            if (predicate(element)) {
//                if (found) return null
//                single = element
//                found = true
//            }
//        }
//        if (!found) return null
//        return single
//    }
//
//
//    /* ******************************************* drop *******************************************/
//
//    /**
//     * Returns a subsequence of this char sequence with the first [n] characters removed.
//     *
//     * @sample samples.collections.Collections.Transformations.drop
//     */
//    public fun CharSequence.drop(n: Int): CharSequence {
//        require(n >= 0) { "Requested character count $n is less than zero." }
//        return subSequence(n.coerceAtMost(length), length)
//    }
//
//    /**
//     * Returns a string with the first [n] characters removed.
//     *
//     * @sample samples.collections.Collections.Transformations.drop
//     */
//    public fun String.drop(n: Int): String {
//        require(n >= 0) { "Requested character count $n is less than zero." }
//        return substring(n.coerceAtMost(length))
//    }
//
//    /**
//     * Returns a subsequence of this char sequence with the last [n] characters removed.
//     *
//     * @sample samples.collections.Collections.Transformations.drop
//     */
//    public fun CharSequence.dropLast(n: Int): CharSequence {
//        require(n >= 0) { "Requested character count $n is less than zero." }
//        return take((length - n).coerceAtLeast(0))
//    }
//
//    /**
//     * Returns a string with the last [n] characters removed.
//     *
//     * @sample samples.collections.Collections.Transformations.drop
//     */
//    public fun String.dropLast(n: Int): String {
//        require(n >= 0) { "Requested character count $n is less than zero." }
//        return take((length - n).coerceAtLeast(0))
//    }
//
//    /**
//     * Returns a subsequence of this char sequence containing all characters except last characters that satisfy the given [predicate].
//     *
//     * @sample samples.collections.Collections.Transformations.drop
//     */
//    public inline fun CharSequence.dropLastWhile(predicate: (Char) -> Boolean): CharSequence {
//        for (index in lastIndex downTo 0)
//        if (!predicate(this[index]))
//            return subSequence(0, index + 1)
//        return ""
//    }
//
//    /**
//     * Returns a string containing all characters except last characters that satisfy the given [predicate].
//     *
//     * @sample samples.collections.Collections.Transformations.drop
//     */
//    public inline fun String.dropLastWhile(predicate: (Char) -> Boolean): String {
//        for (index in lastIndex downTo 0)
//        if (!predicate(this[index]))
//            return substring(0, index + 1)
//        return ""
//    }
//
//    /**
//     * Returns a subsequence of this char sequence containing all characters except first characters that satisfy the given [predicate].
//     *
//     * @sample samples.collections.Collections.Transformations.drop
//     */
//    public inline fun CharSequence.dropWhile(predicate: (Char) -> Boolean): CharSequence {
//        for (index in this.indices)
//            if (!predicate(this[index]))
//                return subSequence(index, length)
//        return ""
//    }
//
//    /**
//     * Returns a string containing all characters except first characters that satisfy the given [predicate].
//     *
//     * @sample samples.collections.Collections.Transformations.drop
//     */
//    public inline fun String.dropWhile(predicate: (Char) -> Boolean): String {
//        for (index in this.indices)
//            if (!predicate(this[index]))
//                return substring(index)
//        return ""
//    }
//
//
//    /* ******************************************* slice *******************************************/
//
//    /**
//     * Returns a char sequence containing characters of the original char sequence at the specified range of [indices].
//     */
//    public fun CharSequence.slice(indices: IntRange): CharSequence {
//        if (indices.isEmpty()) return ""
//        return subSequence(indices)
//    }
//
//    /**
//     * Returns a string containing characters of the original string at the specified range of [indices].
//     */
//    public fun String.slice(indices: IntRange): String {
//        if (indices.isEmpty()) return ""
//        return substring(indices)
//    }
//
//    /**
//     * Returns a char sequence containing characters of the original char sequence at specified [indices].
//     */
//    public fun CharSequence.slice(indices: Iterable<Int>): CharSequence {
//        val size = indices.collectionSizeOrDefault(10)
//        if (size == 0) return ""
//        val result = StringBuilder(size)
//        for (i in indices) {
//            result.append(get(i))
//        }
//        return result
//    }
//
///**
// * Returns a string containing characters of the original string at specified [indices].
// */
//    @kotlin.internal.InlineOnly
//    public inline fun String.slice(indices: Iterable<Int>): String {
//        return (this as CharSequence).slice(indices).toString()
//    }
//
//
//    /* ******************************************* take *******************************************/
//
//    /**
//     * Returns a subsequence of this char sequence containing the first [n] characters from this char sequence, or the entire char sequence if this char sequence is shorter.
//     *
//     * @sample samples.collections.Collections.Transformations.take
//     */
//    public fun CharSequence.take(n: Int): CharSequence {
//        require(n >= 0) { "Requested character count $n is less than zero." }
//        return subSequence(0, n.coerceAtMost(length))
//    }
//
//    /**
//     * Returns a string containing the first [n] characters from this string, or the entire string if this string is shorter.
//     *
//     * @sample samples.collections.Collections.Transformations.take
//     */
//    public fun String.take(n: Int): String {
//        require(n >= 0) { "Requested character count $n is less than zero." }
//        return substring(0, n.coerceAtMost(length))
//    }
//
//    /**
//     * Returns a subsequence of this char sequence containing the last [n] characters from this char sequence, or the entire char sequence if this char sequence is shorter.
//     *
//     * @sample samples.collections.Collections.Transformations.take
//     */
//    public fun CharSequence.takeLast(n: Int): CharSequence {
//        require(n >= 0) { "Requested character count $n is less than zero." }
//        val length = length
//        return subSequence(length - n.coerceAtMost(length), length)
//    }
//
//    /**
//     * Returns a string containing the last [n] characters from this string, or the entire string if this string is shorter.
//     *
//     * @sample samples.collections.Collections.Transformations.take
//     */
//    public fun String.takeLast(n: Int): String {
//        require(n >= 0) { "Requested character count $n is less than zero." }
//        val length = length
//        return substring(length - n.coerceAtMost(length))
//    }
//
//    /**
//     * Returns a subsequence of this char sequence containing last characters that satisfy the given [predicate].
//     *
//     * @sample samples.collections.Collections.Transformations.take
//     */
//    public inline fun CharSequence.takeLastWhile(predicate: (Char) -> Boolean): CharSequence {
//        for (index in lastIndex downTo 0) {
//            if (!predicate(this[index])) {
//                return subSequence(index + 1, length)
//            }
//        }
//        return subSequence(0, length)
//    }
//
//    /**
//     * Returns a string containing last characters that satisfy the given [predicate].
//     *
//     * @sample samples.collections.Collections.Transformations.take
//     */
//    public inline fun String.takeLastWhile(predicate: (Char) -> Boolean): String {
//        for (index in lastIndex downTo 0) {
//            if (!predicate(this[index])) {
//                return substring(index + 1)
//            }
//        }
//        return this
//    }
//
//    /**
//     * Returns a subsequence of this char sequence containing the first characters that satisfy the given [predicate].
//     *
//     * @sample samples.collections.Collections.Transformations.take
//     */
//    public inline fun CharSequence.takeWhile(predicate: (Char) -> Boolean): CharSequence {
//        for (index in 0 until length)
//        if (!predicate(get(index))) {
//            return subSequence(0, index)
//        }
//        return subSequence(0, length)
//    }
//
//    /**
//     * Returns a string containing the first characters that satisfy the given [predicate].
//     *
//     * @sample samples.collections.Collections.Transformations.take
//     */
//    public inline fun String.takeWhile(predicate: (Char) -> Boolean): String {
//        for (index in 0 until length)
//        if (!predicate(get(index))) {
//            return substring(0, index)
//        }
//        return this
//    }
//
//    /**
//     * Returns a [Map] containing key-value pairs provided by [transform] function
//     * applied to characters of the given char sequence.
//     *
//     * If any of two pairs would have the same key the last one gets added to the map.
//     *
//     * The returned map preserves the entry iteration order of the original char sequence.
//     */
//    public inline fun <K, V> CharSequence.associate(transform: (Char) -> Pair<K, V>): Map<K, V> {
//        val capacity = mapCapacity(length).coerceAtLeast(16)
//        return associateTo(LinkedHashMap<K, V>(capacity), transform)
//    }
//
//    /**
//     * Returns a [Map] containing the characters from the given char sequence indexed by the key
//     * returned from [keySelector] function applied to each character.
//     *
//     * If any two characters would have the same key returned by [keySelector] the last one gets added to the map.
//     *
//     * The returned map preserves the entry iteration order of the original char sequence.
//     */
//    public inline fun <K> CharSequence.associateBy(keySelector: (Char) -> K): Map<K, Char> {
//        val capacity = mapCapacity(length).coerceAtLeast(16)
//        return associateByTo(LinkedHashMap<K, Char>(capacity), keySelector)
//    }
//
//    /**
//     * Returns a [Map] containing the values provided by [valueTransform] and indexed by [keySelector] functions applied to characters of the given char sequence.
//     *
//     * If any two characters would have the same key returned by [keySelector] the last one gets added to the map.
//     *
//     * The returned map preserves the entry iteration order of the original char sequence.
//     */
//    public inline fun <K, V> CharSequence.associateBy(keySelector: (Char) -> K, valueTransform: (Char) -> V): Map<K, V> {
//        val capacity = mapCapacity(length).coerceAtLeast(16)
//        return associateByTo(LinkedHashMap<K, V>(capacity), keySelector, valueTransform)
//    }
//
//    /**
//     * Populates and returns the [destination] mutable map with key-value pairs,
//     * where key is provided by the [keySelector] function applied to each character of the given char sequence
//     * and value is the character itself.
//     *
//     * If any two characters would have the same key returned by [keySelector] the last one gets added to the map.
//     */
//    public inline fun <K, M : MutableMap<in K, in Char>> CharSequence.associateByTo(destination: M, keySelector: (Char) -> K): M {
//        for (element in this) {
//            destination.put(keySelector(element), element)
//        }
//        return destination
//    }
//
//    /**
//     * Populates and returns the [destination] mutable map with key-value pairs,
//     * where key is provided by the [keySelector] function and
//     * and value is provided by the [valueTransform] function applied to characters of the given char sequence.
//     *
//     * If any two characters would have the same key returned by [keySelector] the last one gets added to the map.
//     */
//    public inline fun <K, V, M : MutableMap<in K, in V>> CharSequence.associateByTo(destination: M, keySelector: (Char) -> K, valueTransform: (Char) -> V): M {
//        for (element in this) {
//            destination.put(keySelector(element), valueTransform(element))
//        }
//        return destination
//    }
//
//    /**
//     * Populates and returns the [destination] mutable map with key-value pairs
//     * provided by [transform] function applied to each character of the given char sequence.
//     *
//     * If any of two pairs would have the same key the last one gets added to the map.
//     */
//    public inline fun <K, V, M : MutableMap<in K, in V>> CharSequence.associateTo(destination: M, transform: (Char) -> Pair<K, V>): M {
//        for (element in this) {
//            destination += transform(element)
//        }
//        return destination
//    }
//
///**
// * Appends all characters to the given [destination] collection.
// */
//    public fun <C : MutableCollection<in Char>> CharSequence.toCollection(destination: C): C {
//        for (item in this) {
//            destination.add(item)
//        }
//        return destination
//    }
//
//    /**
//     * Returns a [HashSet] of all characters.
//     */
//    public fun CharSequence.toHashSet(): HashSet<Char> {
//        return toCollection(HashSet<Char>(mapCapacity(length)))
//    }
//
//    /**
//     * Returns a [List] containing all characters.
//     */
//    public fun CharSequence.toList(): List<Char> {
//        return when (length) {
//            0 -> emptyList()
//            1 -> listOf(this[0])
//        else -> this.toMutableList()
//        }
//    }
//
//    /**
//     * Returns a [MutableList] filled with all characters of this char sequence.
//     */
//    public fun CharSequence.toMutableList(): MutableList<Char> {
//        return toCollection(ArrayList<Char>(length))
//    }
//
//    /**
//     * Returns a [Set] of all characters.
//     *
//     * The returned set preserves the element iteration order of the original char sequence.
//     */
//    public fun CharSequence.toSet(): Set<Char> {
//        return when (length) {
//            0 -> emptySet()
//            1 -> setOf(this[0])
//        else -> toCollection(LinkedHashSet<Char>(mapCapacity(length)))
//        }
//    }
//
//    /**
//     * Returns a single list of all elements yielded from results of [transform] function being invoked on each character of original char sequence.
//     */
//    public inline fun <R> CharSequence.flatMap(transform: (Char) -> Iterable<R>): List<R> {
//        return flatMapTo(ArrayList<R>(), transform)
//    }
//
//    /**
//     * Appends all elements yielded from results of [transform] function being invoked on each character of original char sequence, to the given [destination].
//     */
//    public inline fun <R, C : MutableCollection<in R>> CharSequence.flatMapTo(destination: C, transform: (Char) -> Iterable<R>): C {
//        for (element in this) {
//            val list = transform(element)
//            destination.addAll(list)
//        }
//        return destination
//    }
//
//    /**
//     * Groups characters of the original char sequence by the key returned by the given [keySelector] function
//     * applied to each character and returns a map where each group key is associated with a list of corresponding characters.
//     *
//     * The returned map preserves the entry iteration order of the keys produced from the original char sequence.
//     *
//     * @sample samples.collections.Collections.Transformations.groupBy
//     */
//    public inline fun <K> CharSequence.groupBy(keySelector: (Char) -> K): Map<K, List<Char>> {
//        return groupByTo(LinkedHashMap<K, MutableList<Char>>(), keySelector)
//    }
//
//    /**
//     * Groups values returned by the [valueTransform] function applied to each character of the original char sequence
//     * by the key returned by the given [keySelector] function applied to the character
//     * and returns a map where each group key is associated with a list of corresponding values.
//     *
//     * The returned map preserves the entry iteration order of the keys produced from the original char sequence.
//     *
//     * @sample samples.collections.Collections.Transformations.groupByKeysAndValues
//     */
//    public inline fun <K, V> CharSequence.groupBy(keySelector: (Char) -> K, valueTransform: (Char) -> V): Map<K, List<V>> {
//        return groupByTo(LinkedHashMap<K, MutableList<V>>(), keySelector, valueTransform)
//    }
//
//    /**
//     * Groups characters of the original char sequence by the key returned by the given [keySelector] function
//     * applied to each character and puts to the [destination] map each group key associated with a list of corresponding characters.
//     *
//     * @return The [destination] map.
//     *
//     * @sample samples.collections.Collections.Transformations.groupBy
//     */
//    public inline fun <K, M : MutableMap<in K, MutableList<Char>>> CharSequence.groupByTo(destination: M, keySelector: (Char) -> K): M {
//        for (element in this) {
//            val key = keySelector(element)
//            val list = destination.getOrPut(key) { ArrayList<Char>() }
//            list.add(element)
//        }
//        return destination
//    }
//
//    /**
//     * Groups values returned by the [valueTransform] function applied to each character of the original char sequence
//     * by the key returned by the given [keySelector] function applied to the character
//     * and puts to the [destination] map each group key associated with a list of corresponding values.
//     *
//     * @return The [destination] map.
//     *
//     * @sample samples.collections.Collections.Transformations.groupByKeysAndValues
//     */
//    public inline fun <K, V, M : MutableMap<in K, MutableList<V>>> CharSequence.groupByTo(destination: M, keySelector: (Char) -> K, valueTransform: (Char) -> V): M {
//        for (element in this) {
//            val key = keySelector(element)
//            val list = destination.getOrPut(key) { ArrayList<V>() }
//            list.add(valueTransform(element))
//        }
//        return destination
//    }
//
///**
// * Creates a [Grouping] source from a char sequence to be used later with one of group-and-fold operations
// * using the specified [keySelector] function to extract a key from each character.
// *
// * @sample samples.collections.Collections.Transformations.groupingByEachCount
// */
//    @SinceKotlin("1.1")
//    public inline fun <K> CharSequence.groupingBy(crossinline keySelector: (Char) -> K): Grouping<Char, K> {
//        return object : Grouping<Char, K> {
//            override fun sourceIterator(): Iterator<Char> = this@groupingBy.iterator()
//            override fun keyOf(element: Char): K = keySelector(element)
//        }
//    }
//
//    /**
//     * Returns a list containing the results of applying the given [transform] function
//     * to each character in the original char sequence.
//     */
//    public inline fun <R> CharSequence.map(transform: (Char) -> R): List<R> {
//        return mapTo(ArrayList<R>(length), transform)
//    }
//
//    /**
//     * Returns a list containing the results of applying the given [transform] function
//     * to each character and its index in the original char sequence.
//     * @param [transform] function that takes the index of a character and the character itself
//     * and returns the result of the transform applied to the character.
//     */
//    public inline fun <R> CharSequence.mapIndexed(transform: (index: Int, Char) -> R): List<R> {
//        return mapIndexedTo(ArrayList<R>(length), transform)
//    }
//
//    /**
//     * Returns a list containing only the non-null results of applying the given [transform] function
//     * to each character and its index in the original char sequence.
//     * @param [transform] function that takes the index of a character and the character itself
//     * and returns the result of the transform applied to the character.
//     */
//    public inline fun <R : Any> CharSequence.mapIndexedNotNull(transform: (index: Int, Char) -> R?): List<R> {
//        return mapIndexedNotNullTo(ArrayList<R>(), transform)
//    }
//
//    /**
//     * Applies the given [transform] function to each character and its index in the original char sequence
//     * and appends only the non-null results to the given [destination].
//     * @param [transform] function that takes the index of a character and the character itself
//     * and returns the result of the transform applied to the character.
//     */
//    public inline fun <R : Any, C : MutableCollection<in R>> CharSequence.mapIndexedNotNullTo(destination: C, transform: (index: Int, Char) -> R?): C {
//        forEachIndexed { index, element -> transform(index, element)?.let { destination.add(it) } }
//        return destination
//    }
//
//    /**
//     * Applies the given [transform] function to each character and its index in the original char sequence
//     * and appends the results to the given [destination].
//     * @param [transform] function that takes the index of a character and the character itself
//     * and returns the result of the transform applied to the character.
//     */
//    public inline fun <R, C : MutableCollection<in R>> CharSequence.mapIndexedTo(destination: C, transform: (index: Int, Char) -> R): C {
//        var index = 0
//        for (item in this)
//            destination.add(transform(index++, item))
//        return destination
//    }
//
//    /**
//     * Returns a list containing only the non-null results of applying the given [transform] function
//     * to each character in the original char sequence.
//     */
//    public inline fun <R : Any> CharSequence.mapNotNull(transform: (Char) -> R?): List<R> {
//        return mapNotNullTo(ArrayList<R>(), transform)
//    }
//
//    /**
//     * Applies the given [transform] function to each character in the original char sequence
//     * and appends only the non-null results to the given [destination].
//     */
//    public inline fun <R : Any, C : MutableCollection<in R>> CharSequence.mapNotNullTo(destination: C, transform: (Char) -> R?): C {
//        forEach { element -> transform(element)?.let { destination.add(it) } }
//        return destination
//    }
//
//    /**
//     * Applies the given [transform] function to each character of the original char sequence
//     * and appends the results to the given [destination].
//     */
//    public inline fun <R, C : MutableCollection<in R>> CharSequence.mapTo(destination: C, transform: (Char) -> R): C {
//        for (item in this)
//            destination.add(transform(item))
//        return destination
//    }
//
//    /**
//     * Returns a lazy [Iterable] of [IndexedValue] for each character of the original char sequence.
//     */
//    public fun CharSequence.withIndex(): Iterable<IndexedValue<Char>> {
//        return IndexingIterable { iterator() }
//    }
//
//    /**
//     * Returns `true` if all characters match the given [predicate].
//     *
//     * @sample samples.collections.Collections.Aggregates.all
//     */
//    public inline fun CharSequence.all(predicate: (Char) -> Boolean): Boolean {
//        for (element in this) if (!predicate(element)) return false
//        return true
//    }
//
//    /**
//     * Returns `true` if char sequence has at least one character.
//     *
//     * @sample samples.collections.Collections.Aggregates.any
//     */
//    public fun CharSequence.any(): Boolean {
//        return !isEmpty()
//    }
//
//    /**
//     * Returns `true` if at least one character matches the given [predicate].
//     *
//     * @sample samples.collections.Collections.Aggregates.anyWithPredicate
//     */
//    public inline fun CharSequence.any(predicate: (Char) -> Boolean): Boolean {
//        for (element in this) if (predicate(element)) return true
//        return false
//    }
//
///**
// * Returns the length of this char sequence.
// */
//    @kotlin.internal.InlineOnly
//    public inline fun CharSequence.count(): Int {
//        return length
//    }
//
//    /**
//     * Returns the number of characters matching the given [predicate].
//     */
//    public inline fun CharSequence.count(predicate: (Char) -> Boolean): Int {
//        var count = 0
//        for (element in this) if (predicate(element)) count++
//        return count
//    }
//
//    /**
//     * Accumulates value starting with [initial] value and applying [operation] from left to right to current accumulator value and each character.
//     */
//    public inline fun <R> CharSequence.fold(initial: R, operation: (acc: R, Char) -> R): R {
//        var accumulator = initial
//        for (element in this) accumulator = operation(accumulator, element)
//        return accumulator
//    }
//
//    /**
//     * Accumulates value starting with [initial] value and applying [operation] from left to right
//     * to current accumulator value and each character with its index in the original char sequence.
//     * @param [operation] function that takes the index of a character, current accumulator value
//     * and the character itself, and calculates the next accumulator value.
//     */
//    public inline fun <R> CharSequence.foldIndexed(initial: R, operation: (index: Int, acc: R, Char) -> R): R {
//        var index = 0
//        var accumulator = initial
//        for (element in this) accumulator = operation(index++, accumulator, element)
//        return accumulator
//    }
//
//    /**
//     * Accumulates value starting with [initial] value and applying [operation] from right to left to each character and current accumulator value.
//     */
//    public inline fun <R> CharSequence.foldRight(initial: R, operation: (Char, acc: R) -> R): R {
//        var index = lastIndex
//        var accumulator = initial
//        while (index >= 0) {
//            accumulator = operation(get(index--), accumulator)
//        }
//        return accumulator
//    }
//
//    /**
//     * Accumulates value starting with [initial] value and applying [operation] from right to left
//     * to each character with its index in the original char sequence and current accumulator value.
//     * @param [operation] function that takes the index of a character, the character itself
//     * and current accumulator value, and calculates the next accumulator value.
//     */
//    public inline fun <R> CharSequence.foldRightIndexed(initial: R, operation: (index: Int, Char, acc: R) -> R): R {
//        var index = lastIndex
//        var accumulator = initial
//        while (index >= 0) {
//            accumulator = operation(index, get(index), accumulator)
//                    --index
//        }
//        return accumulator
//    }
//
//    /**
//     * Performs the given [action] on each character.
//     */
//    public inline fun CharSequence.forEach(action: (Char) -> Unit): Unit {
//        for (element in this) action(element)
//    }
//
//    /**
//     * Performs the given [action] on each character, providing sequential index with the character.
//     * @param [action] function that takes the index of a character and the character itself
//     * and performs the desired action on the character.
//     */
//    public inline fun CharSequence.forEachIndexed(action: (index: Int, Char) -> Unit): Unit {
//        var index = 0
//        for (item in this) action(index++, item)
//    }
//
//    /**
//     * Returns the largest character or `null` if there are no characters.
//     */
//    public fun CharSequence.max(): Char? {
//        if (isEmpty()) return null
//        var max = this[0]
//        for (i in 1..lastIndex) {
//            val e = this[i]
//            if (max < e) max = e
//        }
//        return max
//    }
//
//    /**
//     * Returns the first character yielding the largest value of the given function or `null` if there are no characters.
//     */
//    public inline fun <R : Comparable<R>> CharSequence.maxBy(selector: (Char) -> R): Char? {
//        if (isEmpty()) return null
//        var maxElem = this[0]
//        var maxValue = selector(maxElem)
//        for (i in 1..lastIndex) {
//            val e = this[i]
//            val v = selector(e)
//            if (maxValue < v) {
//                maxElem = e
//                maxValue = v
//            }
//        }
//        return maxElem
//    }
//
//    /**
//     * Returns the first character having the largest value according to the provided [comparator] or `null` if there are no characters.
//     */
//    public fun CharSequence.maxWith(comparator: Comparator<in Char>): Char? {
//        if (isEmpty()) return null
//        var max = this[0]
//        for (i in 1..lastIndex) {
//            val e = this[i]
//            if (comparator.compare(max, e) < 0) max = e
//        }
//        return max
//    }
//
//    /**
//     * Returns the smallest character or `null` if there are no characters.
//     */
//    public fun CharSequence.min(): Char? {
//        if (isEmpty()) return null
//        var min = this[0]
//        for (i in 1..lastIndex) {
//            val e = this[i]
//            if (min > e) min = e
//        }
//        return min
//    }
//
//    /**
//     * Returns the first character yielding the smallest value of the given function or `null` if there are no characters.
//     */
//    public inline fun <R : Comparable<R>> CharSequence.minBy(selector: (Char) -> R): Char? {
//        if (isEmpty()) return null
//        var minElem = this[0]
//        var minValue = selector(minElem)
//        for (i in 1..lastIndex) {
//            val e = this[i]
//            val v = selector(e)
//            if (minValue > v) {
//                minElem = e
//                minValue = v
//            }
//        }
//        return minElem
//    }
//
//    /**
//     * Returns the first character having the smallest value according to the provided [comparator] or `null` if there are no characters.
//     */
//    public fun CharSequence.minWith(comparator: Comparator<in Char>): Char? {
//        if (isEmpty()) return null
//        var min = this[0]
//        for (i in 1..lastIndex) {
//            val e = this[i]
//            if (comparator.compare(min, e) > 0) min = e
//        }
//        return min
//    }
//
//    /**
//     * Returns `true` if the char sequence has no characters.
//     *
//     * @sample samples.collections.Collections.Aggregates.none
//     */
//    public fun CharSequence.none(): Boolean {
//        return isEmpty()
//    }
//
//    /**
//     * Returns `true` if no characters match the given [predicate].
//     *
//     * @sample samples.collections.Collections.Aggregates.noneWithPredicate
//     */
//    public inline fun CharSequence.none(predicate: (Char) -> Boolean): Boolean {
//        for (element in this) if (predicate(element)) return false
//        return true
//    }
//
///**
// * Performs the given [action] on each character and returns the char sequence itself afterwards.
// */
//    @SinceKotlin("1.1")
//    public inline fun <S : CharSequence> S.onEach(action: (Char) -> Unit): S {
//        return apply { for (element in this) action(element) }
//    }
//
//    /**
//     * Accumulates value starting with the first character and applying [operation] from left to right to current accumulator value and each character.
//     */
//    public inline fun CharSequence.reduce(operation: (acc: Char, Char) -> Char): Char {
//        if (isEmpty())
//            throw UnsupportedOperationException("Empty char sequence can't be reduced.")
//        var accumulator = this[0]
//        for (index in 1..lastIndex) {
//            accumulator = operation(accumulator, this[index])
//        }
//        return accumulator
//    }
//
//    /**
//     * Accumulates value starting with the first character and applying [operation] from left to right
//     * to current accumulator value and each character with its index in the original char sequence.
//     * @param [operation] function that takes the index of a character, current accumulator value
//     * and the character itself and calculates the next accumulator value.
//     */
//    public inline fun CharSequence.reduceIndexed(operation: (index: Int, acc: Char, Char) -> Char): Char {
//        if (isEmpty())
//            throw UnsupportedOperationException("Empty char sequence can't be reduced.")
//        var accumulator = this[0]
//        for (index in 1..lastIndex) {
//            accumulator = operation(index, accumulator, this[index])
//        }
//        return accumulator
//    }
//
//    /**
//     * Accumulates value starting with last character and applying [operation] from right to left to each character and current accumulator value.
//     */
//    public inline fun CharSequence.reduceRight(operation: (Char, acc: Char) -> Char): Char {
//        var index = lastIndex
//        if (index < 0) throw UnsupportedOperationException("Empty char sequence can't be reduced.")
//        var accumulator = get(index--)
//        while (index >= 0) {
//            accumulator = operation(get(index--), accumulator)
//        }
//        return accumulator
//    }
//
//    /**
//     * Accumulates value starting with last character and applying [operation] from right to left
//     * to each character with its index in the original char sequence and current accumulator value.
//     * @param [operation] function that takes the index of a character, the character itself
//     * and current accumulator value, and calculates the next accumulator value.
//     */
//    public inline fun CharSequence.reduceRightIndexed(operation: (index: Int, Char, acc: Char) -> Char): Char {
//        var index = lastIndex
//        if (index < 0) throw UnsupportedOperationException("Empty char sequence can't be reduced.")
//        var accumulator = get(index--)
//        while (index >= 0) {
//            accumulator = operation(index, get(index), accumulator)
//                    --index
//        }
//        return accumulator
//    }
//
//    /**
//     * Returns the sum of all values produced by [selector] function applied to each character in the char sequence.
//     */
//    public inline fun CharSequence.sumBy(selector: (Char) -> Int): Int {
//        var sum: Int = 0
//        for (element in this) {
//            sum += selector(element)
//        }
//        return sum
//    }
//
//    /**
//     * Returns the sum of all values produced by [selector] function applied to each character in the char sequence.
//     */
//    public inline fun CharSequence.sumByDouble(selector: (Char) -> Double): Double {
//        var sum: Double = 0.0
//        for (element in this) {
//            sum += selector(element)
//        }
//        return sum
//    }
//
///**
// * Splits this char sequence into a list of strings each not exceeding the given [size].
// *
// * The last string in the resulting list may have less characters than the given [size].
// *
// * @param size the number of elements to take in each string, must be positive and can be greater than the number of elements in this char sequence.
// *
// * @sample samples.collections.Collections.Transformations.chunked
// */
//    @SinceKotlin("1.2")
//    public fun CharSequence.chunked(size: Int): List<String> {
//        return windowed(size, size, partialWindows = true)
//    }
//
///**
// * Splits this char sequence into several char sequences each not exceeding the given [size]
// * and applies the given [transform] function to an each.
// *
// * @return list of results of the [transform] applied to an each char sequence.
// *
// * Note that the char sequence passed to the [transform] function is ephemeral and is valid only inside that function.
// * You should not store it or allow it to escape in some way, unless you made a snapshot of it.
// * The last char sequence may have less characters than the given [size].
// *
// * @param size the number of elements to take in each char sequence, must be positive and can be greater than the number of elements in this char sequence.
// *
// * @sample samples.text.Strings.chunkedTransform
// */
//    @SinceKotlin("1.2")
//    public fun <R> CharSequence.chunked(size: Int, transform: (CharSequence) -> R): List<R> {
//        return windowed(size, size, partialWindows = true, transform = transform)
//    }
//
///**
// * Splits this char sequence into a sequence of strings each not exceeding the given [size].
// *
// * The last string in the resulting sequence may have less characters than the given [size].
// *
// * @param size the number of elements to take in each string, must be positive and can be greater than the number of elements in this char sequence.
// *
// * @sample samples.collections.Collections.Transformations.chunked
// */
//    @SinceKotlin("1.2")
//    public fun CharSequence.chunkedSequence(size: Int): Sequence<String> {
//        return chunkedSequence(size) { it.toString() }
//    }
//
///**
// * Splits this char sequence into several char sequences each not exceeding the given [size]
// * and applies the given [transform] function to an each.
// *
// * @return sequence of results of the [transform] applied to an each char sequence.
// *
// * Note that the char sequence passed to the [transform] function is ephemeral and is valid only inside that function.
// * You should not store it or allow it to escape in some way, unless you made a snapshot of it.
// * The last char sequence may have less characters than the given [size].
// *
// * @param size the number of elements to take in each char sequence, must be positive and can be greater than the number of elements in this char sequence.
// *
// * @sample samples.text.Strings.chunkedTransformToSequence
// */
//    @SinceKotlin("1.2")
//    public fun <R> CharSequence.chunkedSequence(size: Int, transform: (CharSequence) -> R): Sequence<R> {
//        return windowedSequence(size, size, partialWindows = true, transform = transform)
//    }
//
//    /**
//     * Splits the original char sequence into pair of char sequences,
//     * where *first* char sequence contains characters for which [predicate] yielded `true`,
//     * while *second* char sequence contains characters for which [predicate] yielded `false`.
//     */
//    public inline fun CharSequence.partition(predicate: (Char) -> Boolean): Pair<CharSequence, CharSequence> {
//        val first = StringBuilder()
//        val second = StringBuilder()
//        for (element in this) {
//            if (predicate(element)) {
//                first.append(element)
//            } else {
//                second.append(element)
//            }
//        }
//        return Pair(first, second)
//    }
//
//    /**
//     * Splits the original string into pair of strings,
//     * where *first* string contains characters for which [predicate] yielded `true`,
//     * while *second* string contains characters for which [predicate] yielded `false`.
//     */
//    public inline fun String.partition(predicate: (Char) -> Boolean): Pair<String, String> {
//        val first = StringBuilder()
//        val second = StringBuilder()
//        for (element in this) {
//            if (predicate(element)) {
//                first.append(element)
//            } else {
//                second.append(element)
//            }
//        }
//        return Pair(first.toString(), second.toString())
//    }
//
///**
// * Returns a list of snapshots of the window of the given [size]
// * sliding along this char sequence with the given [step], where each
// * snapshot is a string.
// *
// * Several last strings may have less characters than the given [size].
// *
// * Both [size] and [step] must be positive and can be greater than the number of elements in this char sequence.
// * @param size the number of elements to take in each window
// * @param step the number of elements to move the window forward by on an each step, by default 1
// * @param partialWindows controls whether or not to keep partial windows in the end if any,
// * by default `false` which means partial windows won't be preserved
// *
// * @sample samples.collections.Sequences.Transformations.takeWindows
// */
//    @SinceKotlin("1.2")
//    public fun CharSequence.windowed(size: Int, step: Int = 1, partialWindows: Boolean = false): List<String> {
//        return windowed(size, step, partialWindows) { it.toString() }
//    }
//
///**
// * Returns a list of results of applying the given [transform] function to
// * an each char sequence representing a view over the window of the given [size]
// * sliding along this char sequence with the given [step].
// *
// * Note that the char sequence passed to the [transform] function is ephemeral and is valid only inside that function.
// * You should not store it or allow it to escape in some way, unless you made a snapshot of it.
// * Several last char sequences may have less characters than the given [size].
// *
// * Both [size] and [step] must be positive and can be greater than the number of elements in this char sequence.
// * @param size the number of elements to take in each window
// * @param step the number of elements to move the window forward by on an each step, by default 1
// * @param partialWindows controls whether or not to keep partial windows in the end if any,
// * by default `false` which means partial windows won't be preserved
// *
// * @sample samples.collections.Sequences.Transformations.averageWindows
// */
//    @SinceKotlin("1.2")
//    public fun <R> CharSequence.windowed(size: Int, step: Int = 1, partialWindows: Boolean = false, transform: (CharSequence) -> R): List<R> {
//        checkWindowSizeStep(size, step)
//        val thisSize = this.length
//        val result = ArrayList<R>((thisSize + step - 1) / step)
//        var index = 0
//        while (index < thisSize) {
//            val end = index + size
//            val coercedEnd = if (end > thisSize) { if (partialWindows) thisSize else break } else end
//            result.add(transform(subSequence(index, coercedEnd)))
//            index += step
//        }
//        return result
//    }
//
///**
// * Returns a sequence of snapshots of the window of the given [size]
// * sliding along this char sequence with the given [step], where each
// * snapshot is a string.
// *
// * Several last strings may have less characters than the given [size].
// *
// * Both [size] and [step] must be positive and can be greater than the number of elements in this char sequence.
// * @param size the number of elements to take in each window
// * @param step the number of elements to move the window forward by on an each step, by default 1
// * @param partialWindows controls whether or not to keep partial windows in the end if any,
// * by default `false` which means partial windows won't be preserved
// *
// * @sample samples.collections.Sequences.Transformations.takeWindows
// */
//    @SinceKotlin("1.2")
//    public fun CharSequence.windowedSequence(size: Int, step: Int = 1, partialWindows: Boolean = false): Sequence<String> {
//        return windowedSequence(size, step, partialWindows) { it.toString() }
//    }
//
///**
// * Returns a sequence of results of applying the given [transform] function to
// * an each char sequence representing a view over the window of the given [size]
// * sliding along this char sequence with the given [step].
// *
// * Note that the char sequence passed to the [transform] function is ephemeral and is valid only inside that function.
// * You should not store it or allow it to escape in some way, unless you made a snapshot of it.
// * Several last char sequences may have less characters than the given [size].
// *
// * Both [size] and [step] must be positive and can be greater than the number of elements in this char sequence.
// * @param size the number of elements to take in each window
// * @param step the number of elements to move the window forward by on an each step, by default 1
// * @param partialWindows controls whether or not to keep partial windows in the end if any,
// * by default `false` which means partial windows won't be preserved
// *
// * @sample samples.collections.Sequences.Transformations.averageWindows
// */
//    @SinceKotlin("1.2")
//    public fun <R> CharSequence.windowedSequence(size: Int, step: Int = 1, partialWindows: Boolean = false, transform: (CharSequence) -> R): Sequence<R> {
//        checkWindowSizeStep(size, step)
//        val windows = (if (partialWindows) indices else 0 until length - size + 1) step step
//        return windows.asSequence().map { index -> transform(subSequence(index, (index + size).coerceAtMost(length))) }
//    }
//
//    /**
//     * Returns a list of pairs built from the characters of `this` and the [other] char sequences with the same index
//     * The returned list has length of the shortest char sequence.
//     *
//     * @sample samples.text.Strings.zip
//     */
//    public infix fun CharSequence.zip(other: CharSequence): List<Pair<Char, Char>> {
//        return zip(other) { c1, c2 -> c1 to c2 }
//    }
//
//    /**
//     * Returns a list of values built from the characters of `this` and the [other] char sequences with the same index
//     * using the provided [transform] function applied to each pair of characters.
//     * The returned list has length of the shortest char sequence.
//     *
//     * @sample samples.text.Strings.zipWithTransform
//     */
//    public inline fun <V> CharSequence.zip(other: CharSequence, transform: (a: Char, b: Char) -> V): List<V> {
//        val length = minOf(this.length, other.length)
//        val list = ArrayList<V>(length)
//        for (i in 0 until length) {
//            list.add(transform(this[i], other[i]))
//        }
//        return list
//    }
//
///**
// * Returns a list of pairs of each two adjacent characters in this char sequence.
// *
// * The returned list is empty if this char sequence contains less than two characters.
// *
// * @sample samples.collections.Collections.Transformations.zipWithNext
// */
//    @SinceKotlin("1.2")
//    public fun CharSequence.zipWithNext(): List<Pair<Char, Char>> {
//        return zipWithNext { a, b -> a to b }
//    }
//
///**
// * Returns a list containing the results of applying the given [transform] function
// * to an each pair of two adjacent characters in this char sequence.
// *
// * The returned list is empty if this char sequence contains less than two characters.
// *
// * @sample samples.collections.Collections.Transformations.zipWithNextToFindDeltas
// */
//    @SinceKotlin("1.2")
//    public inline fun <R> CharSequence.zipWithNext(transform: (a: Char, b: Char) -> R): List<R> {
//        val size = length - 1
//        if (size < 1) return emptyList()
//        val result = ArrayList<R>(size)
//        for (index in 0 until size) {
//            result.add(transform(this[index], this[index + 1]))
//        }
//        return result
//    }
//
//    /**
//     * Creates an [Iterable] instance that wraps the original char sequence returning its characters when being iterated.
//     */
//    public fun CharSequence.asIterable(): Iterable<Char> {
//        if (this is String && isEmpty()) return emptyList()
//        return Iterable { this.iterator() }
//    }
//
//    /**
//     * Creates a [Sequence] instance that wraps the original char sequence returning its characters when being iterated.
//     */
//    public fun CharSequence.asSequence(): Sequence<Char> {
//        if (this is String && isEmpty()) return emptySequence()
//        return Sequence { this.iterator() }
//    }
//
//    /**
//     * Returns a [SortedSet][java.util.SortedSet] of all characters.
//     */
//    public fun CharSequence.toSortedSet(): java.util.SortedSet<Char> {
//        return toCollection(java.util.TreeSet<Char>())
//    }
}