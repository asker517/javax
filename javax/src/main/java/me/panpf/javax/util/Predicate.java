package me.panpf.javax.util;

import org.jetbrains.annotations.NotNull;

public interface Predicate<T> {
    boolean predicate(@NotNull T t);
}