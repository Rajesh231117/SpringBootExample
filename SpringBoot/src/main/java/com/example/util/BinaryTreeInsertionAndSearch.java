package com.example.util;

class ryTreeInsertionAndSearch {

    public static void main(String[] args) {
        Node root = null;
        root = insert(null, 20);
        insert(root, 10);
        insert(root, 22);
        insert(root, 7);
        insert(root, 15);
        insert(root, 21);
        leftView(root);
        /*BinaryTreeTraversal.inOrder(root);

        Node ele = search(root,22);
        if(ele == null){
            System.out.println("ele not found");
        }else{
            System.out.println("ele found");
        }*/


    }

    static void leftView(Node root)
    {
        // Your code here
        leftViewUtil(root,1);

    }
    static int maxLevel=0;
   static void leftViewUtil(Node root,int level){
        if(root==null){
            return ;
        }

        if(maxLevel<level){
            System.out.print(root.key+" ");
            maxLevel=level;
        }

        leftViewUtil(root.left,level+1);
        leftViewUtil(root.right,level+1);
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
