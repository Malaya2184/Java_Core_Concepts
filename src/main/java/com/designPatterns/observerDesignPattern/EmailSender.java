package com.designPatterns.observerDesignPattern;

public class EmailSender implements OrderPlaceSubscriber, OrderCancelSubscriber{

    public EmailSender(){
        Flipkart flipkart = Flipkart.getInstance();
        flipkart.registerOrderPlaceSubscriber(this);
        flipkart.registerOrderCancelSubscriber(this);
    }
    @Override
    public void announceOrderCancelled() {
        System.out.println("Email sent for cancelled");
    }

    @Override
    public void announceOrderPlaced() {
        System.out.println("Email sent for order placed");
    }
}
