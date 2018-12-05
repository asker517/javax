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

import me.panpf.javax.collections.Collectionx;
import me.panpf.javax.ranges.Rangex;
import me.panpf.javax.util.Stopwatch;
import org.junit.Assert;
import org.junit.Test;

public final class StopwatchTest {

    @Test
    public void testStartTime() throws InterruptedException {
        /*
         * 允许有 100 毫秒的误差
         */

        long time = System.currentTimeMillis();

        Thread.sleep(1000L);

        Stopwatch stopwatch = new Stopwatch();
        Assert.assertTrue(Rangex.in(stopwatch.startTime, time + 1000L, time + 1100L));
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
