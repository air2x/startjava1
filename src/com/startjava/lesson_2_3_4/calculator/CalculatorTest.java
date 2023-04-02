package com.startjava.lesson_2_3_4.calculator;

import java.util.Scanner;

public class CalculatorTest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String answer = "yes";
        String question = "Хотите продолжить вычисления? [yes/no]";
        while (true){
            if (!answer.equals("no") && !answer.equals("yes")) {
                System.out.println(question);
                answer = scanner.nextLine();
            } else if (answer.equals("yes")) {
                System.out.println("Введите математическое выражение: ");
                String mathExpression = scanner.nextLine();
                double result = Calculator.calculate(mathExpression);
                System.out.printf(((result == 0) ? "%.0f\n" : "%.3f\n"), result);
                answer = "answer";
            } else {
                break;
            }
        }
    }
}