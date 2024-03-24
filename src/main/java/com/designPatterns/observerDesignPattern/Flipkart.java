package com.designPatterns.observerDesignPattern;

import java.util.ArrayList;
import java.util.List;

public class Flipkart {
    private static Flipkart  flipkartInstance;
    private List<OrderPlaceSubscriber> orderPlaceSubscribers = new ArrayList<>();
    private List<OrderCancelSubscriber> orderCancelSubscribers = new ArrayList<>();
    public static Flipkart getInstance(){
        if(flipkartInstance ==null){
            flipkartInstance = new Flipkart();
        }
        return flipkartInstance;
    }
    //regester Order place Subscribers / Order cancel subscriber
    public void registerOrderPlaceSubscriber(OrderPlaceSubscriber orderPlaceSubscriber){
        orderPlaceSubscribers.add(orderPlaceSubscriber);
    }
    public void registerOrderCancelSubscriber(OrderCancelSubscriber orderCancelSubscriber){
        orderCancelSubscribers.add(orderCancelSubscriber);
    }

    //unregester Order place Subscribers / Order cancel subscriber
    public void unregisterOrderPlaceSubscriber(OrderPlaceSubscriber orderPlaceSubscriber){
        orderPlaceSubscribers.remove(orderPlaceSubscriber);
    }
    public void unregisterOrderCancelSubscriber(OrderCancelSubscriber orderCancelSubscriber){
        orderCancelSubscribers.remove(orderCancelSubscriber);
    }
    //order placed
    public void orderPlaced(){
        for(OrderPlaceSubscriber orderPlaceSubscriber : orderPlaceSubscribers){
            orderPlaceSubscriber.announceOrderPlaced();
        }
    }
    //order cancelled
    public void orderCancelled(){
        for(OrderCancelSubscriber orderCancelSubscriber : orderCancelSubscribers){
            orderCancelSubscriber.announceOrderCancelled();
        }
    }

}
