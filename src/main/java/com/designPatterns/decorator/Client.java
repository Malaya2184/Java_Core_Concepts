package com.designPatterns.decorator;

public class Client {
    public static void main(String[] args) {
//        IcecreamConstituents iceCream = new OrangeCone();
//        iceCream = new ChocolateScoop(iceCream);
//        iceCream = new StrawberyScoop(iceCream);
//        the above things can be done like this
        IcecreamConstituents iceCream = new StrawberyScoop(new ChocolateScoop(new OrangeCone(new OrangeCone())));

        System.out.println(iceCream.getCost());
        System.out.println(iceCream.getDescription());

    }
}
