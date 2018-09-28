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

package me.panpf.javaxkt.util

/**
 * The implementation of a stopwatch timer can not only implement a complete stopwatch program, but also can be used to record the time of each node of a time-consuming task.
 * @param saveHistory If true, saves CountLap history
 */
class Stopwatch(saveHistory: Boolean = false) {

    /**
     * Starting time
     */
    val startTime = System.currentTimeMillis()

    /**
     * End Time
     */
    var endTime = 0L
        private set

    /**
     * Last CountLap
     */
    var lastCountLap: CountLap? = null
        private set

    /**
     * CountLap history
     */
    val historyList = if (saveHistory) ArrayList<CountLap>() else null

    /**
     * Return true if it is ended. Cannot execute the countLap() method after the end
     */
    val isEnded
        get(): Boolean = endTime != 0L

    /**
     * Count lap and return this CountLap information
     */
    fun countLap(): CountLap {
        if (isEnded) throw IllegalStateException("It has ended")

        val currentTime = System.currentTimeMillis()
        val lastLap = lastCountLap
        val distanceFromLastTime = if (lastLap != null) currentTime - lastLap.time else currentTime - startTime
        val distanceFromStartTime = currentTime - startTime
        val newCountLap = CountLap(currentTime, distanceFromLastTime, distanceFromStartTime)

        historyList?.add(newCountLap)
        this.lastCountLap = newCountLap
        return newCountLap
    }

    /**
     * End and no longer available. Cannot execute the countLap() method after the end
     */
    fun end() {
        if (isEnded) return
        endTime = System.currentTimeMillis()
    }

    /**
     * Store count lap information
     */
    class CountLap(
            /**
             * Counting time
             */
            val time: Long,
            /**
             * Distance from last time
             */
            val distanceLastTime: Long,
            /**
             * Distance to start time
             */
            val distanceStartTime: Long)
}