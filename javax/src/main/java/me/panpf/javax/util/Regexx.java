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

package me.panpf.javax.util;

import me.panpf.javax.lang.Stringx;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import java.util.LinkedList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

@SuppressWarnings("WeakerAccess")
public class Regexx {

    public static final Pattern IPV4 = Pattern.compile("((?:(?:25[0-5]|2[0-4]\\d|(?:1\\d{2}|[1-9]?\\d))\\.){3}(?:25[0-5]|2[0-4]\\d|(?:1\\d{2}|[1-9]?\\d)))");
    @SuppressWarnings("unused")
    public static final Pattern IPV6 = Pattern.compile("^([da-fA-F]{1,4}:){7}[da-fA-F]{1,4}$|^:((:[da-fA-F]{1,4}) {1,6}|:)$|^[da-fA-F]{1,4}:((:[da-fA-F]{1,4}){1,5}|:)$|^([da-fA-F]{1,4}:){2}((:[da-fA-F]{1,4}){1,4}|:)$|^([da-fA-F]{1,4}:){3}((:[da-fA-F]{1,4}){1,3}|:)$|^([da-fA-F]{1,4}:){4}((:[da-fA-F]{1,4}){1,2}|:)$|^([da-fA-F]{1,4}:){5}:([da-fA-F]{1,4})?$|^([da-fA-F]{1,4}:){6}:$");


    /**
     * Return true if the entire sequence of characters matches the given regular expression
     */
    public static boolean matches(@NotNull Pattern pattern, @Nullable CharSequence charSequence) {
        return pattern.matcher(Stringx.orEmpty(charSequence)).matches();
    }

    /**
     * Return true if the entire sequence of characters matches the given regular expression
     */
    public static boolean matches(@NotNull String regex, @Nullable CharSequence charSequence) {
        return matches(Pattern.compile(regex), Stringx.orEmpty(charSequence));
    }

    /**
     * Returns true if the specified sequence of characters matches any given position from the specified position to the given regular expression
     */
    public static boolean find(@NotNull Pattern pattern, @Nullable CharSequence charSequence, int start) {
        return pattern.matcher(Stringx.orEmpty(charSequence)).find(start);
    }

    /**
     * Returns true if the specified sequence of characters matches any given position from the specified position to the given regular expression
     */
    public static boolean find(@NotNull String regex, @Nullable CharSequence charSequence, int start) {
        return find(Pattern.compile(regex), charSequence, start);
    }

    /**
     * Return true if a given regular expression is matched anywhere in a given sequence of characters
     */
    public static boolean find(@NotNull Pattern pattern, @Nullable CharSequence charSequence) {
        return pattern.matcher(Stringx.orEmpty(charSequence)).find();
    }

    /**
     * Return true if a given regular expression is matched anywhere in a given sequence of characters
     */
    public static boolean find(@NotNull String regex, @Nullable CharSequence charSequence) {
        return find(Pattern.compile(regex), charSequence);
    }

    /**
     * Return true if the given regular expression is matched at the beginning of the character sequence
     */
    public static boolean lookingAt(@NotNull Pattern pattern, @Nullable CharSequence charSequence) {
        return pattern.matcher(Stringx.orEmpty(charSequence)).lookingAt();
    }

    /**
     * Return true if the given regular expression is matched at the beginning of the character sequence
     */
    public static boolean lookingAt(@NotNull String regex, @Nullable CharSequence charSequence) {
        return lookingAt(Pattern.compile(regex), charSequence);
    }

    /**
     * Get the first matching string
     */
    @Nullable
    public static String getFirst(@NotNull Pattern pattern, @Nullable CharSequence charSequence) {
        Matcher matcher = pattern.matcher(Stringx.orEmpty(charSequence));
        return matcher.find() ? matcher.group() : null;
    }

    /**
     * Get the first matching string
     */
    @Nullable
    public static String getFirst(@NotNull String regex, @Nullable CharSequence charSequence) {
        return getFirst(Pattern.compile(regex), charSequence);
    }

    /**
     * Get the all matching string
     */
    @NotNull
    public static String[] getAll(@NotNull Pattern pattern, @Nullable CharSequence charSequence) {
        Matcher matcher = pattern.matcher(Stringx.orEmpty(charSequence));
        List<String> stringList = new LinkedList<>();
        while (matcher.find()) {
            stringList.add(matcher.group());
        }
        return stringList.toArray(new String[0]);
    }

    /**
     * Get the all matching string
     */
    @NotNull
    public static String[] getAll(@NotNull String regex, @Nullable CharSequence charSequence) {
        return getAll(Pattern.compile(regex), charSequence);
    }

    /**
     * Get the first matching group
     */
    @Nullable
    public static Group firstGroup(@NotNull Pattern pattern, @Nullable CharSequence charSequence) {
        Matcher matcher = pattern.matcher(Stringx.orEmpty(charSequence));
        return matcher.find() ? new Group(matcher.start(), matcher.end(), matcher.group()) : null;
    }

    /**
     * Get the first matching group
     */
    @Nullable
    public static Group firstGroup(@NotNull String regex, @Nullable CharSequence charSequence) {
        return firstGroup(Pattern.compile(regex), charSequence);
    }

    /**
     * Get the all matching group
     */
    @NotNull
    public static Group[] allGroup(@NotNull Pattern pattern, @Nullable CharSequence charSequence) {
        Matcher matcher = pattern.matcher(Stringx.orEmpty(charSequence));
        List<Group> stringList = new LinkedList<>();
        while (matcher.find()) {
            stringList.add(new Group(matcher.start(), matcher.end(), matcher.group()));
        }
        return stringList.toArray(new Group[0]);
    }

    /**
     * Get the all matching group
     */
    @NotNull
    public static Group[] allGroup(@NotNull String regex, @Nullable CharSequence charSequence) {
        return allGroup(Pattern.compile(regex), charSequence);
    }

    /**
     * Replace the first matching string
     */
    @NotNull
    public static String replaceFirst(@NotNull Pattern pattern, @Nullable CharSequence charSequence, @NotNull String replacement) {
        return pattern.matcher(Stringx.orEmpty(charSequence)).replaceFirst(replacement);
    }

    /**
     * Replace the first matching string
     */
    @NotNull
    public static String replaceFirst(@NotNull String regex, @Nullable CharSequence charSequence, @NotNull String replacement) {
        return replaceFirst(Pattern.compile(regex), charSequence, replacement);
    }

    /**
     * Replace the all matching string
     */
    @NotNull
    public static String replaceAll(@NotNull Pattern pattern, @Nullable CharSequence charSequence, @NotNull String replacement) {
        return pattern.matcher(Stringx.orEmpty(charSequence)).replaceAll(replacement);
    }

    /**
     * Replace the all matching string
     */
    @NotNull
    public static String replaceAll(@NotNull String regex, @Nullable CharSequence charSequence, @NotNull String replacement) {
        return replaceAll(Pattern.compile(regex), charSequence, replacement);
    }

    public static class Group {
        private int start;
        private int end;
        @NotNull
        private String content;

        public Group(int start, int end, @NotNull String content) {
            this.start = start;
            this.end = end;
            this.content = content;
        }

        public int getStart() {
            return start;
        }

        public int getEnd() {
            return end;
        }

        @NotNull
        public String getContent() {
            return content;
        }
    }
}
