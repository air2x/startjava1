package com.startjava.lesson_2_3_4.guess;

import java.util.Scanner;

public class GuessNumberTest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Первый игрок назовите ваше имя");
        Player player1 = new Player(scanner.nextLine());
        System.out.println("Второй игрок назовите ваше имя");
        Player player2 = new Player(scanner.nextLine());
        GuessNumber game = new GuessNumber(player1, player2);
        String answer = "yes";
        do {
            if (answer.equals("yes")) {
                game.start();
            }
            System.out.println("\nХотите продолжить игру? [yes/no]");
            answer = scanner.nextLine();
        } while (!answer.equals("no"));
    }
}