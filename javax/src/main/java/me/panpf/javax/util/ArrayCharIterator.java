package me.panpf.javax.util;

import org.jetbrains.annotations.NotNull;

import java.util.NoSuchElementException;

public class ArrayCharIterator extends CharIterator {
    private int index = 0;

    @NotNull
    private char[] elements;

    public ArrayCharIterator(@NotNull char[] elements) {
        this.elements = elements;
    }

    @Override
    char nextChar() {
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
