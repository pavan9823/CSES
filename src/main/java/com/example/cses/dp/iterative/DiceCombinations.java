package com.example.cses.dp.iterative;

import java.util.Scanner;

public class DiceCombination {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        System.out.println(dice(n));
    }

    private static int dice(int n) {
        int[] dp = new int[n+1];
        //dp[0] to make the sum of zero you will not throw the dice so one way to make zero
        dp[0]=1;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=6;j++){
                //up till i value we are going to add on the no of ways for each throw
                if(i-j>=0)
                    dp[i]+=dp[i-j];
            }
        }
        return dp[n];
    }
}
