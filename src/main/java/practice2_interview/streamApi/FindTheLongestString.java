package practice2_interview.streamApi;

import java.util.Arrays;
import java.util.Optional;

public class FindTheLongestString {
    public static void main(String[] args) {
        String[] stArr = {"i", "have", "alot of", "chcolates"};
        String longestString = Arrays.stream(stArr)
                .sorted((x, y) -> y.length() - x.length())
                .findFirst()
                .orElse(null);

        System.out.println(longestString);
    }
}
