package com.startjava.lesson_2_3_4.calculator;

public class Calculator {

    private String mathExpression;

    public void setMathExpression(String mathExpression) {
        this.mathExpression = mathExpression;
    }

    double result;

    public double calculate() {
        String[] values = mathExpression.split(" ");
        int num1 = Integer.parseInt(values[0]);
        int num2 = Integer.parseInt(values[2]);
        String mathSign = values[1];
        switch (mathSign) {
            case "+":
                result = num1 + num2;
                break;
            case "-":
                result = num1 - num2;
                break;
            case "*":
                result = num1 * num2;
                break;
            case "/":
                result = (num1 * 1.0) / num2;
                break;
            case "%":
                result = num1 % num2;
                break;
            case "^":
                result = Math.pow(num1, num2);
        }
        return result;
    }
}