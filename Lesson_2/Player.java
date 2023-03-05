import java.util.Scanner;

public class Player {

    private String name;
    private int num;

    public Player() {}

    public Player(String name) {
        this.name = name;
    }

    public int getNum() {
        return num;
    }
    public void setNum(int num) {
        this.num = num;
    }
    public void outRiteName() {
        System.out.println("Введите число");
    }
}