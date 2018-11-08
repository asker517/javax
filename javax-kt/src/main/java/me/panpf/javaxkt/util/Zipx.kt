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
import java.util.*
import java.util.zip.ZipEntry
import java.util.zip.ZipFile


/*
 * Zip related extension methods or properties
 */


/**
 * Compress the specified files
 *
 * @receiver           The file to be compressed
 * @param destinationFile       Output file
 * @param zipEntryNameTransform Get the name of the file compressed into the zip package
 * @param listener              Progress listener
 * @return Output file
 * @throws IOException IO exceptions
 */
@Throws(IOException::class)
inline fun Array<File>?.zipCompressFilesTo(destinationFile: File, zipEntryNameTransform: Transformer<File, String>, listener: ZipListener?): File = Zipx.compressFilesTo(this, destinationFile, zipEntryNameTransform, listener)

/**
 * Compress the specified files
 *
 * @receiver           The file to be compressed
 * @param destinationFile       Output file
 * @param zipEntryNameTransform Get the name of the file compressed into the zip package
 * @param listener              Progress listener
 * @return Output file
 * @throws IOException IO exceptions
 */
@Throws(IOException::class)
inline fun Array<File>?.zipCompressFilesTo(destinationFile: File, crossinline zipEntryNameTransform: (File) -> String, listener: ZipListener?): File = Zipx.compressFilesTo(this, destinationFile, { t -> zipEntryNameTransform(t) }, listener)

/**
 * Compress the specified files
 *
 * @receiver           The file to be compressed
 * @param destinationFile       Output file
 * @param zipEntryNameTransform Get the name of the file compressed into the zip package
 * @return Output file
 * @throws IOException IO exceptions
 */
@Throws(IOException::class)
inline fun Array<File>?.zipCompressFilesTo(destinationFile: File, zipEntryNameTransform: Transformer<File, String>): File = Zipx.compressFilesTo(this, destinationFile, zipEntryNameTransform)

/**
 * Compress the specified files
 *
 * @receiver           The file to be compressed
 * @param destinationFile       Output file
 * @param zipEntryNameTransform Get the name of the file compressed into the zip package
 * @return Output file
 * @throws IOException IO exceptions
 */
@Throws(IOException::class)
inline fun Array<File>?.zipCompressFilesTo(destinationFile: File, crossinline zipEntryNameTransform: (File) -> String): File = Zipx.compressFilesTo(this, destinationFile) { t -> zipEntryNameTransform(t) }


/**
 * Compress the specified file or directory
 *
 * @receiver      The file to be compressed
 * @param destinationFile Output file
 * @param listener        Progress listener
 * @return Output file
 * @throws IOException IO exceptions
 */
@Throws(IOException::class)
inline fun File.zipCompressFileTo(destinationFile: File, listener: ZipListener?): File = Zipx.compressFileTo(this, destinationFile, listener)

/**
 * Compress the specified file or directory
 *
 * @receiver      The file to be compressed
 * @param destinationFile Output file
 * @return Output file
 * @throws IOException IO exceptions
 */
@Throws(IOException::class)
inline fun File.zipCompressFileTo(destinationFile: File): File = Zipx.compressFileTo(this, destinationFile)

/**
 * Compress the specified file or directory
 *
 * @receiver The file to be compressed
 * @param listener   Progress listener
 * @return Output file
 * @throws IOException IO exceptions
 */
@Throws(IOException::class)
inline fun File.zipCompressFile(listener: ZipListener?): File = Zipx.compressFile(this, listener)

/**
 * Compress the specified file or directory
 *
 * @receiver The file to be compressed
 * @return Output file
 * @throws IOException IO exceptions
 */
@Throws(IOException::class)
inline fun File.zipCompressFile(): File = Zipx.compressFile(this)


/**
 * Compress the specified file or directory (exclude source directory)
 *
 * @receiver      The file to be compressed
 * @param destinationFile Output file
 * @param listener        Progress listener
 * @return Output file
 * @throws IOException IO exceptions
 */
