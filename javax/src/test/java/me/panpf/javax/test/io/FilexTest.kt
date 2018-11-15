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

package me.panpf.javax.test.io

import me.panpf.javax.io.*
import me.panpf.javax.lang.Charx
import me.panpf.javax.security.Digestx
import me.panpf.javax.collections.Arrayx
import me.panpf.javax.collections.Collectionx
import org.junit.Assert
import org.junit.Test
import java.io.File
import java.io.IOException
import java.util.*

class FilexTest {

    @Test
    @Throws(UnableCreateFileException::class, UnableCreateDirException::class)
    fun testCreateNewFile() {
        val dir = File("/tmp/testCreateNewFile1")
        try {
            val file1 = File(dir, "test1.txt")
            Assert.assertFalse(file1.exists())
            Assert.assertTrue(Filex.createNewFileOrThrow(file1).exists())
            Assert.assertTrue(Filex.createNewFileOrThrow(file1).exists())
        } finally {
            Filex.deleteRecursively(dir)
        }

        val dir2 = File("/tmp/testCreateNewFile2")
        try {
            val file2 = File(dir2, "test2.txt")
            Assert.assertFalse(file2.exists())
            Assert.assertTrue(Filex.createNewFileOrCheck(file2))
            Assert.assertTrue(Filex.createNewFileOrCheck(file2))
        } finally {
            Filex.deleteRecursively(dir2)
        }
    }

    @Test
    @Throws(UnableCreateDirException::class)
    fun tesMkdirsDir() {
        val dir1 = File("/tmp/tesMkdirsDir")
        try {
            Assert.assertFalse(dir1.exists())
            Assert.assertTrue(Filex.mkdirsOrThrow(dir1).exists())
            Assert.assertTrue(Filex.mkdirsOrThrow(dir1).exists())
        } finally {
            Filex.deleteRecursively(dir1)
        }

        val dir2 = File("/tmp/tesMkdirsDir2")
        try {
            Assert.assertFalse(dir2.exists())
            Assert.assertTrue(Filex.mkdirsOrCheck(dir2))
            Assert.assertTrue(Filex.mkdirsOrCheck(dir2))
        } finally {
            Filex.deleteRecursively(dir2)
        }
    }

    @Test
    @Throws(UnableCreateFileException::class, UnableCreateDirException::class)
    fun testClean() {
        /*
         * clean
         */
        val dir = Filex.createFileTree(File("/tmp/testClean"), 3, 3, "file.txt", "testClean")
        try {
            Assert.assertTrue(dir.exists())
            Assert.assertEquals(Arrayx.count(dir.listFiles()), 6)
            Filex.clean(dir)
            Assert.assertTrue(dir.exists())
            Assert.assertEquals(Arrayx.count(dir.listFiles()), 3)
        } finally {
            Filex.deleteRecursively(dir)
        }

        // is File
        val file = Filex.createNewFileOrThrow(File("/tmp/testClean.file"))
        try {
            Assert.assertTrue(Filex.clean(file))
        } finally {
            Filex.deleteRecursively(file)
        }

        // not exists
        val fileNotExists = File("/tmp/testClean.not_exists.file")
        try {
            Assert.assertTrue(Filex.clean(fileNotExists))
        } finally {
            Filex.deleteRecursively(fileNotExists)
        }
    }

    @Test
    @Throws(UnableCreateFileException::class, UnableCreateDirException::class)
    fun testCleanRecursively() {
        val dir = Filex.createFileTree(File("/tmp/testCleanRecursively"), 3, 3, "file.txt", "testCleanRecursively")
        try {
            Assert.assertTrue(dir.exists())
            Assert.assertEquals(Filex.listCountRecursively(dir), 51)
            Filex.cleanRecursively(dir)
            Assert.assertTrue(dir.exists())
            Assert.assertEquals(Filex.listCountRecursively(dir), 0)
        } finally {
            Filex.deleteRecursively(dir)
        }

        // is File
        val file = Filex.createNewFileOrThrow(File("/tmp/testCleanRecursively.file"))
        try {
            Assert.assertTrue(Filex.cleanRecursively(file))
        } finally {
            Filex.deleteRecursively(file)
        }

        // not exists
        val fileNotExists = File("/tmp/testCleanRecursively.not_exists.file")
        try {
            Assert.assertTrue(Filex.cleanRecursively(fileNotExists))
        } finally {
            Filex.deleteRecursively(fileNotExists)
        }
    }

    @Test
    @Throws(IOException::class)
    fun testLengthRecursively() {
        val dir = File("/tmp/testLengthRecursively")
        try {
            val childFile1 = File(dir, "test1.txt")
            Filex.createNewFileOrThrow(childFile1)
            Filex.writeText(childFile1, "111")
            Assert.assertEquals(childFile1.length(), 3)

            val childFile2 = File(dir, "test2.txt")
            Filex.createNewFileOrThrow(childFile2)
            Filex.writeText(childFile2, "111")
            Assert.assertEquals(childFile2.length(), 3)

            Assert.assertEquals(Filex.lengthRecursively(dir), 6)
            Assert.assertEquals(Filex.lengthRecursively(Arrayx.arrayOf(dir)), 6)
            Assert.assertEquals(Filex.lengthRecursively(Collectionx.listOf(dir)), 6)
        } finally {
            Filex.deleteRecursively(dir)
        }
    }

