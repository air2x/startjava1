package com.startjava.lesson_2_3_4.guess;

import java.util.Scanner;

public class GuessNumber {

    private Player player1;
    private Player player2;

    public GuessNumber(Player player1, Player player2) {
        this.player1 = player1;
        this.player2 = player2;
    }

    public void start() {
        int secretNum = (int) ((Math.random() * 100) + 1);
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println(player1.getName() + " введите число");
            int numPlayer = scanner.nextInt();
            if (secretNum == numPlayer) {
                System.out.println(player1.getName() + " победил");
                break;
            }
             if (secretNum > numPlayer) {
                System.out.println(numPlayer + " меньше, чем загадал компьютер");
            } else {
                System.out.println(numPlayer + " больше, чем загадал компьютер");
            }

            System.out.println(player2.getName() + " введите число");
            numPlayer = scanner.nextInt();
            if (secretNum == numPlayer) {
                System.out.println(player2.getName() + " победил");
                break;
            }
             if (secretNum > numPlayer) {
                System.out.println(numPlayer + " меньше, чем загадал компьютер");
            } else {
                System.out.println(numPlayer + " больше, чем загадал компьютер");
            }
        }
    }
}