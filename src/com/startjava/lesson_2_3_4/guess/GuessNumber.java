package com.startjava.lesson_2_3_4.guess;

import java.util.Scanner;

public class GuessNumber {

    private final Player[] players;
    public static final int MAX_ROUND = 3;
    public static final int SCORE_NO_WON = 1;

    public GuessNumber(Player... players) {
        this.players = players;
    }

    public void start() {
        for (Player player : players) {
            player.clearScoreWin();
        }
        castLots();
        for (int i = 0; i < MAX_ROUND; i++) {
            for (Player player : players) {
                player.clear();
            }
            System.out.println((i + 1) + "-й раунд игры. У каждого игрока по 10 попыток");
            final int secretNum = (int) ((Math.random() * Player.END_RANGE) + Player.START_RANGE);
            boolean guessed = false;
            do {
                for (Player player : players) {
                    if (isGuessed(secretNum, player)) {
                        guessed = true;
                        break;
                    }
                }
                if (guessed) {
                    break;
                }
            } while (hasAttempt());
            printPlayersNums();
        }
        defineWinner();
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

    private boolean isGuessed(int secretNum, Player player) {
        int num = enterNum(player);
        if (player.getNumAttempt() == Player.MAX_ATTEMPT && num != secretNum) {
            System.out.println("У игрока " + player.getName() + " закончились попытки");
        }
        return defineNum(secretNum, player);
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
            System.out.println("Число не входит в интервал от 1 до 100 включительно," +
                    player.getName() + " введите новое число");
        }
        return num;
    }

    private boolean defineNum(int secretNum, Player player) {
        int num = player.getNum();
        if (secretNum == num) {
            System.out.println("Игрок " + player.getName() + " угадал число " + num + " с " +
                    player.getNumAttempt() + " попытки");
            player.setScore();
            return true;
        }
        System.out.println(num + (secretNum > num ?
                " меньше" : " больше") + ", чем загадал компьютер");
        return false;
    }

    private boolean hasAttempt() {
        return players[players.length - 1].getNumAttempt() < Player.MAX_ATTEMPT;
    }

    private void printPlayersNums() {
        for (Player player : players) {
            for (int num : player.getNums()) {
                System.out.print(num + " ");
            }
            System.out.print(" числа принадлежат игроку " + player.getName() + "\n");
        }
    }

    private void defineWinner() {
        System.out.print("По результатам трех раундов ");
        int maxScore = 0;
        for (Player player : players) {
            if (player.getScore() > maxScore) {
                maxScore = player.getScore();
            }
        }
        if (maxScore == 0) {
            System.out.println(" ни один из игроков не угадал числа");
        } else if (maxScore == SCORE_NO_WON) {
            boolean guesser = true;
            int countGuessedOne = 0;
            for (Player player : players) {
                if (maxScore != player.getScore()) {
                    guesser = false;
                } else {
                    countGuessedOne++;
                }
            }
            if (guesser && countGuessedOne == 0) {
                System.out.println("ничья");
            } else if (!guesser && countGuessedOne == 2) {
                System.out.println("победителей нет");
            } else {
                for (Player player : players) {
                    if (player.getScore() == maxScore) {
                        System.out.println("победил " + player.getName());
                        break;
                    }
                }
            }
        } else {
            for (Player player : players) {
                if (maxScore == player.getScore()) {
                    System.out.println("победил " + player.getName());
                }
            }
        }
    }
}