package org.linkedlist;

public class PairwiseSwapNodesOfLinkedListInJava {

    public static void main(String[] args){

        Node head=new Node(1);
        head.next=new Node(2);
        head.next.next=new Node(3);
        head.next.next.next=new Node(4);
        head.next.next.next.next=new Node(5);
        swapThePairUsingLinks(head);
    }

    //1->2->3->4->5
    //2->1->4->3->5

    private static void swapThePair(Node head){

        for(Node curr= head;curr.next !=null;curr=curr.next.next){
            int temp = curr.val;
           curr.val =curr.next.val;
           curr.next.val=temp;
        }
        TraversalOfLinkedList.printlist(head);
    }

    private static void swapThePairUsingLinks(Node head){
        for(Node curr= head;curr.next !=null;curr=curr.next.next){
            Node temp = curr;
            curr = curr.next;
            curr.next =temp;
            curr=curr.next;
        }
        TraversalOfLinkedList.printlist(head);
    }
}
