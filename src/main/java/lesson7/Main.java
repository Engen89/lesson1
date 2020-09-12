package lesson7;

public class Main {
    public static void main(String[] args) {

        Cat cat = new Cat("Barsik");
        Plate plate = new Plate((100));

        cat.eat(plate);
        System.out.println(plate);
    }

}
