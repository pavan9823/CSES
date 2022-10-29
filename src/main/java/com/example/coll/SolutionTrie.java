package com.example.coll;

import java.util.*;

public class SolutionTrie {
   static class Node {
        // our own node class
        HashMap<Character, Node> child;
        Queue<String> valid;
        // our Node constructor, remember constructor should always have same name as class
        public Node() {
            // hashmap to store char - subnode relation, valid to store string if this char is end of a string.
            child = new HashMap<>();
            valid = new LinkedList<>();

        }
    }
        static List<String> output = new ArrayList<>(); // answer store here
        public static List<String> findWords(char[][] board, String[] words) {
            // first we need to establish our prefix tree, make sure init a new node object as root;
            Node root = new Node();
            for (String s : words) {
                // we need anothre node pointer to help us go though the tree. don't use root directly, will cause null pointer problem.
                Node cur = root;
                for (int i = 0; i < s.length(); i++) {
                    // for each char in string we add it in hashmap with a node object, then move our pointer to this child node.
                    if (!cur.child.containsKey(s.charAt(i))) {

                        cur.child.put(s.charAt(i), new Node());

                    }
                    cur = cur.child.get(s.charAt(i));
                }
                // after we loop the string, we store it in last node we visited.
                cur.valid.add(s);
            }
            // for each position in board, run dfs method on it
            for (int r = 0; r < board.length; r++) {
                for (int c = 0; c < board[0].length; c++) {
                    dfs(r, c, root, board);
                }
            }
            return output;
        }
        public static void dfs(int r, int c, Node root, char[][] board) {
            // check if input valid
            if (root == null || r < 0 || r == board.length || c < 0 || c == board[0].length || board[r][c] == '#' || !root.child.containsKey(board[r][c])) {
                return;
            }
            // set a temp value to store current board value, cause we will change it to "#" as visited, before we go to next layer of recursion
            char memo = board[r][c];
            Node subnode = root.child.get(board[r][c]); // since we got this value in our treenode's hashmap, get it out
            if (!subnode.valid.isEmpty()) {
                String temp = subnode.valid.remove(); // if this node's stored a string, we can remove this string and put it in our output list.
                output.add(temp);
            }
            board[r][c] = '#';     // mark this position as "#", run dfs on four direction
            dfs(r + 1, c, subnode, board);
            dfs(r - 1, c, subnode, board);
            dfs(r, c + 1, subnode, board);
            dfs(r, c - 1, subnode, board);

            board[r][c] = memo; // after we come back from deeper recursion, we change this node value back to normal, we may need it to find next string
            // here we can prune if subnode's hashmap is empty, after prune runtime is faster than 97% submissions
            if (subnode.child.isEmpty()) {

                root.child.remove(board[r][c]);

            } // if do not prune we can just operate with root, no need to set a pointer to its subnode. run time about 40%-50% faster.

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