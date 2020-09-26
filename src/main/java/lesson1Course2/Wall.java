package lesson1Course2;

public class Wall implements Obstacle{
    private int height;

    public Wall (int height){
        this.height = height;
    }

    public void doIt (Competitor c){
        c.jump(height);
    }
}
