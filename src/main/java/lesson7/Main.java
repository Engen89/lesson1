package lesson7;

public class Main {
    public static void main(String[] args) {
        Cat[] cat = {
                new Cat("Barsik",10,false);
                new Cat("Vaska",20,false);
                new Cat("Rigik",15,false);
                new Cat("Murka",20,false);
                new Cat("Belei",10,false);
        }
// Cat[0][j]
//        Cat cat = new Cat("Barsik",15,false);

        Plate plate = new Plate((50));

        public void amount (){

        }

        int amount = 0;
        for (int i = 0; i <= cat.length; i++) {
            cat[i][1]= amount;
            cat[].eat(plate);
            System.out.println(plate);
        }
    }

}
