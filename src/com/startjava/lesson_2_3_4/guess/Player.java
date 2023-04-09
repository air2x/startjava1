package com.startjava.lesson_2_3_4.guess;

import java.util.Arrays;

public class Player {

    private final String name;
    private int[] num;

    public Player(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public int[] getNum() {
        int count = 0;
        for (int j : num) {
            if (j != 0) {
                count++;
            }
        }
        return Arrays.copyOf(num, count);
    }

    public void setNum(int value) {
        if (num == null) {
            num = new int[1];
            num[0] = value;
        } else {
            int[] newNum = new int[num.length + 1];
            System.arraycopy(num, 0, newNum, 0, num.length);
            newNum[newNum.length - 1] = value;
            num = newNum;
        }
    }
}