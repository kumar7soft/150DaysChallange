package org.revision.stack;

import java.util.Stack;

public class ValidParanthasis {

    public static void main(String[] args){

        validParanthasis("(){}}{");

    }

    private static boolean validParanthasis(String str){

        Stack<Character> stack = new Stack<>();

        for(int i=0;i<str.length();i++){
            char sym = str.charAt(i);
            if(sym == '{' || sym == '[' || sym == '('){
                stack.push(sym);
            }else{
                if(stack.isEmpty()){
                    return false;
                }
                Character pop = stack.peek();
                if(sym == '}' && pop != '{'){
                    return false;
                }else if(sym == ']' && pop != '['){
                    return false;
                }else if(sym == ')' && pop != '('){
                    return false;
                }else{
                    stack.pop();
                }
            }

        }
        return stack.isEmpty();
    }
}
