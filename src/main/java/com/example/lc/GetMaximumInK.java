package com.example.lc;

import java.util.ArrayList;
import java.util.List;

public class GetMaximumInK {
    static List<Integer> list = new ArrayList<>();

    public static int[] maxSlidingWindow(int[] nums, int k) {
        int len = nums.length,ws =0;
        int[] res = new int[len-k+1];
        for(int we = k-1;we<nums.length;we++){
            if(we-ws+1==k){
                int j =ws;
                int max = Integer.MIN_VALUE;
                while(j<=we){
                    max = Math.max(nums[j++],max);
                }
                res[ws]= max;
                ws++;
            }
        }

        return res;

    }

    public static void main(String[] args) {
        int[] res = maxSlidingWindow(new int[]{ 1,3,-1,-3,5,3,6,7 },3);
        for (int i = 0; i < res.length; i++) {
            System.out.print(res[i]+" ");
        }

    }
}