    @Test
    @Throws(UnableCreateFileException::class, UnableCreateDirException::class)
    fun testListRecursively() {
        val dir = Filex.createFileTree(File("/tmp/testListRecursively"), 3, 3, "file.txt", "testListRecursively")

        try {
            val childPaths = Filex.listRecursively(dir)
            Assert.assertEquals(Arrayx.count(childPaths), 51)
            Assert.assertTrue(Arrayx.contains(childPaths, "file1.txt"))
            Assert.assertTrue(Arrayx.contains(childPaths, "dir1"))
            Assert.assertTrue(Arrayx.contains(childPaths, "dir1/file1.txt"))
            Assert.assertTrue(Arrayx.contains(childPaths, "dir1/dir1/file1.txt"))
            Assert.assertTrue(Arrayx.contains(childPaths, "dir1/dir2/file1.txt"))
            Assert.assertTrue(Arrayx.contains(childPaths, "dir1/dir3/file1.txt"))
            Assert.assertTrue(Arrayx.contains(childPaths, "dir2"))
            Assert.assertTrue(Arrayx.contains(childPaths, "dir2/dir1/file1.txt"))
            Assert.assertTrue(Arrayx.contains(childPaths, "dir2/dir2/file1.txt"))
            Assert.assertTrue(Arrayx.contains(childPaths, "dir2/dir3/file1.txt"))
            Assert.assertTrue(Arrayx.contains(childPaths, "dir3"))
            Assert.assertTrue(Arrayx.contains(childPaths, "dir3/dir1/file1.txt"))
            Assert.assertTrue(Arrayx.contains(childPaths, "dir3/dir2/file1.txt"))
            Assert.assertTrue(Arrayx.contains(childPaths, "dir3/dir3/file1.txt"))

            Assert.assertEquals((Filex.listRecursively(dir) { pathname -> pathname.isFile }?.size ?: 0).toLong(), 39)
            Assert.assertEquals((Filex.listRecursively(dir) { dir2, name -> File(dir2, name).isDirectory }?.size
                    ?: 0).toLong(), 12)

            val childFiles = Filex.listFilesRecursively(dir)
            Assert.assertEquals(Arrayx.count(childFiles), 51)
            Assert.assertTrue(Arrayx.contains(childFiles, File(dir, "file1.txt")))
            Assert.assertTrue(Arrayx.contains(childFiles, File(dir, "dir1")))
            Assert.assertTrue(Arrayx.contains(childFiles, File(dir, "dir1/file1.txt")))
            Assert.assertTrue(Arrayx.contains(childFiles, File(dir, "dir1/dir1/file1.txt")))
            Assert.assertTrue(Arrayx.contains(childFiles, File(dir, "dir1/dir2/file1.txt")))
            Assert.assertTrue(Arrayx.contains(childFiles, File(dir, "dir1/dir3/file1.txt")))
            Assert.assertTrue(Arrayx.contains(childFiles, File(dir, "dir2")))
            Assert.assertTrue(Arrayx.contains(childFiles, File(dir, "dir2/dir1/file1.txt")))
            Assert.assertTrue(Arrayx.contains(childFiles, File(dir, "dir2/dir2/file1.txt")))
            Assert.assertTrue(Arrayx.contains(childFiles, File(dir, "dir2/dir3/file1.txt")))
            Assert.assertTrue(Arrayx.contains(childFiles, File(dir, "dir3")))
            Assert.assertTrue(Arrayx.contains(childFiles, File(dir, "dir3/dir1/file1.txt")))
            Assert.assertTrue(Arrayx.contains(childFiles, File(dir, "dir3/dir2/file1.txt")))
            Assert.assertTrue(Arrayx.contains(childFiles, File(dir, "dir3/dir3/file1.txt")))

            Assert.assertEquals((Filex.listFilesRecursively(dir) { pathname -> pathname.isFile }?.size
                    ?: 0).toLong(), 39)
            Assert.assertEquals((Filex.listFilesRecursively(dir) { dir2, name -> File(dir2, name).isDirectory }?.size
                    ?: 0).toLong(), 12)
        } finally {
            Filex.deleteRecursively(dir)
        }

        // is file
        val file = Filex.createNewFileOrThrow(File("/tmp/testListRecursively.file"))
        try {
            Assert.assertNull(Filex.listRecursively(file))
            Assert.assertNull(Filex.listFilesRecursively(file))
        } finally {
            Filex.deleteRecursively(file)
        }

        // not exists
        val fileNotExists = File("/tmp/testListRecursively.not_exists.file")
        try {
            Assert.assertNull(Filex.listRecursively(fileNotExists))
            Assert.assertNull(Filex.listFilesRecursively(fileNotExists))
        } finally {
            Filex.deleteRecursively(fileNotExists)
        }
    }

    @Test
    @Throws(UnableCreateFileException::class, UnableCreateDirException::class)
    fun testListCount() {
        val dir = Filex.createFileTree(File("/tmp/testListCount"), 3, 3, "file.txt", "testListCount")

        try {
            Assert.assertEquals(Filex.listCount(dir), 6)
            Assert.assertEquals(Filex.listCount(dir) { pathname -> pathname.isFile }, 3)
            Assert.assertEquals(Filex.listCount(dir) { dir2, name -> File(dir2, name).isDirectory }, 3)
        } finally {
            Filex.deleteRecursively(dir)
        }

        // is file
        val file = Filex.createNewFileOrThrow(File("/tmp/testListCount.file"))
        try {
            Assert.assertEquals(Filex.listCount(file), 0)
        } finally {
            Filex.deleteRecursively(file)
        }

        // not exists
        val fileNotExists = File("/tmp/testListCount.not_exists.file")
        try {
            Assert.assertEquals(Filex.listCount(fileNotExists), 0)
        } finally {
            Filex.deleteRecursively(fileNotExists)
        }
    }

