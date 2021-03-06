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

import me.panpf.javax.util.Formatx
import me.panpf.javaxkt.util.*
import org.junit.Assert
import org.junit.Assert.assertEquals
import org.junit.Test

class FormatxTest {

    @Test
    fun testFormat() {
        Assert.assertEquals((3.0 / 8.0).format("%"), "37.5%")
        Assert.assertEquals((3.0f / 8.0f).format("%"), "37.5%")
    }

    @Test
    fun testPercent() {
        Assert.assertEquals(3.formatPercentWith(8), "37.5%")
        Assert.assertEquals(3.formatPercentWith(8, 2, true), "37.50%")
        Assert.assertEquals(3.formatPercentWith(0), "100%")

        Assert.assertEquals(3.0.formatPercentWith(8.0), "37.5%")
        Assert.assertEquals(3.0.formatPercentWith(8.0, 2, true), "37.50%")
        Assert.assertEquals(3.0.formatPercentWith(0.0), "100%")

        Assert.assertEquals(3f.formatPercentWith(8f), "37.5%")
        Assert.assertEquals(3f.formatPercentWith(8f, 2, true), "37.50%")
        Assert.assertEquals(3f.formatPercentWith(0f), "100%")

        Assert.assertEquals(3L.formatPercentWith(8L), "37.5%")
        Assert.assertEquals(3L.formatPercentWith(8L, 2, true), "37.50%")
        Assert.assertEquals(3L.formatPercentWith(0L), "100%")
    }

