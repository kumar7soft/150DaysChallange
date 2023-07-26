package org.example.hackerrank;

import java.util.ArrayList;
import java.util.List;

public class ReverseList {

    public static void main(String[] args){

        List<Integer> list =new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        List<Integer> integers = reverseArray(list);
        for(Integer n:integers){
            System.out.print(n+" ");
        }
    }

    public static List<Integer> reverseArray(List<Integer> a) {

        List<Integer> list =new ArrayList<>();
        for(int i=a.size()-1;i>=0;i--){
            list.add(a.get(i));
        }
        return list;
    }
}
