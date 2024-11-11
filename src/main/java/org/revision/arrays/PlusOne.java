package org.revision.arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PlusOne {

    public static void main(String[] args){

        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(4);
        plusOne( list);
    }

    private static ArrayList<Integer> plusOne(ArrayList<Integer> arr){

        // {1, 2, 4}
        StringBuilder sb = new StringBuilder();
        for (int i=0;i<arr.size();i++){
            sb.append(arr.get(i));
        }
        arr.clear();

        String str = String.valueOf(Integer.valueOf(sb.toString())+1);
        for(int i=0;i<str.length();i++){
            char c = str.charAt(i);
            arr.add(Integer.valueOf(str.charAt(i)- '0'));
        }

        return arr;

    }
}
