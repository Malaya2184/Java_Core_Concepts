package com.Lamdas;

public class AnonommousClasses {
    public static void main(String[] args) {
        Thread t = new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("Hello World");
            }
        });
        Thread t2 = new Thread(()-> System.out.println("thread runed from lamda"));

        Thread t3 = new Thread(new MyRunnable() {
            @Override
            public void run() {
                System.out.println("Hello World from my runnable");
            }
        });
        t.start();
        t2.start();
        t3.start();

    }
}
