package me.panpf.javaxkt.test.util

import me.panpf.javaxkt.util.checkInRange
import me.panpf.javaxkt.util.checkNotInRange
import org.junit.Assert
import org.junit.Test

class PremiseTest {

    @Test
    fun testInRange() {
        2.toByte().checkInRange(0.toByte(), 5.toByte())
        try {
            6.toByte().checkInRange(0.toByte(), 5.toByte())
            Assert.fail()
        } catch (ignored: Exception) {
        }

        2.toShort().checkInRange(0.toShort(), 5.toShort())
        try {
            6.toShort().checkInRange(0.toShort(), 5.toShort())
            Assert.fail()
        } catch (ignored: Exception) {
        }

        2.checkInRange(0, 5)
        try {
            6.checkInRange(0, 5)
            Assert.fail()
        } catch (ignored: Exception) {
        }

        2L.checkInRange(0L, 5L)
        try {
            6L.checkInRange(0L, 5L)
            Assert.fail()
        } catch (ignored: Exception) {
        }

        2f.checkInRange(0f, 5f)
        try {
            6f.checkInRange(0f, 5f)
            Assert.fail()
        } catch (ignored: Exception) {
        }

        2.0.checkInRange(0.0, 5.0)
        try {
            6.0.checkInRange(0.0, 5.0)
            Assert.fail()
        } catch (ignored: Exception) {
        }

    }

    @Test
    fun testNotInRange() {
        6.toByte().checkNotInRange(0.toByte(), 5.toByte())
        try {
            2.toByte().checkNotInRange(0.toByte(), 5.toByte())
            Assert.fail()
        } catch (ignored: Exception) {
        }

        6.toShort().checkNotInRange(0.toShort(), 5.toShort())
        try {
            2.toShort().checkNotInRange(0.toShort(), 5.toShort())
            Assert.fail()
        } catch (ignored: Exception) {
        }

        6.checkNotInRange(0, 5)
        try {
            2.checkNotInRange(0, 5)
            Assert.fail()
        } catch (ignored: Exception) {
        }

        6L.checkNotInRange(0L, 5L)
        try {
            2L.checkNotInRange(0L, 5L)
            Assert.fail()
        } catch (ignored: Exception) {
        }

        6f.checkNotInRange(0f, 5f)
        try {
            2f.checkNotInRange(0f, 5f)
            Assert.fail()
        } catch (ignored: Exception) {
        }

        6.0.checkNotInRange(0.0, 5.0)
        try {
            2.0.checkNotInRange(0.0, 5.0)
            Assert.fail()
        } catch (ignored: Exception) {
        }

    }
}
