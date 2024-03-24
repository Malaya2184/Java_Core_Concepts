package com.designPatterns.factoryDesignPattern;

public class Flutter {

    private SupportedPlatform supportedPlatform;
    public Flutter(SupportedPlatform supportedPlatform){
        this.supportedPlatform = supportedPlatform;
    }
    // common methods in flutter class
    public void settingTheme(){
        System.out.println("setting theme");
    }
    public void settingRefreshRate(){
        System.out.println("Setting refresh rate");
    }

//    calling the factory method
    public UIFactory createUIFactory(){

        return UiFactoryFactory.getUiFactory(supportedPlatform);
    }

}
