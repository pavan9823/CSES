package com.example.cses.dp;

import java.util.Scanner;

public class NumberOfPaths {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double mod = 1e9+7;
        int n = in.nextInt();
        char[][] arr = new char[n][n];
        for (int i = 0; i < n; i++) {
            String data = "";
            if (in.hasNext()) { // input from user
                data = in.next();
            } else {
                break;
            }
            for (int j = 0; j < n; j++)
                arr[i][j] = data.charAt(j);
        }
        double[][] dp = new double[n+1][n+1];
        dp[0][0]=1;
        double paths = (numberOfPaths(arr,n-1,n-1,dp)%mod);
        System.out.println((int)paths);
    }

    private static double numberOfPaths(char[][] arr,int i,int j,double[][] dp) {
        if(i==0 && j==0){
            return 1;
        }
        if(i<0 || j<0 || arr[i][j]=='*'){
            return 0;
        }
        if(dp[i][j]!=0){
            return dp[i][j];
        }


        return dp[i][j] = numberOfPaths(arr,i-1,j,dp)+numberOfPaths(arr,i,j-1,dp);
    }
}
