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
public class FloatRange implements Iterable<Float>, ClosedRange<Float> {

    private final float start;
    private final float endInclusive;
    private final float step;

    public FloatRange(float start, float endInclusive, float step) {
        if (step == 0) throw new IllegalArgumentException("Step must be non-zero");
        this.start = start;
        this.endInclusive = endInclusive;
        this.step = step;
    }

    @NotNull
    public Iterator<Float> iterator() {
        return new FloatRangeIterator(this.start, this.endInclusive, this.step);
    }

    @Override
    public boolean contains(@NotNull Float value) {
        return start <= value && value <= endInclusive;
    }

    public boolean isEmpty() {
        return this.step > 0 ? this.start > this.endInclusive : this.start < this.endInclusive;
    }

    @Override
    public boolean equals(@Nullable Object other) {
        return other instanceof FloatRange && (this.isEmpty() && ((FloatRange) other).isEmpty() || this.start == ((FloatRange) other).start && this.endInclusive == ((FloatRange) other).endInclusive && this.step == ((FloatRange) other).step);
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
    public Float getStart() {
        return this.start;
    }

    @NotNull
    @Override
    public Float getEndInclusive() {
        return this.endInclusive;
    }

    public float getStep() {
        return this.step;
    }

    @NotNull
    public static FloatRange fromClosedRange(float rangeStart, float rangeEnd, float step) {
        return new FloatRange(rangeStart, rangeEnd, step);
    }
}