package org.example.linkedlist;

public class LinkedListCycle {


    public static void main(String[] args){
        Node head = new Node(15);
        head.next = new Node(10);
        head.next.next = new Node(12);
        head.next.next.next = new Node(20);
        head.next.next.next.next=new Node(15);
        head.next.next.next.next = head.next;

        boolean b = hasCycle(head);
        System.out.println(b);
    }
   static public boolean hasCycle(Node head) {
        if (head == null || head.next == null) {
            return false; // Empty list or single node list, no cycle
        }

        Node slow = head;
        Node fast = head.next;

        while (slow != fast) {
            if (fast == null || fast.next == null) {
                return false; // Reached the end, no cycle
            }

            slow = slow.next; // Move slow pointer by one step
            fast = fast.next.next; // Move fast pointer by two steps
        }

        return true; // Fast pointer caught up to slow pointer, cycle exists
    }
}
