package com.example.impls.bitm;

public class InsertionSort {

    public static void main(String[] args) {
        int[] arr = {5,2,9,1,6};
        int res[] = insertionSort(arr);
        for (int i = 0; i <res.length ; i++) {
            System.out.print(res[i]+" ");
        }
    }

    private static int[] insertionSort(int[] arr) {
        int[] res = new int[arr.length];
        int min = arr[0];
        for(int i=0;i< arr.length;i++){
            for (int j = 0; j < arr.length; j++) {
                if(min>arr[j])
                    min = arr[j];
            }
            res[i] = min;
        }
        return res;
    }
}
