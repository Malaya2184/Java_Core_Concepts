package com.designPatterns.builder;

public class Client {
    public static void main(String[] args) {
        Student student = Student.getBuilder()
                .setName("malaya")
                .setAge(11)
                .setRollno(10)
                .build();
    }
}
