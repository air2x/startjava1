package com.startjava.lesson_2_3_4.graduation;

public class Book {

    private String author;
    private String title;
    private String yearPublication;
    private final int lengthInfoBook = author.length() + title.length() + yearPublication.length();

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getYearPublication() {
        return yearPublication;
    }

    public void setYearPublication(String yearPublication) {
        this.yearPublication = yearPublication;
    }

    public int getLengthInfoBook() {
        return lengthInfoBook;
    }
}
