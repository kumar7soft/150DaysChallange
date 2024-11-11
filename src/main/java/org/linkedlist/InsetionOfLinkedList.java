package org.linkedlist;

public class InsetionOfLinkedList {

    public static void main(String[] args){
        Node data = new LinkedListData().date();
       // Node head = insertAtStaringOfLL(null, 90);
       // Node head = insertAtEndOfLL(data,90);
        TraversalOfLinkedList.printlist(data);
        System.out.println("_______________");
        Node head =  insertAtGivenPositionOfSinglyLinkedList(data,90,2);
        TraversalOfLinkedList.printlist(head);


    }

    private static Node insertAtGivenPositionOfSinglyLinkedList(Node head, int x, int pos){

       Node curr = head;

       int coutner =1;

       while(coutner<pos){
           curr = curr.next;
           coutner=coutner+1;
       }
        Node node = new Node(x);
        node.next = curr.next; // Link new node to the next node
        curr.next = node;

       return head;

    }
    private static Node insertAtStaringOfLL(Node head,int x){

        if(head == null){
            head = new Node(x);
            return head;
        }
       Node node = new Node(x);
        node.next= head;
        return node;

    }

    private static Node insertAtEndOfLL(Node head , int x){
        if( head == null){
            head = new Node(x);
            return head;
        }
        Node curr = head;
        while(curr.next != null){
            curr =curr.next;
        }
        Node node = new Node(x);
        curr.next =node;
        return head;
    }
}
