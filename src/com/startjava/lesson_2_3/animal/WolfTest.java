package com.startjava.lesson_2_3.animal;

public class WolfTest {

    public static void main(String[] args) {
        Wolf wolfOne = new Wolf();
        wolfOne.setName("Альфа");
        wolfOne.setGender("Кабель");
        wolfOne.setColor("Черный");
        wolfOne.setWeight(38);
        wolfOne.setAge(8);
        System.out.println("Кличка: " + wolfOne.getName() + "\nПол: " + wolfOne.getGender() + 
                "\nОкрас: " + wolfOne.getColor() + "\nВес: " + wolfOne.getWeight() + "\nВозраст: " +
                wolfOne.getAge());
        wolfOne.sit();
        wolfOne.walk();
        wolfOne.run();
        wolfOne.howl();
        wolfOne.hunt();
    }
}