package me.panpf.javax.util;

import org.jetbrains.annotations.NotNull;

public interface Action<Data> {
    void action(@NotNull Data data);
}
