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
        player1.newGame();
        player2.newGame();
        System.out.println("У каждого игрока по 10 попыток");
        int secretNum = (int) ((Math.random() * 100) + 1);
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println(player1.getName() + " введите число");
            int num = scanner.nextInt();
            player1.addNum(num, player1.getNumAttempt());
            if (secretNum == num) {
                System.out.println("Игрок " + player1.getName() + " угадал число " + num + " с " +
                        (player1.getNumAttempt() + 1) + " попытки");
                break;
            } else if (secretNum > num) {
                System.out.println(num + " меньше, чем загадал компьютер");
            } else {
                System.out.println(num + " больше, чем загадал компьютер");
            }
            if (player1.getNumAttempt() == 10) {
                System.out.println("У игрока " + player1.getName() + " закончились попытки");
                break;
            }
            player1.setNumAttempt(player1.getNumAttempt() + 1);

            System.out.println(player2.getName() + " введите число");
            num = scanner.nextInt();
            player2.addNum(num, player2.getNumAttempt());
            if (secretNum == num) {
                System.out.println("Игрок " + player2.getName() + " угадал число " + num + " с " +
                        (player2.getNumAttempt() + 1) + " попытки");
                break;
            } else if (secretNum > num) {
                System.out.println(num + " меньше, чем загадал компьютер");
            } else {
                System.out.println(num + " больше, чем загадал компьютер");
            }
            if (player2.getNumAttempt() == 10) {
                System.out.println("У игрока " + player2.getName() + " закончились попытки");
                break;
            }
            player2.setNumAttempt(player2.getNumAttempt() + 1);
        }
        printPlayerNums(player1.getNums(), player1.getName());
        printPlayerNums(player2.getNums(), player2.getName());
    }

    private static void printPlayerNums(int[] nums, String name) {
        for (int num : nums) {
            System.out.print(num + " ");
        }
        System.out.print(" числа принадлежат игроку " + name + "\n");
    }
}