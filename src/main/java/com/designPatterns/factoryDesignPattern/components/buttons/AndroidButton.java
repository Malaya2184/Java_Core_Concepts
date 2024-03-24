package com.designPatterns.factoryDesignPattern.components.buttons;

public class AndroidButton implements Button{
    @Override
    public void changeSize() {
        System.out.println("change size for android Button");
    }
}
