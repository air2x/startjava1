public class MyFirstGame {

    public static void main(String[] args) {
        int startRange = 0;
        int endRange = 100;
        int hiddenNum = 50;
        int playerNum = 85;
        while (hiddenNum != playerNum) {
            if (hiddenNum < playerNum) {
                System.out.println("Число " + playerNum + " больше того, что загадал компьютер");
                playerNum--;
            } else if (hiddenNum > playerNum) {
                System.out.println("Число " + playerNum + " меньше того, что загадал компьютер");
                playerNum++;
            }
        }
        System.out.println("Вы победили!");
    }
}