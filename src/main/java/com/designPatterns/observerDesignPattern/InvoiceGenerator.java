package com.designPatterns.observerDesignPattern;

public class InvoiceGenerator implements OrderPlaceSubscriber, OrderCancelSubscriber{
    public InvoiceGenerator(){
        Flipkart flipkart = Flipkart.getInstance();
        flipkart.registerOrderPlaceSubscriber(this);
        flipkart.registerOrderCancelSubscriber(this);
    }
    @Override
    public void announceOrderCancelled() {
        System.out.println("Invoice cancelled");
    }

    @Override
    public void announceOrderPlaced() {
        System.out.println("Invoice generated");
    }
}
