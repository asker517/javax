package me.panpf.javax.util;

import org.jetbrains.annotations.NotNull;

public interface Operation<T, R> {
    @NotNull
    R operation(@NotNull R r, @NotNull T t);
}