    @Test
    @Throws(UnableCreateFileException::class, UnableCreateDirException::class)
    fun testListCountRecursively() {
        val dir = Filex.createFileTree(File("/tmp/testListCountRecursively"), 3, 3, "file.txt", "testListCountRecursively")

        try {
            Assert.assertEquals(Filex.listCountRecursively(dir), 51)
            Assert.assertEquals(Filex.listCountRecursively(dir) { pathname -> pathname.isFile }, 39)
            Assert.assertEquals(Filex.listCountRecursively(dir) { dir2, name -> File(dir2, name).isDirectory }, 12)
        } finally {
            Filex.deleteRecursively(dir)
        }

        // is file
        val file = Filex.createNewFileOrThrow(File("/tmp/testListCountRecursively.file"))
        try {
            Assert.assertEquals(Filex.listCountRecursively(file), 0)
        } finally {
            Filex.deleteRecursively(file)
        }

        // not exists
        val fileNotExists = File("/tmp/testListCountRecursively.not_exists.file")
        try {
            Assert.assertEquals(Filex.listCountRecursively(fileNotExists), 0)
        } finally {
            Filex.deleteRecursively(fileNotExists)
        }
    }

    @Test
    fun testAllExtension() {
        Assert.assertEquals("txt", Filex.getAllExtension(File("/tmp/testExtension.txt")))
        Assert.assertEquals("txt.zip", Filex.getAllExtension(File("/tmp/testExtension.txt.zip")))
        Assert.assertEquals("", Filex.getAllExtension(File("/tmp/testExtension")))
        Assert.assertEquals("txt", Filex.getAllExtension(File("/tmp/.txt")))
    }

    @Test
    fun testNameWithoutAllExtension() {
        Assert.assertEquals("testExtension", Filex.getNameWithoutAllExtension(File("/tmp/testExtension.txt")))
        Assert.assertEquals("testExtension", Filex.getNameWithoutAllExtension(File("/tmp/testExtension.txt.zip")))
        Assert.assertEquals("testExtension", Filex.getNameWithoutAllExtension(File("/tmp/testExtension")))
        Assert.assertEquals("", Filex.getNameWithoutAllExtension(File("/tmp/.txt")))
    }

    @Test
    fun testCreateFileTree() {
        val dir = File("/tmp/testCreateFileTree")
        try {
            Filex.createFileTree(dir, 3, 3, "file.txt", "testCreateFileTree")
            Assert.assertEquals(Filex.listCountRecursively(dir), 51)
            Assert.assertEquals(Filex.listCountRecursively(dir) { pathname -> pathname.isFile }, 39)
            Assert.assertEquals(Filex.listCountRecursively(dir) { dir2, name -> File(dir2, name).isDirectory }, 12)
        } finally {
            Filex.deleteRecursively(dir)
        }
    }

    @Test
    fun testCompareFilePath() {
        Assert.assertEquals(Filex.compareFilePath(File("/a/b/c"), File("/a/b")), 1)
        Assert.assertEquals(Filex.compareFilePath(File("/a/c"), File("/a/b")), 1)
        Assert.assertEquals(Filex.compareFilePath(File("/a/b"), null), 1)

        Assert.assertEquals(Filex.compareFilePath(File("/a/b"), File("/a/b/c")), -1)
        Assert.assertEquals(Filex.compareFilePath(File("/a/b"), File("/a/c")), -1)
        Assert.assertEquals(Filex.compareFilePath(null, File("/a/b")), -1)

        Assert.assertEquals(Filex.compareFilePath(File(""), File("")), 0)
        Assert.assertEquals(Filex.compareFilePath(File("/a/b"), File("/a/b")), 0)
        Assert.assertEquals(Filex.compareFilePath(null as File?, null as File?), 0)

        Assert.assertEquals(Filex.compareFilePath("/a/b/c", "/a/b"), 1)
        Assert.assertEquals(Filex.compareFilePath("/a/c", "/a/b"), 1)
        Assert.assertEquals(Filex.compareFilePath("/a/b", null), 1)

        Assert.assertEquals(Filex.compareFilePath("/a/b", "/a/b/c"), -1)
        Assert.assertEquals(Filex.compareFilePath("/a/b", "/a/c"), -1)
        Assert.assertEquals(Filex.compareFilePath(null, "/a/b"), -1)

        Assert.assertEquals(Filex.compareFilePath("", ""), 0)
        Assert.assertEquals(Filex.compareFilePath("/a/b", "/a/b"), 0)
        Assert.assertEquals(Filex.compareFilePath(null as String?, null as String?), 0)
    }

    @Test
    fun testExistOrAddNumber() {
        val dir = File("/tmp/testExistOrAddNumber")
        try {
            Assert.assertEquals(File(dir, "test/file.txt").path, Filex.existOrAddNumber(File(dir, "test/file.txt")).path)

            Filex.createNewFileOrThrow(File(dir, "test/file.txt"))
            Assert.assertEquals(File(dir, "test/file1.txt").path, Filex.existOrAddNumber(File(dir, "test/file.txt")).path)

            Filex.createNewFileOrThrow(File(dir, "test/file1.txt"))
            Assert.assertEquals(File(dir, "test/file2.txt").path, Filex.existOrAddNumber(File(dir, "test/file.txt")).path)


            Assert.assertEquals(File(dir, "test/dir").path, Filex.existOrAddNumber(File(dir, "test/dir")).path)

            Filex.createNewFileOrThrow(File(dir, "test/dir"))
            Assert.assertEquals(File(dir, "test/dir1").path, Filex.existOrAddNumber(File(dir, "test/dir")).path)

            Filex.createNewFileOrThrow(File(dir, "test/dir1"))
            Assert.assertEquals(File(dir, "test/dir2").path, Filex.existOrAddNumber(File(dir, "test/dir"), 10).path)
        } finally {
            Filex.deleteRecursively(dir)
        }
    }


    /*
     * *****************************************************************************************************************
     * From kotlin standard library
     * *****************************************************************************************************************
     */


