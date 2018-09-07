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
import org.jetbrains.annotations.Nullable;

import java.math.BigDecimal;
import java.math.RoundingMode;

/**
 * Integer tool class
 */
@SuppressWarnings("WeakerAccess")
public class Numberx {

    /**
     * Scale numbers in the specified mode
     *
     * @param newScale Number of digits after the decimal point
     */
    public static float scale(float number, int newScale, @NotNull RoundingMode roundingMode) {
        return new BigDecimal(number).setScale(newScale, roundingMode).floatValue();
    }

    /**
     * Scale numbers in the specified mode
     *
     * @param newScale Number of digits after the decimal point
     */
    public static float scale(float number, int newScale) {
        return new BigDecimal(number).setScale(newScale, BigDecimal.ROUND_HALF_UP).floatValue();
    }

    /**
     * Scale numbers in the specified mode
     *
     * @param newScale Number of digits after the decimal point
     */
    public static double scale(double number, int newScale, @NotNull RoundingMode roundingMode) {
        return new BigDecimal(number).setScale(newScale, roundingMode).doubleValue();
    }

    /**
     * Scale numbers in the specified mode
     *
     * @param newScale Number of digits after the decimal point
     */
    public static double scale(double number, int newScale) {
        return new BigDecimal(number).setScale(newScale, BigDecimal.ROUND_HALF_UP).doubleValue();
    }

    /* ******************************************* From Kotlin Standard library ********************************************************* */

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

    /**
     * Ensures that this value is not less than the specified [minimumValue].
     *
     * @return this value if it's greater than or equal to the [minimumValue] or the [minimumValue] otherwise.
     */
    public static <T extends Comparable<T>> T coerceAtLeast(T self, T minimumValue) {
        return self.compareTo(minimumValue) < 0 ? minimumValue : self;
    }

    /**
     * Ensures that this value is not less than the specified [minimumValue].
     *
     * @return this value if it's greater than or equal to the [minimumValue] or the [minimumValue] otherwise.
     */
    public static byte coerceAtLeast(byte self, byte minimumValue) {
        return self < minimumValue ? minimumValue : self;
    }

    /**
     * Ensures that this value is not less than the specified [minimumValue].
     *
     * @return this value if it's greater than or equal to the [minimumValue] or the [minimumValue] otherwise.
     */
    public static short coerceAtLeast(short self, short minimumValue) {
        return self < minimumValue ? minimumValue : self;
    }

    /**
     * Ensures that this value is not less than the specified [minimumValue].
     *
     * @return this value if it's greater than or equal to the [minimumValue] or the [minimumValue] otherwise.
     */
    public static int coerceAtLeast(int self, int minimumValue) {
        return self < minimumValue ? minimumValue : self;
    }

    /**
     * Ensures that this value is not less than the specified [minimumValue].
     *
     * @return this value if it's greater than or equal to the [minimumValue] or the [minimumValue] otherwise.
     */
    public static long coerceAtLeast(long self, long minimumValue) {
        return self < minimumValue ? minimumValue : self;
    }

    /**
     * Ensures that this value is not less than the specified [minimumValue].
     *
     * @return this value if it's greater than or equal to the [minimumValue] or the [minimumValue] otherwise.
     */
    public static float coerceAtLeast(float self, float minimumValue) {
        return self < minimumValue ? minimumValue : self;
    }

    /**
     * Ensures that this value is not less than the specified [minimumValue].
     *
     * @return this value if it's greater than or equal to the [minimumValue] or the [minimumValue] otherwise.
     */
    public static double coerceAtLeast(double self, double minimumValue) {
        return self < minimumValue ? minimumValue : self;
    }


    /**
     * Ensures that this value is not greater than the specified [maximumValue].
     *
     * @return this value if it's less than or equal to the [maximumValue] or the [maximumValue] otherwise.
     */
    public static <T extends Comparable<T>> T coerceAtMost(T self, T maximumValue) {
        return self.compareTo(maximumValue) > 0 ? maximumValue : self;
    }

    /**
     * Ensures that this value is not greater than the specified [maximumValue].
     *
     * @return this value if it's less than or equal to the [maximumValue] or the [maximumValue] otherwise.
     */
    public static byte coerceAtMost(byte self, byte maximumValue) {
        return self > maximumValue ? maximumValue : self;
    }

    /**
     * Ensures that this value is not greater than the specified [maximumValue].
     *
     * @return this value if it's less than or equal to the [maximumValue] or the [maximumValue] otherwise.
     */
    public static short coerceAtMost(short self, short maximumValue) {
        return self > maximumValue ? maximumValue : self;
    }

    /**
     * Ensures that this value is not greater than the specified [maximumValue].
     *
     * @return this value if it's less than or equal to the [maximumValue] or the [maximumValue] otherwise.
     */
    public static int coerceAtMost(int self, int maximumValue) {
        return self > maximumValue ? maximumValue : self;
    }

