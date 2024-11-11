package org.example.java8;

import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class CustomSortingUsingStreams {

    public static void main(String[] args){
        List<Employee> emplList = new EmplData().getEmplList();
        Stream<Employee> sorted = emplList.stream().sorted(Comparator.comparing(Employee::getName));
        //sorted.forEach(emp-> System.out.println(emp));
        /* emplList.stream().sorted(Comparator.comparingDouble(Employee::getSalary).reversed()).
                forEach(emp-> System.out.println(emp)); */

        Map<Integer, List<Employee>> collect = emplList.stream().sorted(Comparator.comparing(Employee::getName)).sorted(Comparator.comparingDouble(Employee::getSalary).reversed()).
                collect(Collectors.groupingBy(Employee::getAge));

        collect.entrySet().stream().forEach(emp-> System.out.println(emp));



    }
}
