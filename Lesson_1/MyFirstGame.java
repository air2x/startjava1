public class MyFirstGame {

    public static void main(String[] args) {
        int startRange = 0;
        int endRange = 100;
        int numHidden = 50;
        int numPlayer = 53;
        while (numHidden != numPlayer) {
            if (numHidden < numPlayer) {
                System.out.println("Число " + numPlayer + " больше того, что загадал компьютер");
                numPlayer--;
            } else if (numHidden > numPlayer) {
                System.out.println("Число " + numPlayer + " меньше того, что загадал компьютер");
                numPlayer++;
            }
        }
        if (numHidden == numPlayer) {
                System.out.println("Вы победили!");
            }
    }
}