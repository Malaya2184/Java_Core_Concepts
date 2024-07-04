package practice1.lamdas;

public class AnonomousClass {
    public static void main(String[] args) {
        Thread th = new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("Annomous class implemented");
            }
        });
        th.start();
    }
}