    @Test
    fun testFileSize() {
        Assert.assertEquals((-10).formatFileSize(), "0 B")
        Assert.assertEquals(0.formatFileSize(2, false), "0 B")
        Assert.assertEquals(999.formatFileSize(), "999 B")

        Assert.assertEquals((999 + 1).formatFileSize(), "0.98 KB")
        Assert.assertEquals(1024.formatFileSize(), "1 KB")
        Assert.assertEquals((800 + 1024).formatFileSize(), "1.78 KB")
        Assert.assertEquals((800 + 1024 * 500).formatFileSize(), "500.78 KB")
        Assert.assertEquals((1024L * 999).formatFileSize(), "999 KB")

        Assert.assertEquals((1024L * 999 + 1).formatFileSize(2, false), "0.98 MB")
        Assert.assertEquals((1024L * 1024).formatFileSize(true), "1.00 MB")
        Assert.assertEquals((1024 * 500 + 1024L * 1024).formatFileSize(), "1.49 MB")
        Assert.assertEquals((1024 * 500 + 1024L * 1024 * 500).formatFileSize(), "500.49 MB")
        Assert.assertEquals((1024L * 1024 * 999).formatFileSize(), "999 MB")

        Assert.assertEquals((1024L * 1024 * 999 + 1).formatFileSize(), "0.98 GB")
        Assert.assertEquals((1024L * 1024 * 1024).formatFileSize(), "1 GB")
        Assert.assertEquals((1024L * 1024 * 500 + 1024L * 1024 * 1024).formatFileSize(), "1.49 GB")
        Assert.assertEquals((1024L * 1024 * 500 + 1024L * 1024 * 1024 * 500).formatFileSize(), "500.49 GB")
        Assert.assertEquals((1024L * 1024 * 1024 * 999).formatFileSize(), "999 GB")

        Assert.assertEquals((1024L * 1024 * 1024 * 999 + 1).formatFileSize(), "0.98 TB")
        Assert.assertEquals((1024L * 1024 * 1024 * 1024).formatFileSize(), "1 TB")
        Assert.assertEquals((1024L * 1024 * 1024 * 500 + 1024L * 1024 * 1024 * 1024).formatFileSize(), "1.49 TB")
        Assert.assertEquals((1024L * 1024 * 1024 * 500 + 1024L * 1024 * 1024 * 1024 * 500).formatFileSize(), "500.49 TB")
        Assert.assertEquals((1024L * 1024 * 1024 * 1024 * 999).formatFileSize(), "999 TB")

        Assert.assertEquals((1024L * 1024 * 1024 * 1024 * 999 + 1).formatFileSize(), "0.98 PB")
        Assert.assertEquals((1024L * 1024 * 1024 * 1024 * 1024).formatFileSize(), "1 PB")
        Assert.assertEquals((1024L * 1024 * 1024 * 1024 * 500 + 1024L * 1024 * 1024 * 1024 * 1024).formatFileSize(), "1.49 PB")
        Assert.assertEquals((1024L * 1024 * 1024 * 1024 * 500 + 1024L * 1024 * 1024 * 1024 * 1024 * 500).formatFileSize(), "500.49 PB")
        Assert.assertEquals((1024L * 1024 * 1024 * 1024 * 1024 * 999).formatFileSize(), "999 PB")

        Assert.assertEquals((1024L * 1024 * 1024 * 1024 * 1024 * 999 + 1).formatFileSize(), "0.98 EB")
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
        Assert.assertEquals(0L.formatTotalTime(0, " ", "d", "h", "m", "s", "ms"), "0s")
        Assert.assertEquals((-10L).formatTotalTime(Formatx.TotalTimeConfig(0, " ", "d", "h", "m", "s", "ms")), "0s")
        Assert.assertEquals((-10L).formatTotalTime(), "0s")
        Assert.assertEquals(590.formatTotalTime(), "590ms")
        Assert.assertEquals(590.formatTotalTime(1), "0s")

        // second
        Assert.assertEquals((1000 * 3).formatTotalTime(), "3s")
        Assert.assertEquals((1000 * 3 + 590).formatTotalTime(), "3s 590ms")
        Assert.assertEquals((1000 * 3 + 590).formatTotalTime(1), "3s")

        // minute
        Assert.assertEquals((1000 * 60 * 3).formatTotalTime(), "3m")
        Assert.assertEquals((1000 * 60 * 3 + 1000 * 23).formatTotalTime(), "3m 23s")
        Assert.assertEquals((1000 * 60 * 3 + 1000 * 23 + 467).formatTotalTime(), "3m 23s 467ms")
        Assert.assertEquals((1000 * 60 * 3 + 467).formatTotalTime(), "3m 467ms")
        Assert.assertEquals((1000 * 60 * 3 + 467).formatTotalTime(1), "3m")

        // hour
        Assert.assertEquals((1000 * 60 * 60).formatTotalTime(), "1h")
        Assert.assertEquals((1000 * 60 * 60 + 1000 * 60 * 23).formatTotalTime(), "1h 23m")
        Assert.assertEquals((1000 * 60 * 60 + 1000 * 60 * 23 + 1000 * 23).formatTotalTime(), "1h 23m 23s")
        Assert.assertEquals((1000 * 60 * 60 + 1000 * 23).formatTotalTime(), "1h 23s")
        Assert.assertEquals((1000 * 60 * 60 + 1000 * 60 * 23 + 1000 * 23 + 467).formatTotalTime(), "1h 23m 23s 467ms")
        Assert.assertEquals((1000 * 60 * 60 + 467).formatTotalTime(), "1h 467ms")
        Assert.assertEquals((1000 * 60 * 60 + 467).formatTotalTime(1), "1h")

        // day
        Assert.assertEquals((1000 * 60 * 60 * 24).formatTotalTime(), "1d")
        Assert.assertEquals((1000 * 60 * 60 * 24 + 1000 * 60 * 60 + 1000 * 60 * 23).formatTotalTime(), "1d 1h 23m")
        Assert.assertEquals((1000 * 60 * 60 * 24 + 1000 * 60 * 60 + 1000 * 60 * 23 + 1000 * 23).formatTotalTime(), "1d 1h 23m 23s")
        Assert.assertEquals((1000 * 60 * 60 * 24 + 1000 * 60 * 60 + 1000 * 23).formatTotalTime(), "1d 1h 23s")
        Assert.assertEquals((1000 * 60 * 60 * 24 + 1000 * 60 * 60 + 1000 * 60 * 23 + 1000 * 23 + 467).formatTotalTime(), "1d 1h 23m 23s 467ms")
        Assert.assertEquals((1000 * 60 * 60 * 24 + 1000 * 60 * 60 + 467).formatTotalTime(), "1d 1h 467ms")
        Assert.assertEquals((1000 * 60 * 60 * 24 + 467).formatTotalTime(), "1d 467ms")
        Assert.assertEquals((1000 * 60 * 60 * 24 + 467).formatTotalTime(1), "1d")
    }

