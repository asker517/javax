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

import me.panpf.javax.util.IntRange;
import me.panpf.javax.util.Rangex;
import me.panpf.javax.util.*;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import java.nio.charset.Charset;
import java.util.Collection;

import static java.lang.Character.isLowerCase;
import static java.lang.Character.isUpperCase;

/**
 * String tool class
 */
@SuppressWarnings({"WeakerAccess"})
public class Stringx {


    /* ******************************************* isSafe *******************************************/


    /**
     * Returns `true` if this string is is not `null` and not empty and contains some characters except of whitespace characters.
     */
    public static boolean isSafe(@Nullable CharSequence string) {
        return isNotNullOrEmpty(string) && isNotBlank(string);
    }

    /**
     * Returns `true` if this string is is `null` or empty or consists solely of whitespace characters.
     */
    public static boolean isNotSafe(@Nullable CharSequence string) {
        return !isSafe(string);
    }

    /**
     * If the given character sequence is safe, it return is itself, otherwise it returns the default value.
     */
    public static CharSequence isNotSafeOr(@Nullable CharSequence sequence, @NotNull CharSequence defaultValue) {
        return isSafe(sequence) ? sequence : defaultValue;
    }


    /* ******************************************* isBlank *******************************************/


    /**
     * Returns `true` if this string is empty or consists solely of whitespace characters.
     */
    public static boolean isBlank(@Nullable CharSequence string) {
        if (string == null) return false;
        for (int index = 0, size = string.length(); index < size; index++) {
            if (Charx.isNotBlank(string.charAt(index))) {
                return false;
            }
        }
        return true;
    }

    /**
     * Returns `true` if this char sequence is not empty and contains some characters except of whitespace characters.
     */
    public static boolean isNotBlank(@Nullable CharSequence string) {
        return !isBlank(string);
    }

