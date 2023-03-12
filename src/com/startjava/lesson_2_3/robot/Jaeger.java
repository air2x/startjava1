package com.startjava.lesson_2_3.robot;

public class Jaeger {

    private String name;
    private String mark;
    private String origin;
    private double height;
    private double weight;
    private int speed;
    private int strength;
    private int armor;

    public Jaeger() {}

    public Jaeger(String name, String mark, String origin, double height, double weight, int speed, 
            int strength, int armor) {
        this.name = name;
        this.mark = mark;
        this.origin = origin;
        this.height = height;
        this.weight = weight;
        this.speed = speed;
        this.strength = strength;
        this.armor = armor;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setMark(String mark) {
        this.mark = mark;
    }

    public void setOrigin(String origin) {
        this.origin = origin;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public void setStrength(int strength) {
        this.strength = strength;
    }

    public void setArmor(int armor) {
        this.armor = armor;
    }

    public void go() {
        System.out.println("Идет");
    }

    public void shoot() {
        System.out.println("Стреляет");
    }

    public void outCharacteristics() {
        System.out.println("\nИмя: " + name + "\nМарка: " + mark + "\nПроизводство: " + origin + 
                "\nВысота: " + height + "\nМасса: " + weight + "\nСкорость: " + speed + "\nСила: " +
                strength + "\nБроня: " + armor);
    }
}