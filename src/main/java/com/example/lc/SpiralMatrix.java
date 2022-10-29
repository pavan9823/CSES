package com.example.lc;

import java.util.ArrayList;
import java.util.List;

public class SpiralMatrix {
    static List<Integer> list = new ArrayList<Integer>();

    public static int spiralOrder(int[][] matrix) {
        int left = 0, top = 0;
        int right = matrix[0].length, bottom = matrix.length;
        int n = 3;
        int[][] res = new int[n][n];
        while (left < right && top < bottom) {
            for (int i = left; i < right; i++) {
                //res[left][i];
                //res[i][right-1];
                //res[bottom-1][i];
                //res[i][left];
                list.add(matrix[left][i]);
            }
            top++;
            for (int i = top; i < bottom; i++) {

                list.add(matrix[i][right - 1]);
            }
            right--;
            for (int i = right - 1; i > left; i--) {
                list.add(matrix[bottom - 1][i]);
            }
            bottom--;
            for (int i = bottom - 1; i > top; i--) {
                list.add(matrix[i][left]);
            }
            left++;
        }
        return 1;
    }

    public static void main(String[] args) {
        spiralOrder(new int[][]{{1, 2, 3, 4}, {5, 6, 7, 8}, {9, 10, 11, 12}});
        System.out.println(list);
    }
}

