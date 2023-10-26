package org.example.java8;

import lombok.Data;

@Data
public class Person implements Comparable<Person> {
    private String name;
    private int age;

    // Constructor and other methods...

    @Override
    public int compareTo(Person otherPerson) {
        return this.name.compareTo(otherPerson.name);
    }
}

