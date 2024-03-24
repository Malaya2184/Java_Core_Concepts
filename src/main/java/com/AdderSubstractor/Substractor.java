package com.AdderSubstractor;

import java.util.concurrent.Callable;

public class Substractor implements Callable<Void> {
    private Value value;
    Substractor(Value value){
        this.value = value;
    }
    @Override
    public Void call() throws Exception {
        for(int i = 0; i<100000 ; i++){
            this.value.value -=1;
        }
        return null;
    }
}
