package practice2_interview.streamApi;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class JoinSkipLimit {
    public static void main(String[] args) {
//        Join method
        List<String> li = Arrays.asList("malaya", "kumar", "swain");
        String joinedString = li.stream()
                .collect(Collectors.joining("-"));
        System.out.println(joinedString);

//        skip and limit
        IntStream.rangeClosed(1,10)
                .skip(2)
                .limit(5)
                .forEach(n-> System.out.println(n));

    }
}
