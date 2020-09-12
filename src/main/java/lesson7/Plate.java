package lesson7;

public class Plate {
    private int food;

    public Plate(int food) {
        this.food = food;
    }

    public int getFood() {
        return food;
    }

//    public void decreaseFood(int amount) {
//        if (amount <= food){
//            this.food -= amount;
//        } else {
//            System.out.println("no eat!");
//        }
//    }

    public void decreaseFood(int amount) {
        if (amount <= food){
            this.food -= amount;
        } else {
            System.out.println("no eat!");
        }
    }




//    public boolean aaa (){
//        if (10 <= food){
//            return true;
//        }
//    }

    @Override
    public String toString() {
        return "Plate{" +
                "food=" + food +
                '}';
    }
}

