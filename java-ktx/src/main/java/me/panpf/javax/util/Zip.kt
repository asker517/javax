package me.panpf.javax.util

import me.panpf.javax.io.createNewFileWithThrow
import me.panpf.javax.io.mkdirsWithThrow
import me.panpf.javax.io.requireExist
import me.panpf.kotlinx.use
import java.io.*
import java.util.*
import java.util.zip.ZipEntry
import java.util.zip.ZipFile
import java.util.zip.ZipOutputStream

/**
 * Compress the specified file
 *
 * @param sourceFiles           The file to be compressed
 * @param destinationFile       Output file
 * @param zipEntryNameTransform Get the name of the file compressed into the zip package
 * @return Output file
 * @throws IOException IO exceptions
 */
@Throws(IOException::class)
fun compressionFiles(sourceFiles: Array<File>?, destinationFile: File, zipEntryNameTransform: (File) -> String): File {
    ZipOutputStream(BufferedOutputStream(FileOutputStream(destinationFile, false))).use({ destinationFile.delete() }) { zipOutputStream ->
        val files = Stack<File>()
        sourceFiles?.let { files.addAll(it) }

        while (true) {
            val childFile: File
            try {
                childFile = files.pop()
            } catch (e: EmptyStackException) {
                break
            }

            if (!childFile.exists()) {
                continue
            }

            if (childFile.isDirectory) {
                val fileList = childFile.listFiles()
                if (fileList != null) {
                    Collections.addAll(files, *fileList)
                }
            } else {
                zipOutputStream.putNextEntry(ZipEntry(zipEntryNameTransform(childFile)))
                BufferedInputStream(FileInputStream(childFile)).use {
                    it.copyTo(zipOutputStream)
                }
                zipOutputStream.closeEntry()
            }
        }
    }
    return destinationFile
}

/**
 * Compress all files in the specified directory to
 *
 * @param sourceDirectory The directory to be compressed
 * @param destinationFile Output file
 * @return Output file
 * @throws IOException IO exceptions
 */
@Throws(IOException::class)
fun compressionDir(sourceDirectory: File, destinationFile: File): File {
    sourceDirectory.requireExist()
    require(sourceDirectory.isDirectory) { sourceDirectory.path + " not directory" }
    return compressionFiles(sourceDirectory.listFiles(), destinationFile) {
        it.path.replace(sourceDirectory.path + "/", "")
    }
}

/**
 * Compress all files under the specified folder, output ZIP file and [sourceDirectory] in the same directory, name is [sourceDirectory] plus '.zip'
 *
 * @param sourceDirectory The directory to be compressed
 * @return Output file
 * @throws IOException IO exceptions
 */
@Throws(IOException::class)
fun compressionDir(sourceDirectory: File): File {
    return compressionDir(sourceDirectory, File(sourceDirectory.path + ".zip"))
}


/**
 * Unzip the ZIP file to the specified folder
 *
 * @param zipSourceFile  ZIP file
 * @param destinationDir Out dir
 * @return Out dir
 * @throws IOException IO exceptions. include ZipException, UnableCreateDirException, UnableCreateFileException
 */
@Throws(IOException::class)
fun decompression(zipSourceFile: File, destinationDir: File): File {
    zipSourceFile.requireExist()
    require(!destinationDir.exists() || destinationDir.isDirectory) { destinationDir.path + " not directory" }

    ZipFile(zipSourceFile).use { zipFile ->
        val entries = zipFile.entries()
        while (entries.hasMoreElements()) {
            val zipEntry = entries.nextElement() as ZipEntry
            val file = File(destinationDir, zipEntry.name)
            if (zipEntry.isDirectory) {
                file.mkdirsWithThrow()
            } else {
                file.createNewFileWithThrow()

                FileOutputStream(file, false).use({ file.delete() }) { outputStream ->
                    zipFile.getInputStream(zipEntry).use { inputStream ->
                        inputStream.copyTo(outputStream)
                    }
                }
            }
        }
    }

    return destinationDir
}

/**
 * Unzip the ZIP file to its directory, and the output folder name is the name of the ZIP file (without the suffix)
 *
 * @param zipSourceFile ZIP file
 * @return Out dir
 * @throws IOException IO exceptions. include ZipException, UnableCreateDirException, UnableCreateFileException
 */
@Throws(IOException::class)
fun decompression(zipSourceFile: File): File {
    return decompression(zipSourceFile, File(zipSourceFile.parentFile, zipSourceFile.nameWithoutExtension))
}