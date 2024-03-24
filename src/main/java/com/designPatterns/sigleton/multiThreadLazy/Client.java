package com.designPatterns.sigleton.multiThreadLazy;

public class Client {
    public static void main(String[] args) {
        Runnable task = () -> {
            Singleton3 obj = Singleton3.getInstance();
            System.out.println("Task: " + Thread.currentThread().getId() + "singleton obj " + obj);
        };
        for (int i = 0; i< 10 ; i++){
            Thread thread =new Thread(task);
            thread.start();
        }
    }
}
