package org.linkedlist;

public class SearchInALinkedList {

    public static void main(String[] args){
        Node data = new LinkedListData().date();
        System.out.println(searchElementInRecursive(data,30));
    }

    private static int searchElementInRecursive(Node head,int x){
    int counter=1;
       if(head == null){
           return -1;
       }
       if(head.val == x){
           return counter;
       }
       return searchElementInRecursive(head.next,x);
    }
}
