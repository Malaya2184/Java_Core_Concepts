package com.designPatterns.flyweight;

public class Client {
    public static void main(String[] args) {
        DifferentBullets difBuet1 = new DifferentBullets(1,2.06,3.99);
        DifferentBullets difBuet2 = new DifferentBullets(2,6.06,78.99);
        DifferentBullets difBuet3 = new DifferentBullets(4,8.06,90.99);
        System.out.println("Debug");
    }
}
