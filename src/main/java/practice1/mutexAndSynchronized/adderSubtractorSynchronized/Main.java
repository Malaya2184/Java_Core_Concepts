package practice1.mutexAndSynchronized.adderSubtractorSynchronized;



import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        Value value = new Value(10);
        Adder adder = new Adder(value);
        Subtractor subtractor = new Subtractor(value);

        ExecutorService es = Executors.newCachedThreadPool();
        Future<Void> adderFuture = es.submit(adder);
        Future<Void> subtractirFuture = es.submit(subtractor);

        Thread.sleep(2000);
        System.out.println(value.getValue());
        es.shutdown();

    }
}
