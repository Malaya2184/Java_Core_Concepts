package com.designPatterns.obsrverDesignPractice.subscribers;

public class EmailService implements OrderPlacedSubscribers, OrdercancelledSubscribers{

    @Override
    public void announceOrderPlace() {
        System.out.println("Email sent on order placed");
    }

    @Override
    public void announceOrdrCancelled() {
        System.out.println("Email sent on order cancelled");
    }
}
