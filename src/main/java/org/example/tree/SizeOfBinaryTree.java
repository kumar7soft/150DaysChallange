package org.example.tree;

public class SizeOfBinaryTree {

    public static void main(String[] args){

        Node node = new Node(10);
        node.left=new Node(20);
        node.right=new Node(30);
        node.right.right=new Node(6);
        node.left.left=new Node(8);
        node.left.right=new Node(7);
        node.left.right.left=new Node(9);
        node.left.right.right=new Node(15);

       System.out.println(sizeOfBinaryTree(node));

        //System.out.println(size(node));

    }

    private static int size(Node node){
        if(node == null){
            return 0;
        }
        return size(node.left);
    }

    private static int sizeOfBinaryTree(Node node){
        if(node == null){
            return 0;
        }
        return sizeOfBinaryTree(node.left)+sizeOfBinaryTree(node.right)+1;
    }
}
