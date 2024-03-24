package com.CollectionsAndLamdas;

import java.util.Comparator;
import java.util.PriorityQueue;

public class Main {
    public static void main(String[] args) {
        Car c1 = new Car(100,500);
        Car c2 = new Car(80, 20);
        Car c3 = new Car(200, 90);
//        System.out.println(c1.compareTo(c2));
// used comparable
        PriorityQueue<Car> pq = new PriorityQueue<>();
        pq.add(c1);
        pq.add(c2);
        pq.add(c3);
        while(!pq.isEmpty()){
            System.out.println(pq.poll());
        }
//        used comparator
        PriorityQueue<Car> pq1 = new PriorityQueue<>(new CarComparator());
        pq1.add(c1);
        pq1.add(c2);
        pq1.add(c3);
        while(!pq1.isEmpty()){
            System.out.println(pq1.poll());
        }
//        use new comparator and why java allows new on comparator
        PriorityQueue<Car> pq2 = new PriorityQueue<>(new Comparator<Car>() {
            @Override
            public int compare(Car o1, Car o2) {
                return o1.getSpeed()-o2.getSpeed();
            }
        });
        pq2.add(c1);
        pq2.add(c2);
        pq2.add(c3);
        while(!pq2.isEmpty()){
            System.out.println(pq2.poll());
        }
    }
}
