/*
 * Copyright (C) 2018 Peng fei Pan <sky@panpf.me>
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

import me.panpf.javax.lang.Charx;
import me.panpf.javax.lang.Intx;
import me.panpf.javax.lang.Stringx;
import me.panpf.javax.util.*;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import java.io.*;
import java.io.File;
import java.nio.charset.Charset;
import java.util.*;

/**
 * 文件工具类，提供一些有关文件的便捷方法
 */
@SuppressWarnings("WeakerAccess")
public class Filex {

    public static void requireExist(@NotNull File file) throws FileNotFoundException {
        if (!file.exists()) {
            throw new FileNotFoundException(file.getPath());
        }
    }

    public static void requireIsDir(@NotNull File file) {
        if (!file.isDirectory()) {
            throw new IllegalArgumentException("Must be a directory： " + file.getPath());
        }
    }

    public static void requireIsFile(@NotNull File file) {
        if (!file.isFile()) {
            throw new IllegalArgumentException("Must be a file： " + file.getPath());
        }
    }

    /**
     * Create a directory and throw an exception if it cannot be created
     *
     * @throws UnableCreateDirException Unable to create directory
     */
    @NotNull
    public static File mkdirsWithThrow(@NotNull File dir) throws UnableCreateDirException {
        if (dir.exists()) return dir;
        //noinspection ResultOfMethodCallIgnored
        dir.mkdirs();
        if (!dir.exists()) throw new UnableCreateDirException(dir);
        return dir;
    }

    /**
     * Create a directory
     *
     * @return If true, the creation is successful.
     */
    public static boolean mkdirsWith(@NotNull File dir) {
        if (dir.exists()) return true;
        //noinspection ResultOfMethodCallIgnored
        dir.mkdirs();
        return dir.exists();
    }

    /**
     * Create a file, create its parent directory first, and throw an exception if it cannot be created
     *
     * @throws UnableCreateFileException Unable to create file
     * @throws UnableCreateDirException  Unable to create parent directory
     */
    @NotNull
    public static File createNewFileWithThrow(@NotNull File file) throws UnableCreateFileException, UnableCreateDirException {
        if (file.exists()) return file;
        mkdirsWithThrow(file.getParentFile());

        try {
            //noinspection ResultOfMethodCallIgnored
            file.createNewFile();
        } catch (IOException e) {
            throw new UnableCreateFileException(file, e);
        }

        if (!file.exists()) throw new UnableCreateFileException(file);
        return file;
    }

    /**
     * Create a file, create its parent directory first
     *
     * @return If true, the creation is successful.
     */
    public static boolean createNewFileWith(@NotNull File file) {
        if (file.exists()) return true;
        if (!mkdirsWith(file.getParentFile())) return false;

        try {
            //noinspection ResultOfMethodCallIgnored
            file.createNewFile();
        } catch (IOException e) {
            return false;
        }

        return file.exists();
    }


    /**
     * Loop delete all files in the directory
     *
     * @return If true, the clean is successful, otherwise the clean fails.
     */
    public static boolean cleanDir(@NotNull File dir) {
        if (!dir.exists() || dir.isFile()) return true;

        File[] childFiles = dir.listFiles();
        if (childFiles == null || Arrayx.isEmpty(childFiles)) return true;

        boolean result = true;

        Stack<File> fileStack = new Stack<File>();
        Stack<File> dirStack = new Stack<File>();

        Collections.addAll(fileStack, childFiles);

        File childFile;
        while (true) {
            try {
                childFile = fileStack.pop();
            } catch (EmptyStackException e) {
                break;
            }

            if (childFile != null && childFile.exists()) {
                if (childFile.isFile()) {
                    result = result && childFile.delete();
                } else {
                    dirStack.push(childFile);

                    File[] childChildFiles = childFile.listFiles();
                    if (childChildFiles != null && Arrayx.isNotEmpty(childChildFiles)) {
                        Collections.addAll(fileStack, childChildFiles);
                    }
                }
            }
        }

        File childDir;
        while (true) {
            try {
                childDir = dirStack.pop();
            } catch (EmptyStackException e) {
                break;
            }

            if (childDir != null && childDir.exists()) {
                result = result && dir.delete();
            }
        }

        return result;
    }

    /**
     * Get the length of the file or dir, if it is a directory, it will superimpose the length of all subfiles
     */
    public static long lengthRecursively(@NotNull File file) {
        if (!file.exists()) return 0;
        if (file.isFile()) return file.length();

        long length = 0;

        Queue<File> fileQueue = new LinkedList<File>();
        fileQueue.add(file);

        File childFile;
        while (true) {
            childFile = fileQueue.poll();
            if (childFile == null || !childFile.exists()) {
                break;
            }

            if (childFile.isFile()) {
                length += childFile.length();
            } else {
                File[] childChildFiles = childFile.listFiles();
                if (childChildFiles != null && Arrayx.isNotEmpty(childChildFiles)) {
                    Collections.addAll(fileQueue, childChildFiles);
                }
            }
        }
        return length;
    }

    /* ******************************************* From Kotlin Standard library ********************************************************* */

