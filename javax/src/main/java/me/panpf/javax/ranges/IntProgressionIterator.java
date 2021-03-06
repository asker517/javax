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

import me.panpf.javax.collections.IntIterator;

import java.util.NoSuchElementException;

/**
 * An iterator over a progression of values of type `Int`.
 */
public class IntProgressionIterator extends IntIterator {

    private int step;
    private int finalElement;
    private boolean hasNext;
    private int next;


    /**
     * An iterator over a progression of values of type `Int`.
     *
     * @param step the number by which the value is incremented on each step.
     */
    public IntProgressionIterator(int first, int last, int step) {
        this.step = step;
        finalElement = last;
        hasNext = step > 0 ? first <= last : first >= last;
        next = hasNext ? first : finalElement;
    }

    @Override
    public boolean hasNext() {
        return hasNext;
    }

    @Override
    public Integer nextInt() {
        int value = next;
        if (value == finalElement) {
            if (!hasNext()) throw new NoSuchElementException();
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
