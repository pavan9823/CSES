package com.example.intervals;

import java.util.Comparator;

public class IntervalComparator implements Comparator<Interval> {
    @Override
    public int compare(Interval o1, Interval o2) {
        return o1.s-o2.s;
    }
}
