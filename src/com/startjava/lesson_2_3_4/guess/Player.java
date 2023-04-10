package com.startjava.lesson_2_3_4.guess;

import java.util.Arrays;

public class Player {

    private final String name;
    private final int[] nums = new int[10];
    private int numAttempt = 0;

    public Player(String name) {
        this.name = name;
    }

    public int getNumAttempt() {
        return numAttempt;
    }

    public void setNumAttempt(int numAttempt) {
        this.numAttempt = numAttempt;
    }

    public String getName() {
        return name;
    }

    public int[] getNums() {
        numAttempt = 0;
        for (int num : nums) {
            if (num != 0) {
                numAttempt++;
            }
        }
        return Arrays.copyOf(nums, numAttempt);
    }

    public void addNum(int num, int count) {
        nums[count] = num;
    }

    public void newGame() {
        Arrays.fill(nums, 0);
        numAttempt = 0;
    }
}