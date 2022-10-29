package com.example.cses.basic;

public class StepsForCurrentToCorrectTime {
    private static int ops =0;
    public static int convertTime(String current, String correct) {
        dfs(current,correct);
        return ops;
    }
    private static void  dfs(String current, String correct){

        int h1 = current.charAt(0)-'0';
        int h2 = current.charAt(1)-'0';
        int h=(h1*10+h2)*60;

        int hh1 = correct.charAt(0)-'0';
        int hh2 = correct.charAt(1)-'0';
        int hh=(hh1*10+hh2)*60;

        int m1 = current.charAt(3)-'0';
        int m2 = current.charAt(4)-'0';
        int m=m1*10+m2;

        int mm1 = correct.charAt(3)-'0';
        int mm2 = correct.charAt(4)-'0';
        int mm=mm1*10+mm2;


        int wcurr =  h+m;
        int wcorr = hh+mm;

        while(wcurr<=wcorr){
            if(wcurr==wcorr)
                break;
            if(wcurr+60<=wcorr){
                wcurr = wcurr+60;
                ops++;
            }
            else if(wcurr+15<=wcorr){
                wcurr = wcurr+15;
                ops++;
            }
            else if(wcurr+5<=wcorr){
                wcurr = wcurr+5;
                ops++;
            }
            else if(wcurr+1<=wcorr){
                wcurr = wcurr+1;
                ops++;
            }

        }
    }

    public static void main(String[] args) {
        System.out.println(convertTime("02:30","04:35"));
    }
}
