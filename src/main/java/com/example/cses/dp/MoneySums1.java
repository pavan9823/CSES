package com.example.cses.dp;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MoneySums1 {
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
        int count=0;
        List<Boolean> possiblities = new ArrayList<>((int)1e5);
        possiblities.add(true);
//        for (int i = 1; i < 1e5 ; i++) {
//            possiblities.add(false);
//        }
        List<Boolean> current = new ArrayList<>((int)1e5);
        for (int i = 0; i < 1e5 ; i++) {
            current.add(false);
        }
        for (int i = 1; i <= arr.length ; i++) {
            for (int j = 0; j < 1e5 ; j++) {
                    if(possiblities.get(j)){
                        current.add(j+arr[i-1],true);
                        current.add(j,true);
                    }
            }
            possiblities=current;
        }


        for (int i = 1; i <1e5; i++) {
            if(possiblities.get(i))
                count++;
        }
        System.out.println(count);
        for (int i = 1; i <1e5; i++) {
            if(possiblities.get(i))
                System.out.print(i+" ");
        }


    }


}
