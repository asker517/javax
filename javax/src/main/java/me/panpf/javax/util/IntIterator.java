package me.panpf.javax.util;

import java.util.Iterator;

public abstract class IntIterator implements Iterator<Integer> {

    @Override
    public Integer next() {
        return nextInt();
    }

    /**
     * Returns the next value in the sequence without boxing.
     */
    abstract int nextInt();
}
