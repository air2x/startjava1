package com.startjava.lesson_4;
import java.util.Arrays;
public class ArrayTheme {
    public static void main(String[] args) {
        System.out.println("1. Реверс значений массива");
        int[] intNums = {4, 2, 1, 7, 5, 3, 6};
        int len = intNums.length;
        printIntNums(intNums);
        for (int i = 0; i < len; i++) {
            len--;
            int temp = intNums[len];
            intNums[len] = intNums[i];
            intNums[i] = temp;
        }
        printIntNums(intNums);

        System.out.println("\n\n2. Вывод произведения элементов массива");
        intNums = new int[10];
        len = intNums.length;
        for (int i = 0; i < len; i++) {
            intNums[i] = i;
        }
        int productNum = 1;
        for (int num : intNums) {
            if (num == 0 || num == 9) {
                continue;
            }
            productNum *= num;
            System.out.print(num + (num == intNums[len - 2] ? " " : " * "));
        }
        System.out.println("= " + productNum + "\n" + intNums[0] + " " + intNums[9]);

        System.out.println("\n3. Удаление элементов массива");
        double[] dubNums = new double[15];
        for (int i = 0; i < dubNums.length; i++) {
            dubNums[i] = Math.random();
        }
        int midCell = dubNums.length / 2;
        System.out.println("Исходный массив:");
        printDubArr(dubNums);
        System.out.println("\nИзмененный массив:");
        int count = 0;
        for (int i = 0; i < dubNums.length; i++) {
            if (dubNums[i] > midCell) {
                dubNums[i] = 0;
                count++;
            }
        }
        printDubArr(dubNums);
        System.out.println("\nКоличество обнуленных ячеек: " + count);

        System.out.println("\n\n4. Вывод элементов массива лесенкой в обратном порядке");
        char[] capitalLetters = new char[26];
        capitalLetters[0] = 65;
        for (int i = 0; i < capitalLetters.length;  i++) {
            capitalLetters[i] =  (char) ('A' + i);
        }
        for (int i = capitalLetters.length - 1; i >= 0; i--) {
            for (int j = capitalLetters.length - 1; j >= i; j--) {
                System.out.print(capitalLetters[j]);
            }
            System.out.println();
        }

        System.out.println("\n5. Генерация уникальных чисел");
        intNums = new int[30];
        len = intNums.length;
        for (int i = 0; i < len; i++) {
            int randomNum = 60 + (int)(Math.random() * 40);
            for (int j = 0; j < len; j++) {
                if (i == j) {
                    continue;
                }
                if (randomNum != intNums[j]) {
                    intNums[i] = randomNum;
                }
            }
        }
        count = 0;
        Arrays.sort(intNums);
        for (int num : intNums) {
            if (count % 10 == 0) {
                System.out.println();
            }
            System.out.print(num + " ");
            count++;
        }

        System.out.println("\n\n6. Копирование не пустых строк");
        String[] strArr = {"    ", "AA", "", "BBB", "CC", "D", "    ", "E", "FF", "G", ""};

    }

    private static void printIntNums(int[] intNums) {
        System.out.println();
        for (int intNum : intNums) {
            System.out.print(intNum + " ");
        }
    }

    private static void printDubArr(double[] dubArr) {
        for (int i = 0; i < dubArr.length; i++) {
            if (i == 8) {
                System.out.println();
            }
            System.out.printf("%7.3f", dubArr[i]);
        }
    }
}
