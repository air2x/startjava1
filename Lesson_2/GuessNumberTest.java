import java.util.Scanner;

public class GuessNumberTest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String answer = "yes";
        GuessNumber play = new GuessNumber();
        System.out.println("Первый игрок назовите ваше имя");
        Player playerOne = new Player(scanner.nextLine());
        System.out.println("Второй игрок назовите ваше имя");
        Player playerTwo = new Player(scanner.nextLine());
        while (answer.equals("yes")) {
            play.startGame();
            do {
                System.out.println("Хотите продолжить игру? [yes/no]");
                answer = scanner.nextLine();
            } while (!answer.equals("no") && !answer.equals("yes"));
        }
    }
}