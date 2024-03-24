package com.designPatterns.prototypeAndRegestryDesign;

import java.util.HashMap;
import java.util.Map;

public class StudentRegistry {

    private Map<String, Student> studentRegistry = new HashMap<>();

    public void rgeister(String key, Student student){
        studentRegistry.put(key, student);
    }

    public Student get(String key){
        return studentRegistry.get(key);
    }
}
