package practice2_interview.streamApi;

import java.util.Arrays;
import java.util.Map;
import java.util.stream.Collectors;

public class CountOccurance {
    public static void main(String[] args) {

        String input = "my name is malaya kumar swain";
        Map<String, Long> mapCountOccurance = Arrays.stream(input.split(""))
                .filter(c -> !c.equals(" "))
                .collect(Collectors.groupingBy(c -> c, Collectors.counting()));
        System.out.println(mapCountOccurance);
    }
}
