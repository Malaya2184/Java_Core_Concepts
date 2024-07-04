package practice1.comparableAndComparators;

import java.util.PriorityQueue;

public class Main {
    public static void main(String[] args) {
        PriorityQueue<Product> pq = new PriorityQueue<>(new ProductComaparator());
        pq.add(new Product(20,27));
        pq.add(new Product(10,50));
        pq.add(new Product(3,90));
        while (!pq.isEmpty()) {
            System.out.println(pq.poll());
        }
    }
}
