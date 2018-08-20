package me.panpf.javax.util;

import org.jetbrains.annotations.NotNull;

public interface IndexedAction<Data> {
    void action(int index, @NotNull Data data);
}
