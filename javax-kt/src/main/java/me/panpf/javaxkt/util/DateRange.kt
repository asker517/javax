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

import java.util.*

abstract class DateRange(override val start: Date, override val endInclusive: Date, val step: Int) : Iterable<Date>, ClosedRange<Date> {

    override fun iterator(): Iterator<Date> = IteratorInternal(this, start, endInclusive, step)

    override fun contains(value: Date): Boolean {
        @Suppress("ConvertTwoComparisonsToRangeCheck")
        return when {
            step > 0 -> value >= start && value <= endInclusive
            step < 0 -> value <= start && value >= endInclusive
            else -> false
        }
    }

    override fun isEmpty(): Boolean {
        return when {
            step > 0 -> start > endInclusive
            step < 0 -> start < endInclusive
            else -> true
        }
    }

    abstract fun nextDate(date: Date): Date

    class IteratorInternal(private val range: DateRange, first: Date, private val last: Date, private val step: Int) : Iterator<Date> {
        var hasNext: Boolean
        var next: Date

        init {
            hasNext = when {
                step > 0 -> first <= last
                step < 0 -> first >= last
                else -> false
            }
            next = if (hasNext) first else last
        }

        override fun hasNext(): Boolean {
            return hasNext
        }

        override fun next(): Date {
            if (!hasNext) {
                throw NoSuchElementException()
            }

            val result = next
            next = range.nextDate(next)
            hasNext = when {
                step > 0 -> next <= last
                step < 0 -> next >= last
                else -> false
            }
            return result
        }
    }
}

class YearRange(start: Date, endInclusive: Date, step: Int) : DateRange(start, endInclusive, step) {
    override fun nextDate(date: Date): Date = date.addYear(step)
}

class MonthRange(start: Date, endInclusive: Date, step: Int) : DateRange(start, endInclusive, step) {
    override fun nextDate(date: Date): Date = date.addMonth(step)
}

class DayRange(start: Date, endInclusive: Date, step: Int) : DateRange(start, endInclusive, step) {
    override fun nextDate(date: Date): Date = date.addDayOfMonth(step)
}

class HourRange(start: Date, endInclusive: Date, step: Int) : DateRange(start, endInclusive, step) {
    override fun nextDate(date: Date): Date = date.addHourOfDay(step)
}

class MinuteRange(start: Date, endInclusive: Date, step: Int) : DateRange(start, endInclusive, step) {

    override fun nextDate(date: Date): Date = date.addMinute(step)
}
class SecondRange(start: Date, endInclusive: Date, step: Int) : DateRange(start, endInclusive, step) {

    override fun nextDate(date: Date): Date = date.addSecond(step)
}
class MillisecondRange(start: Date, endInclusive: Date, step: Int) : DateRange(start, endInclusive, step) {
    override fun nextDate(date: Date): Date = date.addMillisecond(step)
}

