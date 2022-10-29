package com.example.cses.dp;

import java.util.Scanner;

public class BookShop {

    private static int maxPages(int[] cost, int[] pages,int budget) {
        int[][] dp = new int[cost.length+1][budget+1];

        for(int i=1;i<cost.length;i++){
            for(int j=0;j<=budget;j++){
                dp[i][j] = dp[i-1][j];
                int left = j-cost[i-1];
                if (left >= 0) {
                    dp[i][j] = Math.max(dp[i][j], dp[i-1][left]+pages[i-1]);
                }
            }
        }
        return dp[cost.length][budget];
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int x = scan.nextInt();
        int[] price = new int[n];
        int[] pages = new int[n];
        for(int i=0;i<n;i++){
            price[i]= scan.nextInt();
        }
        for(int i=0;i<n;i++){
            pages[i]= scan.nextInt();
        }

        int[][] dp = new int[n+1][x+1];
        for (int i = 1; i <= n; i++) {
            for (int j = 0; j <= x; j++) {
                dp[i][j] = dp[i-1][j];
                int left = j-price[i-1];
                if (left >= 0) {
                    dp[i][j] = Math.max(dp[i][j], dp[i-1][left]+pages[i-1]);
                }
            }
        }

        System.out.println(dp[n][x]);
    }


}
