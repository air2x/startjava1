package com.startjava.lesson_2_3_4.calculator;

public class Calculator {

    public static double calculate(String mathExpression) {
        String[] elements = mathExpression.split(" ");
        int num1 = Integer.parseInt(elements[0]);
        int num2 = Integer.parseInt(elements[2]);
        String mathSign = elements[1];
        switch (mathSign) {
            case "+":
                return num1 + num2;
            case "-":
                return num1 - num2;
            case "*":
                return num1 * num2;
            case "/":
                return (num1 * 1.0) / num2;
            case "%":
                return num1 % num2;
            case "^":
                return Math.pow(num1, num2);
        }
        return 0;
    }
}