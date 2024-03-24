package com.AdderSubstractor;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class Main {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        Value value = new Value(0);

        Adder adder = new Adder(value);
        Substractor substractor = new Substractor(value);

        ExecutorService es = Executors.newCachedThreadPool();
        Future<Void> adderFuture = es.submit(adder);
        Future<Void> subtractFuture = es.submit(substractor);

//        adderFuture.get();
//        subtractFuture.get();

        Thread.sleep(1000);
        System.out.println(value.value);
        es.shutdown();

    }
}
