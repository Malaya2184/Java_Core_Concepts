package com.designPatterns.decoratorDesignpractice.topings;

import com.designPatterns.decoratorDesignpractice.PizzaConstituents;

public class Onion implements PizzaConstituents {

    private PizzaConstituents pizzaConstituents;

    public Onion(PizzaConstituents pizzaConstituents) {
        this.pizzaConstituents = pizzaConstituents;
    }

    @Override
    public int getPrice() {
        return pizzaConstituents.getPrice() +  10;
    }

    @Override
    public String getDscription() {
        return pizzaConstituents.getDscription() + " + Onion";
    }
}
