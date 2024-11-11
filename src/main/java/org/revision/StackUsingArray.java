package org.revision;

public class StackUsingArray {

    int arr[] = null;
    int currentIndex=0;
    int size;

    public StackUsingArray(int size){
        this.size = size;
        arr = new int[size];
    }
    public StackUsingArray(){
        this.size=10;
        arr = new int[size];
        System.out.println(arr.length);
    }

    public void push(int element){
        if(currentIndex>size){
            System.out.println("Not possible to store beyond size");
            throw new RuntimeException("Not possible to store beyond size\"") ;
        }
        arr[currentIndex] = element;
        currentIndex=currentIndex+1;

    }
    // returning the removing element from the stack
    public int pop(){
        if(currentIndex == 0){
            throw new RuntimeException("Not possible to remove element from empty array") ;
        }
        currentIndex=currentIndex-1;
        int element = arr[currentIndex];
        return element;
    }
    public int peek(){
        return currentIndex;

    }
}


