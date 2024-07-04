package practice1.iterableAnditerators.normal;

import java.util.Iterator;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Integer> li = List.of(1,2,3,4,5,6,7,8,9);
        // normal for loop
        for(Integer i : li){
            System.out.println(i);
        }
        // iterator- collection implements
        Iterator<Integer> iterator = li.iterator();
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }
}
