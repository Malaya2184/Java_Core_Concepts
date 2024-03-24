package com.designPatterns.sigleton.multiThreadEager;

public class Client {
    public static void main(String[] args) {
        Runnable task = () -> {
            Singleton2 obj = Singleton2.getInstance();
            System.out.println("Task: " + Thread.currentThread().getId() + "singleton obj " + obj);
        };
        for (int i = 0; i< 5 ; i++){
            Thread thread =new Thread(task);
            thread.start();
        }
    }
}
