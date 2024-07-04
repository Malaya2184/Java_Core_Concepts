package practice1.lamdas;

public class PassLamdaAsParam {
    public static void main(String[] args) {
        BasicLamda add = (a,b) -> a+b;
        BasicLamda mul = (a,b) -> a*b;
        System.out.println(doSomething(20,15,add));
        System.out.println(doSomething(20,15,mul));
    }
    public static int doSomething(int a, int b, BasicLamda lamda){
        return lamda.apply(a,b);
    }
}
