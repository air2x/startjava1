package com.startjava.lesson_2_3_4.robot;

public class JaegerTest {
    
    public static void main(String[] args) {
        Jaeger jaegerOne = new Jaeger();
        jaegerOne.setName("Striker Eureka");
        jaegerOne.setMark("Mark-5");
        jaegerOne.setOrigin("Australia");
        jaegerOne.setHeight(76.2);
        jaegerOne.setWeight(1.850);
        jaegerOne.setSpeed(10);
        jaegerOne.setStrength(10);
        jaegerOne.setArmor(9);
        jaegerOne.outCharacteristics();
        jaegerOne.go();
        jaegerOne.shoot();

        Jaeger jaegerTwo = new Jaeger("Cherno Alpha", "Mark", "Russia", 85.34, 2.412, 3, 10, 10);
        jaegerTwo.outCharacteristics();
        jaegerTwo.go();
        jaegerTwo.shoot();
    }
}