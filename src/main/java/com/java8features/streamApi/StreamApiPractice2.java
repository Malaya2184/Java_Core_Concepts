package com.java8features.streamApi;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class StreamApiPractice2 {
    public static void main(String[] args) {

        //        find nth highst salary --> can handle duplicates
        Map<String, Integer> employees = new HashMap<>();
        employees.put("Saswat", 2000);
        employees.put("guru", 9000);
        employees.put("Sunil", 10000);
        employees.put("Raja", 10000);
        employees.put("chadei", 8000);

        Integer secondSal = employees.entrySet()
                .stream()
                .collect(Collectors.groupingBy(e -> e.getValue()))
                .entrySet()
                .stream()
                .sorted((s1, s2) -> s2.getKey() - s1.getKey())
                .collect(Collectors.toList())
                .get(2)
                .getKey();
        System.out.println(secondSal);

    }
}
