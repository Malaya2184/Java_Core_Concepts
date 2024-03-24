package com.Lamdas;

public class AnathorWay {
    public static void main(String[] args) {
        Runnable runnable = AnathorWay :: printHello;
        Thread th = new Thread(runnable);
        th.start();
    }
    public static void printHello(){;
        System.out.println("Hello it is running from thread");
    }
}
