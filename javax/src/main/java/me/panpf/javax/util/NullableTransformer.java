package me.panpf.javax.util;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public interface NullableTransformer<Data, Result> {
    @Nullable
    Result transform(@NotNull Data data);
}
