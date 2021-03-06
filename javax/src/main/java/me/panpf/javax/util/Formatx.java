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

import me.panpf.javax.lang.Mathx;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import java.math.RoundingMode;
import java.text.DecimalFormat;

/**
 * Formatting tool method for number, time, file length, count, etc.
 */
@SuppressWarnings("WeakerAccess")
public class Formatx {

    private Formatx() {
    }

    /* ******************************************* Double and Float *******************************************/

    /**
     * Format a double number
     *
     * @param value                 Value
     * @param suffix                Suffix
     * @param decimalPlacesLength   Keep a few decimal places
     * @param decimalPlacesFillZero Use 0 instead when the number of decimal places is insufficient
     */
    @NotNull
    public static String format(double value, @NotNull String suffix, int decimalPlacesLength, boolean decimalPlacesFillZero) {
        StringBuilder buffString = new StringBuilder();
        buffString.append("#");
        if (decimalPlacesLength > 0) {
            buffString.append(".");
            for (int w = 0; w < decimalPlacesLength; w++) {
                buffString.append(decimalPlacesFillZero ? "0" : "#");
            }
        }
        buffString.append(suffix);
        DecimalFormat format = new DecimalFormat(buffString.toString());
        format.setRoundingMode(RoundingMode.HALF_UP);
        return format.format(value);
    }

    /**
     * Format a float number
     *
     * @param value                 Value
     * @param suffix                Suffix
     * @param decimalPlacesLength   Keep a few decimal places
     * @param decimalPlacesFillZero Use 0 instead when the number of decimal places is insufficient
     */
    @NotNull
    public static String format(float value, @NotNull String suffix, int decimalPlacesLength, boolean decimalPlacesFillZero) {
        return format((double) value, suffix, decimalPlacesLength, decimalPlacesFillZero);
    }


    /* ******************************************* percent *******************************************/


    /**
     * Calculate the percentage
     *
     * @param value1                value1
     * @param value2                value2
     * @param decimalPlacesLength   Keep a few decimal places
     * @param decimalPlacesFillZero Use 0 instead when the number of decimal places is insufficient
     */
    @NotNull
    public static String percent(double value1, double value2, int decimalPlacesLength, boolean decimalPlacesFillZero) {
        return format(value2 != 0.0 ? value1 / value2 : 1.0, "%", decimalPlacesLength, decimalPlacesFillZero);
    }

    /**
     * Calculate the percentage
     *
     * @param value1              value1
     * @param value2              value2
     * @param decimalPlacesLength Keep a few decimal places
     */
    @NotNull
    public static String percent(double value1, double value2, int decimalPlacesLength) {
        return percent(value1, value2, decimalPlacesLength, false);
    }

    /**
     * Calculate the percentage, Leave two decimal places by default
     *
     * @param value1 value1
     * @param value2 value2
     */
    @NotNull
    public static String percent(double value1, double value2) {
        return percent(value1, value2, 2, false);
    }

    /**
     * Calculate the percentage
     *
     * @param value1                value1
     * @param value2                value2
     * @param decimalPlacesLength   Keep a few decimal places
     * @param decimalPlacesFillZero Use 0 instead when the number of decimal places is insufficient
     */
    @NotNull
    public static String percent(float value1, float value2, int decimalPlacesLength, boolean decimalPlacesFillZero) {
        return format(value2 != 0f ? value1 / value2 : 1f, "%", decimalPlacesLength, decimalPlacesFillZero);
    }

    /**
     * Calculate the percentage
     *
     * @param value1              value1
     * @param value2              value2
     * @param decimalPlacesLength Keep a few decimal places
     */
    @NotNull
    public static String percent(float value1, float value2, int decimalPlacesLength) {
        return percent(value1, value2, decimalPlacesLength, false);
    }

    /**
     * Calculate the percentage, Leave two decimal places by default
     *
     * @param value1 value1
     * @param value2 value2
     */
    @NotNull
    public static String percent(float value1, float value2) {
        return percent(value1, value2, 2, false);
    }


    /**
     * Calculate the percentage
     *
     * @param value1                value1
     * @param value2                value2
     * @param decimalPlacesLength   Keep a few decimal places
     * @param decimalPlacesFillZero Use 0 instead when the number of decimal places is insufficient
     */
    @NotNull
    public static String percent(int value1, int value2, int decimalPlacesLength, boolean decimalPlacesFillZero) {
        return percent((double) value1, (double) value2, decimalPlacesLength, decimalPlacesFillZero);
    }

