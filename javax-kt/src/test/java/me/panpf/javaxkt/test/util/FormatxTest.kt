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

package me.panpf.javaxkt.test.util

import me.panpf.javaxkt.util.*
import org.junit.Assert
import org.junit.Test

class FormatxTest {

    @Test
    fun testPercent() {
        Assert.assertEquals(3.formatPercentWith(8), "37.5%")
        Assert.assertEquals(3.formatPercentWith(8, 2, true), "37.50%")

        Assert.assertEquals(3.0.formatPercentWith(8.0), "37.5%")
        Assert.assertEquals(3.0.formatPercentWith(8.0, 2, true), "37.50%")

        Assert.assertEquals(3f.formatPercentWith(8f), "37.5%")
        Assert.assertEquals(3f.formatPercentWith(8f, 2, true), "37.50%")

        Assert.assertEquals(3L.formatPercentWith(8L), "37.5%")
        Assert.assertEquals(3L.formatPercentWith(8L, 2, true), "37.50%")
    }

    @Test
    fun testFileSize() {
        Assert.assertEquals((-10).formatFileSize(), "0 B")
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
        Assert.assertEquals((-10L).formatTotalTime(), "0ms")
        Assert.assertEquals(590.formatTotalTime(), "590ms")
        Assert.assertEquals(590.formatTotalTime(true), "0s")

        // second
        Assert.assertEquals((1000 * 3).formatTotalTime(), "3s")
        Assert.assertEquals((1000 * 3 + 590).formatTotalTime(), "3s 590ms")
        Assert.assertEquals((1000 * 3 + 590).formatTotalTime(true), "3s")

        // minute
        Assert.assertEquals((1000 * 60 * 3).formatTotalTime(), "3m")
        Assert.assertEquals((1000 * 60 * 3 + 1000 * 23).formatTotalTime(), "3m 23s")
        Assert.assertEquals((1000 * 60 * 3 + 1000 * 23 + 467).formatTotalTime(), "3m 23s 467ms")
        Assert.assertEquals((1000 * 60 * 3 + 467).formatTotalTime(), "3m 467ms")
        Assert.assertEquals((1000 * 60 * 3 + 467).formatTotalTime(true), "3m")

        // hour
        Assert.assertEquals((1000 * 60 * 60).formatTotalTime(), "1h")
        Assert.assertEquals((1000 * 60 * 60 + 1000 * 60 * 23).formatTotalTime(), "1h 23m")
        Assert.assertEquals((1000 * 60 * 60 + 1000 * 60 * 23 + 1000 * 23).formatTotalTime(), "1h 23m 23s")
        Assert.assertEquals((1000 * 60 * 60 + 1000 * 23).formatTotalTime(), "1h 23s")
        Assert.assertEquals((1000 * 60 * 60 + 1000 * 60 * 23 + 1000 * 23 + 467).formatTotalTime(), "1h 23m 23s 467ms")
        Assert.assertEquals((1000 * 60 * 60 + 467).formatTotalTime(), "1h 467ms")
        Assert.assertEquals((1000 * 60 * 60 + 467).formatTotalTime(true), "1h")

        // day
        Assert.assertEquals((1000 * 60 * 60 * 24).formatTotalTime(), "1d")
        Assert.assertEquals((1000 * 60 * 60 * 24 + 1000 * 60 * 60 + 1000 * 60 * 23).formatTotalTime(), "1d 1h 23m")
        Assert.assertEquals((1000 * 60 * 60 * 24 + 1000 * 60 * 60 + 1000 * 60 * 23 + 1000 * 23).formatTotalTime(), "1d 1h 23m 23s")
        Assert.assertEquals((1000 * 60 * 60 * 24 + 1000 * 60 * 60 + 1000 * 23).formatTotalTime(), "1d 1h 23s")
        Assert.assertEquals((1000 * 60 * 60 * 24 + 1000 * 60 * 60 + 1000 * 60 * 23 + 1000 * 23 + 467).formatTotalTime(), "1d 1h 23m 23s 467ms")
        Assert.assertEquals((1000 * 60 * 60 * 24 + 1000 * 60 * 60 + 467).formatTotalTime(), "1d 1h 467ms")
        Assert.assertEquals((1000 * 60 * 60 * 24 + 467).formatTotalTime(), "1d 467ms")
        Assert.assertEquals((1000 * 60 * 60 * 24 + 467).formatTotalTime(true), "1d")
    }

