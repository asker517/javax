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
import org.jetbrains.annotations.Nullable;

import java.io.File;
import java.io.FileNotFoundException;

@SuppressWarnings("WeakerAccess")
public class Premisex {

    private Premisex() {
    }


    /**
     * Throws an [IllegalArgumentException] with [errorMessage] if the [value] is false.
     */
    public static void require(boolean value, @NotNull String errorMessage) {
        if (!value) throw new IllegalArgumentException(errorMessage);
    }

    /**
     * Throws an [IllegalArgumentException] with [errorMessage] if the [value] is null. Otherwise returns the not null value.
     */
    @NotNull
    public static <T> T requireNotNull(@Nullable T value, String errorMessage) {
        if (value == null) throw new IllegalArgumentException(errorMessage);
        return value;
    }


    /**
     * Throws a [FileNotFoundException] exception if the given file does not exist
     */
    public static void requireFileExist(@NotNull File file) throws FileNotFoundException {
        if (!file.exists()) throw new FileNotFoundException(file.getPath());
    }

    /**
     * Throws an [IllegalArgumentException] exception if the given file is not a directory
     */
    public static void requireIsDir(@NotNull File file) {
        if (!file.isDirectory()) throw new IllegalArgumentException("Must be directory： " + file.getPath());
    }

    /**
     * Throws an [IllegalArgumentException] exception if the given file is not a file
     */
    public static void requireIsFile(@NotNull File file) {
        if (!file.isFile()) throw new IllegalArgumentException("Must be file： " + file.getPath());
    }


    /**
     * Returns true if [value] is within the range of [minValue] and [maxValue]
     */
    public static void requireInRange(byte value, byte minValue, byte maxValue) {
        if (value < minValue || value > maxValue) {
            throw new IllegalArgumentException(String.format("value %d must be >= %d && <= %d", value, minValue, maxValue));
        }
    }

    /**
     * Returns true if [value] is within the range of [minValue] and [maxValue]
     */
    public static void requireInRange(short value, short minValue, short maxValue) {
        if (value < minValue || value > maxValue) {
            throw new IllegalArgumentException(String.format("value %d must be >= %d && <= %d", value, minValue, maxValue));
        }
    }

    /**
     * Returns true if [value] is within the range of [minValue] and [maxValue]
     */
    public static void requireInRange(int value, int minValue, int maxValue) {
        if (value < minValue || value > maxValue) {
            throw new IllegalArgumentException(String.format("value %d must be >= %d && <= %d", value, minValue, maxValue));
        }
    }

    /**
     * Returns true if [value] is within the range of [minValue] and [maxValue]
     */
    public static void requireInRange(long value, long minValue, long maxValue) {
        if (value < minValue || value > maxValue) {
            throw new IllegalArgumentException(String.format("value %d must be >= %d && <= %d", value, minValue, maxValue));
        }
    }

    /**
     * Returns true if [value] is within the range of [minValue] and [maxValue]
     */
    public static void requireInRange(float value, float minValue, float maxValue) {
        if (value < minValue || value > maxValue) {
            throw new IllegalArgumentException(String.format("value %s must be >= %s && <= %s", value, minValue, maxValue));
        }
    }

    /**
     * Returns true if [value] is within the range of [minValue] and [maxValue]
     */
    public static void requireInRange(double value, double minValue, double maxValue) {
        if (value < minValue || value > maxValue) {
            throw new IllegalArgumentException(String.format("value %s must be >= %s && <= %s", value, minValue, maxValue));
        }
    }


    /**
     * Return true if [value] is not in the range [minValue] and [maxValue]
     */
    public static void requireNotInRange(byte value, byte minValue, byte maxValue) {
        if (value >= minValue && value <= maxValue) {
            throw new IllegalArgumentException(String.format("value %d must be < %d || > %d", value, minValue, maxValue));
        }
    }

    /**
     * Return true if [value] is not in the range [minValue] and [maxValue]
     */
    public static void requireNotInRange(short value, short minValue, short maxValue) {
        if (value >= minValue && value <= maxValue) {
            throw new IllegalArgumentException(String.format("value %d must be < %d || > %d", value, minValue, maxValue));
        }
    }

    /**
     * Return true if [value] is not in the range [minValue] and [maxValue]
     */
    public static void requireNotInRange(int value, int minValue, int maxValue) {
        if (value >= minValue && value <= maxValue) {
            throw new IllegalArgumentException(String.format("value %d must be < %d || > %d", value, minValue, maxValue));
        }
    }

    /**
     * Return true if [value] is not in the range [minValue] and [maxValue]
     */
    public static void requireNotInRange(long value, long minValue, long maxValue) {
        if (value >= minValue && value <= maxValue) {
            throw new IllegalArgumentException(String.format("value %d must be < %d || > %d", value, minValue, maxValue));
        }
    }

    /**
     * Return true if [value] is not in the range [minValue] and [maxValue]
     */
    public static void requireNotInRange(float value, float minValue, float maxValue) {
        if (value >= minValue && value <= maxValue) {
            throw new IllegalArgumentException(String.format("value %s must be < %s || > %s", value, minValue, maxValue));
        }
    }

    /**
     * Return true if [value] is not in the range [minValue] and [maxValue]
     */
    public static void requireNotInRange(double value, double minValue, double maxValue) {
        if (value >= minValue && value <= maxValue) {
            throw new IllegalArgumentException(String.format("value %s must be < %s || > %s", value, minValue, maxValue));
        }
    }


    /*
     * *****************************************************************************************************************
     * From kotlin standard library
     * *****************************************************************************************************************
     */

    /**
     * Throws an [IllegalArgumentException] with the result of calling [lazyMessage] if the [value] is false.
     */
    public static void require(boolean value, @NotNull LazyValue<String> lazyMessage) {
        if (!value) throw new IllegalArgumentException(lazyMessage.get());
    }

    /**
     * Throws an [IllegalArgumentException] if the [value] is false.
     */
    public static void require(boolean value) {
        require(value, "Failed requirement.");
    }


    /**
     * Throws an [IllegalArgumentException] with the result of calling [lazyMessage] if the [value] is null. Otherwise
     * returns the not null value.
     */
    @SuppressWarnings("UnusedReturnValue")
    @NotNull
    public static <T> T requireNotNull(@Nullable T value, @NotNull LazyValue<String> lazyMessage) {
        if (value == null) throw new IllegalArgumentException(lazyMessage.get());
        return value;
    }

    /**
     * Throws an [IllegalArgumentException] if the [value] is null. Otherwise returns the not null value.
     */
    @NotNull
    @SuppressWarnings("UnusedReturnValue")
    public static <T> T requireNotNull(@Nullable T value) {
        return requireNotNull(value, "Required value was null.");
    }
}
