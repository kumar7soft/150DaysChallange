package org.linkedlist;

public class DoublyLinkedListInsertionAtGivenPosition {

    public static void main(String[] args){

    }

    Node addNode(Node head, int p, int x) {

        Node node = new Node(x);
        Node curr = head;
        int counter = 0;
        while (counter < p && curr != null) {
            curr = curr.next;
            counter++;
        }
        if (curr != null) {
            node.next = curr.next;
            if (curr.next != null) {
                curr.next.prev = node;
            }
            curr.next = node;
            node.prev = curr;
        }
        return head;
    }
}
