package com.example.dptrai;

public class MinPathMatrix {

    static int[][] dp;

    public static void main(String[] args) {
//        int[][] arr = new int[][] { {1,1,1},
//                {1, 1,1},
//                {1, 1, 1},
//                {1,1, 1} };
        int[][] arr = new int[][]{{1,1},{1,1}};
        dp = new int[arr.length][arr[0].length];
        for (int i = 0; i <arr.length ; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                dp[i][j] = Integer.MAX_VALUE;
            }
        }
        System.out.println(minPath(arr,0,0));
//        for (int i = 0; i <arr.length ; i++) {
//            for (int j = 0; j < arr[0].length; j++) {
//                System.out.print(dp[i][j]+" ");
//            }
//            System.out.println();
//        }
    }

    private static int minPath(int[][] grid,int i,int j) {
        if(i>= grid.length || j>=grid[0].length)
            return 0;
        else if (i == grid.length-1 && j == grid[0].length-1)
            return grid[i][j];
//        if(i>= grid.length || j>=grid[0].length)
//            return 0;
//        if(dp[i][j]!=Integer.MAX_VALUE)
//            return dp[i][j];
        return  grid[i][j]+Math.min(minPath(grid,i+1,j),minPath(grid,i,j+1));
    }
}