    @Test
    @Throws(IOException::class)
    fun testCopyTo() {
        /*
         * test copy file
         */
        val copySourceFile = File("/tmp/testCopyFile.txt")
        val copyTargetFile = File(copySourceFile.path + "_copyTarget")
        try {
            Filex.writeText(Filex.createNewFileOrThrow(copySourceFile), "testCopyFile")

            // 覆盖
            Filex.copyTo(copySourceFile, copyTargetFile, true)
            Assert.assertEquals(Digestx.getMD5(copySourceFile), Digestx.getMD5(copyTargetFile))

            // 不覆盖
            try {
                Filex.copyTo(copySourceFile, copyTargetFile, 1024 * 4)
                Assert.fail()
            } catch (ignored: IOException) {
            }
        } finally {
            Filex.deleteRecursively(copySourceFile)
            Filex.deleteRecursively(copyTargetFile)
        }

        try {
            Filex.writeText(Filex.createNewFileOrThrow(copySourceFile), "testCopyFile")
            Filex.copyTo(copySourceFile, copyTargetFile, 1024 * 4)
            Assert.assertEquals(Digestx.getMD5(copySourceFile), Digestx.getMD5(copyTargetFile))
        } finally {
            Filex.deleteRecursively(copySourceFile)
            Filex.deleteRecursively(copyTargetFile)
        }

        try {
            Filex.writeText(Filex.createNewFileOrThrow(copySourceFile), "testCopyFile")
            Filex.copyTo(copySourceFile, copyTargetFile)
            Assert.assertEquals(Digestx.getMD5(copySourceFile), Digestx.getMD5(copyTargetFile))
        } finally {
            Filex.deleteRecursively(copySourceFile)
            Filex.deleteRecursively(copyTargetFile)
        }

        /*
         * test copy dir
         */
        val copySourceDir = Filex.createFileTree(File("/tmp/testCopyDir"), 3, 3, "file.txt", "testCopyDir")
        val copyTargetDir = File(copySourceDir.path + "_copyTarget")
        try {
            Filex.deleteRecursively(copyTargetDir)

            Filex.copyTo(copySourceDir, copyTargetDir, true)

            Assert.assertTrue(copyTargetDir.exists())
            Assert.assertEquals(Arrayx.count(copyTargetDir.listFiles()).toLong(), 0)
        } finally {
            Filex.deleteRecursively(copySourceDir)
            Filex.deleteRecursively(copyTargetDir)
        }

        /*
         * test source file not exist
         */
        try {
            Filex.copyTo(File("/tmp/testCopyFile111.txt"), File("/tmp/testCopyFile111_copyTarget.txt"))
            Assert.fail()
        } catch (ignored: IOException) {
        }
    }

    @Test
    @Throws(IOException::class)
    fun testCopyRecursively() {
        val copySourceDir = Filex.createFileTree(File("/tmp/testCopyRecursively"), 3, 3, "file.txt", "testCopyRecursively")
        val copyTargetDir = File(copySourceDir.path + "_copyTarget")
        val copyTargetDirKotlin = File(copySourceDir.path + "_copyTarget_kotlin")
        try {
            Filex.deleteRecursively(copyTargetDir)
            Filex.copyRecursively(copySourceDir, copyTargetDir)
            // test overwrite is false
            try {
                Filex.copyRecursively(copySourceDir, copyTargetDir)
                Assert.fail()
            } catch (e: FileAlreadyExistsException) {
            }
            // test onError
            try {
                Filex.copyRecursively(copySourceDir, copyTargetDir) { _, e -> throw IllegalArgumentException(e) }
                Assert.fail()
            } catch (e: IllegalArgumentException) {
            }
            Filex.copyRecursively(copySourceDir, copyTargetDir, true)
            Assert.assertTrue(copyTargetDir.exists())
            Assert.assertEquals(Filex.listCountRecursively(copyTargetDir).toLong(), Filex.listCountRecursively(copySourceDir).toLong())
            Assert.assertEquals(Filex.lengthRecursively(copyTargetDir), Filex.lengthRecursively(copySourceDir))

            Filex.deleteRecursively(copyTargetDirKotlin)
            copySourceDir.copyRecursively(copyTargetDirKotlin)
            Assert.assertTrue(copyTargetDirKotlin.exists())
            Assert.assertEquals(Filex.listCountRecursively(copyTargetDirKotlin).toLong(), Filex.listCountRecursively(copySourceDir).toLong())
            Assert.assertEquals(Filex.lengthRecursively(copyTargetDirKotlin), Filex.lengthRecursively(copySourceDir))
        } finally {
            Filex.deleteRecursively(copyTargetDir)
            Filex.deleteRecursively(copyTargetDirKotlin)
        }

        try {
            Filex.deleteRecursively(copyTargetDir)
            Filex.copyRecursively(copySourceDir, copyTargetDir) { _, e -> throw IllegalArgumentException(e) }

            Assert.assertTrue(copyTargetDir.exists())
            Assert.assertEquals(Filex.listCountRecursively(copyTargetDir).toLong(), Filex.listCountRecursively(copySourceDir).toLong())
            Assert.assertEquals(Filex.lengthRecursively(copyTargetDir), Filex.lengthRecursively(copySourceDir))

            Filex.deleteRecursively(copyTargetDirKotlin)
            copySourceDir.copyRecursively(copyTargetDirKotlin)
            Assert.assertTrue(copyTargetDirKotlin.exists())
            Assert.assertEquals(Filex.listCountRecursively(copyTargetDirKotlin).toLong(), Filex.listCountRecursively(copySourceDir).toLong())
            Assert.assertEquals(Filex.lengthRecursively(copyTargetDirKotlin), Filex.lengthRecursively(copySourceDir))
        } finally {
            Filex.deleteRecursively(copySourceDir)
            Filex.deleteRecursively(copyTargetDir)
            Filex.deleteRecursively(copyTargetDirKotlin)
        }

        /*
         * test source file not exist
         */
        try {
            Filex.copyRecursively(File("/tmp/testCopyFile111.txt"), File("/tmp/testCopyFile111_copyTarget.txt"))
            Assert.fail()
        } catch (ignored: IOException) {
        }
    }

