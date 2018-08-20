package me.panpf.javax.util;

import org.jetbrains.annotations.NotNull;

public interface IndexedPredicate<Data> {
    boolean predicate(int index, @NotNull Data data);
}
