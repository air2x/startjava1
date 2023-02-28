import java.util.Scanner;

public class CalculatorTest {

    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        Scanner scanner = new Scanner(System.in);
        String answer = "yes";
        while (answer.equals("yes")) {
            System.out.println("Введите первое число: ");
            calculator.setNum1(scanner.nextInt());
            System.out.println("Введите знак математической операции: ");
            calculator.setMathSign(scanner.next().charAt(0));
            System.out.println("Введите второе число: ");
            calculator.setNum2(scanner.nextInt());
            calculator.calculated();
            scanner.nextLine();
            System.out.println("Хотите продолжить вычисления? [yes/no]");
            answer = scanner.nextLine();
            while (!(answer.equals("no")) && !(answer.equals("yes"))) {
                System.out.println("Хотите продолжить вычисления? [yes/no]");
                answer = scanner.nextLine();
            }
        }
    }
}