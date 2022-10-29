package com.example.cses.trails;

import java.util.Scanner;

public class LIS {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scan.nextInt();
        }
        int min = lis(arr);
        System.out.println(min);
    }

    private static int lis(int[] arr) {
        int[] dp = new int[arr.length];
        for (int i = 0; i < dp.length; i++) {
            dp[i]=1;
        }
        dp[0] = Integer.MIN_VALUE;
        for (int i = 1; i < arr.length ; i++) {
            for (int j = 0; j < i; j++) {
                if (arr[i] > arr[j] && dp[i]<dp[j]+1) {
                    dp[i] = dp[j]+1;
                }
            }
        }
        int max =0;
        for (int i = 0; i < arr.length; i++) {
            max = Math.max(max,dp[i]);
        }
        return max;
    }
}
