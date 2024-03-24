package practice.mutexAndSynchronized.adderSubtractorWith_lockMutex;

import practice.mutexAndSynchronized.adderSubtractorWith_error.Value;

import java.util.concurrent.Callable;
import java.util.concurrent.locks.Lock;

public class Subtractor implements Callable<Void> {
    private Value value;
    private Lock lock;

    public Subtractor(Value value, Lock lock) {
        this.value = value;
        this.lock = lock;
    }

    @Override
    public Void call() throws Exception {
        for (int i = 0; i < 500; i++) {
            lock.lock();
            this.value.setValue(this.value.getValue()-i);
            lock.unlock();
        }
        return null;
    }
}
