package com.example.cses.basic;

import java.util.Scanner;

public class RD {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();

        int steps = removeDigits(n,0);
        System.out.println(steps);
    }

    private static int removeDigits(int n, int steps) {
        if(n==0)
            return steps;
        int max =0;
        int num = n;
        while(num!=0){
            int rem = num%10;
            if(rem>max)
                max =rem;
            num/=10;
        }
        return removeDigits(n-max,steps+1);
    }
}
