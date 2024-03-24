package com.CollectionsAndLamdas;

public class Car implements Comparable<Car>{
    private int speed;
    private int capacity;

    @Override
    public String toString() {
        return "Car{" +
                "speed=" + speed +
                ", capacity=" + capacity +
                '}';
    }

    public Car(int speed, int capacity) {
        this.speed = speed;
        this.capacity = capacity;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    @Override
    public int compareTo(Car o) {
//        if(this.speed < o.speed){
//            return -1;
//        } else if (this.speed > o.speed) {
//            return 1;
//        }
//        else return 0;
        return this.speed - o.speed;
    }
}
