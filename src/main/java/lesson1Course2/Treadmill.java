package lesson1Course2;

public class Treadmill implements Obstacle{
    private int dist;

    public Treadmill (int dist){
        this.dist = dist;
    }

    public void doIt (Competitor c){
        c.run(dist);
    }
}
