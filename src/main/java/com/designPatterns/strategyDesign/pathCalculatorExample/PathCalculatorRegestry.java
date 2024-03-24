package com.designPatterns.strategyDesign.pathCalculatorExample;

import com.designPatterns.strategyDesign.pathCalculatorExample.strategies.PathCalculatorStartegy;

public class PathCalculatorRegestry {
//    you can pass a string here and can do the if else operation or hm operation
    PathCalculatorStartegy pathCalculatorStartegy;

    public PathCalculatorRegestry(PathCalculatorStartegy pathCalculatorStartegy) {
        this.pathCalculatorStartegy = pathCalculatorStartegy;
    }
    public int executePathCalculator(int coordinateA, int coOrdinateB){
        return pathCalculatorStartegy.doCalculation(coordinateA, coOrdinateB);
    }

}
