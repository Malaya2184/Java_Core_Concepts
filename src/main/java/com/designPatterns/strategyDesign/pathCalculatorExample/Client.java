package com.designPatterns.strategyDesign.pathCalculatorExample;

import com.designPatterns.strategyDesign.pathCalculatorExample.strategies.CarPathCalculator;
import com.designPatterns.strategyDesign.pathCalculatorExample.strategies.WalkPathCalculator;

public class Client {
    public static void main(String[] args) {
        PathCalculatorRegestry pathCalculatorRegestry = new PathCalculatorRegestry(new CarPathCalculator());
        int carPath = pathCalculatorRegestry.executePathCalculator(10,20);
        System.out.println("Car Path = "+ carPath);

        PathCalculatorRegestry pathCalculatorRegestry1 = new PathCalculatorRegestry(new WalkPathCalculator());
        int walkPath = pathCalculatorRegestry1.executePathCalculator(10,20);
        System.out.println("Walk Path = "+ walkPath);

    }
}
