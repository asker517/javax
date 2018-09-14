package me.panpf.javax.util.range;

import org.jetbrains.annotations.NotNull;

/**
 * Represents a range of values (for example, numbers or characters).
 * See the [Kotlin language documentation](http://kotlinlang.org/docs/reference/ranges.html) for more information.
 */
public interface ClosedRange<T extends Comparable<T>> {
    /**
     * The minimum value in the range.
     */
    @NotNull
    T getStart();

    /**
     * The maximum value in the range (inclusive).
     */
    @NotNull
    T getEndInclusive();

    boolean contains(@NotNull T var1);

    boolean isEmpty();
}
