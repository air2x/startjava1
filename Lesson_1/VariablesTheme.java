public class VariablesTheme {

    public static void main(String[] args) {
        System.out.println("1. Вывод значений переменных на консоль\n");
        byte ram = 8;
        short ssd = 512;
        int clockFrequency = 4100;
        long weight = 3200;
        double webcamResolution = 4.20;
        float maxBatteryLife = 3.50f;
        char chipset = 'I';
        boolean a = true;
        System.out.println("Оперативная память = " + ram + " Гб");
        System.out.println("Жесткий диск = " + ssd + " Гб");
        System.out.println("Тактовая частота = " + clockFrequency + " Гц");
        System.out.println("Вес = " + weight + " г");
        System.out.println("Разрешение камеры " + webcamResolution + " Мп");
        System.out.println("Максимальная емкость аккумулятора = " + maxBatteryLife + " ч");
        System.out.println("Чипсет" + chipset);
        System.out.println("Наличие дисковода = " + a);

        System.out.println("\n 2. Расчет стоимости товара со скидкой\n");
        int pricePen = 100;
        int priceBook = 200;
        double sale = 0.11;
        int sum = pricePen + priceBook;
        double sumSale = sum * 0.11;
        System.out.println("Сумма скидки = " + sumSale + " руб.");
        System.out.println("Стоимость товаров со скидкой = " + (sum - sumSale) + " руб.");

        System.out.println("\n 3. Вывод слова Java\n");
        System.out.println("   J    a  v     v  a");
        System.out.println("   J   a a  v   v  a a");
        System.out.println("J  J  aaaaa  v v  aaaaa");
        System.out.println(" JJ  a     a  v  a     a");

        System.out.println("\n 4. Вывод min и max значений целых числовых типов\n");
        byte maxA = Byte.MAX_VALUE;
        short maxB = Short.MAX_VALUE;
        int maxC = Integer.MAX_VALUE;
        long maxD = Long.MAX_VALUE;
        byte maxAInc = maxA++;
        byte maxADec = maxA--;
        short maxBInc = maxB++;
        short maxBDec = maxB--;
        int maxCInc = maxC++;
        int maxCDec = maxC--;
        long maxDInc = maxD++;
        long maxDDec = maxD--;
        System.out.println(maxA + "," + maxAInc + "," + maxADec);
        System.out.println(maxB + "," + maxBInc + "," + maxBDec);
        System.out.println(maxC + "," + maxCInc + "," + maxCDec);
        System.out.println(maxD + "," + maxDInc + "," + maxDDec);

        System.out.println("\n 5. Перестановка значений переменных\n");
        int num1 = 2;
        int num2 = 5;
        System.out.println("Исходные данные: " + num1 + "," + num2);
        int numx =num1;
        num1 = num2;
        num2 = numx;
        System.out.println("Перестановка с помощью третьей переменной: новые " + num1 + "," + num2);
        System.out.println("Исходные данные: " + num1 + "," + num2);
        num1 += num2;
        num2 = num1 - num2;
        num1 -= num2;
        System.out.println("Перестановка с помощью ариф-х операций новые: " + num1 + "," + num2);
        System.out.println("Исходные данные: " + num1 + "," + num2);
        num1 ^= num2;
        num2 ^= num1;
        num1 ^= num2;
        System.out.println("Перестановка с помощью побитовой операции: " + num1 + "," + num2);

        System.out.println("\n 6. Вывод символов и их кодов\n");
        char symbol35 = '#';
        char symbol38 = '&';
        char symbol64 = '@';
        char symbol94 = '^';
        char symbol95 = '_';
        System.out.println("Код 35: " + symbol35);
        System.out.println("Код 38: " + symbol38);
        System.out.println("Код 64: " + symbol64);
        System.out.println("Код 94: " + symbol94);
        System.out.println("Код 95: " + symbol95);

        System.out.println("\n 7. Вывод в консоль ASCII-арт Дюка\n");
        char numOne = 47;
        char numTwo = 92;
        char numThree = 95;
        char numFour = 40;
        char numFive = 41;
        System.out.println("    " + numOne + "" + numTwo + "    ");
        System.out.println("   " + numOne + "  " + numTwo + "   ");
        System.out.println("  " + numOne + "" + numThree + ""+ numFour + " " + numFive + "" + numTwo);
        System.out.println(" " + numOne + "      " + numTwo + "  ");
        System.out.println(numOne + "" + numThree + "" + numThree + "" + numThree + "" + numThree + 
            "" + numOne + "" + numTwo + "" + numThree +"" + numThree + "" + numTwo);

        System.out.println("\n8. Вывод количества сотен, десятков и единиц числа\n");
        int num123 = 123;
        int numOfHundreds = num123 / 100;
        int numOfTens = num123 / 10;
        int numOfUnits = num123 % 10;
        int sumDigit = numOfUnits + (numOfTens % 10);
        sumDigit += (numOfHundreds % 10);
        int multiplicationDigit = numOfUnits * (numOfTens % 10);
        multiplicationDigit *= (numOfHundreds % 10);
        System.out.println("Число " + num123 + " содержит:  \n" + numOfHundreds + " cотен, \n" + 
            numOfTens + " десяток, \n" + numOfUnits + " единиц.\n" + "Сумма цифр = " + sumDigit + 
            "\nПроизведение = " + multiplicationDigit);

        System.out.println("\n9. Вывод времени\n");
        int timeSeconds = 86399;
        double timeMinutes = timeSeconds / 60;
        double timeHour = timeMinutes / 60;
        System.out.println(timeHour + ":" + timeMinutes + ":" + timeSeconds);
    }
}