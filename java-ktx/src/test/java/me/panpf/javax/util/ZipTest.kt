package me.panpf.javax.util

import me.panpf.javax.io.createNewFileWithThrow
import me.panpf.javax.security.getMD5Digest
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

        file1.createNewFileWithThrow().writeText("testFile1")
        file2.createNewFileWithThrow().writeText("testFile2")
        file3.createNewFileWithThrow().writeText("testFile3")
        file41.createNewFileWithThrow().writeText("testFile41")
        file42.createNewFileWithThrow().writeText("testFile42")
        file51.createNewFileWithThrow().writeText("testFile51")
        file52.createNewFileWithThrow().writeText("testFile52")

        val dstFile = dir.zipCompressionDir()
        val decompressionSourceFile = dstFile
        val decompressionDstDir = File(dstFile.parentFile, dstFile.name + ".out")
        decompressionDstDir.deleteRecursively()

        decompressionSourceFile.zipDecompressionTo(decompressionDstDir)

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
