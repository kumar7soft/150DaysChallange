package org.revision;

public class Test {

    public static void main(String[] args){
        StackUsingArray stack = new StackUsingArray();

        stack.push(10);
        System.out.println(stack.peek());
        System.out.println(stack.pop());
    }
}
