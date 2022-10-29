package com.example.cses.dp;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;
/*
Longest Common SubSequence
 */
public class LCS {
    static Stack<Character> stack = new Stack<>();
    public static void main(String[] args) {
        String str1 = "abc";
        String str2 = "def";
        int m = str1.length(), n = str2.length();
        int[][] dp = new int[m + 1][n + 1];
        int res = lcs(str1,str2,dp,m,n);
        for (int i = 0; i <dp.length ; i++) {
            for (int j = 0; j < dp[i].length; j++) {
                System.out.print(dp[i][j]+" ");
            }
            System.out.println();
        }
        printSubstring(dp,str1,str2,m,n);
        StringBuilder sb = new StringBuilder("");
        while(!stack.isEmpty()){
            sb.append(stack.pop());
        }
        System.out.println(sb);
        System.out.println(res);
    }

    private static void printSubstring(int[][] dp, String str1, String str2,int m,int n) {
        if(m<=0 || n<=0)
            return;
        if(dp[m][n]!=dp[m][n-1] && dp[m][n]!=dp[m-1][n]){
            stack.push(str2.charAt(n-1));
            printSubstring(dp,str1,str2,m,n-1);
        }
        else if(dp[m][n]==dp[m][n-1]){
            printSubstring(dp,str1,str2,m,n-1);
        }
        else if(dp[m][n]==dp[m-1][n]){
            printSubstring(dp,str1,str2,m-1,n);
        }
    }

    private static int lcs(String str1, String str2,int[][] dp ,int m,int n) {


        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (str1.charAt(i) == str2.charAt(j))
                    dp[i + 1][j + 1] = 1 + dp[i][j];
                else
                    dp[i + 1][j + 1] = Math.max(dp[i][j + 1], dp[i + 1][j]);
            }
        }
        return dp[m][n];
    }


}
