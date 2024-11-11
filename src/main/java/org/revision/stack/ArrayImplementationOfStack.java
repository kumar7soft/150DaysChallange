package org.revision.stack;

public class ArrayImplementationOfStack {

    int capacity;
    int currentIndex=0;
    int arr[] = null;

   public  ArrayImplementationOfStack(int capacity){
       this.capacity=capacity;
       arr = new int[capacity];
   }
    public  ArrayImplementationOfStack(){
        this.capacity=10;
        arr = new int[capacity];
    }

    public void push(int element){
       if(currentIndex > capacity){
           throw new RuntimeException("Out Of Capacity");
       }
       arr[currentIndex] = element;
        currentIndex=currentIndex+1;
    }

    public int peek(){
       return arr[currentIndex];
    }
    public void pop(){
       if(currentIndex <= 0){
           throw new RuntimeException("No Elements present");
       }
       currentIndex =currentIndex-1;

    }


}
