package com.startjava.lesson_2_3_4.graduation;

import java.util.Scanner;

public class Bookshelf {

    private final Book[] books = new Book[10];
    private static int numBooks;

    public static int getNumBooks() {
        return numBooks;
    }

    public void addBook() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите название книги: ");
        books[numBooks].setTitle(scanner.nextLine());
        System.out.println("Введите автора книги: ");
        books[numBooks].setAuthor(scanner.nextLine());
        System.out.println("Введите год издания книги: ");
        books[numBooks].setYearPublication(scanner.nextLine());
        numBooks++;
    }

    public void findBook() {

    }

    public void deleteBook() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите название книги для удаления");
        String answer = scanner.nextLine();
        for (Book book : books) {
            if (book.getTitle().equals(answer)) {
                book.setAuthor(null);
                book.setTitle(null);
                book.setYearPublication(null);
            }
        }
    }

    public void getAllBook() {

    }

    public int getNumFreeShelf() {
        int count = 0;
        for (Book book : books) {
            if (book.getTitle() == null) {
                count++;
            }
        }
        return count;
    }

    public void clearShelf() {
        for (Book book : books) {
            book.setAuthor(null);
            book.setTitle(null);
            book.setYearPublication(null);
        }
    }
}
