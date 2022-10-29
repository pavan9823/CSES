package com.example.lc;

import java.util.ArrayList;
import java.util.Arrays;

public class Subsets2 {

    public static void main(String[] args) {
        ArrayList<ArrayList<Integer>> res = subsets(new int[]{1,2,3});
        System.out.println(res);
    }

    private static ArrayList<ArrayList<Integer>> subsets(int[] nums) {
        ArrayList<ArrayList<Integer>> res = new ArrayList<>();
        Arrays.sort(nums);
        dfs(nums,new ArrayList<>(),res,0);
        return res;
    }

    private static void dfs(int[] numbs, ArrayList<Integer> list, ArrayList<ArrayList<Integer>> res, int ind) {
        if(ind== numbs.length)
            return;
        res.add(new ArrayList<>());
        for (int i = 1; i <=numbs.length; i++) {
            ArrayList<Integer> newList = new ArrayList<>();
            for (int j = 0; j < numbs.length; j++) {
                newList.add(numbs[j]);
                if(newList.size()==i) {
                    res.add(new ArrayList<>(newList));
                }

            }
        }

    }
}
