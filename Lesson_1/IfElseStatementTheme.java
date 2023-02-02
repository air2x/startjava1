public class IfElseStatementTheme {

    public static void main(String[] args) {
        System.out.println("1.Перевод псевдокода на язык Java \n");
        int age = 21;
        if (age > 20) {
            System.out.println("Вам разрешен вход в ночной клуб");
        } else { 
            System.out.println("Вам запрещен вход в ночной клуб");
        }
        boolean genderMan = true;
        if (!genderMan) {
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
        } else if ( num2 > num1) {
            System.out.println("Число " + num2 + " max, число " + num1 + " min");
        } else if (num1 == num2) {
            System.out.println("Числа равны");
        }

        System.out.println("\n3.Проверка числа \n");
        int number = 8;
        if (number != 0) {
            if (number % 2 == 0) {
                System.out.println("Исходное число " + number + " четное");
            } else {
                System.out.println("Исходное число " + number + " не четное");
            }
            if (number < 0) {
                System.out.println("Исходное число " + number + " отрицательное");
            } else {
                System.out.println("Исходное число " + number + " положительное");
            }
        } else {
            System.out.println("Исходное число " + number + " равно 0");
        }

        System.out.println("\n4.Поиск одинаковых цифр в числах \n");
        int numA = 456;
        int numB = 634;
        int numAHundreds = numA / 100;
        int numATens = numA / 10 % 10;
        int numAOnes = numA % 10;
        int numBHundreds = numB / 100;
        int numBTens = numB / 10 % 10;
        int numBOnes = numB % 10;
        if (numAHundreds == numBHundreds && numATens == numBTens && numAOnes == numBOnes) {
            System.out.println("Исходные числа " + numA + " и " + numB + "\n все цифры, стоящие " + 
                    "в одном разряде, одинаковые ");
        } else if (numAHundreds == numBHundreds && numATens == numBTens && numAOnes != numBOnes) {
            System.out.println("Исходные числа " + numA + " и " + numB + "\n одинаковые цифры: " + 
                    numAHundreds + " и " + numATens + " разряды 1 и 2");
        } else if (numAHundreds == numBHundreds && numATens != numBTens && numAOnes != numBOnes) {
            System.out.println("Исходные числа " + numA + " и " + numB + "\n одинаковые цифры: " + 
                    numAHundreds + " разряд 1");
        } else if (numAHundreds != numBHundreds && numATens != numBTens && numAOnes != numBOnes) {
            System.out.println("Исходные числа " + numA + " и " + numB + 
                    "\nвсе цифры в разрядах разные");
        } else if (numAHundreds != numBHundreds && numATens == numBTens && numAOnes == numBOnes) {
            System.out.println("Исходные числа " + numA + " и " + numB + "\n одинаковые цифры: " + 
                    numATens + " и " + numAOnes + " разряды 2 и 3");
        } else if (numAHundreds != numBHundreds && numATens == numBTens && numAOnes != numBOnes) {
            System.out.println("Исходные числа " + numA + " и " + numB + "\n одинаковые цифры: " + 
                    numATens + " разряд 2");
        } else if (numAHundreds != numBHundreds && numATens != numBTens && numAOnes == numBOnes) {
            System.out.println("Исходные числа " + numA + " и " + numB + "\n одинаковые цифры: " + 
                    numAOnes + " разряд 3");
        } else if (numAHundreds == numBHundreds && numATens != numBTens && numAOnes == numBOnes) {
            System.out.println("Исходные числа " + numA + " и " + numB + "\n одинаковые цифры: " + 
                    numAHundreds + " и " + numAOnes + " разряды 1 и 3");
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
        System.out.println("Сумма вклада = " + depositAmount + " руб.");
        if (depositAmount < 100000) {
            int accrual = (depositAmount / 100) * 5;
            System.out.println("Начисленный процент " + accrual + 
                "\nИтоговая сумма " + (accrual + depositAmount));
        } else if (depositAmount <= 300000 && depositAmount >= 100000) {
            int accrual = (depositAmount / 100) * 7;
            System.out.println("Начисленный процент " + accrual + 
                "\nИтоговая сумма " + (accrual + depositAmount));
        } else if (depositAmount > 300000) {
            int accrual = (depositAmount / 100) * 10;
            System.out.println("Начисленный процент " + accrual + 
                "\nИтоговая сумма " + (accrual + depositAmount));
        }

        System.out.println("\n7.Определение оценки по предметам\n");
        int percentHistory = 59;
        int percentProgramming = 91;
        int score2 = 2;
        int score3 = 3;
        int score4 = 4;
        int score5 = 5;
        if (percentHistory <= 60 && percentProgramming <= 60) {
            System.out.println(score2 + " История\n" + score2 + " Программирование\nСредний балл: " 
                    + "2\nСредний %: " + ((percentHistory + percentProgramming) / 2));
        } else if (percentHistory <= 60 && percentProgramming > 60 && percentProgramming <=73) {
            System.out.println(score2 + " История\n" + score3 + " Программирование\nСредний балл: " 
                    + "2.5\nСредний %: " + ((percentHistory + percentProgramming) / 2));
        } else if (percentHistory <= 60 && percentProgramming > 73 && percentProgramming <=91) {
            System.out.println(score2 + " История\n" + score4 + " Программирование\nСредний балл: " 
                    + "3\nСредний %: " + ((percentHistory + percentProgramming) / 2));
        } else if (percentHistory <= 60 && percentProgramming > 91) {
            System.out.println(score2 + " История\n" + score5 + " Программирование\nСредний балл: " 
                    + "3.5\nСредний %: " + ((percentHistory + percentProgramming) / 2));
        } else if (percentHistory > 60 && percentHistory <= 73 && percentProgramming <= 60) {
            System.out.println(score3 + " История\n" + score2 + " Программирование\nСредний балл: " 
                    + "2.5\nСредний %: " + ((percentHistory + percentProgramming) / 2));
        } else if (percentHistory > 60 && percentHistory <= 73 && percentProgramming > 60 && 
                percentProgramming <=73) {
            System.out.println(score3 + " История\n" + score3 + " Программирование\nСредний балл: " 
                    + "3\nСредний %: " + ((percentHistory + percentProgramming) / 2));
        } else if (percentHistory > 60 && percentHistory <= 73 && percentProgramming > 73 && 
                percentProgramming <=91) {
            System.out.println(score3 + " История\n" + score4 + " Программирование\nСредний балл: " 
                    + "3.5\nСредний %: " + ((percentHistory + percentProgramming) / 2));
        } else if (percentHistory > 60 && percentHistory <= 73 && percentProgramming > 91) {
            System.out.println(score3 + " История\n" + score5 + " Программирование\nСредний балл: " 
                    + "4\nСредний %: " + ((percentHistory + percentProgramming) / 2));
        } else if (percentHistory > 73 && percentHistory <= 91 && percentProgramming <= 60) {
            System.out.println(score4 + " История\n" + score2 + " Программирование\nСредний балл: " 
                    + "3\nСредний %: " + ((percentHistory + percentProgramming) / 2));
        } else if (percentHistory > 73 && percentHistory <= 91 && percentProgramming > 60 && 
                percentProgramming <=73) {
            System.out.println(score4 + " История\n" + score3 + " Программирование\nСредний балл: " 
                    + "3.5\nСредний %: " + ((percentHistory + percentProgramming) / 2));
        } else if (percentHistory > 73 && percentHistory <= 91 && percentProgramming > 73 && 
                percentProgramming <=91) {
            System.out.println(score4 + " История\n" + score4 + " Программирование\nСредний балл: " 
                    + "4\nСредний %: " + ((percentHistory + percentProgramming) / 2));
        } else if (percentHistory > 73 && percentHistory <= 91 && percentProgramming > 91) {
            System.out.println(score4 + " История\n" + score5 + " Программирование\nСредний балл: " 
                    + "4.5\nСредний %: " + ((percentHistory + percentProgramming) / 2));
        } else if (percentHistory > 91 && percentProgramming <= 60) {
            System.out.println(score5 + " История\n" + score2 + " Программирование\nСредний балл: " 
                    + "3.5\nСредний %: " + ((percentHistory + percentProgramming) / 2));
        } else if (percentHistory > 91 && percentProgramming > 60 && 
                percentProgramming <=73) {
            System.out.println(score5 + " История\n" + score3 + " Программирование\nСредний балл: " 
                    + "4\nСредний %: " + ((percentHistory + percentProgramming) / 2));
        } else if (percentHistory > 91 && percentProgramming > 73 && 
                percentProgramming <=91) {
            System.out.println(score5 + " История\n" + score4 + " Программирование\nСредний балл: " 
                    + "4.5\nСредний %: " + ((percentHistory + percentProgramming) / 2));
        } else if (percentHistory > 91 && percentProgramming > 91) {
            System.out.println(score5 + " История\n" + score5 + " Программирование\nСредний балл: " 
                    + "5\nСредний %: " + ((percentHistory + percentProgramming) / 2));
        }


        System.out.println("\n8.Расчет прибыли за год\n");
        int rent = 5000;
        int revenue = 13000;
        int costPrice = 9000;
        int profitMonth = revenue - rent - costPrice;
        if (profitMonth < 0) {
            System.out.println("Прибыль за год: " + profitMonth * 3 + " руб.");
        } else if (profitMonth > 0) {
            System.out.println("Прибыль за год: +" + profitMonth * 12 + " руб.");
        }

        System.out.println("\n9.Подсчет количества банкнот\n");
        int sumNeeded = 567;
        int banknotesDenomination1 = 50; // кол-во банкнот номиналом 1 в наличии
        int banknotesDenomination10 = 5; // кол-во банкнот номиналом 10 в наличии
        int banknotesDenomination100 = 10; // кол-во банкнот номиналом 100 в наличии
        int neededBanknotesDenomination1 = sumNeeded % 10; // кол-во необходимых банкнот номиналом 1
        int neededBanknotesDenomination10 = sumNeeded / 10 % 10; // кол-во необходимых банкнот номиналом 10
        int neededBanknotesDenomination100 = sumNeeded / 100; // кол-во необходимых банкнот номиналом 100
        if (neededBanknotesDenomination100 > banknotesDenomination100) {
            neededBanknotesDenomination10 += (neededBanknotesDenomination100 -
                banknotesDenomination100) * 10;
        }
        if (neededBanknotesDenomination10 > banknotesDenomination10) {
            neededBanknotesDenomination1 += (neededBanknotesDenomination10 -
                banknotesDenomination10) * 10;
        }
        if (neededBanknotesDenomination1 > banknotesDenomination1) {
            System.out.println("Не хватает банкнот для выполнения операции");
        } else if (neededBanknotesDenomination1 <= banknotesDenomination1) {
            System.out.println("Номиналы банкнот\n100 - " + neededBanknotesDenomination100 + 
                    "\n10 - " + neededBanknotesDenomination10 + "\n1 - " + 
                    neededBanknotesDenomination1 + "\nСумма: " + sumNeeded);
        }
    }
}