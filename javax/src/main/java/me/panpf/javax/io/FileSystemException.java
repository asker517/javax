package me.panpf.javax.io;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import java.io.File;
import java.io.IOException;

@SuppressWarnings("WeakerAccess")
public class FileSystemException extends IOException {

    @NotNull
    public File file;

    @Nullable
    public File other;

    @Nullable
    public String reason;

    /**
     * A base exception class for file system exceptions.
     *
     * @param file   the file on which the failed operation was performed.
     * @param other  the second file involved in the operation, if any (for example, the target of a copy or move)
     * @param reason the description of the error
     */
    public FileSystemException(@NotNull File file, @Nullable File other, @Nullable String reason) {
        super(constructMessage(file, other, reason));
        this.file = file;
        this.other = other;
        this.reason = reason;
    }

    @NotNull
    public File getFile() {
        return file;
    }

    @Nullable
    public File getOther() {
        return other;
    }

    @Nullable
    public String getReason() {
        return reason;
    }

    private static String constructMessage(@NotNull File file, @Nullable File other, @Nullable String reason) {
        StringBuilder sb = new StringBuilder(file.toString());
        if (other != null) {
            sb.append(" -> $other");
        }
        if (reason != null) {
            sb.append(": $reason");
        }
        return sb.toString();
    }
}
