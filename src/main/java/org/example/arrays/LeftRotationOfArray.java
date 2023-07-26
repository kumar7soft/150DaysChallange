package org.example.arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class LeftRotationOfArray {



    public static void main(String[] args){

        int arr[] ={1,2,3,4,5};
        List<Integer>  list =new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        List<Integer> integers = rotateLeft(1, list);
        for(Integer number :integers){
            System.out.print(number+" :");
        }
    }





    public static List<Integer> rotateLeft(int d, List<Integer> arr) {

        for(int i=0;i<d;i++) {
            int temp = arr.get(0);
            for (int j = 1; j < arr.size(); j++) {
                arr.set(j - 1, arr.get(j));
            }
            arr.set(arr.size() - 1, temp);
        }

        return arr;
    }
}


