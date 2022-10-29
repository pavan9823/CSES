package com.example.cses.dp;

import java.util.ArrayList;
import java.util.List;

public class StringTest {
    public String removeDigit(String number, char digit) {
        List<String> list = new ArrayList<>();
        for(int i=0;i<number.length();i++){
            if(number.charAt(i)==digit){
                list.add(number.substring(0,i)+number.substring(i+1));
            }
        }

        int max =0;
        for(int i=0;i<list.size();i++){
            int temp = Integer.parseInt(list.get(i));
            max = Math.max(max,temp);
        }
        return String.valueOf(max);
    }
}
