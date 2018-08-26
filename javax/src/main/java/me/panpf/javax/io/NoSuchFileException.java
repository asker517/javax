package me.panpf.javax.io;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import java.io.File;

/**
 * An exception class which is used when file to copy does not exist.
 */
public class NoSuchFileException extends FileSystemException{

    public NoSuchFileException(@NotNull File file, @Nullable File other, @Nullable String reason) {
        super(file, other, reason);
    }
}
