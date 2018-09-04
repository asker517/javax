package me.panpf.javax.util;

import org.jetbrains.annotations.NotNull;

import java.util.NoSuchElementException;

public class ArrayFloatIterator extends FloatIterator {
    private int index = 0;

    @NotNull
    private float[] elements;

    public ArrayFloatIterator(@NotNull float[] elements) {
        this.elements = elements;
    }

    @Override
    float nextFloat() {
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
