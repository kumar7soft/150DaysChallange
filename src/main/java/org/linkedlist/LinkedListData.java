package org.linkedlist;

public class LinkedListData {

    public Node date(){
        Node head=new Node(10);
        head.next = new Node(10);
        head.next.next=new Node(20);
        head.next.next.next=new Node(30);
        head.next.next.next.next=new Node(40);

        return head;
    }
    public Node doubltLLdate(){
        Node head=new Node(10);
        Node node1=new Node(20);
        Node node2=new Node(30);
       Node node3=new Node(40);
       head.next=node1;
        node1.prev=head;
        node1.next=node2;
        node2.prev=node1;
        node2.next=node3;
        node3.prev=node2;

        return head;


    }
}
