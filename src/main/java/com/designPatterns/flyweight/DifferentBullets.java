package com.designPatterns.flyweight;

public class DifferentBullets {
    private int speed;
    private double currentCoOrdinate;
    private double targetCoOrdinate;
    private BulletCommonAttributes bulletCommonAttributes;

    public DifferentBullets(int speed, double currentCoOrdinate, double targetCoOrdinate) {
        this.speed = speed;
        this.currentCoOrdinate = currentCoOrdinate;
        this.targetCoOrdinate = targetCoOrdinate;
        this.bulletCommonAttributes = BulletCommonAttributes.getInstance();
    }
}
