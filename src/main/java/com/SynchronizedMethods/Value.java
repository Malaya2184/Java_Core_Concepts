package com.SynchronizedMethods;

public class Value {
    private int value;

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public synchronized void incrementValue(int increment){
        this.value += increment;
    }

}