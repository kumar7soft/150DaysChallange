package org.example.linkedlist;

import java.util.LinkedList;

public class ReverseLinkedList {

    public static void main(String[] args){


        Node list = new Node(85);
        list.next = new Node(15);
        list.next.next = new Node(4);
        list.next.next.next = new Node(20);

        printLiknedList(list);
        Node reverse = reverse(list);
        System.out.println();
        printLiknedList(reverse);


    }
    static Node reverse(Node node)
    {
        Node prev = null;
        Node current = node;
        Node next = null;
        while (current != null) {
            next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }
        node = prev;
        return node;
    }

    private static void printLiknedList(Node node){
        while(node!= null){
            System.out.print(node.data+" :");
            node=node.next;
        }
    }
}
