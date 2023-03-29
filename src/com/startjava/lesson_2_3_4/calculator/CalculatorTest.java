package com.startjava.lesson_2_3_4.calculator;

import java.util.Scanner;

public class CalculatorTest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String answer = "yes";
        String question = "Хотите продолжить вычисления? [yes/no]";
        while (true) {
            if (answer.equals("yes")) {
                System.out.println("Введите математическое выражение: ");
                String mathExpression = scanner.nextLine();
                double result = Calculator.calculate(mathExpression);
                if (result == 0) {
                    System.out.printf("%.0f\n", result);
                } else {
                    System.out.printf("%.3f\n", result);
                }
                System.out.println(question);
                answer = scanner.nextLine();
            }
            if (!answer.equals("no") && !answer.equals("yes")) {
                System.out.println(question);
                answer = scanner.nextLine();
            } else if (answer.equals("no")) {
                break;
            }
        }
    }
}