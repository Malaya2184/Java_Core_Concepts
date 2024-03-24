package com.generics;

public class Main {
    public static void main(String[] args) {
        Pair<Integer, Integer> p = new Pair<>(2,3);
        System.out.println(p.getFirst());
        System.out.println(p.add());
        String i = GenericMethods.doSomething("Key", "doSomething");
        System.out.println(i);
    }
}
