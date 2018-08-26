package me.panpf.javax.io;

import org.jetbrains.annotations.NotNull;

import java.io.File;

public class TerminateException extends FileSystemException {
    /**
     * A base exception class for file system exceptions.
     *
     * @param file the file on which the failed operation was performed.
     */
    public TerminateException(@NotNull File file) {
        super(file, null, null);
    }
}
