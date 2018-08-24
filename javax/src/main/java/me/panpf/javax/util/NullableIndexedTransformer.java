package me.panpf.javax.util;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public interface NullableIndexedTransformer<T, R> {
    @Nullable
    R transform(int index, @NotNull T t);
}
