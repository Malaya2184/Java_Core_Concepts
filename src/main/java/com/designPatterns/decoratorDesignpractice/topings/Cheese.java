package com.designPatterns.decoratorDesignpractice.topings;

import com.designPatterns.decoratorDesignpractice.PizzaConstituents;

public class Cheese implements PizzaConstituents {
    private PizzaConstituents pizzaConstituents;

    public Cheese(PizzaConstituents pizzaConstituents) {
        this.pizzaConstituents = pizzaConstituents;
    }

    @Override
    public int getPrice() {
            return pizzaConstituents.getPrice() +  30;
    }

    @Override
    public String getDscription() {
        return pizzaConstituents.getDscription() + " + Cheese";
    }
}
