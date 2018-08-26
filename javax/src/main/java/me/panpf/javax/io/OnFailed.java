package me.panpf.javax.io;

import org.jetbrains.annotations.NotNull;

import java.io.File;
import java.io.IOException;

public interface OnFailed {
    void onError(@NotNull File file, @NotNull IOException e) throws IOException;
}
