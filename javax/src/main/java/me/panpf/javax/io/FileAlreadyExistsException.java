package me.panpf.javax.io;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import java.io.File;

/**
 * An exception class which is used when some file to create or copy to already exists.
 */
public class FileAlreadyExistsException extends FileSystemException{

    public FileAlreadyExistsException(@NotNull File file, @Nullable File other, @Nullable String reason) {
        super(file, other, reason);
    }
}
