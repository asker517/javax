package me.panpf.javax.util;

import java.util.Iterator;

public interface Grouping<T, K> {
    /**
     * Returns an [Iterator] over the elements of the source of this grouping.
     */
    Iterator<T> sourceIterator();

    /**
     * Extracts the key of an [element].
     */
    K keyOf(T element);
}