package com.designPatterns.builderDesignPrctice;

public class Client {
    public static void main(String[] args) {
        Student student = Student.getBuilder()
                .setName("Malaya")
                .setAge(101)
                .setClassName("Spider clsses")
                .setPsp(9.7)
                .setRollNo(606)
                .setGradeYear(2021)
                .build();

        System.out.println(student);
    }
}
