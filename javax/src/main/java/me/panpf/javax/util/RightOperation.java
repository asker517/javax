package me.panpf.javax.util;

import org.jetbrains.annotations.NotNull;

public interface RightOperation<T, R> {
    @NotNull
    R operation(@NotNull T t, @NotNull R r);
}
