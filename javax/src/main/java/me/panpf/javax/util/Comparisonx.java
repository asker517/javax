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

import java.util.Comparator;

@SuppressWarnings("WeakerAccess")
public class Comparisonx {

    /* ******************************************* From Kotlin Standard library ********************************************************* */

    /**
     * Compares two nullable [Comparable] values. Null is considered less than any value.
     */
    public static <T extends Comparable<T>> int compareValues(@Nullable T a, @Nullable T b) {
        if (a == b) return 0;
        if (a == null) return -1;
        if (b == null) return 1;

        return a.compareTo(b);
    }

    /**
     * Compares two values using the specified [selector] function to calculate the result of the comparison.
     * The function is applied to the given values [a] and [b] and return [Comparable] objects.
     * The result of comparison of these [Comparable] instances is returned.
     */
    public static <T, R extends Comparable<R>> int compareValuesBy(T a, T b, NullableTransformer<T, R> selector) {
        return compareValues(selector.transform(a), selector.transform(b));
    }

    /**
     * Creates a comparator using the function to transform value to a [Comparable] instance for comparison.
     */
    @NotNull
    public static <T, R extends Comparable<R>> Comparator<T> compareBy(final NullableTransformer<T, R> selector) {
        return new Comparator<T>() {
            @Override
            public int compare(T a, T b) {
                return compareValuesBy(a, b, selector);
            }
        };
    }

    /**
     * Creates a descending comparator using the function to transform value to a [Comparable] instance for comparison.
     */
    @NotNull
    public static <T, R extends Comparable<R>> Comparator<T> compareByDescending(final NullableTransformer<T, R> selector) {
        return new Comparator<T>() {
            @Override
            public int compare(T a, T b) {
                return compareValuesBy(b, a, selector);
            }
        };
    }

    public static class NaturalOrderComparator<T extends Comparable<T>> implements Comparator<T> {

        @Override
        public int compare(T a, T b) {
            return a.compareTo(b);
        }

        public Comparator<T> reversed() {
            return new ReverseOrderComparator<T>();
        }
    }

    public static class ReverseOrderComparator<T extends Comparable<T>> implements Comparator<T> {

        @Override
        public int compare(T a, T b) {
            return b.compareTo(a);
        }

        public Comparator<T> reversed() {
            return new NaturalOrderComparator<T>();
        }
    }
}
