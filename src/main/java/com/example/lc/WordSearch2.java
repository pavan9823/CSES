package com.example.lc;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class WordSearch2 {
    static List<String> list = new ArrayList<>();
    static HashSet<String> set = new HashSet<>();
    public static List<String> findWords(char[][] board, String[] words) {
        int m = board.length;
        int n = board[0].length;
        boolean visited[][] = new boolean[m][n];
        for(int s=0;s<words.length;s++){
            for(int i=0;i<m;i++){
                for(int j=0;j<n;j++){
                    if(words[s].charAt(0)==board[i][j]){
                        if(dfs(board,visited,0,i,j,words[s]))
                            set.add(words[s]);
                    }
                }
            }
        }
        return new ArrayList<>(set);
    }
    public static boolean dfs(char[][] board,boolean visited[][],int len, int i, int j, String word){
        if(len==word.length())
            return true;
        if(i>=board.length || j>=board[0].length || i<0 || j<0 || visited[i][j] || word.charAt(len)!=board[i][j])
            return false;
        boolean res = false;
        visited[i][j] = true;
        res = dfs(board,visited,len+1,i+1,j,word) ||
                dfs(board,visited,len+1,i-1,j,word) ||
                dfs(board,visited,len+1,i,j+1,word) ||
                dfs(board,visited,len+1,i,j-1,word);
        visited[i][j]= false;
        return res;


    }
    public static void main(String[] args) {
        char[][] board = new char[][]{
                {'a','b','c'},
                {'d','a','e'},
                {'z','t','q'}
        };
        String[] words = {"eat","tea"};
        List<String> res = findWords(board,words);
        System.out.println(res);
    }

}