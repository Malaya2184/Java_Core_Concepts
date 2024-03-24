package practice.mutexAndSynchronized.joinMethodInThread;

public class ThreadA extends Thread{
    private ThreadB threadB;

    public ThreadA(ThreadB threadB) {
        this.threadB = threadB;
    }

    @Override
    public void run() {
        System.out.println("calling threadB.Join() from thread A and A goes to waiting untill thread B finished");
        try {
            threadB.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println("ThreadA starts ");
        System.out.println("ThreadA done");
    }
}
