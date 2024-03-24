package practice.mutexAndSynchronized.adderSubtractorWith_error;

public class Subtractor implements Runnable{
    private Value value;

    public Subtractor(Value value) {
        this.value = value;
    }

    @Override
    public void run() {
        for (int i = 0; i < 500; i++) {
            this.value.setValue(this.value.getValue()-i);
        }

    }
}
