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

import java.io.File;
import java.io.FileNotFoundException;

@SuppressWarnings({"WeakerAccess", "UnusedReturnValue"})
public class Premisex {

    private Premisex() {
    }


    /* ******************************************* boolean, null *******************************************/


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
     * Throws an [IllegalStateException] with [errorMessage] if the [value] is false.
     */
    public static void check(boolean value, @NotNull String errorMessage) {
        if (!value) throw new IllegalStateException(errorMessage);
    }

    /**
     * Throws an [IllegalStateException] with [errorMessage] if the [value] is null. Otherwise returns the not null value.
     */
    @NotNull
    public static <T> T checkNotNull(@Nullable T value, String errorMessage) {
        if (value == null) throw new IllegalStateException(errorMessage);
        return value;
    }


    /* ******************************************* file *******************************************/


    /**
     * If the given file exist, it returns itself, otherwise it throws an FileNotFoundException
     */
    public static File requireFileExist(@NotNull File file, @NotNull String paramName) throws FileNotFoundException {
        if (file.exists()) {
            return file;
        } else {
            throw new FileNotFoundException(String.format("The file pointed to by this parameter '%s': %s", paramName, file.getPath()));
        }
    }

    /**
     * If the given file exist, it returns itself, otherwise it throws an FileNotFoundException
     */
    public static File requireFileExist(@NotNull File file) throws FileNotFoundException {
        return requireFileExist(file, "unknown");
    }

    /**
     * If the given file is a directory, it returns itself, otherwise it throws an IllegalArgumentException
     */
    public static File requireIsDir(@NotNull File file, @NotNull String paramName) {
        if (file.isDirectory()) {
            return file;
        } else {
            throw new IllegalArgumentException(String.format("The file pointed to by the parameter '%s' is not a directory: %s", paramName, file.getPath()));
        }
    }

    /**
     * If the given file is a directory, it returns itself, otherwise it throws an IllegalArgumentException
     */
    public static File requireIsDir(@NotNull File file) {
        return requireIsDir(file, "unknown");
    }

    /**
     * If the given file is a file, it returns itself, otherwise it throws an IllegalArgumentException
     */
    public static File requireIsFile(@NotNull File file, @NotNull String paramName) {
        if (file.isFile()) {
            return file;
        } else {
            throw new IllegalArgumentException(String.format("The file pointed to by the parameter '%s' is not a file: %s", paramName, file.getPath()));
        }
    }

    /**
     * If the given file is a file, it returns itself, otherwise it throws an IllegalArgumentException
     */
    public static File requireIsFile(@NotNull File file) {
        return requireIsFile(file, "unknown");
    }


    /* ******************************************* range *******************************************/


    /**
     * If [value] is within the range of [minValue] and [maxValue], it returns itself, otherwise it throws an IllegalArgumentException
     */
    public static byte requireInRange(byte value, byte minValue, byte maxValue, @NotNull String paramName) {
        if (value >= minValue && value <= maxValue) {
            return value;
        } else {
            throw new IllegalArgumentException(String.format("The byte parameter '%s' value is %d, must be >= %d && <= %d", paramName, value, minValue, maxValue));
        }
    }

    /**
     * If [value] is within the range of [minValue] and [maxValue], it returns itself, otherwise it throws an IllegalArgumentException
     */
    public static byte requireInRange(byte value, byte minValue, byte maxValue) {
        return requireInRange(value, minValue, maxValue, "unknown");
    }

    /**
     * If [value] is within the range of [minValue] and [maxValue], it returns itself, otherwise it throws an IllegalArgumentException
     */
    public static short requireInRange(short value, short minValue, short maxValue, @NotNull String paramName) {
        if (value >= minValue && value <= maxValue) {
            return value;
        } else {
            throw new IllegalArgumentException(String.format("The short parameter '%s' value is %d, must be >= %d && <= %d", paramName, value, minValue, maxValue));
        }
    }

    /**
     * If [value] is within the range of [minValue] and [maxValue], it returns itself, otherwise it throws an IllegalArgumentException
     */
    public static short requireInRange(short value, short minValue, short maxValue) {
        return requireInRange(value, minValue, maxValue, "unknown");
    }

