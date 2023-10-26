package org.example.java8;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class StudentDTO {

    public List<Student> getStudentList(){

        List<Student> list =new ArrayList<>();

        List<String> hobbies1 =  new ArrayList<>();
        hobbies1.add("Reading Books");
        hobbies1.add("Watching web series");
        hobbies1.add("Playing Cricket");

        Student student1 = new Student();
        student1.setId(1l);
        student1.setName("Kumar");
        student1.setGrade("A");
        student1.setPassed(true);
        student1.setHobbies(hobbies1);
        student1.setPhoneNumber("9704110904");
        student1.setDateOfBirth(LocalDate.of(1995, 11, 1));
        student1.setMarks(969);

        Student student2 = new Student();
        student2.setId(2l);
        student2.setName("Swamy");
        student2.setGrade("A+");
        student2.setPassed(true);
        student2.setHobbies(hobbies1);
        student2.setPhoneNumber("7989508990");
        student2.setDateOfBirth(LocalDate.of(1997, 11, 1));
        student2.setMarks(980);

        Student student3 = new Student();
        student3.setId(3l);
        student3.setName("Bellam");
        student3.setGrade("A+");
        student3.setPassed(true);
        student3.setHobbies(hobbies1);
        student3.setPhoneNumber("8978925001");
        student3.setDateOfBirth(LocalDate.of(1990, 11, 1));
        student3.setMarks(950);


        Student student4 = new Student();
        student4.setId(4l);
        student4.setName("Dravid");
        student4.setGrade("D");
        student4.setPassed(false);
        student4.setHobbies(hobbies1);
        student4.setPhoneNumber("8767456545");
        student4.setDateOfBirth(LocalDate.of(1970, 11, 1));
        student4.setMarks(500);

        Student student5 = new Student();
        student5.setId(5l);
        student5.setName("Dhoni");
        student5.setGrade("A+");
        student5.setPassed(true);
        student5.setHobbies(hobbies1);
        student5.setPhoneNumber("9567458998");
        student5.setDateOfBirth(LocalDate.of(1970, 11, 1));
        student5.setMarks(900);


        Student student6 = new Student();
        student6.setId(6l);
        student6.setName("Deepak");
        student6.setGrade("C");
        student6.setPassed(true);
        student6.setHobbies(hobbies1);
        student6.setPhoneNumber("9567988998");
        student6.setDateOfBirth(LocalDate.of(2015, 11, 1));
        student6.setMarks(450);


        list.add(student1);
        list.add(student2);
        list.add(student3);
        list.add(student4);
        list.add(student5);
        list.add(student6);

        return list;

    }
}
