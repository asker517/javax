package me.panpf.javax.util;

import org.jetbrains.annotations.NotNull;

public interface IndexedAction<T> {
    void action(int index, @NotNull T t);
}
