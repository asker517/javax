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
import java.io.IOException

class FilexTest {

    @Throws(IOException::class)
    private fun createFileTree(dir: File, fileContent: String): File {
        dir.deleteRecursively()
        dir.mkdirsOrThrow()

        File(dir, "file1.txt").createNewFileOrThrow().writeText(fileContent)
        File(dir, "file2.txt").createNewFileOrThrow().writeText(fileContent)
        File(dir, "file3.txt").createNewFileOrThrow().writeText(fileContent)

        File(dir, "dir1/file1-1.txt").createNewFileOrThrow().writeText(fileContent)
        File(dir, "dir1/file1-2.txt").createNewFileOrThrow().writeText(fileContent)
        File(dir, "dir1/file1-3.txt").createNewFileOrThrow().writeText(fileContent)

        File(dir, "dir1/dir1-1/file1-1-1.txt").createNewFileOrThrow().writeText(fileContent)
        File(dir, "dir1/dir1-1/file1-1-2.txt").createNewFileOrThrow().writeText(fileContent)
        File(dir, "dir1/dir1-1/file1-1-3.txt").createNewFileOrThrow().writeText(fileContent)

        File(dir, "dir1/dir1-2/file1-2-1.txt").createNewFileOrThrow().writeText(fileContent)
        File(dir, "dir1/dir1-2/file1-2-2.txt").createNewFileOrThrow().writeText(fileContent)
        File(dir, "dir1/dir1-2/file1-2-3.txt").createNewFileOrThrow().writeText(fileContent)

        File(dir, "dir1/dir1-3/file1-3-1.txt").createNewFileOrThrow().writeText(fileContent)
        File(dir, "dir1/dir1-3/file1-3-2.txt").createNewFileOrThrow().writeText(fileContent)
        File(dir, "dir1/dir1-3/file1-3-3.txt").createNewFileOrThrow().writeText(fileContent)

        File(dir, "dir2/file2-1.txt").createNewFileOrThrow().writeText(fileContent)
        File(dir, "dir2/file2-2.txt").createNewFileOrThrow().writeText(fileContent)
        File(dir, "dir2/file2-3.txt").createNewFileOrThrow().writeText(fileContent)

        File(dir, "dir2/dir2-1/file2-1-1.txt").createNewFileOrThrow().writeText(fileContent)
        File(dir, "dir2/dir2-1/file2-1-2.txt").createNewFileOrThrow().writeText(fileContent)
        File(dir, "dir2/dir2-1/file2-1-3.txt").createNewFileOrThrow().writeText(fileContent)

        File(dir, "dir2/dir2-2/file2-2-1.txt").createNewFileOrThrow().writeText(fileContent)
        File(dir, "dir2/dir2-2/file2-2-2.txt").createNewFileOrThrow().writeText(fileContent)
        File(dir, "dir2/dir2-2/file2-2-3.txt").createNewFileOrThrow().writeText(fileContent)

        File(dir, "dir2/dir2-3/file2-3-1.txt").createNewFileOrThrow().writeText(fileContent)
        File(dir, "dir2/dir2-3/file2-3-2.txt").createNewFileOrThrow().writeText(fileContent)
        File(dir, "dir2/dir2-3/file2-3-3.txt").createNewFileOrThrow().writeText(fileContent)

        File(dir, "dir3/file3-1.txt").createNewFileOrThrow().writeText(fileContent)
        File(dir, "dir3/file3-2.txt").createNewFileOrThrow().writeText(fileContent)
        File(dir, "dir3/file3-3.txt").createNewFileOrThrow().writeText(fileContent)

        File(dir, "dir3/dir3-1/file3-1-1.txt").createNewFileOrThrow().writeText(fileContent)
        File(dir, "dir3/dir3-1/file3-1-2.txt").createNewFileOrThrow().writeText(fileContent)
        File(dir, "dir3/dir3-1/file3-1-3.txt").createNewFileOrThrow().writeText(fileContent)

        File(dir, "dir3/dir3-2/file3-2-1.txt").createNewFileOrThrow().writeText(fileContent)
        File(dir, "dir3/dir3-2/file3-2-2.txt").createNewFileOrThrow().writeText(fileContent)
        File(dir, "dir3/dir3-2/file3-2-3.txt").createNewFileOrThrow().writeText(fileContent)

        File(dir, "dir3/dir3-3/file3-3-1.txt").createNewFileOrThrow().writeText(fileContent)
        File(dir, "dir3/dir3-3/file3-3-2.txt").createNewFileOrThrow().writeText(fileContent)
        File(dir, "dir3/dir3-3/file3-3-3.txt").createNewFileOrThrow().writeText(fileContent)

        return dir
    }

