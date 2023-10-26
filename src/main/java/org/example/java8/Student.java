package org.example.java8;

import lombok.Data;

import java.time.LocalDate;
import java.util.List;

@Data
public class Student {

    private Long id;
    private String name ;
    private String phoneNumber ;
    private String grade;
    private boolean isPassed;
    private List<String> hobbies;
    private LocalDate dateOfBirth;
    private double marks;
    private boolean isElgibleForVote;

}
