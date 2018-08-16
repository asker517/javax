package me.panpf.javax

import me.panpf.javax.io.*
import org.junit.Assert
import org.junit.Test
import java.io.File

class FileTest {

    @Test
    fun testCleanDir() {
        val dir = File("/tmp/javaxCleanDirTest")
        val testFile1 = File(dir, "test1.txt")
        val testFile2 = File(dir, "test2.txt")

        Assert.assertFalse(testFile1.exists())
        testFile1.createNewFileOrThrow()
        Assert.assertTrue(testFile1.exists())

        Assert.assertFalse(testFile2.exists())
        testFile2.createNewFileNoThrow()
        Assert.assertTrue(testFile2.exists())

        dir.cleanDir()
        Assert.assertEquals(dir.listFiles().size, 0)

        dir.delete()
        Assert.assertFalse(dir.exists())
    }

    @Test
    fun testCreateNewFile() {
        val dir = File("/tmp/javaxCreateNewFileTest")
        val testFile1 = File(dir, "test1.txt")
        val testFile2 = File(dir, "test2.txt")

        Assert.assertFalse(testFile1.exists())
        testFile1.createNewFileOrThrow()
        Assert.assertTrue(testFile1.exists())

        Assert.assertFalse(testFile2.exists())
        testFile2.createNewFileNoThrow()
        Assert.assertTrue(testFile2.exists())

        dir.deleteRecursively()
        Assert.assertFalse(dir.exists())
    }

    @Test
    fun testCreateDir() {
        val dir1 = File("/tmp/javaxCreateDirTest1")
        val dir2 = File("/tmp/javaxCreateDirTest2")

        Assert.assertFalse(dir1.exists())
        dir1.mkdirsOrThrow()
        Assert.assertTrue(dir1.exists())

        Assert.assertFalse(dir2.exists())
        dir2.mkdirsOrThrow()
        Assert.assertTrue(dir2.exists())

        dir1.deleteRecursively()
        Assert.assertFalse(dir1.exists())

        dir2.deleteRecursively()
        Assert.assertFalse(dir2.exists())
    }

    @Test
    fun testNameSuffix() {
        val file = File("/tmp/test.txt")
        Assert.assertEquals(file.extension, "txt")
    }

    @Test
    fun testSimpleName() {
        val file = File("/tmp/test.txt")
        Assert.assertEquals(file.nameWithoutExtension, "test")
    }

    @Test
    fun testLengthWithDir() {
        val dir = File("/tmp/javaxLengthWithDirTest")

        val childFile1 = File(dir, "test1.txt")
        childFile1.createNewFileOrThrow()
        childFile1.writeText("111")
        Assert.assertEquals(childFile1.length(), 3)

        val childFile2 = File(dir, "test2.txt")
        childFile2.createNewFileOrThrow()
        childFile2.writeText("111")
        Assert.assertEquals(childFile2.length(), 3)

        Assert.assertEquals(dir.lengthRecursively(), 6)

        dir.deleteRecursively()
        Assert.assertFalse(dir.exists())
    }
}