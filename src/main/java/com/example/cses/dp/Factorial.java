package com.example.cses.dp;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String line = br.readLine();
        int N = Integer.parseInt(line);
        ArrayList<Integer> inputs = new ArrayList<>();
        for(int i=0;i<N;i++){
            inputs.add(Integer.valueOf(br.readLine()));
        }
        ArrayList<BigInteger> list = new ArrayList<>();
        for(Integer i : inputs){

            Integer num = (int)((Math.pow(10,9)+7));
            BigInteger m =  new BigInteger(String.valueOf(num));
            BigInteger res = fact(i).mod(m);
            System.out.println(res);
            list.add(res);
        }
    }
    public static BigInteger fact(Integer n){
        if(n<2){
            return BigInteger.ONE;
        }

        return fact(n-1).multiply(new BigInteger(String.valueOf(n)));



    }
}
