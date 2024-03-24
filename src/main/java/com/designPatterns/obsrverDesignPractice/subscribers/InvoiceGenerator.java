package com.designPatterns.obsrverDesignPractice.subscribers;

public class InvoiceGenerator implements OrderPlacedSubscribers, OrdercancelledSubscribers{
    @Override
    public void announceOrderPlace() {
        System.out.println("Invoice genrated on order place");
    }

    @Override
    public void announceOrdrCancelled() {
        System.out.println("Invoice cancelled on order place");
    }
}
