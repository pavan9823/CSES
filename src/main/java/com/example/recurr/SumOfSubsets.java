package com.example.recurr;

import java.util.ArrayList;

public class SumOfSubsets {

    public static void main(String[] args) {
       ArrayList<Integer> res = subsetSum(new int[]{2,3});
        System.out.println(res);
    }

    private static ArrayList<Integer> subsetSum(int[] arr) {
        ArrayList<Integer> res = new ArrayList<>();
        sum(arr,res,0,0);
        return res;
    }

    private static void sum(int[] arr, ArrayList<Integer> res,int k,int sum) {
        if(k== arr.length){
            res.add(sum);
            return;
        }
        sum(arr,res,k+1,sum+arr[k]);
        sum(arr,res,k+1,sum);
    }
}
