package com.Lamdas;

import java.util.Comparator;

public class ComparatorExample {
    public static void main(String[] args) {

        Comparator<String> stringComparator = (String s1 , String s2) -> s1.length() - s2.length();
        System.out.println(stringComparator.compare("hello", "Welcome"));
    }

}
