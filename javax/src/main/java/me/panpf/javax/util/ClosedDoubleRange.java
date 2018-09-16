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

@SuppressWarnings("WeakerAccess")
public class ClosedDoubleRange implements ClosedRange<Double> {

    private final double start;
    private final double endInclusive;

    public ClosedDoubleRange(double start, double endInclusive) {
        this.start = start;
        this.endInclusive = endInclusive;
    }

    @Override
    public boolean contains(@NotNull Double value) {
        return start <= value && value <= endInclusive;
    }

    @Override
    public boolean isEmpty() {
        return this.start < this.endInclusive;
    }

    @Override
    public boolean equals(@Nullable Object other) {
        return other instanceof ClosedDoubleRange && (this.isEmpty() && ((ClosedDoubleRange) other).isEmpty()
                || this.start == ((ClosedDoubleRange) other).start && this.endInclusive == ((ClosedDoubleRange) other).endInclusive);
    }

    @Override
    public int hashCode() {
        return this.isEmpty() ? -1 : 31 * ((Double) start).hashCode() + ((Double) endInclusive).hashCode();
    }

    @NotNull
    public String toString() {
        return this.start + ".." + this.endInclusive;
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
}
