package me.panpf.javax.util;

import java.util.Iterator;

public abstract class DoubleIterator implements Iterator<Double> {

    @Override
    public Double next() {
        return nextDouble();
    }

    /**
     * Returns the next value in the sequence without boxing.
     */
    abstract double nextDouble();
}
