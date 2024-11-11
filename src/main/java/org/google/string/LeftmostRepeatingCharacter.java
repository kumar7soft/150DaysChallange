package org.google.string;

import java.util.HashSet;

public class LeftmostRepeatingCharacter {

    public static void main(String[] args){

        findLeftMostRepeatingCharacter("abbc");
    }
    private static void findLeftMostRepeatingCharacter(String str){
        char[] arr = str.toCharArray();
        HashSet<Character> set = new HashSet<>();
        for(int i=0;i<arr.length;i++){
            if(!set.add(arr[i])){
                System.out.println("Left most repeating character -->"+arr[i]);
                break;
            }
        }
    }

    static void  method(double d, int i){
        System.out.println("Double");

    }
    static void  method(int d, double i){
        System.out.println("int");

    }
    static void  method(String d, String i){
        System.out.println("String");

    }


}
