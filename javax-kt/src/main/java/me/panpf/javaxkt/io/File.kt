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

package me.panpf.javaxkt.io

import java.io.File
import java.io.FileFilter
import java.io.FilenameFilter
import java.io.IOException
import java.util.*


/*
 * File related extension methods or properties
 */


/**
 * Create a directory and throw an exception if it cannot be created
 * @throws UnableCreateDirException Unable to create directory
 */
@Throws(UnableCreateDirException::class)
fun File.mkdirsOrThrow(): File {
    if (exists()) return this
    mkdirs()
    if (!exists()) throw UnableCreateDirException(this)
    return this
}

/**
 * Create a directory
 * @return If true, the creation is successful.
 */
@Throws(UnableCreateDirException::class)
fun File.mkdirsCheck(): Boolean {
    if (exists()) return true
    mkdirs()
    return exists()
}

/**
 * Create a file, create its parent directory first, and throw an exception if it cannot be created
 * @throws UnableCreateFileException Unable to create file
 * @throws UnableCreateDirException  Unable to create parent directory
 */
@Throws(UnableCreateFileException::class, UnableCreateDirException::class)
fun File.createNewFileOrThrow(): File {
    if (exists()) return this
    parentFile.mkdirsOrThrow()

    try {
        createNewFile()
    } catch (e: IOException) {
        throw UnableCreateFileException(this, e)
    }

    if (!exists()) throw UnableCreateFileException(this)
    return this
}

/**
 * Create a file, create its parent directory first
 * @return If true, the creation is successful.
 */
fun File.createNewFileCheck(): Boolean {
    if (exists()) return true
    if (!parentFile.mkdirsCheck()) return false

    try {
        createNewFile()
    } catch (e: IOException) {
        e.printStackTrace()
        return false
    }

    return exists()
}

/**
 * Loop delete all files in the directory
 * @return If true, the clean is successful, otherwise the clean fails.
 */
fun File.cleanDir(): Boolean {
    if (!exists() || isFile) return true

    val childFiles = listFiles()
    if (childFiles == null || childFiles.isEmpty()) return true

    var result = true

    val fileStack = Stack<File>()
    val dirStack = Stack<File>()

    Collections.addAll(fileStack, *childFiles)

    var childFile: File?
    while (true) {
        try {
            childFile = fileStack.pop()
        } catch (e: EmptyStackException) {
            break
        }

        if (childFile != null && childFile.exists()) {
            if (childFile.isFile) {
                result = result and childFile.delete()
            } else {
                dirStack.push(childFile)

                val childChildFiles = childFile.listFiles()
                if (childChildFiles != null && childChildFiles.isNotEmpty()) {
                    Collections.addAll(fileStack, *childChildFiles)
                }
            }
        }
    }

    var childDir: File?
    while (true) {
        try {
            childDir = dirStack.pop()
        } catch (e: EmptyStackException) {
            break
        }

        if (childDir != null && childDir.exists()) {
            result = result and childDir.delete()
        }
    }

    return result
}

/**
 * Get the length of the file or dir, if it is a directory, it will superimpose the length of all subfiles
 */
fun File.lengthRecursively(): Long {
    if (!exists()) return 0
    if (isFile) return length()

    var length: Long = 0

    val fileQueue = LinkedList<File>()
    fileQueue.add(this)

    var childFile: File?
    while (true) {
        childFile = fileQueue.poll()
        if (childFile == null || !childFile.exists()) {
            break
        }

        if (childFile.isFile) {
            length += childFile.length()
        } else {
            val childChildFiles = childFile.listFiles()
            if (childChildFiles != null && childChildFiles.isNotEmpty()) {
                Collections.addAll(fileQueue, *childChildFiles)
            }
        }
    }
    return length
}

/**
 * Return the path to the file under this directory and all its subdirectories
 */
fun File.listRecursively(): Array<String>? {
    if (!this.exists()) return null
    if (this.isFile) return null

    val files = LinkedList<String>()

    val dirQueue = LinkedList<File>()
    dirQueue.add(this)

    while (true) {
        val currentDir = dirQueue.poll()
        if (currentDir == null || !currentDir.exists()) break

        val childPaths = currentDir.list() ?: continue

        for (childPath in childPaths) {
            val childFile = File(currentDir, childPath)
            if (!childFile.exists()) continue
            files.add(childFile.path.replace(this.path + File.separator, ""))

            if (childFile.isDirectory) {
                dirQueue.add(childFile)
            }
        }
    }
    return if (files.isEmpty()) null else files.toTypedArray()
}

/**
 * Return files in this directory and all its subdirectories
 */
fun File.listFilesRecursively(fileFilter: FileFilter?): Array<File>? {
    if (!this.exists()) return null
    if (this.isFile) return null

    val files = LinkedList<File>()

    val dirQueue = LinkedList<File>()
    dirQueue.add(this)

    while (true) {
        val currentDir = dirQueue.poll()
        if (currentDir == null || !currentDir.exists()) break

        val childFiles = currentDir.listFiles() ?: continue

        for (childFile in childFiles) {
            if (!childFile.exists()) continue

            if (fileFilter == null || fileFilter.accept(childFile)) {
                files.add(childFile)
            }

            if (childFile.isDirectory) {
                dirQueue.add(childFile)
            }
        }
    }
    return if (files.isEmpty()) null else files.toTypedArray()
}

/**
 * Return files in this directory and all its subdirectories
 */
fun File.listFilesRecursively(filenameFilter: FilenameFilter?): Array<File>? {
    if (!this.exists()) return null
    if (this.isFile) return null

    val files = LinkedList<File>()

    val dirQueue = LinkedList<File>()
    dirQueue.add(this)

    var currentDir: File?
    while (true) {
        currentDir = dirQueue.poll()
        if (currentDir == null || !currentDir.exists()) break

        val childFiles = currentDir.listFiles() ?: continue

        for (childFile in childFiles) {
            if (!childFile.exists()) continue

            if (filenameFilter == null || filenameFilter.accept(childFile, childFile.name)) {
                files.add(childFile)
            }

            if (childFile.isDirectory) {
                dirQueue.add(childFile)
            }
        }
    }
    return if (files.isEmpty()) null else files.toTypedArray()
}

/**
 * Return files in this directory and all its subdirectories
 */
fun File.listFilesRecursively(): Array<File>? {
    return this.listFilesRecursively(null as FileFilter?)
}