package HW5;

import java.util.ArrayList;
import java.util.Arrays;

public class HW5 {
    public static void main(String[] args) throws InterruptedException {
        secondMethod();
        firstMethod();
    }
    //Методы
    public static  void firstMethod() {
        int size = 10_000_000;
        int[] arr = new int[size];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = 1;
        }
        long startTime = System.currentTimeMillis();
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) (arr[i] * Math.sin(0.2f + i / 5) * Math.cos(0.2f + i / 5) * Math.cos(0.4f + i / 2));
        }
        System.out.println("Первый метод: " + (System.currentTimeMillis() - startTime) + " ms.");
    }

    public static  void secondMethod() {
        int size = 10_000_000;
        int[] arr = new int[size];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = 1;
        }
        long startTime2 = System.currentTimeMillis();
        int[] arr1 = new int[size/2];
        int[] arr2 = new int[size/2];
        System.arraycopy(arr, 0, arr1, 0, size/2);
        System.arraycopy(arr, size/2, arr2, 0, size/2);
        Thread thread3 = new Thread(new Runnable() {
            @Override
            public void run() {
                int sum1 = 0;
                for (int i = 0; i < arr1.length; i++) {
                    sum1 = sum1 + arr1[i];
                    arr1[i] = 2;
                }
                System.out.println("Поток тред 3 = " + sum1);
                System.out.println("Поток тред 3 = " + (System.currentTimeMillis() - startTime2) + " ms.");
            }
        });
        thread3.start();


        Thread thread4 = new Thread(new Runnable() {
            @Override
            public void run() {
                int sum2 = 0;
                for (int i = 0; i < arr2.length; i++) {
                    sum2 = sum2 + arr2[i];
                    arr2[i] = 3;
                }
                System.out.println("Поток тред 3 = " + sum2);
                System.out.println("Поток тред 4 = " + (System.currentTimeMillis() - startTime2) + " ms.");
            }
        });
        thread4.start();
        try {
            thread4.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }


        Thread thread5 = new Thread(new Runnable() {
            @Override
            public void run() {
                System.arraycopy(arr1, 0, arr, 0, size / 2);
                System.arraycopy(arr2, 0, arr, size / 2, size / 2);
                System.out.println("Склейка массива с новыми данными: " + (System.currentTimeMillis() - startTime2) + " ms.");
            }
        });
        thread5.setDaemon(true);
        thread5.start();
        try {
            thread5.join();
            System.out.println("Окончание второго метода: " + (System.currentTimeMillis() - startTime2) + " ms.");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }


}




