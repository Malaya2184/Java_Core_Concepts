package practice.callableAndFutures;

import java.util.concurrent.Callable;

public class Mycallable implements Callable<Integer> {
    int number;

    public Mycallable(int number) {
        this.number = number;
    }

    @Override
    public Integer call() throws Exception {
        return number*2;
    }
}
