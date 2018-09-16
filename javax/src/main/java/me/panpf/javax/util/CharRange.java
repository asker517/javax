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
public class CharRange implements Iterable<Character>, ClosedRange<Character> {

    private final char start;
    private final char endInclusive;
    private final char step;

    public CharRange(char start, char endInclusive, char step) {
        if (step == 0) throw new IllegalArgumentException("Step must be non-zero");
        this.start = start;
        this.endInclusive = this.getProgressionLastElement(start, endInclusive, step);
        this.step = step;
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

    @Override
    public boolean contains(@NotNull Character value) {
        return start <= value && value <= endInclusive;
    }

    public char getStep() {
        return this.step;
    }

    @NotNull
    public Iterator<Character> iterator() {
        return new CharIterator(this.start, this.endInclusive, this.step);
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

    public final char getProgressionLastElement(int start, int end, int step) {
        if (step > 0) {
            return (char) (end - Numberx.differenceModulo(end, start, step));
        } else if (step < 0) {
            return (char) (end + Numberx.differenceModulo(start, end, -step));
        } else {
            throw new IllegalArgumentException("Step is zero.");
        }
    }

    @NotNull
    public static CharRange fromClosedRange(char rangeStart, char rangeEnd, char step) {
        return new CharRange(rangeStart, rangeEnd, step);
    }

}