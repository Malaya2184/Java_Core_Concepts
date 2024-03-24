package com.designPatterns.decorator;

public class OrangeCone implements IcecreamConstituents{
    IcecreamConstituents icecreamConstituents;
    public OrangeCone() {

    }
    public OrangeCone(IcecreamConstituents icecreamConstituents) {

        this.icecreamConstituents = icecreamConstituents;
    }

    @Override
    public int getCost() {
        if(icecreamConstituents != null){
            return icecreamConstituents.getCost() + 5;
        }
        return 5;
    }

    @Override
    public String getDescription() {
        if(icecreamConstituents != null){
            return  icecreamConstituents.getDescription() + "+ Orange Cone";
        }
        return "Orange Cone";
    }
}
