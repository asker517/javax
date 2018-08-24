package me.panpf.javax.util;

import org.jetbrains.annotations.NotNull;

public interface Action<T> {
    void action(@NotNull T t);
}
