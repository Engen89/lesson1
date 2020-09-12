package lesson7;

public class Cat {
    private String name;
    private int consume;
    private boolean full;

    public Cat(String name,int consume, boolean full) {
        this.name = name;
        this.consume = consume;
        this.full = full;
    }

    public void eat(Plate plate) {
        System.out.println("Cat " + name + " eat...");
        plate.decreaseFood(amount);
    }

    public String getName() {
        return name;
    }

    public int getConsume() {
        return consume;
    }

    public boolean getFull() {
        return full;
    }

    public boolean setFull() {
        return full;
    }

}