    /**
     * Copies this file to the given [target] file.
     * <p>
     * If some directories on a way to the [target] are missing, then they will be created.
     * If the [target] file already exists, this function will fail unless [overwrite] argument is set to `true`.
     * <p>
     * When [overwrite] is `true` and [target] is a directory, it is replaced only if it is empty.
     * <p>
     * If this file is a directory, it is copied without its content, i.e. an empty [target] directory is created.
     * If you want to copy directory including its contents, use [copyRecursively].
     * <p>
     * The operation doesn't preserve copied file attributes such as creation/modification date, permissions, etc.
     *
     * @param overwrite  `true` if destination overwrite is allowed.
     * @param bufferSize the buffer size to use when copying.
     * @return the [target] file.
     * @throws NoSuchFileException        if the source file doesn't exist.
     * @throws FileAlreadyExistsException if the destination file already exists and [overwrite] argument is set to `false`.
     * @throws IOException                if any errors occur while copying.
     */
    @NotNull
    public static File copyTo(@NotNull File source, @NotNull File target, boolean overwrite, int bufferSize) throws IOException {
        requireExist(source);

        if (target.exists() && (!overwrite || !target.delete())) {
            throw new FileAlreadyExistsException(source, target, "The destination file already exists.");
        }

        if (source.isDirectory()) {
            if (!target.mkdirs()) {
                throw new FileSystemException(source, target, "Failed to create target directory.");
            }
        } else {
            //noinspection ResultOfMethodCallIgnored
            target.getParentFile().mkdirs();

            InputStream inputStream = null;
            OutputStream outputStream = null;
            try {
                inputStream = inputStream(source);
                outputStream = outputStream(target);
                IOStreamx.copyTo(inputStream, outputStream, bufferSize);
            } finally {
                IOStreamx.safeClose(inputStream);
                IOStreamx.safeClose(outputStream);
            }
        }

        return target;
    }

    /**
     * Copies this file to the given [target] file.
     * <p>
     * If some directories on a way to the [target] are missing, then they will be created.
     * If the [target] file already exists, this function will fail unless [overwrite] argument is set to `true`.
     * <p>
     * When [overwrite] is `true` and [target] is a directory, it is replaced only if it is empty.
     * <p>
     * If this file is a directory, it is copied without its content, i.e. an empty [target] directory is created.
     * If you want to copy directory including its contents, use [copyRecursively].
     * <p>
     * The operation doesn't preserve copied file attributes such as creation/modification date, permissions, etc.
     *
     * @param overwrite `true` if destination overwrite is allowed.
     * @return the [target] file.
     * @throws NoSuchFileException        if the source file doesn't exist.
     * @throws FileAlreadyExistsException if the destination file already exists and [overwrite] argument is set to `false`.
     * @throws IOException                if any errors occur while copying.
     */
    @NotNull
    public static File copyTo(@NotNull File source, @NotNull File target, boolean overwrite) throws IOException {
        return copyTo(source, target, overwrite, IOStreamx.DEFAULT_BUFFER_SIZE);
    }

    /**
     * Copies this file with all its children to the specified destination [target] path.
     * If some directories on the way to the destination are missing, then they will be created.
     * <p>
     * If this file path points to a single file, then it will be copied to a file with the path [target].
     * If this file path points to a directory, then its children will be copied to a directory with the path [target].
     * <p>
     * If the [target] already exists, it will be deleted before copying when the [overwrite] parameter permits so.
     * <p>
     * The operation doesn't preserve copied file attributes such as creation/modification date, permissions, etc.
     * <p>
     * If any errors occur during the copying, then further actions will depend on the result of the call
     * to `onError(File, IOException)` function, that will be called with arguments,
     * specifying the file that caused the error and the exception itself.
     * By default this function rethrows exceptions.
     * <p>
     * Exceptions that can be passed to the `onError` function:
     * <p>
     * - [NoSuchFileException] - if there was an attempt to copy a non-existent file
     * - [FileAlreadyExistsException] - if there is a conflict
     * - [AccessDeniedException] - if there was an attempt to open a directory that didn't succeed.
     * - [IOException] - if some problems occur when copying.
     * <p>
     * Note that if this function fails, then partial copying may have taken place.
     *
     * @param overwrite `true` if it is allowed to overwrite existing destination files and directories.
     * @return `false` if the copying was terminated, `true` otherwise.
     */
    public static boolean copyRecursively(@NotNull File source, @NotNull File target, boolean overwrite, @Nullable OnError onError) throws IOException {
        final OnError finalError = onError != null ? onError : new OnError() {
            @Override
            public OnErrorAction onError(@NotNull File file, @NotNull IOException e) throws IOException {
                throw e;
            }
        };

        if (!source.exists()) {
            return finalError.onError(source, new NoSuchFileException(source, null, "The source file doesn't exist.")) != OnErrorAction.TERMINATE;
        }
        try {
            // We cannot break for loop from inside a lambda, so we have to use an exception here
            Sequence<File> sequence = walkTopDown(source).onFail(new OnFailed() {
                @Override
                public void onError(@NotNull File file, @NotNull IOException e) throws IOException {
                    if (finalError.onError(file, e) == OnErrorAction.TERMINATE) {
                        throw new TerminateException(file);
                    }
                }
            });
            for (File src : sequence) {
                if (!src.exists()) {
                    if (finalError.onError(src, new NoSuchFileException(src, null, "The source file doesn't exist.")) == OnErrorAction.TERMINATE) {
                        return false;
                    }
                } else {
                    String relPath = toRelativeString(src, source);
                    File dstFile = new File(target, relPath);
                    if (dstFile.exists() && !(src.isDirectory() && dstFile.isDirectory())) {
                        boolean stillExists;
                        if (!overwrite) {
                            stillExists = true;
                        } else {
                            if (dstFile.isDirectory()) {
                                stillExists = !deleteRecursively(dstFile);
                            } else {
                                stillExists = !dstFile.delete();
                            }
                        }

                        if (stillExists) {
                            assert onError != null;
                            if (onError.onError(dstFile, new FileAlreadyExistsException(src, dstFile, "The destination file already exists.")) == OnErrorAction.TERMINATE) {
                                return false;
                            }

                            continue;
                        }
                    }

                    if (src.isDirectory()) {
                        dstFile.mkdirs();
                    } else {
                        if (copyTo(src, dstFile, overwrite).length() != src.length()) {
                            if (onError != null && onError.onError(src, new IOException("Source file wasn't copied completely, length of destination file differs.")) == OnErrorAction.TERMINATE) {
                                return false;
                            }
                        }
                    }
                }
            }
            return true;
        } catch (TerminateException e) {
            return false;
        }
    }

