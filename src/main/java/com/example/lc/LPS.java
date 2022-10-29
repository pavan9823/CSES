package com.example.lc;

public class LPS {
    int max =0;
    public int longestPalindromeSubseq(String s) {
        StringBuilder sb = new StringBuilder(s);
        String s1 = sb.toString();
        String s2 = sb.reverse().toString();
        return helper(0,0,s1,s2);
    }
    int helper(int i,int j,String s1,String s2){
        if(i==s1.length() || j==s2.length())
            return 0;
        if(s1.charAt(i)==s2.charAt(j)){
            return 1+helper(i+1,j+1,s1,s2);
        }
        else{
            return Math.max(helper(i+1,j,s1,s2),helper(i,j+1,s1,s2));
        }
    }

    public static void main(String[] args) {
        LPS lps = new LPS();
        System.out.println(lps.longestPalindromeSubseq("bbbab"));
    }
}
