package com.NumberPrinter;

public class NumberPrinter implements  Runnable {
    int numberToPrint;
    NumberPrinter(int numberToPrint){
        this.numberToPrint = numberToPrint;
    }
    public void  run(){
        System.out.println(numberToPrint + " printed from " + Thread.currentThread().getName());
    }
}
