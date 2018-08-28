package me.panpf.javax.util;

import org.junit.Assert;
import org.junit.Test;

public class FormatTest {

    @Test
    public void testPercent() {
        Assert.assertEquals(Formatx.percent(0.46), "46%");
        Assert.assertEquals(Formatx.percent(3, 8), "37.5%");
        Assert.assertEquals(Formatx.percent(3, 8, 2, true), "37.50%");

        Assert.assertEquals(Formatx.percent(0.46), "46%");
        Assert.assertEquals(Formatx.percent(3d, 8d), "37.5%");
        Assert.assertEquals(Formatx.percent(3d, 8d, 2, true), "37.50%");

        Assert.assertEquals(Formatx.percent(0.46f), "46%");
        Assert.assertEquals(Formatx.percent(3f, 8f), "37.5%");
        Assert.assertEquals(Formatx.percent(3f, 8f, 2, true), "37.50%");

        Assert.assertEquals(Formatx.percent(3L, 8L), "37.5%");
        Assert.assertEquals(Formatx.percent(3L, 8L, 2, true), "37.50%");
    }

    @Test
    public void testFileSize() {
        Assert.assertEquals(Formatx.fileSize(0L), "0 B");
        Assert.assertEquals(Formatx.fileSize(800), "800 B");

        Assert.assertEquals(Formatx.fileSize(1024), "1 KB");
        Assert.assertEquals(Formatx.fileSize(800 + 1024), "1.78 KB");
        Assert.assertEquals(Formatx.fileSize(800 + 1024 * 500), "500.78 KB");

        Assert.assertEquals(Formatx.fileSize(1024L * 1024, true), "1.00 MB");
        Assert.assertEquals(Formatx.fileSize((1024 * 500) + 1024L * 1024), "1.49 MB");
        Assert.assertEquals(Formatx.fileSize((1024 * 500) + 1024L * 1024 * 500), "500.49 MB");

        Assert.assertEquals(Formatx.fileSize(1024L * 1024 * 1024), "1 GB");
        Assert.assertEquals(Formatx.fileSize((1024L * 1024 * 500) + 1024L * 1024 * 1024), "1.49 GB");
        Assert.assertEquals(Formatx.fileSize((1024L * 1024 * 500) + 1024L * 1024 * 1024 * 500), "500.49 GB");

        Assert.assertEquals(Formatx.fileSize(1024L * 1024 * 1024 * 1024), "1 TB");
        Assert.assertEquals(Formatx.fileSize((1024L * 1024 * 1024 * 500) + 1024L * 1024 * 1024 * 1024), "1.49 TB");
        Assert.assertEquals(Formatx.fileSize((1024L * 1024 * 1024 * 500) + 1024L * 1024 * 1024 * 1024 * 500), "500.49 TB");

        Assert.assertEquals(Formatx.fileSize(1024L * 1024 * 1024 * 1024 * 1024), "1 PB");
        Assert.assertEquals(Formatx.fileSize((1024L * 1024 * 1024 * 1024 * 500) + 1024L * 1024 * 1024 * 1024 * 1024), "1.49 PB");
        Assert.assertEquals(Formatx.fileSize((1024L * 1024 * 1024 * 1024 * 500) + 1024L * 1024 * 1024 * 1024 * 1024 * 500), "500.49 PB");

        Assert.assertEquals(Formatx.fileSize(1024L * 1024 * 1024 * 1024 * 1024 * 1024), "1 EB");
        Assert.assertEquals(Formatx.fileSize((1024L * 1024 * 1024 * 1024 * 1024 * 500) + 1024L * 1024 * 1024 * 1024 * 1024 * 1024), "1.49 EB");
    }

