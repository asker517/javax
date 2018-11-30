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

import me.panpf.javax.util.Transformer;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import java.util.Iterator;
import java.util.NoSuchElementException;

public class FlatteningSequence<T, R, E> implements Sequence<E> {

    @NotNull
    private Sequence<T> sequence;
    @NotNull
    private Transformer<T, R> transformer;
    @NotNull
    private Transformer<R, Iterator<E>> iteratorTransformer;

    public FlatteningSequence(@NotNull Sequence<T> sequence, @NotNull Transformer<T, R> transformer, @NotNull Transformer<R, Iterator<E>> iterator) {
        this.sequence = sequence;
        this.transformer = transformer;
        this.iteratorTransformer = iterator;
    }

    @NotNull
    @Override
    public Iterator<E> iterator() {
        return new Iterator<E>() {

            @NotNull
            private Iterator<T> iterator = sequence.iterator();
            @Nullable
            private Iterator<E> itemIterator = null;

            @Override
            public E next() {
                if (!ensureItemIterator() || itemIterator == null) throw new NoSuchElementException();
                return itemIterator.next();
            }

            @Override
            public boolean hasNext() {
                return ensureItemIterator();
            }

            private boolean ensureItemIterator() {
                if (itemIterator == null || !itemIterator.hasNext()) {
                    itemIterator = null;
                }

                while (itemIterator == null) {
                    if (!iterator.hasNext()) {
                        return false;
                    } else {
                        T element = iterator.next();
                        Iterator<E> nextItemIterator = iteratorTransformer.transform(transformer.transform(element));
                        if (nextItemIterator.hasNext()) {
                            itemIterator = nextItemIterator;
                            return true;
                        }
                    }
                }
                return true;
            }

            @Override
            public void remove() {

            }
        };
    }
}