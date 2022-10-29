package com.example.cses.basic;

import java.util.Scanner;

public class DC {
    static int mod = (int)(Math.pow(10,9)+7);
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int n= scan.nextInt();
        System.out.println(diceCombinations(n));

    }

    private static long diceCombinations(int n) {
        long[] dp = new long[n+1];
        dp[0] =1;
        for (int i = 1; i <= n; i++) {
            for(int j=1;j<=6;j++){
                if(i-j>=0)
                    dp[i] = (dp[i]+dp[i-j])%mod;
            }
        }
        return dp[n];
    }
}
