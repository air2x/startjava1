public class CyclesTheme {

    public static void main(String[] args) {
        System.out.println("\n 1. Подсчет суммы четных и нечетных чисел");
        int startRange = -10;
        int endRange = 21;
        int sumEvenNum = 0;
        int sumOddNum = 0;
        do {
            if (startRange % 2 == 0) {
                sumEvenNum += startRange;
            } else {
                sumOddNum += startRange;
            }
            startRange++;
        } 
        while (startRange <= endRange);
        System.out.println("В промежутке [-10,21] сумма четных чисел = " + sumEvenNum +
                " а нечетных = " + sumOddNum);

        System.out.println("\n 2. Вывод чисел в интервале (min и max) в порядке убывания");
        int num1 = 10;
        int num2 = 5;
        int num3 = -1;
        startRange = num3;
        endRange = num1;
        if (startRange > num1) {
            startRange = num1;
        } else if (startRange > num2) {
            startRange = num2;
        }
        if (endRange < num2) {
            endRange = num2;
        } else if (endRange < num3) {
            startRange = num3;
        }
        for (int i = endRange - 1; i > startRange; i--) {
            System.out.print(i + " ");
        }

        System.out.println("\n\n3. Вывод реверсивного числа и суммы его цифр");
        int num = 1234;
        int sumDigits = 0;
        System.out.print("Исходное число в обратном порядке ");
        while (num > 0) {
            int digit = num % 10;
            sumDigits += digit;
            System.out.print(digit);
            num /= 10;
        }
        System.out.println("\nСумма цифр " + sumDigits);

        System.out.println("\n4. Вывод чисел на консоль в несколько строк");
        num1 = 1;
        num2 = 24;
        int count = 0;
        for (int i = num1; i < num2; i += 2) {
            count++;
            System.out.printf("%3d", i);
            if (count % 5 == 0) {
                System.out.println();
            }
        }
        while (count % 5 != 0) {
            System.out.printf("%3d", 0);
            count++;
        }

        System.out.println("\n\n5. Проверка количества двоек на четность/нечетность");
        num = 3242592;
        int numTwos = 0;
        System.out.print("Число " + num);
        while (num > 0) {
            if (num % 10 == 2) {
                numTwos++;
            }
            num /= 10;
        }
        if (numTwos % 2 == 0) {
            System.out.print(" содержит четное количество двоек");
        } else {
            System.out.print(" содержит нечетное количество двоек");
        }

        System.out.println("\n\n6. Отображение фигур в консоли");
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 10; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        int numString = 5;
        while (numString > 0) {
            int numColumn = numString;
            while (numColumn > 0) {
                System.out.print("#");
                numColumn--;
            }
            System.out.println();
            numString--;
        }

        numString = 3;
        int numColumn = 1 - numString;
        do {
            int symbolWrite = 1;
            int revers = numColumn;
            if (revers < 0) {
                revers = -revers;
            }
            do {
                System.out.print("$");
                ++symbolWrite;
            } while (symbolWrite <= numString - revers);
            System.out.println();
            ++numColumn;
        } while (numColumn <= numString - 1);

        System.out.println("\n7. Отображение ASCII-символов");
        System.out.printf("%6s%6s%n", "Dec", "Char");
        for (int i = 0; i < 123; i++) {
            if (i < 48 && i % 2 != 0) {
                System.out.printf("%6d%6s%n", i, ((char) i));
            } else if (i > 96 && i % 2 == 0) {
                System.out.printf("%6d%6s%n", i, ((char) i));
            }
        }

        System.out.println("\n8. Проверка, является ли число палиндромом");
        num = 1234321;
        int numRev = 0;
        int numCopy = num;
        while (num > 0) {
            numRev = numRev * 10 + (num % 10);
            num /= 10;
        }
        if (numCopy == numRev) {
            System.out.println(numCopy + " является палиндромом");
        } else {
            System.out.println(numCopy + " не является палиндромом");
        }

        System.out.println("\n9. Определение, является ли число счастливым");
        num = 441333;
        numCopy = num;
        numRev = 0;
        int numDigits = 0;
        int sumPartFirst = 0;
        int sumPartSecond = 0;
        while (num > 0) {
            numRev = numRev * 10 + num %  10;
            num /= 10;
            numDigits++;
        }
        System.out.print("Сумма цифр ");
        for (int i = 0; i < numDigits / 2; i++) {
            int numDigit = numCopy % 10;
            sumPartFirst += numDigit;
            System.out.print(numDigit);
            numCopy /= 10;
        }
        System.out.print(" = " + sumPartFirst + "\nСумма цифр ");
        for (int i = 0; i < numDigits / 2; i++) {
            int numDigit = numRev % 10;
            sumPartSecond += numDigit;
            System.out.print(numDigit);
            numRev /= 10;
        }
        System.out.print(" = " + sumPartSecond);
        if (sumPartFirst == sumPartSecond) {
            System.out.println("\nЧисло является счастливым");
        } else {
            System.out.println("\nЧисло не является счастливым");
        }

        System.out.println("\n10. Вывод таблицы умножения Пифагора");
        for (int i = 1; i < 9; i++) {
            for (int j = 1; j < 9; j++) {
                if (j * i == 1) {
                    System.out.print("    ");
                } else {
                    System.out.printf("%4d", i * j);
                }
            }
            System.out.println();
        }
    }
}