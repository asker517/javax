package me.panpf.javax.util;

import org.jetbrains.annotations.NotNull;

public class IndexedValue<T> {
    public int index;
    @NotNull
    public T valued;

    public IndexedValue(int index, @NotNull T valued) {
        this.index = index;
        this.valued = valued;
    }
}
