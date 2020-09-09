package lesson5;

public class Person {
    private String fullName;
    private String profession;
    private String email;
    private String phoneNumber;
    private int salary;
    private int age;

    public Person(String fullName, String profession, String email, String phoneNumber, int salary, int age) {
        this.fullName = fullName;
        this.profession = profession;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.salary = salary;
        this.age = age;
    }

    public void info (){
        System.out.printf("Person: %s %s %s %s %d %d\n", fullName, profession, email, phoneNumber, salary, age);
    }

    public int getAge (){
        return age;
    }
}
