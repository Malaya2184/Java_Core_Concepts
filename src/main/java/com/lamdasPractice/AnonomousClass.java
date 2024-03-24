package com.lamdasPractice;

public class AnonomousClass {
    public static void main(String[] args) {
        Thread t = new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("ANonomous class here");
            }
        });
        t.start();
        Thread t2 = new Thread(()-> System.out.println("With Lamda"));
        t2.start();
    }
}
