package me.panpf.javax.util;

import org.jetbrains.annotations.NotNull;

public class IndexedValue<T> {
    public int index;
    @NotNull
    public T value;

    public IndexedValue(int index, @NotNull T value) {
        this.index = index;
        this.value = value;
    }
}
