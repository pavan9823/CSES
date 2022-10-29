package com.example.cses.dp;

import java.util.Scanner;

public class DiceCombinations {
    static int res =0;
    public static int dice(int n){
        int[] dp = new int[n+1];
        return diceProb(n,dp);
    }
    public static int diceProb(int n,int[] dp) {
        if(n==0){
            return 1;
        }
        if(n<0) {
            return 0;
        }
        if(dp[n]!=0)
            return dp[n];
        for(int i=1;i<=6;i++){
            dp[n]+=diceProb(n-i,dp);
        }
        return dp[n];
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        System.out.println(dice(n));
    }
}
