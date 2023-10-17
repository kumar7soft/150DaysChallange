package org.example.tree;

public class CustomTreeTraversal {

    public static void main(String[] args){

        Node root=new Node(10);
        root.left=new Node(20);
        root.right=new Node(30);
        root.right.left=new Node(40);
        root.right.right=new Node(50);

        printPostOrderTraversal(root);
    }

    private static void printPostOrderTraversal(Node node){
        if(node == null){
            return ;
        }

        printPostOrderTraversal(node.left);
        printPostOrderTraversal(node.right);
        System.out.print(node.data+":");

    }
    private static void printInorderTraversal(Node node){
        if(node == null){
            return ;
        }
        printInorderTraversal(node.left);
        System.out.print(node.data+":");
        printInorderTraversal(node.right);
    }

    private static void printPreOrderTraversal(Node node){

        if(node == null){
            return ;
        }
        System.out.print(node.data+":");
        printPreOrderTraversal(node.left);
        printPreOrderTraversal(node.right);

    }
}
