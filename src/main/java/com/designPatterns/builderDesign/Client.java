package com.designPatterns.builderDesign;

public class Client {
    public static void main(String[] args) {

        Student student = Student.getBuilder()
                                .setName("Spider")
                                .setAge(20)
                                .setBatch("A")
                                .setPsp(88.23)
                                .setPhone("12345")
                                .setGradeYear(2021)
                                .build();

        System.out.println("Debug");
    }
}
