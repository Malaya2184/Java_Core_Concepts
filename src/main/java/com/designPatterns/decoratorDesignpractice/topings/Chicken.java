package com.designPatterns.decoratorDesignpractice.topings;

import com.designPatterns.decoratorDesignpractice.PizzaConstituents;

public class Chicken implements PizzaConstituents {
    private PizzaConstituents pizzaConstituents;

    public Chicken(PizzaConstituents pizzaConstituents) {
        this.pizzaConstituents = pizzaConstituents;
    }

    @Override
    public int getPrice() {
            return pizzaConstituents.getPrice() +  20;
    }

    @Override
    public String getDscription() {
        return pizzaConstituents.getDscription() + " + Chickn";
    }
}
