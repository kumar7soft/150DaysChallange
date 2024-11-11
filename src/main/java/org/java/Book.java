package org.java;

import lombok.Data;

@Data
public class Book {
    private long id;
    private String bookName;
    private String author;

    private String title;

    private Double rating;

    public Book(long id, String bookName, String author, String title, Double rating) {
        this.id = id;
        this.bookName = bookName;
        this.author = author;
        this.title = title;
        this.rating = rating;
    }
}
