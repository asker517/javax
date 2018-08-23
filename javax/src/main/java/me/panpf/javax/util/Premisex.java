package me.panpf.javax.util;

import org.jetbrains.annotations.NotNull;

import java.io.File;
import java.io.FileNotFoundException;

public class Premisex {

    public static void require(boolean result, @NotNull String message) {
        if (!result) {
            throw new IllegalArgumentException(message);
        }
    }

    public static void requireFileExist(@NotNull File file) throws FileNotFoundException {
        if (!file.exists()) {
            throw new FileNotFoundException(file.getPath());
        }
    }
}
