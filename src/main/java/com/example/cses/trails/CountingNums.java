package com.example.cses.trails;

import java.util.Scanner;

public class CountingNums {
    static int[] dp;
static int count=0;
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        int b = scan.nextInt();
        dp = new int[(b-a)+1];
        if(a==b){
            System.out.println(1);
        }else{
            int res = countingNums(b-a);
            System.out.println(res);
        }

    }

    private static int countingNums(int diff) {
        if(diff==0)
            return count;
        if(dp[diff]!=0)
            return dp[diff];
        String s = String.valueOf(diff);
        int i=0;
        int j = s.length()-1;
        boolean flag = true;
        while(i<j){
            if(s.charAt(i)==s.charAt(i+1)){
                flag = false;
                break;
            }
            i++;
        }
        if(flag)
            dp[diff] =++count;
        return dp[diff] = countingNums(--diff);
    }
}
