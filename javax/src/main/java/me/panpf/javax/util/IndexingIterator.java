package me.panpf.javax.util;

import org.jetbrains.annotations.NotNull;

import java.util.Iterator;

public class IndexingIterator<T> implements Iterator<IndexedValue<T>> {

    @NotNull
    private Iterator<T> iterator;
    private int index = 0;

    public IndexingIterator(@NotNull Iterator<T> iterator) {
        this.iterator = iterator;
    }

    @Override
    public boolean hasNext() {
        return iterator.hasNext();
    }

    @Override
    public IndexedValue<T> next() {
        return new IndexedValue<>(index++, iterator.next());
    }

    @Override
    public void remove() {

    }
}
