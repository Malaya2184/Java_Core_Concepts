package practice1.callableAndFutures;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class Main {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        ExecutorService es = Executors.newSingleThreadExecutor();
//        use submit method to get the future object from the es
        for (int i = 0; i < 100; i++) {
//            Thread th = new Thread((Runnable) new Mycallable(i));
            if(i == 90){
                System.out.println("Stop");
            }
            Future<Integer> futureAns = es.submit(new Mycallable(i));
            int ans = (int)futureAns.get()+2;
            System.out.println(ans);
        }
        es.shutdown();
    }
}
