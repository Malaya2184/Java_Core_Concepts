package practice1.mutexAndSynchronized.joinMethodInThread;

public class ThreadB extends Thread{
    @Override
    public void run(){
        System.out.println("ThreadB starts");
        System.out.println("ThreadB done");
    }
}
