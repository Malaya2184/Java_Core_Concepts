package practice2_interview.streamApi;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class NumberStartsWith2 {
    public static void main(String[] args) {
        //number in an array starts with 2
        List<Integer> numList = new ArrayList<>();
        numList.add(2);
        numList.add(23);
        numList.add(59);
        numList.add(92);
        numList.add(22);

        List<Integer> numbersStartWithTwo = numList.stream()
                .map(num -> num + "")
                .filter(num -> num.startsWith("2"))
                .map(num -> Integer.valueOf(num))
                .collect(Collectors.toList());
        System.out.println(numbersStartWithTwo);
    }
}
