package com.stream;

import java.util.Iterator;
import java.util.List;

public class Main {
    public static void main(String[] args) {
//        stream can only call on collection
        List<Integer> list = List.of(1,2,3,4,5,6,7,8,9,10);
        //    question1
        //    given a list of integer , print each value in it
//        for each is a terminal operation , that means if you call for each then stream ends there
//        so after foreach I can't call anything on stream, because that will end there
        list.stream().forEach((value) -> System.out.println(value));
        //    question2
        //    given a list of integer , print each value square in it
        list.stream().forEach((value) -> System.out.println(value * value));
        //    question2
        //    given a list of integer , print each value square in it but dont use square logic
//        use map - map returns a stream so we can call anothor function operation
//        mapping kind of operation is called an intermediate , it returns anathor stream
        list.stream().map((value) -> value * value).forEach((value) -> System.out.println(value));
        // filtered - intermediate function
        list.stream()
                .filter((value) -> value%2 == 0)
                .map((value) -> value*value)
                .forEach((value) -> System.out.println(value));

//        reducers - reduce the value into a single value
//        collect - read this
        int sum = list.stream()
                .reduce(0, (currentValue, currentSum) -> currentSum+currentValue);
        System.out.println(sum);


    }


}
