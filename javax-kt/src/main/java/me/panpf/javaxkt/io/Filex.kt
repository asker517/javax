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

@file:Suppress("NOTHING_TO_INLINE")

package me.panpf.javaxkt.io

import me.panpf.javax.io.FilePathComponents
import me.panpf.javax.io.Filex
import me.panpf.javax.io.UnableCreateDirException
import me.panpf.javax.io.UnableCreateFileException
import java.io.*


/*
 * File related extension methods or properties
 */


/* ******************************************* mkdirs and create *******************************************/


/**
 * Create a directory and throw an exception if it cannot be created
 * @throws UnableCreateDirException Unable to create directory
 */
@Throws(UnableCreateDirException::class)
inline fun File.mkdirsOrThrow(): File = Filex.mkdirsOrThrow(this)

/**
 * Create a directory
 * @return If true, the creation is successful.
 */
@Throws(UnableCreateDirException::class)
inline fun File.mkdirsOrCheck(): Boolean = Filex.mkdirsOrCheck(this)

/**
 * Create a file, create its parent directory first, and throw an exception if it cannot be created
 * @throws UnableCreateFileException Unable to create file
 * @throws UnableCreateDirException  Unable to create parent directory
 */
@Throws(UnableCreateFileException::class, UnableCreateDirException::class)
inline fun File.createNewFileOrThrow(): File = Filex.createNewFileOrThrow(this)

/**
 * Create a file, create its parent directory first
 * @return If true, the creation is successful.
 */
inline fun File.createNewFileOrCheck(): Boolean = Filex.createNewFileOrCheck(this)


/* ******************************************* clean *******************************************/


/**
 * Delete all subfiles in the current directory (excluding subfolders)
 *
 * @return If true, the clean is successful, otherwise the clean fails.
 */
inline fun File.clean(): Boolean = Filex.clean(this)


/**
 * Loop delete all files in the directory
 * @return If true, the clean is successful, otherwise the clean fails.
 */
inline fun File.cleanRecursively(): Boolean = Filex.cleanRecursively(this)


/* ******************************************* length *******************************************/


/**
 * Get the length of the file or dir, if it is a directory, it will superimpose the length of all subfiles
 */
inline fun File.lengthRecursively(): Long = Filex.lengthRecursively(this)

/**
 * Get the length of the files or dirs, if it is a directory, it will superimpose the length of all subfiles
 */
inline fun Array<File>.lengthRecursively(): Long = Filex.lengthRecursively(this)

/**
 * Get the length of the files or dirs, if it is a directory, it will superimpose the length of all subfiles
 */
inline fun Iterable<File>.lengthRecursively(): Long = Filex.lengthRecursively(this)


/* ******************************************* list *******************************************/


/**
 * Return the path to the file under this directory and all its subdirectories
 */
inline fun File.listRecursively(fileFilter: FileFilter): Array<String>? = Filex.listRecursively(this, fileFilter)

/**
 * Return the path to the file under this directory and all its subdirectories
 */
inline fun File.listRecursively(crossinline fileFilter: (pathname: File) -> Boolean): Array<String>? = listRecursively(FileFilter { fileFilter(it) })

/**
 * Return the path to the file under this directory and all its subdirectories
 */
inline fun File.listRecursively(filenameFilter: FilenameFilter): Array<String>? = Filex.listRecursively(this, filenameFilter)

/**
 * Return the path to the file under this directory and all its subdirectories
 */
inline fun File.listRecursively(crossinline filenameFilter: (dir: File, name: String) -> Boolean): Array<String>? = listRecursively(FilenameFilter { dir, name -> filenameFilter(dir, name) })

/**
 * Return the path to the file under this directory and all its subdirectories
 */
inline fun File.listRecursively(): Array<String>? = Filex.listRecursively(this)

/**
 * Return files in this directory and all its subdirectories
 */
inline fun File.listFilesRecursively(fileFilter: FileFilter): Array<File>? = Filex.listFilesRecursively(this, fileFilter)

/**
 * Return files in this directory and all its subdirectories
 */
inline fun File.listFilesRecursively(crossinline fileFilter: (pathname: File) -> Boolean): Array<File>? = listFilesRecursively(FileFilter { fileFilter(it) })

/**
 * Return files in this directory and all its subdirectories
 */
inline fun File.listFilesRecursively(filenameFilter: FilenameFilter): Array<File>? = Filex.listFilesRecursively(this, filenameFilter)

/**
 * Return files in this directory and all its subdirectories
 */
inline fun File.listFilesRecursively(crossinline filenameFilter: (dir: File, name: String) -> Boolean): Array<File>? = listFilesRecursively(FilenameFilter { dir, name -> filenameFilter(dir, name) })

/**
 * Return files in this directory and all its subdirectories
 */
inline fun File.listFilesRecursively(): Array<File>? = Filex.listFilesRecursively(this)


/* ******************************************* listCount ****************************************** */


/**
 * Returns the number of files in the specified folder, excluding subfiles and subfolders
 */
inline fun File.listCount(fileFilter: FileFilter): Int = Filex.listCount(this, fileFilter)

/**
 * Returns the number of files in the specified folder, excluding subfiles and subfolders
 */
inline fun File.listCount(crossinline fileFilter: (pathname: File) -> Boolean): Int = listCount(FileFilter { fileFilter(it) })

/**
 * Returns the number of files in the specified folder, excluding subfiles and subfolders
 */
inline fun File.listCount(filenameFilter: FilenameFilter): Int = Filex.listCount(this, filenameFilter)

/**
 * Returns the number of files in the specified folder, excluding subfiles and subfolders
 */
