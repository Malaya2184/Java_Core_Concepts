package com.designPatterns.factoryDesignPattern;

public class Client {
    public static void main(String[] args) {
        Flutter flutter = new Flutter(SupportedPlatform.ANDROID);
        UIFactory uiFactort = flutter.createUIFactory();
        uiFactort.createButton().changeSize();
        uiFactort.createMenu().menuSize();
        uiFactort.createDropDown().dropdownSize();
        System.out.println("Debug");
    }
}
