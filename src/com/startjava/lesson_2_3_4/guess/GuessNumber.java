package com.startjava.lesson_2_3_4.guess;

import java.util.Scanner;

public class GuessNumber {

    private static Player[] players;
    private static final String[] winners = new String[3];

    public GuessNumber(Player... players) {
        GuessNumber.players = players;
    }

    public void start() {
        castLots();
        for (int i = 0; i < 3; i++){
            for (Player player : players) {
                player.clear();
            }
            System.out.println((i + 1) + "-й раунд игры. У каждого игрока по 10 попыток");
            final int secretNum = (int) ((Math.random() * Player.END_RANGE) + Player.START_RANGE);
            boolean unique = true;
            do {
                for (Player player : players) {
                    if (!isGuessed(secretNum, player)) {
                        winners[i] = player.getName();
                        unique = false;
                        break;
                    }
                }
                if (!unique) {
                    break;
                }
            } while (checkLastAttempt());
            printPlayersNums();
        }
        for (String winner : winners) {
            System.out.println(winner);
        }
        checkWinner();
    }

    private void castLots() {
        int len = players.length;
        for (int i = 0; i < len--; i++) {
            int index = (int) (Math.random() * len++);
            Player temp = players[index];
            players[index] = players[i];
            players[i] = temp;
        }
        int playerSerialNum = 0;
        for (Player player : players) {
            playerSerialNum++;
            System.out.println(playerSerialNum + "-м угадывает число игрок " + player.getName());
        }
    }

    private static boolean isGuessed(int secretNum, Player player) {
        int num = enterNum(player);
        if (player.getNumAttempt() == Player.MAX_ATTEMPT && num != secretNum) {
            System.out.println("У игрока " + player.getName() + " закончились попытки");
        }
        return checkNum(secretNum, player);
    }

    private static int enterNum(Player player) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(player.getName() + " введите число");
        int num;
        while (true) {
            num = scanner.nextInt();
            if (player.addNum(num)) {
                break;
            }
            System.out.println("Число не входит в интервал от 1 до 100 включительно," + player.getName() +
                    " введите новое число");
        }
        return num;
    }

    private static boolean checkNum(int secretNum, Player player) {
        int num = player.getNum(player.getNumAttempt() - 1);
        if (secretNum == num) {
            System.out.println("Игрок " + player.getName() + " угадал число " + num + " с " +
                    player.getNumAttempt() + " попытки");
            return false;
        }
        System.out.println(num + (secretNum > num ?
                " меньше" : " больше") + ", чем загадал компьютер");
        return true;
    }

    private static boolean checkLastAttempt() {
        return players[players.length - 1].getNumAttempt() != Player.MAX_ATTEMPT;
    }

    private static void printPlayersNums() {
        for (Player player : players) {
            for (int num : player.getNums()) {
                System.out.print(num + " ");
            }
            System.out.print(" числа принадлежат игроку " + player.getName() + "\n");
        }
    }

    private static void checkWinner() {
        System.out.print("По результатам трех раундов ");
        if (!winners[0].equals(winners[1]) && !winners[0].equals(winners[2]) && !winners[1].equals(winners[2])) {
            System.out.print("ничья");
        } else if (winners[0].equals(winners[1]) || winners[0].equals(winners[2])) {
            System.out.println("победил " + winners[0]);
        } else {
            System.out.println("победил " + winners[2]);
        }
    }
}