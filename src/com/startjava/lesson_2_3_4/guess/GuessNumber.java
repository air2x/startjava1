package com.startjava.lesson_2_3_4.guess;

import java.util.Arrays;
import java.util.Scanner;

public class GuessNumber {

    private final Player player1;
    private final Player player2;

    public GuessNumber(Player player1, Player player2) {
        this.player1 = player1;
        this.player2 = player2;
    }

    public void start() {
        System.out.println("У каждого игрока по 10 попыток");
        int secretNum = (int) ((Math.random() * 100) + 1);
        Scanner scanner = new Scanner(System.in);
        int[] numPlayer1 = new int[10];
        int[] numPlayer2 = new int[10];
        for (int i = 0; i < 10; i++) {
            System.out.println(player1.getName() + " введите число");
            numPlayer1[i] = scanner.nextInt();
            player1.setNum(numPlayer1);
            if (secretNum == numPlayer1[i]) {
                System.out.println("Игрок " + player1.getName() + " угадал число " + numPlayer1[i] + " с " + (i + 1) +
                        " попытки");
                break;
            }
            checkMoreOrLess(secretNum, numPlayer1[i]);
            if (i == 9) {
                System.out.println("У игрока " + player1.getName() + " закончились попытки");
            }

            System.out.println(player2.getName() + " введите число");
            numPlayer2[i] = scanner.nextInt();
            player2.setNum(numPlayer2);
            if (secretNum == numPlayer2[i]) {
                System.out.println("Игрок " + player2.getName() + " угадал число " + numPlayer2[i] + " с " + (i + 1) +
                        " попытки");
                break;
            }
            checkMoreOrLess(secretNum, numPlayer2[i]);
            if (i == 9) {
                System.out.println("У игрока " + player2.getName() + " закончились попытки");
            }
        }
        player1.setNum(numPlayer1);
        player2.setNum(numPlayer2);
        printIntNum(player1.getNum());
        printIntNum(player2.getNum());
    }

    private static void printIntNum(int[] num) {
        int count = 0;
        for (int j : num) {
            if (j != 0) {
                count++;
            }
        }
        int[] numCopy = Arrays.copyOf(num, count);
        System.out.println();
        for (int element : numCopy) {
            System.out.print(element + " ");
        }
    }

    private static void checkMoreOrLess(int secretNum, int numPlayer) {
        if (secretNum > numPlayer) {
            System.out.println(numPlayer + " меньше, чем загадал компьютер");
        } else {
            System.out.println(numPlayer + " больше, чем загадал компьютер");
        }
    }
}