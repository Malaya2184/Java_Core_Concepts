package com.designPatterns.decoratorDesignpractice;

import com.designPatterns.decoratorDesignpractice.base.ThickCrust;
import com.designPatterns.decoratorDesignpractice.base.ThinCrust;
import com.designPatterns.decoratorDesignpractice.topings.Cheese;
import com.designPatterns.decoratorDesignpractice.topings.Chicken;
import com.designPatterns.decoratorDesignpractice.topings.Onion;

public class Client {
    public static void main(String[] args) {
        PizzaConstituents pizza = new ThinCrust();
        pizza = new Onion(pizza);
        pizza = new Chicken(pizza);
        pizza = new Cheese(pizza);
        pizza = new Chicken(pizza);
        System.out.println(pizza.getDscription() + " and price is = " + pizza.getPrice());

        PizzaConstituents pizza2 = new Chicken(new Cheese(new Onion(new ThinCrust())));
        System.out.println(pizza2.getDscription() + " and price is = " + pizza2.getPrice());

    }
}
