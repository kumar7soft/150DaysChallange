package org.example.linkedlist;

public class LinkedListOperations {

    public static void main(String[] args){
        Node list = new Node(85);
        Node n1 = new Node(15);
       Node n2 = new Node(4);
        Node n3 =new Node(20);
       Node n4 = new Node(30);
        list.prev=null;
        list.next=n1;
        n1.prev=list;
        n1.next=n2;
        n2.prev=n1;
        n2.next=n3;
        n3.prev=n2;
        n3.next=n4;
        n4.prev=n3;
        n4.next=null;
        printLinkedList(list);
        deleteNode(list,3);
        System.out.println();
        printLinkedList(list);
    }

    private static void deleteNodes(Node head, int pos) {
        int current = 1;

        while (current < pos) {
            if (head == null) {
                System.out.println("Position " + pos + " is out of bounds.");
                return;
            }
            head = head.next;
            current++;
        }

        if (head == null) {
            return; // Position is out of bounds
        }

        if (head.prev != null) {
            head.prev.next = head.next;
        }

        if (head.next != null) {
            head.next.prev = head.prev;
        }

        printLinkedList(head.prev); // Print the updated list, head.prev because head has moved to the next node.
    }
    //85,15,4,20,30
    private static void deleteNode(Node head,int pos){

        int current =1;
        while(current<pos){
            head=head.next;
            current++;
        }

        head.prev.next=head.next;
        head.next.prev=head.prev;
        printLinkedList(head.prev);
    }

    private static void printLinkedList(Node node){
        while(node != null){
            System.out.print(node.data+"::");
            node=node.next;
        }

    }
}
