package com.designPatterns.decoratorDesignpractice.base;

import com.designPatterns.decoratorDesignpractice.PizzaConstituents;

public class ThinCrust implements PizzaConstituents {
    private PizzaConstituents pizzaConstituents;

    public ThinCrust() {
    }

    public ThinCrust(PizzaConstituents pizzaConstituents) {
        this.pizzaConstituents = pizzaConstituents;
    }

    @Override
    public int getPrice() {
        if(pizzaConstituents != null){
            return pizzaConstituents.getPrice()+80;
        }
        return 80;
    }

    @Override
    public String getDscription() {
        if(pizzaConstituents != null){
            return pizzaConstituents.getDscription() + "ThinCrust";
        }
        return "ThinCrust";
    }
}
