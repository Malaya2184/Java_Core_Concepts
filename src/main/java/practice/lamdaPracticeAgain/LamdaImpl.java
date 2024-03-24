package practice.lamdaPracticeAgain;

public class LamdaImpl {
    public static void main(String[] args) {
        FunctionalInterface<Integer, Integer, Integer> fi = (x, y) -> x+y;
        System.out.println(fi.apply(5,6));
        // passing as a param
        myMethod(11,12,fi);
    }
    public static void myMethod(int x, int y, FunctionalInterface<Integer, Integer, Integer> fi){
        System.out.println(fi.apply(x,y));
    }
}
