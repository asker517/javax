package me.panpf.javax.util;

import org.jetbrains.annotations.NotNull;

public interface Action2<T1, T2> {
    void action(@NotNull T1 t1, @NotNull T2 t2);
}