    /**
     * Delete this file with all its children.
     * Note that if this operation fails then partial deletion may have taken place.
     *
     * @return `true` if the file or directory is successfully deleted, `false` otherwise.
     */
    public static boolean deleteRecursively(@NotNull File file) {
        return Collectionx.fold(walkBottomUp(file), true, new Operation<File, Boolean>() {
            @NotNull
            @Override
            public Boolean operation(@NotNull Boolean aBoolean, @NotNull File file) {
                return (file.delete() || !file.exists()) && aBoolean;
            }
        });
    }

    /**
     * Determines whether this file belongs to the same root as [other]
     * and starts with all components of [other] in the same order.
     * So if [other] has N components, first N components of `this` must be the same as in [other].
     *
     * @return `true` if this path starts with [other] path, `false` otherwise.
     */
    public static boolean startsWith(File self, File other) {
        FilePathComponents components = toComponents(self);
        FilePathComponents otherComponents = toComponents(other);
        if (components.root != otherComponents.root) {
            return false;
        } else if (components.size < otherComponents.size) {
            return false;
        } else {
            return components.segments.subList(0, otherComponents.size).equals(otherComponents.segments);
        }
    }

    /**
     * Determines whether this file belongs to the same root as [other]
     * and starts with all components of [other] in the same order.
     * So if [other] has N components, first N components of `this` must be the same as in [other].
     *
     * @return `true` if this path starts with [other] path, `false` otherwise.
     */
    public static boolean startsWith(File self, String other) {
        return startsWith(self, new File(other));
    }

    /**
     * Determines whether this file path ends with the path of [other] file.
     * <p>
     * If [other] is rooted path it must be equal to this.
     * If [other] is relative path then last N components of `this` must be the same as all components in [other],
     * where N is the number of components in [other].
     *
     * @return `true` if this path ends with [other] path, `false` otherwise.
     */
    public static boolean endsWith(@NotNull File self, @NotNull File other) {
        FilePathComponents components = toComponents(self);
        FilePathComponents otherComponents = toComponents(other);
        if (otherComponents.isRooted) {
            return Premisex.areEqual(self, other);
        } else {
            int shift = components.size - otherComponents.size;
            if (shift < 0) {
                return false;
            } else {
                return components.segments.subList(shift, components.size).equals(otherComponents.segments);
            }
        }
    }

    /**
     * Determines whether this file belongs to the same root as [other]
     * and ends with all components of [other] in the same order.
     * So if [other] has N components, last N components of `this` must be the same as in [other].
     * For relative [other], `this` can belong to any root.
     *
     * @return `true` if this path ends with [other] path, `false` otherwise.
     */
    public static boolean endsWith(File self, String other) {
        return endsWith(self, new File(other));
    }


    /**
     * Removes all . and resolves all possible .. in this file name.
     * For instance, `File("/foo/./bar/gav/../baaz").normalize()` is `File("/foo/bar/baaz")`.
     *
     * @return normalized pathname with . and possibly .. removed.
     */
    @NotNull
    public static File normalize(@NotNull File file) {
        FilePathComponents components = toComponents(file);
        return resolve(components.root, Collectionx.joinToString(normalize(components.segments), File.separator));
    }

    @NotNull
    private static FilePathComponents normalize(@NotNull FilePathComponents components) {
        return new FilePathComponents(components.root, normalize(components.segments));
    }

    @NotNull
    private static List<File> normalize(@NotNull List<File> files) {
        List<File> list = new ArrayList<File>(files.size());
        for (File file : files) {
            String name = file.getName();
            //noinspection StatementWithEmptyBody
            if (".".equals(name)) {

            } else if ("..".equals(name)) {
                if (!list.isEmpty() && !Collectionx.last(list).getName().equals("..")) {
                    list.remove(list.size() - 1);
                } else {
                    list.add(file);
                }
            } else {
                list.add(file);
            }
        }
        return list;
    }

