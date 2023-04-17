package com.startjava.lesson_2_3_4.guess;

import java.util.Scanner;

public class GuessNumberTest {

    private static final Player[] players = new Player[3];

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        GuessNumber game = new GuessNumber(creatingPlayers(1), creatingPlayers(2), creatingPlayers(3));
        String answer = "yes";
        do {
            if (answer.equals("yes")) {
                game.start();
            }
            System.out.println("\nХотите продолжить игру? [yes/no]");
            answer = scanner.nextLine();
        } while (!answer.equals("no"));
    }

    public static Player creatingPlayers(int numPlayer) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(numPlayer + "-й игрок назовите ваше имя");
        return players[numPlayer - 1] = new Player(scanner.nextLine());
    }
}