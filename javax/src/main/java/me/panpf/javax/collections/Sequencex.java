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

package me.panpf.javax.collections;

import me.panpf.javax.util.Action;
import org.jetbrains.annotations.NotNull;

import java.util.Iterator;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Sequence tool method
 */
public class Sequencex {

    private Sequencex() {
    }


    /*
     * *****************************************************************************************************************
     * From kotlin standard library
     * *****************************************************************************************************************
     */


    /**
     * Returns a wrapper sequence that provides values of this sequence, but ensures it can be iterated only one time.
     * <p>
     * The operation is _intermediate_ and _stateless_.
     * <p>
     * [IllegalStateException] is thrown on iterating the returned sequence from the second time.
     */
    public static <T> Sequence<T> constrainOnce(@NotNull Sequence<T> sequence) {
        return sequence instanceof ConstrainedOnceSequence ? sequence : new ConstrainedOnceSequence<T>(sequence);
    }

    private static class ConstrainedOnceSequence<T> implements Sequence<T> {

        private AtomicReference<Sequence<T>> sequenceRef;

        ConstrainedOnceSequence(Sequence<T> sequence) {
            this.sequenceRef = new AtomicReference<Sequence<T>>(sequence);
        }

        @NotNull
        @Override
        public Iterator<T> iterator() {
            Sequence<T> sequence = sequenceRef.getAndSet(null);
            if (sequence == null) {
                throw new IllegalStateException("This sequence can be consumed only once.");
            }
            return sequence.iterator();
        }
    }

    /**
     * Performs the given [action] on each element.
     * <p>
     * The operation is _terminal_.
     */
    public static <T> void forEach(@NotNull Sequence<T> sequence, @NotNull Action<T> action) {
        for (T aSequence : sequence) {
            action.action(aSequence);
        }
    }
}
