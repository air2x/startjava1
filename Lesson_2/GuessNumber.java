import java.util.Scanner;

public class GuessNumber {

    private int computerNum;

    Scanner scanner = new Scanner(System.in);
    public void startGame() {
        Player player = new Player();
        player.outRiteName();
        player.setNum(scanner.nextInt());
        computerNum = (int) ((Math.random() * 100) + 1);
        while (computerNum != player.getNum()) {
            if (computerNum < player.getNum()) {
                System.out.println("Число " + player.getNum() + " больше того, что загадал компьютер");
                player.outRiteName();
                player.setNum(scanner.nextInt());
            } else if (computerNum > player.getNum()) {
                System.out.println("Число " + player.getNum() + " меньше того, что загадал компьютер");
                player.outRiteName();
                player.setNum(scanner.nextInt());
            }
        }
        System.out.println("Победа");
    }
}