    @Test
    fun testCreateNewFile() {
        val dir = File("/tmp/testCreateNewFile")
        val testFile1 = File(dir, "test1.txt")
        val testFile2 = File(dir, "test2.txt")

        Assert.assertFalse(testFile1.exists())
        testFile1.createNewFileOrThrow()
        Assert.assertTrue(testFile1.exists())

        Assert.assertFalse(testFile2.exists())
        testFile2.createNewFileOrCheck()
        Assert.assertTrue(testFile2.exists())

        dir.deleteRecursively()
        Assert.assertFalse(dir.exists())
    }

    @Test
    fun testCreateDir() {
        val dir1 = File("/tmp/testCreateDir1")
        val dir2 = File("/tmp/testCreateDir2")

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
    @Throws(UnableCreateFileException::class, UnableCreateDirException::class)
    fun testClean() {
        /*
         * clean
         */
        val dir = createFileTree(File("/tmp/testClean"), "testClean")
        try {
            Assert.assertTrue(dir.exists())
            Assert.assertEquals(dir.listFiles().count(), 6)
            dir.clean()
            Assert.assertTrue(dir.exists())
            Assert.assertEquals(dir.listFiles().count(), 3)
        } finally {
            dir.deleteRecursively()
        }

        // is File
        val file = File("/tmp/testClean.file").createNewFileOrThrow()
        try {
            Assert.assertTrue(file.clean())
        } finally {
            file.deleteRecursively()
        }

        // not exists
        val fileNotExists = File("/tmp/testClean_not_exists.file")
        try {
            Assert.assertTrue(fileNotExists.clean())
        } finally {
            fileNotExists.deleteRecursively()
        }
    }

    @Test
    @Throws(UnableCreateFileException::class, UnableCreateDirException::class)
    fun testCleanRecursively() {
        val dir = createFileTree(File("/tmp/testCleanRecursively"), "testCleanRecursively")
        try {
            Assert.assertTrue(dir.exists())
            Assert.assertEquals(dir.listFilesRecursively()?.count() ?: 0, 51)
            dir.cleanRecursively()
            Assert.assertTrue(dir.exists())
            Assert.assertEquals(dir.listFilesRecursively()?.count() ?: 0, 0)
        } finally {
            dir.deleteRecursively()
        }

        // is File
        val file = File("/tmp/testCleanRecursively.file").createNewFileOrThrow()
        try {
            Assert.assertTrue(file.cleanRecursively())
        } finally {
            file.deleteRecursively()
        }

        // not exists
        val fileNotExists = File("/tmp/testCleanRecursively_not_exists.file")
        try {
            Assert.assertTrue(fileNotExists.cleanRecursively())
        } finally {
            fileNotExists.deleteRecursively()
        }
    }

    @Test
    @Throws(UnableCreateFileException::class, UnableCreateDirException::class)
    fun testDeleteRecursively() {
        val dir = createFileTree(File("/tmp/testDeleteRecursively"), "testDeleteRecursively")
        try {
            Assert.assertTrue(dir.exists())
            Assert.assertTrue(dir.deleteRecursively())
            Assert.assertFalse(dir.exists())
        } finally {
            dir.deleteRecursively()
        }

        // is File
        val file = File("/tmp/testDeleteRecursively.file").createNewFileOrThrow()
        try {
            Assert.assertTrue(file.exists())
            Assert.assertTrue(file.deleteRecursively())
            Assert.assertFalse(file.exists())
        } finally {
            file.deleteRecursively()
        }

        // not exists
        val fileNotExists = File("/tmp/testCleanRecursively_not_exists.file")
        try {
            Assert.assertFalse(file.exists())
            Assert.assertTrue(fileNotExists.deleteRecursively())
        } finally {
            fileNotExists.deleteRecursively()
        }
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
        Assert.assertEquals(arrayOf(dir).lengthRecursively(), 6)
        Assert.assertEquals(arrayListOf(dir).lengthRecursively(), 6)

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