inline fun File.listCount(crossinline filenameFilter: (dir: File, name: String) -> Boolean): Int = listCount(FilenameFilter { dir, name -> filenameFilter(dir, name) })

/**
 * Returns the number of files in the specified folder, excluding subfiles and subfolders
 */
inline fun File.listCount(): Int = Filex.listCount(this)

/**
 * Returns the number of files in the specified directory and all its subdirectories
 */
inline fun File.listCountRecursively(fileFilter: FileFilter): Int = Filex.listCountRecursively(this, fileFilter)

/**
 * Returns the number of files in the specified directory and all its subdirectories
 */
inline fun File.listCountRecursively(crossinline fileFilter: (pathname: File) -> Boolean): Int = listCountRecursively(FileFilter { fileFilter(it) })

/**
 * Returns the number of files in the specified directory and all its subdirectories
 */
inline fun File.listCountRecursively(filenameFilter: FilenameFilter): Int = Filex.listCountRecursively(this, filenameFilter)

/**
 * Returns the number of files in the specified directory and all its subdirectories
 */
inline fun File.listCountRecursively(crossinline filenameFilter: (dir: File, name: String) -> Boolean): Int = listCountRecursively(FilenameFilter { dir, name -> filenameFilter(dir, name) })

/**
 * Returns the number of files in the specified directory and all its subdirectories
 */
inline fun File.listCountRecursively(): Int = Filex.listCountRecursively(this)


/* ******************************************* other ****************************************** */

/**
 * Returns all extensions for this file, or an empty string if none. For example: '/tmp/testExtension.txt.zip' returns 'txt.zip'
 */
val File.allExtension: String
    get() = Filex.getAllExtension(this)

/**
 * Returns file's name without an all extension. For example: '/tmp/testExtension.txt.zip' returns 'testExtension'
 */
val File.nameWithoutAllExtension: String
    get() = Filex.getNameWithoutAllExtension(this)

/**
 * Create a file tree
 *
 * @receiver         Start directory
 * @param maxSpan     Max span. Decide how many files or directories are in the same directory
 * @param maxDepth    Max depth
 * @param fileName    File name. For example 'test.txt', 'test1.txt', 'test2.txt'... will be created in the folder...
 * @param fileContent The content to be written to the file
 * @return Start directory
 */
@Throws(IOException::class)
inline fun File.createFileTree(maxSpan: Int, maxDepth: Int, fileName: String, fileContent: String?): File = Filex.createFileTree(this, maxSpan, maxDepth, fileName, fileContent)

/**
 * Compare file paths, commonly used to sort, for example '/a/b/c' is greater than '/a/b' is greater than '/a/c'
 */
inline fun String?.compareFilePath(filePath2: String?): Int = Filex.compareFilePath(this, filePath2)

/**
 * Compare file paths, commonly used to sort, for example '/a/b/c' is greater than '/a/b' is greater than '/a/c'
 */
inline fun File?.compareFilePath(file2: File?): Int = Filex.compareFilePath(this, file2)

/**
 * If the specified file does not exist, return the file, otherwise add a number after the name of the original file until you find a file that does not exist.
 *
 * @param maxNumber Maximum number
 */
inline fun File.existOrAddNumber(maxNumber: Int): File = Filex.existOrAddNumber(this, maxNumber)

/**
 * If the specified file does not exist, return the file, otherwise add a number after the name of the original file until you find a file that does not exist.
 */
inline fun File.existOrAddNumber(): File = Filex.existOrAddNumber(this)


/*
 * *****************************************************************************************************************
 * From kotlin standard library
 * *****************************************************************************************************************
 */


/* ******************************************* components ****************************************** */


/**
 * Splits the file into path components (the names of containing directories and the name of the file
 * itself) and returns the resulting collection of components.
 */
inline fun File.toComponents(): FilePathComponents = Filex.toComponents(this)


/* ******************************************* path ****************************************** */


/**
 * Returns a relative pathname which is a subsequence of this pathname,
 * beginning from component [beginIndex], inclusive,
 * ending at component [endIndex], exclusive.
 * Number 0 belongs to a component closest to the root,
 * number count-1 belongs to a component farthest from the root.
 *
 * @throws IllegalArgumentException if [beginIndex] is negative,
 * or [endIndex] is greater than existing number of components,
 * or [beginIndex] is greater than [endIndex].
 */
inline fun File.subPath(beginIndex: Int, endIndex: Int): File = Filex.subPath(this, beginIndex, endIndex)


/* ******************************************* inputStream ****************************************** */


/**
 * Returns a new [BufferedInputStream] for reading the content of this file.
 *
 * @param bufferSize necessary size of the buffer.
 */
@Throws(FileNotFoundException::class)
inline fun File.bufferedInputStream(bufferSize: Int): BufferedInputStream = Filex.bufferedInputStream(this, bufferSize)

/**
 * Returns a new [BufferedInputStream] for reading the content of this file.
 */
@Throws(FileNotFoundException::class)
inline fun File.bufferedInputStream(): BufferedInputStream = Filex.bufferedInputStream(this)


/* ******************************************* outputStream ****************************************** */


/**
 * Returns a new [BufferedOutputStream] for writing the content of this file.
 *
 * @param bufferSize necessary size of the buffer.
 */
@Throws(FileNotFoundException::class)
inline fun File.bufferedOutputStream(bufferSize: Int): BufferedOutputStream = Filex.bufferedOutputStream(this, bufferSize)

/**
 * Returns a new [BufferedOutputStream] for writing the content of this file.
 */
@Throws(FileNotFoundException::class)
inline fun File.bufferedOutputStream(): BufferedOutputStream = Filex.bufferedOutputStream(this)