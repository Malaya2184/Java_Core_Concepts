package com.designPatterns.decorator;

public class ChocolateScoop implements IcecreamConstituents{
    IcecreamConstituents icecreamConstituents;
    public ChocolateScoop(IcecreamConstituents icecreamConstituents) {
        this.icecreamConstituents = icecreamConstituents;
    }

    @Override
    public int getCost() {
        return icecreamConstituents.getCost() + 10;
    }

    @Override
    public String getDescription() {
        return icecreamConstituents.getDescription() + "+ Choco Scoop";
    }
}
