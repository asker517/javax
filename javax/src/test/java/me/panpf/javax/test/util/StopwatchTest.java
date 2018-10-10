package me.panpf.javax.test.util;

import me.panpf.javax.util.Collectionx;
import me.panpf.javax.util.Rangex;
import me.panpf.javax.util.Stopwatch;
import org.junit.Assert;
import org.junit.Test;

public final class StopwatchTest {

    @Test
    public void testStartTime() throws InterruptedException {
        /*
         * 允许有 10 毫秒的误差
         */

        long time = System.currentTimeMillis();

        Thread.sleep(1000L);

        Stopwatch stopwatch = new Stopwatch();
        Assert.assertTrue(Rangex.in(stopwatch.startTime, time + 1000L, time + 1010L));
    }

    @Test
    public void testCountLap() throws InterruptedException {
        /*
         * 允许有 10 毫秒的误差，暂停次数越多误差越大
         */

        Stopwatch stopwatch = new Stopwatch();

        Thread.sleep(1000L);
        Stopwatch.CountLap firstCountLap = stopwatch.countLap();
        Assert.assertTrue(Rangex.in(firstCountLap.time, stopwatch.startTime + 1000L, stopwatch.startTime + 1010L));
        Assert.assertTrue(Rangex.in(firstCountLap.distanceLastTime, 1000L, 1010L));
        Assert.assertTrue(Rangex.in(firstCountLap.distanceStartTime, 1000L, 1010L));

        Thread.sleep(2000L);
        Stopwatch.CountLap secondCountLap = stopwatch.countLap();
        Assert.assertTrue(Rangex.in(secondCountLap.time, stopwatch.startTime + 3000L, stopwatch.startTime + 3020L));
        Assert.assertTrue(Rangex.in(secondCountLap.distanceLastTime, 2000L, 2020L));
        Assert.assertTrue(Rangex.in(secondCountLap.distanceStartTime, 3000L, 3020L));

        Thread.sleep(3000L);
        Stopwatch.CountLap thirdCountLap = stopwatch.countLap();
        Assert.assertTrue(Rangex.in(thirdCountLap.time, stopwatch.startTime + 6000L, stopwatch.startTime + 6030L));
        Assert.assertTrue(Rangex.in(thirdCountLap.distanceLastTime, 3000L, 3030L));
        Assert.assertTrue(Rangex.in(thirdCountLap.distanceStartTime, 6000L, 6030L));
    }

    @Test
    public void testEnd() throws InterruptedException {

        Stopwatch stopwatch = new Stopwatch();

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
    public void testHistory() throws InterruptedException {
        Stopwatch stopwatch = new Stopwatch();

        stopwatch.countLap();
        Thread.sleep(1000L);
        stopwatch.countLap();
        Thread.sleep(1000L);
        stopwatch.countLap();

        Assert.assertNull(stopwatch.historyList);


        Stopwatch stopwatch2 = new Stopwatch(true);

        stopwatch2.countLap();
        Thread.sleep(1000L);
        stopwatch2.countLap();
        Thread.sleep(1000L);
        stopwatch2.countLap();

        Assert.assertEquals(Collectionx.count(stopwatch2.historyList), 3);
    }
}