    @Test
    fun testTotalTimeLevel() {
        Assert.assertEquals((1000 * 60 * 60 * 24 + 1000 * 60 * 60 + 1000 * 60 * 23 + 1000 * 23 + 467).formatTotalTime(), "1d 1h 23m 23s 467ms")
        Assert.assertEquals((1000 * 60 * 60 * 24 + 1000 * 60 * 60 + 1000 * 60 * 23 + 1000 * 23 + 467).formatTotalTime(1), "1d 1h 23m 23s")
        Assert.assertEquals((1000 * 60 * 60 * 24 + 1000 * 60 * 60 + 1000 * 60 * 23 + 1000 * 23 + 467).formatTotalTime(2), "1d 1h 23m")
        Assert.assertEquals((1000 * 60 * 60 * 24 + 1000 * 60 * 60 + 1000 * 60 * 23 + 1000 * 23 + 467).formatTotalTime(3), "1d 1h")
        Assert.assertEquals((1000 * 60 * 60 * 24 + 1000 * 60 * 60 + 1000 * 60 * 23 + 1000 * 23 + 467).formatTotalTime(4), "1d")
        Assert.assertEquals((1000 * 60 * 60 * 24 + 1000 * 60 * 60 + 1000 * 60 * 23 + 1000 * 23 + 467).formatTotalTime(5), "0d")
        Assert.assertEquals((1000 * 60 * 60 * 24 + 1000 * 60 * 60 + 1000 * 60 * 23 + 1000 * 23 + 467).formatTotalTime(6), "0d")

        Assert.assertEquals(0.formatTotalTime(0), "0s")
        Assert.assertEquals(0.formatTotalTime(1), "0s")
        Assert.assertEquals(0.formatTotalTime(2), "0m")
        Assert.assertEquals(0.formatTotalTime(3), "0h")
        Assert.assertEquals(0.formatTotalTime(4), "0d")
        Assert.assertEquals(0.formatTotalTime(5), "0d")
    }

    @Test
    fun testShortTotalTime() {
        // millisecond
        Assert.assertEquals(0L.formatShortTotalTime(), "0s")
        Assert.assertEquals(590.formatShortTotalTime(), "590ms")
        Assert.assertEquals(590.formatShortTotalTime(1), "0s")

        // second
        Assert.assertEquals((1000 * 3).formatShortTotalTime(), "3s")
        Assert.assertEquals((1000 * 3 + 590).formatShortTotalTime(), "3s590ms")
        Assert.assertEquals((1000 * 3 + 590).formatShortTotalTime(1), "3s")

        // minute
        Assert.assertEquals((1000 * 60 * 3).formatShortTotalTime(), "3m")
        Assert.assertEquals((1000 * 60 * 3 + 1000 * 23).formatShortTotalTime(), "3m23s")
        Assert.assertEquals((1000 * 60 * 3 + 1000 * 23 + 467).formatShortTotalTime(), "3m23s467ms")
        Assert.assertEquals((1000 * 60 * 3 + 467).formatShortTotalTime(), "3m467ms")
        Assert.assertEquals((1000 * 60 * 3 + 467).formatShortTotalTime(1), "3m")

        // hour
        Assert.assertEquals((1000 * 60 * 60).formatShortTotalTime(), "1h")
        Assert.assertEquals((1000 * 60 * 60 + 1000 * 60 * 23).formatShortTotalTime(), "1h23m")
        Assert.assertEquals((1000 * 60 * 60 + 1000 * 60 * 23 + 1000 * 23).formatShortTotalTime(), "1h23m23s")
        Assert.assertEquals((1000 * 60 * 60 + 1000 * 23).formatShortTotalTime(), "1h23s")
        Assert.assertEquals((1000 * 60 * 60 + 1000 * 60 * 23 + 1000 * 23 + 467).formatShortTotalTime(), "1h23m23s467ms")
        Assert.assertEquals((1000 * 60 * 60 + 467).formatShortTotalTime(), "1h467ms")
        Assert.assertEquals((1000 * 60 * 60 + 467).formatShortTotalTime(1), "1h")

        // day
        Assert.assertEquals((1000 * 60 * 60 * 24).formatShortTotalTime(), "1d")
        Assert.assertEquals((1000 * 60 * 60 * 24 + 1000 * 60 * 60 + 1000 * 60 * 23).formatShortTotalTime(), "1d1h23m")
        Assert.assertEquals((1000 * 60 * 60 * 24 + 1000 * 60 * 60 + 1000 * 60 * 23 + 1000 * 23).formatShortTotalTime(), "1d1h23m23s")
        Assert.assertEquals((1000 * 60 * 60 * 24 + 1000 * 60 * 60 + 1000 * 23).formatShortTotalTime(), "1d1h23s")
        Assert.assertEquals((1000 * 60 * 60 * 24 + 1000 * 60 * 60 + 1000 * 60 * 23 + 1000 * 23 + 467).formatShortTotalTime(), "1d1h23m23s467ms")
        Assert.assertEquals((1000 * 60 * 60 * 24 + 1000 * 60 * 60 + 467).formatShortTotalTime(), "1d1h467ms")
        Assert.assertEquals((1000 * 60 * 60 * 24 + 467).formatShortTotalTime(), "1d467ms")
        Assert.assertEquals((1000 * 60 * 60 * 24 + 467).formatShortTotalTime(1), "1d")
    }

