package practice1.streamApi;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Integer> li = List.of(1,2,3,4,5,6,7,8,9);
//        li.stream().forEach((val) -> System.out.println(val));
        li.stream().
                filter((val) -> val % 3 == 0)
                .map((val) -> val * 10)
                .forEach((val) -> System.out.println(val*10));

        int ans = li.stream().reduce(0,(current, sum) -> current+sum);
        System.out.println(ans);
        
    }
}
