package me.panpf.javaxkt.test.util

import me.panpf.javaxkt.io.createNewFileCheck
import me.panpf.javaxkt.io.mkdirsCheck
import me.panpf.javaxkt.util.*
import org.junit.Assert
import org.junit.Test
import java.io.File
import java.io.FileNotFoundException

class PremiseTest {

    @Test
    fun testRequireFileExist() {
        val testFile = File("/tmp/testRequireFileExist")
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
    fun testCheckInRange() {
        2.toByte().checkInRange(0.toByte(), 5.toByte())
        try {
            (-1).toByte().checkInRange(0.toByte(), 5.toByte())
            Assert.fail()
        } catch (ignored: Exception) {
        }
        try {
            6.toByte().checkInRange(0.toByte(), 5.toByte())
            Assert.fail()
        } catch (ignored: Exception) {
        }

        2.toShort().checkInRange(0.toShort(), 5.toShort())
        try {
            (-1).toShort().checkInRange(0.toShort(), 5.toShort())
            Assert.fail()
        } catch (ignored: Exception) {
        }
        try {
            6.toShort().checkInRange(0.toShort(), 5.toShort())
            Assert.fail()
        } catch (ignored: Exception) {
        }

        2.checkInRange(0, 5)
        try {
            (-1).checkInRange(0, 5)
            Assert.fail()
        } catch (ignored: Exception) {
        }
        try {
            6.checkInRange(0, 5)
            Assert.fail()
        } catch (ignored: Exception) {
        }

        2L.checkInRange(0L, 5L)
        try {
            (-1L).checkInRange(0L, 5L)
            Assert.fail()
        } catch (ignored: Exception) {
        }
        try {
            6L.checkInRange(0L, 5L)
            Assert.fail()
        } catch (ignored: Exception) {
        }

        2f.checkInRange(0f, 5f)
        try {
            (-1f).checkInRange(0f, 5f)
            Assert.fail()
        } catch (ignored: Exception) {
        }
        try {
            6f.checkInRange(0f, 5f)
            Assert.fail()
        } catch (ignored: Exception) {
        }

        2.0.checkInRange(0.0, 5.0)
        try {
            (-1.0).checkInRange(0.0, 5.0)
            Assert.fail()
        } catch (ignored: Exception) {
        }
        try {
            6.0.checkInRange(0.0, 5.0)
            Assert.fail()
        } catch (ignored: Exception) {
        }
    }

    @Test
    fun testCheckNotInRange() {
        6.toByte().checkNotInRange(0.toByte(), 5.toByte())
        (-1).toByte().checkNotInRange(0.toByte(), 5.toByte())
        try {
            2.toByte().checkNotInRange(0.toByte(), 5.toByte())
            Assert.fail()
        } catch (ignored: Exception) {
        }

        6.toShort().checkNotInRange(0.toShort(), 5.toShort())
        (-1).toShort().checkNotInRange(0.toShort(), 5.toShort())
        try {
            2.toShort().checkNotInRange(0.toShort(), 5.toShort())
            Assert.fail()
        } catch (ignored: Exception) {
        }

        6.checkNotInRange(0, 5)
        (-1).checkNotInRange(0, 5)
        try {
            2.checkNotInRange(0, 5)
            Assert.fail()
        } catch (ignored: Exception) {
        }

        6L.checkNotInRange(0L, 5L)
        (-1L).checkNotInRange(0L, 5L)
        try {
            2L.checkNotInRange(0L, 5L)
            Assert.fail()
        } catch (ignored: Exception) {
        }

        6f.checkNotInRange(0f, 5f)
        (-1f).checkNotInRange(0f, 5f)
        try {
            2f.checkNotInRange(0f, 5f)
            Assert.fail()
        } catch (ignored: Exception) {
        }

        6.0.checkNotInRange(0.0, 5.0)
        (-1.0).checkNotInRange(0.0, 5.0)
        try {
            2.0.checkNotInRange(0.0, 5.0)
            Assert.fail()
        } catch (ignored: Exception) {
        }
    }

    @Test
    fun testRequire() {
        require(true, "is true")

        try {
            require(false, "is false")
            Assert.fail()
        } catch (e: Exception) {
            e.printStackTrace()
        }
    }

    @Test
    fun testRequireNotNull() {
        requireNotNull("", "is not null")

        try {
            requireNotNull(null, "is null")
            Assert.fail()
        } catch (e: Exception) {
            e.printStackTrace()
        }
    }
}
