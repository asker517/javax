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

import me.panpf.javax.io.Filex
import me.panpf.javax.io.UnableCreateDirException
import me.panpf.javax.io.UnableCreateFileException
import java.io.File
import java.io.FileFilter
import java.io.FilenameFilter


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
inline fun File.listRecursively(): Array<String>? = Filex.listRecursively(this)

/**
 * Return files in this directory and all its subdirectories
 */
inline fun File.listFilesRecursively(fileFilter: FileFilter): Array<File>? = Filex.listFilesRecursively(this, fileFilter)

/**
 * Return files in this directory and all its subdirectories
 */
inline fun File.listFilesRecursively(filenameFilter: FilenameFilter): Array<File>? = Filex.listFilesRecursively(this, filenameFilter)

/**
 * Return files in this directory and all its subdirectories
 */
inline fun File.listFilesRecursively(): Array<File>? = Filex.listFilesRecursively(this)