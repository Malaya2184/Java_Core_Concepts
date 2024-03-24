package com.designPatterns.obsrverDesignPractice;

import com.designPatterns.obsrverDesignPractice.subscribers.OrderPlacedSubscribers;
import com.designPatterns.obsrverDesignPractice.subscribers.OrdercancelledSubscribers;

import java.util.ArrayList;
import java.util.List;

public class Flipkart {
    private static Flipkart flipkart;
    private List<OrdercancelledSubscribers> ordercancelledSubscribersList = new ArrayList<>();
    private  List<OrderPlacedSubscribers> orderPlacedSubscribersList  = new ArrayList<>();
    private Flipkart(){

    }
    public static Flipkart getInstance(){
        if (flipkart == null) {
            flipkart = new Flipkart();
        }
        return flipkart;
    }
    public void regesterOrderPlacedSubscribers(OrderPlacedSubscribers orderPlacedSubscribers){
        this.orderPlacedSubscribersList.add(orderPlacedSubscribers);
    }
    public void deregesterOrderPlacedSubscribers(OrderPlacedSubscribers orderPlacedSubscribers){
        orderPlacedSubscribersList.remove(orderPlacedSubscribers);
    }
    public void regesterOrdercancelledSubscribers(OrdercancelledSubscribers ordercancelledSubscribers){
        ordercancelledSubscribersList.add(ordercancelledSubscribers);
    }
    public void deregesterOrdercancelledSubscribers(OrdercancelledSubscribers ordercancelledSubscribers){
        ordercancelledSubscribersList.remove(ordercancelledSubscribers);
    }
    public void onOrderplace(){
        for(OrderPlacedSubscribers orderPlacedSubscribers : orderPlacedSubscribersList){
            orderPlacedSubscribers.announceOrderPlace();
        }
    }
    public void onOrdercancel(){
        for(OrdercancelledSubscribers ordercancelledSubscribers : ordercancelledSubscribersList){
            ordercancelledSubscribers.announceOrdrCancelled();
        }
    }
}
