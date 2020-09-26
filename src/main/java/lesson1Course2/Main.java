package lesson1Course2;

public class Main {
    public static void main(String[] args) {

        Competitor[] competitors = {
                new Human("Alex", 300, 2, true),
                new Cat("White", 200,1,true),
                new Robot("T-800",2000,10,true),
        };

        Obstacle[] obstacles = {
                new Treadmill(250),
                new Wall(3)
        };

        for (Competitor c : competitors){
            for (Obstacle o : obstacles){
                o.doIt(c);
                if(!c.isOnDistance()){
                    break;
                }
            }
        }
        for (Competitor competitor : competitors){
            competitor.info();
        }
    }

//    static void runTreadmill(Competitor c) {
//        c.run();
//    }

}