    /**
     * If [value] is within the range of [minValue] and [maxValue], it returns itself, otherwise it throws an IllegalArgumentException
     */
    public static int requireInRange(int value, int minValue, int maxValue, @NotNull String paramName) {
        if (value >= minValue && value <= maxValue) {
            return value;
        } else {
            throw new IllegalArgumentException(String.format("The int parameter '%s' value is %d, must be >= %d && <= %d", paramName, value, minValue, maxValue));
        }
    }

    /**
     * If [value] is within the range of [minValue] and [maxValue], it returns itself, otherwise it throws an IllegalArgumentException
     */
    public static int requireInRange(int value, int minValue, int maxValue) {
        return requireInRange(value, minValue, maxValue, "unknown");
    }

    /**
     * If [value] is within the range of [minValue] and [maxValue], it returns itself, otherwise it throws an IllegalArgumentException
     */
    public static long requireInRange(long value, long minValue, long maxValue, @NotNull String paramName) {
        if (value >= minValue && value <= maxValue) {
            return value;
        } else {
            throw new IllegalArgumentException(String.format("The long parameter '%s' value is %d, must be >= %d && <= %d", paramName, value, minValue, maxValue));
        }
    }

    /**
     * If [value] is within the range of [minValue] and [maxValue], it returns itself, otherwise it throws an IllegalArgumentException
     */
    public static long requireInRange(long value, long minValue, long maxValue) {
        return requireInRange(value, minValue, maxValue, "unknown");
    }

    /**
     * If [value] is within the range of [minValue] and [maxValue], it returns itself, otherwise it throws an IllegalArgumentException
     */
    public static float requireInRange(float value, float minValue, float maxValue, @NotNull String paramName) {
        if (value >= minValue && value <= maxValue) {
            return value;
        } else {
            throw new IllegalArgumentException(String.format("The float parameter '%s' value is %s, must be >= %s && <= %s", paramName, value, minValue, maxValue));
        }
    }

    /**
     * If [value] is within the range of [minValue] and [maxValue], it returns itself, otherwise it throws an IllegalArgumentException
     */
    public static float requireInRange(float value, float minValue, float maxValue) {
        return requireInRange(value, minValue, maxValue, "unknown");
    }

    /**
     * If [value] is within the range of [minValue] and [maxValue], it returns itself, otherwise it throws an IllegalArgumentException
     */
    public static double requireInRange(double value, double minValue, double maxValue, @NotNull String paramName) {
        if (value >= minValue && value <= maxValue) {
            return value;
        } else {
            throw new IllegalArgumentException(String.format("The double parameter '%s' value is %s, must be >= %s && <= %s", paramName, value, minValue, maxValue));
        }
    }

    /**
     * If [value] is within the range of [minValue] and [maxValue], it returns itself, otherwise it throws an IllegalArgumentException
     */
    public static double requireInRange(double value, double minValue, double maxValue) {
        return requireInRange(value, minValue, maxValue, "unknown");
    }


    /**
     * If [value] is not in the range [minValue] and [maxValue], it returns itself, otherwise it throws an IllegalArgumentException
     */
    public static byte requireNotInRange(byte value, byte minValue, byte maxValue, @NotNull String paramName) {
        if (value < minValue || value > maxValue) {
            return value;
        } else {
            throw new IllegalArgumentException(String.format("The byte parameter '%s' value is %d, must be < %d || > %d", paramName, value, minValue, maxValue));
        }
    }

    /**
     * If [value] is not in the range [minValue] and [maxValue], it returns itself, otherwise it throws an IllegalArgumentException
     */
    public static byte requireNotInRange(byte value, byte minValue, byte maxValue) {
        return requireNotInRange(value, minValue, maxValue, "unknown");
    }

    /**
     * If [value] is not in the range [minValue] and [maxValue], it returns itself, otherwise it throws an IllegalArgumentException
     */
    public static short requireNotInRange(short value, short minValue, short maxValue, @NotNull String paramName) {
        if (value < minValue || value > maxValue) {
            return value;
        } else {
            throw new IllegalArgumentException(String.format("The short parameter '%s' value is %d, must be < %d || > %d", paramName, value, minValue, maxValue));
        }
    }

    /**
     * If [value] is not in the range [minValue] and [maxValue], it returns itself, otherwise it throws an IllegalArgumentException
     */
    public static short requireNotInRange(short value, short minValue, short maxValue) {
        return requireNotInRange(value, minValue, maxValue, "unknown");
    }

