package lesson1Course2;

public class Main {
    public static void main(String[] args) {
        Competitor human = new Human();
        Competitor cat = new Cat();
        Competitor robot = new Robot();
        human.run();
        human.jump();
    }
}
