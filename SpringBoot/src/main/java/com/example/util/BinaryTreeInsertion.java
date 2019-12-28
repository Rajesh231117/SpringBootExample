package com.example.util;

public class BinaryTreeInsertion {

    public static void main(String[] args) {
        Node root = null;

        root=insert(null,20);
        insert(root,10);
        insert(root,22);
        insert(root,7);
        insert(root,15);
        insert(root,21  );
        BinaryTreeTraversal.inOrder(root);

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
}