    @Test
    public void tesMediumSize() {
        Assert.assertEquals(Formatx.mediumFileSize(0), "0 B");
        Assert.assertEquals(Formatx.mediumFileSize(800), "800 B");

        Assert.assertEquals(Formatx.mediumFileSize(1024), "1 KB");
        Assert.assertEquals(Formatx.mediumFileSize(800 + 1024), "1.8 KB");
        Assert.assertEquals(Formatx.mediumFileSize(800 + 1024 * 500), "500.8 KB");

        Assert.assertEquals(Formatx.mediumFileSize(1024L * 1024, true), "1.0 MB");
        Assert.assertEquals(Formatx.mediumFileSize((1024 * 500) + 1024L * 1024), "1.5 MB");
        Assert.assertEquals(Formatx.mediumFileSize((1024 * 500) + 1024L * 1024 * 500), "500.5 MB");

        Assert.assertEquals(Formatx.mediumFileSize(1024L * 1024 * 1024), "1 GB");
        Assert.assertEquals(Formatx.mediumFileSize((1024L * 1024 * 500) + 1024L * 1024 * 1024), "1.5 GB");
        Assert.assertEquals(Formatx.mediumFileSize((1024L * 1024 * 500) + 1024L * 1024 * 1024 * 500), "500.5 GB");

        Assert.assertEquals(Formatx.mediumFileSize(1024L * 1024 * 1024 * 1024), "1 TB");
        Assert.assertEquals(Formatx.mediumFileSize((1024L * 1024 * 1024 * 500) + 1024L * 1024 * 1024 * 1024), "1.5 TB");
        Assert.assertEquals(Formatx.mediumFileSize((1024L * 1024 * 1024 * 500) + 1024L * 1024 * 1024 * 1024 * 500), "500.5 TB");

        Assert.assertEquals(Formatx.mediumFileSize(1024L * 1024 * 1024 * 1024 * 1024), "1 PB");
        Assert.assertEquals(Formatx.mediumFileSize((1024L * 1024 * 1024 * 1024 * 500) + 1024L * 1024 * 1024 * 1024 * 1024), "1.5 PB");
        Assert.assertEquals(Formatx.mediumFileSize((1024L * 1024 * 1024 * 1024 * 500) + 1024L * 1024 * 1024 * 1024 * 1024 * 500), "500.5 PB");

        Assert.assertEquals(Formatx.mediumFileSize(1024L * 1024 * 1024 * 1024 * 1024 * 1024), "1 EB");
        Assert.assertEquals(Formatx.mediumFileSize((1024L * 1024 * 1024 * 1024 * 1024 * 500) + 1024L * 1024 * 1024 * 1024 * 1024 * 1024), "1.5 EB");
    }

    @Test
    public void testShortFileSize() {
        Assert.assertEquals(Formatx.shortFileSize(0), "0 B");
        Assert.assertEquals(Formatx.shortFileSize(800), "800 B");

        Assert.assertEquals(Formatx.shortFileSize(1024), "1 KB");
        Assert.assertEquals(Formatx.shortFileSize(800 + 1024), "2 KB");
        Assert.assertEquals(Formatx.shortFileSize(800 + 1024 * 500), "501 KB");

        Assert.assertEquals(Formatx.shortFileSize(1024L * 1024), "1 MB");
        Assert.assertEquals(Formatx.shortFileSize((1024 * 500) + 1024L * 1024), "1 MB");
        Assert.assertEquals(Formatx.shortFileSize((1024 * 500) + 1024L * 1024 * 500), "500 MB");

        Assert.assertEquals(Formatx.shortFileSize(1024L * 1024 * 1024), "1 GB");
        Assert.assertEquals(Formatx.shortFileSize((1024L * 1024 * 500) + 1024L * 1024 * 1024), "1 GB");
        Assert.assertEquals(Formatx.shortFileSize((1024L * 1024 * 500) + 1024L * 1024 * 1024 * 500), "500 GB");

        Assert.assertEquals(Formatx.shortFileSize(1024L * 1024 * 1024 * 1024), "1 TB");
        Assert.assertEquals(Formatx.shortFileSize((1024L * 1024 * 1024 * 500) + 1024L * 1024 * 1024 * 1024), "1 TB");
        Assert.assertEquals(Formatx.shortFileSize((1024L * 1024 * 1024 * 500) + 1024L * 1024 * 1024 * 1024 * 500), "500 TB");

        Assert.assertEquals(Formatx.shortFileSize(1024L * 1024 * 1024 * 1024 * 1024), "1 PB");
        Assert.assertEquals(Formatx.shortFileSize((1024L * 1024 * 1024 * 1024 * 500) + 1024L * 1024 * 1024 * 1024 * 1024), "1 PB");
        Assert.assertEquals(Formatx.shortFileSize((1024L * 1024 * 1024 * 1024 * 500) + 1024L * 1024 * 1024 * 1024 * 1024 * 500), "500 PB");

        Assert.assertEquals(Formatx.shortFileSize(1024L * 1024 * 1024 * 1024 * 1024 * 1024), "1 EB");
        Assert.assertEquals(Formatx.shortFileSize((1024L * 1024 * 1024 * 1024 * 1024 * 500) + 1024L * 1024 * 1024 * 1024 * 1024 * 1024), "1 EB");
    }

