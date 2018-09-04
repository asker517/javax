package me.panpf.javax.util;

import java.util.Iterator;

public abstract class ShortIterator implements Iterator<Short> {

    @Override
    public Short next() {
        return nextShort();
    }

    /**
     * Returns the next value in the sequence without boxing.
     */
    abstract short nextShort();
}
