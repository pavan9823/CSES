package com.example.dptrai;

import java.util.Arrays;

public class CoinChange {
    public static void main(String[] args) {
        int n, v;
        n = 3;
        v = 4;
        int[] a = { 1, 2, 3 };
        int[][] dp = new int[n + 1][v + 1];
        for (int[] row : dp)
            Arrays.fill(row, -1);
        int res = coinChange(a,n,v,dp);
        System.out.println(res);
    }

    private static int coinChange(int[] coins, int n,int v,int[][] dp) {
        if(v==0)
            return 1;
        if (v<0)
            return 0;
        if(n<=0)
            return 0;
        if(dp[n][v]!=-1)
            return dp[n][v];
        return dp[n][v] = coinChange(coins,n-1,v,dp)+coinChange(coins,n,v-coins[n-1],dp);
    }
}
