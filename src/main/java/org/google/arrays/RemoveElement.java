package org.google.arrays;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class RemoveElement {

    public static void main(String[] args){

    }

    private static void removeElement(int arr[]){

        List<Integer> list = Arrays.stream(arr).boxed().collect(Collectors.toList());
        int len =list.stream().filter(a->a !=2).toArray().length;


    }
}
