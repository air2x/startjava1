package com.startjava.lesson_2_3_4.calculator;

import java.util.Scanner;

public class CalculatorTest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String answer = "yes";
        do {
            if (answer.equals("yes")) {
                System.out.println("Введите математическое выражение: ");
                String mathExpression = scanner.nextLine();
                double result = Calculator.calculate(mathExpression);
                System.out.printf(((result == 0) ? "%.0f\n" : "%.3f\n"), result);
            }
            System.out.println("Хотите продолжить вычисления? [yes/no]");
            answer = scanner.nextLine();
        } while (!answer.equals("no"));
    }
}