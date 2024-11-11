package org.example.binarysearchtree;

public class InsertKeyToBST {

    public static void main(String[] args){

        Node root=new Node(15);
        root.left=new Node(5);
        root.left.left=new Node(3);
        root.right=new Node(20);
        root.right.left=new Node(18);
        root.right.left.left=new Node(16);
        root.right.right=new Node(80);
        int x=16;

        printBinarySearchTree(root);
        System.out.println();
        insertIntoBST(root,100);
        printBinarySearchTree(root);
    }

    private static void printBinarySearchTree(Node node){
        if(node == null){
            return ;
        }
        System.out.print(node.key+"::");
        printBinarySearchTree(node.left);
        printBinarySearchTree(node.right);
    }

    private static Node insertIntoBST(Node node, int key) {
        // Base case: if the tree is empty, create a new node
        if (node == null) {
            return new Node(key);
        }
        // If the key already exists in the tree, print a message and return the node as is
        if (node.key == key) {
            System.out.println("Insertion is not possible due to duplication of key");
            return node;
        }
        // Recursively insert into the left subtree if the key is smaller
        if (key < node.key) {
            node.left = insertIntoBST(node.left, key);
        }
        // Recursively insert into the right subtree if the key is larger
        else {
            node.right = insertIntoBST(node.right, key);
        }

        return node;
    }
}