    /**
     * Calculate the percentage
     *
     * @param value1              value1
     * @param value2              value2
     * @param decimalPlacesLength Keep a few decimal places
     */
    @NotNull
    public static String percent(int value1, int value2, int decimalPlacesLength) {
        return percent((double) value1, (double) value2, decimalPlacesLength, false);
    }

    /**
     * Calculate the percentage, Leave two decimal places by default
     *
     * @param value1 value1
     * @param value2 value2
     */
    public static String percent(int value1, int value2) {
        return percent((double) value1, (double) value2, 2, false);
    }


    /**
     * Calculate the percentage
     *
     * @param value1                value1
     * @param value2                value2
     * @param decimalPlacesLength   Keep a few decimal places
     * @param decimalPlacesFillZero Use 0 instead when the number of decimal places is insufficient
     */
    @NotNull
    public static String percent(long value1, long value2, int decimalPlacesLength, boolean decimalPlacesFillZero) {
        return percent((double) value1, (double) value2, decimalPlacesLength, decimalPlacesFillZero);
    }

    /**
     * Calculate the percentage
     *
     * @param value1              value1
     * @param value2              value2
     * @param decimalPlacesLength Keep a few decimal places
     */
    @NotNull
    public static String percent(long value1, long value2, int decimalPlacesLength) {
        return percent((double) value1, (double) value2, decimalPlacesLength, false);
    }

    /**
     * Calculate the percentage, Leave two decimal places by default
     *
     * @param value1 value1
     * @param value2 value2
     */
    @NotNull
    public static String percent(long value1, long value2) {
        return percent((double) value1, (double) value2, 2, false);
    }


    /* ******************************************* fileSize *******************************************/


    /**
     * Returns the formatted file length that can be displayed, up to EB
     *
     * @param fileSize              File size
     * @param decimalPlacesLength   Keep a few decimal places
     * @param decimalPlacesFillZero Use 0 instead when the number of decimal places is insufficient
     * @return For example: 300 B, 150.25 KB, 500.46 MB, 300 GB
     */
    @NotNull
    public static String fileSize(long fileSize, int decimalPlacesLength, boolean decimalPlacesFillZero) {
        // Multiplied by 999 to avoid 1000 KB, 1000 MB
        long finalFileSize = Math.max(fileSize, 0);
        if (finalFileSize <= 999) {
            return finalFileSize + " B";
        } else if (finalFileSize <= 1024L * 999) {
            return format(finalFileSize / 1024f, " KB", decimalPlacesLength, decimalPlacesFillZero);
        } else if (finalFileSize <= 1024L * 1024 * 999) {
            return format(finalFileSize / 1024f / 1024f, " MB", decimalPlacesLength, decimalPlacesFillZero);
        } else if (finalFileSize <= 1024L * 1024 * 1024 * 999) {
            return format(finalFileSize / 1024f / 1024f / 1024f, " GB", decimalPlacesLength, decimalPlacesFillZero);
        } else if (finalFileSize <= 1024L * 1024 * 1024 * 1024 * 999) {
            return format(finalFileSize / 1024f / 1024f / 1024f / 1024f, " TB", decimalPlacesLength, decimalPlacesFillZero);
        } else if (finalFileSize <= 1024L * 1024 * 1024 * 1024 * 1024 * 999) {
            return format(finalFileSize / 1024f / 1024f / 1024f / 1024f / 1024f, " PB", decimalPlacesLength, decimalPlacesFillZero);
        } else {
            return format(finalFileSize / 1024f / 1024f / 1024f / 1024f / 1024f / 1024f, " EB", decimalPlacesLength, decimalPlacesFillZero);
        }
    }

    /**
     * Returns the length of the formatted file that can be displayed. By default, it retains 2 decimal places and supports up to EB.
     *
     * @param fileSize              File size
     * @param decimalPlacesFillZero Use 0 instead when the number of decimal places is insufficient
     * @return For example: 300 B, 150.25 KB, 500.46 MB, 300 GB
     */
    @NotNull
    public static String fileSize(long fileSize, boolean decimalPlacesFillZero) {
        return fileSize(fileSize, 2, decimalPlacesFillZero);
    }

