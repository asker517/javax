package me.panpf.javax.util;

import org.jetbrains.annotations.NotNull;

import java.util.NoSuchElementException;

public class ArrayDoubleIterator extends DoubleIterator {
    private int index = 0;

    @NotNull
    private double[] elements;

    public ArrayDoubleIterator(@NotNull double[] elements) {
        this.elements = elements;
    }

    @Override
    double nextDouble() {
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
