package com.startjava.lesson_2_3_4.guess;

import java.util.Scanner;

public class GuessNumber {

    final Player[] PLAYERS = new Player[3];

    public GuessNumber(Player... players) {
        int count = 0;
        for (Player player : players) {
            PLAYERS[count] = player;
            count++;
        }
    }

    public void start() {
        PLAYERS[0].clear();
        PLAYERS[1].clear();
        PLAYERS[2].clear();
        System.out.println("У каждого игрока по 10 попыток");
        int secretNum = (int) ((Math.random() * 100) + 1);
        do {
            if (!isGuessed(secretNum, PLAYERS[0])) {
                break;
            }
            if (!isGuessed(secretNum, PLAYERS[1])) {
                break;
            }
            if (!isGuessed(secretNum, PLAYERS[2])) {
                break;
            }
        } while (PLAYERS[2].getNumAttempt() != 10);
        printPlayerNums(PLAYERS[0].getNums(), PLAYERS[0].getName());
        printPlayerNums(PLAYERS[1].getNums(), PLAYERS[1].getName());
        printPlayerNums(PLAYERS[2].getNums(), PLAYERS[2].getName());
    }

    private static boolean isGuessed(int secretNum, Player player) {
        int num = enterNum(player);
        if (player.getNumAttempt() == 10) {
            System.out.println("У игрока " + player.getName() + " закончились попытки");
        }
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
        return true;
    }

    private static void printPlayerNums(int[] nums, String name) {
        for (int num : nums) {
            System.out.print(num + " ");
        }
        System.out.print(" числа принадлежат игроку " + name + "\n");
    }
}