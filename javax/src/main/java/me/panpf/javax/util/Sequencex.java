package me.panpf.javax.util;

import java.util.Iterator;
import java.util.concurrent.atomic.AtomicReference;

public class Sequencex {

    /**
     * Returns a wrapper sequence that provides values of this sequence, but ensures it can be iterated only one time.
     * <p>
     * The operation is _intermediate_ and _stateless_.
     * <p>
     * [IllegalStateException] is thrown on iterating the returned sequence from the second time.
     */
    public static <T> Sequence<T> constrainOnce(Sequence<T> sequence) {
        return sequence instanceof ConstrainedOnceSequence ? sequence : new ConstrainedOnceSequence<T>(sequence);
    }

    private static class ConstrainedOnceSequence<T> implements Sequence<T> {

        private AtomicReference<Sequence<T>> sequenceRef;

        ConstrainedOnceSequence(Sequence<T> sequence) {
            this.sequenceRef = new AtomicReference<Sequence<T>>(sequence);
        }

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
     *
     * The operation is _terminal_.
     */
    public static <T> void forEach(Sequence<T> sequence, Action<T> action) {
        Iterator<T> iterator = sequence.iterator();
        while (iterator.hasNext()) {
            action.action(iterator.next());
        }
    }
}
