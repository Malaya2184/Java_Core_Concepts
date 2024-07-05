package practice2_interview.streamApi;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class AllDuplicatesInString {
    public static void main(String[] args) {
        String input = "malaya kumar swain";
        List<String> duplicates = Arrays.stream(input.split(""))
                .filter(c-> !c.equals(" "))
                .collect(Collectors.groupingBy(c -> c, Collectors.counting()))
                .entrySet()
                .stream()
                .filter(c -> c.getValue() > 1)
                .map(c -> c.getKey())
                .collect(Collectors.toList());
        System.out.println(duplicates);

    }
}
