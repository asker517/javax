package me.panpf.javax.util;

import org.jetbrains.annotations.NotNull;

public interface IndexedTransformer<T, R> {
    @NotNull
    R transform(int index, @NotNull T t);
}
