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

import me.panpf.javax.util.Transformer2;
import org.jetbrains.annotations.NotNull;

import java.util.Iterator;

/**
 * A sequence which returns the results of applying the given [transformer] function to the values
 * in the underlying [sequence], where the transformer function takes the index of the value in the underlying
 * sequence along with the value itself.
 */
public class TransformingIndexedSequence<T, R> implements Sequence<R> {

    @NotNull
    private Sequence<T> sequence;
    @NotNull
    private Transformer2<Integer, T, R> transformer;

    public TransformingIndexedSequence(@NotNull Sequence<T> sequence, @NotNull Transformer2<Integer, T, R> transformer) {
        this.sequence = sequence;
        this.transformer = transformer;
    }

    @NotNull
    @Override
    public Iterator<R> iterator() {
        return new Iterator<R>() {
            @NotNull
            private Iterator<T> iterator = sequence.iterator();

            int index = 0;

            @Override
            public R next() {
                return transformer.transform(index++, iterator.next());
            }

            @Override
            public boolean hasNext() {
                return iterator.hasNext();
            }

            @Override
            public void remove() {

            }
        };
    }
}
