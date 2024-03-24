package com.designPatterns.protoTypeAndRegestryPractice;

public class Student implements Prototype<Student>{
    private  String name;
    private int rollNo;
    private String batch;
    @Override
    public Student clone() {
        Student clone = new Student();
        clone.name = this.getName();
        clone.rollNo = this.getRollNo();
        clone.batch = this.getBatch();
        return clone;
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getRollNo() {
        return rollNo;
    }

    public void setRollNo(int rollNo) {
        this.rollNo = rollNo;
    }

    public String getBatch() {
        return batch;
    }

    public void setBatch(String batch) {
        this.batch = batch;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", rollNo=" + rollNo +
                ", batch='" + batch + '\'' +
                '}';
    }
}
