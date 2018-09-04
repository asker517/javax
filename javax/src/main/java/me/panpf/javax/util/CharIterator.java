package me.panpf.javax.util;

import java.util.Iterator;

public abstract class CharIterator implements Iterator<Character> {

    @Override
    public Character next() {
        return nextChar();
    }

    /**
     * Returns the next value in the sequence without boxing.
     */
    abstract char nextChar();
}
