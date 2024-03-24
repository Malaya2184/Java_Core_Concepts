package com.AdderSubstractorAtomicDataType;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.atomic.AtomicInteger;

public class Main {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        AtomicInteger value = new AtomicInteger(0);
        Adder adder = new Adder(value);
        Subtractor subtractor = new Subtractor(value);

        ExecutorService es = Executors.newCachedThreadPool();
        Future<Void> adderFuture = es.submit(adder);
        Future<Void> subtractorFuture = es.submit(subtractor);

        adderFuture.get();
        subtractorFuture.get();



        System.out.println("final value is = "+ value);

        es.shutdown();

    }
}
