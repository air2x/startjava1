package com.startjava.lesson_2_3_4.graduation;

import java.util.Scanner;

public class BookshelfTest {

    public static void main(String[] args) {
        Bookshelf bookshelf = new Bookshelf();
        Scanner scanner = new Scanner(System.in);
        showMenu();
        chekAnswer(scanner.nextInt(), bookshelf);
    }

    private static void showMenu() {
        System.out.print("""
                Выберите действие:
                1. Добавить новую книгу
                2. Удалить книгу
                3. Найти книгу
                4. Показать количество книг
                5. Показать количество свободных полок
                6. Показать весь шкаф
                7. Очистить шкаф""");
    }

    private static void chekAnswer(int answer, Bookshelf bookshelf) {
        if (answer == 1) {
            bookshelf.addBook();
        } else if (answer == 2) {
            bookshelf.deleteBook();
        } else if (answer == 3) {
            bookshelf.findBook();
        } else if (answer == 4) {
            System.out.println("Количество книг " + Bookshelf.getNumBooks());
        } else if (answer == 5) {
            System.out.println("Количество свободных полок " + bookshelf.getNumFreeShelf());
        } else if (answer == 6) {
            bookshelf.getAllBook();
        } else if (answer == 7) {
            bookshelf.clearShelf();
        }
    }
}
