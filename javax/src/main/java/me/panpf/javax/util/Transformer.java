package me.panpf.javax.util;

import org.jetbrains.annotations.NotNull;

public interface Transformer<T, R> {
    @NotNull
    R transform(@NotNull T t);
}
