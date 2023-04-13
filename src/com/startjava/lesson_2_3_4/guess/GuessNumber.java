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
        player1.clear();
        player2.clear();
        System.out.println("У каждого игрока по 10 попыток");
        int secretNum = (int) ((Math.random() * 100) + 1);
        do {
            if (!checkPlayerNumPrintResult(secretNum, player1, enterNum(player1))) {
                break;
            }
            if (!checkPlayerNumPrintResult(secretNum, player2, enterNum(player2))) {
                break;
            }
        } while (player2.getNumAttempt() != 10);
        printPlayerNums(player1.getNums(), player1.getName());
        printPlayerNums(player2.getNums(), player2.getName());
    }

    private static boolean checkPlayerNumPrintResult(int secretNum, Player player, int num) {
        player.addNum(num);
        if (secretNum == num) {
            System.out.println("Игрок " + player.getName() + " угадал число " + num + " с " +
                    player.getNumAttempt() + " попытки");
            return false;
        }
        System.out.println(num + (secretNum > num ?
                " меньше, чем загадал компьютер" : " больше, " + "чем загадал компьютер"));
        if (player.getNumAttempt() == 10) {
            System.out.println("У игрока " + player.getName() + " закончились попытки");
        }
        return true;
    }

    private static int enterNum(Player player) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(player.getName() + " введите число");
        return scanner.nextInt();
    }

    private static void printPlayerNums(int[] nums, String name) {
        for (int num : nums) {
            System.out.print(num + " ");
        }
        System.out.print(" числа принадлежат игроку " + name + "\n");
    }
}