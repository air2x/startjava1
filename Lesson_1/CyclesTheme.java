public class CyclesTheme {

    public static void main(String[] args) {
        System.out.println("\n 1. Подсчет суммы четных и нечетных чисел");
        int numMin = -10;
        int numMax = 21;
        int sumEvenNum = 0;
        int sumOddNum = 0;
        do {
            if (numMin % 2 == 0) {
                sumEvenNum += numMin;
            } else {
                sumOddNum += numMin;
            }
            numMin++;
        } 
        while (numMin <= numMax);
        System.out.println("В промежутке [-10,21] сумма четных чисел = " + sumEvenNum +
                " а нечетных = " + sumOddNum);

        System.out.println("\n 2. Вывод чисел в интервале (min и max) в порядке убывания");
        int num1 = 10;
        int num2 = 5;
        int num3 = -1;
        numMin = num3;
        numMax = num1;
        if (numMin > num1) {
            numMin = num1;
        } else if (numMin > num2) {
            numMin = num2;
        }
        if (numMax < num2) {
            numMax = num2;
        } else if (numMax < num3) {
            numMin = num3;
        }
        for (int i = numMax - 1; i > numMin; i--) {
            System.out.print(i + " ");
        }

        System.out.println("\n\n3. Вывод реверсивного числа и суммы его цифр");
        int num = 1234;
        int sumDigits = 0;
        System.out.print("Исходное число в обратном порядке ");
        while (num > 0) {
            int numOnce = num % 10;
            sumDigits += numOnce;
            System.out.print(numOnce);
            num /= 10;
        }
        System.out.println("\nСумма цифр " + sumDigits);

        System.out.println("\n4. Вывод чисел на консоль в несколько строк");
        num1 = 1;
        num2 = 24;
        int count = 0;
        for (int i = num1; i < num2; i += 2) {
            count++;
            if (count % 5 == 0) {
                System.out.printf("%3d%n", i);
            } else {
                System.out.printf("%3d", i);
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
            System.out.println("");
        }

        int i = 5;
        while (i > 0) {
            int j = i;
            while (j > 0) {
                System.out.print("#");
                j--;
            }
            System.out.println("");
            i--;
        }

        i = 0;
        do {
            int j = 0;
            do { 
                System.out.print("$");
                j++;
            } while (j - 1 < i);
            System.out.println("");
            i++;
        } while (i < 5);

        System.out.println("\n7. Отображение ASCII-символов");
        for (i = 0; i < 123; i++) {
            if (i == 0) {
                System.out.printf("%6s%6s%n", "Dec", "Char");
            }
            if (i < 48 && i % 2 != 0) {
                System.out.printf("%6d%6s%n", i, ((char)i));
            } else if (i > 96 && i % 2 == 0) {
                System.out.printf("%6d%6s%n", i, ((char)i));
            }
        }

        System.out.println("\n8. Проверка, является ли число палиндромом");
        num = 1234321;
        if (num % 10 == num / 1000000 && (num / 10) % 10 == (num / 100000) % 10 &&
            (num / 100) % 10 == (num / 10000) % 10) {
            System.out.println("Число " + num + " является палиндромом");
        }

        System.out.println("\n9. Определение, является ли число счастливым");
        num = 123321;
        num1 = num / 100000 % 10;
        num2 = num / 10000 % 10;
        num3 = num / 1000 % 10;
        int num4 = num / 100 % 10;
        int num5 = num / 10 % 10;
        int num6 = num % 10;
        int sum123 = num1 + num2 + num3;
        int sum456 = num4 + num5 + num6;
        System.out.println("Сумма цифр " + num1 + num2 + num3 + " = " + sum123 +
                "\nСумма цифр " + num4 + num5 + num6 + " = " + sum456);
        if (sum123 == sum456) {
            System.out.println("Число является счастливым");
        } else {
            System.out.println("Число не является счастливым");
        }

        System.out.println("\n10. Вывод таблицы умножения Пифагора");
        for (i = 1; i < 9; i++) {
            for (int j = 1; j < 9; j++) {
                if (j * i == 1) {
                    System.out.print("    ");
                } else {
                    System.out.printf("%4d", i * j);
                }
            }
            System.out.println("");
        }
    }
}