    @Test
    fun testTotalTimeShort() {
        // millisecond
        Assert.assertEquals(0L.formatTotalTimeShort(), "0ms")
        Assert.assertEquals(590.formatTotalTimeShort(), "590ms")
        Assert.assertEquals(590.formatTotalTimeShort(true), "0s")

        // second
        Assert.assertEquals((1000 * 3).formatTotalTimeShort(), "3s")
        Assert.assertEquals((1000 * 3 + 590).formatTotalTimeShort(), "3s590ms")
        Assert.assertEquals((1000 * 3 + 590).formatTotalTimeShort(true), "3s")

        // minute
        Assert.assertEquals((1000 * 60 * 3).formatTotalTimeShort(), "3m")
        Assert.assertEquals((1000 * 60 * 3 + 1000 * 23).formatTotalTimeShort(), "3m23s")
        Assert.assertEquals((1000 * 60 * 3 + 1000 * 23 + 467).formatTotalTimeShort(), "3m23s467ms")
        Assert.assertEquals((1000 * 60 * 3 + 467).formatTotalTimeShort(), "3m467ms")
        Assert.assertEquals((1000 * 60 * 3 + 467).formatTotalTimeShort(true), "3m")

        // hour
        Assert.assertEquals((1000 * 60 * 60).formatTotalTimeShort(), "1h")
        Assert.assertEquals((1000 * 60 * 60 + 1000 * 60 * 23).formatTotalTimeShort(), "1h23m")
        Assert.assertEquals((1000 * 60 * 60 + 1000 * 60 * 23 + 1000 * 23).formatTotalTimeShort(), "1h23m23s")
        Assert.assertEquals((1000 * 60 * 60 + 1000 * 23).formatTotalTimeShort(), "1h23s")
        Assert.assertEquals((1000 * 60 * 60 + 1000 * 60 * 23 + 1000 * 23 + 467).formatTotalTimeShort(), "1h23m23s467ms")
        Assert.assertEquals((1000 * 60 * 60 + 467).formatTotalTimeShort(), "1h467ms")
        Assert.assertEquals((1000 * 60 * 60 + 467).formatTotalTimeShort(true), "1h")

        // day
        Assert.assertEquals((1000 * 60 * 60 * 24).formatTotalTimeShort(), "1d")
        Assert.assertEquals((1000 * 60 * 60 * 24 + 1000 * 60 * 60 + 1000 * 60 * 23).formatTotalTimeShort(), "1d1h23m")
        Assert.assertEquals((1000 * 60 * 60 * 24 + 1000 * 60 * 60 + 1000 * 60 * 23 + 1000 * 23).formatTotalTimeShort(), "1d1h23m23s")
        Assert.assertEquals((1000 * 60 * 60 * 24 + 1000 * 60 * 60 + 1000 * 23).formatTotalTimeShort(), "1d1h23s")
        Assert.assertEquals((1000 * 60 * 60 * 24 + 1000 * 60 * 60 + 1000 * 60 * 23 + 1000 * 23 + 467).formatTotalTimeShort(), "1d1h23m23s467ms")
        Assert.assertEquals((1000 * 60 * 60 * 24 + 1000 * 60 * 60 + 467).formatTotalTimeShort(), "1d1h467ms")
        Assert.assertEquals((1000 * 60 * 60 * 24 + 467).formatTotalTimeShort(), "1d467ms")
        Assert.assertEquals((1000 * 60 * 60 * 24 + 467).formatTotalTimeShort(true), "1d")
    }

