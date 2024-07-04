package practice1.mutexAndSynchronized.adderSubtractorSynchronized;

import java.util.concurrent.Callable;

public class Adder implements Callable<Void> {
    private Value value;

    public Adder(Value value) {
        this.value = value;
    }

    @Override
    public Void call() throws Exception {
        for (int i = 0; i < 500; i++) {
            System.out.println("Adder requested for lock by " + Thread.currentThread().getName());
            synchronized (value){
                this.value.setValue(this.value.getValue() + i);
                System.out.println("value added " + i + "current valu is : " + value.getValue());
            }
        }
        return null;
    }
}
