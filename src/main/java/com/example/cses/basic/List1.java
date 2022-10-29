package com.example.cses.basic;

import java.util.*;

public class List1 {

    public static void main(String[] args) {
        test1();
    }

    private static void test1() {
        List<Integer> list = new ArrayList<>(100);
        for (int i = 0; i <100; i++) {
            list.add(i);
        }
        System.out.println(list);
        Collections.fill(list,1);
        list.add(3,12);
        System.out.println(list);
    }

}
