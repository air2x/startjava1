public class Calculator {

    public static void main(String[] args) {
        int numFirst = 2;
        int numSecond = 4;
        int result = 0;
        char mathSign = '%';
        if (mathSign == '+') {
            result = numFirst + numSecond;
        } else if (mathSign == '-') {
            result = numFirst - numSecond;
        } else if (mathSign == '*') {
            result = numFirst * numSecond;
        } else if (mathSign == '/') {
            result = numFirst / numSecond;
        } else if (mathSign == '^') {
            result = numFirst;
            for (int i = 1; i < numSecond; i++) {
                result *= numFirst;
            }
        } else if (mathSign == '%') {
            result = numFirst % numSecond;
        }
        System.out.println(numFirst + " " + mathSign + " " + numSecond + " = " + result);
    }
}