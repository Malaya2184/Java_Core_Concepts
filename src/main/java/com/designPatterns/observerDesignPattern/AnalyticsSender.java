package com.designPatterns.observerDesignPattern;

public class AnalyticsSender implements OrderPlaceSubscriber, OrderCancelSubscriber{

    public AnalyticsSender(){
        Flipkart flipkart = Flipkart.getInstance();
        flipkart.registerOrderPlaceSubscriber(this);
        flipkart.registerOrderCancelSubscriber(this);
    }

    @Override
    public void announceOrderCancelled() {
        System.out.println("cancelling analytics");
    }

    @Override
    public void announceOrderPlaced() {
        System.out.println("updating analytics");
    }
}
