package org.example.linkedlist;

public class InsertionInMiddleOfLinkedList {

    public static void main(String[] args){

        Node list = new Node(85);
        list.next = new Node(15);
        list.next.next = new Node(4);

        list.next.next.next = new Node(20);
        list.next.next.next.next = new Node(30);
        //insertAtSpecificPosition(list,3,10);
        deleteAtSpecificPosition(2,list);
    }

    private static void deleteAtSpecificPosition(int pos,Node head){

        int current = 1;
        Node currentNode =head;
      while(currentNode != null){
          if(current==pos){
              currentNode=currentNode.next.next;
          }
          currentNode=currentNode.next;
          current++;
      }

        printLinkedList(head);


    }
    private static void insertAtSpecificPosition(Node head , int pos,int number){

        if (pos < 1) {
            System.out.println("Invalid position");
            return;
        }
        Node newNode = new Node(number);
        if (pos == 1) {
            newNode.next = head;
            printLinkedList(newNode);
            return;
        }
        int current = 1;
        Node currentPtr = head;
        while (current < pos - 1 && currentPtr != null) {
            currentPtr = currentPtr.next;
            current++;
        }
        if (current != pos - 1 || currentPtr == null) {
            System.out.println("Position out of bounds");
            return;
        }
        newNode.next = currentPtr.next;
        currentPtr.next = newNode;
        printLinkedList(head);
    }

    private static void printLinkedList(Node node){
        while(node != null){
            System.out.print(node.data+"::");
            node=node.next;
        }
    }
}
