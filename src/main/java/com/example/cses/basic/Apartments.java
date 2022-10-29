package com.example.cses.basic;

import java.util.Scanner;

public class Apartments {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n = scan.nextInt();
        int m = scan.nextInt();
        int k = scan.nextInt();
        int[] p = new int[n];
        int[] a = new int[m];
        for (int i = 0; i < n; i++) {
            p[i] = scan.nextInt();
        }
        for (int i = 0; i < m; i++) {
            a[i] = scan.nextInt();
        }

        apartments(p,a,n,m,k);


    }

    private static void apartments(int[] a, int[] b, int n, int m, int k) {
        int count=0;
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(a[i]<=b[j]+k && a[i]>=b[j]-k){
                    b[j]=0;
                    count++;
                }
            }
        }
        System.out.println(count);
    }
}