    /**
     * Adds [relative] file to this, considering this as a directory.
     * If [relative] has a root, [relative] is returned back.
     * For instance, `File("/foo/bar").resolve(File("gav"))` is `File("/foo/bar/gav")`.
     * This function is complementary with [relativeTo],
     * so `f.resolve(g.relativeTo(f)) == g` should be always `true` except for different roots case.
     *
     * @return concatenated this and [relative] paths, or just [relative] if it's absolute.
     */
    @NotNull
    public static File resolve(@NotNull File file, @NotNull File relative) {
        if (isRooted(relative)) {
            return relative;
        } else {
            String baseName = file.toString();
            return baseName.isEmpty() || Stringx.endsWith(baseName, File.separatorChar) ? new File(baseName + relative)
                    : new File(baseName + File.separatorChar + relative);
        }
    }

    /**
     * Adds [relative] name to this, considering this as a directory.
     * If [relative] has a root, [relative] is returned back.
     * For instance, `File("/foo/bar").resolve("gav")` is `File("/foo/bar/gav")`.
     *
     * @return concatenated this and [relative] paths, or just [relative] if it's absolute.
     */
    @NotNull
    public static File resolve(@NotNull File file, @NotNull String relative) {
        return resolve(file, new File(relative));
    }

    /**
     * Adds [relative] file to this parent directory.
     * If [relative] has a root or this has no parent directory, [relative] is returned back.
     * For instance, `File("/foo/bar").resolveSibling(File("gav"))` is `File("/foo/gav")`.
     *
     * @return concatenated this.parent and [relative] paths, or just [relative] if it's absolute or this has no parent.
     */
    public static File resolveSibling(File self, File relative) {
        FilePathComponents components = toComponents(self);
        File parentSubPath = components.size == 0 ? new File("..") : components.subPath(0, components.size - 1);
        return resolve(resolve(components.root, parentSubPath), relative);
    }

    /**
     * Adds [relative] name to this parent directory.
     * If [relative] has a root or this has no parent directory, [relative] is returned back.
     * For instance, `File("/foo/bar").resolveSibling("gav")` is `File("/foo/gav")`.
     *
     * @return concatenated this.parent and [relative] paths, or just [relative] if it's absolute or this has no parent.
     */
    public static File resolveSibling(File self, String relative) {
        return resolveSibling(self, new File(relative));
    }

    /**
     * Creates an empty directory in the specified [directory], using the given [prefix] and [suffix] to generate its name.
     * <p>
     * If [prefix] is not specified then some unspecified name will be used.
     * If [suffix] is not specified then ".tmp" will be used.
     * If [directory] is not specified then the default temporary-file directory will be used.
     *
     * @return a file object corresponding to a newly-created directory.
     * @throws IOException              in case of input/output error.
     * @throws IllegalArgumentException if [prefix] is shorter than three symbols.
     */
    @NotNull
    public static File createTempDir(@NotNull String prefix, @Nullable String suffix, @Nullable File directory) throws IOException {
        File dir = File.createTempFile(prefix, suffix, directory);
        dir.delete();
        if (dir.mkdir()) {
            return dir;
        } else {
            throw new IOException("Unable to create temporary directory " + dir.getPath() + ".");
        }
    }

    /**
     * Creates an empty directory in the specified [directory], using the given [prefix] and [suffix] to generate its name.
     * <p>
     * If [prefix] is not specified then some unspecified name will be used.
     * If [suffix] is not specified then ".tmp" will be used.
     * If [directory] is not specified then the default temporary-file directory will be used.
     *
     * @return a file object corresponding to a newly-created directory.
     * @throws IOException              in case of input/output error.
     * @throws IllegalArgumentException if [prefix] is shorter than three symbols.
     */
    @NotNull
    public static File createTempDir(@Nullable File directory) throws IOException {
        return createTempDir("tmp", null, directory);
    }

    /**
     * Creates a new empty file in the specified [directory], using the given [prefix] and [suffix] to generate its name.
     * <p>
     * If [prefix] is not specified then some unspecified name will be used.
     * If [suffix] is not specified then ".tmp" will be used.
     * If [directory] is not specified then the default temporary-file directory will be used.
     *
     * @return a file object corresponding to a newly-created file.
     * @throws IOException              in case of input/output error.
     * @throws IllegalArgumentException if [prefix] is shorter than three symbols.
     */
    @NotNull
    public static File createTempFile(@NotNull String prefix, @Nullable String suffix, @Nullable File directory) throws IOException {
        return File.createTempFile(prefix, suffix, directory);
    }

    /**
     * Creates a new empty file in the specified [directory], using the given [prefix] and [suffix] to generate its name.
     * <p>
     * If [prefix] is not specified then some unspecified name will be used.
     * If [suffix] is not specified then ".tmp" will be used.
     * If [directory] is not specified then the default temporary-file directory will be used.
     *
     * @return a file object corresponding to a newly-created file.
     * @throws IOException              in case of input/output error.
     * @throws IllegalArgumentException if [prefix] is shorter than three symbols.
     */
    public static File createTempFile(@Nullable File directory) throws IOException {
        return createTempFile("tmp", null, directory);
    }

    /**
     * Returns [path][File.path] of this File using the invariant separator '/' to
     * separate the names in the name sequence.
     */
    public String getInvariantSeparatorsPath(@NotNull File file) {
        return File.separatorChar != '/' ? file.getPath().replace(File.separatorChar, '/') : file.getPath();
    }

