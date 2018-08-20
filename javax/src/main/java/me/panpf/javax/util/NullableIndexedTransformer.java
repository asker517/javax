package me.panpf.javax.util;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public interface NullableIndexedTransformer<Data, Result> {
    @Nullable
    Result transform(int index, @NotNull Data data);
}
