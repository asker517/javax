package me.panpf.javax.util;

import org.jetbrains.annotations.NotNull;

import java.util.NoSuchElementException;

public class ArrayLongIterator extends LongIterator {
    private int index = 0;

    @NotNull
    private long[] elements;

    public ArrayLongIterator(@NotNull long[] elements) {
        this.elements = elements;
    }

    @Override
    long nextLong() {
        try {
            return elements[index++];
        } catch (ArrayIndexOutOfBoundsException e) {
            index -= 1;
            throw new NoSuchElementException(e.getMessage());
        }
    }

    @Override
    public boolean hasNext() {
        return index < elements.length;
    }

    @Override
    public void remove() {

    }
}
