package com.example.cses.trails;

public class Trail {
    static int min = Integer.MAX_VALUE;
    public static void main(String[] args) {
        recursion(new int[]{1,2,5},11,0,0);
        System.out.println(min);
    }

    private static void recursion(int[] nums,int target,int sum,int coins) {
        if(sum==target){
            min = Math.min(min,coins);
            return;
        }

        for(int i=0;i< nums.length;i++){
            if(sum<=target)
            recursion(nums,target,sum+nums[i],coins+1);
        }
    }

}
