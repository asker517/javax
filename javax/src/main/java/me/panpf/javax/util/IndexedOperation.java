package me.panpf.javax.util;

import org.jetbrains.annotations.NotNull;

public interface IndexedOperation<T, R> {
    @NotNull
    R operation(int index, @NotNull R r, @NotNull T t);
}
