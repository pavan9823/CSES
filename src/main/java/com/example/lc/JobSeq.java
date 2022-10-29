package com.example.lc;

import java.util.ArrayList;
import java.util.Collections;
import java.util.TreeMap;

public class JobSeq {
    private static class Job{
        int st;
        int et;
        int p;
        public Job(int st, int et, int p) {
            this.st = st;
            this.et = et;
            this.p = p;
        }
    }

    public static void main(String[] args) {
        int start[] = {1,2,3,3};
        int[] end = {3,4,5,6};
        int[] profit = {50,10,40,70};
        ArrayList<Job> jobs = new ArrayList<>();
        for (int i = 0; i < start.length; i++) {
            jobs.add(new Job(start[i],end[i],profit[i]));
        }
        Collections.sort(jobs,(a,b)->(a.et-b.et));
        TreeMap<Integer,Integer> map = new TreeMap<>();
        int ans =0;
        for (Job currJob: jobs) {
            Integer entryTillStartTime = map.floorKey(currJob.st);
            Integer maxProfit = entryTillStartTime==null?0:map.get(entryTillStartTime);
            ans = Math.max(ans,currJob.p+maxProfit);
            map.put(currJob.et, ans);
        }
        System.out.println(ans);
    }

}