    /**
     * Returns the length of the formatted file that can be displayed. By default, it retains 2 decimal places and supports up to EB.
     *
     * @param fileSize File size
     * @return For example: 300 B, 150.25 KB, 500.46 MB, 300 GB
     */
    @NotNull
    public static String fileSize(long fileSize) {
        return fileSize(fileSize, 2, false);
    }

    /**
     * Returns the length of the formatted file that can be displayed. The default is 1 decimal place. The maximum support is EB.
     *
     * @param fileSize              File size
     * @param decimalPlacesFillZero Use 0 instead when the number of decimal places is insufficient
     * @return For example: 300 B, 150.3 KB, 500.5 MB, 300 GB
     */
    @NotNull
    public static String mediumFileSize(long fileSize, boolean decimalPlacesFillZero) {
        return fileSize(fileSize, 1, decimalPlacesFillZero);
    }

    /**
     * Returns the length of the formatted file that can be displayed. The default is 1 decimal place. The maximum support is EB.
     *
     * @param fileSize File size
     * @return For example: 300 B, 150.3 KB, 500.5 MB, 300 GB
     */
    @NotNull
    public static String mediumFileSize(long fileSize) {
        return fileSize(fileSize, 1, false);
    }

    /**
     * Returns the length of the formatted file that can be displayed. The default is not to retain decimals. The maximum support is EB.
     *
     * @param fileSize File size
     * @return For example: 300 B, 150 KB, 500 MB, 300 GB
     */
    @NotNull
    public static String shortFileSize(long fileSize) {
        return fileSize(fileSize, 0, false);
    }


    /* ******************************************* totalTime *******************************************/


    private static final long ONE_DAY_MILLISECONDS = 1000 * 60 * 60 * 24;
    private static final long ONE_HOUR_MILLISECONDS = 1000 * 60 * 60;
    private static final long ONE_MINUTE_MILLISECONDS = 1000 * 60;
    private static final long ONE_SECOND_MILLISECONDS = 1000;

    /**
     * Returns the total time of formatting that can be displayed
     */
    @NotNull
    public static String totalTime(long totalTimeMillis, @NotNull TotalTimeConfig config) {
        long finalTotalTimeMillis = totalTimeMillis >= 0 ? totalTimeMillis : 0;
        int finalLevel = Math.max(config.getLevel(), 0);

        long day = finalLevel <= 4 ? finalTotalTimeMillis / ONE_DAY_MILLISECONDS : 0;
        long hour = finalLevel <= 3 ? finalTotalTimeMillis % (ONE_DAY_MILLISECONDS) / (ONE_HOUR_MILLISECONDS) : 0;
        long minute = finalLevel <= 2 ? finalTotalTimeMillis % (ONE_HOUR_MILLISECONDS) / (ONE_MINUTE_MILLISECONDS) : 0;
        long second = finalLevel <= 1 ? finalTotalTimeMillis % (ONE_MINUTE_MILLISECONDS) / ONE_SECOND_MILLISECONDS : 0;
        long millisecond = finalLevel <= 0 ? finalTotalTimeMillis % ONE_SECOND_MILLISECONDS : 0;

        StringBuilder builder = new StringBuilder();
        if (day > 0) {
            builder.append(day).append(config.getDaySuffix());
        }
        if (hour > 0) {
            if (builder.length() > 0) builder.append(config.getDivider());
            builder.append(hour).append(config.getHourSuffix());
        }
        if (minute > 0) {
            if (builder.length() > 0) builder.append(config.getDivider());
            builder.append(minute).append(config.getMinuteSuffix());
        }
        if (second > 0) {
            if (builder.length() > 0) builder.append(config.getDivider());
            builder.append(second).append(config.getSecondSuffix());
        }
        if (millisecond > 0) {
            if (builder.length() > 0) builder.append(config.getDivider());
            builder.append(millisecond).append(config.getMillisecondSuffix());
        }
        if (builder.length() == 0) {
            if (finalLevel <= 0) {
                builder.append(0).append(config.getSecondSuffix());
            } else if (finalLevel <= 1) {
                builder.append(0).append(config.getSecondSuffix());
            } else if (finalLevel <= 2) {
                builder.append(0).append(config.getMinuteSuffix());
            } else if (finalLevel <= 3) {
                builder.append(0).append(config.getHourSuffix());
            } else if (finalLevel <= 4) {
                builder.append(0).append(config.getDaySuffix());
            } else {
                builder.append(0).append(config.getDaySuffix());
            }
        }
        return builder.toString();
    }

