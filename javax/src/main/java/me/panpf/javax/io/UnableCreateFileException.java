package me.panpf.javax.io;

import org.jetbrains.annotations.NotNull;

import java.io.File;
import java.io.IOException;

public class UnableCreateFileException extends IOException {

    @NotNull
    public File file;

    public UnableCreateFileException(@NotNull File file) {
        super(file.getPath());
        this.file = file;
    }

    public UnableCreateFileException(@NotNull File file, @NotNull Throwable cause) {
        super(file.getPath(), cause);
        this.file = file;
    }
}
