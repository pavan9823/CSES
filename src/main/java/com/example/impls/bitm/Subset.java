package com.example.impls.bitm;

import java.util.ArrayList;
import java.util.List;

public class Subset {
    public static void main(String[] args) {
        int sub[] = {1,2,3};
        List<List<Integer>> res = new ArrayList<>();
        for (int i = 4; i < (1<<sub.length); i++) {
            List<Integer> curr = new ArrayList<>();
            for (int j = 0; j < sub.length; j++) {

                int k = (i >> j);
                int r = (k & 1);
                if (r == 1) {
                    curr.add(sub[j]);
                }

            }
            res.add(curr);
        }
        System.out.println(res);
    }
}
