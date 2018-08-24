package me.panpf.javax.util;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public interface NullableTransformer<T, R> {
    @Nullable
    R transform(@NotNull T t);
}
