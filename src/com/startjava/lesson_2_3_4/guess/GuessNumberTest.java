package com.startjava.lesson_2_3_4.guess;

import java.util.Scanner;

public class GuessNumberTest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Первый игрок назовите ваше имя");
        String name = scanner.nextLine();
        Player player1 = new Player(name);
        System.out.println("Второй игрок назовите ваше имя");
        name = scanner.nextLine();
        Player player2 = new Player(name);
        GuessNumber game = new GuessNumber(player1, player2);
        String answer = "yes";
        while (answer.equals("yes")) {
            game.start();
            do {
                System.out.println("Хотите продолжить игру? [yes/no]");
                answer = scanner.nextLine();
            } while (!answer.equals("no") && !answer.equals("yes"));
        }
    }
}