    /**
     * Returns the total time of formatting that can be displayed
     *
     * @param level 0: Accurate to milliseconds; 1: Accurate to seconds; 2: Accurate to minute; 3: Accurate to hour; 4: Accurate to day; 5 or more always returns 0 seconds
     */
    @NotNull
    public static String totalTime(long totalTimeMillis, int level, @NotNull String divider,
                                   @NotNull String daySuffix, @NotNull String hourSuffix, @NotNull String minuteSuffix,
                                   @NotNull String secondSuffix, @NotNull String millisecondSuffix) {
        return totalTime(totalTimeMillis, new TotalTimeConfig(level, divider, daySuffix, hourSuffix, minuteSuffix, secondSuffix, millisecondSuffix));
    }

    /**
     * Returns the total time of formatting that can be displayed
     *
     * @param level 0: Accurate to milliseconds; 1: Accurate to seconds; 2: Accurate to minute; 3: Accurate to hour; 4: Accurate to day; 5 or more always returns 0 seconds
     */
    @NotNull
    public static String totalTime(long totalTimeMillis, int level) {
        return totalTime(totalTimeMillis, level, " ", "d", "h", "m", "s", "ms");
    }

    /**
     * Returns the total time of formatting that can be displayed
     */
    @NotNull
    public static String totalTime(long totalTimeMillis) {
        return totalTime(totalTimeMillis, 0);
    }

    /**
     * Returns the total time of formatting that can be displayed
     *
     * @param level 0: Accurate to milliseconds; 1: Accurate to seconds; 2: Accurate to minute; 3: Accurate to hour; 4: Accurate to day; 5 or more always returns 0 seconds
     */
    @NotNull
    public static String totalTime(int totalTime, int level) {
        return totalTime((long) totalTime, level);
    }

    /**
     * Returns the total time of formatting that can be displayed
     */
    @NotNull
    public static String totalTime(int totalTime) {
        return totalTime((long) totalTime, 0);
    }

    /**
     * Returns the total time of formatting that can be displayed
     *
     * @param level 0: Accurate to milliseconds; 1: Accurate to seconds; 2: Accurate to minute; 3: Accurate to hour; 4: Accurate to day; 5 or more always returns 0 seconds
     */
    @NotNull
    public static String totalTimeZH(long totalTimeMillis, int level) {
        return totalTime(totalTimeMillis, level, " ", "天", "小时", "分钟", "秒", "毫秒");
    }

    /**
     * Returns the total time of formatting that can be displayed
     */
    @NotNull
    public static String totalTimeZH(long totalTimeMillis) {
        return totalTimeZH(totalTimeMillis, 0);
    }

    /**
     * Returns the total time of formatting that can be displayed
     *
     * @param level 0: Accurate to milliseconds; 1: Accurate to seconds; 2: Accurate to minute; 3: Accurate to hour; 4: Accurate to day; 5 or more always returns 0 seconds
     */
    @NotNull
    public static String totalTimeZH(int totalTime, int level) {
        return totalTimeZH((long) totalTime, level);
    }

    /**
     * Returns the total time of formatting that can be displayed
     */
    @NotNull
    public static String totalTimeZH(int totalTime) {
        return totalTimeZH((long) totalTime, 0);
    }

    /**
     * Returns the total time of formatting that can be displayed
     *
     * @param level 0: Accurate to milliseconds; 1: Accurate to seconds; 2: Accurate to minute; 3: Accurate to hour; 4: Accurate to day; 5 or more always returns 0 seconds
     */
    @NotNull
    public static String shortTotalTime(long totalTimeMillis, int level) {
        return totalTime(totalTimeMillis, level, "", "d", "h", "m", "s", "ms");
    }

    /**
     * Returns the total time of formatting that can be displayed
     */
    @NotNull
    public static String shortTotalTime(long totalTimeMillis) {
        return shortTotalTime(totalTimeMillis, 0);
    }

    /**
     * Returns the total time of formatting that can be displayed
     *
     * @param level 0: Accurate to milliseconds; 1: Accurate to seconds; 2: Accurate to minute; 3: Accurate to hour; 4: Accurate to day; 5 or more always returns 0 seconds
     */
    @NotNull
    public static String shortTotalTime(int totalTime, int level) {
        return shortTotalTime((long) totalTime, level);
    }

