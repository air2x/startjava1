package com.startjava.lesson_2_3_4.guess;

import java.util.Arrays;

public class Player {

    public static final int MAX_ATTEMPT = 10;
    public static final int START_RANGE = 1;
    public static final int END_RANGE = 100;
    private final String name;
    private final int[] nums = new int[MAX_ATTEMPT];
    private int numAttempt;
    private int score;

    public Player(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public int[] getNums() {
        return Arrays.copyOf(nums, numAttempt);
    }

    public int getNum() {
        return nums[numAttempt - 1];
    }

    public boolean addNum(int num) {
        if (num < START_RANGE || num > END_RANGE) {
            return false;
        }
        nums[numAttempt++] = num;
        return true;
    }

    public int getNumAttempt() {
        return numAttempt;
    }

    public int getScore() {
        return score;
    }

    public void incrementScore() {
        score++;
    }

    public void clearScore() {
        score = 0;
    }

    public void clear() {
        Arrays.fill(nums, 0, numAttempt, 0);
        numAttempt = 0;
    }
}