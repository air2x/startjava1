package com.startjava.lesson_2_3_4.guess;

import java.util.Scanner;

public class GuessNumber {

    private final Player[] players;

    public GuessNumber(Player... players) {
        this.players = players;
    }

    public void start() {
        for (Player player : players) {
            player.clear();
        }
        System.out.println("У каждого игрока по 10 попыток");
        final int secretNum = (int) ((Math.random() * 100) + 1);
        boolean unique = true;
        do {
            for (Player player : players) {
                if (!isGuessed(secretNum, player)) {
                    unique = false;
                    break;
                }
            }
            if (!unique) {
                break;
            }
        } while (players[players.length - 1].getNumAttempt() != 10);
        for (Player player : players) {
            printPlayerNums(player.getNums(), player.getName());
        }
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
        if (secretNum == num) {
            System.out.println("Игрок " + player.getName() + " угадал число " + num + " с " +
                    player.getNumAttempt() + " попытки");
            return false;
        }
        System.out.println(num + (secretNum > num ?
                " меньше" : " больше") + ", чем загадал компьютер");
        return true;
    }

    private static void printPlayerNums(int[] nums, String name) {
        for (int num : nums) {
            System.out.print(num + " ");
        }
        System.out.print(" числа принадлежат игроку " + name + "\n");
    }
}