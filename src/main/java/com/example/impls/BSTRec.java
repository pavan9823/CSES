package com.example.impls;

public class BSTRec {
    public static void inorder(Node root)
    {
        if (root == null)
            return;
        inorder(root.left);
        System.out.print(root.val + " ");
        inorder(root.right);
    }

    public static Node insert(Node root, int key)
    {
        if (root == null)
            return new Node(key);
        if (key < root.val)
            root.left = insert(root.left, key);
        else
            root.right = insert(root.right, key);
        return root;
    }
    public static Node constructBST(int[] keys)
    {
        Node root = null;
        for (int key: keys)
            root = insert(root, key);
        return root;
    }

    public static void main(String[] args)
    {
        int[] keys = { 15, 10, 20, 8, 12, 16, 25 };
        Node root = constructBST(keys);
        inorder(root);
    }
}