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

import me.panpf.javax.lang.Stringx;
import me.panpf.javax.util.Collectionx;
import org.jetbrains.annotations.NotNull;

import java.io.File;
import java.util.List;

/**
 * Represents the path to a file as a collection of directories.
 */
public class FilePathComponents {

    @NotNull
    public File root;
    @NotNull
    public List<File> segments;

    /**
     * Returns a string representing the root for this file, or an empty string is this file name is relative.
     */
    @NotNull
    public String rootName;

    /**
     * Returns `true` when the [root] is not empty.
     */
    public boolean isRooted;

    /**
     * Returns the number of elements in the path to the file.
     */
    public int size;

    public FilePathComponents(@NotNull File root, @NotNull List<File> segments) {
        this.root = root;
        this.segments = segments;
        this.rootName = root.getPath();
        this.isRooted = Stringx.isNotEmpty(root.getPath());
        this.size = segments.size();
    }

    /**
     * Returns a sub-path of the path, starting with the directory at the specified [beginIndex] and up
     * to the specified [endIndex].
     */
    public File subPath(int beginIndex, int endIndex) {
        if (beginIndex < 0 || beginIndex > endIndex || endIndex > size)
            throw new IllegalArgumentException();

        return new File(Collectionx.joinToString(segments.subList(beginIndex, endIndex), File.separator));
    }
}
