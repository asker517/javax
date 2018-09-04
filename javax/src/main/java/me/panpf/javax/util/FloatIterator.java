package me.panpf.javax.util;

import java.util.Iterator;

public abstract class FloatIterator implements Iterator<Float> {

    @Override
    public Float next() {
        return nextFloat();
    }

    /**
     * Returns the next value in the sequence without boxing.
     */
    abstract float nextFloat();
}
