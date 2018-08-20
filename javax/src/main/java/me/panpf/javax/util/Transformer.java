package me.panpf.javax.util;

import org.jetbrains.annotations.NotNull;

public interface Transformer<Data, Result> {
    @NotNull
    Result transform(@NotNull Data data);
}
