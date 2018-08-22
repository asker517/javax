package me.panpf.javax.util;

import org.jetbrains.annotations.NotNull;

public class Predicatex {

    public static void require(boolean result, @NotNull String message) {
        if (!result) {
            throw new IllegalArgumentException(message);
        }
    }
}
