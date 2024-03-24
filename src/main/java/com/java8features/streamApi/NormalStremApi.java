package com.java8features.streamApi;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class NormalStremApi {
    public static void main(String[] args) {

//        find frequency of characters in a sentense
        String name = "malaya kumar swain";
        Map<String, Long> freqMap = Arrays.stream(name.split(""))
                .collect(Collectors.groupingBy(c -> c, Collectors.counting()));
        System.out.println(freqMap);

//        find duplicates and unique elements
        List<String> duplicate =
                Arrays.stream(name.split(""))
                        .collect(Collectors.groupingBy(c->c , Collectors.counting()))
                        .entrySet()
                        .stream()
                        .filter(x->x.getValue() > 1)
                        .map(x->x.getKey())
                        .collect(Collectors.toList());
        System.out.println(duplicate);

//        find first non repeat character and repeat characters
        Arrays.stream((name.split("")))
                .collect(Collectors.groupingBy(c -> c, LinkedHashMap::new, Collectors.counting()))
                .entrySet()
                .stream()
                .filter(x -> x.getValue() ==1)
                .findFirst()
                .get().getKey();

//        find the second highest number in an array
        List<Integer> li = new ArrayList<>();
        li.add(1);
        li.add(10);
        li.add(9);
        li.add(7);
        li.add(8);

        Integer secondLargest = li.stream()
                .sorted(Collections.reverseOrder())
                .skip(1)
                .findFirst()
                .orElse(null);
        System.out.println(secondLargest);

//        find longest string in a given array
        String[] stArr = {"i", "have", "alot of", "chcolates"};
        String longestString = Arrays.stream(stArr)
                .reduce((w1,w2)-> w1.length()>w2.length()?w1:w2)
                .orElse(null);

        System.out.println(longestString);

//        find 2nd longest string in a given array
        String[] stArr2 = {"i", "have", "alot of", "chcolates"};
        String secondLongestString = Arrays.stream(stArr)
                .sorted((a,b) -> b.length()-a.length())
                .skip(1)
                .findFirst()
                .orElse(null);

        System.out.println(secondLongestString);

//        number in an array starts with 2
        List<Integer> numList = new ArrayList<>();
        numList.add(2);
        numList.add(23);
        numList.add(59);
        numList.add(92);
        numList.add(22);
        List<Integer> filteredNum = numList.stream()
                .map(n -> n + "")
                .filter(s -> s.startsWith("2"))
                .map(s -> Integer.valueOf(s))
                .collect(Collectors.toList());
        System.out.println(filteredNum);
//        string .join method
        List<String> words = List.of("Malaya", "Kumar", "Swain");
        String sentnse = String.join("-", words);
        System.out.println(sentnse);

//        skip and limit
        IntStream.rangeClosed(1,10)
                .skip(1)
                .limit(8)
                .forEach(n -> System.out.println(n));
//        map and flat map


//        find nth highst salary
        Map<String, Integer> employees = new HashMap<>();
        employees.put("Saswat", 2000);
        employees.put("guru", 4000);
        employees.put("Sunil", 10000);
        employees.put("chadei", 10000);

        Map.Entry<String, Integer> nthSalary = employees.entrySet()
                .stream()
                .sorted((e1, e2) -> e2.getValue() - e1.getValue())
                .collect(Collectors.toList())
                .get(1);
        System.out.println(nthSalary);

//

    }
}