    @Test
    fun testTotalTimeZH() {
        // millisecond
        Assert.assertEquals(0L.formatTotalTimeZH(), "0秒")
        Assert.assertEquals(590.formatTotalTimeZH(), "590毫秒")
        Assert.assertEquals(590.formatTotalTimeZH(1), "0秒")

        // second
        Assert.assertEquals((1000 * 3).formatTotalTimeZH(), "3秒")
        Assert.assertEquals((1000 * 3 + 590).formatTotalTimeZH(), "3秒 590毫秒")
        Assert.assertEquals((1000 * 3 + 590).formatTotalTimeZH(1), "3秒")

        // minute
        Assert.assertEquals((1000 * 60 * 3).formatTotalTimeZH(), "3分钟")
        Assert.assertEquals((1000 * 60 * 3 + 1000 * 23).formatTotalTimeZH(), "3分钟 23秒")
        Assert.assertEquals((1000 * 60 * 3 + 1000 * 23 + 467).formatTotalTimeZH(), "3分钟 23秒 467毫秒")
        Assert.assertEquals((1000 * 60 * 3 + 467).formatTotalTimeZH(), "3分钟 467毫秒")
        Assert.assertEquals((1000 * 60 * 3 + 467).formatTotalTimeZH(1), "3分钟")

        // hour
        Assert.assertEquals((1000 * 60 * 60).formatTotalTimeZH(), "1小时")
        Assert.assertEquals((1000 * 60 * 60 + 1000 * 60 * 23).formatTotalTimeZH(), "1小时 23分钟")
        Assert.assertEquals((1000 * 60 * 60 + 1000 * 60 * 23 + 1000 * 23).formatTotalTimeZH(), "1小时 23分钟 23秒")
        Assert.assertEquals((1000 * 60 * 60 + 1000 * 23).formatTotalTimeZH(), "1小时 23秒")
        Assert.assertEquals((1000 * 60 * 60 + 1000 * 60 * 23 + 1000 * 23 + 467).formatTotalTimeZH(), "1小时 23分钟 23秒 467毫秒")
        Assert.assertEquals((1000 * 60 * 60 + 467).formatTotalTimeZH(), "1小时 467毫秒")
        Assert.assertEquals((1000 * 60 * 60 + 467).formatTotalTimeZH(1), "1小时")

        // day
        Assert.assertEquals((1000 * 60 * 60 * 24).formatTotalTimeZH(), "1天")
        Assert.assertEquals((1000 * 60 * 60 * 24 + 1000 * 60 * 60 + 1000 * 60 * 23).formatTotalTimeZH(), "1天 1小时 23分钟")
        Assert.assertEquals((1000 * 60 * 60 * 24 + 1000 * 60 * 60 + 1000 * 60 * 23 + 1000 * 23).formatTotalTimeZH(), "1天 1小时 23分钟 23秒")
        Assert.assertEquals((1000 * 60 * 60 * 24 + 1000 * 60 * 60 + 1000 * 23).formatTotalTimeZH(), "1天 1小时 23秒")
        Assert.assertEquals((1000 * 60 * 60 * 24 + 1000 * 60 * 60 + 1000 * 60 * 23 + 1000 * 23 + 467).formatTotalTimeZH(), "1天 1小时 23分钟 23秒 467毫秒")
        Assert.assertEquals((1000 * 60 * 60 * 24 + 1000 * 60 * 60 + 467).formatTotalTimeZH(), "1天 1小时 467毫秒")
        Assert.assertEquals((1000 * 60 * 60 * 24 + 467).formatTotalTimeZH(), "1天 467毫秒")
        Assert.assertEquals((1000 * 60 * 60 * 24 + 467).formatTotalTimeZH(1), "1天")
    }

