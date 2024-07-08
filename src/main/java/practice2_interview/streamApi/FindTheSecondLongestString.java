package practice2_interview.streamApi;

import java.util.Arrays;

public class FindTheSecondLongestString {
    public static void main(String[] args) {
        String[] stArr = {"i","have", "alot of", "chcolates", "chcolates"};
        String secondHighest = Arrays.stream(stArr)
                .distinct()
                .sorted((x, y) -> y.length() - x.length())
                .skip(1)
                .findFirst()
                .orElse(null);
        System.out.println(secondHighest);

    }
}
