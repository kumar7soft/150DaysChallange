package org.example.java8;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Stream;

public class FunctionalInterfaceFeatureTesting {

    public static void main(String[] args){

        //predicateTest(10);
        limitOperations();

    }

    private static void limitOperations(){
        Stream<Integer> numbers = Stream.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        Stream<Integer> limitedNumbers = numbers.limit(5);
        limitedNumbers.forEach(System.out::println);
    }

    private static void consumerTesting(){
        Consumer<String> printName = name -> System.out.println("Name: " + name);

        List<String> names = Arrays.asList("Alice", "Bob", "Charlie");
        names.stream().forEach(name->System.out.println(name));

    }

    private static void predicateTest(int aa){
       Predicate<Integer> pre = a->a ==4 ;
        boolean test = pre.test(aa);
        System.out.println(test);
    }

    private static void mapTest(int a){

        Function<Integer,Integer> fun = aa->a*a;

        Integer apply = fun.apply(10);
        System.out.println(apply);
    }

    private static void sampleFunctionalInterfaceTesting() {
        Calculator addition = (a, b) -> a + b;
        int operate = addition.operate(5, 6);
        Calculator multiplication  =(a,b)->a*b;
        int multi = multiplication.operate(10, 9);
        System.out.println(multi);
    }
}
