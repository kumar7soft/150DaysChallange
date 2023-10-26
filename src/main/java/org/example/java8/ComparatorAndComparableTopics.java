package org.example.java8;

public class ComparatorAndComparableTopics {

    public static void main(String[] args){

        Person person = new Person();
        person.setAge(10);
        person.setName("ABC");

        Person person1 = new Person();
        person.setAge(12);
        person.setName("BBB");

        person.compareTo(person1);


    }
}
