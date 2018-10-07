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

package me.panpf.javaxkt.util

import me.panpf.javax.util.Transformer
import me.panpf.javax.util.ZipListener
import me.panpf.javax.util.Zipx
import java.io.File
import java.io.IOException
import java.util.zip.ZipFile


/*
 * Zip related extension methods or properties
 */


/**
 * Compress the specified file
 *
 * @param destinationFile       Output file
 * @param zipEntryNameTransform Get the name of the file compressed into the zip package
 * @param listener              Progress listener
 * @return Output file
 * @throws IOException IO exceptions
 */
@Throws(IOException::class)
inline fun Array<File>?.zipCompressFilesTo(destinationFile: File, zipEntryNameTransform: Transformer<File, String>, listener: ZipListener? = null): File =
        Zipx.compressFilesTo(this, destinationFile, zipEntryNameTransform, listener)


/**
 * Compress the specified file
 *
 * @param destinationFile       Output file
 * @param zipEntryNameTransform Get the name of the file compressed into the zip package
 * @return Output file
 * @throws IOException IO exceptions
 */
@Throws(IOException::class)
inline fun Array<File>?.zipCompressFilesTo(destinationFile: File, zipEntryNameTransform: Transformer<File, String>): File =
        Zipx.compressFilesTo(this, destinationFile, zipEntryNameTransform)

/**
 * Compress the specified file
 *
 * @param destinationFile       Output file
 * @param zipEntryNameTransform Get the name of the file compressed into the zip package
 * @return Output file
 * @throws IOException IO exceptions
 */
@Throws(IOException::class)
inline fun Array<File>?.zipCompressFilesTo(destinationFile: File, crossinline zipEntryNameTransform: (File) -> String): File =
        Zipx.compressFilesTo(this, destinationFile) { t -> zipEntryNameTransform(t) }

/**
 * Compress the specified file
 *
 * @param destinationFile       Output file
 * @param zipEntryNameTransform Get the name of the file compressed into the zip package
 * @return Output file
 * @throws IOException IO exceptions
 */
@Throws(IOException::class)
inline fun File.zipCompressFileTo(destinationFile: File, listener: ZipListener? = null): File =
        Zipx.compressFileTo(this, destinationFile, listener)

/**
 * Compress the specified file
 *
 * @param listener              Progress listener
 * @return Output file
 * @throws IOException IO exceptions
 */
@Throws(IOException::class)
inline fun File.zipCompressFile(listener: ZipListener? = null): File =
        Zipx.compressFile(this, listener)

/**
 * Compress all files in the specified directory to
 *
 * @param destinationFile Output file
 * @param listener              Progress listener
 * @return Output file
 * @throws IOException IO exceptions
 */
@Throws(IOException::class)
inline fun File.zipCompressDirTo(destinationFile: File, listener: ZipListener? = null): File = Zipx.compressDirTo(this, destinationFile, listener)

/**
 * Compress all files under the specified folder, output ZIP file and self in the same directory, name is self name plus '.zip'
 *
 * @param listener              Progress listener
 * @return Output file
 * @throws IOException IO exceptions
 */
@Throws(IOException::class)
inline fun File.zipCompressDir(listener: ZipListener? = null): File = Zipx.compressDir(this, listener)

/**
 * Get the default compression dst file for the specified source file
 */
inline fun File.getZipCompressDstFile(): File = Zipx.getCompressDstFile(this)


/**
 * Unzip the ZIP file to the specified folder
 *
 * @param destinationDir Out dir
 * @param listener              Progress listener
 * @return Out dir
 * @throws IOException IO exceptions. include ZipException, UnableCreateDirException, UnableCreateFileException
 */
@Throws(IOException::class)
inline fun File.zipDecompressTo(destinationDir: File, listener: ZipListener? = null): File = Zipx.decompressTo(this, destinationDir, listener)

/**
 * Unzip the ZIP file to its directory, and the output folder name is the name of the ZIP file (without the suffix)
 *
 * @param listener              Progress listener
 * @return Out dir
 * @throws IOException IO exceptions. include ZipException, UnableCreateDirException, UnableCreateFileException
 */
@Throws(IOException::class)
inline fun File.zipDecompress(listener: ZipListener? = null): File = Zipx.decompress(this, listener)

/**
 * Get the default decompression directory for the specified ZIP file
 */
inline fun File.getZipDecompressDstDir(): File = Zipx.getDecompressDstDir(this)


/**
 * Get the original size of the Zip file
 */
inline fun ZipFile.getTrueSize(): Long = Zipx.getTrueSize(this)

/**
 * Get the original size of the Zip file
 */
@Throws(IOException::class)
inline fun File.getTrueSize(): Long = Zipx.getTrueSize(this)