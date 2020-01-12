package com.example.util;

public class BinaryTreeInsertionAndSearch {

    public static void main(String[] args) {
        Node root = null;

        root = insert(null, 20);
        insert(root, 10);
        insert(root, 22);
        insert(root, 7);
        insert(root, 15);
        insert(root, 21);
        BinaryTreeTraversal.inOrder(root);

        Node ele = search(root,22);
        if(ele == null){
            System.out.println("ele not found");
        }else{
            System.out.println("ele found");
        }


    }

    public static Node insert(Node root, int key) {
        if (root == null) {
            return new Node(key);
        }

        if (root.key > key) {
            root.left = insert(root.left, key);
        }

        if (root.key < key) {
            root.right = insert(root.right, key);
        }
        return root;
    }

    public static Node search(Node root, int key) {

        while (root.key != key) {
            if (root.key > key) {
                root = root.left;
            }
            if (root.key < key) {
                root = root.right;
            }
            if (root == null) {
                return null;
            }

        }
        return root;
    }

}
