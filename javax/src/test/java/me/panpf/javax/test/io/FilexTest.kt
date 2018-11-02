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

import me.panpf.javax.io.FileAlreadyExistsException
import me.panpf.javax.io.Filex
import me.panpf.javax.io.OnError
import me.panpf.javax.io.UnableCreateDirException
import me.panpf.javax.io.UnableCreateFileException
import me.panpf.javax.security.Digestx
import me.panpf.javax.util.Arrayx
import me.panpf.javax.util.Collectionx
import org.junit.Assert
import org.junit.Test
import java.io.File
import java.io.IOException
import java.lang.IllegalArgumentException
import java.util.*

class FilexTest {

    @Throws(IOException::class)
    private fun createFileTree(dir: File, fileContent: String): File {
        Filex.deleteRecursively(dir)
        Filex.mkdirsOrThrow(dir)

        Filex.writeText(Filex.createNewFileOrThrow(File(dir, "file1.txt")), fileContent)
        Filex.writeText(Filex.createNewFileOrThrow(File(dir, "file2.txt")), fileContent)
        Filex.writeText(Filex.createNewFileOrThrow(File(dir, "file3.txt")), fileContent)

        Filex.writeText(Filex.createNewFileOrThrow(File(dir, "dir1/file1-1.txt")), fileContent)
        Filex.writeText(Filex.createNewFileOrThrow(File(dir, "dir1/file1-2.txt")), fileContent)
        Filex.writeText(Filex.createNewFileOrThrow(File(dir, "dir1/file1-3.txt")), fileContent)

        Filex.writeText(Filex.createNewFileOrThrow(File(dir, "dir1/dir1-1/file1-1-1.txt")), fileContent)
        Filex.writeText(Filex.createNewFileOrThrow(File(dir, "dir1/dir1-1/file1-1-2.txt")), fileContent)
        Filex.writeText(Filex.createNewFileOrThrow(File(dir, "dir1/dir1-1/file1-1-3.txt")), fileContent)

        Filex.writeText(Filex.createNewFileOrThrow(File(dir, "dir1/dir1-2/file1-2-1.txt")), fileContent)
        Filex.writeText(Filex.createNewFileOrThrow(File(dir, "dir1/dir1-2/file1-2-2.txt")), fileContent)
        Filex.writeText(Filex.createNewFileOrThrow(File(dir, "dir1/dir1-2/file1-2-3.txt")), fileContent)

        Filex.writeText(Filex.createNewFileOrThrow(File(dir, "dir1/dir1-3/file1-3-1.txt")), fileContent)
        Filex.writeText(Filex.createNewFileOrThrow(File(dir, "dir1/dir1-3/file1-3-2.txt")), fileContent)
        Filex.writeText(Filex.createNewFileOrThrow(File(dir, "dir1/dir1-3/file1-3-3.txt")), fileContent)

        Filex.writeText(Filex.createNewFileOrThrow(File(dir, "dir2/file2-1.txt")), fileContent)
        Filex.writeText(Filex.createNewFileOrThrow(File(dir, "dir2/file2-2.txt")), fileContent)
        Filex.writeText(Filex.createNewFileOrThrow(File(dir, "dir2/file2-3.txt")), fileContent)

        Filex.writeText(Filex.createNewFileOrThrow(File(dir, "dir2/dir2-1/file2-1-1.txt")), fileContent)
        Filex.writeText(Filex.createNewFileOrThrow(File(dir, "dir2/dir2-1/file2-1-2.txt")), fileContent)
        Filex.writeText(Filex.createNewFileOrThrow(File(dir, "dir2/dir2-1/file2-1-3.txt")), fileContent)

        Filex.writeText(Filex.createNewFileOrThrow(File(dir, "dir2/dir2-2/file2-2-1.txt")), fileContent)
        Filex.writeText(Filex.createNewFileOrThrow(File(dir, "dir2/dir2-2/file2-2-2.txt")), fileContent)
        Filex.writeText(Filex.createNewFileOrThrow(File(dir, "dir2/dir2-2/file2-2-3.txt")), fileContent)

        Filex.writeText(Filex.createNewFileOrThrow(File(dir, "dir2/dir2-3/file2-3-1.txt")), fileContent)
        Filex.writeText(Filex.createNewFileOrThrow(File(dir, "dir2/dir2-3/file2-3-2.txt")), fileContent)
        Filex.writeText(Filex.createNewFileOrThrow(File(dir, "dir2/dir2-3/file2-3-3.txt")), fileContent)

        Filex.writeText(Filex.createNewFileOrThrow(File(dir, "dir3/file3-1.txt")), fileContent)
        Filex.writeText(Filex.createNewFileOrThrow(File(dir, "dir3/file3-2.txt")), fileContent)
        Filex.writeText(Filex.createNewFileOrThrow(File(dir, "dir3/file3-3.txt")), fileContent)

        Filex.writeText(Filex.createNewFileOrThrow(File(dir, "dir3/dir3-1/file3-1-1.txt")), fileContent)
        Filex.writeText(Filex.createNewFileOrThrow(File(dir, "dir3/dir3-1/file3-1-2.txt")), fileContent)
        Filex.writeText(Filex.createNewFileOrThrow(File(dir, "dir3/dir3-1/file3-1-3.txt")), fileContent)

        Filex.writeText(Filex.createNewFileOrThrow(File(dir, "dir3/dir3-2/file3-2-1.txt")), fileContent)
        Filex.writeText(Filex.createNewFileOrThrow(File(dir, "dir3/dir3-2/file3-2-2.txt")), fileContent)
        Filex.writeText(Filex.createNewFileOrThrow(File(dir, "dir3/dir3-2/file3-2-3.txt")), fileContent)

        Filex.writeText(Filex.createNewFileOrThrow(File(dir, "dir3/dir3-3/file3-3-1.txt")), fileContent)
        Filex.writeText(Filex.createNewFileOrThrow(File(dir, "dir3/dir3-3/file3-3-2.txt")), fileContent)
        Filex.writeText(Filex.createNewFileOrThrow(File(dir, "dir3/dir3-3/file3-3-3.txt")), fileContent)

        return dir
    }

