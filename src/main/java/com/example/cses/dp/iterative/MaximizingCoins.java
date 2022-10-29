package com.example.cses.dp.recursive;

import java.util.Scanner;

public class MaximizingCoins {

        public static void main(String[] args) {
            Scanner s = new Scanner(System.in);
            int len = s.nextInt();
            int target = s.nextInt();
            int[] arr = new int[len];
            for(int i=0;i<len;i++){
                arr[i] = s.nextInt();
            }
            System.out.println(maximizingCoins(arr,target));
        }
        public static int maximizingCoins(int[] coins,int amount){
            int dp[] = new int[amount + 1];

            // Base case (If given value V is 0)
            dp[0] = 0;

            // Initialize all table values as Infinite
            for (int i = 1; i <= amount; i++)
                dp[i] = Integer.MIN_VALUE;

            // Compute minimum coins required for all
            // values from 1 to V
            for (int i = 1; i <= amount; i++)
            {
                // Go through all coins smaller than i
                for (int j = 0; j < coins.length; j++)
                    if (coins[j] <= i)
                    {
                        int sub_res = dp[i - coins[j]];
                        if (sub_res != Integer.MIN_VALUE
                                && sub_res + 1 > dp[i])
                            dp[i] = sub_res + 1;
                    }
            }

            return dp[amount]==Integer.MIN_VALUE?-1:dp[amount];
        }
}
