package com.Lamdas;

public class Main {
    public static void main(String[] args) {
        Printer p = new Printer();
        Thread t = new Thread(p);
        t.start();
    }
}