    /**
     * Returns the getExtension of this file (not including the dot), or an empty string if it doesn't have one.
     */
    @NotNull
    public static String getExtension(@NotNull File file) {
        return Stringx.substringAfterLast(file.getName(), '.', "");
    }

    /**
     * Returns file's name without an getExtension.
     */
    public static String getNameWithoutExtension(File file) {
        return Stringx.substringBeforeLast(file.getName(), ".", file.getName());
    }


    /**
     * Calculates the relative path for this file from [base] file.
     * Note that the [base] file is treated as a directory.
     * If this file matches the [base] file, then an empty string will be returned.
     *
     * @return relative path from [base] to this.
     * @throws IllegalArgumentException if this and base paths have different roots.
     */
    @NotNull
    public static String toRelativeString(@NotNull File self, @NotNull File base) {
        String relative = toRelativeStringOrNull(self, base);
        Premisex.require(relative != null, "this and base files have different roots: " + self.getPath() + " and " + base.getPath() + ".");
        return relative;
    }

    /**
     * Calculates the relative path for this file from [base] file.
     * Note that the [base] file is treated as a directory.
     * If this file matches the [base] file, then a [File] with empty path will be returned.
     *
     * @return File with relative path from [base] to this.
     * @throws IllegalArgumentException if this and base paths have different roots.
     */
    public static File relativeTo(File self, File base) {
        return new File(toRelativeString(self, base));
    }

    /**
     * Calculates the relative path for this file from [base] file.
     * Note that the [base] file is treated as a directory.
     * If this file matches the [base] file, then a [File] with empty path will be returned.
     *
     * @return File with relative path from [base] to this, or `this` if this and base paths have different roots.
     */
    public static File relativeToOrSelf(File self, File base) {
        String relative = toRelativeStringOrNull(self, base);
        return relative != null ? new File(relative) : self;
    }

    /**
     * Calculates the relative path for this file from [base] file.
     * Note that the [base] file is treated as a directory.
     * If this file matches the [base] file, then a [File] with empty path will be returned.
     *
     * @return File with relative path from [base] to this, or `null` if this and base paths have different roots.
     */
    @Nullable
    public static File relativeToOrNull(File self, File base) {
        String relative = toRelativeStringOrNull(self, base);
        return relative != null ? new File(relative) : null;
    }


    @Nullable
    private static String toRelativeStringOrNull(@NotNull File self, @NotNull File base) {
        // Check roots
        FilePathComponents thisComponents = normalize(toComponents(self));
        FilePathComponents baseComponents = normalize(toComponents(base));
        if (thisComponents.root != baseComponents.root) {
            return null;
        }

        int baseCount = baseComponents.size;
        int thisCount = thisComponents.size;

        int sameCount = 0;
        int maxSameCount = Math.min(thisCount, baseCount);
        while (sameCount < maxSameCount && Premisex.areEqual(thisComponents.segments.get(sameCount), baseComponents.segments.get(sameCount))) {
            sameCount++;
        }

        // Annihilate differing base components by adding required number of .. parts
        StringBuilder res = new StringBuilder();
        for (int i : Intx.downTo(baseCount - 1, sameCount)) {
            if ("..".equals(baseComponents.segments.get(i).getName())) {
                return null;
            }

            res.append("..");

            if (i != sameCount) {
                res.append(File.separatorChar);
            }
        }

        // Add remaining this components
        if (sameCount < thisCount) {
            // If some .. were appended
            if (sameCount < baseCount)
                res.append(File.separatorChar);

            Collectionx.joinTo(Collectionx.drop(thisComponents.segments, sameCount), res, File.separator);
        }

        return res.toString();
    }

    /**
     * Estimation of a root name by a given file name.
     * <p>
     * This implementation is able to find /, Drive:/, Drive: or
     * //network.name/root as possible root names.
     * / denotes File.separator here so \ can be used instead.
     * All other possible roots cannot be identified by this implementation.
     * It's also not guaranteed (but possible) that function will be able to detect a root
     * which is incorrect for current OS. For instance, in Unix function cannot detect
     * network root names like //network.name/root, but can detect Windows roots like C:/.
     *
     * @return length or a substring representing the root for this path, or zero if this file name is relative.
     */
    private static int getRootLength(@NotNull String path) {
        // Note: separators should be already replaced to system ones
        int first = Stringx.indexOf(path, File.separatorChar, 0);
        if (first == 0) {
            if (path.length() > 1 && path.charAt(1) == File.separatorChar) {
                // Network names like //my.host/home/something ? => //my.host/home/ should be root
                // NB: does not work in Unix because //my.host/home is converted into /my.host/home there
                // So in Windows we'll have root of //my.host/home but in Unix just /
                first = Stringx.indexOf(path, File.separatorChar, 2);
                if (first >= 0) {
                    first = Stringx.indexOf(path, File.separatorChar, first + 1);
                    if (first >= 0)
                        return first + 1;
                    else
                        return path.length();
                }
            }
            return 1;
        }
        // C:\
        if (first > 0 && path.charAt(first - 1) == ':') {
            first++;
            return first;
        }
        // C:
        if (first == -1 && Stringx.endsWith(path, ':'))
            return path.length();
        return 0;
    }

