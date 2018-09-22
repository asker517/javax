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
    fun testRequire() {
        require(true, "is true")

        try {
            require(false, "is false")
            Assert.fail()
        } catch (e: Exception) {
            // // e.printStackTrace();;
        }
    }

    @Test
    fun testRequireNotNull() {
        requireNotNull("", "is not null")

        try {
            requireNotNull(null, "is null")
            @Suppress("UNREACHABLE_CODE")
            Assert.fail()
        } catch (e: Exception) {
            // // e.printStackTrace();;
        }
    }

    @Test
    fun testCheck() {
        check(true, "is true")

        try {
            check(false, "is false")
            Assert.fail()
        } catch (e: Exception) {
            // // e.printStackTrace();;
        }
    }

    @Test
    fun testCheckNotNull() {
        checkNotNull("", "is not null")

        try {
            checkNotNull(null, "is null")
            @Suppress("UNREACHABLE_CODE")
            Assert.fail()
        } catch (e: Exception) {
            // // e.printStackTrace();;
        }
    }

    @Test
    fun testRequireSafe() {
        "fas".requireSafe { "value" }

        try {
            "".requireSafe { "empty" }
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
        "".requireNotSafe { "value" }

        try {
            "fas".requireNotSafe { "empty" }
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
}
