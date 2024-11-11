package org.linkedlist;

import java.util.HashSet;

public class DetectLoopInLL {

    public static void main(String[] args){
        Node head=new Node(15);
        head.next=new Node(10);
        head.next.next=new Node(12);
        head.next.next.next=new Node(20);
        head.next.next.next.next=head.next;
        detectLoopUsingTwoPointers(head);


    }

    public static void detectLoopUsingTwoPointers(Node head){
        Node slow =head;
        Node fast = head.next;

        while(fast != null && fast.next != null){
            slow=slow.next;
            fast=fast.next.next;
            if(slow == fast){
                System.out.println("Loop detected");
                break;
            }
        }
    }

    private static void detectLoopUsingHashing(Node head){
        HashSet<Node> set = new HashSet<>();
        boolean isLoopDetected = false;
        for(Node curr = head; curr.next != null;curr=curr.next){
            if(set.contains(curr)){
                isLoopDetected=true;
                System.out.println("Loop Detected");
                return;
            }
            set.add(curr);
        }
        if(!isLoopDetected){
            System.out.println("Loop is not detected");
        }
    }
}
