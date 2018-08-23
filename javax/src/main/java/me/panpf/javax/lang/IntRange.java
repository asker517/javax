package me.panpf.javax.lang;

import org.jetbrains.annotations.NotNull;

import java.util.Iterator;

public class IntRange implements Iterable<Integer> {
    private int first;
    private int endInclusive;
    private int step;

    public IntRange(int first, int endInclusive, int step) {
        this.first = first;
        this.endInclusive = endInclusive;
        this.step = step;
    }

    @NotNull
    @Override
    public Iterator<Integer> iterator() {
        return new IntProgressionIterator(first, endInclusive, step);
    }
}
