package org.example.first10days;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class DisAppearedNumbersInArray {

    public static void main(String[] args){

        List<Integer> numbers = findDisappearedNumbers(new int[]{4,3,2,7,8,2,3,1});
        for(int n:numbers){
            System.out.println(n);
        }
    }
    public static List<Integer> findDisappearedNumbers(int[] nums) {

        List<Integer> arrayList = new ArrayList<>();
        ArrayList<Integer> list = Arrays.stream(nums)
                .boxed()
                .collect(Collectors.toCollection(ArrayList::new));

        int length =nums.length;
        for(int i=1;i<=length;i++){
            boolean contains = list.contains(i);
            if(!list.contains(i)){
                arrayList.add(i);
            }
        }

   return arrayList;
    }
}
