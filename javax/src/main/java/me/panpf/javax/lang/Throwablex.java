package me.panpf.javax.lang;

import org.jetbrains.annotations.NotNull;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

public class Throwablex {

    @NotNull
    public static String stackTraceToString(@NotNull Throwable throwable) {
        ByteArrayOutputStream arrayOutputStream = new ByteArrayOutputStream();
        PrintStream printWriter = new PrintStream(arrayOutputStream);
        throwable.printStackTrace(printWriter);
        return new String(arrayOutputStream.toByteArray());
    }
}
