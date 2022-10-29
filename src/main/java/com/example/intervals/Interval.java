package com.example.intervals;

public class Interval {
    int s;
    int e;

    public Interval(int s, int e) {
        this.s = s;
        this.e = e;
    }

    @Override
    public String toString() {
        return "{" + s + ","+ e + "}";
    }
}
