package com.designPatterns.decoratorDesignpractice.base;

import com.designPatterns.decoratorDesignpractice.PizzaConstituents;

public class ThickCrust implements PizzaConstituents {
    private PizzaConstituents pizzaConstituents;
    public ThickCrust() {
    }

    public ThickCrust(PizzaConstituents pizzaConstituents) {
        this.pizzaConstituents = pizzaConstituents;
    }

    @Override
    public int getPrice() {
        if(pizzaConstituents != null){
            int price = pizzaConstituents.getPrice() + 40;
            return price;
        }
        return 40;
    }

    @Override
    public String getDscription() {
        if(pizzaConstituents != null){
            return pizzaConstituents.getDscription() + "ThickCrust";
        }
        return "ThickCrust";
    }
}
