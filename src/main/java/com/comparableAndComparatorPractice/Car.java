package com.comparableAndComparatorPractice;

import org.jetbrains.annotations.NotNull;

public class Car implements Comparable<Car>{
    private int price;
    private int speed;

    public Car(int price, int speed) {
        this.price = price;
        this.speed = speed;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    @Override
    public String toString() {
        return "Car{" +
                "price=" + price +
                ", speed=" + speed +
                '}';
    }

    @Override
    public int compareTo(@NotNull Car o) {
        return this.price - o.price;
    }
}
