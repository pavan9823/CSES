package com.example.cses.dp;

import java.util.Scanner;

public class CoinCombination1 {

    public static int coinCombo(int[] arr,int target){
        int[] dp = new int[target+1];
        return coinCombination(arr,target,dp);
    }

    public static int coinCombination(int[] arr,int target,int[] dp) {
        if(target==0)
            return 1;
        if(target<0)
            return 0;
        if(dp[target]!=0){
            return dp[target];
        }
        for(int i=0;i<arr.length;i++){
            dp[target] += coinCombination(arr,target-arr[i],dp);
        }
        return dp[target];
    }
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int len = s.nextInt();
        int target = s.nextInt();
        int[] arr = new int[len];
        for(int i=0;i<len;i++){
            arr[i] = s.nextInt();
        }
        System.out.println(coinCombo(arr,target));
    }

}
