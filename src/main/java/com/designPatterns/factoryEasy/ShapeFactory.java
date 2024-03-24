package com.designPatterns.factoryEasy;

public class ShapeFactory {
    String shape;
    ShapeFactory(String shape){
        this.shape = shape;
    }
    public Shape getObject(){
        if(this.shape.equalsIgnoreCase("circle")){
            return new Circle();
        } else if (this.shape.equalsIgnoreCase("triangle")) {
            return new Trangle();

        } else if (this.shape.equalsIgnoreCase("square")) {
            return new Square();
        }

        return  null;
    }
}
