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

package me.panpf.javax.test.util;

import me.panpf.javax.util.Formatx;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FormatxTest {

    @Test
    public void testPercent() {
        assertEquals(Formatx.percent(3, 8), "37.5%");
        assertEquals(Formatx.percent(3, 8, 2), "37.5%");
        assertEquals(Formatx.percent(3, 8, 2, true), "37.50%");

        assertEquals(Formatx.percent(3d, 8d), "37.5%");
        assertEquals(Formatx.percent(3d, 8d, 2), "37.5%");
        assertEquals(Formatx.percent(3d, 8d, 2, true), "37.50%");

        assertEquals(Formatx.percent(3f, 8f), "37.5%");
        assertEquals(Formatx.percent(3f, 8f, 2), "37.5%");
        assertEquals(Formatx.percent(3f, 8f, 2, true), "37.50%");

        assertEquals(Formatx.percent(3L, 8L), "37.5%");
        assertEquals(Formatx.percent(3L, 8L, 2), "37.5%");
        assertEquals(Formatx.percent(3L, 8L, 2, true), "37.50%");
    }

    @Test
    public void testFileSize() {
        assertEquals(Formatx.fileSize(-10L), "0 B");
        assertEquals(Formatx.fileSize(0L), "0 B");
        assertEquals(Formatx.fileSize(800), "800 B");

        assertEquals(Formatx.fileSize(1024), "1 KB");
        assertEquals(Formatx.fileSize(800 + 1024), "1.78 KB");
        assertEquals(Formatx.fileSize(800 + 1024 * 500), "500.78 KB");

        assertEquals(Formatx.fileSize(1024L * 1024, true), "1.00 MB");
        assertEquals(Formatx.fileSize((1024 * 500) + 1024L * 1024), "1.49 MB");
        assertEquals(Formatx.fileSize((1024 * 500) + 1024L * 1024 * 500), "500.49 MB");

        assertEquals(Formatx.fileSize(1024L * 1024 * 1024), "1 GB");
        assertEquals(Formatx.fileSize((1024L * 1024 * 500) + 1024L * 1024 * 1024), "1.49 GB");
        assertEquals(Formatx.fileSize((1024L * 1024 * 500) + 1024L * 1024 * 1024 * 500), "500.49 GB");

        assertEquals(Formatx.fileSize(1024L * 1024 * 1024 * 1024), "1 TB");
        assertEquals(Formatx.fileSize((1024L * 1024 * 1024 * 500) + 1024L * 1024 * 1024 * 1024), "1.49 TB");
        assertEquals(Formatx.fileSize((1024L * 1024 * 1024 * 500) + 1024L * 1024 * 1024 * 1024 * 500), "500.49 TB");

        assertEquals(Formatx.fileSize(1024L * 1024 * 1024 * 1024 * 1024), "1 PB");
        assertEquals(Formatx.fileSize((1024L * 1024 * 1024 * 1024 * 500) + 1024L * 1024 * 1024 * 1024 * 1024), "1.49 PB");
        assertEquals(Formatx.fileSize((1024L * 1024 * 1024 * 1024 * 500) + 1024L * 1024 * 1024 * 1024 * 1024 * 500), "500.49 PB");

        assertEquals(Formatx.fileSize(1024L * 1024 * 1024 * 1024 * 1024 * 1024), "1 EB");
        assertEquals(Formatx.fileSize((1024L * 1024 * 1024 * 1024 * 1024 * 500) + 1024L * 1024 * 1024 * 1024 * 1024 * 1024), "1.49 EB");
    }

    @Test
    public void tesMediumSize() {
        assertEquals(Formatx.mediumFileSize(0), "0 B");
        assertEquals(Formatx.mediumFileSize(800), "800 B");

        assertEquals(Formatx.mediumFileSize(1024), "1 KB");
        assertEquals(Formatx.mediumFileSize(800 + 1024), "1.8 KB");
        assertEquals(Formatx.mediumFileSize(800 + 1024 * 500), "500.8 KB");

        assertEquals(Formatx.mediumFileSize(1024L * 1024, true), "1.0 MB");
        assertEquals(Formatx.mediumFileSize((1024 * 500) + 1024L * 1024), "1.5 MB");
        assertEquals(Formatx.mediumFileSize((1024 * 500) + 1024L * 1024 * 500), "500.5 MB");

        assertEquals(Formatx.mediumFileSize(1024L * 1024 * 1024), "1 GB");
        assertEquals(Formatx.mediumFileSize((1024L * 1024 * 500) + 1024L * 1024 * 1024), "1.5 GB");
        assertEquals(Formatx.mediumFileSize((1024L * 1024 * 500) + 1024L * 1024 * 1024 * 500), "500.5 GB");

        assertEquals(Formatx.mediumFileSize(1024L * 1024 * 1024 * 1024), "1 TB");
        assertEquals(Formatx.mediumFileSize((1024L * 1024 * 1024 * 500) + 1024L * 1024 * 1024 * 1024), "1.5 TB");
        assertEquals(Formatx.mediumFileSize((1024L * 1024 * 1024 * 500) + 1024L * 1024 * 1024 * 1024 * 500), "500.5 TB");

        assertEquals(Formatx.mediumFileSize(1024L * 1024 * 1024 * 1024 * 1024), "1 PB");
        assertEquals(Formatx.mediumFileSize((1024L * 1024 * 1024 * 1024 * 500) + 1024L * 1024 * 1024 * 1024 * 1024), "1.5 PB");
        assertEquals(Formatx.mediumFileSize((1024L * 1024 * 1024 * 1024 * 500) + 1024L * 1024 * 1024 * 1024 * 1024 * 500), "500.5 PB");

        assertEquals(Formatx.mediumFileSize(1024L * 1024 * 1024 * 1024 * 1024 * 1024), "1 EB");
        assertEquals(Formatx.mediumFileSize((1024L * 1024 * 1024 * 1024 * 1024 * 500) + 1024L * 1024 * 1024 * 1024 * 1024 * 1024), "1.5 EB");
    }

    @Test
    public void testShortFileSize() {
        assertEquals(Formatx.shortFileSize(0), "0 B");
        assertEquals(Formatx.shortFileSize(800), "800 B");

        assertEquals(Formatx.shortFileSize(1024), "1 KB");
        assertEquals(Formatx.shortFileSize(800 + 1024), "2 KB");
        assertEquals(Formatx.shortFileSize(800 + 1024 * 500), "501 KB");

        assertEquals(Formatx.shortFileSize(1024L * 1024), "1 MB");
        assertEquals(Formatx.shortFileSize((1024 * 500) + 1024L * 1024), "1 MB");
        assertEquals(Formatx.shortFileSize((1024 * 500) + 1024L * 1024 * 500), "500 MB");

        assertEquals(Formatx.shortFileSize(1024L * 1024 * 1024), "1 GB");
        assertEquals(Formatx.shortFileSize((1024L * 1024 * 500) + 1024L * 1024 * 1024), "1 GB");
        assertEquals(Formatx.shortFileSize((1024L * 1024 * 500) + 1024L * 1024 * 1024 * 500), "500 GB");

        assertEquals(Formatx.shortFileSize(1024L * 1024 * 1024 * 1024), "1 TB");
        assertEquals(Formatx.shortFileSize((1024L * 1024 * 1024 * 500) + 1024L * 1024 * 1024 * 1024), "1 TB");
        assertEquals(Formatx.shortFileSize((1024L * 1024 * 1024 * 500) + 1024L * 1024 * 1024 * 1024 * 500), "500 TB");

        assertEquals(Formatx.shortFileSize(1024L * 1024 * 1024 * 1024 * 1024), "1 PB");
        assertEquals(Formatx.shortFileSize((1024L * 1024 * 1024 * 1024 * 500) + 1024L * 1024 * 1024 * 1024 * 1024), "1 PB");
        assertEquals(Formatx.shortFileSize((1024L * 1024 * 1024 * 1024 * 500) + 1024L * 1024 * 1024 * 1024 * 1024 * 500), "500 PB");

        assertEquals(Formatx.shortFileSize(1024L * 1024 * 1024 * 1024 * 1024 * 1024), "1 EB");
        assertEquals(Formatx.shortFileSize((1024L * 1024 * 1024 * 1024 * 1024 * 500) + 1024L * 1024 * 1024 * 1024 * 1024 * 1024), "1 EB");
    }

    @Test
    public void testTotalTime() {
        // millisecond
        assertEquals(Formatx.totalTime(0L), "0s");
        assertEquals(Formatx.totalTime(-10L), "0s");
        assertEquals(Formatx.totalTime(590), "590ms");
        assertEquals(Formatx.totalTime(590, 1), "0s");

        // second
        assertEquals(Formatx.totalTime(1000 * 3), "3s");
        assertEquals(Formatx.totalTime(1000 * 3 + 590), "3s 590ms");
        assertEquals(Formatx.totalTime(1000 * 3 + 590, 1), "3s");

        // minute
        assertEquals(Formatx.totalTime(1000 * 60 * 3), "3m");
        assertEquals(Formatx.totalTime(1000 * 60 * 3 + (1000 * 23)), "3m 23s");
        assertEquals(Formatx.totalTime(1000 * 60 * 3 + (1000 * 23) + 467), "3m 23s 467ms");
        assertEquals(Formatx.totalTime(1000 * 60 * 3 + 467), "3m 467ms");
        assertEquals(Formatx.totalTime(1000 * 60 * 3 + 467, 1), "3m");

        // hour
        assertEquals(Formatx.totalTime(1000 * 60 * 60), "1h");
        assertEquals(Formatx.totalTime(1000 * 60 * 60 + (1000 * 60 * 23)), "1h 23m");
        assertEquals(Formatx.totalTime(1000 * 60 * 60 + (1000 * 60 * 23) + (1000 * 23)), "1h 23m 23s");
        assertEquals(Formatx.totalTime(1000 * 60 * 60 + (1000 * 23)), "1h 23s");
        assertEquals(Formatx.totalTime(1000 * 60 * 60 + (1000 * 60 * 23) + (1000 * 23) + 467), "1h 23m 23s 467ms");
        assertEquals(Formatx.totalTime(1000 * 60 * 60 + 467), "1h 467ms");
        assertEquals(Formatx.totalTime(1000 * 60 * 60 + 467, 1), "1h");

        // day
        assertEquals(Formatx.totalTime(1000 * 60 * 60 * 24), "1d");
        assertEquals(Formatx.totalTime(1000 * 60 * 60 * 24 + 1000 * 60 * 60 + (1000 * 60 * 23)), "1d 1h 23m");
        assertEquals(Formatx.totalTime(1000 * 60 * 60 * 24 + 1000 * 60 * 60 + (1000 * 60 * 23) + (1000 * 23)), "1d 1h 23m 23s");
        assertEquals(Formatx.totalTime(1000 * 60 * 60 * 24 + 1000 * 60 * 60 + (1000 * 23)), "1d 1h 23s");
        assertEquals(Formatx.totalTime(1000 * 60 * 60 * 24 + 1000 * 60 * 60 + (1000 * 60 * 23) + (1000 * 23) + 467), "1d 1h 23m 23s 467ms");
        assertEquals(Formatx.totalTime(1000 * 60 * 60 * 24 + 1000 * 60 * 60 + 467), "1d 1h 467ms");
        assertEquals(Formatx.totalTime(1000 * 60 * 60 * 24 + 467), "1d 467ms");
        assertEquals(Formatx.totalTime(1000 * 60 * 60 * 24 + 467, 1), "1d");
    }

    @Test
    public void testTotalTimeLevel() {
        assertEquals(Formatx.totalTime(1000 * 60 * 60 * 24 + 1000 * 60 * 60 + (1000 * 60 * 23) + (1000 * 23) + 467), "1d 1h 23m 23s 467ms");
        assertEquals(Formatx.totalTime(1000 * 60 * 60 * 24 + 1000 * 60 * 60 + (1000 * 60 * 23) + (1000 * 23) + 467, 1), "1d 1h 23m 23s");
        assertEquals(Formatx.totalTime(1000 * 60 * 60 * 24 + 1000 * 60 * 60 + (1000 * 60 * 23) + (1000 * 23) + 467, 2), "1d 1h 23m");
        assertEquals(Formatx.totalTime(1000 * 60 * 60 * 24 + 1000 * 60 * 60 + (1000 * 60 * 23) + (1000 * 23) + 467, 3), "1d 1h");
        assertEquals(Formatx.totalTime(1000 * 60 * 60 * 24 + 1000 * 60 * 60 + (1000 * 60 * 23) + (1000 * 23) + 467, 4), "1d");
        assertEquals(Formatx.totalTime(1000 * 60 * 60 * 24 + 1000 * 60 * 60 + (1000 * 60 * 23) + (1000 * 23) + 467, 5), "0s");
        assertEquals(Formatx.totalTime(1000 * 60 * 60 * 24 + 1000 * 60 * 60 + (1000 * 60 * 23) + (1000 * 23) + 467, 6), "0s");
    }

    @Test
    public void testTotalTimeShort() {
        // millisecond
        assertEquals(Formatx.totalTimeShort(0L), "0s");
        assertEquals(Formatx.totalTimeShort(590), "590ms");
        assertEquals(Formatx.totalTimeShort(590, 1), "0s");

        // second
        assertEquals(Formatx.totalTimeShort(1000 * 3), "3s");
        assertEquals(Formatx.totalTimeShort(1000 * 3 + 590), "3s590ms");
        assertEquals(Formatx.totalTimeShort(1000 * 3 + 590, 1), "3s");

        // minute
        assertEquals(Formatx.totalTimeShort(1000 * 60 * 3), "3m");
        assertEquals(Formatx.totalTimeShort(1000 * 60 * 3 + (1000 * 23)), "3m23s");
        assertEquals(Formatx.totalTimeShort(1000 * 60 * 3 + (1000 * 23) + 467), "3m23s467ms");
        assertEquals(Formatx.totalTimeShort(1000 * 60 * 3 + 467), "3m467ms");
        assertEquals(Formatx.totalTimeShort(1000 * 60 * 3 + 467, 1), "3m");

        // hour
        assertEquals(Formatx.totalTimeShort(1000 * 60 * 60), "1h");
        assertEquals(Formatx.totalTimeShort(1000 * 60 * 60 + (1000 * 60 * 23)), "1h23m");
        assertEquals(Formatx.totalTimeShort(1000 * 60 * 60 + (1000 * 60 * 23) + (1000 * 23)), "1h23m23s");
        assertEquals(Formatx.totalTimeShort(1000 * 60 * 60 + (1000 * 23)), "1h23s");
        assertEquals(Formatx.totalTimeShort(1000 * 60 * 60 + (1000 * 60 * 23) + (1000 * 23) + 467), "1h23m23s467ms");
        assertEquals(Formatx.totalTimeShort(1000 * 60 * 60 + 467), "1h467ms");
        assertEquals(Formatx.totalTimeShort(1000 * 60 * 60 + 467, 1), "1h");

        // day
        assertEquals(Formatx.totalTimeShort(1000 * 60 * 60 * 24), "1d");
        assertEquals(Formatx.totalTimeShort(1000 * 60 * 60 * 24 + 1000 * 60 * 60 + (1000 * 60 * 23)), "1d1h23m");
        assertEquals(Formatx.totalTimeShort(1000 * 60 * 60 * 24 + 1000 * 60 * 60 + (1000 * 60 * 23) + (1000 * 23)), "1d1h23m23s");
        assertEquals(Formatx.totalTimeShort(1000 * 60 * 60 * 24 + 1000 * 60 * 60 + (1000 * 23)), "1d1h23s");
        assertEquals(Formatx.totalTimeShort(1000 * 60 * 60 * 24 + 1000 * 60 * 60 + (1000 * 60 * 23) + (1000 * 23) + 467), "1d1h23m23s467ms");
        assertEquals(Formatx.totalTimeShort(1000 * 60 * 60 * 24 + 1000 * 60 * 60 + 467), "1d1h467ms");
        assertEquals(Formatx.totalTimeShort(1000 * 60 * 60 * 24 + 467), "1d467ms");
        assertEquals(Formatx.totalTimeShort(1000 * 60 * 60 * 24 + 467, 1), "1d");
    }

    @Test
    public void testTotalTimeZH() {
        // millisecond
        assertEquals(Formatx.totalTimeZH(0L), "0秒");
        assertEquals(Formatx.totalTimeZH(590), "590毫秒");
        assertEquals(Formatx.totalTimeZH(590, 1), "0秒");

        // second
        assertEquals(Formatx.totalTimeZH(1000 * 3), "3秒");
        assertEquals(Formatx.totalTimeZH(1000 * 3 + 590), "3秒 590毫秒");
        assertEquals(Formatx.totalTimeZH(1000 * 3 + 590, 1), "3秒");

        // minute
        assertEquals(Formatx.totalTimeZH(1000 * 60 * 3), "3分");
        assertEquals(Formatx.totalTimeZH(1000 * 60 * 3 + (1000 * 23)), "3分 23秒");
        assertEquals(Formatx.totalTimeZH(1000 * 60 * 3 + (1000 * 23) + 467), "3分 23秒 467毫秒");
        assertEquals(Formatx.totalTimeZH(1000 * 60 * 3 + 467), "3分 467毫秒");
        assertEquals(Formatx.totalTimeZH(1000 * 60 * 3 + 467, 1), "3分");

        // hour
        assertEquals(Formatx.totalTimeZH(1000 * 60 * 60), "1小时");
        assertEquals(Formatx.totalTimeZH(1000 * 60 * 60 + (1000 * 60 * 23)), "1小时 23分");
        assertEquals(Formatx.totalTimeZH(1000 * 60 * 60 + (1000 * 60 * 23) + (1000 * 23)), "1小时 23分 23秒");
        assertEquals(Formatx.totalTimeZH(1000 * 60 * 60 + (1000 * 23)), "1小时 23秒");
        assertEquals(Formatx.totalTimeZH(1000 * 60 * 60 + (1000 * 60 * 23) + (1000 * 23) + 467), "1小时 23分 23秒 467毫秒");
        assertEquals(Formatx.totalTimeZH(1000 * 60 * 60 + 467), "1小时 467毫秒");
        assertEquals(Formatx.totalTimeZH(1000 * 60 * 60 + 467, 1), "1小时");

        // day
        assertEquals(Formatx.totalTimeZH(1000 * 60 * 60 * 24), "1天");
        assertEquals(Formatx.totalTimeZH(1000 * 60 * 60 * 24 + 1000 * 60 * 60 + (1000 * 60 * 23)), "1天 1小时 23分");
        assertEquals(Formatx.totalTimeZH(1000 * 60 * 60 * 24 + 1000 * 60 * 60 + (1000 * 60 * 23) + (1000 * 23)), "1天 1小时 23分 23秒");
        assertEquals(Formatx.totalTimeZH(1000 * 60 * 60 * 24 + 1000 * 60 * 60 + (1000 * 23)), "1天 1小时 23秒");
        assertEquals(Formatx.totalTimeZH(1000 * 60 * 60 * 24 + 1000 * 60 * 60 + (1000 * 60 * 23) + (1000 * 23) + 467), "1天 1小时 23分 23秒 467毫秒");
        assertEquals(Formatx.totalTimeZH(1000 * 60 * 60 * 24 + 1000 * 60 * 60 + 467), "1天 1小时 467毫秒");
        assertEquals(Formatx.totalTimeZH(1000 * 60 * 60 * 24 + 467), "1天 467毫秒");
        assertEquals(Formatx.totalTimeZH(1000 * 60 * 60 * 24 + 467, 1), "1天");
    }

    @Test
    public void testTotalTimeZHShort() {
        // millisecond
        assertEquals(Formatx.totalTimeZHShort(0L), "0秒");
        assertEquals(Formatx.totalTimeZHShort(590), "590毫秒");
        assertEquals(Formatx.totalTimeZHShort(590, 1), "0秒");

        // second
        assertEquals(Formatx.totalTimeZHShort(1000 * 3), "3秒");
        assertEquals(Formatx.totalTimeZHShort(1000 * 3 + 590), "3秒590毫秒");
        assertEquals(Formatx.totalTimeZHShort(1000 * 3 + 590, 1), "3秒");

        // minute
        assertEquals(Formatx.totalTimeZHShort(1000 * 60 * 3), "3分");
        assertEquals(Formatx.totalTimeZHShort(1000 * 60 * 3 + (1000 * 23)), "3分23秒");
        assertEquals(Formatx.totalTimeZHShort(1000 * 60 * 3 + (1000 * 23) + 467), "3分23秒467毫秒");
        assertEquals(Formatx.totalTimeZHShort(1000 * 60 * 3 + 467), "3分467毫秒");
        assertEquals(Formatx.totalTimeZHShort(1000 * 60 * 3 + 467, 1), "3分");

        // hour
        assertEquals(Formatx.totalTimeZHShort(1000 * 60 * 60), "1小时");
        assertEquals(Formatx.totalTimeZHShort(1000 * 60 * 60 + (1000 * 60 * 23)), "1小时23分");
        assertEquals(Formatx.totalTimeZHShort(1000 * 60 * 60 + (1000 * 60 * 23) + (1000 * 23)), "1小时23分23秒");
        assertEquals(Formatx.totalTimeZHShort(1000 * 60 * 60 + (1000 * 23)), "1小时23秒");
        assertEquals(Formatx.totalTimeZHShort(1000 * 60 * 60 + (1000 * 60 * 23) + (1000 * 23) + 467), "1小时23分23秒467毫秒");
        assertEquals(Formatx.totalTimeZHShort(1000 * 60 * 60 + 467), "1小时467毫秒");
        assertEquals(Formatx.totalTimeZHShort(1000 * 60 * 60 + 467, 1), "1小时");

        // day
        assertEquals(Formatx.totalTimeZHShort(1000 * 60 * 60 * 24), "1天");
        assertEquals(Formatx.totalTimeZHShort(1000 * 60 * 60 * 24 + 1000 * 60 * 60 + (1000 * 60 * 23)), "1天1小时23分");
        assertEquals(Formatx.totalTimeZHShort(1000 * 60 * 60 * 24 + 1000 * 60 * 60 + (1000 * 60 * 23) + (1000 * 23)), "1天1小时23分23秒");
        assertEquals(Formatx.totalTimeZHShort(1000 * 60 * 60 * 24 + 1000 * 60 * 60 + (1000 * 23)), "1天1小时23秒");
        assertEquals(Formatx.totalTimeZHShort(1000 * 60 * 60 * 24 + 1000 * 60 * 60 + (1000 * 60 * 23) + (1000 * 23) + 467), "1天1小时23分23秒467毫秒");
        assertEquals(Formatx.totalTimeZHShort(1000 * 60 * 60 * 24 + 1000 * 60 * 60 + 467), "1天1小时467毫秒");
        assertEquals(Formatx.totalTimeZHShort(1000 * 60 * 60 * 24 + 467), "1天467毫秒");
        assertEquals(Formatx.totalTimeZHShort(1000 * 60 * 60 * 24 + 467, 1), "1天");
    }

    @Test
    public void testCount() {
        assertEquals(Formatx.count(0), "0");
        assertEquals(Formatx.count(-10), "0");
        assertEquals(Formatx.count(999), "999");
        assertEquals(Formatx.count(1000), "1k");
        assertEquals(Formatx.count(1099), "1k");
        assertEquals(Formatx.count(1100), "1.1k");
        assertEquals(Formatx.count(1500), "1.5k");
        assertEquals(Formatx.count(1999), "1.9k");
        assertEquals(Formatx.count(10000), "1w");
        assertEquals(Formatx.count(10999), "1w");
        assertEquals(Formatx.count(15001), "1.5w");
        assertEquals(Formatx.count(101000), "10.1w");
    }

    @Test
    public void testStartChars() {
        assertEquals(Formatx.hiddenStartChars("12345", 4), "****5");
        assertEquals(Formatx.hiddenStartChars("123456", 4), "****56");
        assertEquals(Formatx.hiddenStartChars("1234", 4), "****");
        assertEquals(Formatx.hiddenStartChars("123", 4), "***");
        assertEquals(Formatx.hiddenStartChars("13509853689", 4), "****9853689");
        assertEquals(Formatx.hiddenStartChars(null, 4), "");

        assertEquals(Formatx.hiddenStartChars("12345", 4, '$'), "$$$$5");
        assertEquals(Formatx.hiddenStartChars("123456", 4, '$'), "$$$$56");
        assertEquals(Formatx.hiddenStartChars("1234", 4, '$'), "$$$$");
        assertEquals(Formatx.hiddenStartChars("123", 4, '$'), "$$$");
        assertEquals(Formatx.hiddenStartChars("13509853689", 4, '$'), "$$$$9853689");
        assertEquals(Formatx.hiddenStartChars(null, 4, '$'), "");
    }

    @Test
    public void testHiddenChars() {
        assertEquals(Formatx.hiddenMiddleChars("12345", 4), "****5");
        assertEquals(Formatx.hiddenMiddleChars("123456", 4), "1****6");
        assertEquals(Formatx.hiddenMiddleChars("1234", 4), "****");
        assertEquals(Formatx.hiddenMiddleChars("123", 4), "***");
        assertEquals(Formatx.hiddenMiddleChars("13509853689", 4), "135****3689");
        assertEquals(Formatx.hiddenMiddleChars(null, 4), "");

        assertEquals(Formatx.hiddenMiddleChars("12345", 4, '$'), "$$$$5");
        assertEquals(Formatx.hiddenMiddleChars("123456", 4, '$'), "1$$$$6");
        assertEquals(Formatx.hiddenMiddleChars("1234", 4, '$'), "$$$$");
        assertEquals(Formatx.hiddenMiddleChars("123", 4, '$'), "$$$");
        assertEquals(Formatx.hiddenMiddleChars("13509853689", 4, '$'), "135$$$$3689");
        assertEquals(Formatx.hiddenMiddleChars(null, 4, '$'), "");
    }

    @Test
    public void testEndChars() {
        assertEquals(Formatx.hiddenEndChars("12345", 4), "1****");
        assertEquals(Formatx.hiddenEndChars("123456", 4), "12****");
        assertEquals(Formatx.hiddenEndChars("1234", 4), "****");
        assertEquals(Formatx.hiddenEndChars("123", 4), "***");
        assertEquals(Formatx.hiddenEndChars("13509853689", 4), "1350985****");
        assertEquals(Formatx.hiddenEndChars(null, 4), "");

        assertEquals(Formatx.hiddenEndChars("12345", 4, '$'), "1$$$$");
        assertEquals(Formatx.hiddenEndChars("123456", 4, '$'), "12$$$$");
        assertEquals(Formatx.hiddenEndChars("1234", 4, '$'), "$$$$");
        assertEquals(Formatx.hiddenEndChars("123", 4, '$'), "$$$");
        assertEquals(Formatx.hiddenEndChars("13509853689", 4, '$'), "1350985$$$$");
        assertEquals(Formatx.hiddenEndChars(null, 4, '$'), "");
    }

    @Test
    public void testPad() {
        assertEquals(Formatx.pad(10, 5), "00010");
        assertEquals(Formatx.pad(10L, 5), "00010");
    }
}
