package com.example.cses.basic;

import java.util.Scanner;

public class DiceCombinations {
    static int mod = (int)(Math.pow(10,9)+7);
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int n= scan.nextInt();
        long[] dp = new long[n+1];
        System.out.println((diceCombinations(n,dp))%mod);

    }

    private static long diceCombinations(int n,long[] dp) {
        if(n==0)
            return 1;
        if(n<0)
            return 0;
        if(dp[n]!=0)
            return dp[n];

        for (int i = 1; i <=6 ; i++) {
            if(n-i>=0)
                dp[n]+=diceCombinations(n-i,dp);
        }
        return dp[n];

    }
}
