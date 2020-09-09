package ru.geekbrains.lesson1;

public class HomeWork1 {
    public static void main(String[] args) { //1. Создаю метод main
        /* 2. Создаю переменные и инициализирую их
        byte a = 120;
        short b = 30000;
        int c = 123567;
        long d = 30200100L;
        float i = 23.23f;
        double f = -52.12;
        char g = '\u3124';
        boolean n = true;*/

        System.out.println(cal(1,3,2,1));

        System.out.println(task10and20(11, 10));

        isPositiveOrNegative(-30);

        System.out.println(isNegative(-25));

        myText("Фанзиль");

    }
    // 3. Метод вычисления
    public static int cal (int a, int b, int c, int d){
        return a * (b + (c / d));
    }
    // 4. Метод вычисления true/false
    public static boolean task10and20(int a, int b) {
       int c = a + b;
       boolean bool;
       if (c >= 10 && c <=20){
           bool = true;
       } else {
           bool = false;
       }
        return bool;
    }
    // 5. Метод вычисления и вывода положительное/отрицательное
    public static void isPositiveOrNegative (int a) {
        if(a>=0){
            System.out.println("Положительное");
        } else {
            System.out.println("Отрицательное");
        }
    }
    // 6. Метод возврата положительное/отрицательное
    public static boolean isNegative(int a) {
        if(a<=0){
            return true;
        }
        return false;
    }
    // 7. Вывод имени на консоль
    public static void myText(String name) {
        System.out.println("Привет " + name + "!");
    }

}
 /* * Написать метод, который определяет является ли год високосным,
 и выводит сообщение в консоль. Каждый 4-й год является високосным,
 кроме каждого 100-го, при этом каждый 400-й – високосный.
  */