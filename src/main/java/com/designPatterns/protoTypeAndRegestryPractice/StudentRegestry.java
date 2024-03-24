package com.designPatterns.protoTypeAndRegestryPractice;

import java.util.HashMap;
import java.util.Map;

public class StudentRegestry {
    private Map<String, Student> studentRegestry = new HashMap<>();
    public void register(String batch, Student student){
        studentRegestry.put(batch, student);
    }
    public Student getStudent(String batch){
        Student student = studentRegestry.get(batch);
        return student;
    }
}
