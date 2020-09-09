package lesson5;

public class HomeWork5 {
    public static void main(String[] args) {
        Person[] persArray = new Person[6];
        persArray[0] = new Person("Ivanov Ivan", "Engineer", "ivivan@mailbox.com", "892312312", 30000, 30);
        persArray[1] = new Person("Petrov Petr", "Engineer", "petrov@mailbox.com", "892356114", 31000, 35);
        persArray[2] = new Person("Vasilev Vasiliy", "Economist", "vasilev@mailbox.com", "892355665", 35000, 40);
        persArray[3] = new Person("Gysev Nikolay", "Director", "gysev@mailbox.com", "892312345", 100000, 45);
        persArray[4] = new Person("Urasov Victor", "Lead engineer", "urasov@mailbox.com", "892354321", 50000, 41);
        persArray[5] = new Person("Kirova Marina", "Economist", "kirova@mailbox.com", "892355661", 35000, 25);


        for (int i = 0; i < persArray.length; i++) {
            if (persArray[i].getAge() > 40){
                persArray[i].info();
            }
        }
    }
}
