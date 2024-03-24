package practice.semaphores.producerAndConsumer;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Semaphore;

public class Main {
    public static void main(String[] args) {
        Semaphore producerSemaphore = new Semaphore(5);
        Semaphore consumerSemaphore = new Semaphore(0);
        ExecutorService es = Executors.newCachedThreadPool();
        Store store = new Store();
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
