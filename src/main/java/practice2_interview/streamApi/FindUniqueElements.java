package practice2_interview.streamApi;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FindUniqueElements {

    public static void main(String[] args) {
        //        find unique elements
        String name = "malaya kumar swain";
        List<String> uniqueElements = Arrays.stream(name.split(""))
                .filter(c -> !c.equals(" "))
                .collect(Collectors.groupingBy(c -> c, Collectors.counting()))
                .entrySet()
                .stream()
                .filter(c -> c.getValue() == 1)
                .map(c -> c.getKey())
                .collect(Collectors.toList());
        System.out.println(uniqueElements);
    }
}
