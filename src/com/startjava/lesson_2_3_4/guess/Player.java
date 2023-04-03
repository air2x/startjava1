package com.startjava.lesson_2_3_4.guess;

public class Player {

    private final String name;
    private int[] num;

    public Player(String name) {
        this.name = name;
    }

    public int[] getNum() {
        return num;
    }

    public void setNum(int[] num) {
        this.num = num;
    }

    public String getName() {
        return name;
    }
}