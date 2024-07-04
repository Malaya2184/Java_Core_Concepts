package practice1.mutexAndSynchronized.adderSubtractorSynchronized;

import java.util.concurrent.Callable;

public class Subtractor implements Callable<Void> {
    private Value value;

    public Subtractor(Value value) {
        this.value = value;
    }

    @Override
    public Void call() throws Exception {
        for (int i = 0; i < 500; i++) {
            System.out.println("Subtractor requested for lock by " + Thread.currentThread().getName());
            synchronized (value){
                this.value.setValue(this.value.getValue() - i);
                System.out.println("value subtracted " + i + "current value is : " + value.getValue());
            }
        }
        return null;
    }
}
