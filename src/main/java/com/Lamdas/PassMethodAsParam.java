package com.Lamdas;

public class PassMethodAsParam {
    public static void main(String[] args) {
        MathOperations<Integer> add = (a,b) -> a+b;
        MathOperations<Integer> sub = (a,b) -> a-b;
        MathOperations<Double> mul = (a,b) -> a*b;
        System.out.println(doSomething(5,6,add));
        System.out.println(doSomething(2.5,2.5, mul));
        System.out.println(doSomething(1000, 900, sub));

    }

    public static <T> T doSomething(T a, T b, MathOperations mathOperations){
        return (T) mathOperations.operate(a,b);
    }
}
