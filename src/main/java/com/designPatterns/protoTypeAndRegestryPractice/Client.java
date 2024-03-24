package com.designPatterns.protoTypeAndRegestryPractice;


public class Client {
    public static void main(String[] args) {
        StudentRegestry sr = new StudentRegestry();

        Student mar22Batch = new Student();
        mar22Batch.setBatch("mar22Batch");

        Student apr22Batch = new Student();
        apr22Batch.setBatch("apr22Batch");

        sr.register("mar22Batch", mar22Batch);
        sr.register("apr22Batch", apr22Batch);

        Student s1 = sr.getStudent("mar22Batch").clone();
        s1.setName("spider1");
        s1.setRollNo(01);

        Student s2 = sr.getStudent("mar22Batch").clone();
        s2.setName("spider2");
        s2.setRollNo(02);

        System.out.println(s1);
        System.out.println(s2);
    }
}
