package com.designPatterns.sigleton.multiThreadEager;

public class Singleton2 {
//    but the problem is this object is creating unnecessaryly called eager loading
    private static Singleton2 obj = new Singleton2();
    private Singleton2(){}
    public static Singleton2 getInstance(){
        return obj;
    }
}