    /**
     * If [value] is not in the range [minValue] and [maxValue], it returns itself, otherwise it throws an IllegalArgumentException
     */
    public static int requireNotInRange(int value, int minValue, int maxValue, @NotNull String paramName) {
        if (value < minValue || value > maxValue) {
            return value;
        } else {
            throw new IllegalArgumentException(String.format("The int parameter '%s' value is %d, must be < %d || > %d", paramName, value, minValue, maxValue));
        }
    }

    /**
     * If [value] is not in the range [minValue] and [maxValue], it returns itself, otherwise it throws an IllegalArgumentException
     */
    public static int requireNotInRange(int value, int minValue, int maxValue) {
        return requireNotInRange(value, minValue, maxValue, "unknown");
    }

    /**
     * If [value] is not in the range [minValue] and [maxValue], it returns itself, otherwise it throws an IllegalArgumentException
     */
    public static long requireNotInRange(long value, long minValue, long maxValue, @NotNull String paramName) {
        if (value < minValue || value > maxValue) {
            return value;
        } else {
            throw new IllegalArgumentException(String.format("The long parameter '%s' value is %d, must be < %d || > %d", paramName, value, minValue, maxValue));
        }
    }

    /**
     * If [value] is not in the range [minValue] and [maxValue], it returns itself, otherwise it throws an IllegalArgumentException
     */
    public static long requireNotInRange(long value, long minValue, long maxValue) {
        return requireNotInRange(value, minValue, maxValue, "unknown");
    }

    /**
     * If [value] is not in the range [minValue] and [maxValue], it returns itself, otherwise it throws an IllegalArgumentException
     */
    public static float requireNotInRange(float value, float minValue, float maxValue, @NotNull String paramName) {
        if (value < minValue || value > maxValue) {
            return value;
        } else {
            throw new IllegalArgumentException(String.format("The float parameter '%s' value is %s, must be < %s || > %s", paramName, value, minValue, maxValue));
        }
    }

    /**
     * If [value] is not in the range [minValue] and [maxValue], it returns itself, otherwise it throws an IllegalArgumentException
     */
    public static float requireNotInRange(float value, float minValue, float maxValue) {
        return requireNotInRange(value, minValue, maxValue, "unknown");
    }

    /**
     * If [value] is not in the range [minValue] and [maxValue], it returns itself, otherwise it throws an IllegalArgumentException
     */
    public static double requireNotInRange(double value, double minValue, double maxValue, @NotNull String paramName) {
        if (value < minValue || value > maxValue) {
            return value;
        } else {
            throw new IllegalArgumentException(String.format("The double parameter '%s' value is %s, must be < %s || > %s", paramName, value, minValue, maxValue));
        }
    }

    /**
     * If [value] is not in the range [minValue] and [maxValue], it returns itself, otherwise it throws an IllegalArgumentException
     */
    public static double requireNotInRange(double value, double minValue, double maxValue) {
        return requireNotInRange(value, minValue, maxValue, "unknown");
    }


    /* ******************************************* string safe *******************************************/


    /**
     * If the [value] is null or empty or blank, it returns itself, otherwise it throws an IllegalArgumentException.
     */
    public static <T extends CharSequence> T requireSafe(@Nullable T value, @NotNull String paramName) {
        if (Stringx.isSafe(value)) {
            return value;
        } else {
            throw new IllegalArgumentException(String.format("The string parameter '%s' is null or empty or blank", paramName));
        }
    }

    /**
     * If the [value] is null or empty or blank, it returns itself, otherwise it throws an IllegalArgumentException.
     */
    public static <T extends CharSequence> T requireSafe(@Nullable T value) {
        return requireSafe(value, "unknown");
    }

    /**
     * If the [value] is not null or empty or blank, it returns itself, otherwise it throws an IllegalArgumentException.
     */
    public static <T extends CharSequence> T requireNotSafe(@Nullable T value, @NotNull String paramName) {
        if (Stringx.isNotSafe(value)) {
            return value;
        } else {
            throw new IllegalArgumentException(String.format("The string parameter '%s' is not null or empty or blank", paramName));
        }
    }

    /**
     * If the [value] is not null or empty or blank, it returns itself, otherwise it throws an IllegalArgumentException.
     */
    public static <T extends CharSequence> T requireNotSafe(@Nullable T value) {
        return requireNotSafe(value, "unknown");
    }


