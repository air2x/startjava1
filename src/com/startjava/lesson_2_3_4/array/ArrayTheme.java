package com.startjava.lesson_2_3_4.array;

import java.util.Arrays;

public class ArrayTheme {
    public static void main(String[] args) {
        System.out.println("1. Реверс значений массива");
        int[] intNums = {4, 2, 1, 7, 5, 3, 6};
        int len = intNums.length;
        printIntNums(intNums);
        for (int i = 0; i < len--; i++) {
            int temp = intNums[i];
            intNums[i] = intNums[len];
            intNums[len] = temp;
        }
        printIntNums(intNums);

        System.out.println("\n\n2. Вывод произведения элементов массива");
        intNums = new int[10];
        len = intNums.length;
        for (int i = 0; i < len; i++) {
            intNums[i] = i;
        }
        int productNums = 1;
        for (int i = 1; i < len - 1; i++) {
            productNums *= intNums[i];
            System.out.print(intNums[i] + (i == len - 2 ? " " : " * "));
        }
        System.out.println("= " + productNums + "\n" + intNums[0] + " " + intNums[9]);

        System.out.println("\n3. Удаление элементов массива");
        double[] doubleNums = new double[15];
        len = doubleNums.length;
        for (int i = 0; i < len; i++) {
            doubleNums[i] = Math.random();
        }
        double middleCellNum = doubleNums[len / 2];
        System.out.println("Исходный массив:");
        printDoubleNums(doubleNums);
        System.out.println("\nИзмененный массив:");
        int count = 0;
        for (int i = 0; i < len; i++) {
            if (doubleNums[i] > middleCellNum) {
                doubleNums[i] = 0;
                count++;
            }
        }
        printDoubleNums(doubleNums);
        System.out.println("\nКоличество обнуленных ячеек: " + count);

        System.out.println("\n4. Вывод элементов массива лесенкой в обратном порядке");
        char[] alphabet = new char[26];
        len = alphabet.length;
        for (int i = 0; i < len; i++) {
            alphabet[i] =  (char) ('A' + i);
        }
        for (int i = len - 1; i >= 0; i--) {
            for (int j = len - 1; j >= i; j--) {
                System.out.print(alphabet[j]);
            }
            System.out.println();
        }

        System.out.println("\n5. Генерация уникальных чисел");
        intNums = new int[30];
        len = intNums.length;
        for (int i = 0; i < len; i++) {
            int randomNum = 60 + (int)(Math.random() * 40);
            for (int j = i; j >= 0; j--) {
                if (intNums[j] == randomNum) {
                    i = 0;
                } else {
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
        String[] srcStrings = {"    ", "AA", "", "BBB", "CC", "D", "    ", "E", "FF", "G", ""};
        count = 0;
        for (String s : srcStrings) {
            if (!s.isBlank()) {
                count++;
            }
        }
        String[] destStrings = new String[count];
        count = 0;
        int startNum = 0;
        for (int i = 0; i < srcStrings.length; i++) {
            if (!srcStrings[i].isBlank()) {
                count++;
                if (count == 1) {
                    startNum = i;
                }
            } else {
                for (int j = 0; j < destStrings.length; j++) {
                    if (destStrings[j] == null) {
                        System.arraycopy(srcStrings, startNum, destStrings, j, count);
                        count = 0;
                        break;
                    }
                }
            }
        }
        printStrArr(srcStrings);
        printStrArr(destStrings);
    }

    private static void printIntNums(int[] intNums) {
        System.out.println();
        for (int intNum : intNums) {
            System.out.print(intNum + " ");
        }
    }

    private static void printDoubleNums(double[] doubleNums) {
        for (int i = 0; i < doubleNums.length; i++) {
            if (i == 8) {
                System.out.println();
            }
            System.out.printf("%7.3f", doubleNums[i]);
        }
    }

    private static void printStrArr(String[] strArr) {
        System.out.println();
        for (String str : strArr) {
            System.out.print(str + ", ");
        }
    }
}
