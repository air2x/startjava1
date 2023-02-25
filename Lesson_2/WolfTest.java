public class WolfTest {

    public static void main(String[] args) {
        Wolf wolfOne = new Wolf();
        wolfOne.name = "Альфа";
        wolfOne.gender = "Кабель";
        wolfOne.color = "Черный";
        wolfOne.weight = 38;
        wolfOne.age = 9;
        System.out.println("Кличка: " + wolfOne.name + "\nПол: " + wolfOne.gender + "\nОкрас: " + 
                wolfOne.color + "\nВес: " + wolfOne.weight + "\nВозраст: " + wolfOne.age);
        wolfOne.sit();
        wolfOne.walk();
        wolfOne.run();
        wolfOne.howl();
        wolfOne.hunt();
    }
}