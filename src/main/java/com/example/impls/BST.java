package com.example.impls;

public class BST {

    public static void main(String[] args) {
        int n = 7;
        int[] arr = {5,7,3,2,9,1,8};
        bstImpl(n,arr);
    }

    private static void bstImpl(int n, int[] arr) {
        Node root = null;
        Node q = null;
        for(int i=0;i<arr.length;i++){
            Node p = new Node();
            p.val=arr[i];
            p.left = null;
            p.right = null;

            if(i==0){
               root  = p;
            }
            else {
                q = root;
                while (true) {
                    if (p.val > q.val) {
                        if (q.right == null) {
                            q.right = p;
                            break;
                        } else {
                            q = q.right;
                        }
                    } else {
                        if (q.left == null) {
                            q.left = p;
                            break;
                        } else {
                            q = q.left;
                        }
                    }
                }
            }
        }
        inOrder(root);
    }

    private static void inOrder(Node root) {
        if(root==null)
            return;
        System.out.println(root.val+" ");
        inOrder(root.left);
        inOrder(root.right);
    }
}
