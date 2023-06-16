package org.example.linkedlist;

public class RemoveDuplicatesFromSortedLinkedList {


    public static void main(String[] args){

    }

    public Node deleteDuplicates(Node head) {
        if (head == null || head.next == null) {
            return head;
        }

        Node current = head;

        while (current != null && current.next != null) {
            if (current.data == current.next.data) {
                Node next = current.next.next; // Store reference to next node
                if (next != null) {
                    next.prev = current; // Update the previous node of the next node
                }
                current.next = next; // Remove duplicate node
            } else {
                current = current.next; // Move to the next node
            }
        }

        return head;
    }
}
