package org.revision.arrays;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class MajorityElement {

    public static void main(String[] args){

        findMajorityElement(new int[] {3, 1, 3, 3, 2});
    }
    //3, 1, 3, 3, 2

    private static long findMajorityElement(int arr[]){

        Map<Integer, Long> occurrenceMap = Arrays.stream(arr)
                .boxed()
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));

        List<Long> collect = occurrenceMap.entrySet().stream().
                filter(entry -> entry.getValue() > arr.length / 2).
                map(Map.Entry::getValue).collect(Collectors.toList());

        for (Long l : collect){
            System.out.println(l);
        }
        Long majorityElement = collect.get(0);
        return collect.size() !=0 ? majorityElement:-1;


    }

}