    /**
     * Estimation of a root name for this file.
     * <p>
     * This implementation is able to find /, Drive:/, Drive: or
     * //network.name/root as possible root names.
     * / denotes File.separator here so \ can be used instead.
     * All other possible roots cannot be identified by this implementation.
     * It's also not guaranteed (but possible) that function will be able to detect a root
     * which is incorrect for current OS. For instance, in Unix function cannot detect
     * network root names like //network.name/root, but can detect Windows roots like C:/.
     *
     * @return string representing the root for this file, or empty string is this file name is relative.
     */
    @NotNull
    public static String getRootName(@NotNull File file) {
        return file.getPath().substring(0, getRootLength(file.getPath()));
    }

    /**
     * Returns root component of this abstract name, like / from /home/user, or C:\ from C:\file.tmp,
     * or //my.host/home for //my.host/home/user
     */
    public static File getRoot(@NotNull File file) {
        return new File(getRootName(file));
    }

    /**
     * Determines whether this file has a root or it represents a relative path.
     * <p>
     * Returns `true` when this file has non-empty root.
     */
    public static boolean isRooted(@NotNull File file) {
        return getRootLength(file.getPath()) > 0;
    }

    /**
     * Represents the path to a file as a collection of directories.
     *
     * @property root the [File] object representing root of the path (for example, `/` or `C:` or empty for relative paths).
     * @property segments the list of [File] objects representing every directory in the path to the file,
     * up to an including the file itself.
     */
    public static class FilePathComponents {

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

    /**
     * Splits the file into path components (the names of containing directories and the name of the file
     * itself) and returns the resulting collection of components.
     */
    @NotNull
    public static FilePathComponents toComponents(@NotNull File file) {
        String path = file.getPath();
        int rootLength = getRootLength(path);
        String rootName = path.substring(0, rootLength);
        String subPath = path.substring(rootLength);
        List<File> list = subPath.isEmpty() ? new ArrayList<File>(0) : Arrayx.map(subPath.split(String.valueOf(File.separatorChar)), new Transformer<String, File>() {
            @NotNull
            @Override
            public File transform(@NotNull String s) {
                return new File(s);
            }
        });
        return new FilePathComponents(new File(rootName), list);
    }

    /**
     * Returns a relative pathname which is a subsequence of this pathname,
     * beginning from component [beginIndex], inclusive,
     * ending at component [endIndex], exclusive.
     * Number 0 belongs to a component closest to the root,
     * number count-1 belongs to a component farthest from the root.
     *
     * @throws IllegalArgumentException if [beginIndex] is negative,
     *                                  or [endIndex] is greater than existing number of components,
     *                                  or [beginIndex] is greater than [endIndex].
     */
    public static File subPath(@NotNull File file, int beginIndex, int endIndex) {
        return toComponents(file).subPath(beginIndex, endIndex);
    }


    /**
     * Constructs a new FileInputStream of this file and returns it as a result.
     */
    public static FileInputStream inputStream(@NotNull File file) throws FileNotFoundException {
        return new FileInputStream(file);
    }

    /**
     * Returns a new [FileReader] for reading the content of this file.
     */
    public static InputStreamReader reader(@NotNull File file, Charset charset) throws FileNotFoundException {
        return IOStreamx.reader(inputStream(file), charset);
    }

    /**
     * Returns a new [FileReader] for reading the content of this file.
     */
    public static InputStreamReader reader(@NotNull File file) throws FileNotFoundException {
        return reader(file, Charx.UTF_8);
    }

    /**
     * Returns a new [BufferedReader] for reading the content of this file.
     *
     * @param bufferSize necessary size of the buffer.
     */
    public static BufferedReader bufferedReader(@NotNull File file, Charset charset, int bufferSize) throws FileNotFoundException {
        return IOStreamx.buffered(reader(file, charset), bufferSize);
    }

    /**
     * Returns a new [BufferedReader] for reading the content of this file.
     *
     * @param bufferSize necessary size of the buffer.
     */
    public static BufferedReader bufferedReader(@NotNull File file, int bufferSize) throws FileNotFoundException {
        return bufferedReader(file, Charx.UTF_8, bufferSize);
    }

    /**
     * Returns a new [BufferedReader] for reading the content of this file.
     */
    public static BufferedReader bufferedReader(@NotNull File file, Charset charset) throws FileNotFoundException {
        return bufferedReader(file, charset, IOStreamx.DEFAULT_BUFFER_SIZE);
    }

    /**
     * Returns a new [BufferedReader] for reading the content of this file.
     */
    public static BufferedReader bufferedReader(@NotNull File file) throws FileNotFoundException {
        return bufferedReader(file, Charx.UTF_8, IOStreamx.DEFAULT_BUFFER_SIZE);
    }


    /**
     * Gets the entire content of this file as a byte array.
     * <p>
     * This method is not recommended on huge files. It has an internal limitation of 2 GB byte array size.
     *
     * @return the entire content of this file as a byte array.
     */
    public static byte[] readBytes(@NotNull File file) throws IOException {
        if (file.length() > Integer.MAX_VALUE) {
            throw new OutOfMemoryError("File " + file.getPath() + " is too big (" + file.length() + " bytes) to fit in memory.");
        }

        int offset = 0;
        int remaining = (int) file.length();
        byte[] result = new byte[remaining];

        InputStream input = inputStream(file);
        try {
            while (remaining > 0) {
                int read = input.read(result, offset, remaining);
                if (read < 0) {
                    break;
                }
                remaining -= read;
                offset += read;
            }
        } finally {
            IOStreamx.safeClose(input);
        }
        return remaining == 0 ? result : Arrayx.copyOf(result, offset);
    }

