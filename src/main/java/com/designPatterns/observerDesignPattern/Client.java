package com.designPatterns.observerDesignPattern;

public class Client {
    public static void main(String[] args) {
        Flipkart flipkart = Flipkart.getInstance();
        EmailSender emailSender = new EmailSender();
        AnalyticsSender analyticsSender = new AnalyticsSender();
        InvoiceGenerator invoiceGenerator = new InvoiceGenerator();
        System.out.println("Debug 1");
        flipkart.orderPlaced();
        System.out.println("Debug 2");
        flipkart.orderCancelled();
        System.out.println("Debug 3");

    }

}
