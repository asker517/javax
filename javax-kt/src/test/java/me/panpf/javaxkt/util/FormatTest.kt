package me.panpf.javaxkt.util

import org.junit.Assert
import org.junit.Test

class FormatTest {

    @Test
    fun testPercent() {
        Assert.assertEquals(0.46.formatPercent(), "46%")
        Assert.assertEquals(3.formatPercentWith(8), "37.5%")
        Assert.assertEquals(3.formatPercentWith(8, 2, true), "37.50%")

        Assert.assertEquals(0.46.formatPercent(), "46%")
        Assert.assertEquals(3.0.formatPercentWith(8.0), "37.5%")
        Assert.assertEquals(3.0.formatPercentWith(8.0, 2, true), "37.50%")

        Assert.assertEquals(0.46f.formatPercent(), "46%")
        Assert.assertEquals(3f.formatPercentWith(8f), "37.5%")
        Assert.assertEquals(3f.formatPercentWith(8f, 2, true), "37.50%")

        Assert.assertEquals(3L.formatPercentWith(8L), "37.5%")
        Assert.assertEquals(3L.formatPercentWith(8L, 2, true), "37.50%")
    }

    @Test
    fun testFileSize() {
        Assert.assertEquals(0.formatFileSize(2, false), "0 B")
        Assert.assertEquals(800.formatFileSize(), "800 B")

        Assert.assertEquals(1024.formatFileSize(), "1 KB")
        Assert.assertEquals((800 + 1024).formatFileSize(), "1.78 KB")
        Assert.assertEquals((800 + 1024 * 500).formatFileSize(), "500.78 KB")

        Assert.assertEquals((1024L * 1024).formatFileSize(true), "1.00 MB")
        Assert.assertEquals((1024 * 500 + 1024L * 1024).formatFileSize(), "1.49 MB")
        Assert.assertEquals((1024 * 500 + 1024L * 1024 * 500).formatFileSize(), "500.49 MB")

        Assert.assertEquals((1024L * 1024 * 1024).formatFileSize(), "1 GB")
        Assert.assertEquals((1024L * 1024 * 500 + 1024L * 1024 * 1024).formatFileSize(), "1.49 GB")
        Assert.assertEquals((1024L * 1024 * 500 + 1024L * 1024 * 1024 * 500).formatFileSize(), "500.49 GB")

        Assert.assertEquals((1024L * 1024 * 1024 * 1024).formatFileSize(), "1 TB")
        Assert.assertEquals((1024L * 1024 * 1024 * 500 + 1024L * 1024 * 1024 * 1024).formatFileSize(), "1.49 TB")
        Assert.assertEquals((1024L * 1024 * 1024 * 500 + 1024L * 1024 * 1024 * 1024 * 500).formatFileSize(), "500.49 TB")

        Assert.assertEquals((1024L * 1024 * 1024 * 1024 * 1024).formatFileSize(), "1 PB")
        Assert.assertEquals((1024L * 1024 * 1024 * 1024 * 500 + 1024L * 1024 * 1024 * 1024 * 1024).formatFileSize(), "1.49 PB")
        Assert.assertEquals((1024L * 1024 * 1024 * 1024 * 500 + 1024L * 1024 * 1024 * 1024 * 1024 * 500).formatFileSize(), "500.49 PB")

        Assert.assertEquals((1024L * 1024 * 1024 * 1024 * 1024 * 1024).formatFileSize(), "1 EB")
        Assert.assertEquals((1024L * 1024 * 1024 * 1024 * 1024 * 500 + 1024L * 1024 * 1024 * 1024 * 1024 * 1024).formatFileSize(), "1.49 EB")
    }

