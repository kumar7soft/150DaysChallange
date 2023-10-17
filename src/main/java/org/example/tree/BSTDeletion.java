package org.example.tree;

import java.util.*;
import java.io.*;
import java.lang.*;



public class BSTDeletion {

    public static void main(String args[]) {
        Node root = new Node(10);
        root.left = new Node(5);
        root.right = new Node(15);
        root.right.left = new Node(12);
        root.right.right = new Node(18);
        int x = 15;

        root = delNode(root, x);
        inorder(root);
    }

    public static Node getSuccessor(Node curr) {
        curr = curr.right;
        while (curr != null && curr.left != null)
            curr = curr.left;
        return curr;
    }

    public static Node delNode(Node root, int x) {
        if (root == null)
            return root;
        if (root.data > x)
            root.left = delNode(root.left, x);
        else if (root.data < x)
            root.right = delNode(root.right, x);
        else {
            if (root.left == null) {
                return root.right;
            } else if (root.right == null) {
                return root.left;
            } else {
                Node succ = getSuccessor(root);
                root.data = succ.data;
                root.right = delNode(root.right, succ.data);
            }
        }
        return root;
    }

    public static void inorder(Node root) {
        if (root != null) {
            inorder(root.left);
            System.out.print(root.data + " ");
            inorder(root.right);
        }
    }
}