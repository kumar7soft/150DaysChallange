package org.example.tree;

class TreeNode {
    int data;
    TreeNode left;
    TreeNode right;

    public TreeNode(int data) {
        this.data = data;
        this.left = null;
        this.right = null;
    }
}

class BinarySearchTree {
    private TreeNode root;

    public BinarySearchTree() {
        root = null;
    }

    public void insert(int data) {
        root = insertRec(root, data);
    }

    private TreeNode insertRec(TreeNode root, int data) {
        if (root == null) {
            root = new TreeNode(data);
            return root;
        }

        if (data < root.data) {
            root.left = insertRec(root.left, data);
        } else if (data > root.data) {
            root.right = insertRec(root.right, data);
        }

        return root;
    }

    public void inOrderTraversal() {
        inOrderTraversal(root);
    }

    private void inOrderTraversal(TreeNode root) {
        if (root != null) {
            inOrderTraversal(root.left);
            System.out.print(root.data + " ");
            inOrderTraversal(root.right);
        }
    }
}

public class InsertingIntoBinarySearchTree{

    public static void main(String[] args) {

        BinarySearchTree bst = new BinarySearchTree();

        int[] elements = {5, 3, 7, 2, 4, 6, 8, 1, 9, 10};

        for (int element : elements) {
            bst.insert(element);
        }

        System.out.println("In-order traversal of the BST:");
        bst.inOrderTraversal();
    }
}
