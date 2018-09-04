package me.panpf.javax.util;

import org.jetbrains.annotations.NotNull;

import java.util.NoSuchElementException;

public class ArrayIntIterator extends IntIterator {
    private int index = 0;

    @NotNull
    private int[] elements;

    public ArrayIntIterator(@NotNull int[] elements) {
        this.elements = elements;
    }

    @Override
    int nextInt() {
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
