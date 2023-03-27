package com.startjava.lesson_2_3_4.calculator;

import java.util.Scanner;

public class CalculatorTest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String answer = "yes";
        while (answer.equals("yes")) {
            System.out.println("Введите математическое выражение: ");
            Calculator.mathExpression = scanner.nextLine();
            System.out.println("Результат вычислений ");
            if (Calculator.calculate() == 0) {
                System.out.printf("%.0f", Calculator.calculate());
            } else {
                System.out.printf("%.3f", Calculator.calculate());
            }
            System.out.println("\nХотите продолжить вычисления? [yes/no]");
            answer = scanner.nextLine();
            if (answer.equals("no")) {
                break;
            }
        }
    }
}