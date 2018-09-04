package me.panpf.javax.util;

import org.jetbrains.annotations.NotNull;

import java.util.NoSuchElementException;

public class ArrayShortIterator extends ShortIterator {
    private int index = 0;

    @NotNull
    private short[] elements;

    public ArrayShortIterator(@NotNull short[] elements) {
        this.elements = elements;
    }

    @Override
    short nextShort() {
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
