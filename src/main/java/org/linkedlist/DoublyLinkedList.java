package org.linkedlist;

public class DoublyLinkedList {

    public static void main(String[] args){
        Node node = new LinkedListData().doubltLLdate();
        insertAtSpecifiedPosition(node,2,90);
    }
    private static void insertAtBeginingOfDLL(Node head,int x){
        Node node = new Node(x);

        node.next=head;
        node.prev=null;
        TraversalOfLinkedList.printlist(node);
    }

    private static void insertAtEndOfLinkedList(Node head, int x){
        Node curr = head;
        while(curr.next != null){
            curr=curr.next;
        }
        Node node = new Node(x);
        curr.next=node;
        node.prev=curr;
        TraversalOfLinkedList.printlist(head);
    }

    private static void insertAtSpecifiedPosition(Node head, int pos, int x) {
        int counter = 1;
        Node curr = head;

        Node newNode = new Node(x);

        newNode.next = curr.next;
        newNode.prev = curr;

        if (curr.next != null) {
            curr.next.prev = newNode;
        }

        curr.next = newNode;
        TraversalOfLinkedList.printlist(head);
    }
}
