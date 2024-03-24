package com.java8features.streamApi;

import java.util.*;
import java.util.stream.Collectors;

public class StreamApiPractice3 {
    public static void main(String[] args) {
//        # find frequency of characters in a sentense
        String name = "malaya kumar swain";
        Map<String, Long> frqCharacter = Arrays.stream(name.split(""))
                .filter(c-> !c.equals(" "))
                .collect(Collectors.groupingBy(c -> c, Collectors.counting()));
        System.out.println(frqCharacter);

//        # find duplicates and unique elements
        List<Map.Entry<String, Long>> duplicates = Arrays.stream(name.split(""))
                .collect(Collectors.groupingBy(c -> c, Collectors.counting()))
                .entrySet()
                .stream()
                .filter(x -> x.getValue() != 1)
                .collect(Collectors.toList());
        System.out.println(duplicates);

//        # find first non repeat character and repeat characters

//        # find the second highest number in an array
        List<Integer> li = List.of(1,4,3,2,7,8,4,50,9,50);
        Integer scondHighest = li.stream()
                .distinct()
                .sorted(Collections.reverseOrder())
                .skip(1)
                .findFirst()
                .orElse(null);
        System.out.println(scondHighest);
//        # find 2nd longest string in a given array
        List<String> strLi = List.of("My","name","is","malaya","kumar", "swain");
        Map.Entry<Integer, List<String>> secondHighestString = strLi.stream()
                .collect(Collectors.groupingBy(String::length))
                .entrySet()
                .stream()
                .sorted((x, y) -> y.getKey() - x.getKey())
                .skip(1)
                .findFirst()
                .orElse(null);
        System.out.println(secondHighestString);
//        # find 2nd longest string in a given array
//        above one is completed
//        # number in an array starts with 2
        List<Integer> intLi = List.of(2,22,32,42,2,4,54,3278,29,21);
        List<Integer> startWithTwo = intLi.stream()
                .map(i -> i + "")
                .filter(c -> c.startsWith("2"))
                .map(Integer::valueOf)
                .collect(Collectors.toList());
        System.out.println(startWithTwo);
//        # string .join method
//        # skip and limit
//        # map and flat map
//        # find nth highst salary
        Map<String, Integer> employees = new HashMap<>();
        employees.put("Saswat", 2000);
        employees.put("guru", 4000);
        employees.put("Sunil", 10000);
        employees.put("chadei", 10000);

        Integer secondSal = employees.entrySet()
                .stream()
                .collect(Collectors.groupingBy(Map.Entry::getValue))
                .entrySet()
                .stream()
                .sorted((x, y) -> y.getKey() - x.getKey()).toList()
                .get(1)
                .getKey();
        System.out.println(secondSal);

    }
}
