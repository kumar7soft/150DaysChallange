package org.linkedlist;

public class TraversalOfLinkedList {

    public static void main(String[] args){
        Node head=new Node(10);
        head.next=new Node(20);
        head.next.next=new Node(30);
        head.next.next.next=new Node(40);
        recursiveTraversalOfLinkedList(head);



    }

    static void printlist(Node head){
        Node curr=head;
        while(curr!=null){
            System.out.print(curr.val + " ");
            curr=curr.next;
        }
        System.out.println();
    }


    private static void recursiveTraversalOfLinkedList(Node head){

        if(head == null){
            return;
        }
        Node curr = head;
        System.out.println(curr.val);
        recursiveTraversalOfLinkedList(curr.next);



    }
}
