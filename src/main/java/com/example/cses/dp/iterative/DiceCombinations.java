package com.example.cses.dp.iterative;

import java.util.Scanner;

public class DiceCombinations {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        System.out.println(dice(n));
    }

    private static long dice(int n) {
        long[] dp = new long[n+1];
        //dp[0] to make the sum of zero you will not throw the dice so one way to make zero
        dp[0]=1;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=6;j++){
                //Go through all the numbers which are less than i
                if(i-j>=0)
                    dp[i]+=dp[i-j];
            }
        }
        return dp[n];
    }
}
