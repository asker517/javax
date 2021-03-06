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
import me.panpf.javaxkt.collections.joinToArrayString
import org.junit.Assert
import org.junit.Test
import java.io.File

class FilexTest {

    @Test
    fun testCreateNewFile() {
        val dir = File("/tmp/testCreateNewFile1")
        try {
            val file1 = File(dir, "test1.txt")
            Assert.assertFalse(file1.exists())
            Assert.assertTrue(file1.createNewFileOrThrow().exists())
            Assert.assertTrue(file1.createNewFileOrThrow().exists())
        } finally {
            dir.deleteRecursively()
        }

        val dir2 = File("/tmp/testCreateNewFile2")
        try {
            val file2 = File(dir2, "test2.txt")
            Assert.assertFalse(file2.exists())
            Assert.assertTrue(file2.createNewFileOrCheck())
            Assert.assertTrue(file2.createNewFileOrCheck())
        } finally {
            dir2.deleteRecursively()
        }
    }

    @Test
    fun tesMkdirsDir() {
        val dir1 = File("/tmp/tesMkdirsDir")
        try {
            Assert.assertFalse(dir1.exists())
            Assert.assertTrue(dir1.mkdirsOrThrow().exists())
            Assert.assertTrue(dir1.mkdirsOrThrow().exists())
        } finally {
            dir1.deleteRecursively()
        }

        val dir2 = File("/tmp/tesMkdirsDir2")
        try {
            Assert.assertFalse(dir2.exists())
            Assert.assertTrue(dir2.mkdirsOrCheck())
            Assert.assertTrue(dir2.mkdirsOrCheck())
        } finally {
            dir2.deleteRecursively()
        }
    }

    @Test
    @Throws(UnableCreateFileException::class, UnableCreateDirException::class)
    fun testClean() {
        /*
         * clean
         */
        val dir = File("/tmp/testClean").createFileTree(3, 3, "file.txt", "testClean")
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
        val fileNotExists = File("/tmp/testClean.not_exists.file")
        try {
            Assert.assertTrue(fileNotExists.clean())
        } finally {
            fileNotExists.deleteRecursively()
        }
    }

