package org.linkedlist;

public class RemoveDuplicatesFromSortedLL {

    public static void main(String[] args){

        Node data = new LinkedListData().date();
        removeDuplicates(data);
    }

    //10->10->20->30->40

    private static void removeDuplicates(Node head){

        Node curr = head;


        while(curr !=null && curr.next != null){

            if(curr.val == curr.next.val){
               curr.next=curr.next.next;
            }else {
                curr = curr.next;
            }
        }
        TraversalOfLinkedList.printlist(head);
    }
}