    /**
     * If the given character sequence is not blank, it return is itself, otherwise it returns the default value.
     */
    public static CharSequence isBlankOr(@Nullable CharSequence sequence, @NotNull CharSequence defaultValue) {
        return isNotBlank(sequence) ? sequence : defaultValue;
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
     * If the given character sequence is not null or blank, it return is itself, otherwise it returns the default value.
     */
    public static CharSequence isNullOrBlankOr(@Nullable CharSequence sequence, @NotNull CharSequence defaultValue) {
        return isNotNullOrBlank(sequence) ? sequence : defaultValue;
    }


    /* ******************************************* isEmpty *******************************************/


    /**
     * Returns `true` if this char sequence is empty (contains no characters).
     */
    public static boolean isEmpty(@Nullable CharSequence string) {
        return string != null && string.length() == 0;
    }

    /**
     * Returns `true` if this char sequence is not empty.
     */
    public static boolean isNotEmpty(@Nullable CharSequence string) {
        return !isEmpty(string);
    }

    /**
     * If the given character sequence is not empty, it return is itself, otherwise it returns the default value.
     */
    public static CharSequence isEmptyOr(@Nullable CharSequence sequence, @NotNull CharSequence defaultValue) {
        return isNotEmpty(sequence) ? sequence : defaultValue;
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
     * If the given character sequence is not null or empty, it return is itself, otherwise it returns the default value.
     */
    public static CharSequence isNullOrEmptyOr(@Nullable CharSequence sequence, @NotNull CharSequence defaultValue) {
        return isNotNullOrEmpty(sequence) ? sequence : defaultValue;
    }


    /* ******************************************* isChinese *******************************************/


    /**
     * Return `true` if the given sequence of characters is all chinese
     */
    public static boolean isChinese(@Nullable CharSequence string) {
        if (string == null || isNotSafe(string)) return false;
        for (int index = 0, size = string.length(); index < size; index++) {
            if (Charx.isNotChinese(string.charAt(index))) {
                return false;
            }
        }
        return true;
    }

    /**
     * Return `true` if the given sequence of characters is all not chinese
     */
    public static boolean isNotChinese(@Nullable CharSequence string) {
        return !isChinese(string);
    }

    /**
     * If the given character sequence is chinese, it return is itself, otherwise it returns the default value.
     */
    public static CharSequence isNotChineseOr(@Nullable CharSequence sequence, @NotNull CharSequence defaultValue) {
        return isChinese(sequence) ? sequence : defaultValue;
    }


    /* ******************************************* isDigit *******************************************/


    /**
     * Return `true` if the given sequence of characters is all digit
     */
    public static boolean isDigit(@Nullable CharSequence string) {
        if (string == null || isNotSafe(string)) return false;
        for (int index = 0, size = string.length(); index < size; index++) {
            if (Charx.isNotDigit(string.charAt(index))) {
                return false;
            }
        }
        return true;
    }

    /**
     * Return `true` if the given sequence of characters is all not digit
     */
    public static boolean isNotDigit(@Nullable CharSequence string) {
        return !isDigit(string);
    }

    /**
     * If the given character sequence is digit, it return is itself, otherwise it returns the default value.
     */
    public static CharSequence isNotDigitOr(@Nullable CharSequence sequence, @NotNull CharSequence defaultValue) {
        return isDigit(sequence) ? sequence : defaultValue;
    }


    /* ******************************************* isLetter *******************************************/


    /**
     * Return `true` if the given sequence of characters is all letter
     */
    public static boolean isLetter(@Nullable CharSequence string) {
        if (string == null || isNotSafe(string)) return false;
        for (int index = 0, size = string.length(); index < size; index++) {
            if (Charx.isNotLetter(string.charAt(index))) {
                return false;
            }
        }
        return true;
    }

    /**
     * Return `true` if the given sequence of characters is all not letter
     */
    public static boolean isNotLetter(@Nullable CharSequence string) {
        return !isLetter(string);
    }

    /**
     * If the given character sequence is letter, it return is itself, otherwise it returns the default value.
     */
    public static CharSequence isNotLetterOr(@Nullable CharSequence sequence, @NotNull CharSequence defaultValue) {
        return isLetter(sequence) ? sequence : defaultValue;
    }


    /* ******************************************* isLetterOrDigit *******************************************/


    /**
     * Return `true` if the given sequence of characters is all digit or letter
     */
    public static boolean isLetterOrDigit(@Nullable CharSequence string) {
        if (string == null || isNotSafe(string)) return false;
        for (int index = 0, size = string.length(); index < size; index++) {
            if (Charx.isNotLetterOrDigit(string.charAt(index))) {
                return false;
            }
        }
        return true;
    }

    /**
     * Return `true` if the given sequence of characters is all not digit or letter
     */
    public static boolean isNotLetterOrDigit(@Nullable CharSequence string) {
        return !isLetterOrDigit(string);
    }

    /**
     * If the given character sequence is digit or letter, it return is itself, otherwise it returns the default value.
     */
    public static CharSequence isNotLetterOrDigitOr(@Nullable CharSequence sequence, @NotNull CharSequence defaultValue) {
        return isLetterOrDigit(sequence) ? sequence : defaultValue;
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


    /*
     * *****************************************************************************************************************
     * From kotlin standard library
     * *****************************************************************************************************************
     */


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
     * Returns `true` if this char sequence starts with the specified character.
     */
    public static boolean startsWith(@NotNull CharSequence charSequence, char charr, boolean ignoreCase) {
        return charSequence.length() > 0 && Charx.equals(charSequence.charAt(0), charr, ignoreCase);
    }

    /**
     * Returns `true` if this char sequence starts with the specified character.
     */
    public static boolean startsWith(@NotNull CharSequence charSequence, char charr) {
        return startsWith(charSequence, charr, false);
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
     * Returns `true` if this char sequence ends with the specified character.
     */
    public static boolean endsWith(@NotNull CharSequence charSequence, char charr, boolean ignoreCase) {
        return charSequence.length() > 0 && Charx.equals(charSequence.charAt(charSequence.length() - 1), charr, ignoreCase);
    }

    /**
     * Returns `true` if this char sequence ends with the specified character.
     */
    public static boolean endsWith(@NotNull CharSequence charSequence, char charr) {
        return endsWith(charSequence, charr, false);
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
    public static CharSequence limit(@NotNull CharSequence string, final int length, @Nullable String suffix) {
        Premisex.require(length >= 0, new LazyValue<String>() {
            @NotNull
            @Override
            public String get() {
                return String.format("Desired length %d is less than zero.", length);
            }
        });
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
    public static CharSequence padStart(@NotNull CharSequence string, final int length, char padChar) {
        Premisex.require(length >= 0, new LazyValue<String>() {
            @NotNull
            @Override
            public String get() {
                return String.format("Desired length %d is less than zero.", length);
            }
        });
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
    public static CharSequence padEnd(@NotNull CharSequence string, final int length, char padChar) {
        Premisex.require(length >= 0, new LazyValue<String>() {
            @NotNull
            @Override
            public String get() {
                return String.format("Desired length %d is less than zero.", length);
            }
        });
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


    @Nullable
    private static Pair<Integer, String> findAnyOf(@NotNull final CharSequence charSequence, @NotNull Collection<String> strings, int startIndex, final boolean ignoreCase, boolean last) {
        if (!ignoreCase && strings.size() == 1) {
            String string = Collectionx.single(strings);
            int index = !last ? indexOf(charSequence, string, startIndex, false) : lastIndexOf(charSequence, string, startIndex, false);
            return index < 0 ? null : Pair.of(index, string);
        }

        IntRange indices = !last ? Rangex.rangeTo(Numberx.coerceAtLeast(startIndex, 0), charSequence.length())
                : Rangex.downTo(Numberx.coerceAtMost(startIndex, charSequence.length() - 1), 0);

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

    private static int indexOf(@NotNull CharSequence self, @NotNull CharSequence other, int startIndex, int endIndex, boolean ignoreCase, boolean last) {
        int finalStartIndex;
        int finalEndIndex;
        int step;

        if (!last) {
            finalStartIndex = Numberx.coerceAtLeast(startIndex, 0);
            finalEndIndex = Numberx.coerceAtMost(endIndex, self.length());
            step = 1;
        } else {
            finalStartIndex = Numberx.coerceAtMost(startIndex, self.length() - 1);
            finalEndIndex = Numberx.coerceAtLeast(endIndex, 0);
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
            for (int index = Numberx.coerceAtLeast(startIndex, 0), size = charSequence.length(); index < size; index++) {
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

        for (int index : Rangex.downTo(Numberx.coerceAtMost(startIndex, charSequence.length() - 1), 0)) {
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
}