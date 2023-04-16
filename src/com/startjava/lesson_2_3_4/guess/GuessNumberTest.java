package com.startjava.lesson_2_3_4.guess;

import java.util.Scanner;

public class GuessNumberTest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Player[] players = new Player[3];
        for (int i = 0; i < players.length; i++) {
            System.out.println(i + 1 + "-й игрок назовите ваше имя");
            players[i] = new Player(scanner.nextLine());
        }
        GuessNumber game = new GuessNumber(players[0], players[1], players[2]);
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