    /**
     * Ensures that this value is not greater than the specified [maximumValue].
     *
     * @return this value if it's less than or equal to the [maximumValue] or the [maximumValue] otherwise.
     */
    public static long coerceAtMost(long self, long maximumValue) {
        return self > maximumValue ? maximumValue : self;
    }

    /**
     * Ensures that this value is not greater than the specified [maximumValue].
     *
     * @return this value if it's less than or equal to the [maximumValue] or the [maximumValue] otherwise.
     */
    public static float coerceAtMost(float self, float maximumValue) {
        return self > maximumValue ? maximumValue : self;
    }

    /**
     * Ensures that this value is not greater than the specified [maximumValue].
     *
     * @return this value if it's less than or equal to the [maximumValue] or the [maximumValue] otherwise.
     */
    public static double coerceAtMost(double self, double maximumValue) {
        return self > maximumValue ? maximumValue : self;
    }

    public static IntRange rangeTo(int start, int end, int step) {
        return new IntRange(start, end, step);
    }

    public static IntRange rangeTo(int start, int end) {
        return rangeTo(start, end, 1);
    }

    public static IntRange untilTo(int start, int end, int step) {
        return new IntRange(start, end - 1, step);
    }

    public static IntRange untilTo(int start, int end) {
        return untilTo(start, end, 1);
    }

    public static IntRange downTo(int start, int end, int step) {
        return new IntRange(start, end, step);
    }

    public static IntRange downTo(int start, int end) {
        return downTo(start, end, -1);
    }

    public static IntRange downUntilTo(int start, int end, int step) {
        return new IntRange(start, end + 1, step);
    }

    public static IntRange downUntilTo(int start, int end) {
        return downUntilTo(start, end, -1);
    }

    /**
     * Convert a String to an byte, returning a default value if the conversion fails.
     */
    public static byte toByteOrDefault(@Nullable String str, byte defaultValue) {
        if (str == null || str.length() == 0) {
            return defaultValue;
        }
        try {
            return Byte.parseByte(str);
        } catch (NumberFormatException nfe) {
            return defaultValue;
        }
    }

    /**
     * Convert a String to a byte, returning 0 if the conversion fails.
     */
    public static byte toByteOrZero(@Nullable String str) {
        return toByteOrDefault(str, (byte) 0);
    }

    /**
     * Convert a String to an short, returning a default value if the conversion fails.
     */
    public static short toShortOrDefault(@Nullable String str, short defaultValue) {
        if (str == null) {
            return defaultValue;
        }
        try {
            return Short.parseShort(str);
        } catch (NumberFormatException nfe) {
            return defaultValue;
        }
    }

    /**
     * Convert a String to a short, returning 0 if the conversion fails.
     */
    public static short toShortOrZero(@Nullable String str) {
        return toShortOrDefault(str, (short) 0);
    }

    /**
     * Convert a String to an int, returning a default value if the conversion fails.
     */
    public static int toIntOrDefault(@Nullable String str, int defaultValue) {
        if (str == null || str.length() == 0) {
            return defaultValue;
        }
        try {
            return Integer.parseInt(str);
        } catch (NumberFormatException nfe) {
            return defaultValue;
        }
    }

    /**
     * Convert a String to a int, returning 0 if the conversion fails.
     */
    public static int toIntOrZero(@Nullable String str) {
        return toIntOrDefault(str, 0);
    }

    /**
     * Convert a String to an long, returning a default value if the conversion fails.
     */
    public static long toLongOrDefault(@Nullable String str, long defaultValue) {
        if (str == null) {
            return defaultValue;
        }
        try {
            return Long.parseLong(str);
        } catch (NumberFormatException nfe) {
            return defaultValue;
        }
    }

    /**
     * Convert a String to a long, returning 0L if the conversion fails.
     */
    public static long toLongOrZero(@Nullable String str) {
        return toLongOrDefault(str, 0L);
    }

    /**
     * Convert a String to an float, returning a default value if the conversion fails.
     */
    public static float toFloatOrDefault(@Nullable String str, float defaultValue) {
        if (str == null) {
            return defaultValue;
        }
        try {
            return Float.parseFloat(str);
        } catch (NumberFormatException nfe) {
            return defaultValue;
        }
    }

    /**
     * Convert a String to a float, returning 0.0f if the conversion fails.
     */
    public static float toFloatOrZero(@Nullable String str) {
        return toFloatOrDefault(str, 0.0f);
    }

    /**
     * Convert a String to an double, returning a default value if the conversion fails.
     */
    public static double toDoubleOrDefault(@Nullable String str, double defaultValue) {
        if (str == null) {
            return defaultValue;
        }
        try {
            return Double.parseDouble(str);
        } catch (NumberFormatException nfe) {
            return defaultValue;
        }
    }

    /**
     * Convert a String to a double, returning 0.0d if the conversion fails.
     */
    public static double toDoubleOrZero(@Nullable String str) {
        return toDoubleOrDefault(str, 0.0d);
    }
}