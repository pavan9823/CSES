package com.example.cses.dp;

import java.util.ArrayList;
import java.util.Arrays;

public class NumberOfWays {
    static ArrayList<String> list = new ArrayList<>();
    static int count =0;
    public static void main(String[] args) {
        int[][] grid = new int[3][3];
        int[][] dp = new int[3][3];
        int res = ways(grid,0,0,"",dp);
        System.out.println(res);
        System.out.println(list);
        System.out.println(count);
    }

    private static int ways(int[][] grid,int i,int j,String s,int[][] dp) {
        if(i== grid.length-1 && j== grid[0].length-1){
            list.add(s);
            return 1;
        }
        if(i>= grid.length || j>= grid[0].length){
            return 0;
        }
        if(dp[i][j]!=0)
            return dp[i][j];
        count++;
        int d = ways(grid,i+1,j,s+"D",dp);
        int r = ways(grid,i,j+1,s+"R",dp);

        return dp[i][j] = d+r;

    }

}
