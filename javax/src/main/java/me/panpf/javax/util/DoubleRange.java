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

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import java.util.Iterator;

@SuppressWarnings("WeakerAccess")
public class DoubleRange implements Iterable<Double>, ClosedRange<Double> {

    private final double start;
    private final double endInclusive;
    private final double step;

    public DoubleRange(double start, double endInclusive, double step) {
        if (step == 0) throw new IllegalArgumentException("Step must be non-zero");
        this.start = start;
        this.endInclusive = endInclusive;
        this.step = step;
    }

    @NotNull
    public Iterator<Double> iterator() {
        return new DoubleRangeIterator(this.start, this.endInclusive, this.step);
    }

    @Override
    public boolean contains(@NotNull Double value) {
        return start <= value && value <= endInclusive;
    }

    public boolean isEmpty() {
        return this.step > 0 ? this.start > this.endInclusive : this.start < this.endInclusive;
    }

    @Override
    public boolean equals(@Nullable Object other) {
        return other instanceof DoubleRange && (this.isEmpty() && ((DoubleRange) other).isEmpty() || this.start == ((DoubleRange) other).start && this.endInclusive == ((DoubleRange) other).endInclusive && this.step == ((DoubleRange) other).step);
    }

    @Override
    public int hashCode() {
        return (int) (this.isEmpty() ? -1 : 31 * (31 * this.start + this.endInclusive) + this.step);
    }

    @NotNull
    public String toString() {
        return this.step > 0 ? this.start + ".." + this.endInclusive + " step " + this.step : this.start + " downTo " + this.endInclusive + " step " + -this.step;
    }

    @NotNull
    @Override
    public Double getStart() {
        return this.start;
    }

    @NotNull
    @Override
    public Double getEndInclusive() {
        return this.endInclusive;
    }

    public double getStep() {
        return this.step;
    }

    @NotNull
    public static DoubleRange fromClosedRange(double rangeStart, double rangeEnd, double step) {
        return new DoubleRange(rangeStart, rangeEnd, step);
    }
}