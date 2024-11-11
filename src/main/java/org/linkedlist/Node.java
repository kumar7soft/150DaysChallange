package org.linkedlist;

public class Node {

    public Node next;
    public Node prev;
    int val;

    public Node(int val){
        this.val=val;
        next=null;
        prev=null;
    }
}
