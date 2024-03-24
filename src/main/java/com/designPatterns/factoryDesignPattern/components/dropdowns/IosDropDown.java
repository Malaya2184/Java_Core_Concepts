package com.designPatterns.factoryDesignPattern.components.dropdowns;

public class IosDropDown implements DropDown{
    @Override
    public void dropdownSize() {
        System.out.println("change size for IOS");
    }
}
