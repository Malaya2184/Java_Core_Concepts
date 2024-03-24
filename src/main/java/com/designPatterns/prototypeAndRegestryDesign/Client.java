package com.designPatterns.prototypeAndRegestryDesign;

public class Client {
    public static void fillRegistry(StudentRegistry studentRegistry){
        Student apr21Batch = new Student();
        apr21Batch.setBatch("April 21");
        apr21Batch.setAverageBatchPsp(88.0);
        studentRegistry.rgeister("april21Batch", apr21Batch);

        IntelligentStudent apr21IntellegentBatch = new IntelligentStudent();
        apr21IntellegentBatch.setBatch("April 21");
        apr21IntellegentBatch.setAverageBatchPsp(88.0);
        apr21IntellegentBatch.setIq(180);
        studentRegistry.rgeister("apr21IntellegentBatch", apr21IntellegentBatch);
    }
    public static void main(String[] args) {
        StudentRegistry studentRegistry = new StudentRegistry();
        fillRegistry(studentRegistry);

        Student malaya = studentRegistry.get("april21Batch").clone();
        malaya.setName("Malaya");
        malaya.setAge(26);
        malaya.setPsp(89.2);

        Student spider = studentRegistry.get("apr21IntellegentBatch").clone();
        spider.setName("spider");
        spider.setAge(27);
        spider.setPsp(92.8);

        System.out.println("Debug Point");
    }
}