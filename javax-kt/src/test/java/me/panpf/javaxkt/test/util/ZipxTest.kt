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

package me.panpf.javaxkt.test.util

import me.panpf.javax.util.ZipListener
import me.panpf.javaxkt.io.createNewFileOrThrow
import me.panpf.javaxkt.security.getMD5Digest
import me.panpf.javaxkt.util.*
import org.junit.Assert
import org.junit.Test
import java.io.File
import java.io.IOException
import java.util.*
import java.util.zip.ZipEntry

class ZipxTest {

    @Test
    @Throws(IOException::class)
    fun testFilesTo() {
        val dir = File("/tmp/testCompression")
        var compressDstFile: File? = null
        var decompressionDstDir: File? = null
        try {
            val file1 = File("/tmp/testCompression/file1")
            val file2 = File("/tmp/testCompression/file2")
            val file3 = File("/tmp/testCompression/file3")
            val file41 = File("/tmp/testCompression/dir4/file41")
            val file42 = File("/tmp/testCompression/dir4/file42")
            val file51 = File("/tmp/testCompression/dir5/file51")
            val file52 = File("/tmp/testCompression/dir5/file52")

            dir.deleteRecursively()
            file1.createNewFileOrThrow().writeText("testFile1")
            file2.createNewFileOrThrow().writeText("testFile2")
            file3.createNewFileOrThrow().writeText("testFile3")
            file41.createNewFileOrThrow().writeText("testFile41")
            file42.createNewFileOrThrow().writeText("testFile42")
            file51.createNewFileOrThrow().writeText("testFile51")
            file52.createNewFileOrThrow().writeText("testFile52")

            compressDstFile = dir.getZipCompressDstFile()
            arrayOf(dir).zipCompressFilesTo(compressDstFile) { it.path.replace(dir.path + File.separator, "") }

            val decompressDstDir = compressDstFile.getZipDecompressDstDir()
            decompressDstDir.deleteRecursively()
            decompressionDstDir = compressDstFile.zipDecompressTo(decompressDstDir)

            Assert.assertEquals(file1.getMD5Digest(), File(decompressionDstDir, "file1").getMD5Digest())
            Assert.assertEquals(file2.getMD5Digest(), File(decompressionDstDir, "file2").getMD5Digest())
            Assert.assertEquals(file3.getMD5Digest(), File(decompressionDstDir, "file3").getMD5Digest())
            Assert.assertEquals(file41.getMD5Digest(), File(decompressionDstDir, "dir4/file41").getMD5Digest())
            Assert.assertEquals(file42.getMD5Digest(), File(decompressionDstDir, "dir4/file42").getMD5Digest())
            Assert.assertEquals(file51.getMD5Digest(), File(decompressionDstDir, "dir5/file51").getMD5Digest())
            Assert.assertEquals(file52.getMD5Digest(), File(decompressionDstDir, "dir5/file52").getMD5Digest())
        } finally {
            dir.deleteRecursively()
            compressDstFile?.deleteRecursively()
            decompressionDstDir?.deleteRecursively()
        }
    }

    @Test
    @Throws(IOException::class)
    fun testFileTo() {
        val file1 = File("/tmp/testCompression/file1.txt")
        var compress1File: File? = null
        var decompress1Dir: File? = null
        var decompress1File: File? = null
        try {
            file1.createNewFileOrThrow().writeText("testFile1")

            compress1File = file1.zipCompressFileTo(File(file1.path + "1"))
            decompress1Dir = compress1File.zipDecompressTo(File(compress1File.parentFile.path + "1"))
            decompress1File = File(decompress1Dir, file1.name)

            Assert.assertEquals(file1.getMD5Digest(), decompress1File.getMD5Digest())
        } finally {
            file1.deleteRecursively()
            compress1File?.deleteRecursively()
            decompress1Dir?.deleteRecursively()
            decompress1File?.deleteRecursively()
        }
    }

    @Test
    @Throws(IOException::class)
    fun testFile() {
        val file2 = File("/tmp/testCompression/file2.txt")
        var compress2File: File? = null
        var decompress2Dir: File? = null
        var decompress2File: File? = null
        try {
            file2.createNewFileOrThrow().writeText("testFile2")
            val originMd5 = file2.getMD5Digest()

            compress2File = file2.zipCompressFile()
            file2.deleteRecursively()

            decompress2Dir = compress2File.zipDecompress()
            decompress2File = File(decompress2Dir, file2.name)

            Assert.assertEquals(originMd5, decompress2File.getMD5Digest())
        } finally {
            file2.deleteRecursively()
            compress2File?.deleteRecursively()
            decompress2Dir?.deleteRecursively()
            decompress2File?.deleteRecursively()
        }
    }

