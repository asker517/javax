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

import me.panpf.javaxkt.io.*
import org.junit.Assert
import org.junit.Test
import java.io.File
import java.io.FileNotFoundException

class FileTest {

    @Test
    fun testRequireExist() {
        val testFile = File("/tmp/testRequireExist")
        testFile.delete()

        Assert.assertFalse(try {
            testFile.requireExist()
            true
        } catch (e: FileNotFoundException) {
            false
        })

        testFile.createNewFileCheck()

        Assert.assertTrue(try {
            testFile.requireExist()
            true
        } catch (e: FileNotFoundException) {
            false
        })

        testFile.delete()
    }

    @Test
    fun testRequireIsDir() {
        val testDir = File("/tmp/testRequireIsDir")

        // 不存在时
        testDir.deleteRecursively()
        Assert.assertFalse(try {
            testDir.requireIsDir()
            true
        } catch (e: IllegalArgumentException) {
            false
        })

        // 文件
        testDir.createNewFileCheck()
        Assert.assertFalse(try {
            testDir.requireIsDir()
            true
        } catch (e: IllegalArgumentException) {
            false
        })

        // 目录
        testDir.deleteRecursively()
        testDir.mkdirsCheck()
        Assert.assertTrue(try {
            testDir.requireIsDir()
            true
        } catch (e: IllegalArgumentException) {
            false
        })

        testDir.deleteRecursively()
    }

    @Test
    fun testRequireIsFile() {
        val testFile = File("/tmp/testRequireIsFile")

        // 不存在时
        testFile.deleteRecursively()
        Assert.assertFalse(try {
            testFile.requireIsFile()
            true
        } catch (e: IllegalArgumentException) {
            false
        })

        // 目录
        testFile.mkdirsCheck()
        Assert.assertFalse(try {
            testFile.requireIsFile()
            true
        } catch (e: IllegalArgumentException) {
            false
        })

        // 文件
        testFile.deleteRecursively()
        testFile.createNewFileCheck()
        Assert.assertTrue(try {
            testFile.requireIsFile()
            true
        } catch (e: IllegalArgumentException) {
            false
        })

        testFile.deleteRecursively()
    }

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
}