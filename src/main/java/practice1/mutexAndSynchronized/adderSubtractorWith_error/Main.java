package practice1.mutexAndSynchronized.adderSubtractorWith_error;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        Value value = new Value(5);
        Adder adder = new Adder(value);
        Subtractor subtractor = new Subtractor(value);
        Thread t1 = new Thread(adder);
        Thread t2 = new Thread(subtractor);
        t1.start();
        t2.start();

        Thread.sleep(1000);
        System.out.println(value.getValue());
    }
}
