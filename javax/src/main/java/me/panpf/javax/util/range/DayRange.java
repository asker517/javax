package me.panpf.javax.util.range;

import me.panpf.javax.util.Datex;
import org.jetbrains.annotations.NotNull;

import java.util.Date;

public final class DayRange extends DateRange {

    public DayRange(@NotNull Date start, @NotNull Date endInclusive, int step) {
        super(start, endInclusive, step);
    }

    @NotNull
    public Date nextDate(@NotNull Date date) {
        return Datex.addDayOfMonth(date, this.getStep());
    }
}
