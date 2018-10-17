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

import java.util.Iterator;
import java.util.NoSuchElementException;

/**
 * An iterator over a progression of values of type `Float`.
 */
@SuppressWarnings("WeakerAccess")
public class FloatRangeIterator implements Iterator<Float> {
    private float step;

    private float finalElement;
    private float next;
    private boolean hasNext;

    public FloatRangeIterator(float start, float endInclusive, float step) {
        if (step == 0) throw new IllegalArgumentException("Step must be non-zero");
        this.step = step;
        finalElement = endInclusive;
        hasNext = step > 0 ? start <= endInclusive : start >= endInclusive;
        next = hasNext ? start : finalElement;
    }

    @Override
    public boolean hasNext() {
        return hasNext;
    }

    @Override
    public Float next() {
        float value = next;
        if (step > 0 ? value >= finalElement : value <= finalElement) {
            if (!hasNext()) {
                throw new NoSuchElementException();
            }
            hasNext = false;
        } else {
            next += step;
        }
        return value;
    }

    @Override
    public void remove() {
        throw new UnsupportedOperationException("remove");
    }
}
