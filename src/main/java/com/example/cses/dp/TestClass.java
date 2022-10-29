package com.example.cses.dp;

public class TestClass {

    private static int recur(int[] cost,int n,int[] dp) {
        if(n==0)
            return 1;
        if(dp[n]!=0)
            return dp[n];
        for(int i=1;i<=cost.length;i++){
            if(n-cost[i-1]>=0)
                dp[n]+=recur(cost,n-cost[i-1],dp);
        }
        return dp[n];
    }

    public static void main(String[] args) {
        int[] dp = new int[7];
        System.out.println(recur(new int[]{1,3,5},6, dp));
    }


}
