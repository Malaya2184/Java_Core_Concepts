package com.designPatterns.flyweight;

public class BulletCommonAttributes {
    private static BulletCommonAttributes bulletCommonAttributesObj;
    private int radious;
    private int weight;
    private int maxdamage;
    private int range;
    private int length;
    private String color;
    private int impage;

    // this is not perfect
    private BulletCommonAttributes(int radious, int weight, int maxdamage, int range, int length, String color, int impage) {
        this.radious = radious;
        this.weight = weight;
        this.maxdamage = maxdamage;
        this.range = range;
        this.length = length;
        this.color = color;
        this.impage = impage;
    }
    public static BulletCommonAttributes getInstance(){
        if(bulletCommonAttributesObj == null){
            bulletCommonAttributesObj = new BulletCommonAttributes(1,2,3,4,5,"Black", 5);
        }
        return  bulletCommonAttributesObj;

    }
}
