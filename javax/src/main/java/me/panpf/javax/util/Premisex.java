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

@SuppressWarnings("WeakerAccess")
public class Premisex {

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
