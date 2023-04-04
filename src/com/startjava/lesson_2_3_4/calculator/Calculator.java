package com.startjava.lesson_2_3_4.calculator;

public class Calculator {

    public static double calculate(String mathExpression) {
        String[] elements = mathExpression.split(" ");
        int num1;
        int num2;
        try {
            num1 = Integer.parseInt(elements[0]);
            num2 = Integer.parseInt(elements[2]);
        } catch (NumberFormatException e) {
            System.out.println("Вы ввели дробное число, используйте целые положительные числа");
            return 0;
        }
        if (num1 <= 0 || num2 <= 0) {
            System.out.println("Вы ввели некорректное число, используйте целые положительные числа");
            return 0;
        }
        return switch (elements[1]) {
            case "+" -> num1 + num2;
            case "-" -> num1 - num2;
            case "*" -> num1 * num2;
            case "/" -> (num1 * 1.0) / num2;
            case "%" -> num1 % num2;
            case "^" -> Math.pow(num1, num2);
            default -> 0;
        };
    }
}