    @Test
    fun testShortTotalTimeZH() {
        // millisecond
        Assert.assertEquals(0L.formatShortTotalTimeZH(), "0秒")
        Assert.assertEquals(590.formatShortTotalTimeZH(), "590毫秒")
        Assert.assertEquals(590.formatShortTotalTimeZH(1), "0秒")

        // second
        Assert.assertEquals((1000 * 3).formatShortTotalTimeZH(), "3秒")
        Assert.assertEquals((1000 * 3 + 590).formatShortTotalTimeZH(), "3秒590毫秒")
        Assert.assertEquals((1000 * 3 + 590).formatShortTotalTimeZH(1), "3秒")

        // minute
        Assert.assertEquals((1000 * 60 * 3).formatShortTotalTimeZH(), "3分钟")
        Assert.assertEquals((1000 * 60 * 3 + 1000 * 23).formatShortTotalTimeZH(), "3分钟23秒")
        Assert.assertEquals((1000 * 60 * 3 + 1000 * 23 + 467).formatShortTotalTimeZH(), "3分钟23秒467毫秒")
        Assert.assertEquals((1000 * 60 * 3 + 467).formatShortTotalTimeZH(), "3分钟467毫秒")
        Assert.assertEquals((1000 * 60 * 3 + 467).formatShortTotalTimeZH(1), "3分钟")

        // hour
        Assert.assertEquals((1000 * 60 * 60).formatShortTotalTimeZH(), "1小时")
        Assert.assertEquals((1000 * 60 * 60 + 1000 * 60 * 23).formatShortTotalTimeZH(), "1小时23分钟")
        Assert.assertEquals((1000 * 60 * 60 + 1000 * 60 * 23 + 1000 * 23).formatShortTotalTimeZH(), "1小时23分钟23秒")
        Assert.assertEquals((1000 * 60 * 60 + 1000 * 23).formatShortTotalTimeZH(), "1小时23秒")
        Assert.assertEquals((1000 * 60 * 60 + 1000 * 60 * 23 + 1000 * 23 + 467).formatShortTotalTimeZH(), "1小时23分钟23秒467毫秒")
        Assert.assertEquals((1000 * 60 * 60 + 467).formatShortTotalTimeZH(), "1小时467毫秒")
        Assert.assertEquals((1000 * 60 * 60 + 467).formatShortTotalTimeZH(1), "1小时")

        // day
        Assert.assertEquals((1000 * 60 * 60 * 24).formatShortTotalTimeZH(), "1天")
        Assert.assertEquals((1000 * 60 * 60 * 24 + 1000 * 60 * 60 + 1000 * 60 * 23).formatShortTotalTimeZH(), "1天1小时23分钟")
        Assert.assertEquals((1000 * 60 * 60 * 24 + 1000 * 60 * 60 + 1000 * 60 * 23 + 1000 * 23).formatShortTotalTimeZH(), "1天1小时23分钟23秒")
        Assert.assertEquals((1000 * 60 * 60 * 24 + 1000 * 60 * 60 + 1000 * 23).formatShortTotalTimeZH(), "1天1小时23秒")
        Assert.assertEquals((1000 * 60 * 60 * 24 + 1000 * 60 * 60 + 1000 * 60 * 23 + 1000 * 23 + 467).formatShortTotalTimeZH(), "1天1小时23分钟23秒467毫秒")
        Assert.assertEquals((1000 * 60 * 60 * 24 + 1000 * 60 * 60 + 467).formatShortTotalTimeZH(), "1天1小时467毫秒")
        Assert.assertEquals((1000 * 60 * 60 * 24 + 467).formatShortTotalTimeZH(), "1天467毫秒")
        Assert.assertEquals((1000 * 60 * 60 * 24 + 467).formatShortTotalTimeZH(1), "1天")
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
        Assert.assertEquals(101000L.formatCount(), "10.1w")
    }

