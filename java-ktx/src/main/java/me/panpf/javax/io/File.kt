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

package me.panpf.javax.io

import java.io.File
import java.io.IOException
import java.util.*

/*
 * File related extension methods or properties
 */


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

    var dir: File?
    while (true) {
        try {
            dir = dirStack.pop()
        } catch (e: EmptyStackException) {
            break
        }

        if (dir != null && dir.exists()) {
            result = result and dir.delete()
        }
    }

    return result
}

/**
 * Create a directory and throw an exception if it cannot be created
 * @throws UnableCreateDirException Unable to create directory
 */
@Throws(UnableCreateDirException::class)
fun File.mkdirsOrThrow() {
    if (exists()) {
        return
    }

    mkdirs()

    if (!exists()) {
        throw UnableCreateDirException(this, path)
    }
}

/**
 * Create a file, create its parent directory first, and throw an exception if it cannot be created
 * @throws UnableCreateFileException Unable to create file
 * @throws UnableCreateDirException  Unable to create parent directory
 */
@Throws(UnableCreateFileException::class, UnableCreateDirException::class)
fun File.createNewFileOrThrow(): File {
    if (exists()) {
        return this
    }

    parentFile.mkdirsOrThrow()

    try {
        createNewFile()
    } catch (e: IOException) {
        throw UnableCreateFileException(this, path, e)
    }

    if (!exists()) {
        throw UnableCreateFileException(this, path)
    }

    return this
}

/**
 * Create a file, create its parent directory first
 * @return If true, the creation is successful.
 */
fun File.createNewFileNoThrow(): Boolean {
    if (exists()) {
        return true
    }

    val parentDir = parentFile
    if (!parentDir.exists() && !parentDir.mkdirs()) {
        return false
    }

    try {
        createNewFile()
    } catch (e: IOException) {
        e.printStackTrace()
        return false
    }

    return exists()
}

/**
 * Get the length of the file or dir, if it is a directory, it will superimpose the length of all subfiles
 */
fun File.lengthRecursively(): Long {
    if (!exists()) {
        return 0
    }

    if (isFile) {
        return length()
    } else {
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
}

class UnableCreateDirException : Exception {
    val file: File

    constructor(file: File, detailMessage: String) : super(detailMessage) {
        this.file = file
    }

    @Suppress("unused")
    constructor(file: File, detailMessage: String, cause: Throwable) : super(detailMessage, cause) {
        this.file = file
    }
}

class UnableCreateFileException : Exception {
    val file: File

    constructor(file: File, detailMessage: String) : super(detailMessage) {
        this.file = file
    }

    constructor(file: File, detailMessage: String, cause: Throwable) : super(detailMessage, cause) {
        this.file = file
    }
}
