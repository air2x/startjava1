package com.startjava.lesson_2_3_4.guess;

import java.util.Arrays;

public class Player {

    final String NAME;
    final int[] NUMS = new int[10];
    private int numAttempt;

    public Player(String name) {
        NAME = name;
    }

    public String getName() {
        return NAME;
    }

    public int[] getNums() {
        return Arrays.copyOf(NUMS, numAttempt);
    }

    public boolean addNum(int num) {
        if (num < 1 || num > 100) {
            return false;
        }
        NUMS[numAttempt] = num;
        numAttempt++;
        return true;
    }

    public int getNumAttempt() {
        return numAttempt;
    }

    public void clear() {
        Arrays.fill(NUMS, 0, numAttempt, 0);
        numAttempt = 0;
    }
}