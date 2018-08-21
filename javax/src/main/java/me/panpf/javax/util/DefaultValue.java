package me.panpf.javax.util;

import org.jetbrains.annotations.NotNull;

public interface DefaultValue<R> {
    @NotNull
    R get();
}