    @Test
    fun testTotalTimeZH() {
        // millisecond
        Assert.assertEquals(0L.formatTotalTimeZH(), "0毫秒")
        Assert.assertEquals(590.formatTotalTimeZH(), "590毫秒")
        Assert.assertEquals(590.formatTotalTimeZH(true), "0秒")

        // second
        Assert.assertEquals((1000 * 3).formatTotalTimeZH(), "3秒")
        Assert.assertEquals((1000 * 3 + 590).formatTotalTimeZH(), "3秒 590毫秒")
        Assert.assertEquals((1000 * 3 + 590).formatTotalTimeZH(true), "3秒")

        // minute
        Assert.assertEquals((1000 * 60 * 3).formatTotalTimeZH(), "3分")
        Assert.assertEquals((1000 * 60 * 3 + 1000 * 23).formatTotalTimeZH(), "3分 23秒")
        Assert.assertEquals((1000 * 60 * 3 + 1000 * 23 + 467).formatTotalTimeZH(), "3分 23秒 467毫秒")
        Assert.assertEquals((1000 * 60 * 3 + 467).formatTotalTimeZH(), "3分 467毫秒")
        Assert.assertEquals((1000 * 60 * 3 + 467).formatTotalTimeZH(true), "3分")

        // hour
        Assert.assertEquals((1000 * 60 * 60).formatTotalTimeZH(), "1小时")
        Assert.assertEquals((1000 * 60 * 60 + 1000 * 60 * 23).formatTotalTimeZH(), "1小时 23分")
        Assert.assertEquals((1000 * 60 * 60 + 1000 * 60 * 23 + 1000 * 23).formatTotalTimeZH(), "1小时 23分 23秒")
        Assert.assertEquals((1000 * 60 * 60 + 1000 * 23).formatTotalTimeZH(), "1小时 23秒")
        Assert.assertEquals((1000 * 60 * 60 + 1000 * 60 * 23 + 1000 * 23 + 467).formatTotalTimeZH(), "1小时 23分 23秒 467毫秒")
        Assert.assertEquals((1000 * 60 * 60 + 467).formatTotalTimeZH(), "1小时 467毫秒")
        Assert.assertEquals((1000 * 60 * 60 + 467).formatTotalTimeZH(true), "1小时")

        // day
        Assert.assertEquals((1000 * 60 * 60 * 24).formatTotalTimeZH(), "1天")
        Assert.assertEquals((1000 * 60 * 60 * 24 + 1000 * 60 * 60 + 1000 * 60 * 23).formatTotalTimeZH(), "1天 1小时 23分")
        Assert.assertEquals((1000 * 60 * 60 * 24 + 1000 * 60 * 60 + 1000 * 60 * 23 + 1000 * 23).formatTotalTimeZH(), "1天 1小时 23分 23秒")
        Assert.assertEquals((1000 * 60 * 60 * 24 + 1000 * 60 * 60 + 1000 * 23).formatTotalTimeZH(), "1天 1小时 23秒")
        Assert.assertEquals((1000 * 60 * 60 * 24 + 1000 * 60 * 60 + 1000 * 60 * 23 + 1000 * 23 + 467).formatTotalTimeZH(), "1天 1小时 23分 23秒 467毫秒")
        Assert.assertEquals((1000 * 60 * 60 * 24 + 1000 * 60 * 60 + 467).formatTotalTimeZH(), "1天 1小时 467毫秒")
        Assert.assertEquals((1000 * 60 * 60 * 24 + 467).formatTotalTimeZH(), "1天 467毫秒")
        Assert.assertEquals((1000 * 60 * 60 * 24 + 467).formatTotalTimeZH(true), "1天")
    }

