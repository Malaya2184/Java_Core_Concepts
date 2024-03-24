package com.designPatterns.factoryDesignPattern.components.buttons;

public class IosButton implements Button{
    @Override
    public void changeSize() {
        System.out.println("change size for ios");
    }
}