    @Test
    @Throws(UnableCreateFileException::class, UnableCreateDirException::class)
    fun testDeleteRecursively() {
        val dir = Filex.createFileTree(File("/tmp/testDeleteRecursively"), 3, 3, "file.txt", "testDeleteRecursively")
        try {
            Assert.assertTrue(dir.exists())
            Assert.assertTrue(Filex.deleteRecursively(dir))
            Assert.assertFalse(dir.exists())
        } finally {
            Filex.deleteRecursively(dir)
        }

        // is File
        val file = Filex.createNewFileOrThrow(File("/tmp/testDeleteRecursively.file"))
        try {
            Assert.assertTrue(file.exists())
            Assert.assertTrue(Filex.deleteRecursively(file))
            Assert.assertFalse(file.exists())
        } finally {
            Filex.deleteRecursively(file)
        }

        // not exists
        val fileNotExists = File("/tmp/testCleanRecursively.not_exists.file")
        try {
            Assert.assertFalse(file.exists())
            Assert.assertTrue(Filex.deleteRecursively(fileNotExists))
        } finally {
            Filex.deleteRecursively(fileNotExists)
        }
    }

    @Test
    fun testStartsWith() {
        var selfFile = File("/tmp/testStartsWith/file")
        var otherFile = File("/tmp/testStartsWith")
        Assert.assertTrue(Filex.startsWith(selfFile, otherFile))
        Assert.assertEquals(Filex.startsWith(selfFile, otherFile), selfFile.startsWith(otherFile))

        selfFile = File("/tmp/testStartsWith")
        otherFile = File("/tmp/testStartsWith/dir")
        Assert.assertFalse(Filex.startsWith(selfFile, otherFile))
        Assert.assertEquals(Filex.startsWith(selfFile, otherFile), selfFile.startsWith(otherFile))

        selfFile = File("/tmp/testStartsWith/file")
        var otherFilePath = "/tmp2/testStartsWith/dir"
        Assert.assertFalse(Filex.startsWith(selfFile, otherFilePath))
        Assert.assertEquals(Filex.startsWith(selfFile, otherFilePath), selfFile.startsWith(otherFilePath))

        selfFile = File("/tmp/testStartsWith/file")
        otherFilePath = "testStartsWith/dir"
        Assert.assertFalse(Filex.startsWith(selfFile, otherFilePath))
        Assert.assertEquals(Filex.startsWith(selfFile, otherFilePath), selfFile.startsWith(otherFilePath))
    }

    @Test
    fun testEndsWith() {
        var selfFile = File("/tmp/testEndsWith/file")
        var otherFile = File("/tmp/testEndsWith/file")
        Assert.assertTrue(Filex.endsWith(selfFile, otherFile))
        Assert.assertEquals(Filex.endsWith(selfFile, otherFile), selfFile.endsWith(otherFile))

        selfFile = File("tmp/testEndsWith")
        otherFile = File("tmp/testEndsWith/dir")
        Assert.assertFalse(Filex.endsWith(selfFile, otherFile))
        Assert.assertEquals(Filex.endsWith(selfFile, otherFile), selfFile.endsWith(otherFile))

        selfFile = File("tmp/testEndsWith/file")
        val otherFilePath = "tmp2/testEndsWith/dir"
        Assert.assertFalse(Filex.endsWith(selfFile, otherFilePath))
        Assert.assertEquals(Filex.endsWith(selfFile, otherFile), selfFile.endsWith(otherFilePath))
    }

    @Test
    fun testNormalize() {
        var sourceFile = File("/foo/./bar/gav/../baaz")
        Assert.assertEquals(Filex.normalize(sourceFile).path, "/foo/bar/baaz")
        Assert.assertEquals(Filex.normalize(sourceFile).path, sourceFile.normalize().path)

        sourceFile = File("/foo/bar/gav/baaz")
        Assert.assertEquals(Filex.normalize(sourceFile).path, "/foo/bar/gav/baaz")
        Assert.assertEquals(Filex.normalize(sourceFile).path, sourceFile.normalize().path)
    }

    @Test
    fun testResolve() {
        var sourceFile = File("/tmp/testResolve")
        var relativeFile = File("image")
        Assert.assertEquals(Filex.resolve(sourceFile, relativeFile).path, "/tmp/testResolve/image")
        Assert.assertEquals(Filex.resolve(sourceFile, relativeFile).path, sourceFile.resolve(relativeFile).path)

        sourceFile = File("/tmp/testResolve/")
        relativeFile = File("image")
        Assert.assertEquals(Filex.resolve(sourceFile, relativeFile).path, "/tmp/testResolve/image")
        Assert.assertEquals(Filex.resolve(sourceFile, relativeFile).path, sourceFile.resolve(relativeFile).path)

        sourceFile = File("/tmp/testResolve/image")
        var relativeFilePath = "/tmp/testResolve"
        Assert.assertEquals(Filex.resolve(sourceFile, relativeFilePath).path, "/tmp/testResolve")
        Assert.assertEquals(Filex.resolve(sourceFile, relativeFilePath).path, sourceFile.resolve(relativeFilePath).path)

        sourceFile = File("/tmp/testResolve/")
        relativeFilePath = "/tmp/testResolve/file"
        Assert.assertEquals(Filex.resolve(sourceFile, relativeFilePath).path, "/tmp/testResolve/file")
        Assert.assertEquals(Filex.resolve(sourceFile, relativeFilePath).path, sourceFile.resolve(relativeFilePath).path)
    }

