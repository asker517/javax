package me.panpf.javax.util;

import org.jetbrains.annotations.NotNull;

public interface Predicate<Data> {
    boolean predicate(@NotNull Data data);
}
