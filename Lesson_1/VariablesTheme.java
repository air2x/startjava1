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
        boolean diskDrive = true;
        System.out.println("Оперативная память = " + ram + " Гб");
        System.out.println("Жесткий диск = " + ssd + " Гб");
        System.out.println("Тактовая частота = " + clockFrequency + " Гц");
        System.out.println("Вес = " + weight + " г");
        System.out.println("Разрешение камеры " + webcamResolution + " Мп");
        System.out.println("Максимальная емкость аккумулятора = " + maxBatteryLife + " ч");
        System.out.println("Чипсет " + chipset);
        System.out.println("Наличие дисковода = " + diskDrive);

        System.out.println("\n 2. Расчет стоимости товара со скидкой\n");
        int pricePen = 100;
        int priceBook = 200;
        double discount = 0.11;
        int sumGoods = pricePen + priceBook;
        double sumDiscount = sumGoods * discount;
        System.out.println("Сумма скидки = " + sumDiscount + " руб.");
        System.out.println("Стоимость товаров со скидкой = " + (sumGoods - sumDiscount) + " руб.");

        System.out.println("\n 3. Вывод слова Java\n");
        System.out.println("   J    a  v     v  a");
        System.out.println("   J   a a  v   v  a a");
        System.out.println("J  J  aaaaa  v v  aaaaa");
        System.out.println(" JJ  a     a  v  a     a");

        System.out.println("\n 4. Вывод min и max значений целых числовых типов\n");
        byte byteMax = Byte.MAX_VALUE;
        short shortMax = Short.MAX_VALUE;
        int intMax = Integer.MAX_VALUE;
        long longMax = Long.MAX_VALUE;
        System.out.println(byteMax++ + "," + byteMax + "," + byteMax--);
        System.out.println(shortMax++ + "," + shortMax + "," + shortMax--);
        System.out.println(intMax++ + "," + intMax + "," + intMax--);
        System.out.println(longMax++ + "," + longMax + "," + longMax--);

        System.out.println("\n 5. Перестановка значений переменных\n");
        int num1 = 2;
        int num2 = 5;
        System.out.println("Исходные данные: " + num1 + "," + num2);
        int buffer = num1;
        num1 = num2;
        num2 = buffer;
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
        System.out.println("Код " + (int) symbol35 + ": " + symbol35);
        System.out.println("Код " + (int) symbol38 + ": " + symbol38);
        System.out.println("Код " + (int) symbol64 + ": " + symbol64);
        System.out.println("Код " + (int) symbol94 + ": " + symbol94);
        System.out.println("Код " + (int) symbol95 + ": " + symbol95);

        System.out.println("\n 7. Вывод в консоль ASCII-арт Дюка\n");
        char slash = '/';
        char backslash = '\\';
        char underline = '_';
        char leftBracket = '(';
        char rightBracket = ')';
        System.out.println("    " + slash + backslash + "    ");
        System.out.println("   " + slash + "  " + backslash + "   ");
        System.out.println("  " + slash + underline + leftBracket + " " + rightBracket + backslash);
        System.out.println(" " + slash + "      " + backslash + "  \n" + slash + underline + 
                underline + underline + underline + slash + backslash + underline + underline + 
                backslash);

        System.out.println("\n8. Вывод количества сотен, десятков и единиц числа\n");
        int srcNum = 123;
        int numHundreds = srcNum / 100;
        int numTens = srcNum / 10 %10;
        int numOnes = srcNum % 10;
        int sumDigit = numOnes + numTens + numHundreds;
        int multiplicationDigit = numOnes * numTens * numHundreds;
        System.out.println("Число " + srcNum + " содержит:  \n" + numHundreds + " cотен, \n" + 
                numTens + " десяток, \n" + numOnes + " единиц.\n" + "Сумма цифр = " + sumDigit + 
                "\nПроизведение = " + multiplicationDigit);

        System.out.println("\n9. Вывод времени\n");
        int seconds = 86399;
        double minutes = seconds / 60;
        double hour = seconds / 3600;
        System.out.println(hour + ":" + minutes + ":" + seconds);
    }
}