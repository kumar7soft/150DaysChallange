package org.java;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Java8 {

    public static void main(String[] args){

        Map<String, IntSummaryStatistics> totalItemsByCategory = new ItemDTO().getItems().stream().
                collect(Collectors.groupingBy(Item::getCategory, Collectors.summarizingInt(Item::getQuantity)));

        totalItemsByCategory.forEach((category, totalQuantity) ->
                System.out.println("Category: " + category + ", Total Quantity: " + totalQuantity));

    }

    private static void getAverageBasedOnCondition() {
        OptionalDouble excellent = new FeedbackDTO().getFeedBackList().stream().
                filter(feedback -> feedback.getComment().contains("Excellent")).
                mapToDouble(Feedback::getRating).average();
        System.out.println(excellent.getAsDouble());
    }

    private static void secondSmallestElementInTheArray() {
        int[] numbers = {10, 20, 20, 30, 40, 50, 50, 60};

        int secondSmallest = Arrays.stream(numbers)
                .distinct()
                .sorted()
                .skip(2)
                .findFirst()
                .orElseThrow(() -> new RuntimeException("Array doesn't have enough elements"));

        System.out.println("The second smallest element is: " + secondSmallest);
    }

    private static void sumAndMultiply() {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);
        Integer sum = numbers.stream().filter(x -> x % 2 != 0).map(number -> number * number)
                .reduce(0, Integer::sum);
        System.out.println(sum);
    }

    private static void filterAndMap() {
        new BookDTO().getBooks().stream().filter(book->book.getRating()>4.5).map(book->book.getBookName()).collect(Collectors.toList()).forEach(System.out::println);
    }


    private static void longestObject() {
        List<String> words = Arrays.asList("apple", "banana", "cherry", "date");
        Optional<String> longestWord = words.stream()
                .max((word1, word2) -> Integer.compare(word1.length(), word2.length()));

        longestWord.ifPresent(System.out::println); // Output: banana
    }


    private static void countingElementsUsingGroupBy() {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        numbers.stream().
                collect(Collectors.groupingBy(n-> (n%2 == 0?"EVEN":"ODD"), Collectors.counting()));
    }

    private static List<String> groupingByExample() {
        List<String> words = Arrays.asList("apple", "banana", "cherry");
        words.stream().
        flatMapToInt(String::chars).
        mapToObj(c->(char)c).
        collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
        return words;
    }

    private static void filterMapUseCase() {
        new BookDTO().getBooks().stream().filter((x)-> Optional.ofNullable(x.getBookName()).orElse("")
                        .startsWith("C"))
                .map((x)->x.getTitle().toUpperCase())
                .forEach(System.out::println);
    }


}
