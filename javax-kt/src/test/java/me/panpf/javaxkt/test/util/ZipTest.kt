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

import me.panpf.javaxkt.io.createNewFileOrThrow
import me.panpf.javaxkt.security.getMD5Digest
import me.panpf.javaxkt.util.getZipDecompressionDstDir
import me.panpf.javaxkt.util.zipCompressionDir
import me.panpf.javaxkt.util.zipDecompression
import org.junit.Assert
import org.junit.Test

import java.io.File
import java.io.IOException

class ZipTest {

    @Test
    @Throws(IOException::class)
    fun testCompression() {
        val dir = File("/tmp/testCompression")
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

        val dstFile = dir.zipCompressionDir()

        dstFile.getZipDecompressionDstDir().deleteRecursively()
        val decompressionDstDir = dstFile.zipDecompression()

        Assert.assertEquals(file1.getMD5Digest(), File(decompressionDstDir, "file1").getMD5Digest())
        Assert.assertEquals(file2.getMD5Digest(), File(decompressionDstDir, "file2").getMD5Digest())
        Assert.assertEquals(file3.getMD5Digest(), File(decompressionDstDir, "file3").getMD5Digest())
        Assert.assertEquals(file41.getMD5Digest(), File(decompressionDstDir, "dir4/file41").getMD5Digest())
        Assert.assertEquals(file42.getMD5Digest(), File(decompressionDstDir, "dir4/file42").getMD5Digest())
        Assert.assertEquals(file51.getMD5Digest(), File(decompressionDstDir, "dir5/file51").getMD5Digest())
        Assert.assertEquals(file52.getMD5Digest(), File(decompressionDstDir, "dir5/file52").getMD5Digest())

        dir.deleteRecursively()
        dstFile.deleteRecursively()
        decompressionDstDir.deleteRecursively()
    }
}
