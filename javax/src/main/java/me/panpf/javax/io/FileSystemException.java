/*
 * Copyright (C) 2018 Peng fei Pan <panpfpanpf@outlook.com>
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

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
            sb.append(" -> ").append(other);
        }
        if (reason != null) {
            sb.append(": ").append(reason);
        }
        return sb.toString();
    }
}
