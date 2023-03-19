package com.startjava.lesson_4;
//import java.util.Arrays;
public class ArrayTheme {
    public static void main(String[] args) {
        System.out.println("1. Реверс значений массива");
        int[] intNums = {4, 2, 1, 7, 5, 3, 6};
        int len = intNums.length;
        ArrayTheme.printIntNums(intNums);
        int temp;
        for (int i = 0; i < len / 2; i++) {
            temp = intNums[len - i - 1];
            intNums[len - i - 1] = intNums[i];
            intNums[i] = temp;
        }
        System.out.println();
        ArrayTheme.printIntNums(intNums);

        System.out.println("\n\n2. Вывод произведения элементов массива");
        intNums = new int[10];
        len = intNums.length;
        int productNum = 1;
        for (int i = 0; i < len; i++) {
            intNums[i] = i;
        }
        for (int i = 1; i < len - 1; i++) {
            productNum *= intNums[i];
        }
        for (int intNum : intNums) {
            if (intNum == 0 || intNum == 9) {
                continue;
            }
            System.out.print(intNum + (intNum == intNums[len - 2] ? " " : " * "));
        }
        System.out.println("= " + productNum + "\n" + intNums[0] + " " + intNums[9]);

        System.out.println("\n3. Удаление элементов массива");
        double[] dubArr = new double[15];
        for (int i = 0; i < dubArr.length; i++) {
            dubArr[i] = Math.random();
        }
        int midCell = dubArr.length / 2;
        System.out.println("Исходный массив:");
        ArrayTheme.printDubArr(dubArr);
        System.out.println("\nИзмененный массив:");
        int count = 0;
        for (int i = 0; i < dubArr.length; i++) {
            if (dubArr[i] > dubArr[midCell]) {
                dubArr[i] = 0;
                count++;
            }
        }
        ArrayTheme.printDubArr(dubArr);
        System.out.println("\nКоличество обнуленных ячеек: " + count);

        System.out.println("\n\n4. Вывод элементов массива лесенкой в обратном порядке");
        char[] charArr = new char[27];
        charArr[0] = 65;
        for (int i = 1; i < charArr.length;  i++) {
            charArr[i] = charArr[0]++;
        }
        for (int i = charArr.length - 1; i >= 0; i--) {
            for (int j = charArr.length - 1; j > i; j--) {
                System.out.print(charArr[j]);
            }
            System.out.println();
        }

//        System.out.println("\n5. Генерация уникальных чисел");
//        int[] intArr = new int[30];
//        for (int i = 0; i < intArr.length; i++) {
//            intArr[i] = 60 + (int) (Math.random() * 40);
//        }
//        count = 0;
//        Arrays.sort(intArr);
//        for (int intNumArr : intArr) {
//            if (count % 10 == 0) {
//                System.out.println();
//            }
//            System.out.print(intNumArr + " ");
//            count++;
//        }

//        System.out.println("\n6. Копирование не пустых строк");
//        String[] strArr = {"    ", "AA", "", "BBB", "CC", "D", "    ", "E", "FF", "G", ""};
    }
    private static void printIntNums(int[] intNums) {
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
