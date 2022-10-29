package com.example.cses.trails;

import java.util.Scanner;

public class CollectionNumbers {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int[] arr = new int[n];
        int[] pos = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scan.nextInt();
            arr[i]--;
            pos[arr[i]]=i;
        }
        collectionNumbers(arr,pos);
    }

    private static void collectionNumbers(int[] arr,int[] pos) {
        int passes=1;
        for (int i = 1; i < arr.length; i++) {
            if(pos[i]<pos[i-1])
                passes++;
        }
        System.out.println(passes);
    }
}