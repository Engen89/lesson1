package lesson6;

public class Main {
    public static void main(String[] args) {
        Animals dog1 = new Dog("Шарик");
        Animals cat1 = new Cat("Баксик");

        dog1.run(300);
        dog1.swim(10);
        cat1.run(300);
        cat1.swim(5);

    }

}
