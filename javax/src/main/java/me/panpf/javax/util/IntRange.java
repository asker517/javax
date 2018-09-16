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
public class IntRange implements Iterable<Integer>, ClosedRange<Integer> {

    private final int start;
    private final int endInclusive;
    private final int step;

    public IntRange(int start, int endInclusive, int step) {
        if (step == 0) throw new IllegalArgumentException("Step must be non-zero");
        this.start = start;
        this.endInclusive = this.getProgressionLastElement(start, endInclusive, step);
        this.step = step;
    }

    @NotNull
    @Override
    public Integer getStart() {
        return this.start;
    }

    @NotNull
    @Override
    public Integer getEndInclusive() {
        return this.endInclusive;
    }

    @Override
    public boolean contains(@NotNull Integer value) {
        return start <= value && value <= endInclusive;
    }

    public int getStep() {
        return this.step;
    }

    @NotNull
    public Iterator<Integer> iterator() {
        return new IntIterator(this.start, this.endInclusive, this.step);
    }

    public boolean isEmpty() {
        return this.step > 0 ? this.start > this.endInclusive : this.start < this.endInclusive;
    }

    @Override
    public boolean equals(@Nullable Object other) {
        return other instanceof IntRange && (this.isEmpty() && ((IntRange) other).isEmpty() || this.start == ((IntRange) other).start && this.endInclusive == ((IntRange) other).endInclusive && this.step == ((IntRange) other).step);
    }

    @Override
    public int hashCode() {
        return this.isEmpty() ? -1 : 31 * (31 * this.start + this.endInclusive) + this.step;
    }

    @NotNull
    public String toString() {
        return this.step > 0 ? this.start + ".." + this.endInclusive + " step " + this.step : this.start + " downTo " + this.endInclusive + " step " + -this.step;
    }

    public final int getProgressionLastElement(int start, int end, int step) {
        if (step > 0) {
            return end - Numberx.differenceModulo(end, start, step);
        } else if (step < 0) {
            return end + Numberx.differenceModulo(start, end, -step);
        } else {
            throw new IllegalArgumentException("Step is zero.");
        }
    }

    @NotNull
    public static IntRange fromClosedRange(int rangeStart, int rangeEnd, int step) {
        return new IntRange(rangeStart, rangeEnd, step);
    }
}