    @Test
    fun tesMediumSize() {
        Assert.assertEquals((0).formatMediumFileSize(), "0 B")
        Assert.assertEquals((800).formatMediumFileSize(), "800 B")

        Assert.assertEquals((1024).formatMediumFileSize(), "1 KB")
        Assert.assertEquals((800 + 1024).formatMediumFileSize(), "1.8 KB")
        Assert.assertEquals((800 + 1024 * 500).formatMediumFileSize(), "500.8 KB")

        Assert.assertEquals((1024L * 1024).formatMediumFileSize(true), "1.0 MB")
        Assert.assertEquals((1024 * 500 + 1024L * 1024).formatMediumFileSize(), "1.5 MB")
        Assert.assertEquals((1024 * 500 + 1024L * 1024 * 500).formatMediumFileSize(), "500.5 MB")

        Assert.assertEquals((1024L * 1024 * 1024).formatMediumFileSize(), "1 GB")
        Assert.assertEquals((1024L * 1024 * 500 + 1024L * 1024 * 1024).formatMediumFileSize(), "1.5 GB")
        Assert.assertEquals((1024L * 1024 * 500 + 1024L * 1024 * 1024 * 500).formatMediumFileSize(), "500.5 GB")

        Assert.assertEquals((1024L * 1024 * 1024 * 1024).formatMediumFileSize(), "1 TB")
        Assert.assertEquals((1024L * 1024 * 1024 * 500 + 1024L * 1024 * 1024 * 1024).formatMediumFileSize(), "1.5 TB")
        Assert.assertEquals((1024L * 1024 * 1024 * 500 + 1024L * 1024 * 1024 * 1024 * 500).formatMediumFileSize(), "500.5 TB")

        Assert.assertEquals((1024L * 1024 * 1024 * 1024 * 1024).formatMediumFileSize(), "1 PB")
        Assert.assertEquals((1024L * 1024 * 1024 * 1024 * 500 + 1024L * 1024 * 1024 * 1024 * 1024).formatMediumFileSize(), "1.5 PB")
        Assert.assertEquals((1024L * 1024 * 1024 * 1024 * 500 + 1024L * 1024 * 1024 * 1024 * 1024 * 500).formatMediumFileSize(), "500.5 PB")

        Assert.assertEquals((1024L * 1024 * 1024 * 1024 * 1024 * 1024).formatMediumFileSize(), "1 EB")
        Assert.assertEquals((1024L * 1024 * 1024 * 1024 * 1024 * 500 + 1024L * 1024 * 1024 * 1024 * 1024 * 1024).formatMediumFileSize(), "1.5 EB")
    }

    @Test
    fun testShortFileSize() {
        Assert.assertEquals((0).formatShortFileSize(), "0 B")
        Assert.assertEquals((800).formatShortFileSize(), "800 B")

        Assert.assertEquals((1024).formatShortFileSize(), "1 KB")
        Assert.assertEquals((800 + 1024).formatShortFileSize(), "2 KB")
        Assert.assertEquals((800 + 1024 * 500).formatShortFileSize(), "501 KB")

        Assert.assertEquals((1024L * 1024).formatShortFileSize(), "1 MB")
        Assert.assertEquals((1024 * 500 + 1024L * 1024).formatShortFileSize(), "1 MB")
        Assert.assertEquals((1024 * 500 + 1024L * 1024 * 500).formatShortFileSize(), "500 MB")

        Assert.assertEquals((1024L * 1024 * 1024).formatShortFileSize(), "1 GB")
        Assert.assertEquals((1024L * 1024 * 500 + 1024L * 1024 * 1024).formatShortFileSize(), "1 GB")
        Assert.assertEquals((1024L * 1024 * 500 + 1024L * 1024 * 1024 * 500).formatShortFileSize(), "500 GB")

        Assert.assertEquals((1024L * 1024 * 1024 * 1024).formatShortFileSize(), "1 TB")
        Assert.assertEquals((1024L * 1024 * 1024 * 500 + 1024L * 1024 * 1024 * 1024).formatShortFileSize(), "1 TB")
        Assert.assertEquals((1024L * 1024 * 1024 * 500 + 1024L * 1024 * 1024 * 1024 * 500).formatShortFileSize(), "500 TB")

        Assert.assertEquals((1024L * 1024 * 1024 * 1024 * 1024).formatShortFileSize(), "1 PB")
        Assert.assertEquals((1024L * 1024 * 1024 * 1024 * 500 + 1024L * 1024 * 1024 * 1024 * 1024).formatShortFileSize(), "1 PB")
        Assert.assertEquals((1024L * 1024 * 1024 * 1024 * 500 + 1024L * 1024 * 1024 * 1024 * 1024 * 500).formatShortFileSize(), "500 PB")

        Assert.assertEquals((1024L * 1024 * 1024 * 1024 * 1024 * 1024).formatShortFileSize(), "1 EB")
        Assert.assertEquals((1024L * 1024 * 1024 * 1024 * 1024 * 500 + 1024L * 1024 * 1024 * 1024 * 1024 * 1024).formatShortFileSize(), "1 EB")
    }