    @Test
    fun testResolveSibling() {
        var sourceFile = File("/tmp/testResolveSibling")
        var relativeFile = File("image")
        Assert.assertEquals(Filex.resolveSibling(sourceFile, relativeFile).path, "/tmp/image")
        Assert.assertEquals(Filex.resolveSibling(sourceFile, relativeFile).path, sourceFile.resolveSibling(relativeFile).path)

        sourceFile = File("/tmp/testResolveSibling/")
        relativeFile = File("image")
        Assert.assertEquals(Filex.resolveSibling(sourceFile, relativeFile).path, "/tmp/image")
        Assert.assertEquals(Filex.resolveSibling(sourceFile, relativeFile).path, sourceFile.resolveSibling(relativeFile).path)

        sourceFile = File("/tmp/testResolveSibling/image")
        var relativeFilePath = "/tmp/testResolveSibling"
        Assert.assertEquals(Filex.resolveSibling(sourceFile, relativeFilePath).path, "/tmp/testResolveSibling")
        Assert.assertEquals(Filex.resolveSibling(sourceFile, relativeFilePath).path, sourceFile.resolveSibling(relativeFilePath).path)

        sourceFile = File("/tmp/testResolveSibling/")
        relativeFilePath = "/tmp/testResolveSibling/file"
        Assert.assertEquals(Filex.resolveSibling(sourceFile, relativeFilePath).path, "/tmp/testResolveSibling/file")
        Assert.assertEquals(Filex.resolveSibling(sourceFile, relativeFilePath).path, sourceFile.resolveSibling(relativeFilePath).path)
    }

    @Test
    fun testCreateTempDir() {
        var dir = Filex.createTempDir("tmp", "testCreateTempDir")
        try {
            Assert.assertTrue(dir.exists())
            Assert.assertTrue(dir.isDirectory)
            Assert.assertTrue(dir.name.startsWith("tmp"))
            Assert.assertTrue(dir.name.endsWith("testCreateTempDir"))
        } finally {
            Filex.deleteRecursively(dir)
        }

        dir = Filex.createTempDir("tmp", "testCreateTempDir", Filex.mkdirsOrThrow(File("/tmp/testCreateTempDir")))
        try {
            Assert.assertTrue(dir.exists())
            Assert.assertTrue(dir.isDirectory)
            Assert.assertTrue(dir.name.startsWith("tmp"))
            Assert.assertTrue(dir.name.endsWith("testCreateTempDir"))
            Assert.assertEquals(dir.parent, "/tmp/testCreateTempDir")
        } finally {
            Filex.deleteRecursively(dir.parentFile)
        }

        dir = Filex.createTempDir(Filex.mkdirsOrThrow(File("/tmp/testCreateTempDir2")))
        try {
            Assert.assertTrue(dir.exists())
            Assert.assertTrue(dir.isDirectory)
            Assert.assertTrue(dir.name.startsWith("tmp"))
            Assert.assertEquals(dir.parent, "/tmp/testCreateTempDir2")
        } finally {
            Filex.deleteRecursively(dir.parentFile)
        }

        dir = Filex.createTempDir()
        try {
            Assert.assertTrue(dir.exists())
            Assert.assertTrue(dir.isDirectory)
            Assert.assertTrue(dir.name.startsWith("tmp"))
        } finally {
            Filex.deleteRecursively(dir)
        }
    }

    @Test
    fun testCreateTempFile() {
        var file = Filex.createTempFile("tmp", "testCreateTempFile")
        try {
            Assert.assertTrue(file.exists())
            Assert.assertTrue(file.isFile)
            Assert.assertTrue(file.name.startsWith("tmp"))
            Assert.assertTrue(file.name.endsWith("testCreateTempFile"))
        } finally {
            Filex.deleteRecursively(file)
        }

        file = Filex.createTempFile("tmp", "testCreateTempFile", Filex.mkdirsOrThrow(File("/tmp/testCreateTempFile")))
        try {
            Assert.assertTrue(file.exists())
            Assert.assertTrue(file.isFile)
            Assert.assertTrue(file.name.startsWith("tmp"))
            Assert.assertTrue(file.name.endsWith("testCreateTempFile"))
            Assert.assertEquals(file.parent, "/tmp/testCreateTempFile")
        } finally {
            Filex.deleteRecursively(file.parentFile)
        }

        file = Filex.createTempFile(Filex.mkdirsOrThrow(File("/tmp/testCreateTempFile2")))
        try {
            Assert.assertTrue(file.exists())
            Assert.assertTrue(file.isFile)
            Assert.assertTrue(file.name.startsWith("tmp"))
            Assert.assertEquals(file.parent, "/tmp/testCreateTempFile2")
        } finally {
            Filex.deleteRecursively(file.parentFile)
        }

        file = Filex.createTempFile()
        try {
            Assert.assertTrue(file.exists())
            Assert.assertTrue(file.isFile)
            Assert.assertTrue(file.name.startsWith("tmp"))
        } finally {
            Filex.deleteRecursively(file)
        }
    }

    @Test
    fun testExtension() {
        var file = File("/tmp/testExtension.txt")
        Assert.assertEquals(Filex.getExtension(file), "txt")
        Assert.assertEquals(Filex.getExtension(file), file.extension)

        file = File("/tmp/testExtension.txt.zip")
        Assert.assertEquals(Filex.getExtension(file), "zip")
        Assert.assertEquals(Filex.getExtension(file), file.extension)

        file = File("/tmp/testExtension")
        Assert.assertEquals(Filex.getExtension(file), "")
        Assert.assertEquals(Filex.getExtension(file), file.extension)

        file = File("/tmp/.txt")
        Assert.assertEquals(Filex.getExtension(file), "txt")
        Assert.assertEquals(Filex.getExtension(file), file.extension)
    }

