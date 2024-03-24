package com.AdderSubstractorAtomicDataType;

import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicInteger;

public class Adder implements Callable<Void> {
    private AtomicInteger value;
    Adder(AtomicInteger value){
        this.value = value;
    }
    @Override
    public Void call() throws Exception {
        for (int i = 0; i < 5000; i++) {
            System.out.println("requested lock for adder " + i);
            value.addAndGet(i);
            System.out.println("added " + i);
        }
        return null;
    }
}
