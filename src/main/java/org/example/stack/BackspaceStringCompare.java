package org.example.stack;

import java.util.Stack;

public class BackspaceStringCompare {

    public static void main(String[] args){


        boolean inputStringsAreSame = isInputStringsAreSame("a#bc", "ad#c");
        System.out.println(inputStringsAreSame);
    }
    private static boolean isInputStringsAreSame(String s1,String s2){
        Stack<Character> stack1 =new Stack<>();
        Stack<Character> stack2 =new Stack<>();
        for(int i=0;i<s1.length();i++){

            if(s1.charAt(i) != '#'){
                stack1.push(s1.charAt(i));
            }else{
                stack1.pop();
            }
            if(s2.charAt(i) != '#'){
                stack2.push(s2.charAt(i));
            }else{
                stack2.pop();
            }
        }

        return stack1.equals(stack2);
    }
}