@Throws(IOException::class)
inline fun File.zipCompressChildFileTo(destinationFile: File, listener: ZipListener?): File = Zipx.compressChildFileTo(this, destinationFile, listener)

/**
 * Compress the specified file or directory (exclude source directory)
 *
 * @receiver      The file to be compressed
 * @param destinationFile Output file
 * @return Output file
 * @throws IOException IO exceptions
 */
@Throws(IOException::class)
inline fun File.zipCompressChildFileTo(destinationFile: File): File = Zipx.compressChildFileTo(this, destinationFile)

/**
 * Compress the specified file or directory (exclude source directory)
 *
 * @receiver The file to be compressed
 * @param listener   Progress listener
 * @return Output file
 * @throws IOException IO exceptions
 */
@Throws(IOException::class)
inline fun File.zipCompressChildFile(listener: ZipListener?): File = Zipx.compressChildFile(this, listener)

/**
 * Compress the specified file or directory (exclude source directory)
 *
 * @receiver The file to be compressed
 * @return Output file
 * @throws IOException IO exceptions
 */
@Throws(IOException::class)
inline fun File.zipCompressChildFile(): File = Zipx.compressChildFile(this)


/**
 * Decompress the ZIP file to the specified folder
 *
 * @receiver  ZIP file
 * @param destinationDir Out dir
 * @return Out dir
 * @throws IOException IO exceptions. include ZipException, UnableCreateDirException, UnableCreateFileException
 */
@Throws(IOException::class)
inline fun File.zipDecompressTo(destinationDir: File, listener: ZipListener?): File = Zipx.decompressTo(this, destinationDir, listener)

/**
 * Decompress the ZIP file to the specified folder
 *
 * @receiver  ZIP file
 * @param destinationDir Out dir
 * @return Out dir
 * @throws IOException IO exceptions. include ZipException, UnableCreateDirException, UnableCreateFileException
 */
@Throws(IOException::class)
inline fun File.zipDecompressTo(destinationDir: File): File = Zipx.decompressTo(this, destinationDir)

/**
 * Decompress the ZIP file to its directory, and the output folder name is the name of the ZIP file (without the suffix)
 *
 * @receiver ZIP file
 * @param listener      Progress listener
 * @return Out dir
 * @throws IOException IO exceptions. include ZipException, UnableCreateDirException, UnableCreateFileException
 */
@Throws(IOException::class)
inline fun File.zipDecompress(listener: ZipListener?): File = Zipx.decompress(this, listener)

/**
 * Decompress the ZIP file to its directory, and the output folder name is the name of the ZIP file (without the suffix)
 *
 * @receiver ZIP file
 * @return Out dir
 * @throws IOException IO exceptions. include ZipException, UnableCreateDirException, UnableCreateFileException
 */
@Throws(IOException::class)
inline fun File.zipDecompress(): File = Zipx.decompress(this)


/**
 * Get the default compression dst file for the specified source file
 */
inline fun File.getZipCompressDstFile(): File = Zipx.getCompressDstFile(this)

/**
 * Get the default decompression directory for the specified ZIP file
 */
inline fun File.getZipDecompressDstDir(): File = Zipx.getDecompressDstDir(this)


/**
 * Get the original size of the Zip file
 */
inline fun ZipFile.getZipTrueSize(): Long = Zipx.getTrueSize(this)

/**
 * Get the original size of the Zip file
 */
@Throws(IOException::class)
inline fun File.getZipTrueSize(): Long = Zipx.getTrueSize(this)

inline fun ZipFile.listZipEntry(): ArrayList<ZipEntry> = Zipx.listEntry(this)

@Throws(IOException::class)
inline fun File.listZipEntry(): ArrayList<ZipEntry> = Zipx.listEntry(this)

inline fun ZipFile.listZipEntryName(): ArrayList<String> = Zipx.listEntryName(this)

@Throws(IOException::class)
inline fun File.listZipEntryName(): ArrayList<String> = Zipx.listEntryName(this)

@Throws(IOException::class)
inline fun File.zipSize(): Int = Zipx.size(this)