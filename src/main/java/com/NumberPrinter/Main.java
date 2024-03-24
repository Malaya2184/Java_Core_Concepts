package com.NumberPrinter;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Main {
    public static void main(String[] args) {
//        ExecutorService executorService = Executors.newFixedThreadPool(10);
        ExecutorService executorService = Executors.newCachedThreadPool();
        for (int i = 0; i < 1000; i++) {
            if (i == 900) {
                System.out.println("STOP");
            }
            NumberPrinter np = new NumberPrinter(i);
//            Thread th = new Thread(np);
//            th.start();
            executorService.execute(np);
        }
    }
}
