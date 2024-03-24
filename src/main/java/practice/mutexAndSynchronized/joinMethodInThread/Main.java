package practice.mutexAndSynchronized.joinMethodInThread;

public class Main {
    public static void main(String[] args) {
        ThreadB threadB = new ThreadB();
        ThreadA threadA = new ThreadA(threadB);
        threadA.start();
        threadB.start();
    }
}
