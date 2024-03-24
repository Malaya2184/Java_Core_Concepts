package com.designPatterns.decorator;

public class StrawberyScoop implements IcecreamConstituents{
    IcecreamConstituents icecreamConstituents;

    public StrawberyScoop(IcecreamConstituents icecreamConstituents) {
        this.icecreamConstituents = icecreamConstituents;
    }

    @Override
    public int getCost() {
        return this.icecreamConstituents.getCost() + 15;
    }

    @Override
    public String getDescription() {
        return this.icecreamConstituents.getDescription() + "+ Strawbery Scoop";
    }
}
