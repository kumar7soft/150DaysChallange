package org.example.test;

public class Test {

    public static void main(String[] args){

        String str ="ABC ABC [ABC]";
        String cba = str.replace("[ABC]", "CBA");

        System.out.println(cba);
    }
}
