package com.designPatterns.factoryDesignPattern.components.dropdowns;

public class AndroidDropdown implements DropDown{
    @Override
    public void dropdownSize() {
        System.out.println("change size for android dropdown");
    }
}
