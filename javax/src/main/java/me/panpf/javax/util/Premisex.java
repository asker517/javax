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
import java.util.Arrays;

@SuppressWarnings("WeakerAccess")
public class Premisex {

    public static void checkInRange(byte value, byte minValue, byte maxValue) {
        if (value < minValue || value > maxValue) {
            String message = String.format("value %d must be >= %d && <= %d", value, minValue, maxValue);
            throw new IllegalArgumentException(message);
        }
    }

    public static void checkInRange(short value, short minValue, short maxValue) {
        if (value < minValue || value > maxValue) {
            String message = String.format("value %d must be >= %d && <= %d", value, minValue, maxValue);
            throw new IllegalArgumentException(message);
        }
    }

    public static void checkInRange(int value, int minValue, int maxValue) {
        if (value < minValue || value > maxValue) {
            String message = String.format("value %d must be >= %d && <= %d", value, minValue, maxValue);
            throw new IllegalArgumentException(message);
        }
    }

    public static void checkInRange(long value, long minValue, long maxValue) {
        if (value < minValue || value > maxValue) {
            String message = String.format("value %d must be >= %d && <= %d", value, minValue, maxValue);
            throw new IllegalArgumentException(message);
        }
    }

    public static void checkInRange(float value, float minValue, float maxValue) {
        if (value < minValue || value > maxValue) {
            String message = String.format("value %s must be >= %s && <= %s", value, minValue, maxValue);
            throw new IllegalArgumentException(message);
        }
    }

    public static void checkInRange(double value, double minValue, double maxValue) {
        if (value < minValue || value > maxValue) {
            String message = String.format("value %s must be >= %s && <= %s", value, minValue, maxValue);
            throw new IllegalArgumentException(message);
        }
    }

    public static void checkNotInRange(byte value, byte minValue, byte maxValue) {
        if (value >= minValue && value <= maxValue) {
            String message = String.format("value %d must be < %d || > %d", value, minValue, maxValue);
            throw new IllegalArgumentException(message);
        }
    }

    public static void checkNotInRange(short value, short minValue, short maxValue) {
        if (value >= minValue && value <= maxValue) {
            String message = String.format("value %d must be < %d || > %d", value, minValue, maxValue);
            throw new IllegalArgumentException(message);
        }
    }

    public static void checkNotInRange(int value, int minValue, int maxValue) {
        if (value >= minValue && value <= maxValue) {
            String message = String.format("value %d must be < %d || > %d", value, minValue, maxValue);
            throw new IllegalArgumentException(message);
        }
    }

    public static void checkNotInRange(long value, long minValue, long maxValue) {
        if (value >= minValue && value <= maxValue) {
            String message = String.format("value %d must be < %d || > %d", value, minValue, maxValue);
            throw new IllegalArgumentException(message);
        }
    }

    public static void checkNotInRange(float value, float minValue, float maxValue) {
        if (value >= minValue && value <= maxValue) {
            String message = String.format("value %s must be < %s || > %s", value, minValue, maxValue);
            throw new IllegalArgumentException(message);
        }
    }

    public static void checkNotInRange(double value, double minValue, double maxValue) {
        if (value >= minValue && value <= maxValue) {
            String message = String.format("value %s must be < %s || > %s", value, minValue, maxValue);
            throw new IllegalArgumentException(message);
        }
    }


    /* ******************************************* From Kotlin Standard library ********************************************************* */


    /**
     * Checks that the specified object reference is not {@code null}. This
     * method is designed primarily for doing parameter validation in methods
     * and constructors, as demonstrated below:
     * <blockquote><pre>
     * public Foo(Bar bar) {
     *     this.bar = Objects.requireNonNull(bar);
     * }
     * </pre></blockquote>
     *
     * @param obj the object reference to check for nullity
     * @param <T> the type of the reference
     * @return {@code obj} if not {@code null}
     * @throws NullPointerException if {@code obj} is {@code null}
     */
    @SuppressWarnings("UnusedReturnValue")
    @NotNull
    public static <T> T requireNonNull(@Nullable T obj) {
        if (obj == null)
            throw new NullPointerException();
        return obj;
    }

    /**
     * Checks that the specified object reference is not {@code null} and
     * throws a customized {@link NullPointerException} if it is. This method
     * is designed primarily for doing parameter validation in methods and
     * constructors with multiple parameters, as demonstrated below:
     * <blockquote><pre>
     * public Foo(Bar bar, Baz baz) {
     *     this.bar = Objects.requireNonNull(bar, "bar must not be null");
     *     this.baz = Objects.requireNonNull(baz, "baz must not be null");
     * }
     * </pre></blockquote>
     *
     * @param obj     the object reference to check for nullity
     * @param message detail message to be used in the event that a {@code
     *                NullPointerException} is thrown
     * @param <T>     the type of the reference
     * @return {@code obj} if not {@code null}
     * @throws NullPointerException if {@code obj} is {@code null}
     */
    @NotNull
    public static <T> T requireNonNull(@Nullable T obj, String message) {
        if (obj == null)
            throw new NullPointerException(message);
        return obj;
    }

    public static void require(boolean result, @NotNull String message) {
        if (!result) {
            throw new IllegalArgumentException(message);
        }
    }

    public static void require(boolean result) {
        require(result, "Failed requirement.");
    }

    public static void requireFileExist(@NotNull File file) throws FileNotFoundException {
        if (!file.exists()) {
            throw new FileNotFoundException(file.getPath());
        }
    }

    public static void requireIsDir(@NotNull File file) {
        if (!file.isDirectory()) {
            throw new IllegalArgumentException("Must be a directory： " + file.getPath());
        }
    }

    public static void requireIsFile(@NotNull File file) {
        if (!file.isFile()) {
            throw new IllegalArgumentException("Must be a file： " + file.getPath());
        }
    }

    /**
     * Returns an original collection containing all the non-`null` elements, throwing an [IllegalArgumentException] if there are any `null` elements.
     */
    @NotNull
    public static <T> T[] requireNoNulls(@NotNull T[] elements) {
        for (T element : elements) {
            if (element == null) {
                throw new IllegalArgumentException("null element found in " + Arrays.toString(elements) + ".");
            }
        }
        return elements;
    }

    public static boolean areEqual(@Nullable Object first, @Nullable Object second) {
        return first == null ? second == null : first.equals(second);
    }

    public static boolean areEqual(@Nullable Double first, @Nullable Double second) {
        return first == null ? second == null : second != null && first.doubleValue() == second.doubleValue();
    }

    public static boolean areEqual(@Nullable Double first, double second) {
        return first != null && first.doubleValue() == second;
    }

    public static boolean areEqual(double first, Double second) {
        return second != null && first == second.doubleValue();
    }

    public static boolean areEqual(@Nullable Float first, @Nullable Float second) {
        return first == null ? second == null : second != null && first.floatValue() == second.floatValue();
    }

    public static boolean areEqual(@Nullable Float first, float second) {
        return first != null && first.floatValue() == second;
    }

    public static boolean areEqual(float first, @Nullable Float second) {
        return second != null && first == second.floatValue();
    }
}
