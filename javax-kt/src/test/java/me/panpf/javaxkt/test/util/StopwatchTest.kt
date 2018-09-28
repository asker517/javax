package me.panpf.javaxkt.test.util

import me.panpf.javaxkt.util.Stopwatch
import org.junit.Assert
import org.junit.Test

class StopwatchTest {

    @Test
    fun testStartTime() {
        /*
         * 允许有 10 毫秒的误差
         */

        val time = System.currentTimeMillis()

        Thread.sleep(1000)

        val stopwatchTimer = Stopwatch()
        Assert.assertTrue(stopwatchTimer.startTime in time + 1000..time + 1010)
    }

    @Test
    fun testCountLap() {
        /*
         * 允许有 10 毫秒的误差，暂停次数越多误差越大
         */

        val stopwatchTimer = Stopwatch()

        Thread.sleep(1000)
        val firstCountLap = stopwatchTimer.countLap()
        Assert.assertTrue(firstCountLap.time in stopwatchTimer.startTime + 1000..stopwatchTimer.startTime + 1010)
        Assert.assertTrue(firstCountLap.distanceLastTime in 1000..1010)
        Assert.assertTrue(firstCountLap.distanceStartTime in 1000..1010)

        Thread.sleep(2000)
        val secondCountLap = stopwatchTimer.countLap()
        Assert.assertTrue(secondCountLap.time in stopwatchTimer.startTime + 3000..stopwatchTimer.startTime + 3020)
        Assert.assertTrue(secondCountLap.distanceLastTime in 2000..2020)
        Assert.assertTrue(secondCountLap.distanceStartTime in 3000..3020)

        Thread.sleep(3000)
        val thirdCountLap = stopwatchTimer.countLap()
        Assert.assertTrue(thirdCountLap.time in stopwatchTimer.startTime + 6000..stopwatchTimer.startTime + 6030)
        Assert.assertTrue(thirdCountLap.distanceLastTime in 3000..3030)
        Assert.assertTrue(thirdCountLap.distanceStartTime in 6000..6030)
    }

    @Test
    fun testEnd() {

        val stopwatchTimer = Stopwatch()

        Assert.assertFalse(stopwatchTimer.isEnded)

        stopwatchTimer.countLap()

        Thread.sleep(1000)
        stopwatchTimer.countLap()

        Thread.sleep(1000)
        stopwatchTimer.countLap()

        stopwatchTimer.end()

        Assert.assertTrue(stopwatchTimer.isEnded)

        try {
            stopwatchTimer.countLap()
            Assert.fail()
        } catch (e: Exception) {

        }

        stopwatchTimer.end()
    }

    @Test
    fun testHistory() {
        val stopwatchTimer = Stopwatch()

        stopwatchTimer.countLap()
        Thread.sleep(1000)
        stopwatchTimer.countLap()
        Thread.sleep(1000)
        stopwatchTimer.countLap()

        Assert.assertNull(stopwatchTimer.historyList)


        val stopwatchTimer2 = Stopwatch(true)

        stopwatchTimer2.countLap()
        Thread.sleep(1000)
        stopwatchTimer2.countLap()
        Thread.sleep(1000)
        stopwatchTimer2.countLap()

        Assert.assertTrue(stopwatchTimer2.historyList?.size == 3)
    }
}