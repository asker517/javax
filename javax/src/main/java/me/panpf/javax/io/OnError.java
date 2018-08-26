package me.panpf.javax.io;

import org.jetbrains.annotations.NotNull;

import java.io.File;
import java.io.IOException;

public interface OnError {
    OnErrorAction onError(@NotNull File file, @NotNull IOException e) throws IOException;
}
