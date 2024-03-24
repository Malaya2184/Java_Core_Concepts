package com.comparableAndComparator;

import java.util.Comparator;
import java.util.PriorityQueue;

public class Main {
    public static void main(String[] args) {
//        PriorityQueue<Car> pq = new PriorityQueue<>(new CarComparator());
//        PriorityQueue<Car> pq = new PriorityQueue<>();
        PriorityQueue<Car> pq = new PriorityQueue<>(new Comparator<Car>() {
            @Override
            public int compare(Car o1, Car o2) {
                return  o1.getEngineCapasity()-o2.getEngineCapasity();
            }
        });
        Car c1 = new Car(100,200);
        Car c2 = new Car(200,100);
        Car c3 = new Car(50, 200);
        Car c4 = new Car(350, 20);
        Car c5 = new Car(10, 5);

        pq.add(c1);
        pq.add(c2);
        pq.add(c3);
        pq.add(c4);
        pq.add(c5);

        while(!pq.isEmpty()){
            System.out.println(pq.poll());
        }
    }
}
