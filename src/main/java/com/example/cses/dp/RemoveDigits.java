package com.example.cses.dp;
import java.util.Scanner;

public class RemoveDigits {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int steps = removeDigits(n,0);
        System.out.println(steps);
    }

    private static int removeDigits(int n,int steps) {
        if(n==0){
            return steps;
        }

        int i=n;
        int max = 0;
        while(i!=0){
            int rem = i%10;
            max = Math.max(max,rem);
            i = i/10;
        }
        return removeDigits(n-max,++steps);
    }
}
