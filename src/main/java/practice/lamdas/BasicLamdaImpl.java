package practice.lamdas;

public class BasicLamdaImpl {
    public static void main(String[] args) {
        BasicLamda add = (a,b) -> a+b;
        System.out.println(add.apply(5,6));
        BasicLamda sub = (a,b) -> a-b;
        System.out.println(sub.apply(10,7));
    }
}
