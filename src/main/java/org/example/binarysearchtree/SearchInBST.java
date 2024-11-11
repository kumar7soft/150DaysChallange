package org.example.binarysearchtree;

public class SearchInBST {

    public static void main(String[] args){
        Node root=new Node(15);
        root.left=new Node(5);
        root.left.left=new Node(3);
        root.right=new Node(20);
        root.right.left=new Node(18);
        root.right.left.left=new Node(16);
        root.right.right=new Node(80);
        int x=16;

        if(recursiveSearch(root,x)){
            System.out.println("Found");
        }else{
            System.out.println("Not Found");
        }
    }

    private static boolean recursiveSearch(Node node ,int x){

        if(node == null){
            return false;
        }
        if(node.key == x){
            return true;
        }else if(node.key >x){
            return recursiveSearch(node.left,x);
        }else if(node.key<x){
            return recursiveSearch(node.right,x);
        }
        return false;
    }

    private static boolean iterativeSearch(Node node , int x){

        while(node != null){
            if(node.key==x){
                return true;
            }else if(node.key > x){
                node=node.left;
            }else if(node.key <x){
                node = node.right;
            }
        }
        return false;
    }
}
