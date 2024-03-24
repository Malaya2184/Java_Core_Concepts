package com.comparableAndComparator;

import org.jetbrains.annotations.NotNull;

public class Car implements Comparable<Car>{
    private int speed;
    private int engineCapasity;

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public int getEngineCapasity() {
        return engineCapasity;
    }

    public void setEngineCapasity(int engineCapasity) {
        this.engineCapasity = engineCapasity;
    }

    public Car(int speed, int engineCapasity) {
        this.speed = speed;
        this.engineCapasity = engineCapasity;
    }

    @Override
    public String toString() {
        return "Car{" +
                "speed=" + speed +
                ", engineCapasity=" + engineCapasity +
                '}';
    }

    @Override
    public int compareTo(@NotNull Car o) {
        return this.speed - o.getSpeed();
    }
}
