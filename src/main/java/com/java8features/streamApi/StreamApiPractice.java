package com.java8features.streamApi;

import java.util.*;
import java.util.stream.Collectors;

public class StreamApiPractice {
    public static void main(String[] args) {
//                find  frequency of characters in a sentense
        String name = "malaya kumar swian";
        Map<String, Long> countFreq = Arrays.stream(name.split(""))
                .filter(c-> c.equals(" ") == false)
                .collect(Collectors.groupingBy(c -> c, Collectors.counting()));
        System.out.println(countFreq);

//        find distinct and duplicate characters
        List<Map.Entry<String, Long>> duplicates = Arrays.stream(name.split(""))
                .collect(Collectors.groupingBy(c -> c, Collectors.counting()))
                .entrySet()
                .stream()
                .filter(e -> e.getValue() != 1 && e.getKey().equals(" ") == false)
                .collect(Collectors.toList());
        System.out.println(duplicates);
        //        find first non repeat character and repeat characters

        Map.Entry<String, Long> firstRepeat = Arrays.stream(name.split(""))
                .collect(Collectors.groupingBy(c -> c, LinkedHashMap::new, Collectors.counting()))
                .entrySet()
                .stream()
                .filter(c -> c.getValue() != 1)
                .findFirst()
                .orElse(null);
        System.out.println(firstRepeat);

        //        find the second highest number in an array
        List<Integer> li = new ArrayList<>();
        li.add(10);
        li.add(10);
        li.add(10);
        li.add(7);
        li.add(8);
        Integer secondHigh = li.stream()
                .distinct()
                .sorted((x, y) -> y - x)
                .skip(1)
                .findFirst()
                .orElse(null);
        System.out.println(secondHigh);

        //        find longest string in a given array
        String[] stArr = {"i", "have", "alot of", "chcolates"};
        String findFirst = Arrays.stream(stArr)
                .sorted((x, y) -> y.length() - x.length())
                .findFirst()
                .orElse(null);
        System.out.println(findFirst);
        //        find 2nd longest string in a given array
        String secondLargest = Arrays.stream(stArr)
                .sorted((x, y) -> y.length() - x.length())
                .skip(1)
                .findFirst()
                .orElse(null);
        System.out.println(secondLargest);
        //        number in an array starts with 2
        List<Integer> numList = new ArrayList<>();
        numList.add(2);
        numList.add(23);
        numList.add(59);
        numList.add(92);
        numList.add(22);

        List<Integer> stratWith2 = numList.stream()
                .map(n -> n + "")
                .filter(c -> c.startsWith("2"))
                .map(c -> Integer.valueOf(c))
                .collect(Collectors.toList());
        System.out.println(stratWith2);

//        find nth highst salary --> cant handle duplicates
        Map<String, Integer> employees = new HashMap<>();
        employees.put("Saswat", 2000);
        employees.put("guru", 9000);
        employees.put("Sunil", 10000);
        employees.put("chadei", 8000);
        Map.Entry<String, Integer> secondHighest = employees.entrySet()
                .stream()
                .sorted((x, y) -> y.getValue() - x.getValue())
                .skip(1)
                .findFirst()
                .orElse(null);
        System.out.println(secondHighest);

        //        find nth highst salary --> can handle duplicates
        Map<String, Integer> employees2 = new HashMap<>();
        employees2.put("Saswat", 2000);
        employees2.put("guru", 9000);
        employees2.put("Sunil", 10000);
        employees2.put("Raja", 10000);
        employees2.put("chadei", 8000);
        Integer findSecond = employees2.entrySet()
                .stream()
                .collect(Collectors.groupingBy(e -> e.getValue()))
                .entrySet()
                .stream()
                .sorted((e1, e2) -> e2.getKey() - e1.getKey())
                .collect(Collectors.toList())
                .get(1)
                .getKey();
        System.out.println(findSecond);


    }
}
