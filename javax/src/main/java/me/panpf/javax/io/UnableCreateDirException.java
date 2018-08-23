package me.panpf.javax.io;

import org.jetbrains.annotations.NotNull;

import java.io.File;
import java.io.IOException;

public class UnableCreateDirException extends IOException {

    @NotNull
    public File file;

    public UnableCreateDirException(@NotNull File file) {
        super(file.getPath());
        this.file = file;
    }

    public UnableCreateDirException(@NotNull File file, @NotNull Throwable cause) {
        super(file.getPath(), cause);
        this.file = file;
    }
}
