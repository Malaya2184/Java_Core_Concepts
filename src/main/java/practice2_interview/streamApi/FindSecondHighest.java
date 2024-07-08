package practice2_interview.streamApi;

import java.util.ArrayList;
import java.util.List;

public class FindSecondHighest {
    public static void main(String[] args) {
//      find the second highest number in an array
        List<Integer> li = new ArrayList<>();
        li.add(10);
        li.add(10);
        li.add(10);
        li.add(7);
        li.add(8);

        Integer find2ndHighest = li.stream()
                .distinct()
                .sorted()
                .skip(1)
                .findFirst()
                .orElse(null);

        System.out.println(find2ndHighest);
    }
}
