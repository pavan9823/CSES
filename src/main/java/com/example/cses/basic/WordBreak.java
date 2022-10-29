package com.example.cses.basic;

import java.util.ArrayList;
import java.util.List;

public class WordBreak {
    public static boolean wordBreak(String s, List<String> list) {
        int i=0;
        while(i<s.length()){
            String str = helper(list,s.charAt(i),s,i);
            if(str.isEmpty())
                return false;
            else
                i = i+str.length()-1;
        }
        return true;
    }

    public static String helper(List<String> list, char ch, String s, int j){
        List<String> res = new ArrayList<>();

        for(int i=0;i<list.size();i++){
            if(list.get(i).startsWith(ch+""))
                res.add(list.get(i));
        }
        String str = "";
        for(int i=0;i<res.size();i++){
            if(s.substring(j).startsWith(res.get(i))){
                if(str.length()<res.get(i).length()){
                    str = res.get(i);
                }
            }
        }

        return str;
    }

    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("leet");
        list.add("code");
        wordBreak("leetcode",list);
    }
}
