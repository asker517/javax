package me.panpf.javax.util;

import org.jetbrains.annotations.NotNull;

import java.util.NoSuchElementException;

public class ArrayBooleanIterator extends BooleanIterator {
    private int index = 0;

    @NotNull
    private boolean[] elements;

    public ArrayBooleanIterator(@NotNull boolean[] elements) {
        this.elements = elements;
    }

    @Override
    boolean nextBoolean() {
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
