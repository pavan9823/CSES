package com.example.cses.dp;

public class RodCutting {

    public static void main(String[] args) {
        int[] length = {1  , 2 ,  3 ,  4 ,  5,   6,   7,   8  };
        int[] price = { 1,5,8 , 9, 10 , 17 , 17 , 20};
        int n=8;
        int[] dp = new int[n+1];

//        for(int i=1;i<8;i++){
//            int max = 0;
//            for (int j = i; j < 9-i; j++) {
//                max = Math.max(price[j],max);
//            }
//            dp[i] = dp[i]+price[i-1]+max;
//        }


        for(int i=1;i<=8;i++){
            int max = 0;
            for(int j=i;j<n-i;j++){
                max = Math.max(max,price[j]);
            }
            dp[i]=Math.max(price[i-1]+max,dp[i-1]);
        }
        for (int i = 0; i < dp.length; i++) {
            System.out.print(dp[i]+" ");
        }

    }
}