    @Test
    fun testTotalTime() {
        // millisecond
        Assert.assertEquals(0L.formatTotalTime(), "0ms")
        Assert.assertEquals(590.formatTotalTime(), "590ms")
        Assert.assertEquals(590.formatTotalTime(true), "0s")

        // second
        Assert.assertEquals((1000 * 3).formatTotalTime(), "3s")
        Assert.assertEquals((1000 * 3 + 590).formatTotalTime(), "3s590ms")
        Assert.assertEquals((1000 * 3 + 590).formatTotalTime(true), "3s")

        // minute
        Assert.assertEquals((1000 * 60 * 3).formatTotalTime(), "3m")
        Assert.assertEquals((1000 * 60 * 3 + 1000 * 23).formatTotalTime(), "3m23s")
        Assert.assertEquals((1000 * 60 * 3 + 1000 * 23 + 467).formatTotalTime(), "3m23s467ms")
        Assert.assertEquals((1000 * 60 * 3 + 467).formatTotalTime(), "3m467ms")
        Assert.assertEquals((1000 * 60 * 3 + 467).formatTotalTime(true), "3m")

        // hour
        Assert.assertEquals((1000 * 60 * 60).formatTotalTime(), "1h")
        Assert.assertEquals((1000 * 60 * 60 + 1000 * 60 * 23).formatTotalTime(), "1h23m")
        Assert.assertEquals((1000 * 60 * 60 + 1000 * 60 * 23 + 1000 * 23).formatTotalTime(), "1h23m23s")
        Assert.assertEquals((1000 * 60 * 60 + 1000 * 23).formatTotalTime(), "1h23s")
        Assert.assertEquals((1000 * 60 * 60 + 1000 * 60 * 23 + 1000 * 23 + 467).formatTotalTime(), "1h23m23s467ms")
        Assert.assertEquals((1000 * 60 * 60 + 467).formatTotalTime(), "1h467ms")
        Assert.assertEquals((1000 * 60 * 60 + 467).formatTotalTime(true), "1h")

        // day
        Assert.assertEquals((1000 * 60 * 60 * 24).formatTotalTime(), "1d")
        Assert.assertEquals((1000 * 60 * 60 * 24 + 1000 * 60 * 60 + 1000 * 60 * 23).formatTotalTime(), "1d1h23m")
        Assert.assertEquals((1000 * 60 * 60 * 24 + 1000 * 60 * 60 + 1000 * 60 * 23 + 1000 * 23).formatTotalTime(), "1d1h23m23s")
        Assert.assertEquals((1000 * 60 * 60 * 24 + 1000 * 60 * 60 + 1000 * 23).formatTotalTime(), "1d1h23s")
        Assert.assertEquals((1000 * 60 * 60 * 24 + 1000 * 60 * 60 + 1000 * 60 * 23 + 1000 * 23 + 467).formatTotalTime(), "1d1h23m23s467ms")
        Assert.assertEquals((1000 * 60 * 60 * 24 + 1000 * 60 * 60 + 467).formatTotalTime(), "1d1h467ms")
        Assert.assertEquals((1000 * 60 * 60 * 24 + 467).formatTotalTime(), "1d467ms")
        Assert.assertEquals((1000 * 60 * 60 * 24 + 467).formatTotalTime(true), "1d")
    }
}
