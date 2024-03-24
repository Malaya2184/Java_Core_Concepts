package ProducerConsumerSemaphore;

import java.util.Queue;
import java.util.concurrent.ConcurrentLinkedDeque;

public class Store {
    private Queue<Object> items;

    public Store(){
        this.items = new ConcurrentLinkedDeque<>();
    }

    public void addItem(){
        this.items.add(new Object());
        System.out.println("item added size is :- "+ items.size());
    }
    public void removeItem(){
        this.items.remove();
        System.out.println("item removed size is :- "+ items.size());
    }
}
