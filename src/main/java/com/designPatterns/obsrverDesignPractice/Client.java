package com.designPatterns.obsrverDesignPractice;

import com.designPatterns.obsrverDesignPractice.subscribers.EmailService;
import com.designPatterns.obsrverDesignPractice.subscribers.InvoiceGenerator;

public class Client {
    public static void main(String[] args) {
        Flipkart flipkart = Flipkart.getInstance();
        EmailService e1 = new EmailService();
        InvoiceGenerator i1 = new InvoiceGenerator();
        flipkart.regesterOrderPlacedSubscribers(e1);
        flipkart.regesterOrderPlacedSubscribers(i1);
        flipkart.regesterOrdercancelledSubscribers(e1);
        flipkart.regesterOrdercancelledSubscribers(i1);
        flipkart.onOrderplace();
        flipkart.onOrdercancel();
        System.out.println("invoice generator deregestered for order cacelled");
        flipkart.deregesterOrdercancelledSubscribers(i1);
        flipkart.onOrderplace();
        flipkart.onOrdercancel();

    }
}
