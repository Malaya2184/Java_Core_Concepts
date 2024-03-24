package com.designPatterns.strategyDesign.pathCalculatorExample.strategies;

public class WalkPathCalculator implements PathCalculatorStartegy{
    @Override
    public int doCalculation(int coordinateA, int coOrdinateB) {
        return (coOrdinateB - coordinateA) * 50;
    }
}
