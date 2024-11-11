package org.example.java8;

import java.util.ArrayList;
import java.util.List;

class Employee {
    private String name;
    private int age;
    private double salary;

    public Employee(String name, int age, double salary) {
        this.name = name;
        this.age = age;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public double getSalary() {
        return salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", salary=" + salary +
                '}';
    }
}

class EmplData{

    public List<Employee> getEmplList(){
        List<Employee> employees = new ArrayList<>();
        employees.add(new Employee("Alice", 30, 70000));
        employees.add(new Employee("Bob", 25, 60000));
        employees.add(new Employee("Charlie", 30, 80000));
        employees.add(new Employee("David", 25, 50000));
        employees.add(new Employee("Eve", 35, 90000));
        return employees;
    }

}