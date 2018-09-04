package me.panpf.javax.util;

import java.util.Iterator;

public abstract class BooleanIterator implements Iterator<Boolean> {

    @Override
    public Boolean next() {
        return nextBoolean();
    }

    /**
     * Returns the next value in the sequence without boxing.
     */
    abstract boolean nextBoolean();
}
