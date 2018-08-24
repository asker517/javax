package me.panpf.javax.util;

import org.jetbrains.annotations.NotNull;

public interface IndexedPredicate<T> {
    boolean predicate(int index, @NotNull T t);
}
