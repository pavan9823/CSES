package com.example.intervals;

import java.util.*;

public class MergeIntervals1 {

    public static void main(String[] args) {
        List<Interval> list = new ArrayList<>();
        // [1,3],[2,6],[8,10],[15,18]
        list.add(new Interval(1,3));
        list.add(new Interval(2,6));
        list.add(new Interval(8,10));
        list.add(new Interval(15,18));
        List<Interval> res = merge(list);
        System.out.println(res);

    }

    private static List<Interval> merge(List<Interval> intervals) {
        List<Interval> res = new ArrayList<>();
        Stack<Interval> stack = new Stack<>();

        Collections.sort(intervals, new Comparator<Interval>() {
            @Override
            public int compare(Interval o1, Interval o2) {
                return o1.s-o2.s;
            }
        });

        stack.add(intervals.get(0));
        for (int i = 1; i < intervals.size() ; i++) {
            Interval top = stack.peek();
            if(top.e<intervals.get(i).s)
                stack.push(intervals.get(i));
            else if(top.e<intervals.get(i).e)
                stack.peek().e = intervals.get(i).e;
        }

        while(!stack.isEmpty())
            res.add(stack.pop());

        Collections.sort(res, new Comparator<Interval>() {
            @Override
            public int compare(Interval o1, Interval o2) {
                return o1.s-o2.s;
            }
        });
        return res;

    }

}