    @Test
    fun testStartChars() {
        Assert.assertEquals("12345".hiddenStartChars(4), "****5")
        Assert.assertEquals("123456".hiddenStartChars(4), "****56")
        Assert.assertEquals("1234".hiddenStartChars(4), "****")
        Assert.assertEquals("123".hiddenStartChars(4), "***")
        Assert.assertEquals("13509853689".hiddenStartChars(4), "****9853689")
        Assert.assertEquals(null.hiddenStartChars(4), "")

        Assert.assertEquals("12345".hiddenStartChars(4, '$'), "$$$$5")
        Assert.assertEquals("123456".hiddenStartChars(4, '$'), "$$$$56")
        Assert.assertEquals("1234".hiddenStartChars(4, '$'), "$$$$")
        Assert.assertEquals("123".hiddenStartChars(4, '$'), "$$$")
        Assert.assertEquals("13509853689".hiddenStartChars(4, '$'), "$$$$9853689")
        Assert.assertEquals(null.hiddenStartChars(4, '$'), "")
    }

    @Test
    fun testHiddenChars() {
        Assert.assertEquals("12345".hiddenMiddleChars(4), "****5")
        Assert.assertEquals("123456".hiddenMiddleChars(4), "1****6")
        Assert.assertEquals("1234".hiddenMiddleChars(4), "****")
        Assert.assertEquals("123".hiddenMiddleChars(4), "***")
        Assert.assertEquals("13509853689".hiddenMiddleChars(4), "135****3689")
        Assert.assertEquals(null.hiddenMiddleChars(4), "")

        Assert.assertEquals("12345".hiddenMiddleChars(4, '$'), "$$$$5")
        Assert.assertEquals("123456".hiddenMiddleChars(4, '$'), "1$$$$6")
        Assert.assertEquals("1234".hiddenMiddleChars(4, '$'), "$$$$")
        Assert.assertEquals("123".hiddenMiddleChars(4, '$'), "$$$")
        Assert.assertEquals("13509853689".hiddenMiddleChars(4, '$'), "135$$$$3689")
        Assert.assertEquals(null.hiddenMiddleChars(4, '$'), "")
    }

    @Test
    fun testEndChars() {
        Assert.assertEquals("12345".hiddenEndChars(4), "1****")
        Assert.assertEquals("123456".hiddenEndChars(4), "12****")
        Assert.assertEquals("1234".hiddenEndChars(4), "****")
        Assert.assertEquals("123".hiddenEndChars(4), "***")
        Assert.assertEquals("13509853689".hiddenEndChars(4), "1350985****")
        Assert.assertEquals(null.hiddenEndChars(4), "")

        Assert.assertEquals("12345".hiddenEndChars(4, '$'), "1$$$$")
        Assert.assertEquals("123456".hiddenEndChars(4, '$'), "12$$$$")
        Assert.assertEquals("1234".hiddenEndChars(4, '$'), "$$$$")
        Assert.assertEquals("123".hiddenEndChars(4, '$'), "$$$")
        Assert.assertEquals("13509853689".hiddenEndChars(4, '$'), "1350985$$$$")
        Assert.assertEquals(null.hiddenEndChars(4, '$'), "")
    }

    @Test
    fun testPad() {
        assertEquals(10.pad(5), "00010")
        assertEquals(10L.pad(5), "00010")
    }

    @Test
    fun testDuration() {
        assertEquals(0.formatDuration(), "00:00:00")
        assertEquals((1000 * 5).toLong().formatDuration(), "00:00:05")
        assertEquals((1000 * 59).toLong().formatDuration(), "00:00:59")
        assertEquals((1000 * 60).toLong().formatDuration(), "00:01:00")
        assertEquals((1000 * 60 + 1000 * 4).toLong().formatDuration(), "00:01:04")
        assertEquals((1000 * 60 * 60).toLong().formatDuration(), "01:00:00")
        assertEquals((1000 * 60 * 60 + 1000 * 4).toLong().formatDuration(), "01:00:04")
        assertEquals((1000 * 60 * 60 + 1000 * 60 * 18 + 1000 * 4).toLong().formatDuration(), "01:18:04")
        assertEquals((1000 * 60 * 60 * 100 + 1000 * 60 * 18 + 1000 * 4).toLong().formatDuration(), "100:18:04")

        assertEquals(0.formatShortDuration(), "00:00")
        assertEquals((1000 * 5).toLong().formatShortDuration(), "00:05")
        assertEquals((1000 * 59).toLong().formatShortDuration(), "00:59")
        assertEquals((1000 * 60).toLong().formatShortDuration(), "01:00")
        assertEquals((1000 * 60 + 1000 * 4).toLong().formatShortDuration(), "01:04")
    }
}