    /**
     * Returns the total time of formatting that can be displayed
     */
    @NotNull
    public static String shortTotalTime(int totalTime) {
        return shortTotalTime((long) totalTime, 0);
    }

    /**
     * Returns the total time of formatting that can be displayed
     *
     * @param level 0: Accurate to milliseconds; 1: Accurate to seconds; 2: Accurate to minute; 3: Accurate to hour; 4: Accurate to day; 5 or more always returns 0 seconds
     */
    @NotNull
    public static String shortTotalTimeZH(long totalTimeMillis, int level) {
        return totalTime(totalTimeMillis, level, "", "天", "小时", "分钟", "秒", "毫秒");
    }

    /**
     * Returns the total time of formatting that can be displayed
     */
    @NotNull
    public static String shortTotalTimeZH(long totalTimeMillis) {
        return shortTotalTimeZH(totalTimeMillis, 0);
    }

    /**
     * Returns the total time of formatting that can be displayed
     *
     * @param level 0: Accurate to milliseconds; 1: Accurate to seconds; 2: Accurate to minute; 3: Accurate to hour; 4: Accurate to day; 5 or more always returns 0 seconds
     */
    @NotNull
    public static String shortTotalTimeZH(int totalTime, int level) {
        return shortTotalTimeZH((long) totalTime, level);
    }

    /**
     * Returns the total time of formatting that can be displayed
     */
    @NotNull
    public static String shortTotalTimeZH(int totalTime) {
        return shortTotalTimeZH((long) totalTime, 0);
    }


    /* ******************************************* count *******************************************/


    /**
     * Formatted count, for example 1100=1.1k,15001=1.5w
     */
    @NotNull
    public static String count(long count) {
        long finalCount = Math.max(count, 0);
        if (finalCount < (long) 1000) {
            return String.valueOf(finalCount);
        } else if (finalCount < (long) 10000) {
            return format(Mathx.scale((float) finalCount / (float) 1000, 1, RoundingMode.DOWN), "k", 1, false);
        } else {
            return format(Mathx.scale((float) finalCount / (float) 10000, 1, RoundingMode.DOWN), "w", 1, false);
        }
    }

    /**
     * Formatted count, for example 1100=1.1k,15001=1.5w
     */
    @NotNull
    public static String count(int count) {
        return count((long) count);
    }


    /* ******************************************* hidden *******************************************/


    /**
     * Replaces the character of the specified length at the beginning of the string with the specified character
     */
    @NotNull
    public static String hiddenStartChars(@Nullable final String input, final int hiddenLength, final char targetChar) {
        if (input == null) return "";

        final int inputLength = input.length();
        StringBuilder builder = new StringBuilder();

        for (int index = 0, size = Math.min(hiddenLength, inputLength); index < size; index++) {
            builder.append(targetChar);
        }

        if (inputLength > hiddenLength) {
            builder.append(input, hiddenLength, inputLength);
        }

        return builder.toString();
    }

    /**
     * Replace the character of the specified length at the beginning of the string with the '*' character
     */
    @NotNull
    public static String hiddenStartChars(@Nullable final String input, final int hiddenLength) {
        return hiddenStartChars(input, hiddenLength, '*');
    }

    /**
     * Replaces the specified length of characters in the middle of the string with the specified character
     */
    @NotNull
    public static String hiddenMiddleChars(@Nullable final String input, final int hiddenLength, final char targetChar) {
        if (input == null) return "";

        final int inputLength = input.length();
        StringBuilder builder = new StringBuilder();

        if (inputLength > hiddenLength) {
            builder.append(input, 0, (inputLength - hiddenLength) / 2);
        }

        for (int index = 0, size = Math.min(hiddenLength, inputLength); index < size; index++) {
            builder.append(targetChar);
        }

        if (inputLength > hiddenLength) {
            builder.append(input, hiddenLength + ((inputLength - hiddenLength) / 2), inputLength);
        }

        return builder.toString();
    }

    /**
     * Replace the character of the specified length in the middle of the string with the '*' character
     */
    @NotNull
    public static String hiddenMiddleChars(@Nullable final String input, final int hiddenLength) {
        return hiddenMiddleChars(input, hiddenLength, '*');
    }

