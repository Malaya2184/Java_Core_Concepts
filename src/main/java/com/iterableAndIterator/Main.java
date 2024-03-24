package com.iterableAndIterator;

import java.util.Iterator;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Integer> list = List.of(1,2,3,4,5);
        for (Integer i: list){
            System.out.println(i);
        }
        System.out.println("collections implements iterable so we can directly call iterator");

        Iterator<Integer> iterator = list.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }
}
