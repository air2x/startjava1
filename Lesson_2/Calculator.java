public class Calculator {

    private int num1;
    private int num2;
    public int result;
    private char mathSign;

    public void setNum1(int num1) {
        this.num1 = num1;
    }

    public void setNum2(int num2) {
        this.num2 = num2;
    }

    public void setMathSign(char mathSign) {
        this.mathSign = mathSign;
    }

    public void calculat() {
        switch (mathSign) {
            case '+' :
                result = num1 + num2;
                break;
            case '-' :
                result = num1 - num2;
                break;
            case '*' :
                result = num1 * num2;
                break;
            case '/' :
                result = num1 / num2;
                break;
            case '%' :
                result = num1 % num2;
                break;
            case '^' :
                result = num1;
                for (int i = 1; i < num2; i++) {
                    result *= num1;
            }
        }
        System.out.println("Результат вычислений " + result);
    }
}