    @Test
    fun testNameWithoutExtension() {
        var file = File("/tmp/testExtension.txt")
        Assert.assertEquals(Filex.getNameWithoutExtension(file), "testExtension")
        Assert.assertEquals(Filex.getNameWithoutExtension(file), file.nameWithoutExtension)

        file = File("/tmp/testExtension.txt.zip")
        Assert.assertEquals(Filex.getNameWithoutExtension(file), "testExtension.txt")
        Assert.assertEquals(Filex.getNameWithoutExtension(file), file.nameWithoutExtension)

        file = File("/tmp/testExtension")
        Assert.assertEquals(Filex.getNameWithoutExtension(file), "testExtension")
        Assert.assertEquals(Filex.getNameWithoutExtension(file), file.nameWithoutExtension)

        file = File("/tmp/.txt")
        Assert.assertEquals(Filex.getNameWithoutExtension(file), "")
        Assert.assertEquals(Filex.getNameWithoutExtension(file), file.nameWithoutExtension)
    }

    @Test
    fun testRelative() {
        val baseDir = File("/tmp/testRelative")

        var childDir = File("/tmp/testRelative")
        Assert.assertEquals(Filex.toRelativeString(childDir, baseDir), "")
        Assert.assertEquals(Filex.toRelativeString(childDir, baseDir), childDir.toRelativeString(baseDir))

        childDir = File("/tmp/testRelative/new")
        Assert.assertEquals(Filex.toRelativeString(childDir, baseDir), "new")
        Assert.assertEquals(Filex.toRelativeString(childDir, baseDir), childDir.toRelativeString(baseDir))

        Assert.assertEquals(Filex.relativeTo(baseDir, childDir).path, "..")
        Assert.assertEquals(Filex.relativeTo(baseDir, childDir).path, baseDir.relativeTo(childDir).path)

        childDir = File("/tmp/testRelative/new/dir")
        Assert.assertEquals(Filex.relativeTo(childDir, baseDir).path, "new/dir")
        Assert.assertEquals(Filex.relativeTo(childDir, baseDir).path, childDir.relativeTo(baseDir).path)

        Assert.assertEquals(Filex.relativeTo(baseDir, childDir).path, "../..")
        Assert.assertEquals(Filex.relativeTo(baseDir, childDir).path, baseDir.relativeTo(childDir).path)

        childDir = File("../testRelative")
        Assert.assertEquals(Filex.relativeToOrSelf(childDir, baseDir).path, childDir.path)
        Assert.assertEquals(Filex.relativeToOrSelf(childDir, baseDir).path, childDir.relativeToOrSelf(baseDir).path)

        childDir = File("../testRelative")
        Assert.assertNull(Filex.relativeToOrNull(childDir, baseDir))
        Assert.assertEquals(Filex.relativeToOrNull(childDir, baseDir), childDir.relativeToOrNull(baseDir))
    }

    @Test
    fun testRoot() {
        Assert.assertTrue(Filex.isRooted(File("/tmp/testRoot")))
        Assert.assertFalse(Filex.isRooted(File("tmp/testRoot")))
    }

    @Test
    fun testComponents() {
        var file = File("/tmp/testRoot")
        var components = Filex.toComponents(file)
        Assert.assertTrue(components.isRooted)
        Assert.assertEquals(components.rootName, "/")
        Assert.assertEquals(components.root.path, "/")
        Assert.assertEquals(components.size, 2)
        Assert.assertEquals(Collectionx.joinToArrayString(components.segments), "[tmp, testRoot]")

        file = File("tmp/testRoot/file")
        components = Filex.toComponents(file)
        Assert.assertFalse(components.isRooted)
        Assert.assertEquals(components.rootName, "")
        Assert.assertEquals(components.root.path, "")
        Assert.assertEquals(components.size, 3)
        Assert.assertEquals(Collectionx.joinToArrayString(components.segments), "[tmp, testRoot, file]")
    }

    @Test
    fun testGetInvariantSeparatorsPath() {
        Assert.assertEquals(Filex.getInvariantSeparatorsPath(File("/tmp/testGetInvariantSeparatorsPath")), "/tmp/testGetInvariantSeparatorsPath")
    }

    @Test
    fun testSubPath() {
        Assert.assertEquals(Filex.subPath(File("/tmp/testSubPath"), 1, 2).path, "testSubPath")

        try {
            Filex.subPath(File("/tmp/testSubPath"), -1, 2)
            Assert.fail()
        } catch (e: Exception) {
        }

        try {
            Filex.subPath(File("/tmp/testSubPath"), 3, 2)
            Assert.fail()
        } catch (e: Exception) {
        }

        try {
            Filex.subPath(File("/tmp/testSubPath"), 1, 3)
            Assert.fail()
        } catch (e: Exception) {
        }
    }

    @Test
    fun testInputStream() {
        val file = File("/tmp/testInputStream.txt")
        Filex.writeText(file, "testInputStream")
        try {
            Streamx.closeQuietly(Filex.inputStream(file))
            Streamx.closeQuietly(Filex.bufferedInputStream(file, 1024 * 4))
            Streamx.closeQuietly(Filex.bufferedInputStream(file))
            Streamx.closeQuietly(Filex.reader(file, Charx.UTF_8))
            Streamx.closeQuietly(Filex.reader(file))
            Streamx.closeQuietly(Filex.bufferedReader(file, Charx.UTF_8, 1024 * 4))
            Streamx.closeQuietly(Filex.bufferedReader(file, 1024 * 4))
            Streamx.closeQuietly(Filex.bufferedReader(file, Charx.UTF_8))
            Streamx.closeQuietly(Filex.bufferedReader(file))
        } finally {
            Filex.deleteRecursively(file)
        }
    }

    @Test
    fun testRead() {
        val file = File("/tmp/testRead.txt")
        val content = "abcdefg\nhijklmn\nopqrst\nuvwxyz"
        Filex.writeText(file, content)
        try {
            Assert.assertEquals(String(Filex.readBytes(file)), content)
            Assert.assertEquals(Filex.readText(file, Charx.UTF_8), content)
            Assert.assertEquals(Filex.readText(file), content)
            Assert.assertEquals(Collectionx.joinToArrayString(Filex.readLines(file, Charx.UTF_8)), "[" + content.replace("\n", ", ") + "]")
            Assert.assertEquals(Collectionx.joinToArrayString(Filex.readLines(file)), "[" + content.replace("\n", ", ") + "]")
        } finally {
            Filex.deleteRecursively(file)
        }
    }

