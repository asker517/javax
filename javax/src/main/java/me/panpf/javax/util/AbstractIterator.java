package me.panpf.javax.util;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import java.util.Iterator;
import java.util.NoSuchElementException;

public abstract class AbstractIterator<T> implements Iterator<T> {

    @NotNull
    private State state = State.NotReady;
    @Nullable
    private T nextValue = null;

    @Override
    public boolean hasNext() {
        Premisex.require(state != State.Failed);
        if (state == State.Done) {
            return false;
        } else if (state == State.Ready) {
            return true;
        } else {
            return tryToComputeNext();
        }
    }

    @Override
    @NotNull
    public T next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        state = State.NotReady;
        return nextValue;
    }

    private Boolean tryToComputeNext() {
        state = State.Failed;
        computeNext();
        return state == State.Ready;
    }

    /**
     * Computes the next item in the iterator.
     * <p>
     * This callback method should call one of these two methods:
     * <p>
     * * [setNext] with the next value of the iteration
     * * [done] to indicate there are no more elements
     * <p>
     * Failure to call either method will result in the iteration terminating with a failed state
     */
    protected abstract void computeNext();

    /**
     * Sets the next value in the iteration, called from the [computeNext] function
     */
    protected void setNext(T value) {
        nextValue = value;
        state = State.Ready;
    }

    /**
     * Sets the state to done so that the iteration terminates.
     */
    protected void done() {
        state = State.Done;
    }
}
