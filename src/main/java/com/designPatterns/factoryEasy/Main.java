package com.designPatterns.factoryEasy;

public class Main {
    public static void main(String[] args) {
        ShapeFactory factory = new ShapeFactory("Circle");
        Shape circle = factory.getObject();
        circle.draw();
    }

}
