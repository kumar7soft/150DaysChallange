package org.example.binarysearchtree;

public class FlorrInBST {

    public static void main(String[] args){

        Node root = new Node(10);
        root.left = new Node(5);
        root.right = new Node(15);
        root.right.left = new Node(12);
        root.right.right = new Node(18);
        int x = 14;

        Node node = floorBST(root, x);
        System.out.println(node.key);

    }

    public static Node floorBST(Node root, int x){
        Node res=null;
        while(root!=null){
            if(root.key==x)
                return root;
            else if(root.key>x)
                root=root.left;
            else{
                res=root;
                root=root.right;
            }
        }
        return res;
    }
}
