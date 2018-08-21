package me.panpf.javax.util;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import java.util.Comparator;

@SuppressWarnings("WeakerAccess")
public class Comparisonx {

    /**
     * Compares two nullable [Comparable] values. Null is considered less than any value.
     */
    public static <T extends Comparable> int compareValues(@Nullable T a, @Nullable T b) {
        if (a == b) return 0;
        if (a == null) return -1;
        if (b == null) return 1;

        //noinspection unchecked
        return a.compareTo(b);
    }

    /**
     * Compares two values using the specified [selector] function to calculate the result of the comparison.
     * The function is applied to the given values [a] and [b] and return [Comparable] objects.
     * The result of comparison of these [Comparable] instances is returned.
     */
    public static <T> int compareValuesBy(T a, T b, NullableTransformer<T, Comparable> selector) {
        return compareValues(selector.transform(a), selector.transform(b));
    }

    /**
     * Creates a comparator using the function to transform value to a [Comparable] instance for comparison.
     */
    @NotNull
    public static <T> Comparator<T> compareBy(final NullableTransformer<T, Comparable> selector) {
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
    public static <T> Comparator<T> compareByDescending(final NullableTransformer<T, Comparable> selector) {
        return new Comparator<T>() {
            @Override
            public int compare(T a, T b) {
                return compareValuesBy(b, a, selector);
            }
        };
    }

    /**
     * Returns a comparator that compares [Comparable] objects in natural order.
     */
    public static <T extends Comparable<T>> Comparator<T> naturalOrder() {
        //noinspection unchecked
        return NaturalOrderComparator;
    }


    /**
     * Returns a comparator that compares [Comparable] objects in reversed natural order.
     */
    public static <T extends Comparable<T>> Comparator<T> reverseOrder() {
        //noinspection unchecked
        return ReverseOrderComparator;
    }

    public static final Comparator NaturalOrderComparator = new Comparator<Comparable>() {

        @Override
        public int compare(Comparable a, Comparable b) {
            //noinspection unchecked
            return a.compareTo(b);
        }

        public Comparator<Comparable> reversed() {
            //noinspection unchecked
            return ReverseOrderComparator;
        }
    };

    public static final Comparator ReverseOrderComparator = new Comparator<Comparable>() {

        @Override
        public int compare(Comparable a, Comparable b) {
            //noinspection unchecked
            return b.compareTo(a);
        }

        public Comparator<Comparable> reversed() {
            //noinspection unchecked
            return NaturalOrderComparator;
        }
    };
}
