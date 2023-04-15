package com.startjava.lesson_2_3_4.guess;

import java.util.Arrays;

public class Player {

    private final String name;
    private final int[] nums = new int[10];
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

    public boolean addNum(int num) {
        if (num < 1 || num > 100) {
            return false;
        } else {
            nums[numAttempt] = num;
            numAttempt++;
            return true;
        }
    }

    public void clear() {
        Arrays.fill(nums, 0, numAttempt, 0);
        numAttempt = 0;
    }
}