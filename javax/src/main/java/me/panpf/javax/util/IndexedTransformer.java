package me.panpf.javax.util;

import org.jetbrains.annotations.NotNull;

public interface IndexedTransformer<Data, Result> {
    @NotNull
    Result transform(int index, @NotNull Data data);
}
