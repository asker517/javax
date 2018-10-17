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
public class CharRange implements Iterable<Character>, ClosedRange<Character> {

    private final char start;
    private final char endInclusive;
    private final int step;

    public CharRange(char start, char endInclusive, int step) {
        if (step == 0) throw new IllegalArgumentException("Step must be non-zero");
        this.start = start;
        this.endInclusive = (char) Rangex.getProgressionLastElement(start, endInclusive, step);
        this.step = step;
    }

    @NotNull
    public Iterator<Character> iterator() {
        return new CharRangeIterator(this.start, this.endInclusive, this.step);
    }

    @Override
    public boolean contains(@NotNull Character value) {
        return start <= value && value <= endInclusive;
    }

    public boolean isEmpty() {
        return this.step > 0 ? this.start > this.endInclusive : this.start < this.endInclusive;
    }

    @Override
    public boolean equals(@Nullable Object other) {
        return other instanceof CharRange && (this.isEmpty() && ((CharRange) other).isEmpty() || this.start == ((CharRange) other).start && this.endInclusive == ((CharRange) other).endInclusive && this.step == ((CharRange) other).step);
    }

    @Override
    public int hashCode() {
        return (this.isEmpty() ? -1 : 31 * (31 * this.start + this.endInclusive) + this.step);
    }

    @NotNull
    public String toString() {
        return this.step > 0 ? this.start + ".." + this.endInclusive + " step " + this.step : this.start + " downTo " + this.endInclusive + " step " + -this.step;
    }

    @NotNull
    @Override
    public Character getStart() {
        return this.start;
    }

    @NotNull
    @Override
    public Character getEndInclusive() {
        return this.endInclusive;
    }

    public int getStep() {
        return this.step;
    }

    @NotNull
    public static CharRange fromClosedRange(char rangeStart, char rangeEnd, int step) {
        return new CharRange(rangeStart, rangeEnd, step);
    }
}