    @Test
    fun testTotalTimeZHShort() {
        // millisecond
        Assert.assertEquals(0L.formatTotalTimeZHShort(), "0毫秒")
        Assert.assertEquals(590.formatTotalTimeZHShort(), "590毫秒")
        Assert.assertEquals(590.formatTotalTimeZHShort(true), "0秒")

        // second
        Assert.assertEquals((1000 * 3).formatTotalTimeZHShort(), "3秒")
        Assert.assertEquals((1000 * 3 + 590).formatTotalTimeZHShort(), "3秒590毫秒")
        Assert.assertEquals((1000 * 3 + 590).formatTotalTimeZHShort(true), "3秒")

        // minute
        Assert.assertEquals((1000 * 60 * 3).formatTotalTimeZHShort(), "3分")
        Assert.assertEquals((1000 * 60 * 3 + 1000 * 23).formatTotalTimeZHShort(), "3分23秒")
        Assert.assertEquals((1000 * 60 * 3 + 1000 * 23 + 467).formatTotalTimeZHShort(), "3分23秒467毫秒")
        Assert.assertEquals((1000 * 60 * 3 + 467).formatTotalTimeZHShort(), "3分467毫秒")
        Assert.assertEquals((1000 * 60 * 3 + 467).formatTotalTimeZHShort(true), "3分")

        // hour
        Assert.assertEquals((1000 * 60 * 60).formatTotalTimeZHShort(), "1小时")
        Assert.assertEquals((1000 * 60 * 60 + 1000 * 60 * 23).formatTotalTimeZHShort(), "1小时23分")
        Assert.assertEquals((1000 * 60 * 60 + 1000 * 60 * 23 + 1000 * 23).formatTotalTimeZHShort(), "1小时23分23秒")
        Assert.assertEquals((1000 * 60 * 60 + 1000 * 23).formatTotalTimeZHShort(), "1小时23秒")
        Assert.assertEquals((1000 * 60 * 60 + 1000 * 60 * 23 + 1000 * 23 + 467).formatTotalTimeZHShort(), "1小时23分23秒467毫秒")
        Assert.assertEquals((1000 * 60 * 60 + 467).formatTotalTimeZHShort(), "1小时467毫秒")
        Assert.assertEquals((1000 * 60 * 60 + 467).formatTotalTimeZHShort(true), "1小时")

        // day
        Assert.assertEquals((1000 * 60 * 60 * 24).formatTotalTimeZHShort(), "1天")
        Assert.assertEquals((1000 * 60 * 60 * 24 + 1000 * 60 * 60 + 1000 * 60 * 23).formatTotalTimeZHShort(), "1天1小时23分")
        Assert.assertEquals((1000 * 60 * 60 * 24 + 1000 * 60 * 60 + 1000 * 60 * 23 + 1000 * 23).formatTotalTimeZHShort(), "1天1小时23分23秒")
        Assert.assertEquals((1000 * 60 * 60 * 24 + 1000 * 60 * 60 + 1000 * 23).formatTotalTimeZHShort(), "1天1小时23秒")
        Assert.assertEquals((1000 * 60 * 60 * 24 + 1000 * 60 * 60 + 1000 * 60 * 23 + 1000 * 23 + 467).formatTotalTimeZHShort(), "1天1小时23分23秒467毫秒")
        Assert.assertEquals((1000 * 60 * 60 * 24 + 1000 * 60 * 60 + 467).formatTotalTimeZHShort(), "1天1小时467毫秒")
        Assert.assertEquals((1000 * 60 * 60 * 24 + 467).formatTotalTimeZHShort(), "1天467毫秒")
        Assert.assertEquals((1000 * 60 * 60 * 24 + 467).formatTotalTimeZHShort(true), "1天")
    }

    @Test
    fun testCount() {
        Assert.assertEquals(0.formatCount(), "0")
        Assert.assertEquals((-10).formatCount(), "0")
        Assert.assertEquals(999.formatCount(), "999")
        Assert.assertEquals(1000.formatCount(), "1k")
        Assert.assertEquals(1099.formatCount(), "1k")
        Assert.assertEquals(1100.formatCount(), "1.1k")
        Assert.assertEquals(1500.formatCount(), "1.5k")
        Assert.assertEquals(1999.formatCount(), "1.9k")
        Assert.assertEquals(10000.formatCount(), "1w")
        Assert.assertEquals(10999.formatCount(), "1w")
        Assert.assertEquals(15001.formatCount(), "1.5w")
        Assert.assertEquals(101000.formatCount(), "10.1w")
    }
}
