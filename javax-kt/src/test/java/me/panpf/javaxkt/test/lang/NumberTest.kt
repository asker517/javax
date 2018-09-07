package me.panpf.javaxkt.test.lang

import me.panpf.javaxkt.lang.*
import org.junit.Assert
import org.junit.Test
import java.math.RoundingMode

class NumberTest {

    @Test
    fun testScale() {
        Assert.assertEquals(0.2489.scale(2).toString(), 0.25f.toString())
        Assert.assertEquals(0.2449.scale(2).toString(), 0.24f.toString())

        Assert.assertEquals(0.2489.scale(2, RoundingMode.UP).toString(), 0.25f.toString())
        Assert.assertEquals(0.2449.scale(2, RoundingMode.UP).toString(), 0.25f.toString())

        Assert.assertEquals(0.2589f.scale(1).toString(), 0.3f.toString())
        Assert.assertEquals(0.2449f.scale(1).toString(), 0.2f.toString())

        Assert.assertEquals(0.2589f.scale(1, RoundingMode.UP).toString(), 0.3f.toString())
        Assert.assertEquals(0.2449f.scale(1, RoundingMode.UP).toString(), 0.3f.toString())

        Assert.assertEquals(0.2489.scale(0).toString(), 0f.toString())
        Assert.assertEquals(0.2449.scale(0).toString(), 0f.toString())
    }

    @Test
    fun testRange() {
        Assert.assertEquals((1..10).count().toLong(), 10)
        Assert.assertEquals((1..1).count().toLong(), 1)
        Assert.assertEquals((0..1).count().toLong(), 2)
        Assert.assertEquals((1..0).count().toLong(), 0)
    }

    @Test
    fun testUnit() {
        Assert.assertEquals((1 until 10).count().toLong(), 9)
        Assert.assertEquals((1 until 1).count().toLong(), 0)
        Assert.assertEquals((1 until 0).count().toLong(), 0)
        Assert.assertEquals((0 until 1).count().toLong(), 1)
    }

    @Test
    fun testDownTo() {
        Assert.assertEquals((10 downTo 1).count().toLong(), 10)
        Assert.assertEquals((1 downTo 1).count().toLong(), 1)
        Assert.assertEquals((0 downTo 1).count().toLong(), 0)
        Assert.assertEquals((1 downTo 0).count().toLong(), 2)
    }

    @Test
    fun testDownUntilTo() {
        Assert.assertEquals((10 downUntilTo 1).count().toLong(), 9)
        Assert.assertEquals((1 downUntilTo 1).count().toLong(), 0)
        Assert.assertEquals((0 downUntilTo 1).count().toLong(), 0)
        Assert.assertEquals((1 downUntilTo 0).count().toLong(), 1)
    }

    @Test
    fun testToByte() {
        Assert.assertEquals("5".toByteOrDefault(4.toByte()).toString(), 5.toString())
        Assert.assertEquals("g".toByteOrDefault(4.toByte()).toString(), 4.toString())
        Assert.assertEquals("g".toByteOrZero().toString(), 0.toString())
    }

    @Test
    fun testToShort() {
        Assert.assertEquals("5".toShortOrDefault(4.toShort()).toString(), 5.toString())
        Assert.assertEquals("g".toShortOrDefault(4.toShort()).toString(), 4.toString())
        Assert.assertEquals("g".toShortOrZero().toString(), 0.toString())
    }

    @Test
    fun testToInt() {
        Assert.assertEquals("5".toIntOrDefault(4).toString(), 5.toString())
        Assert.assertEquals("g".toIntOrDefault(4).toString(), 4.toString())
        Assert.assertEquals("g".toIntOrZero().toString(), 0.toString())
    }

    @Test
    fun testToLong() {
        Assert.assertEquals("5".toLongOrDefault(4).toString(), 5.toString())
        Assert.assertEquals("g".toLongOrDefault(4).toString(), 4.toString())
        Assert.assertEquals("g".toLongOrZero().toString(), 0.toString())
    }

    @Test
    fun testToFloat() {
        Assert.assertEquals("5.5".toFloatOrDefault(4.5f).toString(), 5.5f.toString())
        Assert.assertEquals("g".toFloatOrDefault(4.4f).toString(), 4.4f.toString())
        Assert.assertEquals("g".toFloatOrZero().toString(), 0.0f.toString())
    }

    @Test
    fun testToDouble() {
        Assert.assertEquals("5.5".toDoubleOrDefault(4.4).toString(), 5.5.toString())
        Assert.assertEquals("g".toDoubleOrDefault(4.4).toString(), 4.4.toString())
        Assert.assertEquals("g".toDoubleOrZero().toString(), 0.0.toString())
    }
}