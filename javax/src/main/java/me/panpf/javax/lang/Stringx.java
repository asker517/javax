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

import me.panpf.javax.collections.*;
import me.panpf.javax.ranges.IntProgression;
import me.panpf.javax.ranges.IntRange;
import me.panpf.javax.ranges.Rangex;
import me.panpf.javax.util.*;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import java.io.IOException;
import java.nio.charset.Charset;
import java.util.*;
import java.util.regex.Pattern;

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
        return sequence != null && sequence.length() > 0 && isNotBlank(sequence);
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
    @NotNull
    public static CharSequence isNotSafeOr(@Nullable CharSequence sequence, @NotNull CharSequence defaultValue) {
        return isSafe(sequence) ? sequence : defaultValue;
    }

    /**
     * If the given character sequence is safe, it return is itself, otherwise it returns the default value.
     */
    @NotNull
    public static String isNotSafeOr(@Nullable String string, @NotNull String defaultValue) {
        return isSafe(string) ? string : defaultValue;
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
    @NotNull
    public static CharSequence isBlankOr(@Nullable CharSequence sequence, @NotNull CharSequence defaultValue) {
        return isNotBlank(sequence) ? orEmpty(sequence) : defaultValue;
    }

    /**
     * If the given character sequence is not blank, it return is itself, otherwise it returns the default value.
     */
    @NotNull
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
    @NotNull
    public static CharSequence isNullOrBlankOr(@Nullable CharSequence sequence, @NotNull CharSequence defaultValue) {
        return isNotNullOrBlank(sequence) ? sequence : defaultValue;
    }

    /**
     * If the given character sequence is not null or blank, it return is itself, otherwise it returns the default value.
     */
    @NotNull
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
        return sequence != null && sequence.length() > 0;
    }

    /**
     * If the given character sequence is not empty, it return is itself, otherwise it returns the default value.
     */
    @NotNull
    public static CharSequence isEmptyOr(@Nullable CharSequence sequence, @NotNull CharSequence defaultValue) {
        return isNotEmpty(sequence) ? sequence : defaultValue;
    }

    /**
     * If the given character sequence is not empty, it return is itself, otherwise it returns the default value.
     */
    @NotNull
    public static String isEmptyOr(@Nullable String string, @NotNull String defaultValue) {
        return isNotEmpty(string) ? string : defaultValue;
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
        return sequence != null && sequence.length() > 0;
    }

    /**
     * If the given character sequence is not null or empty, it return is itself, otherwise it returns the default value.
     */
    @NotNull
    public static CharSequence isNullOrEmptyOr(@Nullable CharSequence sequence, @NotNull CharSequence defaultValue) {
        return isNotNullOrEmpty(sequence) ? sequence : defaultValue;
    }

    /**
     * If the given character sequence is not null or empty, it return is itself, otherwise it returns the default value.
     */
    @NotNull
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
    @NotNull
    public static CharSequence isNotChineseOr(@Nullable CharSequence sequence, @NotNull CharSequence defaultValue) {
        return isChinese(sequence) ? sequence : defaultValue;
    }

    /**
     * If the given character sequence is chinese, it return is itself, otherwise it returns the default value.
     */
    @NotNull
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
    @NotNull
    public static CharSequence isNotDigitOr(@Nullable CharSequence sequence, @NotNull CharSequence defaultValue) {
        return isDigit(sequence) ? sequence : defaultValue;
    }

    /**
     * If the given character sequence is digit, it return is itself, otherwise it returns the default value.
     */
    @NotNull
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
    @NotNull
    public static CharSequence isNotLetterOr(@Nullable CharSequence sequence, @NotNull CharSequence defaultValue) {
        return isLetter(sequence) ? sequence : defaultValue;
    }

    /**
     * If the given character sequence is letter, it return is itself, otherwise it returns the default value.
     */
    @NotNull
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
    @NotNull
    public static CharSequence isNotLetterOrDigitOr(@Nullable CharSequence sequence, @NotNull CharSequence defaultValue) {
        return isLetterOrDigit(sequence) ? sequence : defaultValue;
    }

    /**
     * If the given character sequence is digit or letter, it return is itself, otherwise it returns the default value.
     */
    @NotNull
    public static String isNotLetterOrDigitOr(@Nullable String string, @NotNull String defaultValue) {
        return isLetterOrDigit(string) ? string : defaultValue;
    }


    /* ******************************************* orContains and andContains *******************************************/


    /**
     * Return true if the specified string contains one of the strings in [params]
     */
    public static boolean orContains(@Nullable String string, @Nullable String[] params, boolean ignoreCase) {
        if (string == null || params == null || params.length == 0) return false;
        for (String param : params) if (contains(string, param, ignoreCase)) return true;
        return false;
    }

    /**
     * Return true if the specified string contains one of the strings in [params]
     */
    public static boolean orContains(@Nullable String string, @Nullable String[] params) {
        return orContains(string, params, false);
    }

    /**
     * Return true if the specified string contains one of the strings in [params]
     */
    public static boolean orContains(@Nullable String string, @Nullable Collection<String> params, boolean ignoreCase) {
        if (string == null || params == null || params.size() == 0) return false;
        for (String param : params) if (contains(string, param, ignoreCase)) return true;
        return false;
    }

    /**
     * Return true if the specified string contains one of the strings in [params]
     */
    public static boolean orContains(@Nullable String string, @Nullable Collection<String> params) {
        return orContains(string, params, false);
    }

    /**
     * Return true if the specified string contains all the strings in[params]
     */
    public static boolean andContains(@Nullable String string, @Nullable String[] params, boolean ignoreCase) {
        if (string == null || params == null || params.length == 0) return false;
        for (String param : params) if (!contains(string, param, ignoreCase)) return false;
        return true;
    }

    /**
     * Return true if the specified string contains all the strings in[params]
     */
    public static boolean andContains(@Nullable String string, @Nullable String[] params) {
        return andContains(string, params, false);
    }

    /**
     * Return true if the specified string contains all the strings in[params]
     */
    public static boolean andContains(@Nullable String string, @Nullable Collection<String> params, boolean ignoreCase) {
        if (string == null || params == null || params.size() == 0) return false;
        for (String param : params) if (!contains(string, param, ignoreCase)) return false;
        return true;
    }

    /**
     * Return true if the specified string contains all the strings in[params]
     */
    public static boolean andContains(@Nullable String string, @Nullable Collection<String> params) {
        return andContains(string, params, false);
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
    public static String removeChar(@Nullable String string, char ch) {
        StringBuilder sb = new StringBuilder();
        if (string != null) {
            for (char cha : string.toCharArray()) {
                if (cha != ch) {
                    sb.append(cha);
                }
            }
        }
        return sb.toString();
    }

    /**
     * Delete the first occurrence of the specified character in the string and return the new string
     */
    @NotNull
    public static String removeFirstChar(@Nullable String string, char ch) {
        StringBuilder sb = new StringBuilder();
        if (string != null) {
            boolean removed = false;
            for (int index = 0, size = count(string); index < size; index++) {
                char cha = string.charAt(index);
                if (cha != ch || removed) {
                    sb.append(cha);
                } else {
                    removed = true;
                }
            }
        }
        return sb.toString();
    }

    /**
     * Delete the last specified character in the string and return the new string
     */
    @NotNull
    public static String removeLastChar(@Nullable String string, char ch) {
        StringBuilder sb = new StringBuilder();
        if (string != null) {
            boolean removed = false;
            for (int index = count(string) - 1; index >= 0; index--) {
                char cha = string.charAt(index);
                if (cha != ch || removed) {
                    sb.insert(0, cha);
                } else {
                    removed = true;
                }
            }
        }
        return sb.toString();
    }

    /**
     * Delete the character at the specified position in the string and return the new string
     */
    @NotNull
    public static String removeIndex(@Nullable String string, int removeIndex) {
        StringBuilder sb = new StringBuilder();
        if (string != null) {
            boolean removed = false;
            for (int index = 0, size = count(string); index < size; index++) {
                char cha = string.charAt(index);
                if (index != removeIndex || removed) {
                    sb.append(cha);
                } else {
                    removed = true;
                }
            }
        }
        return sb.toString();
    }


    /*
     * *****************************************************************************************************************
     * From kotlin standard library
     * *****************************************************************************************************************
     */


    /* ******************************************* other *******************************************/


    /**
     * Returns the range of valid character indices for this char sequence.
     */
    @NotNull
    public static IntRange indices(@Nullable CharSequence charSequence) {
        return Rangex.rangeTo(0, count(charSequence) - 1);
    }

    /**
     * Returns the index of the last character in the char sequence or -1 if it is empty.
     */
    public static int lastIndex(@Nullable CharSequence charSequence) {
        return count(charSequence) - 1;
    }

    /**
     * Returns `true` if this CharSequence has Unicode surrogate pair at the specified [index].
     */
    public static boolean hasSurrogatePairAt(@Nullable CharSequence charSequence, int index) {
        return charSequence != null && Rangex.rangeTo(0, count(charSequence) - 2).contains(index)
                && Character.isHighSurrogate(charSequence.charAt(index))
                && Character.isLowSurrogate(charSequence.charAt(index + 1));
    }


    /* ******************************************* startsWith *******************************************/


    /**
     * Returns `true` if this char sequence starts with the specified character.
     */
    public static boolean startsWith(@Nullable CharSequence charSequence, char cha, boolean ignoreCase) {
        return charSequence != null && count(charSequence) > 0 && Charx.equals(charSequence.charAt(0), cha, ignoreCase);
    }

    /**
     * Returns `true` if this char sequence starts with the specified character.
     */
    public static boolean startsWith(@Nullable CharSequence charSequence, char cha) {
        return startsWith(charSequence, cha, false);
    }

    /**
     * Returns `true` if this char sequence starts with the specified prefix.
     */
    public static boolean startsWith(@Nullable CharSequence charSequence, @NotNull CharSequence prefix, boolean ignoreCase) {
        if (!ignoreCase && charSequence instanceof String && prefix instanceof String) {
            return ((String) charSequence).startsWith((String) prefix);
        } else {
            return regionMatchesImpl(charSequence, 0, prefix, 0, prefix.length(), ignoreCase);
        }
    }

    /**
     * Returns `true` if this char sequence starts with the specified prefix.
     */
    public static boolean startsWith(@Nullable CharSequence charSequence, @NotNull CharSequence prefix) {
        return startsWith(charSequence, prefix, false);
    }

    /**
     * Returns `true` if a substring of this char sequence starting at the specified offset [startIndex] starts with the specified prefix.
     */
    public static boolean startsWith(@Nullable CharSequence charSequence, @NotNull CharSequence prefix, int startIndex, boolean ignoreCase) {
        if (!ignoreCase && charSequence instanceof String && prefix instanceof String) {
            return ((String) charSequence).startsWith((String) prefix, startIndex);
        } else {
            return regionMatchesImpl(charSequence, startIndex, prefix, 0, prefix.length(), ignoreCase);
        }
    }

    /**
     * Returns `true` if a substring of this char sequence starting at the specified offset [startIndex] starts with the specified prefix.
     */
    public static boolean startsWith(@Nullable CharSequence charSequence, @NotNull CharSequence prefix, int startIndex) {
        return startsWith(charSequence, prefix, startIndex, false);
    }

    /**
     * Returns `true` if this string starts with the specified prefix.
     */
    public static boolean startsWith(@Nullable String string, @NotNull String prefix, boolean ignoreCase) {
        if (!ignoreCase) {
            return string != null && string.startsWith(prefix);
        } else {
            //noinspection ConstantConditions
            return regionMatches(string, 0, prefix, 0, prefix.length(), ignoreCase);
        }
    }

    /**
     * Returns `true` if this string starts with the specified prefix.
     */
    public static boolean startsWith(@Nullable String string, @NotNull String prefix) {
        return startsWith(string, prefix, false);
    }

    /**
     * Returns `true` if a substring of this string starting at the specified offset [startIndex] starts with the specified prefix.
     */
    public static boolean startsWith(@Nullable String string, @NotNull String prefix, int startIndex, boolean ignoreCase) {
        if (!ignoreCase) {
            return string != null && string.startsWith(prefix, startIndex);
        } else {
            //noinspection ConstantConditions
            return regionMatches(string, startIndex, prefix, 0, prefix.length(), ignoreCase);
        }
    }

    /**
     * Returns `true` if a substring of this string starting at the specified offset [startIndex] starts with the specified prefix.
     */
    public static boolean startsWith(@Nullable String string, @NotNull String prefix, int startIndex) {
        return startsWith(string, prefix, startIndex, false);
    }


    /* ******************************************* endsWith *******************************************/


    /**
     * Returns `true` if this char sequence ends with the specified character.
     */
    public static boolean endsWith(@Nullable CharSequence charSequence, char cha, boolean ignoreCase) {
        return charSequence != null && count(charSequence) > 0 && Charx.equals(charSequence.charAt(count(charSequence) - 1), cha, ignoreCase);
    }

    /**
     * Returns `true` if this char sequence ends with the specified character.
     */
    public static boolean endsWith(@Nullable CharSequence charSequence, char cha) {
        return endsWith(charSequence, cha, false);
    }

    /**
     * Returns `true` if this char sequence ends with the specified suffix.
     */
    public static boolean endsWith(@Nullable CharSequence charSequence, @NotNull CharSequence suffix, boolean ignoreCase) {
        if (!ignoreCase && charSequence instanceof String && suffix instanceof String) {
            return ((String) charSequence).endsWith((String) suffix);
        } else {
            return regionMatchesImpl(charSequence, count(charSequence) - suffix.length(), suffix, 0, suffix.length(), ignoreCase);
        }
    }

    /**
     * Returns `true` if this char sequence ends with the specified suffix.
     */
    public static boolean endsWith(@Nullable CharSequence charSequence, @NotNull CharSequence suffix) {
        return endsWith(charSequence, suffix, false);
    }

    /**
     * Returns `true` if this string ends with the specified suffix.
     */
    public static boolean endsWith(@Nullable String string, @NotNull String suffix, boolean ignoreCase) {
        if (!ignoreCase) {
            return string != null && string.endsWith(suffix);
        } else {
            //noinspection ConstantConditions
            return regionMatches(string, count(string) - suffix.length(), suffix, 0, suffix.length(), ignoreCase);
        }
    }

    /**
     * Returns `true` if this string ends with the specified suffix.
     */
    public static boolean endsWith(@Nullable String string, @NotNull String suffix) {
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


    /**
     * Returns a char sequence with content of this char sequence where its part at the given range is removed.
     *
     * @param startIndex the index of the first character to be removed.
     * @param endIndex   the index of the first character after the removed part to keep in the string.
     *                   <p>
     *                   [endIndex] is not included in the removed part.
     */
    @NotNull
    public static CharSequence removeRange(@Nullable CharSequence charSequence, int startIndex, int endIndex) {
        if (charSequence == null) return "";
        if (endIndex < startIndex)
            throw new IndexOutOfBoundsException("End index (" + endIndex + ") is less than start index (" + startIndex + ").");
        if (endIndex == startIndex) return charSequence.subSequence(0, count(charSequence));

        StringBuilder sb = new StringBuilder(count(charSequence) - (endIndex - startIndex));
        sb.append(charSequence, 0, startIndex);
        sb.append(charSequence, endIndex, count(charSequence));
        return sb;
    }

    /**
     * Removes the part of a string at a given range.
     *
     * @param startIndex the index of the first character to be removed.
     * @param endIndex   the index of the first character after the removed part to keep in the string.
     *                   <p>
     *                   [endIndex] is not included in the removed part.
     */
    @NotNull
    public static String removeRange(@Nullable String string, int startIndex, int endIndex) {
        return removeRange((CharSequence) string, startIndex, endIndex).toString();
    }

    /**
     * Returns a char sequence with content of this char sequence where its part at the given [range] is removed.
     * <p>
     * The end index of the [range] is included in the removed part.
     */
    @NotNull
    public static CharSequence removeRange(@Nullable CharSequence charSequence, @NotNull IntRange range) {
        return removeRange(charSequence, range.getStart(), range.getEndInclusive() + 1);
    }

    /**
     * Removes the part of a string at the given [range].
     * <p>
     * The end index of the [range] is included in the removed part.
     */
    @NotNull
    public static String removeRange(@Nullable String string, @NotNull IntRange range) {
        return removeRange((CharSequence) string, range).toString();
    }

    /**
     * If this char sequence starts with the given [prefix], returns a new char sequence
     * with the prefix removed. Otherwise, returns a new char sequence with the same characters.
     */
    @NotNull
    public static CharSequence removePrefix(@Nullable CharSequence charSequence, @NotNull CharSequence prefix) {
        if (charSequence == null) return "";
        if (startsWith(charSequence, prefix)) return charSequence.subSequence(prefix.length(), count(charSequence));
        return charSequence.subSequence(0, count(charSequence));
    }

    /**
     * If this string starts with the given [prefix], returns a copy of this string
     * with the prefix removed. Otherwise, returns this string.
     */
    @NotNull
    public static String removePrefix(@Nullable String string, @NotNull CharSequence prefix) {
        if (string == null) return "";
        if (startsWith(string, prefix)) return string.substring(prefix.length());
        return string;
    }

    /**
     * If this char sequence ends with the given [suffix], returns a new char sequence
     * with the suffix removed. Otherwise, returns a new char sequence with the same characters.
     */
    @NotNull
    public static CharSequence removeSuffix(@Nullable CharSequence charSequence, @NotNull CharSequence suffix) {
        if (charSequence == null) return "";
        if (endsWith(charSequence, suffix)) return charSequence.subSequence(0, count(charSequence) - suffix.length());
        return charSequence.subSequence(0, count(charSequence));
    }

    /**
     * If this string ends with the given [suffix], returns a copy of this string
     * with the suffix removed. Otherwise, returns this string.
     */
    @NotNull
    public static String removeSuffix(@Nullable String string, @NotNull CharSequence suffix) {
        if (string == null) return "";
        if (endsWith(string, suffix)) return string.substring(0, count(string) - suffix.length());
        return string;
    }

    /**
     * When this char sequence starts with the given [prefix] and ends with the given [suffix],
     * returns a new char sequence having both the given [prefix] and [suffix] removed.
     * Otherwise returns a new char sequence with the same characters.
     */
    @NotNull
    public static CharSequence removeSurrounding(@Nullable CharSequence charSequence, @NotNull CharSequence prefix, @NotNull CharSequence suffix) {
        if (charSequence == null) return "";
        if ((count(charSequence) >= prefix.length() + suffix.length()) && startsWith(charSequence, prefix) && endsWith(charSequence, suffix)) {
            return charSequence.subSequence(prefix.length(), count(charSequence) - suffix.length());
        }
        return charSequence.subSequence(0, count(charSequence));
    }

    /**
     * Removes from a string both the given [prefix] and [suffix] if and only if
     * it starts with the [prefix] and ends with the [suffix].
     * Otherwise returns this string unchanged.
     */
    @NotNull
    public static String removeSurrounding(@Nullable String string, @NotNull CharSequence prefix, @NotNull CharSequence suffix) {
        if (string == null) return "";
        if ((count(string) >= prefix.length() + suffix.length()) && startsWith(string, prefix) && endsWith(string, suffix)) {
            return string.substring(prefix.length(), count(string) - suffix.length());
        }
        return string;
    }

    /**
     * When this char sequence starts with and ends with the given [delimiter],
     * returns a new char sequence having this [delimiter] removed both from the start and end.
     * Otherwise returns a new char sequence with the same characters.
     */
    @NotNull
    public static CharSequence removeSurrounding(@Nullable CharSequence charSequence, @NotNull CharSequence delimiter) {
        return removeSurrounding(charSequence, delimiter, delimiter);
    }

    /**
     * Removes the given [delimiter] string from both the start and the end of this string
     * if and only if it starts with and ends with the [delimiter].
     * Otherwise returns this string unchanged.
     */
    @NotNull
    public static String removeSurrounding(@Nullable String string, @NotNull CharSequence delimiter) {
        return removeSurrounding(string, delimiter, delimiter);
    }


    /* ******************************************* capitalize *******************************************/


    /**
     * Returns a copy of this string having its first letter uppercased, or the original string,
     * if it's empty or already starts with an upper case letter.
     */
    @NotNull
    public static String capitalize(@Nullable String string) {
        return isNotEmpty(string) && isLowerCase(string.charAt(0)) ? string.substring(0, 1).toUpperCase() + string.substring(1) : orEmpty(string);
    }

    /**
     * Returns a copy of this string having its first letter lowercased, or the original string,
     * if it's empty or already starts with a lower case letter.
     */
    @NotNull
    public static String decapitalize(@Nullable String string) {
        return isNotEmpty(string) && isUpperCase(string.charAt(0)) ? string.substring(0, 1).toLowerCase() + string.substring(1) : orEmpty(string);
    }


    /* ******************************************* limit *******************************************/


    /**
     * If the length of the character sequences exceeds the specified length, the character sequences is intercepted
     * and the specified suffix is ​​returned to return the new character sequences, otherwise it return itself.
     */
    @NotNull
    public static CharSequence limit(@Nullable CharSequence charSequence, final int length, @Nullable String suffix) {
        if (charSequence == null) return "";
        Premisex.require(length >= 0, new LazyValue<String>() {
            @NotNull
            @Override
            public String get() {
                return String.format("Desired length %d is less than zero.", length);
            }
        });
        if (count(charSequence) <= length) return charSequence;

        CharSequence limitString = charSequence.subSequence(0, length);
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
    public static CharSequence limit(@Nullable CharSequence charSequence, int length) {
        return limit(charSequence, length, null);
    }

    /**
     * If the length of the string exceeds the specified length, the string is intercepted and the specified suffix
     * is ​​returned to return the new string, otherwise it return itself.
     */
    @NotNull
    public static String limit(@Nullable String string, int length, @Nullable String suffix) {
        return limit((CharSequence) string, length, suffix).toString();
    }

    /**
     * If the length of the string exceeds the specified length, the string is intercepted and the specified suffix
     * is ​​returned to return the new string, otherwise it return itself.
     */
    @NotNull
    public static String limit(@Nullable String string, int length) {
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
    public static CharSequence padStart(@Nullable CharSequence charSequence, final int length, char padChar) {
        Premisex.require(length >= 0, new LazyValue<String>() {
            @NotNull
            @Override
            public String get() {
                return String.format("Desired length %d is less than zero.", length);
            }
        });
        if (charSequence != null && length <= count(charSequence))
            return charSequence.subSequence(0, count(charSequence));

        StringBuilder sb = new StringBuilder(length);
        for (int i = 0, size = length - count(charSequence); i < size; i++) {
            sb.append(padChar);
        }
        sb.append(charSequence);
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
    public static CharSequence padStart(@Nullable CharSequence charSequence, int length) {
        return padStart(charSequence, length, ' ');
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
    public static String padStart(@Nullable String string, int length, char padChar) {
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
    public static String padStart(@Nullable String string, int length) {
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
    public static CharSequence padEnd(@Nullable CharSequence charSequence, final int length, char padChar) {
        Premisex.require(length >= 0, new LazyValue<String>() {
            @NotNull
            @Override
            public String get() {
                return String.format("Desired length %d is less than zero.", length);
            }
        });
        if (charSequence != null && length <= count(charSequence))
            return charSequence.subSequence(0, count(charSequence));

        StringBuilder sb = new StringBuilder(length);
        sb.append(charSequence);
        for (int i = 0, size = length - count(charSequence); i < size; i++) {
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
    public static CharSequence padEnd(@Nullable CharSequence charSequence, int length) {
        return padEnd(charSequence, length, ' ');
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
    public static String padEnd(@Nullable String string, int length, char padChar) {
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
    public static String padEnd(@Nullable String string, int length) {
        return padEnd((CharSequence) string, length, ' ').toString();
    }


    /* ******************************************* matches *******************************************/


    /**
     * Returns `true` if this char sequence matches the given regular expression.
     */
    public static boolean matches(@Nullable CharSequence charSequence, @NotNull Pattern regex) {
        return charSequence != null && regex.matcher(charSequence).matches();
    }

    /**
     * Returns `true` if the specified range in this string is equal to the specified range in another string.
     *
     * @param thisOffset  the start offset in this string of the substring to compare.
     * @param other       the string against a substring of which the comparison is performed.
     * @param otherOffset the start offset in the other string of the substring to compare.
     * @param length      the length of the substring to compare.
     */
    public static boolean regionMatches(@Nullable String self, int thisOffset, @Nullable String other, int otherOffset, int length, boolean ignoreCase) {
        if (self == null || other == null) return false;
        if (!ignoreCase) {
            return self.regionMatches(thisOffset, other, otherOffset, length);
        } else {
            //noinspection ConstantConditions
            return self.regionMatches(ignoreCase, thisOffset, other, otherOffset, length);
        }
    }

    /**
     * Implementation of [regionMatches] for CharSequences.
     * Invoked when it's already known that arguments are not Strings, so that no additional type checks are performed.
     */
    public static boolean regionMatchesImpl(@Nullable CharSequence self, int thisOffset, @Nullable CharSequence other, int otherOffset, int length, boolean ignoreCase) {
        if (self == null || other == null) return false;

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


    /**
     * Returns the first character matching the given [predicate], or `null` if no such character was found.
     */
    @Nullable
    public static Character find(@Nullable CharSequence charSequence, @NotNull Predicate<Character> predicate) {
        return firstOrNull(charSequence, predicate);
    }

    /**
     * Returns the last character matching the given [predicate], or `null` if no such character was found.
     */
    @Nullable
    public static Character findLast(@Nullable CharSequence charSequence, @NotNull Predicate<Character> predicate) {
        return lastOrNull(charSequence, predicate);
    }


    @Nullable
    private static Pair<Integer, String> findAnyOf(@Nullable final CharSequence charSequence, @NotNull Collection<String> strings, int startIndex, final boolean ignoreCase, boolean last) {
        if (charSequence == null) return null;

        if (!ignoreCase && strings.size() == 1) {
            String string = Collectionx.single(strings);
            int index = !last ? indexOf(charSequence, string, startIndex, false) : lastIndexOf(charSequence, string, startIndex, false);
            return index < 0 ? null : Pair.of(index, string);
        }

        IntProgression indices = !last ? Rangex.rangeTo(Rangex.coerceAtLeast(startIndex, 0), count(charSequence))
                : Rangex.downTo(Rangex.coerceAtMost(startIndex, count(charSequence) - 1), 0);

        if (charSequence instanceof String) {
            for (final int index : indices) {
                String matchingString = Collectionx.firstOrNull(strings, new Predicate<String>() {
                    @Override
                    public boolean accept(@Nullable String s) {
                        return regionMatches(s, 0, (String) charSequence, index, count(s), ignoreCase);
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
                    public boolean accept(@Nullable String s) {
                        return regionMatchesImpl(s, 0, charSequence, index, count(s), ignoreCase);
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
    public static Pair<Integer, String> indAnyOf(@Nullable CharSequence charSequence, @NotNull Collection<String> strings, int startIndex, boolean ignoreCase) {
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
    public static Pair<Integer, String> findLastAnyOf(@Nullable CharSequence charSequence, @NotNull Collection<String> strings, int startIndex, boolean ignoreCase) {
        return findAnyOf(charSequence, strings, startIndex, ignoreCase, true);
    }


    /* ******************************************* first *******************************************/


    /**
     * Returns first character.
     *
     * @throws NoSuchElementException if the char sequence is empty.
     */
    @NotNull
    public static Character first(@Nullable CharSequence charSequence) {
        if (isNullOrEmpty(charSequence)) throw new NoSuchElementException("Char sequence is empty.");
        return charSequence.charAt(0);
    }

    /**
     * Returns the first character matching the given [predicate].
     *
     * @throws NoSuchElementException if no such character is found.
     */
    @NotNull
    public static Character first(@Nullable CharSequence charSequence, @NotNull Predicate<Character> predicate) {
        for (char element : iterable(charSequence)) if (predicate.accept(element)) return element;
        throw new NoSuchElementException("Char sequence contains no character matching the predicate.");
    }

    /**
     * Returns the first character, or `null` if the char sequence is empty.
     */
    @Nullable
    public static Character firstOrNull(@Nullable CharSequence charSequence) {
        return isNullOrEmpty(charSequence) ? null : charSequence.charAt(0);
    }

    /**
     * Returns the first character matching the given [predicate], or `null` if character was not found.
     */
    @Nullable
    public static Character firstOrNull(@Nullable CharSequence charSequence, @NotNull Predicate<Character> predicate) {
        for (char element : iterable(charSequence)) if (predicate.accept(element)) return element;
        return null;
    }


    /* ******************************************* last *******************************************/


    /**
     * Returns the last character.
     *
     * @throws NoSuchElementException if the char sequence is empty.
     */
    @NotNull
    public static Character last(@Nullable CharSequence charSequence) {
        if (isNullOrEmpty(charSequence))
            throw new NoSuchElementException("Char sequence is empty.");
        return charSequence.charAt(count(charSequence) - 1);
    }

    /**
     * Returns the last character matching the given [predicate].
     *
     * @throws NoSuchElementException if no such character is found.
     */
    @NotNull
    public static Character last(@Nullable CharSequence charSequence, @NotNull Predicate<Character> predicate) {
        if (charSequence != null) {
            for (int index : Collectionx.reversed(indices(charSequence))) {
                char element = charSequence.charAt(index);
                if (predicate.accept(element)) return element;
            }
        }
        throw new NoSuchElementException("Char sequence contains no character matching the predicate.");
    }

    /**
     * Returns the last character, or `null` if the char sequence is empty.
     */
    @Nullable
    public static Character lastOrNull(@Nullable CharSequence charSequence) {
        return isNullOrEmpty(charSequence) ? null : charSequence.charAt(count(charSequence) - 1);
    }

    /**
     * Returns the last character matching the given [predicate], or `null` if no such character was found.
     */
    @Nullable
    public static Character lastOrNull(@Nullable CharSequence charSequence, @NotNull Predicate<Character> predicate) {
        if (charSequence != null) {
            for (int index : Collectionx.reversed(indices(charSequence))) {
                char element = charSequence.charAt(index);
                if (predicate.accept(element)) return element;
            }
        }
        return null;
    }


    /* ******************************************* get *******************************************/


    /**
     * Returns a character at the given [index] or the result of calling the [defaultValue] staticction if the [index] is out of bounds of this char sequence.
     */
    @NotNull
    public static Character getOrElse(@Nullable CharSequence charSequence, int index, @NotNull IndexedDefaultValue<Character> defaultValue) {
        return charSequence != null && index >= 0 && index <= lastIndex(charSequence) ? charSequence.charAt(index) : defaultValue.get(index);
    }

    /**
     * Returns a character at the given [index] or `null` if the [index] is out of bounds of this char sequence.
     */
    @Nullable
    public static Character getOrNull(@Nullable CharSequence charSequence, int index) {
        return charSequence != null && index >= 0 && index <= lastIndex(charSequence) ? charSequence.charAt(index) : null;
    }


    /* ******************************************* indexOf *******************************************/


    private static int indexOf(@Nullable CharSequence self, @Nullable CharSequence other, int startIndex, int endIndex, boolean ignoreCase, boolean last) {
        if (self == null || other == null) return -1;
        int finalStartIndex;
        int finalEndIndex;
        int step;

        if (!last) {
            finalStartIndex = Rangex.coerceAtLeast(startIndex, 0);
            finalEndIndex = Rangex.coerceAtMost(endIndex, count(self));
            step = 1;
        } else {
            finalStartIndex = Rangex.coerceAtMost(startIndex, count(self) - 1);
            finalEndIndex = Rangex.coerceAtLeast(endIndex, 0);
            step = -1;
        }

        if (self instanceof String && other instanceof String) {
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
    public static int indexOf(@Nullable CharSequence charSequence, char delimiter, int startIndex, boolean ignoreCase) {
        if (ignoreCase || !(charSequence instanceof String)) {
            return indexOfAny(charSequence, Arrayx.charArrayOf(delimiter), startIndex, ignoreCase);
        } else {
            return ((String) charSequence).indexOf(delimiter, startIndex);
        }
    }

    /**
     * Returns the index within this string of the first occurrence of the specified character, starting from the specified [startIndex].
     *
     * @param ignoreCase `true` to ignore character case when matching a character. By default `false`.
     * @return An index of the first occurrence of [char] or -1 if none is found.
     */
    public static int indexOf(@Nullable CharSequence charSequence, char delimiter, boolean ignoreCase) {
        return indexOf(charSequence, delimiter, 0, ignoreCase);
    }

    /**
     * Returns the index within this string of the first occurrence of the specified character, starting from the specified [startIndex].
     *
     * @return An index of the first occurrence of [char] or -1 if none is found.
     */
    public static int indexOf(@Nullable CharSequence charSequence, char delimiter, int startIndex) {
        return indexOf(charSequence, delimiter, startIndex, false);
    }

    /**
     * Returns the index within this string of the first occurrence of the specified character, starting from the specified [startIndex].
     *
     * @return An index of the first occurrence of [char] or -1 if none is found.
     */
    public static int indexOf(@Nullable CharSequence charSequence, char delimiter) {
        return indexOf(charSequence, delimiter, 0, false);
    }

    /**
     * Returns the index within this char sequence of the first occurrence of the specified [string],
     * starting from the specified [startIndex].
     *
     * @param ignoreCase `true` to ignore character case when matching a string. By default `false`.
     * @return An index of the first occurrence of [string] or `-1` if none is found.
     */
    public static int indexOf(@Nullable CharSequence charSequence, @NotNull String string, int startIndex, boolean ignoreCase) {
        if (ignoreCase || !(charSequence instanceof String)) {
            return indexOf(charSequence, string, startIndex, count(charSequence), ignoreCase, false);
        } else {
            return ((String) charSequence).indexOf(string, startIndex);
        }
    }

    /**
     * Returns the index within this char sequence of the first occurrence of the specified [string],
     * starting from the specified [startIndex].
     *
     * @param ignoreCase `true` to ignore character case when matching a string. By default `false`.
     * @return An index of the first occurrence of [string] or `-1` if none is found.
     */
    public static int indexOf(@Nullable CharSequence charSequence, @NotNull String string, boolean ignoreCase) {
        return indexOf(charSequence, string, 0, ignoreCase);
    }

    /**
     * Returns the index within this char sequence of the first occurrence of the specified [string],
     * starting from the specified [startIndex].
     *
     * @return An index of the first occurrence of [string] or `-1` if none is found.
     */
    public static int indexOf(@Nullable CharSequence charSequence, @NotNull String string, int startIndex) {
        return indexOf(charSequence, string, startIndex, false);
    }

    /**
     * Returns the index within this char sequence of the first occurrence of the specified [string],
     * starting from the specified [startIndex].
     *
     * @return An index of the first occurrence of [string] or `-1` if none is found.
     */
    public static int indexOf(@Nullable CharSequence charSequence, @NotNull String string) {
        return indexOf(charSequence, string, 0, false);
    }


    /**
     * Finds the index of the first occurrence of any of the specified [chars] in this char sequence,
     * starting from the specified [startIndex] and optionally ignoring the case.
     *
     * @param ignoreCase `true` to ignore character case when matching a character. By default `false`.
     * @return An index of the first occurrence of matched character from [chars] or -1 if none of [chars] are found.
     */
    public static int indexOfAny(@Nullable CharSequence charSequence, @NotNull char[] chars, int startIndex, final boolean ignoreCase) {
        if (!ignoreCase && chars.length == 1 && charSequence instanceof String) {
            char charr = Arrayx.single(chars);
            return ((String) charSequence).indexOf(charr, startIndex);
        } else {
            if (charSequence != null) {
                for (int index = Rangex.coerceAtLeast(startIndex, 0), size = count(charSequence); index < size; index++) {
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
            }
            return -1;
        }
    }

    /**
     * Finds the index of the first occurrence of any of the specified [chars] in this char sequence,
     * starting from the specified [startIndex] and optionally ignoring the case.
     *
     * @return An index of the first occurrence of matched character from [chars] or -1 if none of [chars] are found.
     */
    public static int indexOfAny(@Nullable CharSequence charSequence, char[] chars, int startIndex) {
        return indexOfAny(charSequence, chars, startIndex, false);
    }

    /**
     * Finds the index of the first occurrence of any of the specified [chars] in this char sequence,
     * starting from the specified [startIndex] and optionally ignoring the case.
     *
     * @return An index of the first occurrence of matched character from [chars] or -1 if none of [chars] are found.
     */
    public static int indexOfAny(@Nullable CharSequence charSequence, char[] chars, final boolean ignoreCase) {
        return indexOfAny(charSequence, chars, 0, ignoreCase);
    }

    /**
     * Finds the index of the first occurrence of any of the specified [chars] in this char sequence,
     * starting from the specified [startIndex] and optionally ignoring the case.
     *
     * @return An index of the first occurrence of matched character from [chars] or -1 if none of [chars] are found.
     */
    public static int indexOfAny(@Nullable CharSequence charSequence, char[] chars) {
        return indexOfAny(charSequence, chars, 0, false);
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
    public static int indexOfAny(@Nullable CharSequence charSequence, @NotNull Collection<String> strings, int startIndex, boolean ignoreCase) {
        Pair<Integer, String> pair = findAnyOf(charSequence, strings, startIndex, ignoreCase, false);
        return pair != null ? pair.first : -1;
    }

    /**
     * Finds the index of the first occurrence of any of the specified [strings] in this char sequence,
     * starting from the specified [startIndex] and optionally ignoring the case.
     *
     * @return An index of the first occurrence of matched string from [strings] or -1 if none of [strings] are found.
     * To avoid ambiguous results when strings in [strings] have characters in common, this method proceeds from
     * the beginning to the end of this string, and finds at each position the first element in [strings]
     * that matches this string at that position.
     */
    public static int indexOfAny(@Nullable CharSequence charSequence, @NotNull Collection<String> strings, int startIndex) {
        return indexOfAny(charSequence, strings, startIndex, false);
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
    public static int indexOfAny(@Nullable CharSequence charSequence, @NotNull Collection<String> strings, boolean ignoreCase) {
        return indexOfAny(charSequence, strings, 0, ignoreCase);
    }

    /**
     * Finds the index of the first occurrence of any of the specified [strings] in this char sequence,
     * starting from the specified [startIndex] and optionally ignoring the case.
     *
     * @return An index of the first occurrence of matched string from [strings] or -1 if none of [strings] are found.
     * To avoid ambiguous results when strings in [strings] have characters in common, this method proceeds from
     * the beginning to the end of this string, and finds at each position the first element in [strings]
     * that matches this string at that position.
     */
    public static int indexOfAny(@Nullable CharSequence charSequence, @NotNull Collection<String> strings) {
        return indexOfAny(charSequence, strings, 0, false);
    }


    /**
     * Returns index of the first character matching the given [predicate], or -1 if the char sequence does not contain such character.
     */
    public static int indexOfFirst(@Nullable CharSequence charSequence, @NotNull Predicate<Character> predicate) {
        if (charSequence != null) {
            for (int index : indices(charSequence)) {
                if (predicate.accept(charSequence.charAt(index))) {
                    return index;
                }
            }
        }
        return -1;
    }

    /**
     * Returns index of the last character matching the given [predicate], or -1 if the char sequence does not contain such character.
     */
    public static int indexOfLast(@Nullable CharSequence charSequence, @NotNull Predicate<Character> predicate) {
        if (charSequence != null) {
            for (int index : Collectionx.reversed(indices(charSequence))) {
                if (predicate.accept(charSequence.charAt(index))) {
                    return index;
                }
            }
        }
        return -1;
    }


    /**
     * Returns the index within this char sequence of the last occurrence of the specified character,
     * starting from the specified [startIndex].
     *
     * @param startIndex The index of character to start searching at. The search proceeds backward toward the beginning of the string.
     * @param ignoreCase `true` to ignore character case when matching a character. By default `false`.
     * @return An index of the first occurrence of [char] or -1 if none is found.
     */
    public static int lastIndexOf(@Nullable CharSequence charSequence, char charr, int startIndex, boolean ignoreCase) {
        if (ignoreCase || !(charSequence instanceof String)) {
            return lastIndexOfAny(charSequence, Arrayx.charArrayOf(charr), startIndex, ignoreCase);
        } else {
            return ((String) charSequence).lastIndexOf(charr, startIndex);
        }
    }

    /**
     * Returns the index within this char sequence of the last occurrence of the specified character,
     * starting from the specified [startIndex].
     *
     * @param startIndex The index of character to start searching at. The search proceeds backward toward the beginning of the string.
     * @return An index of the first occurrence of [char] or -1 if none is found.
     */
    public static int lastIndexOf(@Nullable CharSequence charSequence, char charr, int startIndex) {
        return lastIndexOf(charSequence, charr, startIndex, false);
    }

    /**
     * Returns the index within this char sequence of the last occurrence of the specified character,
     * starting from the specified [startIndex].
     *
     * @param ignoreCase `true` to ignore character case when matching a character. By default `false`.
     * @return An index of the first occurrence of [char] or -1 if none is found.
     */
    public static int lastIndexOf(@Nullable CharSequence charSequence, char charr, boolean ignoreCase) {
        return lastIndexOf(charSequence, charr, 0, ignoreCase);
    }

    /**
     * Returns the index within this char sequence of the last occurrence of the specified character,
     * starting from the specified [startIndex].
     *
     * @return An index of the first occurrence of [char] or -1 if none is found.
     */
    public static int lastIndexOf(@Nullable CharSequence charSequence, char charr) {
        return lastIndexOf(charSequence, charr, 0, false);
    }

    /**
     * Returns the index within this char sequence of the last occurrence of the specified [string],
     * starting from the specified [startIndex].
     *
     * @param startIndex The index of character to start searching at. The search proceeds backward toward the beginning of the string.
     * @param ignoreCase `true` to ignore character case when matching a string. By default `false`.
     * @return An index of the first occurrence of [string] or -1 if none is found.
     */
    public static int lastIndexOf(@Nullable CharSequence charSequence, @NotNull String string, int startIndex, boolean ignoreCase) {
        if (ignoreCase || !(charSequence instanceof String)) {
            return indexOf(charSequence, string, startIndex, 0, ignoreCase, true);
        } else {
            return ((String) charSequence).lastIndexOf(string, startIndex);
        }
    }

    /**
     * Returns the index within this char sequence of the last occurrence of the specified [string],
     * starting from the specified [startIndex].
     *
     * @param startIndex The index of character to start searching at. The search proceeds backward toward the beginning of the string.
     * @return An index of the first occurrence of [string] or -1 if none is found.
     */
    public static int lastIndexOf(@Nullable CharSequence charSequence, @NotNull String string, int startIndex) {
        return lastIndexOf(charSequence, string, startIndex, false);
    }

    /**
     * Returns the index within this char sequence of the last occurrence of the specified [string],
     * starting from the specified [startIndex].
     *
     * @param ignoreCase `true` to ignore character case when matching a string. By default `false`.
     * @return An index of the first occurrence of [string] or -1 if none is found.
     */
    public static int lastIndexOf(@Nullable CharSequence charSequence, @NotNull String string, boolean ignoreCase) {
        return lastIndexOf(charSequence, string, 0, ignoreCase);
    }

    /**
     * Returns the index within this char sequence of the last occurrence of the specified [string],
     * starting from the specified [startIndex].
     *
     * @return An index of the first occurrence of [string] or -1 if none is found.
     */
    public static int lastIndexOf(@Nullable CharSequence charSequence, @NotNull String string) {
        return lastIndexOf(charSequence, string, 0, false);
    }


    /**
     * Finds the index of the last occurrence of any of the specified [chars] in this char sequence,
     * starting from the specified [startIndex] and optionally ignoring the case.
     *
     * @param startIndex The index of character to start searching at. The search proceeds backward toward the beginning of the string.
     * @param ignoreCase `true` to ignore character case when matching a character. By default `false`.
     * @return An index of the last occurrence of matched character from [chars] or -1 if none of [chars] are found.
     */
    public static int lastIndexOfAny(@Nullable CharSequence charSequence, char[] chars, int startIndex, final boolean ignoreCase) {
        if (charSequence == null) return -1;

        if (!ignoreCase && chars.length == 1 && charSequence instanceof String) {
            char charr = Arrayx.single(chars);
            return ((String) charSequence).lastIndexOf(charr, startIndex);
        }

        for (int index : Rangex.downTo(Rangex.coerceAtMost(startIndex, count(charSequence) - 1), 0)) {
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

    /**
     * Finds the index of the last occurrence of any of the specified [chars] in this char sequence,
     * starting from the specified [startIndex] and optionally ignoring the case.
     *
     * @param startIndex The index of character to start searching at. The search proceeds backward toward the beginning of the string.
     * @return An index of the last occurrence of matched character from [chars] or -1 if none of [chars] are found.
     */
    public static int lastIndexOfAny(@Nullable CharSequence charSequence, char[] chars, int startIndex) {
        return lastIndexOfAny(charSequence, chars, startIndex, false);
    }

    /**
     * Finds the index of the last occurrence of any of the specified [chars] in this char sequence,
     * starting from the specified [startIndex] and optionally ignoring the case.
     *
     * @param ignoreCase `true` to ignore character case when matching a character. By default `false`.
     * @return An index of the last occurrence of matched character from [chars] or -1 if none of [chars] are found.
     */
    public static int lastIndexOfAny(@Nullable CharSequence charSequence, char[] chars, final boolean ignoreCase) {
        return lastIndexOfAny(charSequence, chars, 0, ignoreCase);
    }

    /**
     * Finds the index of the last occurrence of any of the specified [chars] in this char sequence,
     * starting from the specified [startIndex] and optionally ignoring the case.
     *
     * @return An index of the last occurrence of matched character from [chars] or -1 if none of [chars] are found.
     */
    public static int lastIndexOfAny(@Nullable CharSequence charSequence, char[] chars) {
        return lastIndexOfAny(charSequence, chars, 0, false);
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
    public static int lastIndexOfAny(@Nullable CharSequence charSequence, @NotNull Collection<String> strings, int startIndex, boolean ignoreCase) {
        Pair<Integer, String> pair = findAnyOf(charSequence, strings, startIndex, ignoreCase, true);
        return pair != null ? pair.first : -1;
    }

    /**
     * Finds the index of the last occurrence of any of the specified [strings] in this char sequence,
     * starting from the specified [startIndex] and optionally ignoring the case.
     *
     * @param startIndex The index of character to start searching at. The search proceeds backward toward the beginning of the string.
     * @return An index of the last occurrence of matched string from [strings] or -1 if none of [strings] are found.
     * To avoid ambiguous results when strings in [strings] have characters in common, this method proceeds from
     * the end toward the beginning of this string, and finds at each position the first element in [strings]
     * that matches this string at that position.
     */
    public static int lastIndexOfAny(@Nullable CharSequence charSequence, @NotNull Collection<String> strings, int startIndex) {
        return lastIndexOfAny(charSequence, strings, startIndex, false);
    }

    /**
     * Finds the index of the last occurrence of any of the specified [strings] in this char sequence,
     * starting from the specified [startIndex] and optionally ignoring the case.
     *
     * @param ignoreCase `true` to ignore character case when matching a string. By default `false`.
     * @return An index of the last occurrence of matched string from [strings] or -1 if none of [strings] are found.
     * To avoid ambiguous results when strings in [strings] have characters in common, this method proceeds from
     * the end toward the beginning of this string, and finds at each position the first element in [strings]
     * that matches this string at that position.
     */
    public static int lastIndexOfAny(@Nullable CharSequence charSequence, @NotNull Collection<String> strings, boolean ignoreCase) {
        return lastIndexOfAny(charSequence, strings, 0, ignoreCase);
    }

    /**
     * Finds the index of the last occurrence of any of the specified [strings] in this char sequence,
     * starting from the specified [startIndex] and optionally ignoring the case.
     *
     * @return An index of the last occurrence of matched string from [strings] or -1 if none of [strings] are found.
     * To avoid ambiguous results when strings in [strings] have characters in common, this method proceeds from
     * the end toward the beginning of this string, and finds at each position the first element in [strings]
     * that matches this string at that position.
     */
    public static int lastIndexOfAny(@Nullable CharSequence charSequence, @NotNull Collection<String> strings) {
        return lastIndexOfAny(charSequence, strings, 0, false);
    }


    /* ******************************************* substring *******************************************/


    /**
     * Returns a substring specified by the given [range] of indices.
     */
    @NotNull
    public static String substring(@Nullable String string, @NotNull IntRange range) {
        return orEmpty(string).substring(range.getStart(), range.getEndInclusive() + 1);
    }

    /**
     * Returns a subsequence of this char sequence specified by the given [range] of indices.
     */
    @NotNull
    public static CharSequence subSequence(@Nullable CharSequence charSequence, @NotNull IntRange range) {
        return orEmpty(charSequence).subSequence(range.getStart(), range.getEndInclusive() + 1);
    }

    /**
     * Returns a substring of chars from a range of this char sequence starting at the [startIndex] and ending right before the [endIndex].
     *
     * @param startIndex the start index (inclusive).
     * @param endIndex   the end index (exclusive). If not specified, the length of the char sequence is used.
     */
    @NotNull
    public static String substring(@Nullable CharSequence charSequence, int startIndex, int endIndex) {
        return orEmpty(charSequence).subSequence(startIndex, endIndex).toString();
    }

    /**
     * Returns a substring of chars at indices from the specified [range] of this char sequence.
     */
    @NotNull
    public static String substring(@Nullable CharSequence charSequence, @NotNull IntRange range) {
        return orEmpty(charSequence).subSequence(range.getStart(), range.getEndInclusive() + 1).toString();
    }

    /**
     * Returns a substring before the first occurrence of [delimiter].
     * If the string does not contain the delimiter, returns [missingDelimiterValue] which defaults to the original string.
     */
    @NotNull
    public static String substringBefore(@Nullable String string, char delimiter, @Nullable String missingDelimiterValue) {
        int index = indexOf(string, delimiter, 0, false);
        return index == -1 ? orDefault(missingDelimiterValue, orEmpty(string)) : orEmpty(string).substring(0, index);
    }

    /**
     * Returns a substring before the first occurrence of [delimiter].
     * If the string does not contain the delimiter, returns [missingDelimiterValue] which defaults to the original string.
     */
    @NotNull
    public static String substringBefore(@Nullable String string, @NotNull String delimiter, @Nullable String missingDelimiterValue) {
        int index = indexOf(string, delimiter, 0, false);
        return index == -1 ? orDefault(missingDelimiterValue, orEmpty(string)) : orEmpty(string).substring(0, index);
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
        return index == -1 ? missingDelimiterValue : string.substring(index + 1);
    }

    /**
     * Returns a substring after the first occurrence of [delimiter].
     * If the string does not contain the delimiter, returns [missingDelimiterValue] which defaults to the original string.
     */
    @NotNull
    public static String substringAfter(@Nullable String string, @NotNull String delimiter, @Nullable String missingDelimiterValue) {
        int index = indexOf(string, delimiter, 0, false);
        return index == -1 ? orDefault(missingDelimiterValue, orEmpty(string)) : orEmpty(string).substring(index + delimiter.length());
    }

    /**
     * Returns a substring before the last occurrence of [delimiter].
     * If the string does not contain the delimiter, returns [missingDelimiterValue] which defaults to the original string.
     */
    @NotNull
    public static String substringBeforeLast(@Nullable String string, char delimiter, @Nullable String missingDelimiterValue) {
        int index = lastIndexOf(string, delimiter, count(string) - 1, false);
        return index == -1 ? orDefault(missingDelimiterValue, orEmpty(string)) : orEmpty(string).substring(0, index);
    }

    /**
     * Returns a substring before the last occurrence of [delimiter].
     * If the string does not contain the delimiter, returns [missingDelimiterValue] which defaults to the original string.
     */
    @NotNull
    public static String substringBeforeLast(@Nullable String string, @NotNull String delimiter, @Nullable String missingDelimiterValue) {
        int index = lastIndexOf(string, delimiter, count(string) - 1, false);
        return index == -1 ? orDefault(missingDelimiterValue, orEmpty(string)) : orEmpty(string).substring(0, index);
    }

    /**
     * Returns a substring after the last occurrence of [delimiter].
     * If the string does not contain the delimiter, returns [missingDelimiterValue] which defaults to the original string.
     */
    @NotNull
    public static String substringAfterLast(@Nullable String string, char delimiter, @Nullable String missingDelimiterValue) {
        int index = lastIndexOf(string, delimiter, count(string) - 1, false);
        return index == -1 ? orDefault(missingDelimiterValue, orEmpty(string)) : orEmpty(string).substring(index + 1);
    }

    /**
     * Returns a substring after the last occurrence of [delimiter].
     * If the string does not contain the delimiter, returns [missingDelimiterValue] which defaults to the original string.
     */
    @NotNull
    public static String substringAfterLast(@Nullable String string, @NotNull String delimiter, @Nullable String missingDelimiterValue) {
        int index = lastIndexOf(string, delimiter, count(string) - 1, false);
        return index == -1 ? orDefault(missingDelimiterValue, orEmpty(string)) : orEmpty(string).substring(index + delimiter.length());
    }


    /* ******************************************* toByteArray *******************************************/


    /**
     * Encodes the contents of this string using the specified character set and returns the resulting byte array.
     */
    @NotNull
    public static byte[] toByteArray(@Nullable String string, @NotNull Charset charset) {
        return string != null ? string.getBytes(charset) : new byte[0];
    }

    /**
     * Encodes the contents of this string using UTF-8 set and returns the resulting byte array.
     */
    @NotNull
    public static byte[] toByteArray(@Nullable String string) {
        return string != null ? string.getBytes() : new byte[0];
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


    /**
     * Returns a sub sequence of this char sequence having leading and trailing characters matching the [predicate] removed.
     */
    @NotNull
    public static CharSequence trim(@Nullable CharSequence charSequence, @NotNull Predicate<Character> predicate) {
        if (charSequence == null) return "";

        int startIndex = 0;
        int endIndex = count(charSequence) - 1;
        boolean startFound = false;

        while (startIndex <= endIndex) {
            int index = !startFound ? startIndex : endIndex;
            boolean match = predicate.accept(charSequence.charAt(index));

            if (!startFound) {
                if (!match)
                    startFound = true;
                else
                    startIndex += 1;
            } else {
                if (!match)
                    break;
                else
                    endIndex -= 1;
            }
        }

        return charSequence.subSequence(startIndex, endIndex + 1);
    }

    /**
     * Returns a string having leading and trailing characters matching the [predicate] removed.
     */
    @NotNull
    public static String trim(@Nullable String string, @NotNull Predicate<Character> predicate) {
        return trim((CharSequence) string, predicate).toString();
    }

    /**
     * Returns a sub sequence of this char sequence having leading characters matching the [predicate] removed.
     */
    @NotNull
    public static CharSequence trimStart(@Nullable CharSequence charSequence, @NotNull Predicate<Character> predicate) {
        if (charSequence == null) return "";

        for (int index : indices(charSequence)) {
            if (!predicate.accept(charSequence.charAt(index))) {
                return charSequence.subSequence(index, count(charSequence));
            }
        }
        return "";
    }

    /**
     * Returns a string having leading characters matching the [predicate] removed.
     */
    @NotNull
    public static String trimStart(@Nullable String string, @NotNull Predicate<Character> predicate) {
        return trimStart((CharSequence) string, predicate).toString();
    }

    /**
     * Returns a sub sequence of this char sequence having trailing characters matching the [predicate] removed.
     */
    @NotNull
    public static CharSequence trimEnd(@Nullable CharSequence charSequence, @NotNull Predicate<Character> predicate) {
        if (charSequence == null) return "";

        for (int index : Collectionx.reversed(indices(charSequence))) {
            if (!predicate.accept(charSequence.charAt(index))) {
                return charSequence.subSequence(0, index + 1);
            }
        }
        return "";
    }

    /**
     * Returns a string having trailing characters matching the [predicate] removed.
     */
    @NotNull
    public static String trimEnd(@Nullable String string, @NotNull Predicate<Character> predicate) {
        return trimEnd((CharSequence) string, predicate).toString();
    }

    /**
     * Returns a sub sequence of this char sequence having leading and trailing characters from the [chars] array removed.
     */
    @NotNull
    public static CharSequence trim(@Nullable CharSequence charSequence, final char... chars) {
        return trim(charSequence, new Predicate<Character>() {
            @Override
            public boolean accept(@NotNull Character character) {
                return Arrayx.contains(chars, character);
            }
        });
    }

    /**
     * Returns a string having leading and trailing characters from the [chars] array removed.
     */
    @NotNull
    public static String trim(@Nullable String string, final char... chars) {
        return trim(string, new Predicate<Character>() {
            @Override
            public boolean accept(@NotNull Character character) {
                return Arrayx.contains(chars, character);
            }
        });
    }

    /**
     * Returns a sub sequence of this char sequence having leading characters from the [chars] array removed.
     */
    @NotNull
    public static CharSequence trimStart(@Nullable CharSequence charSequence, final char... chars) {
        return trimStart(charSequence, new Predicate<Character>() {
            @Override
            public boolean accept(@NotNull Character character) {
                return Arrayx.contains(chars, character);
            }
        });
    }

    /**
     * Returns a string having leading characters from the [chars] array removed.
     */
    @NotNull
    public static String trimStart(@Nullable String string, final char... chars) {
        return trimStart(string, new Predicate<Character>() {
            @Override
            public boolean accept(@NotNull Character character) {
                return Arrayx.contains(chars, character);
            }
        });
    }

    /**
     * Returns a sub sequence of this char sequence having trailing characters from the [chars] array removed.
     */
    @NotNull
    public static CharSequence trimEnd(@Nullable CharSequence charSequence, final char... chars) {
        return trimEnd(charSequence, new Predicate<Character>() {
            @Override
            public boolean accept(@NotNull Character character) {
                return Arrayx.contains(chars, character);
            }
        });
    }

    /**
     * Returns a string having trailing characters from the [chars] array removed.
     */
    @NotNull
    public static String trimEnd(@Nullable String string, final char... chars) {
        return trimEnd(string, new Predicate<Character>() {
            @Override
            public boolean accept(@NotNull Character character) {
                return Arrayx.contains(chars, character);
            }
        });
    }

    /**
     * Returns a sub sequence of this char sequence having leading and trailing whitespace removed.
     */
    @NotNull
    public static CharSequence trim(@Nullable CharSequence charSequence) {
        return trim(charSequence, new Predicate<Character>() {
            @Override
            public boolean accept(@NotNull Character character) {
                return Character.isWhitespace(character);
            }
        });
    }

    /**
     * Returns a string having leading and trailing whitespace removed.
     */
    @NotNull
    public static String trim(@Nullable String string) {
        return trim((CharSequence) string).toString();
    }

    /**
     * Returns a sub sequence of this char sequence having leading whitespace removed.
     */
    @NotNull
    public static CharSequence trimStart(@Nullable CharSequence charSequence) {
        return trimStart(charSequence, new Predicate<Character>() {
            @Override
            public boolean accept(@NotNull Character character) {
                return Character.isWhitespace(character);
            }
        });
    }

    /**
     * Returns a string having leading whitespace removed.
     */
    @NotNull
    public static String trimStart(@Nullable String string) {
        return trimStart((CharSequence) string).toString();
    }

    /**
     * Returns a sub sequence of this char sequence having trailing whitespace removed.
     */
    @NotNull
    public static CharSequence trimEnd(@Nullable CharSequence charSequence) {
        return trimEnd(charSequence, new Predicate<Character>() {
            @Override
            public boolean accept(@NotNull Character character) {
                return Character.isWhitespace(character);
            }
        });
    }

    /**
     * Returns a string having trailing whitespace removed.
     */
    @NotNull
    public static String trimEnd(@Nullable String string) {
        return trimEnd((CharSequence) string).toString();
    }


    /* ******************************************* iterator *******************************************/


    /**
     * Iterator for characters of the given char sequence.
     */
    @NotNull
    public static Iterator<Character> iterator(@Nullable final CharSequence charSequence) {
        return new CharSequenceIterator(orEmpty(charSequence));
    }

    /**
     * Iterator for characters of the given char sequence.
     */
    @NotNull
    public static Iterable<Character> iterable(@Nullable final CharSequence charSequence) {
        return new CharSequenceIterable(orEmpty(charSequence));
    }


    /* ******************************************* replace *******************************************/


    /**
     * Returns a char sequence with content of this char sequence where its part at the given range
     * is replaced with the [replacement] char sequence.
     *
     * @param startIndex the index of the first character to be replaced.
     * @param endIndex   the index of the first character after the replacement to keep in the string.
     */
    @NotNull
    public static CharSequence replaceRange(@Nullable final CharSequence charSequence, int startIndex, int endIndex, @NotNull CharSequence replacement) {
        if (endIndex < startIndex)
            throw new IndexOutOfBoundsException("End index (" + endIndex + ") is less than start index (" + startIndex + ").");
        StringBuilder sb = new StringBuilder();
        sb.append(charSequence, 0, startIndex);
        sb.append(replacement);
        sb.append(charSequence, endIndex, count(charSequence));
        return sb;
    }

    /**
     * Replaces the part of the string at the given range with the [replacement] char sequence.
     *
     * @param startIndex the index of the first character to be replaced.
     * @param endIndex   the index of the first character after the replacement to keep in the string.
     */
    @NotNull
    public static String replaceRange(@Nullable String string, int startIndex, int endIndex, @NotNull CharSequence replacement) {
        return replaceRange(((CharSequence) string), startIndex, endIndex, replacement).toString();
    }

    /**
     * Returns a char sequence with content of this char sequence where its part at the given [range]
     * is replaced with the [replacement] char sequence.
     * <p>
     * The end index of the [range] is included in the part to be replaced.
     */
    @NotNull
    public static CharSequence replaceRange(@Nullable final CharSequence charSequence, @NotNull IntRange range, @NotNull CharSequence replacement) {
        return replaceRange(charSequence, range.getStart(), range.getEndInclusive() + 1, replacement);
    }

    /**
     * Replace the part of string at the given [range] with the [replacement] string.
     * <p>
     * The end index of the [range] is included in the part to be replaced.
     */
    @NotNull
    public static String replaceRange(@Nullable String string, IntRange range, @NotNull CharSequence replacement) {
        return replaceRange(((CharSequence) string), range, replacement).toString();
    }

    /**
     * Replace part of string before the first occurrence of given delimiter with the [replacement] string.
     * If the string does not contain the delimiter, returns [missingDelimiterValue] which defaults to the original string.
     */
    @NotNull
    public static String replaceBefore(@Nullable String string, char delimiter, @NotNull String replacement, @Nullable String missingDelimiterValue) {
        if (string == null) return "";
        int index = string.indexOf(delimiter);
        String finalMissingDelimiterValue = missingDelimiterValue != null ? missingDelimiterValue : string;
        return index == -1 ? finalMissingDelimiterValue : replaceRange(string, 0, index, replacement);
    }

    /**
     * Replace part of string before the first occurrence of given delimiter with the [replacement] string.
     * If the string does not contain the delimiter, returns [missingDelimiterValue] which defaults to the original string.
     */
    @NotNull
    public static String replaceBefore(@Nullable String string, @NotNull String delimiter, @NotNull String replacement, @Nullable String missingDelimiterValue) {
        if (string == null) return "";
        int index = string.indexOf(delimiter);
        String finalMissingDelimiterValue = missingDelimiterValue != null ? missingDelimiterValue : string;
        return index == -1 ? finalMissingDelimiterValue : replaceRange(string, 0, index, replacement);
    }

    /**
     * Replace part of string after the first occurrence of given delimiter with the [replacement] string.
     * If the string does not contain the delimiter, returns [missingDelimiterValue] which defaults to the original string.
     */
    @NotNull
    public static String replaceAfter(@Nullable String string, char delimiter, @NotNull String replacement, @Nullable String missingDelimiterValue) {
        if (string == null) return "";
        int index = string.indexOf(delimiter);
        String finalMissingDelimiterValue = missingDelimiterValue != null ? missingDelimiterValue : string;
        return index == -1 ? finalMissingDelimiterValue : replaceRange(string, index + 1, count(string), replacement);
    }

    /**
     * Replace part of string after the first occurrence of given delimiter with the [replacement] string.
     * If the string does not contain the delimiter, returns [missingDelimiterValue] which defaults to the original string.
     */
    @NotNull
    public static String replaceAfter(@Nullable String string, @NotNull String delimiter, @NotNull String replacement, @Nullable String missingDelimiterValue) {
        if (string == null) return "";
        int index = string.indexOf(delimiter);
        String finalMissingDelimiterValue = missingDelimiterValue != null ? missingDelimiterValue : string;
        return index == -1 ? finalMissingDelimiterValue : replaceRange(string, index + delimiter.length(), count(string), replacement);
    }

    /**
     * Replace part of string after the last occurrence of given delimiter with the [replacement] string.
     * If the string does not contain the delimiter, returns [missingDelimiterValue] which defaults to the original string.
     */
    @NotNull
    public static String replaceAfterLast(@Nullable String string, @NotNull String delimiter, @NotNull String replacement, @Nullable String missingDelimiterValue) {
        if (string == null) return "";
        int index = string.lastIndexOf(delimiter);
        String finalMissingDelimiterValue = missingDelimiterValue != null ? missingDelimiterValue : string;
        return index == -1 ? finalMissingDelimiterValue : replaceRange(string, index + delimiter.length(), count(string), replacement);
    }

    /**
     * Replace part of string after the last occurrence of given delimiter with the [replacement] string.
     * If the string does not contain the delimiter, returns [missingDelimiterValue] which defaults to the original string.
     */
    @NotNull
    public static String replaceAfterLast(@Nullable String string, char delimiter, @NotNull String replacement, @Nullable String missingDelimiterValue) {
        if (string == null) return "";
        int index = string.lastIndexOf(delimiter);
        String finalMissingDelimiterValue = missingDelimiterValue != null ? missingDelimiterValue : string;
        return index == -1 ? finalMissingDelimiterValue : replaceRange(string, index + 1, count(string), replacement);
    }

    /**
     * Replace part of string before the last occurrence of given delimiter with the [replacement] string.
     * If the string does not contain the delimiter, returns [missingDelimiterValue] which defaults to the original string.
     */
    @NotNull
    public static String replaceBeforeLast(@Nullable String string, char delimiter, @NotNull String replacement, @Nullable String missingDelimiterValue) {
        if (string == null) return "";
        int index = string.lastIndexOf(delimiter);
        String finalMissingDelimiterValue = missingDelimiterValue != null ? missingDelimiterValue : string;
        return index == -1 ? finalMissingDelimiterValue : replaceRange(string, 0, index, replacement);
    }

    /**
     * Replace part of string before the last occurrence of given delimiter with the [replacement] string.
     * If the string does not contain the delimiter, returns [missingDelimiterValue] which defaults to the original string.
     */
    @NotNull
    public static String replaceBeforeLast(@Nullable String string, @NotNull String delimiter, @NotNull String replacement, @Nullable String missingDelimiterValue) {
        if (string == null) return "";
        int index = string.lastIndexOf(delimiter);
        String finalMissingDelimiterValue = missingDelimiterValue != null ? missingDelimiterValue : string;
        return index == -1 ? finalMissingDelimiterValue : replaceRange(string, 0, index, replacement);
    }


// public static String.replace(oldChar: Character, newChar: Character, ignoreCase: Boolean): String // JVM- and JS-specific
// public static String.replace(oldValue: String, newValue: String, ignoreCase: Boolean): String // JVM- and JS-specific

    /**
     * Returns a new string obtained by replacing each substring of this char sequence that matches the given regular expression
     * with the given [replacement].
     * <p>
     * The [replacement] can consist of any combination of literal text and $-substitutions. To treat the replacement string
     * literally escape it with the [kotlin.text.Regex.Companion.escapeReplacement] method.
     */
    @NotNull
    public static String replace(@Nullable final CharSequence charSequence, @NotNull Pattern regex, @NotNull String replacement) {
        if (charSequence == null) return "";
        return regex.matcher(charSequence).replaceAll(replacement);
    }

///**
// * Returns a new string obtained by replacing each substring of this char sequence that matches the given regular expression
// * with the result of the given function [transform] that takes [MatchResult] and returns a string to be used as a
// * replacement for that match.
// */
//    @kotlin.internal.InlineOnly
//    public static CharSequence.replace(regex: Regex, noinline transform: (MatchResult) -> CharSequence): String =
//            regex.replace(this, transform)

    /**
     * Replaces the first occurrence of the given regular expression [regex] in this char sequence with specified [replacement] expression.
     *
     * @param replacement A replacement expression that can include substitutions. See [Regex.replaceFirst] for details.
     */
    @NotNull
    public static String replaceFirst(@Nullable final CharSequence charSequence, @NotNull Pattern regex, @NotNull String replacement) {
        if (charSequence == null) return "";
        return regex.matcher(charSequence).replaceFirst(replacement);
    }


    /* ******************************************* commonWith *******************************************/


    /**
     * Returns the longest string `prefix` such that this char sequence and [other] char sequence both start with this prefix,
     * taking care not to split surrogate pairs.
     * If this and [other] have no common prefix, returns the empty string.
     *
     * @param ignoreCase `true` to ignore character case when matching a character. By default `false`.
     */
    @NotNull
    public static String commonPrefixWith(@Nullable CharSequence charSequence, @Nullable CharSequence other, boolean ignoreCase) {
        if (charSequence == null || other == null) return "";
        int shortestLength = Math.min(count(charSequence), other.length());

        int i = 0;
        while (i < shortestLength && Charx.equals(charSequence.charAt(i), other.charAt(i), ignoreCase)) {
            i++;
        }
        if (hasSurrogatePairAt(charSequence, i - 1) || hasSurrogatePairAt(other, i - 1)) {
            i--;
        }
        return charSequence.subSequence(0, i).toString();
    }

    /**
     * Returns the longest string `suffix` such that this char sequence and [other] char sequence both end with this suffix,
     * taking care not to split surrogate pairs.
     * If this and [other] have no common suffix, returns the empty string.
     *
     * @param ignoreCase `true` to ignore character case when matching a character. By default `false`.
     */
    public static String commonSuffixWith(@Nullable CharSequence charSequence, @Nullable CharSequence other, boolean ignoreCase) {
        if (charSequence == null || other == null) return "";
        int thisLength = count(charSequence);
        int otherLength = other.length();
        int shortestLength = Math.min(thisLength, otherLength);

        int i = 0;
        while (i < shortestLength && Charx.equals(charSequence.charAt(thisLength - i - 1), other.charAt(otherLength - i - 1), ignoreCase)) {
            i++;
        }
        if (hasSurrogatePairAt(charSequence, thisLength - i - 1) || hasSurrogatePairAt(other, otherLength - i - 1)) {
            i--;
        }
        return charSequence.subSequence(thisLength - i, thisLength).toString();
    }


    /* ******************************************* contains *******************************************/


    /**
     * Returns `true` if this char sequence contains the specified [other] sequence of characters as a substring.
     *
     * @param ignoreCase `true` to ignore character case when comparing strings. By default `false`.
     */
    public static boolean contains(@Nullable CharSequence charSequence, @NotNull CharSequence other, boolean ignoreCase) {
        if (other instanceof String) {
            return indexOf(charSequence, (String) other, ignoreCase) >= 0;
        } else {
            return indexOf(charSequence, other, 0, count(charSequence), ignoreCase, false) >= 0;
        }
    }

    /**
     * Returns `true` if this char sequence contains the specified character [char].
     *
     * @param ignoreCase `true` to ignore character case when comparing characters. By default `false`.
     */
    public static boolean contains(@Nullable CharSequence charSequence, char cha, boolean ignoreCase) {
        return indexOf(charSequence, cha, ignoreCase) >= 0;
    }

    /**
     * Returns `true` if this char sequence contains at least one match of the specified regular expression [regex].
     */
    public static boolean contains(@Nullable CharSequence charSequence, @NotNull Pattern regex) {
        return charSequence != null && regex.matcher(charSequence).find();
    }

//    /**
//     * Returns a sequence of index ranges of substrings in this char sequence around occurrences of the specified [delimiters].
//     *
//     * @param delimiters One or more characters to be used as delimiters.
//     * @param startIndex The index to start searching delimiters from.
//     *  No range having its start value less than [startIndex] is returned.
//     *  [startIndex] is coerced to be non-negative and not greater than length of this string.
//     * @param ignoreCase `true` to ignore character case when matching a delimiter. By default `false`.
//     * @param limit The maximum number of substrings to return. Zero by default means no limit is set.
//     */
//    private static CharSequence.rangesDelimitedBy(delimiters: CharArray,int startIndex = 0, ignoreCase: Boolean = false, limit: Int = 0): Sequence<IntRange> {
//        require(limit >= 0, { "Limit must be non-negative, but was $limit." })
//
//        return DelimitedRangesSequence(this, startIndex, limit, { startIndex ->
//                indexOfAny(delimiters, startIndex, ignoreCase = ignoreCase).let { if (it < 0) null else it to 1 }
//    })
//    }
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
//    private static CharSequence.rangesDelimitedBy(delimiters: Array<out String>,int startIndex = 0, ignoreCase: Boolean = false, limit: Int = 0): Sequence<IntRange> {
//        require(limit >= 0, { "Limit must be non-negative, but was $limit." } )
//        val delimitersList = delimiters.asList()
//
//        return DelimitedRangesSequence(this, startIndex, limit, { startIndex -> findAnyOf(delimitersList, startIndex, ignoreCase = ignoreCase, last = false)?.let { it.first to it.second.length } })
//
//    }
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
//    public static CharSequence.splitToSequence(vararg delimiters: String, ignoreCase: Boolean = false, limit: Int = 0): Sequence<String> =
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
//    public static CharSequence.split(vararg delimiters: String, ignoreCase: Boolean = false, limit: Int = 0): List<String> {
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
//    public static CharSequence.splitToSequence(vararg delimiters: Character, ignoreCase: Boolean = false, limit: Int = 0): Sequence<String> =
//    rangesDelimitedBy(delimiters, ignoreCase = ignoreCase, limit = limit).map { substring(it) }
//
//    /**
//     * Splits this char sequence to a list of strings around occurrences of the specified [delimiters].
//     *
//     * @param delimiters One or more characters to be used as delimiters.
//     * @param ignoreCase `true` to ignore character case when matching a delimiter. By default `false`.
//     * @param limit The maximum number of substrings to return.
//     */
//    public static CharSequence.split(vararg delimiters: Character, ignoreCase: Boolean = false, limit: Int = 0): List<String> {
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
//    private static List<String> CharSequence.split(@Nullable String delimiter, ignoreCase: Boolean, limit: Int):  {
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
//    public static List<String> CharSequence.split(Regex regex, limit: Int = 0):  = regex.split(this, limit)
//
//    /**
//     * Splits this char sequence to a sequence of lines delimited by any of the following character sequences: CRLF, LF or CR.
//     */
//    public static CharSequence.lineSequence(): Sequence<String> = splitToSequence("\r\n", "\n", "\r")
//
//    /**
//     * * Splits this char sequence to a list of lines delimited by any of the following character sequences: CRLF, LF or CR.
//     */
//    public static CharSequence.lines(): List<String> = lineSequence().toList()


    /* ******************************************* elementAt *******************************************/


    /**
     * Returns a character at the given [index] or throws an [IndexOutOfBoundsException] if the [index] is out of bounds of this char sequence.
     */
    public static char elementAt(@NotNull CharSequence charSequence, int index) {
        return charSequence.charAt(index);
    }

    /**
     * Returns a character at the given [index] or the result of calling the [defaultValue] function if the [index] is out of bounds of this char sequence.
     */
    public static char elementAtOrElse(@Nullable CharSequence charSequence, int index, @NotNull IndexedDefaultValue<Character> defaultValue) {
        return charSequence != null && index >= 0 && index <= lastIndex(charSequence) ? charSequence.charAt(index) : defaultValue.get(index);
    }

    /**
     * Returns a character at the given [index] or `null` if the [index] is out of bounds of this char sequence.
     */
    @Nullable
    public static Character elementAtOrNull(@Nullable CharSequence charSequence, int index) {
        return charSequence != null && index >= 0 && index <= lastIndex(charSequence) ? charSequence.charAt(index) : null;
    }


    /* ******************************************* single *******************************************/


    /**
     * Returns the single character, or throws an exception if the char sequence is empty or has more than one character.
     */
    public static char single(@Nullable CharSequence charSequence) {
        if (charSequence == null || count(charSequence) == 0) {
            throw new NoSuchElementException("Char sequence is empty.");
        } else if (count(charSequence) == 1) {
            return charSequence.charAt(0);
        } else {
            throw new IllegalArgumentException("Char sequence has more than one element.");
        }
    }

    /**
     * Returns the single character matching the given [predicate], or throws exception if there is no or more than one matching character.
     */
    public static char single(@Nullable CharSequence charSequence, @NotNull Predicate<Character> predicate) {
        Character single = null;
        boolean found = false;
        for (char element : iterable(charSequence)) {
            if (predicate.accept(element)) {
                if (found) {
                    throw new IllegalArgumentException("Char sequence contains more than one matching element.");
                }
                single = element;
                found = true;
            }
        }
        if (!found) throw new NoSuchElementException("Char sequence contains no character matching the predicate.");
        return single;
    }

    /**
     * Returns single character, or `null` if the char sequence is empty or has more than one character.
     */
    @Nullable
    public static Character singleOrNull(@Nullable CharSequence charSequence) {
        return charSequence != null && count(charSequence) == 1 ? charSequence.charAt(0) : null;
    }

    /**
     * Returns the single character matching the given [predicate], or `null` if character was not found or more than one character was found.
     */
    @Nullable
    public static Character singleOrNull(@Nullable CharSequence charSequence, @NotNull Predicate<Character> predicate) {
        Character single = null;
        boolean found = false;
        for (char element : iterable(charSequence)) {
            if (predicate.accept(element)) {
                if (found) {
                    return null;
                }
                single = element;
                found = true;
            }
        }
        if (!found) return null;
        return single;
    }


    /* ******************************************* drop *******************************************/


    /**
     * Returns a subsequence of this char sequence with the first [n] characters removed.
     */
    @NotNull
    public static CharSequence drop(@Nullable CharSequence charSequence, final int n) {
        Premisex.require(n >= 0, new LazyValue<String>() {
            @NotNull
            @Override
            public String get() {
                return "Requested character count " + n + " is less than zero.";
            }
        });
        return orEmpty(charSequence).subSequence(Rangex.coerceAtMost(n, count(charSequence)), count(charSequence));
    }

    /**
     * Returns a string with the first [n] characters removed.
     */
    @NotNull
    public static String drop(@Nullable String string, final int n) {
        Premisex.require(n >= 0, new LazyValue<String>() {
            @NotNull
            @Override
            public String get() {
                return "Requested character count " + n + " is less than zero.";
            }
        });
        return orEmpty(string).substring(Rangex.coerceAtMost(n, count(string)));
    }

    /**
     * Returns a subsequence of this char sequence with the last [n] characters removed.
     */
    @NotNull
    public static CharSequence dropLast(@Nullable CharSequence charSequence, final int n) {
        Premisex.require(n >= 0, new LazyValue<String>() {
            @NotNull
            @Override
            public String get() {
                return "Requested character count " + n + " is less than zero.";
            }
        });
        return take(charSequence, Rangex.coerceAtLeast((count(charSequence) - n), 0));
    }

    /**
     * Returns a string with the last [n] characters removed.
     */
    @NotNull
    public static String dropLast(@Nullable String string, final int n) {
        Premisex.require(n >= 0, new LazyValue<String>() {
            @NotNull
            @Override
            public String get() {
                return "Requested character count " + n + " is less than zero.";
            }
        });
        return take(string, Rangex.coerceAtLeast((count(string) - n), 0));
    }

    /**
     * Returns a subsequence of this char sequence containing all characters except last characters that satisfy the given [predicate].
     */
    @NotNull
    public static CharSequence dropLastWhile(@Nullable CharSequence charSequence, @NotNull Predicate<Character> predicate) {
        if (charSequence != null) {
            for (int index : Rangex.downTo(lastIndex(charSequence), 0)) {
                if (!predicate.accept(charSequence.charAt(index))) {
                    return charSequence.subSequence(0, index + 1);
                }
            }
        }
        return "";
    }

    /**
     * Returns a string containing all characters except last characters that satisfy the given [predicate].
     */
    @NotNull
    public static String dropLastWhile(@Nullable String string, @NotNull Predicate<Character> predicate) {
        if (string != null) {
            for (int index : Rangex.downTo(lastIndex(string), 0)) {
                if (!predicate.accept(string.charAt(index))) {
                    return string.substring(0, index + 1);
                }
            }
        }
        return "";
    }

    /**
     * Returns a subsequence of this char sequence containing all characters except first characters that satisfy the given [predicate].
     */
    @NotNull
    public static CharSequence dropWhile(@Nullable CharSequence charSequence, @NotNull Predicate<Character> predicate) {
        if (charSequence != null) {
            for (int index : indices(charSequence)) {
                if (!predicate.accept(charSequence.charAt(index))) {
                    return charSequence.subSequence(index, count(charSequence));
                }
            }
        }
        return "";
    }

    /**
     * Returns a string containing all characters except first characters that satisfy the given [predicate].
     */
    @NotNull
    public static String dropWhile(@Nullable String string, @NotNull Predicate<Character> predicate) {
        if (string != null) {
            for (int index : indices(string)) {
                if (!predicate.accept(string.charAt(index))) {
                    return string.substring(index);
                }
            }
        }
        return "";
    }


    /* ******************************************* slice *******************************************/


    /**
     * Returns a char sequence containing characters of the original char sequence at the specified range of [indices].
     */
    @NotNull
    public static CharSequence slice(@Nullable CharSequence charSequence, @NotNull IntRange indices) {
        if (indices.isEmpty()) return "";
        return subSequence(charSequence, indices);
    }

    /**
     * Returns a string containing characters of the original string at the specified range of [indices].
     */
    @NotNull
    public static String slice(@Nullable String string, @NotNull IntRange indices) {
        if (indices.isEmpty()) return "";
        return substring(string, indices);
    }

    /**
     * Returns a char sequence containing characters of the original char sequence at specified [indices].
     */
    @NotNull
    public static CharSequence slice(@Nullable CharSequence charSequence, @NotNull Iterable<Integer> indices) {
        int size = Collectionx.collectionSizeOrDefault(indices, 10);
        if (charSequence == null || size == 0) return "";
        StringBuilder result = new StringBuilder(size);
        for (int i : indices) {
            result.append(charSequence.charAt(i));
        }
        return result;
    }

    /**
     * Returns a string containing characters of the original string at specified [indices].
     */
    @NotNull
    public static String slice(@Nullable String string, @NotNull Iterable<Integer> indices) {
        return slice(((CharSequence) string), indices).toString();
    }


    /* ******************************************* take *******************************************/


    /**
     * Returns a subsequence of this char sequence containing the first [n] characters from this char sequence, or the entire char sequence if this char sequence is shorter.
     */
    @NotNull
    public static CharSequence take(@Nullable CharSequence charSequence, final int n) {
        Premisex.require(n >= 0, new LazyValue<String>() {
            @NotNull
            @Override
            public String get() {
                return "Requested character count " + n + " is less than zero.";
            }
        });
        return orEmpty(charSequence).subSequence(0, Rangex.coerceAtMost(n, count(charSequence)));
    }

    /**
     * Returns a string containing the first [n] characters from this string, or the entire string if this string is shorter.
     */
    @NotNull
    public static String take(@Nullable String string, final int n) {
        Premisex.require(n >= 0, new LazyValue<String>() {
            @NotNull
            @Override
            public String get() {
                return "Requested character count " + n + " is less than zero.";
            }
        });
        return orEmpty(string).substring(0, Rangex.coerceAtMost(n, count(string)));
    }

    /**
     * Returns a subsequence of this char sequence containing the last [n] characters from this char sequence, or the entire char sequence if this char sequence is shorter.
     */
    @NotNull
    public static CharSequence takeLast(@Nullable CharSequence charSequence, final int n) {
        Premisex.require(n >= 0, new LazyValue<String>() {
            @NotNull
            @Override
            public String get() {
                return "Requested character count " + n + " is less than zero.";
            }
        });
        int length = count(charSequence);
        return orEmpty(charSequence).subSequence(length - Rangex.coerceAtMost(n, length), length);
    }

    /**
     * Returns a string containing the last [n] characters from this string, or the entire string if this string is shorter.
     */
    @NotNull
    public static String takeLast(@Nullable String string, final int n) {
        Premisex.require(n >= 0, new LazyValue<String>() {
            @NotNull
            @Override
            public String get() {
                return "Requested character count " + n + " is less than zero.";
            }
        });
        int length = count(string);
        return orEmpty(string).substring(length - Rangex.coerceAtMost(n, length));
    }

    /**
     * Returns a subsequence of this char sequence containing last characters that satisfy the given [predicate].
     */
    @NotNull
    public static CharSequence takeLastWhile(@Nullable CharSequence charSequence, @NotNull Predicate<Character> predicate) {
        if (charSequence != null) {
            for (int index : Rangex.downTo(lastIndex(charSequence), 0)) {
                if (!predicate.accept(charSequence.charAt(index))) {
                    return charSequence.subSequence(index + 1, count(charSequence));
                }
            }
        }
        return orEmpty(charSequence).subSequence(0, count(charSequence));
    }

    /**
     * Returns a string containing last characters that satisfy the given [predicate].
     */
    @NotNull
    public static String takeLastWhile(@Nullable String string, @NotNull Predicate<Character> predicate) {
        if (string != null) {
            for (int index : Rangex.downTo(lastIndex(string), 0)) {
                if (!predicate.accept(string.charAt(index))) {
                    return string.substring(index + 1);
                }
            }
        }
        return orEmpty(string);
    }

    /**
     * Returns a subsequence of this char sequence containing the first characters that satisfy the given [predicate].
     */
    @NotNull
    public static CharSequence takeWhile(@Nullable CharSequence charSequence, @NotNull Predicate<Character> predicate) {
        if (charSequence != null) {
            for (int index : Rangex.until(0, count(charSequence))) {
                if (!predicate.accept(charSequence.charAt(index))) {
                    return charSequence.subSequence(0, index);
                }
            }
        }
        return orEmpty(charSequence).subSequence(0, count(charSequence));
    }

    /**
     * Returns a string containing the first characters that satisfy the given [predicate].
     */
    @NotNull
    public static String takeWhile(@Nullable String string, @NotNull Predicate<Character> predicate) {
        if (string != null) {
            for (int index : Rangex.until(0, count(string))) {
                if (!predicate.accept(string.charAt(index))) {
                    return string.substring(0, index);
                }
            }
        }
        return orEmpty(string);
    }


    /* ******************************************* associate *******************************************/


    /**
     * Returns a [Map] containing key-value pairs provided by [transform] function
     * applied to characters of the given char sequence.
     * <p>
     * If any of two pairs would have the same key the last one gets added to the map.
     * <p>
     * The returned map preserves the entry iteration order of the original char sequence.
     */
    @NotNull
    public static <K, V> Map<K, V> associate(@Nullable CharSequence charSequence, @NotNull Transformer<Character, Pair<K, V>> transform) {
        int capacity = Rangex.coerceAtLeast(Mapx.mapCapacity(count(charSequence)), 16);
        return associateTo(charSequence, new LinkedHashMap<K, V>(capacity), transform);
    }

    /**
     * Returns a [Map] containing the characters from the given char sequence indexed by the key
     * returned from [keySelector] function applied to each character.
     * <p>
     * If any two characters would have the same key returned by [keySelector] the last one gets added to the map.
     * <p>
     * The returned map preserves the entry iteration order of the original char sequence.
     */
    @NotNull
    public static <K> Map<K, Character> associateBy(@Nullable CharSequence charSequence, @NotNull Transformer<Character, K> keySelector) {
        int capacity = Rangex.coerceAtLeast(Mapx.mapCapacity(count(charSequence)), 16);
        return associateByTo(charSequence, new LinkedHashMap<K, Character>(capacity), keySelector);
    }

    /**
     * Returns a [Map] containing the values provided by [valueTransform] and indexed by [keySelector] functions applied to characters of the given char sequence.
     * <p>
     * If any two characters would have the same key returned by [keySelector] the last one gets added to the map.
     * <p>
     * The returned map preserves the entry iteration order of the original char sequence.
     */
    @NotNull
    public static <K, V> Map<K, V> associateBy(@Nullable CharSequence charSequence, @NotNull Transformer<Character, K> keySelector, @NotNull Transformer<Character, V> valueTransform) {
        int capacity = Rangex.coerceAtLeast(Mapx.mapCapacity(count(charSequence)), 16);
        return associateByTo(charSequence, new LinkedHashMap<K, V>(capacity), keySelector, valueTransform);
    }

    /**
     * Populates and returns the [destination] mutable map with key-value pairs,
     * where key is provided by the [keySelector] function applied to each character of the given char sequence
     * and value is the character itself.
     * <p>
     * If any two characters would have the same key returned by [keySelector] the last one gets added to the map.
     */
    @NotNull
    public static <K, M extends Map<K, Character>> M associateByTo(@Nullable CharSequence charSequence, @NotNull M destination, @NotNull Transformer<Character, K> keySelector) {
        for (char element : iterable(charSequence)) {
            destination.put(keySelector.transform(element), element);
        }
        return destination;
    }

    /**
     * Populates and returns the [destination] mutable map with key-value pairs,
     * where key is provided by the [keySelector] function and
     * and value is provided by the [valueTransform] function applied to characters of the given char sequence.
     * <p>
     * If any two characters would have the same key returned by [keySelector] the last one gets added to the map.
     */
    @NotNull
    public static <K, V, M extends Map<K, V>> M associateByTo(@Nullable CharSequence charSequence, @NotNull M destination,
                                                              @NotNull Transformer<Character, K> keySelector, @NotNull Transformer<Character, V> valueTransform) {
        for (char element : iterable(charSequence)) {
            destination.put(keySelector.transform(element), valueTransform.transform(element));
        }
        return destination;
    }

    /**
     * Populates and returns the [destination] mutable map with key-value pairs
     * provided by [transform] function applied to each character of the given char sequence.
     * <p>
     * If any of two pairs would have the same key the last one gets added to the map.
     */
    @NotNull
    public static <K, V, M extends Map<K, V>> M associateTo(@Nullable CharSequence charSequence, @NotNull M destination,
                                                            @NotNull Transformer<Character, Pair<K, V>> transform) {
        for (char element : iterable(charSequence)) {
            Pair<K, V> pair = transform.transform(element);
            destination.put(pair.first, pair.second);
        }
        return destination;
    }

    /* ******************************************* to *******************************************/


    /**
     * Appends all characters to the given [destination] collection.
     */
    @NotNull
    public static <C extends Collection<Character>> C toCollection(@Nullable CharSequence charSequence, @NotNull C destination) {
        for (char item : iterable(charSequence)) {
            destination.add(item);
        }
        return destination;
    }

    /**
     * Returns a [HashSet] of all characters.
     */
    @NotNull
    public static HashSet<Character> toHashSet(@Nullable CharSequence charSequence) {
        return toCollection(charSequence, new HashSet<Character>(Mapx.mapCapacity(count(charSequence))));
    }

    /**
     * Returns a [List] filled with all characters of this char sequence.
     */
    @NotNull
    public static List<Character> toList(@Nullable CharSequence charSequence) {
        return toCollection(charSequence, new ArrayList<Character>(count(charSequence)));
    }

    /**
     * Returns a [Set] of all characters.
     * <p>
     * The returned set preserves the element iteration order of the original char sequence.
     */
    @NotNull
    public static Set<Character> toSet(@Nullable CharSequence charSequence) {
        if (charSequence == null || count(charSequence) == 0) {
            return Collectionx.createEmptySet();
        } else if (count(charSequence) == 1) {
            return Collectionx.setOf(charSequence.charAt(0));
        } else {
            return toCollection(charSequence, new LinkedHashSet<Character>(Mapx.mapCapacity(count(charSequence))));
        }
    }

    /**
     * Returns a [SortedSet][java.util.SortedSet] of all characters.
     */
    @NotNull
    public static SortedSet<Character> toSortedSet(@Nullable CharSequence charSequence) {
        return toCollection(charSequence, new TreeSet<Character>());
    }


    /* ******************************************* flatMap *******************************************/


    /**
     * Returns a single list of all elements yielded from results of [transform] function being invoked on each character of original char sequence.
     */
    @NotNull
    public static <R> List<R> flatMap(@Nullable CharSequence charSequence, @NotNull Transformer<Character, Iterable<R>> transform) {
        return flatMapTo(charSequence, new ArrayList<R>(), transform);
    }

    /**
     * Appends all elements yielded from results of [transform] function being invoked on each character of original char sequence, to the given [destination].
     */
    @NotNull
    public static <R, C extends Collection<R>> C flatMapTo(@Nullable CharSequence charSequence, @NotNull C destination, Transformer<Character, Iterable<R>> transform) {
        for (char element : iterable(charSequence)) {
            Collectionx.addAll(destination, transform.transform(element));
        }
        return destination;
    }


    /* ******************************************* group *******************************************/


    /**
     * Groups characters of the original char sequence by the key returned by the given [keySelector] function
     * applied to each character and returns a map where each group key is associated with a list of corresponding characters.
     * <p>
     * The returned map preserves the entry iteration order of the keys produced from the original char sequence.
     */
    @NotNull
    public static <K> Map<K, List<Character>> groupBy(@Nullable CharSequence charSequence, @NotNull Transformer<Character, K> keySelector) {
        return groupByTo(charSequence, new LinkedHashMap<K, List<Character>>(), keySelector);
    }

    /**
     * Groups values returned by the [valueTransform] function applied to each character of the original char sequence
     * by the key returned by the given [keySelector] function applied to the character
     * and returns a map where each group key is associated with a list of corresponding values.
     * <p>
     * The returned map preserves the entry iteration order of the keys produced from the original char sequence.
     */
    @NotNull
    public static <K, V> Map<K, List<V>> groupBy(@Nullable CharSequence charSequence, @NotNull Transformer<Character, K> keySelector, @NotNull Transformer<Character, V> valueTransform) {
        return groupByTo(charSequence, new LinkedHashMap<K, List<V>>(), keySelector, valueTransform);
    }

    /**
     * Groups characters of the original char sequence by the key returned by the given [keySelector] function
     * applied to each character and puts to the [destination] map each group key associated with a list of corresponding characters.
     *
     * @return The [destination] map.
     */
    @NotNull
    public static <K, M extends Map<K, List<Character>>> M groupByTo(@Nullable CharSequence charSequence, @NotNull M destination, @NotNull Transformer<Character, K> keySelector) {
        DefaultValue<List<Character>> defaultValue = new DefaultValue<List<Character>>() {
            @NotNull
            @Override
            public List<Character> get() {
                return new ArrayList<>();
            }
        };
        for (char element : iterable(charSequence)) {
            K key = keySelector.transform(element);
            List<Character> list = Mapx.getOrPut(destination, key, defaultValue);
            list.add(element);
        }
        return destination;
    }

    /**
     * Groups values returned by the [valueTransform] function applied to each character of the original char sequence
     * by the key returned by the given [keySelector] function applied to the character
     * and puts to the [destination] map each group key associated with a list of corresponding values.
     *
     * @return The [destination] map.
     */
    @NotNull
    public static <K, V, M extends Map<K, List<V>>> M groupByTo(@Nullable CharSequence charSequence, @NotNull M destination, @NotNull Transformer<Character, K> keySelector, @NotNull Transformer<Character, V> valueTransform) {
        DefaultValue<List<V>> defaultValue = new DefaultValue<List<V>>() {
            @NotNull
            @Override
            public List<V> get() {
                return new ArrayList<>();
            }
        };
        for (char element : iterable(charSequence)) {
            K key = keySelector.transform(element);
            List<V> list = Mapx.getOrPut(destination, key, defaultValue);
            list.add(valueTransform.transform(element));
        }
        return destination;
    }

    /**
     * Creates a [Grouping] source from a char sequence to be used later with one of group-and-fold operations
     * using the specified [keySelector] function to extract a key from each character.
     */
    @NotNull
    public static <K> Grouping<Character, K> groupingBy(@Nullable final CharSequence charSequence, @NotNull final Transformer<Character, K> keySelector) {
        return new Grouping<Character, K>() {
            @Override
            public Iterator<Character> sourceIterator() {
                return iterator(charSequence);
            }

            @Override
            public K keyOf(Character element) {
                return keySelector.transform(element);
            }
        };
    }


    /* ******************************************* map *******************************************/


    /**
     * Returns a list containing the results of applying the given [transform] function
     * to each character in the original char sequence.
     */
    @NotNull
    public static <R> List<R> map(@Nullable CharSequence charSequence, @NotNull Transformer<Character, R> transform) {
        return mapTo(charSequence, new ArrayList<R>(count(charSequence)), transform);
    }

    /**
     * Returns a list containing the results of applying the given [transform] function
     * to each character and its index in the original char sequence.
     *
     * @param transform function that takes the index of a character and the character itself
     *                  and returns the result of the transform applied to the character.
     */
    @NotNull
    public static <R> List<R> mapIndexed(@Nullable CharSequence charSequence, @NotNull IndexedTransformer<Character, R> transform) {
        return mapIndexedTo(charSequence, new ArrayList<R>(count(charSequence)), transform);
    }

    /**
     * Returns a list containing only the non-null results of applying the given [transform] function
     * to each character and its index in the original char sequence.
     *
     * @param transform function that takes the index of a character and the character itself
     *                  and returns the result of the transform applied to the character.
     */
    @NotNull
    public static <R> List<R> mapIndexedNotNull(@Nullable CharSequence charSequence, @NotNull NullableIndexedTransformer<Character, R> transform) {
        return mapIndexedNotNullTo(charSequence, new ArrayList<R>(), transform);
    }

    /**
     * Applies the given [transform] function to each character and its index in the original char sequence
     * and appends only the non-null results to the given [destination].
     *
     * @param transform function that takes the index of a character and the character itself
     *                  and returns the result of the transform applied to the character.
     */
    @NotNull
    public static <R, C extends Collection<R>> C mapIndexedNotNullTo(@Nullable CharSequence charSequence, @NotNull final C destination, @NotNull final NullableIndexedTransformer<Character, R> transform) {
        forEachIndexed(charSequence, new IndexedAction<Character>() {
            @Override
            public void action(int index, @NotNull Character character) {
                R r = transform.transform(index, character);
                if (r != null) destination.add(r);
            }
        });
        return destination;
    }

    /**
     * Applies the given [transform] function to each character and its index in the original char sequence
     * and appends the results to the given [destination].
     *
     * @param transform function that takes the index of a character and the character itself
     *                  and returns the result of the transform applied to the character.
     */
    @NotNull
    public static <R, C extends Collection<R>> C mapIndexedTo(@Nullable CharSequence charSequence, @NotNull C destination, @NotNull IndexedTransformer<Character, R> transform) {
        int index = 0;
        for (char item : iterable(charSequence)) {
            destination.add(transform.transform(index++, item));
        }
        return destination;
    }

    /**
     * Returns a list containing only the non-null results of applying the given [transform] function
     * to each character in the original char sequence.
     */
    @NotNull
    public static <R> List<R> mapNotNull(@Nullable CharSequence charSequence, @NotNull NullableTransformer<Character, R> transform) {
        return mapNotNullTo(charSequence, new ArrayList<R>(), transform);
    }

    /**
     * Applies the given [transform] function to each character in the original char sequence
     * and appends only the non-null results to the given [destination].
     */
    @NotNull
    public static <R, C extends Collection<R>> C mapNotNullTo(@Nullable CharSequence charSequence, @NotNull final C destination, @NotNull final NullableTransformer<Character, R> transform) {
        forEach(charSequence, new Action<Character>() {
            @Override
            public void action(@NotNull Character character) {
                R r = transform.transform(character);
                if (r != null) destination.add(r);
            }
        });
        return destination;
    }

    /**
     * Applies the given [transform] function to each character of the original char sequence
     * and appends the results to the given [destination].
     */
    @NotNull
    public static <R, C extends Collection<R>> C mapTo(@Nullable CharSequence charSequence, @NotNull C destination, @NotNull Transformer<Character, R> transform) {
        for (char item : iterable(charSequence)) {
            destination.add(transform.transform(item));
        }
        return destination;
    }


    /* ******************************************* withIndex *******************************************/


    /**
     * Returns a lazy [Iterable] of [IndexedValue] for each character of the original char sequence.
     */
    @NotNull
    public static Iterable<IndexedValue<Character>> withIndex(@Nullable final CharSequence charSequence) {
        return new IndexingIterable<>(new DefaultValue<Iterator<Character>>() {
            @NotNull
            @Override
            public Iterator<Character> get() {
                return iterator(charSequence);
            }
        });
    }


    /* ******************************************* all *******************************************/


    /**
     * Returns `true` if all characters match the given [predicate].
     */
    public static boolean all(@Nullable CharSequence charSequence, @NotNull Predicate<Character> predicate) {
        for (char element : iterable(charSequence)) if (!predicate.accept(element)) return false;
        return true;
    }


    /* ******************************************* any *******************************************/


    /**
     * Returns `true` if char sequence has at least one character.
     */
    public static boolean any(@Nullable CharSequence charSequence) {
        return !isEmpty(charSequence);
    }

    /**
     * Returns `true` if at least one character matches the given [predicate].
     */
    public static boolean any(@Nullable CharSequence charSequence, @NotNull Predicate<Character> predicate) {
        for (char element : iterable(charSequence)) if (predicate.accept(element)) return true;
        return false;
    }


    /* ******************************************* count *******************************************/


    /**
     * Returns the length of this char sequence.
     */
    public static int count(@Nullable CharSequence charSequence) {
        return charSequence != null ? charSequence.length() : 0;
    }

    /**
     * Returns the number of characters matching the given [predicate].
     */
    public static int count(@Nullable CharSequence charSequence, @NotNull Predicate<Character> predicate) {
        int count = 0;
        if (charSequence != null) {
            for (char element : iterable(charSequence)) if (predicate.accept(element)) count++;
        }
        return count;
    }


    /* ******************************************* fold *******************************************/


    /**
     * Accumulates value starting with [initial] value and applying [operation] from left to right to current accumulator value and each character.
     */
    @NotNull
    public static <R> R fold(@Nullable CharSequence charSequence, @NotNull R initial, @NotNull Operation<Character, R> operation) {
        R accumulator = initial;
        for (char element : iterable(charSequence)) accumulator = operation.operation(accumulator, element);
        return accumulator;
    }

    /**
     * Accumulates value starting with [initial] value and applying [operation] from left to right
     * to current accumulator value and each character with its index in the original char sequence.
     *
     * @param operation function that takes the index of a character, current accumulator value
     *                  and the character itself, and calculates the next accumulator value.
     */
    @NotNull
    public static <R> R foldIndexed(@Nullable CharSequence charSequence, @NotNull R initial, @NotNull IndexedOperation<Character, R> operation) {
        int index = 0;
        R accumulator = initial;
        for (char element : iterable(charSequence)) accumulator = operation.operation(index++, accumulator, element);
        return accumulator;
    }

    /**
     * Accumulates value starting with [initial] value and applying [operation] from right to left to each character and current accumulator value.
     */
    @NotNull
    public static <R> R foldRight(@Nullable CharSequence charSequence, @NotNull R initial, @NotNull RightOperation<Character, R> operation) {
        R accumulator = initial;
        if (charSequence != null) {
            int index = lastIndex(charSequence);
            while (index >= 0) {
                accumulator = operation.operation(charSequence.charAt(index--), accumulator);
            }
        }
        return accumulator;
    }

    /**
     * Accumulates value starting with [initial] value and applying [operation] from right to left
     * to each character with its index in the original char sequence and current accumulator value.
     *
     * @param operation function that takes the index of a character, the character itself
     *                  and current accumulator value, and calculates the next accumulator value.
     */
    @NotNull
    public static <R> R foldRightIndexed(@Nullable CharSequence charSequence, @NotNull R initial, @NotNull IndexedRightOperation<Character, R> operation) {
        R accumulator = initial;
        if (charSequence != null) {
            int index = lastIndex(charSequence);
            while (index >= 0) {
                accumulator = operation.operation(index, charSequence.charAt(index), accumulator);
                --index;
            }
        }
        return accumulator;
    }


    /* ******************************************* forEach *******************************************/


    /**
     * Performs the given [action] on each character.
     */
    public static void forEach(@Nullable CharSequence charSequence, @NotNull Action<Character> action) {
        for (char item : iterable(charSequence)) action.action(item);
    }

    /**
     * Performs the given [action] on each character, providing sequential index with the character.
     *
     * @param action function that takes the index of a character and the character itself
     *               and performs the desired action on the character.
     */
    public static void forEachIndexed(@Nullable CharSequence charSequence, @NotNull IndexedAction<Character> action) {
        int index = 0;
        for (char item : iterable(charSequence)) action.action(index++, item);
    }


    /* ******************************************* max *******************************************/


    /**
     * Returns the largest character or `null` if there are no characters.
     */
    @Nullable
    public static Character max(@Nullable CharSequence charSequence) {
        if (isNullOrEmpty(charSequence)) return null;
        char max = charSequence.charAt(0);
        for (int i : Rangex.rangeTo(1, lastIndex(charSequence))) {
            char e = charSequence.charAt(i);
            if (max < e) max = e;
        }
        return max;
    }

    /**
     * Returns the first character yielding the largest value of the given function or `null` if there are no characters.
     */
    @Nullable
    public static <R extends Comparable<R>> Character maxBy(@Nullable CharSequence charSequence, @NotNull Transformer<Character, R> selector) {
        if (isNullOrEmpty(charSequence)) return null;
        char maxElem = charSequence.charAt(0);
        R maxValue = selector.transform(maxElem);
        for (int i : Rangex.rangeTo(1, lastIndex(charSequence))) {
            char e = charSequence.charAt(i);
            R v = selector.transform(e);
            if (maxValue.compareTo(v) < 0) {
                maxElem = e;
                maxValue = v;
            }
        }
        return maxElem;
    }

    /**
     * Returns the first character having the largest value according to the provided [comparator] or `null` if there are no characters.
     */
    @Nullable
    public static Character maxWith(@Nullable CharSequence charSequence, Comparator<Character> comparator) {
        if (isNullOrEmpty(charSequence)) return null;
        char max = charSequence.charAt(0);
        for (int i : Rangex.rangeTo(1, lastIndex(charSequence))) {
            char e = charSequence.charAt(i);
            if (comparator.compare(max, e) < 0) max = e;
        }
        return max;
    }


    /* ******************************************* min *******************************************/


    /**
     * Returns the smallest character or `null` if there are no characters.
     */
    @Nullable
    public static Character min(@Nullable CharSequence charSequence) {
        if (isNullOrEmpty(charSequence)) return null;
        char min = charSequence.charAt(0);
        for (int i : Rangex.rangeTo(1, lastIndex(charSequence))) {
            char e = charSequence.charAt(i);
            if (min > e) min = e;
        }
        return min;
    }

    /**
     * Returns the first character yielding the smallest value of the given function or `null` if there are no characters.
     */
    @Nullable
    public static <R extends Comparable<R>> Character minBy(@Nullable CharSequence charSequence, @NotNull Transformer<Character, R> selector) {
        if (isNullOrEmpty(charSequence)) return null;
        char minElem = charSequence.charAt(0);
        R minValue = selector.transform(minElem);
        for (int i : Rangex.rangeTo(1, lastIndex(charSequence))) {
            char e = charSequence.charAt(i);
            R v = selector.transform(e);
            if (minValue.compareTo(v) > 0) {
                minElem = e;
                minValue = v;
            }
        }
        return minElem;
    }

    /**
     * Returns the first character having the smallest value according to the provided [comparator] or `null` if there are no characters.
     */
    @Nullable
    public static Character minWith(@Nullable CharSequence charSequence, @NotNull Comparator<Character> comparator) {
        if (isNullOrEmpty(charSequence)) return null;
        char min = charSequence.charAt(0);
        for (int i : Rangex.rangeTo(1, lastIndex(charSequence))) {
            char e = charSequence.charAt(i);
            if (comparator.compare(min, e) > 0) min = e;
        }
        return min;
    }


    /* ******************************************* none *******************************************/


    /**
     * Returns `true` if the char sequence has no characters.
     */
    public static boolean none(@Nullable CharSequence charSequence) {
        return isEmpty(charSequence);
    }

    /**
     * Returns `true` if no characters match the given [predicate].
     */
    public static boolean none(@Nullable CharSequence charSequence, @NotNull Predicate<Character> predicate) {
        for (char element : iterable(charSequence)) if (predicate.accept(element)) return false;
        return true;
    }


    /* ******************************************* onEach *******************************************/


    /**
     * Performs the given [action] on each character and returns the char sequence itself afterwards.
     */
    @NotNull
    public static <S extends CharSequence> S onEach(@Nullable S s, @NotNull Action<Character> action) {
        for (char element : iterable(s)) action.action(element);
        //noinspection unchecked
        return (S) orEmpty(s);
    }


    /* ******************************************* reduce *******************************************/


    /**
     * Accumulates value starting with the first character and applying [operation] from left to right to current accumulator value and each character.
     */
    @NotNull
    public static Character reduce(@Nullable CharSequence charSequence, @NotNull Operation<Character, Character> operation) {
        if (isNullOrEmpty(charSequence))
            throw new UnsupportedOperationException("Empty char sequence can't be reduced.");
        char accumulator = charSequence.charAt(0);
        for (int index : Rangex.rangeTo(1, lastIndex(charSequence))) {
            accumulator = operation.operation(accumulator, charSequence.charAt(index));
        }
        return accumulator;
    }

    /**
     * Accumulates value starting with the first character and applying [operation] from left to right
     * to current accumulator value and each character with its index in the original char sequence.
     *
     * @param operation function that takes the index of a character, current accumulator value
     *                  and the character itself and calculates the next accumulator value.
     */
    @NotNull
    public static Character reduceIndexed(@Nullable CharSequence charSequence, @NotNull IndexedOperation<Character, Character> operation) {
        if (isNullOrEmpty(charSequence))
            throw new UnsupportedOperationException("Empty char sequence can't be reduced.");
        char accumulator = charSequence.charAt(0);
        for (int index : Rangex.rangeTo(1, lastIndex(charSequence))) {
            accumulator = operation.operation(index, accumulator, charSequence.charAt(index));
        }
        return accumulator;
    }

    /**
     * Accumulates value starting with last character and applying [operation] from right to left to each character and current accumulator value.
     */
    @NotNull
    public static Character reduceRight(@Nullable CharSequence charSequence, @NotNull Operation<Character, Character> operation) {
        int index = lastIndex(charSequence);
        if (charSequence == null || index < 0)
            throw new UnsupportedOperationException("Empty char sequence can't be reduced.");
        char accumulator = charSequence.charAt(index--);
        while (index >= 0) {
            accumulator = operation.operation(charSequence.charAt(index--), accumulator);
        }
        return accumulator;
    }

    /**
     * Accumulates value starting with last character and applying [operation] from right to left
     * to each character with its index in the original char sequence and current accumulator value.
     *
     * @param operation function that takes the index of a character, the character itself
     *                  and current accumulator value, and calculates the next accumulator value.
     */
    @NotNull
    public static Character reduceRightIndexed(@Nullable CharSequence charSequence, @NotNull IndexedOperation<Character, Character> operation) {
        int index = lastIndex(charSequence);
        if (charSequence == null || index < 0)
            throw new UnsupportedOperationException("Empty char sequence can't be reduced.");
        char accumulator = charSequence.charAt(index--);
        while (index >= 0) {
            accumulator = operation.operation(index, charSequence.charAt(index), accumulator);
            --index;
        }
        return accumulator;
    }


    /* ******************************************* sum *******************************************/


    /**
     * Returns the sum of all values produced by [selector] function applied to each character in the char sequence.
     */
    public static int sumBy(@Nullable CharSequence charSequence, @NotNull Transformer<Character, Integer> selector) {
        int sum = 0;
        for (char element : iterable(charSequence)) {
            sum += selector.transform(element);
        }
        return sum;
    }

    /**
     * Returns the sum of all values produced by [selector] function applied to each character in the char sequence.
     */
    public static double sumByDouble(@Nullable CharSequence charSequence, @NotNull Transformer<Character, Double> selector) {
        double sum = 0;
        for (char element : iterable(charSequence)) {
            sum += selector.transform(element);
        }
        return sum;
    }


    /* ******************************************* chunked *******************************************/


    /**
     * Splits this char sequence into a list of strings each not exceeding the given [size].
     * <p>
     * The last string in the resulting list may have less characters than the given [size].
     *
     * @param size the number of elements to take in each string, must be positive and can be greater than the number of elements in this char sequence.
     */
    @NotNull
    public static List<String> chunked(@Nullable CharSequence charSequence, int size) {
        return windowed(charSequence, size, size, true);
    }

    /**
     * Splits this char sequence into several char sequences each not exceeding the given [size]
     * and applies the given [transform] function to an each.
     *
     * @param size the number of elements to take in each char sequence, must be positive and can be greater than the number of elements in this char sequence.
     * @return list of results of the [transform] applied to an each char sequence.
     * <p>
     * Note that the char sequence passed to the [transform] function is ephemeral and is valid only inside that function.
     * You should not store it or allow it to escape in some way, unless you made a snapshot of it.
     * The last char sequence may have less characters than the given [size].
     */
    @NotNull
    public static <R> List<R> chunked(@Nullable CharSequence charSequence, int size, @NotNull Transformer<CharSequence, R> transform) {
        return windowed(charSequence, size, size, true, transform);
    }

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
//    public static Sequence<String> chunkedSequence(@Nullable CharSequence charSequence, size: Int): {
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
//    public static <R> Sequence<R> chunkedSequence(@Nullable CharSequence charSequence, size: Int, transform: (CharSequence) -> R): {
//        return windowedSequence(size, size, partialWindows = true, transform = transform)
//    }


    /* ******************************************* partition *******************************************/


    /**
     * Splits the original char sequence into pair of char sequences,
     * where *first* char sequence contains characters for which [predicate] yielded `true`,
     * while *second* char sequence contains characters for which [predicate] yielded `false`.
     */
    public static Pair<CharSequence, CharSequence> partition(@Nullable CharSequence charSequence, @NotNull Predicate<Character> predicate) {
        StringBuilder first = new StringBuilder();
        StringBuilder second = new StringBuilder();
        for (char element : iterable(charSequence)) {
            if (predicate.accept(element)) {
                first.append(element);
            } else {
                second.append(element);
            }
        }
        return new Pair<CharSequence, CharSequence>(first, second);
    }

    /**
     * Splits the original string into pair of strings,
     * where *first* string contains characters for which [predicate] yielded `true`,
     * while *second* string contains characters for which [predicate] yielded `false`.
     */
    public static Pair<String, String> partition(@Nullable String string, @NotNull Predicate<Character> predicate) {
        StringBuilder first = new StringBuilder();
        StringBuilder second = new StringBuilder();
        for (char element : iterable(string)) {
            if (predicate.accept(element)) {
                first.append(element);
            } else {
                second.append(element);
            }
        }
        return new Pair<>(first.toString(), second.toString());
    }


    /* ******************************************* windowed *******************************************/


    /**
     * Returns a list of snapshots of the window of the given [size]
     * sliding along this char sequence with the given [step], where each
     * snapshot is a string.
     * <p>
     * Several last strings may have less characters than the given [size].
     * <p>
     * Both [size] and [step] must be positive and can be greater than the number of elements in this char sequence.
     *
     * @param size           the number of elements to take in each window
     * @param step           the number of elements to move the window forward by on an each step, by default 1
     * @param partialWindows controls whether or not to keep partial windows in the end if any,
     *                       by default `false` which means partial windows won't be preserved
     */
    @NotNull
    public static List<String> windowed(@Nullable CharSequence charSequence, int size, int step, boolean partialWindows) {
        return windowed(charSequence, size, step, partialWindows, new Transformer<CharSequence, String>() {
            @NotNull
            @Override
            public String transform(@Nullable CharSequence t) {
                return orEmpty(t).toString();
            }
        });
    }

    /**
     * Returns a list of results of applying the given [transform] function to
     * an each char sequence representing a view over the window of the given [size]
     * sliding along this char sequence with the given [step].
     * <p>
     * Note that the char sequence passed to the [transform] function is ephemeral and is valid only inside that function.
     * You should not store it or allow it to escape in some way, unless you made a snapshot of it.
     * Several last char sequences may have less characters than the given [size].
     * <p>
     * Both [size] and [step] must be positive and can be greater than the number of elements in this char sequence.
     *
     * @param size           the number of elements to take in each window
     * @param step           the number of elements to move the window forward by on an each step, by default 1
     * @param partialWindows controls whether or not to keep partial windows in the end if any,
     *                       by default `false` which means partial windows won't be preserved
     */
    @NotNull
    public static <R> List<R> windowed(@Nullable CharSequence charSequence, final int size, final int step, boolean partialWindows, @NotNull Transformer<CharSequence, R> transform) {
        Premisex.require(size > 0 && step > 0, new LazyValue<String>() {
            @NotNull
            @Override
            public String get() {
                return size != step ? "Both size " + size + " and step " + step + " must be greater than zero." : "size " + size + " must be greater than zero.";
            }
        });
        int thisSize = count(charSequence);
        List<R> result = new ArrayList<>((thisSize + step - 1) / step);
        if (charSequence != null) {
            int index = 0;
            while (index < thisSize) {
                int end = index + size;
                int coercedEnd;
                if (end > thisSize) {
                    if (partialWindows) {
                        coercedEnd = thisSize;
                    } else {
                        break;
                    }
                } else {
                    coercedEnd = end;
                }
                result.add(transform.transform(charSequence.subSequence(index, coercedEnd)));
                index += step;
            }
        }
        return result;
    }

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
//    public static windowedSequence(@Nullable CharSequence charSequence, size: Int, step: Int = 1, partialWindows: Boolean = false): Sequence<String> {
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
//    public static <R> windowedSequence(@Nullable CharSequence charSequence, size: Int, step: Int = 1, partialWindows: Boolean = false, transform: (CharSequence) -> R): Sequence<R> {
//        checkWindowSizeStep(size, step)
//        val windows = (if (partialWindows) indices else 0 until length - size + 1) step step
//        return windows.asSequence().map { index -> transform(subSequence(index, (index + size).coerceAtMost(length))) }
//    }


    /* ******************************************* zip *******************************************/


    /**
     * Returns a list of pairs built from the characters of `this` and the [other] char sequences with the same index
     * The returned list has length of the shortest char sequence.
     */
    @NotNull
    public static List<Pair<Character, Character>> zip(@Nullable CharSequence charSequence, @NotNull CharSequence other) {
        return zip(charSequence, other, new Transformer2<Character, Character, Pair<Character, Character>>() {
            @NotNull
            @Override
            public Pair<Character, Character> transform(@NotNull Character character, @NotNull Character character2) {
                return new Pair<>(character, character2);
            }
        });
    }

    /**
     * Returns a list of values built from the characters of `this` and the [other] char sequences with the same index
     * using the provided [transform] function applied to each pair of characters.
     * The returned list has length of the shortest char sequence.
     */
    @NotNull
    public static <V> List<V> zip(@Nullable CharSequence charSequence, @Nullable CharSequence other, @NotNull Transformer2<Character, Character, V> transform) {
        int length = Math.min(count(charSequence), count(other));
        List<V> list = new ArrayList<>(length);
        if (charSequence != null && other != null) {
            for (int i : Rangex.until(0, length)) {
                list.add(transform.transform(charSequence.charAt(i), other.charAt(i)));
            }
        }
        return list;
    }

    /**
     * Returns a list of pairs of each two adjacent characters in this char sequence.
     * <p>
     * The returned list is empty if this char sequence contains less than two characters.
     */
    @NotNull
    public static List<Pair<Character, Character>> zipWithNext(@Nullable CharSequence charSequence) {
        return zipWithNext(charSequence, new Transformer2<Character, Character, Pair<Character, Character>>() {
            @NotNull
            @Override
            public Pair<Character, Character> transform(@NotNull Character character, @NotNull Character character2) {
                return new Pair<>(character, character2);
            }
        });
    }

    /**
     * Returns a list containing the results of applying the given [transform] function
     * to an each pair of two adjacent characters in this char sequence.
     * <p>
     * The returned list is empty if this char sequence contains less than two characters.
     */
    @NotNull
    public static <R> List<R> zipWithNext(@Nullable CharSequence charSequence, @NotNull Transformer2<Character, Character, R> transform) {
        int size = count(charSequence) - 1;
        if (charSequence == null || size < 1) return Collectionx.createEmptyList();
        List<R> result = new ArrayList<>(size);
        for (int index : Rangex.until(0, size)) {
            result.add(transform.transform(charSequence.charAt(index), charSequence.charAt(index + 1)));
        }
        return result;
    }


    /* ******************************************* as *******************************************/


    /**
     * Creates an [Iterable] instance that wraps the original char sequence returning its characters when being iterated.
     */
    @NotNull
    public static Iterable<Character> asIterable(@Nullable CharSequence charSequence) {
        if (charSequence == null || charSequence instanceof String && isEmpty(charSequence))
            return Collectionx.createEmptyList();
        return new CharSequenceIterable(charSequence);
    }
//
//    /**
//     * Creates a [Sequence] instance that wraps the original char sequence returning its characters when being iterated.
//     */
//    public static asSequence(@Nullable CharSequence charSequence): Sequence<Character> {
//        if (this is String && isEmpty()) return emptySequence()
//        return Sequence { this.iterator() }
//    }
}