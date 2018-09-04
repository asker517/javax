package me.panpf.javax.util;

import java.util.Iterator;

public abstract class LongIterator implements Iterator<Long> {

    @Override
    public Long next() {
        return nextLong();
    }

    /**
     * Returns the next value in the sequence without boxing.
     */
    abstract long nextLong();
}