    @Test
    @Throws(UnableCreateFileException::class, UnableCreateDirException::class)
    fun testCleanDir() {
        val dir = File("/tmp/javaxCleanDirTest")
        val testFile1 = File(dir, "test1.txt")
        val testFile2 = File(dir, "test2.txt")

        Assert.assertFalse(testFile1.exists())
        Filex.createNewFileOrThrow(testFile1)
        Assert.assertTrue(testFile1.exists())

        Assert.assertFalse(testFile2.exists())
        Filex.createNewFileCheck(testFile2)
        Assert.assertTrue(testFile2.exists())

        Filex.cleanDir(dir)
        Assert.assertEquals(Arrayx.count(dir.listFiles()).toLong(), 0)

        Filex.deleteRecursively(dir)
        Assert.assertFalse(dir.exists())
    }

    @Test
    @Throws(UnableCreateFileException::class, UnableCreateDirException::class)
    fun testCreateNewFile() {
        val dir = File("/tmp/javaxCreateNewFileTest")
        val testFile1 = File(dir, "test1.txt")
        val testFile2 = File(dir, "test2.txt")

        Assert.assertFalse(testFile1.exists())
        Filex.createNewFileOrThrow(testFile1)
        Assert.assertTrue(testFile1.exists())

        Assert.assertFalse(testFile2.exists())
        Filex.createNewFileCheck(testFile2)
        Assert.assertTrue(testFile2.exists())

        Filex.deleteRecursively(dir)
        Assert.assertFalse(dir.exists())
    }

    @Test
    @Throws(UnableCreateDirException::class)
    fun testCreateDir() {
        val dir1 = File("/tmp/javaxCreateDirTest1")
        val dir2 = File("/tmp/javaxCreateDirTest2")

        Assert.assertFalse(dir1.exists())
        Filex.mkdirsOrThrow(dir1)
        Assert.assertTrue(dir1.exists())

        Assert.assertFalse(dir2.exists())
        Filex.mkdirsOrThrow(dir2)
        Assert.assertTrue(dir2.exists())

        Filex.deleteRecursively(dir1)
        Assert.assertFalse(dir1.exists())

        Filex.deleteRecursively(dir2)
        Assert.assertFalse(dir2.exists())
    }

    @Test
    fun testNameSuffix() {
        val file = File("/tmp/testNameSuffix.txt")
        Assert.assertEquals(Filex.getExtension(file), "txt")
    }

    @Test
    fun testSimpleName() {
        val file = File("/tmp/testSimpleName.txt")
        Assert.assertEquals(Filex.getNameWithoutExtension(file), "testSimpleName")
    }

