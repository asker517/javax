package me.panpf.javax.util;

import org.jetbrains.annotations.NotNull;

public interface IndexedRightOperation<T, R> {
    @NotNull
    R operation(int index, @NotNull T t, @NotNull R r);
}
