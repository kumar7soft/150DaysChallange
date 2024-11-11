package org.example.java8;


//1, 2, 3, 4, 5, 6
/* Given a list of integers, filter the even numbers,
square them, and then calculate their sum using the Streams API.
give me example question and don't give the answer */


import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Java8Problems {

    public static void main(String[] args){

        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6);
        int sum = list.stream().filter(x -> x % 2 == 0).map(x -> x * x).mapToInt(Integer::intValue).sum();
        //System.out.println(sum);

        // maximum numbers in the odd values
        //1, 2, 3, 4, 5, 6, 7 ==7
        List<Integer> list1 = Arrays.asList(1, 2, 3, 4, 5, 6);
        Stream<Integer> skip = list1.stream().filter(x -> x % 2 != 0).sorted(Comparator.reverseOrder()).limit(1);
        //skip.forEach(x->System.out.println(x));


        /*
        Count Strings Starting with a Specific Letter
        Problem: Given a list of strings, count how many strings start with the letter
        'A' (case-insensitive) using the Streams API.
        */

        List<String> fruitsList = Arrays.asList("Apple", "Banana", "Avocado", "Mango", "Apricot");
        long a = fruitsList.stream().filter(x -> x.startsWith("A")).count();
        //System.out.println(a);

        /*
        Find the Longest Word
        Problem: Given a list of strings, find the longest word using the Streams API.
        Example: For the input list ["apple", "banana", "strawberry", "kiwi"], the result should be "strawberry".
         */

        List<String> fruits = Arrays.asList("apple", "banana", "strawberry", "kiwi");

        //fruits.stream().sorted(Comparator.reverseOrder()).limit(1).forEach(x-> System.out.println(x));

        /*
        Find the Sum of All Positive Numbers
        Problem: Given a list of integers (which can include both positive and negative numbers),
        filter out the positive numbers and then calculate their sum using the Streams API.
        Example: For the input list [-5, 10, -15, 20, -25], the result should be 30.
         */
        List<Integer> intList = Arrays.asList(-5, 10, -15, 20, -25);
        int res = intList.stream().filter(x -> x > 0).mapToInt(Integer::intValue).sum();
        //System.out.println(res);

        List<Integer> integers = Arrays.asList(3, 2, 6, 4, 4, 8, 6);
        List<Integer> collect = integers.stream().distinct().filter(x -> x % 2 == 0).sorted().collect(Collectors.toList());
        //collect.forEach(x-> System.out.print(x));

        List<Integer> intLists = Arrays.asList(5, 12, 18, 7, 14, 20);
        OptionalDouble average = intLists.stream().filter(x -> x > 10).mapToInt(Integer::intValue).average();
        //System.out.println(average.getAsDouble());

        /*
        Group Strings by Their Length
        Problem: Given a list of strings, group them by their length using the Streams API.
        Example: For the input list ["cat", "dog", "elephant", "bat", "antelope"], the result should be a map like:
         */

        List<String> listString = Arrays.asList("cat", "dog", "elephant", "bat", "antelope");

        Map<Integer, List<String>> collect1 = listString.stream().collect(Collectors.groupingBy(String::length));
        //System.out.println(collect1);

        List<Integer> integers1 = Arrays.asList(5, 1, 9, 4, 7, 2);
        Stream<Integer> skip1 = integers1.stream().sorted().skip(1).limit(1);
        skip1.forEach(s-> System.out.println(s));

       // Arrays.asList(1, 2, 3, 4).stream().mapToInt(Integer::intValue)

        List<Integer> numbers = Arrays.asList(1, 2, 2, 3, 3, 3, 4, 4, 4, 4);
        Optional<Integer> integer = numbers.stream().collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
                .entrySet().stream()
                .max(Map.Entry.comparingByValue())
                .map(Map.Entry::getKey);
        System.out.println(integer.get());

    }
}
