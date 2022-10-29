package com.example.cses.dp;
import java.util.Scanner;

public class MoneySums {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n= scan.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i]=scan.nextInt();
        }
        moneySums(arr);
    }

    private static void moneySums(int[] arr) {
        int n =0;
        for(int i=0;i<arr.length;i++){
            n+=arr[i];
        }
        int[] dp = new int[n+1];
        dp[0] = 1;
        int count=0;
        for(int i=0;i< arr.length;i++){
            for(int j=n;j>=arr[i];j--){
                if(dp[j-arr[i]]==1) {
                    dp[j] = 1;
                }
            }
        }
        for (int i = 1; i <=n; i++) {
            if(dp[i]==1)
                count++;
        }
        System.out.println(count);
        for (int i = 1; i <=n; i++) {
            if(dp[i]==1)
                System.out.print(i+" ");
        }
    }
}
