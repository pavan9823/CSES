package com.example.cses.dp;

public class MinCostPath {
    public static void main(String[] args) {
            System.out.println(minCost(new int[][] {{1,2,3},{4,5,6}}));
        }

        private static int minCost(int[][] cost) {

            int[][] dp = new int[cost.length+1][cost[0].length+1];
            dp[0][0] = Integer.MAX_VALUE;


            return minimum(cost,dp,cost.length,cost[0].length);
        }

        private static int minimum(int[][] cost, int[][] dp, int r, int c) {
            if(r==0 || c==0) {
                return Integer.MAX_VALUE;

            }
            if(r==1 && c==1) {
                return cost[r-1][c-1];
            }

            if(dp[r][c]!=0) {
                return dp[r][c];
            }
            int one = minimum(cost,dp,r-1,c);
            int two = minimum(cost,dp,r,c-1);
            return dp[r][c] = Math.min(one, two)+cost[r-1][c-1];
        }

    }