    @Test
    @Throws(IOException::class)
    fun testCompressListener() {
        val dir = File("/tmp/testCompression")
        var dstFile: File? = null
        try {
            val file1 = File("/tmp/testCompression/file1")
            val file2 = File("/tmp/testCompression/file2")
            val file3 = File("/tmp/testCompression/file3")
            val file41 = File("/tmp/testCompression/dir4/file41")
            val file42 = File("/tmp/testCompression/dir4/file42")
            val file51 = File("/tmp/testCompression/dir5/file51")
            val file52 = File("/tmp/testCompression/dir5/file52")

            dir.deleteRecursively()
            file1.createNewFileOrThrow().writeText("testFile1")
            file2.createNewFileOrThrow().writeText("testFile2")
            file3.createNewFileOrThrow().writeText("testFile3")
            file41.createNewFileOrThrow().writeText("testFile41")
            file42.createNewFileOrThrow().writeText("testFile42")
            file51.createNewFileOrThrow().writeText("testFile51")
            file52.createNewFileOrThrow().writeText("testFile52")

            val progress = ArrayList<String>()
            dstFile = dir.zipCompressDir(object : ZipListener {
                override fun onEntryStart(zipEntry: ZipEntry) {
                    progress.add("EntryStart: " + zipEntry.name)
                }

                override fun onUpdateProgress(totalLength: Long, completedLength: Long, zipEntry: ZipEntry, entryTotalLength: Long, entryCompletedLength: Long) {
                    progress.add(completedLength.toString() + "/" + totalLength + "->" + zipEntry.name + ": " + entryCompletedLength + "/" + entryTotalLength)
                }

                override fun onEntryEnd(zipEntry: ZipEntry) {
                    progress.add("EntryEnd: " + zipEntry.name)
                }
            })

            Assert.assertEquals(progress.joinToArrayString(), "[EntryStart: file1, 9/67->file1: 9/9, EntryEnd: file1, EntryStart: dir4/file41, 19/67->dir4/file41: 10/10, EntryEnd: dir4/file41, EntryStart: dir4/file42, 29/67->dir4/file42: 10/10, EntryEnd: dir4/file42, EntryStart: dir5/file52, 39/67->dir5/file52: 10/10, EntryEnd: dir5/file52, EntryStart: dir5/file51, 49/67->dir5/file51: 10/10, EntryEnd: dir5/file51, EntryStart: file2, 58/67->file2: 9/9, EntryEnd: file2, EntryStart: file3, 67/67->file3: 9/9, EntryEnd: file3]")
        } finally {
            dir.deleteRecursively()
            dstFile?.deleteRecursively()
        }
    }

    @Test
    @Throws(IOException::class)
    fun testDecompressListener() {
        val dir = File("/tmp/testCompression")
        var dstFile: File? = null
        var decompressionDstDir: File? = null
        try {
            val file1 = File("/tmp/testCompression/file1")
            val file2 = File("/tmp/testCompression/file2")
            val file3 = File("/tmp/testCompression/file3")
            val file41 = File("/tmp/testCompression/dir4/file41")
            val file42 = File("/tmp/testCompression/dir4/file42")
            val file51 = File("/tmp/testCompression/dir5/file51")
            val file52 = File("/tmp/testCompression/dir5/file52")

            dir.deleteRecursively()
            file1.createNewFileOrThrow().writeText("testFile1")
            file2.createNewFileOrThrow().writeText("testFile2")
            file3.createNewFileOrThrow().writeText("testFile3")
            file41.createNewFileOrThrow().writeText("testFile41")
            file42.createNewFileOrThrow().writeText("testFile42")
            file51.createNewFileOrThrow().writeText("testFile51")
            file52.createNewFileOrThrow().writeText("testFile52")

            dstFile = dir.zipCompressDir()

            dstFile.getZipDecompressDstDir().deleteRecursively()

            val progress = ArrayList<String>()
            decompressionDstDir = dstFile.zipDecompress(object : ZipListener {
                override fun onEntryStart(zipEntry: ZipEntry) {
                    progress.add("EntryStart: " + zipEntry.name)
                }

                override fun onUpdateProgress(totalLength: Long, completedLength: Long, zipEntry: ZipEntry, entryTotalLength: Long, entryCompletedLength: Long) {
                    progress.add(completedLength.toString() + "/" + totalLength + "->" + zipEntry.name + ": " + entryCompletedLength + "/" + entryTotalLength)
                }

                override fun onEntryEnd(zipEntry: ZipEntry) {
                    progress.add("EntryEnd: " + zipEntry.name)
                }
            })

            Assert.assertEquals(progress.joinToArrayString(), "[EntryStart: file1, 9/67->file1: 9/9, EntryEnd: file1, EntryStart: dir4/file41, 19/67->dir4/file41: 10/10, EntryEnd: dir4/file41, EntryStart: dir4/file42, 29/67->dir4/file42: 10/10, EntryEnd: dir4/file42, EntryStart: dir5/file52, 39/67->dir5/file52: 10/10, EntryEnd: dir5/file52, EntryStart: dir5/file51, 49/67->dir5/file51: 10/10, EntryEnd: dir5/file51, EntryStart: file2, 58/67->file2: 9/9, EntryEnd: file2, EntryStart: file3, 67/67->file3: 9/9, EntryEnd: file3]")
        } finally {
            dir.deleteRecursively()
            dstFile?.deleteRecursively()
            decompressionDstDir?.deleteRecursively()
        }
    }
}
