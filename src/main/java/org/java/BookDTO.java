package org.java;

import java.util.Arrays;
import java.util.List;

public class BookDTO {

    public List<Book> getBooks(){
        List<Book> books = Arrays.asList(
                new Book(1L, "Effective Java", "Joshua Bloch", "Programming", 4.8),
                new Book(2L, "Clean Code", "Robert C. Martin", "Programming", 4.7),
                new Book(3L, "Java Concurrency in Practice", "Brian Goetz", "Programming", 4.6),
                new Book(4L, "The Pragmatic Programmer", "Andrew Hunt", "Programming", 4.7),
                new Book(5L, "Design Patterns", "Erich Gamma", "Programming", 4.5),
                new Book(1L, null, "Joshua Bloch", "Programming", 4.8)
        );
        return books;
    }
}
