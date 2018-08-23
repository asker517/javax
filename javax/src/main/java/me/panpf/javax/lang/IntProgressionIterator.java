package me.panpf.javax.lang;

import me.panpf.javax.util.Premisex;

import java.util.Iterator;
import java.util.NoSuchElementException;

/**
 * An iterator over a progression of values of type `Int`.
 */
public class IntProgressionIterator implements Iterator<Integer> {
    private int step;

    private int finalElement;
    private int next;
    private boolean hasNext;

    IntProgressionIterator(int start, int endInclusive, int step) {
        Premisex.require(step != 0, "`step` cannot be 0");
        Premisex.require(step > 0 && start < endInclusive, "`start` must be less than `endInclusive`");
        Premisex.require(step < 0 && start > endInclusive, "`start` must be greater than `endInclusive`");

        this.step = step;
        finalElement = endInclusive;
        hasNext = step > 0 ? start <= endInclusive : start >= endInclusive;
        next = hasNext ? start : finalElement;
    }

    @Override
    public boolean hasNext() {
        return hasNext;
    }

    @Override
    public Integer next() {
        int value = next;
        if (value == finalElement) {
            if (!hasNext()) {
                throw new NoSuchElementException();
            }
            hasNext = false;
        } else {
            next += step;
        }
        return value;
    }

    @Override
    public void remove() {

    }
}
