package practice.numberprinter_executers;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Main {
    public static void main(String[] args) {
//        using for loop
//        for (int i = 0; i< 100; i++){
//            if(i ==90){
//                System.out.println("STOP");
//            }
//            Thread th = new Thread(new NumberPrinter(i));
//            th.start();
//        }

//        using executers
        ExecutorService es = Executors.newFixedThreadPool(10);
        for (int i =0; i< 1000; i++){
            if(i ==900){
                System.out.println("STOP");
            }
            es.execute(new NumberPrinter(i));
        }
        es.shutdown();
    }
}
