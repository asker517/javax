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

import org.jetbrains.annotations.NotNull;

import java.math.RoundingMode;
import java.text.DecimalFormat;

/**
 * Mathematical related tool method
 */
@SuppressWarnings("WeakerAccess")
public class Formatx {

    /**
     * Format a double number
     *
     * @param value                 Value
     * @param suffix                Suffix
     * @param decimalPlacesLength   Keep a few decimal places
     * @param decimalPlacesFillZero Use 0 instead when the number of decimal places is insufficient
     */
    @NotNull
    public static String formatDouble(double value, @NotNull String suffix, int decimalPlacesLength, boolean decimalPlacesFillZero) {
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
    public static String formatFloat(float value, @NotNull String suffix, int decimalPlacesLength, boolean decimalPlacesFillZero) {
        return formatDouble((double) value, suffix, decimalPlacesLength, decimalPlacesFillZero);
    }


    /**
     * Calculate the percentage
     *
     * @param value                 Value
     * @param decimalPlacesLength   Keep a few decimal places
     * @param decimalPlacesFillZero Use 0 instead when the number of decimal places is insufficient
     */
    @NotNull
    public static String percent(double value, int decimalPlacesLength, boolean decimalPlacesFillZero) {
        return formatDouble(value, "%", decimalPlacesLength, decimalPlacesFillZero);
    }

    /**
     * Calculate the percentage
     *
     * @param value               Value
     * @param decimalPlacesLength Keep a few decimal places
     */
    @NotNull
    public static String percent(double value, int decimalPlacesLength) {
        return formatDouble(value, "%", decimalPlacesLength, false);
    }

    /**
     * Calculate the percentage, Leave two decimal places by default
     *
     * @param value Value
     */
    @NotNull
    public static String percent(double value) {
        return percent(value, 2, false);
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
    public static String percent(double value1, double value2, int decimalPlacesLength, boolean decimalPlacesFillZero) {
        return percent(value1 / value2, decimalPlacesLength, decimalPlacesFillZero);
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
        return percent(value1 / value2, decimalPlacesLength, false);
    }

    /**
     * Calculate the percentage, Leave two decimal places by default
     *
     * @param value1 value1
     * @param value2 value2
     */
    @NotNull
    public static String percent(double value1, double value2) {
        return percent(value1 / value2, 2, false);
    }

    /**
     * Calculate the percentage
     *
     * @param value                 Value
     * @param decimalPlacesLength   Keep a few decimal places
     * @param decimalPlacesFillZero Use 0 instead when the number of decimal places is insufficient
     */
    @NotNull
    public static String percent(float value, int decimalPlacesLength, boolean decimalPlacesFillZero) {
        return formatFloat(value, "%", decimalPlacesLength, decimalPlacesFillZero);
    }

    /**
     * Calculate the percentage
     *
     * @param value               Value
     * @param decimalPlacesLength Keep a few decimal places
     */
    @NotNull
    public static String percent(float value, int decimalPlacesLength) {
        return formatFloat(value, "%", decimalPlacesLength, false);
    }

    /**
     * Calculate the percentage
     *
     * @param value Value
     */
    @NotNull
    public static String percent(float value) {
        return formatFloat(value, "%", 2, false);
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
        return percent(value1 / value2, decimalPlacesLength, decimalPlacesFillZero);
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
        return percent(value1 / value2, decimalPlacesLength, false);
    }

    /**
     * Calculate the percentage, Leave two decimal places by default
     *
     * @param value1 value1
     * @param value2 value2
     */
    @NotNull
    public static String percent(float value1, float value2) {
        return percent(value1 / value2, 2, false);
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
        return percent(value1 / (double) value2, decimalPlacesLength, decimalPlacesFillZero);
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
        return percent(value1 / (double) value2, decimalPlacesLength, false);
    }

    /**
     * Calculate the percentage, Leave two decimal places by default
     *
     * @param value1 value1
     * @param value2 value2
     */
    public static String percent(int value1, int value2) {
        return percent(value1 / (double) value2, 2, false);
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
        return percent(value1 / (double) value2, decimalPlacesLength, decimalPlacesFillZero);
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
        return percent(value1 / (double) value2, decimalPlacesLength, false);
    }

    /**
     * Calculate the percentage, Leave two decimal places by default
     *
     * @param value1 value1
     * @param value2 value2
     */
    @NotNull
    public static String percent(long value1, long value2) {
        return percent(value1 / (double) value2, 2, false);
    }


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
        if (fileSize < 1024) {
            return fileSize + " B";
        } else if (fileSize < 1024L * 1024) {
            return formatFloat(fileSize / 1024f, " KB", decimalPlacesLength, decimalPlacesFillZero);
        } else if (fileSize < 1024L * 1024 * 1024) {
            return formatFloat(fileSize / 1024f / 1024f, " MB", decimalPlacesLength, decimalPlacesFillZero);
        } else if (fileSize < 1024L * 1024 * 1024 * 1024) {
            return formatFloat(fileSize / 1024f / 1024f / 1024f, " GB", decimalPlacesLength, decimalPlacesFillZero);
        } else if (fileSize < 1024L * 1024 * 1024 * 1024 * 1024) {
            return formatFloat(fileSize / 1024f / 1024f / 1024f / 1024f, " TB", decimalPlacesLength, decimalPlacesFillZero);
        } else if (fileSize < 1024L * 1024 * 1024 * 1024 * 1024 * 1024) {
            return formatFloat(fileSize / 1024f / 1024f / 1024f / 1024f / 1024f, " PB", decimalPlacesLength, decimalPlacesFillZero);
        } else {
            return formatFloat(fileSize / 1024f / 1024f / 1024f / 1024f / 1024f / 1024f, " EB", decimalPlacesLength, decimalPlacesFillZero);
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

    private static final long ONE_DAY_MILLISECONDS = 1000 * 60 * 60 * 24;
    private static final long ONE_HOUR_MILLISECONDS = 1000 * 60 * 60;
    private static final long ONE_MINUTE_MILLISECONDS = 1000 * 60;
    private static final long ONE_SECOND_MILLISECONDS = 1000;

    /**
     * Returns the total time of formatting that can be displayed
     *
     * @param ignoreMillisecond Ignore milliseconds
     */
    @NotNull
    private static String totalTime(long totalTimeMillis, boolean ignoreMillisecond, @NotNull String divider,
                                    @NotNull String daySuffix, @NotNull String hourSuffix, @NotNull String minuteSuffix,
                                    @NotNull String secondSuffix, @NotNull String millisecondSuffix) {
        long finalTotalTimeMillis = totalTimeMillis >= 0 ? totalTimeMillis : 0;

        if (!ignoreMillisecond && finalTotalTimeMillis < ONE_SECOND_MILLISECONDS) {
            // millisecond
            return finalTotalTimeMillis + millisecondSuffix;
        } else if (finalTotalTimeMillis < ONE_MINUTE_MILLISECONDS) {
            // second
            long second = finalTotalTimeMillis / ONE_SECOND_MILLISECONDS;
            long millisecond = !ignoreMillisecond ? finalTotalTimeMillis % ONE_SECOND_MILLISECONDS : 0;
            return second + secondSuffix + (millisecond > 0 ? divider + millisecond + millisecondSuffix : "");
        } else if (finalTotalTimeMillis < ONE_HOUR_MILLISECONDS) {
            // minute
            long minute = finalTotalTimeMillis / (ONE_MINUTE_MILLISECONDS);
            long second = finalTotalTimeMillis % (ONE_MINUTE_MILLISECONDS) / ONE_SECOND_MILLISECONDS;
            long millisecond = !ignoreMillisecond ? finalTotalTimeMillis % ONE_SECOND_MILLISECONDS : 0;
            return minute + minuteSuffix + (second > 0 ? divider + second + secondSuffix : "") + (millisecond > 0 ? divider + millisecond + millisecondSuffix : "");
        } else if (finalTotalTimeMillis < ONE_DAY_MILLISECONDS) {
            // hour
            long hour = finalTotalTimeMillis / (ONE_HOUR_MILLISECONDS);
            long minute = finalTotalTimeMillis % (ONE_HOUR_MILLISECONDS) / (ONE_MINUTE_MILLISECONDS);
            long second = finalTotalTimeMillis % (ONE_MINUTE_MILLISECONDS) / ONE_SECOND_MILLISECONDS;
            long millisecond = !ignoreMillisecond ? finalTotalTimeMillis % ONE_SECOND_MILLISECONDS : 0;
            return hour + hourSuffix + (minute > 0 ? divider + minute + minuteSuffix : "") + (second > 0 ? divider + second + secondSuffix : "")
                    + (millisecond > 0 ? divider + millisecond + millisecondSuffix : "");
        } else {
            // day
            long day = finalTotalTimeMillis / ONE_DAY_MILLISECONDS;
            long hour = finalTotalTimeMillis % (ONE_DAY_MILLISECONDS) / (ONE_HOUR_MILLISECONDS);
            long minute = finalTotalTimeMillis % (ONE_HOUR_MILLISECONDS) / (ONE_MINUTE_MILLISECONDS);
            long second = finalTotalTimeMillis % (ONE_MINUTE_MILLISECONDS) / ONE_SECOND_MILLISECONDS;
            long millisecond = !ignoreMillisecond ? finalTotalTimeMillis % ONE_SECOND_MILLISECONDS : 0;
            return day + daySuffix + (hour > 0 ? divider + hour + hourSuffix : "") + (minute > 0 ? divider + minute + minuteSuffix : "")
                    + (second > 0 ? divider + second + secondSuffix : "") + (millisecond > 0 ? divider + millisecond + millisecondSuffix : "");
        }
    }

    /**
     * Returns the total time of formatting that can be displayed
     *
     * @param ignoreMillisecond Ignore milliseconds
     */
    @NotNull
    private static String totalTime(long totalTimeMillis, boolean ignoreMillisecond) {
        return totalTime(totalTimeMillis, ignoreMillisecond, " ", "d", "h", "m", "s", "ms");
    }

    /**
     * Returns the total time of formatting that can be displayed
     */
    @NotNull
    public static String totalTime(long totalTimeMillis) {
        return totalTime(totalTimeMillis, false);
    }

    /**
     * Returns the total time of formatting that can be displayed
     *
     * @param ignoreMillisecond Ignore milliseconds
     */
    @NotNull
    public static String totalTime(int totalTime, boolean ignoreMillisecond) {
        return totalTime((long) totalTime, ignoreMillisecond);
    }

    /**
     * Returns the total time of formatting that can be displayed
     */
    @NotNull
    public static String totalTime(int totalTime) {
        return totalTime((long) totalTime, false);
    }

    /**
     * Returns the total time of formatting that can be displayed
     *
     * @param ignoreMillisecond Ignore milliseconds
     */
    @NotNull
    private static String totalTimeZH(long totalTimeMillis, boolean ignoreMillisecond) {
        return totalTime(totalTimeMillis, ignoreMillisecond, " ", "天", "小时", "分", "秒", "毫秒");
    }

    /**
     * Returns the total time of formatting that can be displayed
     */
    @NotNull
    public static String totalTimeZH(long totalTimeMillis) {
        return totalTimeZH(totalTimeMillis, false);
    }

    /**
     * Returns the total time of formatting that can be displayed
     *
     * @param ignoreMillisecond Ignore milliseconds
     */
    @NotNull
    public static String totalTimeZH(int totalTime, boolean ignoreMillisecond) {
        return totalTimeZH((long) totalTime, ignoreMillisecond);
    }

    /**
     * Returns the total time of formatting that can be displayed
     */
    @NotNull
    public static String totalTimeZH(int totalTime) {
        return totalTimeZH((long) totalTime, false);
    }

    /**
     * Returns the total time of formatting that can be displayed
     *
     * @param ignoreMillisecond Ignore milliseconds
     */
    @NotNull
    private static String totalTimeShort(long totalTimeMillis, boolean ignoreMillisecond) {
        return totalTime(totalTimeMillis, ignoreMillisecond, "", "d", "h", "m", "s", "ms");
    }

    /**
     * Returns the total time of formatting that can be displayed
     */
    @NotNull
    public static String totalTimeShort(long totalTimeMillis) {
        return totalTimeShort(totalTimeMillis, false);
    }

    /**
     * Returns the total time of formatting that can be displayed
     *
     * @param ignoreMillisecond Ignore milliseconds
     */
    @NotNull
    public static String totalTimeShort(int totalTime, boolean ignoreMillisecond) {
        return totalTimeShort((long) totalTime, ignoreMillisecond);
    }

    /**
     * Returns the total time of formatting that can be displayed
     */
    @NotNull
    public static String totalTimeShort(int totalTime) {
        return totalTimeShort((long) totalTime, false);
    }

    /**
     * Returns the total time of formatting that can be displayed
     *
     * @param ignoreMillisecond Ignore milliseconds
     */
    @NotNull
    private static String totalTimeZHShort(long totalTimeMillis, boolean ignoreMillisecond) {
        return totalTime(totalTimeMillis, ignoreMillisecond, "", "天", "小时", "分", "秒", "毫秒");
    }

    /**
     * Returns the total time of formatting that can be displayed
     */
    @NotNull
    public static String totalTimeZHShort(long totalTimeMillis) {
        return totalTimeZHShort(totalTimeMillis, false);
    }

    /**
     * Returns the total time of formatting that can be displayed
     *
     * @param ignoreMillisecond Ignore milliseconds
     */
    @NotNull
    public static String totalTimeZHShort(int totalTime, boolean ignoreMillisecond) {
        return totalTimeZHShort((long) totalTime, ignoreMillisecond);
    }

    /**
     * Returns the total time of formatting that can be displayed
     */
    @NotNull
    public static String totalTimeZHShort(int totalTime) {
        return totalTimeZHShort((long) totalTime, false);
    }
}