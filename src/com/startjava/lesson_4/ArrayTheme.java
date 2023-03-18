package com.startjava.lesson_4;
public class ArrayTheme {
    public static void main(String[] args) {
        System.out.println("1. Реверс значений массива");
        int[] intNums = {4, 2, 1, 7, 5, 3};
        int[] intNumsRevers = new int[intNums.length];
        int counter = 0;
        for (int i = intNums.length - 1; i >= 0; i--) {
            intNumsRevers[i] = intNums[counter++];
        }
        for (int intNum : intNums) {
            System.out.print(intNum + " ");
        }
        System.out.println();
        for (int intNumRevers : intNumsRevers) {
            System.out.print(intNumRevers + " ");
        }

        System.out.println("\n\n2. Вывод произведения элементов массива");
        intNums = new int[]{0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
        for (int intNum : intNums) {
            if (intNum == 0 || intNum == 9) {
                continue;
            }
            System.out.print(intNum + (intNum == 8 ? " " : " * "));
        }
        System.out.println("= R\n" + intNums[0] + " " + intNums[9]);

        System.out.println("\n3. Удаление элементов массива");
        double[] dubArr = {0.64, 0.3, 0.54, 0.35, 0.83, 0.41, 0.46, 0.58, 0.57, 0.6, 0.63, 0, 0.69, 0.84, 0.38};
        int midCell = dubArr.length / 2;
        System.out.println("Исходный массив:");
        for (int i = 0; i < dubArr.length; i++) {
            if (i == 8) {
                System.out.println();
            }
            System.out.printf("%7.3f", dubArr[i]);
        }
        System.out.println("\nИзмененный массив:");
        for (int i = 0; i < dubArr.length; i++) {
            if (dubArr[i] > dubArr[midCell]) {
                dubArr[i] = 0;
            }
        }
        for (int i = 0; i < dubArr.length; i++) {
            if (i == 8) {
                System.out.println();
            }
            System.out.printf("%7.3f", dubArr[i]);
        }

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
    }
}
