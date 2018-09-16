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

package me.panpf.javax.util;

import me.panpf.javax.lang.Numberx;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import java.util.Iterator;

@SuppressWarnings("WeakerAccess")
public class LongRange implements Iterable<Long>, ClosedRange<Long> {

    private final long start;
    private final long endInclusive;
    private final long step;

    public LongRange(long start, long endInclusive, long step) {
        if (step == 0) throw new IllegalArgumentException("Step must be non-zero");
        this.start = start;
        this.endInclusive = this.getProgressionLastElement(start, endInclusive, step);
        this.step = step;
    }

    @NotNull
    @Override
    public Long getStart() {
        return this.start;
    }

    @NotNull
    @Override
    public Long getEndInclusive() {
        return this.endInclusive;
    }

    @Override
    public boolean contains(@NotNull Long value) {
        return start <= value && value <= endInclusive;
    }

    public long getStep() {
        return this.step;
    }

    @NotNull
    public Iterator<Long> iterator() {
        return new LongIterator(this.start, this.endInclusive, this.step);
    }

    public boolean isEmpty() {
        return this.step > 0 ? this.start > this.endInclusive : this.start < this.endInclusive;
    }

    @Override
    public boolean equals(@Nullable Object other) {
        return other instanceof LongRange && (this.isEmpty() && ((LongRange) other).isEmpty() || this.start == ((LongRange) other).start && this.endInclusive == ((LongRange) other).endInclusive && this.step == ((LongRange) other).step);
    }

    @Override
    public int hashCode() {
        return (int) (this.isEmpty() ? -1 : 31 * (31 * this.start + this.endInclusive) + this.step);
    }

    @NotNull
    public String toString() {
        return this.step > 0 ? this.start + ".." + this.endInclusive + " step " + this.step : this.start + " downTo " + this.endInclusive + " step " + -this.step;
    }

    public final long getProgressionLastElement(long start, long end, long step) {
        if (step > 0) {
            return end - Numberx.differenceModulo(end, start, step);
        } else if (step < 0) {
            return end + Numberx.differenceModulo(start, end, -step);
        } else {
            throw new IllegalArgumentException("Step is zero.");
        }
    }

    @NotNull
    public static LongRange fromClosedRange(long rangeStart, long rangeEnd, long step) {
        return new LongRange(rangeStart, rangeEnd, step);
    }
}