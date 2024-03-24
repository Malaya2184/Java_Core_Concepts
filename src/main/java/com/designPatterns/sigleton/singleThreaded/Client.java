package com.designPatterns.sigleton.singleThreaded;

public class Client {
    public static void main(String[] args) {
//        Singleton1 obj1 = Singleton1.getSingleton1obj();
//        Singleton1 obj2 = Singleton1.getSingleton1obj();
//        System.out.println("Debug");

        Runnable task = () -> {
            Singleton1 obj = Singleton1.getSingleton1obj();
            System.out.println("Thread " + Thread.currentThread().getId() + ": " + obj);
        };

        int numberOfThreads = 5;

        // Create and start multiple threads
        for (int i = 0; i < numberOfThreads; i++) {
            Thread thread = new Thread(task);
            thread.start();
            if(i == 4){
                System.out.println("Debug point");
            }
        }
    }
}
