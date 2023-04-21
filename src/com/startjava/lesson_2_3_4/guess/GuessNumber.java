package com.startjava.lesson_2_3_4.guess;

import java.util.Scanner;

public class GuessNumber {

    private static Player[] players;

    public GuessNumber(Player... players) {
        GuessNumber.players = players;
    }

    public void startDraw() {
        int len = players.length;
        for (int i = 0; i < len--; i++) {
            int index = (int) (Math.random() * len++);
            Player temp = players[index];
            players[index] = players[i];
            players[i] = temp;
        }
        int count = 0;
        for (Player player : players) {
            count++;
            System.out.println(count + "-е число вводит " + player.getName());
        }
    }

    public void start() {
        for (Player player : players) {
            player.clear();
        }
        System.out.println("У каждого игрока по 10 попыток");
        final int secretNum = (int) ((Math.random() * Player.END_RANGE) + Player.START_RANGE);
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
        } while (players[players.length - 1].getNumAttempt() != Player.MAX_ATTEMPT);
        printPlayersNums();
    }

    private static boolean isGuessed(int secretNum, Player player) {
        int num = enterNum(player);
        if (player.getNumAttempt() == Player.MAX_ATTEMPT) {
            System.out.println("У игрока " + player.getName() + " закончились попытки");
        }
        return checkNum(secretNum, num, player);
    }

    private static int enterNum(Player player) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(player.getName() + " введите число");
        int num;
        while (true) {
            num = scanner.nextInt();
            if (!player.addNum(num)) {
                System.out.println("Число не входит в интервал от 1 до 100 включительно," + player.getName() +
                        " введите новое число");
            } else {
                break;
            }
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

    private static void printPlayersNums() {
        for (Player player : players) {
            for (int num : player.getNums()) {
                System.out.print(num + " ");
            }
            System.out.print(" числа принадлежат игроку " + player.getName() + "\n");
        }
    }
}