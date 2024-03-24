package com.Lamdas.functionAndBifunction;

import java.util.function.BiFunction;
import java.util.function.Function;

public class FunctionnAndBifunction {
    public static void main(String[] args) {
        Function<Integer, Integer> square = (a)-> a*a;
        BiFunction<Integer,Integer,Integer> add = (a,b) -> a+b;
        doSomething(4,5,add);

    }
    public static void doSomething(int a, int b, BiFunction<Integer, Integer, Integer> biFunction){
        System.out.println(biFunction.apply(a,b));
    }
}
