package com.startjava.lesson_2_3_4.guess;

import java.util.Arrays;
import java.util.Scanner;

public class Player {

    private final String name;
    private static final int[] nums = new int[10];
    private int numAttempt;

    public Player(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public int[] getNums() {
        return Arrays.copyOf(nums, numAttempt);
    }

    public int getNumAttempt() {
        return numAttempt;
    }

    public int addNum(int num) {
        Scanner scanner = new Scanner(System.in);
        while (num < 1 || num > 100) {
            System.out.println("Число не входит в интервал от 1 до 100 включительно, введите новое число");
            num = scanner.nextInt();
        }
        nums[numAttempt] = num;
        numAttempt++;
        return num;
    }

    public void clear() {
        Arrays.fill(nums, 0, numAttempt, 0);
        numAttempt = 0;
    }
}