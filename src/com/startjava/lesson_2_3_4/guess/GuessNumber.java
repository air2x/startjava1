package com.startjava.lesson_2_3_4.guess;

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
        for (int i = 0; i < 10; i++) {
            System.out.println(player1.getName() + " введите число");
            int num = scanner.nextInt();
            player1.setNum(num);
            if (secretNum == num) {
                System.out.println("Игрок " + player1.getName() + " угадал число " + num + " с " + (i + 1) +
                        " попытки");
                break;
            }
            if (secretNum > num) {
                System.out.println(num + " меньше, чем загадал компьютер");
            } else {
                System.out.println(num + " больше, чем загадал компьютер");
            }
            if (i == 9) {
                System.out.println("У игрока " + player1.getName() + " закончились попытки");
            }

            System.out.println(player2.getName() + " введите число");
            num = scanner.nextInt();
            player2.setNum(num);
            if (secretNum == num) {
                System.out.println("Игрок " + player2.getName() + " угадал число " + num + " с " + (i + 1) +
                        " попытки");
                break;
            }
            if (secretNum > num) {
                System.out.println(num + " меньше, чем загадал компьютер");
            } else {
                System.out.println(num + " больше, чем загадал компьютер");
            }
            if (i == 9) {
                System.out.println("У игрока " + player2.getName() + " закончились попытки");
            }
        }
        printIntNum(player1.getNum());
        printIntNum(player2.getNum());
    }

    private static void printIntNum(int[] num) {
        for (int element : num) {
            System.out.print(element + " ");
        }
        System.out.println();
    }
}