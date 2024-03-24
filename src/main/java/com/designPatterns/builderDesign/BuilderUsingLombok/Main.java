package com.designPatterns.builderDesign.BuilderUsingLombok;

public class Main {
    public static void main(String[] args) {
        MyDetails myDetails = MyDetails.builder().age(20).name("malaya").build();
        System.out.println("debug");
    }
}