    /**
     * Replaces the specified length of characters at the end of the string with the specified character
     */
    @NotNull
    public static String hiddenEndChars(@Nullable final String input, final int hiddenLength, final char targetChar) {
        if (input == null) return "";

        final int inputLength = input.length();
        StringBuilder builder = new StringBuilder();

        if (inputLength > hiddenLength) {
            builder.append(input, 0, inputLength - hiddenLength);
        }

        for (int index = 0, size = Math.min(hiddenLength, inputLength); index < size; index++) {
            builder.append(targetChar);
        }

        return builder.toString();
    }

    /**
     * Replace the character of the specified length at the end of the string with the '*' character
     */
    @NotNull
    public static String hiddenEndChars(@Nullable final String input, final int hiddenLength) {
        return hiddenEndChars(input, hiddenLength, '*');
    }


    /* ******************************************* pad *******************************************/


    /**
     * Converts the given number to a string of a given length. If the number of digits is not enough, it is added 0 in front.
     */
    public static String pad(int digit, int stringLength) {
        return String.format("%0" + stringLength + "d", digit);
    }

    /**
     * Converts the given number to a string of a given length. If the number of digits is not enough, it is added 0 in front.
     */
    public static String pad(long digit, int stringLength) {
        return String.format("%0" + stringLength + "d", digit);
    }


    /* ******************************************* duration *******************************************/


    /**
     * Format the duration of the video or music, such as '01:23:22'
     *
     * @param duration Duration, in milliseconds
     * @param shorted  If true, '00:23:22' will return '23:22'
     */
    private static String duration(long duration, boolean shorted) {
        long secondsRemaining = duration / 1000 % 60;
        long minuteRemaining = duration / 1000 / 60 % 60;
        long hour = duration / 1000 / 60 / 60;

        StringBuilder builder = new StringBuilder();

        if (hour >= 10) {
            builder.append(hour);
        } else if (hour >= 1) {
            builder.append("0").append(hour);
        } else {
            if (!shorted) {
                builder.append("00");
            }
        }

        if (builder.length() > 0) {
            builder.append(":");
        }
        if (minuteRemaining >= 10) {
            builder.append(minuteRemaining);
        } else if (minuteRemaining >= 1) {
            builder.append("0").append(minuteRemaining);
        } else {
            builder.append("00");
        }

        if (builder.length() > 0) {
            builder.append(":");
        }
        if (secondsRemaining >= 10) {
            builder.append(secondsRemaining);
        } else if (secondsRemaining >= 1) {
            builder.append("0").append(secondsRemaining);
        } else {
            builder.append("00");
        }
        return builder.toString();
    }

    /**
     * Format the duration of the video or music, such as '01:23:22'
     *
     * @param duration Duration, in milliseconds
     */
    public static String duration(long duration) {
        return duration(duration, false);
    }

    /**
     * Format the duration of the video or music, such as '01:23:22', '00:23:22' will return '23:22'
     *
     * @param duration Duration, in milliseconds
     */
    public static String shortDuration(long duration) {
        return duration(duration, true);
    }

    public static class TotalTimeConfig {
        /**
         * level 0: Accurate to milliseconds; 1: Accurate to seconds; 2: Accurate to minute; 3: Accurate to hour; 4: Accurate to day; 5 or more always returns 0 seconds
         */
        private int level;
        @NotNull
        private String divider;
        @NotNull
        private String daySuffix;
        @NotNull
        private String hourSuffix;
        @NotNull
        private String minuteSuffix;
        @NotNull
        private String secondSuffix;
        @NotNull
        private String millisecondSuffix;

        public TotalTimeConfig(int level, @NotNull String divider, @NotNull String daySuffix, @NotNull String hourSuffix, @NotNull String minuteSuffix, @NotNull String secondSuffix, @NotNull String millisecondSuffix) {
            this.level = level;
            this.divider = divider;
            this.daySuffix = daySuffix;
            this.hourSuffix = hourSuffix;
            this.minuteSuffix = minuteSuffix;
            this.secondSuffix = secondSuffix;
            this.millisecondSuffix = millisecondSuffix;
        }

        public int getLevel() {
            return level;
        }

        @NotNull
        public String getDivider() {
            return divider;
        }

        @NotNull
        public String getDaySuffix() {
            return daySuffix;
        }

        @NotNull
        public String getHourSuffix() {
            return hourSuffix;
        }

        @NotNull
        public String getMinuteSuffix() {
            return minuteSuffix;
        }

        @NotNull
        public String getSecondSuffix() {
            return secondSuffix;
        }

        @NotNull
        public String getMillisecondSuffix() {
            return millisecondSuffix;
        }
    }
}