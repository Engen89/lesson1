package lesson6;

public class Animals {
    String name;
    String type;
    int age;
    int maxDistanceRun;
    int maxDistanceSwim;

    public Animals(String name, String type, int age, int maxDistanceRun, int maxDistanceSwim) {
        this.name = name;
        this.type = type;
        this.age = age;
        this.maxDistanceRun = maxDistanceRun;
        this.maxDistanceSwim = maxDistanceSwim;
    }

    public void run(int dist) {
        if (dist <= maxDistanceRun) {
            System.out.println(type + " " + name + " удачно пробежал " + dist + " метров");
        } else {
            System.out.println(type + " " + name + " не пробежал " + dist + " метров");
        }
    }

    public void swim(int dist) {
        if (dist <= maxDistanceSwim) {
            System.out.println(type + " " + name + " удачно проплыл " + dist + " метров");
        } else {
            System.out.println(type + " " + name + " не проплыл " + dist + " метров");
        }
    }
}