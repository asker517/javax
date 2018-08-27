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
 * @param destinationFile       Output file
 * @param zipEntryNameTransform Get the name of the file compressed into the zip package
 * @return Output file
 * @throws IOException IO exceptions
 */
@Throws(IOException::class)
fun Array<File>?.zipCompressionTo(destinationFile: File, zipEntryNameTransform: (File) -> String): File {
    ZipOutputStream(BufferedOutputStream(FileOutputStream(destinationFile, false))).use({ destinationFile.delete() }) { zipOutputStream ->
        val files = Stack<File>()
        this?.let { files.addAll(it) }

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
 * @param destinationFile Output file
 * @return Output file
 * @throws IOException IO exceptions
 */
@Throws(IOException::class)
fun File.zipCompressionDirTo(destinationFile: File): File {
    this.requireExist()
    require(this.isDirectory) { this.path + " not directory" }
    return this.listFiles().zipCompressionTo(destinationFile) {
        it.path.replace(this.path + "/", "")
    }
}

/**
 * Compress all files under the specified folder, output ZIP file and self in the same directory, name is self name plus '.zip'
 *
 * @return Output file
 * @throws IOException IO exceptions
 */
@Throws(IOException::class)
fun File.zipCompressionDir(): File {
    return this.zipCompressionDirTo(File(this.path + ".zip"))
}


/**
 * Unzip the ZIP file to the specified folder
 *
 * @param destinationDir Out dir
 * @return Out dir
 * @throws IOException IO exceptions. include ZipException, UnableCreateDirException, UnableCreateFileException
 */
@Throws(IOException::class)
fun File.zipDecompressionTo(destinationDir: File): File {
    this.requireExist()
    require(!destinationDir.exists() || destinationDir.isDirectory) { destinationDir.path + " not directory" }

    ZipFile(this).use { zipFile ->
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
 * @return Out dir
 * @throws IOException IO exceptions. include ZipException, UnableCreateDirException, UnableCreateFileException
 */
@Throws(IOException::class)
fun File.zipDecompression(): File {
    return this.zipDecompressionTo(File(this.parentFile, this.nameWithoutExtension))
}