    @Test
    @Throws(UnableCreateFileException::class, UnableCreateDirException::class)
    fun testCleanRecursively() {
        val dir = File("/tmp/testCleanRecursively").createFileTree(3, 3, "file.txt", "testCleanRecursively")
        try {
            Assert.assertTrue(dir.exists())
            Assert.assertEquals(dir.listCountRecursively(), 51)
            dir.cleanRecursively()
            Assert.assertTrue(dir.exists())
            Assert.assertEquals(dir.listCountRecursively(), 0)
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
        val fileNotExists = File("/tmp/testCleanRecursively.not_exists.file")
        try {
            Assert.assertTrue(fileNotExists.cleanRecursively())
        } finally {
            fileNotExists.deleteRecursively()
        }
    }

    @Test
    fun testLengthRecursively() {
        val dir = File("/tmp/testLengthRecursively")
        try {
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
            Assert.assertEquals(listOf(dir).lengthRecursively(), 6)
        } finally {
            dir.deleteRecursively()
        }
    }

    @Test
    @Throws(UnableCreateFileException::class, UnableCreateDirException::class)
    fun testListRecursively() {
        val dir = File("/tmp/testListRecursively").createFileTree(3, 3, "file.txt", "testListRecursively")

        try {
            val childPaths = dir.listRecursively()
            Assert.assertEquals(childPaths?.count() ?: 0, 51)
            Assert.assertTrue(childPaths?.contains("file1.txt") ?: false)
            Assert.assertTrue(childPaths?.contains("dir1") ?: false)
            Assert.assertTrue(childPaths?.contains("dir1/file1.txt") ?: false)
            Assert.assertTrue(childPaths?.contains("dir1/dir1/file1.txt") ?: false)
            Assert.assertTrue(childPaths?.contains("dir1/dir2/file1.txt") ?: false)
            Assert.assertTrue(childPaths?.contains("dir1/dir3/file1.txt") ?: false)
            Assert.assertTrue(childPaths?.contains("dir2") ?: false)
            Assert.assertTrue(childPaths?.contains("dir2/dir1/file1.txt") ?: false)
            Assert.assertTrue(childPaths?.contains("dir2/dir2/file1.txt") ?: false)
            Assert.assertTrue(childPaths?.contains("dir2/dir3/file1.txt") ?: false)
            Assert.assertTrue(childPaths?.contains("dir3") ?: false)
            Assert.assertTrue(childPaths?.contains("dir3/dir1/file1.txt") ?: false)
            Assert.assertTrue(childPaths?.contains("dir3/dir2/file1.txt") ?: false)
            Assert.assertTrue(childPaths?.contains("dir3/dir3/file1.txt") ?: false)

            Assert.assertEquals((dir.listRecursively { pathname -> pathname.isFile }?.size ?: 0).toLong(), 39)
            Assert.assertEquals((dir.listRecursively { dir2, name -> File(dir2, name).isDirectory }?.size
                    ?: 0).toLong(), 12)

            val childFiles = dir.listFilesRecursively()
            Assert.assertEquals(childFiles?.count() ?: 0, 51)
            Assert.assertTrue(childFiles?.contains(File(dir, "file1.txt")) ?: false)
            Assert.assertTrue(childFiles?.contains(File(dir, "dir1")) ?: false)
            Assert.assertTrue(childFiles?.contains(File(dir, "dir1/file1.txt")) ?: false)
            Assert.assertTrue(childFiles?.contains(File(dir, "dir1/dir1/file1.txt")) ?: false)
            Assert.assertTrue(childFiles?.contains(File(dir, "dir1/dir2/file1.txt")) ?: false)
            Assert.assertTrue(childFiles?.contains(File(dir, "dir1/dir3/file1.txt")) ?: false)
            Assert.assertTrue(childFiles?.contains(File(dir, "dir2")) ?: false)
            Assert.assertTrue(childFiles?.contains(File(dir, "dir2/dir1/file1.txt")) ?: false)
            Assert.assertTrue(childFiles?.contains(File(dir, "dir2/dir2/file1.txt")) ?: false)
            Assert.assertTrue(childFiles?.contains(File(dir, "dir2/dir3/file1.txt")) ?: false)
            Assert.assertTrue(childFiles?.contains(File(dir, "dir3")) ?: false)
            Assert.assertTrue(childFiles?.contains(File(dir, "dir3/dir1/file1.txt")) ?: false)
            Assert.assertTrue(childFiles?.contains(File(dir, "dir3/dir2/file1.txt")) ?: false)
            Assert.assertTrue(childFiles?.contains(File(dir, "dir3/dir3/file1.txt")) ?: false)

            Assert.assertEquals((dir.listFilesRecursively { pathname -> pathname.isFile }?.size
                    ?: 0).toLong(), 39)
            Assert.assertEquals((dir.listFilesRecursively { dir2, name -> File(dir2, name).isDirectory }?.size
                    ?: 0).toLong(), 12)
        } finally {
            dir.deleteRecursively()
        }

        // is file
        val file = File("/tmp/testListRecursively.file").createNewFileOrThrow()
        try {
            Assert.assertNull(file.listRecursively())
            Assert.assertNull(file.listFilesRecursively())
        } finally {
            file.deleteRecursively()
        }

        // not exists
        val fileNotExists = File("/tmp/testListRecursively.not_exists.file")
        try {
            Assert.assertNull(fileNotExists.listRecursively())
            Assert.assertNull(fileNotExists.listFilesRecursively())
        } finally {
            fileNotExists.deleteRecursively()
        }
    }

    @Test
    @Throws(UnableCreateFileException::class, UnableCreateDirException::class)
    fun testListCount() {
        val dir = File("/tmp/testListCount").createFileTree(3, 3, "file.txt", "testListCount")

        try {
            Assert.assertEquals(dir.listCount(), 6)
            Assert.assertEquals(dir.listCount { pathname -> pathname.isFile }, 3)
            Assert.assertEquals(dir.listCount { dir2, name -> File(dir2, name).isDirectory }, 3)
        } finally {
            dir.deleteRecursively()
        }

        // is file
        val file = File("/tmp/testListCount.file").createNewFileOrThrow()
        try {
            Assert.assertEquals(file.listCount(), 0)
        } finally {
            file.deleteRecursively()
        }

        // not exists
        val fileNotExists = File("/tmp/testListCount.not_exists.file")
        try {
            Assert.assertEquals(fileNotExists.listCount(), 0)
        } finally {
            fileNotExists.deleteRecursively()
        }
    }

    @Test
    @Throws(UnableCreateFileException::class, UnableCreateDirException::class)
    fun testListCountRecursively() {
        val dir = File("/tmp/testListCountRecursively").createFileTree(3, 3, "file.txt", "testListCountRecursively")

        try {
            Assert.assertEquals(dir.listCountRecursively(), 51)
            Assert.assertEquals(dir.listCountRecursively { pathname -> pathname.isFile }, 39)
            Assert.assertEquals(dir.listCountRecursively { dir2, name -> File(dir2, name).isDirectory }, 12)
        } finally {
            dir.deleteRecursively()
        }

        // is file
        val file = File("/tmp/testListCountRecursively.file").createNewFileOrThrow()
        try {
            Assert.assertEquals(file.listCountRecursively(), 0)
        } finally {
            file.deleteRecursively()
        }

        // not exists
        val fileNotExists = File("/tmp/testListCountRecursively.not_exists.file")
        try {
            Assert.assertEquals(fileNotExists.listCountRecursively(), 0)
        } finally {
            fileNotExists.deleteRecursively()
        }
    }

    @Test
    fun testAllExtension() {
        Assert.assertEquals("txt", File("/tmp/testExtension.txt").allExtension)
        Assert.assertEquals("txt.zip", File("/tmp/testExtension.txt.zip").allExtension)
        Assert.assertEquals("", File("/tmp/testExtension").allExtension)
        Assert.assertEquals("txt", File("/tmp/.txt").allExtension)
    }

    @Test
    fun testNameWithoutAllExtension() {
        Assert.assertEquals("testExtension", File("/tmp/testExtension.txt").nameWithoutAllExtension)
        Assert.assertEquals("testExtension", File("/tmp/testExtension.txt.zip").nameWithoutAllExtension)
        Assert.assertEquals("testExtension", File("/tmp/testExtension").nameWithoutAllExtension)
        Assert.assertEquals("", File("/tmp/.txt").nameWithoutAllExtension)
    }

    @Test
    fun testCreateFileTree() {
        val dir = File("/tmp/testCreateFileTree")
        try {
            dir.createFileTree(3, 3, "file.txt", "testCreateFileTree")
            Assert.assertEquals(dir.listCountRecursively(), 51)
            Assert.assertEquals(dir.listCountRecursively { pathname -> pathname.isFile }, 39)
            Assert.assertEquals(dir.listCountRecursively { dir2, name -> File(dir2, name).isDirectory }, 12)
        } finally {
            dir.deleteRecursively()
        }
    }

    @Test
    fun testCompareFilePath() {
        Assert.assertEquals(File("/a/b/c").compareFilePath(File("/a/b")), 1)
        Assert.assertEquals(File("/a/c").compareFilePath(File("/a/b")), 1)
        Assert.assertEquals(File("/a/b").compareFilePath(null), 1)

        Assert.assertEquals(File("/a/b").compareFilePath(File("/a/b/c")), -1)
        Assert.assertEquals(File("/a/b").compareFilePath(File("/a/c")), -1)
        Assert.assertEquals(null.compareFilePath(File("/a/b")), -1)

        Assert.assertEquals(File("").compareFilePath(File("")), 0)
        Assert.assertEquals(File("/a/b").compareFilePath(File("/a/b")), 0)
        Assert.assertEquals((null as File?).compareFilePath(null as File?), 0)

        Assert.assertEquals("/a/b/c".compareFilePath("/a/b"), 1)
        Assert.assertEquals("/a/c".compareFilePath("/a/b"), 1)
        Assert.assertEquals("/a/b".compareFilePath(null), 1)

        Assert.assertEquals("/a/b".compareFilePath("/a/b/c"), -1)
        Assert.assertEquals("/a/b".compareFilePath("/a/c"), -1)
        Assert.assertEquals(null.compareFilePath("/a/b"), -1)

        Assert.assertEquals("".compareFilePath(""), 0)
        Assert.assertEquals("/a/b".compareFilePath("/a/b"), 0)
        Assert.assertEquals((null as String?).compareFilePath(null as String?), 0)
    }

    @Test
    fun testExistOrAddNumber() {
        val dir = File("/tmp/testExistOrAddNumber")
        try {
            Assert.assertEquals(File(dir, "test/file.txt").path, File(dir, "test/file.txt").existOrAddNumber().path)

            File(dir, "test/file.txt").createNewFileOrThrow()
            Assert.assertEquals(File(dir, "test/file1.txt").path, File(dir, "test/file.txt").existOrAddNumber().path)

            File(dir, "test/file1.txt").createNewFileOrThrow()
            Assert.assertEquals(File(dir, "test/file2.txt").path, File(dir, "test/file.txt").existOrAddNumber().path)


            Assert.assertEquals(File(dir, "test/dir").path, File(dir, "test/dir").existOrAddNumber().path)

            File(dir, "test/dir").createNewFileOrThrow()
            Assert.assertEquals(File(dir, "test/dir1").path, File(dir, "test/dir").existOrAddNumber().path)

            File(dir, "test/dir1").createNewFileOrThrow()
            Assert.assertEquals(File(dir, "test/dir2").path, File(dir, "test/dir").existOrAddNumber(10).path)
        } finally {
            dir.deleteRecursively()
        }
    }

    @Test
    fun testComponents() {
        var file = File("/tmp/testRoot")
        var components = file.toComponents()
        Assert.assertTrue(components.isRooted)
        Assert.assertEquals(components.rootName, "/")
        Assert.assertEquals(components.root.path, "/")
        Assert.assertEquals(components.size, 2)
        Assert.assertEquals(components.segments.joinToArrayString(), "[tmp, testRoot]")

        file = File("tmp/testRoot/file")
        components = file.toComponents()
        Assert.assertFalse(components.isRooted)
        Assert.assertEquals(components.rootName, "")
        Assert.assertEquals(components.root.path, "")
        Assert.assertEquals(components.size, 3)
        Assert.assertEquals(components.segments.joinToArrayString(), "[tmp, testRoot, file]")
    }

    @Test
    fun testSubPath() {
        Assert.assertEquals(File("/tmp/testSubPath").subPath(1, 2).path, "testSubPath")

        try {
            File("/tmp/testSubPath").subPath(-1, 2)
            Assert.fail()
        } catch (e: Exception) {
        }

        try {
            File("/tmp/testSubPath").subPath(3, 2)
            Assert.fail()
        } catch (e: Exception) {
        }

        try {
            File("/tmp/testSubPath").subPath(1, 3)
            Assert.fail()
        } catch (e: Exception) {
        }
    }

    @Test
    fun testInputStream() {
        val file = File("/tmp/testInputStream.txt")
        file.writeText("testInputStream")
        try {
            file.bufferedInputStream(1024 * 4).closeQuietly()
            file.bufferedInputStream().closeQuietly()
        } finally {
            file.deleteRecursively()
        }
    }

    @Test
    fun testOutputStream() {
        val file = File("/tmp/testOutputStream.txt")
        file.writeText("testOutputStream")
        try {
            file.bufferedOutputStream(1024 * 4).closeQuietly()
            file.bufferedOutputStream().closeQuietly()
        } finally {
            file.deleteRecursively()
        }
    }
}