    /**
     * Gets the entire content of this file as a String using UTF-8 or specified [charset].
     * <p>
     * This method is not recommended on huge files. It has an internal limitation of 2 GB file size.
     *
     * @param charset character set to use.
     * @return the entire content of this file as a String.
     */
    public static String readText(@NotNull File file, Charset charset) throws IOException {
        return Arrayx.toString(readBytes(file), charset);
    }

    /**
     * Gets the entire content of this file as a String using UTF-8 or specified [charset].
     * <p>
     * This method is not recommended on huge files. It has an internal limitation of 2 GB file size.
     *
     * @return the entire content of this file as a String.
     */
    public static String readText(@NotNull File file) throws IOException {
        return readText(file, Charx.UTF_8);
    }

    /**
     * Reads the file content as a list of lines.
     * <p>
     * Do not use this function for huge files.
     *
     * @param charset character set to use.
     * @return list of file lines.
     */
    public static List<String> readLines(@NotNull File file, Charset charset) throws IOException {
        final ArrayList<String> result = new ArrayList<String>();
        forEachLine(file, charset, new Action<String>() {
            @Override
            public void action(@NotNull String s) {
                result.add(s);
            }
        });
        return result;
    }

    /**
     * Reads the file content as a list of lines.
     * <p>
     * Do not use this function for huge files.
     *
     * @return list of file lines.
     */
    public static List<String> readLines(@NotNull File file) throws IOException {
        return readLines(file, Charx.UTF_8);
    }

    /**
     * Calls the [block] callback giving it a sequence of all the lines in this file and closes the reader once
     * the processing is complete.
     *
     * @param charset character set to use
     * @return the value returned by [block].
     */
    public static <T> T useLines(@NotNull File file, Charset charset, Transformer<Sequence<String>, T> block) throws FileNotFoundException {
        BufferedReader bufferedReader = bufferedReader(file, charset);
        T result;
        try {
            result = block.transform(IOStreamx.lineSequence(bufferedReader));
        } finally {
            IOStreamx.safeClose(bufferedReader);
        }
        return result;
    }

    /**
     * Calls the [block] callback giving it a sequence of all the lines in this file and closes the reader once
     * the processing is complete.
     *
     * @return the value returned by [block].
     */
    public static <T> T useLines(@NotNull File file, Transformer<Sequence<String>, T> block) throws FileNotFoundException {
        return useLines(file, Charx.UTF_8, block);
    }

    /**
     * Reads file by byte blocks and calls [action] for each block read.
     * This functions passes the byte array and amount of bytes in the array to the [action] function.
     * <p>
     * You can use this function for huge files.
     *
     * @param action    function to process file blocks.
     * @param blockSize size of a block, replaced by 512 if it's less, 4096 by default.
     */
    public static void forEachBlock(@NotNull File file, int blockSize, Action2<byte[], Integer> action) throws IOException {
        byte[] arr = new byte[Intx.coerceAtLeast(blockSize, IOStreamx.MINIMUM_BLOCK_SIZE)];

        InputStream input = inputStream(file);
        try {
            do {
                int size = input.read(arr);
                if (size <= 0) {
                    break;
                } else {
                    action.action(arr, size);
                }
            } while (true);
        } finally {
            IOStreamx.safeClose(input);
        }
    }

    /**
     * Reads file by byte blocks and calls [action] for each block read.
     * Block has default size which is implementation-dependent.
     * This functions passes the byte array and amount of bytes in the array to the [action] function.
     * <p>
     * You can use this function for huge files.
     *
     * @param action function to process file blocks.
     */
    public static void forEachBlock(@NotNull File file, Action2<byte[], Integer> action) throws IOException {
        forEachBlock(file, IOStreamx.DEFAULT_BLOCK_SIZE, action);
    }

    /**
     * Reads this file line by line using the specified [charset] and calls [action] for each line.
     * Default charset is UTF-8.
     * <p>
     * You may use this function on huge files.
     *
     * @param charset character set to use.
     * @param action  function to process file lines.
     */
    public static void forEachLine(@NotNull File file, Charset charset, Action<String> action) throws IOException {
        // Note: close is called at forEachLine
        IOStreamx.forEachLine(new BufferedReader(new InputStreamReader(new FileInputStream(file), charset)), action);
    }

    /**
     * Reads this file line by line using the specified [charset] and calls [action] for each line.
     * Default charset is UTF-8.
     * <p>
     * You may use this function on huge files.
     *
     * @param action function to process file lines.
     */
    public static void forEachLine(@NotNull File file, Action<String> action) throws IOException {
        // Note: close is called at forEachLine
        forEachLine(file, Charx.UTF_8, action);
    }


    /**
     * Constructs a new FileOutputStream of this file and returns it as a result.
     */
    public static FileOutputStream outputStream(@NotNull File file) throws FileNotFoundException {
        return new FileOutputStream(file);
    }

    /**
     * Returns a new [FileWriter] for writing the content of this file.
     */
    public static OutputStreamWriter writer(@NotNull File file, Charset charset) throws FileNotFoundException {
        return IOStreamx.writer(outputStream(file), charset);
    }

