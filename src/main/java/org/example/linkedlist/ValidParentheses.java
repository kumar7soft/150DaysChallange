package org.example.linkedlist;

import java.util.Stack;

public class ValidParentheses {


    public static void main(String[] args){
       System.out.println(checkIsParanthesesValid("{[]}"));
    }

    static private boolean checkIsParanthesesValid(String str){

        Stack<Character> stack = new Stack<>();

        for(int i=0;i<str.length();i++){

            char c = str.charAt(i);
            if(c =='{' || c=='['||c=='('){
                stack.push(c);
            }
            if(stack.isEmpty()){
                return false;
            }
            char ch;
            switch(c) {
                case ']':
                    ch=stack.pop();
                    if(ch == '{' || ch == '(') {
                        return false;
                    }
                    break;
                case '}':
                    ch=stack.pop();
                    if(ch == '[' || ch == '(') {
                        return false;
                    }
                    break;
                case ')':
                    ch=stack.pop();
                    if(ch == '[' || ch == '{') {
                        return false;
                    }
                    break;
            }
        }

        return  stack.isEmpty();
    }

        }

