package me.panpf.javax.util.range;

import org.jetbrains.annotations.NotNull;

import java.util.Date;
import java.util.Iterator;
import java.util.NoSuchElementException;

public abstract class DateRange implements Iterable<Date>, ClosedRange<Date> {

    @NotNull
    private final Date start;
    @NotNull
    private final Date endInclusive;
    private final int step;

    public DateRange(@NotNull Date start, @NotNull Date endInclusive, int step) {
        super();
        this.start = start;
        this.endInclusive = endInclusive;
        this.step = step;
    }

    @NotNull
    public Iterator<Date> iterator() {
        return (new DateRange.IteratorInternal(this, this.getStart(), this.getEndInclusive(), this.step));
    }

    public boolean contains(@NotNull Date value) {
        return this.step > 0 ? value.compareTo(this.getStart()) >= 0 && value.compareTo(this.getEndInclusive()) <= 0 : (this.step < 0 && (value.compareTo(this.getStart()) <= 0 && value.compareTo(this.getEndInclusive()) >= 0));
    }

    public boolean isEmpty() {
        return this.step > 0 ? this.getStart().compareTo(this.getEndInclusive()) > 0 : (this.step >= 0 || this.getStart().compareTo(this.getEndInclusive()) < 0);
    }

    @NotNull
    public abstract Date nextDate(@NotNull Date var1);

    @NotNull
    public Date getStart() {
        return this.start;
    }

    @NotNull
    public Date getEndInclusive() {
        return this.endInclusive;
    }

    public final int getStep() {
        return this.step;
    }

    public static final class IteratorInternal implements Iterator<Date> {
        private boolean hasNext;
        @NotNull
        private Date next;
        private final DateRange range;
        private final Date last;
        private final int step;

        IteratorInternal(@NotNull DateRange range, @NotNull Date first, @NotNull Date last, int step) {
            super();
            this.range = range;
            this.last = last;
            this.step = step;
            this.hasNext = this.step > 0 ? first.compareTo(this.last) <= 0 : (this.step < 0 && first.compareTo(this.last) >= 0);
            this.next = this.hasNext ? first : this.last;
        }

        public boolean hasNext() {
            return this.hasNext;
        }

        @NotNull
        public Date next() {
            if (!this.hasNext) {
                throw (new NoSuchElementException());
            } else {
                Date result = this.next;
                this.next = this.range.nextDate(this.next);
                this.hasNext = this.step > 0 ? this.next.compareTo(this.last) <= 0 : (this.step < 0 && this.next.compareTo(this.last) >= 0);
                return result;
            }
        }

        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }
}
