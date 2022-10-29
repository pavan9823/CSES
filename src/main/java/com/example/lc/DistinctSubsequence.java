package com.example.lc;

public class DistinctSubsequence {
    public static void main(String[] args) {
       int res =  tabluziation("rabbbit","rabbit");
        System.out.println(res);
    }

    private static int tabluziation(String str1, String str2) {
        int m=str1.length();
        int n=str2.length();

        int[][] dp = new int[m+1][n+1];
        for(int i=0;i<=m;i++){
            dp[i][0]=1;
        }
        for(int i=1;i<=n;i++){
            dp[0][i]=0;
        }
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (str1.charAt(i)==str2.charAt(j))
                    dp[i+1][j+1]=dp[i][j]+dp[i][j+1];
                else
                    dp[i+1][j+1]=dp[i][j+1];
            }
        }

        return dp[m][n];

    }
}
