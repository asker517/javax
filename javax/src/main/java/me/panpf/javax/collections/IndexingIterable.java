package me.panpf.javax.collections;

import me.panpf.javax.util.DefaultValue;
import me.panpf.javax.util.IndexedValue;
import org.jetbrains.annotations.NotNull;

import java.util.Iterator;

public class IndexingIterable<T> implements Iterable<IndexedValue<T>> {

    @NotNull
    private DefaultValue<Iterator<T>> defaultValue;

    public IndexingIterable(@NotNull DefaultValue<Iterator<T>> defaultValue) {
        this.defaultValue = defaultValue;
    }

    @NotNull
    @Override
    public Iterator<IndexedValue<T>> iterator() {
        return new IndexingIterator<>(defaultValue.get());
    }
}
