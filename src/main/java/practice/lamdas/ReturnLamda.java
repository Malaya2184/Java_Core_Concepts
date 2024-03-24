package practice.lamdas;

public class ReturnLamda {
    public static void main(String[] args) {
        System.out.println(myFunction().apply(5,6));
    }
    //no need to pass her because it can directly pass to th apply method of the basic lamda class
    public static BasicLamda myFunction(){

        return (a,b)->a+b;
    }
}
