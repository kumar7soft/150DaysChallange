package org.linkedlist;

import java.util.Arrays;
import java.util.List;

public class ReverseDoublyLinkedList {

    public static void main(String[] args) {
        Node data = new LinkedListData().date();
        Node node = reverseDLLBasedOnList(data);
        printDLL(node);

    }

    //10->20->30->40->50
    static Node reverseDLL(Node head) {
        Node temp = null;
        Node curr = head;

        // Traverse the linked list and swap the next and prev pointers
        while (curr != null) {
            temp = curr.prev;
            curr.prev = curr.next;
            curr.next = temp;
            curr = curr.prev; // Move to the previous node, which is the next node after swapping
        }

        // After the loop, temp points to the previous node of the new head, so update head
        if (temp != null) {
            head = temp.prev;
        }

        return head;
    }

    //10->20->30->40->50
    static Node reverseDLLBasedOnList(Node head){

        List<Integer> list = Arrays.asList(2, 4);
        int coutner =1;
        Node curr =head;
        Node temp = null;
        while(curr !=null){
            if(list.contains(coutner)){
                temp = curr.prev;
                curr.prev=curr.next;
                curr.next=temp;
                curr = curr.prev;
            }
            else {
                curr=curr.next;
            }
            coutner++;
        }
        if (temp != null && temp.prev != null) {
            head = temp.prev; // Update the head to point to the new head after reversal
        }
        return head;
    }
    static void  printDLL(Node head) {
        Node curr = head;
        while (curr != null) {
            System.out.print(curr.val + " ");
            curr = curr.next;  // Move to the next node
        }
        System.out.println();  // Move to the next line after printing the list
    }
}