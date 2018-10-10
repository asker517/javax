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

import org.jetbrains.annotations.Nullable;

/**
 * Number tool method
 */
@SuppressWarnings("WeakerAccess")
public class Numberx {

    private Numberx() {
    }


    /*
     * *****************************************************************************************************************
     * From kotlin standard library
     * *****************************************************************************************************************
     */


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