package com.example.cses.basic;

public class HR1 {
    public static int rob(int[] arr) {
        int n = arr.length;
        if(n==0)
            return n;
        if(n==1)
            return arr[n-1];
        int[] arr1 = new int[n-1];
        int[] arr2 = new int[n-1];
        for(int i=0;i<n-1;i++)
            arr1[i]=arr[i];
        for(int i=1;i<=n-1;i++)
            arr2[i-1]=arr[i];

        return Math.max(helper(arr1),helper(arr2));
    }
    public static int helper(int[] arr){
        int n = arr.length;
        int[] dp = new int[n];

        if(n>=1)
            dp[0] = arr[0];
        if(n>=2)
            dp[1] = Math.max(arr[0],arr[1]);
        for(int i=2;i<n;i++){
            dp[i] = Math.max(dp[i-1],dp[i-2]+arr[i]);
        }

        return dp[n-1];
    }
    public static void main(String[] args) {
        int res = rob(new int[]{1,2,3,1});
        System.out.println(res);
    }
}
