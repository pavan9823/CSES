package com.example.intervals;

import java.util.ArrayList;

public class MergeIntervals {

    public static void main(String[] args) {
        int[][] arr = new int[][]{{1,3},{2,6},{8,10},{15,18}};
        ArrayList<Interval> res = mergeIntervals(arr);
        System.out.println(res);
    }

    private static ArrayList<Interval> mergeIntervals(int[][] arr) {
        ArrayList<Interval> res = new ArrayList<>();
        Interval prev = new Interval(arr[0][0],arr[0][1]);
        for (int i = 1; i < arr.length; i++) {
            Interval curr = new Interval(arr[i][0],arr[i][1]);
                if(prev.e>=curr.s){
                    Interval merged = new Interval(prev.s,Math.max(prev.e,curr.e));
                    prev = merged;
                }else {
                    res.add(prev);
                    prev = curr;
                }
        }
        res.add(prev);
        return res;
    }
}
