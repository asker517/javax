package me.panpf.javax.test.util;

import me.panpf.javax.util.Stopwatch;
import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;

public final class StopwatchTest {
    @Test
    public final void testStartTime() throws InterruptedException {
        boolean var6;
        label13: {
            long time = System.currentTimeMillis();
            Thread.sleep(1000L);
            Stopwatch stopwatch = new Stopwatch(false);
            long var10000 = time + (long)1000;
            long var10002 = time + (long)1010;
            long var4 = stopwatch.getStartTime();
            if (var10000 <= var4) {
                if (var10002 >= var4) {
                    var6 = true;
                    break label13;
                }
            }

            var6 = false;
        }

        Assert.assertTrue(var6);
    }

    @Test
    public final void testCountLap() throws InterruptedException {
        long var10000;
        Stopwatch stopwatch;
        Stopwatch.CountLap firstCountLap;
        long var10002;
        long var3;
        boolean var9;
        label93: {
            stopwatch = new Stopwatch(false);
            Thread.sleep(1000L);
            firstCountLap = stopwatch.countLap();
            var10000 = stopwatch.getStartTime() + (long)1000;
            var10002 = stopwatch.getStartTime() + (long)1010;
            var3 = firstCountLap.getTime();
            if (var10000 <= var3) {
                if (var10002 >= var3) {
                    var9 = true;
                    break label93;
                }
            }

            var9 = false;
        }

        long var10001;
        label88: {
            Assert.assertTrue(var9);
            var10000 = (long)1010;
            var10001 = (long)1000;
            var3 = firstCountLap.getDistanceLastTime();
            if (var10001 <= var3) {
                if (var10000 >= var3) {
                    var9 = true;
                    break label88;
                }
            }

            var9 = false;
        }

        label83: {
            Assert.assertTrue(var9);
            var10000 = (long)1010;
            var10001 = (long)1000;
            var3 = firstCountLap.getDistanceStartTime();
            if (var10001 <= var3) {
                if (var10000 >= var3) {
                    var9 = true;
                    break label83;
                }
            }

            var9 = false;
        }

        long var4;
        Stopwatch.CountLap secondCountLap;
        label78: {
            Assert.assertTrue(var9);
            Thread.sleep(2000L);
            secondCountLap = stopwatch.countLap();
            var10000 = stopwatch.getStartTime() + (long)3000;
            var10002 = stopwatch.getStartTime() + (long)3020;
            var4 = secondCountLap.getTime();
            if (var10000 <= var4) {
                if (var10002 >= var4) {
                    var9 = true;
                    break label78;
                }
            }

            var9 = false;
        }

        label73: {
            Assert.assertTrue(var9);
            var10000 = (long)2020;
            var10001 = (long)2000;
            var4 = secondCountLap.getDistanceLastTime();
            if (var10001 <= var4) {
                if (var10000 >= var4) {
                    var9 = true;
                    break label73;
                }
            }

            var9 = false;
        }

        label68: {
            Assert.assertTrue(var9);
            var10000 = (long)3020;
            var10001 = (long)3000;
            var4 = secondCountLap.getDistanceStartTime();
            if (var10001 <= var4) {
                if (var10000 >= var4) {
                    var9 = true;
                    break label68;
                }
            }

            var9 = false;
        }

        long var5;
        Stopwatch.CountLap thirdCountLap;
        label63: {
            Assert.assertTrue(var9);
            Thread.sleep(3000L);
            thirdCountLap = stopwatch.countLap();
            var10000 = stopwatch.getStartTime() + (long)6000;
            var10002 = stopwatch.getStartTime() + (long)6030;
            var5 = thirdCountLap.getTime();
            if (var10000 <= var5) {
                if (var10002 >= var5) {
                    var9 = true;
                    break label63;
                }
            }

            var9 = false;
        }

        label58: {
            Assert.assertTrue(var9);
            var10000 = (long)3030;
            var10001 = (long)3000;
            var5 = thirdCountLap.getDistanceLastTime();
            if (var10001 <= var5) {
                if (var10000 >= var5) {
                    var9 = true;
                    break label58;
                }
            }

            var9 = false;
        }

        label53: {
            Assert.assertTrue(var9);
            var10000 = (long)6030;
            var10001 = (long)6000;
            var5 = thirdCountLap.getDistanceStartTime();
            if (var10001 <= var5) {
                if (var10000 >= var5) {
                    var9 = true;
                    break label53;
                }
            }

            var9 = false;
        }

        Assert.assertTrue(var9);
    }

    @Test
    public final void testEnd() throws InterruptedException {
        Stopwatch stopwatch = new Stopwatch(false);
        Assert.assertFalse(stopwatch.isEnded());
        stopwatch.countLap();
        Thread.sleep(1000L);
        stopwatch.countLap();
        Thread.sleep(1000L);
        stopwatch.countLap();
        stopwatch.end();
        Assert.assertTrue(stopwatch.isEnded());

        try {
            stopwatch.countLap();
            Assert.fail();
        } catch (Exception ignored) {
        }

        stopwatch.end();
    }

    @Test
    public final void testHistory() throws InterruptedException {
        boolean var3;
        label13: {
            Stopwatch stopwatch = new Stopwatch(false);
            stopwatch.countLap();
            Thread.sleep(1000L);
            stopwatch.countLap();
            Thread.sleep(1000L);
            stopwatch.countLap();
            Assert.assertNull(stopwatch.getHistoryList());
            Stopwatch stopwatch2 = new Stopwatch(true);
            stopwatch2.countLap();
            Thread.sleep(1000L);
            stopwatch2.countLap();
            Thread.sleep(1000L);
            stopwatch2.countLap();
            ArrayList var10000 = stopwatch2.getHistoryList();
            if (var10000 != null) {
                if (var10000.size() == 3) {
                    var3 = true;
                    break label13;
                }
            }

            var3 = false;
        }

        Assert.assertTrue(var3);
    }
}
