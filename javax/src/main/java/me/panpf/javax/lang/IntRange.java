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

package me.panpf.javax.lang;

import org.jetbrains.annotations.NotNull;

import java.util.Iterator;

public class IntRange implements Iterable<Integer> {
    private int first;
    private int endInclusive;
    private int step;

    public IntRange(int first, int endInclusive, int step) {
        this.first = first;
        this.endInclusive = endInclusive;
        this.step = step;
    }

    @NotNull
    @Override
    public Iterator<Integer> iterator() {
        return new IntProgressionIterator(first, endInclusive, step);
    }
}
