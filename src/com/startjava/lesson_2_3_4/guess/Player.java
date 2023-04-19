package com.startjava.lesson_2_3_4.guess;

import java.util.Arrays;

public class Player {

    private final String name;
    public static final int MAX_ATTEMPT = 10;
    public static final int START_RANGE = 1;
    public static final int END_RANGE = 100;
    private final int[] nums = new int[MAX_ATTEMPT];
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

    public boolean addNum(int num) {
        if (num < START_RANGE || num > END_RANGE) {
            return false;
        }
        nums[numAttempt] = num;
        numAttempt++;
        return true;
    }

    public int getNumAttempt() {
        return numAttempt;
    }

    public void clear() {
        Arrays.fill(nums, 0, numAttempt, 0);
        numAttempt = 0;
    }
}