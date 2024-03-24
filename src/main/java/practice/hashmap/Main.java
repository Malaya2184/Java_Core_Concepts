package practice.hashmap;

import java.util.HashMap;
import java.util.IdentityHashMap;
import java.util.Map;
import java.util.WeakHashMap;

public class Main {
    public static void main(String[] args) {
        Integer i1 = 10;
        Integer i2 = 10;

        Map<Integer, String> hm = new IdentityHashMap<>();
        hm.put(new Integer(10), "1st");
        hm.put(new Integer(10), "2nd");
        System.out.println(hm);

        String st = new String("Week");
        Map<String, Integer> wm = new WeakHashMap<>();
        wm.put(st, 10);
        System.out.println(wm);
        st = null;
        System.out.println(wm);


    }
}
