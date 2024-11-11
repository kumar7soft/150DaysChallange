package org.linkedlist;

public class DeleteNodeDLL {

    public static void main(String[] args){

        deleteFirstNodeOfDLL(new LinkedListData().date());
    }

    static Node deleteFirstNodeOfDLL(Node head){
        if(head==null)return null;
        if(head.next==null){
            return null;
        }
        else{
            head=head.next;
            head.prev=null;
            return head;
        }
    }
}
