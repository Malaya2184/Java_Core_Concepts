package com.designPatterns.factoryDesignPattern;

public class UiFactoryFactory {
    public static UIFactory getUiFactory(SupportedPlatform supportedPlatform){
        if (supportedPlatform == SupportedPlatform.ANDROID) {
            return new AndroidUiFactory();
        } else if (supportedPlatform == SupportedPlatform.IOS) {
            return new IosUifactory();
        }
        return  null;
    }
}
