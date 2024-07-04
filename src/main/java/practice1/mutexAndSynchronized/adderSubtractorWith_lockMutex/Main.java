package practice1.mutexAndSynchronized.adderSubtractorWith_lockMutex;

import practice1.mutexAndSynchronized.adderSubtractorWith_error.Value;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        Value value = new Value(10);
        Lock lock = new ReentrantLock();
        Adder adder = new Adder(value, lock);
        Subtractor subtractor = new Subtractor(value, lock);
        ExecutorService es = Executors.newCachedThreadPool();
        Future<Void> adderFuture= es.submit(adder);
        Future<Void> subtrorFuture = es.submit(subtractor);

        Thread.sleep(1000);
        System.out.println(value.getValue());
        es.shutdown();
    }
}
