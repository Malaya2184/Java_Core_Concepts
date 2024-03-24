package com.designPatterns.adaptor;

public class Client {
    public static void main(String[] args) {
        ModernPrinter modernPrinter = new PrinterAdaptor(new LgacyPrinter());
        modernPrinter.printDocument("-- Bravo !!!");
    }
}
