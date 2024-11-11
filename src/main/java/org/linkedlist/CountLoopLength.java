package org.linkedlist;

public class CountLoopLength {

    public static void main(String[] args){
        Node head = new Node(25);
        head.next = new Node(14);
        head.next.next = new Node(19);
        head.next.next.next = new Node(33);
        head.next.next.next.next = new Node(10);
        head.next.next.next.next.next = new Node(21);
        head.next.next.next.next.next.next = new Node(39);
        head.next.next.next.next.next.next.next = new Node(90);
        head.next.next.next.next.next.next.next.next = new Node(58);
        head.next.next.next.next.next.next.next.next.next = new Node(45);

        // Create a loop where the last node points to the 4th node (c = 4)
        createLoop(head, 4);

        // Detect and count nodes in the loop
        int result = countNodesInLoop(head);
        System.out.println("Loop length: " + result);
    }

    public static int countNodesInLoop(Node head) {
        Node slow = head, fast = head;

        // Step 1: Detect loop using Floyd’s Cycle-Finding Algorithm
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;

            // If slow and fast meet, there is a loop
            if (slow == fast) {
                return countLoopLength(slow);
            }
        }

        // No loop detected
        return 0;
    }
    private static int countLoopLength(Node slow) {
        Node temp = slow;
        int count = 1;  // Start count at 1 since we start from slow

        // Move around the loop until we come back to the same node
        while (temp.next != slow) {
            count++;
            temp = temp.next;
        }
        return count;
    }

    // Utility function to create a loop in the list
    public static void createLoop(Node head, int c) {
        if (c == 0) return; // No loop if c is 0

        Node temp = head;
        Node loopNode = null;

        // Traverse the list to the point where the loop starts
        for (int i = 1; temp != null; i++) {
            if (i == c) {
                loopNode = temp;  // Save the c-th node
            }
            temp = temp.next;
        }

        // Traverse to the last node and point it to the loop node
        if (temp != null && loopNode != null) {
            temp.next = loopNode;
        }
    }
}
