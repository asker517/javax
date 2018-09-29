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

package me.panpf.javaxkt.test.io

import me.panpf.javax.io.UnableCreateDirException
import me.panpf.javax.io.UnableCreateFileException
import me.panpf.javaxkt.io.*
import org.junit.Assert
import org.junit.Test
import java.io.File
import java.io.FileFilter
import java.io.FilenameFilter

class FilexTest {

    @Test
    fun testCleanDir() {
        val dir = File("/tmp/javaxCleanDirTest")
        val testFile1 = File(dir, "test1.txt")
        val testFile2 = File(dir, "test2.txt")

        Assert.assertFalse(testFile1.exists())
        testFile1.createNewFileOrThrow()
        Assert.assertTrue(testFile1.exists())

        Assert.assertFalse(testFile2.exists())
        testFile2.createNewFileCheck()
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
        testFile2.createNewFileCheck()
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
        val file = File("/tmp/testNameSuffix.txt")
        Assert.assertEquals(file.extension, "txt")
    }

    @Test
    fun testSimpleName() {
        val file = File("/tmp/testSimpleName.txt")
        Assert.assertEquals(file.nameWithoutExtension, "testSimpleName")
    }

    @Test
    fun testLengthWithDir() {
        val dir = File("/tmp/testLengthWithDir")

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

    @Test
    @Throws(UnableCreateFileException::class, UnableCreateDirException::class)
    fun testList() {
        val testDir = File("/tmp/testList")

        val testFile11 = File(testDir, "dir1/file1")
        val testFile12 = File(testDir, "dir1/file2")
        val testFile13 = File(testDir, "dir1/file3")

        val testFile21 = File(testDir, "dir2/file1")
        val testFile22 = File(testDir, "dir2/file2")
        val testFile23 = File(testDir, "dir2/file3")

        val testFile31 = File(testDir, "dir3/file1")
        val testFile32 = File(testDir, "dir3/file2")
        val testFile33 = File(testDir, "dir3/file3")

        val testFile4 = File(testDir, "file4")
        val testFile5 = File(testDir, "file5")
        val testFile6 = File(testDir, "file6")

        testFile11.createNewFileOrThrow()
        testFile12.createNewFileOrThrow()
        testFile13.createNewFileOrThrow()
        testFile21.createNewFileOrThrow()
        testFile22.createNewFileOrThrow()
        testFile23.createNewFileOrThrow()
        testFile31.createNewFileOrThrow()
        testFile32.createNewFileOrThrow()
        testFile33.createNewFileOrThrow()
        testFile4.createNewFileOrThrow()
        testFile5.createNewFileOrThrow()
        testFile6.createNewFileOrThrow()

        val childPaths = testDir.listRecursively()
        Assert.assertEquals((childPaths?.size ?: 0).toLong(), 15)

        val childFiles = testDir.listFilesRecursively()
        Assert.assertEquals((childFiles?.size ?: 0).toLong(), 15)

        val childFiles2 = testDir.listFilesRecursively(FileFilter { pathname -> pathname.isFile })
        Assert.assertEquals((childFiles2?.size ?: 0).toLong(), 12)

        val childFiles3 = testDir.listFilesRecursively(FilenameFilter { dir, name -> dir.isFile && name.endsWith("2") })
        Assert.assertEquals((childFiles3?.size ?: 0).toLong(), 3)

        testDir.deleteRecursively()
    }
}