package org.example.java8;

@FunctionalInterface
interface Calculator {
    int operate(int a, int b);

    // This is a default method and does not violate the functional interface rule
    default int add(int a, int b) {
        return a + b;
    }

    // This is a static method and does not violate the functional interface rule
    static int subtract(int a, int b) {
        return a - b;
    }
}
