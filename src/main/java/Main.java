public class Main {
    public static void main(String[] args) {
        System.out.println("hello world from main " + Thread.currentThread().getName());
        HelloWorldPrinter printer = new HelloWorldPrinter();
//        printer.run();
        Thread th = new Thread(printer);
        th.start();
        System.out.println("Hi from main " + Thread.currentThread().getName());
    }
}
