package me.panpf.javax.util;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import java.util.Comparator;

@SuppressWarnings("WeakerAccess")
public class Comparisonx {

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
