package practice1.semaphores.producerAndConsumer;

import java.util.Queue;
import java.util.concurrent.ConcurrentLinkedQueue;

public class Store {
    private Queue items;

    public Store() {
        this.items = new ConcurrentLinkedQueue();
    }

    public Queue getItems() {
        return items;
    }

    public void setItems(Queue items) {
        this.items = items;
    }

    public void addItem(){
        items.add(new Object());
        System.out.println("Added item" + items.size());
    }

    public void removeItem(){
        items.remove();
        System.out.println("Removed item" + items.size());

    }
}
