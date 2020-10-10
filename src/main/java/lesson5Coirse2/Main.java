package lesson5Coirse2;

import java.util.Arrays;

public class Main {
    static final int SIZE = 10000000;
    static final int HALF = SIZE / 2;


    public static void main(String[] args) {
        float[] arr = new float[SIZE];
        toDo(arr);
        metod1(arr);
        metod2(arr);

    }
    public static void toDo(float[] arr){
        Arrays.fill(arr, 1);

    }
    public static void metod1 (float[] arr) {
        long a1 = System.currentTimeMillis();

        for (int i = 0; i < arr.length; i++) {
            arr[i] = (float) (arr[i] * Math.sin(0.2f + i / 5) * Math.cos(0.2f + i / 5) * Math.cos(0.4f + i / 2));
        }
        long b1 = System.currentTimeMillis();
        System.out.println("Время работы одного потока: " + (b1 - a1) + " мс");
    }
    public static void metod2 (float[] arr) {
        long a2 = System.currentTimeMillis();
        float[] f1 = new float[HALF];
        float[] f2 = new float[HALF];

        System.arraycopy(arr, 0, f1, 0, HALF);
        System.arraycopy(arr, HALF, f2, 0, HALF);

        Thread thread1 = new Thread(() -> {
            for (int i = 0; i < arr.length; i++) {
                arr[i] = (float) (arr[i] * Math.sin(0.2f + i / 5) * Math.cos(0.2f + i / 5) * Math.cos(0.4f + i / 2));
            }
        });

        Thread thread2 = new Thread(() -> {
            for (int i = 0; i < arr.length; i++) {
                arr[i] = (float) (arr[i] * Math.sin(0.2f + (i + HALF) / 5) * Math.cos(0.2f + (i+ HALF) / 5) * Math.cos(0.4f + (i+ HALF) / 2));
            }
        });
        thread1.start();
        thread2.start();

        try {
            thread1.join();
            thread2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.arraycopy(f1, 0, arr, 0, HALF);
        System.arraycopy(f2, 0, arr, HALF, HALF);

        long b2 = System.currentTimeMillis();
        System.out.println("Время работы двух потоков: " + (b2 - a2) + " мс");

    }
}
