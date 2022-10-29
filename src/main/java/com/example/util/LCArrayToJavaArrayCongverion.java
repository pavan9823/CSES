package com.example.util;

public class LCArrayToJavaArrayCongverion {

    public static void main(String[] args) {
        String str = "[[1,3],[2,6],[8,10],[15,18]]";
        String replaceString=str.replace("[","{");
        String replaceString1=replaceString.replace("]","}");
        System.out.println(replaceString1);
    }

}
