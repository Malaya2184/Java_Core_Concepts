public class HelloWorldPrinter implements Runnable{

    private  void doSomething(){
        System.out.println("do somethng " + Thread.currentThread().getName());
    }
    @Override
    public void run() {
        System.out.println("hello world printer " + Thread.currentThread().getName());
        doSomething();
    }

}
