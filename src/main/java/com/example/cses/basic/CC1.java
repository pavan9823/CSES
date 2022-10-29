package com.example.cses.basic;

import java.util.Scanner;

public class CC1 {
    static int MOD = (int)(Math.pow(10,9)+7);
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int x = scanner.nextInt();
        int[] dp = new int[x+1];
        dp[0] = 1;
        int[] coins = new int[n];
        for (int i = 0; i < n; i++) {
            coins[i] = scanner.nextInt();
        }
        for (int i = 1; i <=x; i++) {
            for (int j = 0; j < coins.length; j++) {
                if(i>=coins[j])
                    //lets see if this helps or not and took dp as int array
                    dp[i] += dp[i - coins[j]];
                if (dp[i] >= MOD) {
                    dp[i] -= MOD;
                }
            }
        }
        System.out.println(dp[x]);
    }
}
