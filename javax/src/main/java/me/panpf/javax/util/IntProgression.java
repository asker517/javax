package me.panpf.javax.util;

import me.panpf.javax.lang.IntProgressionIterator;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import java.util.Iterator;

public class IntProgression implements Iterable<Integer> {

    private final int first;
    private final int last;
    private final int step;

    public IntProgression(int start, int endInclusive, int step) {
        if (step == 0) {
            throw new IllegalArgumentException("Step must be non-zero");
        } else {
            this.first = start;
            this.last = this.getProgressionLastElement(start, endInclusive, step);
            this.step = step;
        }
    }

    public int getFirst() {
        return this.first;
    }

    public int getLast() {
        return this.last;
    }

    public final int getStep() {
        return this.step;
    }

    @NotNull
    public Iterator<Integer> iterator() {
        return new IntProgressionIterator(this.first, this.last, this.step);
    }

    public boolean isEmpty() {
        return this.step > 0 ? this.first > this.last : this.first < this.last;
    }

    public boolean equals(@Nullable Object other) {
        return other instanceof IntProgression && (this.isEmpty() && ((IntProgression) other).isEmpty() || this.first == ((IntProgression) other).first && this.last == ((IntProgression) other).last && this.step == ((IntProgression) other).step);
    }

    public int hashCode() {
        return this.isEmpty() ? -1 : 31 * (31 * this.first + this.last) + this.step;
    }

    @NotNull
    public String toString() {
        return this.step > 0 ? this.first + ".." + this.last + " step " + this.step : this.first + " downTo " + this.last + " step " + -this.step;
    }

    public final int getProgressionLastElement(int start, int end, int step) {
        if (step > 0) {
            return end - this.differenceModulo(end, start, step);
        } else if (step < 0) {
            return end + this.differenceModulo(start, end, -step);
        } else {
            throw new IllegalArgumentException("Step is zero.");
        }
    }

    private final int mod(int a, int b) {
        int mod = a % b;
        return mod >= 0 ? mod : mod + b;
    }

    private final long mod(long a, long b) {
        long mod = a % b;
        return mod >= 0L ? mod : mod + b;
    }

    private final int differenceModulo(int a, int b, int c) {
        return this.mod(this.mod(a, c) - this.mod(b, c), c);
    }

    private final long differenceModulo(long a, long b, long c) {
        return this.mod(this.mod(a, c) - this.mod(b, c), c);
    }

    @NotNull
    public static final IntProgression fromClosedRange(int rangeStart, int rangeEnd, int step) {
        return new IntProgression(rangeStart, rangeEnd, step);
    }
}