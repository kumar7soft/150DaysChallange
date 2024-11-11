package org.linkedlist;

public class ReverseSinglyLinkedList {

    public static void main(String[] args) {

        Node head = new LinkedListData().date();
        reverseList(head);

    }

    //10->20->30->40
    public static Node reverseList(Node head) {
        Node previous = null;
        Node current = head;
        Node next = null;
        while (current != null) {
            next = current.next;

            current.next = previous;
            previous = current;
            current = next;
        }
        return previous;
    }
}


