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
        return new DecimalFormat(buffString.toString()).format(value);
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


    /**
     * Calculate the percentage
     *
     * @param value                 Value
     * @param decimalPlacesLength   Keep a few decimal places
     * @param decimalPlacesFillZero Use 0 instead when the number of decimal places is insufficient
     */
    @NotNull
    public static String percent(double value, int decimalPlacesLength, boolean decimalPlacesFillZero) {
        return format(value, "%", decimalPlacesLength, decimalPlacesFillZero);
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
     * Calculate the percentage, Leave two decimal places by default
     *
     * @param value1 value1
     * @param value2 value2
     */
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
        return format(value, "%", decimalPlacesLength, decimalPlacesFillZero);
    }

    /**
     * Calculate the percentage
     *
     * @param value Value
     */
    @NotNull
    public static String percent(float value) {
        return format(value, "%", 2, false);
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
     * Calculate the percentage, Leave two decimal places by default
     *
     * @param value1 value1
     * @param value2 value2
     */
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
     * Calculate the percentage, Leave two decimal places by default
     *
     * @param value1 value1
     * @param value2 value2
     */
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
    public static String fileSize(long fileSize, int decimalPlacesLength, boolean decimalPlacesFillZero) {
        if (fileSize < 1024) {
            return fileSize + " B";
        } else if (fileSize < 1024L * 1024) {
            return format(fileSize / 1024f, " KB", decimalPlacesLength, decimalPlacesFillZero);
        } else if (fileSize < 1024L * 1024 * 1024) {
            return format(fileSize / 1024f / 1024f, " MB", decimalPlacesLength, decimalPlacesFillZero);
        } else if (fileSize < 1024L * 1024 * 1024 * 1024) {
            return format(fileSize / 1024f / 1024f / 1024f, " GB", decimalPlacesLength, decimalPlacesFillZero);
        } else if (fileSize < 1024L * 1024 * 1024 * 1024 * 1024) {
            return format(fileSize / 1024f / 1024f / 1024f / 1024f, " TB", decimalPlacesLength, decimalPlacesFillZero);
        } else if (fileSize < 1024L * 1024 * 1024 * 1024 * 1024 * 1024) {
            return format(fileSize / 1024f / 1024f / 1024f / 1024f / 1024f, " PB", decimalPlacesLength, decimalPlacesFillZero);
        } else {
            return format(fileSize / 1024f / 1024f / 1024f / 1024f / 1024f / 1024f, " EB", decimalPlacesLength, decimalPlacesFillZero);
        }
    }

    /**
     * Returns the length of the formatted file that can be displayed. By default, it retains 2 decimal places and supports up to EB.
     *
     * @param fileSize              File size
     * @param decimalPlacesFillZero Use 0 instead when the number of decimal places is insufficient
     * @return For example: 300 B, 150.25 KB, 500.46 MB, 300 GB
     */
    public static String fileSize(long fileSize, boolean decimalPlacesFillZero) {
        return fileSize(fileSize, 2, decimalPlacesFillZero);
    }

    /**
     * Returns the length of the formatted file that can be displayed. By default, it retains 2 decimal places and supports up to EB.
     *
     * @param fileSize File size
     * @return For example: 300 B, 150.25 KB, 500.46 MB, 300 GB
     */
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
    public static String mediumFileSize(long fileSize, boolean decimalPlacesFillZero) {
        return fileSize(fileSize, 1, decimalPlacesFillZero);
    }

    /**
     * Returns the length of the formatted file that can be displayed. The default is 1 decimal place. The maximum support is EB.
     *
     * @param fileSize File size
     * @return For example: 300 B, 150.3 KB, 500.5 MB, 300 GB
     */
    public static String mediumFileSize(long fileSize) {
        return fileSize(fileSize, 1, false);
    }

    /**
     * Returns the length of the formatted file that can be displayed. The default is not to retain decimals. The maximum support is EB.
     *
     * @param fileSize File size
     * @return For example: 300 B, 150 KB, 500 MB, 300 GB
     */
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
    public static String totalTime(long totalTimeMillis, boolean ignoreMillisecond) {
        long finalTotalTimeMillis = totalTimeMillis >= 0 ? totalTimeMillis : 0;

        if (!ignoreMillisecond && finalTotalTimeMillis < ONE_SECOND_MILLISECONDS) {
            // millisecond
            return finalTotalTimeMillis + "ms";
        } else if (finalTotalTimeMillis < ONE_MINUTE_MILLISECONDS) {
            // second
            long second = finalTotalTimeMillis / ONE_SECOND_MILLISECONDS;
            long millisecond = !ignoreMillisecond ? finalTotalTimeMillis % ONE_SECOND_MILLISECONDS : 0;
            return second + "s" + (millisecond > 0 ? millisecond + "ms" : "");
        } else if (finalTotalTimeMillis < ONE_HOUR_MILLISECONDS) {
            // minute
            long minute = finalTotalTimeMillis / (ONE_MINUTE_MILLISECONDS);
            long second = finalTotalTimeMillis % (ONE_MINUTE_MILLISECONDS) / ONE_SECOND_MILLISECONDS;
            long millisecond = !ignoreMillisecond ? finalTotalTimeMillis % ONE_SECOND_MILLISECONDS : 0;
            return minute + "m" + (second > 0 ? second + "s" : "") + (millisecond > 0 ? millisecond + "ms" : "");
        } else if (finalTotalTimeMillis < ONE_DAY_MILLISECONDS) {
            // hour
            long hour = finalTotalTimeMillis / (ONE_HOUR_MILLISECONDS);
            long minute = finalTotalTimeMillis % (ONE_HOUR_MILLISECONDS) / (ONE_MINUTE_MILLISECONDS);
            long second = finalTotalTimeMillis % (ONE_MINUTE_MILLISECONDS) / ONE_SECOND_MILLISECONDS;
            long millisecond = !ignoreMillisecond ? finalTotalTimeMillis % ONE_SECOND_MILLISECONDS : 0;
            return hour + "h" + (minute > 0 ? minute + "m" : "") + (second > 0 ? second + "s" : "") + (millisecond > 0 ? millisecond + "ms" : "");
        } else {
            // day
            long day = finalTotalTimeMillis / ONE_DAY_MILLISECONDS;
            long hour = finalTotalTimeMillis % (ONE_DAY_MILLISECONDS) / (ONE_HOUR_MILLISECONDS);
            long minute = finalTotalTimeMillis % (ONE_HOUR_MILLISECONDS) / (ONE_MINUTE_MILLISECONDS);
            long second = finalTotalTimeMillis % (ONE_MINUTE_MILLISECONDS) / ONE_SECOND_MILLISECONDS;
            long millisecond = !ignoreMillisecond ? finalTotalTimeMillis % ONE_SECOND_MILLISECONDS : 0;
            return day + "d" + (hour > 0 ? hour + "h" : "") + (minute > 0 ? minute + "m" : "") + (second > 0 ? second + "s" : "") + (millisecond > 0 ? millisecond + "ms" : "");
        }
    }

    /**
     * Returns the total time of formatting that can be displayed
     */
    public static String totalTime(long totalTimeMillis) {
        return totalTime(totalTimeMillis, false);
    }

    /**
     * Returns the total time of formatting that can be displayed
     *
     * @param ignoreMillisecond Ignore milliseconds
     */
    public static String totalTime(int totalTime, boolean ignoreMillisecond) {
        return totalTime((long) totalTime, ignoreMillisecond);
    }

    /**
     * Returns the total time of formatting that can be displayed
     */
    public static String totalTime(int totalTime) {
        return totalTime((long) totalTime, false);
    }
}