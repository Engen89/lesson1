package lesson1Course2;

public class Cat implements Competitor{
    private String name;
    private int maxRunDistance;
    private int maxJumpHeight;
    boolean onDistance;

    public Cat(String name, int maxRunDistance,int maxJumpHeight, boolean onDistance){
        this.name = name;
        this.maxRunDistance = maxRunDistance;
        this.maxJumpHeight = maxJumpHeight;
        this.onDistance = true;
    }

    public Cat(String name){
        this(name, 500,2,true);
    }

    @Override
    public void run(int dist) {
        if (dist <= maxRunDistance) {
            System.out.printf("%s удачно пробежал дистанцию %d метров \n", name, dist);
        } else {
            System.out.printf("%s не пробежал дистанцию %d метров \n", name, dist);
            onDistance = false;
        }
    }

    @Override
    public void jump(int height){
        if (height <= maxJumpHeight) {
            System.out.printf("%s удачно пробежал дистанцию %d метров \n", name, height);
        } else {
            System.out.printf("%s не пробежал дистанцию %d метров \n", name, height);
            onDistance = false;
        }
    }
    @Override
    public boolean isOnDistance (){
        return onDistance;
    }
    @Override
    public void info(){
        System.out.printf("%s %b\n", name, onDistance);
    }
}