    @Test
    @Throws(IOException::class)
    fun testLengthWithDir() {
        val dir = File("/tmp/testLengthWithDir")

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

        Filex.deleteRecursively(dir)
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

        Filex.createNewFileOrThrow(testFile11)
        Filex.createNewFileOrThrow(testFile12)
        Filex.createNewFileOrThrow(testFile13)
        Filex.createNewFileOrThrow(testFile21)
        Filex.createNewFileOrThrow(testFile22)
        Filex.createNewFileOrThrow(testFile23)
        Filex.createNewFileOrThrow(testFile31)
        Filex.createNewFileOrThrow(testFile32)
        Filex.createNewFileOrThrow(testFile33)
        Filex.createNewFileOrThrow(testFile4)
        Filex.createNewFileOrThrow(testFile5)
        Filex.createNewFileOrThrow(testFile6)

        val childPaths = Filex.listRecursively(testDir)
        Assert.assertEquals((childPaths?.size ?: 0).toLong(), 15)

        val childFiles = Filex.listFilesRecursively(testDir)
        Assert.assertEquals((childFiles?.size ?: 0).toLong(), 15)

        val childFiles2 = Filex.listFilesRecursively(testDir) { pathname -> pathname.isFile }
        Assert.assertEquals((childFiles2?.size ?: 0).toLong(), 12)

        val childFiles3 = Filex.listFilesRecursively(testDir) { dir, name -> dir.isFile && name.endsWith("2") }
        Assert.assertEquals((childFiles3?.size ?: 0).toLong(), 3)

        Filex.deleteRecursively(testDir)
    }

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

        /*
         * test copy dir
         */
        val copySourceDir = createFileTree(File("/tmp/testCopyDir"), "testCopyDir")
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
        val copySourceDir = createFileTree(File("/tmp/testCopyRecursively"), "testCopyRecursively")
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
                Filex.copyRecursively(copySourceDir, copyTargetDir) { _, e ->  throw IllegalArgumentException(e)}
                Assert.fail()
            } catch (e: IllegalArgumentException) {
            }
            Filex.copyRecursively(copySourceDir, copyTargetDir, true)
            Assert.assertTrue(copyTargetDir.exists())
            Assert.assertEquals(Arrayx.count(Filex.listFilesRecursively(copyTargetDir)).toLong(), Arrayx.count(Filex.listFilesRecursively(copySourceDir)).toLong())
            Assert.assertEquals(Filex.lengthRecursively(copyTargetDir), Filex.lengthRecursively(copySourceDir))

            Filex.deleteRecursively(copyTargetDirKotlin)
            copySourceDir.copyRecursively(copyTargetDirKotlin)
            Assert.assertTrue(copyTargetDirKotlin.exists())
            Assert.assertEquals(Arrayx.count(Filex.listFilesRecursively(copyTargetDirKotlin)).toLong(), Arrayx.count(Filex.listFilesRecursively(copySourceDir)).toLong())
            Assert.assertEquals(Filex.lengthRecursively(copyTargetDirKotlin), Filex.lengthRecursively(copySourceDir))
        } finally {
            Filex.deleteRecursively(copySourceDir)
            Filex.deleteRecursively(copyTargetDir)
            Filex.deleteRecursively(copyTargetDirKotlin)
        }
    }

    @Test
    fun testToRelativeStringOrNull() {
        val baseDir = File("/tmp/testCopyRecursively")

        var childDir = File("/tmp/testCopyRecursively")
        Assert.assertEquals(Filex.toRelativeString(childDir, baseDir), childDir.toRelativeString(baseDir)) // result: ""

        childDir = File("/tmp/testCopyRecursively/new")
        Assert.assertEquals(Filex.toRelativeString(childDir, baseDir), childDir.toRelativeString(baseDir)) // result: "new"
        Assert.assertEquals(Filex.toRelativeString(baseDir, childDir), baseDir.toRelativeString(childDir)) // result: ".."

        childDir = File("/tmp/testCopyRecursively/new/dir")
        Assert.assertEquals(Filex.toRelativeString(childDir, baseDir), childDir.toRelativeString(baseDir)) // result: "new/dir"
        Assert.assertEquals(Filex.toRelativeString(baseDir, childDir), baseDir.toRelativeString(childDir)) // result: "../.."
    }

    @Test
    @Throws(IOException::class)
    fun testWalkTopDown() {
        val sourceDir = createFileTree(File("/tmp/testWalkTopDown"), "testWalkTopDown")
        try {
            val pathList = LinkedList<String>()
            for (file in Filex.walkTopDown(sourceDir)) {
                pathList.add(file.path)
            }
            val pathListString = Collectionx.joinToArrayString(pathList)

            val pathListFromKotlin = LinkedList<String>()
            for (file in sourceDir.walkTopDown()) {
                pathListFromKotlin.add(file.path)
            }
            val pathListString2 = Collectionx.joinToArrayString(pathListFromKotlin)
            Assert.assertEquals(pathListString, pathListString2)
        } finally {
            Filex.deleteRecursively(sourceDir)
        }
    }
}