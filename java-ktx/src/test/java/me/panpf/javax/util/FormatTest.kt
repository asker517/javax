package me.panpf.javax.util

import org.junit.Assert
import org.junit.Test

class FormatTest {

    @Test
    fun testPercent() {
        Assert.assertEquals(3.formatPercentWith(8), "37.5%")
        Assert.assertEquals(3.formatPercentWith(8, 2, true), "37.50%")

        Assert.assertEquals(0.46.formatPercent(), "46%")
    }

    @Test
    fun testFileSize() {
        Assert.assertEquals(0.formatFileSize(), "0 B")
        Assert.assertEquals(800.formatFileSize(), "800 B")

        Assert.assertEquals(1024.formatFileSize(), "1 KB")
        Assert.assertEquals((800 + 1024).formatFileSize(), "1.78 KB")
        Assert.assertEquals((800 + 1024 * 500).formatFileSize(), "500.78 KB")

        Assert.assertEquals((1024L * 1024).formatFileSize(), "1 MB")
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

        Assert.assertEquals((1024L * 1024).formatMediumFileSize(), "1 MB")
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
}
