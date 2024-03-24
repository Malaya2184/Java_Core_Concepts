package com.productIterator;

import java.util.Iterator;

public class Main {
    public static void main(String[] args) {
        Store store = new Store();
        store.add("mobile");
        store.add("Tv");
        store.add("Washing machine");

        for(Product product : store){
            System.out.println(product);
        }
//        for(Product product : store){
//            System.out.println(product);
//        }
//        Iterator<Product> products = store.iterator();
//        while (products.hasNext()){
//            System.out.println(products.next());
//        }

    }
}