    @Test
    public void testTotalTime() {
        // millisecond
        Assert.assertEquals(Formatx.totalTime(0L), "0ms");
        Assert.assertEquals(Formatx.totalTime(590), "590ms");
        Assert.assertEquals(Formatx.totalTime(590, true), "0s");

        // second
        Assert.assertEquals(Formatx.totalTime(1000 * 3), "3s");
        Assert.assertEquals(Formatx.totalTime(1000 * 3 + 590), "3s590ms");
        Assert.assertEquals(Formatx.totalTime(1000 * 3 + 590, true), "3s");

        // minute
        Assert.assertEquals(Formatx.totalTime(1000 * 60 * 3), "3m");
        Assert.assertEquals(Formatx.totalTime(1000 * 60 * 3 + (1000 * 23)), "3m23s");
        Assert.assertEquals(Formatx.totalTime(1000 * 60 * 3 + (1000 * 23) + 467), "3m23s467ms");
        Assert.assertEquals(Formatx.totalTime(1000 * 60 * 3 + 467), "3m467ms");
        Assert.assertEquals(Formatx.totalTime(1000 * 60 * 3 + 467, true), "3m");

        // hour
        Assert.assertEquals(Formatx.totalTime(1000 * 60 * 60), "1h");
        Assert.assertEquals(Formatx.totalTime(1000 * 60 * 60 + (1000 * 60 * 23)), "1h23m");
        Assert.assertEquals(Formatx.totalTime(1000 * 60 * 60 + (1000 * 60 * 23) + (1000 * 23)), "1h23m23s");
        Assert.assertEquals(Formatx.totalTime(1000 * 60 * 60 + (1000 * 23)), "1h23s");
        Assert.assertEquals(Formatx.totalTime(1000 * 60 * 60 + (1000 * 60 * 23) + (1000 * 23) + 467), "1h23m23s467ms");
        Assert.assertEquals(Formatx.totalTime(1000 * 60 * 60 + 467), "1h467ms");
        Assert.assertEquals(Formatx.totalTime(1000 * 60 * 60 + 467, true), "1h");

        // day
        Assert.assertEquals(Formatx.totalTime(1000 * 60 * 60 * 24), "1d");
        Assert.assertEquals(Formatx.totalTime(1000 * 60 * 60 * 24 + 1000 * 60 * 60 + (1000 * 60 * 23)), "1d1h23m");
        Assert.assertEquals(Formatx.totalTime(1000 * 60 * 60 * 24 + 1000 * 60 * 60 + (1000 * 60 * 23) + (1000 * 23)), "1d1h23m23s");
        Assert.assertEquals(Formatx.totalTime(1000 * 60 * 60 * 24 + 1000 * 60 * 60 + (1000 * 23)), "1d1h23s");
        Assert.assertEquals(Formatx.totalTime(1000 * 60 * 60 * 24 + 1000 * 60 * 60 + (1000 * 60 * 23) + (1000 * 23) + 467), "1d1h23m23s467ms");
        Assert.assertEquals(Formatx.totalTime(1000 * 60 * 60 * 24 + 1000 * 60 * 60 + 467), "1d1h467ms");
        Assert.assertEquals(Formatx.totalTime(1000 * 60 * 60 * 24 + 467), "1d467ms");
        Assert.assertEquals(Formatx.totalTime(1000 * 60 * 60 * 24 + 467, true), "1d");
    }
}
