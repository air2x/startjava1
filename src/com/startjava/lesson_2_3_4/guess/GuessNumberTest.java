package com.startjava.lesson_2_3_4.guess;

import java.util.Scanner;

public class GuessNumberTest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        GuessNumber game = new GuessNumber(creatPlayer(1), creatPlayer(2), creatPlayer(3));
        String answer = "yes";
        do {
            if (answer.equals("yes")) {
                game.start();
            }
            System.out.println("\nХотите продолжить игру? [yes/no]");
            answer = scanner.nextLine();
        } while (!answer.equals("no"));
    }

    public static Player creatPlayer(int numPlayer) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(numPlayer + "-й игрок назовите ваше имя");
        return new Player(scanner.nextLine());
    }
}