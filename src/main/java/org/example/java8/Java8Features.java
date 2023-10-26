package org.example.java8;

import java.time.LocalDate;
import java.time.Period;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Java8Features {

    public static void main(String[] args){
        List<Student> studentList = new StudentDTO().getStudentList();
       // mapOperations(studentList);
        //sortingOptions(studentList);

        optionalExample(studentList);
    }

    private static void sortingOptions(List<Student> studentList){

        //sorting based on condition
        //List<Double> collect = studentList.stream().filter(student -> student.getMarks() > 900).sorted(Comparator.reverseOrder()).collect(Collectors.toList());

        List<Student> collect = studentList.stream()
                .filter(student -> student.getMarks() > 90)
                .sorted(Comparator.comparing(Student::getMarks, Comparator.reverseOrder())) // Sort by marks in reverse order
                //.map(Student::getMarks)
                .collect(Collectors.toList());
        studentList.stream().sorted(Comparator.comparing(Student::getDateOfBirth, Comparator.naturalOrder())).forEach(student -> System.out.println(student.getName()));
        // Collect into a List

    }

    //map operations
    private static void mapOperations(List<Student> studentList){

        //List<Student> collect = studentList.stream().map(Java8Features::processResults).collect(Collectors.toList());
        studentList.stream().filter(student -> Period.between(student.getDateOfBirth(),LocalDate.now()).getYears()>18).forEach(student -> student.setElgibleForVote(true));
        studentList.forEach(student -> System.out.println(student.getName() + ": " + student.getDateOfBirth()+" : "+ student.isElgibleForVote()));
    }

    private static void optionalExample(List<Student> studentList){
        Optional<Student> first = studentList.stream().findFirst();

        Person person=null;
        Optional<Person> person1 = Optional.of(person);

        System.out.println(person1.isPresent());

    }
    private static  Student processResults(Student student){

        if(student.getMarks()>=950){
            student.setGrade("A+");
        }
           else if(student.getMarks()>=900 && student.getMarks()<=950 ){
                student.setGrade("A");
            }else if(student.getMarks()>=800 && student.getMarks()<=900){
                student.setGrade("B");
            }else{
            student.setGrade("c");
        }
        return student;
    }

}
