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

package me.panpf.javax.sequences;

import me.panpf.javax.util.LazyValue;
import me.panpf.javax.util.Premisex;
import org.jetbrains.annotations.NotNull;

import java.util.Iterator;
import java.util.NoSuchElementException;

/**
 * A sequence that skips [startIndex] values from the underlying [sequence]
 * and stops returning values right before [endIndex], i.e. stops at `endIndex - 1`
 */
public class SubSequence<T> implements Sequence<T>, DropTakeSequence<T> {

    @NotNull
    private Sequence<T> sequence;
    private int startIndex;
    private int endIndex;

    public SubSequence(@NotNull Sequence<T> sequence, final int startIndex, final int endIndex) {
        Premisex.require(startIndex >= 0, new LazyValue<String>() {
            @NotNull
            @Override
            public String get() {
                return "startIndex should be non-negative, but is " + startIndex;
            }
        });
        Premisex.require(endIndex >= 0, new LazyValue<String>() {
            @NotNull
            @Override
            public String get() {
                return "endIndex should be non-negative, but is " + endIndex;
            }
        });
        Premisex.require(endIndex >= startIndex, new LazyValue<String>() {
            @NotNull
            @Override
            public String get() {
                return "endIndex should be not less than startIndex, but was $endIndex < " + startIndex;
            }
        });
        this.sequence = sequence;
        this.startIndex = startIndex;
        this.endIndex = endIndex;
    }

    private int getCount() {
        return endIndex - startIndex;
    }

    @NotNull
    @Override
    public Sequence<T> drop(int n) {
        return n >= getCount() ? (Sequence<T>) Sequencex.emptySequence() : new SubSequence<>(sequence, startIndex + n, endIndex);
    }

    @NotNull
    @Override
    public Sequence<T> take(int n) {
        return n >= getCount() ? this : new SubSequence<>(sequence, startIndex, startIndex + n);
    }

    @NotNull
    @Override
    public Iterator<T> iterator() {
        return new Iterator<T>() {
            @NotNull
            private Iterator<T> iterator = sequence.iterator();
            private int position = 0;

            // Shouldn't be called from constructor to avoid premature iteration
            private void drop() {
                while (position < startIndex && iterator.hasNext()) {
                    iterator.next();
                    position++;
                }
            }

            @Override
            public boolean hasNext() {
                drop();
                return (position < endIndex) && iterator.hasNext();
            }

            @NotNull
            @Override
            public T next() {
                drop();
                if (position >= endIndex) throw new NoSuchElementException();
                position++;
                return iterator.next();
            }

            @Override
            public void remove() {

            }
        };
    }
}