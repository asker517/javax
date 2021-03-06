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

package me.panpf.javax.ranges;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import java.util.Iterator;

/**
 * A progression of values of type `Int`.
 */
@SuppressWarnings("WeakerAccess")
public class IntProgression implements Iterable<Integer> {
    private int first;
    private int last;
    private int step;

    IntProgression(int start, int endInclusive, int step) {
        if (step == 0) throw new IllegalArgumentException("Step must be non-zero");
        this.first = start;
        this.last = Rangex.getProgressionLastElement(start, endInclusive, step);
        this.step = step;
    }

    @NotNull
    public Iterator<Integer> iterator() {
        return new IntProgressionIterator(first, last, this.step);
    }

    public boolean isEmpty() {
        return this.step > 0 ? this.first > this.last : this.first < this.last;
    }

    @Override
    public boolean equals(@Nullable Object other) {
        return other instanceof IntProgression && (
                this.isEmpty() && ((IntProgression) other).isEmpty()
                        || this.first == ((IntProgression) other).first
                        && this.last == ((IntProgression) other).last
                        && this.step == ((IntProgression) other).step);
    }

    @Override
    public int hashCode() {
        return (this.isEmpty() ? -1 : 31 * (31 * this.first + this.last) + this.step);
    }

    @NotNull
    public String toString() {
        return this.step > 0 ? this.first + ".." + this.last + " step " + this.step : this.first + " downTo " + this.last + " step " + -this.step;
    }

    @NotNull
    public static IntProgression fromClosedRange(int rangeStart, int rangeEndInclusive, int step) {
        return new IntProgression(rangeStart, rangeEndInclusive, step);
    }

    public int getFirst() {
        return first;
    }

    public int getLast() {
        return last;
    }

    public int getStep() {
        return step;
    }
}
