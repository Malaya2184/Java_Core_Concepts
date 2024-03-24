package com.designPatterns.sigleton.singleThreaded;

public class Singleton1 {
    private static Singleton1 singleton1obj;
    private Singleton1(){}
    public static Singleton1 getSingleton1obj(){
        if(singleton1obj == null){
            singleton1obj = new Singleton1();
        }
        return singleton1obj;
    }
}