    /* ******************************************* number zero *******************************************/


    /**
     * If [value] is not 0, it returns itself, otherwise it throws an exception.
     */
    public static byte requireNotZero(byte value, @NotNull String paramName) {
        if (value != (byte) 0) {
            return value;
        } else {
            throw new IllegalArgumentException(String.format("The parameter '%s' cannot be 0", paramName));
        }
    }

    /**
     * If [value] is not 0, it returns itself, otherwise it throws an exception.
     */
    public static byte requireNotZero(byte value) {
        return requireNotZero(value, "unknown");
    }

    /**
     * If [value] is not 0, it returns itself, otherwise it throws an exception.
     */
    public static short requireNotZero(short value, @NotNull String paramName) {
        if (value != (short) 0) {
            return value;
        } else {
            throw new IllegalArgumentException(String.format("The parameter '%s' cannot be 0", paramName));
        }
    }

    /**
     * If [value] is not 0, it returns itself, otherwise it throws an exception.
     */
    public static short requireNotZero(short value) {
        return requireNotZero(value, "unknown");
    }

    /**
     * If [value] is not 0, it returns itself, otherwise it throws an exception.
     */
    public static int requireNotZero(int value, @NotNull String paramName) {
        if (value != 0) {
            return value;
        } else {
            throw new IllegalArgumentException(String.format("The parameter '%s' cannot be 0", paramName));
        }
    }

    /**
     * If [value] is not 0, it returns itself, otherwise it throws an exception.
     */
    public static int requireNotZero(int value) {
        return requireNotZero(value, "unknown");
    }

    /**
     * If [value] is not 0, it returns itself, otherwise it throws an exception.
     */
    public static long requireNotZero(long value, @NotNull String paramName) {
        if (value != 0L) {
            return value;
        } else {
            throw new IllegalArgumentException(String.format("The parameter '%s' cannot be 0", paramName));
        }
    }

    /**
     * If [value] is not 0, it returns itself, otherwise it throws an exception.
     */
    public static long requireNotZero(long value) {
        return requireNotZero(value, "unknown");
    }

    /**
     * If [value] is not 0, it returns itself, otherwise it throws an exception.
     */
    public static float requireNotZero(float value, @NotNull String paramName) {
        if (value != 0f) {
            return value;
        } else {
            throw new IllegalArgumentException(String.format("The parameter '%s' cannot be 0", paramName));
        }
    }

    /**
     * If [value] is not 0, it returns itself, otherwise it throws an exception.
     */
    public static float requireNotZero(float value) {
        return requireNotZero(value, "unknown");
    }

    /**
     * If [value] is not 0, it returns itself, otherwise it throws an exception.
     */
    public static double requireNotZero(double value, @NotNull String paramName) {
        if (value != 0.0) {
            return value;
        } else {
            throw new IllegalArgumentException(String.format("The parameter '%s' cannot be 0", paramName));
        }
    }

    /**
     * If [value] is not 0, it returns itself, otherwise it throws an exception.
     */
    public static double requireNotZero(double value) {
        return requireNotZero(value, "unknown");
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


    /**
     * Throws an [IllegalStateException] with the result of calling [lazyMessage] if the [value] is false.
     */
    public static void check(boolean value, @NotNull LazyValue<String> lazyMessage) {
        if (!value) throw new IllegalStateException(lazyMessage.get());
    }

    /**
     * Throws an [IllegalStateException] if the [value] is false.
     */
    public static void check(boolean value) {
        check(value, "Failed requirement.");
    }


    /**
     * Throws an [IllegalStateException] with the result of calling [lazyMessage] if the [value] is null. Otherwise
     * returns the not null value.
     */
    @SuppressWarnings("UnusedReturnValue")
    @NotNull
    public static <T> T checkNotNull(@Nullable T value, @NotNull LazyValue<String> lazyMessage) {
        if (value == null) throw new IllegalStateException(lazyMessage.get());
        return value;
    }

    /**
     * Throws an [IllegalStateException] if the [value] is null. Otherwise returns the not null value.
     */
    @NotNull
    @SuppressWarnings("UnusedReturnValue")
    public static <T> T checkNotNull(@Nullable T value) {
        return checkNotNull(value, "Required value was null.");
    }
}
