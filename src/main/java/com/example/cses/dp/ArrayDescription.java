package com.example.cses.dp;

import java.util.Scanner;

public class ArrayDescription {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int m = scan.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i]=scan.nextInt();
        }
        arrayDescription(arr,n,m);
    }

    private static void arrayDescription(int[] arr, int n, int m) {
        long dp[][] = new long[n][m+1];
        for (int j = 0; j <=m; j++) {
            dp[0][j]= arr[0] == 0?1:0;
        }
        dp[0][arr[0]]=1;
        dp[0][0]=0;
        int mod = (int)(Math.pow(10,9)+7);
        for(int i=1;i<n;i++){
            dp[i][0]=0;
            for(int j=1;j<=m;j++){
                if(arr[i]!=0){
                    if(arr[i]==j){
                        if(j<m)
                            dp[i][j] = (dp[i-1][j] + dp[i-1][j-1]+dp[i-1][j+1])%mod;
                        else
                            dp[i][j] = (dp[i-1][j] + dp[i-1][j-1])%mod;
                    }
                    else
                        dp[i][j]=0;
                }
                else{
                    if(j<m)
                        dp[i][j] = (dp[i-1][j] + dp[i-1][j-1]+dp[i-1][j+1])%mod;
                    else
                        dp[i][j] = (dp[i-1][j] + dp[i-1][j-1])%mod;
                }
            }
        }
        if(arr[n-1]!=0)
            System.out.println(dp[n-1][arr[n-1]]);
        else{
            int x =0;
            int i=0;
            while(i<m+1){
                x+=dp[n-1][i++];
                x%=mod;
            }
            System.out.println(x);
        }
    }
}
