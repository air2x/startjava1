public class Calculator {

    public static void main(String[] args) {
        int numFirst = 15;
        int numSecond = 4;
        int result = 0;
        char signPlus = '+';
        char signMinus = '-';
        char signMultiplication = '*';
        char signDivision = '/';
        char signDegree = '^';
        char signRemainder = '%';
        char signNeeded = '^';
        if (signNeeded == signPlus) {
            result = numFirst + numSecond;
        } else if (signNeeded == signMinus) {
            result = numFirst - numSecond;
        } else if (signNeeded == signMultiplication) {
            result = numFirst * numSecond;
        } else if (signNeeded == signDivision) {
            result = numFirst / numSecond;
        } else if (signNeeded == signDegree) {
            result = numFirst;
            for (int i = 1; i < numSecond; i++) {
                result *= numFirst;
            }
        } else if (signNeeded == signRemainder) {
            result = numFirst % numSecond;
        }
        System.out.println(numFirst + " " + signNeeded + " " + numSecond + " = " + result);
    }
}