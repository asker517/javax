package me.panpf.javax.io;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import java.io.File;

/**
 * An exception class which is used when we have not enough access for some operation.
 */
public class AccessDeniedException extends FileSystemException{

    public AccessDeniedException(@NotNull File file, @Nullable File other, @Nullable String reason) {
        super(file, other, reason);
    }
}
