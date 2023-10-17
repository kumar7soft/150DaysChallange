package org.example.tree;

public class BinaryTreeSearch {

    public static void main(String[] args){

        Node root=new Node(10);
        root.left=new Node(20);
        root.right=new Node(30);
        root.right.left=new Node(40);
        root.right.right=new Node(50);
       System.out.println(search(root,49));
    }

    private static boolean search(Node node,int k){
        if(node == null){
            return false;
        }
        if(node.data==k){
            return true;
        }
        return search(node.left,k) || search(node.right,k);
    }
}
