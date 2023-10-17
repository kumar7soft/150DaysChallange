package org.example.java8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

import static java.lang.Long.sum;

public class Java8Tutorial {

    public static void main(String[] args){
        int[] arr = { 5, 10, 3, 8, 6 };
        int i = Arrays.stream(arr)
                .distinct()
                .sorted()
               .skip(arr.length -3)
                .findFirst()
                .orElse(Integer.MIN_VALUE);
        System.out.println(i);

        String inputString ="Happy";
        Map<Character, Long> collect =
                inputString.chars()
                .mapToObj(c -> (char) c)
                .collect(Collectors.groupingBy(c -> c, Collectors.counting()));

        System.out.println(collect);

    }

    }