    /**
     * Returns a new [FileWriter] for writing the content of this file.
     */
    public static OutputStreamWriter writer(@NotNull File file) throws FileNotFoundException {
        return writer(file, Charx.UTF_8);
    }

    /**
     * Returns a new [BufferedWriter] for writing the content of this file.
     *
     * @param bufferSize necessary size of the buffer.
     */
    public static BufferedWriter bufferedWriter(@NotNull File file, Charset charset, int bufferSize) throws FileNotFoundException {
        return IOStreamx.buffered(writer(file, charset), bufferSize);
    }

    /**
     * Returns a new [BufferedWriter] for writing the content of this file.
     *
     * @param bufferSize necessary size of the buffer.
     */
    public static BufferedWriter bufferedWriter(@NotNull File file, int bufferSize) throws FileNotFoundException {
        return IOStreamx.buffered(writer(file, Charx.UTF_8), bufferSize);
    }

    /**
     * Returns a new [BufferedWriter] for writing the content of this file.
     */
    public static BufferedWriter bufferedWriter(@NotNull File file, Charset charset) throws FileNotFoundException {
        return IOStreamx.buffered(writer(file, charset), IOStreamx.DEFAULT_BUFFER_SIZE);
    }

    /**
     * Returns a new [BufferedWriter] for writing the content of this file.
     */
    public static BufferedWriter bufferedWriter(@NotNull File file) throws FileNotFoundException {
        return bufferedWriter(file, Charx.UTF_8, IOStreamx.DEFAULT_BUFFER_SIZE);
    }

    /**
     * Returns a new [PrintWriter] for writing the content of this file.
     */
    public static PrintWriter printWriter(@NotNull File file, Charset charset) throws FileNotFoundException {
        return new PrintWriter(bufferedWriter(file, charset));
    }

    /**
     * Returns a new [PrintWriter] for writing the content of this file.
     */
    public static PrintWriter printWriter(@NotNull File file) throws FileNotFoundException {
        return printWriter(file, Charx.UTF_8);
    }

    /**
     * Sets the content of this file as an [array] of bytes.
     * If this file already exists, it becomes overwritten.
     *
     * @param array byte array to write into this file.
     */
    public static void writeBytes(@NotNull File file, byte[] array) throws IOException {
        FileOutputStream outputStream = new FileOutputStream(file);
        try {
            outputStream.write(array);
        } finally {
            IOStreamx.safeClose(outputStream);
        }
    }

    /**
     * Appends an [array] of bytes to the content of this file.
     *
     * @param array byte array to append to this file.
     */
    public static void appendBytes(@NotNull File file, byte[] array) throws IOException {
        FileOutputStream outputStream = new FileOutputStream(file, true);
        try {
            outputStream.write(array);
        } finally {
            IOStreamx.safeClose(outputStream);
        }
    }

    /**
     * Sets the content of this file as [text] encoded using UTF-8 or specified [charset].
     * If this file exists, it becomes overwritten.
     *
     * @param text    text to write into file.
     * @param charset character set to use.
     */
    public static void writeText(@NotNull File file, String text, Charset charset) throws IOException {
        writeBytes(file, Stringx.toByteArray(text, charset));
    }

    /**
     * Sets the content of this file as [text] encoded using UTF-8 or specified [charset].
     * If this file exists, it becomes overwritten.
     *
     * @param text text to write into file.
     */
    public static void writeText(@NotNull File file, String text) throws IOException {
        writeText(file, text, Charx.UTF_8);
    }

    /**
     * Appends [text] to the content of this file using UTF-8 or the specified [charset].
     *
     * @param text    text to append to file.
     * @param charset character set to use.
     */
    public static void appendText(@NotNull File file, String text, Charset charset) throws IOException {
        appendBytes(file, Stringx.toByteArray(text, charset));
    }

    /**
     * Appends [text] to the content of this file using UTF-8 or the specified [charset].
     *
     * @param text text to append to file.
     */
    public static void appendText(@NotNull File file, String text) throws IOException {
        appendText(file, text, Charx.UTF_8);
    }


    /**
     * Gets a sequence for visiting this directory and all its content.
     *
     * @param direction walk direction, top-down (by default) or bottom-up.
     */
    @NotNull
    public static FileTreeWalk walk(@NotNull File file, FileWalkDirection direction) {
        return new FileTreeWalk(file, direction);
    }

    /**
     * Gets a sequence for visiting this directory and all its content.
     */
    @NotNull
    public static FileTreeWalk walk(@NotNull File file) {
        return walk(file, FileWalkDirection.TOP_DOWN);
    }


    /**
     * Gets a sequence for visiting this directory and all its content in top-down order.
     * Depth-first search is used and directories are visited before all their files.
     */
    @NotNull
    public static FileTreeWalk walkTopDown(@NotNull File file) {
        return walk(file, FileWalkDirection.TOP_DOWN);
    }

    /**
     * Gets a sequence for visiting this directory and all its content in bottom-up order.
     * Depth-first search is used and directories are visited after all their files.
     */
    @NotNull
    public static FileTreeWalk walkBottomUp(@NotNull File file) {
        return walk(file, FileWalkDirection.BOTTOM_UP);
    }
}