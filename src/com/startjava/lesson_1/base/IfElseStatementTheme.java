package com.startjava.lesson_1.base;

public class IfElseStatementTheme {

    public static void main(String[] args) {
        System.out.println("1.Перевод псевдокода на язык Java \n");
        int age = 21;
        if (age > 20) {
            System.out.println("Вам разрешен вход в ночной клуб");
        } else { 
            System.out.println("Вам запрещен вход в ночной клуб");
        }
        boolean maleGender = true;
        if (!maleGender) {
            System.out.println("Это женский туалет, вам сюда нельзя");
        } else {
            System.out.println("Это мужской туалет");
        }
        double height = 1.70;
        if (height < 1.80) {
            System.out.println("Ваш рост ниже допустимого для этого аттракциона");
        } else {
            System.out.println("Вход на аттракцион разрешен");
        }
        char firstLetterName = "Markiz".charAt(0);
        if (firstLetterName == 'M') {
            System.out.println("Возможно вас зовут Марина");
        } else if (firstLetterName == 'I') {
            System.out.println("Вы точно не Марина");
        } else {
            System.out.println("Возможно ваше имя Стас");
        }

        System.out.println("\n2.Поиск max и min числа \n");
        int num1 = 1025;
        int num2 = 453;
        if (num1 > num2) {
            System.out.println("Число " + num1 + " max, число " + num2 + " min");
        } else if (num2 > num1) {
            System.out.println("Число " + num2 + " max, число " + num1 + " min");
        } else {
            System.out.println("Числа равны");
        }

        System.out.println("\n3.Проверка числа \n");
        int num = 8;
        if (num != 0) {
            if (num % 2 == 0) {
                System.out.println(num + " четное");
            } else {
                System.out.println(num + " не четное");
            }
            if (num < 0) {
                System.out.println(num + " отрицательное");
            } else {
                System.out.println(num + " положительное");
            }
        } else {
            System.out.println("Исходное число равно " + num);
        }

        System.out.println("\n4.Поиск одинаковых цифр в числах \n");
        num1 = 123;
        num2 = 124;
        int num1Hundreds = num1 / 100;
        int num1Tens = num1 / 10 % 10;
        int num1Ones = num1 % 10;
        int num2Hundreds = num2 / 100;
        int num2Tens = num2 / 10 % 10;
        int num2Ones = num2 % 10;
        System.out.println("Исходные числа " + num1 + " и " + num2);
        if (num1Hundreds != num2Hundreds && num1Tens != num2Tens && num1Ones != num2Ones) {
            System.out.println("Все цифры в разрядах разные");
        } else {
            if (num1Hundreds == num2Hundreds) {
                System.out.println("Одинаковые цифры: " + num1Hundreds + " разряд 1");
            }
            if (num1Tens == num2Tens) {
                System.out.println("Одинаковые цифры: " + num1Tens + " разряд 2");
            }
            if (num1Ones == num2Ones) {
                System.out.println("Одинаковые цифры: " + num1Ones + " разряд 3");
            }
        }

        System.out.println("\n5.Определение символа по его коду \n");
        char symbol = '\u0057';
        if (symbol >= 'A' && symbol <= 'Z') {
            System.out.println("Символ " + symbol + " большая буква");
        } else if (symbol >= 'a' && symbol <= 'z') {
            System.out.println("Символ " + symbol + " маленькая буква");
        } else if (symbol >= '0' && symbol <= '1') {
            System.out.println("Символ " + symbol + " число");
        } else {
            System.out.println("Символ не буква и не число");
        }

        System.out.println("\n6.Подсчет суммы вклада и начисленных банком %\n");
        int depositAmount = 300000;
        int percent = 7;
        if (depositAmount < 100000) {
            percent = 5;
        } else if (depositAmount > 300000) {
            percent = 10;
        }
        System.out.println("Сумма вклада = " + depositAmount + " руб.");
        System.out.println("Начисленный процент " + ((depositAmount / 100) * percent) + 
                "\nИтоговая сумма " + ((depositAmount / 100) * percent + depositAmount));

        System.out.println("\n7.Определение оценки по предметам\n");
        int percentHistory = 59;
        int percentProgramming = 91;
        int scoreHistory = 2;
        int scoreProgramming = 2;
        if (percentHistory > 60 && percentHistory <= 73) {
            scoreHistory = 3;
        } else if (percentHistory > 73 && percentHistory <= 91) {
            scoreHistory = 4;
        } else if (percentHistory > 91) {
            scoreHistory = 5;
        }
        if (percentProgramming > 60 && percentProgramming <= 73) {
            scoreProgramming = 3;
        } else if (percentProgramming > 73 && percentProgramming <= 91) {
            scoreProgramming = 4;
        } else if (percentProgramming > 91) {
            scoreProgramming = 5;
        }
        System.out.println(scoreHistory + " История\n" + scoreProgramming + " Программирование\n" + 
                ((scoreHistory + scoreProgramming) / 2) + " Средний балл оценок по предметам\n" + 
                ((percentHistory + percentProgramming) / 2) + " Средний % оценок по предметам");

        System.out.println("\n8.Расчет прибыли за год\n");
        int rent = 5000;
        int revenue = 13000;
        int costPrice = 9000;
        int profitMonth = (revenue - rent - costPrice) * 12;
        if (profitMonth > 0) {
            System.out.println("Прибыль за год: +" + profitMonth + " руб.");
        } else {
            System.out.println("Прибыль за год: " + profitMonth + " руб.");
        }

        System.out.println("\n9.Подсчет количества банкнот\n");
        int sumNeeded = 567;
        int banknotesNominal1 = 50;
        int banknotesNominal10 = 5;
        int banknotesNominal100 = 10; 
        int neededBanknotesNominal1 = sumNeeded % 10;
        int neededBanknotesNominal10 = sumNeeded / 10 % 10;
        int neededBanknotesNominal100 = sumNeeded / 100;
        if (neededBanknotesNominal1 > banknotesNominal1) {
            System.out.println("Не хватает банкнот для выполнения операции");
        } else {
            if (neededBanknotesNominal100 > banknotesNominal100) {
                neededBanknotesNominal10 += (neededBanknotesNominal100 - banknotesNominal100) * 10;
            }
            if (neededBanknotesNominal10 > banknotesNominal10) {
                neededBanknotesNominal1 += (neededBanknotesNominal10 - banknotesNominal10) * 10;
            }
            if (neededBanknotesNominal1 <= banknotesNominal1) {
                System.out.println("Номиналы банкнот\n100 - " + neededBanknotesNominal100 + 
                        "\n10 - " + neededBanknotesNominal10 + "\n1 - " + neededBanknotesNominal1 +
                        "\nСумма: " + sumNeeded);
            }
        }
    }
}