package me.panpf.javax.util;

import java.util.Iterator;

public abstract class ByteIterator implements Iterator<Byte> {

    @Override
    public Byte next() {
        return nextByte();
    }

    /**
     * Returns the next value in the sequence without boxing.
     */
    abstract byte nextByte();
}
