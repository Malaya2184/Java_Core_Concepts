package com.lamdasPractice;

public class Lamdas {
    public static void main(String[] args) {
        MathOperations add = (a,b) -> a+b;
        System.out.println(add.operate(5,6));
        System.out.println(doSomething(11,12,add));
    }

    public static int doSomething(int a, int b, MathOperations mathOperations){
        return mathOperations.operate(a,b);
    }
}
