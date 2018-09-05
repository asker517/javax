package me.panpf.javaxkt.test.lang

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
}