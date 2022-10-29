package com.example.coll;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class SetClass {
    public static void main(String[] args) {
        Set<Integer> set = new LinkedHashSet<>();
        set.add(1);
        for (Integer name : set) {
            System.out.println(name);
        }

    }
}
