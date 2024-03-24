package practice.numberprinter_executers;

public class NumberPrinter implements Runnable{
    int numberToprint;

    public NumberPrinter(int numberToprint) {
        this.numberToprint = numberToprint;
    }

    @Override
    public void run() {
        System.out.println("Number is "+ numberToprint+ " from thread " + Thread.currentThread().getName());
    }
}
