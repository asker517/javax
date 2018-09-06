package me.panpf.javaxkt.test.lang

import me.panpf.javaxkt.lang.downUntilTo
import me.panpf.javaxkt.lang.scale
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
}