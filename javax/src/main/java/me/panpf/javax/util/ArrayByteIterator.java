package me.panpf.javax.util;

import org.jetbrains.annotations.NotNull;

import java.util.NoSuchElementException;

public class ArrayByteIterator extends ByteIterator {
    private int index = 0;

    @NotNull
    private byte[] elements;

    public ArrayByteIterator(@NotNull byte[] elements) {
        this.elements = elements;
    }

    @Override
    byte nextByte() {
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
