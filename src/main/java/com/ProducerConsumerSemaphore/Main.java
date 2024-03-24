package com.ProducerConsumerSemaphore;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Semaphore;

public class Main {
    public static void main(String[] args) {
        Store store = new Store();
        Semaphore producerSemaphore = new Semaphore(5);
        Semaphore consumerSemaphore = new Semaphore(0);

        ExecutorService es = Executors.newCachedThreadPool();

        for (int i = 0; i < 10; i++) {
            Producer producer = new Producer(store,producerSemaphore,consumerSemaphore);
            es.execute(producer);
        }
        for (int i = 0; i < 100; i++) {
            Consumer consumer = new Consumer(store, producerSemaphore, consumerSemaphore);
            es.execute(consumer);
        }

        es.shutdown();
    }
}
