package com.example.cses.trails;

import java.util.Arrays;
import java.util.Scanner;

public class SumOfThree {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int target = scan.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scan.nextInt();
        }
         long res[] = sumOfThree(arr,n,target);
        if(res[0]==0)
            System.out.println("IMPOSSIBLE");
        else{
            for (int i = 0; i < res.length; i++) {
                System.out.print(res[i]+" ");
            }
        }
    }

    private static long[] sumOfThree(int[] arr, int n, int target) {
        for(int i=0;i<n-2;i++){
            while(i<n-2 && arr[i]==arr[i+1]) i++;
            int l=i+1;
            int h = n-1;
            while(l<h){
                if(arr[i]+arr[l]+arr[h]==target)
                    return new long[]{i+1,l+1,h+1};
                l++;
            }
        }
        return new long[3];
    }


}
