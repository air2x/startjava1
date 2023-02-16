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
        int min = num3;
        int max = num1;
        if (min > num1) {
            min = num1;
        } else if (min > num2) {
            min = num2;
        }
        if (max < num2) {
            max = num2;
        }
        for (int i = max - 1; i > min; i--) {
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
            if (count % 5 == 0) {
                System.out.println();
            }
            System.out.printf("%3d", i);
            count++;
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

        int numLines = 5;
        while (numLines > 0) {
            int numColumns = numLines;
            while (numColumns > 0) {
                System.out.print("#");
                numColumns--;
            }
            System.out.println();
            numLines--;
        }

        int maxCharNum = 3;
        int numColumns = 1 - maxCharNum;
        do {
            int charNum = 1;
            int revers = numColumns;
            if (revers < 0) {
                revers = -revers;
            }
            do {
                System.out.print("$");
                ++charNum;
            } while (charNum <= maxCharNum - revers);
            System.out.println();
            ++numColumns;
        } while (numColumns <= maxCharNum - 1);

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
        int revNum = 0;
        int numCopy = num;
        while (num > 0) {
            revNum = revNum * 10 + (num % 10);
            num /= 10;
        }
        if (numCopy == revNum) {
            System.out.println(numCopy + " является палиндромом");
        } else {
            System.out.println(numCopy + " не является палиндромом");
        }

        System.out.println("\n9. Определение, является ли число счастливым");
        num = 411331;
        int sum123 = 0;
        int sum456 = 0;
        int remains = 0;
        int revSum123 = 0;
        int revSum456 = 0;
        revNum = 0;
        for (int i = 0; i < 6; i++) {
            remains = num % 10;
            revNum = revNum * 10 + remains;
            if (i < 3) {
                sum123 += remains;
                revSum123 = revSum123 * 10 + remains;
            }
            if (i >= 3) {
                sum456 += remains;
                revSum456 = revSum456 * 10 + remains;
            }
            num /= 10;
        }
        System.out.println("Сумма цифр " + revSum123 + " = " + sum123 + "\nСумма цифр " +
            revSum456 + " = " + sum456);
        if (sum123 == sum456) {
            System.out.println("Число счастливое");
        } else {
            System.out.println("Число не счастливое");
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