package com.comparableAndComparatorPractice;

import java.util.Comparator;
import java.util.PriorityQueue;

public class Main {
    public static void main(String[] args) {
        Car c1 = new Car(200, 100);
        Car c2 = new Car(100, 100);
        Car c3 = new Car(400, 50);

        PriorityQueue<Car> pq = new PriorityQueue<>(
//                new Comparator<Car>() {
//                    @Override
//                    public int compare(Car o1, Car o2) {
//                        return o1.getSpeed() - o2.getSpeed();
//                    }
//                }
        );
        pq.add(c1);
        pq.add(c2);
        pq.add(c3);

        for(Car c : pq){
            System.out.println(c);
        }
    }
}
