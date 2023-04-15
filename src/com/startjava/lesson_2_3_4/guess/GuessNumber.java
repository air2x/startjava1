package com.startjava.lesson_2_3_4.guess;

import java.util.Scanner;

public class GuessNumber {

    private static Player player1;
    private static Player player2;

    public GuessNumber(Player player1, Player player2) {
        GuessNumber.player1 = player1;
        GuessNumber.player2 = player2;
    }

    public void start() {
        player1.clear();
        player2.clear();
        System.out.println("У каждого игрока по 10 попыток");
        int secretNum = (int) ((Math.random() * 100) + 1);
        do {
            if (!isGuessed(secretNum, player1)) {
                break;
            }
            if (!isGuessed(secretNum, player2)) {
                break;
            }
        } while (player2.getNumAttempt() != 10);
        printPlayerNums(player1.getNums(), player1.getName());
        printPlayerNums(player2.getNums(), player2.getName());
    }

    private static boolean isGuessed(int secretNum, Player player) {
        int num = enterNum(player);
        return checkNum(secretNum, num, player);
    }

    private static int enterNum(Player player) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(player.getName() + " введите число");
        int num = scanner.nextInt();
        while (!player.addNum(num)) {
            System.out.println("Число не входит в интервал от 1 до 100 включительно," + player.getName() +
                    " введите новое число");
            num = scanner.nextInt();
        }
        return num;
    }

    private static boolean checkNum(int secretNum, int num, Player player) {
        Scanner scanner = new Scanner(System.in);
        while (num < 1 || num > 100) {
            System.out.println("Число не входит в интервал от 1 до 100 включительно, введите новое число");
            num = scanner.nextInt();
        }
        if (secretNum == num) {
            System.out.println("Игрок " + player.getName() + " угадал число " + num + " с " +
                    player.getNumAttempt() + " попытки");
            return false;
        }
        System.out.println(num + (secretNum > num ?
                " меньше, чем загадал компьютер" : " больше, чем загадал компьютер"));
        if (player.getNumAttempt() == 10) {
            System.out.println("У игрока " + player.getName() + " закончились попытки");
        }
        return true;
    }

    private static void printPlayerNums(int[] nums, String name) {
        for (int num : nums) {
            System.out.print(num + " ");
        }
        System.out.print(" числа принадлежат игроку " + name + "\n");
    }
}