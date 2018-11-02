package me.panpf.javaxkt.test.util

import me.panpf.javaxkt.io.createNewFileOrCheck
import me.panpf.javaxkt.io.mkdirsOrCheck
import me.panpf.javaxkt.util.*
import org.junit.Assert
import org.junit.Test
import java.io.File
import java.io.FileNotFoundException

class PremisexTest {

    @Test
    fun testRequireFileExist() {
        val testFile = File("/tmp/testRequireFileExist")
        testFile.delete()

        Assert.assertFalse(try {
            testFile.requireFileExist()
            true
        } catch (e: FileNotFoundException) {
            false
        })

        testFile.createNewFileOrCheck()

        Assert.assertTrue(try {
            testFile.requireFileExist()
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
        testDir.createNewFileOrCheck()
        Assert.assertFalse(try {
            testDir.requireIsDir()
            true
        } catch (e: IllegalArgumentException) {
            false
        })

        // 目录
        testDir.deleteRecursively()
        testDir.mkdirsOrCheck()
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
        testFile.mkdirsOrCheck()
        Assert.assertFalse(try {
            testFile.requireIsFile()
            true
        } catch (e: IllegalArgumentException) {
            false
        })

        // 文件
        testFile.deleteRecursively()
        testFile.createNewFileOrCheck()
        Assert.assertTrue(try {
            testFile.requireIsFile()
            true
        } catch (e: IllegalArgumentException) {
            false
        })

        testFile.deleteRecursively()
    }

    @Test
    fun testRequireInRange() {
        2.toByte().requireInRange(0.toByte(), 5.toByte())
        try {
            (-1).toByte().requireInRange(0.toByte(), 5.toByte())
            Assert.fail()
        } catch (ignored: Exception) {
        }
        try {
            6.toByte().requireInRange(0.toByte(), 5.toByte())
            Assert.fail()
        } catch (ignored: Exception) {
        }

        2.toShort().requireInRange(0.toShort(), 5.toShort())
        try {
            (-1).toShort().requireInRange(0.toShort(), 5.toShort())
            Assert.fail()
        } catch (ignored: Exception) {
        }
        try {
            6.toShort().requireInRange(0.toShort(), 5.toShort())
            Assert.fail()
        } catch (ignored: Exception) {
        }

        2.requireInRange(0, 5)
        try {
            (-1).requireInRange(0, 5)
            Assert.fail()
        } catch (ignored: Exception) {
        }
        try {
            6.requireInRange(0, 5)
            Assert.fail()
        } catch (ignored: Exception) {
        }

        2L.requireInRange(0L, 5L)
        try {
            (-1L).requireInRange(0L, 5L)
            Assert.fail()
        } catch (ignored: Exception) {
        }
        try {
            6L.requireInRange(0L, 5L)
            Assert.fail()
        } catch (ignored: Exception) {
        }

        2f.requireInRange(0f, 5f)
        try {
            (-1f).requireInRange(0f, 5f)
            Assert.fail()
        } catch (ignored: Exception) {
        }
        try {
            6f.requireInRange(0f, 5f)
            Assert.fail()
        } catch (ignored: Exception) {
        }

        2.0.requireInRange(0.0, 5.0)
        try {
            (-1.0).requireInRange(0.0, 5.0)
            Assert.fail()
        } catch (ignored: Exception) {
        }
        try {
            6.0.requireInRange(0.0, 5.0)
            Assert.fail()
        } catch (ignored: Exception) {
        }
    }

    @Test
    fun testRequireNotInRange() {
        6.toByte().requireNotInRange(0.toByte(), 5.toByte())
        (-1).toByte().requireNotInRange(0.toByte(), 5.toByte())
        try {
            2.toByte().requireNotInRange(0.toByte(), 5.toByte())
            Assert.fail()
        } catch (ignored: Exception) {
        }

        6.toShort().requireNotInRange(0.toShort(), 5.toShort())
        (-1).toShort().requireNotInRange(0.toShort(), 5.toShort())
        try {
            2.toShort().requireNotInRange(0.toShort(), 5.toShort())
            Assert.fail()
        } catch (ignored: Exception) {
        }

        6.requireNotInRange(0, 5)
        (-1).requireNotInRange(0, 5)
        try {
            2.requireNotInRange(0, 5)
            Assert.fail()
        } catch (ignored: Exception) {
        }

        6L.requireNotInRange(0L, 5L)
        (-1L).requireNotInRange(0L, 5L)
        try {
            2L.requireNotInRange(0L, 5L)
            Assert.fail()
        } catch (ignored: Exception) {
        }

        6f.requireNotInRange(0f, 5f)
        (-1f).requireNotInRange(0f, 5f)
        try {
            2f.requireNotInRange(0f, 5f)
            Assert.fail()
        } catch (ignored: Exception) {
        }

        6.0.requireNotInRange(0.0, 5.0)
        (-1.0).requireNotInRange(0.0, 5.0)
        try {
            2.0.requireNotInRange(0.0, 5.0)
            Assert.fail()
        } catch (ignored: Exception) {
        }
    }

    @Test
    fun testRequireNotNull() {
        "".requireNotNull()
        "".requireNotNull("param")
        "".requireNotNull { "param is null" }

        try {
            null.requireNotNull("param")
            @Suppress("UNREACHABLE_CODE")
            Assert.fail()
        } catch (e: Exception) {
            // // e.printStackTrace();;
        }
    }

    @Test
    fun testCheckNotNull() {
        "".checkNotNull()
        "".checkNotNull("param")
        "".checkNotNull { "param is null" }

        try {
            null.checkNotNull("param")
            @Suppress("UNREACHABLE_CODE")
            Assert.fail()
        } catch (e: Exception) {
            // // e.printStackTrace();;
        }
    }

    @Test
    fun testRequireSafe() {
        "fas".requireSafe()

        try {
            "".requireSafe()
            Assert.fail()
        } catch (e: Exception) {
            // e.printStackTrace();
        }

        "fas".requireSafe()

        try {
            "".requireSafe()
            Assert.fail()
        } catch (e: Exception) {
            // e.printStackTrace();
        }

    }

    @Test
    fun testRequireNotSafe() {
        "".requireNotSafe()

        try {
            "fas".requireNotSafe()
            Assert.fail()
        } catch (e: Exception) {
            // // e.printStackTrace();
        }

        "".requireNotSafe()

        try {
            "fas".requireNotSafe()
            Assert.fail()
        } catch (e: Exception) {
            // e.printStackTrace();
        }
    }

    @Test
    fun testRequireNotZero() {
        1.toByte().requireNotZero()
        try {
            0.toByte().requireNotZero()
            Assert.fail()
        } catch (ignored: Exception) {
        }

        1.toShort().requireNotZero()
        try {
            0.toShort().requireNotZero()
            Assert.fail()
        } catch (ignored: Exception) {
        }

        1.requireNotZero()
        try {
            0.requireNotZero()
            Assert.fail()
        } catch (ignored: Exception) {
        }

        1L.requireNotZero()
        try {
            0L.requireNotZero()
            Assert.fail()
        } catch (ignored: Exception) {
        }

        1f.requireNotZero()
        try {
            0f.requireNotZero()
            Assert.fail()
        } catch (ignored: Exception) {
        }

        1.0.requireNotZero()
        try {
            0.0.requireNotZero()
            Assert.fail()
        } catch (ignored: Exception) {
        }
    }
}
