package org.linkedlist;

public class DeleteANodeInLL {
    
    public static void main(String[] args){
        Node data = new LinkedListData().date();
        deleteNodeAtLastPos(data);

    }

    //10->20->30->40->50

    private static void deleteNodeAtLastPos(Node head){
        Node curr = head;

        while(curr.next.next != null){
            curr = curr.next;
        }
        curr.next = null;
        TraversalOfLinkedList.printlist(head);

    }
    private static void deleteNodeAtFirstPos(Node head){
        int counter =1;
        Node curr =head;

        while(counter<2){
            curr = curr.next;
            counter=counter+1;
        }
        head.next = head.next.next;

         TraversalOfLinkedList.printlist(head);

    }
}