    @Test
    fun testLines() {
        val file = File("/tmp/testLines.txt")
        val content = "abcdefg\nhijklmn\nopqrst\nuvwxyz"
        Filex.writeText(file, content)
        try {
            Assert.assertEquals(StringBuilder().apply {
                Filex.useLines(file, Charx.UTF_8) { sequence ->
                    sequence.forEach { lineString ->
                        if (length > 0) append("\n")
                        append(lineString)
                    }
                }
            }.toString(), content)

            Assert.assertEquals(StringBuilder().apply {
                Filex.useLines(file) { sequence ->
                    sequence.forEach { lineString ->
                        if (length > 0) append("\n")
                        append(lineString)
                    }
                }
            }.toString(), content)

            Assert.assertEquals(StringBuilder().apply {
                Filex.forEachBlock(file, Streamx.DEFAULT_BLOCK_SIZE) { data, size ->
                    append(String(data, 0, size))
                }
            }.toString(), content)

            Assert.assertEquals(StringBuilder().apply {
                Filex.forEachBlock(file) { data, size ->
                    append(String(data, 0, size))
                }
            }.toString(), content)

            Assert.assertEquals(StringBuilder().apply {
                Filex.forEachLine(file, Charx.UTF_8) { lineString ->
                    if (length > 0) append("\n")
                    append(lineString)
                }
            }.toString(), content)

            Assert.assertEquals(StringBuilder().apply {
                Filex.forEachLine(file) { lineString ->
                    if (length > 0) append("\n")
                    append(lineString)
                }
            }.toString(), content)
        } finally {
            Filex.deleteRecursively(file)
        }
    }

    @Test
    fun testOutputStream() {
        val file = File("/tmp/testOutputStream.txt")
        Filex.writeText(file, "testOutputStream")
        try {
            Streamx.closeQuietly(Filex.outputStream(file))
            Streamx.closeQuietly(Filex.bufferedOutputStream(file, 1024 * 4))
            Streamx.closeQuietly(Filex.bufferedOutputStream(file))
            Streamx.closeQuietly(Filex.writer(file, Charx.UTF_8))
            Streamx.closeQuietly(Filex.writer(file))
            Streamx.closeQuietly(Filex.bufferedWriter(file, Charx.UTF_8, 1024 * 4 * 4))
            Streamx.closeQuietly(Filex.bufferedWriter(file, 1024 * 4 * 4))
            Streamx.closeQuietly(Filex.bufferedWriter(file, Charx.UTF_8))
            Streamx.closeQuietly(Filex.bufferedWriter(file))
            Streamx.closeQuietly(Filex.printWriter(file, Charx.UTF_8))
            Streamx.closeQuietly(Filex.printWriter(file))
        } finally {
            Filex.deleteRecursively(file)
        }
    }

    @Test
    fun testWrite() {
        val file = File("/tmp/testWrite.txt")
        try {
            val content = "abcdefg\nhijklmn\nopqrst\nuvwxyz"

            Filex.writeBytes(file, (content + "1").toByteArray())
            Assert.assertEquals(Filex.readText(file), content + "1")

            Filex.appendBytes(file, (content + "2").toByteArray())
            Assert.assertEquals(Filex.readText(file), content + "1" + content + "2")

            Filex.writeText(file, content + "3", Charx.UTF_8)
            Assert.assertEquals(Filex.readText(file), content + "3")

            Filex.writeText(file, content + "4")
            Assert.assertEquals(Filex.readText(file), content + "4")

            Filex.appendText(file, content + "5", Charx.UTF_8)
            Assert.assertEquals(Filex.readText(file), content + "4" + content + "5")

            Filex.appendText(file, content + "6")
            Assert.assertEquals(Filex.readText(file), content + "4" + content + "5" + content + "6")
        } finally {
            Filex.deleteRecursively(file)
        }
    }

    @Test
    @Throws(IOException::class)
    fun testWalk() {
        val sourceDir = Filex.createFileTree(File("/tmp/testWalk"), 3, 3, "file.txt", "testWalk")
        try {
            Assert.assertEquals(Collectionx.joinToArrayString(LinkedList<String>().apply {
                for (file in Filex.walk(sourceDir, FileWalkDirection.BOTTOM_UP)) {
                    add(file.path)
                }
            }), Collectionx.joinToArrayString(LinkedList<String>().apply {
                for (file in sourceDir.walk(kotlin.io.FileWalkDirection.BOTTOM_UP)) {
                    add(file.path)
                }
            }))

            Assert.assertEquals(Collectionx.joinToArrayString(LinkedList<String>().apply {
                for (file in Filex.walk(sourceDir)) {
                    add(file.path)
                }
            }), Collectionx.joinToArrayString(LinkedList<String>().apply {
                for (file in sourceDir.walk()) {
                    add(file.path)
                }
            }))

            Assert.assertEquals(Collectionx.joinToArrayString(LinkedList<String>().apply {
                for (file in Filex.walkTopDown(sourceDir)) {
                    add(file.path)
                }
            }), Collectionx.joinToArrayString(LinkedList<String>().apply {
                for (file in sourceDir.walkTopDown()) {
                    add(file.path)
                }
            }))

            Assert.assertEquals(Collectionx.joinToArrayString(LinkedList<String>().apply {
                for (file in Filex.walkBottomUp(sourceDir)) {
                    add(file.path)
                }
            }), Collectionx.joinToArrayString(LinkedList<String>().apply {
                for (file in sourceDir.walkBottomUp()) {
                    add(file.path)
                }
            }))
        } finally {
            Filex.deleteRecursively(sourceDir)
        }
    }
}